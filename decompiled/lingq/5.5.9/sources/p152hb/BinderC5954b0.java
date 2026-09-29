package p152hb;

import com.google.android.gms.signin.internal.zak;
import ec.BinderC5390c;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: hb.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5954b0 extends BinderC5390c {

    /* JADX INFO: renamed from: a */
    public final WeakReference<C5966e0> f35422a;

    public BinderC5954b0(C5966e0 c5966e0) {
        this.f35422a = new WeakReference<>(c5966e0);
    }

    @Override // ec.InterfaceC5392e
    /* JADX INFO: renamed from: M */
    public final void mo11558M(zak zakVar) {
        C5966e0 c5966e0 = this.f35422a.get();
        if (c5966e0 == null) {
            return;
        }
        c5966e0.f35463a.m12441j(new C5950a0(c5966e0, c5966e0, zakVar));
    }
}
