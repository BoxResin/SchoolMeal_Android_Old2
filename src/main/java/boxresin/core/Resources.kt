package boxresin.core

/** 리소스 */
interface Resources
{
	/**
	 * 문자열 리소스를 가져온다.
	 * @param id 문자열 리소스 ID
	 */
	fun string(id: Int): String

	/**
	 * 색상 리소스를 가져온다.
	 * @param id 색상 리소스 ID
	 * @return ARGB 값
	 */
	fun color(id: Int): Int
}
