package p000;

import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.googlex.gcam.Gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnx implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f22813a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22814b;

    public /* synthetic */ fnx(FastMomentsHdrImpl fastMomentsHdrImpl, int i) {
        this.f22814b = i;
        this.f22813a = fastMomentsHdrImpl;
    }

    public fnx(fno fnoVar, int i, byte[] bArr) {
        this.f22814b = i;
        this.f22813a = fnoVar;
    }

    public fnx(fno fnoVar, int i, char[] cArr) {
        this.f22814b = i;
        this.f22813a = fnoVar;
    }

    public /* synthetic */ fnx(foy foyVar, int i) {
        this.f22814b = i;
        this.f22813a = foyVar;
    }

    public /* synthetic */ fnx(fpf fpfVar, int i) {
        this.f22814b = i;
        this.f22813a = fpfVar;
    }

    public /* synthetic */ fnx(fpj fpjVar, int i) {
        this.f22814b = i;
        this.f22813a = fpjVar;
    }

    public /* synthetic */ fnx(fpo fpoVar, int i) {
        this.f22814b = i;
        this.f22813a = fpoVar;
    }

    public /* synthetic */ fnx(frx frxVar, int i) {
        this.f22814b = i;
        this.f22813a = frxVar;
    }

    public /* synthetic */ fnx(fsd fsdVar, int i) {
        this.f22814b = i;
        this.f22813a = fsdVar;
    }

    public /* synthetic */ fnx(fsh fshVar, int i) {
        this.f22814b = i;
        this.f22813a = fshVar;
    }

    public /* synthetic */ fnx(fsi fsiVar, int i) {
        this.f22814b = i;
        this.f22813a = fsiVar;
    }

    public fnx(fvn fvnVar, int i) {
        this.f22814b = i;
        this.f22813a = fvnVar;
    }

    public /* synthetic */ fnx(fvs fvsVar, int i) {
        this.f22814b = i;
        this.f22813a = fvsVar;
    }

    public fnx(Exception exc, int i) {
        this.f22814b = i;
        this.f22813a = exc;
    }

    public /* synthetic */ fnx(kpw kpwVar, int i) {
        this.f22814b = i;
        this.f22813a = kpwVar;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [fsd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kba] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22814b) {
            case 0:
                ((foc) ((fno) this.f22813a).f22795a).m8620x();
                return;
            case 1:
                ((foc) ((fno) this.f22813a).f22795a).m8611B();
                return;
            case 2:
                ((foy) this.f22813a).f22978b.m5246r(4);
                return;
            case 3:
                ((fpf) this.f22813a).m8660w(6);
                return;
            case 4:
                ((fpf) this.f22813a).m8660w(11);
                return;
            case 5:
                fpj fpjVar = (fpj) this.f22813a;
                fpjVar.f23084d.m5369j(true);
                fpjVar.m8664x();
                return;
            case 6:
                Object obj = this.f22813a;
                synchronized (((fpj) obj).f23085e) {
                    if (!((fpj) obj).f23088h) {
                        ((fpj) obj).m8663w();
                    }
                    ((fpj) obj).f23083c.m5241m();
                    break;
                }
                return;
            case 7:
                fpo fpoVar = (fpo) this.f22813a;
                fpp fppVar = fpoVar.f23117a;
                idb idbVar = fppVar.f23123f;
                if (idbVar != null) {
                    fppVar.f23119b.mo7482d(idbVar);
                    fpoVar.f23117a.f23122e.m16860e();
                    return;
                }
                return;
            case 8:
                FastMomentsHdrImpl fastMomentsHdrImpl = (FastMomentsHdrImpl) this.f22813a;
                fastMomentsHdrImpl.initializeProcessingQueueNative(fastMomentsHdrImpl.f6816b, Gcam.m4971a(fastMomentsHdrImpl.f6817c));
                return;
            case 9:
                ((frx) this.f22813a).m8740j();
                return;
            case 10:
                this.f22813a.mo8766b();
                return;
            case 11:
                Object obj2 = this.f22813a;
                synchronized (obj2) {
                    int i = ((frx) obj2).f23383g - 1;
                    ((frx) obj2).f23383g = i;
                    lku.m15613H(i >= 0);
                    ((frx) obj2).m8741k();
                    break;
                }
                return;
            case 12:
                Object obj3 = this.f22813a;
                synchronized (obj3) {
                    ((frx) obj3).f23383g++;
                    break;
                }
                return;
            case 13:
                Object obj4 = this.f22813a;
                synchronized (obj4) {
                    ((frx) obj4).f23379c = false;
                    ((frx) obj4).m8741k();
                    break;
                }
                return;
            case 14:
                Object obj5 = this.f22813a;
                synchronized (obj5) {
                    try {
                        ((fsi) obj5).f23462c.signalEndOfInputStream();
                    } catch (Throwable th) {
                        ((fsi) obj5).f23464e.mo13943e("Error sending codec EOS signal", th);
                    }
                    break;
                }
                return;
            case 15:
                Object obj6 = this.f22813a;
                synchronized (((fsh) obj6).f23459a) {
                    fsi fsiVar = ((fsh) obj6).f23459a;
                    fsiVar.f23466g = true;
                    fsiVar.m8778c();
                    break;
                }
                return;
            case 16:
                nps npsVar = ((fvn) this.f22813a).f23650c;
                if (npsVar != null && !npsVar.isDone()) {
                    ((fvn) this.f22813a).f23650c.cancel(false);
                    ((fvn) this.f22813a).f23650c = null;
                }
                ((fvn) this.f22813a).f23652e.m8839d();
                ((fvn) this.f22813a).f23649b.close();
                return;
            case 17:
                ((fvs) this.f22813a).m8840e();
                return;
            case 18:
                throw new RuntimeException((Throwable) this.f22813a);
            case 19:
                this.f22813a.close();
                return;
            default:
                throw new RuntimeException((Throwable) this.f22813a);
        }
    }
}
