
import android.content.Context
import com.scottyab.rootbeer.RootBeer


class CellphoneRoutingChecker {

    fun checkSuperUser(mContext : Context): Boolean {
        return RootBeer(mContext).isRooted
    }
}
