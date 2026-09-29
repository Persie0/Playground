package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class hs2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ is2 f42865a;

    public hs2(is2 is2Var) {
        this.f42865a = is2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m13452a(TextInputLayout textInputLayout) {
        is2 is2Var = this.f42865a;
        r11 r11Var = is2Var.f44491Q;
        if (is2Var.f44488N == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = is2Var.f44488N;
        if (editText != null) {
            editText.removeTextChangedListener(r11Var);
            if (is2Var.f44488N.getOnFocusChangeListener() == is2Var.m14114b().mo14631e()) {
                is2Var.f44488N.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        is2Var.f44488N = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(r11Var);
        }
        is2Var.m14114b().mo3307l(is2Var.f44488N);
        is2Var.m14123k(is2Var.m14114b());
    }
}
