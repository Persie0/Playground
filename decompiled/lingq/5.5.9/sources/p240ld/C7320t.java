package p240ld;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.C3093a;
import com.linguist.R;
import p274n8.ViewOnClickListenerC7718c;

/* JADX INFO: renamed from: ld.t */
/* JADX INFO: loaded from: classes.dex */
public final class C7320t extends AbstractC7313m {

    /* JADX INFO: renamed from: e */
    public final int f41000e;

    /* JADX INFO: renamed from: f */
    public EditText f41001f;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC7718c f41002g;

    public C7320t(C3093a c3093a, int i10) {
        super(c3093a);
        this.f41000e = R.drawable.design_password_eye;
        this.f41002g = new ViewOnClickListenerC7718c(3, this);
        if (i10 != 0) {
            this.f41000e = i10;
        }
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: b */
    public final void mo14714b() {
        m14716q();
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: c */
    public final int mo14694c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: d */
    public final int mo14695d() {
        return this.f41000e;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo14697f() {
        return this.f41002g;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: k */
    public final boolean mo14715k() {
        return true;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: l */
    public final boolean mo14709l() {
        EditText editText = this.f41001f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: m */
    public final void mo14699m(EditText editText) {
        this.f41001f = editText;
        m14716q();
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: r */
    public final void mo14701r() {
        EditText editText = this.f41001f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.f41001f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: s */
    public final void mo14702s() {
        EditText editText = this.f41001f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
