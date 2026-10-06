package p000;

import android.util.Log;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lcf implements lcd {

    /* JADX INFO: renamed from: a */
    private final kzx f37914a;

    /* JADX INFO: renamed from: b */
    public final lby f37915b;

    protected lcf(lby lbyVar, kzx kzxVar) {
        this.f37915b = lbyVar;
        this.f37914a = kzxVar;
        if (lbyVar.mo15155g() && lqi.m15867l(kzxVar) == null) {
            Log.e("GLContextObject", "Creating non-ready GL object on GL thread. This will likely cause a deadlock.");
        }
        boolean z = lbo.f37882a;
    }

    /* JADX INFO: renamed from: d */
    public static kzx m15165d(lby lbyVar, Callable callable) {
        if (!lbyVar.mo15155g()) {
            return lqi.m15863h(lbyVar, callable);
        }
        try {
            return lqi.m15864i(callable.call());
        } catch (Exception e) {
            return lqi.m15862g(kxk.m14964J(kzy.m15111a(e)));
        }
    }

    @Override // p000.kyx
    /* JADX INFO: renamed from: a */
    public laa mo15079a() {
        boolean z = lbo.f37882a;
        return laa.m15114j(m15166e(fse.f23450e, new kza()));
    }

    @Override // p000.lcd
    /* JADX INFO: renamed from: c */
    public final ldq mo15164c() {
        if (this.f37915b.mo15155g()) {
            return m15167f();
        }
        throw new IllegalStateException("raw should only be called from the GLContext thread");
    }

    @Override // p000.kyx, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        lqi.m15868m(mo15079a());
    }

    /* JADX INFO: renamed from: e */
    public final kzx m15166e(lde ldeVar, kyz kyzVar) {
        return m15165d(this.f37915b, new lce(this, kyzVar, ldeVar));
    }

    /* JADX INFO: renamed from: f */
    public final ldq m15167f() {
        if (!this.f37915b.mo15155g()) {
            return (ldq) lqi.m15868m(this.f37914a);
        }
        ldq ldqVar = (ldq) lqi.m15867l(this.f37914a);
        if (ldqVar != null) {
            return ldqVar;
        }
        throw new RuntimeException("Waiting for incomplete GL object while on GL thread. This deadlocks the process.");
    }
}
