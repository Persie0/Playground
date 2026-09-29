package p000;

import android.app.Dialog;
import androidx.lifecycle.Lifecycle$Event;
import com.lingq.core.web.WebViewFragment;
import com.lingq.feature.search.search.C2779e;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pb5 implements rb5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55930b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f55931c;

    public /* synthetic */ pb5(int i, Object obj, Object obj2) {
        this.f55929a = i;
        this.f55930b = obj;
        this.f55931c = obj2;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        Dialog dialog;
        int i = this.f55929a;
        Object obj = this.f55931c;
        Object obj2 = this.f55930b;
        switch (i) {
            case 0:
                t66 t66Var = (t66) obj;
                if (lifecycle$Event == ((Lifecycle$Event) obj2)) {
                    ((ui3) t66Var.getValue()).mo0a();
                }
                break;
            case 1:
                k66 k66Var = (k66) obj;
                if (lifecycle$Event == ((Lifecycle$Event) obj2) && !fa4.m11650l(k66Var.mo12408n(), i77.f43628a)) {
                    ((xc9) k66Var.f46767c).setValue(k66Var.m14918a());
                    break;
                }
                break;
            case 2:
                C2779e c2779e = (C2779e) obj2;
                t66 t66Var2 = (t66) obj;
                if (lifecycle$Event == Lifecycle$Event.ON_RESUME && ((xs8) t66Var2.getValue()).f68663l) {
                    c2779e.m9706W2(wr8.f67207a);
                    break;
                }
                break;
            default:
                WebViewFragment webViewFragment = (WebViewFragment) obj2;
                dfa dfaVar = (dfa) obj;
                if (lifecycle$Event == Lifecycle$Event.ON_RESUME) {
                    Dialog dialog2 = webViewFragment.f8417H0;
                    if (dialog2 != null) {
                        dialog2.setOnKeyListener(dfaVar);
                    }
                    break;
                } else if (lifecycle$Event == Lifecycle$Event.ON_PAUSE && (dialog = webViewFragment.f8417H0) != null) {
                    dialog.setOnKeyListener(null);
                    break;
                }
                break;
        }
    }
}
