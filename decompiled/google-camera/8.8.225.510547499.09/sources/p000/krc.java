package p000;

import android.net.Uri;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class krc implements kqc {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f36988a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    private final int f36989b;

    /* JADX INFO: renamed from: c */
    private final kro f36990c;

    /* JADX INFO: renamed from: d */
    private final krb f36991d;

    /* JADX INFO: renamed from: e */
    private final kqd f36992e;

    /* JADX INFO: renamed from: f */
    private final long f36993f;

    /* JADX INFO: renamed from: g */
    private final long f36994g;

    /* JADX INFO: renamed from: h */
    private final long f36995h;

    /* JADX INFO: renamed from: i */
    private final krm f36996i;

    /* JADX INFO: renamed from: j */
    private final String f36997j;

    /* JADX INFO: renamed from: k */
    private final String f36998k;

    /* JADX INFO: renamed from: l */
    private final String f36999l;

    /* JADX INFO: renamed from: m */
    private final krj f37000m;

    /* JADX INFO: renamed from: n */
    private final kbz f37001n;

    /* JADX INFO: renamed from: o */
    private final kbo f37002o;

    /* JADX INFO: renamed from: p */
    private boolean f37003p;

    /* JADX INFO: renamed from: q */
    private String f37004q = "";

    /* JADX INFO: renamed from: r */
    private krl f37005r;

    /* JADX INFO: renamed from: s */
    private final nqf f37006s;

    /* JADX INFO: renamed from: t */
    private final int f37007t;

    /* JADX INFO: renamed from: u */
    private final lhz f37008u;

    public krc(kro kroVar, lhz lhzVar, krj krjVar, krb krbVar, long j, long j2, long j3, String str, int i, krm krmVar, String str2, String str3, kbz kbzVar, kbo kboVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String strM15011d = kxk.m15011d(str3);
        lku.m15669w(krmVar.m14773c(strM15011d == null ? "" : strM15011d));
        this.f36990c = kroVar;
        this.f37008u = lhzVar;
        this.f36991d = krbVar;
        this.f36993f = j;
        this.f36994g = j2;
        this.f36995h = j3;
        this.f36996i = krmVar;
        this.f37007t = i;
        this.f36997j = str2;
        this.f36998k = str3;
        this.f36999l = str;
        this.f37005r = null;
        this.f37001n = kbzVar;
        this.f37000m = krjVar;
        this.f37006s = nqf.m17621g();
        kqd kqdVar = new kqd();
        kqdVar.f36830c = "";
        krp krpVar = krp.f37069a;
        if (krpVar == null) {
            throw new NullPointerException("Null metadata");
        }
        kqdVar.f36831d = krpVar;
        kqdVar.f36828a = j3;
        kqdVar.f36829b = j2;
        kqdVar.f36833f = (byte) 3;
        this.f36992e = kqdVar;
        this.f36989b = f36988a.incrementAndGet();
        this.f37002o = kboVar.mo6314a("MediaFile");
    }

    /* JADX INFO: renamed from: l */
    private final krl m14739l() {
        this.f37001n.mo13961e(String.valueOf(toString()).concat("-create"));
        lhz lhzVar = this.f37008u;
        long j = this.f36993f;
        long j2 = this.f36994g;
        String str = this.f36999l;
        long j3 = this.f36995h;
        String str2 = this.f37004q;
        if (str2 == null) {
            throw new NullPointerException("Null tag");
        }
        String str3 = this.f36998k;
        if (str3 == null) {
            throw new NullPointerException("Null extension");
        }
        kre kreVar = new kre(j, j2, j3, j2, str, str2, str3);
        String str4 = ((kqv) lhzVar.f38277a).f36959d + kreVar.f37023a + "_" + kreVar.f37024b + "_" + kreVar.f37025c;
        krm krmVar = this.f36996i;
        String str5 = this.f36997j;
        String str6 = this.f36998k;
        String strM15011d = kxk.m15011d(str6);
        if (strM15011d == null) {
            strM15011d = "";
        }
        krl krlVarMo14748a = this.f36990c.mo14748a(krt.m14783a(krmVar, str5, str4, str6, strM15011d), this.f37000m);
        this.f37001n.mo13962f();
        return krlVarMo14748a;
    }

    @Override // p000.kqc
    /* JADX INFO: renamed from: a */
    public final synchronized long mo14681a() {
        krl krlVar = this.f37005r;
        if (krlVar == null) {
            return -1L;
        }
        return krlVar.mo14760a();
    }

    @Override // p000.kqc
    /* JADX INFO: renamed from: b */
    public final Uri mo14682b() {
        krl krlVar = this.f37005r;
        return krlVar == null ? Uri.EMPTY : krlVar.mo14767h();
    }

    @Override // p000.kqc
    /* JADX INFO: renamed from: c */
    public final nps mo14683c() {
        return kxk.m14966L(this.f37006s);
    }

    @Override // p000.kqc
    /* JADX INFO: renamed from: d */
    public final synchronized FileInputStream mo14684d() {
        FileInputStream fileInputStreamB;
        lku.m15616K(!this.f37003p, "Cannot open an input stream after %s has been published or abandoned.", this);
        this.f37001n.mo13961e(toString().concat(KMNlNMe.jfvbwvg));
        if (this.f37005r == null) {
            this.f37005r = m14739l();
        }
        try {
            fileInputStreamB = this.f37005r.mo14761b();
            this.f37002o.mo13944f(toString() + " opened " + fileInputStreamB.toString() + ": " + String.valueOf(this.f37005r.mo14768i()));
            this.f37001n.mo13962f();
            nqf nqfVar = this.f37006s;
            krl krlVar = this.f37005r;
            krlVar.getClass();
            nqfVar.mo14894e(krlVar.mo14767h());
        } catch (Throwable th) {
            this.f37001n.mo13962f();
            throw th;
        }
        return fileInputStreamB;
    }

    @Override // p000.kqc
    /* JADX INFO: renamed from: e */
    public final synchronized FileOutputStream mo14685e() {
        FileOutputStream fileOutputStreamC;
        lku.m15616K(!this.f37003p, "Cannot open an output stream after %s has been published or abandoned.", this);
        this.f37001n.mo13961e(toString().concat("#openOutputStream"));
        if (this.f37005r == null) {
            this.f37005r = m14739l();
        }
        try {
            fileOutputStreamC = this.f37005r.mo14762c();
            this.f37002o.mo13944f(toString() + " opened " + fileOutputStreamC.toString() + ": " + String.valueOf(this.f37005r.mo14768i()));
            this.f37001n.mo13962f();
            nqf nqfVar = this.f37006s;
            krl krlVar = this.f37005r;
            krlVar.getClass();
            nqfVar.mo14894e(krlVar.mo14767h());
        } catch (Throwable th) {
            this.f37001n.mo13962f();
            nqf nqfVar2 = this.f37006s;
            krl krlVar2 = this.f37005r;
            krlVar2.getClass();
            nqfVar2.mo14894e(krlVar2.mo14767h());
            throw th;
        }
        return fileOutputStreamC;
    }

    @Override // p000.kqc
    /* JADX INFO: renamed from: f */
    public final synchronized void mo14686f() {
        synchronized (this) {
            if (this.f37003p) {
                return;
            }
            this.f37003p = true;
            this.f37002o.mo13944f(toString().concat(" Abandoned"));
            this.f36991d.mo14720d(this);
        }
    }

    @Override // p000.kqc
    /* JADX INFO: renamed from: g */
    public final void mo14687g() {
        synchronized (this) {
            if (this.f37003p) {
                return;
            }
            this.f37003p = true;
            kqd kqdVar = this.f36992e;
            krl krlVar = this.f37005r;
            krlVar.getClass();
            kqdVar.f36832e = krlVar;
            this.f37002o.mo13944f(toString().concat(" Published, but will be visible to other apps after the MediaGroup is also published)."));
            this.f36991d.mo14721e(this);
        }
    }

    @Override // p000.kqc
    /* JADX INFO: renamed from: h */
    public final void mo14688h(String str) {
        lku.m15616K(!this.f37003p, "Cannot set tag after %s has been published or abandoned.", this);
        this.f37004q = str;
        this.f36992e.f36830c = str;
    }

    @Override // p000.kqc
    /* JADX INFO: renamed from: i */
    public final synchronized void mo14689i() {
        lku.m15616K(!this.f37003p, "Cannot create new file after %s has been published or abandoned.", this);
        if (this.f37005r == null) {
            this.f37001n.mo13961e(toString().concat("#touch"));
            krl krlVarM14739l = m14739l();
            this.f37005r = krlVarM14739l;
            try {
                krlVarM14739l.mo14763d();
                this.f37002o.mo13944f(toString() + " created: " + String.valueOf(this.f37005r.mo14768i()));
                this.f37001n.mo13962f();
                nqf nqfVar = this.f37006s;
                krl krlVar = this.f37005r;
                krlVar.getClass();
                nqfVar.mo14894e(krlVar.mo14767h());
            } catch (Throwable th) {
                this.f37001n.mo13962f();
                nqf nqfVar2 = this.f37006s;
                krl krlVar2 = this.f37005r;
                krlVar2.getClass();
                nqfVar2.mo14894e(krlVar2.mo14767h());
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    final synchronized kqe m14740j() {
        kqd kqdVar;
        String str;
        krp krpVar;
        krl krlVar;
        lku.m15616K(this.f37003p, "Cannot be invoked until %s is published or abandoned.", this);
        kqdVar = this.f36992e;
        if (kqdVar.f36833f == 3 && (str = kqdVar.f36830c) != null && (krpVar = kqdVar.f36831d) != null && (krlVar = kqdVar.f36832e) != null) {
        }
        StringBuilder sb = new StringBuilder();
        if ((kqdVar.f36833f & 1) == 0) {
            sb.append(IuyLAqNmW.pgU);
        }
        if ((kqdVar.f36833f & 2) == 0) {
            sb.append(" utcTimestampMs");
        }
        if (kqdVar.f36830c == null) {
            sb.append(" tag");
        }
        if (kqdVar.f36831d == null) {
            sb.append(" metadata");
        }
        if (kqdVar.f36832e == null) {
            sb.append(" fileObject");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        return new kqe(kqdVar.f36828a, kqdVar.f36829b, str, krpVar, krlVar);
    }

    /* JADX INFO: renamed from: k */
    final synchronized krl m14741k() {
        lku.m15616K(this.f37003p, "Cannot be invoked until %s is published or abandoned.", this);
        return this.f37005r;
    }

    public final String toString() {
        String str;
        String str2;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f36989b);
        int i = this.f37007t;
        if (i == 1) {
            str2 = "";
        } else {
            switch (i) {
                case 2:
                    str = "PRIVATE";
                    break;
                default:
                    str = "CACHE";
                    break;
            }
            str2 = " (" + str + ")";
        }
        objArr[1] = str2;
        return String.format(locale, "MediaFile-%s%s", objArr);
    }
}
