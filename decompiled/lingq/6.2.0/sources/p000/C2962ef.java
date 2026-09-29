package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: ef */
/* JADX INFO: loaded from: classes2.dex */
public final class C2962ef implements hy2 {

    /* JADX INFO: renamed from: q */
    public static final int[] f37139q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: r */
    public static final int[] f37140r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s */
    public static final byte[] f37141s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f37142t;

    /* JADX INFO: renamed from: b */
    public final ug2 f37144b;

    /* JADX INFO: renamed from: c */
    public boolean f37145c;

    /* JADX INFO: renamed from: d */
    public long f37146d;

    /* JADX INFO: renamed from: e */
    public int f37147e;

    /* JADX INFO: renamed from: f */
    public int f37148f;

    /* JADX INFO: renamed from: h */
    public int f37150h;

    /* JADX INFO: renamed from: i */
    public long f37151i;

    /* JADX INFO: renamed from: j */
    public jy2 f37152j;

    /* JADX INFO: renamed from: k */
    public n8a f37153k;

    /* JADX INFO: renamed from: l */
    public n8a f37154l;

    /* JADX INFO: renamed from: m */
    public st8 f37155m;

    /* JADX INFO: renamed from: n */
    public boolean f37156n;

    /* JADX INFO: renamed from: o */
    public long f37157o;

    /* JADX INFO: renamed from: p */
    public boolean f37158p;

    /* JADX INFO: renamed from: a */
    public final byte[] f37143a = new byte[1];

    /* JADX INFO: renamed from: g */
    public int f37149g = -1;

    static {
        String str = uma.f64080a;
        Charset charset = StandardCharsets.UTF_8;
        f37141s = "#!AMR\n".getBytes(charset);
        f37142t = "#!AMR-WB\n".getBytes(charset);
    }

    public C2962ef() {
        ug2 ug2Var = new ug2();
        this.f37144b = ug2Var;
        this.f37154l = ug2Var;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        int iMo2533c;
        int i;
        this.f37153k.getClass();
        String str = uma.f64080a;
        if (iy2Var.getPosition() == 0 && !m11086h(iy2Var)) {
            throw ParserException.m2516a(null, "Could not find AMR header.");
        }
        if (!this.f37158p) {
            this.f37158p = true;
            boolean z = this.f37145c;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? 16000 : 8000;
            int i3 = z ? f37140r[8] : f37139q[7];
            n8a n8aVar = this.f37153k;
            lc3 lc3Var = new lc3();
            lc3Var.f49452m = ez5.m11402l(str2);
            lc3Var.f49453n = ez5.m11402l(str3);
            lc3Var.f49454o = i3;
            lc3Var.f49430F = 1;
            lc3Var.f49431G = i2;
            n8aVar.mo2537g(new C0713b(lc3Var));
        }
        int i4 = 0;
        if (this.f37148f == 0) {
            try {
                int iM11085g = m11085g(iy2Var);
                this.f37147e = iM11085g;
                this.f37148f = iM11085g;
                if (this.f37149g == -1) {
                    iy2Var.getPosition();
                    this.f37149g = this.f37147e;
                }
                if (this.f37149g == this.f37147e) {
                    this.f37150h++;
                }
                st8 st8Var = this.f37155m;
                if (st8Var instanceof p34) {
                    p34 p34Var = (p34) st8Var;
                    long j = this.f37151i + this.f37146d + 20000;
                    long position = iy2Var.getPosition() + ((long) this.f37147e);
                    ztb ztbVar = p34Var.f55516b;
                    int i5 = ztbVar.f72161b;
                    if (i5 == 0 || j - ztbVar.m25782d(i5 - 1) >= 100000) {
                        p34Var.m18880i(j, position);
                    }
                    if (this.f37156n && Math.abs(this.f37157o - j) < 20000) {
                        this.f37156n = false;
                        this.f37154l = this.f37153k;
                    }
                }
                iMo2533c = this.f37154l.mo2533c(iy2Var, this.f37148f, true);
                if (iMo2533c == -1) {
                    i4 = -1;
                } else {
                    i = this.f37148f - iMo2533c;
                    this.f37148f = i;
                    if (i <= 0) {
                        this.f37154l.mo2531a(this.f37151i + this.f37146d, 1, this.f37147e, 0, null);
                        this.f37146d += 20000;
                    }
                }
            } catch (EOFException unused) {
            }
        } else {
            iMo2533c = this.f37154l.mo2533c(iy2Var, this.f37148f, true);
            if (iMo2533c == -1) {
                i4 = -1;
            } else {
                i = this.f37148f - iMo2533c;
                this.f37148f = i;
                if (i <= 0) {
                    this.f37154l.mo2531a(this.f37151i + this.f37146d, 1, this.f37147e, 0, null);
                    this.f37146d += 20000;
                }
            }
        }
        iy2Var.getLength();
        if (this.f37155m == null) {
            h60 h60Var = new h60(-9223372036854775807L);
            this.f37155m = h60Var;
            this.f37152j.mo2558q(h60Var);
        }
        if (i4 == -1) {
            st8 st8Var2 = this.f37155m;
            if (st8Var2 instanceof p34) {
                long j2 = this.f37151i + this.f37146d;
                ((p34) st8Var2).f55517c = j2;
                this.f37152j.mo2558q(st8Var2);
                this.f37153k.mo2534d(j2);
            }
        }
        return i4;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        return m11086h(iy2Var);
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        this.f37146d = 0L;
        this.f37147e = 0;
        this.f37148f = 0;
        this.f37157o = j2;
        st8 st8Var = this.f37155m;
        if (!(st8Var instanceof p34)) {
            if (j == 0 || !(st8Var instanceof xi1)) {
                this.f37151i = 0L;
                return;
            } else {
                xi1 xi1Var = (xi1) st8Var;
                this.f37151i = (Math.max(0L, j - xi1Var.f68234b) * 8000000) / ((long) xi1Var.f68237e);
                return;
            }
        }
        p34 p34Var = (p34) st8Var;
        ztb ztbVar = p34Var.f55516b;
        long jM25782d = ztbVar.f72161b == 0 ? -9223372036854775807L : ztbVar.m25782d(uma.m22807b(p34Var.f55515a, j));
        this.f37151i = jM25782d;
        if (Math.abs(this.f37157o - jM25782d) < 20000) {
            return;
        }
        this.f37156n = true;
        this.f37154l = this.f37144b;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f37152j = jy2Var;
        n8a n8aVarMo2555n = jy2Var.mo2555n(0, 1);
        this.f37153k = n8aVarMo2555n;
        this.f37154l = n8aVarMo2555n;
        jy2Var.mo2551j();
    }

    /* JADX INFO: renamed from: g */
    public final int m11085g(iy2 iy2Var) throws ParserException {
        boolean z;
        iy2Var.mo13080i();
        byte[] bArr = this.f37143a;
        iy2Var.mo13085o(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.m2516a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f37145c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f37140r[i] : f37139q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f37145c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.m2516a(null, sb.toString());
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11086h(iy2 iy2Var) {
        iy2Var.mo13080i();
        byte[] bArr = f37141s;
        byte[] bArr2 = new byte[bArr.length];
        iy2Var.mo13085o(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f37145c = false;
            iy2Var.mo13082k(bArr.length);
            return true;
        }
        iy2Var.mo13080i();
        byte[] bArr3 = f37142t;
        byte[] bArr4 = new byte[bArr3.length];
        iy2Var.mo13085o(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f37145c = true;
        iy2Var.mo13082k(bArr3.length);
        return true;
    }
}
