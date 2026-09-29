package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i46 implements hy2 {

    /* JADX INFO: renamed from: A */
    public long f43485A;

    /* JADX INFO: renamed from: B */
    public jy2 f43486B;

    /* JADX INFO: renamed from: C */
    public h46[] f43487C;

    /* JADX INFO: renamed from: D */
    public long[][] f43488D;

    /* JADX INFO: renamed from: E */
    public int f43489E;

    /* JADX INFO: renamed from: F */
    public k36 f43490F;

    /* JADX INFO: renamed from: a */
    public final bn9 f43491a;

    /* JADX INFO: renamed from: b */
    public final int f43492b;

    /* JADX INFO: renamed from: c */
    public final boolean f43493c;

    /* JADX INFO: renamed from: d */
    public final k47 f43494d;

    /* JADX INFO: renamed from: e */
    public final k47 f43495e;

    /* JADX INFO: renamed from: f */
    public final k47 f43496f;

    /* JADX INFO: renamed from: g */
    public final k47 f43497g;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f43498h;

    /* JADX INFO: renamed from: i */
    public final yt8 f43499i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f43500j;

    /* JADX INFO: renamed from: k */
    public ImmutableList f43501k;

    /* JADX INFO: renamed from: l */
    public int f43502l;

    /* JADX INFO: renamed from: m */
    public int f43503m;

    /* JADX INFO: renamed from: n */
    public long f43504n;

    /* JADX INFO: renamed from: o */
    public int f43505o;

    /* JADX INFO: renamed from: p */
    public k47 f43506p;

    /* JADX INFO: renamed from: q */
    public int f43507q;

    /* JADX INFO: renamed from: r */
    public int f43508r;

    /* JADX INFO: renamed from: s */
    public int f43509s;

    /* JADX INFO: renamed from: t */
    public int f43510t;

    /* JADX INFO: renamed from: u */
    public boolean f43511u;

    /* JADX INFO: renamed from: v */
    public boolean f43512v;

    /* JADX INFO: renamed from: w */
    public boolean f43513w;

    /* JADX INFO: renamed from: x */
    public long f43514x;

    /* JADX INFO: renamed from: y */
    public boolean f43515y;

    /* JADX INFO: renamed from: z */
    public boolean f43516z;

    public i46(bn9 bn9Var, int i) {
        this.f43491a = bn9Var;
        this.f43492b = i;
        this.f43493c = (i & 256) != 0;
        this.f43501k = ImmutableList.m6289v();
        this.f43502l = (i & 4) != 0 ? 3 : 0;
        this.f43499i = new yt8();
        this.f43500j = new ArrayList();
        this.f43497g = new k47(16);
        this.f43498h = new ArrayDeque();
        this.f43494d = new k47(zuc.f72211a);
        this.f43495e = new k47(6);
        this.f43496f = new k47();
        this.f43507q = -1;
        this.f43486B = jy2.f46384t;
        this.f43487C = new h46[0];
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0573  */
    /* JADX WARN: Code duplicated, block: B:274:0x057f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        char c2;
        boolean z;
        boolean z2;
        e46 e46Var;
        if (!this.f43493c || !this.f43516z) {
            while (true) {
                int i5 = this.f43502l;
                ArrayDeque arrayDeque = this.f43498h;
                int i6 = this.f43492b;
                k47 k47Var = this.f43496f;
                int i7 = 4;
                int i8 = 0;
                int i9 = 2;
                if (i5 == 0) {
                    int i10 = this.f43505o;
                    k47 k47Var2 = this.f43497g;
                    if (i10 == 0) {
                        if (iy2Var.mo13074a(k47Var2.f46700a, 0, 8, true)) {
                            this.f43505o = 8;
                            k47Var2.m14818M(0);
                            this.f43504n = k47Var2.m14807B();
                            this.f43503m = k47Var2.m14829m();
                        } else if (this.f43489E == 2 && (i6 & 2) != 0) {
                            n8a n8aVarMo2555n = this.f43486B.mo2555n(0, 4);
                            k36 k36Var = this.f43490F;
                            ey5 ey5Var = k36Var == null ? null : new ey5(k36Var);
                            lc3 lc3Var = new lc3();
                            lc3Var.f49450k = ey5Var;
                            n8aVarMo2555n.mo2537g(new C0713b(lc3Var));
                            this.f43486B.mo2551j();
                            this.f43486B.mo2558q(new h60(-9223372036854775807L));
                            return -1;
                        }
                    }
                    long j = this.f43504n;
                    if (j == 1) {
                        iy2Var.readFully(k47Var2.f46700a, 8, 8);
                        this.f43505o += 8;
                        this.f43504n = k47Var2.m14811F();
                    } else if (j == 0) {
                        long length = iy2Var.getLength();
                        if (length == -1 && (e46Var = (e46) arrayDeque.peek()) != null) {
                            length = e46Var.f36699c;
                        }
                        if (length != -1) {
                            this.f43504n = (length - iy2Var.getPosition()) + ((long) this.f43505o);
                        }
                    }
                    long j2 = this.f43504n;
                    int i11 = this.f43505o;
                    long j3 = i11;
                    if (j2 < j3) {
                        if (this.f43503m != 1718773093 || i11 != 8) {
                            throw ParserException.m2517b("Atom size less than header length (unsupported).");
                        }
                        this.f43504n = j3;
                    }
                    int i12 = this.f43503m;
                    if (i12 == 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1701082227 || i12 == 1835365473 || i12 == 1635284069) {
                        long position = iy2Var.getPosition();
                        long j4 = this.f43504n;
                        long j5 = this.f43505o;
                        long j6 = (position + j4) - j5;
                        if (j4 != j5 && this.f43503m == 1835365473) {
                            k47Var.m14815J(8);
                            iy2Var.mo13085o(k47Var.f46700a, 0, 8);
                            ai0.m422a(k47Var);
                            iy2Var.mo13082k(k47Var.f46701b);
                            iy2Var.mo13080i();
                        }
                        arrayDeque.push(new e46(this.f43503m, j6));
                        if (this.f43504n == this.f43505o) {
                            m13653g(j6);
                        } else {
                            this.f43502l = 0;
                            this.f43505o = 0;
                        }
                    } else if (i12 == 1835296868 || i12 == 1836476516 || i12 == 1751411826 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1937011571 || i12 == 1668576371 || i12 == 1701606260 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1953196132 || i12 == 1718909296 || i12 == 1969517665 || i12 == 1801812339 || i12 == 1768715124) {
                        bna.m3987z(i11 == 8);
                        bna.m3987z(this.f43504n <= 2147483647L);
                        k47 k47Var3 = new k47((int) this.f43504n);
                        System.arraycopy(k47Var2.f46700a, 0, k47Var3.f46700a, 0, 8);
                        this.f43506p = k47Var3;
                        this.f43502l = 1;
                    } else {
                        long position2 = iy2Var.getPosition();
                        long j7 = this.f43505o;
                        long j8 = position2 - j7;
                        if (this.f43503m == 1836086884) {
                            this.f43490F = new k36(0L, j8, -9223372036854775807L, j8 + j7, this.f43504n - j7);
                        }
                        this.f43506p = null;
                        this.f43502l = 1;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                uk9.m22770c();
                                return 0;
                            }
                            yt8 yt8Var = this.f43499i;
                            ArrayList arrayList = yt8Var.f70447a;
                            int i13 = yt8Var.f70448b;
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    short s = 2817;
                                    int i14 = 8;
                                    short s2 = 2192;
                                    if (i13 == 2) {
                                        long length2 = iy2Var.getLength();
                                        int i15 = yt8Var.f70449c - 20;
                                        k47 k47Var4 = new k47(i15);
                                        iy2Var.readFully(k47Var4.f46700a, 0, i15);
                                        int i16 = 0;
                                        while (i16 < i15 / 12) {
                                            k47Var4.m14819N(i9);
                                            k47Var4.m14822f(i9);
                                            byte[] bArr = k47Var4.f46700a;
                                            int i17 = k47Var4.f46701b;
                                            int i18 = i9;
                                            int i19 = i17 + 1;
                                            k47Var4.f46701b = i19;
                                            int i20 = bArr[i17] & 255;
                                            k47Var4.f46701b = i17 + 2;
                                            short s3 = (short) (i20 | ((bArr[i19] & 255) << 8));
                                            if (s3 != s2 && s3 != 2816 && s3 != s) {
                                                if (s3 != 2819 && s3 != 2820) {
                                                    k47Var4.m14819N(i14);
                                                }
                                                i16++;
                                                i15 = i15;
                                                i9 = i18;
                                                s = 2817;
                                                s2 = 2192;
                                                i14 = 8;
                                            }
                                            arrayList.add(new xt8(k47Var4.m14831o(), (length2 - ((long) yt8Var.f70449c)) - ((long) k47Var4.m14831o())));
                                            i16++;
                                            i15 = i15;
                                            i9 = i18;
                                            s = 2817;
                                            s2 = 2192;
                                            i14 = 8;
                                        }
                                        if (arrayList.isEmpty()) {
                                            n63Var.f52394a = 0L;
                                        } else {
                                            yt8Var.f70448b = 3;
                                            n63Var.f52394a = ((xt8) arrayList.get(0)).f68772a;
                                        }
                                    } else {
                                        if (i13 != 3) {
                                            uk9.m22770c();
                                            return 0;
                                        }
                                        long position3 = iy2Var.getPosition();
                                        int length3 = (int) ((iy2Var.getLength() - iy2Var.getPosition()) - ((long) yt8Var.f70449c));
                                        k47 k47Var5 = new k47(length3);
                                        iy2Var.readFully(k47Var5.f46700a, 0, length3);
                                        int i21 = 0;
                                        while (i21 < arrayList.size()) {
                                            xt8 xt8Var = (xt8) arrayList.get(i21);
                                            int i22 = i8;
                                            k47Var5.m14818M((int) (xt8Var.f68772a - position3));
                                            k47Var5.m14819N(i7);
                                            int iM14831o = k47Var5.m14831o();
                                            Charset charset = StandardCharsets.UTF_8;
                                            int i23 = i22;
                                            String strM14840x = k47Var5.m14840x(iM14831o, charset);
                                            switch (strM14840x.hashCode()) {
                                                case -1711564334:
                                                    if (!strM14840x.equals("SlowMotion_Data")) {
                                                        i4 = -1;
                                                    } else {
                                                        i4 = i23;
                                                    }
                                                    break;
                                                case -1332107749:
                                                    if (!strM14840x.equals("Super_SlowMotion_Edit_Data")) {
                                                        i4 = -1;
                                                    } else {
                                                        i4 = 1;
                                                    }
                                                    break;
                                                case -1251387154:
                                                    if (!strM14840x.equals("Super_SlowMotion_Data")) {
                                                        i4 = -1;
                                                    } else {
                                                        i4 = 2;
                                                    }
                                                    break;
                                                case -830665521:
                                                    if (!strM14840x.equals("Super_SlowMotion_Deflickering_On")) {
                                                        i4 = -1;
                                                    } else {
                                                        i4 = 3;
                                                    }
                                                    break;
                                                case 1760745220:
                                                    if (!strM14840x.equals("Super_SlowMotion_BGM")) {
                                                        i4 = -1;
                                                    } else {
                                                        i4 = 4;
                                                    }
                                                    break;
                                                default:
                                                    i4 = -1;
                                                    break;
                                            }
                                            switch (i4) {
                                                case 0:
                                                    c2 = 2192;
                                                    break;
                                                case 1:
                                                    c2 = 2819;
                                                    break;
                                                case 2:
                                                    c2 = 2816;
                                                    break;
                                                case 3:
                                                    c2 = 2820;
                                                    break;
                                                case 4:
                                                    c2 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m2516a(null, "Invalid SEF name");
                                            }
                                            int i24 = xt8Var.f68773b - (iM14831o + 8);
                                            if (c2 == 2192) {
                                                ArrayList arrayList2 = new ArrayList();
                                                List listM15174e = yt8.f70446e.m15174e(k47Var5.m14840x(i24, charset));
                                                int i25 = i23;
                                                while (i25 < listM15174e.size()) {
                                                    List listM15174e2 = yt8.f70445d.m15174e((CharSequence) listM15174e.get(i25));
                                                    if (listM15174e2.size() != 3) {
                                                        throw ParserException.m2516a(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new gb9(1 << (Integer.parseInt((String) listM15174e2.get(2)) - 1), Long.parseLong((String) listM15174e2.get(i23)), Long.parseLong((String) listM15174e2.get(1))));
                                                        i25++;
                                                        i23 = 0;
                                                    } catch (NumberFormatException e) {
                                                        throw ParserException.m2516a(e, null);
                                                    }
                                                }
                                                this.f43500j.add(new hb9(arrayList2));
                                            } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                                uk9.m22770c();
                                                return i23;
                                            }
                                            i21++;
                                            i8 = 0;
                                            i7 = 4;
                                        }
                                        n63Var.f52394a = 0L;
                                    }
                                } else {
                                    k47 k47Var6 = new k47(8);
                                    iy2Var.readFully(k47Var6.f46700a, 0, 8);
                                    yt8Var.f70449c = k47Var6.m14831o() + 8;
                                    if (k47Var6.m14829m() != 1397048916) {
                                        n63Var.f52394a = 0L;
                                    } else {
                                        n63Var.f52394a = iy2Var.getPosition() - ((long) (yt8Var.f70449c - 12));
                                        yt8Var.f70448b = 2;
                                    }
                                }
                                i3 = 1;
                            } else {
                                long length4 = iy2Var.getLength();
                                n63Var.f52394a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                                i3 = 1;
                                yt8Var.f70448b = 1;
                            }
                            if (n63Var.f52394a != 0) {
                                return i3;
                            }
                            this.f43502l = 0;
                            this.f43505o = 0;
                            return i3;
                        }
                        long position4 = iy2Var.getPosition();
                        if (this.f43507q == -1) {
                            int i26 = 0;
                            int i27 = -1;
                            int i28 = -1;
                            boolean z3 = true;
                            boolean z4 = true;
                            long j9 = Long.MAX_VALUE;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            while (true) {
                                h46[] h46VarArr = this.f43487C;
                                if (i26 >= h46VarArr.length) {
                                    break;
                                }
                                h46 h46Var = h46VarArr[i26];
                                int i29 = h46Var.f41780e;
                                o8a o8aVar = h46Var.f41777b;
                                if (i29 != o8aVar.f54016b) {
                                    long j12 = o8aVar.f54017c[i29];
                                    long[][] jArr = this.f43488D;
                                    jArr.getClass();
                                    long j13 = jArr[i26][i29];
                                    long j14 = j12 - position4;
                                    boolean z5 = j14 < 0 || j14 >= 262144;
                                    if ((!z5 && z4) || (z5 == z4 && j14 < j11)) {
                                        j10 = j13;
                                        i28 = i26;
                                        z4 = z5;
                                        j11 = j14;
                                    }
                                    if (j13 < j9) {
                                        j9 = j13;
                                        i27 = i26;
                                        z3 = z5;
                                    }
                                }
                                i26++;
                            }
                            if (j9 == Long.MAX_VALUE || !z3 || j10 < j9 + 10485760) {
                                i27 = i28;
                            }
                            this.f43507q = i27;
                            if (i27 == -1) {
                                return -1;
                            }
                        }
                        h46 h46Var2 = this.f43487C[this.f43507q];
                        n8a n8aVar = h46Var2.f41778c;
                        o8a o8aVar2 = h46Var2.f41777b;
                        g8a g8aVar = h46Var2.f41776a;
                        int i30 = h46Var2.f41780e;
                        long[] jArr2 = o8aVar2.f54017c;
                        int[] iArr = o8aVar2.f54018d;
                        long j15 = jArr2[i30] + this.f43485A;
                        int i31 = iArr[i30];
                        ica icaVar = h46Var2.f41779d;
                        long j16 = (j15 - position4) + ((long) this.f43508r);
                        if (j16 < 0 || j16 >= 262144) {
                            n63Var.f52394a = j15;
                            return 1;
                        }
                        int i32 = g8aVar.f40398h;
                        int i33 = g8aVar.f40401k;
                        C0713b c0713b = g8aVar.f40397g;
                        if (i32 == 1) {
                            j16 += 8;
                            i31 -= 8;
                        }
                        iy2Var.mo13082k((int) j16);
                        String str = c0713b.f6406o;
                        String str2 = c0713b.f6406o;
                        if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i6 & 128) == 0 : (i6 & 32) == 0) {
                            c = 1;
                            this.f43511u = true;
                        } else {
                            c = 1;
                        }
                        if (i33 == 0) {
                            if ("audio/ac4".equals(str2)) {
                                if (this.f43509s == 0) {
                                    wx1.m24195d(i31, k47Var);
                                    n8aVar.mo2535e(7, k47Var);
                                    this.f43509s += 7;
                                }
                                i31 += 7;
                            } else if (h46Var2.f41781f != null && Objects.equals(str2, "audio/mpeg")) {
                                C0713b c0713b2 = h46Var2.f41781f;
                                k47Var.m14815J(4);
                                iy2Var.mo13085o(k47Var.f46700a, 0, 4);
                                iy2Var.mo13080i();
                                m46 m46Var = new m46();
                                n8a n8aVar2 = h46Var2.f41778c;
                                if (m46Var.m16621a(k47Var.m14829m()) && !Objects.equals(c0713b2.f6406o, (String) m46Var.f50579g)) {
                                    lc3 lc3VarM2520a = c0713b2.m2520a();
                                    String str3 = (String) m46Var.f50579g;
                                    str3.getClass();
                                    lc3VarM2520a.f49453n = ez5.m11402l(str3);
                                    c0713b2 = new C0713b(lc3VarM2520a);
                                }
                                n8aVar2.mo2537g(c0713b2);
                                h46Var2.f41781f = null;
                            } else if (icaVar != null) {
                                icaVar.m13764c(iy2Var);
                            }
                            while (true) {
                                int i34 = this.f43509s;
                                if (i34 >= i31) {
                                    break;
                                }
                                int iMo2533c = n8aVar.mo2533c(iy2Var, i31 - i34, false);
                                this.f43508r += iMo2533c;
                                this.f43509s += iMo2533c;
                                this.f43510t -= iMo2533c;
                            }
                        } else {
                            k47 k47Var7 = this.f43495e;
                            byte[] bArr2 = k47Var7.f46700a;
                            bArr2[0] = 0;
                            bArr2[c] = 0;
                            bArr2[2] = 0;
                            int i35 = 4 - i33;
                            i31 += i35;
                            while (this.f43509s < i31) {
                                int i36 = this.f43510t;
                                if (i36 == 0) {
                                    if (this.f43511u || zuc.m25797e(c0713b) + i33 > iArr[i30] - this.f43508r) {
                                        i = i33;
                                        i2 = 0;
                                    } else {
                                        int iM25797e = zuc.m25797e(c0713b);
                                        i = i33 + iM25797e;
                                        i2 = iM25797e;
                                    }
                                    iy2Var.readFully(bArr2, i35, i);
                                    this.f43508r += i;
                                    k47Var7.m14818M(0);
                                    int iM14829m = k47Var7.m14829m();
                                    if (iM14829m < 0) {
                                        throw ParserException.m2516a(null, "Invalid NAL length");
                                    }
                                    this.f43510t = iM14829m - i2;
                                    k47 k47Var8 = this.f43494d;
                                    k47Var8.m14818M(0);
                                    n8aVar.mo2535e(4, k47Var8);
                                    this.f43509s += 4;
                                    if (i2 > 0) {
                                        n8aVar.mo2535e(i2, k47Var7);
                                        this.f43509s += i2;
                                        if (zuc.m25796d(bArr2, i2, c0713b)) {
                                            this.f43511u = true;
                                        }
                                    }
                                } else {
                                    int iMo2533c2 = n8aVar.mo2533c(iy2Var, i36, false);
                                    this.f43508r += iMo2533c2;
                                    this.f43509s += iMo2533c2;
                                    this.f43510t -= iMo2533c2;
                                }
                            }
                        }
                        int i37 = i31;
                        long j17 = o8aVar2.f54020f[i30];
                        int i38 = o8aVar2.f54021g[i30];
                        if (!this.f43511u) {
                            i38 |= 67108864;
                        }
                        int i39 = i38;
                        if (icaVar != null) {
                            icaVar.m13763b(n8aVar, j17, i39, i37, 0, null);
                            if (i30 + 1 == o8aVar2.f54016b) {
                                icaVar.m13762a(n8aVar, null);
                            }
                        } else {
                            n8aVar.mo2531a(j17, i39, i37, 0, null);
                        }
                        h46Var2.f41780e++;
                        this.f43507q = -1;
                        this.f43508r = 0;
                        this.f43509s = 0;
                        this.f43510t = 0;
                        this.f43511u = false;
                        return 0;
                    }
                    long j18 = this.f43504n - ((long) this.f43505o);
                    long position5 = iy2Var.getPosition() + j18;
                    k47 k47Var9 = this.f43506p;
                    if (k47Var9 != null) {
                        iy2Var.readFully(k47Var9.f46700a, this.f43505o, (int) j18);
                        if (this.f43503m == 1718909296) {
                            this.f43512v = true;
                            k47Var9.m14818M(8);
                            int iM14829m2 = k47Var9.m14829m();
                            int i40 = iM14829m2 != 1751476579 ? iM14829m2 != 1903435808 ? 0 : 1 : 2;
                            if (i40 == 0) {
                                k47Var9.m14819N(4);
                                do {
                                    if (k47Var9.m14820a() <= 0) {
                                        i40 = 0;
                                        break;
                                    }
                                    int iM14829m3 = k47Var9.m14829m();
                                    i40 = iM14829m3 != 1751476579 ? iM14829m3 != 1903435808 ? 0 : 1 : 2;
                                } while (i40 == 0);
                            }
                            this.f43489E = i40;
                        } else if (!arrayDeque.isEmpty()) {
                            ((e46) arrayDeque.peek()).f36700d.add(new f46(this.f43503m, k47Var9));
                        }
                    } else {
                        if (!this.f43512v && this.f43503m == 1835295092) {
                            this.f43489E = 1;
                        }
                        if (j18 < 262144) {
                            iy2Var.mo13082k((int) j18);
                        } else {
                            n63Var.f52394a = iy2Var.getPosition() + j18;
                            z = true;
                        }
                        m13653g(position5);
                        if (this.f43513w) {
                            this.f43515y = true;
                            n63Var.f52394a = this.f43514x;
                            this.f43513w = false;
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (z2 && this.f43502l != 2) {
                            return 1;
                        }
                    }
                    z = false;
                    m13653g(position5);
                    if (this.f43513w) {
                        this.f43515y = true;
                        n63Var.f52394a = this.f43514x;
                        this.f43513w = false;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        continue;
                    }
                }
            }
        }
        return -1;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        fd9 fd9VarM22973e = uwc.m22973e(iy2Var, false, (this.f43492b & 2) != 0);
        this.f43501k = fd9VarM22973e != null ? ImmutableList.m6291y(fd9VarM22973e) : ImmutableList.m6289v();
        return fd9VarM22973e == null;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        this.f43498h.clear();
        this.f43505o = 0;
        this.f43507q = -1;
        this.f43508r = 0;
        this.f43509s = 0;
        this.f43510t = 0;
        this.f43511u = false;
        this.f43516z = false;
        if (j == 0) {
            if (this.f43502l != 3) {
                this.f43502l = 0;
                this.f43505o = 0;
                return;
            } else {
                yt8 yt8Var = this.f43499i;
                yt8Var.f70447a.clear();
                yt8Var.f70448b = 0;
                this.f43500j.clear();
                return;
            }
        }
        for (h46 h46Var : this.f43487C) {
            o8a o8aVar = h46Var.f41777b;
            int iM17854a = o8aVar.m17854a(j2);
            if (iM17854a == -1) {
                iM17854a = o8aVar.m17855b(j2);
            }
            h46Var.f41780e = iM17854a;
            ica icaVar = h46Var.f41779d;
            if (icaVar != null) {
                icaVar.f43940b = false;
                icaVar.f43941c = 0;
            }
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: e */
    public final List mo13551e() {
        return this.f43501k;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        if ((this.f43492b & 16) == 0) {
            jy2Var = new nc0(jy2Var, this.f43491a);
        }
        this.f43486B = jy2Var;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0309  */
    /* JADX WARN: Code duplicated, block: B:163:0x0319  */
    /* JADX WARN: Code duplicated, block: B:172:0x0334  */
    /* JADX WARN: Code duplicated, block: B:174:0x033a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0355  */
    /* JADX WARN: Code duplicated, block: B:179:0x035e  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:262:0x0134 A[EDGE_INSN: B:262:0x0134->B:74:0x0134 BREAK  A[LOOP:9: B:62:0x0102->B:72:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c A[LOOP:9: B:62:0x0102->B:72:0x012c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m13653g(long j) {
        int i;
        ArrayList arrayList;
        ey5 ey5VarM427f;
        boolean z;
        ArrayDeque arrayDeque;
        boolean z2;
        ey5 ey5VarM432k;
        long[][] jArr;
        int i2;
        String str;
        ey5 ey5Var;
        int i3;
        long j2;
        int i4;
        int i5;
        int i6;
        ey5 ey5Var2;
        ArrayList arrayList2;
        ey5 ey5Var3;
        ey5 ey5Var4;
        ey5 ey5Var5;
        int i7;
        int i8;
        int i9;
        dy5 dy5Var;
        dy5 dy5Var2;
        dy5 dy5Var3;
        int i10;
        while (true) {
            ArrayDeque arrayDeque2 = this.f43498h;
            int i11 = 0;
            if (arrayDeque2.isEmpty() || ((e46) arrayDeque2.peek()).f36699c != j) {
                break;
            }
            e46 e46Var = (e46) arrayDeque2.pop();
            if (e46Var.f8576b == 1836019574) {
                e46 e46VarM10844k = e46Var.m10844k(1835365473);
                ArrayList arrayList3 = new ArrayList();
                boolean z3 = this.f43493c;
                long j3 = 0;
                int i12 = this.f43492b;
                if (e46VarM10844k != null) {
                    ey5VarM427f = ai0.m427f(e46VarM10844k);
                    if (this.f43515y) {
                        ey5VarM427f.getClass();
                        dy5[] dy5VarArr = ey5VarM427f.f38074a;
                        int length = dy5VarArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                dy5Var2 = null;
                                break;
                            }
                            dy5 dy5Var4 = dy5VarArr[i13];
                            if (at5.class.isAssignableFrom(dy5Var4.getClass())) {
                                dy5Var2 = (dy5) at5.class.cast(dy5Var4);
                                if (!((at5) dy5Var2).f7466a.equals("auxiliary.tracks.interleaved")) {
                                    dy5Var2 = null;
                                }
                            } else {
                                dy5Var2 = null;
                            }
                            if (dy5Var2 != null) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        at5 at5Var = (at5) dy5Var2;
                        if (at5Var != null && at5Var.f7467b[0] == 0) {
                            this.f43485A = this.f43514x + 16;
                        }
                        int length2 = dy5VarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                dy5Var3 = null;
                                break;
                            }
                            dy5 dy5Var5 = dy5VarArr[i14];
                            if (at5.class.isAssignableFrom(dy5Var5.getClass())) {
                                dy5Var3 = (dy5) at5.class.cast(dy5Var5);
                                if (!((at5) dy5Var3).f7466a.equals("auxiliary.tracks.map")) {
                                    dy5Var3 = null;
                                }
                            } else {
                                dy5Var3 = null;
                            }
                            if (dy5Var3 != null) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        at5 at5Var2 = (at5) dy5Var3;
                        at5Var2.getClass();
                        ArrayList arrayListM3033d = at5Var2.m3033d();
                        ArrayList arrayList4 = new ArrayList(arrayListM3033d.size());
                        for (int i15 = 0; i15 < arrayListM3033d.size(); i15++) {
                            int iIntValue = ((Integer) arrayListM3033d.get(i15)).intValue();
                            if (iIntValue == 0) {
                                i10 = 1;
                            } else if (iIntValue != 1) {
                                i10 = 3;
                                if (iIntValue != 2) {
                                    i10 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i10 = 2;
                            }
                            arrayList4.add(Integer.valueOf(i10));
                        }
                        i = 0;
                        arrayList = arrayList4;
                    } else {
                        if (ey5VarM427f == null || (i12 & 64) == 0) {
                            i = 0;
                        } else {
                            dy5[] dy5VarArr2 = ey5VarM427f.f38074a;
                            int length3 = dy5VarArr2.length;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length3) {
                                    i = i11;
                                    dy5Var = null;
                                    break;
                                }
                                dy5 dy5Var6 = dy5VarArr2[i16];
                                if (at5.class.isAssignableFrom(dy5Var6.getClass())) {
                                    dy5Var = (dy5) at5.class.cast(dy5Var6);
                                    i = i11;
                                    if (!((at5) dy5Var).f7466a.equals("auxiliary.tracks.offset")) {
                                    }
                                    if (dy5Var != null) {
                                        break;
                                    }
                                    i16++;
                                    i11 = i;
                                } else {
                                    i = i11;
                                }
                                dy5Var = null;
                                if (dy5Var != null) {
                                    break;
                                    break;
                                } else {
                                    i16++;
                                    i11 = i;
                                }
                            }
                            at5 at5Var3 = (at5) dy5Var;
                            if (at5Var3 != null) {
                                long jM14811F = new k47(at5Var3.f7467b).m14811F();
                                if (jM14811F > 0) {
                                    this.f43514x = jM14811F;
                                    this.f43513w = true;
                                    arrayDeque = arrayDeque2;
                                    z2 = true;
                                    z = z3;
                                }
                                arrayDeque.clear();
                                this.f43516z = z2;
                                if (this.f43513w && !z) {
                                    this.f43502l = 2;
                                }
                            }
                        }
                        arrayList = arrayList3;
                    }
                } else {
                    i = 0;
                    arrayList = arrayList3;
                    ey5VarM427f = null;
                }
                ArrayList arrayList5 = new ArrayList();
                boolean z4 = this.f43489E == 1 ? 1 : i;
                ak3 ak3Var = new ak3();
                f46 f46VarM10845m = e46Var.m10845m(1969517665);
                if (f46VarM10845m != null) {
                    ey5VarM432k = ai0.m432k(f46VarM10845m);
                    ak3Var.m528b(ey5VarM432k);
                } else {
                    ey5VarM432k = null;
                }
                f46 f46VarM10845m2 = e46Var.m10845m(1836476516);
                f46VarM10845m2.getClass();
                dy5[] dy5VarArr3 = new dy5[1];
                dy5VarArr3[i] = ai0.m428g(f46VarM10845m2.f38414c);
                ey5 ey5Var6 = new ey5(dy5VarArr3);
                ey5 ey5Var7 = ey5VarM432k;
                ArrayList arrayListM431j = ai0.m431j(e46Var, ak3Var, -9223372036854775807L, null, (i12 & 1) != 0 ? 1 : i, z4, new tj0(8), this.f43493c);
                if (this.f43515y) {
                    boolean z5 = arrayList.size() == arrayListM431j.size() ? 1 : i;
                    Locale locale = Locale.US;
                    bna.m3985y(ux5.m22987j(arrayList.size(), arrayListM431j.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")"), z5);
                }
                String strM18202a = opb.m18202a(arrayListM431j);
                int i17 = i;
                int i18 = i17;
                long j4 = -9223372036854775807L;
                int size = -1;
                while (i17 < arrayListM431j.size()) {
                    o8a o8aVar = (o8a) arrayListM431j.get(i17);
                    int i19 = o8aVar.f54016b;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    g8a g8aVar = o8aVar.f54015a;
                    if (i19 == 0) {
                        arrayList = arrayList;
                        str = strM18202a;
                        i3 = i17;
                        i2 = i18;
                        ey5Var4 = ey5Var7;
                        ey5Var5 = ey5Var6;
                        ey5Var = ey5VarM427f;
                    } else {
                        jy2 jy2Var = this.f43486B;
                        i2 = i18 + 1;
                        str = strM18202a;
                        int i20 = g8aVar.f40392b;
                        C0713b c0713b = g8aVar.f40397g;
                        n8a n8aVarMo2555n = jy2Var.mo2555n(i18, i20);
                        h46 h46Var = new h46(g8aVar, o8aVar, n8aVarMo2555n);
                        ey5Var = ey5VarM427f;
                        long j5 = g8aVar.f40395e;
                        if (j5 == -9223372036854775807L) {
                            j5 = o8aVar.f54023i;
                        }
                        n8aVarMo2555n.mo2534d(j5);
                        long jMax = Math.max(j4, j5);
                        String str2 = c0713b.f6406o;
                        String str3 = c0713b.f6406o;
                        boolean zEquals = "audio/true-hd".equals(str2);
                        int i21 = o8aVar.f54019e;
                        int i22 = zEquals ? i21 * 16 : i21 + 30;
                        lc3 lc3VarM2520a = c0713b.m2520a();
                        lc3VarM2520a.f49454o = i22;
                        if (i20 == 2) {
                            int i23 = c0713b.f6397f;
                            if ((i12 & 8) != 0) {
                                i23 |= size == -1 ? 1 : 2;
                            }
                            int i24 = i23;
                            if (this.f43515y) {
                                i9 = i24 | 32768;
                                lc3VarM2520a.f49446g = ((Integer) arrayList.get(i17)).intValue();
                            } else {
                                i9 = i24;
                            }
                            lc3VarM2520a.f49445f = i9;
                        } else {
                            arrayList = arrayList;
                        }
                        long[] jArr2 = o8aVar.f54020f;
                        int[] iArr = o8aVar.f54022h;
                        boolean z6 = o8aVar.f54024j;
                        if (ez5.m11401k(str3)) {
                            int iMin = Math.min(z6 ? o8aVar.f54016b : iArr.length, 20);
                            bna.m3987z(j5 != -9223372036854775807L ? 1 : i);
                            i3 = i17;
                            long jMin = Math.min(j5, 10000000L);
                            int i25 = i;
                            int i26 = i25;
                            int i27 = -1;
                            while (i25 < iMin) {
                                int i28 = z6 ? i25 : iArr[i25];
                                long j6 = jArr2[i28];
                                if (j6 > jMin) {
                                    break;
                                }
                                if (j6 >= 0 && (i5 = o8aVar.f54018d[(i4 = i28)]) > i26) {
                                    i26 = i5;
                                    i27 = i4;
                                }
                                i25++;
                            }
                            if (i27 != -1) {
                                j2 = jArr2[i27];
                            }
                            if (j2 != -9223372036854775807L) {
                                c0a c0aVar = new c0a(j2);
                                i6 = 1;
                                dy5[] dy5VarArr4 = new dy5[1];
                                dy5VarArr4[i] = c0aVar;
                                ey5Var2 = new ey5(dy5VarArr4);
                            } else {
                                i6 = 1;
                                ey5Var2 = null;
                            }
                            if (i20 == i6 && (i7 = ak3Var.f763a) != -1 && (i8 = ak3Var.f764b) != -1) {
                                lc3VarM2520a.f49433I = i7;
                                lc3VarM2520a.f49434J = i8;
                            }
                            ey5 ey5Var8 = c0713b.f6403l;
                            arrayList2 = this.f43500j;
                            if (arrayList2.isEmpty()) {
                                ey5Var3 = null;
                            } else {
                                ey5Var3 = new ey5(arrayList2);
                            }
                            ey5Var4 = ey5Var7;
                            ey5Var5 = ey5Var6;
                            kpb.m15647f(i20, ey5Var, lc3VarM2520a, ey5Var8, ey5Var3, ey5Var4, ey5Var5, ey5Var2);
                            lc3VarM2520a.f49452m = ez5.m11402l(str);
                            if (Objects.equals(str3, "audio/mpeg")) {
                                h46Var.f41781f = new C0713b(lc3VarM2520a);
                            } else {
                                h46Var.f41778c.mo2537g(new C0713b(lc3VarM2520a));
                            }
                            if (i20 == 2 && size == -1) {
                                size = arrayList5.size();
                            }
                            arrayList5.add(h46Var);
                            j4 = jMax;
                        } else {
                            i3 = i17;
                        }
                        j2 = -9223372036854775807L;
                        if (j2 != -9223372036854775807L) {
                            c0a c0aVar2 = new c0a(j2);
                            i6 = 1;
                            dy5[] dy5VarArr5 = new dy5[1];
                            dy5VarArr5[i] = c0aVar2;
                            ey5Var2 = new ey5(dy5VarArr5);
                        } else {
                            i6 = 1;
                            ey5Var2 = null;
                        }
                        if (i20 == i6) {
                            lc3VarM2520a.f49433I = i7;
                            lc3VarM2520a.f49434J = i8;
                        }
                        ey5 ey5Var9 = c0713b.f6403l;
                        arrayList2 = this.f43500j;
                        if (arrayList2.isEmpty()) {
                            ey5Var3 = null;
                        } else {
                            ey5Var3 = new ey5(arrayList2);
                        }
                        ey5Var4 = ey5Var7;
                        ey5Var5 = ey5Var6;
                        kpb.m15647f(i20, ey5Var, lc3VarM2520a, ey5Var9, ey5Var3, ey5Var4, ey5Var5, ey5Var2);
                        lc3VarM2520a.f49452m = ez5.m11402l(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                            h46Var.f41781f = new C0713b(lc3VarM2520a);
                        } else {
                            h46Var.f41778c.mo2537g(new C0713b(lc3VarM2520a));
                        }
                        if (i20 == 2) {
                            size = arrayList5.size();
                        }
                        arrayList5.add(h46Var);
                        j4 = jMax;
                    }
                    ey5Var7 = ey5Var4;
                    ey5Var6 = ey5Var5;
                    ey5VarM427f = ey5Var;
                    arrayDeque2 = arrayDeque3;
                    arrayListM431j = arrayListM431j;
                    i18 = i2;
                    strM18202a = str;
                    z3 = z3;
                    i17 = i3 + 1;
                    arrayList = arrayList;
                }
                arrayDeque = arrayDeque2;
                z = z3;
                boolean z7 = true;
                int i29 = -1;
                h46[] h46VarArr = (h46[]) arrayList5.toArray(new h46[i]);
                this.f43487C = h46VarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[h46VarArr.length][];
                    int[] iArr2 = new int[h46VarArr.length];
                    long[] jArr3 = new long[h46VarArr.length];
                    boolean[] zArr = new boolean[h46VarArr.length];
                    for (int i30 = 0; i30 < h46VarArr.length; i30++) {
                        jArr[i30] = new long[h46VarArr[i30].f41777b.f54016b];
                        jArr3[i30] = h46VarArr[i30].f41777b.f54020f[0];
                    }
                    int i31 = 0;
                    while (i31 < h46VarArr.length) {
                        long j7 = Long.MAX_VALUE;
                        int i32 = i29;
                        for (int i33 = 0; i33 < h46VarArr.length; i33++) {
                            if (!zArr[i33]) {
                                long j8 = jArr3[i33];
                                if (j8 <= j7) {
                                    i32 = i33;
                                    j7 = j8;
                                }
                            }
                        }
                        int i34 = iArr2[i32];
                        long[] jArr4 = jArr[i32];
                        jArr4[i34] = j3;
                        o8a o8aVar2 = h46VarArr[i32].f41777b;
                        boolean z8 = z7;
                        j3 += (long) o8aVar2.f54018d[i34];
                        int i35 = i34 + 1;
                        iArr2[i32] = i35;
                        if (i35 < jArr4.length) {
                            jArr3[i32] = o8aVar2.f54020f[i35];
                        } else {
                            zArr[i32] = z8;
                            i31++;
                        }
                        z7 = z8;
                        i29 = -1;
                    }
                }
                z2 = z7;
                this.f43488D = jArr;
                this.f43486B.mo2551j();
                this.f43486B.mo2558q(new g46(j4, this.f43487C, size));
                arrayDeque.clear();
                this.f43516z = z2;
                if (this.f43513w) {
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((e46) arrayDeque2.peek()).f36701e.add(e46Var);
            }
        }
        if (this.f43502l != 2) {
            this.f43502l = 0;
            this.f43505o = 0;
        }
    }
}
