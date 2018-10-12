package boxresin.core

/** 네트워크 상태 */
sealed class NetworkState
{
	/** 연결됨 */
	sealed class Connected : NetworkState()
	{
		/** 와이파이로 연결됨 */
		object Wifi : Connected()

		/** 데이터 네트워크로 연결됨 */
		object Mobile : Connected()

		/** 알 수 없는 방법으로 연결됨 */
		object Unknown : Connected()
	}

	/** 연결 해제됨 */
	object Disconnected : NetworkState()
}
