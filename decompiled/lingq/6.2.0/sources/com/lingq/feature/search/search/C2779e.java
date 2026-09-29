package com.lingq.feature.search.search;

import android.os.Parcelable;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.library.C1387b;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.navigation.model.LibraryShelfNavArg;
import com.lingq.core.navigation.model.LibraryTabNavArg;
import com.lingq.feature.search.filter.C2770a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.C3386nv;
import p000.ap8;
import p000.ar8;
import p000.as8;
import p000.b23;
import p000.bs8;
import p000.c18;
import p000.c23;
import p000.c83;
import p000.cg7;
import p000.cl9;
import p000.cma;
import p000.cp8;
import p000.cs8;
import p000.cz1;
import p000.dp8;
import p000.dr8;
import p000.ds8;
import p000.e23;
import p000.eh9;
import p000.er8;
import p000.es8;
import p000.et8;
import p000.f41;
import p000.f5d;
import p000.fa4;
import p000.fm6;
import p000.fp8;
import p000.fr8;
import p000.fs8;
import p000.g41;
import p000.gm5;
import p000.gp8;
import p000.gq8;
import p000.gr8;
import p000.gs8;
import p000.gt8;
import p000.hp8;
import p000.hr8;
import p000.hs8;
import p000.ij7;
import p000.ip8;
import p000.ir8;
import p000.it8;
import p000.jp8;
import p000.jr8;
import p000.js8;
import p000.jt8;
import p000.kr8;
import p000.lda;
import p000.lj2;
import p000.lr8;
import p000.m68;
import p000.m83;
import p000.mm3;
import p000.mr8;
import p000.mv0;
import p000.nl8;
import p000.nn1;
import p000.nq8;
import p000.nr8;
import p000.ob1;
import p000.oo8;
import p000.or8;
import p000.po8;
import p000.pr8;
import p000.qo8;
import p000.qr8;
import p000.r23;
import p000.ro8;
import p000.rr8;
import p000.s23;
import p000.so8;
import p000.sr8;
import p000.to8;
import p000.tr8;
import p000.uo8;
import p000.uq8;
import p000.ur8;
import p000.v91;
import p000.vk9;
import p000.vo8;
import p000.vqb;
import p000.vr8;
import p000.wfb;
import p000.wo8;
import p000.wr8;
import p000.wta;
import p000.wz0;
import p000.xi9;
import p000.xo8;
import p000.xr8;
import p000.xs8;
import p000.yo8;
import p000.yr8;
import p000.zo8;
import p000.zr8;

