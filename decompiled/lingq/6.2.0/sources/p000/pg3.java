package p000;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C0713b;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class pg3 implements hy2 {

    /* JADX INFO: renamed from: M */
    public static final byte[] f56085M = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: N */
    public static final C0713b f56086N;

    /* JADX INFO: renamed from: A */
    public og3 f56087A;

    /* JADX INFO: renamed from: B */
    public int f56088B;

    /* JADX INFO: renamed from: C */
    public int f56089C;

    /* JADX INFO: renamed from: D */
    public int f56090D;

    /* JADX INFO: renamed from: E */
    public boolean f56091E;

    /* JADX INFO: renamed from: F */
    public boolean f56092F;

    /* JADX INFO: renamed from: G */
    public jy2 f56093G;

    /* JADX INFO: renamed from: H */
    public n8a[] f56094H;

    /* JADX INFO: renamed from: I */
    public n8a[] f56095I;

    /* JADX INFO: renamed from: J */
    public boolean f56096J;

    /* JADX INFO: renamed from: K */
    public boolean f56097K;

    /* JADX INFO: renamed from: L */
    public long f56098L;

    /* JADX INFO: renamed from: a */
    public final bn9 f56099a;

    /* JADX INFO: renamed from: b */
    public final int f56100b;

    /* JADX INFO: renamed from: c */
    public final List f56101c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f56102d;

    /* JADX INFO: renamed from: e */
    public final k47 f56103e;

    /* JADX INFO: renamed from: f */
    public final k47 f56104f;

    /* JADX INFO: renamed from: g */
    public final k47 f56105g;

    /* JADX INFO: renamed from: h */
    public final byte[] f56106h;

    /* JADX INFO: renamed from: i */
    public final k47 f56107i;

    /* JADX INFO: renamed from: j */
    public final C3156jq f56108j;

    /* JADX INFO: renamed from: k */
    public final k47 f56109k;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque f56110l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque f56111m;

    /* JADX INFO: renamed from: n */
    public final g68 f56112n;

    /* JADX INFO: renamed from: o */
    public final v11 f56113o;

    /* JADX INFO: renamed from: p */
    public ImmutableList f56114p;

    /* JADX INFO: renamed from: q */
    public int f56115q;

    /* JADX INFO: renamed from: r */
    public int f56116r;

    /* JADX INFO: renamed from: s */
    public long f56117s;

    /* JADX INFO: renamed from: t */
    public int f56118t;

    /* JADX INFO: renamed from: u */
    public k47 f56119u;

    /* JADX INFO: renamed from: v */
    public long f56120v;

    /* JADX INFO: renamed from: w */
    public int f56121w;

    /* JADX INFO: renamed from: x */
    public long f56122x;

    /* JADX INFO: renamed from: y */
    public long f56123y;

    /* JADX INFO: renamed from: z */
    public long f56124z;

    static {
        lc3 lc3Var = new lc3();
        lc3Var.f49453n = ez5.m11402l("application/x-emsg");
        f56086N = new C0713b(lc3Var);
    }

    public pg3(bn9 bn9Var, int i) {
        ImmutableList immutableListM6289v = ImmutableList.m6289v();
        this.f56099a = bn9Var;
        this.f56100b = i;
        this.f56101c = Collections.unmodifiableList(immutableListM6289v);
        this.f56108j = new C3156jq(25);
        this.f56109k = new k47(16);
        this.f56103e = new k47(zuc.f72211a);
        this.f56104f = new k47(6);
        this.f56105g = new k47();
        byte[] bArr = new byte[16];
        this.f56106h = bArr;
        this.f56107i = new k47(bArr);
        this.f56110l = new ArrayDeque();
        this.f56111m = new ArrayDeque();
        this.f56102d = new SparseArray();
        this.f56114p = ImmutableList.m6289v();
        this.f56123y = -9223372036854775807L;
        this.f56122x = -9223372036854775807L;
        this.f56124z = -9223372036854775807L;
        this.f56093G = jy2.f46384t;
        this.f56094H = new n8a[0];
        this.f56095I = new n8a[0];
        this.f56112n = new g68(new C3440oy(this, 17));
        this.f56113o = new v11(0);
        this.f56098L = -1L;
    }

    /* JADX INFO: renamed from: h */
    public static DrmInitData m19121h(List list) {
        UUID[] uuidArr;
        ck6 ck6Var;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            f46 f46Var = (f46) list.get(i2);
            if (f46Var.f8576b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = f46Var.f38414c.f46700a;
                k47 k47Var = new k47(bArr);
                if (k47Var.f46702c < 32) {
                    ck6Var = null;
                } else {
                    k47Var.m14818M(i);
                    int iM14820a = k47Var.m14820a();
                    int iM14829m = k47Var.m14829m();
                    if (iM14829m != iM14820a) {
                        ss5.m21707d0("PsshAtomUtil", "Advertised atom size (" + iM14829m + ") does not match buffer size: " + iM14820a);
                    } else {
                        int iM14829m2 = k47Var.m14829m();
                        if (iM14829m2 != 1886614376) {
                            hn1.m13364n("Atom type is not pssh: ", iM14829m2, "PsshAtomUtil");
                        } else {
                            int iM426e = ai0.m426e(k47Var.m14829m());
                            if (iM426e > 1) {
                                hn1.m13364n("Unsupported pssh version: ", iM426e, "PsshAtomUtil");
                            } else {
                                UUID uuid = new UUID(k47Var.m14836t(), k47Var.m14836t());
                                if (iM426e == 1) {
                                    int iM14809D = k47Var.m14809D();
                                    uuidArr = new UUID[iM14809D];
                                    int i3 = i;
                                    while (i3 < iM14809D) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(k47Var.m14836t(), k47Var.m14836t());
                                        i3 = i4 + 1;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                int iM14809D2 = k47Var.m14809D();
                                int iM14820a2 = k47Var.m14820a();
                                if (iM14809D2 != iM14820a2) {
                                    ss5.m21707d0("PsshAtomUtil", "Atom data size (" + iM14809D2 + ") does not match the bytes left: " + iM14820a2);
                                } else {
                                    byte[] bArr2 = new byte[iM14809D2];
                                    k47Var.m14827k(bArr2, 0, iM14809D2);
                                    ck6Var = new ck6(uuid, iM426e, bArr2, uuidArr);
                                }
                            }
                        }
                    }
                    ck6Var = null;
                }
                UUID uuid2 = ck6Var == null ? null : (UUID) ck6Var.f10194b;
                if (uuid2 == null) {
                    ss5.m21707d0("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid2, null, "video/mp4", bArr));
                }
            }
            i2++;
            i = 0;
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
    }

    /* JADX INFO: renamed from: i */
    public static void m19122i(k47 k47Var, int i, i8a i8aVar) throws ParserException {
        k47Var.m14818M(i + 8);
        int iM14829m = k47Var.m14829m();
        byte[] bArr = ai0.f687a;
        if ((iM14829m & 1) != 0) {
            throw ParserException.m2517b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM14829m & 2) != 0;
        int iM14809D = k47Var.m14809D();
        if (iM14809D == 0) {
            Arrays.fill(i8aVar.f43704l, 0, i8aVar.f43697e, false);
            return;
        }
        int i2 = i8aVar.f43697e;
        k47 k47Var2 = i8aVar.f43706n;
        if (iM14809D != i2) {
            StringBuilder sbM22998u = ux5.m22998u("Senc sample count ", iM14809D, " is different from fragment sample count");
            sbM22998u.append(i8aVar.f43697e);
            throw ParserException.m2516a(null, sbM22998u.toString());
        }
        Arrays.fill(i8aVar.f43704l, 0, iM14809D, z);
        k47Var2.m14815J(k47Var.m14820a());
        i8aVar.f43703k = true;
        i8aVar.f43707o = true;
        k47Var.m14827k(k47Var2.f46700a, 0, k47Var2.f46702c);
        k47Var2.m14818M(0);
        i8aVar.f43707o = false;
    }

    /* JADX INFO: renamed from: j */
    public static Pair m19123j(long j, k47 k47Var) throws ParserException {
        long jM14811F;
        long jM14811F2;
        k47 k47Var2 = k47Var;
        k47Var2.m14818M(8);
        int iM426e = ai0.m426e(k47Var2.m14829m());
        k47Var2.m14819N(4);
        long jM14807B = k47Var2.m14807B();
        if (iM426e == 0) {
            jM14811F = k47Var2.m14807B();
            jM14811F2 = k47Var2.m14807B();
        } else {
            jM14811F = k47Var2.m14811F();
            jM14811F2 = k47Var2.m14811F();
        }
        long j2 = jM14811F2 + j;
        String str = uma.f64080a;
        long jM22803H = uma.m22803H(jM14811F, 1000000L, jM14807B, RoundingMode.DOWN);
        k47Var2.m14819N(2);
        int iM14812G = k47Var2.m14812G();
        int[] iArr = new int[iM14812G];
        long[] jArr = new long[iM14812G];
        long[] jArr2 = new long[iM14812G];
        long[] jArr3 = new long[iM14812G];
        long j3 = j2;
        long j4 = jM22803H;
        int i = 0;
        while (i < iM14812G) {
            int iM14829m = k47Var2.m14829m();
            if ((Integer.MIN_VALUE & iM14829m) != 0) {
                throw ParserException.m2516a(null, "Unhandled indirect reference");
            }
            long jM14807B2 = k47Var2.m14807B();
            iArr[i] = iM14829m & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jM14811F += jM14807B2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jM22803H2 = uma.m22803H(jM14811F, 1000000L, jM14807B, RoundingMode.DOWN);
            jArr4[i] = jM22803H2 - jArr5[i];
            k47Var2.m14819N(4);
            j3 += (long) iArr[i];
            i++;
            iM14812G = iM14812G;
            k47Var2 = k47Var;
            j4 = jM22803H2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jM22803H), new u11(iArr, jArr, jArr2, jArr3));
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:116:0x0236  */
    /* JADX WARN: Code duplicated, block: B:139:0x0280  */
    /* JADX WARN: Code duplicated, block: B:140:0x0282  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        g68 g68Var;
        k47 k47Var;
        ArrayDeque arrayDeque;
        int i;
        og3 og3Var;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        String strM25795c;
        byte b;
        int iMo2533c;
        int i6;
        String strM14837u;
        String strM14837u2;
        long jM22803H;
        long jM14807B;
        long j;
        iy2 iy2Var2 = iy2Var;
        while (true) {
            int i7 = this.f56115q;
            ArrayDeque arrayDeque2 = this.f56110l;
            g68Var = this.f56112n;
            k47Var = this.f56107i;
            v11 v11Var = this.f56113o;
            SparseArray sparseArray = this.f56102d;
            int i8 = 1;
            if (i7 != 0) {
                arrayDeque = this.f56111m;
                i = this.f56100b;
                if (i7 != 1) {
                    long j2 = Long.MAX_VALUE;
                    if (i7 != 2) {
                        og3Var = this.f56087A;
                        if (og3Var != null) {
                            i2 = 1;
                            i3 = 8;
                            i4 = 0;
                            break;
                        }
                        int size = sparseArray.size();
                        og3 og3Var2 = null;
                        int i9 = 0;
                        while (i9 < size) {
                            og3 og3Var3 = (og3) sparseArray.valueAt(i9);
                            boolean z2 = og3Var3.f54317m;
                            int i10 = i8;
                            i8a i8aVar = og3Var3.f54306b;
                            if ((z2 || og3Var3.f54310f != og3Var3.f54308d.f54016b) && (!z2 || og3Var3.f54312h != i8aVar.f43696d)) {
                                long j3 = !z2 ? og3Var3.f54308d.f54017c[og3Var3.f54310f] : i8aVar.f43698f[og3Var3.f54312h];
                                if (j3 < j2) {
                                    j2 = j3;
                                    og3Var2 = og3Var3;
                                }
                            }
                            i9++;
                            i8 = i10;
                        }
                        i2 = i8;
                        i3 = 8;
                        i4 = 0;
                        if (og3Var2 != null) {
                            int position = (int) ((!og3Var2.f54317m ? og3Var2.f54308d.f54017c[og3Var2.f54310f] : og3Var2.f54306b.f43698f[og3Var2.f54312h]) - iy2Var2.getPosition());
                            if (position < 0) {
                                ss5.m21707d0("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position = 0;
                            }
                            iy2Var2.mo13082k(position);
                            this.f56087A = og3Var2;
                            og3Var = og3Var2;
                            break;
                        }
                        int position2 = (int) (this.f56120v - iy2Var2.getPosition());
                        if (position2 < 0) {
                            throw ParserException.m2516a(null, "Offset to end of mdat was negative.");
                        }
                        iy2Var2.mo13082k(position2);
                        m19124g();
                    } else {
                        int size2 = sparseArray.size();
                        og3 og3Var4 = null;
                        for (int i11 = 0; i11 < size2; i11++) {
                            i8a i8aVar2 = ((og3) sparseArray.valueAt(i11)).f54306b;
                            if (i8aVar2.f43707o) {
                                long j4 = i8aVar2.f43695c;
                                if (j4 < j2) {
                                    og3Var4 = (og3) sparseArray.valueAt(i11);
                                    j2 = j4;
                                }
                            }
                        }
                        if (og3Var4 == null) {
                            this.f56115q = 3;
                        } else {
                            int position3 = (int) (j2 - iy2Var2.getPosition());
                            if (position3 < 0) {
                                throw ParserException.m2516a(null, "Offset to encryption data was negative.");
                            }
                            iy2Var2.mo13082k(position3);
                            i8a i8aVar3 = og3Var4.f54306b;
                            k47 k47Var2 = i8aVar3.f43706n;
                            iy2Var2.readFully(k47Var2.f46700a, 0, k47Var2.f46702c);
                            k47Var2.m14818M(0);
                            i8aVar3.f43707o = false;
                        }
                    }
                } else {
                    int i12 = (int) (this.f56117s - ((long) this.f56118t));
                    k47 k47Var3 = this.f56119u;
                    if (k47Var3 != null) {
                        iy2Var2.readFully(k47Var3.f46700a, 8, i12);
                        int i13 = this.f56116r;
                        f46 f46Var = new f46(i13, k47Var3);
                        if (!arrayDeque2.isEmpty()) {
                            ((e46) arrayDeque2.peek()).f36700d.add(f46Var);
                        } else if (i13 == 1936286840) {
                            Pair pairM19123j = m19123j(iy2Var2.getPosition(), k47Var3);
                            v11Var.m23039a((u11) pairM19123j.second);
                            this.f56124z = ((Long) pairM19123j.first).longValue();
                            if (!this.f56096J) {
                                this.f56093G.mo2558q((st8) pairM19123j.second);
                                this.f56096J = true;
                            } else if ((i & 256) != 0 && !this.f56097K && v11Var.f64686a.size() > 1) {
                                this.f56098L = iy2Var2.getPosition();
                            }
                        } else if (i13 == 1701671783 && this.f56094H.length != 0) {
                            k47Var3.m14818M(8);
                            int iM426e = ai0.m426e(k47Var3.m14829m());
                            long j5 = -9223372036854775807L;
                            if (iM426e == 0) {
                                strM14837u = k47Var3.m14837u();
                                strM14837u.getClass();
                                strM14837u2 = k47Var3.m14837u();
                                strM14837u2.getClass();
                                long jM14807B2 = k47Var3.m14807B();
                                long jM14807B3 = k47Var3.m14807B();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jM22803H2 = uma.m22803H(jM14807B3, 1000000L, jM14807B2, roundingMode);
                                long j6 = this.f56124z;
                                long j7 = j6 != -9223372036854775807L ? j6 + jM22803H2 : -9223372036854775807L;
                                jM22803H = uma.m22803H(k47Var3.m14807B(), 1000L, jM14807B2, roundingMode);
                                jM14807B = k47Var3.m14807B();
                                j5 = jM22803H2;
                                j = j7;
                            } else if (iM426e != 1) {
                                hn1.m13364n("Skipping unsupported emsg version: ", iM426e, "FragmentedMp4Extractor");
                            } else {
                                long jM14807B4 = k47Var3.m14807B();
                                long jM14811F = k47Var3.m14811F();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long jM22803H3 = uma.m22803H(jM14811F, 1000000L, jM14807B4, roundingMode2);
                                jM22803H = uma.m22803H(k47Var3.m14807B(), 1000L, jM14807B4, roundingMode2);
                                jM14807B = k47Var3.m14807B();
                                strM14837u = k47Var3.m14837u();
                                strM14837u.getClass();
                                strM14837u2 = k47Var3.m14837u();
                                strM14837u2.getClass();
                                j = jM22803H3;
                            }
                            byte[] bArr = new byte[k47Var3.m14820a()];
                            k47Var3.m14827k(bArr, 0, k47Var3.m14820a());
                            C3156jq c3156jq = this.f56108j;
                            DataOutputStream dataOutputStream = (DataOutputStream) c3156jq.f45991b;
                            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c3156jq.f45990a;
                            byteArrayOutputStream.reset();
                            try {
                                dataOutputStream.writeBytes(strM14837u);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(strM14837u2);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(jM22803H);
                                dataOutputStream.writeLong(jM14807B);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                k47 k47Var4 = new k47(byteArrayOutputStream.toByteArray());
                                int iM14820a = k47Var4.m14820a();
                                for (n8a n8aVar : this.f56094H) {
                                    k47Var4.m14818M(0);
                                    n8aVar.mo2535e(iM14820a, k47Var4);
                                }
                                if (j == -9223372036854775807L) {
                                    arrayDeque.addLast(new ng3(iM14820a, j5, true));
                                    this.f56121w += iM14820a;
                                } else if (arrayDeque.isEmpty()) {
                                    for (n8a n8aVar2 : this.f56094H) {
                                        n8aVar2.mo2531a(j, 1, iM14820a, 0, null);
                                    }
                                } else {
                                    arrayDeque.addLast(new ng3(iM14820a, j, false));
                                    this.f56121w += iM14820a;
                                }
                            } catch (IOException e) {
                                v63.m23141s(e);
                                return 0;
                            }
                        }
                        iy2Var2 = iy2Var;
                    } else {
                        iy2Var2.mo13082k(i12);
                    }
                    m19125k(iy2Var2.getPosition());
                }
            } else {
                int i14 = this.f56118t;
                long length = 0;
                k47 k47Var5 = this.f56109k;
                if (i14 == 0) {
                    if (!iy2Var2.mo13074a(k47Var5.f46700a, 0, 8, true)) {
                        long j8 = this.f56098L;
                        if (j8 == -1) {
                            g68Var.m12383b(0);
                            return -1;
                        }
                        n63Var.f52394a = j8;
                        this.f56098L = -1L;
                        jy2 jy2Var = this.f56093G;
                        v11Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (u11 u11Var : v11Var.f64686a.values()) {
                            arrayList.add(u11Var.f63235b);
                            arrayList2.add(u11Var.f63236c);
                            arrayList3.add(u11Var.f63237d);
                            arrayList4.add(u11Var.f63238e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            length += (long) iArr2.length;
                        }
                        int i15 = (int) length;
                        bna.m3963n(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i15));
                        int[] iArr3 = new int[i15];
                        int length2 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
                            length2 += iArr4.length;
                        }
                        jy2Var.mo2558q(new u11(iArr3, hnb.m13379a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), hnb.m13379a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), hnb.m13379a((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        this.f56097K = true;
                        return 1;
                    }
                    this.f56118t = 8;
                    k47Var5.m14818M(0);
                    this.f56117s = k47Var5.m14807B();
                    this.f56116r = k47Var5.m14829m();
                }
                long j9 = this.f56117s;
                if (j9 == 1) {
                    iy2Var2.readFully(k47Var5.f46700a, 8, 8);
                    this.f56118t += 8;
                    this.f56117s = k47Var5.m14811F();
                } else if (j9 == 0) {
                    long length3 = iy2Var2.getLength();
                    if (length3 == -1 && !arrayDeque2.isEmpty()) {
                        length3 = ((e46) arrayDeque2.peek()).f36699c;
                    }
                    if (length3 != -1) {
                        this.f56117s = (length3 - iy2Var2.getPosition()) + ((long) this.f56118t);
                    }
                }
                long j10 = this.f56117s;
                int i16 = this.f56118t;
                long j11 = i16;
                if (j10 < j11) {
                    if (this.f56116r != 1718773093 || i16 != 8) {
                        throw ParserException.m2517b("Atom size less than header length (unsupported).");
                    }
                    this.f56117s = j11;
                }
                if (this.f56098L != -1) {
                    int i17 = this.f56116r;
                    long j12 = this.f56117s;
                    if (i17 == 1936286840) {
                        k47Var.m14815J((int) j12);
                        System.arraycopy(k47Var5.f46700a, 0, k47Var.f46700a, 0, 8);
                        iy2Var2.readFully(k47Var.f46700a, 8, (int) (this.f56117s - ((long) this.f56118t)));
                        v11Var.m23039a((u11) m19123j(iy2Var2.mo13077e(), k47Var).second);
                    } else {
                        iy2Var2.mo13075c((int) (j12 - j11), true);
                    }
                    m19124g();
                } else {
                    long position4 = iy2Var2.getPosition() - ((long) this.f56118t);
                    int i18 = this.f56116r;
                    if ((i18 == 1836019558 || i18 == 1835295092) && !this.f56096J) {
                        this.f56093G.mo2558q(new h60(this.f56123y, position4));
                        this.f56096J = true;
                    }
                    if (this.f56116r == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            i8a i8aVar4 = ((og3) sparseArray.valueAt(i19)).f54306b;
                            i8aVar4.getClass();
                            i8aVar4.f43695c = position4;
                            i8aVar4.f43694b = position4;
                        }
                    }
                    int i20 = this.f56116r;
                    if (i20 == 1835295092) {
                        this.f56087A = null;
                        this.f56120v = position4 + this.f56117s;
                        this.f56115q = 2;
                    } else if (i20 == 1836019574 || i20 == 1953653099 || i20 == 1835297121 || i20 == 1835626086 || i20 == 1937007212 || i20 == 1836019558 || i20 == 1953653094 || i20 == 1836475768 || i20 == 1701082227 || i20 == 1835365473) {
                        long position5 = iy2Var2.getPosition();
                        long j13 = this.f56117s;
                        long j14 = (position5 + j13) - 8;
                        if (j13 != this.f56118t && this.f56116r == 1835365473) {
                            k47Var.m14815J(8);
                            iy2Var2.mo13085o(k47Var.f46700a, 0, 8);
                            ai0.m422a(k47Var);
                            iy2Var2.mo13082k(k47Var.f46701b);
                            iy2Var2.mo13080i();
                        }
                        arrayDeque2.push(new e46(this.f56116r, j14));
                        if (this.f56117s == this.f56118t) {
                            m19125k(j14);
                        } else {
                            m19124g();
                        }
                    } else if (i20 == 1751411826 || i20 == 1835296868 || i20 == 1836476516 || i20 == 1936286840 || i20 == 1937011556 || i20 == 1937011827 || i20 == 1668576371 || i20 == 1937011555 || i20 == 1937011578 || i20 == 1937013298 || i20 == 1937007471 || i20 == 1668232756 || i20 == 1937011571 || i20 == 1952867444 || i20 == 1952868452 || i20 == 1953196132 || i20 == 1953654136 || i20 == 1953658222 || i20 == 1886614376 || i20 == 1935763834 || i20 == 1935763823 || i20 == 1936027235 || i20 == 1970628964 || i20 == 1935828848 || i20 == 1936158820 || i20 == 1701606260 || i20 == 1835362404 || i20 == 1701671783 || i20 == 1969517665 || i20 == 1801812339 || i20 == 1768715124) {
                        if (this.f56118t != 8) {
                            throw ParserException.m2517b("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.f56117s > 2147483647L) {
                            throw ParserException.m2517b("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        k47 k47Var6 = new k47((int) this.f56117s);
                        System.arraycopy(k47Var5.f46700a, 0, k47Var6.f46700a, 0, 8);
                        this.f56119u = k47Var6;
                        this.f56115q = 1;
                    } else {
                        if (this.f56117s > 2147483647L) {
                            throw ParserException.m2517b("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f56119u = null;
                        this.f56115q = 1;
                    }
                }
            }
        }
        n8a n8aVar3 = og3Var.f54305a;
        i8a i8aVar5 = og3Var.f54306b;
        String str = "video/hevc";
        if (this.f56115q == 3) {
            this.f56088B = !og3Var.f54317m ? og3Var.f54308d.f54018d[og3Var.f54310f] : i8aVar5.f43700h[og3Var.f54310f];
            C0713b c0713b = og3Var.f54308d.f54015a.f40397g;
            this.f56091E = ((!Objects.equals(c0713b.f6406o, "video/avc") ? !(!Objects.equals(c0713b.f6406o, "video/hevc") || (i & 128) == 0) : (i & 64) != 0) ? i4 : i2) ^ 1;
            if (og3Var.f54310f < og3Var.f54313i) {
                iy2Var2.mo13082k(this.f56088B);
                h8a h8aVarM17973b = og3Var.m17973b();
                if (h8aVarM17973b != null) {
                    k47 k47Var7 = i8aVar5.f43706n;
                    int i21 = h8aVarM17973b.f41998d;
                    if (i21 != 0) {
                        k47Var7.m14819N(i21);
                    }
                    int i22 = og3Var.f54310f;
                    if (i8aVar5.f43703k && i8aVar5.f43704l[i22]) {
                        k47Var7.m14819N(k47Var7.m14812G() * 6);
                    }
                }
                if (!og3Var.m17974c()) {
                    this.f56087A = null;
                }
                this.f56115q = 3;
                return i4;
            }
            if (og3Var.f54308d.f54015a.f40398h == i2) {
                this.f56088B -= 8;
                iy2Var2.mo13082k(i3);
            }
            boolean zEquals = "audio/ac4".equals(og3Var.f54308d.f54015a.f40397g.f6406o);
            int i23 = this.f56088B;
            if (zEquals) {
                this.f56089C = og3Var.m17975d(i23, 7);
                wx1.m24195d(this.f56088B, k47Var);
                n8aVar3.mo2535e(7, k47Var);
                this.f56089C += 7;
                i6 = i4;
            } else {
                i6 = i4;
                this.f56089C = og3Var.m17975d(i23, i6);
            }
            this.f56088B += this.f56089C;
            this.f56115q = 4;
            this.f56090D = i6;
        }
        o8a o8aVar = og3Var.f54308d;
        g8a g8aVar = o8aVar.f54015a;
        long j15 = !og3Var.f54317m ? o8aVar.f54020f[og3Var.f54310f] : i8aVar5.f43701i[og3Var.f54310f];
        int i24 = g8aVar.f40401k;
        C0713b c0713b2 = g8aVar.f40397g;
        if (i24 == 0) {
            og3Var = og3Var;
            while (true) {
                int i25 = this.f56089C;
                int i26 = this.f56088B;
                if (i25 >= i26) {
                    break;
                }
                this.f56089C += n8aVar3.mo2533c(iy2Var2, i26 - i25, false);
            }
        } else {
            k47 k47Var8 = this.f56104f;
            byte[] bArr2 = k47Var8.f46700a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[r13] = 0;
            int i27 = 4 - i24;
            while (true) {
                og3Var = og3Var;
                if (this.f56089C < this.f56088B) {
                    int i28 = this.f56090D;
                    if (i28 == 0) {
                        if (this.f56095I.length > 0 || !this.f56091E) {
                            int iM25797e = zuc.m25797e(c0713b2);
                            if (i24 + iM25797e <= this.f56088B - this.f56089C) {
                                i5 = iM25797e;
                            } else {
                                i5 = 0;
                            }
                        } else {
                            i5 = 0;
                        }
                        iy2Var2.readFully(bArr2, i27, i24 + i5);
                        k47Var8.m14818M(0);
                        int iM14829m = k47Var8.m14829m();
                        if (iM14829m < 0) {
                            throw ParserException.m2516a(null, "Invalid NAL length");
                        }
                        this.f56090D = iM14829m - i5;
                        k47 k47Var9 = this.f56103e;
                        int i29 = i24;
                        k47Var9.m14818M(0);
                        n8aVar3.mo2535e(4, k47Var9);
                        this.f56089C += 4;
                        this.f56088B += i27;
                        if (this.f56095I.length > 0 && i5 > 0 && (strM25795c = zuc.m25795c(c0713b2)) != null) {
                            switch (strM25795c.hashCode()) {
                                case -1662541442:
                                    if (strM25795c.equals(str)) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1331836730:
                                    if (strM25795c.equals("video/avc")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1331856911:
                                    if (strM25795c.equals("video/vvc")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    if (((bArr2[4] & 126) >> 1) == 39) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    break;
                                case 1:
                                    if ((bArr2[4] & 31) == 6) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    break;
                                case 2:
                                    if (((bArr2[5] & 248) >> 3) == 23) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    break;
                                default:
                                    z = false;
                                    break;
                            }
                        } else {
                            z = false;
                        }
                        this.f56092F = z;
                        n8aVar3.mo2535e(i5, k47Var8);
                        this.f56089C += i5;
                        if (i5 > 0 && !this.f56091E && zuc.m25796d(bArr2, i5, c0713b2)) {
                            this.f56091E = true;
                        }
                        i24 = i29;
                    } else {
                        int i30 = i24;
                        if (this.f56092F) {
                            k47 k47Var10 = this.f56105g;
                            k47Var10.m14815J(i28);
                            iy2Var2.readFully(k47Var10.f46700a, 0, this.f56090D);
                            n8aVar3.mo2535e(this.f56090D, k47Var10);
                            int i31 = this.f56090D;
                            int iM25806n = zuc.m25806n(k47Var10.f46702c, k47Var10.f46700a);
                            k47Var10.m14818M(0);
                            k47Var10.m14817L(iM25806n);
                            int i32 = c0713b2.f6408q;
                            if (i32 == -1) {
                                if (g68Var.f40275e != 0) {
                                    g68Var.m12384c(0);
                                }
                            } else if (g68Var.f40275e != i32) {
                                g68Var.m12384c(i32);
                            }
                            g68Var.m12382a(j15, k47Var10);
                            if ((og3Var.m17972a() & 4) != 0) {
                                g68Var.m12383b(0);
                            }
                            iMo2533c = i31;
                        } else {
                            iMo2533c = n8aVar3.mo2533c(iy2Var2, i28, false);
                        }
                        this.f56089C += iMo2533c;
                        this.f56090D -= iMo2533c;
                        i24 = i30;
                        str = str;
                    }
                }
            }
        }
        int iM17972a = og3Var.m17972a();
        if (!this.f56091E) {
            iM17972a |= 67108864;
        }
        int i33 = iM17972a;
        h8a h8aVarM17973b2 = og3Var.m17973b();
        long j16 = j15;
        n8aVar3.mo2531a(j16, i33, this.f56088B, 0, h8aVarM17973b2 != null ? h8aVarM17973b2.f41997c : null);
        while (!arrayDeque.isEmpty()) {
            ng3 ng3Var = (ng3) arrayDeque.removeFirst();
            this.f56121w -= ng3Var.f52704c;
            long j17 = ng3Var.f52702a;
            if (ng3Var.f52703b) {
                j17 += j16;
            }
            long j18 = j17;
            for (n8a n8aVar4 : this.f56094H) {
                n8aVar4.mo2531a(j18, 1, ng3Var.f52704c, this.f56121w, null);
            }
        }
        if (!og3Var.m17974c()) {
            this.f56087A = null;
        }
        this.f56115q = 3;
        return 0;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        fd9 fd9VarM22973e = uwc.m22973e(iy2Var, true, false);
        this.f56114p = fd9VarM22973e != null ? ImmutableList.m6291y(fd9VarM22973e) : ImmutableList.m6289v();
        return fd9VarM22973e == null;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        SparseArray sparseArray = this.f56102d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((og3) sparseArray.valueAt(i)).m17976e();
        }
        this.f56111m.clear();
        this.f56121w = 0;
        this.f56112n.f40274d.clear();
        this.f56122x = j2;
        this.f56110l.clear();
        m19124g();
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: e */
    public final List mo13551e() {
        return this.f56114p;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        int i;
        int i2 = this.f56100b;
        if ((i2 & 32) == 0) {
            jy2Var = new nc0(jy2Var, this.f56099a);
        }
        this.f56093G = jy2Var;
        m19124g();
        n8a[] n8aVarArr = new n8a[2];
        this.f56094H = n8aVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            n8aVarArr[0] = this.f56093G.mo2555n(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        n8a[] n8aVarArr2 = (n8a[]) uma.m22799D(this.f56094H, i);
        this.f56094H = n8aVarArr2;
        for (n8a n8aVar : n8aVarArr2) {
            n8aVar.mo2537g(f56086N);
        }
        List list = this.f56101c;
        this.f56095I = new n8a[list.size()];
        while (i4 < this.f56095I.length) {
            n8a n8aVarMo2555n = this.f56093G.mo2555n(i3, 3);
            n8aVarMo2555n.mo2537g((C0713b) list.get(i4));
            this.f56095I[i4] = n8aVarMo2555n;
            i4++;
            i3++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m19124g() {
        this.f56115q = 0;
        this.f56118t = 0;
    }

    /* JADX WARN: Code duplicated, block: B:272:0x066d  */
    /* JADX INFO: renamed from: k */
    public final void m19125k(long j) throws ParserException {
        ey5 ey5Var;
        int i;
        long j2;
        t72 t72Var;
        int i2;
        t72 t72Var2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        boolean z;
        int i7;
        boolean z2;
        while (true) {
            ArrayDeque arrayDeque = this.f56110l;
            if (arrayDeque.isEmpty() || ((e46) arrayDeque.peek()).f36699c != j) {
                break;
            }
            e46 e46Var = (e46) arrayDeque.pop();
            int i8 = e46Var.f8576b;
            ArrayList arrayList4 = e46Var.f36701e;
            ArrayList arrayList5 = e46Var.f36700d;
            int i9 = this.f56100b;
            int i10 = 12;
            SparseArray sparseArray = this.f56102d;
            if (i8 == 1836019574) {
                DrmInitData drmInitDataM19121h = m19121h(arrayList5);
                e46 e46VarM10844k = e46Var.m10844k(1836475768);
                e46VarM10844k.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = e46VarM10844k.f36700d;
                int size = arrayList6.size();
                int i11 = 0;
                long jM14807B = -9223372036854775807L;
                while (i11 < size) {
                    f46 f46Var = (f46) arrayList6.get(i11);
                    int i12 = f46Var.f8576b;
                    k47 k47Var = f46Var.f38414c;
                    if (i12 == 1953654136) {
                        k47Var.m14818M(i10);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(k47Var.m14829m()), new t72(k47Var.m14829m() - 1, k47Var.m14829m(), k47Var.m14829m(), k47Var.m14829m()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (t72) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i12 == 1835362404) {
                            k47Var.m14818M(8);
                            jM14807B = ai0.m426e(k47Var.m14829m()) == 0 ? k47Var.m14807B() : k47Var.m14811F();
                        }
                    }
                    i11++;
                    arrayList6 = arrayList;
                    i10 = 12;
                }
                int i13 = 0;
                e46 e46VarM10844k2 = e46Var.m10844k(1835365473);
                ey5 ey5VarM427f = e46VarM10844k2 != null ? ai0.m427f(e46VarM10844k2) : null;
                ak3 ak3Var = new ak3();
                f46 f46VarM10845m = e46Var.m10845m(1969517665);
                if (f46VarM10845m != null) {
                    ey5 ey5VarM432k = ai0.m432k(f46VarM10845m);
                    ak3Var.m528b(ey5VarM432k);
                    ey5Var = ey5VarM432k;
                } else {
                    ey5Var = null;
                }
                f46 f46VarM10845m2 = e46Var.m10845m(1836476516);
                f46VarM10845m2.getClass();
                ey5 ey5Var2 = new ey5(ai0.m428g(f46VarM10845m2.f38414c));
                ArrayList arrayListM431j = ai0.m431j(e46Var, ak3Var, jM14807B, drmInitDataM19121h, (i9 & 16) != 0, false, new tj0(this), false);
                int size2 = arrayListM431j.size();
                if (sparseArray.size() == 0) {
                    String strM18202a = opb.m18202a(arrayListM431j);
                    int i14 = 0;
                    while (i14 < size2) {
                        o8a o8aVar = (o8a) arrayListM431j.get(i14);
                        g8a g8aVar = o8aVar.f54015a;
                        jy2 jy2Var = this.f56093G;
                        int i15 = g8aVar.f40392b;
                        int i16 = g8aVar.f40391a;
                        String str = strM18202a;
                        C0713b c0713b = g8aVar.f40397g;
                        long j3 = g8aVar.f40395e;
                        n8a n8aVarMo2555n = jy2Var.mo2555n(i14, i15);
                        n8aVarMo2555n.mo2534d(j3);
                        int i17 = i14;
                        lc3 lc3VarM2520a = c0713b.m2520a();
                        ArrayList arrayList7 = arrayListM431j;
                        lc3VarM2520a.f49452m = ez5.m11402l(str);
                        if (i15 == 1) {
                            int i18 = ak3Var.f763a;
                            i = size2;
                            j2 = j3;
                            if (i18 != -1 && (i2 = ak3Var.f764b) != -1) {
                                lc3VarM2520a.f49433I = i18;
                                lc3VarM2520a.f49434J = i2;
                            }
                        } else {
                            i = size2;
                            j2 = j3;
                        }
                        kpb.m15647f(i15, ey5VarM427f, lc3VarM2520a, c0713b.f6403l, ey5Var, ey5Var2);
                        if (sparseArray2.size() == 1) {
                            t72Var = (t72) sparseArray2.valueAt(i13);
                        } else {
                            t72Var = (t72) sparseArray2.get(i16);
                            t72Var.getClass();
                        }
                        sparseArray.put(i16, new og3(n8aVarMo2555n, o8aVar, t72Var, new C0713b(lc3VarM2520a)));
                        this.f56123y = Math.max(this.f56123y, j2);
                        i14 = i17 + 1;
                        strM18202a = str;
                        arrayListM431j = arrayList7;
                        size2 = i;
                        i13 = 0;
                    }
                    this.f56093G.mo2551j();
                } else {
                    ArrayList arrayList8 = arrayListM431j;
                    bna.m3987z(sparseArray.size() == size2);
                    int i19 = 0;
                    while (i19 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        o8a o8aVar2 = (o8a) arrayList9.get(i19);
                        g8a g8aVar2 = o8aVar2.f54015a;
                        og3 og3Var = (og3) sparseArray.get(g8aVar2.f40391a);
                        int i20 = g8aVar2.f40391a;
                        if (sparseArray2.size() == 1) {
                            t72Var2 = (t72) sparseArray2.valueAt(0);
                        } else {
                            t72Var2 = (t72) sparseArray2.get(i20);
                            t72Var2.getClass();
                        }
                        og3Var.f54308d = o8aVar2;
                        og3Var.f54309e = t72Var2;
                        og3Var.f54305a.mo2537g(og3Var.f54314j);
                        og3Var.m17976e();
                        i19++;
                        arrayList8 = arrayList9;
                    }
                }
            } else if (i8 == 1836019558) {
                int size3 = arrayList4.size();
                int i21 = 0;
                while (i21 < size3) {
                    e46 e46Var2 = (e46) arrayList4.get(i21);
                    if (e46Var2.f8576b == 1953653094) {
                        f46 f46VarM10845m3 = e46Var2.m10845m(1952868452);
                        ArrayList arrayList10 = e46Var2.f36700d;
                        f46VarM10845m3.getClass();
                        k47 k47Var2 = f46VarM10845m3.f38414c;
                        k47Var2.m14818M(8);
                        int iM14829m = k47Var2.m14829m();
                        byte[] bArr2 = ai0.f687a;
                        og3 og3Var2 = (og3) sparseArray.get(k47Var2.m14829m());
                        if (og3Var2 == null) {
                            size3 = size3;
                            og3Var2 = null;
                        } else {
                            i8a i8aVar = og3Var2.f54306b;
                            if ((iM14829m & 1) != 0) {
                                long jM14811F = k47Var2.m14811F();
                                i8aVar.f43694b = jM14811F;
                                i8aVar.f43695c = jM14811F;
                            }
                            t72 t72Var3 = og3Var2.f54309e;
                            i8aVar.f43693a = new t72((iM14829m & 2) != 0 ? k47Var2.m14829m() - 1 : t72Var3.f61928a, (iM14829m & 8) != 0 ? k47Var2.m14829m() : t72Var3.f61929b, (iM14829m & 16) != 0 ? k47Var2.m14829m() : t72Var3.f61930c, (iM14829m & 32) != 0 ? k47Var2.m14829m() : t72Var3.f61931d);
                        }
                        if (og3Var2 != null) {
                            i8a i8aVar2 = og3Var2.f54306b;
                            long j4 = i8aVar2.f43708p;
                            boolean z3 = i8aVar2.f43709q;
                            og3Var2.m17976e();
                            og3Var2.f54317m = true;
                            f46 f46VarM10845m4 = e46Var2.m10845m(1952867444);
                            if (f46VarM10845m4 == null || (i9 & 2) != 0) {
                                i8aVar2.f43708p = j4;
                                i8aVar2.f43709q = z3;
                            } else {
                                k47 k47Var3 = f46VarM10845m4.f38414c;
                                k47Var3.m14818M(8);
                                i8aVar2.f43708p = ai0.m426e(k47Var3.m14829m()) == 1 ? k47Var3.m14811F() : k47Var3.m14807B();
                                i8aVar2.f43709q = true;
                            }
                            int size4 = arrayList10.size();
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                i5 = 1953658222;
                                if (i22 >= size4) {
                                    break;
                                }
                                f46 f46Var2 = (f46) arrayList10.get(i22);
                                int i25 = i21;
                                if (f46Var2.f8576b == 1953658222) {
                                    k47 k47Var4 = f46Var2.f38414c;
                                    k47Var4.m14818M(12);
                                    int iM14809D = k47Var4.m14809D();
                                    if (iM14809D > 0) {
                                        i24 += iM14809D;
                                        i23++;
                                    }
                                }
                                i22++;
                                i21 = i25;
                            }
                            i3 = i21;
                            og3Var2.f54312h = 0;
                            og3Var2.f54311g = 0;
                            og3Var2.f54310f = 0;
                            i8aVar2.f43696d = i23;
                            i8aVar2.f43697e = i24;
                            if (i8aVar2.f43699g.length < i23) {
                                i8aVar2.f43698f = new long[i23];
                                i8aVar2.f43699g = new int[i23];
                            }
                            if (i8aVar2.f43700h.length < i24) {
                                int i26 = (i24 * 125) / 100;
                                i8aVar2.f43700h = new int[i26];
                                i8aVar2.f43701i = new long[i26];
                                i8aVar2.f43702j = new boolean[i26];
                                i8aVar2.f43704l = new boolean[i26];
                            }
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                long j5 = 0;
                                if (i27 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    i4 = i9;
                                    g8a g8aVar3 = og3Var2.f54308d.f54015a;
                                    t72 t72Var4 = i8aVar2.f43693a;
                                    t72Var4.getClass();
                                    h8a h8aVar = g8aVar3.f40402l[t72Var4.f61928a];
                                    f46 f46VarM10845m5 = e46Var2.m10845m(1935763834);
                                    if (f46VarM10845m5 != null) {
                                        h8aVar.getClass();
                                        k47 k47Var5 = f46VarM10845m5.f38414c;
                                        int i30 = h8aVar.f41998d;
                                        k47Var5.m14818M(8);
                                        int iM14829m2 = k47Var5.m14829m();
                                        byte[] bArr3 = ai0.f687a;
                                        if ((iM14829m2 & 1) == 1) {
                                            k47Var5.m14819N(8);
                                        }
                                        int iM14842z = k47Var5.m14842z();
                                        int iM14809D2 = k47Var5.m14809D();
                                        if (iM14809D2 > i8aVar2.f43697e) {
                                            StringBuilder sbM22998u = ux5.m22998u("Saiz sample count ", iM14809D2, " is greater than fragment sample count");
                                            sbM22998u.append(i8aVar2.f43697e);
                                            throw ParserException.m2516a(null, sbM22998u.toString());
                                        }
                                        if (iM14842z == 0) {
                                            boolean[] zArr = i8aVar2.f43704l;
                                            i6 = 0;
                                            for (int i31 = 0; i31 < iM14809D2; i31++) {
                                                int iM14842z2 = k47Var5.m14842z();
                                                i6 += iM14842z2;
                                                zArr[i31] = iM14842z2 > i30;
                                            }
                                            z = false;
                                        } else {
                                            boolean z4 = iM14842z > i30;
                                            i6 = iM14842z * iM14809D2;
                                            z = false;
                                            Arrays.fill(i8aVar2.f43704l, 0, iM14809D2, z4);
                                        }
                                        Arrays.fill(i8aVar2.f43704l, iM14809D2, i8aVar2.f43697e, z);
                                        if (i6 > 0) {
                                            i8aVar2.f43706n.m14815J(i6);
                                            i8aVar2.f43703k = true;
                                            i8aVar2.f43707o = true;
                                        }
                                    }
                                    f46 f46VarM10845m6 = e46Var2.m10845m(1935763823);
                                    if (f46VarM10845m6 != null) {
                                        k47 k47Var6 = f46VarM10845m6.f38414c;
                                        k47Var6.m14818M(8);
                                        int iM14829m3 = k47Var6.m14829m();
                                        byte[] bArr4 = ai0.f687a;
                                        if ((iM14829m3 & 1) == 1) {
                                            k47Var6.m14819N(8);
                                        }
                                        int iM14809D3 = k47Var6.m14809D();
                                        if (iM14809D3 != 1) {
                                            throw ParserException.m2516a(null, "Unexpected saio entry count: " + iM14809D3);
                                        }
                                        i8aVar2.f43695c += ai0.m426e(iM14829m3) == 0 ? k47Var6.m14807B() : k47Var6.m14811F();
                                    }
                                    f46 f46VarM10845m7 = e46Var2.m10845m(1936027235);
                                    if (f46VarM10845m7 != null) {
                                        m19122i(f46VarM10845m7.f38414c, 0, i8aVar2);
                                    }
                                    String str2 = h8aVar != null ? h8aVar.f41996b : null;
                                    k47 k47Var7 = null;
                                    k47 k47Var8 = null;
                                    for (int i32 = 0; i32 < arrayList10.size(); i32++) {
                                        f46 f46Var3 = (f46) arrayList10.get(i32);
                                        k47 k47Var9 = f46Var3.f38414c;
                                        int i33 = f46Var3.f8576b;
                                        if (i33 == 1935828848) {
                                            k47Var9.m14818M(12);
                                            if (k47Var9.m14829m() == 1936025959) {
                                                k47Var7 = k47Var9;
                                            }
                                        } else if (i33 == 1936158820) {
                                            k47Var9.m14818M(12);
                                            if (k47Var9.m14829m() == 1936025959) {
                                                k47Var8 = k47Var9;
                                            }
                                        }
                                    }
                                    if (k47Var7 != null && k47Var8 != null) {
                                        k47Var7.m14818M(8);
                                        int iM426e = ai0.m426e(k47Var7.m14829m());
                                        k47Var7.m14819N(4);
                                        if (iM426e == 1) {
                                            k47Var7.m14819N(4);
                                        }
                                        if (k47Var7.m14829m() != 1) {
                                            throw ParserException.m2517b("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        k47Var8.m14818M(8);
                                        int iM426e2 = ai0.m426e(k47Var8.m14829m());
                                        k47Var8.m14819N(4);
                                        if (iM426e2 == 1) {
                                            if (k47Var8.m14807B() == 0) {
                                                throw ParserException.m2517b("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iM426e2 >= 2) {
                                            k47Var8.m14819N(4);
                                        }
                                        if (k47Var8.m14807B() != 1) {
                                            throw ParserException.m2517b("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        k47Var8.m14819N(1);
                                        int iM14842z3 = k47Var8.m14842z();
                                        int i34 = (iM14842z3 & 240) >> 4;
                                        int i35 = iM14842z3 & 15;
                                        boolean z5 = k47Var8.m14842z() == 1;
                                        if (z5) {
                                            int iM14842z4 = k47Var8.m14842z();
                                            byte[] bArr5 = new byte[16];
                                            k47Var8.m14827k(bArr5, 0, 16);
                                            if (iM14842z4 == 0) {
                                                int iM14842z5 = k47Var8.m14842z();
                                                byte[] bArr6 = new byte[iM14842z5];
                                                k47Var8.m14827k(bArr6, 0, iM14842z5);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            i8aVar2.f43703k = true;
                                            i8aVar2.f43705m = new h8a(z5, str2, iM14842z4, bArr5, i34, i35, bArr);
                                        }
                                    }
                                    int size5 = arrayList10.size();
                                    for (int i36 = 0; i36 < size5; i36++) {
                                        f46 f46Var4 = (f46) arrayList10.get(i36);
                                        if (f46Var4.f8576b == 1970628964) {
                                            k47 k47Var10 = f46Var4.f38414c;
                                            k47Var10.m14818M(8);
                                            byte[] bArr7 = this.f56106h;
                                            k47Var10.m14827k(bArr7, 0, 16);
                                            if (Arrays.equals(bArr7, f56085M)) {
                                                m19122i(k47Var10, 16, i8aVar2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                f46 f46Var5 = (f46) arrayList10.get(i27);
                                if (f46Var5.f8576b == i5) {
                                    int i37 = i28 + 1;
                                    k47 k47Var11 = f46Var5.f38414c;
                                    k47Var11.m14818M(8);
                                    int iM14829m4 = k47Var11.m14829m();
                                    byte[] bArr8 = ai0.f687a;
                                    g8a g8aVar4 = og3Var2.f54308d.f54015a;
                                    t72 t72Var5 = i8aVar2.f43693a;
                                    String str3 = uma.f64080a;
                                    i8aVar2.f43699g[i28] = k47Var11.m14809D();
                                    long[] jArr = i8aVar2.f43698f;
                                    i7 = i9;
                                    long j6 = i8aVar2.f43694b;
                                    jArr[i28] = j6;
                                    if ((iM14829m4 & 1) != 0) {
                                        jArr[i28] = j6 + ((long) k47Var11.m14829m());
                                    }
                                    boolean z6 = (iM14829m4 & 4) != 0;
                                    int iM14829m5 = t72Var5.f61931d;
                                    if (z6) {
                                        iM14829m5 = k47Var11.m14829m();
                                    }
                                    boolean z7 = (iM14829m4 & 256) != 0;
                                    boolean z8 = z6;
                                    boolean z9 = (iM14829m4 & 512) != 0;
                                    boolean z10 = (iM14829m4 & 1024) != 0;
                                    boolean z11 = (iM14829m4 & 2048) != 0;
                                    boolean z12 = z10;
                                    long[] jArr2 = g8aVar4.f40399i;
                                    int i38 = iM14829m5;
                                    long[] jArr3 = g8aVar4.f40400j;
                                    if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                        z2 = z7;
                                    } else {
                                        long j7 = jArr2[0];
                                        if (j7 == 0) {
                                            z2 = z7;
                                        } else {
                                            z2 = z7;
                                            long j8 = g8aVar4.f40394d;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (uma.m22803H(j7, 1000000L, j8, roundingMode) + uma.m22803H(jArr3[0], 1000000L, g8aVar4.f40393c, roundingMode) >= g8aVar4.f40395e) {
                                            }
                                        }
                                        j5 = jArr3[0];
                                    }
                                    int[] iArr = i8aVar2.f43700h;
                                    long[] jArr4 = i8aVar2.f43701i;
                                    boolean z13 = z2;
                                    boolean[] zArr2 = i8aVar2.f43702j;
                                    boolean z14 = g8aVar4.f40392b == 2 && (i7 & 1) != 0;
                                    int i39 = i8aVar2.f43699g[i28] + i29;
                                    int i40 = i29;
                                    long j9 = g8aVar4.f40393c;
                                    boolean z15 = z11;
                                    long j10 = i8aVar2.f43708p;
                                    int i41 = i40;
                                    while (i41 < i39) {
                                        int iM14829m6 = z13 ? k47Var11.m14829m() : t72Var5.f61929b;
                                        boolean z16 = z15;
                                        if (iM14829m6 < 0) {
                                            throw ParserException.m2516a(null, "Unexpected negative value: " + iM14829m6);
                                        }
                                        int iM14829m7 = z9 ? k47Var11.m14829m() : t72Var5.f61930c;
                                        if (iM14829m7 < 0) {
                                            throw ParserException.m2516a(null, "Unexpected negative value: " + iM14829m7);
                                        }
                                        int iM14829m8 = z12 ? k47Var11.m14829m() : (i41 == 0 && z8) ? i38 : t72Var5.f61931d;
                                        int i42 = i39;
                                        long[] jArr5 = jArr4;
                                        long jM22803H = uma.m22803H((((long) (z16 ? k47Var11.m14829m() : 0)) + j10) - j5, 1000000L, j9, RoundingMode.DOWN);
                                        jArr5[i41] = jM22803H;
                                        if (!i8aVar2.f43709q) {
                                            jArr5[i41] = jM22803H + og3Var2.f54308d.f54023i;
                                        }
                                        iArr[i41] = iM14829m7;
                                        zArr2[i41] = ((iM14829m8 >> 16) & 1) == 0 && (!z14 || i41 == 0);
                                        j10 += (long) iM14829m6;
                                        i41++;
                                        z15 = z16;
                                        z14 = z14;
                                        jArr4 = jArr5;
                                        i39 = i42;
                                    }
                                    i8aVar2.f43708p = j10;
                                    i28 = i37;
                                    i29 = i39;
                                } else {
                                    i7 = i9;
                                }
                                i27++;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                i9 = i7;
                                size4 = size4;
                                i5 = 1953658222;
                            }
                        } else {
                            i3 = i21;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i4 = i9;
                        }
                    } else {
                        size3 = size3;
                        i3 = i21;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i4 = i9;
                    }
                    i21 = i3 + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                    i9 = i4;
                }
                DrmInitData drmInitDataM19121h2 = m19121h(arrayList5);
                if (drmInitDataM19121h2 != null) {
                    int size6 = sparseArray.size();
                    for (int i43 = 0; i43 < size6; i43++) {
                        og3 og3Var3 = (og3) sparseArray.valueAt(i43);
                        g8a g8aVar5 = og3Var3.f54308d.f54015a;
                        t72 t72Var6 = og3Var3.f54306b.f43693a;
                        String str4 = uma.f64080a;
                        h8a h8aVar2 = g8aVar5.f40402l[t72Var6.f61928a];
                        DrmInitData drmInitDataM2514a = drmInitDataM19121h2.m2514a(h8aVar2 != null ? h8aVar2.f41996b : null);
                        lc3 lc3VarM2520a2 = og3Var3.f54314j.m2520a();
                        lc3VarM2520a2.f49457r = drmInitDataM2514a;
                        og3Var3.f54305a.mo2537g(new C0713b(lc3VarM2520a2));
                    }
                }
                if (this.f56122x != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i44 = 0; i44 < size7; i44++) {
                        og3 og3Var4 = (og3) sparseArray.valueAt(i44);
                        long j11 = this.f56122x;
                        int i45 = og3Var4.f54310f;
                        while (true) {
                            i8a i8aVar3 = og3Var4.f54306b;
                            if (i45 >= i8aVar3.f43697e || i8aVar3.f43701i[i45] > j11) {
                                break;
                            }
                            if (i8aVar3.f43702j[i45]) {
                                og3Var4.f54313i = i45;
                            }
                            i45++;
                        }
                    }
                    this.f56122x = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((e46) arrayDeque.peek()).f36701e.add(e46Var);
            }
        }
        m19124g();
    }
}
