package p000;

import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpz implements drc {

    /* JADX INFO: renamed from: a */
    public static final nbh f12271a = nbh.m17259h("com/google/android/apps/camera/facebeautification/CpuFaceBeautificationController");

    /* JADX INFO: renamed from: b */
    public final int f12272b;

    /* JADX INFO: renamed from: c */
    public final Executor f12273c;

    /* JADX INFO: renamed from: d */
    public final long f12274d;

    /* JADX INFO: renamed from: e */
    public final boolean f12275e;

    /* JADX INFO: renamed from: f */
    private final fxs f12276f;

    public dpz(kpb kpbVar, fxs fxsVar, Executor executor, int i, dhv dhvVar) {
        this.f12276f = fxsVar;
        this.f12273c = executor;
        this.f12272b = i;
        boolean zMo6184l = dhvVar.mo6184l(dhp.f11153j);
        this.f12275e = zMo6184l;
        int i2 = 0;
        if (!kpbVar.m14663c() && !kpbVar.m14664d() && !kpbVar.m14665e() && !kpbVar.m14666f() && !kpbVar.m14667g()) {
            i2 = 1;
        }
        this.f12274d = FaceBeautificationNative.createHandle(i2, i, zMo6184l);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kpw] */
    @Override // p000.drc
    /* JADX INFO: renamed from: a */
    public final nps mo6564a(cvy cvyVar) {
        return !((gzl) cvyVar.f9845b).m10016b() ? kxk.m14965K(new dqp(cvyVar.f9846c)) : this.f12276f.m8939a(new dqr(this, cvyVar, 1, (byte[]) null, (byte[]) null));
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f12273c.execute(new dgt(this, 15));
    }
}
