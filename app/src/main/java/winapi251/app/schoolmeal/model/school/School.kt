package winapi251.app.schoolmeal.model.school

import winapi251.app.schoolmeal.model.Area

/**
 * 학교 정보
 * @property code 나이스 학교 코드 (ex. "B100000658")
 * @property courseCode 과정 코드 ("2": 초, "3": 중, "4": 고, "5": 특)
 * @property name 학교 이름 (ex. "선린인터넷고등학교")
 * @property address 학교 주소 (ex. "서울특별시 용산구 원효로97길 33-4")
 * @property area 소속 행정구역
 */
data class School(
		val code: String,
		val courseCode: String,
		val name: String,
		val address: String,
		val area: Area)
