package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.drm.InterfaceC2399c;
import ga.C5734q;
import java.io.EOFException;
import java.io.IOException;
import p150h9.C5931p;
import p261m9.InterfaceC7522w;
import p290o6.C7968m;
import p454wa.C9876a;
import p454wa.C9885j;
import p454wa.InterfaceC9877b;
import p454wa.InterfaceC9880e;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;
import p479xa.C10151t;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.p */
/* JADX INFO: loaded from: classes.dex */
public class C2499p implements InterfaceC7522w {

    /* JADX INFO: renamed from: A */
    public C2416m f13401A;

    /* JADX INFO: renamed from: B */
    public C2416m f13402B;

    /* JADX INFO: renamed from: C */
    public int f13403C;

    /* JADX INFO: renamed from: D */
    public boolean f13404D;

    /* JADX INFO: renamed from: E */
    public boolean f13405E;

    /* JADX INFO: renamed from: F */
    public long f13406F;

    /* JADX INFO: renamed from: G */
    public boolean f13407G;

    /* JADX INFO: renamed from: a */
    public final C2498o f13408a;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2399c f13411d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2398b.a f13412e;

    /* JADX INFO: renamed from: f */
    public c f13413f;

    /* JADX INFO: renamed from: g */
    public C2416m f13414g;

    /* JADX INFO: renamed from: h */
    public DrmSession f13415h;

    /* JADX INFO: renamed from: p */
    public int f13423p;

    /* JADX INFO: renamed from: q */
    public int f13424q;

    /* JADX INFO: renamed from: r */
    public int f13425r;

    /* JADX INFO: renamed from: s */
    public int f13426s;

    /* JADX INFO: renamed from: w */
    public boolean f13430w;

    /* JADX INFO: renamed from: z */
    public boolean f13433z;

    /* JADX INFO: renamed from: b */
    public final a f13409b = new a();

    /* JADX INFO: renamed from: i */
    public int f13416i = 1000;

    /* JADX INFO: renamed from: j */
    public int[] f13417j = new int[1000];

    /* JADX INFO: renamed from: k */
    public long[] f13418k = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f13421n = new long[1000];

    /* JADX INFO: renamed from: m */
    public int[] f13420m = new int[1000];

    /* JADX INFO: renamed from: l */
    public int[] f13419l = new int[1000];

    /* JADX INFO: renamed from: o */
    public InterfaceC7522w.a[] f13422o = new InterfaceC7522w.a[1000];

    /* JADX INFO: renamed from: c */
    public final C5734q<b> f13410c = new C5734q<>(new C5931p(15));

    /* JADX INFO: renamed from: t */
    public long f13427t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f13428u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public long f13429v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public boolean f13432y = true;

    /* JADX INFO: renamed from: x */
    public boolean f13431x = true;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.p$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f13434a;

        /* JADX INFO: renamed from: b */
        public long f13435b;

        /* JADX INFO: renamed from: c */
        public InterfaceC7522w.a f13436c;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.p$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C2416m f13437a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2399c.b f13438b;

