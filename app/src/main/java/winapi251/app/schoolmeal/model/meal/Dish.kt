package winapi251.app.schoolmeal.model.meal

/**
 * 반찬 정보
 * @property name 반찬 이름
 * @property allergies 유발하는 알레르기 목록
 */
data class Dish(
		val name: String,
		val allergies: List<Allergy> = emptyList())
