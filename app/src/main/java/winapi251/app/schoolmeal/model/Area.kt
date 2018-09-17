package winapi251.app.schoolmeal.model

/**
 * 행정구역
 * @property nameKorean 행정구역 한국어 이름
 */
enum class Area(val nameKorean: String)
{
	SEN("서울"),
	GOE("경기"),
	KWE("강원"),
	CBE("충북"),
	CNE("충남"),
	JBE("전북"),
	JNE("전남"),
	GBE("경북"),
	GNE("경남"),
	JJE("제주"),
	PEN("부산"),
	DGE("대구"),
	ICE("인천"),
	GEN("광주"),
	DJE("대전"),
	USE("울산"),
	SJE("세종")
}
