package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class po0 extends wo0 {

    /* JADX INFO: renamed from: i */
    public final int f56563i;

    /* JADX INFO: renamed from: j */
    public final int f56564j;

    /* JADX INFO: renamed from: k */
    public final int f56565k;

    /* JADX INFO: renamed from: o */
    public List f56569o;

    /* JADX INFO: renamed from: p */
    public List f56570p;

    /* JADX INFO: renamed from: q */
    public int f56571q;

    /* JADX INFO: renamed from: r */
    public int f56572r;

    /* JADX INFO: renamed from: s */
    public boolean f56573s;

    /* JADX INFO: renamed from: t */
    public boolean f56574t;

    /* JADX INFO: renamed from: u */
    public byte f56575u;

    /* JADX INFO: renamed from: v */
    public byte f56576v;

    /* JADX INFO: renamed from: x */
    public boolean f56578x;

    /* JADX INFO: renamed from: y */
    public long f56579y;

    /* JADX INFO: renamed from: z */
    public static final int[] f56561z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A */
    public static final int[] f56554A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B */
    public static final int[] f56555B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C */
    public static final int[] f56556C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D */
    public static final int[] f56557D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E */
    public static final int[] f56558E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F */
    public static final int[] f56559F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G */
    public static final boolean[] f56560G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h */
    public final k47 f56562h = new k47();

    /* JADX INFO: renamed from: m */
    public final ArrayList f56567m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public oo0 f56568n = new oo0(0, 4);

    /* JADX INFO: renamed from: w */
    public int f56577w = 0;

    /* JADX INFO: renamed from: l */
    public final long f56566l = 16000000;

    public po0(String str, int i) {
        this.f56563i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f56565k = 0;
            this.f56564j = 0;
        } else if (i == 2) {
            this.f56565k = 1;
            this.f56564j = 0;
        } else if (i == 3) {
            this.f56565k = 0;
            this.f56564j = 1;
        } else if (i != 4) {
            ss5.m21707d0("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f56565k = 0;
            this.f56564j = 0;
        } else {
            this.f56565k = 1;
            this.f56564j = 1;
        }
        m19429m(0);
        m19428l();
        this.f56578x = true;
        this.f56579y = -9223372036854775807L;
    }

    @Override // p000.wo0, p000.k32
    /* JADX INFO: renamed from: a */
    public final void mo14782a() {
    }

    @Override // p000.wo0, p000.k32
    public final void flush() {
        super.flush();
        this.f56569o = null;
        this.f56570p = null;
        m19429m(0);
        this.f56572r = 4;
        this.f56568n.f54645h = 4;
        m19428l();
        this.f56573s = false;
        this.f56574t = false;
        this.f56575u = (byte) 0;
        this.f56576v = (byte) 0;
        this.f56577w = 0;
        this.f56578x = true;
        this.f56579y = -9223372036854775807L;
    }

    @Override // p000.wo0
    /* JADX INFO: renamed from: g */
    public final vj6 mo19423g() {
        List list = this.f56569o;
        this.f56570p = list;
        list.getClass();
        return new vj6(list, 7);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // p000.wo0
    /* JADX INFO: renamed from: h */
    public final void mo19424h(uo0 uo0Var) {
        boolean z;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = uo0Var.f50500e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        k47 k47Var = this.f56562h;
        k47Var.m14816K(iLimit, bArrArray);
        boolean z2 = false;
        while (true) {
            int iM14820a = k47Var.m14820a();
            int i5 = this.f56563i;
            if (iM14820a < i5) {
                if (z2) {
                    int i6 = this.f56571q;
                    if (i6 == 1 || i6 == 3) {
                        this.f56569o = m19427k();
                        this.f56579y = this.f67115e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM14842z = i5 == 2 ? -4 : k47Var.m14842z();
            int iM14842z2 = k47Var.m14842z();
            int iM14842z3 = k47Var.m14842z();
            if ((iM14842z & 2) == 0 && (iM14842z & 1) == this.f56564j) {
                byte b = (byte) (iM14842z2 & 127);
                byte b2 = (byte) (iM14842z3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.f56573s;
                    if ((iM14842z & 4) == 4) {
                        boolean[] zArr = f56560G;
                        if (zArr[iM14842z2] && zArr[iM14842z3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.f56573s = z;
                    if (!z || (b & 240) != 16) {
                        this.f56574t = false;
                        if (!z) {
                            if (1 > b && b <= 15) {
                                this.f56578x = false;
                            } else if ((b & 246) == 20) {
                                if (b2 == 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case 42:
                                                case 43:
                                                    this.f56578x = false;
                                                    break;
                                            }
                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                        case 38:
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                            this.f56578x = true;
                                            break;
                                    }
                                } else {
                                    this.f56578x = true;
                                }
                            }
                            if (this.f56578x) {
                                i = b & 224;
                                if (i == 0) {
                                    this.f56577w = (b >> 3) & 1;
                                }
                                if (this.f56577w != this.f56565k) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17 || (b2 & 240) != 48) {
                                            i3 = b & 246;
                                            if (i3 != 18 && (b2 & 224) == 32) {
                                                this.f56568n.m18178b();
                                                this.f56568n.m18177a((char) ((b & 1) == 0 ? f56558E[b2 & 31] : f56559F[b2 & 31]));
                                            } else if (i2 != 17 && (b2 & 240) == 32) {
                                                this.f56568n.m18177a(' ');
                                                boolean z4 = (b2 & 1) == 1;
                                                oo0 oo0Var = this.f56568n;
                                                oo0Var.f54638a.add(new no0((b2 >> 1) & 7, oo0Var.f54640c.length(), z4));
                                            } else if ((b & 240) != 16 && (b2 & 192) == 64) {
                                                int i7 = f56561z[b & 7];
                                                if ((b2 & 32) != 0) {
                                                    i7++;
                                                }
                                                oo0 oo0Var2 = this.f56568n;
                                                if (i7 != oo0Var2.f54641d) {
                                                    if (this.f56571q != 1 && !oo0Var2.m18181e()) {
                                                        oo0 oo0Var3 = new oo0(this.f56571q, this.f56572r);
                                                        this.f56568n = oo0Var3;
                                                        this.f56567m.add(oo0Var3);
                                                    }
                                                    this.f56568n.f54641d = i7;
                                                }
                                                boolean z5 = (b2 & 16) == 16;
                                                boolean z6 = (b2 & 1) == 1;
                                                int i8 = (b2 >> 1) & 7;
                                                oo0 oo0Var4 = this.f56568n;
                                                oo0Var4.f54638a.add(new no0(z5 ? 8 : i8, oo0Var4.f54640c.length(), z6));
                                                if (z5) {
                                                    this.f56568n.f54642e = f56554A[i8];
                                                }
                                            } else if (i2 != 23 && b2 >= 33 && b2 <= 35) {
                                                this.f56568n.f54643f = b2 - 32;
                                            } else if (i3 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    m19429m(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                            m19429m(1);
                                                            this.f56572r = 2;
                                                            this.f56568n.f54645h = 2;
                                                            break;
                                                        case 38:
                                                            m19429m(1);
                                                            this.f56572r = 3;
                                                            this.f56568n.f54645h = 3;
                                                            break;
                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                            m19429m(1);
                                                            this.f56572r = 4;
                                                            this.f56568n.f54645h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.f56571q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                            this.f56569o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1 || i4 == 3) {
                                                                                m19428l();
                                                                            }
                                                                            break;
                                                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                            if (i4 == 1 && !this.f56568n.m18181e()) {
                                                                                oo0 oo0Var5 = this.f56568n;
                                                                                arrayList = oo0Var5.f54639b;
                                                                                arrayList.add(oo0Var5.m18180d());
                                                                                oo0Var5.f54640c.setLength(0);
                                                                                oo0Var5.f54638a.clear();
                                                                                iMin = Math.min(oo0Var5.f54645h, oo0Var5.f54641d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m19428l();
                                                                            break;
                                                                        case 47:
                                                                            this.f56569o = m19427k();
                                                                            m19428l();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f56568n.m18178b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m19429m(3);
                                                }
                                            }
                                        } else {
                                            this.f56568n.m18177a((char) f56557D[b2 & 15]);
                                        }
                                    } else {
                                        oo0 oo0Var6 = this.f56568n;
                                        iArr = f56556C;
                                        oo0Var6.m18177a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.f56568n.m18177a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            m19428l();
                            z2 = true;
                        }
                    } else if (this.f56574t && this.f56575u == b && this.f56576v == b2) {
                        this.f56574t = false;
                    } else {
                        this.f56574t = true;
                        this.f56575u = b;
                        this.f56576v = b2;
                        if (!z) {
                            if (1 > b) {
                                if ((b & 246) == 20) {
                                    if (b2 == 32) {
                                        this.f56578x = true;
                                    } else {
                                        this.f56578x = true;
                                    }
                                }
                            } else if ((b & 246) == 20) {
                                if (b2 == 32) {
                                    this.f56578x = true;
                                } else {
                                    this.f56578x = true;
                                }
                            }
                            if (this.f56578x) {
                                i = b & 224;
                                if (i == 0) {
                                    this.f56577w = (b >> 3) & 1;
                                }
                                if (this.f56577w != this.f56565k) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17) {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m19429m(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                            m19429m(1);
                                                                            this.f56572r = 2;
                                                                            this.f56568n.f54645h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m19429m(1);
                                                                            this.f56572r = 3;
                                                                            this.f56568n.f54645h = 3;
                                                                            break;
                                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                            m19429m(1);
                                                                            this.f56572r = 4;
                                                                            this.f56568n.f54645h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.f56571q;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                            this.f56569o = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m19428l();
                                                                                            } else {
                                                                                                m19428l();
                                                                                            }
                                                                                            break;
                                                                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                oo0 oo0Var7 = this.f56568n;
                                                                                                arrayList = oo0Var7.f54639b;
                                                                                                arrayList.add(oo0Var7.m18180d());
                                                                                                oo0Var7.f54640c.setLength(0);
                                                                                                oo0Var7.f54638a.clear();
                                                                                                iMin = Math.min(oo0Var7.f54645h, oo0Var7.f54641d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m19428l();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f56569o = m19427k();
                                                                                            m19428l();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f56568n.m18178b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m19429m(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m19429m(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 2;
                                                                        this.f56568n.f54645h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19429m(1);
                                                                        this.f56572r = 3;
                                                                        this.f56568n.f54645h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 4;
                                                                        this.f56568n.f54645h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f56571q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f56569o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m19428l();
                                                                                        } else {
                                                                                            m19428l();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            oo0 oo0Var8 = this.f56568n;
                                                                                            arrayList = oo0Var8.f54639b;
                                                                                            arrayList.add(oo0Var8.m18180d());
                                                                                            oo0Var8.f54640c.setLength(0);
                                                                                            oo0Var8.f54638a.clear();
                                                                                            iMin = Math.min(oo0Var8.f54645h, oo0Var8.f54641d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19428l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f56569o = m19427k();
                                                                                        m19428l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f56568n.m18178b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19429m(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m19429m(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 2;
                                                                        this.f56568n.f54645h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19429m(1);
                                                                        this.f56572r = 3;
                                                                        this.f56568n.f54645h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 4;
                                                                        this.f56568n.f54645h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f56571q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f56569o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m19428l();
                                                                                        } else {
                                                                                            m19428l();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            oo0 oo0Var9 = this.f56568n;
                                                                                            arrayList = oo0Var9.f54639b;
                                                                                            arrayList.add(oo0Var9.m18180d());
                                                                                            oo0Var9.f54640c.setLength(0);
                                                                                            oo0Var9.f54638a.clear();
                                                                                            iMin = Math.min(oo0Var9.f54645h, oo0Var9.f54641d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19428l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f56569o = m19427k();
                                                                                        m19428l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f56568n.m18178b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19429m(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var10 = this.f56568n;
                                                                                        arrayList = oo0Var10.f54639b;
                                                                                        arrayList.add(oo0Var10.m18180d());
                                                                                        oo0Var10.f54640c.setLength(0);
                                                                                        oo0Var10.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var10.f54645h, oo0Var10.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m19429m(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 2;
                                                                        this.f56568n.f54645h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19429m(1);
                                                                        this.f56572r = 3;
                                                                        this.f56568n.f54645h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 4;
                                                                        this.f56568n.f54645h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f56571q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f56569o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m19428l();
                                                                                        } else {
                                                                                            m19428l();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            oo0 oo0Var11 = this.f56568n;
                                                                                            arrayList = oo0Var11.f54639b;
                                                                                            arrayList.add(oo0Var11.m18180d());
                                                                                            oo0Var11.f54640c.setLength(0);
                                                                                            oo0Var11.f54638a.clear();
                                                                                            iMin = Math.min(oo0Var11.f54645h, oo0Var11.f54641d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19428l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f56569o = m19427k();
                                                                                        m19428l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f56568n.m18178b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19429m(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var12 = this.f56568n;
                                                                                        arrayList = oo0Var12.f54639b;
                                                                                        arrayList.add(oo0Var12.m18180d());
                                                                                        oo0Var12.f54640c.setLength(0);
                                                                                        oo0Var12.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var12.f54645h, oo0Var12.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var13 = this.f56568n;
                                                                                        arrayList = oo0Var13.f54639b;
                                                                                        arrayList.add(oo0Var13.m18180d());
                                                                                        oo0Var13.f54640c.setLength(0);
                                                                                        oo0Var13.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var13.f54645h, oo0Var13.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m19429m(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                m19429m(1);
                                                                this.f56572r = 2;
                                                                this.f56568n.f54645h = 2;
                                                                break;
                                                            case 38:
                                                                m19429m(1);
                                                                this.f56572r = 3;
                                                                this.f56568n.f54645h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                m19429m(1);
                                                                this.f56572r = 4;
                                                                this.f56568n.f54645h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f56571q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f56569o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m19428l();
                                                                                } else {
                                                                                    m19428l();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    oo0 oo0Var14 = this.f56568n;
                                                                                    arrayList = oo0Var14.f54639b;
                                                                                    arrayList.add(oo0Var14.m18180d());
                                                                                    oo0Var14.f54640c.setLength(0);
                                                                                    oo0Var14.f54638a.clear();
                                                                                    iMin = Math.min(oo0Var14.f54645h, oo0Var14.f54641d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19428l();
                                                                                break;
                                                                            case 47:
                                                                                this.f56569o = m19427k();
                                                                                m19428l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f56568n.m18178b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19429m(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m19429m(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 2;
                                                                        this.f56568n.f54645h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19429m(1);
                                                                        this.f56572r = 3;
                                                                        this.f56568n.f54645h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 4;
                                                                        this.f56568n.f54645h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f56571q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f56569o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m19428l();
                                                                                        } else {
                                                                                            m19428l();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            oo0 oo0Var15 = this.f56568n;
                                                                                            arrayList = oo0Var15.f54639b;
                                                                                            arrayList.add(oo0Var15.m18180d());
                                                                                            oo0Var15.f54640c.setLength(0);
                                                                                            oo0Var15.f54638a.clear();
                                                                                            iMin = Math.min(oo0Var15.f54645h, oo0Var15.f54641d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19428l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f56569o = m19427k();
                                                                                        m19428l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f56568n.m18178b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19429m(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var16 = this.f56568n;
                                                                                        arrayList = oo0Var16.f54639b;
                                                                                        arrayList.add(oo0Var16.m18180d());
                                                                                        oo0Var16.f54640c.setLength(0);
                                                                                        oo0Var16.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var16.f54645h, oo0Var16.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var17 = this.f56568n;
                                                                                        arrayList = oo0Var17.f54639b;
                                                                                        arrayList.add(oo0Var17.m18180d());
                                                                                        oo0Var17.f54640c.setLength(0);
                                                                                        oo0Var17.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var17.f54645h, oo0Var17.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m19429m(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                m19429m(1);
                                                                this.f56572r = 2;
                                                                this.f56568n.f54645h = 2;
                                                                break;
                                                            case 38:
                                                                m19429m(1);
                                                                this.f56572r = 3;
                                                                this.f56568n.f54645h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                m19429m(1);
                                                                this.f56572r = 4;
                                                                this.f56568n.f54645h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f56571q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f56569o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m19428l();
                                                                                } else {
                                                                                    m19428l();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    oo0 oo0Var18 = this.f56568n;
                                                                                    arrayList = oo0Var18.f54639b;
                                                                                    arrayList.add(oo0Var18.m18180d());
                                                                                    oo0Var18.f54640c.setLength(0);
                                                                                    oo0Var18.f54638a.clear();
                                                                                    iMin = Math.min(oo0Var18.f54645h, oo0Var18.f54641d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19428l();
                                                                                break;
                                                                            case 47:
                                                                                this.f56569o = m19427k();
                                                                                m19428l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f56568n.m18178b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19429m(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var19 = this.f56568n;
                                                                                        arrayList = oo0Var19.f54639b;
                                                                                        arrayList.add(oo0Var19.m18180d());
                                                                                        oo0Var19.f54640c.setLength(0);
                                                                                        oo0Var19.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var19.f54645h, oo0Var19.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m19429m(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                m19429m(1);
                                                                this.f56572r = 2;
                                                                this.f56568n.f54645h = 2;
                                                                break;
                                                            case 38:
                                                                m19429m(1);
                                                                this.f56572r = 3;
                                                                this.f56568n.f54645h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                m19429m(1);
                                                                this.f56572r = 4;
                                                                this.f56568n.f54645h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f56571q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f56569o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m19428l();
                                                                                } else {
                                                                                    m19428l();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    oo0 oo0Var110 = this.f56568n;
                                                                                    arrayList = oo0Var110.f54639b;
                                                                                    arrayList.add(oo0Var110.m18180d());
                                                                                    oo0Var110.f54640c.setLength(0);
                                                                                    oo0Var110.f54638a.clear();
                                                                                    iMin = Math.min(oo0Var110.f54645h, oo0Var110.f54641d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19428l();
                                                                                break;
                                                                            case 47:
                                                                                this.f56569o = m19427k();
                                                                                m19428l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f56568n.m18178b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19429m(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m19429m(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                m19429m(1);
                                                                this.f56572r = 2;
                                                                this.f56568n.f54645h = 2;
                                                                break;
                                                            case 38:
                                                                m19429m(1);
                                                                this.f56572r = 3;
                                                                this.f56568n.f54645h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                m19429m(1);
                                                                this.f56572r = 4;
                                                                this.f56568n.f54645h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f56571q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f56569o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m19428l();
                                                                                } else {
                                                                                    m19428l();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    oo0 oo0Var111 = this.f56568n;
                                                                                    arrayList = oo0Var111.f54639b;
                                                                                    arrayList.add(oo0Var111.m18180d());
                                                                                    oo0Var111.f54640c.setLength(0);
                                                                                    oo0Var111.f54638a.clear();
                                                                                    iMin = Math.min(oo0Var111.f54645h, oo0Var111.f54641d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19428l();
                                                                                break;
                                                                            case 47:
                                                                                this.f56569o = m19427k();
                                                                                m19428l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f56568n.m18178b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19429m(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    m19429m(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                            m19429m(1);
                                                            this.f56572r = 2;
                                                            this.f56568n.f54645h = 2;
                                                            break;
                                                        case 38:
                                                            m19429m(1);
                                                            this.f56572r = 3;
                                                            this.f56568n.f54645h = 3;
                                                            break;
                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                            m19429m(1);
                                                            this.f56572r = 4;
                                                            this.f56568n.f54645h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.f56571q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                            this.f56569o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1) {
                                                                                m19428l();
                                                                            } else {
                                                                                m19428l();
                                                                            }
                                                                            break;
                                                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                            if (i4 == 1) {
                                                                                oo0 oo0Var112 = this.f56568n;
                                                                                arrayList = oo0Var112.f54639b;
                                                                                arrayList.add(oo0Var112.m18180d());
                                                                                oo0Var112.f54640c.setLength(0);
                                                                                oo0Var112.f54638a.clear();
                                                                                iMin = Math.min(oo0Var112.f54645h, oo0Var112.f54641d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m19428l();
                                                                            break;
                                                                        case 47:
                                                                            this.f56569o = m19427k();
                                                                            m19428l();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f56568n.m18178b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m19429m(3);
                                                }
                                            }
                                        } else {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m19429m(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                            m19429m(1);
                                                                            this.f56572r = 2;
                                                                            this.f56568n.f54645h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m19429m(1);
                                                                            this.f56572r = 3;
                                                                            this.f56568n.f54645h = 3;
                                                                            break;
                                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                            m19429m(1);
                                                                            this.f56572r = 4;
                                                                            this.f56568n.f54645h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.f56571q;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                            this.f56569o = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m19428l();
                                                                                            } else {
                                                                                                m19428l();
                                                                                            }
                                                                                            break;
                                                                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                oo0 oo0Var113 = this.f56568n;
                                                                                                arrayList = oo0Var113.f54639b;
                                                                                                arrayList.add(oo0Var113.m18180d());
                                                                                                oo0Var113.f54640c.setLength(0);
                                                                                                oo0Var113.f54638a.clear();
                                                                                                iMin = Math.min(oo0Var113.f54645h, oo0Var113.f54641d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m19428l();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f56569o = m19427k();
                                                                                            m19428l();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f56568n.m18178b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m19429m(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m19429m(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 2;
                                                                        this.f56568n.f54645h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19429m(1);
                                                                        this.f56572r = 3;
                                                                        this.f56568n.f54645h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 4;
                                                                        this.f56568n.f54645h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f56571q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f56569o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m19428l();
                                                                                        } else {
                                                                                            m19428l();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            oo0 oo0Var114 = this.f56568n;
                                                                                            arrayList = oo0Var114.f54639b;
                                                                                            arrayList.add(oo0Var114.m18180d());
                                                                                            oo0Var114.f54640c.setLength(0);
                                                                                            oo0Var114.f54638a.clear();
                                                                                            iMin = Math.min(oo0Var114.f54645h, oo0Var114.f54641d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19428l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f56569o = m19427k();
                                                                                        m19428l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f56568n.m18178b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19429m(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m19429m(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 2;
                                                                        this.f56568n.f54645h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19429m(1);
                                                                        this.f56572r = 3;
                                                                        this.f56568n.f54645h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 4;
                                                                        this.f56568n.f54645h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f56571q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f56569o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m19428l();
                                                                                        } else {
                                                                                            m19428l();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            oo0 oo0Var115 = this.f56568n;
                                                                                            arrayList = oo0Var115.f54639b;
                                                                                            arrayList.add(oo0Var115.m18180d());
                                                                                            oo0Var115.f54640c.setLength(0);
                                                                                            oo0Var115.f54638a.clear();
                                                                                            iMin = Math.min(oo0Var115.f54645h, oo0Var115.f54641d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19428l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f56569o = m19427k();
                                                                                        m19428l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f56568n.m18178b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19429m(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var116 = this.f56568n;
                                                                                        arrayList = oo0Var116.f54639b;
                                                                                        arrayList.add(oo0Var116.m18180d());
                                                                                        oo0Var116.f54640c.setLength(0);
                                                                                        oo0Var116.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var116.f54645h, oo0Var116.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m19429m(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 2;
                                                                        this.f56568n.f54645h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19429m(1);
                                                                        this.f56572r = 3;
                                                                        this.f56568n.f54645h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 4;
                                                                        this.f56568n.f54645h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f56571q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f56569o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m19428l();
                                                                                        } else {
                                                                                            m19428l();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            oo0 oo0Var117 = this.f56568n;
                                                                                            arrayList = oo0Var117.f54639b;
                                                                                            arrayList.add(oo0Var117.m18180d());
                                                                                            oo0Var117.f54640c.setLength(0);
                                                                                            oo0Var117.f54638a.clear();
                                                                                            iMin = Math.min(oo0Var117.f54645h, oo0Var117.f54641d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19428l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f56569o = m19427k();
                                                                                        m19428l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f56568n.m18178b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19429m(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var118 = this.f56568n;
                                                                                        arrayList = oo0Var118.f54639b;
                                                                                        arrayList.add(oo0Var118.m18180d());
                                                                                        oo0Var118.f54640c.setLength(0);
                                                                                        oo0Var118.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var118.f54645h, oo0Var118.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var119 = this.f56568n;
                                                                                        arrayList = oo0Var119.f54639b;
                                                                                        arrayList.add(oo0Var119.m18180d());
                                                                                        oo0Var119.f54640c.setLength(0);
                                                                                        oo0Var119.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var119.f54645h, oo0Var119.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m19429m(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                m19429m(1);
                                                                this.f56572r = 2;
                                                                this.f56568n.f54645h = 2;
                                                                break;
                                                            case 38:
                                                                m19429m(1);
                                                                this.f56572r = 3;
                                                                this.f56568n.f54645h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                m19429m(1);
                                                                this.f56572r = 4;
                                                                this.f56568n.f54645h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f56571q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f56569o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m19428l();
                                                                                } else {
                                                                                    m19428l();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    oo0 oo0Var1110 = this.f56568n;
                                                                                    arrayList = oo0Var1110.f54639b;
                                                                                    arrayList.add(oo0Var1110.m18180d());
                                                                                    oo0Var1110.f54640c.setLength(0);
                                                                                    oo0Var1110.f54638a.clear();
                                                                                    iMin = Math.min(oo0Var1110.f54645h, oo0Var1110.f54641d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19428l();
                                                                                break;
                                                                            case 47:
                                                                                this.f56569o = m19427k();
                                                                                m19428l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f56568n.m18178b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19429m(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m19429m(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 2;
                                                                        this.f56568n.f54645h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19429m(1);
                                                                        this.f56572r = 3;
                                                                        this.f56568n.f54645h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        m19429m(1);
                                                                        this.f56572r = 4;
                                                                        this.f56568n.f54645h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f56571q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f56569o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m19428l();
                                                                                        } else {
                                                                                            m19428l();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            oo0 oo0Var1111 = this.f56568n;
                                                                                            arrayList = oo0Var1111.f54639b;
                                                                                            arrayList.add(oo0Var1111.m18180d());
                                                                                            oo0Var1111.f54640c.setLength(0);
                                                                                            oo0Var1111.f54638a.clear();
                                                                                            iMin = Math.min(oo0Var1111.f54645h, oo0Var1111.f54641d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19428l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f56569o = m19427k();
                                                                                        m19428l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f56568n.m18178b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19429m(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var1112 = this.f56568n;
                                                                                        arrayList = oo0Var1112.f54639b;
                                                                                        arrayList.add(oo0Var1112.m18180d());
                                                                                        oo0Var1112.f54640c.setLength(0);
                                                                                        oo0Var1112.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var1112.f54645h, oo0Var1112.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var1113 = this.f56568n;
                                                                                        arrayList = oo0Var1113.f54639b;
                                                                                        arrayList.add(oo0Var1113.m18180d());
                                                                                        oo0Var1113.f54640c.setLength(0);
                                                                                        oo0Var1113.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var1113.f54645h, oo0Var1113.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m19429m(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                m19429m(1);
                                                                this.f56572r = 2;
                                                                this.f56568n.f54645h = 2;
                                                                break;
                                                            case 38:
                                                                m19429m(1);
                                                                this.f56572r = 3;
                                                                this.f56568n.f54645h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                m19429m(1);
                                                                this.f56572r = 4;
                                                                this.f56568n.f54645h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f56571q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f56569o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m19428l();
                                                                                } else {
                                                                                    m19428l();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    oo0 oo0Var1114 = this.f56568n;
                                                                                    arrayList = oo0Var1114.f54639b;
                                                                                    arrayList.add(oo0Var1114.m18180d());
                                                                                    oo0Var1114.f54640c.setLength(0);
                                                                                    oo0Var1114.f54638a.clear();
                                                                                    iMin = Math.min(oo0Var1114.f54645h, oo0Var1114.f54641d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19428l();
                                                                                break;
                                                                            case 47:
                                                                                this.f56569o = m19427k();
                                                                                m19428l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f56568n.m18178b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19429m(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m19429m(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 2;
                                                                    this.f56568n.f54645h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19429m(1);
                                                                    this.f56572r = 3;
                                                                    this.f56568n.f54645h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    m19429m(1);
                                                                    this.f56572r = 4;
                                                                    this.f56568n.f54645h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f56571q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f56569o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m19428l();
                                                                                    } else {
                                                                                        m19428l();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        oo0 oo0Var1115 = this.f56568n;
                                                                                        arrayList = oo0Var1115.f54639b;
                                                                                        arrayList.add(oo0Var1115.m18180d());
                                                                                        oo0Var1115.f54640c.setLength(0);
                                                                                        oo0Var1115.f54638a.clear();
                                                                                        iMin = Math.min(oo0Var1115.f54645h, oo0Var1115.f54641d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19428l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f56569o = m19427k();
                                                                                    m19428l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f56568n.m18178b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19429m(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m19429m(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                m19429m(1);
                                                                this.f56572r = 2;
                                                                this.f56568n.f54645h = 2;
                                                                break;
                                                            case 38:
                                                                m19429m(1);
                                                                this.f56572r = 3;
                                                                this.f56568n.f54645h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                m19429m(1);
                                                                this.f56572r = 4;
                                                                this.f56568n.f54645h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f56571q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f56569o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m19428l();
                                                                                } else {
                                                                                    m19428l();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    oo0 oo0Var1116 = this.f56568n;
                                                                                    arrayList = oo0Var1116.f54639b;
                                                                                    arrayList.add(oo0Var1116.m18180d());
                                                                                    oo0Var1116.f54640c.setLength(0);
                                                                                    oo0Var1116.f54638a.clear();
                                                                                    iMin = Math.min(oo0Var1116.f54645h, oo0Var1116.f54641d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19428l();
                                                                                break;
                                                                            case 47:
                                                                                this.f56569o = m19427k();
                                                                                m19428l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f56568n.m18178b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19429m(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m19429m(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                m19429m(1);
                                                                this.f56572r = 2;
                                                                this.f56568n.f54645h = 2;
                                                                break;
                                                            case 38:
                                                                m19429m(1);
                                                                this.f56572r = 3;
                                                                this.f56568n.f54645h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                m19429m(1);
                                                                this.f56572r = 4;
                                                                this.f56568n.f54645h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f56571q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f56569o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m19428l();
                                                                                } else {
                                                                                    m19428l();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    oo0 oo0Var1117 = this.f56568n;
                                                                                    arrayList = oo0Var1117.f54639b;
                                                                                    arrayList.add(oo0Var1117.m18180d());
                                                                                    oo0Var1117.f54640c.setLength(0);
                                                                                    oo0Var1117.f54638a.clear();
                                                                                    iMin = Math.min(oo0Var1117.f54645h, oo0Var1117.f54641d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19428l();
                                                                                break;
                                                                            case 47:
                                                                                this.f56569o = m19427k();
                                                                                m19428l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f56568n.m18178b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19429m(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    m19429m(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                            m19429m(1);
                                                            this.f56572r = 2;
                                                            this.f56568n.f54645h = 2;
                                                            break;
                                                        case 38:
                                                            m19429m(1);
                                                            this.f56572r = 3;
                                                            this.f56568n.f54645h = 3;
                                                            break;
                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                            m19429m(1);
                                                            this.f56572r = 4;
                                                            this.f56568n.f54645h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.f56571q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                            this.f56569o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1) {
                                                                                m19428l();
                                                                            } else {
                                                                                m19428l();
                                                                            }
                                                                            break;
                                                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                            if (i4 == 1) {
                                                                                oo0 oo0Var1118 = this.f56568n;
                                                                                arrayList = oo0Var1118.f54639b;
                                                                                arrayList.add(oo0Var1118.m18180d());
                                                                                oo0Var1118.f54640c.setLength(0);
                                                                                oo0Var1118.f54638a.clear();
                                                                                iMin = Math.min(oo0Var1118.f54645h, oo0Var1118.f54641d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m19428l();
                                                                            break;
                                                                        case 47:
                                                                            this.f56569o = m19427k();
                                                                            m19428l();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f56568n.m18178b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m19429m(3);
                                                }
                                            }
                                        }
                                    } else {
                                        oo0 oo0Var20 = this.f56568n;
                                        iArr = f56556C;
                                        oo0Var20.m18177a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.f56568n.m18177a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            m19428l();
                            z2 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p000.wo0, p000.k32
    /* JADX INFO: renamed from: i */
    public final vo0 mo14784d() {
        vo0 vo0Var;
        vo0 vo0VarMo14784d = super.mo14784d();
        if (vo0VarMo14784d != null) {
            return vo0VarMo14784d;
        }
        long j = this.f56566l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.f56579y;
        if (j2 == -9223372036854775807L || this.f67115e - j2 < j || (vo0Var = (vo0) this.f67112b.pollFirst()) == null) {
            return null;
        }
        this.f56569o = Collections.EMPTY_LIST;
        this.f56579y = -9223372036854775807L;
        vj6 vj6VarMo19423g = mo19423g();
        long j3 = this.f67115e;
        vo0Var.f52260c = j3;
        vo0Var.f65686e = vj6VarMo19423g;
        vo0Var.f65687f = j3;
        return vo0Var;
    }

    @Override // p000.wo0
    /* JADX INFO: renamed from: j */
    public final boolean mo19426j() {
        return this.f56569o != this.f56570p;
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList m19427k() {
        ArrayList arrayList = this.f56567m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            cs1 cs1VarM18179c = ((oo0) arrayList.get(i)).m18179c(Integer.MIN_VALUE);
            arrayList2.add(cs1VarM18179c);
            if (cs1VarM18179c != null) {
                iMin = Math.min(iMin, cs1VarM18179c.f34472i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            cs1 cs1VarM18179c2 = (cs1) arrayList2.get(i2);
            if (cs1VarM18179c2 != null) {
                if (cs1VarM18179c2.f34472i != iMin) {
                    cs1VarM18179c2 = ((oo0) arrayList.get(i2)).m18179c(iMin);
                    cs1VarM18179c2.getClass();
                }
                arrayList3.add(cs1VarM18179c2);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: l */
    public final void m19428l() {
        oo0 oo0Var = this.f56568n;
        oo0Var.f54644g = this.f56571q;
        oo0Var.f54638a.clear();
        oo0Var.f54639b.clear();
        oo0Var.f54640c.setLength(0);
        oo0Var.f54641d = 15;
        oo0Var.f54642e = 0;
        oo0Var.f54643f = 0;
        ArrayList arrayList = this.f56567m;
        arrayList.clear();
        arrayList.add(this.f56568n);
    }

    /* JADX INFO: renamed from: m */
    public final void m19429m(int i) {
        int i2 = this.f56571q;
        if (i2 == i) {
            return;
        }
        this.f56571q = i;
        if (i != 3) {
            m19428l();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f56569o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f56567m;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((oo0) arrayList.get(i3)).f54644g = i;
            i3++;
        }
    }
}
