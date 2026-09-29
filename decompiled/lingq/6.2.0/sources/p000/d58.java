package p000;

import com.amplitude.core.remoteconfig.C0912a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d58 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f35015a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0912a f35016b;

    public d58(C0912a c0912a, s50 s50Var) {
        this.f35016b = c0912a;
        this.f35015a = new WeakReference(s50Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m10109a(vi3 vi3Var) {
        s50 s50Var = (s50) this.f35015a.get();
        if (s50Var == null) {
            return;
        }
        try {
            vi3Var.invoke(s50Var);
        } catch (Exception e) {
            this.f35016b.f11185h.mo16255a("Exception in subscriber callback: " + e.getMessage());
        }
    }
}
