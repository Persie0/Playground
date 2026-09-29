package com.lingq.core.premium.delegate;

import com.android.billingclient.api.Purchase;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.offers.C1516b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.c18;
import p000.c83;
import p000.cl9;
import p000.cma;
import p000.do7;
import p000.du0;
import p000.e4b;
import p000.eh9;
import p000.fa4;
import p000.h0a;
import p000.hm5;
import p000.i59;
import p000.iy5;
import p000.km7;
import p000.m83;
import p000.nm7;
import p000.ob1;
import p000.ol7;
import p000.ow8;
import p000.pha;
import p000.pl7;
import p000.ql7;
import p000.rm5;
import p000.sm5;
import p000.u91;
import p000.un1;
import p000.ux5;
import p000.v18;
import p000.vk9;
import p000.wfb;
import p000.wq1;

/* JADX INFO: renamed from: com.lingq.core.premium.delegate.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1845b implements pha, cma {

    /* JADX INFO: renamed from: A */
    public final c18 f22461A;

    /* JADX INFO: renamed from: B */
    public final C3244l f22462B;

    /* JADX INFO: renamed from: C */
    public final c18 f22463C;

    /* JADX INFO: renamed from: D */
    public final C3244l f22464D;

    /* JADX INFO: renamed from: E */
    public final c18 f22465E;

    /* JADX INFO: renamed from: F */
    public final C3211a f22466F;

    /* JADX INFO: renamed from: G */
    public final du0 f22467G;

    /* JADX INFO: renamed from: H */
    public final C3211a f22468H;

    /* JADX INFO: renamed from: I */
    public final du0 f22469I;

    /* JADX INFO: renamed from: J */
    public final C3244l f22470J;

    /* JADX INFO: renamed from: K */
    public final c18 f22471K;

    /* JADX INFO: renamed from: L */
    public final C3244l f22472L;

    /* JADX INFO: renamed from: M */
    public final C3244l f22473M;

    /* JADX INFO: renamed from: N */
    public final C3244l f22474N;

    /* JADX INFO: renamed from: O */
    public final c18 f22475O;

    /* JADX INFO: renamed from: a */
    public final un1 f22476a;

    /* JADX INFO: renamed from: b */
    public final km7 f22477b;

    /* JADX INFO: renamed from: c */
    public final hm5 f22478c;

    /* JADX INFO: renamed from: d */
    public final cma f22479d;

    /* JADX INFO: renamed from: e */
    public final e4b f22480e;

    /* JADX INFO: renamed from: f */
    public final String f22481f;

    /* JADX INFO: renamed from: g */
    public final String f22482g;

    /* JADX INFO: renamed from: h */
    public final String f22483h;

    /* JADX INFO: renamed from: i */
    public final String f22484i;

    /* JADX INFO: renamed from: j */
    public final String f22485j;

    /* JADX INFO: renamed from: k */
    public final C3244l f22486k;

    /* JADX INFO: renamed from: l */
    public String f22487l;

    /* JADX INFO: renamed from: m */
    public final C3244l f22488m;

    /* JADX INFO: renamed from: n */
    public final c18 f22489n;

    /* JADX INFO: renamed from: o */
    public final C3244l f22490o;

    /* JADX INFO: renamed from: p */
    public final c18 f22491p;

    /* JADX INFO: renamed from: q */
    public final C3244l f22492q;

    /* JADX INFO: renamed from: r */
    public final c18 f22493r;

    /* JADX INFO: renamed from: s */
    public final C3244l f22494s;

    /* JADX INFO: renamed from: t */
    public final C3244l f22495t;

    /* JADX INFO: renamed from: u */
    public final c18 f22496u;

    /* JADX INFO: renamed from: v */
    public final C3244l f22497v;

    /* JADX INFO: renamed from: w */
    public final c18 f22498w;

    /* JADX INFO: renamed from: x */
    public final C3244l f22499x;

    /* JADX INFO: renamed from: y */
    public final c18 f22500y;

    /* JADX INFO: renamed from: z */
    public final C3244l f22501z;

    public C1845b(un1 un1Var, km7 km7Var, nm7 nm7Var, hm5 hm5Var, ob1 ob1Var, cma cmaVar, e4b e4bVar, C1516b c1516b) {
        un1Var.getClass();
        km7Var.getClass();
        nm7Var.getClass();
        hm5Var.getClass();
        ob1Var.getClass();
        cmaVar.getClass();
        e4bVar.getClass();
        this.f22476a = un1Var;
        this.f22477b = km7Var;
        this.f22478c = hm5Var;
        this.f22479d = cmaVar;
        this.f22480e = e4bVar;
        this.f22481f = ob1Var.m17896j() ? PremiumPackages.PremiumMonth.getValue() : AbstractC3393o1.m17735j(PremiumPackages.PremiumMonth.getValue(), "_", ob1Var.m17892f("language_code"));
        this.f22482g = ob1Var.m17896j() ? PremiumPackages.PremiumSixMonths.getValue() : AbstractC3393o1.m17735j(PremiumPackages.PremiumSixMonths.getValue(), "_", ob1Var.m17892f("language_code"));
        this.f22483h = ob1Var.m17896j() ? PremiumPackages.PremiumOneYear.getValue() : AbstractC3393o1.m17735j(PremiumPackages.PremiumOneYear.getValue(), "_", ob1Var.m17892f("language_code"));
        this.f22484i = ob1Var.m17896j() ? PremiumPackages.PremiumMonthPlus.getValue() : AbstractC3393o1.m17735j(PremiumPackages.PremiumMonthPlus.getValue(), "_", ob1Var.m17892f("language_code"));
        this.f22485j = ob1Var.m17896j() ? PremiumPackages.PremiumOneYearPlus.getValue() : AbstractC3393o1.m17735j(PremiumPackages.PremiumOneYearPlus.getValue(), "_", ob1Var.m17892f("language_code"));
        this.f22486k = AbstractC3352my.m17114d("");
        this.f22487l = "";
        C3244l c3244lM17114d = AbstractC3352my.m17114d("");
        this.f22488m = c3244lM17114d;
        iy5 iy5Var = i59.f43549a;
        this.f22489n = AbstractC3224d.m15520B(c3244lM17114d, un1Var, iy5Var, "");
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f22490o = c3244lM17114d2;
        this.f22491p = AbstractC3224d.m15520B(c3244lM17114d2, un1Var, iy5Var, emptyList);
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool);
        this.f22492q = c3244lM17114d3;
        this.f22493r = AbstractC3224d.m15520B(c3244lM17114d3, un1Var, iy5Var, bool);
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(bool);
        this.f22494s = c3244lM17114d4;
        AbstractC3224d.m15520B(c3244lM17114d4, un1Var, iy5Var, bool);
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(null);
        this.f22495t = c3244lM17114d5;
        this.f22496u = AbstractC3224d.m15520B(c3244lM17114d5, un1Var, iy5Var, null);
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(bool);
        this.f22497v = c3244lM17114d6;
        this.f22498w = AbstractC3224d.m15520B(c3244lM17114d6, un1Var, iy5Var, bool);
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(null);
        this.f22499x = c3244lM17114d7;
        this.f22500y = AbstractC3224d.m15520B(c3244lM17114d7, un1Var, iy5Var, null);
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(null);
        this.f22501z = c3244lM17114d8;
        this.f22461A = AbstractC3224d.m15520B(c3244lM17114d8, un1Var, iy5Var, null);
        C3244l c3244lM17114d9 = AbstractC3352my.m17114d(bool);
        this.f22462B = c3244lM17114d9;
        this.f22463C = AbstractC3224d.m15520B(c3244lM17114d9, un1Var, iy5Var, bool);
        C3244l c3244lM17114d10 = AbstractC3352my.m17114d(new Pair(bool, 0));
        this.f22464D = c3244lM17114d10;
        this.f22465E = AbstractC3224d.m15520B(c3244lM17114d10, un1Var, iy5Var, new Pair(bool, 0));
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f22466F = c3211aM10525a;
        this.f22467G = AbstractC3224d.m15519A(c3211aM10525a);
        C3211a c3211aM10525a2 = do7.m10525a(-1, 6, null);
        this.f22468H = c3211aM10525a2;
        this.f22469I = AbstractC3224d.m15519A(c3211aM10525a2);
        C3244l c3244lM17114d11 = AbstractC3352my.m17114d(bool);
        this.f22470J = c3244lM17114d11;
        this.f22471K = AbstractC3224d.m15520B(c3244lM17114d11, un1Var, iy5Var, bool);
        this.f22472L = AbstractC3352my.m17114d(Boolean.TRUE);
        C3244l c3244lM17114d12 = AbstractC3352my.m17114d(null);
        this.f22473M = c3244lM17114d12;
        UpgradeTier upgradeTier = UpgradeTier.FREE;
        C3244l c3244lM17114d13 = AbstractC3352my.m17114d(upgradeTier);
        this.f22474N = c3244lM17114d13;
        this.f22475O = AbstractC3224d.m15520B(c3244lM17114d13, un1Var, iy5Var, upgradeTier);
        c18 c18VarM15520B = AbstractC3224d.m15520B(c1516b.m8193b(null), un1Var, iy5Var, null);
        AbstractC3224d.m15545x(new C3228h(c3244lM17114d2, c18VarM15520B, new UpgradeDelegateImpl$1(this, null)), un1Var);
        AbstractC3224d.m15545x(new m83(new C3228h(cmaVar.mo4583O1(), c3244lM17114d12, new UpgradeDelegateImpl$2(this, null)), new UpgradeDelegateImpl$3(this, null), 2), un1Var);
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15530i(c3244lM17114d2, c3244lM17114d3, c3244lM17114d4, ((C1369b) nm7Var).f18483p, c18VarM15520B, new UpgradeDelegateImpl$4(this, null)), new UpgradeDelegateImpl$5(this, null), 2), un1Var);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8579a(String str, List list) {
        Object obj;
        Object next;
        Object next2;
        pl7 pl7Var;
        Object next3;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ArrayList arrayList = ((ql7) next).f57911h;
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                } while (!((pl7) next3).m19388c().contains(str));
                pl7Var = (pl7) next3;
            } else {
                pl7Var = null;
            }
        } while (pl7Var == null);
        ql7 ql7Var = (ql7) next;
        ArrayList arrayList2 = ql7Var != null ? ql7Var.f57911h : null;
        if (arrayList2 != null) {
            for (Object obj2 : arrayList2) {
                ArrayList arrayListM21126a = ((pl7) obj2).m19389d().m21126a();
                arrayListM21126a.getClass();
                Iterator it3 = arrayListM21126a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    ol7 ol7Var = (ol7) next2;
                    if (fa4.m11650l(ol7Var.m18102a(), "P1W") && ol7Var.m18103b() == 0) {
                        break;
                    }
                }
                if (next2 != null) {
                    obj = obj2;
                    break;
                }
            }
            obj = (pl7) obj;
        }
        return obj != null;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f22479d.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f22479d.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f22479d.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f22479d.mo4574C1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: D */
    public final void mo8549D(String str) {
        C3244l c3244l = this.f22486k;
        c3244l.getClass();
        c3244l.m15572j(null, str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f22479d.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f22479d.mo4576F1(str, continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: F2 */
    public final boolean mo8550F2(String str) {
        if (str == null || vk9.m23391n0(str)) {
            boolean zBooleanValue = ((Boolean) this.f22470J.getValue()).booleanValue();
            sm5.Companion.getClass();
            h0a.f41641a.mo11430a("[Offers] goToFreeTrial(no code) → " + zBooleanValue + " canAccessFreeTrial=" + zBooleanValue, new Object[0]);
            return zBooleanValue;
        }
        String strConcat = cl9.m4842Y(str, "lq-", false) ? str : "lq-".concat(str);
        boolean zBooleanValue2 = ((Boolean) this.f22472L.getValue()).booleanValue();
        String strConcat2 = strConcat.equals("lq-basetrial") ? "lq-basetrial" : strConcat.concat("-tr");
        boolean zM8579a = m8579a(strConcat2, (List) this.f22490o.getValue());
        boolean z = zBooleanValue2 && zM8579a;
        rm5 rm5Var = sm5.Companion;
        StringBuilder sbM23000w = ux5.m23000w("[Offers] goToFreeTrial(code=", str, " → tag=", strConcat2, ") → ");
        wq1.m24101A(sbM23000w, z, " neverJoined=", zBooleanValue2, " hasGooglePlayTrial=");
        sbM23000w.append(zM8579a);
        String string = sbM23000w.toString();
        rm5Var.getClass();
        h0a.f41641a.mo11430a(string, new Object[0]);
        return z;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f22479d.mo4577H();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H1 */
    public final String mo8551H1() {
        return this.f22481f;
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H2 */
    public final void mo8552H2(String str, String str2) {
        Object next;
        C3244l c3244l;
        Object value;
        C3244l c3244l2;
        Object value2;
        str.getClass();
        str2.getClass();
        List list = (List) this.f22490o.getValue();
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fa4.m11650l(((ql7) next).f57906c, str));
        ql7 ql7Var = (ql7) next;
        if (ql7Var != null) {
            do {
                c3244l = this.f22488m;
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, str2));
            do {
                c3244l2 = this.f22495t;
                value2 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value2, new Triple(ql7Var, this.f22487l, str2)));
        }
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I */
    public final void mo8553I() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f22501z;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, null));
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I1 */
    public final eh9 mo8554I1() {
        return this.f22493r;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f22479d.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f22479d.mo4579K(continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K0 */
    public final String mo8555K0() {
        return this.f22483h;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f22479d.mo4580K1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K2 */
    public final c83 mo8556K2() {
        return this.f22465E;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f22479d.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f22479d.mo4582N();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: N1 */
    public final c83 mo8557N1() {
        return this.f22467G;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f22479d.mo4583O1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: O2 */
    public final void mo8558O2() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f22495t;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, null));
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: P2 */
    public final eh9 mo8559P2() {
        return this.f22491p;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f22479d.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f22479d.mo4585R();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: R0 */
    public final void mo8560R0(String str) {
        this.f22487l = str;
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: S0 */
    public final String mo8561S0() {
        return this.f22484i;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f22479d.mo4586T0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: V0 */
    public final eh9 mo8562V0() {
        return this.f22475O;
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: W1 */
    public final c83 mo8564W1() {
        return this.f22471K;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f22479d.mo4587X();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: Y */
    public final c83 mo8565Y() {
        return this.f22469I;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f22479d.mo4588a0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: b1 */
    public final eh9 mo8566b1() {
        return this.f22463C;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f22479d.mo4589b2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: c0 */
    public final void mo8567c0(Purchase purchase) {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f22473M;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, purchase));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f22479d.mo4590d0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: f1 */
    public final String mo8568f1() {
        return this.f22482g;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f22479d.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: i2 */
    public final void mo8569i2(int i) {
        wfb.m23926u(this.f22476a, null, null, new UpgradeDelegateImpl$offer$1(this, i, null), 3);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: k1 */
    public final void mo8570k1(List list) {
        list.getClass();
        rm5 rm5Var = sm5.Companion;
        String str = "[Offers] setProductDetails " + list.size() + " products from Google Play:";
        rm5Var.getClass();
        h0a.f41641a.mo11430a(str, new Object[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ql7 ql7Var = (ql7) it.next();
            List<pl7> list2 = ql7Var.f57911h;
            if (list2 == null) {
                list2 = EmptyList.f47638a;
            }
            rm5 rm5Var2 = sm5.Companion;
            String str2 = "[Offers]  product=" + ql7Var.f57906c + " offers=" + list2.size();
            rm5Var2.getClass();
            h0a.f41641a.mo11430a(str2, new Object[0]);
            for (pl7 pl7Var : list2) {
                ArrayList arrayListM21126a = pl7Var.m19389d().m21126a();
                arrayListM21126a.getClass();
                String strM22596N0 = u91.m22596N0(arrayListM21126a, null, null, null, new ow8(15), 31);
                rm5 rm5Var3 = sm5.Companion;
                String strM19386a = pl7Var.m19386a();
                String strM19387b = pl7Var.m19387b();
                ArrayList arrayListM19388c = pl7Var.m19388c();
                StringBuilder sbM23000w = ux5.m23000w("[Offers]    basePlanId=", strM19386a, " offerId=", strM19387b, " tags=");
                sbM23000w.append(arrayListM19388c);
                sbM23000w.append(" phases=[");
                sbM23000w.append(strM22596N0);
                sbM23000w.append("]");
                String string = sbM23000w.toString();
                rm5Var3.getClass();
                h0a.f41641a.mo11430a(string, new Object[0]);
            }
        }
        C3244l c3244l = this.f22490o;
        c3244l.getClass();
        c3244l.m15572j(null, list);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l */
    public final eh9 mo8571l() {
        return this.f22461A;
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l1 */
    public final eh9 mo8572l1() {
        return this.f22489n;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f22479d.mo4592m0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o */
    public final void mo8573o(Purchase purchase, v18 v18Var) {
        wfb.m23926u(this.f22476a, null, null, new UpgradeDelegateImpl$upgrade$1(this, v18Var, purchase, null), 3);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o0 */
    public final String mo8574o0() {
        return this.f22485j;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f22479d.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f22479d.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f22479d.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f22479d.mo4596t();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: v */
    public final eh9 mo8575v() {
        return this.f22500y;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f22479d.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f22479d.mo4598w2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: x2 */
    public final eh9 mo8576x2() {
        return this.f22498w;
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: y2 */
    public final eh9 mo8577y2() {
        return this.f22496u;
    }
}
