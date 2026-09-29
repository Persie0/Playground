package p453w9;

import android.util.SparseArray;
import com.google.android.exoplayer2.C2416m;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p261m9.C7501b;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p385sf.C9000b;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10148q;
import p479xa.C10151t;
import p479xa.C10152u;

/* JADX INFO: renamed from: w9.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9862m implements InterfaceC9859j {

    /* JADX INFO: renamed from: a */
    public final C9875z f50245a;

    /* JADX INFO: renamed from: b */
    public final boolean f50246b;

    /* JADX INFO: renamed from: c */
    public final boolean f50247c;

    /* JADX INFO: renamed from: g */
    public long f50251g;

    /* JADX INFO: renamed from: i */
    public String f50253i;

    /* JADX INFO: renamed from: j */
    public InterfaceC7522w f50254j;

    /* JADX INFO: renamed from: k */
    public a f50255k;

    /* JADX INFO: renamed from: l */
    public boolean f50256l;

    /* JADX INFO: renamed from: n */
    public boolean f50258n;

    /* JADX INFO: renamed from: h */
    public final boolean[] f50252h = new boolean[3];

    /* JADX INFO: renamed from: d */
    public final C9867r f50248d = new C9867r(7);

    /* JADX INFO: renamed from: e */
    public final C9867r f50249e = new C9867r(8);

    /* JADX INFO: renamed from: f */
    public final C9867r f50250f = new C9867r(6);

    /* JADX INFO: renamed from: m */
    public long f50257m = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public final C10151t f50259o = new C10151t();

    /* JADX INFO: renamed from: w9.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7522w f50260a;

        /* JADX INFO: renamed from: b */
        public final boolean f50261b;

        /* JADX INFO: renamed from: c */
        public final boolean f50262c;

        /* JADX INFO: renamed from: f */
        public final C10152u f50265f;

        /* JADX INFO: renamed from: g */
        public byte[] f50266g;

        /* JADX INFO: renamed from: h */
        public int f50267h;

        /* JADX INFO: renamed from: i */
        public int f50268i;

        /* JADX INFO: renamed from: j */
        public long f50269j;

        /* JADX INFO: renamed from: k */
        public boolean f50270k;

        /* JADX INFO: renamed from: l */
        public long f50271l;

        /* JADX INFO: renamed from: o */
        public boolean f50274o;

        /* JADX INFO: renamed from: p */
        public long f50275p;

        /* JADX INFO: renamed from: q */
        public long f50276q;

        /* JADX INFO: renamed from: r */
        public boolean f50277r;

        /* JADX INFO: renamed from: d */
        public final SparseArray<C10148q.c> f50263d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<C10148q.b> f50264e = new SparseArray<>();

        /* JADX INFO: renamed from: m */
        public C10675a f50272m = new C10675a();

        /* JADX INFO: renamed from: n */
        public C10675a f50273n = new C10675a();

        /* JADX INFO: renamed from: w9.m$a$a, reason: collision with other inner class name */
        public static final class C10675a {

            /* JADX INFO: renamed from: a */
            public boolean f50278a;

            /* JADX INFO: renamed from: b */
            public boolean f50279b;

            /* JADX INFO: renamed from: c */
            public C10148q.c f50280c;

            /* JADX INFO: renamed from: d */
            public int f50281d;

            /* JADX INFO: renamed from: e */
            public int f50282e;

            /* JADX INFO: renamed from: f */
            public int f50283f;

            /* JADX INFO: renamed from: g */
            public int f50284g;

            /* JADX INFO: renamed from: h */
            public boolean f50285h;

            /* JADX INFO: renamed from: i */
            public boolean f50286i;

            /* JADX INFO: renamed from: j */
            public boolean f50287j;

            /* JADX INFO: renamed from: k */
            public boolean f50288k;

            /* JADX INFO: renamed from: l */
            public int f50289l;

            /* JADX INFO: renamed from: m */
            public int f50290m;

            /* JADX INFO: renamed from: n */
            public int f50291n;

            /* JADX INFO: renamed from: o */
            public int f50292o;

            /* JADX INFO: renamed from: p */
            public int f50293p;
        }

        public a(InterfaceC7522w interfaceC7522w, boolean z10, boolean z11) {
            this.f50260a = interfaceC7522w;
            this.f50261b = z10;
            this.f50262c = z11;
            byte[] bArr = new byte[BuildConfig.SDK_TRUNCATE_LENGTH];
            this.f50266g = bArr;
            this.f50265f = new C10152u(bArr, 0, 0);
            this.f50270k = false;
            this.f50274o = false;
            C10675a c10675a = this.f50273n;
            c10675a.f50279b = false;
            c10675a.f50278a = false;
        }
    }

    public C9862m(C9875z c9875z, boolean z10, boolean z11) {
        this.f50245a = c9875z;
        this.f50246b = z10;
        this.f50247c = z11;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:82:0x0206  */
    /* JADX WARN: Code duplicated, block: B:85:0x020b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0224  */
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
    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: a */
    public final void mo18336a(C10151t c10151t) {
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        long j10;
        int i14;
        long j11;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int i18;
        int i19;
        boolean z11;
        C10129a.m18993e(this.f50254j);
        int i20 = C10134c0.f51354a;
        int i21 = c10151t.f51439b;
        int i22 = c10151t.f51440c;
        byte[] bArr2 = c10151t.f51438a;
        int i23 = i22 - i21;
        this.f50251g += (long) i23;
        this.f50254j.m15021c(i23, c10151t);
        while (true) {
            int iM19114b = C10148q.m19114b(bArr2, i21, i22, this.f50252h);
            if (iM19114b == i22) {
                m18359f(bArr2, i21, i22);
                return;
            }
            int i24 = iM19114b + 3;
            int i25 = bArr2[i24] & 31;
            int i26 = iM19114b - i21;
            if (i26 > 0) {
                m18359f(bArr2, i21, iM19114b);
            }
            int i27 = i22 - iM19114b;
            long j12 = this.f50251g - ((long) i27);
            int i28 = i26 < 0 ? -i26 : 0;
            long j13 = this.f50257m;
            boolean z12 = this.f50256l;
            C9867r c9867r = this.f50249e;
            C9867r c9867r2 = this.f50248d;
            if (!z12 || this.f50255k.f50262c) {
                c9867r2.m18362b(i28);
                c9867r.m18362b(i28);
                if (this.f50256l) {
                    i10 = i27;
                    i11 = i22;
                    bArr = bArr2;
                    i12 = i24;
                    i13 = i25;
                    if (c9867r2.f50362c) {
                        C10148q.c cVarM19116d = C10148q.m19116d(c9867r2.f50363d, 3, c9867r2.f50364e);
                        this.f50255k.f50263d.append(cVarM19116d.f51418d, cVarM19116d);
                        c9867r2.m18363c();
                    } else if (c9867r.f50362c) {
                        C10152u c10152u = new C10152u(c9867r.f50363d, 4, c9867r.f50364e);
                        int iM19157f = c10152u.m19157f();
                        int iM19157f2 = c10152u.m19157f();
                        c10152u.m19160i();
                        this.f50255k.f50264e.append(iM19157f, new C10148q.b(iM19157f, iM19157f2, c10152u.m19155d()));
                        c9867r.m18363c();
                    }
                } else if (c9867r2.f50362c && c9867r.f50362c) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(c9867r2.f50363d, c9867r2.f50364e));
                    arrayList.add(Arrays.copyOf(c9867r.f50363d, c9867r.f50364e));
                    i11 = i22;
                    C10148q.c cVarM19116d2 = C10148q.m19116d(c9867r2.f50363d, 3, c9867r2.f50364e);
                    bArr = bArr2;
                    i12 = i24;
                    C10152u c10152u2 = new C10152u(c9867r.f50363d, 4, c9867r.f50364e);
                    int iM19157f3 = c10152u2.m19157f();
                    int iM19157f4 = c10152u2.m19157f();
                    c10152u2.m19160i();
                    C10148q.b bVar = new C10148q.b(iM19157f3, iM19157f4, c10152u2.m19155d());
                    i13 = i25;
                    String strM17240f = C9000b.m17240f(cVarM19116d2.f51415a, cVarM19116d2.f51416b, cVarM19116d2.f51417c);
                    InterfaceC7522w interfaceC7522w = this.f50254j;
                    C2416m.a aVar = new C2416m.a();
                    i10 = i27;
                    aVar.f12491a = this.f50253i;
                    aVar.f12501k = "video/avc";
                    aVar.f12498h = strM17240f;
                    aVar.f12506p = cVarM19116d2.f51419e;
                    aVar.f12507q = cVarM19116d2.f51420f;
                    aVar.f12510t = cVarM19116d2.f51421g;
                    aVar.f12503m = arrayList;
                    interfaceC7522w.mo7388f(new C2416m(aVar));
                    this.f50256l = true;
                    this.f50255k.f50263d.append(cVarM19116d2.f51418d, cVarM19116d2);
                    this.f50255k.f50264e.append(iM19157f3, bVar);
                    c9867r2.m18363c();
                    c9867r.m18363c();
                } else {
                    i10 = i27;
                    i11 = i22;
                    bArr = bArr2;
                    i12 = i24;
                    i13 = i25;
                }
            } else {
                i10 = i27;
                i11 = i22;
                bArr = bArr2;
                i12 = i24;
                i13 = i25;
            }
            C9867r c9867r3 = this.f50250f;
            if (c9867r3.m18362b(i28)) {
                int iM19117e = C10148q.m19117e(c9867r3.f50363d, c9867r3.f50364e);
                byte[] bArr3 = c9867r3.f50363d;
                C10151t c10151t2 = this.f50259o;
                c10151t2.m19122C(bArr3, iM19117e);
                c10151t2.m19124E(4);
                C7501b.m14990a(j13, c10151t2, this.f50245a.f50415b);
            }
            a aVar2 = this.f50255k;
            boolean z13 = this.f50256l;
            boolean z14 = this.f50258n;
            if (aVar2.f50268i == 9) {
                if (z13 && aVar2.f50274o) {
                    j10 = aVar2.f50269j;
                    i14 = i10 + ((int) (j12 - j10));
                    j11 = aVar2.f50276q;
                    if (j11 != -9223372036854775807L) {
                        aVar2.f50260a.mo7387e(j11, aVar2.f50277r ? 1 : 0, (int) (j10 - aVar2.f50275p), i14, null);
                    }
                }
                aVar2.f50275p = aVar2.f50269j;
                aVar2.f50276q = aVar2.f50271l;
                aVar2.f50277r = false;
                aVar2.f50274o = true;
            } else if (aVar2.f50262c) {
                a.C10675a c10675a = aVar2.f50273n;
                a.C10675a c10675a2 = aVar2.f50272m;
                if (c10675a.f50278a) {
                    if (c10675a2.f50278a) {
                        C10148q.c cVar = c10675a.f50280c;
                        C10129a.m18993e(cVar);
                        C10148q.c cVar2 = c10675a2.f50280c;
                        C10129a.m18993e(cVar2);
                        if (c10675a.f50283f == c10675a2.f50283f && c10675a.f50284g == c10675a2.f50284g && c10675a.f50285h == c10675a2.f50285h && ((!c10675a.f50286i || !c10675a2.f50286i || c10675a.f50287j == c10675a2.f50287j) && ((i18 = c10675a.f50281d) == (i19 = c10675a2.f50281d) || (i18 != 0 && i19 != 0)))) {
                            int i29 = cVar2.f51425k;
                            int i30 = cVar.f51425k;
                            z10 = (i30 == 0 && i29 == 0 && !(c10675a.f50290m == c10675a2.f50290m && c10675a.f50291n == c10675a2.f50291n)) || (i30 == 1 && i29 == 1 && !(c10675a.f50292o == c10675a2.f50292o && c10675a.f50293p == c10675a2.f50293p)) || (z11 = c10675a.f50288k) != c10675a2.f50288k || (z11 && c10675a.f50289l != c10675a2.f50289l);
                        }
                    }
                }
                if (z10) {
                    if (z13) {
                        j10 = aVar2.f50269j;
                        i14 = i10 + ((int) (j12 - j10));
                        j11 = aVar2.f50276q;
                        if (j11 != -9223372036854775807L) {
                            aVar2.f50260a.mo7387e(j11, aVar2.f50277r ? 1 : 0, (int) (j10 - aVar2.f50275p), i14, null);
                        }
                    }
                    aVar2.f50275p = aVar2.f50269j;
                    aVar2.f50276q = aVar2.f50271l;
                    aVar2.f50277r = false;
                    aVar2.f50274o = true;
                }
            }
            if (aVar2.f50261b) {
                a.C10675a c10675a3 = aVar2.f50273n;
                z14 = c10675a3.f50279b && ((i17 = c10675a3.f50282e) == 7 || i17 == 2);
            }
            boolean z15 = aVar2.f50277r;
            int i31 = aVar2.f50268i;
            boolean z16 = z15 | (i31 == 5 || (z14 && i31 == 1));
            aVar2.f50277r = z16;
            if (z16) {
                this.f50258n = false;
            }
            long j14 = this.f50257m;
            if (!this.f50256l || this.f50255k.f50262c) {
                i15 = i13;
                c9867r2.m18364d(i15);
                c9867r.m18364d(i15);
            } else {
                i15 = i13;
            }
            c9867r3.m18364d(i15);
            a aVar3 = this.f50255k;
            aVar3.f50268i = i15;
            aVar3.f50271l = j14;
            aVar3.f50269j = j12;
            if (aVar3.f50261b) {
                i16 = 1;
                if (i15 == 1) {
                    a.C10675a c10675a4 = aVar3.f50272m;
                    aVar3.f50272m = aVar3.f50273n;
                    aVar3.f50273n = c10675a4;
                    c10675a4.f50279b = false;
                    c10675a4.f50278a = false;
                    aVar3.f50267h = 0;
                    aVar3.f50270k = true;
                }
                i22 = i11;
                bArr2 = bArr;
                i21 = i12;
            } else {
                i16 = 1;
            }
            if (aVar3.f50262c && (i15 == 5 || i15 == i16 || i15 == 2)) {
                a.C10675a c10675a5 = aVar3.f50272m;
                aVar3.f50272m = aVar3.f50273n;
                aVar3.f50273n = c10675a5;
                c10675a5.f50279b = false;
                c10675a5.f50278a = false;
                aVar3.f50267h = 0;
                aVar3.f50270k = true;
            }
            i22 = i11;
            bArr2 = bArr;
            i21 = i12;
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        this.f50251g = 0L;
        this.f50258n = false;
        this.f50257m = -9223372036854775807L;
        C10148q.m19113a(this.f50252h);
        this.f50248d.m18363c();
        this.f50249e.m18363c();
        this.f50250f.m18363c();
        a aVar = this.f50255k;
        if (aVar != null) {
            aVar.f50270k = false;
            aVar.f50274o = false;
            a.C10675a c10675a = aVar.f50273n;
            c10675a.f50279b = false;
            c10675a.f50278a = false;
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: c */
    public final void mo18338c() {
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: d */
    public final void mo18339d(InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        dVar.m18348a();
        dVar.m18349b();
        this.f50253i = dVar.f50141e;
        dVar.m18349b();
        InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j.mo7366q(dVar.f50140d, 2);
        this.f50254j = interfaceC7522wMo7366q;
        this.f50255k = new a(interfaceC7522wMo7366q, this.f50246b, this.f50247c);
        this.f50245a.m18370a(interfaceC7509j, dVar);
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50257m = j10;
        }
        this.f50258n = ((i10 & 2) != 0) | this.f50258n;
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x0103  */
    /* JADX WARN: Code duplicated, block: B:58:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165  */
    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: f */
    public final void m18359f(byte[] bArr, int i10, int i11) {
        boolean zM19155d;
        boolean zM19155d2;
        boolean z10;
        boolean z11;
        int iM19157f;
        boolean z12;
        int i12;
        int iM19158g;
        int i13;
        int iM19156e;
        int iM19158g2;
        int i14;
        int i15;
        int iM19158g3;
        if (!this.f50256l || this.f50255k.f50262c) {
            this.f50248d.m18361a(bArr, i10, i11);
            this.f50249e.m18361a(bArr, i10, i11);
        }
        this.f50250f.m18361a(bArr, i10, i11);
        a aVar = this.f50255k;
        if (aVar.f50270k) {
            int i16 = i11 - i10;
            byte[] bArr2 = aVar.f50266g;
            int length = bArr2.length;
            int i17 = aVar.f50267h + i16;
            if (length < i17) {
                aVar.f50266g = Arrays.copyOf(bArr2, i17 * 2);
            }
            System.arraycopy(bArr, i10, aVar.f50266g, aVar.f50267h, i16);
            int i18 = aVar.f50267h + i16;
            aVar.f50267h = i18;
            byte[] bArr3 = aVar.f50266g;
            C10152u c10152u = aVar.f50265f;
            c10152u.f51441a = bArr3;
            c10152u.f51443c = 0;
            c10152u.f51442b = i18;
            c10152u.f51444d = 0;
            c10152u.m19152a();
            if (c10152u.m19153b(8)) {
                c10152u.m19160i();
                int iM19156e2 = c10152u.m19156e(2);
                c10152u.m19161j(5);
                if (c10152u.m19154c()) {
                    c10152u.m19157f();
                    if (c10152u.m19154c()) {
                        int iM19157f2 = c10152u.m19157f();
                        if (!aVar.f50262c) {
                            aVar.f50270k = false;
                            a.C10675a c10675a = aVar.f50273n;
                            c10675a.f50282e = iM19157f2;
                            c10675a.f50279b = true;
                            return;
                        }
                        if (c10152u.m19154c()) {
                            int iM19157f3 = c10152u.m19157f();
                            SparseArray<C10148q.b> sparseArray = aVar.f50264e;
                            if (sparseArray.indexOfKey(iM19157f3) < 0) {
                                aVar.f50270k = false;
                                return;
                            }
                            C10148q.b bVar = sparseArray.get(iM19157f3);
                            C10148q.c cVar = aVar.f50263d.get(bVar.f51413a);
                            if (cVar.f51422h) {
                                if (!c10152u.m19153b(2)) {
                                    return;
                                } else {
                                    c10152u.m19161j(2);
                                }
                            }
                            int i19 = cVar.f51424j;
                            if (c10152u.m19153b(i19)) {
                                int iM19156e3 = c10152u.m19156e(i19);
                                if (!cVar.f51423i) {
                                    if (c10152u.m19153b(1)) {
                                        zM19155d = c10152u.m19155d();
                                        if (zM19155d) {
                                            if (!c10152u.m19153b(1)) {
                                                return;
                                            }
                                            zM19155d2 = c10152u.m19155d();
                                            z10 = true;
                                        }
                                        if (aVar.f50268i == 5) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            iM19157f = 0;
                                        } else if (!c10152u.m19154c()) {
                                            return;
                                        } else {
                                            iM19157f = c10152u.m19157f();
                                        }
                                        z12 = bVar.f51414b;
                                        i12 = cVar.f51425k;
                                        if (i12 == 0) {
                                            i15 = cVar.f51426l;
                                            if (!c10152u.m19153b(i15)) {
                                                return;
                                            }
                                            iM19156e = c10152u.m19156e(i15);
                                            if (z12 || zM19155d) {
                                                iM19158g3 = 0;
                                            } else if (!c10152u.m19154c()) {
                                                return;
                                            } else {
                                                iM19158g3 = c10152u.m19158g();
                                            }
                                            i14 = iM19158g3;
                                            i13 = 0;
                                            iM19158g2 = 0;
                                        } else {
                                            if (i12 == 1 || cVar.f51427m) {
                                                iM19158g = 0;
                                            } else {
                                                if (!c10152u.m19154c()) {
                                                    return;
                                                }
                                                iM19158g = c10152u.m19158g();
                                                if (z12 && !zM19155d) {
                                                    if (!c10152u.m19154c()) {
                                                        return;
                                                    }
                                                    iM19158g2 = c10152u.m19158g();
                                                    i14 = 0;
                                                    i13 = iM19158g;
                                                    iM19156e = 0;
                                                }
                                            }
                                            i13 = iM19158g;
                                            iM19156e = 0;
                                            iM19158g2 = 0;
                                            i14 = 0;
                                        }
                                        a.C10675a c10675a2 = aVar.f50273n;
                                        c10675a2.f50280c = cVar;
                                        c10675a2.f50281d = iM19156e2;
                                        c10675a2.f50282e = iM19157f2;
                                        c10675a2.f50283f = iM19156e3;
                                        c10675a2.f50284g = iM19157f3;
                                        c10675a2.f50285h = zM19155d;
                                        c10675a2.f50286i = z10;
                                        c10675a2.f50287j = zM19155d2;
                                        c10675a2.f50288k = z11;
                                        c10675a2.f50289l = iM19157f;
                                        c10675a2.f50290m = iM19156e;
                                        c10675a2.f50291n = i14;
                                        c10675a2.f50292o = i13;
                                        c10675a2.f50293p = iM19158g2;
                                        c10675a2.f50278a = true;
                                        c10675a2.f50279b = true;
                                        aVar.f50270k = false;
                                    }
                                    return;
                                }
                                zM19155d = false;
                                zM19155d2 = false;
                                z10 = false;
                                if (aVar.f50268i == 5) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    iM19157f = 0;
                                } else if (!c10152u.m19154c()) {
                                    return;
                                } else {
                                    iM19157f = c10152u.m19157f();
                                }
                                z12 = bVar.f51414b;
                                i12 = cVar.f51425k;
                                if (i12 == 0) {
                                    i15 = cVar.f51426l;
                                    if (!c10152u.m19153b(i15)) {
                                        return;
                                    }
                                    iM19156e = c10152u.m19156e(i15);
                                    if (z12) {
                                        iM19158g3 = 0;
                                    } else {
                                        iM19158g3 = 0;
                                    }
                                    i14 = iM19158g3;
                                    i13 = 0;
                                    iM19158g2 = 0;
                                } else if (i12 == 1) {
                                    iM19158g = 0;
                                    i13 = iM19158g;
                                    iM19156e = 0;
                                    iM19158g2 = 0;
                                    i14 = 0;
                                } else {
                                    iM19158g = 0;
                                    i13 = iM19158g;
                                    iM19156e = 0;
                                    iM19158g2 = 0;
                                    i14 = 0;
                                }
                                a.C10675a c10675a3 = aVar.f50273n;
                                c10675a3.f50280c = cVar;
                                c10675a3.f50281d = iM19156e2;
                                c10675a3.f50282e = iM19157f2;
                                c10675a3.f50283f = iM19156e3;
                                c10675a3.f50284g = iM19157f3;
                                c10675a3.f50285h = zM19155d;
                                c10675a3.f50286i = z10;
                                c10675a3.f50287j = zM19155d2;
                                c10675a3.f50288k = z11;
                                c10675a3.f50289l = iM19157f;
                                c10675a3.f50290m = iM19156e;
                                c10675a3.f50291n = i14;
                                c10675a3.f50292o = i13;
                                c10675a3.f50293p = iM19158g2;
                                c10675a3.f50278a = true;
                                c10675a3.f50279b = true;
                                aVar.f50270k = false;
                            }
                        }
                    }
                }
            }
        }
    }
}
