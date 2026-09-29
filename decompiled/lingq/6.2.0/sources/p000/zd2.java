package p000;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractC0638f;

/* JADX INFO: loaded from: classes2.dex */
public final class zd2 implements op6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ be2 f71381a;

    public zd2(be2 be2Var) {
        this.f71381a = be2Var;
    }

    @Override // p000.op6
    /* JADX INFO: renamed from: a */
    public final void mo14457a(Object obj) {
        if (((ub5) obj) != null) {
            be2 be2Var = this.f71381a;
            if (be2Var.f8413D0) {
                View viewM2092T = be2Var.m2092T();
                if (viewM2092T.getParent() != null) {
                    C3386nv.m17633t("DialogFragment can not be attached to a container view");
                    return;
                }
                if (be2Var.f8417H0 != null) {
                    if (AbstractC0638f.m2128L(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + be2Var.f8417H0);
                    }
                    be2Var.f8417H0.setContentView(viewM2092T);
                }
            }
        }
    }
}
