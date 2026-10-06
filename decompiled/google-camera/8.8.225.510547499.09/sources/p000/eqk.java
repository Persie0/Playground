package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eqk {

    /* JADX INFO: renamed from: a */
    public static final nbh f15177a = nbh.m17259h("com/google/android/apps/camera/lasagna/MotionBlurPslSession");

    /* JADX INFO: renamed from: d */
    public final drj f15180d;

    /* JADX INFO: renamed from: e */
    private final int f15181e;

    /* JADX INFO: renamed from: g */
    private eqj f15183g;

    /* JADX INFO: renamed from: h */
    private gon f15184h;

    /* JADX INFO: renamed from: i */
    private nqf f15185i;

    /* JADX INFO: renamed from: f */
    private final List f15182f = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f15178b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f15179c = false;

    public eqk(drj drjVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f15181e = i;
        this.f15180d = drjVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized nps m7688a() {
        nqf nqfVar;
        this.f15179c = true;
        this.f15185i = nqf.m17621g();
        nqfVar = this.f15185i;
        this.f15183g = new eqj(this, nqfVar);
        return nqfVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7689b() {
        this.f15179c = false;
        nqf nqfVar = this.f15185i;
        if (nqfVar != null) {
            nqfVar.mo14894e(false);
        }
        if (!this.f15178b.isEmpty()) {
            for (ntv ntvVar : this.f15178b) {
                String.format("Closing cached filtered frame %s.", Long.valueOf(ntvVar.f44591b.m4953c()));
                ntvVar.f44593d.run();
            }
        }
        for (key keyVar : this.f15182f) {
            String.format("Closing unfiltered frame %s.", keyVar.mo7041b());
            keyVar.close();
        }
        this.f15182f.clear();
        eqj eqjVar = this.f15183g;
        if (eqjVar != null) {
            eqjVar.f15175b = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7690c(float f, float f2, long j) {
        String.format("Capturing PSL frames for %s seconds at %s fps starting at %s", Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j));
        this.f15184h = new gon(j, f, f2, this.f15183g);
        String.format("Filtering %s cached frames", Integer.valueOf(this.f15182f.size()));
        for (key keyVar : this.f15182f) {
            gon gonVar = this.f15184h;
            gonVar.getClass();
            gonVar.m9583a(keyVar);
        }
        this.f15182f.clear();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7691d(eqt eqtVar) {
        String.format("Capture in progress: %s", Boolean.valueOf(this.f15179c));
        if (this.f15178b.isEmpty()) {
            ((nbe) ((nbe) f15177a.m17252c()).mo17276G(1846)).mo17291p("[shot-%s] Filtered cache is empty", this.f15181e);
        } else {
            String.format("Processing %s cached frames", Integer.valueOf(this.f15178b.size()));
            Iterator it = this.f15178b.iterator();
            while (it.hasNext()) {
                eqtVar.mo7612b((ntv) it.next());
            }
            this.f15178b.clear();
        }
        if (!this.f15179c) {
            eqtVar.mo7613d(false);
        } else {
            synchronized (this) {
                this.f15183g.f15175b = eqtVar;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m7692e(key keyVar) {
        key keyVarMo7040a;
        try {
            String.format("Received PSL frame %s", keyVar.mo7041b());
            if (this.f15179c && (keyVarMo7040a = keyVar.mo7040a()) != null) {
                if (this.f15184h == null) {
                    String.format("Caching unfiltered frame %s", keyVar.mo7041b());
                    this.f15182f.add(keyVarMo7040a);
                } else {
                    String.format("filtering frame: %s", keyVar.mo7041b());
                    gon gonVar = this.f15184h;
                    gonVar.getClass();
                    gonVar.m9583a(keyVarMo7040a);
                }
            }
            keyVar.close();
        } catch (Throwable th) {
            keyVar.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m7693f() {
        if (this.f15179c) {
            m7689b();
            return true;
        }
        String.format("Capture was done already, keeping %s unfiltered and %s filtered frames.", Integer.valueOf(this.f15182f.size()), Integer.valueOf(this.f15178b.size()));
        return false;
    }
}
