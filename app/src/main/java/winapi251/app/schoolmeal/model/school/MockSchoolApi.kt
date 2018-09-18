package winapi251.app.schoolmeal.model.school

import winapi251.app.schoolmeal.model.Area

/** 가짜 학교 API */
object MockSchoolApi : SchoolApi
{
	override suspend fun search(name: String): List<School> = listOf(
			School(code = "B100000925", courseCode = "2", name = "서울선린초등학교",
					address = "서울특별시 강동구 진황도로61길 29", area = Area.SEN),

			School(code = "B100002350", courseCode = "3", name = "선린중학교",
					address = "서울특별시 용산구 원효로97길 33-4", area = Area.SEN),

			School(code = "B100000658", courseCode = "4", name = "선린인터넷고등학교",
					address = "서울특별시 용산구 원효로97길 33-4", area = Area.SEN)
	)
}
