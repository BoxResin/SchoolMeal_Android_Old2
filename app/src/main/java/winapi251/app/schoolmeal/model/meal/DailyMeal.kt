package winapi251.app.schoolmeal.model.meal

import winapi251.app.schoolmeal.util.TimePoint

/**
 * 하루치 식단 정보
 * @property date 년·월·일
 * @property breakfast 아침
 * @property lunch 점심
 * @property dinner 저녁
 */
data class DailyMeal(
		val date: TimePoint,
		val breakfast: Meal? = null,
		val lunch: Meal? = null,
		val dinner: Meal? = null)
