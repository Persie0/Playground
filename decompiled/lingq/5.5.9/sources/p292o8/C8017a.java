package p292o8;

import android.graphics.drawable.Drawable;
import com.facebook.login.widget.LoginButton;
import com.linguist.R;
import p104f.C5452a;
import p173i8.C6205a;
import p291o7.AbstractC7996f;

/* JADX INFO: renamed from: o8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8017a extends AbstractC7996f {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LoginButton f43610e;

    public C8017a(LoginButton loginButton) {
        this.f43610e = loginButton;
    }

    @Override // p291o7.AbstractC7996f
    /* JADX INFO: renamed from: a */
    public final void mo15866a() {
        LoginButton loginButton = this.f43610e;
        loginButton.m6739l();
        if (C6205a.m12742b(loginButton)) {
            return;
        }
        try {
            loginButton.setCompoundDrawablesWithIntrinsicBounds(C5452a.m11672a(loginButton.getContext(), R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th2) {
            C6205a.m12741a(loginButton, th2);
        }
    }
}
