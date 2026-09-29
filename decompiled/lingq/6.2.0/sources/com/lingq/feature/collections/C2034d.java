package com.lingq.feature.collections;

import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.premiumlessons.C1525a;
import com.lingq.feature.collections.domain.C2035a;
import com.lingq.feature.collections.domain.C2037c;
import com.lingq.feature.collections.domain.C2038d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3139j9;
import p000.C3386nv;
import p000.C3639u8;
import p000.C3750x8;
import p000.InterfaceC3812yx;
import p000.a61;
import p000.b23;
import p000.b61;
import p000.b71;
import p000.c18;
import p000.c23;
import p000.c61;
import p000.c83;
import p000.cma;
import p000.d23;
import p000.e23;
import p000.e51;
import p000.eh9;
import p000.f51;
import p000.g51;
import p000.g9a;
import p000.gm5;
import p000.h51;
import p000.h71;
import p000.h81;
import p000.hi8;
import p000.i51;
import p000.j51;
import p000.k51;
import p000.l51;
import p000.l71;
import p000.l91;
import p000.lda;
import p000.m23;
import p000.m51;
import p000.m68;
import p000.mkd;
import p000.n23;
import p000.n51;
import p000.nl8;
import p000.nn1;
import p000.o51;
import p000.p51;
import p000.pg9;
import p000.pn1;
import p000.q51;
import p000.q91;
import p000.r23;
import p000.r51;
import p000.s23;
import p000.s51;
import p000.t51;
import p000.t61;
import p000.u51;
import p000.u61;
import p000.u91;
import p000.ux5;
import p000.v51;
import p000.v61;
import p000.vi3;
import p000.vk9;
import p000.vqb;
import p000.vz1;
import p000.w51;
import p000.w61;
import p000.web;
import p000.wfb;
import p000.wkd;
import p000.wta;
import p000.x51;
import p000.x61;
import p000.xi9;
import p000.y51;
import p000.y61;
import p000.z51;
import p000.z61;
import p000.z7d;
import p000.zl3;

