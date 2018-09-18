package winapi251.app.schoolmeal.model.meal

import winapi251.app.schoolmeal.util.TimePoint

/** 식단 API */
interface MealApi
{
	/**
	 * 지정한 [날짜][date]의 식단 정보를 가져온다.
	 * @return 지정한 날짜가 포함된 N일치 식단 정보
	 */
	suspend fun fetch(date: TimePoint): List<DailyMeal>
}
