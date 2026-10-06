package p000;

import android.os.AsyncTask;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jzq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f35344a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f35345b;

    public /* synthetic */ jzq(Collection collection, int i) {
        this.f35345b = i;
        this.f35344a = collection;
    }

    public /* synthetic */ jzq(jvb jvbVar, int i) {
        this.f35345b = i;
        this.f35344a = jvbVar;
    }

    public /* synthetic */ jzq(jzs jzsVar, int i) {
        this.f35345b = i;
        this.f35344a = jzsVar;
    }

    public /* synthetic */ jzq(kba kbaVar, int i) {
        this.f35345b = i;
        this.f35344a = kbaVar;
    }

    public /* synthetic */ jzq(kct kctVar, int i) {
        this.f35345b = i;
        this.f35344a = kctVar;
    }

    public /* synthetic */ jzq(kdt kdtVar, int i) {
        this.f35345b = i;
        this.f35344a = kdtVar;
    }

    public /* synthetic */ jzq(kgp kgpVar, int i) {
        this.f35345b = i;
        this.f35344a = kgpVar;
    }

    public /* synthetic */ jzq(kig kigVar, int i) {
        this.f35345b = i;
        this.f35344a = kigVar;
    }

    public /* synthetic */ jzq(kiz kizVar, int i) {
        this.f35345b = i;
        this.f35344a = kizVar;
    }

    public /* synthetic */ jzq(kjm kjmVar, int i) {
        this.f35345b = i;
        this.f35344a = kjmVar;
    }

    public jzq(kkw kkwVar, int i) {
        this.f35345b = i;
        this.f35344a = kkwVar;
    }

    public /* synthetic */ jzq(knu knuVar, int i) {
        this.f35345b = i;
        this.f35344a = knuVar;
    }

    public /* synthetic */ jzq(kqs kqsVar, int i) {
        this.f35345b = i;
        this.f35344a = kqsVar;
    }

    public jzq(kup kupVar, int i) {
        this.f35345b = i;
        this.f35344a = kupVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a5, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x022e, code lost:
    
        throw r1;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kct] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kct] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kba] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        kex kexVar;
        boolean z;
        kjl kjlVar;
        boolean z2 = false;
        switch (this.f35345b) {
            case 0:
                ((jzs) this.f35344a).f35366h.mo14894e(null);
                return;
            case 1:
                ((jzs) this.f35344a).f35367i.quitSafely();
                return;
            case 2:
                try {
                    ((jzs) this.f35344a).f35361c.stop();
                    return;
                } catch (RuntimeException e) {
                    Log.w("VideoEncoder", "MediaCodec could not stop.", e);
                    return;
                }
            case 3:
                this.f35344a.mo13973c(kcl.CAMERA_NO_WAKELOCK_ERROR_CODE);
                return;
            case 4:
                this.f35344a.mo13971a();
                return;
            case 5:
                ((kdt) this.f35344a).m14006g(kcl.CAMERA_CLOSED_ERROR_CODE);
                return;
            case 6:
                Object obj = this.f35344a;
                while (true) {
                    synchronized (obj) {
                        kexVar = ((kgp) obj).f35942c;
                        z = ((kgp) obj).f35944e;
                        ((kgp) obj).f35943d = false;
                        ((kgp) obj).f35944e = false;
                        break;
                    }
                    if (z) {
                        try {
                            khf khfVar = ((kgp) obj).f35940a;
                            synchronized (khfVar) {
                                kex kexVarM14856h = khfVar.f36015c.m14856h(kexVar, khfVar.f36013a);
                                if (!kexVarM14856h.equals(khfVar.f36013a)) {
                                    try {
                                        kic kicVarM14322a = khfVar.f36014b.m14322a();
                                        try {
                                            kicVarM14322a.m14318l(kexVarM14856h);
                                            kicVarM14322a.close();
                                            synchronized (khfVar) {
                                                kir kirVarM14363b = kir.m14363b(kexVarM14856h);
                                                kis kisVar = khfVar.f36013a;
                                                kirVarM14363b.f36200f = kisVar.f36206a;
                                                kirVarM14363b.f36201g = kisVar.f36207b;
                                                kirVarM14363b.f36202h = kisVar.f36208c;
                                                khfVar.m14261c(kirVarM14363b.m14365d());
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                kicVarM14322a.close();
                                                break;
                                            } catch (Throwable th2) {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        synchronized (khfVar) {
                                            kir kirVarM14363b2 = kir.m14363b(kexVarM14856h);
                                            kis kisVar2 = khfVar.f36013a;
                                            kirVarM14363b2.f36200f = kisVar2.f36206a;
                                            kirVarM14363b2.f36201g = kisVar2.f36207b;
                                            kirVarM14363b2.f36202h = kisVar2.f36208c;
                                            khfVar.m14261c(kirVarM14363b2.m14365d());
                                            throw th3;
                                        }
                                    }
                                    break;
                                }
                            }
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            ((kgp) obj).f35941b.mo13941c("Interrupted when updating 3a with locksRetained=" + z, e2);
                        } catch (kec e3) {
                            ((kgp) obj).f35941b.mo13941c("FrameServer was closed when updating 3a with locksRetained=" + z, e3);
                        }
                    } else {
                        khf khfVar2 = ((kgp) obj).f35940a;
                        synchronized (khfVar2) {
                            kex kexVarM14856h2 = khfVar2.f36015c.m14856h(kexVar, khfVar2.f36013a);
                            if (!kexVarM14856h2.equals(khfVar2.f36013a)) {
                                try {
                                    kic kicVarM14322a2 = khfVar2.f36014b.m14322a();
                                    try {
                                        kicVarM14322a2.m14311e(kexVarM14856h2, true);
                                        kicVarM14322a2.close();
                                        synchronized (khfVar2) {
                                            kir kirVarM14363b3 = kir.m14363b(kexVarM14856h2);
                                            kirVarM14363b3.f36200f = Boolean.valueOf(khfVar2.m14263e(khfVar2.f36013a, kexVarM14856h2));
                                            kirVarM14363b3.f36201g = Boolean.valueOf(khfVar2.m14262d(khfVar2.f36013a, kexVarM14856h2));
                                            kirVarM14363b3.f36202h = Boolean.valueOf(khfVar2.m14264f(khfVar2.f36013a, kexVarM14856h2));
                                            khfVar2.m14261c(kirVarM14363b3.m14365d());
                                        }
                                    } catch (Throwable th4) {
                                        try {
                                            kicVarM14322a2.close();
                                            break;
                                        } catch (Throwable th5) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                                        }
                                        throw th4;
                                    }
                                } catch (Throwable th6) {
                                    synchronized (khfVar2) {
                                        kir kirVarM14363b4 = kir.m14363b(kexVarM14856h2);
                                        kirVarM14363b4.f36200f = Boolean.valueOf(khfVar2.m14263e(khfVar2.f36013a, kexVarM14856h2));
                                        kirVarM14363b4.f36201g = Boolean.valueOf(khfVar2.m14262d(khfVar2.f36013a, kexVarM14856h2));
                                        kirVarM14363b4.f36202h = Boolean.valueOf(khfVar2.m14264f(khfVar2.f36013a, kexVarM14856h2));
                                        khfVar2.m14261c(kirVarM14363b4.m14365d());
                                        throw th6;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    synchronized (obj) {
                        if (!((kgp) obj).f35943d) {
                            ((kgp) obj).f35945f = false;
                            return;
                        }
                    }
                }
                break;
            case 7:
                Object obj2 = this.f35344a;
                synchronized (kig.f36145a) {
                    ((kig) obj2).f36146b = true;
                    break;
                }
                ((kig) obj2).m14328b();
                return;
            case 8:
                Object obj3 = this.f35344a;
                synchronized (kig.f36145a) {
                    ((kig) obj3).f36147c = true;
                    break;
                }
                ((kig) obj3).m14328b();
                return;
            case 9:
                Object obj4 = this.f35344a;
                synchronized (kig.f36145a) {
                    if (!((kig) obj4).f36148d) {
                        ((kig) obj4).f36146b = true;
                        z2 = true;
                    }
                    break;
                }
                if (z2) {
                    ((kig) obj4).m14328b();
                    return;
                }
                return;
            case 10:
                this.f35344a.close();
                return;
            case 11:
                kjm kjmVar = (kjm) this.f35344a;
                if (!kjmVar.f36275d.m14438g() || (kjlVar = kjmVar.f36281j) == null) {
                    return;
                }
                kjlVar.m14376e(kjmVar.m14378a(kjmVar.f36279h, kjmVar.f36280i));
                return;
            case 12:
                ((jvb) this.f35344a).close();
                return;
            case 13:
                Iterator it = this.f35344a.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((kiz) it.next()).f36229d.iterator();
                    while (it2.hasNext()) {
                        ((kfv) it2.next()).mo5455ba(null);
                    }
                }
                return;
            case 14:
                Iterator it3 = ((kiz) this.f35344a).f36229d.iterator();
                while (it3.hasNext()) {
                    ((kfv) it3.next()).mo5455ba(null);
                }
                return;
            case 15:
                this.f35344a.close();
                return;
            case 16:
                ((kkw) this.f35344a).m14469a();
                return;
            case 17:
                Object obj5 = this.f35344a;
                while (true) {
                    kkw kkwVar = (kkw) obj5;
                    klc klcVar = (klc) kkwVar.f36424i.poll();
                    if (klcVar == null) {
                        if (z2) {
                            kkwVar.m14469a();
                            return;
                        }
                        return;
                    } else {
                        synchronized (obj5) {
                            if (((kkw) obj5).f36425j) {
                                klcVar.mo14465k(null);
                            } else {
                                ((kkw) obj5).f36423h.add(klcVar);
                                z2 = true;
                            }
                        }
                    }
                }
                break;
            case 18:
                Object obj6 = this.f35344a;
                knu knuVar = (knu) obj6;
                synchronized (knuVar.f36652c.f36653a) {
                    ((knu) obj6).f36652c.f36655c.remove(obj6);
                    ((knu) obj6).f36652c.mo14607d();
                    break;
                }
                knuVar.f36652c.m14608e();
                return;
            case 19:
                ((kqs) this.f35344a).m14722f();
                return;
            default:
                if (((kup) this.f35344a).getStatus() != AsyncTask.Status.FINISHED) {
                    ((kup) this.f35344a).cancel(true);
                    ((kup) this.f35344a).m14902a(15, 15);
                    return;
                }
                return;
        }
    }
}