/* JADX INFO: renamed from: com.lingq.feature.collections.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C2034d extends wta implements cma, m68 {

    /* JADX INFO: renamed from: A */
    public final C3750x8 f25542A;

    /* JADX INFO: renamed from: B */
    public final C2035a f25543B;

    /* JADX INFO: renamed from: C */
    public final C3139j9 f25544C;

    /* JADX INFO: renamed from: D */
    public final C2035a f25545D;

    /* JADX INFO: renamed from: E */
    public final C2038d f25546E;

    /* JADX INFO: renamed from: F */
    public final n23 f25547F;

    /* JADX INFO: renamed from: G */
    public final C3139j9 f25548G;

    /* JADX INFO: renamed from: H */
    public final C1381c f25549H;

    /* JADX INFO: renamed from: I */
    public final vqb f25550I;

    /* JADX INFO: renamed from: J */
    public final e23 f25551J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC3812yx f25552K;

    /* JADX INFO: renamed from: L */
    public final nn1 f25553L;

    /* JADX INFO: renamed from: M */
    public final b71 f25554M;

    /* JADX INFO: renamed from: N */
    public final C3244l f25555N;

    /* JADX INFO: renamed from: O */
    public final c18 f25556O;

    /* JADX INFO: renamed from: P */
    public l91 f25557P;

    /* JADX INFO: renamed from: Q */
    public final ConcurrentHashMap f25558Q;

    /* JADX INFO: renamed from: R */
    public final C3244l f25559R;

    /* JADX INFO: renamed from: S */
    public final c18 f25560S;

    /* JADX INFO: renamed from: T */
    public final C3244l f25561T;

    /* JADX INFO: renamed from: U */
    public final C3244l f25562U;

    /* JADX INFO: renamed from: V */
    public final C3244l f25563V;

    /* JADX INFO: renamed from: W */
    public final C3244l f25564W;

    /* JADX INFO: renamed from: X */
    public final C3244l f25565X;

    /* JADX INFO: renamed from: Y */
    public final C3244l f25566Y;

    /* JADX INFO: renamed from: Z */
    public int f25567Z;

    /* JADX INFO: renamed from: a0 */
    public String f25568a0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f25569b;

    /* JADX INFO: renamed from: b0 */
    public boolean f25570b0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m68 f25571c;

    /* JADX INFO: renamed from: c0 */
    public boolean f25572c0;

    /* JADX INFO: renamed from: d */
    public final C2038d f25573d;

    /* JADX INFO: renamed from: d0 */
    public pg9 f25574d0;

    /* JADX INFO: renamed from: e */
    public final C1525a f25575e;

    /* JADX INFO: renamed from: f */
    public final wkd f25576f;

    /* JADX INFO: renamed from: g */
    public final r23 f25577g;

    /* JADX INFO: renamed from: h */
    public final d23 f25578h;

    /* JADX INFO: renamed from: i */
    public final zl3 f25579i;

    /* JADX INFO: renamed from: j */
    public final hi8 f25580j;

    /* JADX INFO: renamed from: k */
    public final b23 f25581k;

    /* JADX INFO: renamed from: l */
    public final c23 f25582l;

    /* JADX INFO: renamed from: m */
    public final e23 f25583m;

    /* JADX INFO: renamed from: n */
    public final b23 f25584n;

    /* JADX INFO: renamed from: o */
    public final s23 f25585o;

    /* JADX INFO: renamed from: p */
    public final e23 f25586p;

    /* JADX INFO: renamed from: q */
    public final s23 f25587q;

    /* JADX INFO: renamed from: r */
    public final e23 f25588r;

    /* JADX INFO: renamed from: s */
    public final c23 f25589s;

    /* JADX INFO: renamed from: t */
    public final C2037c f25590t;

    /* JADX INFO: renamed from: u */
    public final e23 f25591u;

    /* JADX INFO: renamed from: v */
    public final zl3 f25592v;

    /* JADX INFO: renamed from: w */
    public final d23 f25593w;

    /* JADX INFO: renamed from: x */
    public final m23 f25594x;

    /* JADX INFO: renamed from: y */
    public final web f25595y;

    /* JADX INFO: renamed from: z */
    public final C3639u8 f25596z;

    public C2034d(C2038d c2038d, C1525a c1525a, wkd wkdVar, cma cmaVar, m68 m68Var, nl8 nl8Var, r23 r23Var, d23 d23Var, zl3 zl3Var, hi8 hi8Var, b23 b23Var, c23 c23Var, e23 e23Var, b23 b23Var2, s23 s23Var, e23 e23Var2, s23 s23Var2, e23 e23Var3, c23 c23Var2, C2037c c2037c, e23 e23Var4, zl3 zl3Var2, d23 d23Var2, m23 m23Var, web webVar, wkd wkdVar2, C3639u8 c3639u8, mkd mkdVar, C3750x8 c3750x8, C2035a c2035a, C3139j9 c3139j9, C2035a c2035a2, C2038d c2038d2, n23 n23Var, C3139j9 c3139j10, C1381c c1381c, vqb vqbVar, e23 e23Var5, InterfaceC3812yx interfaceC3812yx, nn1 nn1Var) {
        String str;
        cmaVar.getClass();
        m68Var.getClass();
        nl8Var.getClass();
        interfaceC3812yx.getClass();
        this.f25569b = cmaVar;
        this.f25571c = m68Var;
        this.f25573d = c2038d;
        this.f25575e = c1525a;
        this.f25576f = wkdVar;
        this.f25577g = r23Var;
        this.f25578h = d23Var;
        this.f25579i = zl3Var;
        this.f25580j = hi8Var;
        this.f25581k = b23Var;
        this.f25582l = c23Var;
        this.f25583m = e23Var;
        this.f25584n = b23Var2;
        this.f25585o = s23Var;
        this.f25586p = e23Var2;
        this.f25587q = s23Var2;
        this.f25588r = e23Var3;
        this.f25589s = c23Var2;
        this.f25590t = c2037c;
        this.f25591u = e23Var4;
        this.f25592v = zl3Var2;
        this.f25593w = d23Var2;
        this.f25594x = m23Var;
        this.f25595y = webVar;
        this.f25596z = c3639u8;
        this.f25542A = c3750x8;
        this.f25543B = c2035a;
        this.f25544C = c3139j9;
        this.f25545D = c2035a2;
        this.f25546E = c2038d2;
        this.f25547F = n23Var;
        this.f25548G = c3139j10;
        this.f25549H = c1381c;
        this.f25550I = vqbVar;
        this.f25551J = e23Var5;
        this.f25552K = interfaceC3812yx;
        this.f25553L = nn1Var;
        b71.Companion.getClass();
        if (!nl8Var.m17487a("courseId")) {
            C3386nv.m17626m("Required argument \"courseId\" is missing and does not have an android:defaultValue");
            throw null;
        }
        Integer num = (Integer) nl8Var.m17488b("courseId");
        if (num == null) {
            C3386nv.m17626m("Argument \"courseId\" of type integer does not support null values");
            throw null;
        }
        if (!nl8Var.m17487a("lessonPath")) {
            C3386nv.m17626m("Required argument \"lessonPath\" is missing and does not have an android:defaultValue");
            throw null;
        }
        if (!Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class) && !Serializable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
            C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            throw null;
        }
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = (LqAnalyticsValues$LessonPath) nl8Var.m17488b("lessonPath");
        if (!nl8Var.m17487a("shelfCode")) {
            C3386nv.m17626m("Required argument \"shelfCode\" is missing and does not have an android:defaultValue");
            throw null;
        }
        String str2 = (String) nl8Var.m17488b("shelfCode");
        if (str2 == null) {
            C3386nv.m17626m("Argument \"shelfCode\" is marked as non-null but was passed a null value");
            throw null;
        }
        if (nl8Var.m17487a("languageFromDeeplink")) {
            str = (String) nl8Var.m17488b("languageFromDeeplink");
            if (str == null) {
                C3386nv.m17626m("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        this.f25554M = new b71(num.intValue(), lqAnalyticsValues$LessonPath, str2, str);
        List listM23604J = vz1.m23604J(h71.f41856a);
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new l71(i));
        }
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new q91("Course overview", u91.m22603U0(arrayList, listM23604J), (248 & 4) == 0, null, null, null, false, false));
        this.f25555N = c3244lM17114d;
        this.f25556O = AbstractC3224d.m15524c(c3244lM17114d);
        this.f25558Q = new ConcurrentHashMap();
        Sort sort = Sort.Position;
        EmptyList emptyList = EmptyList.f47638a;
        c61 c61Var = new c61(null, null, emptyList, sort, false, false, false, false, false, true, true, false, false, false, false, false, "");
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(c61Var);
        this.f25559R = c3244lM17114d2;
        this.f25560S = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), xi9.f68262a, c61Var);
        this.f25561T = AbstractC3352my.m17114d(1);
        this.f25562U = AbstractC3352my.m17114d(emptyList);
        this.f25563V = AbstractC3352my.m17114d(emptyList);
        this.f25564W = AbstractC3352my.m17114d(emptyList);
        this.f25565X = AbstractC3352my.m17114d(emptyList);
        this.f25566Y = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f25567Z = -1;
        this.f25568a0 = "";
        wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$observeMergedLessonData$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$observeDownloadProgress$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$observePageChanges$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$observeActiveLanguage$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$observeContentState$1(this, null), 3);
    }

    /* JADX INFO: renamed from: V2 */
    public static boolean m8940V2(LibraryItem libraryItem, String str) {
        String str2;
        return (libraryItem.m8088c() || vk9.m23391n0(str) || (str2 = libraryItem.f19412M) == null || vk9.m23391n0(str2) || str2.equalsIgnoreCase(str)) ? false : true;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f25569b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f25569b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f25569b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f25569b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f25569b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f25569b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f25569b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f25569b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f25569b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f25569b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f25569b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f25569b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f25569b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f25569b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f25569b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f25569b.mo4586T0();
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: V */
    public final Object mo8941V(String str, int i, String str2, String str3, Continuation continuation) {
        return this.f25571c.mo8941V(str, i, str2, str3, continuation);
    }

    /* JADX INFO: renamed from: W2 */
    public final t61 m8942W2(String str, c61 c61Var) {
        LibraryItemCounter libraryItemCounter;
        c61Var.getClass();
        LibraryItem libraryItem = c61Var.f9606a;
        if (libraryItem == null || (libraryItemCounter = c61Var.f9607b) == null) {
            return null;
        }
        String str2 = libraryItem.f19433e;
        if (str2 == null) {
            str2 = "";
        }
        int i = libraryItem.f19426a;
        String str3 = libraryItem.f19430c;
        return new t61(str2, i, str3 != null ? str3 : "", str, m8947b3(), libraryItemCounter.f19456b, c61Var.f9618m, c61Var.f9619n, c61Var.f9620o, m8940V2(libraryItem, c61Var.f9622q), c61Var.f9621p);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f25569b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m8943X2() {
        l91 l91Var = this.f25557P;
        if (l91Var == null) {
            return;
        }
        m8948c3(g9a.m12431h("fetchCollectionCourse-", this.f25567Z, "-", l91Var.f49324a), new CollectionViewModel$fetchCourse$1(this, l91Var, null));
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m8944Y2() {
        l91 l91Var = this.f25557P;
        if (l91Var == null) {
            return;
        }
        int iIntValue = ((Number) this.f25561T.getValue()).intValue();
        Sort sort = ((c61) this.f25559R.getValue()).f9609d;
        int i = this.f25567Z;
        m8948c3(AbstractC3393o1.m17739n(ux5.m22994q(i, iIntValue, "fetchCollectionCourseLessons-", "-", "-"), sort.getValue(), "-", l91Var.f49324a), new CollectionViewModel$fetchCourseLessons$1(this, l91Var, sort, iIntValue, null));
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m8945Z2(b61 b61Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        String str;
        String str2;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        Object value12;
        Object value13;
        int i;
        l91 l91Var;
        Object value14;
        Object value15;
        Object value16;
        Object value17;
        Object value18;
        Object value19;
        q91 q91Var;
        int i2;
        String str3;
        Object value20;
        Object value21;
        Object value22;
        Object value23;
        Object value24;
        b61Var.getClass();
        if (b61Var.equals(v51.f64879a)) {
            m8943X2();
            m8950e3();
            return;
        }
        boolean zEquals = b61Var.equals(u51.f63411a);
        C3244l c3244l = this.f25559R;
        if (zEquals) {
            if (((c61) c3244l.getValue()).f9616k || ((c61) c3244l.getValue()).f9608c.isEmpty()) {
                return;
            }
            do {
                value24 = c3244l.getValue();
            } while (!c3244l.m15570h(value24, c61.m4341a((c61) value24, null, null, null, null, false, false, false, false, false, false, true, false, false, false, false, false, null, 130047)));
            C3244l c3244l2 = this.f25561T;
            c3244l2.m15572j(null, Integer.valueOf(((Number) c3244l2.getValue()).intValue() + 1));
            return;
        }
        if (b61Var instanceof a61) {
            Sort sort = ((a61) b61Var).f276a;
            sort.getClass();
            do {
                value23 = c3244l.getValue();
            } while (!c3244l.m15570h(value23, c61.m4341a((c61) value23, null, null, null, sort, false, false, false, false, false, false, false, false, false, false, false, false, null, 131063)));
            m8950e3();
            return;
        }
        if (b61Var instanceof y51) {
            boolean z = ((y51) b61Var).f69302a;
            do {
                value22 = c3244l.getValue();
            } while (!c3244l.m15570h(value22, c61.m4341a((c61) value22, null, null, null, null, false, false, false, false, z, false, false, false, false, false, false, false, null, 130815)));
            return;
        }
        boolean zEquals2 = b61Var.equals(z51.f70936a);
        C3244l c3244l3 = this.f25555N;
        if (zEquals2) {
            do {
                value21 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value21, q91.m19806a((q91) value21, null, false, m8942W2(this.f25554M.f8038c, (c61) c3244l.getValue()), null, null, false, false, 247)));
            return;
        }
        if (b61Var.equals(n51.f52357a)) {
            do {
                value20 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value20, q91.m19806a((q91) value20, null, false, null, null, null, false, false, 247)));
            return;
        }
        if (b61Var instanceof h51) {
            do {
                value18 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value18, q91.m19806a((q91) value18, null, false, null, null, null, false, false, 247)));
            LibraryItem libraryItem = ((h51) b61Var).f41798a;
            if (m8947b3()) {
                wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$handleCourseDownload$1(this, libraryItem, null), 3);
                return;
            }
            do {
                value19 = c3244l3.getValue();
                q91Var = (q91) value19;
                i2 = libraryItem.f19426a;
                str3 = libraryItem.f19435g;
                if (str3 == null) {
                    str3 = "";
                }
            } while (!c3244l3.m15570h(value19, q91.m19806a(q91Var, null, false, null, new u61(i2, str3), null, false, false, 239)));
            return;
        }
        boolean z2 = b61Var instanceof i51;
        nn1 nn1Var = this.f25553L;
        if (z2) {
            do {
                value17 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value17, q91.m19806a((q91) value17, null, false, null, null, null, false, false, 247)));
            l91 l91Var2 = this.f25557P;
            if (l91Var2 == null) {
                return;
            }
            AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, ux5.m22988k(this.f25567Z, "updateCollectionCourseLike-"), new CollectionViewModel$updateCourseLike$1(this, l91Var2, null));
            return;
        }
        if (b61Var instanceof k51) {
            do {
                value16 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value16, q91.m19806a((q91) value16, null, false, null, null, null, false, false, 247)));
            l91 l91Var3 = this.f25557P;
            if (l91Var3 == null) {
                return;
            }
            AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, ux5.m22988k(this.f25567Z, "updateCollectionCourseSubscription-"), new CollectionViewModel$updateCourseSubscription$1(this, l91Var3, null));
            return;
        }
        if (b61Var instanceof g51) {
            do {
                value15 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value15, q91.m19806a((q91) value15, null, false, null, null, null, false, false, 247)));
            l91 l91Var4 = this.f25557P;
            if (l91Var4 == null) {
                return;
            }
            AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, ux5.m22988k(this.f25567Z, "blacklistCollectionCourse-"), new CollectionViewModel$blacklistCourse$1(this, l91Var4, ((g51) b61Var).f40223b, null));
            return;
        }
        if (b61Var instanceof j51) {
            do {
                value14 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value14, q91.m19806a((q91) value14, null, false, null, null, null, false, false, 247)));
            l91 l91Var5 = this.f25557P;
            if (l91Var5 == null) {
                return;
            }
            wfb.m23926u(lda.m16103C(this), nn1Var, null, new CollectionViewModel$updateAllLessonsSave$1(this, l91Var5, null), 2);
            return;
        }
        if (b61Var instanceof r51) {
            l91 l91Var6 = this.f25557P;
            if (l91Var6 == null) {
                return;
            }
            r51 r51Var = (r51) b61Var;
            int i3 = r51Var.f58736a.f41930a.f19426a;
            LqAnalyticsValues$LikeLocation lqAnalyticsValues$LikeLocation = r51Var.f58737b;
            lqAnalyticsValues$LikeLocation.getClass();
            wfb.m23926u(lda.m16103C(this), nn1Var, null, new CollectionViewModel$updateLessonLike$1(this, l91Var6, i3, lqAnalyticsValues$LikeLocation, null), 2);
            return;
        }
        if (b61Var instanceof p51) {
            String str4 = ((p51) b61Var).f55588a.f41930a.f19447s;
            if (str4 == null || (l91Var = this.f25557P) == null) {
                return;
            }
            AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, "blacklistCollectionSource-".concat(str4), new CollectionViewModel$blacklistSource$1(this, l91Var, str4, null));
            return;
        }
        if (b61Var instanceof o51) {
            m8946a3(((o51) b61Var).f53857a, false);
            return;
        }
        if (b61Var instanceof t51) {
            m8946a3(((t51) b61Var).f61872a, true);
            return;
        }
        if (b61Var instanceof q51) {
            h81 h81Var = ((q51) b61Var).f57282a;
            LibraryItemCounter libraryItemCounter = h81Var.f41931b;
            LibraryItem libraryItem2 = h81Var.f41930a;
            if (libraryItemCounter != null && !libraryItemCounter.f19460f && (i = libraryItem2.f19423X) > 0) {
                wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$requestPremiumLesson$1(this, i, libraryItem2.f19426a, null), 3);
                return;
            }
            l91 l91Var7 = this.f25557P;
            if (l91Var7 == null) {
                return;
            }
            int i4 = libraryItem2.f19426a;
            AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, ux5.m22988k(i4, "downloadCollectionLesson-"), new CollectionViewModel$downloadLesson$1(this, i4, l91Var7, null));
            return;
        }
        if (b61Var.equals(m51.f50598a)) {
            do {
                value13 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value13, q91.m19806a((q91) value13, null, false, null, null, null, false, false, 239)));
            return;
        }
        if (!b61Var.equals(l51.f49063a)) {
            if (b61Var.equals(e51.f36717a)) {
                l91 l91Var8 = this.f25557P;
                if (l91Var8 == null) {
                    return;
                }
                do {
                    value6 = c3244l3.getValue();
                    str = l91Var8.f49326c;
                    str2 = l91Var8.f49324a;
                    this.f25576f.getClass();
                } while (!c3244l3.m15570h(value6, q91.m19806a((q91) value6, null, false, null, null, wkd.m24040b(str, str2), true, false, 143)));
                return;
            }
            if (b61Var.equals(f51.f38427a)) {
                do {
                    value5 = c3244l3.getValue();
                } while (!c3244l3.m15570h(value5, q91.m19806a((q91) value5, null, false, null, null, null, false, false, 223)));
                return;
            }
            if (b61Var.equals(x51.f67769a)) {
                do {
                    value4 = c3244l3.getValue();
                } while (!c3244l3.m15570h(value4, q91.m19806a((q91) value4, null, false, null, null, null, false, false, 191)));
                wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$handleAction$20(this, null), 3);
                return;
            }
            if (!b61Var.equals(s51.f60313a)) {
                if (!b61Var.equals(w51.f66401a)) {
                    gm5.m12750e();
                    return;
                } else {
                    if (((q91) c3244l3.getValue()).f57446h) {
                        do {
                            value = c3244l3.getValue();
                        } while (!c3244l3.m15570h(value, q91.m19806a((q91) value, null, false, null, null, null, false, false, 127)));
                        m8943X2();
                        m8944Y2();
                        return;
                    }
                    return;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.f25558Q;
            Set setEntrySet = concurrentHashMap.entrySet();
            setEntrySet.getClass();
            for (Map.Entry entry : u91.m22622n1(setEntrySet)) {
                entry.getClass();
                Object key = entry.getKey();
                key.getClass();
                String str5 = (String) key;
                Object value25 = entry.getValue();
                value25.getClass();
                ConcurrentHashMap concurrentHashMap2 = pn1.f56492a;
                pn1.m19405a(lda.m16103C(this), str5);
                concurrentHashMap.remove(str5, value25);
            }
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, c61.m4341a((c61) value2, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, 129535)));
            do {
                value3 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value3, q91.m19806a((q91) value3, null, false, null, null, null, false, true, 127)));
            return;
        }
        z7d z7dVar = ((q91) c3244l3.getValue()).f57443e;
        if (z7dVar instanceof w61) {
            do {
                value12 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value12, q91.m19806a((q91) value12, null, false, null, null, null, false, false, 239)));
            l91 l91Var9 = this.f25557P;
            if (l91Var9 == null) {
                return;
            }
            w61 w61Var = (w61) z7dVar;
            int i5 = w61Var.f66445c;
            AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, ux5.m22988k(i5, "buyCollectionCourse-"), new CollectionViewModel$buyCourse$1(this, new C2031b(this), i5, l91Var9, w61Var.f66443a, null));
            return;
        }
        if (z7dVar instanceof x61) {
            do {
                value11 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value11, q91.m19806a((q91) value11, null, false, null, null, null, false, false, 239)));
            l91 l91Var10 = this.f25557P;
            if (l91Var10 == null) {
                return;
            }
            wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$handleDialogConfirmed$4(this, l91Var10, z7dVar, null), 3);
            return;
        }
        if (z7dVar instanceof u61) {
            do {
                value10 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value10, q91.m19806a((q91) value10, null, false, null, null, null, false, false, 239)));
            l91 l91Var11 = this.f25557P;
            if (l91Var11 == null) {
                return;
            }
            this.f25590t.m8959c(this.f25567Z, l91Var11.f49324a);
            return;
        }
        if (z7dVar instanceof y61) {
            do {
                value9 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value9, q91.m19806a((q91) value9, null, false, null, null, null, false, false, 239)));
            y61 y61Var = (y61) z7dVar;
            int i6 = y61Var.f69353a;
            int i7 = y61Var.f69354b;
            if (i7 > 0) {
                wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$checkPaidContentBeforeSave$1(this, y61Var.f69355c, i6, i7, false, null), 3);
                return;
            }
            l91 l91Var12 = this.f25557P;
            if (l91Var12 == null) {
                return;
            }
            m8952f3(l91Var12, i6, false);
            return;
        }
        if (z7dVar instanceof z61) {
            do {
                value8 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value8, q91.m19806a((q91) value8, null, false, null, null, null, false, false, 239)));
            l91 l91Var13 = this.f25557P;
            if (l91Var13 == null) {
                return;
            }
            z61 z61Var = (z61) z7dVar;
            m8952f3(l91Var13, z61Var.f70975a, z61Var.f70978d);
            return;
        }
        if (z7dVar instanceof v61) {
            do {
                value7 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value7, q91.m19806a((q91) value7, null, false, null, null, null, false, false, 239)));
        } else {
            if (z7dVar == null) {
                return;
            }
            gm5.m12750e();
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f25569b.mo4588a0();
    }

    /* JADX INFO: renamed from: a3 */
    public final void m8946a3(h81 h81Var, boolean z) {
        int i;
        C3244l c3244l;
        Object value;
        LibraryItemCounter libraryItemCounter = h81Var.f41931b;
        LibraryItem libraryItem = h81Var.f41930a;
        boolean z2 = false;
        boolean z3 = libraryItemCounter != null && libraryItemCounter.f19460f;
        boolean z4 = !z3;
        if (libraryItemCounter != null && !libraryItemCounter.f19460f && libraryItem.f19423X > 0) {
            z2 = true;
        }
        if (z3) {
            do {
                c3244l = this.f25555N;
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, q91.m19806a((q91) value, null, false, null, new y61(libraryItem.f19426a, libraryItem.f19412M, libraryItem.f19423X), null, false, false, 239)));
        } else {
            if (z2) {
                wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$requestPremiumLesson$1(this, libraryItem.f19423X, libraryItem.f19426a, null), 3);
                return;
            }
            if (z && (i = libraryItem.f19423X) > 0) {
                wfb.m23926u(lda.m16103C(this), null, null, new CollectionViewModel$checkPaidContentBeforeSave$1(this, libraryItem.f19412M, libraryItem.f19426a, i, z4, null), 3);
                return;
            }
            l91 l91Var = this.f25557P;
            if (l91Var == null) {
                return;
            }
            m8952f3(l91Var, libraryItem.f19426a, z4);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f25569b.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m8947b3() {
        LibraryItemCounter libraryItemCounter;
        C3244l c3244l = this.f25559R;
        LibraryItem libraryItem = ((c61) c3244l.getValue()).f9606a;
        return (libraryItem == null || (libraryItemCounter = ((c61) c3244l.getValue()).f9607b) == null || libraryItem.f19423X <= 0 || libraryItemCounter.f19467m) ? false : true;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m8948c3(String str, vi3 vi3Var) {
        Object obj = new Object();
        this.f25558Q.put(str, obj);
        AbstractC1263a.m7047b(lda.m16103C(this), this.f25553L, str, new CollectionViewModel$launchRefresh$1(vi3Var, this, str, obj, null));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f25569b.mo4590d0();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m8949d3(boolean z) {
        l91 l91Var = this.f25557P;
        if (l91Var == null) {
            return;
        }
        Sort sort = ((c61) this.f25559R.getValue()).f9609d;
        AbstractC1263a.m7046a(this.f25574d0);
        this.f25574d0 = wfb.m23926u(lda.m16103C(this), this.f25553L, null, new CollectionViewModel$observeCourseLessons$1(l91Var, sort, this, null, z), 2);
    }

    /* JADX INFO: renamed from: e3 */
    public final void m8950e3() {
        C3244l c3244l;
        Object value;
        C3244l c3244l2 = this.f25561T;
        boolean z = ((Number) c3244l2.getValue()).intValue() == 1;
        C3244l c3244l3 = this.f25562U;
        c3244l3.getClass();
        EmptyList emptyList = EmptyList.f47638a;
        c3244l3.m15572j(null, emptyList);
        C3244l c3244l4 = this.f25563V;
        c3244l4.getClass();
        c3244l4.m15572j(null, emptyList);
        C3244l c3244l5 = this.f25564W;
        c3244l5.getClass();
        c3244l5.m15572j(null, emptyList);
        C3244l c3244l6 = this.f25565X;
        c3244l6.getClass();
        c3244l6.m15572j(null, emptyList);
        do {
            c3244l = this.f25559R;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, false, false, false, false, false, true, false, false, false, false, false, null, 127999)));
        c3244l2.getClass();
        c3244l2.m15572j(null, 1);
        if (z) {
            m8949d3(true);
            m8944Y2();
        }
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: f0 */
    public final void mo8951f0(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f25571c.mo8951f0(str, i, str2, str3);
    }

    /* JADX INFO: renamed from: f3 */
    public final void m8952f3(l91 l91Var, int i, boolean z) {
        l91Var.getClass();
        AbstractC1263a.m7047b(lda.m16103C(this), this.f25553L, "updateCollectionLessonSave-" + i + "-" + z, new CollectionViewModel$updateLessonSave$1(this, l91Var, i, z, null));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f25569b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: m */
    public final Object mo8953m(String str, int i, String str2, String str3, Continuation continuation) {
        return this.f25571c.mo8953m(str, i, str2, str3, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f25569b.mo4592m0();
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: p */
    public final void mo8954p(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f25571c.mo8954p(str, i, str2, str3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f25569b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f25569b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f25569b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f25569b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f25569b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f25569b.mo4598w2();
    }
}
