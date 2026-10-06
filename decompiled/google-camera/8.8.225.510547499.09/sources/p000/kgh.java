package p000;

import android.view.Surface;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgh {

    /* JADX INFO: renamed from: a */
    public int f35884a;

    /* JADX INFO: renamed from: b */
    public byte f35885b;

    /* JADX INFO: renamed from: c */
    public int f35886c;

    /* JADX INFO: renamed from: d */
    private kgj f35887d;

    /* JADX INFO: renamed from: e */
    private mrm f35888e;

    /* JADX INFO: renamed from: f */
    private mrm f35889f;

    /* JADX INFO: renamed from: g */
    private kbc f35890g;

    /* JADX INFO: renamed from: h */
    private int f35891h;

    /* JADX INFO: renamed from: i */
    private int f35892i;

    /* JADX INFO: renamed from: j */
    private mrm f35893j;

    /* JADX INFO: renamed from: k */
    private mrm f35894k;

    /* JADX INFO: renamed from: l */
    private boolean f35895l;

    /* JADX INFO: renamed from: m */
    private boolean f35896m;

    /* JADX INFO: renamed from: n */
    private long f35897n;

    /* JADX INFO: renamed from: o */
    private boolean f35898o;

    public kgh() {
    }

    public kgh(byte[] bArr) {
        mqu mquVar = mqu.f41450a;
        this.f35888e = mquVar;
        this.f35889f = mquVar;
        this.f35893j = mquVar;
        this.f35894k = mquVar;
    }

    /* JADX INFO: renamed from: a */
    public final kgi m14196a() {
        kgj kgjVar;
        kbc kbcVar;
        if (this.f35885b == 127 && (kgjVar = this.f35887d) != null && (kbcVar = this.f35890g) != null && this.f35886c != 0) {
            kgi kgiVar = new kgi(kgjVar, this.f35888e, this.f35889f, kbcVar, this.f35891h, this.f35892i, this.f35893j, this.f35894k, this.f35895l, this.f35896m, this.f35884a, this.f35897n, this.f35898o);
            int i = kgiVar.f35904f;
            boolean z = i > 0 || i == -1;
            lku.m15614I(z, "Capacity should be positive or -1");
            lku.m15614I(kgiVar.f35902d.m13905b() > 0, hIAHJKEnGsNbz.xCvpjuCPGpIGWRe);
            lku.m15614I(kgiVar.f35903e >= 0, "Format must be valid");
            lku.m15614I(kgiVar.f35899a != null, "StreamType cannot be null");
            lku.m15614I(kgiVar.f35902d != null, KMNlNMe.scbjSjDsKUTW);
            lku.m15614I(kgiVar.f35909k <= kgiVar.f35904f, "pre-alloc size must be equal or smaller than the capacity");
            lku.m15614I(true, "Set pre-alloc type if you set pre-alloc size.");
            return kgiVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f35887d == null) {
            sb.append(" type");
        }
        if (this.f35890g == null) {
            sb.append(" size");
        }
        if ((this.f35885b & 1) == 0) {
            sb.append(" imageFormat");
        }
        if ((this.f35885b & 2) == 0) {
            sb.append(" capacity");
        }
        if ((this.f35885b & 4) == 0) {
            sb.append(" forCapture");
        }
        if ((this.f35885b & 8) == 0) {
            sb.append(" ignoreMemoryLimits");
        }
        if (this.f35886c == 0) {
            sb.append(qQLA.ZCH);
        }
        if ((this.f35885b & 16) == 0) {
            sb.append(" preAllocSize");
        }
        if ((this.f35885b & 32) == 0) {
            sb.append(" dynamicRangeProfile");
        }
        if ((this.f35885b & 64) == 0) {
            sb.append(" halMemoryEstimationEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m14197b(kmg kmgVar) {
        this.f35888e = mrm.m16829i(kmgVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m14198c(int i) {
        this.f35892i = i;
        this.f35885b = (byte) (this.f35885b | 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m14199d(long j) {
        this.f35897n = j;
        this.f35885b = (byte) (this.f35885b | 32);
    }

    /* JADX INFO: renamed from: e */
    public final void m14200e(boolean z) {
        this.f35895l = z;
        this.f35885b = (byte) (this.f35885b | 4);
    }

    /* JADX INFO: renamed from: f */
    public final void m14201f(boolean z) {
        this.f35898o = z;
        this.f35885b = (byte) (this.f35885b | 64);
    }

    /* JADX INFO: renamed from: g */
    public final void m14202g(boolean z) {
        this.f35896m = z;
        this.f35885b = (byte) (this.f35885b | 8);
    }

    /* JADX INFO: renamed from: h */
    public final void m14203h(int i) {
        this.f35891h = i;
        this.f35885b = (byte) (this.f35885b | 1);
    }

    /* JADX INFO: renamed from: i */
    public final void m14204i(kbc kbcVar) {
        if (kbcVar == null) {
            throw new NullPointerException("Null size");
        }
        this.f35890g = kbcVar;
    }

    /* JADX INFO: renamed from: j */
    public final void m14205j(Surface surface) {
        this.f35889f = mrm.m16829i(surface);
    }

    /* JADX INFO: renamed from: k */
    public final void m14206k(kgj kgjVar) {
        if (kgjVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f35887d = kgjVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m14207l(long j) {
        this.f35893j = mrm.m16829i(Long.valueOf(j));
    }
}
