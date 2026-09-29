package p411u9;

import android.support.v4.media.C0141b;
import android.util.Pair;
import android.util.SparseArray;
import ba.C1349b;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.kochava.tracker.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p195j9.C6426c;
import p261m9.C7501b;
import p261m9.C7502c;
import p261m9.C7504e;
import p261m9.C7516q;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10130a0;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10148q;
import p479xa.C10151t;
import p482xd.InterfaceC10171c;

/* JADX INFO: renamed from: u9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9482e implements InterfaceC7507h {

    /* JADX INFO: renamed from: G */
    public static final byte[] f48639G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: H */
    public static final C2416m f48640H;

    /* JADX INFO: renamed from: A */
    public int f48641A;

    /* JADX INFO: renamed from: B */
    public boolean f48642B;

    /* JADX INFO: renamed from: C */
    public InterfaceC7509j f48643C;

    /* JADX INFO: renamed from: D */
    public InterfaceC7522w[] f48644D;

    /* JADX INFO: renamed from: E */
    public InterfaceC7522w[] f48645E;

    /* JADX INFO: renamed from: F */
    public boolean f48646F;

    /* JADX INFO: renamed from: a */
    public final int f48647a;

    /* JADX INFO: renamed from: b */
    public final List<C2416m> f48648b;

    /* JADX INFO: renamed from: c */
    public final SparseArray<b> f48649c;

    /* JADX INFO: renamed from: d */
    public final C10151t f48650d;

    /* JADX INFO: renamed from: e */
    public final C10151t f48651e;

    /* JADX INFO: renamed from: f */
    public final C10151t f48652f;

    /* JADX INFO: renamed from: g */
    public final byte[] f48653g;

    /* JADX INFO: renamed from: h */
    public final C10151t f48654h;

    /* JADX INFO: renamed from: i */
    public final C10130a0 f48655i;

    /* JADX INFO: renamed from: j */
    public final C1349b f48656j;

    /* JADX INFO: renamed from: k */
    public final C10151t f48657k;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque<AbstractC9478a.a> f48658l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque<a> f48659m;

    /* JADX INFO: renamed from: n */
    public int f48660n;

    /* JADX INFO: renamed from: o */
    public int f48661o;

    /* JADX INFO: renamed from: p */
    public long f48662p;

    /* JADX INFO: renamed from: q */
    public int f48663q;

    /* JADX INFO: renamed from: r */
    public C10151t f48664r;

    /* JADX INFO: renamed from: s */
    public long f48665s;

    /* JADX INFO: renamed from: t */
    public int f48666t;

    /* JADX INFO: renamed from: u */
    public long f48667u;

    /* JADX INFO: renamed from: v */
    public long f48668v;

    /* JADX INFO: renamed from: w */
    public long f48669w;

    /* JADX INFO: renamed from: x */
    public b f48670x;

    /* JADX INFO: renamed from: y */
    public int f48671y;

    /* JADX INFO: renamed from: z */
    public int f48672z;

    /* JADX INFO: renamed from: u9.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f48673a;

        /* JADX INFO: renamed from: b */
        public final boolean f48674b;

        /* JADX INFO: renamed from: c */
        public final int f48675c;

        public a(int i10, long j10, boolean z10) {
            this.f48673a = j10;
            this.f48674b = z10;
            this.f48675c = i10;
        }
    }

    /* JADX INFO: renamed from: u9.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7522w f48676a;

        /* JADX INFO: renamed from: d */
        public C9491n f48679d;

        /* JADX INFO: renamed from: e */
        public C9480c f48680e;

        /* JADX INFO: renamed from: f */
        public int f48681f;

        /* JADX INFO: renamed from: g */
        public int f48682g;

        /* JADX INFO: renamed from: h */
        public int f48683h;

        /* JADX INFO: renamed from: i */
        public int f48684i;

        /* JADX INFO: renamed from: l */
        public boolean f48687l;

        /* JADX INFO: renamed from: b */
        public final C9490m f48677b = new C9490m();

        /* JADX INFO: renamed from: c */
        public final C10151t f48678c = new C10151t();

        /* JADX INFO: renamed from: j */
        public final C10151t f48685j = new C10151t(1);

        /* JADX INFO: renamed from: k */
        public final C10151t f48686k = new C10151t();

        public b(InterfaceC7522w interfaceC7522w, C9491n c9491n, C9480c c9480c) {
            this.f48676a = interfaceC7522w;
            this.f48679d = c9491n;
            this.f48680e = c9480c;
            this.f48679d = c9491n;
            this.f48680e = c9480c;
            interfaceC7522w.mo7388f(c9491n.f48762a.f48734f);
            m17919d();
        }

        /* JADX INFO: renamed from: a */
        public final C9489l m17916a() {
            C9489l c9489l = null;
            if (!this.f48687l) {
                return null;
            }
            C9490m c9490m = this.f48677b;
            C9480c c9480c = c9490m.f48745a;
            int i10 = C10134c0.f51354a;
            int i11 = c9480c.f48634a;
            C9489l c9489l2 = c9490m.f48757m;
            if (c9489l2 == null) {
                C9489l[] c9489lArr = this.f48679d.f48762a.f48739k;
                c9489l2 = c9489lArr == null ? null : c9489lArr[i11];
            }
            if (c9489l2 != null && c9489l2.f48740a) {
                c9489l = c9489l2;
            }
            return c9489l;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m17917b() {
            this.f48681f++;
            if (!this.f48687l) {
                return false;
            }
            int i10 = this.f48682g + 1;
            this.f48682g = i10;
            int[] iArr = this.f48677b.f48751g;
            int i11 = this.f48683h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f48683h = i11 + 1;
            this.f48682g = 0;
            return false;
        }

        /* JADX INFO: renamed from: c */
        public final int m17918c(int i10, int i11) {
            C10151t c10151t;
            C9489l c9489lM17916a = m17916a();
            if (c9489lM17916a == null) {
                return 0;
            }
            C9490m c9490m = this.f48677b;
            int length = c9489lM17916a.f48743d;
            if (length != 0) {
                c10151t = c9490m.f48758n;
            } else {
                int i12 = C10134c0.f51354a;
                byte[] bArr = c9489lM17916a.f48744e;
                int length2 = bArr.length;
                C10151t c10151t2 = this.f48686k;
                c10151t2.m19122C(bArr, length2);
                length = bArr.length;
                c10151t = c10151t2;
            }
            boolean z10 = c9490m.f48755k && c9490m.f48756l[this.f48681f];
            boolean z11 = z10 || i11 != 0;
            C10151t c10151t3 = this.f48685j;
            c10151t3.f51438a[0] = (byte) ((z11 ? BuildConfig.SDK_TRUNCATE_LENGTH : 0) | length);
            c10151t3.m19124E(0);
            InterfaceC7522w interfaceC7522w = this.f48676a;
            interfaceC7522w.mo7386b(1, c10151t3);
            interfaceC7522w.mo7386b(length, c10151t);
            if (!z11) {
                return length + 1;
            }
            C10151t c10151t4 = this.f48678c;
            if (!z10) {
                c10151t4.m19121B(8);
                byte[] bArr2 = c10151t4.f51438a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                bArr2[4] = (byte) ((i10 >> 24) & 255);
                bArr2[5] = (byte) ((i10 >> 16) & 255);
                bArr2[6] = (byte) ((i10 >> 8) & 255);
                bArr2[7] = (byte) (i10 & 255);
                interfaceC7522w.mo7386b(8, c10151t4);
                return length + 1 + 8;
            }
            C10151t c10151t5 = c9490m.f48758n;
            int iM19150y = c10151t5.m19150y();
            c10151t5.m19125F(-2);
            int i13 = (iM19150y * 6) + 2;
            if (i11 != 0) {
                c10151t4.m19121B(i13);
                byte[] bArr3 = c10151t4.f51438a;
                c10151t5.m19127b(bArr3, 0, i13);
                int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
                bArr3[2] = (byte) ((i14 >> 8) & 255);
                bArr3[3] = (byte) (i14 & 255);
            } else {
                c10151t4 = c10151t5;
            }
            interfaceC7522w.mo7386b(i13, c10151t4);
            return length + 1 + i13;
        }

        /* JADX INFO: renamed from: d */
        public final void m17919d() {
            C9490m c9490m = this.f48677b;
            c9490m.f48748d = 0;
            c9490m.f48760p = 0L;
            c9490m.f48761q = false;
            c9490m.f48755k = false;
            c9490m.f48759o = false;
            c9490m.f48757m = null;
            this.f48681f = 0;
            this.f48683h = 0;
            this.f48682g = 0;
            this.f48684i = 0;
            this.f48687l = false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        C2416m.a aVar = new C2416m.a();
        aVar.f12501k = "application/x-emsg";
        f48640H = aVar.m7128a();
    }

    public C9482e() {
        this(0, null, Collections.emptyList());
    }

    public C9482e(int i10, C10130a0 c10130a0, List list) {
        this.f48647a = i10;
        this.f48655i = c10130a0;
        this.f48648b = Collections.unmodifiableList(list);
        this.f48656j = new C1349b();
        this.f48657k = new C10151t(16);
        this.f48650d = new C10151t(C10148q.f51402a);
        this.f48651e = new C10151t(5);
        this.f48652f = new C10151t();
        byte[] bArr = new byte[16];
        this.f48653g = bArr;
        this.f48654h = new C10151t(bArr);
        this.f48658l = new ArrayDeque<>();
        this.f48659m = new ArrayDeque<>();
        this.f48649c = new SparseArray<>();
        this.f48668v = -9223372036854775807L;
        this.f48667u = -9223372036854775807L;
        this.f48669w = -9223372036854775807L;
        this.f48643C = InterfaceC7509j.f41490A;
        this.f48644D = new InterfaceC7522w[0];
        this.f48645E = new InterfaceC7522w[0];
    }

    /* JADX INFO: renamed from: a */
    public static DrmInitData m17913a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC9478a.b bVar = (AbstractC9478a.b) arrayList.get(i10);
            if (bVar.f48603a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f48607b.f51438a;
                C9485h.a aVarM17928b = C9485h.m17928b(bArr);
                UUID uuid = aVarM17928b == null ? null : aVarM17928b.f48718a;
                if (uuid == null) {
                    C10145n.m19099g("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static void m17914b(C10151t c10151t, int i10, C9490m c9490m) throws ParserException {
        c10151t.m19124E(i10 + 8);
        int iM19129d = c10151t.m19129d() & 16777215;
        if ((iM19129d & 1) != 0) {
            throw ParserException.m6772c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iM19129d & 2) != 0;
        int iM19148w = c10151t.m19148w();
        if (iM19148w == 0) {
            Arrays.fill(c9490m.f48756l, 0, c9490m.f48749e, false);
            return;
        }
        if (iM19148w != c9490m.f48749e) {
            StringBuilder sbM614j = C0141b.m614j("Senc sample count ", iM19148w, " is different from fragment sample count");
            sbM614j.append(c9490m.f48749e);
            throw ParserException.m6770a(sbM614j.toString(), null);
        }
        Arrays.fill(c9490m.f48756l, 0, iM19148w, z10);
        int i11 = c10151t.f51440c - c10151t.f51439b;
        C10151t c10151t2 = c9490m.f48758n;
        c10151t2.m19121B(i11);
        c9490m.f48755k = true;
        c9490m.f48759o = true;
        c10151t.m19127b(c10151t2.f51438a, 0, c10151t2.f51440c);
        c10151t2.m19124E(0);
        c9490m.f48759o = false;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:154:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:157:0x03be  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:169:0x03fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:171:0x0404  */
    /* JADX WARN: Code duplicated, block: B:172:0x0406 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x040b  */
    /* JADX WARN: Code duplicated, block: B:176:0x040f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0414  */
    /* JADX WARN: Code duplicated, block: B:180:0x0433  */
    /* JADX WARN: Code duplicated, block: B:181:0x043f  */
    /* JADX WARN: Code duplicated, block: B:184:0x044b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x0451  */
    /* JADX WARN: Code duplicated, block: B:348:0x047c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x046a A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final void m17915c(long j10) throws ParserException {
        C9480c c9480c;
        C9480c c9480c2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        ArrayList arrayList3;
        int i11;
        SparseArray<b> sparseArray;
        int i12;
        byte[] bArr;
        int i13;
        boolean z10;
        ArrayList arrayList4;
        AbstractC9478a.a aVar;
        b bVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j11;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z15;
        int i14;
        long j12;
        long j13;
        int i15;
        int iM19129d;
        int iM19129d2;
        int iM19129d3;
        int iM19129d4;
        long jM19030O;
        b bVar2;
        boolean z16;
        final C9482e c9482e = this;
        C9482e c9482e2 = c9482e;
        while (true) {
            ArrayDeque<AbstractC9478a.a> arrayDeque = c9482e.f48658l;
            if (arrayDeque.isEmpty() || arrayDeque.peek().f48604b != j10) {
                break;
            }
            AbstractC9478a.a aVarPop = arrayDeque.pop();
            int i16 = aVarPop.f48603a;
            SparseArray<b> sparseArray2 = c9482e.f48649c;
            ArrayList arrayList5 = aVarPop.f48605c;
            int i17 = 12;
            if (i16 == 1836019574) {
                DrmInitData drmInitDataM17913a = m17913a(arrayList5);
                AbstractC9478a.a aVarM17902b = aVarPop.m17902b(1836475768);
                aVarM17902b.getClass();
                SparseArray sparseArray3 = new SparseArray();
                ArrayList arrayList6 = aVarM17902b.f48605c;
                int size = arrayList6.size();
                long jM19146u = -9223372036854775807L;
                int i18 = 0;
                while (i18 < size) {
                    AbstractC9478a.b bVar3 = (AbstractC9478a.b) arrayList6.get(i18);
                    int i19 = bVar3.f48603a;
                    C10151t c10151t = bVar3.f48607b;
                    if (i19 == 1953654136) {
                        c10151t.m19124E(i17);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(c10151t.m19129d()), new C9480c(c10151t.m19129d() - 1, c10151t.m19129d(), c10151t.m19129d(), c10151t.m19129d()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (C9480c) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i19 == 1835362404) {
                            c10151t.m19124E(8);
                            jM19146u = ((c10151t.m19129d() >> 24) & 255) == 0 ? c10151t.m19146u() : c10151t.m19149x();
                        }
                    }
                    i18++;
                    i17 = 12;
                    arrayList6 = arrayList;
                }
                ArrayList arrayListM17908e = C9479b.m17908e(aVarPop, new C7516q(), jM19146u, drmInitDataM17913a, (c9482e.f48647a & 16) != 0, false, new InterfaceC10171c() { // from class: u9.d
                    @Override // p482xd.InterfaceC10171c
                    public final Object apply(Object obj) {
                        C9488k c9488k = (C9488k) obj;
                        this.f48638a.getClass();
                        return c9488k;
                    }
                });
                int size2 = arrayListM17908e.size();
                if (sparseArray2.size() == 0) {
                    for (int i20 = 0; i20 < size2; i20++) {
                        C9491n c9491n = (C9491n) arrayListM17908e.get(i20);
                        C9488k c9488k = c9491n.f48762a;
                        InterfaceC7522w interfaceC7522wMo7366q = c9482e.f48643C.mo7366q(i20, c9488k.f48730b);
                        int size3 = sparseArray3.size();
                        int i21 = c9488k.f48729a;
                        if (size3 == 1) {
                            c9480c2 = (C9480c) sparseArray3.valueAt(0);
                        } else {
                            c9480c2 = (C9480c) sparseArray3.get(i21);
                            c9480c2.getClass();
                        }
                        sparseArray2.put(i21, new b(interfaceC7522wMo7366q, c9491n, c9480c2));
                        c9482e.f48668v = Math.max(c9482e.f48668v, c9488k.f48733e);
                    }
                    c9482e.f48643C.mo7365i();
                } else {
                    C10129a.m18992d(sparseArray2.size() == size2);
                    for (int i22 = 0; i22 < size2; i22++) {
                        C9491n c9491n2 = (C9491n) arrayListM17908e.get(i22);
                        C9488k c9488k2 = c9491n2.f48762a;
                        b bVar4 = sparseArray2.get(c9488k2.f48729a);
                        if (sparseArray3.size() == 1) {
                            c9480c = (C9480c) sparseArray3.valueAt(0);
                        } else {
                            c9480c = (C9480c) sparseArray3.get(c9488k2.f48729a);
                            c9480c.getClass();
                        }
                        bVar4.f48679d = c9491n2;
                        bVar4.f48680e = c9480c;
                        bVar4.f48676a.mo7388f(c9491n2.f48762a.f48734f);
                        bVar4.m17919d();
                    }
                }
            } else if (i16 == 1836019558) {
                ArrayList arrayList7 = aVarPop.f48606d;
                int size4 = arrayList7.size();
                int i23 = 0;
                C9482e c9482e3 = c9482e2;
                C9482e c9482e4 = c9482e;
                while (i23 < size4) {
                    AbstractC9478a.a aVar2 = (AbstractC9478a.a) arrayList7.get(i23);
                    if (aVar2.f48603a == 1953653094) {
                        AbstractC9478a.b bVarM17903c = aVar2.m17903c(1952868452);
                        bVarM17903c.getClass();
                        C10151t c10151t2 = bVarM17903c.f48607b;
                        c10151t2.m19124E(8);
                        int iM19129d5 = c10151t2.m19129d() & 16777215;
                        b bVar5 = sparseArray2.get(c10151t2.m19129d());
                        if (bVar5 == null) {
                            bVar5 = null;
                            c9482e = c9482e;
                        } else {
                            int i24 = iM19129d5 & 1;
                            C9490m c9490m = bVar5.f48677b;
                            if (i24 != 0) {
                                long jM19149x = c10151t2.m19149x();
                                c9490m.f48746b = jM19149x;
                                c9490m.f48747c = jM19149x;
                            }
                            C9480c c9480c3 = bVar5.f48680e;
                            c9490m.f48745a = new C9480c((iM19129d5 & 2) != 0 ? c10151t2.m19129d() - 1 : c9480c3.f48634a, (iM19129d5 & 8) != 0 ? c10151t2.m19129d() : c9480c3.f48635b, (iM19129d5 & 16) != 0 ? c10151t2.m19129d() : c9480c3.f48636c, (iM19129d5 & 32) != 0 ? c10151t2.m19129d() : c9480c3.f48637d);
                        }
                        if (bVar5 != null) {
                            C9490m c9490m2 = bVar5.f48677b;
                            long j14 = c9490m2.f48760p;
                            boolean z17 = c9490m2.f48761q;
                            bVar5.m17919d();
                            bVar5.f48687l = true;
                            AbstractC9478a.b bVarM17903c2 = aVar2.m17903c(1952867444);
                            int i25 = c9482e4.f48647a;
                            if (bVarM17903c2 == null || (i25 & 2) != 0) {
                                c9490m2.f48760p = j14;
                                c9490m2.f48761q = z17;
                            } else {
                                C10151t c10151t3 = bVarM17903c2.f48607b;
                                c10151t3.m19124E(8);
                                c9490m2.f48760p = ((c10151t3.m19129d() >> 24) & 255) == 1 ? c10151t3.m19149x() : c10151t3.m19146u();
                                c9490m2.f48761q = true;
                            }
                            ArrayList arrayList8 = aVar2.f48605c;
                            int size5 = arrayList8.size();
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            while (true) {
                                i12 = 1953658222;
                                if (i26 >= size5) {
                                    break;
                                }
                                AbstractC9478a.b bVar6 = (AbstractC9478a.b) arrayList8.get(i26);
                                ArrayList arrayList9 = arrayList7;
                                if (bVar6.f48603a == 1953658222) {
                                    C10151t c10151t4 = bVar6.f48607b;
                                    c10151t4.m19124E(12);
                                    int iM19148w = c10151t4.m19148w();
                                    if (iM19148w > 0) {
                                        i28 += iM19148w;
                                        i27++;
                                    }
                                }
                                i26++;
                                arrayList7 = arrayList9;
                            }
                            arrayList2 = arrayList7;
                            bVar5.f48683h = 0;
                            bVar5.f48682g = 0;
                            bVar5.f48681f = 0;
                            c9490m2.f48748d = i27;
                            c9490m2.f48749e = i28;
                            if (c9490m2.f48751g.length < i27) {
                                c9490m2.f48750f = new long[i27];
                                c9490m2.f48751g = new int[i27];
                            }
                            if (c9490m2.f48752h.length < i28) {
                                int i29 = (i28 * 125) / 100;
                                c9490m2.f48752h = new int[i29];
                                c9490m2.f48753i = new long[i29];
                                c9490m2.f48754j = new boolean[i29];
                                c9490m2.f48756l = new boolean[i29];
                            }
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            b bVar7 = bVar5;
                            while (i30 < size5) {
                                AbstractC9478a.b bVar8 = (AbstractC9478a.b) arrayList8.get(i30);
                                int i33 = size4;
                                if (bVar8.f48603a == i12) {
                                    int i34 = i32 + 1;
                                    C10151t c10151t5 = bVar8.f48607b;
                                    c10151t5.m19124E(8);
                                    int iM19129d6 = c10151t5.m19129d() & 16777215;
                                    C9488k c9488k3 = bVar7.f48679d.f48762a;
                                    C9480c c9480c4 = c9490m2.f48745a;
                                    int i35 = C10134c0.f51354a;
                                    c9490m2.f48751g[i32] = c10151t5.m19148w();
                                    long[] jArr2 = c9490m2.f48750f;
                                    long j15 = c9490m2.f48746b;
                                    jArr2[i32] = j15;
                                    if ((iM19129d6 & 1) != 0) {
                                        jArr2[i32] = j15 + ((long) c10151t5.m19129d());
                                    }
                                    boolean z18 = (iM19129d6 & 4) != 0;
                                    int iM19129d7 = c9480c4.f48637d;
                                    if (z18) {
                                        iM19129d7 = c10151t5.m19129d();
                                    }
                                    boolean z19 = (iM19129d6 & 256) != 0;
                                    boolean z20 = (iM19129d6 & 512) != 0;
                                    boolean z21 = (iM19129d6 & 1024) != 0;
                                    boolean z22 = (iM19129d6 & 2048) != 0;
                                    long[] jArr3 = c9488k3.f48736h;
                                    int i36 = iM19129d7;
                                    long[] jArr4 = c9488k3.f48737i;
                                    if (jArr3 != null) {
                                        arrayList4 = arrayList8;
                                        aVar = aVar2;
                                        if (jArr3.length != 1 || jArr4 == null) {
                                            z13 = z18;
                                            z11 = z20;
                                            z12 = z21;
                                        } else {
                                            long j16 = jArr3[0];
                                            if (j16 == 0) {
                                                z13 = z18;
                                                z11 = z20;
                                                z12 = z21;
                                            } else {
                                                z13 = z18;
                                                long jM19030O2 = C10134c0.m19030O(j16 + jArr4[0], 1000000L, c9488k3.f48732d);
                                                z11 = z20;
                                                z12 = z21;
                                                if (jM19030O2 >= c9488k3.f48733e) {
                                                }
                                                if (z14) {
                                                    j11 = jArr4[0];
                                                } else {
                                                    j11 = 0;
                                                }
                                                iArr = c9490m2.f48752h;
                                                jArr = c9490m2.f48753i;
                                                zArr = c9490m2.f48754j;
                                                if (c9488k3.f48730b == 2 || (i25 & 1) == 0) {
                                                    z15 = false;
                                                } else {
                                                    z15 = true;
                                                }
                                                i14 = c9490m2.f48751g[i32] + i31;
                                                j12 = c9488k3.f48731c;
                                                j13 = c9490m2.f48760p;
                                                i15 = i31;
                                                while (i15 < i14) {
                                                    if (z19) {
                                                        iM19129d = c10151t5.m19129d();
                                                    } else {
                                                        iM19129d = c9480c4.f48635b;
                                                    }
                                                    if (iM19129d < 0) {
                                                        throw ParserException.m6770a("Unexpected negative value: " + iM19129d, null);
                                                    }
                                                    if (z11) {
                                                        iM19129d2 = c10151t5.m19129d();
                                                    } else {
                                                        iM19129d2 = c9480c4.f48636c;
                                                    }
                                                    if (iM19129d2 < 0) {
                                                        throw ParserException.m6770a("Unexpected negative value: " + iM19129d2, null);
                                                    }
                                                    if (z12) {
                                                        iM19129d3 = c10151t5.m19129d();
                                                    } else if (i15 == 0 || !z13) {
                                                        iM19129d3 = c9480c4.f48637d;
                                                    } else {
                                                        iM19129d3 = i36;
                                                    }
                                                    if (z22) {
                                                        iM19129d4 = c10151t5.m19129d();
                                                    } else {
                                                        iM19129d4 = 0;
                                                    }
                                                    C9480c c9480c5 = c9480c4;
                                                    boolean z23 = z13;
                                                    int i37 = iM19129d4;
                                                    int i38 = iM19129d;
                                                    jM19030O = C10134c0.m19030O((((long) i37) + j13) - j11, 1000000L, j12);
                                                    jArr[i15] = jM19030O;
                                                    if (c9490m2.f48761q) {
                                                        bVar2 = bVar5;
                                                    } else {
                                                        bVar2 = bVar5;
                                                        jArr[i15] = jM19030O + bVar2.f48679d.f48769h;
                                                    }
                                                    iArr[i15] = iM19129d2;
                                                    if (((iM19129d3 >> 16) & 1) == 0 || (z15 && i15 != 0)) {
                                                        z16 = false;
                                                    } else {
                                                        z16 = true;
                                                    }
                                                    zArr[i15] = z16;
                                                    j13 += (long) i38;
                                                    i15++;
                                                    bVar5 = bVar2;
                                                    j12 = j12;
                                                    z19 = z19;
                                                    i14 = i14;
                                                    z11 = z11;
                                                    c9480c4 = c9480c5;
                                                    z13 = z23;
                                                }
                                                bVar = bVar5;
                                                c9490m2.f48760p = j13;
                                                bVar7 = bVar;
                                                i32 = i34;
                                                i31 = i14;
                                            }
                                            z14 = true;
                                            if (z14) {
                                                j11 = jArr4[0];
                                            } else {
                                                j11 = 0;
                                            }
                                            iArr = c9490m2.f48752h;
                                            jArr = c9490m2.f48753i;
                                            zArr = c9490m2.f48754j;
                                            if (c9488k3.f48730b == 2) {
                                                z15 = false;
                                            } else {
                                                z15 = false;
                                            }
                                            i14 = c9490m2.f48751g[i32] + i31;
                                            j12 = c9488k3.f48731c;
                                            j13 = c9490m2.f48760p;
                                            i15 = i31;
                                            while (i15 < i14) {
                                                if (z19) {
                                                    iM19129d = c10151t5.m19129d();
                                                } else {
                                                    iM19129d = c9480c4.f48635b;
                                                }
                                                if (iM19129d < 0) {
                                                    throw ParserException.m6770a("Unexpected negative value: " + iM19129d, null);
                                                }
                                                if (z11) {
                                                    iM19129d2 = c10151t5.m19129d();
                                                } else {
                                                    iM19129d2 = c9480c4.f48636c;
                                                }
                                                if (iM19129d2 < 0) {
                                                    throw ParserException.m6770a("Unexpected negative value: " + iM19129d2, null);
                                                }
                                                if (z12) {
                                                    iM19129d3 = c10151t5.m19129d();
                                                } else if (i15 == 0) {
                                                    iM19129d3 = c9480c4.f48637d;
                                                } else {
                                                    iM19129d3 = c9480c4.f48637d;
                                                }
                                                if (z22) {
                                                    iM19129d4 = c10151t5.m19129d();
                                                } else {
                                                    iM19129d4 = 0;
                                                }
                                                C9480c c9480c6 = c9480c4;
                                                boolean z24 = z13;
                                                int i39 = iM19129d4;
                                                int i310 = iM19129d;
                                                jM19030O = C10134c0.m19030O((((long) i39) + j13) - j11, 1000000L, j12);
                                                jArr[i15] = jM19030O;
                                                if (c9490m2.f48761q) {
                                                    bVar2 = bVar5;
                                                    jArr[i15] = jM19030O + bVar2.f48679d.f48769h;
                                                } else {
                                                    bVar2 = bVar5;
                                                }
                                                iArr[i15] = iM19129d2;
                                                if (((iM19129d3 >> 16) & 1) == 0) {
                                                    z16 = false;
                                                } else {
                                                    z16 = false;
                                                }
                                                zArr[i15] = z16;
                                                j13 += (long) i310;
                                                i15++;
                                                bVar5 = bVar2;
                                                j12 = j12;
                                                z19 = z19;
                                                i14 = i14;
                                                z11 = z11;
                                                c9480c4 = c9480c6;
                                                z13 = z24;
                                            }
                                            bVar = bVar5;
                                            c9490m2.f48760p = j13;
                                            bVar7 = bVar;
                                            i32 = i34;
                                            i31 = i14;
                                        }
                                    } else {
                                        arrayList4 = arrayList8;
                                        aVar = aVar2;
                                        z11 = z20;
                                        z12 = z21;
                                        z13 = z18;
                                    }
                                    z14 = false;
                                    if (z14) {
                                        j11 = jArr4[0];
                                    } else {
                                        j11 = 0;
                                    }
                                    iArr = c9490m2.f48752h;
                                    jArr = c9490m2.f48753i;
                                    zArr = c9490m2.f48754j;
                                    if (c9488k3.f48730b == 2) {
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                    }
                                    i14 = c9490m2.f48751g[i32] + i31;
                                    j12 = c9488k3.f48731c;
                                    j13 = c9490m2.f48760p;
                                    i15 = i31;
                                    while (i15 < i14) {
                                        if (z19) {
                                            iM19129d = c10151t5.m19129d();
                                        } else {
                                            iM19129d = c9480c4.f48635b;
                                        }
                                        if (iM19129d < 0) {
                                            throw ParserException.m6770a("Unexpected negative value: " + iM19129d, null);
                                        }
                                        if (z11) {
                                            iM19129d2 = c10151t5.m19129d();
                                        } else {
                                            iM19129d2 = c9480c4.f48636c;
                                        }
                                        if (iM19129d2 < 0) {
                                            throw ParserException.m6770a("Unexpected negative value: " + iM19129d2, null);
                                        }
                                        if (z12) {
                                            iM19129d3 = c10151t5.m19129d();
                                        } else if (i15 == 0) {
                                            iM19129d3 = c9480c4.f48637d;
                                        } else {
                                            iM19129d3 = c9480c4.f48637d;
                                        }
                                        if (z22) {
                                            iM19129d4 = c10151t5.m19129d();
                                        } else {
                                            iM19129d4 = 0;
                                        }
                                        C9480c c9480c7 = c9480c4;
                                        boolean z25 = z13;
                                        int i311 = iM19129d4;
                                        int i312 = iM19129d;
                                        jM19030O = C10134c0.m19030O((((long) i311) + j13) - j11, 1000000L, j12);
                                        jArr[i15] = jM19030O;
                                        if (c9490m2.f48761q) {
                                            bVar2 = bVar5;
                                            jArr[i15] = jM19030O + bVar2.f48679d.f48769h;
                                        } else {
                                            bVar2 = bVar5;
                                        }
                                        iArr[i15] = iM19129d2;
                                        if (((iM19129d3 >> 16) & 1) == 0) {
                                            z16 = false;
                                        } else {
                                            z16 = false;
                                        }
                                        zArr[i15] = z16;
                                        j13 += (long) i312;
                                        i15++;
                                        bVar5 = bVar2;
                                        j12 = j12;
                                        z19 = z19;
                                        i14 = i14;
                                        z11 = z11;
                                        c9480c4 = c9480c7;
                                        z13 = z25;
                                    }
                                    bVar = bVar5;
                                    c9490m2.f48760p = j13;
                                    bVar7 = bVar;
                                    i32 = i34;
                                    i31 = i14;
                                } else {
                                    arrayList4 = arrayList8;
                                    aVar = aVar2;
                                    bVar = bVar5;
                                    sparseArray2 = sparseArray2;
                                }
                                i30++;
                                i12 = 1953658222;
                                bVar5 = bVar;
                                size4 = i33;
                                size5 = size5;
                                arrayList5 = arrayList5;
                                i23 = i23;
                                sparseArray2 = sparseArray2;
                                arrayList8 = arrayList4;
                                aVar2 = aVar;
                                i25 = i25;
                            }
                            i10 = size4;
                            ArrayList arrayList10 = arrayList8;
                            arrayList3 = arrayList5;
                            i11 = i23;
                            AbstractC9478a.a aVar3 = aVar2;
                            sparseArray = sparseArray2;
                            C9488k c9488k4 = bVar5.f48679d.f48762a;
                            C9480c c9480c8 = c9490m2.f48745a;
                            c9480c8.getClass();
                            C9489l[] c9489lArr = c9488k4.f48739k;
                            C9489l c9489l = c9489lArr == null ? null : c9489lArr[c9480c8.f48634a];
                            AbstractC9478a.b bVarM17903c3 = aVar3.m17903c(1935763834);
                            if (bVarM17903c3 != null) {
                                c9489l.getClass();
                                C10151t c10151t6 = bVarM17903c3.f48607b;
                                c10151t6.m19124E(8);
                                if ((c10151t6.m19129d() & 16777215 & 1) == 1) {
                                    c10151t6.m19125F(8);
                                }
                                int iM19145t = c10151t6.m19145t();
                                int iM19148w2 = c10151t6.m19148w();
                                if (iM19148w2 > c9490m2.f48749e) {
                                    StringBuilder sbM614j = C0141b.m614j("Saiz sample count ", iM19148w2, " is greater than fragment sample count");
                                    sbM614j.append(c9490m2.f48749e);
                                    throw ParserException.m6770a(sbM614j.toString(), null);
                                }
                                int i40 = c9489l.f48743d;
                                if (iM19145t == 0) {
                                    boolean[] zArr2 = c9490m2.f48756l;
                                    i13 = 0;
                                    for (int i41 = 0; i41 < iM19148w2; i41++) {
                                        int iM19145t2 = c10151t6.m19145t();
                                        i13 += iM19145t2;
                                        zArr2[i41] = iM19145t2 > i40;
                                    }
                                    z10 = false;
                                } else {
                                    i13 = (iM19145t * iM19148w2) + 0;
                                    Arrays.fill(c9490m2.f48756l, 0, iM19148w2, iM19145t > i40);
                                    z10 = false;
                                }
                                Arrays.fill(c9490m2.f48756l, iM19148w2, c9490m2.f48749e, z10);
                                if (i13 > 0) {
                                    c9490m2.f48758n.m19121B(i13);
                                    c9490m2.f48755k = true;
                                    c9490m2.f48759o = true;
                                }
                            }
                            AbstractC9478a.b bVarM17903c4 = aVar3.m17903c(1935763823);
                            if (bVarM17903c4 != null) {
                                C10151t c10151t7 = bVarM17903c4.f48607b;
                                c10151t7.m19124E(8);
                                int iM19129d8 = c10151t7.m19129d();
                                if ((16777215 & iM19129d8 & 1) == 1) {
                                    c10151t7.m19125F(8);
                                }
                                int iM19148w3 = c10151t7.m19148w();
                                if (iM19148w3 != 1) {
                                    throw ParserException.m6770a("Unexpected saio entry count: " + iM19148w3, null);
                                }
                                c9490m2.f48747c += ((iM19129d8 >> 24) & 255) == 0 ? c10151t7.m19146u() : c10151t7.m19149x();
                            }
                            AbstractC9478a.b bVarM17903c5 = aVar3.m17903c(1936027235);
                            if (bVarM17903c5 != null) {
                                m17914b(bVarM17903c5.f48607b, 0, c9490m2);
                            }
                            String str = c9489l != null ? c9489l.f48741b : null;
                            int i42 = 0;
                            C10151t c10151t8 = null;
                            C10151t c10151t9 = null;
                            while (i42 < arrayList10.size()) {
                                ArrayList arrayList11 = arrayList10;
                                AbstractC9478a.b bVar9 = (AbstractC9478a.b) arrayList11.get(i42);
                                C10151t c10151t10 = bVar9.f48607b;
                                int i43 = bVar9.f48603a;
                                if (i43 == 1935828848) {
                                    c10151t10.m19124E(12);
                                    if (c10151t10.m19129d() == 1936025959) {
                                        c10151t8 = c10151t10;
                                    }
                                } else if (i43 == 1936158820) {
                                    c10151t10.m19124E(12);
                                    if (c10151t10.m19129d() == 1936025959) {
                                        c10151t9 = c10151t10;
                                    }
                                }
                                i42++;
                                arrayList10 = arrayList11;
                            }
                            ArrayList arrayList12 = arrayList10;
                            if (c10151t8 != null && c10151t9 != null) {
                                c10151t8.m19124E(8);
                                int iM19129d9 = (c10151t8.m19129d() >> 24) & 255;
                                c10151t8.m19125F(4);
                                if (iM19129d9 == 1) {
                                    c10151t8.m19125F(4);
                                }
                                if (c10151t8.m19129d() != 1) {
                                    throw ParserException.m6772c("Entry count in sbgp != 1 (unsupported).");
                                }
                                c10151t9.m19124E(8);
                                int iM19129d10 = (c10151t9.m19129d() >> 24) & 255;
                                c10151t9.m19125F(4);
                                if (iM19129d10 == 1) {
                                    if (c10151t9.m19146u() == 0) {
                                        throw ParserException.m6772c("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iM19129d10 >= 2) {
                                    c10151t9.m19125F(4);
                                }
                                if (c10151t9.m19146u() != 1) {
                                    throw ParserException.m6772c("Entry count in sgpd != 1 (unsupported).");
                                }
                                c10151t9.m19125F(1);
                                int iM19145t3 = c10151t9.m19145t();
                                int i44 = (iM19145t3 & 240) >> 4;
                                int i45 = iM19145t3 & 15;
                                boolean z26 = c10151t9.m19145t() == 1;
                                if (z26) {
                                    int iM19145t4 = c10151t9.m19145t();
                                    byte[] bArr2 = new byte[16];
                                    c10151t9.m19127b(bArr2, 0, 16);
                                    if (iM19145t4 == 0) {
                                        int iM19145t5 = c10151t9.m19145t();
                                        byte[] bArr3 = new byte[iM19145t5];
                                        c10151t9.m19127b(bArr3, 0, iM19145t5);
                                        bArr = bArr3;
                                    } else {
                                        bArr = null;
                                    }
                                    c9490m2.f48755k = true;
                                    c9490m2.f48757m = new C9489l(z26, str, iM19145t4, bArr2, i44, i45, bArr);
                                }
                            }
                            int size6 = arrayList12.size();
                            for (int i46 = 0; i46 < size6; i46++) {
                                AbstractC9478a.b bVar10 = (AbstractC9478a.b) arrayList12.get(i46);
                                if (bVar10.f48603a == 1970628964) {
                                    C10151t c10151t11 = bVar10.f48607b;
                                    c10151t11.m19124E(8);
                                    byte[] bArr4 = this.f48653g;
                                    c10151t11.m19127b(bArr4, 0, 16);
                                    if (Arrays.equals(bArr4, f48639G)) {
                                        m17914b(c10151t11, 16, c9490m2);
                                    }
                                }
                            }
                            c9482e = this;
                            c9482e4 = c9482e;
                            c9482e3 = c9482e4;
                        }
                        i23 = i11 + 1;
                        arrayList7 = arrayList2;
                        size4 = i10;
                        arrayList5 = arrayList3;
                        sparseArray2 = sparseArray;
                    } else {
                        c9482e = c9482e;
                    }
                    arrayList2 = arrayList7;
                    i10 = size4;
                    arrayList3 = arrayList5;
                    i11 = i23;
                    sparseArray = sparseArray2;
                    c9482e = c9482e;
                    i23 = i11 + 1;
                    arrayList7 = arrayList2;
                    size4 = i10;
                    arrayList5 = arrayList3;
                    sparseArray2 = sparseArray;
                }
                C9482e c9482e5 = c9482e;
                SparseArray<b> sparseArray4 = sparseArray2;
                DrmInitData drmInitDataM17913a2 = m17913a(arrayList5);
                if (drmInitDataM17913a2 != null) {
                    int size7 = sparseArray4.size();
                    int i47 = 0;
                    while (i47 < size7) {
                        SparseArray<b> sparseArray5 = sparseArray4;
                        b bVarValueAt = sparseArray5.valueAt(i47);
                        C9488k c9488k5 = bVarValueAt.f48679d.f48762a;
                        C9480c c9480c9 = bVarValueAt.f48677b.f48745a;
                        int i48 = C10134c0.f51354a;
                        int i49 = c9480c9.f48634a;
                        C9489l[] c9489lArr2 = c9488k5.f48739k;
                        C9489l c9489l2 = c9489lArr2 == null ? null : c9489lArr2[i49];
                        DrmInitData drmInitDataM6956a = drmInitDataM17913a2.m6956a(c9489l2 != null ? c9489l2.f48741b : null);
                        C2416m c2416m = bVarValueAt.f48679d.f48762a.f48734f;
                        c2416m.getClass();
                        C2416m.a aVar4 = new C2416m.a(c2416m);
                        aVar4.f12504n = drmInitDataM6956a;
                        bVarValueAt.f48676a.mo7388f(new C2416m(aVar4));
                        i47++;
                        sparseArray4 = sparseArray5;
                    }
                }
                SparseArray<b> sparseArray6 = sparseArray4;
                if (c9482e4.f48667u != -9223372036854775807L) {
                    int size8 = sparseArray6.size();
                    for (int i50 = 0; i50 < size8; i50++) {
                        b bVarValueAt2 = sparseArray6.valueAt(i50);
                        long j17 = c9482e4.f48667u;
                        int i51 = bVarValueAt2.f48681f;
                        while (true) {
                            C9490m c9490m3 = bVarValueAt2.f48677b;
                            if (i51 >= c9490m3.f48749e || c9490m3.f48753i[i51] > j17) {
                                break;
                            }
                            if (c9490m3.f48754j[i51]) {
                                bVarValueAt2.f48684i = i51;
                            }
                            i51++;
                        }
                    }
                    c9482e4.f48667u = -9223372036854775807L;
                }
                c9482e2 = c9482e3;
                c9482e = c9482e5;
            } else if (!arrayDeque.isEmpty()) {
                arrayDeque.peek().f48606d.add(aVarPop);
            }
        }
        c9482e2.f48660n = 0;
        c9482e2.f48663q = 0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x020d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0215 A[PHI: r18
      0x0215: PHI (r18v11 xa.t) = (r18v9 xa.t), (r18v12 xa.t) binds: [B:103:0x0213, B:97:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x021c  */
    /* JADX WARN: Code duplicated, block: B:108:0x021e  */
    /* JADX WARN: Code duplicated, block: B:113:0x023d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0245  */
    /* JADX WARN: Code duplicated, block: B:116:0x027b  */
    /* JADX WARN: Code duplicated, block: B:120:0x029e  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a6 A[LOOP:8: B:121:0x02a0->B:123:0x02a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:136:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:143:0x0309  */
    /* JADX WARN: Code duplicated, block: B:146:0x030e  */
    /* JADX WARN: Code duplicated, block: B:149:0x031a A[LOOP:7: B:148:0x0318->B:149:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x0344  */
    /* JADX WARN: Code duplicated, block: B:239:0x064d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0665  */
    /* JADX WARN: Code duplicated, block: B:242:0x066b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0689  */
    /* JADX WARN: Code duplicated, block: B:252:0x069b  */
    /* JADX WARN: Code duplicated, block: B:260:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:262:0x06cf A[LOOP:10: B:261:0x06cd->B:262:0x06cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:266:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:285:0x0722  */
    /* JADX WARN: Code duplicated, block: B:287:0x0725  */
    /* JADX WARN: Code duplicated, block: B:289:0x073e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0742  */
    /* JADX WARN: Code duplicated, block: B:293:0x074c  */
    /* JADX WARN: Code duplicated, block: B:351:0x07db  */
    /* JADX WARN: Code duplicated, block: B:354:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:356:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:358:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:363:0x0815  */
    /* JADX WARN: Code duplicated, block: B:365:0x081b  */
    /* JADX WARN: Code duplicated, block: B:378:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0834 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x080e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0807 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x082d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x02b3 A[EDGE_INSN: B:405:0x02b3->B:124:0x02b3 BREAK  A[LOOP:8: B:121:0x02a0->B:123:0x02a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x0109  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    /* JADX WARN: Code duplicated, block: B:71:0x012b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0149  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0205  */
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
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        InterfaceC7508i interfaceC7508i2;
        C9482e c9482e;
        long j10;
        C7504e c7504e;
        long j11;
        long j12;
        int i10;
        C7504e c7504e2;
        long j13;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j14;
        int size;
        int i13;
        C9491n c9491n;
        C9488k c9488k;
        InterfaceC7522w interfaceC7522w;
        boolean z14;
        C9490m c9490m;
        long jM19003a;
        int i14;
        C10130a0 c10130a0;
        int i15;
        int i16;
        int i17;
        C9489l c9489lM17916a;
        InterfaceC7522w.a aVar;
        a aVarRemoveFirst;
        boolean z15;
        long jM19003a2;
        C10130a0 c10130a1;
        int i18;
        C10151t c10151t;
        byte[] bArr;
        int i19;
        int i20;
        int i21;
        C2416m c2416m;
        C10151t c10151t2;
        int iM15022d;
        int iM19129d;
        String str;
        byte b10;
        boolean z16;
        boolean z17;
        boolean z18;
        C9490m c9490m2;
        int i22;
        int i23;
        C9489l c9489lM17916a2;
        C10151t c10151t3;
        int i24;
        boolean z19;
        InterfaceC7508i interfaceC7508i3;
        C9482e c9482e2;
        String strM19139n;
        String strM19139n2;
        long jM19030O;
        long jM19146u;
        long jM19003a3;
        long jM19149x;
        long jM19149x2;
        C9482e c9482e3 = this;
        InterfaceC7508i interfaceC7508i4 = interfaceC7508i;
        while (true) {
            int i25 = c9482e3.f48660n;
            ArrayDeque<AbstractC9478a.a> arrayDeque = c9482e3.f48658l;
            SparseArray<b> sparseArray = c9482e3.f48649c;
            if (i25 != 0) {
                ArrayDeque<a> arrayDeque2 = c9482e3.f48659m;
                C10130a0 c10130a2 = c9482e3.f48655i;
                if (i25 != 1) {
                    long j15 = Long.MAX_VALUE;
                    if (i25 != 2) {
                        b bVar = c9482e3.f48670x;
                        if (bVar == null) {
                            int size2 = sparseArray.size();
                            b bVar2 = null;
                            for (int i26 = 0; i26 < size2; i26++) {
                                b bVarValueAt = sparseArray.valueAt(i26);
                                boolean z20 = bVarValueAt.f48687l;
                                if (z20 || bVarValueAt.f48681f != bVarValueAt.f48679d.f48763b) {
                                    C9490m c9490m3 = bVarValueAt.f48677b;
                                    if (!z20 || bVarValueAt.f48683h != c9490m3.f48748d) {
                                        long j16 = !z20 ? bVarValueAt.f48679d.f48764c[bVarValueAt.f48681f] : c9490m3.f48750f[bVarValueAt.f48683h];
                                        if (j16 < j15) {
                                            bVar2 = bVarValueAt;
                                            j15 = j16;
                                        }
                                    }
                                }
                            }
                            if (bVar2 == null) {
                                int i27 = (int) (c9482e3.f48665s - ((C7504e) interfaceC7508i).f41477d);
                                if (i27 < 0) {
                                    throw ParserException.m6770a("Offset to end of mdat was negative.", null);
                                }
                                ((C7504e) interfaceC7508i4).mo14998j(i27);
                                c9482e3.f48660n = 0;
                                c9482e3.f48663q = 0;
                                z17 = false;
                            } else {
                                int i28 = (int) ((!bVar2.f48687l ? bVar2.f48679d.f48764c[bVar2.f48681f] : bVar2.f48677b.f48750f[bVar2.f48683h]) - ((C7504e) interfaceC7508i).f41477d);
                                if (i28 < 0) {
                                    C10145n.m19099g("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i28 = 0;
                                }
                                ((C7504e) interfaceC7508i4).mo14998j(i28);
                                c9482e3.f48670x = bVar2;
                                bVar = bVar2;
                                if (c9482e3.f48660n == 3) {
                                    z18 = bVar.f48687l;
                                    c9490m2 = bVar.f48677b;
                                    if (z18) {
                                        i22 = c9490m2.f48752h[bVar.f48681f];
                                    } else {
                                        i22 = bVar.f48679d.f48765d[bVar.f48681f];
                                    }
                                    c9482e3.f48671y = i22;
                                    if (bVar.f48681f < bVar.f48684i) {
                                        ((C7504e) interfaceC7508i4).mo14998j(i22);
                                        c9489lM17916a2 = bVar.m17916a();
                                        if (c9489lM17916a2 != null) {
                                            c10151t3 = c9490m2.f48758n;
                                            i24 = c9489lM17916a2.f48743d;
                                            if (i24 != 0) {
                                                c10151t3.m19125F(i24);
                                            }
                                            int i29 = bVar.f48681f;
                                            if (c9490m2.f48755k || !c9490m2.f48756l[i29]) {
                                                z19 = false;
                                            } else {
                                                z19 = true;
                                            }
                                            if (z19) {
                                                c10151t3.m19125F(c10151t3.m19150y() * 6);
                                            }
                                        }
                                        if (!bVar.m17917b()) {
                                            c9482e3.f48670x = null;
                                        }
                                        c9482e3.f48660n = 3;
                                    } else {
                                        if (bVar.f48679d.f48762a.f48735g == 1) {
                                            c9482e3.f48671y = i22 - 8;
                                            ((C7504e) interfaceC7508i4).mo14998j(8);
                                        }
                                        if ("audio/ac4".equals(bVar.f48679d.f48762a.f48734f.f12484l)) {
                                            c9482e3.f48672z = bVar.m17918c(c9482e3.f48671y, 7);
                                            int i30 = c9482e3.f48671y;
                                            C10151t c10151t4 = c9482e3.f48654h;
                                            C6426c.m13048a(i30, c10151t4);
                                            bVar.f48676a.m15021c(7, c10151t4);
                                            c9482e3.f48672z += 7;
                                            i23 = 0;
                                        } else {
                                            i23 = 0;
                                            c9482e3.f48672z = bVar.m17918c(c9482e3.f48671y, 0);
                                        }
                                        c9482e3.f48671y += c9482e3.f48672z;
                                        c9482e3.f48660n = 4;
                                        c9482e3.f48641A = i23;
                                        c9491n = bVar.f48679d;
                                        c9488k = c9491n.f48762a;
                                        interfaceC7522w = bVar.f48676a;
                                        z14 = bVar.f48687l;
                                        c9490m = bVar.f48677b;
                                        if (z14) {
                                            jM19003a = c9490m.f48753i[bVar.f48681f];
                                        } else {
                                            jM19003a = c9491n.f48767f[bVar.f48681f];
                                        }
                                        if (c10130a2 != null) {
                                            jM19003a = c10130a2.m19003a(jM19003a);
                                        }
                                        i14 = c9488k.f48738j;
                                        if (i14 != 0) {
                                            c10130a0 = c10130a2;
                                            while (true) {
                                                i15 = c9482e3.f48672z;
                                                i16 = c9482e3.f48671y;
                                                if (i15 < i16) {
                                                    break;
                                                }
                                                c9482e3.f48672z += interfaceC7522w.m15022d(interfaceC7508i4, i16 - i15, false);
                                            }
                                        } else {
                                            c10151t = c9482e3.f48651e;
                                            bArr = c10151t.f51438a;
                                            bArr[0] = 0;
                                            bArr[1] = 0;
                                            bArr[2] = 0;
                                            i19 = i14 + 1;
                                            i20 = 4 - i14;
                                            while (c9482e3.f48672z < c9482e3.f48671y) {
                                                i21 = c9482e3.f48641A;
                                                C10130a0 c10130a3 = c10130a2;
                                                c2416m = c9488k.f48734f;
                                                if (i21 == 0) {
                                                    ((C7504e) interfaceC7508i4).mo14993b(bArr, i20, i19, false);
                                                    c10151t.m19124E(0);
                                                    iM19129d = c10151t.m19129d();
                                                    if (iM19129d >= 1) {
                                                        throw ParserException.m6770a("Invalid NAL length", null);
                                                    }
                                                    c9482e3.f48641A = iM19129d - 1;
                                                    C10151t c10151t5 = c9482e3.f48650d;
                                                    c10151t5.m19124E(0);
                                                    interfaceC7522w.m15021c(4, c10151t5);
                                                    interfaceC7522w.m15021c(1, c10151t);
                                                    if (c9482e3.f48645E.length > 0) {
                                                        str = c2416m.f12484l;
                                                        b10 = bArr[4];
                                                        byte[] bArr2 = C10148q.f51402a;
                                                        if ("video/avc".equals(str)) {
                                                            c10151t2 = c10151t;
                                                            if ((b10 & 31) != 6) {
                                                                z16 = true;
                                                            }
                                                            boolean z21 = z16;
                                                            c9482e3.f48642B = z21;
                                                            c9482e3.f48672z += 5;
                                                            c9482e3.f48671y += i20;
                                                            i20 = i20;
                                                            bArr = bArr;
                                                        } else {
                                                            c10151t2 = c10151t;
                                                        }
                                                        if ("video/hevc".equals(str) || ((b10 & 126) >> 1) != 39) {
                                                            z16 = false;
                                                        } else {
                                                            z16 = true;
                                                        }
                                                        if (z16) {
                                                        }
                                                        c9482e3.f48642B = z21;
                                                        c9482e3.f48672z += 5;
                                                        c9482e3.f48671y += i20;
                                                        i20 = i20;
                                                        bArr = bArr;
                                                    } else {
                                                        c10151t2 = c10151t;
                                                    }
                                                    c9482e3.f48642B = z21;
                                                    c9482e3.f48672z += 5;
                                                    c9482e3.f48671y += i20;
                                                    i20 = i20;
                                                    bArr = bArr;
                                                } else {
                                                    c10151t2 = c10151t;
                                                    if (c9482e3.f48642B) {
                                                        C10151t c10151t6 = c9482e3.f48652f;
                                                        c10151t6.m19121B(i21);
                                                        ((C7504e) interfaceC7508i4).mo14993b(c10151t6.f51438a, 0, c9482e3.f48641A, false);
                                                        interfaceC7522w.m15021c(c9482e3.f48641A, c10151t6);
                                                        iM15022d = c9482e3.f48641A;
                                                        int iM19117e = C10148q.m19117e(c10151t6.f51438a, c10151t6.f51440c);
                                                        c10151t6.m19124E("video/hevc".equals(c2416m.f12484l) ? 1 : 0);
                                                        c10151t6.m19123D(iM19117e);
                                                        C7501b.m14990a(jM19003a, c10151t6, c9482e3.f48645E);
                                                    } else {
                                                        iM15022d = interfaceC7522w.m15022d(interfaceC7508i4, i21, false);
                                                    }
                                                    c9482e3.f48672z += iM15022d;
                                                    c9482e3.f48641A -= iM15022d;
                                                }
                                                i20 = i20;
                                                c10130a2 = c10130a3;
                                                c9488k = c9488k;
                                                c10151t = c10151t2;
                                                bArr = bArr;
                                            }
                                            c10130a0 = c10130a2;
                                        }
                                        if (!bVar.f48687l) {
                                            i17 = bVar.f48679d.f48768g[bVar.f48681f];
                                        } else if (c9490m.f48754j[bVar.f48681f]) {
                                            i17 = 1;
                                        } else {
                                            i17 = 0;
                                        }
                                        if (bVar.m17916a() != null) {
                                            i17 |= 1073741824;
                                        }
                                        int i31 = i17;
                                        c9489lM17916a = bVar.m17916a();
                                        if (c9489lM17916a != null) {
                                            aVar = c9489lM17916a.f48742c;
                                        } else {
                                            aVar = null;
                                        }
                                        interfaceC7522w.mo7387e(jM19003a, i31, c9482e3.f48671y, 0, aVar);
                                        while (!arrayDeque2.isEmpty()) {
                                            aVarRemoveFirst = arrayDeque2.removeFirst();
                                            c9482e3.f48666t -= aVarRemoveFirst.f48675c;
                                            z15 = aVarRemoveFirst.f48674b;
                                            jM19003a2 = aVarRemoveFirst.f48673a;
                                            if (z15) {
                                                jM19003a2 += jM19003a;
                                            }
                                            c10130a1 = c10130a0;
                                            if (c10130a0 != null) {
                                                jM19003a2 = c10130a1.m19003a(jM19003a2);
                                            }
                                            for (InterfaceC7522w interfaceC7522w2 : c9482e3.f48644D) {
                                                interfaceC7522w2.mo7387e(jM19003a2, 1, aVarRemoveFirst.f48675c, c9482e3.f48666t, null);
                                            }
                                            c10130a0 = c10130a1;
                                        }
                                        if (!bVar.m17917b()) {
                                            c9482e3.f48670x = null;
                                        }
                                        c9482e3.f48660n = 3;
                                    }
                                } else {
                                    c9491n = bVar.f48679d;
                                    c9488k = c9491n.f48762a;
                                    interfaceC7522w = bVar.f48676a;
                                    z14 = bVar.f48687l;
                                    c9490m = bVar.f48677b;
                                    if (z14) {
                                        jM19003a = c9491n.f48767f[bVar.f48681f];
                                    } else {
                                        jM19003a = c9490m.f48753i[bVar.f48681f];
                                    }
                                    if (c10130a2 != null) {
                                        jM19003a = c10130a2.m19003a(jM19003a);
                                    }
                                    i14 = c9488k.f48738j;
                                    if (i14 != 0) {
                                        c10130a0 = c10130a2;
                                        while (true) {
                                            i15 = c9482e3.f48672z;
                                            i16 = c9482e3.f48671y;
                                            if (i15 < i16) {
                                                break;
                                                break;
                                            }
                                            c9482e3.f48672z += interfaceC7522w.m15022d(interfaceC7508i4, i16 - i15, false);
                                        }
                                    } else {
                                        c10151t = c9482e3.f48651e;
                                        bArr = c10151t.f51438a;
                                        bArr[0] = 0;
                                        bArr[1] = 0;
                                        bArr[2] = 0;
                                        i19 = i14 + 1;
                                        i20 = 4 - i14;
                                        while (c9482e3.f48672z < c9482e3.f48671y) {
                                            i21 = c9482e3.f48641A;
                                            C10130a0 c10130a4 = c10130a2;
                                            c2416m = c9488k.f48734f;
                                            if (i21 == 0) {
                                                ((C7504e) interfaceC7508i4).mo14993b(bArr, i20, i19, false);
                                                c10151t.m19124E(0);
                                                iM19129d = c10151t.m19129d();
                                                if (iM19129d >= 1) {
                                                    throw ParserException.m6770a("Invalid NAL length", null);
                                                }
                                                c9482e3.f48641A = iM19129d - 1;
                                                C10151t c10151t7 = c9482e3.f48650d;
                                                c10151t7.m19124E(0);
                                                interfaceC7522w.m15021c(4, c10151t7);
                                                interfaceC7522w.m15021c(1, c10151t);
                                                if (c9482e3.f48645E.length > 0) {
                                                    str = c2416m.f12484l;
                                                    b10 = bArr[4];
                                                    byte[] bArr3 = C10148q.f51402a;
                                                    if ("video/avc".equals(str)) {
                                                        c10151t2 = c10151t;
                                                        if ((b10 & 31) != 6) {
                                                            z16 = true;
                                                        }
                                                        if (z16) {
                                                        }
                                                        c9482e3.f48642B = z21;
                                                        c9482e3.f48672z += 5;
                                                        c9482e3.f48671y += i20;
                                                        i20 = i20;
                                                        bArr = bArr;
                                                    } else {
                                                        c10151t2 = c10151t;
                                                    }
                                                    if ("video/hevc".equals(str)) {
                                                    }
                                                    z16 = false;
                                                    if (z16) {
                                                    }
                                                    c9482e3.f48642B = z21;
                                                    c9482e3.f48672z += 5;
                                                    c9482e3.f48671y += i20;
                                                    i20 = i20;
                                                    bArr = bArr;
                                                } else {
                                                    c10151t2 = c10151t;
                                                }
                                                c9482e3.f48642B = z21;
                                                c9482e3.f48672z += 5;
                                                c9482e3.f48671y += i20;
                                                i20 = i20;
                                                bArr = bArr;
                                            } else {
                                                c10151t2 = c10151t;
                                                if (c9482e3.f48642B) {
                                                    C10151t c10151t8 = c9482e3.f48652f;
                                                    c10151t8.m19121B(i21);
                                                    ((C7504e) interfaceC7508i4).mo14993b(c10151t8.f51438a, 0, c9482e3.f48641A, false);
                                                    interfaceC7522w.m15021c(c9482e3.f48641A, c10151t8);
                                                    iM15022d = c9482e3.f48641A;
                                                    int iM19117e2 = C10148q.m19117e(c10151t8.f51438a, c10151t8.f51440c);
                                                    c10151t8.m19124E("video/hevc".equals(c2416m.f12484l) ? 1 : 0);
                                                    c10151t8.m19123D(iM19117e2);
                                                    C7501b.m14990a(jM19003a, c10151t8, c9482e3.f48645E);
                                                } else {
                                                    iM15022d = interfaceC7522w.m15022d(interfaceC7508i4, i21, false);
                                                }
                                                c9482e3.f48672z += iM15022d;
                                                c9482e3.f48641A -= iM15022d;
                                            }
                                            i20 = i20;
                                            c10130a2 = c10130a4;
                                            c9488k = c9488k;
                                            c10151t = c10151t2;
                                            bArr = bArr;
                                        }
                                        c10130a0 = c10130a2;
                                    }
                                    if (!bVar.f48687l) {
                                        i17 = bVar.f48679d.f48768g[bVar.f48681f];
                                    } else if (c9490m.f48754j[bVar.f48681f]) {
                                        i17 = 1;
                                    } else {
                                        i17 = 0;
                                    }
                                    if (bVar.m17916a() != null) {
                                        i17 |= 1073741824;
                                    }
                                    int i32 = i17;
                                    c9489lM17916a = bVar.m17916a();
                                    if (c9489lM17916a != null) {
                                        aVar = c9489lM17916a.f48742c;
                                    } else {
                                        aVar = null;
                                    }
                                    interfaceC7522w.mo7387e(jM19003a, i32, c9482e3.f48671y, 0, aVar);
                                    while (!arrayDeque2.isEmpty()) {
                                        aVarRemoveFirst = arrayDeque2.removeFirst();
                                        c9482e3.f48666t -= aVarRemoveFirst.f48675c;
                                        z15 = aVarRemoveFirst.f48674b;
                                        jM19003a2 = aVarRemoveFirst.f48673a;
                                        if (z15) {
                                            jM19003a2 += jM19003a;
                                        }
                                        c10130a1 = c10130a0;
                                        if (c10130a0 != null) {
                                            jM19003a2 = c10130a1.m19003a(jM19003a2);
                                        }
                                        while (i18 < r10) {
                                            interfaceC7522w2.mo7387e(jM19003a2, 1, aVarRemoveFirst.f48675c, c9482e3.f48666t, null);
                                        }
                                        c10130a0 = c10130a1;
                                    }
                                    if (!bVar.m17917b()) {
                                        c9482e3.f48670x = null;
                                    }
                                    c9482e3.f48660n = 3;
                                }
                                z17 = true;
                            }
                        } else {
                            if (c9482e3.f48660n == 3) {
                                z18 = bVar.f48687l;
                                c9490m2 = bVar.f48677b;
                                if (z18) {
                                    i22 = bVar.f48679d.f48765d[bVar.f48681f];
                                } else {
                                    i22 = c9490m2.f48752h[bVar.f48681f];
                                }
                                c9482e3.f48671y = i22;
                                if (bVar.f48681f < bVar.f48684i) {
                                    ((C7504e) interfaceC7508i4).mo14998j(i22);
                                    c9489lM17916a2 = bVar.m17916a();
                                    if (c9489lM17916a2 != null) {
                                        c10151t3 = c9490m2.f48758n;
                                        i24 = c9489lM17916a2.f48743d;
                                        if (i24 != 0) {
                                            c10151t3.m19125F(i24);
                                        }
                                        int i210 = bVar.f48681f;
                                        if (c9490m2.f48755k) {
                                            z19 = false;
                                        } else {
                                            z19 = false;
                                        }
                                        if (z19) {
                                            c10151t3.m19125F(c10151t3.m19150y() * 6);
                                        }
                                    }
                                    if (!bVar.m17917b()) {
                                        c9482e3.f48670x = null;
                                    }
                                    c9482e3.f48660n = 3;
                                } else {
                                    if (bVar.f48679d.f48762a.f48735g == 1) {
                                        c9482e3.f48671y = i22 - 8;
                                        ((C7504e) interfaceC7508i4).mo14998j(8);
                                    }
                                    if ("audio/ac4".equals(bVar.f48679d.f48762a.f48734f.f12484l)) {
                                        c9482e3.f48672z = bVar.m17918c(c9482e3.f48671y, 7);
                                        int i33 = c9482e3.f48671y;
                                        C10151t c10151t9 = c9482e3.f48654h;
                                        C6426c.m13048a(i33, c10151t9);
                                        bVar.f48676a.m15021c(7, c10151t9);
                                        c9482e3.f48672z += 7;
                                        i23 = 0;
                                    } else {
                                        i23 = 0;
                                        c9482e3.f48672z = bVar.m17918c(c9482e3.f48671y, 0);
                                    }
                                    c9482e3.f48671y += c9482e3.f48672z;
                                    c9482e3.f48660n = 4;
                                    c9482e3.f48641A = i23;
                                    c9491n = bVar.f48679d;
                                    c9488k = c9491n.f48762a;
                                    interfaceC7522w = bVar.f48676a;
                                    z14 = bVar.f48687l;
                                    c9490m = bVar.f48677b;
                                    if (z14) {
                                        jM19003a = c9491n.f48767f[bVar.f48681f];
                                    } else {
                                        jM19003a = c9490m.f48753i[bVar.f48681f];
                                    }
                                    if (c10130a2 != null) {
                                        jM19003a = c10130a2.m19003a(jM19003a);
                                    }
                                    i14 = c9488k.f48738j;
                                    if (i14 != 0) {
                                        c10130a0 = c10130a2;
                                        while (true) {
                                            i15 = c9482e3.f48672z;
                                            i16 = c9482e3.f48671y;
                                            if (i15 < i16) {
                                                break;
                                                break;
                                            }
                                            c9482e3.f48672z += interfaceC7522w.m15022d(interfaceC7508i4, i16 - i15, false);
                                        }
                                    } else {
                                        c10151t = c9482e3.f48651e;
                                        bArr = c10151t.f51438a;
                                        bArr[0] = 0;
                                        bArr[1] = 0;
                                        bArr[2] = 0;
                                        i19 = i14 + 1;
                                        i20 = 4 - i14;
                                        while (c9482e3.f48672z < c9482e3.f48671y) {
                                            i21 = c9482e3.f48641A;
                                            C10130a0 c10130a5 = c10130a2;
                                            c2416m = c9488k.f48734f;
                                            if (i21 == 0) {
                                                ((C7504e) interfaceC7508i4).mo14993b(bArr, i20, i19, false);
                                                c10151t.m19124E(0);
                                                iM19129d = c10151t.m19129d();
                                                if (iM19129d >= 1) {
                                                    throw ParserException.m6770a("Invalid NAL length", null);
                                                }
                                                c9482e3.f48641A = iM19129d - 1;
                                                C10151t c10151t10 = c9482e3.f48650d;
                                                c10151t10.m19124E(0);
                                                interfaceC7522w.m15021c(4, c10151t10);
                                                interfaceC7522w.m15021c(1, c10151t);
                                                if (c9482e3.f48645E.length > 0) {
                                                    str = c2416m.f12484l;
                                                    b10 = bArr[4];
                                                    byte[] bArr4 = C10148q.f51402a;
                                                    if ("video/avc".equals(str)) {
                                                        c10151t2 = c10151t;
                                                        if ((b10 & 31) != 6) {
                                                            z16 = true;
                                                        }
                                                        if (z16) {
                                                        }
                                                        c9482e3.f48642B = z21;
                                                        c9482e3.f48672z += 5;
                                                        c9482e3.f48671y += i20;
                                                        i20 = i20;
                                                        bArr = bArr;
                                                    } else {
                                                        c10151t2 = c10151t;
                                                    }
                                                    if ("video/hevc".equals(str)) {
                                                    }
                                                    z16 = false;
                                                    if (z16) {
                                                    }
                                                    c9482e3.f48642B = z21;
                                                    c9482e3.f48672z += 5;
                                                    c9482e3.f48671y += i20;
                                                    i20 = i20;
                                                    bArr = bArr;
                                                } else {
                                                    c10151t2 = c10151t;
                                                }
                                                c9482e3.f48642B = z21;
                                                c9482e3.f48672z += 5;
                                                c9482e3.f48671y += i20;
                                                i20 = i20;
                                                bArr = bArr;
                                            } else {
                                                c10151t2 = c10151t;
                                                if (c9482e3.f48642B) {
                                                    C10151t c10151t11 = c9482e3.f48652f;
                                                    c10151t11.m19121B(i21);
                                                    ((C7504e) interfaceC7508i4).mo14993b(c10151t11.f51438a, 0, c9482e3.f48641A, false);
                                                    interfaceC7522w.m15021c(c9482e3.f48641A, c10151t11);
                                                    iM15022d = c9482e3.f48641A;
                                                    int iM19117e3 = C10148q.m19117e(c10151t11.f51438a, c10151t11.f51440c);
                                                    c10151t11.m19124E("video/hevc".equals(c2416m.f12484l) ? 1 : 0);
                                                    c10151t11.m19123D(iM19117e3);
                                                    C7501b.m14990a(jM19003a, c10151t11, c9482e3.f48645E);
                                                } else {
                                                    iM15022d = interfaceC7522w.m15022d(interfaceC7508i4, i21, false);
                                                }
                                                c9482e3.f48672z += iM15022d;
                                                c9482e3.f48641A -= iM15022d;
                                            }
                                            i20 = i20;
                                            c10130a2 = c10130a5;
                                            c9488k = c9488k;
                                            c10151t = c10151t2;
                                            bArr = bArr;
                                        }
                                        c10130a0 = c10130a2;
                                    }
                                    if (!bVar.f48687l) {
                                        i17 = bVar.f48679d.f48768g[bVar.f48681f];
                                    } else if (c9490m.f48754j[bVar.f48681f]) {
                                        i17 = 1;
                                    } else {
                                        i17 = 0;
                                    }
                                    if (bVar.m17916a() != null) {
                                        i17 |= 1073741824;
                                    }
                                    int i34 = i17;
                                    c9489lM17916a = bVar.m17916a();
                                    if (c9489lM17916a != null) {
                                        aVar = c9489lM17916a.f48742c;
                                    } else {
                                        aVar = null;
                                    }
                                    interfaceC7522w.mo7387e(jM19003a, i34, c9482e3.f48671y, 0, aVar);
                                    while (!arrayDeque2.isEmpty()) {
                                        aVarRemoveFirst = arrayDeque2.removeFirst();
                                        c9482e3.f48666t -= aVarRemoveFirst.f48675c;
                                        z15 = aVarRemoveFirst.f48674b;
                                        jM19003a2 = aVarRemoveFirst.f48673a;
                                        if (z15) {
                                            jM19003a2 += jM19003a;
                                        }
                                        c10130a1 = c10130a0;
                                        if (c10130a0 != null) {
                                            jM19003a2 = c10130a1.m19003a(jM19003a2);
                                        }
                                        while (i18 < r10) {
                                            interfaceC7522w2.mo7387e(jM19003a2, 1, aVarRemoveFirst.f48675c, c9482e3.f48666t, null);
                                        }
                                        c10130a0 = c10130a1;
                                    }
                                    if (!bVar.m17917b()) {
                                        c9482e3.f48670x = null;
                                    }
                                    c9482e3.f48660n = 3;
                                }
                            } else {
                                c9491n = bVar.f48679d;
                                c9488k = c9491n.f48762a;
                                interfaceC7522w = bVar.f48676a;
                                z14 = bVar.f48687l;
                                c9490m = bVar.f48677b;
                                if (z14) {
                                    jM19003a = c9491n.f48767f[bVar.f48681f];
                                } else {
                                    jM19003a = c9490m.f48753i[bVar.f48681f];
                                }
                                if (c10130a2 != null) {
                                    jM19003a = c10130a2.m19003a(jM19003a);
                                }
                                i14 = c9488k.f48738j;
                                if (i14 != 0) {
                                    c10130a0 = c10130a2;
                                    while (true) {
                                        i15 = c9482e3.f48672z;
                                        i16 = c9482e3.f48671y;
                                        if (i15 < i16) {
                                            break;
                                            break;
                                        }
                                        c9482e3.f48672z += interfaceC7522w.m15022d(interfaceC7508i4, i16 - i15, false);
                                    }
                                } else {
                                    c10151t = c9482e3.f48651e;
                                    bArr = c10151t.f51438a;
                                    bArr[0] = 0;
                                    bArr[1] = 0;
                                    bArr[2] = 0;
                                    i19 = i14 + 1;
                                    i20 = 4 - i14;
                                    while (c9482e3.f48672z < c9482e3.f48671y) {
                                        i21 = c9482e3.f48641A;
                                        C10130a0 c10130a6 = c10130a2;
                                        c2416m = c9488k.f48734f;
                                        if (i21 == 0) {
                                            ((C7504e) interfaceC7508i4).mo14993b(bArr, i20, i19, false);
                                            c10151t.m19124E(0);
                                            iM19129d = c10151t.m19129d();
                                            if (iM19129d >= 1) {
                                                throw ParserException.m6770a("Invalid NAL length", null);
                                            }
                                            c9482e3.f48641A = iM19129d - 1;
                                            C10151t c10151t12 = c9482e3.f48650d;
                                            c10151t12.m19124E(0);
                                            interfaceC7522w.m15021c(4, c10151t12);
                                            interfaceC7522w.m15021c(1, c10151t);
                                            if (c9482e3.f48645E.length > 0) {
                                                str = c2416m.f12484l;
                                                b10 = bArr[4];
                                                byte[] bArr5 = C10148q.f51402a;
                                                if ("video/avc".equals(str)) {
                                                    c10151t2 = c10151t;
                                                    if ((b10 & 31) != 6) {
                                                        z16 = true;
                                                    }
                                                    if (z16) {
                                                    }
                                                    c9482e3.f48642B = z21;
                                                    c9482e3.f48672z += 5;
                                                    c9482e3.f48671y += i20;
                                                    i20 = i20;
                                                    bArr = bArr;
                                                } else {
                                                    c10151t2 = c10151t;
                                                }
                                                if ("video/hevc".equals(str)) {
                                                }
                                                z16 = false;
                                                if (z16) {
                                                }
                                                c9482e3.f48642B = z21;
                                                c9482e3.f48672z += 5;
                                                c9482e3.f48671y += i20;
                                                i20 = i20;
                                                bArr = bArr;
                                            } else {
                                                c10151t2 = c10151t;
                                            }
                                            c9482e3.f48642B = z21;
                                            c9482e3.f48672z += 5;
                                            c9482e3.f48671y += i20;
                                            i20 = i20;
                                            bArr = bArr;
                                        } else {
                                            c10151t2 = c10151t;
                                            if (c9482e3.f48642B) {
                                                C10151t c10151t13 = c9482e3.f48652f;
                                                c10151t13.m19121B(i21);
                                                ((C7504e) interfaceC7508i4).mo14993b(c10151t13.f51438a, 0, c9482e3.f48641A, false);
                                                interfaceC7522w.m15021c(c9482e3.f48641A, c10151t13);
                                                iM15022d = c9482e3.f48641A;
                                                int iM19117e4 = C10148q.m19117e(c10151t13.f51438a, c10151t13.f51440c);
                                                c10151t13.m19124E("video/hevc".equals(c2416m.f12484l) ? 1 : 0);
                                                c10151t13.m19123D(iM19117e4);
                                                C7501b.m14990a(jM19003a, c10151t13, c9482e3.f48645E);
                                            } else {
                                                iM15022d = interfaceC7522w.m15022d(interfaceC7508i4, i21, false);
                                            }
                                            c9482e3.f48672z += iM15022d;
                                            c9482e3.f48641A -= iM15022d;
                                        }
                                        i20 = i20;
                                        c10130a2 = c10130a6;
                                        c9488k = c9488k;
                                        c10151t = c10151t2;
                                        bArr = bArr;
                                    }
                                    c10130a0 = c10130a2;
                                }
                                if (!bVar.f48687l) {
                                    i17 = bVar.f48679d.f48768g[bVar.f48681f];
                                } else if (c9490m.f48754j[bVar.f48681f]) {
                                    i17 = 1;
                                } else {
                                    i17 = 0;
                                }
                                if (bVar.m17916a() != null) {
                                    i17 |= 1073741824;
                                }
                                int i35 = i17;
                                c9489lM17916a = bVar.m17916a();
                                if (c9489lM17916a != null) {
                                    aVar = c9489lM17916a.f48742c;
                                } else {
                                    aVar = null;
                                }
                                interfaceC7522w.mo7387e(jM19003a, i35, c9482e3.f48671y, 0, aVar);
                                while (!arrayDeque2.isEmpty()) {
                                    aVarRemoveFirst = arrayDeque2.removeFirst();
                                    c9482e3.f48666t -= aVarRemoveFirst.f48675c;
                                    z15 = aVarRemoveFirst.f48674b;
                                    jM19003a2 = aVarRemoveFirst.f48673a;
                                    if (z15) {
                                        jM19003a2 += jM19003a;
                                    }
                                    c10130a1 = c10130a0;
                                    if (c10130a0 != null) {
                                        jM19003a2 = c10130a1.m19003a(jM19003a2);
                                    }
                                    while (i18 < r10) {
                                        interfaceC7522w2.mo7387e(jM19003a2, 1, aVarRemoveFirst.f48675c, c9482e3.f48666t, null);
                                    }
                                    c10130a0 = c10130a1;
                                }
                                if (!bVar.m17917b()) {
                                    c9482e3.f48670x = null;
                                }
                                c9482e3.f48660n = 3;
                            }
                            z17 = true;
                        }
                        if (z17) {
                            return 0;
                        }
                    } else {
                        int size3 = sparseArray.size();
                        b bVarValueAt2 = null;
                        for (int i36 = 0; i36 < size3; i36++) {
                            C9490m c9490m4 = sparseArray.valueAt(i36).f48677b;
                            if (c9490m4.f48759o) {
                                long j17 = c9490m4.f48747c;
                                if (j17 < j15) {
                                    bVarValueAt2 = sparseArray.valueAt(i36);
                                    j15 = j17;
                                }
                            }
                        }
                        if (bVarValueAt2 == null) {
                            c9482e3.f48660n = 3;
                        } else {
                            int i37 = (int) (j15 - ((C7504e) interfaceC7508i).f41477d);
                            if (i37 < 0) {
                                throw ParserException.m6770a("Offset to encryption data was negative.", null);
                            }
                            C7504e c7504e3 = (C7504e) interfaceC7508i4;
                            c7504e3.mo14998j(i37);
                            C9490m c9490m5 = bVarValueAt2.f48677b;
                            C10151t c10151t14 = c9490m5.f48758n;
                            c7504e3.mo14993b(c10151t14.f51438a, 0, c10151t14.f51440c, false);
                            c10151t14.m19124E(0);
                            c9490m5.f48759o = false;
                        }
                    }
                    interfaceC7508i2 = interfaceC7508i4;
                    c9482e = c9482e3;
                } else {
                    int i38 = ((int) c9482e3.f48662p) - c9482e3.f48663q;
                    C10151t c10151t15 = c9482e3.f48664r;
                    if (c10151t15 != null) {
                        ((C7504e) interfaceC7508i4).mo14993b(c10151t15.f51438a, 8, i38, false);
                        int i39 = c9482e3.f48661o;
                        AbstractC9478a.b bVar3 = new AbstractC9478a.b(i39, c10151t15);
                        long j18 = ((C7504e) interfaceC7508i).f41477d;
                        if (!arrayDeque.isEmpty()) {
                            arrayDeque.peek().f48605c.add(bVar3);
                            interfaceC7508i3 = interfaceC7508i4;
                            c9482e2 = c9482e3;
                        } else if (i39 == 1936286840) {
                            c10151t15.m19124E(8);
                            int iM19129d2 = (c10151t15.m19129d() >> 24) & 255;
                            c10151t15.m19125F(4);
                            long jM19146u2 = c10151t15.m19146u();
                            if (iM19129d2 == 0) {
                                jM19149x = c10151t15.m19146u();
                                jM19149x2 = c10151t15.m19146u();
                            } else {
                                jM19149x = c10151t15.m19149x();
                                jM19149x2 = c10151t15.m19149x();
                            }
                            long j19 = jM19149x;
                            long j20 = j18 + jM19149x2;
                            long jM19030O2 = C10134c0.m19030O(j19, 1000000L, jM19146u2);
                            c10151t15.m19125F(2);
                            int iM19150y = c10151t15.m19150y();
                            int[] iArr = new int[iM19150y];
                            long[] jArr = new long[iM19150y];
                            long[] jArr2 = new long[iM19150y];
                            long[] jArr3 = new long[iM19150y];
                            long j21 = jM19030O2;
                            int i40 = 0;
                            long j22 = j19;
                            while (i40 < iM19150y) {
                                int iM19129d3 = c10151t15.m19129d();
                                if ((iM19129d3 & Integer.MIN_VALUE) != 0) {
                                    throw ParserException.m6770a("Unhandled indirect reference", null);
                                }
                                long jM19146u3 = c10151t15.m19146u();
                                iArr[i40] = iM19129d3 & Integer.MAX_VALUE;
                                jArr[i40] = j20;
                                jArr3[i40] = j21;
                                long j23 = j22 + jM19146u3;
                                int i41 = iM19150y;
                                long[] jArr4 = jArr3;
                                long[] jArr5 = jArr2;
                                long jM19030O3 = C10134c0.m19030O(j23, 1000000L, jM19146u2);
                                jArr5[i40] = jM19030O3 - jArr4[i40];
                                c10151t15.m19125F(4);
                                j20 += (long) iArr[i40];
                                i40++;
                                jArr = jArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                interfaceC7508i4 = interfaceC7508i4;
                                iM19150y = i41;
                                j22 = j23;
                                j21 = jM19030O3;
                            }
                            interfaceC7508i3 = interfaceC7508i4;
                            Pair pairCreate = Pair.create(Long.valueOf(jM19030O2), new C7502c(iArr, jArr, jArr2, jArr3));
                            c9482e2 = this;
                            c9482e2.f48669w = ((Long) pairCreate.first).longValue();
                            c9482e2.f48643C.mo7364c((InterfaceC7520u) pairCreate.second);
                            c9482e2.f48646F = true;
                        } else {
                            interfaceC7508i3 = interfaceC7508i4;
                            c9482e2 = c9482e3;
                            if (i39 == 1701671783) {
                                if (c9482e2.f48644D.length != 0) {
                                    c10151t15.m19124E(8);
                                    int iM19129d4 = (c10151t15.m19129d() >> 24) & 255;
                                    long j24 = -9223372036854775807L;
                                    if (iM19129d4 == 0) {
                                        strM19139n = c10151t15.m19139n();
                                        strM19139n.getClass();
                                        strM19139n2 = c10151t15.m19139n();
                                        strM19139n2.getClass();
                                        long jM19146u4 = c10151t15.m19146u();
                                        long jM19030O4 = C10134c0.m19030O(c10151t15.m19146u(), 1000000L, jM19146u4);
                                        long j25 = c9482e2.f48669w;
                                        j24 = j25 != -9223372036854775807L ? j25 + jM19030O4 : -9223372036854775807L;
                                        jM19030O = C10134c0.m19030O(c10151t15.m19146u(), 1000L, jM19146u4);
                                        jM19146u = c10151t15.m19146u();
                                        jM19003a3 = j24;
                                        j24 = jM19030O4;
                                    } else if (iM19129d4 != 1) {
                                        C0141b.m620p("Skipping unsupported emsg version: ", iM19129d4, "FragmentedMp4Extractor");
                                    } else {
                                        long jM19146u5 = c10151t15.m19146u();
                                        jM19003a3 = C10134c0.m19030O(c10151t15.m19149x(), 1000000L, jM19146u5);
                                        jM19030O = C10134c0.m19030O(c10151t15.m19146u(), 1000L, jM19146u5);
                                        jM19146u = c10151t15.m19146u();
                                        strM19139n = c10151t15.m19139n();
                                        strM19139n.getClass();
                                        strM19139n2 = c10151t15.m19139n();
                                        strM19139n2.getClass();
                                    }
                                    int i42 = c10151t15.f51440c - c10151t15.f51439b;
                                    byte[] bArr6 = new byte[i42];
                                    c10151t15.m19127b(bArr6, 0, i42);
                                    C1349b c1349b = c9482e2.f48656j;
                                    ByteArrayOutputStream byteArrayOutputStream = c1349b.f8180a;
                                    byteArrayOutputStream.reset();
                                    DataOutputStream dataOutputStream = c1349b.f8181b;
                                    try {
                                        dataOutputStream.writeBytes(strM19139n);
                                        dataOutputStream.writeByte(0);
                                        dataOutputStream.writeBytes(strM19139n2);
                                        dataOutputStream.writeByte(0);
                                        dataOutputStream.writeLong(jM19030O);
                                        dataOutputStream.writeLong(jM19146u);
                                        dataOutputStream.write(bArr6);
                                        dataOutputStream.flush();
                                        C10151t c10151t16 = new C10151t(byteArrayOutputStream.toByteArray());
                                        int i43 = c10151t16.f51440c - c10151t16.f51439b;
                                        for (InterfaceC7522w interfaceC7522w3 : c9482e2.f48644D) {
                                            c10151t16.m19124E(0);
                                            interfaceC7522w3.m15021c(i43, c10151t16);
                                        }
                                        if (jM19003a3 == -9223372036854775807L) {
                                            arrayDeque2.addLast(new a(i43, j24, true));
                                            c9482e2.f48666t += i43;
                                        } else if (arrayDeque2.isEmpty()) {
                                            if (c10130a2 != null) {
                                                jM19003a3 = c10130a2.m19003a(jM19003a3);
                                            }
                                            for (InterfaceC7522w interfaceC7522w4 : c9482e2.f48644D) {
                                                interfaceC7522w4.mo7387e(jM19003a3, 1, i43, 0, null);
                                            }
                                        } else {
                                            arrayDeque2.addLast(new a(i43, jM19003a3, false));
                                            c9482e2.f48666t += i43;
                                        }
                                    } catch (IOException e10) {
                                        throw new RuntimeException(e10);
                                    }
                                }
                            }
                            interfaceC7508i4 = interfaceC7508i;
                            c9482e2.m17915c(((C7504e) interfaceC7508i).f41477d);
                            c9482e3 = c9482e2;
                        }
                    } else {
                        interfaceC7508i3 = interfaceC7508i4;
                        c9482e2 = c9482e3;
                        ((C7504e) interfaceC7508i3).mo14998j(i38);
                    }
                    interfaceC7508i4 = interfaceC7508i3;
                    c9482e2.m17915c(((C7504e) interfaceC7508i).f41477d);
                    c9482e3 = c9482e2;
                }
            } else {
                interfaceC7508i2 = interfaceC7508i4;
                c9482e = c9482e3;
                int i44 = c9482e.f48663q;
                C10151t c10151t17 = c9482e.f48657k;
                if (i44 == 0) {
                    z13 = false;
                    if (((C7504e) interfaceC7508i2).mo14993b(c10151t17.f51438a, 0, 8, true)) {
                        c9482e.f48663q = 8;
                        c10151t17.m19124E(0);
                        c9482e.f48662p = c10151t17.m19146u();
                        c9482e.f48661o = c10151t17.m19129d();
                        j10 = c9482e.f48662p;
                        if (j10 == 1) {
                            ((C7504e) interfaceC7508i2).mo14993b(c10151t17.f51438a, 8, 8, false);
                            c9482e.f48663q += 8;
                            c9482e.f48662p = c10151t17.m19149x();
                        } else if (j10 == 0) {
                            c7504e = (C7504e) interfaceC7508i;
                            j11 = c7504e.f41476c;
                            if (j11 == -1 && !arrayDeque.isEmpty()) {
                                j11 = arrayDeque.peek().f48604b;
                            }
                            if (j11 != -1) {
                                c9482e.f48662p = (j11 - c7504e.f41477d) + ((long) c9482e.f48663q);
                            }
                        }
                        j12 = c9482e.f48662p;
                        i10 = c9482e.f48663q;
                        if (j12 >= i10) {
                            throw ParserException.m6772c("Atom size less than header length (unsupported).");
                        }
                        c7504e2 = (C7504e) interfaceC7508i;
                        j13 = c7504e2.f41477d - ((long) i10);
                        i11 = c9482e.f48661o;
                        if ((i11 != 1836019558 || i11 == 1835295092) && !c9482e.f48646F) {
                            c9482e.f48643C.mo7364c(new InterfaceC7520u.b(c9482e.f48668v, j13));
                            c9482e.f48646F = true;
                        }
                        if (c9482e.f48661o == 1836019558) {
                            size = sparseArray.size();
                            for (i13 = 0; i13 < size; i13++) {
                                C9490m c9490m6 = sparseArray.valueAt(i13).f48677b;
                                c9490m6.getClass();
                                c9490m6.f48747c = j13;
                                c9490m6.f48746b = j13;
                            }
                        }
                        i12 = c9482e.f48661o;
                        if (i12 == 1835295092) {
                            c9482e.f48670x = null;
                            c9482e.f48665s = j13 + c9482e.f48662p;
                            c9482e.f48660n = 2;
                            z13 = true;
                        } else {
                            if (i12 != 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1836019558 || i12 == 1953653094 || i12 == 1836475768 || i12 == 1701082227) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                j14 = (c7504e2.f41477d + c9482e.f48662p) - 8;
                                arrayDeque.push(new AbstractC9478a.a(i12, j14));
                                if (c9482e.f48662p == c9482e.f48663q) {
                                    c9482e.m17915c(j14);
                                } else {
                                    c9482e.f48660n = 0;
                                    c9482e.f48663q = 0;
                                }
                                z12 = true;
                            } else {
                                if (i12 != 1751411826 || i12 == 1835296868 || i12 == 1836476516 || i12 == 1936286840 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1668576371 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1937011571 || i12 == 1952867444 || i12 == 1952868452 || i12 == 1953196132 || i12 == 1953654136 || i12 == 1953658222 || i12 == 1886614376 || i12 == 1935763834 || i12 == 1935763823 || i12 == 1936027235 || i12 == 1970628964 || i12 == 1935828848 || i12 == 1936158820 || i12 == 1701606260 || i12 == 1835362404 || i12 == 1701671783) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (c9482e.f48663q == 8) {
                                        throw ParserException.m6772c("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    if (c9482e.f48662p <= 2147483647L) {
                                        throw ParserException.m6772c("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    C10151t c10151t18 = new C10151t((int) c9482e.f48662p);
                                    System.arraycopy(c10151t17.f51438a, 0, c10151t18.f51438a, 0, 8);
                                    c9482e.f48664r = c10151t18;
                                    z12 = true;
                                    c9482e.f48660n = 1;
                                } else {
                                    if (c9482e.f48662p <= 2147483647L) {
                                        throw ParserException.m6772c("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    c9482e.f48664r = null;
                                    z12 = true;
                                    c9482e.f48660n = 1;
                                }
                            }
                            z13 = z12;
                        }
                    }
                } else {
                    j10 = c9482e.f48662p;
                    if (j10 == 1) {
                        ((C7504e) interfaceC7508i2).mo14993b(c10151t17.f51438a, 8, 8, false);
                        c9482e.f48663q += 8;
                        c9482e.f48662p = c10151t17.m19149x();
                    } else if (j10 == 0) {
                        c7504e = (C7504e) interfaceC7508i;
                        j11 = c7504e.f41476c;
                        if (j11 == -1) {
                            j11 = arrayDeque.peek().f48604b;
                        }
                        if (j11 != -1) {
                            c9482e.f48662p = (j11 - c7504e.f41477d) + ((long) c9482e.f48663q);
                        }
                    }
                    j12 = c9482e.f48662p;
                    i10 = c9482e.f48663q;
                    if (j12 >= i10) {
                        throw ParserException.m6772c("Atom size less than header length (unsupported).");
                    }
                    c7504e2 = (C7504e) interfaceC7508i;
                    j13 = c7504e2.f41477d - ((long) i10);
                    i11 = c9482e.f48661o;
                    if (i11 != 1836019558) {
                        c9482e.f48643C.mo7364c(new InterfaceC7520u.b(c9482e.f48668v, j13));
                        c9482e.f48646F = true;
                    } else {
                        c9482e.f48643C.mo7364c(new InterfaceC7520u.b(c9482e.f48668v, j13));
                        c9482e.f48646F = true;
                    }
                    if (c9482e.f48661o == 1836019558) {
                        size = sparseArray.size();
                        while (i13 < size) {
                            C9490m c9490m7 = sparseArray.valueAt(i13).f48677b;
                            c9490m7.getClass();
                            c9490m7.f48747c = j13;
                            c9490m7.f48746b = j13;
                        }
                    }
                    i12 = c9482e.f48661o;
                    if (i12 == 1835295092) {
                        c9482e.f48670x = null;
                        c9482e.f48665s = j13 + c9482e.f48662p;
                        c9482e.f48660n = 2;
                        z13 = true;
                    } else {
                        if (i12 != 1836019574) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            j14 = (c7504e2.f41477d + c9482e.f48662p) - 8;
                            arrayDeque.push(new AbstractC9478a.a(i12, j14));
                            if (c9482e.f48662p == c9482e.f48663q) {
                                c9482e.m17915c(j14);
                            } else {
                                c9482e.f48660n = 0;
                                c9482e.f48663q = 0;
                            }
                            z12 = true;
                        } else {
                            if (i12 != 1751411826) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                if (c9482e.f48663q == 8) {
                                    throw ParserException.m6772c("Leaf atom defines extended atom size (unsupported).");
                                }
                                if (c9482e.f48662p <= 2147483647L) {
                                    throw ParserException.m6772c("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                C10151t c10151t19 = new C10151t((int) c9482e.f48662p);
                                System.arraycopy(c10151t17.f51438a, 0, c10151t19.f51438a, 0, 8);
                                c9482e.f48664r = c10151t19;
                                z12 = true;
                                c9482e.f48660n = 1;
                            } else {
                                if (c9482e.f48662p <= 2147483647L) {
                                    throw ParserException.m6772c("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                c9482e.f48664r = null;
                                z12 = true;
                                c9482e.f48660n = 1;
                            }
                        }
                        z13 = z12;
                    }
                }
                if (!z13) {
                    return -1;
                }
            }
            c9482e3 = c9482e;
            interfaceC7508i4 = interfaceC7508i2;
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        SparseArray<b> sparseArray = this.f48649c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.valueAt(i10).m17919d();
        }
        this.f48659m.clear();
        this.f48666t = 0;
        this.f48667u = j11;
        this.f48658l.clear();
        this.f48660n = 0;
        this.f48663q = 0;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        int i10;
        this.f48643C = interfaceC7509j;
        int i11 = 0;
        this.f48660n = 0;
        this.f48663q = 0;
        InterfaceC7522w[] interfaceC7522wArr = new InterfaceC7522w[2];
        this.f48644D = interfaceC7522wArr;
        int i12 = 100;
        if ((this.f48647a & 4) != 0) {
            interfaceC7522wArr[0] = interfaceC7509j.mo7366q(100, 5);
            i10 = 1;
            i12 = 101;
        } else {
            i10 = 0;
        }
        InterfaceC7522w[] interfaceC7522wArr2 = (InterfaceC7522w[]) C10134c0.m19028M(i10, this.f48644D);
        this.f48644D = interfaceC7522wArr2;
        for (InterfaceC7522w interfaceC7522w : interfaceC7522wArr2) {
            interfaceC7522w.mo7388f(f48640H);
        }
        List<C2416m> list = this.f48648b;
        this.f48645E = new InterfaceC7522w[list.size()];
        while (i11 < this.f48645E.length) {
            InterfaceC7522w interfaceC7522wMo7366q = this.f48643C.mo7366q(i12, 3);
            interfaceC7522wMo7366q.mo7388f(list.get(i11));
            this.f48645E[i11] = interfaceC7522wMo7366q;
            i11++;
            i12++;
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        return C9487j.m17930a(interfaceC7508i, true, false);
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
