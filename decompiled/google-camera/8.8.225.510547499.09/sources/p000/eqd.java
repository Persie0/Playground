package p000;

import android.opengl.EGLExt;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eqd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f15107a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15108b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f15109c;

    public /* synthetic */ eqd(long j, ExecutorService executorService, int i) {
        this.f15109c = i;
        this.f15107a = j;
        this.f15108b = executorService;
    }

    public /* synthetic */ eqd(long j, ntv ntvVar, int i) {
        this.f15109c = i;
        this.f15107a = j;
        this.f15108b = ntvVar;
    }

    public /* synthetic */ eqd(ffl fflVar, long j, int i) {
        this.f15109c = i;
        this.f15108b = fflVar;
        this.f15107a = j;
    }

    public /* synthetic */ eqd(fgg fggVar, long j, int i) {
        this.f15109c = i;
        this.f15108b = fggVar;
        this.f15107a = j;
    }

    public /* synthetic */ eqd(fqj fqjVar, long j, int i) {
        this.f15109c = i;
        this.f15108b = fqjVar;
        this.f15107a = j;
    }

    public /* synthetic */ eqd(fsi fsiVar, long j, int i) {
        this.f15109c = i;
        this.f15108b = fsiVar;
        this.f15107a = j;
    }

    public /* synthetic */ eqd(gdh gdhVar, long j, int i) {
        this.f15109c = i;
        this.f15108b = gdhVar;
        this.f15107a = j;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // java.lang.Runnable
    public final void run() {
        kbz kbzVar;
        switch (this.f15109c) {
            case 0:
                long j = this.f15107a;
                Object obj = this.f15108b;
                ((nbe) ((nbe) eqf.f15113a.m17252c()).mo17276G(1793)).mo17292q("Couldn't submit frame %s.", j);
                ((ntv) obj).f44593d.run();
                return;
            case 1:
                long j2 = this.f15107a;
                ?? r2 = this.f15108b;
                if (System.currentTimeMillis() < System.currentTimeMillis() + 15000) {
                    lbo.m15144a();
                }
                r2.shutdown();
                boolean z = lbo.f37882a;
                lbo.m15144a();
                ArrayList arrayList = new ArrayList();
                synchronized (lbo.f37883b) {
                    for (Map.Entry entry : lbo.f37883b.entrySet()) {
                        if (((lbn) entry.getValue()).f37881a <= j2) {
                            arrayList.add(entry.getKey());
                        }
                    }
                    break;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    lbo.f37883b.remove(arrayList.get(i));
                }
                return;
            case 2:
                ((ffl) this.f15108b).f21657c.mo10855h(System.currentTimeMillis() - this.f15107a);
                return;
            case 3:
                Object obj2 = this.f15108b;
                ffl fflVar = (ffl) obj2;
                fflVar.f21660f.post(new eqd(fflVar, this.f15107a, 2));
                return;
            case 4:
                Object obj3 = this.f15108b;
                long j3 = this.f15107a;
                nbh nbhVar = fgh.f21843a;
                fgg fggVar = (fgg) obj3;
                if (fggVar.f21828h.isDone()) {
                    ((nbe) ((nbe) fgh.f21843a.m17252c()).mo17276G(2201)).mo17298w("Trying to correct timestamp to %d but it was already set as %d", j3, kxk.m14974T(fggVar.f21828h));
                    return;
                } else {
                    long j4 = fggVar.f21825e;
                    fggVar.f21828h.mo14894e(Long.valueOf(j3));
                    return;
                }
            case 5:
                Object obj4 = this.f15108b;
                long j5 = this.f15107a;
                ldi ldiVar = (ldi) ((fqj) obj4).f23228a.mo15164c();
                EGLExt.eglPresentationTimeANDROID(ldiVar.mo15183f(), ldiVar.mo15184g(), j5);
                return;
            case 6:
                ((fsi) this.f15108b).m8779d(this.f15107a);
                return;
            default:
                Object obj5 = this.f15108b;
                long j6 = this.f15107a;
                try {
                    try {
                        ((gdh) obj5).f24299g.mo13961e("waitUntilFrame");
                        fwo fwoVar = ((gdh) obj5).f24296d;
                        long nanos = TimeUnit.MILLISECONDS.toNanos(165L);
                        fwoVar.f23755a.lock();
                        while (fwoVar.f23757c < j6 && nanos > 0) {
                            try {
                                nanos = fwoVar.f23756b.awaitNanos(nanos);
                            } catch (Throwable th) {
                                fwoVar.f23755a.unlock();
                                throw th;
                            }
                        }
                        fwoVar.f23755a.unlock();
                        if (nanos <= 0) {
                            ((nbe) ((nbe) gdh.f24293a.m17251b()).mo17276G(2566)).mo17292q("Timeout waiting for frame %d", j6);
                        }
                        kbzVar = ((gdh) obj5).f24299g;
                    } catch (InterruptedException e) {
                        ((nbe) ((nbe) ((nbe) gdh.f24293a.m17251b()).mo17283h(e)).mo17276G(2567)).mo17292q("Error waiting for frame %d", j6);
                        Thread.currentThread().interrupt();
                        kbzVar = ((gdh) obj5).f24299g;
                    }
                    kbzVar.mo13962f();
                    return;
                } catch (Throwable th2) {
                    ((gdh) obj5).f24299g.mo13962f();
                    throw th2;
                }
        }
    }
}
