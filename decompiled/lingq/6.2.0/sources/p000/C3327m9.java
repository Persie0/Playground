package p000;

import androidx.media3.common.C0713b;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: m9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3327m9 implements yo2 {

    /* JADX INFO: renamed from: x */
    public static final byte[] f50772x = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f50773a;

    /* JADX INFO: renamed from: d */
    public final String f50776d;

    /* JADX INFO: renamed from: e */
    public final int f50777e;

    /* JADX INFO: renamed from: f */
    public final String f50778f;

    /* JADX INFO: renamed from: g */
    public String f50779g;

    /* JADX INFO: renamed from: h */
    public n8a f50780h;

    /* JADX INFO: renamed from: i */
    public n8a f50781i;

    /* JADX INFO: renamed from: m */
    public boolean f50785m;

    /* JADX INFO: renamed from: n */
    public boolean f50786n;

    /* JADX INFO: renamed from: q */
    public int f50789q;

    /* JADX INFO: renamed from: r */
    public boolean f50790r;

    /* JADX INFO: renamed from: t */
    public int f50792t;

    /* JADX INFO: renamed from: v */
    public n8a f50794v;

    /* JADX INFO: renamed from: w */
    public long f50795w;

    /* JADX INFO: renamed from: b */
    public final so0 f50774b = new so0(7, new byte[7]);

    /* JADX INFO: renamed from: c */
    public final k47 f50775c = new k47(Arrays.copyOf(f50772x, 10));

    /* JADX INFO: renamed from: o */
    public int f50787o = -1;

    /* JADX INFO: renamed from: p */
    public int f50788p = -1;

    /* JADX INFO: renamed from: s */
    public long f50791s = -9223372036854775807L;

    /* JADX INFO: renamed from: u */
    public long f50793u = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public int f50782j = 0;

    /* JADX INFO: renamed from: k */
    public int f50783k = 0;

    /* JADX INFO: renamed from: l */
    public int f50784l = 256;

    public C3327m9(String str, int i, String str2, boolean z) {
        this.f50773a = z;
        this.f50776d = str;
        this.f50777e = i;
        this.f50778f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final void mo609b(k47 k47Var) {
        byte b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        this.f50780h.getClass();
        String str = uma.f64080a;
        while (k47Var.m14820a() > 0) {
            int i7 = this.f50782j;
            byte b2 = -1;
            k47 k47Var2 = this.f50775c;
            int i8 = 3;
            so0 so0Var = this.f50774b;
            int i9 = 0;
            int i10 = 4;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = k47Var.f46700a;
                int i12 = k47Var.f46701b;
                int i13 = k47Var.f46702c;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        int i15 = i8;
                        byte b3 = bArr[i12];
                        int i16 = b3 & 255;
                        if (this.f50784l == 512 && ((65280 | (((byte) i16) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.f50786n) {
                                int i17 = i12 - 1;
                                k47Var.m14818M(i12);
                                byte[] bArr2 = so0Var.f61083b;
                                if (k47Var.m14820a() < i11) {
                                    b = -1;
                                } else {
                                    k47Var.m14827k(bArr2, i9, i11);
                                    so0Var.m21509m(i10);
                                    int iM21503g = so0Var.m21503g(i11);
                                    int i18 = this.f50787o;
                                    if (i18 == -1 || iM21503g == i18) {
                                        if (this.f50788p != -1) {
                                            byte[] bArr3 = so0Var.f61083b;
                                            if (k47Var.m14820a() >= i11) {
                                                k47Var.m14827k(bArr3, i9, i11);
                                                so0Var.m21509m(2);
                                                i4 = 4;
                                                if (so0Var.m21503g(4) != this.f50788p) {
                                                    b = -1;
                                                } else {
                                                    k47Var.m14818M(i14);
                                                }
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = so0Var.f61083b;
                                        if (k47Var.m14820a() >= i4) {
                                            k47Var.m14827k(bArr4, i9, i4);
                                            so0Var.m21509m(14);
                                            int iM21503g2 = so0Var.m21503g(13);
                                            if (iM21503g2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = k47Var.f46700a;
                                                int i19 = k47Var.f46702c;
                                                int i20 = i17 + iM21503g2;
                                                if (i20 < i19) {
                                                    byte b4 = bArr5[i20];
                                                    b = -1;
                                                    if (b4 == -1) {
                                                        int i21 = i20 + 1;
                                                        if (i21 != i19) {
                                                            byte b5 = bArr5[i21];
                                                            if (((65280 | (b5 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b5 & 8) >> 3) == iM21503g) {
                                                            }
                                                        }
                                                    } else if (b4 == 73 && ((i5 = i20 + 1) == i19 || (bArr5[i5] == 68 && ((i6 = i20 + 2) == i19 || bArr5[i6] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.f50789q = (b3 & 8) >> 3;
                            this.f50785m = (b3 & 1) == 0;
                            if (this.f50786n) {
                                this.f50782j = i15;
                                this.f50783k = 0;
                            } else {
                                this.f50782j = 1;
                                this.f50783k = 0;
                            }
                            k47Var.m14818M(i14);
                        } else {
                            b = b2;
                            i = i11;
                        }
                        int i22 = this.f50784l;
                        int i23 = i16 | i22;
                        if (i23 == 329) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.f50784l = 768;
                        } else if (i23 == 511) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.f50784l = 512;
                        } else if (i23 == 836) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.f50784l = 1024;
                        } else if (i23 != 1075) {
                            c = 256;
                            if (i22 != 256) {
                                this.f50784l = 256;
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            } else {
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            }
                            i11 = i;
                            b2 = b;
                            i10 = 4;
                            i9 = i3;
                            i8 = i2;
                        } else {
                            this.f50782j = 2;
                            this.f50783k = 3;
                            this.f50792t = 0;
                            k47Var2.m14818M(0);
                            k47Var.m14818M(i14);
                        }
                        i12 = i14;
                        i11 = i;
                        b2 = b;
                        i10 = 4;
                        i9 = i3;
                        i8 = i2;
                    } else {
                        k47Var.m14818M(i12);
                    }
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = k47Var2.f46700a;
                    int iMin = Math.min(k47Var.m14820a(), 10 - this.f50783k);
                    k47Var.m14827k(bArr6, this.f50783k, iMin);
                    int i24 = this.f50783k + iMin;
                    this.f50783k = i24;
                    if (i24 == 10) {
                        this.f50781i.mo2535e(10, k47Var2);
                        k47Var2.m14818M(6);
                        n8a n8aVar = this.f50781i;
                        int iM14841y = k47Var2.m14841y() + 10;
                        this.f50782j = 4;
                        this.f50783k = 10;
                        this.f50794v = n8aVar;
                        this.f50795w = 0L;
                        this.f50792t = iM14841y;
                    }
                } else if (i7 == 3) {
                    int i25 = this.f50785m ? 7 : 5;
                    byte[] bArr7 = so0Var.f61083b;
                    int iMin2 = Math.min(k47Var.m14820a(), i25 - this.f50783k);
                    k47Var.m14827k(bArr7, this.f50783k, iMin2);
                    int i26 = this.f50783k + iMin2;
                    this.f50783k = i26;
                    if (i26 == i25) {
                        so0Var.m21509m(0);
                        if (this.f50790r) {
                            so0Var.m21511o(10);
                        } else {
                            int iM21503g3 = so0Var.m21503g(2) + 1;
                            if (iM21503g3 != 2) {
                                ss5.m21707d0("AdtsReader", "Detected audio object type: " + iM21503g3 + ", but assuming AAC LC.");
                                iM21503g3 = 2;
                            }
                            so0Var.m21511o(5);
                            int iM21503g4 = so0Var.m21503g(3);
                            int i27 = this.f50788p;
                            byte[] bArr8 = {(byte) (((iM21503g3 << 3) & 248) | ((i27 >> 1) & 7)), (byte) (((iM21503g4 << 3) & 120) | ((i27 << 7) & 128))};
                            C3354n c3354nM18560f = ox1.m18560f(new so0(2, bArr8), false);
                            lc3 lc3Var = new lc3();
                            lc3Var.f49440a = this.f50779g;
                            lc3Var.f49452m = ez5.m11402l(this.f50778f);
                            lc3Var.f49453n = ez5.m11402l("audio/mp4a-latm");
                            lc3Var.f49449j = c3354nM18560f.f52092a;
                            lc3Var.f49430F = c3354nM18560f.f52094c;
                            lc3Var.f49431G = c3354nM18560f.f52093b;
                            lc3Var.f49456q = Collections.singletonList(bArr8);
                            lc3Var.f49443d = this.f50776d;
                            lc3Var.f49445f = this.f50777e;
                            C0713b c0713b = new C0713b(lc3Var);
                            this.f50791s = 1024000000 / ((long) c0713b.f6382H);
                            this.f50780h.mo2537g(c0713b);
                            this.f50790r = true;
                        }
                        so0Var.m21511o(4);
                        int iM21503g5 = so0Var.m21503g(13);
                        int i28 = iM21503g5 - 7;
                        if (this.f50785m) {
                            i28 = iM21503g5 - 9;
                        }
                        n8a n8aVar2 = this.f50780h;
                        long j = this.f50791s;
                        this.f50782j = 4;
                        this.f50783k = 0;
                        this.f50794v = n8aVar2;
                        this.f50795w = j;
                        this.f50792t = i28;
                    }
                } else {
                    if (i7 != 4) {
                        uk9.m22770c();
                        return;
                    }
                    int iMin3 = Math.min(k47Var.m14820a(), this.f50792t - this.f50783k);
                    this.f50794v.mo2535e(iMin3, k47Var);
                    int i29 = this.f50783k + iMin3;
                    this.f50783k = i29;
                    if (i29 == this.f50792t) {
                        bna.m3987z(this.f50793u != -9223372036854775807L);
                        this.f50794v.mo2531a(this.f50793u, 1, this.f50792t, 0, null);
                        this.f50793u += this.f50795w;
                        this.f50782j = 0;
                        this.f50783k = 0;
                        this.f50784l = 256;
                    }
                }
            } else if (k47Var.m14820a() != 0) {
                so0Var.f61083b[0] = k47Var.f46700a[k47Var.f46701b];
                so0Var.m21509m(2);
                int iM21503g6 = so0Var.m21503g(4);
                int i30 = this.f50788p;
                if (i30 == -1 || iM21503g6 == i30) {
                    if (!this.f50786n) {
                        this.f50786n = true;
                        this.f50787o = this.f50789q;
                        this.f50788p = iM21503g6;
                    }
                    this.f50782j = 3;
                    this.f50783k = 0;
                } else {
                    this.f50786n = false;
                    this.f50782j = 0;
                    this.f50783k = 0;
                    this.f50784l = 256;
                }
            }
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final void mo611d() {
        this.f50793u = -9223372036854775807L;
        this.f50786n = false;
        this.f50782j = 0;
        this.f50783k = 0;
        this.f50784l = 256;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final void mo612e(boolean z) {
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final void mo613f(int i, long j) {
        this.f50793u = j;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: g */
    public final void mo614g(jy2 jy2Var, mca mcaVar) {
        mcaVar.m16767a();
        mcaVar.m16768b();
        this.f50779g = mcaVar.f51087e;
        mcaVar.m16768b();
        n8a n8aVarMo2555n = jy2Var.mo2555n(mcaVar.f51086d, 1);
        this.f50780h = n8aVarMo2555n;
        this.f50794v = n8aVarMo2555n;
        if (!this.f50773a) {
            this.f50781i = new ug2();
            return;
        }
        mcaVar.m16767a();
        mcaVar.m16768b();
        n8a n8aVarMo2555n2 = jy2Var.mo2555n(mcaVar.f51086d, 5);
        this.f50781i = n8aVarMo2555n2;
        lc3 lc3Var = new lc3();
        mcaVar.m16768b();
        lc3Var.f49440a = mcaVar.f51087e;
        lc3Var.f49452m = ez5.m11402l(this.f50778f);
        lc3Var.f49453n = ez5.m11402l("application/id3");
        n8aVarMo2555n2.mo2537g(new C0713b(lc3Var));
    }
}
