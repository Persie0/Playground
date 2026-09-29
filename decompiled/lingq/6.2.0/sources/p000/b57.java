package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final class b57 extends js2 {

    /* JADX INFO: renamed from: e */
    public final int f7967e;

    /* JADX INFO: renamed from: f */
    public EditText f7968f;

    /* JADX INFO: renamed from: g */
    public final h31 f7969g;

    public b57(is2 is2Var, int i) {
        super(is2Var);
        this.f7967e = R$drawable.design_password_eye;
        this.f7969g = new h31(this, 7);
        if (i != 0) {
            this.f7967e = i;
        }
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: b */
    public final void mo3301b() {
        m14638p();
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: c */
    public final int mo3302c() {
        return R$string.password_toggle_content_description;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: d */
    public final int mo3303d() {
        return this.f7967e;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo3304f() {
        return this.f7969g;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: j */
    public final boolean mo3305j() {
        return true;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: k */
    public final boolean mo3306k() {
        EditText editText = this.f7968f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: l */
    public final void mo3307l(EditText editText) {
        this.f7968f = editText;
        m14638p();
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: q */
    public final void mo3308q() {
        EditText editText = this.f7968f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f7968f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: r */
    public final void mo3309r() {
        EditText editText = this.f7968f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
