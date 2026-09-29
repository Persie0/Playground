package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.C0713b;
import java.util.Objects;

/* JADX INFO: renamed from: i2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3097i2 implements yo2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43359a;

    /* JADX INFO: renamed from: b */
    public final so0 f43360b;

    /* JADX INFO: renamed from: c */
    public final k47 f43361c;

    /* JADX INFO: renamed from: d */
    public final String f43362d;

    /* JADX INFO: renamed from: e */
    public final int f43363e;

    /* JADX INFO: renamed from: f */
    public final String f43364f;

    /* JADX INFO: renamed from: g */
    public String f43365g;

    /* JADX INFO: renamed from: h */
    public n8a f43366h;

    /* JADX INFO: renamed from: i */
    public int f43367i;

    /* JADX INFO: renamed from: j */
    public int f43368j;

    /* JADX INFO: renamed from: k */
    public boolean f43369k;

    /* JADX INFO: renamed from: l */
    public long f43370l;

    /* JADX INFO: renamed from: m */
    public C0713b f43371m;

    /* JADX INFO: renamed from: n */
    public int f43372n;

    /* JADX INFO: renamed from: o */
    public long f43373o;

    public C3097i2(String str, int i, String str2, int i2) {
        this.f43359a = i2;
        switch (i2) {
            case 1:
                so0 so0Var = new so0(16, new byte[16]);
                this.f43360b = so0Var;
                this.f43361c = new k47(so0Var.f61083b);
                this.f43367i = 0;
                this.f43368j = 0;
                this.f43369k = false;
                this.f43373o = -9223372036854775807L;
                this.f43362d = str;
                this.f43363e = i;
                this.f43364f = str2;
                break;
            default:
                so0 so0Var2 = new so0(128, new byte[128]);
                this.f43360b = so0Var2;
                this.f43361c = new k47(so0Var2.f61083b);
                this.f43367i = 0;
                this.f43373o = -9223372036854775807L;
                this.f43362d = str;
                this.f43363e = i;
                this.f43364f = str2;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m13634a(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    private final void m13635c(boolean z) {
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:186:0x0371  */
    /* JADX WARN: Code duplicated, block: B:188:0x0379  */
    /* JADX WARN: Code duplicated, block: B:195:0x038d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0391  */
    /* JADX WARN: Code duplicated, block: B:198:0x0396  */
    /* JADX WARN: Code duplicated, block: B:200:0x0399  */
    /* JADX WARN: Code duplicated, block: B:202:0x039f  */
    /* JADX WARN: Code duplicated, block: B:204:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:332:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final void mo609b(k47 k47Var) {
        int i;
        int i2;
        int i3;
        String str;
        int iM21503g;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j;
        k47Var = k47Var;
        int i19 = this.f43359a;
        int i20 = this.f43363e;
        String str2 = this.f43362d;
        String str3 = this.f43364f;
        so0 so0Var = this.f43360b;
        long j2 = -9223372036854775807L;
        int i21 = 0;
        int i22 = 1;
        int i23 = 2;
        k47 k47Var2 = this.f43361c;
        int i24 = 16;
        switch (i19) {
            case 0:
                this.f43366h.getClass();
                while (k47Var.m14820a() > 0) {
                    int i25 = this.f43367i;
                    if (i25 == 0) {
                        while (true) {
                            if (k47Var.m14820a() <= 0) {
                                i21 = 0;
                                i22 = 1;
                                i23 = 2;
                            } else if (this.f43369k) {
                                int iM14842z = k47Var.m14842z();
                                if (iM14842z == 119) {
                                    this.f43369k = false;
                                    this.f43367i = 1;
                                    byte[] bArr = k47Var2.f46700a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f43368j = 2;
                                    i23 = 2;
                                    i21 = 0;
                                    i22 = 1;
                                } else {
                                    this.f43369k = iM14842z == 11;
                                }
                            } else {
                                this.f43369k = k47Var.m14842z() == 11;
                            }
                        }
                    } else if (i25 == i22) {
                        byte[] bArr2 = k47Var2.f46700a;
                        int iMin = Math.min(k47Var.m14820a(), 128 - this.f43368j);
                        k47Var.m14827k(bArr2, this.f43368j, iMin);
                        int i26 = this.f43368j + iMin;
                        this.f43368j = i26;
                        if (i26 == 128) {
                            so0Var.m21509m(i21);
                            int iM21501e = so0Var.m21501e();
                            so0Var.m21511o(40);
                            int i27 = so0Var.m21503g(5) > 10 ? i22 : i21;
                            so0Var.m21509m(iM21501e);
                            int[] iArr = jx1.f46338d;
                            int[] iArr2 = jx1.f46336b;
                            if (i27 != 0) {
                                so0Var.m21511o(i24);
                                int iM21503g2 = so0Var.m21503g(i23);
                                if (iM21503g2 == 0) {
                                    i6 = 0;
                                } else if (iM21503g2 != i22) {
                                    i6 = iM21503g2 != i23 ? -1 : i23;
                                } else {
                                    i6 = i22;
                                }
                                so0Var.m21511o(3);
                                iM21503g = (so0Var.m21503g(11) + i22) * i23;
                                int iM21503g3 = so0Var.m21503g(i23);
                                if (iM21503g3 == 3) {
                                    i7 = jx1.f46337c[so0Var.m21503g(i23)];
                                    i8 = 3;
                                    i9 = 6;
                                } else {
                                    int iM21503g4 = so0Var.m21503g(i23);
                                    int i28 = jx1.f46335a[iM21503g4];
                                    i7 = iArr2[iM21503g3];
                                    i8 = iM21503g4;
                                    i9 = i28;
                                }
                                i3 = i9 * 256;
                                int i29 = (iM21503g * i7) / (i9 * 32);
                                int iM21503g5 = so0Var.m21503g(3);
                                boolean zM21502f = so0Var.m21502f();
                                i2 = iArr[iM21503g5] + (zM21502f ? 1 : 0);
                                so0Var.m21511o(10);
                                if (so0Var.m21502f()) {
                                    i10 = 8;
                                    so0Var.m21511o(8);
                                } else {
                                    i10 = 8;
                                }
                                if (iM21503g5 == 0) {
                                    so0Var.m21511o(5);
                                    if (so0Var.m21502f()) {
                                        so0Var.m21511o(i10);
                                    }
                                }
                                if (i6 == 1 && so0Var.m21502f()) {
                                    so0Var.m21511o(16);
                                }
                                if (so0Var.m21502f()) {
                                    if (iM21503g5 > 2) {
                                        so0Var.m21511o(2);
                                    }
                                    if ((iM21503g5 & 1) == 0 || iM21503g5 <= 2) {
                                        i14 = 6;
                                    } else {
                                        i14 = 6;
                                        so0Var.m21511o(6);
                                    }
                                    if ((iM21503g5 & 4) != 0) {
                                        so0Var.m21511o(i14);
                                    }
                                    if (zM21502f && so0Var.m21502f()) {
                                        so0Var.m21511o(5);
                                    }
                                    if (i6 != 0) {
                                        i11 = i8;
                                    } else {
                                        if (so0Var.m21502f()) {
                                            i15 = 6;
                                            so0Var.m21511o(6);
                                        } else {
                                            i15 = 6;
                                        }
                                        if (iM21503g5 == 0 && so0Var.m21502f()) {
                                            so0Var.m21511o(i15);
                                        }
                                        if (so0Var.m21502f()) {
                                            so0Var.m21511o(i15);
                                        }
                                        int iM21503g6 = so0Var.m21503g(2);
                                        if (iM21503g6 == 1) {
                                            so0Var.m21511o(5);
                                        } else if (iM21503g6 == 2) {
                                            so0Var.m21511o(12);
                                        } else {
                                            if (iM21503g6 == 3) {
                                                int iM21503g7 = so0Var.m21503g(5);
                                                if (so0Var.m21502f()) {
                                                    so0Var.m21511o(5);
                                                    if (so0Var.m21502f()) {
                                                        i17 = 4;
                                                        so0Var.m21511o(4);
                                                    } else {
                                                        i17 = 4;
                                                    }
                                                    if (so0Var.m21502f()) {
                                                        so0Var.m21511o(i17);
                                                    }
                                                    if (so0Var.m21502f()) {
                                                        so0Var.m21511o(i17);
                                                    }
                                                    if (so0Var.m21502f()) {
                                                        so0Var.m21511o(i17);
                                                    }
                                                    if (so0Var.m21502f()) {
                                                        so0Var.m21511o(i17);
                                                    }
                                                    if (so0Var.m21502f()) {
                                                        so0Var.m21511o(i17);
                                                    }
                                                    if (so0Var.m21502f()) {
                                                        so0Var.m21511o(i17);
                                                    }
                                                    if (so0Var.m21502f()) {
                                                        if (so0Var.m21502f()) {
                                                            so0Var.m21511o(i17);
                                                        }
                                                        if (so0Var.m21502f()) {
                                                            so0Var.m21511o(i17);
                                                        }
                                                    }
                                                }
                                                if (so0Var.m21502f()) {
                                                    so0Var.m21511o(5);
                                                    if (so0Var.m21502f()) {
                                                        so0Var.m21511o(7);
                                                        if (so0Var.m21502f()) {
                                                            so0Var.m21511o(8);
                                                            i16 = 2;
                                                        } else {
                                                            i16 = 2;
                                                        }
                                                    } else {
                                                        i16 = 2;
                                                    }
                                                } else {
                                                    i16 = 2;
                                                }
                                                so0Var.m21511o((iM21503g7 + i16) * 8);
                                                so0Var.m21499c();
                                            }
                                            if (iM21503g5 < i16) {
                                                if (so0Var.m21502f()) {
                                                    so0Var.m21511o(14);
                                                }
                                                if (iM21503g5 == 0 && so0Var.m21502f()) {
                                                    so0Var.m21511o(14);
                                                }
                                            }
                                            if (so0Var.m21502f()) {
                                                i11 = i8;
                                                if (i11 == 0) {
                                                    so0Var.m21511o(5);
                                                } else {
                                                    for (i18 = 0; i18 < i9; i18++) {
                                                        if (so0Var.m21502f()) {
                                                            so0Var.m21511o(5);
                                                        }
                                                    }
                                                }
                                            } else {
                                                i11 = i8;
                                            }
                                        }
                                        i16 = 2;
                                        if (iM21503g5 < i16) {
                                            if (so0Var.m21502f()) {
                                                so0Var.m21511o(14);
                                            }
                                            if (iM21503g5 == 0) {
                                                so0Var.m21511o(14);
                                            }
                                        }
                                        if (so0Var.m21502f()) {
                                            i11 = i8;
                                            if (i11 == 0) {
                                                so0Var.m21511o(5);
                                            } else {
                                                while (i18 < i9) {
                                                    if (so0Var.m21502f()) {
                                                        so0Var.m21511o(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i11 = i8;
                                        }
                                    }
                                } else {
                                    i11 = i8;
                                }
                                if (so0Var.m21502f()) {
                                    so0Var.m21511o(5);
                                    if (iM21503g5 == 2) {
                                        so0Var.m21511o(4);
                                    }
                                    if (iM21503g5 >= 6) {
                                        so0Var.m21511o(2);
                                    }
                                    if (so0Var.m21502f()) {
                                        so0Var.m21511o(8);
                                    }
                                    if (iM21503g5 == 0 && so0Var.m21502f()) {
                                        so0Var.m21511o(8);
                                    }
                                    i12 = 3;
                                    if (iM21503g3 < 3) {
                                        so0Var.m21510n();
                                    }
                                } else {
                                    i12 = 3;
                                }
                                if (i6 == 0 && i11 != i12) {
                                    so0Var.m21510n();
                                }
                                if (i6 == 2 && (i11 == i12 || so0Var.m21502f())) {
                                    i13 = 6;
                                    so0Var.m21511o(6);
                                } else {
                                    i13 = 6;
                                }
                                str = (so0Var.m21502f() && so0Var.m21503g(i13) == 1 && so0Var.m21503g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i5 = i7;
                                i4 = i29;
                            } else {
                                so0Var.m21511o(32);
                                int iM21503g8 = so0Var.m21503g(2);
                                String str4 = iM21503g8 == 3 ? null : "audio/ac3";
                                int iM21503g9 = so0Var.m21503g(6);
                                int i30 = jx1.f46339e[iM21503g9 / 2] * DescriptorProtos.Edition.EDITION_2023_VALUE;
                                int iM14736b = jx1.m14736b(iM21503g8, iM21503g9);
                                so0Var.m21511o(8);
                                int iM21503g10 = so0Var.m21503g(3);
                                if ((iM21503g10 & 1) == 0 || iM21503g10 == 1) {
                                    i = 2;
                                } else {
                                    i = 2;
                                    so0Var.m21511o(2);
                                }
                                if ((iM21503g10 & 4) != 0) {
                                    so0Var.m21511o(i);
                                }
                                if (iM21503g10 == i) {
                                    so0Var.m21511o(i);
                                }
                                int i31 = iM21503g8 < 3 ? iArr2[iM21503g8] : -1;
                                i2 = iArr[iM21503g10] + (so0Var.m21502f() ? 1 : 0);
                                i3 = 1536;
                                str = str4;
                                iM21503g = iM14736b;
                                i4 = i30;
                                i5 = i31;
                            }
                            int i32 = i2;
                            C0713b c0713b = this.f43371m;
                            if (c0713b == null || i32 != c0713b.f6381G || i5 != c0713b.f6382H || !Objects.equals(str, c0713b.f6406o)) {
                                lc3 lc3Var = new lc3();
                                lc3Var.f49440a = this.f43365g;
                                lc3Var.f49452m = ez5.m11402l(str3);
                                lc3Var.f49453n = ez5.m11402l(str);
                                lc3Var.f49430F = i32;
                                lc3Var.f49431G = i5;
                                lc3Var.f49443d = str2;
                                lc3Var.f49445f = i20;
                                lc3Var.f49448i = i4;
                                if ("audio/ac3".equals(str)) {
                                    lc3Var.f49447h = i4;
                                }
                                C0713b c0713b2 = new C0713b(lc3Var);
                                this.f43371m = c0713b2;
                                this.f43366h.mo2537g(c0713b2);
                            }
                            this.f43372n = iM21503g;
                            this.f43370l = (((long) i3) * 1000000) / ((long) this.f43371m.f6382H);
                            k47Var2.m14818M(0);
                            this.f43366h.mo2535e(128, k47Var2);
                            this.f43367i = 2;
                            i23 = 2;
                            i21 = 0;
                            i22 = 1;
                        } else {
                            k47Var = k47Var;
                        }
                    } else if (i25 == i23) {
                        int iMin2 = Math.min(k47Var.m14820a(), this.f43372n - this.f43368j);
                        this.f43366h.mo2535e(iMin2, k47Var);
                        int i33 = this.f43368j + iMin2;
                        this.f43368j = i33;
                        if (i33 == this.f43372n) {
                            bna.m3987z(this.f43373o != -9223372036854775807L ? i22 : i21);
                            this.f43366h.mo2531a(this.f43373o, 1, this.f43372n, 0, null);
                            this.f43373o += this.f43370l;
                            this.f43367i = i21;
                        }
                    }
                    i24 = 16;
                }
                break;
            default:
                this.f43366h.getClass();
                while (k47Var.m14820a() > 0) {
                    int i34 = this.f43367i;
                    if (i34 == 0) {
                        j = j2;
                        while (k47Var.m14820a() > 0) {
                            if (this.f43369k) {
                                int iM14842z2 = k47Var.m14842z();
                                this.f43369k = iM14842z2 == 172;
                                if (iM14842z2 == 64 || iM14842z2 == 65) {
                                    Object[] objArr = iM14842z2 == 65;
                                    this.f43367i = 1;
                                    byte[] bArr3 = k47Var2.f46700a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr == true ? 65 : 64);
                                    this.f43368j = 2;
                                }
                            } else {
                                this.f43369k = k47Var.m14842z() == 172;
                            }
                        }
                    } else if (i34 == 1) {
                        j = j2;
                        byte[] bArr4 = k47Var2.f46700a;
                        int iMin3 = Math.min(k47Var.m14820a(), 16 - this.f43368j);
                        k47Var.m14827k(bArr4, this.f43368j, iMin3);
                        int i35 = this.f43368j + iMin3;
                        this.f43368j = i35;
                        if (i35 == 16) {
                            so0Var.m21509m(0);
                            C3283l2 c3283l2M24197f = wx1.m24197f(so0Var);
                            int i36 = c3283l2M24197f.f48908a;
                            C0713b c0713b3 = this.f43371m;
                            if (c0713b3 == null || 2 != c0713b3.f6381G || i36 != c0713b3.f6382H || !"audio/ac4".equals(c0713b3.f6406o)) {
                                lc3 lc3Var2 = new lc3();
                                lc3Var2.f49440a = this.f43365g;
                                lc3Var2.f49452m = ez5.m11402l(str3);
                                lc3Var2.f49453n = ez5.m11402l("audio/ac4");
                                lc3Var2.f49430F = 2;
                                lc3Var2.f49431G = i36;
                                lc3Var2.f49443d = str2;
                                lc3Var2.f49445f = i20;
                                C0713b c0713b4 = new C0713b(lc3Var2);
                                this.f43371m = c0713b4;
                                this.f43366h.mo2537g(c0713b4);
                            }
                            this.f43372n = c3283l2M24197f.f48909b;
                            this.f43370l = (((long) c3283l2M24197f.f48910c) * 1000000) / ((long) this.f43371m.f6382H);
                            k47Var2.m14818M(0);
                            this.f43366h.mo2535e(16, k47Var2);
                            this.f43367i = 2;
                        }
                    } else if (i34 == 2) {
                        int iMin4 = Math.min(k47Var.m14820a(), this.f43372n - this.f43368j);
                        this.f43366h.mo2535e(iMin4, k47Var);
                        int i37 = this.f43368j + iMin4;
                        this.f43368j = i37;
                        if (i37 == this.f43372n) {
                            bna.m3987z(this.f43373o != j2);
                            j = j2;
                            this.f43366h.mo2531a(this.f43373o, 1, this.f43372n, 0, null);
                            this.f43373o += this.f43370l;
                            this.f43367i = 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final void mo611d() {
        switch (this.f43359a) {
            case 0:
                this.f43367i = 0;
                this.f43368j = 0;
                this.f43369k = false;
                this.f43373o = -9223372036854775807L;
                break;
            default:
                this.f43367i = 0;
                this.f43368j = 0;
                this.f43369k = false;
                this.f43373o = -9223372036854775807L;
                break;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final void mo612e(boolean z) {
        int i = this.f43359a;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final void mo613f(int i, long j) {
        switch (this.f43359a) {
            case 0:
                this.f43373o = j;
                break;
            default:
                this.f43373o = j;
                break;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: g */
    public final void mo614g(jy2 jy2Var, mca mcaVar) {
        switch (this.f43359a) {
            case 0:
                mcaVar.m16767a();
                mcaVar.m16768b();
                this.f43365g = mcaVar.f51087e;
                mcaVar.m16768b();
                this.f43366h = jy2Var.mo2555n(mcaVar.f51086d, 1);
                break;
            default:
                mcaVar.m16767a();
                mcaVar.m16768b();
                this.f43365g = mcaVar.f51087e;
                mcaVar.m16768b();
                this.f43366h = jy2Var.mo2555n(mcaVar.f51086d, 1);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3097i2(String str) {
        this(null, 0, str, 0);
        this.f43359a = 0;
    }
}
