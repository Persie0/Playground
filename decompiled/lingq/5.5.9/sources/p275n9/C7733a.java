package p275n9;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p261m9.C7503d;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: n9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7733a implements InterfaceC7507h {

    /* JADX INFO: renamed from: q */
    public static final int[] f42301q;

    /* JADX INFO: renamed from: t */
    public static final int f42304t;

    /* JADX INFO: renamed from: a */
    public final byte[] f42305a;

    /* JADX INFO: renamed from: b */
    public final int f42306b;

    /* JADX INFO: renamed from: c */
    public boolean f42307c;

    /* JADX INFO: renamed from: d */
    public long f42308d;

    /* JADX INFO: renamed from: e */
    public int f42309e;

    /* JADX INFO: renamed from: f */
    public int f42310f;

    /* JADX INFO: renamed from: g */
    public boolean f42311g;

    /* JADX INFO: renamed from: h */
    public long f42312h;

    /* JADX INFO: renamed from: i */
    public int f42313i;

    /* JADX INFO: renamed from: j */
    public int f42314j;

    /* JADX INFO: renamed from: k */
    public long f42315k;

    /* JADX INFO: renamed from: l */
    public InterfaceC7509j f42316l;

    /* JADX INFO: renamed from: m */
    public InterfaceC7522w f42317m;

    /* JADX INFO: renamed from: n */
    public InterfaceC7520u f42318n;

    /* JADX INFO: renamed from: o */
    public boolean f42319o;

    /* JADX INFO: renamed from: p */
    public static final int[] f42300p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: r */
    public static final byte[] f42302r = C10134c0.m19018C("#!AMR\n");

    /* JADX INFO: renamed from: s */
    public static final byte[] f42303s = C10134c0.m19018C("#!AMR-WB\n");

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f42301q = iArr;
        f42304t = iArr[8];
    }

    public C7733a(int i10) {
        this.f42306b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f42305a = new byte[1];
        this.f42313i = -1;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final int m15325a(C7504e c7504e) throws IOException {
        boolean z10 = false;
        c7504e.f41479f = 0;
        byte[] bArr = this.f42305a;
        c7504e.mo14994c(bArr, 0, 1, false);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw ParserException.m6770a("Invalid padding bits for frame header " + ((int) b10), null);
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15) {
            boolean z11 = this.f42307c;
            if (z11 && (i10 < 10 || i10 > 13)) {
                z10 = true;
            } else {
                if (!z11 && (i10 < 12 || i10 > 14)) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            return this.f42307c ? f42301q[i10] : f42300p[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f42307c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ParserException.m6770a(sb2.toString(), null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15326b(C7504e c7504e) throws IOException {
        c7504e.f41479f = 0;
        byte[] bArr = f42302r;
        byte[] bArr2 = new byte[bArr.length];
        c7504e.mo14994c(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f42307c = false;
            c7504e.mo14998j(bArr.length);
            return true;
        }
        c7504e.f41479f = 0;
        byte[] bArr3 = f42303s;
        byte[] bArr4 = new byte[bArr3.length];
        c7504e.mo14994c(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f42307c = true;
        c7504e.mo14998j(bArr3.length);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        int i10;
        int i11;
        int iM15022d;
        int i12;
        C10129a.m18993e(this.f42317m);
        int i13 = C10134c0.f51354a;
        C7504e c7504e = (C7504e) interfaceC7508i;
        if (c7504e.f41477d == 0 && !m15326b(c7504e)) {
            throw ParserException.m6770a("Could not find AMR header.", null);
        }
        if (!this.f42319o) {
            this.f42319o = true;
            boolean z10 = this.f42307c;
            String str = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i14 = z10 ? 16000 : 8000;
            InterfaceC7522w interfaceC7522w = this.f42317m;
            C2416m.a aVar = new C2416m.a();
            aVar.f12501k = str;
            aVar.f12502l = f42304t;
            aVar.f12514x = 1;
            aVar.f12515y = i14;
            interfaceC7522w.mo7388f(new C2416m(aVar));
        }
        if (this.f42310f == 0) {
            try {
                int iM15325a = m15325a((C7504e) interfaceC7508i);
                this.f42309e = iM15325a;
                this.f42310f = iM15325a;
                if (this.f42313i == -1) {
                    this.f42312h = c7504e.f41477d;
                    this.f42313i = iM15325a;
                }
                if (this.f42313i == iM15325a) {
                    this.f42314j++;
                }
                iM15022d = this.f42317m.m15022d(interfaceC7508i, this.f42310f, true);
                if (iM15022d == -1) {
                    i10 = -1;
                } else {
                    i12 = this.f42310f - iM15022d;
                    this.f42310f = i12;
                    if (i12 <= 0) {
                        this.f42317m.mo7387e(this.f42315k + this.f42308d, 1, this.f42309e, 0, null);
                        this.f42308d += 20000;
                    }
                    i10 = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iM15022d = this.f42317m.m15022d(interfaceC7508i, this.f42310f, true);
            if (iM15022d == -1) {
                i10 = -1;
            } else {
                i12 = this.f42310f - iM15022d;
                this.f42310f = i12;
                if (i12 <= 0) {
                    this.f42317m.mo7387e(this.f42315k + this.f42308d, 1, this.f42309e, 0, null);
                    this.f42308d += 20000;
                }
                i10 = 0;
            }
        }
        long j10 = c7504e.f41476c;
        if (!this.f42311g) {
            int i15 = this.f42306b;
            if ((i15 & 1) == 0 || j10 == -1 || !((i11 = this.f42313i) == -1 || i11 == this.f42309e)) {
                InterfaceC7520u.b bVar = new InterfaceC7520u.b(-9223372036854775807L);
                this.f42318n = bVar;
                this.f42316l.mo7364c(bVar);
                this.f42311g = true;
            } else if (this.f42314j >= 20 || i10 == -1) {
                C7503d c7503d = new C7503d((int) (((((long) i11) * 8) * 1000000) / 20000), i11, j10, this.f42312h, (i15 & 2) != 0);
                this.f42318n = c7503d;
                this.f42316l.mo7364c(c7503d);
                this.f42311g = true;
            }
        }
        return i10;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        this.f42308d = 0L;
        this.f42309e = 0;
        this.f42310f = 0;
        if (j10 != 0) {
            InterfaceC7520u interfaceC7520u = this.f42318n;
            if (interfaceC7520u instanceof C7503d) {
                C7503d c7503d = (C7503d) interfaceC7520u;
                this.f42315k = ((Math.max(0L, j10 - c7503d.f41468b) * 8) * 1000000) / ((long) c7503d.f41471e);
                return;
            }
        }
        this.f42315k = 0L;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f42316l = interfaceC7509j;
        this.f42317m = interfaceC7509j.mo7366q(0, 1);
        interfaceC7509j.mo7365i();
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        return m15326b((C7504e) interfaceC7508i);
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
