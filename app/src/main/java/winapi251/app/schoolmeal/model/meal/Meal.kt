package winapi251.app.schoolmeal.model.meal

/**
 * 한 끼 식단 정보
 * @property dishes 반찬 목록
 * @property nutrient 영양소 정보
 * @property origin 원산지 정보 (ex. mapOf("쌀" to "국내산", "돼지고기" to "국내산"))
 */
data class Meal(
		val dishes: List<Dish>,
		val nutrient: Nutrient? = null,
		val origin: Map<String, String> = emptyMap())
