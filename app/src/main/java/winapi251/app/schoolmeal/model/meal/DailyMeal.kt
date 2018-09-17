package winapi251.app.schoolmeal.model.meal

/**
 * 하루치 식단 정보
 * @property year 년
 * @property month 월
 * @property day 일
 * @property breakfast 아침
 * @property lunch 점심
 * @property dinner 저녁
 */
class DailyMeal(
		val year: Int,
		val month: Int,
		val day: Int,
		val breakfast: Meal? = null,
		val lunch: Meal? = null,
		val dinner: Meal? = null)
