package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i60 implements hy2 {

    /* JADX INFO: renamed from: d */
    public final a3d f43565d;

    /* JADX INFO: renamed from: e */
    public int f43566e;

    /* JADX INFO: renamed from: g */
    public j60 f43568g;

    /* JADX INFO: renamed from: j */
    public long f43571j;

    /* JADX INFO: renamed from: k */
    public w11 f43572k;

    /* JADX INFO: renamed from: o */
    public int f43576o;

    /* JADX INFO: renamed from: p */
    public boolean f43577p;

    /* JADX INFO: renamed from: c */
    public final boolean f43564c = true;

    /* JADX INFO: renamed from: a */
    public final k47 f43562a = new k47(12);

    /* JADX INFO: renamed from: b */
    public final C3283l2 f43563b = new C3283l2();

    /* JADX INFO: renamed from: f */
    public jy2 f43567f = new x24();

    /* JADX INFO: renamed from: i */
    public w11[] f43570i = new w11[0];

    /* JADX INFO: renamed from: m */
    public long f43574m = -1;

    /* JADX INFO: renamed from: n */
    public long f43575n = -1;

    /* JADX INFO: renamed from: l */
    public int f43573l = -1;

    /* JADX INFO: renamed from: h */
    public long f43569h = -9223372036854775807L;

    public i60(a3d a3dVar) {
        this.f43565d = a3dVar;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    /* JADX WARN: Code duplicated, block: B:178:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        boolean z;
        int i;
        w11 w11Var;
        long j;
        int i2;
        w11 w11Var2;
        int i3 = 0;
        if (this.f43571j != -1) {
            long position = iy2Var.getPosition();
            long j2 = this.f43571j;
            if (j2 < position || j2 > 262144 + position) {
                n63Var.f52394a = j2;
                z = true;
            } else {
                iy2Var.mo13082k((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f43571j = -1L;
        if (z) {
            return 1;
        }
        int i4 = this.f43566e;
        int i5 = 4;
        w11 w11Var3 = null;
        C3283l2 c3283l2 = this.f43563b;
        int i6 = 2;
        k47 k47Var = this.f43562a;
        switch (i4) {
            case 0:
                if (!mo111c(iy2Var)) {
                    throw ParserException.m2516a(null, "AVI Header List not found");
                }
                iy2Var.mo13082k(12);
                this.f43566e = 1;
                return 0;
            case 1:
                iy2Var.readFully(k47Var.f46700a, 0, 12);
                k47Var.m14818M(0);
                c3283l2.getClass();
                c3283l2.f48908a = k47Var.m14831o();
                c3283l2.f48909b = k47Var.m14831o();
                c3283l2.f48910c = 0;
                if (c3283l2.f48908a != 1414744396) {
                    throw ParserException.m2516a(null, "LIST expected, found: " + c3283l2.f48908a);
                }
                int iM14831o = k47Var.m14831o();
                c3283l2.f48910c = iM14831o;
                if (iM14831o == 1819436136) {
                    this.f43573l = c3283l2.f48909b;
                    this.f43566e = 2;
                    return 0;
                }
                throw ParserException.m2516a(null, "hdrl expected, found: " + c3283l2.f48910c);
            case 2:
                int i7 = this.f43573l - 4;
                k47 k47Var2 = new k47(i7);
                iy2Var.readFully(k47Var2.f46700a, 0, i7);
                te5 te5VarM22013b = te5.m22013b(1819436136, k47Var2);
                int i8 = te5VarM22013b.f62193b;
                if (i8 != 1819436136) {
                    throw ParserException.m2516a(null, "Unexpected header list type " + i8);
                }
                j60 j60Var = (j60) te5VarM22013b.m22014a(j60.class);
                if (j60Var == null) {
                    throw ParserException.m2516a(null, "AviHeader not found");
                }
                this.f43568g = j60Var;
                this.f43569h = ((long) j60Var.f45107c) * ((long) j60Var.f45105a);
                ArrayList arrayList = new ArrayList();
                d14 d14VarListIterator = te5VarM22013b.f62192a.listIterator(0);
                int i9 = 0;
                while (d14VarListIterator.hasNext()) {
                    g60 g60Var = (g60) d14VarListIterator.next();
                    if (g60Var.getType() == 1819440243) {
                        te5 te5Var = (te5) g60Var;
                        int i10 = i9 + 1;
                        k60 k60Var = (k60) te5Var.m22014a(k60.class);
                        gk9 gk9Var = (gk9) te5Var.m22014a(gk9.class);
                        if (k60Var == null) {
                            ss5.m21707d0("AviExtractor", "Missing Stream Header");
                        } else {
                            if (gk9Var == null) {
                                ss5.m21707d0("AviExtractor", "Missing Stream Format");
                            } else {
                                long j3 = k60Var.f46753d;
                                long j4 = ((long) k60Var.f46751b) * 1000000;
                                i = i10;
                                long j5 = k60Var.f46752c;
                                String str = uma.f64080a;
                                long jM22803H = uma.m22803H(j3, j4, j5, RoundingMode.DOWN);
                                C0713b c0713b = gk9Var.f40917a;
                                lc3 lc3VarM2520a = c0713b.m2520a();
                                lc3VarM2520a.f49440a = Integer.toString(i9);
                                int i11 = k60Var.f46754e;
                                if (i11 != 0) {
                                    lc3VarM2520a.f49454o = i11;
                                }
                                hk9 hk9Var = (hk9) te5Var.m22014a(hk9.class);
                                if (hk9Var != null) {
                                    lc3VarM2520a.f49441b = hk9Var.f42548a;
                                }
                                int iM11397g = ez5.m11397g(c0713b.f6406o);
                                if (iM11397g == 1 || iM11397g == i6) {
                                    n8a n8aVarMo2555n = this.f43567f.mo2555n(i9, iM11397g);
                                    n8aVarMo2555n.mo2537g(new C0713b(lc3VarM2520a));
                                    n8aVarMo2555n.mo2534d(jM22803H);
                                    this.f43569h = Math.max(this.f43569h, jM22803H);
                                    w11Var = new w11(i9, k60Var, n8aVarMo2555n);
                                } else {
                                    w11Var = null;
                                }
                            }
                            if (w11Var != null) {
                                arrayList.add(w11Var);
                            }
                            i9 = i;
                        }
                        i = i10;
                        w11Var = null;
                        if (w11Var != null) {
                            arrayList.add(w11Var);
                        }
                        i9 = i;
                    }
                    i3 = 0;
                    i6 = 2;
                }
                int i12 = i3;
                this.f43570i = (w11[]) arrayList.toArray(new w11[i12]);
                this.f43567f.mo2551j();
                this.f43566e = 3;
                return i12;
            case 3:
                if (this.f43574m != -1) {
                    long position2 = iy2Var.getPosition();
                    long j6 = this.f43574m;
                    if (position2 != j6) {
                        this.f43571j = j6;
                        return 0;
                    }
                }
                iy2Var.mo13085o(k47Var.f46700a, 0, 12);
                iy2Var.mo13080i();
                k47Var.m14818M(0);
                c3283l2.getClass();
                c3283l2.f48908a = k47Var.m14831o();
                c3283l2.f48909b = k47Var.m14831o();
                c3283l2.f48910c = 0;
                int iM14831o2 = k47Var.m14831o();
                int i13 = c3283l2.f48908a;
                if (i13 == 1179011410) {
                    iy2Var.mo13082k(12);
                    return 0;
                }
                if (i13 != 1414744396 || iM14831o2 != 1769369453) {
                    this.f43571j = iy2Var.getPosition() + ((long) c3283l2.f48909b) + 8;
                    return 0;
                }
                long position3 = iy2Var.getPosition();
                this.f43574m = position3;
                this.f43575n = position3 + ((long) c3283l2.f48909b) + 8;
                if (!this.f43577p) {
                    j60 j60Var2 = this.f43568g;
                    j60Var2.getClass();
                    if ((j60Var2.f45106b & 16) == 16) {
                        this.f43566e = 4;
                        this.f43571j = this.f43575n;
                        return 0;
                    }
                    this.f43567f.mo2558q(new h60(this.f43569h));
                    this.f43577p = true;
                }
                this.f43571j = iy2Var.getPosition() + 12;
                this.f43566e = 6;
                return 0;
            case 4:
                iy2Var.readFully(k47Var.f46700a, 0, 8);
                k47Var.m14818M(0);
                int iM14831o3 = k47Var.m14831o();
                int iM14831o4 = k47Var.m14831o();
                if (iM14831o3 != 829973609) {
                    this.f43571j = iy2Var.getPosition() + ((long) iM14831o4);
                    return 0;
                }
                this.f43566e = 5;
                this.f43576o = iM14831o4;
                return 0;
            case 5:
                k47 k47Var3 = new k47(this.f43576o);
                iy2Var.readFully(k47Var3.f46700a, 0, this.f43576o);
                if (k47Var3.m14820a() < 16) {
                    j = 0;
                } else {
                    int i14 = k47Var3.f46701b;
                    k47Var3.m14819N(8);
                    long jM14831o = k47Var3.m14831o();
                    long j7 = this.f43574m;
                    j = jM14831o > j7 ? 0L : j7 + 8;
                    k47Var3.m14818M(i14);
                }
                while (k47Var3.m14820a() >= 16) {
                    int iM14831o5 = k47Var3.m14831o();
                    int iM14831o6 = k47Var3.m14831o();
                    long jM14831o2 = ((long) k47Var3.m14831o()) + j;
                    k47Var3.m14819N(i5);
                    w11[] w11VarArr = this.f43570i;
                    int length = w11VarArr.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length) {
                            w11Var2 = w11VarArr[i15];
                            if (w11Var2.f66203c != iM14831o5 && w11Var2.f66204d != iM14831o5) {
                                i15++;
                            }
                        } else {
                            w11Var2 = null;
                        }
                    }
                    if (w11Var2 != null) {
                        boolean z2 = (iM14831o6 & 16) == 16;
                        if (w11Var2.f66212l == -1) {
                            w11Var2.f66212l = jM14831o2;
                        }
                        if (z2) {
                            if (w11Var2.f66211k == w11Var2.f66214n.length) {
                                long[] jArr = w11Var2.f66213m;
                                w11Var2.f66213m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = w11Var2.f66214n;
                                w11Var2.f66214n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = w11Var2.f66213m;
                            int i16 = w11Var2.f66211k;
                            jArr2[i16] = jM14831o2;
                            w11Var2.f66214n[i16] = w11Var2.f66210j;
                            w11Var2.f66211k = i16 + 1;
                        }
                        w11Var2.f66210j++;
                    }
                    i5 = 4;
                }
                for (w11 w11Var4 : this.f43570i) {
                    w11Var4.f66213m = Arrays.copyOf(w11Var4.f66213m, w11Var4.f66211k);
                    w11Var4.f66214n = Arrays.copyOf(w11Var4.f66214n, w11Var4.f66211k);
                    if ((w11Var4.f66203c & 1651965952) == 1651965952 && w11Var4.f66201a.f46755f != 0 && (i2 = w11Var4.f66211k) > 0) {
                        w11Var4.f66206f = i2;
                    }
                }
                this.f43577p = true;
                int length2 = this.f43570i.length;
                jy2 jy2Var = this.f43567f;
                long j8 = this.f43569h;
                if (length2 == 0) {
                    jy2Var.mo2558q(new h60(j8));
                } else {
                    jy2Var.mo2558q(new h60(this, j8, 0));
                }
                this.f43566e = 6;
                this.f43571j = this.f43574m;
                return 0;
            case 6:
                if (iy2Var.getPosition() >= this.f43575n) {
                    return -1;
                }
                w11 w11Var5 = this.f43572k;
                if (w11Var5 != null) {
                    int i17 = w11Var5.f66208h;
                    int iMo2533c = i17 - w11Var5.f66202b.mo2533c(iy2Var, i17, false);
                    w11Var5.f66208h = iMo2533c;
                    boolean z3 = iMo2533c == 0;
                    if (z3) {
                        if (w11Var5.f66207g > 0) {
                            n8a n8aVar = w11Var5.f66202b;
                            int i18 = w11Var5.f66209i;
                            n8aVar.mo2531a((w11Var5.f66205e * ((long) i18)) / ((long) w11Var5.f66206f), Arrays.binarySearch(w11Var5.f66214n, i18) >= 0 ? 1 : 0, w11Var5.f66207g, 0, null);
                        }
                        w11Var5.f66209i++;
                    }
                    if (z3) {
                        this.f43572k = null;
                    }
                    return 0;
                }
                if ((iy2Var.getPosition() & 1) == 1) {
                    iy2Var.mo13082k(1);
                }
                iy2Var.mo13085o(k47Var.f46700a, 0, 12);
                k47Var.m14818M(0);
                int iM14831o7 = k47Var.m14831o();
                if (iM14831o7 == 1414744396) {
                    k47Var.m14818M(8);
                    iy2Var.mo13082k(k47Var.m14831o() == 1769369453 ? 12 : 8);
                    iy2Var.mo13080i();
                    return 0;
                }
                int iM14831o8 = k47Var.m14831o();
                if (iM14831o7 == 1263424842) {
                    this.f43571j = iy2Var.getPosition() + ((long) iM14831o8) + 8;
                    return 0;
                }
                iy2Var.mo13082k(8);
                iy2Var.mo13080i();
                for (w11 w11Var6 : this.f43570i) {
                    if (w11Var6.f66203c == iM14831o7 || w11Var6.f66204d == iM14831o7) {
                        w11Var3 = w11Var6;
                        if (w11Var3 == null) {
                            this.f43571j = iy2Var.getPosition() + ((long) iM14831o8);
                            return 0;
                        }
                        w11Var3.f66207g = iM14831o8;
                        w11Var3.f66208h = iM14831o8;
                        this.f43572k = w11Var3;
                        return 0;
                    }
                }
                if (w11Var3 == null) {
                    this.f43571j = iy2Var.getPosition() + ((long) iM14831o8);
                    return 0;
                }
                w11Var3.f66207g = iM14831o8;
                w11Var3.f66208h = iM14831o8;
                this.f43572k = w11Var3;
                return 0;
            default:
                uk9.m22780o();
                return 0;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        k47 k47Var = this.f43562a;
        iy2Var.mo13085o(k47Var.f46700a, 0, 12);
        k47Var.m14818M(0);
        if (k47Var.m14831o() != 1179011410) {
            return false;
        }
        k47Var.m14819N(4);
        return k47Var.m14831o() == 541677121;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        this.f43571j = -1L;
        this.f43572k = null;
        for (w11 w11Var : this.f43570i) {
            if (w11Var.f66211k == 0) {
                w11Var.f66209i = 0;
            } else {
                w11Var.f66209i = w11Var.f66214n[uma.m22809d(w11Var.f66213m, j, true)];
            }
        }
        if (j != 0) {
            this.f43566e = 6;
        } else if (this.f43570i.length == 0) {
            this.f43566e = 0;
        } else {
            this.f43566e = 3;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f43566e = 0;
        if (this.f43564c) {
            jy2Var = new nc0(jy2Var, this.f43565d);
        }
        this.f43567f = jy2Var;
        this.f43571j = -1L;
    }
}