/* JADX INFO: renamed from: com.lingq.feature.search.search.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2779e extends wta implements cma, m68 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f33094b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m68 f33095c;

    /* JADX INFO: renamed from: d */
    public final mm3 f33096d;

    /* JADX INFO: renamed from: e */
    public final C1387b f33097e;

    /* JADX INFO: renamed from: f */
    public final e23 f33098f;

    /* JADX INFO: renamed from: g */
    public final c23 f33099g;

    /* JADX INFO: renamed from: h */
    public final s23 f33100h;

    /* JADX INFO: renamed from: i */
    public final r23 f33101i;

    /* JADX INFO: renamed from: j */
    public final b23 f33102j;

    /* JADX INFO: renamed from: k */
    public final b23 f33103k;

    /* JADX INFO: renamed from: l */
    public final e23 f33104l;

    /* JADX INFO: renamed from: m */
    public final c23 f33105m;

    /* JADX INFO: renamed from: n */
    public final C2775b f33106n;

    /* JADX INFO: renamed from: o */
    public final C2770a f33107o;

    /* JADX INFO: renamed from: p */
    public final nn1 f33108p;

    /* JADX INFO: renamed from: q */
    public final vqb f33109q;

    /* JADX INFO: renamed from: r */
    public final ob1 f33110r;

    /* JADX INFO: renamed from: s */
    public final f41 f33111s;

    /* JADX INFO: renamed from: t */
    public final nq8 f33112t;

    /* JADX INFO: renamed from: u */
    public final LibraryShelf f33113u;

    /* JADX INFO: renamed from: v */
    public final C3244l f33114v;

    /* JADX INFO: renamed from: w */
    public final LinkedHashSet f33115w;

    /* JADX INFO: renamed from: x */
    public final AtomicLong f33116x;

    /* JADX INFO: renamed from: y */
    public final C3244l f33117y;

    /* JADX INFO: renamed from: z */
    public final c18 f33118z;

    public C2779e(mm3 mm3Var, C1387b c1387b, e23 e23Var, c23 c23Var, s23 s23Var, r23 r23Var, b23 b23Var, b23 b23Var2, e23 e23Var2, c23 c23Var2, C2775b c2775b, C2770a c2770a, nn1 nn1Var, vqb vqbVar, ob1 ob1Var, f41 f41Var, cma cmaVar, m68 m68Var, nl8 nl8Var) {
        LibraryTabNavArg libraryTabNavArg;
        String str;
        ob1Var.getClass();
        f41Var.getClass();
        cmaVar.getClass();
        m68Var.getClass();
        nl8Var.getClass();
        this.f33094b = cmaVar;
        this.f33095c = m68Var;
        this.f33096d = mm3Var;
        this.f33097e = c1387b;
        this.f33098f = e23Var;
        this.f33099g = c23Var;
        this.f33100h = s23Var;
        this.f33101i = r23Var;
        this.f33102j = b23Var;
        this.f33103k = b23Var2;
        this.f33104l = e23Var2;
        this.f33105m = c23Var2;
        this.f33106n = c2775b;
        this.f33107o = c2770a;
        this.f33108p = nn1Var;
        this.f33109q = vqbVar;
        this.f33110r = ob1Var;
        this.f33111s = f41Var;
        nq8.Companion.getClass();
        if (!nl8Var.m17487a("shelf")) {
            C3386nv.m17626m("Required argument \"shelf\" is missing and does not have an android:defaultValue");
            throw null;
        }
        if (!Parcelable.class.isAssignableFrom(LibraryShelfNavArg.class) && !Serializable.class.isAssignableFrom(LibraryShelfNavArg.class)) {
            C3386nv.m17636w(LibraryShelfNavArg.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            throw null;
        }
        LibraryShelfNavArg libraryShelfNavArg = (LibraryShelfNavArg) nl8Var.m17488b("shelf");
        if (libraryShelfNavArg == null) {
            C3386nv.m17626m("Argument \"shelf\" is marked as non-null but was passed a null value");
            throw null;
        }
        if (!nl8Var.m17487a("title")) {
            C3386nv.m17626m("Required argument \"title\" is missing and does not have an android:defaultValue");
            throw null;
        }
        String str2 = (String) nl8Var.m17488b("title");
        if (str2 == null) {
            C3386nv.m17626m("Argument \"title\" is marked as non-null but was passed a null value");
            throw null;
        }
        if (!nl8Var.m17487a("tabSelected")) {
            libraryTabNavArg = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(LibraryTabNavArg.class) && !Serializable.class.isAssignableFrom(LibraryTabNavArg.class)) {
                C3386nv.m17636w(LibraryTabNavArg.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                throw null;
            }
            libraryTabNavArg = (LibraryTabNavArg) nl8Var.m17488b("tabSelected");
        }
        if (nl8Var.m17487a("query")) {
            str = (String) nl8Var.m17488b("query");
            if (str == null) {
                C3386nv.m17626m("Argument \"query\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        this.f33112t = new nq8(libraryShelfNavArg, str2, libraryTabNavArg, str);
        boolean z = libraryShelfNavArg.f20277a;
        boolean z2 = libraryShelfNavArg.f20278b;
        List<LibraryTabNavArg> list = libraryShelfNavArg.f20279c;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        for (LibraryTabNavArg libraryTabNavArg2 : list) {
            libraryTabNavArg2.getClass();
            arrayList.add(new LibraryTab(libraryTabNavArg2.f20285a, libraryTabNavArg2.f20286b, libraryTabNavArg2.f20287c, libraryTabNavArg2.f20288d, libraryTabNavArg2.f20289e, libraryTabNavArg2.f20290f));
        }
        this.f33113u = new LibraryShelf(z, z2, arrayList, libraryShelfNavArg.f20280d, libraryShelfNavArg.f20281e, libraryShelfNavArg.f20282f, libraryShelfNavArg.f20283g, libraryShelfNavArg.f20284h);
        LibraryTabNavArg libraryTabNavArg3 = this.f33112t.f53143c;
        LibraryTab libraryTab = libraryTabNavArg3 != null ? new LibraryTab(libraryTabNavArg3.f20285a, libraryTabNavArg3.f20286b, libraryTabNavArg3.f20287c, libraryTabNavArg3.f20288d, libraryTabNavArg3.f20289e, libraryTabNavArg3.f20290f) : null;
        String str3 = this.f33112t.f53144d;
        Map mapM15360M = AbstractC3194a.m15360M();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Pair pair = new Pair(LearningLevel.Beginner1, LearningLevel.Advanced2);
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new ar8(emptyList, emptyList, emptyList, emptyList, mapM15360M, hashSet, hashSet2, false, false, false, true, 1, libraryTab, str3, pair, null));
        this.f33114v = c3244lM17114d;
        this.f33115w = new LinkedHashSet();
        this.f33116x = new AtomicLong(0L);
        this.f33117y = AbstractC3352my.m17114d(0L);
        wz0 wz0Var = new wz0(27, c3244lM17114d, this);
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f33118z = AbstractC3224d.m15520B(new C3228h(AbstractC3224d.m15520B(wz0Var, g41VarM16103C, c3243k, new jt8(emptyList, false, false)), AbstractC3224d.m15520B(new C3228h(this.f33107o.f32915j, this.f33106n.f33085u, new SearchViewModel$dialogScreenData$1(3, null)), lda.m16103C(this), c3243k, new it8(new gt8(), new jp8())), new SearchViewModel$state$1(3, null)), lda.m16103C(this), c3243k, new xs8((List) null, false, false, (gt8) null, (ij7) null, (fm6) null, false, false, false, (String) null, false, 4095));
        m24153Q2(this.f33111s);
        AbstractC1263a.m7049d(new m83(this.f33094b.mo4572B0(), new SearchViewModel$1(this, null), 2), lda.m16103C(this), "search_language", this.f33108p);
        AbstractC1263a.m7049d(new m83(((lj2) this.f33109q.f65802b).f49736a, new SearchViewModel$2(this, null), 2), lda.m16103C(this), "downloadProgress", this.f33108p);
        AbstractC1263a.m7049d(new m83(this.f33107o.f32913h, new SearchViewModel$3(this, null), 2), lda.m16103C(this), "searchQueries", this.f33108p);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f33094b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f33094b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f33094b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f33094b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f33094b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f33094b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f33094b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f33094b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f33094b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f33094b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f33094b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f33094b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f33094b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f33094b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f33094b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f33094b.mo4586T0();
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: V */
    public final Object mo8941V(String str, int i, String str2, String str3, Continuation continuation) {
        return this.f33095c.mo8941V(str, i, str2, str3, continuation);
    }

    /* JADX INFO: renamed from: V2 */
    public final boolean m9705V2() {
        LibraryTab libraryTabM18268n = ((ar8) this.f33114v.getValue()).f7401m;
        LibraryShelf libraryShelf = this.f33113u;
        if (libraryTabM18268n == null) {
            libraryTabM18268n = AbstractC3423or.m18268n(libraryShelf);
        }
        return f5d.m11559a(AbstractC3423or.m18220E(libraryShelf, libraryTabM18268n)) == null;
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9706W2(hs8 hs8Var) {
        Object value;
        Object value2;
        Object value3;
        ar8 ar8Var;
        Object value4;
        Object value5;
        Object value6;
        ar8 ar8Var2;
        Object next;
        EmptyList emptyList;
        Object value7;
        hs8Var.getClass();
        if (hs8Var.equals(vr8.f65829a)) {
            m9708Y2(true);
            return;
        }
        boolean z = hs8Var instanceof cs8;
        C3244l c3244l = this.f33114v;
        if (z) {
            do {
                value7 = c3244l.getValue();
            } while (!c3244l.m15570h(value7, ar8.m3015a((ar8) value7, null, null, null, null, null, null, null, false, false, false, false, 0, null, ((cs8) hs8Var).f34495a, null, null, 57343)));
            m9708Y2(true);
            return;
        }
        if (hs8Var instanceof es8) {
            do {
                value6 = c3244l.getValue();
                ar8Var2 = (ar8) value6;
                Iterator it = this.f33113u.f19495c.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fa4.m11650l(((LibraryTab) next).f19506f, ((es8) hs8Var).f37778a.f19506f));
                emptyList = EmptyList.f47638a;
            } while (!c3244l.m15570h(value6, ar8.m3015a(ar8Var2, emptyList, emptyList, emptyList, emptyList, null, null, null, true, true, false, true, 1, (LibraryTab) next, null, null, null, 57456)));
            m9708Y2(true);
            m9709Z2();
            return;
        }
        boolean z2 = hs8Var instanceof ds8;
        C2770a c2770a = this.f33107o;
        cma cmaVar = this.f33094b;
        if (z2) {
            String strM9710a3 = m9710a3(cmaVar.mo4589b2());
            Sort sort = ((ds8) hs8Var).f36179a;
            c2770a.getClass();
            sort.getClass();
            c2770a.m9690g(strM9710a3, new cg7(sort, 16));
            m9708Y2(true);
            return;
        }
        boolean zEquals = hs8Var.equals(rr8.f59741a);
        et8 et8Var = et8.f37830a;
        if (zEquals) {
            m9709Z2();
            String strM9710a4 = m9710a3(cmaVar.mo4589b2());
            String strMo4589b2 = cmaVar.mo4589b2();
            boolean zM9705V2 = m9705V2();
            c2770a.getClass();
            strMo4589b2.getClass();
            c2770a.m9688e(strM9710a4, strMo4589b2, zM9705V2);
            C3244l c3244l2 = c2770a.f32914i;
            do {
                value5 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value5, gt8.m12861a((gt8) value5, true, et8Var, null, null, null, 12)));
            return;
        }
        if (hs8Var.equals(jr8.f46043a)) {
            C3244l c3244l3 = c2770a.f32914i;
            do {
                value4 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value4, gt8.m12861a((gt8) value4, false, et8Var, null, new gq8(), null, 4)));
            return;
        }
        if (hs8Var instanceof kr8) {
            this.f33107o.m9685b(((kr8) hs8Var).f48368a, m9710a3(cmaVar.mo4589b2()), cmaVar.mo4589b2(), m9705V2(), new js8(this, 14));
            return;
        }
        if (hs8Var.equals(bs8.f8949a)) {
            ar8 ar8Var3 = (ar8) c3244l.getValue();
            if (ar8Var3.f7396h || ar8Var3.f7397i || ar8Var3.f7398j || !ar8Var3.f7399k || ar8Var3.f7389a.isEmpty()) {
                return;
            }
            do {
                value3 = c3244l.getValue();
                ar8Var = (ar8) value3;
            } while (!c3244l.m15570h(value3, ar8.m3015a(ar8Var, null, null, null, null, null, null, null, true, true, false, false, ar8Var.f7400l + 1, null, null, null, null, 63103)));
            m9708Y2(false);
            return;
        }
        boolean z3 = hs8Var instanceof ur8;
        C2775b c2775b = this.f33106n;
        if (z3) {
            ur8 ur8Var = (ur8) hs8Var;
            c2775b.m9699b(new fp8(ur8Var.f64249a, ur8Var.f64250b));
            return;
        }
        if (hs8Var instanceof tr8) {
            tr8 tr8Var = (tr8) hs8Var;
            c2775b.m9699b(new so8(tr8Var.f62772a, tr8Var.f62773b));
            return;
        }
        if (hs8Var.equals(sr8.f61319a)) {
            c2775b.m9699b(yo8.f70175a);
            return;
        }
        if (hs8Var.equals(qr8.f58113a)) {
            c2775b.m9699b(xo8.f68444a);
            return;
        }
        if (hs8Var.equals(dr8.f36115a)) {
            c2775b.m9699b(qo8.f58017a);
            return;
        }
        if (hs8Var.equals(er8.f37758a)) {
            c2775b.m9699b(uo8.f64139a);
            return;
        }
        if (hs8Var.equals(wr8.f67207a)) {
            c2775b.m9699b(vo8.f65723a);
            wfb.m23926u(lda.m16103C(this), null, null, new SearchViewModel$handleAction$4(this, null), 3);
            return;
        }
        if (hs8Var.equals(zr8.f72008a)) {
            c2775b.m9699b(to8.f62645a);
            return;
        }
        if (hs8Var.equals(as8.f7430a)) {
            c2775b.m9699b(zo8.f71862a);
            return;
        }
        if (hs8Var.equals(xr8.f68586a)) {
            gp8 gp8Var = ((ar8) c3244l.getValue()).f7404p;
            if (gp8Var == null) {
                return;
            }
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, ar8.m3015a((ar8) value2, null, null, null, null, null, null, null, false, false, false, false, 0, null, null, null, null, 32767)));
            c2775b.m9699b(new gp8(gp8Var.f41160a, gp8Var.f41161b, gp8Var.f41162c, gp8Var.f41163d, gp8Var.f41164e, true));
            return;
        }
        if (hs8Var.equals(yr8.f70351a)) {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, ar8.m3015a((ar8) value, null, null, null, null, null, null, null, false, false, false, false, 0, null, null, null, null, 32767)));
            return;
        }
        if (hs8Var.equals(gr8.f41249a)) {
            c2775b.m9699b(ro8.f59653a);
            return;
        }
        if (hs8Var.equals(hr8.f42842a)) {
            c2775b.m9699b(wo8.f67127a);
            return;
        }
        if (hs8Var instanceof or8) {
            or8 or8Var = (or8) hs8Var;
            c2775b.m9699b(new ip8(or8Var.f54788a.f64223a.f19426a, or8Var.f54789b));
            return;
        }
        if (hs8Var instanceof lr8) {
            m9707X2(((lr8) hs8Var).f50046a, false);
            return;
        }
        if (hs8Var instanceof pr8) {
            m9707X2(((pr8) hs8Var).f56729a, true);
            return;
        }
        if (hs8Var instanceof nr8) {
            uq8 uq8Var = ((nr8) hs8Var).f53172a;
            LibraryItem libraryItem = uq8Var.f64223a;
            int i = libraryItem.f19426a;
            int i2 = libraryItem.f19423X;
            String str = libraryItem.f19412M;
            LibraryItemCounter libraryItemCounter = uq8Var.f64224b;
            c2775b.m9699b(new ap8(i, i2, str, (libraryItemCounter == null || libraryItemCounter.f19460f || i2 <= 0) ? false : true));
            return;
        }
        if (hs8Var instanceof mr8) {
            String str2 = ((mr8) hs8Var).f51770a.f64223a.f19447s;
            if (str2 != null) {
                c2775b.m9699b(new po8(str2));
                return;
            }
            return;
        }
        if (hs8Var instanceof ir8) {
            c2775b.m9699b(new hp8(((ir8) hs8Var).f44461a.f56682a.f19426a));
            return;
        }
        if (hs8Var instanceof fr8) {
            LibraryItem libraryItem2 = ((fr8) hs8Var).f39533a.f56682a;
            int i3 = libraryItem2.f19426a;
            String str3 = libraryItem2.f19433e;
            if (str3 == null) {
                str3 = "";
            }
            c2775b.m9699b(new oo8(i3, str3));
            return;
        }
        if (hs8Var instanceof gs8) {
            c2775b.m9699b(new dp8(((gs8) hs8Var).f41268a));
        } else if (hs8Var instanceof fs8) {
            c2775b.m9699b(new cp8(((fs8) hs8Var).f39593a));
        } else {
            gm5.m12750e();
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f33094b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9707X2(uq8 uq8Var, boolean z) {
        C3244l c3244l;
        Object value;
        LibraryItem libraryItem = uq8Var.f64223a;
        LibraryItemCounter libraryItemCounter = uq8Var.f64224b;
        boolean z2 = false;
        boolean z3 = (libraryItemCounter == null || libraryItemCounter.f19460f || libraryItem.f19423X <= 0) ? false : true;
        if (libraryItemCounter != null && libraryItemCounter.f19460f) {
            z2 = true;
        }
        gp8 gp8Var = new gp8(libraryItem.f19426a, !z2, libraryItem.f19423X, libraryItem.f19412M, z3, z);
        if (!z2) {
            this.f33106n.m9699b(gp8Var);
            return;
        }
        do {
            c3244l = this.f33114v;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, ar8.m3015a((ar8) value, null, null, null, null, null, null, null, false, false, false, false, 0, null, null, null, gp8Var, 32767)));
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9708Y2(boolean z) {
        String strM17738m;
        LibrarySearchQuery librarySearchQueryM9684a;
        String str;
        C2779e c2779e = this;
        C3244l c3244l = c2779e.f33114v;
        ar8 ar8Var = (ar8) c3244l.getValue();
        String strMo4589b2 = c2779e.f33094b.mo4589b2();
        String str2 = ar8Var.f7402n;
        LibraryTab libraryTab = ar8Var.f7401m;
        String strM9710a3 = c2779e.m9710a3(strMo4589b2);
        Pair pair = ar8Var.f7403o;
        C2770a c2770a = c2779e.f33107o;
        c2770a.getClass();
        c2770a.m9690g(strM9710a3, new cg7(pair, 15));
        LibrarySearchQuery librarySearchQueryM9684a2 = c2770a.m9684a(strM9710a3);
        int length = str2.length();
        LibraryShelf libraryShelf = c2779e.f33113u;
        if (length <= 0 && (fa4.m11650l(libraryShelf.f19496d, LibraryShelfType.Search.getValue()) || fa4.m11650l(libraryShelf.f19496d, LibraryShelfType.SourceSearch.getValue()))) {
            return;
        }
        if (libraryTab != null) {
            String str3 = libraryShelf.f19496d;
            str3.getClass();
            String str4 = libraryTab.f19502b;
            int i = libraryTab.f19503c;
            String strM18252f = AbstractC3423or.m18252f(libraryTab);
            String strM18216A = AbstractC3423or.m18216A(libraryTab);
            String strM18286z = AbstractC3423or.m18286z(libraryTab);
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append("_type=");
            sb.append(str4);
            sb.append("_level=");
            sb.append(i);
            AbstractC3393o1.m17725C(sb, "accent=", strM18252f, "isPersonal=", strM18216A);
            strM17738m = AbstractC3393o1.m17738m(sb, "isPending=", strM18286z);
        } else {
            strM17738m = "";
        }
        if (ar8Var.f7389a.isEmpty() || z) {
            while (true) {
                Object value = c3244l.getValue();
                EmptyList emptyList = EmptyList.f47638a;
                if (c3244l.m15570h(value, ar8.m3015a((ar8) value, emptyList, emptyList, emptyList, emptyList, null, null, null, true, true, false, true, 1, null, null, null, null, 61552))) {
                    break;
                } else {
                    c2779e = this;
                }
            }
        }
        String strM4839V = strM17738m + "searchlevel=" + (libraryTab != null ? Integer.valueOf(libraryTab.f19503c) : null);
        if (fa4.m11650l(libraryTab != null ? libraryTab.f19502b : null, LibraryContentType.Courses.getValue())) {
            strM4839V = cl9.m4839V(strM4839V, "_type=lessons_", "_type=courses_");
        } else {
            if (fa4.m11650l(libraryTab != null ? libraryTab.f19502b : null, LibraryContentType.Lessons.getValue())) {
                strM4839V = cl9.m4839V(strM4839V, "_type=courses_", "_type=lessons_");
            }
        }
        String str5 = strM4839V;
        if (fa4.m11650l(libraryShelf.f19496d, LibraryShelfType.Guided.getValue())) {
            c2770a.m9690g(strM9710a3, new mv0(libraryTab != null ? libraryTab.f19503c - 1 : LearningLevel.Beginner1.ordinal(), 20));
            librarySearchQueryM9684a = c2770a.m9684a(strM9710a3);
        } else {
            librarySearchQueryM9684a = librarySearchQueryM9684a2;
        }
        int i2 = 2;
        if (fa4.m11650l(libraryShelf.f19496d, LibraryShelfType.MyLessons.getValue())) {
            c2770a.m9690g(strM9710a3, new cz1(i2, (libraryTab == null || (str = libraryTab.f19506f) == null || !vk9.m23380c0(str, "isPending=true", false)) ? false : true));
            librarySearchQueryM9684a = c2770a.m9684a(strM9710a3);
        }
        LibrarySearchQuery librarySearchQuery = librarySearchQueryM9684a;
        while (true) {
            Object value2 = c3244l.getValue();
            if (c3244l.m15570h(value2, ar8.m3015a((ar8) value2, null, null, null, null, null, null, null, false, true, false, false, 0, null, null, null, null, 65279))) {
                long jIncrementAndGet = c2779e.f33116x.incrementAndGet();
                Long lValueOf = Long.valueOf(jIncrementAndGet);
                C3244l c3244l2 = c2779e.f33117y;
                c3244l2.getClass();
                c3244l2.m15572j(null, lValueOf);
                int i3 = ((ar8) c3244l.getValue()).f7400l;
                c23 c23Var = c2779e.f33099g;
                c23Var.getClass();
                strMo4589b2.getClass();
                C2779e c2779e2 = c2779e;
                m83 m83Var = new m83(new m83(((C1296l) c23Var.f9349a).m7319n(strMo4589b2, i3 * 20, str5, str2), new SearchViewModel$observeLibraryItems$1(c2779e, null)), new SearchViewModel$observeLibraryItems$2(jIncrementAndGet, c2779e2, i3, null), 2);
                g41 g41VarM16103C = lda.m16103C(c2779e2);
                nn1 nn1Var = c2779e2.f33108p;
                AbstractC1263a.m7049d(m83Var, g41VarM16103C, "libraryItems", nn1Var);
                wfb.m23926u(lda.m16103C(c2779e2), nn1Var, null, new SearchViewModel$fetchLibraryItemsNetwork$1(c2779e2, strMo4589b2, str5, str2, libraryShelf.f19496d, strM9710a3, librarySearchQuery, ((ar8) c3244l.getValue()).f7400l, jIncrementAndGet, null), 2);
                return;
            }
            c2779e = this;
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m9709Z2() {
        cma cmaVar = this.f33094b;
        this.f33107o.m9688e(m9710a3(cmaVar.mo4589b2()), cmaVar.mo4589b2(), m9705V2());
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f33094b.mo4588a0();
    }

    /* JADX INFO: renamed from: a3 */
    public final String m9710a3(String str) {
        return AbstractC3423or.m18243a0(this.f33113u, ((ar8) this.f33114v.getValue()).f7401m, str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f33094b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f33094b.mo4590d0();
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: f0 */
    public final void mo8951f0(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f33095c.mo8951f0(str, i, str2, str3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f33094b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: m */
    public final Object mo8953m(String str, int i, String str2, String str3, Continuation continuation) {
        return this.f33095c.mo8953m(str, i, str2, str3, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f33094b.mo4592m0();
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: p */
    public final void mo8954p(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f33095c.mo8954p(str, i, str2, str3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f33094b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f33094b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f33094b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f33094b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f33094b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f33094b.mo4598w2();
    }
}
