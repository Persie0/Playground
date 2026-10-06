package p000;

import android.hardware.HardwareBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqr implements fxp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12349a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12350b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f12351c;

    public dqr(dpz dpzVar, cvy cvyVar, int i, byte[] bArr, byte[] bArr2) {
        this.f12351c = i;
        this.f12350b = dpzVar;
        this.f12349a = cvyVar;
    }

    public dqr(dqs dqsVar, cvy cvyVar, int i, byte[] bArr, byte[] bArr2) {
        this.f12351c = i;
        this.f12350b = dqsVar;
        this.f12349a = cvyVar;
    }

    public dqr(drl drlVar, drj drjVar, int i) {
        this.f12351c = i;
        this.f12349a = drlVar;
        this.f12350b = drjVar;
    }

    public dqr(eft eftVar, Runnable runnable, int i) {
        this.f12351c = i;
        this.f12350b = eftVar;
        this.f12349a = runnable;
    }

    public dqr(fyl fylVar, grm grmVar, int i) {
        this.f12351c = i;
        this.f12350b = fylVar;
        this.f12349a = grmVar;
    }

    public dqr(Executor executor, Runnable runnable, int i) {
        this.f12351c = i;
        this.f12349a = executor;
        this.f12350b = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kpw] */
    @Override // p000.fxp
    /* JADX INFO: renamed from: b */
    public final nps mo6601b() {
        switch (this.f12351c) {
            case 0:
                return kxk.m14965K(new dqp(((cvy) this.f12349a).f9846c));
            case 1:
                return kxk.m14965K(new dqp(((cvy) this.f12349a).f9846c));
            case 2:
                return kxk.m14965K(false);
            case 3:
                return kxk.m14964J(new kec());
            case 4:
                ((grm) this.f12349a).f26152a.close();
                return kxk.m14964J(new kec("Software jpeg saver was closed"));
            default:
                return kxk.m14963I();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.lang.Runnable] */
    @Override // p000.fxp
    /* JADX INFO: renamed from: a */
    public final nps mo6600a() {
        switch (this.f12351c) {
            case 0:
                npt nptVarM17615a = npt.m17615a(new cpb(this, (cvy) this.f12349a, 4, (byte[]) null, (byte[]) null));
                ((dqs) this.f12350b).f12352a.execute(nptVarM17615a);
                return nptVarM17615a;
            case 1:
                HardwareBuffer hardwareBufferMo7250f = ((cvy) this.f12349a).f9846c.mo7250f();
                if (hardwareBufferMo7250f != null) {
                    try {
                        ((nbe) ((nbe) dpz.f12271a.m17252c()).mo17276G(1083)).mo17290o("Using CPU processing on an image having a HardwareBuffer?");
                    } catch (Throwable th) {
                        try {
                            hardwareBufferMo7250f.close();
                            break;
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                break;
                            } catch (Exception e) {
                            }
                        }
                        throw th;
                    }
                    break;
                }
                if (hardwareBufferMo7250f != null) {
                    hardwareBufferMo7250f.close();
                }
                dpz dpzVar = (dpz) this.f12350b;
                npt nptVarM17615a2 = npt.m17615a(new dpy(dpzVar.f12274d, (cvy) this.f12349a, dpzVar.f12272b, dpzVar.f12275e, null, null));
                ((dpz) this.f12350b).f12273c.execute(nptVarM17615a2);
                return nptVarM17615a2;
            case 2:
                drj drjVar = (drj) this.f12350b;
                Object obj = drjVar.f12395a;
                npt nptVarM17615a3 = npt.m17615a(new cpb(this, drjVar, 5, null));
                drl drlVar = (drl) this.f12349a;
                drlVar.f12401a.execute(drlVar.f12402b.mo13959c("Deeprestore-RGB", nptVarM17615a3));
                return nptVarM17615a3;
            case 3:
                final nqf nqfVarM17621g = nqf.m17621g();
                Executor executor = ((eft) this.f12350b).f13865g.f13879d;
                final ?? r2 = this.f12349a;
                executor.execute(new Runnable() { // from class: efs
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable = r2;
                        nqf nqfVar = nqfVarM17621g;
                        try {
                            runnable.run();
                        } finally {
                            nqfVar.mo14894e(true);
                        }
                    }
                });
                return nqfVarM17621g;
            case 4:
                nqf nqfVarM17621g2 = nqf.m17621g();
                fyl fylVar = (fyl) this.f12350b;
                fylVar.f23911a.execute(new fyk(fylVar, (grm) this.f12349a, nqfVarM17621g2));
                return nqfVarM17621g2;
            default:
                try {
                    this.f12349a.execute(this.f12350b);
                    return kxk.m14965K(true);
                } catch (RejectedExecutionException e2) {
                    ((nbe) ((nbe) ((nbe) glq.f25525a.m17252c()).mo17283h(e2)).mo17276G((char) 2964)).mo17290o("Error executing task.");
                    return kxk.m14963I();
                }
        }
    }
}
