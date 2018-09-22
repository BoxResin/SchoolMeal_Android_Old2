package winapi251.app.schoolmeal.model.meal

import winapi251.app.schoolmeal.model.school.School
import winapi251.app.schoolmeal.util.TimePoint

/** 식단 API */
interface MealApi
{
	/**
	 * 식단 정보를 가져온다.
	 * @param date 식단을 가져올 날짜
	 * @param school 식단을 가져올 학교
	 * @return 지정한 날짜가 포함된 N일치 식단 정보
	 */
	suspend fun fetch(date: TimePoint, school: School): List<DailyMeal>

	// 기본 동작 설정
	companion object : MealApi by MockMealApi
}
