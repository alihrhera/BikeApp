package ali.hrhera.core

import android.app.Activity
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment


fun Activity.showToast(message: String?) {
    message?.takeIf { it.isNotBlank() }?.let {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}

fun Activity.showToast(@StringRes message: Int) {
    Toast.makeText(this, getText(message), Toast.LENGTH_LONG).show()
}


fun Fragment.showToast(message: String?) {
    requireActivity().showToast(message)
}

fun Fragment.showToast(@StringRes message: Int) {
    requireActivity().showToast(message)
}

