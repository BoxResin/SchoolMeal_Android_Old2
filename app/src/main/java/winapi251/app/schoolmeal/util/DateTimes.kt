/** 날짜·시간 유틸리티 */
package winapi251.app.schoolmeal.util

import java.util.*

/**
 * # 시간점
 * 시간의 한 지점을 나타낸다.
 */
class TimePoint private constructor(private val calendar: Calendar) : Comparable<TimePoint>
{
	constructor(year: Int, month: Int, day: Int, hour: Int = 0, minute: Int = 0, second: Int = 0)
			: this(GregorianCalendar(year, month, day, hour, minute, second))

	/** 년 */
	val year = calendar[Calendar.YEAR]

	/** 월 [1, 12] */
	val month = calendar[Calendar.MONTH] + 1

	/** 일 [1, 31] */
	val day = calendar[Calendar.DAY_OF_MONTH]

	/** 시 [0, 23] */
	val hour = calendar[Calendar.HOUR_OF_DAY]

	/** 분 [0, 59] */
	val minute = calendar[Calendar.MINUTE]

	/** 초 [0, 59] */
	val second = calendar[Calendar.SECOND].also { 10.millis }

	/** [timeAmount]만큼 뒤의 [시간점][TimePoint]을 반환한다. */
	operator fun plus(timeAmount: TimeAmount): TimePoint
	{
		val newCalendar = this.calendar.clone() as Calendar
		newCalendar.add(Calendar.MILLISECOND, timeAmount.millis.toInt())
		return TimePoint(newCalendar)
	}

	/** [timeAmount]만큼 전의 [시간점][TimePoint]을 반환한다. */
	operator fun minus(timeAmount: TimeAmount) = this + (-timeAmount)

	/** this 에서 [other]만큼 뺀 [시간량][TimeAmount]을 반환한다. */
	operator fun minus(other: TimePoint) =
			TimeAmount(this.calendar.timeInMillis - other.calendar.timeInMillis)

	/** 대소 비교 함수 */
	override fun compareTo(other: TimePoint) = this.calendar.compareTo(other.calendar)

	/** 비교 함수 */
	override fun equals(other: Any?) = this.calendar == (other as? TimePoint)?.calendar

	/** 해시 코드 생성 함수 */
	override fun hashCode() = calendar.hashCode()

	/** 문자열 변환 함수 */
	override fun toString() = "${year}년 ${month}월 ${day}일 ${hour}시 ${minute}분 ${second}초"

	companion object
	{
		/** 현재 시각을 [TimePoint]로 반환한다. */
		fun now() = TimePoint(Calendar.getInstance())

		/** 오늘 날짜에 해당하는 [시간점][TimePoint]을 반환한다. (년월일 = 0) */
		fun today() = with(now()) { TimePoint(GregorianCalendar(year, month - 1, day)) }
	}
}

/**
 * # 시간량
 * 시간의 양을 나타낸다.
 */
class TimeAmount(val millis: Long) : Comparable<TimeAmount>
{
	/** this 를 [other]배 한 [시간량][TimeAmount]을 반환한다. */
	operator fun times(other: Int) = TimeAmount(this.millis * other)

	/** this 에 [other]을 더한 [시간량][TimeAmount]을 반환한다. */
	operator fun plus(other: TimeAmount) = TimeAmount(this.millis + other.millis)

	/** this 에서 [other]을 뺀 [시간량][TimeAmount]을 반환한다. */
	operator fun minus(other: TimeAmount) = TimeAmount(this.millis - other.millis)

	/** 부호를 반전한 [시간량][TimeAmount]을 반환한다. */
	operator fun unaryMinus() = TimeAmount(-this.millis)

	/** 대소 비교 함수 */
	override fun compareTo(other: TimeAmount) = this.millis.compareTo(other.millis)

	/** 비교 함수 */
	override fun equals(other: Any?) = this.millis == (other as? TimeAmount)?.millis

	/** 해시 코드 생성 함수 */
	override fun hashCode() = millis.hashCode()

	/** 문자열 변환 함수 */
	override fun toString() = "${millis}초"
}

/** this 밀리초만큼의 [시간량][TimeAmount] */
inline val Int.millis get() = TimeAmount(this.toLong())

/** this 초만큼의 [시간량][TimeAmount] */
inline val Int.seconds get() = 1000.millis * this

/** this 분만큼의 [시간량][TimeAmount] */
inline val Int.minutes get() = 60.seconds * this

/** this 시간만큼의 [시간량][TimeAmount] */
inline val Int.hours get() = 60.minutes * this

/** this 일만큼의 [시간량][TimeAmount] */
inline val Int.days get() = 24.hours * this
