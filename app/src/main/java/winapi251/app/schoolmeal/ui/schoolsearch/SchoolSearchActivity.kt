package winapi251.app.schoolmeal.ui.schoolsearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_school_search.*
import winapi251.app.schoolmeal.R

/** 학교 검색 액티비티 */
class SchoolSearchActivity : AppCompatActivity()
{
	/** 학교 검색 액티비티가 생성될 때 호출된다. */
	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_school_search)

		// 검색창에 포커스를 준다.
		search_school.isIconified = false

		// 사용자가 검색창의 X 버튼을 누르면 액티비티를 닫는다.
		search_school.setOnCloseListener {
			finish(); true
		}
	}
}
