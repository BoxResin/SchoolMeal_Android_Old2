package winapi251.app.schoolmeal.util

import org.junit.Assert.*
import org.junit.Test
import java.util.*

class DateTimesTest
{
	/** [TimeAmount] 단위 변환 테스트 */
	@Test
	fun convertUnit()
	{
		assertEquals(TimeAmount(millis = 1), 1.millis)
		assertEquals(1000.millis, 1.seconds)
		assertEquals(60.seconds, 1.minutes)
		assertEquals(60.minutes, 1.hours)
		assertEquals(24.hours, 1.days)
	}

	/** [TimePoint]의 동반자 객체 테스트 */
	@Test
	fun timePointCompanion()
	{
		val calendar = Calendar.getInstance()
		val now = TimePoint.now
		val today = TimePoint.today

		val year = calendar[Calendar.YEAR]
		val month = calendar[Calendar.MONTH] + 1
		val day = calendar[Calendar.DAY_OF_MONTH]
		val hour = calendar[Calendar.HOUR_OF_DAY]
		val minute = calendar[Calendar.MINUTE]
		val second = calendar[Calendar.SECOND]

		// now() 테스트
		now.let {
			assertEquals(year, it.year)
			assertEquals(month, it.month)
			assertEquals(day, it.day)
			assertEquals(hour, it.hour)
			assertEquals(minute, it.minute)
			assertEquals(second, it.second)
		}

		// today() 테스트
		today.let {
			assertEquals(year, it.year)
			assertEquals(month, it.month)
			assertEquals(day, it.day)
			assertEquals(0, it.hour)
			assertEquals(0, it.minute)
			assertEquals(0, it.second)
		}
	}

	/** [TimePoint] + [TimeAmount] 테스트 */
	@Test
	fun timePointPlusTimeAmount()
	{
		assertEquals(TimePoint(2018, 9, 2), TimePoint(2018, 8, 29) + 3.days)
		assertEquals(TimePoint(2018, 9, 18, hour = 3), TimePoint(2018, 9, 17) + 27.hours)

		assertEquals(TimePoint(2018, 9, 18, minute = 25),
				TimePoint(2018, 9, 17, hour = 23, minute = 47) + 38.minutes)

		assertEquals(TimePoint(2018, 9, 18, second = 56),
				TimePoint(2018, 9, 17, hour = 23, minute = 59, second = 40) + 76.seconds)

		assertEquals(TimePoint(2018, 9, 18),
				TimePoint(2018, 9, 17, hour = 23, minute = 58, second = 57) + 63000.millis)
	}

	/** [TimePoint] - [TimeAmount] 테스트 */
	@Test
	fun timePointMinusTimeAmount()
	{
		assertEquals(TimePoint(2018, 8, 29), TimePoint(2018, 9, 2) - 3.days)
		assertEquals(TimePoint(2018, 9, 17), TimePoint(2018, 9, 18, hour = 3) - 27.hours)

		assertEquals(TimePoint(2018, 9, 17, hour = 23, minute = 47),
				TimePoint(2018, 9, 18, minute = 25) - 38.minutes)

		assertEquals(TimePoint(2018, 9, 17, hour = 23, minute = 59, second = 40),
				TimePoint(2018, 9, 18, second = 56) - 76.seconds)

		assertEquals(TimePoint(2018, 9, 17, hour = 23, minute = 58, second = 57),
				TimePoint(2018, 9, 18) - 63000.millis)
	}

	/** [TimePoint] - [TimePoint] 테스트 */
	@Test
	fun timePointMinusTimePoint()
	{
		assertEquals(3.days, TimePoint(2018, 9, 2) - TimePoint(2018, 8, 29))
		assertEquals(27.hours, TimePoint(2018, 9, 18, hour = 3) - TimePoint(2018, 9, 17))

		assertEquals(38.minutes, TimePoint(2018, 9, 18, minute = 25) -
				TimePoint(2018, 9, 17, hour = 23, minute = 47))

		assertEquals(76.seconds, TimePoint(2018, 9, 18, second = 56) -
				TimePoint(2018, 9, 17, hour = 23, minute = 59, second = 40))

		assertEquals(63000.millis, TimePoint(2018, 9, 18) -
				TimePoint(2018, 9, 17, hour = 23, minute = 58, second = 57))
	}

	/** [TimePoint] 비교 테스트 */
	@Test
	fun compareTimePoint()
	{
		assert(TimePoint(2018, 6, 30) < TimePoint(2018, 9, 1))
		assert(TimePoint(2018, 1, 1) > TimePoint(2017, 12, 29))
	}

	/** [TimeAmount] 비교 테스트 */
	@Test
	fun compareTimeAmount()
	{
		assert(2.hours + 30.minutes < 3.hours)
		assert(3.days - 15.hours > 2.days)
	}
}
