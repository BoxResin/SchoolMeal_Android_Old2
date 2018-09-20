package winapi251.app.schoolmeal.ui.main

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import kotlinx.android.synthetic.main.activity_main.*
import winapi251.app.schoolmeal.R

/** 메인 액티비티 */
class MainActivity : AppCompatActivity()
{
	/** 메인 액티비티가 생성될 때 호출된다. */
	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		setSupportActionBar(toolbar)
	}

	/** 메인 액티비티 메뉴를 생성해야 할 때 호출된다. */
	override fun onCreateOptionsMenu(menu: Menu): Boolean
	{
		menuInflater.inflate(R.menu.activity_main, menu)

		// 학교 검색 메뉴 초기화
		val searchSchoolItem = menu.findItem(R.id.action_search_school)
		val searchView = searchSchoolItem.actionView as SearchView
		searchView.queryHint = getString(R.string.action_search_school_hint)

		return true
	}
}
