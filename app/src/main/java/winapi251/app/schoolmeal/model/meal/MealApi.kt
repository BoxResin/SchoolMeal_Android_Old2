package winapi251.app.schoolmeal.model.meal

/** 식단 API */
interface MealApi
{
	/**
	 * 지정한 [년][year], [월][month], [일][day]의 식단 정보를 가져온다.
	 * @return 지정한 날짜가 포함된 N일치 식단 정보
	 */
	fun fetch(year: Int, month: Int, day: Int): List<DailyMeal>
}
