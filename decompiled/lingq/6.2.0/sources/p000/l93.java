package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l93 implements hy2 {

    /* JADX INFO: renamed from: a */
    public final k47 f49327a = new k47(4);

    /* JADX INFO: renamed from: b */
    public final k47 f49328b = new k47(9);

    /* JADX INFO: renamed from: c */
    public final k47 f49329c = new k47(11);

    /* JADX INFO: renamed from: d */
    public final k47 f49330d = new k47();

    /* JADX INFO: renamed from: e */
    public final ln8 f49331e;

    /* JADX INFO: renamed from: f */
    public jy2 f49332f;

    /* JADX INFO: renamed from: g */
    public int f49333g;

    /* JADX INFO: renamed from: h */
    public boolean f49334h;

    /* JADX INFO: renamed from: i */
    public long f49335i;

    /* JADX INFO: renamed from: j */
    public int f49336j;

    /* JADX INFO: renamed from: k */
    public int f49337k;

    /* JADX INFO: renamed from: l */
    public int f49338l;

    /* JADX INFO: renamed from: m */
    public long f49339m;

    /* JADX INFO: renamed from: n */
    public boolean f49340n;

    /* JADX INFO: renamed from: o */
    public C3316lz f49341o;

    /* JADX INFO: renamed from: p */
    public msa f49342p;

    public l93() {
        ln8 ln8Var = new ln8(new ug2(), 2);
        ln8Var.f49867c = -9223372036854775807L;
        ln8Var.f49868d = new long[0];
        ln8Var.f49869e = new long[0];
        this.f49331e = ln8Var;
        this.f49333g = 1;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:184:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0187  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c6  */
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        long j3;
        int i2;
        this.f49332f.getClass();
        while (true) {
            int i3 = this.f49333g;
            boolean z3 = true;
            if (i3 == 1) {
                k47 k47Var = this.f49328b;
                if (!iy2Var.mo13074a(k47Var.f46700a, 0, 9, true)) {
                    return -1;
                }
                k47Var.m14818M(0);
                k47Var.m14819N(4);
                int iM14842z = k47Var.m14842z();
                boolean z4 = (iM14842z & 4) != 0;
                boolean z5 = (iM14842z & 1) != 0;
                if (z4 && this.f49341o == null) {
                    i2 = 2;
                    this.f49341o = new C3316lz(this.f49332f.mo2555n(8, 1), 2);
                } else {
                    i2 = 2;
                }
                if (z5 && this.f49342p == null) {
                    this.f49342p = new msa(this.f49332f.mo2555n(9, i2));
                }
                this.f49332f.mo2551j();
                this.f49336j = k47Var.m14829m() - 5;
                this.f49333g = i2;
            } else if (i3 == 2) {
                iy2Var.mo13082k(this.f49336j);
                this.f49336j = 0;
                this.f49333g = 3;
            } else if (i3 == 3) {
                k47 k47Var2 = this.f49329c;
                if (!iy2Var.mo13074a(k47Var2.f46700a, 0, 11, true)) {
                    return -1;
                }
                k47Var2.m14818M(0);
                this.f49337k = k47Var2.m14842z();
                this.f49338l = k47Var2.m14808C();
                this.f49339m = k47Var2.m14808C();
                this.f49339m = (((long) (k47Var2.m14842z() << 24)) | this.f49339m) * 1000;
                k47Var2.m14819N(3);
                this.f49333g = 4;
            } else {
                if (i3 != 4) {
                    uk9.m22770c();
                    return 0;
                }
                boolean z6 = this.f49334h;
                ln8 ln8Var = this.f49331e;
                if (z6) {
                    j = this.f49335i + this.f49339m;
                } else {
                    if (ln8Var.f49867c == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.f49339m;
                    }
                    i = this.f49337k;
                    if (i == 8 || this.f49341o == null) {
                        int i4 = 4;
                        if (i != 9 && this.f49342p != null) {
                            if (!this.f49340n) {
                                this.f49332f.mo2558q(new h60(-9223372036854775807L));
                                this.f49340n = true;
                            }
                            msa msaVar = this.f49342p;
                            k47 k47VarM16031g = m16031g(iy2Var);
                            msaVar.getClass();
                            int iM14842z2 = k47VarM16031g.m14842z();
                            int i5 = (iM14842z2 >> 4) & 15;
                            int i6 = iM14842z2 & 15;
                            if (i6 != 7) {
                                final String strM22988k = ux5.m22988k(i6, "Video format not supported: ");
                                throw new ParserException(strM22988k) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            msaVar.f51814h = i5;
                            if (i5 != 5) {
                                k47 k47Var3 = msaVar.f51809c;
                                n8a n8aVar = (n8a) msaVar.f57375b;
                                k47 k47Var4 = msaVar.f51810d;
                                int iM14842z3 = k47VarM16031g.m14842z();
                                k47VarM16031g.m14822f(3);
                                byte[] bArr = k47VarM16031g.f46700a;
                                int i7 = k47VarM16031g.f46701b;
                                int i8 = i7 + 1;
                                k47VarM16031g.f46701b = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                int i10 = i7 + 2;
                                k47VarM16031g.f46701b = i10;
                                int i11 = ((bArr[i8] & 255) << 8) | i9;
                                k47VarM16031g.f46701b = i7 + 3;
                                long j4 = (((long) (i11 | (bArr[i10] & 255))) * 1000) + j2;
                                if (iM14842z3 != 0 || msaVar.f51812f) {
                                    if (iM14842z3 == 1 && msaVar.f51812f) {
                                        int i12 = msaVar.f51814h == 1 ? 1 : 0;
                                        if (msaVar.f51813g || i12 != 0) {
                                            byte[] bArr2 = k47Var4.f46700a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i13 = 4 - msaVar.f51811e;
                                            int i14 = 0;
                                            while (k47VarM16031g.m14820a() > 0) {
                                                k47VarM16031g.m14827k(k47Var4.f46700a, i13, msaVar.f51811e);
                                                k47Var4.m14818M(0);
                                                int iM14809D = k47Var4.m14809D();
                                                k47Var3.m14818M(0);
                                                n8aVar.mo2535e(i4, k47Var3);
                                                n8aVar.mo2535e(iM14809D, k47VarM16031g);
                                                i14 = i14 + 4 + iM14809D;
                                                i4 = 4;
                                            }
                                            ((n8a) msaVar.f57375b).mo2531a(j4, i12, i14, 0, null);
                                            msaVar.f51813g = true;
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                    z3 = true;
                                } else {
                                    byte[] bArr3 = new byte[k47VarM16031g.m14820a()];
                                    k47 k47Var5 = new k47(bArr3);
                                    k47VarM16031g.m14827k(bArr3, 0, k47VarM16031g.m14820a());
                                    e60 e60VarM10863a = e60.m10863a(k47Var5);
                                    msaVar.f51811e = e60VarM10863a.f36734b;
                                    lc3 lc3Var = new lc3();
                                    lc3Var.f49452m = ez5.m11402l("video/x-flv");
                                    lc3Var.f49453n = ez5.m11402l("video/avc");
                                    lc3Var.f49449j = e60VarM10863a.f36744l;
                                    lc3Var.f49460u = e60VarM10863a.f36735c;
                                    lc3Var.f49461v = e60VarM10863a.f36736d;
                                    lc3Var.f49425A = e60VarM10863a.f36743k;
                                    lc3Var.f49456q = e60VarM10863a.f36733a;
                                    n8aVar.mo2537g(new C0713b(lc3Var));
                                    msaVar.f51812f = true;
                                }
                                z2 = false;
                                if (z2) {
                                }
                                z3 = true;
                            }
                        } else if (i == 18 || this.f49340n) {
                            iy2Var.mo13082k(this.f49338l);
                            z = false;
                            z3 = false;
                        } else {
                            k47 k47VarM16031g2 = m16031g(iy2Var);
                            ln8Var.getClass();
                            if (k47VarM16031g2.m14842z() == 2 && "onMetaData".equals(ln8.m16396k(k47VarM16031g2)) && k47VarM16031g2.m14820a() != 0 && k47VarM16031g2.m14842z() == 8) {
                                HashMap mapM16395j = ln8.m16395j(k47VarM16031g2);
                                Object obj = mapM16395j.get("duration");
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        ln8Var.f49867c = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapM16395j.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        ln8Var.f49868d = new long[size];
                                        ln8Var.f49869e = new long[size];
                                        for (int i15 = 0; i15 < size; i15++) {
                                            Object obj5 = list.get(i15);
                                            Object obj6 = list2.get(i15);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                ln8Var.f49868d = new long[0];
                                                ln8Var.f49869e = new long[0];
                                                break;
                                            }
                                            ln8Var.f49868d[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            ln8Var.f49869e[i15] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j5 = ln8Var.f49867c;
                            if (j5 != -9223372036854775807L) {
                                this.f49332f.mo2558q(new p34(j5, ln8Var.f49869e, ln8Var.f49868d));
                                this.f49340n = true;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!this.f49340n) {
                            this.f49332f.mo2558q(new h60(-9223372036854775807L));
                            this.f49340n = true;
                        }
                        C3316lz c3316lz = this.f49341o;
                        k47 k47VarM16031g3 = m16031g(iy2Var);
                        n8a n8aVar2 = (n8a) c3316lz.f57375b;
                        if (c3316lz.f50323c) {
                            k47VarM16031g3.m14819N(1);
                        } else {
                            int iM14842z4 = k47VarM16031g3.m14842z();
                            int i16 = (iM14842z4 >> 4) & 15;
                            c3316lz.f50325e = i16;
                            if (i16 == 2) {
                                int i17 = C3316lz.f50322f[(iM14842z4 >> 2) & 3];
                                lc3 lc3Var2 = new lc3();
                                lc3Var2.f49452m = ez5.m11402l("video/x-flv");
                                lc3Var2.f49453n = ez5.m11402l("audio/mpeg");
                                lc3Var2.f49430F = 1;
                                lc3Var2.f49431G = i17;
                                n8aVar2.mo2537g(new C0713b(lc3Var2));
                                c3316lz.f50324d = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                lc3 lc3Var3 = new lc3();
                                lc3Var3.f49452m = ez5.m11402l("video/x-flv");
                                lc3Var3.f49453n = ez5.m11402l(str);
                                lc3Var3.f49430F = 1;
                                lc3Var3.f49431G = 8000;
                                n8aVar2.mo2537g(new C0713b(lc3Var3));
                                c3316lz.f50324d = true;
                            } else if (i16 != 10) {
                                final String str2 = "Audio format not supported: " + c3316lz.f50325e;
                                throw new ParserException(str2) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            c3316lz.f50323c = true;
                        }
                        n8a n8aVar3 = (n8a) c3316lz.f57375b;
                        if (c3316lz.f50325e == 2) {
                            int iM14820a = k47VarM16031g3.m14820a();
                            n8aVar3.mo2535e(iM14820a, k47VarM16031g3);
                            ((n8a) c3316lz.f57375b).mo2531a(j2, 1, iM14820a, 0, null);
                        } else {
                            int iM14842z5 = k47VarM16031g3.m14842z();
                            if (iM14842z5 == 0 && !c3316lz.f50324d) {
                                int iM14820a2 = k47VarM16031g3.m14820a();
                                byte[] bArr4 = new byte[iM14820a2];
                                k47VarM16031g3.m14827k(bArr4, 0, iM14820a2);
                                C3354n c3354nM18560f = ox1.m18560f(new so0(iM14820a2, bArr4), false);
                                lc3 lc3Var4 = new lc3();
                                lc3Var4.f49452m = ez5.m11402l("video/x-flv");
                                lc3Var4.f49453n = ez5.m11402l("audio/mp4a-latm");
                                lc3Var4.f49449j = c3354nM18560f.f52092a;
                                lc3Var4.f49430F = c3354nM18560f.f52094c;
                                lc3Var4.f49431G = c3354nM18560f.f52093b;
                                lc3Var4.f49456q = Collections.singletonList(bArr4);
                                n8aVar3.mo2537g(new C0713b(lc3Var4));
                                c3316lz.f50324d = true;
                            } else if (c3316lz.f50325e != 10 || iM14842z5 == 1) {
                                int iM14820a3 = k47VarM16031g3.m14820a();
                                n8aVar3.mo2535e(iM14820a3, k47VarM16031g3);
                                ((n8a) c3316lz.f57375b).mo2531a(j2, 1, iM14820a3, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.f49334h && z) {
                        this.f49334h = true;
                        if (ln8Var.f49867c == -9223372036854775807L) {
                            j3 = -this.f49339m;
                        } else {
                            j3 = 0;
                        }
                        this.f49335i = j3;
                    }
                    this.f49336j = 4;
                    this.f49333g = 2;
                    if (z3) {
                        return 0;
                    }
                }
                j2 = j;
                i = this.f49337k;
                if (i == 8) {
                    int i18 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        iy2Var.mo13082k(this.f49338l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        iy2Var.mo13082k(this.f49338l);
                        z = false;
                        z3 = false;
                    }
                } else {
                    int i19 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        iy2Var.mo13082k(this.f49338l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        iy2Var.mo13082k(this.f49338l);
                        z = false;
                        z3 = false;
                    }
                }
                if (!this.f49334h) {
                    this.f49334h = true;
                    if (ln8Var.f49867c == -9223372036854775807L) {
                        j3 = -this.f49339m;
                    } else {
                        j3 = 0;
                    }
                    this.f49335i = j3;
                }
                this.f49336j = 4;
                this.f49333g = 2;
                if (z3) {
                    return 0;
                }
            }
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) throws EOFException, InterruptedIOException {
        k47 k47Var = this.f49327a;
        h62 h62Var = (h62) iy2Var;
        h62Var.mo13076d(k47Var.f46700a, 0, 3, false);
        k47Var.m14818M(0);
        if (k47Var.m14808C() == 4607062) {
            h62Var.mo13076d(k47Var.f46700a, 0, 2, false);
            k47Var.m14818M(0);
            if ((k47Var.m14812G() & 250) == 0) {
                h62Var.mo13076d(k47Var.f46700a, 0, 4, false);
                k47Var.m14818M(0);
                int iM14829m = k47Var.m14829m();
                h62Var.f41835f = 0;
                h62Var.m13081j(iM14829m, false);
                h62Var.mo13076d(k47Var.f46700a, 0, 4, false);
                k47Var.m14818M(0);
                if (k47Var.m14829m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        if (j == 0) {
            this.f49333g = 1;
            this.f49334h = false;
        } else {
            this.f49333g = 3;
        }
        this.f49336j = 0;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f49332f = jy2Var;
    }

    /* JADX INFO: renamed from: g */
    public final k47 m16031g(iy2 iy2Var) {
        int i = this.f49338l;
        k47 k47Var = this.f49330d;
        byte[] bArr = k47Var.f46700a;
        if (i > bArr.length) {
            k47Var.m14816K(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            k47Var.m14818M(0);
        }
        k47Var.m14817L(this.f49338l);
        iy2Var.readFully(k47Var.f46700a, 0, this.f49338l);
        return k47Var;
    }
}
