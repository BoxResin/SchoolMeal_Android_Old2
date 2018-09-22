package winapi251.app.schoolmeal.model.meal

import winapi251.app.schoolmeal.model.meal.Allergy.*
import winapi251.app.schoolmeal.model.school.School
import winapi251.app.schoolmeal.util.TimePoint
import winapi251.app.schoolmeal.util.days

/** 가짜 식단 API */
object MockMealApi : MealApi
{
	override suspend fun fetch(date: TimePoint, school: School): List<DailyMeal> = listOf(
			DailyMeal(date - 1.days,
					breakfast = Meal(
							listOf(
									Dish("기장밥"),
									Dish("매운쇠고기무국", allergies = listOf(SOYBEAN)),
									Dish("반건오징어꽈리고추조림"),
									Dish("고구마순된장지짐", allergies = listOf(WHEAT)),
									Dish("크림치즈미트번", allergies = listOf(EGG, MILK, SOYBEAN)),
									Dish("배추김치", allergies = listOf(SHRIMP)),
									Dish("요구르트", allergies = listOf(MILK))
							),
							nutrient = Nutrient(
									energy = 737.1,
									carbohydrate = 84.4,
									protein = 29.0,
									fat = 10.6,
									calcium = 265.0,
									iron = 3.8,
									vitaminA = 121.2,
									thiamine = 0.4,
									riboflavin = 0.4,
									vitaminC = 16.3
							),
							origin = mapOf("쌀" to "국내산", "돼지고기" to "국내산")
					),
					lunch = Meal(
							listOf(
									Dish("흑미밥"),
									Dish("근대된장국(중)", allergies = listOf(SULFUROUS_ACID)),
									Dish("매콤자장돼지사태찜", allergies = listOf(SOYBEAN, PORK)),
									Dish("달걀야채말이", allergies = listOf(EGG, SOYBEAN)),
									Dish("소시지바", allergies = listOf(WHEAT, TOMATO, BEEF)),
									Dish("깍두기", allergies = listOf(SHRIMP, SULFUROUS_ACID)),
									Dish("키위")
							),
							nutrient = Nutrient(
									energy = 1157.3,
									carbohydrate = 120.7,
									protein = 66.8,
									fat = 22.5,
									calcium = 352.9,
									iron = 9.5,
									vitaminA = 611.9,
									thiamine = 1.2,
									riboflavin = 0.8,
									vitaminC = 44.7
							),
							origin = mapOf("쌀" to "국내산", "돼지고기" to "국내산")
					)),

			DailyMeal(date,
					breakfast = Meal(
							listOf(
									Dish("차조밥"),
									Dish("왕만두국", allergies = listOf(EGG, WHEAT, PORK)),
									Dish("멸치고추장볶음", allergies = listOf(SULFUROUS_ACID)),
									Dish("고사리나물", allergies = listOf(SOYBEAN, WHEAT)),
									Dish("훈제연어버터구이+소스", allergies = listOf(EGG, MILK)),
									Dish("석박지", allergies = listOf(SHRIMP, SULFUROUS_ACID)),
									Dish("비요뜨", allergies = listOf(EGG, MILK))
							),
							nutrient = Nutrient(
									energy = 1069.6,
									carbohydrate = 106.6,
									protein = 49.6,
									fat = 25.4,
									calcium = 562.8,
									iron = 8.6,
									vitaminA = 326.5,
									thiamine = 1.5,
									riboflavin = 1.3,
									vitaminC = 11.1
							),
							origin = mapOf("쌀" to "국내산", "돼지고기" to "국내산")
					),
					lunch = Meal(
							listOf(
									Dish("약간밥"),
									Dish("나가사끼짬뽕(면)", allergies = listOf(EGG, MILK)),
									Dish("핫도그/케찹", allergies = listOf(SOYBEAN, WHEAT)),
									Dish("배추김치", allergies = listOf(SHRIMP, SULFUROUS_ACID)),
									Dish("카스테라찹쌀떡", allergies = listOf(SOYBEAN)),
									Dish("과일샐러드", allergies = listOf(EGG, MILK, SOYBEAN))
							),
							nutrient = Nutrient(
									energy = 1453.9,
									carbohydrate = 243.0,
									protein = 38.0,
									fat = 40.4,
									calcium = 288.6,
									iron = 6.1,
									vitaminA = 323.8,
									thiamine = 1.1,
									riboflavin = 0.8,
									vitaminC = 52.2
							),
							origin = mapOf("쌀" to "국내산", "돼지고기" to "국내산")
					),
					dinner = Meal(
							listOf(
									Dish("찰현미밥"),
									Dish("애호박새우젓국", allergies = listOf(SOYBEAN, WHEAT)),
									Dish("소시지어묵케첩조림", allergies = listOf(EGG, MILK)),
									Dish("왕돈까스/소스", allergies = listOf(EGG, MILK, SOYBEAN)),
									Dish("깍두기", allergies = listOf(SHRIMP, SULFUROUS_ACID)),
									Dish("사과당근쥬스"),
									Dish("알배추샐러드", allergies = listOf(EGG, SOYBEAN, TOMATO))
							),
							nutrient = Nutrient(
									energy = 1461.9,
									carbohydrate = 160.4,
									protein = 43.4,
									fat = 70.6,
									calcium = 316.4,
									iron = 6.9,
									vitaminA = 198.4,
									thiamine = 20.5,
									riboflavin = 12.4,
									vitaminC = 116.5
							),
							origin = mapOf("쌀" to "국내산", "돼지고기" to "국내산")
					)),

			DailyMeal(date + 1.days,
					lunch = Meal(
							listOf(
									Dish("흑미밥"),
									Dish("북어계란국", allergies = listOf(EGG, SOYBEAN)),
									Dish("갈치감자조림", allergies = listOf(WHEAT, SULFUROUS_ACID)),
									Dish("가지나물볶음", allergies = listOf(SOYBEAN, WHEAT)),
									Dish("스팸구이", allergies = listOf(SOYBEAN, WHEAT)),
									Dish("배추김치"),
									Dish("요구르트", allergies = listOf(MILK))
							),
							nutrient = Nutrient(
									energy = 852.2,
									carbohydrate = 102.7,
									protein = 31.1,
									fat = 32.7,
									calcium = 169.2,
									iron = 3.4,
									vitaminA = 93.0,
									thiamine = 0.5,
									riboflavin = 0.5,
									vitaminC = 17.1
							),
							origin = mapOf("쌀" to "국내산", "돼지고기" to "국내산")
					))
	)
}
