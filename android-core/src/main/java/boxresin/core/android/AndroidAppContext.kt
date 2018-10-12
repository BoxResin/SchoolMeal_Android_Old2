package boxresin.core.android

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import boxresin.core.AppContext
import boxresin.core.NetworkState

/** 안드로이드 애플리케이션 문맥 */
class AndroidAppContext(private val context: Context) : AppContext
{
	override val networkState: NetworkState get()
	{
		val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
		val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
		val isConnected: Boolean = activeNetwork?.isConnected == true

		val isWifi: Boolean = activeNetwork?.type == ConnectivityManager.TYPE_WIFI
		val isMobile: Boolean = activeNetwork?.type == ConnectivityManager.TYPE_MOBILE

		return when
		{
			isConnected && isWifi -> NetworkState.Connected.Wifi
			isConnected && isMobile -> NetworkState.Connected.Mobile
			isConnected -> NetworkState.Connected.Unknown
			else -> NetworkState.Disconnected
		}
	}
}