        public b(C2416m c2416m, InterfaceC2399c.b bVar) {
            this.f13437a = c2416m;
            this.f13438b = bVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.p$c */
    public interface c {
        /* JADX INFO: renamed from: s */
        void mo7367s();
    }

    public C2499p(InterfaceC9877b interfaceC9877b, InterfaceC2399c interfaceC2399c, InterfaceC2398b.a aVar) {
        this.f13411d = interfaceC2399c;
        this.f13412e = aVar;
        this.f13408a = new C2498o(interfaceC9877b);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p261m9.InterfaceC7522w
    /* JADX INFO: renamed from: a */
    public final int mo7385a(InterfaceC9880e interfaceC9880e, int i10, boolean z10) throws IOException {
        C2498o c2498o = this.f13408a;
        int iM7384c = c2498o.m7384c(i10);
        C2498o.a aVar = c2498o.f13395f;
        C9876a c9876a = aVar.f13399c;
        int i11 = interfaceC9880e.read(c9876a.f50416a, ((int) (c2498o.f13396g - aVar.f13397a)) + c9876a.f50417b, iM7384c);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = c2498o.f13396g + ((long) i11);
        c2498o.f13396g = j10;
        C2498o.a aVar2 = c2498o.f13395f;
        if (j10 == aVar2.f13398b) {
            c2498o.f13395f = aVar2.f13400d;
        }
        return i11;
    }

    @Override // p261m9.InterfaceC7522w
    /* JADX INFO: renamed from: b */
    public final void mo7386b(int i10, C10151t c10151t) {
        while (true) {
            C2498o c2498o = this.f13408a;
            if (i10 <= 0) {
                c2498o.getClass();
                return;
            }
            int iM7384c = c2498o.m7384c(i10);
            C2498o.a aVar = c2498o.f13395f;
            C9876a c9876a = aVar.f13399c;
            c10151t.m19127b(c9876a.f50416a, ((int) (c2498o.f13396g - aVar.f13397a)) + c9876a.f50417b, iM7384c);
            i10 -= iM7384c;
            long j10 = c2498o.f13396g + ((long) iM7384c);
            c2498o.f13396g = j10;
            C2498o.a aVar2 = c2498o.f13395f;
            if (j10 == aVar2.f13398b) {
                c2498o.f13395f = aVar2.f13400d;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017b  */
    /* JADX WARN: Code duplicated, block: B:102:0x017d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0183 A[Catch: all -> 0x0208, TryCatch #1 {, blocks: (B:68:0x00bf, B:70:0x00c3, B:74:0x00d9, B:75:0x00dc, B:79:0x00e4, B:84:0x011d, B:107:0x0194, B:109:0x019d, B:86:0x0136, B:88:0x013a, B:90:0x0145, B:92:0x015c, B:96:0x0165, B:97:0x016a, B:99:0x0170, B:103:0x017e, B:105:0x0183, B:106:0x0191, B:89:0x0143), top: B:116:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:86:0x0136 A[Catch: all -> 0x0208, TryCatch #1 {, blocks: (B:68:0x00bf, B:70:0x00c3, B:74:0x00d9, B:75:0x00dc, B:79:0x00e4, B:84:0x011d, B:107:0x0194, B:109:0x019d, B:86:0x0136, B:88:0x013a, B:90:0x0145, B:92:0x015c, B:96:0x0165, B:97:0x016a, B:99:0x0170, B:103:0x017e, B:105:0x0183, B:106:0x0191, B:89:0x0143), top: B:116:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:88:0x013a A[Catch: all -> 0x0208, TryCatch #1 {, blocks: (B:68:0x00bf, B:70:0x00c3, B:74:0x00d9, B:75:0x00dc, B:79:0x00e4, B:84:0x011d, B:107:0x0194, B:109:0x019d, B:86:0x0136, B:88:0x013a, B:90:0x0145, B:92:0x015c, B:96:0x0165, B:97:0x016a, B:99:0x0170, B:103:0x017e, B:105:0x0183, B:106:0x0191, B:89:0x0143), top: B:116:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0143 A[Catch: all -> 0x0208, TryCatch #1 {, blocks: (B:68:0x00bf, B:70:0x00c3, B:74:0x00d9, B:75:0x00dc, B:79:0x00e4, B:84:0x011d, B:107:0x0194, B:109:0x019d, B:86:0x0136, B:88:0x013a, B:90:0x0145, B:92:0x015c, B:96:0x0165, B:97:0x016a, B:99:0x0170, B:103:0x017e, B:105:0x0183, B:106:0x0191, B:89:0x0143), top: B:116:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:92:0x015c A[Catch: all -> 0x0208, TryCatch #1 {, blocks: (B:68:0x00bf, B:70:0x00c3, B:74:0x00d9, B:75:0x00dc, B:79:0x00e4, B:84:0x011d, B:107:0x0194, B:109:0x019d, B:86:0x0136, B:88:0x013a, B:90:0x0145, B:92:0x015c, B:96:0x0165, B:97:0x016a, B:99:0x0170, B:103:0x017e, B:105:0x0183, B:106:0x0191, B:89:0x0143), top: B:116:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0162  */
    /* JADX WARN: Code duplicated, block: B:95:0x0164  */
    /* JADX WARN: Code duplicated, block: B:99:0x0170 A[Catch: all -> 0x0208, TryCatch #1 {, blocks: (B:68:0x00bf, B:70:0x00c3, B:74:0x00d9, B:75:0x00dc, B:79:0x00e4, B:84:0x011d, B:107:0x0194, B:109:0x019d, B:86:0x0136, B:88:0x013a, B:90:0x0145, B:92:0x015c, B:96:0x0165, B:97:0x016a, B:99:0x0170, B:103:0x017e, B:105:0x0183, B:106:0x0191, B:89:0x0143), top: B:116:0x00bf }] */
    @Override // p261m9.InterfaceC7522w
    /* JADX INFO: renamed from: e */
    public void mo7387e(long j10, int i10, int i11, int i12, InterfaceC7522w.a aVar) {
        int i13;
        InterfaceC2399c interfaceC2399c;
        InterfaceC2399c.b bVarMo6950d;
        C5734q<b> c5734q;
        int i14;
        int i15;
        SparseArray<b> sparseArray;
        int iKeyAt;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f13433z) {
            C2416m c2416m = this.f13401A;
            C10129a.m18993e(c2416m);
            mo7388f(c2416m);
        }
        int i16 = i10 & 1;
        boolean z13 = i16 != 0;
        if (this.f13431x) {
            if (!z13) {
                return;
            } else {
                this.f13431x = false;
            }
        }
        long j11 = j10 + this.f13406F;
        if (!this.f13404D) {
            i13 = i10;
        } else {
            if (j11 < this.f13427t) {
                return;
            }
            if (i16 == 0) {
                if (!this.f13405E) {
                    C10145n.m19099g("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f13402B);
                    this.f13405E = true;
                }
                i13 = i10 | 1;
            } else {
                i13 = i10;
            }
        }
        if (this.f13407G) {
            if (!z13) {
                return;
            }
            synchronized (this) {
                if (this.f13423p == 0) {
                    z12 = j11 > this.f13428u;
                } else {
                    synchronized (this) {
                        long jMax = Math.max(this.f13428u, m7395m(this.f13426s));
                        if (jMax >= j11) {
                            z12 = false;
                        } else {
                            int i17 = this.f13423p;
                            int iM7396n = m7396n(i17 - 1);
                            while (i17 > this.f13426s && this.f13421n[iM7396n] >= j11) {
                                i17--;
                                iM7396n--;
                                if (iM7396n == -1) {
                                    iM7396n = this.f13416i - 1;
                                }
                            }
                            m7392j(this.f13424q + i17);
                            z12 = true;
                        }
                    }
                }
            }
            if (!z12) {
                return;
            } else {
                this.f13407G = false;
            }
        }
        long j12 = (this.f13408a.f13396g - ((long) i11)) - ((long) i12);
        synchronized (this) {
            int i18 = this.f13423p;
            if (i18 > 0) {
                int iM7396n2 = m7396n(i18 - 1);
                C10129a.m18990b(this.f13418k[iM7396n2] + ((long) this.f13419l[iM7396n2]) <= j12);
            }
            this.f13430w = (536870912 & i13) != 0;
            this.f13429v = Math.max(this.f13429v, j11);
            int iM7396n3 = m7396n(this.f13423p);
            this.f13421n[iM7396n3] = j11;
            this.f13418k[iM7396n3] = j12;
            this.f13419l[iM7396n3] = i11;
            this.f13420m[iM7396n3] = i13;
            this.f13422o[iM7396n3] = aVar;
            this.f13417j[iM7396n3] = this.f13403C;
            if (this.f13410c.f34795b.size() == 0) {
                interfaceC2399c = this.f13411d;
                if (interfaceC2399c != null) {
                    bVarMo6950d = interfaceC2399c.mo6950d(this.f13412e, this.f13402B);
                } else {
                    bVarMo6950d = InterfaceC2399c.b.f12206p;
                }
                c5734q = this.f13410c;
                i14 = this.f13424q + this.f13423p;
                C2416m c2416m2 = this.f13402B;
                c2416m2.getClass();
                b bVar = new b(c2416m2, bVarMo6950d);
                i15 = c5734q.f34794a;
                sparseArray = c5734q.f34795b;
                if (i15 == -1) {
                    if (sparseArray.size() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    C10129a.m18992d(z11);
                    c5734q.f34794a = 0;
                }
                if (sparseArray.size() > 0) {
                    iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i14 >= iKeyAt) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    C10129a.m18990b(z10);
                    if (iKeyAt == i14) {
                        c5734q.f34796c.mo12173a(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i14, bVar);
            } else {
                SparseArray<b> sparseArray2 = this.f13410c.f34795b;
                if (!sparseArray2.valueAt(sparseArray2.size() - 1).f13437a.equals(this.f13402B)) {
                    interfaceC2399c = this.f13411d;
                    if (interfaceC2399c != null) {
                        bVarMo6950d = interfaceC2399c.mo6950d(this.f13412e, this.f13402B);
                    } else {
                        bVarMo6950d = InterfaceC2399c.b.f12206p;
                    }
                    c5734q = this.f13410c;
                    i14 = this.f13424q + this.f13423p;
                    C2416m c2416m3 = this.f13402B;
                    c2416m3.getClass();
                    b bVar2 = new b(c2416m3, bVarMo6950d);
                    i15 = c5734q.f34794a;
                    sparseArray = c5734q.f34795b;
                    if (i15 == -1) {
                        if (sparseArray.size() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        C10129a.m18992d(z11);
                        c5734q.f34794a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i14 >= iKeyAt) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        C10129a.m18990b(z10);
                        if (iKeyAt == i14) {
                            c5734q.f34796c.mo12173a(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i14, bVar2);
                }
            }
            int i19 = this.f13423p + 1;
            this.f13423p = i19;
            int i20 = this.f13416i;
            if (i19 == i20) {
                int i21 = i20 + 1000;
                int[] iArr = new int[i21];
                long[] jArr = new long[i21];
                long[] jArr2 = new long[i21];
                int[] iArr2 = new int[i21];
                int[] iArr3 = new int[i21];
                InterfaceC7522w.a[] aVarArr = new InterfaceC7522w.a[i21];
                int i22 = this.f13425r;
                int i23 = i20 - i22;
                System.arraycopy(this.f13418k, i22, jArr, 0, i23);
                System.arraycopy(this.f13421n, this.f13425r, jArr2, 0, i23);
                System.arraycopy(this.f13420m, this.f13425r, iArr2, 0, i23);
                System.arraycopy(this.f13419l, this.f13425r, iArr3, 0, i23);
                System.arraycopy(this.f13422o, this.f13425r, aVarArr, 0, i23);
                System.arraycopy(this.f13417j, this.f13425r, iArr, 0, i23);
                int i24 = this.f13425r;
                System.arraycopy(this.f13418k, 0, jArr, i23, i24);
                System.arraycopy(this.f13421n, 0, jArr2, i23, i24);
                System.arraycopy(this.f13420m, 0, iArr2, i23, i24);
                System.arraycopy(this.f13419l, 0, iArr3, i23, i24);
                System.arraycopy(this.f13422o, 0, aVarArr, i23, i24);
                System.arraycopy(this.f13417j, 0, iArr, i23, i24);
                this.f13418k = jArr;
                this.f13421n = jArr2;
                this.f13420m = iArr2;
                this.f13419l = iArr3;
                this.f13422o = aVarArr;
                this.f13417j = iArr;
                this.f13425r = 0;
                this.f13416i = i21;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:4:0x000e, B:9:0x001e, B:14:0x0030, B:16:0x004a, B:18:0x0065, B:17:0x0062), top: B:31:0x000e }] */
    @Override // p261m9.InterfaceC7522w
    /* JADX INFO: renamed from: f */
    public final void mo7388f(C2416m c2416m) {
        C2416m c2416mMo7394l = mo7394l(c2416m);
        boolean z10 = false;
        this.f13433z = false;
        this.f13401A = c2416m;
        synchronized (this) {
            try {
                this.f13432y = false;
                if (!C10134c0.m19034a(c2416mMo7394l, this.f13402B)) {
                    if (this.f13410c.f34795b.size() == 0) {
                        this.f13402B = c2416mMo7394l;
                    } else {
                        SparseArray<b> sparseArray = this.f13410c.f34795b;
                        if (sparseArray.valueAt(sparseArray.size() - 1).f13437a.equals(c2416mMo7394l)) {
                            SparseArray<b> sparseArray2 = this.f13410c.f34795b;
                            this.f13402B = sparseArray2.valueAt(sparseArray2.size() - 1).f13437a;
                        } else {
                            this.f13402B = c2416mMo7394l;
                        }
                    }
                    C2416m c2416m2 = this.f13402B;
                    this.f13404D = C10147p.m19101a(c2416m2.f12484l, c2416m2.f12481i);
                    this.f13405E = false;
                    z10 = true;
                }
            } finally {
            }
        }
        c cVar = this.f13413f;
        if (cVar == null || !z10) {
            return;
        }
        cVar.mo7367s();
    }

    /* JADX INFO: renamed from: g */
    public final long m7389g(int i10) {
        this.f13428u = Math.max(this.f13428u, m7395m(i10));
        this.f13423p -= i10;
        int i11 = this.f13424q + i10;
        this.f13424q = i11;
        int i12 = this.f13425r + i10;
        this.f13425r = i12;
        int i13 = this.f13416i;
        if (i12 >= i13) {
            this.f13425r = i12 - i13;
        }
        int i14 = this.f13426s - i10;
        this.f13426s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f13426s = 0;
        }
        while (true) {
            C5734q<b> c5734q = this.f13410c;
            SparseArray<b> sparseArray = c5734q.f34795b;
            if (i15 >= sparseArray.size() - 1) {
                break;
            }
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            c5734q.f34796c.mo12173a(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = c5734q.f34794a;
            if (i17 > 0) {
                c5734q.f34794a = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f13423p != 0) {
            return this.f13418k[this.f13425r];
        }
        int i18 = this.f13425r;
        if (i18 == 0) {
            i18 = this.f13416i;
        }
        int i19 = i18 - 1;
        return this.f13418k[i19] + ((long) this.f13419l[i19]);
    }

    /* JADX INFO: renamed from: h */
    public final void m7390h(long j10, boolean z10, boolean z11) {
        long jM7389g;
        int i10;
        C2498o c2498o = this.f13408a;
        synchronized (this) {
            int i11 = this.f13423p;
            if (i11 != 0) {
                long[] jArr = this.f13421n;
                int i12 = this.f13425r;
                if (j10 >= jArr[i12]) {
                    if (z11 && (i10 = this.f13426s) != i11) {
                        i11 = i10 + 1;
                    }
                    int iM7393k = m7393k(i12, i11, j10, z10);
                    jM7389g = iM7393k == -1 ? -1L : m7389g(iM7393k);
                }
            }
        }
        c2498o.m7383b(jM7389g);
    }

    /* JADX INFO: renamed from: i */
    public final void m7391i() {
        long jM7389g;
        C2498o c2498o = this.f13408a;
        synchronized (this) {
            try {
                int i10 = this.f13423p;
                jM7389g = i10 == 0 ? -1L : m7389g(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c2498o.m7383b(jM7389g);
    }

    /* JADX INFO: renamed from: j */
    public final long m7392j(int i10) {
        int i11 = this.f13424q;
        int i12 = this.f13423p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        C10129a.m18990b(i13 >= 0 && i13 <= i12 - this.f13426s);
        int i14 = this.f13423p - i13;
        this.f13423p = i14;
        this.f13429v = Math.max(this.f13428u, m7395m(i14));
        if (i13 == 0 && this.f13430w) {
            z10 = true;
        }
        this.f13430w = z10;
        C5734q<b> c5734q = this.f13410c;
        SparseArray<b> sparseArray = c5734q.f34795b;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            c5734q.f34796c.mo12173a(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        c5734q.f34794a = sparseArray.size() > 0 ? Math.min(c5734q.f34794a, sparseArray.size() - 1) : -1;
        int i15 = this.f13423p;
        if (i15 == 0) {
            return 0L;
        }
        int iM7396n = m7396n(i15 - 1);
        return this.f13418k[iM7396n] + ((long) this.f13419l[iM7396n]);
    }

    /* JADX INFO: renamed from: k */
    public final int m7393k(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f13421n[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f13420m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f13416i) {
                i10 = 0;
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: l */
    public C2416m mo7394l(C2416m c2416m) {
        if (this.f13406F != 0 && c2416m.f12454K != Long.MAX_VALUE) {
            C2416m.a aVarM7125a = c2416m.m7125a();
            aVarM7125a.f12505o = c2416m.f12454K + this.f13406F;
            c2416m = aVarM7125a.m7128a();
        }
        return c2416m;
    }

    /* JADX INFO: renamed from: m */
    public final long m7395m(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iM7396n = m7396n(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f13421n[iM7396n]);
            if ((this.f13420m[iM7396n] & 1) != 0) {
                break;
            }
            iM7396n--;
            if (iM7396n == -1) {
                iM7396n = this.f13416i - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: n */
    public final int m7396n(int i10) {
        int i11 = this.f13425r + i10;
        int i12 = this.f13416i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized int m7397o(boolean z10, long j10) {
        try {
            int iM7396n = m7396n(this.f13426s);
            int i10 = this.f13426s;
            int i11 = this.f13423p;
            if (!(i10 != i11) || j10 < this.f13421n[iM7396n]) {
                return 0;
            }
            if (j10 > this.f13429v && z10) {
                return i11 - i10;
            }
            int iM7393k = m7393k(iM7396n, i11 - i10, j10, true);
            if (iM7393k == -1) {
                return 0;
            }
            return iM7393k;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public final synchronized C2416m m7398p() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f13432y ? null : this.f13402B;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final synchronized boolean m7399q(boolean z10) {
        C2416m c2416m;
        try {
            int i10 = this.f13426s;
            boolean z11 = true;
            if (i10 != this.f13423p) {
                if (this.f13410c.m12088a(this.f13424q + i10).f13437a != this.f13414g) {
                    return true;
                }
                return m7400r(m7396n(this.f13426s));
            }
            if (!z10 && !this.f13430w && ((c2416m = this.f13402B) == null || c2416m == this.f13414g)) {
                z11 = false;
            }
            return z11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m7400r(int i10) {
        DrmSession drmSession = this.f13415h;
        return drmSession == null || drmSession.getState() == 4 || ((this.f13420m[i10] & 1073741824) == 0 && this.f13415h.mo6940k());
    }

    /* JADX INFO: renamed from: s */
    public final void m7401s(C2416m c2416m, C7968m c7968m) {
        C2416m c2416mM7128a;
        C2416m c2416m2 = this.f13414g;
        boolean z10 = c2416m2 == null;
        DrmInitData drmInitData = z10 ? null : c2416m2.f12453J;
        this.f13414g = c2416m;
        DrmInitData drmInitData2 = c2416m.f12453J;
        InterfaceC2399c interfaceC2399c = this.f13411d;
        if (interfaceC2399c != null) {
            int iMo6947a = interfaceC2399c.mo6947a(c2416m);
            C2416m.a aVarM7125a = c2416m.m7125a();
            aVarM7125a.f12490F = iMo6947a;
            c2416mM7128a = aVarM7125a.m7128a();
        } else {
            c2416mM7128a = c2416m;
        }
        c7968m.f43384b = c2416mM7128a;
        c7968m.f43383a = this.f13415h;
        if (interfaceC2399c == null) {
            return;
        }
        if (z10 || !C10134c0.m19034a(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f13415h;
            InterfaceC2398b.a aVar = this.f13412e;
            DrmSession drmSessionMo6949c = interfaceC2399c.mo6949c(aVar, c2416m);
            this.f13415h = drmSessionMo6949c;
            c7968m.f43383a = drmSessionMo6949c;
            if (drmSession != null) {
                drmSession.mo6938h(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m7402t(C7968m c7968m, DecoderInputBuffer decoderInputBuffer, int i10, boolean z10) {
        int i11;
        boolean z11 = false;
        boolean z12 = (i10 & 2) != 0;
        a aVar = this.f13409b;
        synchronized (this) {
            try {
                decoderInputBuffer.f12117d = false;
                int i12 = this.f13426s;
                if (i12 != this.f13423p) {
                    C2416m c2416m = this.f13410c.m12088a(this.f13424q + i12).f13437a;
                    if (z12 || c2416m != this.f13414g) {
                        m7401s(c2416m, c7968m);
                        i11 = -5;
                    } else {
                        int iM7396n = m7396n(this.f13426s);
                        if (m7400r(iM7396n)) {
                            decoderInputBuffer.f37591a = this.f13420m[iM7396n];
                            long j10 = this.f13421n[iM7396n];
                            decoderInputBuffer.f12118e = j10;
                            if (j10 < this.f13427t) {
                                decoderInputBuffer.m13268l(Integer.MIN_VALUE);
                            }
                            aVar.f13434a = this.f13419l[iM7396n];
                            aVar.f13435b = this.f13418k[iM7396n];
                            aVar.f13436c = this.f13422o[iM7396n];
                            i11 = -4;
                        } else {
                            decoderInputBuffer.f12117d = true;
                            i11 = -3;
                        }
                    }
                } else if (z10 || this.f13430w) {
                    decoderInputBuffer.f37591a = 4;
                    i11 = -4;
                } else {
                    C2416m c2416m2 = this.f13402B;
                    if (c2416m2 == null || (!z12 && c2416m2 == this.f13414g)) {
                        i11 = -3;
                    }
                    m7401s(c2416m2, c7968m);
                    i11 = -5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !decoderInputBuffer.m13269m(4)) {
            if ((i10 & 1) != 0) {
                z11 = true;
            }
            if ((i10 & 4) == 0) {
                if (z11) {
                    C2498o c2498o = this.f13408a;
                    C2498o.m7381f(c2498o.f13394e, decoderInputBuffer, this.f13409b, c2498o.f13392c);
                } else {
                    C2498o c2498o2 = this.f13408a;
                    c2498o2.f13394e = C2498o.m7381f(c2498o2.f13394e, decoderInputBuffer, this.f13409b, c2498o2.f13392c);
                }
            }
            if (!z11) {
                this.f13426s++;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: u */
    public final void m7403u(boolean z10) {
        C5734q<b> c5734q;
        SparseArray<b> sparseArray;
        C2498o c2498o = this.f13408a;
        c2498o.m7382a(c2498o.f13393d);
        C2498o.a aVar = c2498o.f13393d;
        int i10 = 0;
        C10129a.m18992d(aVar.f13399c == null);
        aVar.f13397a = 0L;
        aVar.f13398b = ((long) c2498o.f13391b) + 0;
        C2498o.a aVar2 = c2498o.f13393d;
        c2498o.f13394e = aVar2;
        c2498o.f13395f = aVar2;
        c2498o.f13396g = 0L;
        ((C9885j) c2498o.f13390a).m18381a();
        this.f13423p = 0;
        this.f13424q = 0;
        this.f13425r = 0;
        this.f13426s = 0;
        this.f13431x = true;
        this.f13427t = Long.MIN_VALUE;
        this.f13428u = Long.MIN_VALUE;
        this.f13429v = Long.MIN_VALUE;
        this.f13430w = false;
        while (true) {
            c5734q = this.f13410c;
            sparseArray = c5734q.f34795b;
            if (i10 >= sparseArray.size()) {
                break;
            }
            c5734q.f34796c.mo12173a(sparseArray.valueAt(i10));
            i10++;
        }
        c5734q.f34794a = -1;
        sparseArray.clear();
        if (z10) {
            this.f13401A = null;
            this.f13402B = null;
            this.f13432y = true;
        }
    }

    /* JADX INFO: renamed from: v */
    public final synchronized boolean m7404v(boolean z10, long j10) {
        synchronized (this) {
            try {
                this.f13426s = 0;
                C2498o c2498o = this.f13408a;
                c2498o.f13394e = c2498o.f13393d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iM7396n = m7396n(0);
        int i10 = this.f13426s;
        int i11 = this.f13423p;
        if ((i10 != i11) && j10 >= this.f13421n[iM7396n] && (j10 <= this.f13429v || z10)) {
            int iM7393k = m7393k(iM7396n, i11 - i10, j10, true);
            if (iM7393k == -1) {
                return false;
            }
            this.f13427t = j10;
            this.f13426s += iM7393k;
            return true;
        }
        return false;
    }
}
