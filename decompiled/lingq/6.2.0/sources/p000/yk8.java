package p000;

import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.C0713b;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.source.C0717b;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class yk8 implements n8a {

    /* JADX INFO: renamed from: A */
    public boolean f69936A;

    /* JADX INFO: renamed from: B */
    public C0713b f69937B;

    /* JADX INFO: renamed from: C */
    public boolean f69938C;

    /* JADX INFO: renamed from: D */
    public boolean f69939D;

    /* JADX INFO: renamed from: a */
    public final wk8 f69940a;

    /* JADX INFO: renamed from: c */
    public final C3299li f69942c;

    /* JADX INFO: renamed from: d */
    public final mkd f69943d;

    /* JADX INFO: renamed from: e */
    public final fm2 f69944e;

    /* JADX INFO: renamed from: f */
    public C0717b f69945f;

    /* JADX INFO: renamed from: g */
    public C0713b f69946g;

    /* JADX INFO: renamed from: h */
    public web f69947h;

    /* JADX INFO: renamed from: p */
    public int f69955p;

    /* JADX INFO: renamed from: q */
    public int f69956q;

    /* JADX INFO: renamed from: r */
    public int f69957r;

    /* JADX INFO: renamed from: s */
    public int f69958s;

    /* JADX INFO: renamed from: t */
    public long f69959t;

    /* JADX INFO: renamed from: u */
    public long f69960u;

    /* JADX INFO: renamed from: v */
    public long f69961v;

    /* JADX INFO: renamed from: w */
    public long f69962w;

    /* JADX INFO: renamed from: x */
    public int f69963x;

    /* JADX INFO: renamed from: y */
    public boolean f69964y;

    /* JADX INFO: renamed from: z */
    public boolean f69965z;

    /* JADX INFO: renamed from: b */
    public final b04 f69941b = new b04();

    /* JADX INFO: renamed from: i */
    public int f69948i = DescriptorProtos.Edition.EDITION_2023_VALUE;

    /* JADX INFO: renamed from: j */
    public long[] f69949j = new long[DescriptorProtos.Edition.EDITION_2023_VALUE];

    /* JADX INFO: renamed from: k */
    public long[] f69950k = new long[DescriptorProtos.Edition.EDITION_2023_VALUE];

    /* JADX INFO: renamed from: n */
    public long[] f69953n = new long[DescriptorProtos.Edition.EDITION_2023_VALUE];

    /* JADX INFO: renamed from: m */
    public int[] f69952m = new int[DescriptorProtos.Edition.EDITION_2023_VALUE];

    /* JADX INFO: renamed from: l */
    public int[] f69951l = new int[DescriptorProtos.Edition.EDITION_2023_VALUE];

    /* JADX INFO: renamed from: o */
    public m8a[] f69954o = new m8a[DescriptorProtos.Edition.EDITION_2023_VALUE];

    public yk8(gv5 gv5Var, mkd mkdVar, fm2 fm2Var) {
        this.f69943d = mkdVar;
        this.f69944e = fm2Var;
        this.f69940a = new wk8(gv5Var);
        fg2 fg2Var = new fg2(15);
        C3299li c3299li = new C3299li();
        c3299li.f49691b = new SparseArray();
        c3299li.f49692c = fg2Var;
        c3299li.f49690a = -1;
        this.f69942c = c3299li;
        this.f69959t = Long.MIN_VALUE;
        this.f69961v = Long.MIN_VALUE;
        this.f69962w = Long.MIN_VALUE;
        this.f69936A = true;
        this.f69965z = true;
        this.f69938C = true;
        this.f69960u = Long.MIN_VALUE;
        this.f69963x = -1;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:38:0x0081, B:42:0x0089, B:43:0x0090, B:48:0x00c1, B:71:0x0138, B:73:0x0141, B:50:0x00dc, B:52:0x00e5, B:54:0x00ea, B:56:0x00fe, B:60:0x0107, B:61:0x010c, B:63:0x0112, B:67:0x0120, B:69:0x0125, B:70:0x0135, B:53:0x00e8), top: B:78:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:38:0x0081, B:42:0x0089, B:43:0x0090, B:48:0x00c1, B:71:0x0138, B:73:0x0141, B:50:0x00dc, B:52:0x00e5, B:54:0x00ea, B:56:0x00fe, B:60:0x0107, B:61:0x010c, B:63:0x0112, B:67:0x0120, B:69:0x0125, B:70:0x0135, B:53:0x00e8), top: B:78:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:38:0x0081, B:42:0x0089, B:43:0x0090, B:48:0x00c1, B:71:0x0138, B:73:0x0141, B:50:0x00dc, B:52:0x00e5, B:54:0x00ea, B:56:0x00fe, B:60:0x0107, B:61:0x010c, B:63:0x0112, B:67:0x0120, B:69:0x0125, B:70:0x0135, B:53:0x00e8), top: B:78:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:38:0x0081, B:42:0x0089, B:43:0x0090, B:48:0x00c1, B:71:0x0138, B:73:0x0141, B:50:0x00dc, B:52:0x00e5, B:54:0x00ea, B:56:0x00fe, B:60:0x0107, B:61:0x010c, B:63:0x0112, B:67:0x0120, B:69:0x0125, B:70:0x0135, B:53:0x00e8), top: B:78:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:38:0x0081, B:42:0x0089, B:43:0x0090, B:48:0x00c1, B:71:0x0138, B:73:0x0141, B:50:0x00dc, B:52:0x00e5, B:54:0x00ea, B:56:0x00fe, B:60:0x0107, B:61:0x010c, B:63:0x0112, B:67:0x0120, B:69:0x0125, B:70:0x0135, B:53:0x00e8), top: B:78:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:38:0x0081, B:42:0x0089, B:43:0x0090, B:48:0x00c1, B:71:0x0138, B:73:0x0141, B:50:0x00dc, B:52:0x00e5, B:54:0x00ea, B:56:0x00fe, B:60:0x0107, B:61:0x010c, B:63:0x0112, B:67:0x0120, B:69:0x0125, B:70:0x0135, B:53:0x00e8), top: B:78:0x0045 }] */
    @Override // p000.n8a
    /* JADX INFO: renamed from: a */
    public final void mo2531a(long j, int i, int i2, int i3, m8a m8aVar) {
        hm2 hm2Var;
        C3299li c3299li;
        int i4;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        int i5 = i & 1;
        boolean z3 = i5 != 0;
        if (this.f69965z) {
            if (!z3) {
                return;
            } else {
                this.f69965z = false;
            }
        }
        if (this.f69938C) {
            if (j < this.f69959t) {
                return;
            }
            if (i5 == 0) {
                if (!this.f69939D) {
                    ss5.m21707d0("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f69937B);
                    this.f69939D = true;
                }
                i |= 1;
            }
        }
        long j2 = (this.f69940a.f66981g - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i6 = this.f69955p;
                if (i6 > 0) {
                    int iM25173l = m25173l(i6 - 1);
                    bna.m3969q(this.f69950k[iM25173l] + ((long) this.f69951l[iM25173l]) <= j2);
                }
                this.f69964y = (536870912 & i) != 0;
                this.f69962w = Math.max(this.f69962w, j);
                long j3 = this.f69960u;
                if (j3 != Long.MIN_VALUE && this.f69963x == -1 && j >= j3) {
                    this.f69963x = this.f69956q + this.f69955p;
                }
                int iM25173l2 = m25173l(this.f69955p);
                this.f69953n[iM25173l2] = j;
                this.f69950k[iM25173l2] = j2;
                this.f69951l[iM25173l2] = i2;
                this.f69952m[iM25173l2] = i;
                this.f69954o[iM25173l2] = m8aVar;
                this.f69949j[iM25173l2] = 0;
                if (((SparseArray) this.f69942c.f49691b).size() == 0) {
                    C0713b c0713b = this.f69937B;
                    c0713b.getClass();
                    if (this.f69943d != null) {
                        hm2Var = hm2.f42604b;
                    } else {
                        hm2Var = hm2.f42604b;
                    }
                    c3299li = this.f69942c;
                    i4 = this.f69956q + this.f69955p;
                    xk8 xk8Var = new xk8(c0713b, hm2Var);
                    sparseArray = (SparseArray) c3299li.f49691b;
                    if (c3299li.f49690a == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bna.m3987z(z2);
                        c3299li.f49690a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i4 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bna.m3969q(z);
                        if (iKeyAt == i4) {
                            ((fg2) c3299li.f49692c).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i4, xk8Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f69942c.f49691b;
                    if (!((xk8) sparseArray2.valueAt(sparseArray2.size() - 1)).f68318a.equals(this.f69937B)) {
                        C0713b c0713b2 = this.f69937B;
                        c0713b2.getClass();
                        if (this.f69943d != null) {
                            hm2Var = hm2.f42604b;
                        } else {
                            hm2Var = hm2.f42604b;
                        }
                        c3299li = this.f69942c;
                        i4 = this.f69956q + this.f69955p;
                        xk8 xk8Var2 = new xk8(c0713b2, hm2Var);
                        sparseArray = (SparseArray) c3299li.f49691b;
                        if (c3299li.f49690a == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            bna.m3987z(z2);
                            c3299li.f49690a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i4 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bna.m3969q(z);
                            if (iKeyAt == i4) {
                                ((fg2) c3299li.f49692c).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i4, xk8Var2);
                    }
                }
                int i7 = this.f69955p + 1;
                this.f69955p = i7;
                int i8 = this.f69948i;
                if (i7 == i8) {
                    int i9 = i8 + DescriptorProtos.Edition.EDITION_2023_VALUE;
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    int[] iArr = new int[i9];
                    int[] iArr2 = new int[i9];
                    m8a[] m8aVarArr = new m8a[i9];
                    int i10 = this.f69957r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.f69950k, i10, jArr2, 0, i11);
                    System.arraycopy(this.f69953n, this.f69957r, jArr3, 0, i11);
                    System.arraycopy(this.f69952m, this.f69957r, iArr, 0, i11);
                    System.arraycopy(this.f69951l, this.f69957r, iArr2, 0, i11);
                    System.arraycopy(this.f69954o, this.f69957r, m8aVarArr, 0, i11);
                    System.arraycopy(this.f69949j, this.f69957r, jArr, 0, i11);
                    int i12 = this.f69957r;
                    System.arraycopy(this.f69950k, 0, jArr2, i11, i12);
                    System.arraycopy(this.f69953n, 0, jArr3, i11, i12);
                    System.arraycopy(this.f69952m, 0, iArr, i11, i12);
                    System.arraycopy(this.f69951l, 0, iArr2, i11, i12);
                    System.arraycopy(this.f69954o, 0, m8aVarArr, i11, i12);
                    System.arraycopy(this.f69949j, 0, jArr, i11, i12);
                    this.f69950k = jArr2;
                    this.f69953n = jArr3;
                    this.f69952m = iArr;
                    this.f69951l = iArr2;
                    this.f69954o = m8aVarArr;
                    this.f69949j = jArr;
                    this.f69957r = 0;
                    this.f69948i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: b */
    public final void mo2532b(k47 k47Var, int i, int i2) {
        while (true) {
            wk8 wk8Var = this.f69940a;
            if (i <= 0) {
                wk8Var.getClass();
                return;
            }
            int iM24027b = wk8Var.m24027b(i);
            vh0 vh0Var = wk8Var.f66980f;
            C3830ze c3830ze = (C3830ze) vh0Var.f65367c;
            k47Var.m14827k(c3830ze.f71428a, ((int) (wk8Var.f66981g - vh0Var.f65365a)) + c3830ze.f71429b, iM24027b);
            i -= iM24027b;
            long j = wk8Var.f66981g + ((long) iM24027b);
            wk8Var.f66981g = j;
            vh0 vh0Var2 = wk8Var.f66980f;
            if (j == vh0Var2.f65366b) {
                wk8Var.f66980f = (vh0) vh0Var2.f65368d;
            }
        }
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: f */
    public final int mo2536f(h02 h02Var, int i, boolean z) throws EOFException {
        wk8 wk8Var = this.f69940a;
        int iM24027b = wk8Var.m24027b(i);
        vh0 vh0Var = wk8Var.f66980f;
        C3830ze c3830ze = (C3830ze) vh0Var.f65367c;
        int i2 = h02Var.read(c3830ze.f71428a, ((int) (wk8Var.f66981g - vh0Var.f65365a)) + c3830ze.f71429b, iM24027b);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = wk8Var.f66981g + ((long) i2);
        wk8Var.f66981g = j;
        vh0 vh0Var2 = wk8Var.f66980f;
        if (j == vh0Var2.f65366b) {
            wk8Var.f66980f = (vh0) vh0Var2.f65368d;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0039, B:19:0x0053, B:21:0x0061, B:25:0x006a, B:18:0x0051), top: B:35:0x0002 }] */
    @Override // p000.n8a
    /* JADX INFO: renamed from: g */
    public final void mo2537g(C0713b c0713b) {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                this.f69936A = false;
                if (!Objects.equals(c0713b, this.f69937B)) {
                    if (((SparseArray) this.f69942c.f49691b).size() == 0) {
                        this.f69937B = c0713b;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f69942c.f49691b;
                        if (((xk8) sparseArray.valueAt(sparseArray.size() - 1)).f68318a.equals(c0713b)) {
                            SparseArray sparseArray2 = (SparseArray) this.f69942c.f49691b;
                            this.f69937B = ((xk8) sparseArray2.valueAt(sparseArray2.size() - 1)).f68318a;
                        } else {
                            this.f69937B = c0713b;
                        }
                    }
                    boolean z2 = this.f69938C;
                    C0713b c0713b2 = this.f69937B;
                    String str = c0713b2.f6406o;
                    this.f69938C = z2 & (ez5.m11397g(str) == 1 && ez5.m11391a(str, c0713b2.f6402k));
                    this.f69939D = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0717b c0717b = this.f69945f;
        if (c0717b == null || !z) {
            return;
        }
        c0717b.f6470K.post(c0717b.f6468I);
    }

    /* JADX INFO: renamed from: h */
    public final long m25169h(int i) {
        long j = this.f69961v;
        int i2 = 0;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iM25173l = m25173l(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.f69953n[iM25173l]);
                if ((this.f69952m[iM25173l] & 1) != 0) {
                    break;
                }
                iM25173l--;
                if (iM25173l == -1) {
                    iM25173l = this.f69948i - 1;
                }
            }
        }
        this.f69961v = Math.max(j, jMax);
        this.f69955p -= i;
        int i4 = this.f69956q + i;
        this.f69956q = i4;
        int i5 = this.f69957r + i;
        this.f69957r = i5;
        int i6 = this.f69948i;
        if (i5 >= i6) {
            this.f69957r = i5 - i6;
        }
        int i7 = this.f69958s - i;
        this.f69958s = i7;
        if (i7 < 0) {
            this.f69958s = 0;
        }
        C3299li c3299li = this.f69942c;
        SparseArray sparseArray = (SparseArray) c3299li.f49691b;
        while (i2 < sparseArray.size() - 1) {
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((fg2) c3299li.f49692c).accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = c3299li.f49690a;
            if (i9 > 0) {
                c3299li.f49690a = i9 - 1;
            }
            i2 = i8;
        }
        if (this.f69955p != 0) {
            return this.f69950k[this.f69957r];
        }
        int i10 = this.f69957r;
        if (i10 == 0) {
            i10 = this.f69948i;
        }
        int i11 = i10 - 1;
        return this.f69950k[i11] + ((long) this.f69951l[i11]);
    }

    /* JADX INFO: renamed from: i */
    public final void m25170i() {
        long jM25169h;
        wk8 wk8Var = this.f69940a;
        synchronized (this) {
            int i = this.f69955p;
            jM25169h = i == 0 ? -1L : m25169h(i);
        }
        wk8Var.m24026a(jM25169h);
    }

    /* JADX INFO: renamed from: j */
    public final int m25171j(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f69953n[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.f69948i) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public final int m25172k(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f69953n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f69952m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f69948i) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: l */
    public final int m25173l(int i) {
        int i2 = this.f69957r + i;
        int i3 = this.f69948i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized C0713b m25174m() {
        return this.f69936A ? null : this.f69937B;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized boolean m25175n(boolean z) {
        C0713b c0713b;
        int i = this.f69956q;
        int i2 = this.f69958s;
        int i3 = i + i2;
        int i4 = this.f69963x;
        boolean z2 = true;
        if (i4 != -1 && i3 >= i4) {
            return true;
        }
        if (i2 != this.f69955p) {
            if (((xk8) this.f69942c.m16225c(i3)).f68318a != this.f69946g) {
                return true;
            }
            return m25176o(m25173l(this.f69958s));
        }
        if (!z && !this.f69964y && ((c0713b = this.f69937B) == null || c0713b == this.f69946g)) {
            z2 = false;
        }
        return z2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m25176o(int i) {
        web webVar = this.f69947h;
        if (webVar == null || webVar.m23867D() == 4) {
            return true;
        }
        if ((this.f69952m[i] & 1073741824) != 0) {
            return false;
        }
        this.f69947h.getClass();
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m25177p(C0713b c0713b, p33 p33Var) {
        C0713b c0713b2;
        C0713b c0713b3 = this.f69946g;
        boolean z = c0713b3 == null;
        DrmInitData drmInitData = c0713b3 == null ? null : c0713b3.f6410s;
        this.f69946g = c0713b;
        DrmInitData drmInitData2 = c0713b.f6410s;
        mkd mkdVar = this.f69943d;
        if (mkdVar != null) {
            int iM16913l = mkdVar.m16913l(c0713b);
            lc3 lc3VarM2520a = c0713b.m2520a();
            lc3VarM2520a.f49439O = iM16913l;
            c0713b2 = new C0713b(lc3VarM2520a);
        } else {
            c0713b2 = c0713b;
        }
        p33Var.f55514c = c0713b2;
        p33Var.f55513b = this.f69947h;
        if (mkdVar == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            web webVar = c0713b.f6410s != null ? new web(new DrmSession$DrmSessionException(new UnsupportedDrmException(), 6001)) : null;
            this.f69947h = webVar;
            p33Var.f55513b = webVar;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m25178q(boolean z) {
        wk8 wk8Var = this.f69940a;
        gv5 gv5Var = wk8Var.f66975a;
        vh0 vh0Var = wk8Var.f66978d;
        if (((C3830ze) vh0Var.f65367c) != null) {
            synchronized (gv5Var) {
                u42 u42Var = ((h72) gv5Var.f41394d).f41860c;
                synchronized (u42Var) {
                    for (vh0 vh0VarM23284c = vh0Var; vh0VarM23284c != null; vh0VarM23284c = vh0VarM23284c.m23284c()) {
                        C3830ze[] c3830zeArr = u42Var.f63384f;
                        int i = u42Var.f63383e;
                        u42Var.f63383e = i + 1;
                        c3830zeArr[i] = vh0VarM23284c.m23283b();
                        u42Var.f63382d--;
                    }
                }
                for (vh0 vh0VarM23284c2 = vh0Var; vh0VarM23284c2 != null; vh0VarM23284c2 = vh0VarM23284c2.m23284c()) {
                    C3830ze c3830ze = (C3830ze) vh0VarM23284c2.f65367c;
                    c3830ze.getClass();
                    gv5Var.m12881K(c3830ze);
                }
            }
            vh0Var.f65367c = null;
            vh0Var.f65368d = null;
        }
        vh0 vh0Var2 = wk8Var.f66978d;
        int i2 = wk8Var.f66976b;
        bna.m3987z(((C3830ze) vh0Var2.f65367c) == null);
        vh0Var2.f65365a = 0L;
        vh0Var2.f65366b = i2;
        vh0 vh0Var3 = wk8Var.f66978d;
        wk8Var.f66979e = vh0Var3;
        wk8Var.f66980f = vh0Var3;
        wk8Var.f66981g = 0L;
        synchronized (gv5Var) {
            ((h72) gv5Var.f41394d).f41860c.m22448c();
        }
        this.f69955p = 0;
        this.f69956q = 0;
        this.f69957r = 0;
        this.f69958s = 0;
        this.f69963x = -1;
        this.f69965z = true;
        this.f69959t = Long.MIN_VALUE;
        this.f69961v = Long.MIN_VALUE;
        this.f69962w = Long.MIN_VALUE;
        this.f69964y = false;
        C3299li c3299li = this.f69942c;
        SparseArray sparseArray = (SparseArray) c3299li.f49691b;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            ((fg2) c3299li.f49692c).accept(sparseArray.valueAt(i3));
        }
        c3299li.f49690a = -1;
        sparseArray.clear();
        if (z) {
            this.f69937B = null;
            this.f69936A = true;
            this.f69938C = true;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007c */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean m25179r(long j, boolean z) throws Throwable {
        Throwable th;
        yk8 yk8Var;
        long j2;
        int iM25172k;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.f69958s = 0;
                                wk8 wk8Var = this.f69940a;
                                wk8Var.f66979e = wk8Var.f66978d;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th;
                                        throw th;
                                    }
                                }
                            }
                        }
                        return false;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            int iM25173l = m25173l(0);
            long j3 = this.f69960u;
            long jMin = this.f69962w;
            if (j3 != Long.MIN_VALUE) {
                try {
                    jMin = Math.min(jMin, j3);
                } catch (Throwable th7) {
                    th = th7;
                    this = this;
                }
            }
            int i = this.f69958s;
            int i2 = this.f69955p;
            if (!(i != i2) || j < this.f69953n[iM25173l] || (j > jMin && !z)) {
                return false;
            }
            if (this.f69938C) {
                yk8Var = this;
                j2 = j;
                iM25172k = yk8Var.m25171j(iM25173l, i2 - i, j2, z);
            } else {
                yk8Var = this;
                j2 = j;
                iM25172k = yk8Var.m25172k(iM25173l, i2 - i, j2, true);
            }
            if (iM25172k == -1) {
                return false;
            }
            yk8Var.f69959t = j2;
            yk8Var.f69958s += iM25172k;
            return true;
        } catch (Throwable th8) {
            th = th8;
            this = this;
            th = th;
        }
        throw th;
    }
}
