package p204jj;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textfield.TextInputEditText;
import com.lingq.p055ui.session.LoginFragment;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import p225kk.C6716m;
import ph.C8362t2;

/* JADX INFO: renamed from: jj.q */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6496q implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37104a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37105b;

    public /* synthetic */ C6496q(int i10, Object obj) {
        this.f37104a = i10;
        this.f37105b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11 = this.f37104a;
        Object obj = this.f37105b;
        switch (i11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C8362t2 c8362t2 = (C8362t2) obj;
                C5207g.m11111f(c8362t2, "$this_with");
                if (i10 != 6) {
                    return false;
                }
                List<Integer> list = C6716m.f37937a;
                C6716m.m13321f(textView.getContext(), textView);
                ((TextInputEditText) c8362t2.f45287d).clearFocus();
                return true;
            default:
                LoginFragment loginFragment = (LoginFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
                C5207g.m11111f(loginFragment, "this$0");
                if (i10 != 4) {
                    return false;
                }
                List<Integer> list2 = C6716m.f37937a;
                Context contextM3578a0 = loginFragment.m3578a0();
                C5207g.m11110e(textView, "textView");
                C6716m.m13321f(contextM3578a0, textView);
                loginFragment.m10334n0(1);
                return true;
        }
    }
}
