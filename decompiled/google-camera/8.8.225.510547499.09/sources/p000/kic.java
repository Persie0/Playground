package p000;

import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kic implements kba {

    /* JADX INFO: renamed from: a */
    private final kil f36127a;

    /* JADX INFO: renamed from: b */
    private final jvb f36128b;

    /* JADX INFO: renamed from: c */
    private final knt f36129c;

    /* JADX INFO: renamed from: d */
    private final kik f36130d;

    /* JADX INFO: renamed from: e */
    private final Runnable f36131e;

    /* JADX INFO: renamed from: f */
    private boolean f36132f = false;

    /* JADX INFO: renamed from: g */
    private boolean f36133g = false;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, oju] */
    public kic(ljf ljfVar, ktz ktzVar, knt kntVar, Runnable runnable, kiv kivVar, AmbientDelegate ambientDelegate, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f36129c = kntVar;
        this.f36131e = runnable;
        jvb jvbVar = new jvb();
        this.f36128b = jvbVar;
        kfn kfnVar = ((khc) ljfVar.f38370b).get();
        khu khuVar = (khu) ljfVar.f38374f.get();
        khuVar.getClass();
        Object obj = ljfVar.f38369a.get();
        AmbientDelegate ambientDelegate2 = (AmbientDelegate) ljfVar.f38375g.get();
        ambientDelegate2.getClass();
        kgt kgtVar = (kgt) ljfVar.f38371c.get();
        kgtVar.getClass();
        kfv kfvVar = (kfv) ljfVar.f38372d.get();
        kfvVar.getClass();
        ((kiw) ljfVar.f38373e.get()).getClass();
        kil kilVar = new kil(kfnVar, khuVar, (ktz) obj, ambientDelegate2, kgtVar, kfvVar, kivVar, ambientDelegate, null, null, null);
        this.f36127a = kilVar;
        ktz ktzVar2 = (ktz) ktzVar.f37201d.get();
        ktzVar2.getClass();
        kik kikVar = new kik(ktzVar2, ((fne) ktzVar.f37199b).m8604a(), ((kbm) ktzVar.f37200c).get(), ((khc) ktzVar.f37198a).get(), kilVar, ambientDelegate, null, null, null);
        this.f36130d = kikVar;
        jvbVar.m13537d(kikVar);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized kew m14307a() {
        if (this.f36132f) {
            throw new kec("getConfig3ABuilder() cannot be called after the session is closed.");
        }
        return this.f36130d.m14334a();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized kgw m14308b() {
        if (this.f36132f) {
            throw new kec("getRequestBuilder() cannot be called after the session is closed.");
        }
        return this.f36127a.m14348a();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized nps m14309c(kge kgeVar, boolean z) {
        if (this.f36132f) {
            throw new kec("trigger3A() cannot be called after the session is closed.");
        }
        return this.f36130d.m14335b(kgeVar, z);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f36130d.f36166a.shutdownNow();
        synchronized (this) {
            if (this.f36132f) {
                return;
            }
            if (this.f36133g) {
                try {
                    this.f36127a.m14353f(m14308b().mo14109a());
                    this.f36133g = false;
                } catch (kec e) {
                    Log.e("CAM_RequestProcessorSess", "Failed to resume last repeating request " + e.toString());
                }
            }
            this.f36132f = true;
            this.f36128b.close();
            this.f36129c.close();
            Runnable runnable = this.f36131e;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized nps m14310d(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f36132f) {
            throw new kec("unlock3A() cannot be called after the session is closed.");
        }
        return this.f36130d.m14336c(z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized nps m14311e(kex kexVar, boolean z) {
        if (this.f36132f) {
            throw new kec("update3A() cannot be called after the session is closed.");
        }
        return this.f36130d.m14337d(kexVar, z);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m14312f() {
        if (this.f36132f) {
            throw new kec("abortCaptures() cannot be called after the session is closed.");
        }
        this.f36127a.m14350c();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m14313g() {
        if (this.f36132f) {
            throw new kec("stopRepeating() cannot be called after the session is closed.");
        }
        this.f36133g = true;
        this.f36127a.m14351d();
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m14314h(List list, List list2) {
        if (this.f36132f) {
            throw new kec("submit() cannot be called after the session is closed.");
        }
        this.f36127a.m14352e(list, list2);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m14315i(kgx kgxVar) {
        if (this.f36132f) {
            throw new kec("setRepeating() cannot be called after the session is closed.");
        }
        this.f36127a.m14353f(kgxVar);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m14316j(kgx kgxVar, Set set) {
        if (this.f36132f) {
            throw new kec("submit() cannot be called after the session is closed.");
        }
        this.f36127a.m14354g(kgxVar, set);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized nps m14317k(kex kexVar) {
        if (this.f36132f) {
            throw new kec("lock3AImmediately() with config3a cannot be called after the session is closed.");
        }
        return this.f36130d.m14338e(kexVar);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m14318l(kex kexVar) {
        if (this.f36132f) {
            throw new kec("updateConfig3AWithLocksRetained() cannot be called after the session is closed.");
        }
        this.f36130d.m14339f(kexVar);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m14319m(kex kexVar) {
        if (this.f36132f) {
            throw new kec("submit3A() cannot be called after the session is closed.");
        }
        this.f36130d.m14340g(kexVar);
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m14320n(Set set, kfv kfvVar) {
        if (this.f36132f) {
            throw new kec("submit(parameters, listener) cannot be called after the session is closed.");
        }
        kgw kgwVarM14348a = this.f36127a.m14348a();
        kgwVarM14348a.mo14113e(set);
        kgwVarM14348a.mo14114f(kfvVar);
        this.f36127a.m14355h(kgwVarM14348a.mo14109a());
    }
}
