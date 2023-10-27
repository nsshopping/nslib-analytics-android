
import android.content.Context
import com.pss.nslibsecurity.R


enum class NSSecurityErrorCode(val value: Int) {
    ROOTED_USER(0),

}

data class NSSecurityResponse(val result: Boolean, val error: NSSecurityError? = null)
data class NSSecurityError(val errorCode: NSSecurityErrorCode, val errorMessage: String)

object NSSecurityManager {
    private val cellphoneRoutingChecker = CellphoneRoutingChecker()

    fun verifySuperUser(mContext : Context): NSSecurityResponse {
        if (checkSuperUser(mContext))
            return NSSecurityResponse(
                false,
                NSSecurityError(
                    NSSecurityErrorCode.ROOTED_USER,
                    mContext.resources.getString(R.string.security_rooted_user_warning)
                )
            )

        return NSSecurityResponse(true)
    }

    private fun checkSuperUser(mContext : Context): Boolean {
        return cellphoneRoutingChecker.checkSuperUser(mContext)
    }


}
