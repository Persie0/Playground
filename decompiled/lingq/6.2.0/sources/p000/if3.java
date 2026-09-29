package p000;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.p011gu.toolargetool.TooLargeTool;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class if3 extends ge3 {

    /* JADX INFO: renamed from: a */
    public final oc3 f44036a;

    /* JADX INFO: renamed from: b */
    public final rj5 f44037b;

    /* JADX INFO: renamed from: c */
    public final HashMap f44038c = new HashMap();

    /* JADX INFO: renamed from: d */
    public boolean f44039d = true;

    public if3(oc3 oc3Var, rj5 rj5Var) {
        this.f44036a = oc3Var;
        this.f44037b = rj5Var;
    }

    @Override // p000.ge3
    /* JADX INFO: renamed from: a */
    public final void mo12507a(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, AbstractC0638f abstractC0638f) {
        abstractComponentCallbacksC0635c.getClass();
        m13861g(abstractComponentCallbacksC0635c, abstractC0638f);
    }

    @Override // p000.ge3
    /* JADX INFO: renamed from: d */
    public final void mo12510d(AbstractC0638f abstractC0638f, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, Bundle bundle) {
        abstractComponentCallbacksC0635c.getClass();
        if (this.f44039d) {
            this.f44038c.put(abstractComponentCallbacksC0635c, bundle);
        }
    }

    @Override // p000.ge3
    /* JADX INFO: renamed from: e */
    public final void mo12511e(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, AbstractC0638f abstractC0638f) {
        abstractComponentCallbacksC0635c.getClass();
        m13861g(abstractComponentCallbacksC0635c, abstractC0638f);
    }

    /* JADX INFO: renamed from: g */
    public final void m13861g(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, AbstractC0638f abstractC0638f) {
        rj5 rj5Var = this.f44037b;
        Bundle bundle = (Bundle) this.f44038c.remove(abstractComponentCallbacksC0635c);
        if (bundle != null) {
            try {
                abstractComponentCallbacksC0635c.getClass();
                String strM17735j = AbstractC3393o1.m17735j(abstractComponentCallbacksC0635c.getClass().getSimpleName(), ".onSaveInstanceState wrote: ", TooLargeTool.bundleBreakdown(bundle));
                Bundle bundle2 = abstractComponentCallbacksC0635c.f5695f;
                if (bundle2 != null) {
                    strM17735j = AbstractC3393o1.m17735j(strM17735j, "\n* fragment arguments = ", TooLargeTool.bundleBreakdown(bundle2));
                }
                mj5 mj5Var = (mj5) rj5Var;
                Log.println(mj5Var.f51398b, mj5Var.f51397a, strM17735j);
            } catch (RuntimeException e) {
                Log.w(((mj5) rj5Var).f51397a, e.getMessage(), e);
            }
        }
    }
}
