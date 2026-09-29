package com.lingq.feature.library;

import android.graphics.Rect;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.analytics.embedded.EmbeddedMessageButton;
import com.lingq.core.common.network.C1262a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.library.C1386a;
import com.lingq.core.domain.library.C1387b;
import com.lingq.core.domain.library.C1389d;
import com.lingq.core.domain.library.C1392g;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.library.domain.C2144a;
import com.lingq.feature.library.domain.C2145b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC3352my;
import p000.AbstractC3423or;
import p000.C3088hu;
import p000.C3123iu;
import p000.C3160ju;
import p000.C3309ls;
import p000.C3436ou;
import p000.C3540rl;
import p000.InterfaceC3274ku;
import p000.bia;
import p000.bl2;
import p000.c18;
import p000.c7a;
import p000.c83;
import p000.cma;
import p000.e7a;
import p000.eb5;
import p000.eh9;
import p000.em6;
import p000.f23;
import p000.f95;
import p000.fa4;
import p000.fb4;
import p000.g41;
import p000.h24;
import p000.h68;
import p000.hf6;
import p000.hm5;
import p000.ja5;
import p000.je2;
import p000.l83;
import p000.lda;
import p000.m58;
import p000.m68;
import p000.m83;
import p000.n58;
import p000.n83;
import p000.nl8;
import p000.nn1;
import p000.ob1;
import p000.oo4;
import p000.op7;
import p000.p68;
import p000.ph2;
import p000.qn6;
import p000.qn7;
import p000.r32;
import p000.rb4;
import p000.sq5;
import p000.t62;
import p000.u91;
import p000.ui3;
import p000.v72;
import p000.v91;
import p000.w41;
import p000.wfb;
import p000.wta;
import p000.x16;
import p000.x24;
import p000.x58;
import p000.xi9;
import p000.y58;
import p000.y5a;
import p000.z25;

/* JADX INFO: renamed from: com.lingq.feature.library.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2146e extends wta implements cma, e7a, qn6, m68, qn7, bia, r32 {

    /* JADX INFO: renamed from: A */
    public final sq5 f26652A;

    /* JADX INFO: renamed from: B */
    public final m58 f26653B;

    /* JADX INFO: renamed from: C */
    public final oo4 f26654C;

    /* JADX INFO: renamed from: D */
    public final nn1 f26655D;

    /* JADX INFO: renamed from: E */
    public final e7a f26656E;

    /* JADX INFO: renamed from: F */
    public final ob1 f26657F;

    /* JADX INFO: renamed from: G */
    public final C3244l f26658G;

    /* JADX INFO: renamed from: H */
    public final c18 f26659H;

    /* JADX INFO: renamed from: I */
    public final C3244l f26660I;

    /* JADX INFO: renamed from: J */
    public final C3244l f26661J;

    /* JADX INFO: renamed from: K */
    public final C3244l f26662K;

    /* JADX INFO: renamed from: L */
    public final C3244l f26663L;

    /* JADX INFO: renamed from: M */
    public final C3244l f26664M;

    /* JADX INFO: renamed from: N */
    public final C3244l f26665N;

    /* JADX INFO: renamed from: O */
    public final C3244l f26666O;

    /* JADX INFO: renamed from: P */
    public final C3244l f26667P;

    /* JADX INFO: renamed from: Q */
    public final C3244l f26668Q;

    /* JADX INFO: renamed from: R */
    public final C3244l f26669R;

    /* JADX INFO: renamed from: S */
    public final C3244l f26670S;

    /* JADX INFO: renamed from: T */
    public final C3244l f26671T;

    /* JADX INFO: renamed from: U */
    public final C3244l f26672U;

    /* JADX INFO: renamed from: V */
    public final C3244l f26673V;

    /* JADX INFO: renamed from: W */
    public final c83 f26674W;

    /* JADX INFO: renamed from: X */
    public final c18 f26675X;

    /* JADX INFO: renamed from: Y */
    public h68 f26676Y;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f26677b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qn6 f26678c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ m68 f26679d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qn7 f26680e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ bia f26681f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ r32 f26682g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ bl2 f26683h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ bl2 f26684i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ w41 f26685j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2145b f26686k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C3309ls f26687l;

    /* JADX INFO: renamed from: m */
    public final C1389d f26688m;

    /* JADX INFO: renamed from: n */
    public final C1389d f26689n;

    /* JADX INFO: renamed from: o */
    public final f23 f26690o;

    /* JADX INFO: renamed from: p */
    public final f23 f26691p;

    /* JADX INFO: renamed from: q */
    public final C1387b f26692q;

    /* JADX INFO: renamed from: r */
    public final C1392g f26693r;

    /* JADX INFO: renamed from: s */
    public final C1387b f26694s;

    /* JADX INFO: renamed from: t */
    public final C1386a f26695t;

    /* JADX INFO: renamed from: u */
    public final C1386a f26696u;

    /* JADX INFO: renamed from: v */
    public final C1386a f26697v;

    /* JADX INFO: renamed from: w */
    public final m58 f26698w;

    /* JADX INFO: renamed from: x */
    public final C2144a f26699x;

    /* JADX INFO: renamed from: y */
    public final m58 f26700y;

    /* JADX INFO: renamed from: z */
    public final m58 f26701z;

    public C2146e(C1389d c1389d, C1389d c1389d2, f23 f23Var, f23 f23Var2, C1387b c1387b, C1392g c1392g, C1387b c1387b2, x24 x24Var, C1386a c1386a, C1386a c1386a2, C1386a c1386a3, n58 n58Var, m58 m58Var, C2144a c2144a, m58 m58Var2, m58 m58Var3, sq5 sq5Var, m58 m58Var4, oo4 oo4Var, nn1 nn1Var, C1262a c1262a, cma cmaVar, m68 m68Var, e7a e7aVar, ob1 ob1Var, qn6 qn6Var, qn7 qn7Var, bia biaVar, r32 r32Var, bl2 bl2Var, bl2 bl2Var2, w41 w41Var, C2145b c2145b, C3309ls c3309ls, nl8 nl8Var) {
        oo4Var.getClass();
        cmaVar.getClass();
        m68Var.getClass();
        e7aVar.getClass();
        ob1Var.getClass();
        qn6Var.getClass();
        qn7Var.getClass();
        biaVar.getClass();
        r32Var.getClass();
        nl8Var.getClass();
        this.f26677b = cmaVar;
        this.f26678c = qn6Var;
        this.f26679d = m68Var;
        this.f26680e = qn7Var;
        this.f26681f = biaVar;
        this.f26682g = r32Var;
        this.f26683h = bl2Var;
        this.f26684i = bl2Var2;
        this.f26685j = w41Var;
        this.f26686k = c2145b;
        this.f26687l = c3309ls;
        this.f26688m = c1389d;
        this.f26689n = c1389d2;
        this.f26690o = f23Var;
        this.f26691p = f23Var2;
        this.f26692q = c1387b;
        this.f26693r = c1392g;
        this.f26694s = c1387b2;
        this.f26695t = c1386a;
        this.f26696u = c1386a2;
        this.f26697v = c1386a3;
        this.f26698w = m58Var;
        this.f26699x = c2144a;
        this.f26700y = m58Var2;
        this.f26701z = m58Var3;
        this.f26652A = sq5Var;
        this.f26653B = m58Var4;
        this.f26654C = oo4Var;
        this.f26655D = nn1Var;
        this.f26656E = e7aVar;
        this.f26657F = ob1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new ja5(null, null, 2047));
        this.f26658G = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f26659H = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, new ja5(null, null, 2047));
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f26660I = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f26661J = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(new f95(0, 0, 0, 0, null, 0, true, 191));
        this.f26662K = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(null);
        this.f26663L = c3244lM17114d5;
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(null);
        this.f26664M = c3244lM17114d6;
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(new Pair(emptyList, emptyList));
        this.f26665N = c3244lM17114d7;
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(emptyList);
        this.f26666O = c3244lM17114d8;
        C3244l c3244lM17114d9 = AbstractC3352my.m17114d(Boolean.TRUE);
        this.f26667P = c3244lM17114d9;
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d10 = AbstractC3352my.m17114d(bool);
        this.f26668Q = c3244lM17114d10;
        C3244l c3244lM17114d11 = AbstractC3352my.m17114d(bool);
        this.f26669R = c3244lM17114d11;
        C3244l c3244lM17114d12 = AbstractC3352my.m17114d("");
        this.f26670S = c3244lM17114d12;
        this.f26671T = AbstractC3352my.m17114d(emptyList);
        C3244l c3244lM17114d13 = AbstractC3352my.m17114d(null);
        this.f26672U = c3244lM17114d13;
        this.f26673V = AbstractC3352my.m17114d(bool);
        this.f26674W = AbstractC3224d.m15536o(new C3540rl(cmaVar.mo4574C1(), 6));
        this.f26675X = AbstractC3224d.m15520B(AbstractC3224d.m15521C(AbstractC3224d.m15536o(new eb5(new C3540rl(cmaVar.mo4572B0(), 5), 0)), new LibraryUpdateViewModel$special$$inlined$flatMapLatest$1(this, null)), lda.m16103C(this), c3243k, EmptySet.f47640a);
        AbstractC1263a.m7050e(AbstractC3224d.m15546y(AbstractC3224d.m15536o(new C3540rl(cmaVar.mo4572B0(), 5)), new LibraryUpdateViewModel$1(this, null)), lda.m16103C(this), "language");
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15535n(new C3540rl(c3244lM17114d13, 5), 500L), new LibraryUpdateViewModel$2(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(c1262a.f14392b, new LibraryUpdateViewModel$3(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83((c83) bl2Var.f8656b, new LibraryUpdateViewModel$4(this, null), 2), lda.m16103C(this));
        wfb.m23926u(lda.m16103C(this), null, null, new LibraryUpdateViewModel$5(this, null), 3);
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LibraryUpdateViewModel$special$$inlined$flatMapLatest$2(this, null)), new LibraryUpdateViewModel$7(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83((c18) w41Var.f66368d, new LibraryUpdateViewModel$8(this, null), 2), lda.m16103C(this));
        AbstractC1263a.m7050e(new m83(new n83(5, new c83[]{new C3540rl(cmaVar.mo4572B0(), 5), c3244lM17114d3, c3244lM17114d4, c3244lM17114d5, c3244lM17114d7, c3244lM17114d8, c3244lM17114d9, c3244lM17114d10, c3244lM17114d11, c3244lM17114d12, c3244lM17114d2, AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new LibraryUpdateViewModel$9(2, null))), c3244lM17114d6}, this), new LibraryUpdateViewModel$11(this, null), 2), lda.m16103C(this), "library ui state");
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f26677b.mo4571A();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: A0 */
    public final void mo8733A0(boolean z) {
        this.f26656E.mo8733A0(z);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: A1 */
    public final void mo7001A1(InAppNotificationAction inAppNotificationAction) {
        inAppNotificationAction.getClass();
        this.f26678c.mo7001A1(inAppNotificationAction);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f26677b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f26677b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f26677b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f26677b.mo4575D0(continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: D1 */
    public final c83 mo8736D1() {
        return this.f26656E.mo8736D1();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: E2 */
    public final void mo8240E2() {
        this.f26682g.mo8240E2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f26677b.mo4576F1(str, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: G */
    public final void mo8740G(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f26656E.mo8740G(tooltipStep);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: G0 */
    public final void mo8241G0() {
        this.f26682g.mo8241G0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f26677b.mo4577H();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: H0 */
    public final Object mo7002H0(int i, Continuation continuation) {
        return this.f26678c.mo7002H0(i, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f26677b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f26677b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f26677b.mo4580K1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: L */
    public final void mo8742L(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f26656E.mo8742L(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f26677b.mo4581L0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f26681f.mo3737M1(upgradeReason);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: M2 */
    public final Object mo8242M2(hf6 hf6Var, long j, Continuation continuation) {
        return this.f26682g.mo8242M2(hf6Var, 500L, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f26677b.mo4582N();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O */
    public final Object mo7003O(Continuation continuation) {
        return this.f26678c.mo7003O(continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O0 */
    public final c83 mo7004O0() {
        return this.f26678c.mo7004O0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f26677b.mo4583O1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: P0 */
    public final boolean mo8744P0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f26656E.mo8744P0(tooltipStep);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: P1 */
    public final void mo7005P1(h24 h24Var) {
        h24Var.getClass();
        this.f26678c.mo7005P1(h24Var);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Q */
    public final void mo8745Q() {
        this.f26656E.mo8745Q();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f26677b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f26677b.mo4585R();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: R1 */
    public final void mo8243R1(hf6 hf6Var) {
        hf6Var.getClass();
        this.f26682g.mo8243R1(hf6Var);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: S1 */
    public final eh9 mo8244S1() {
        return this.f26682g.mo8244S1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f26677b.mo4586T0();
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: V */
    public final Object mo8941V(String str, int i, String str2, String str3, Continuation continuation) {
        return this.f26679d.mo8941V(str, i, str2, str3, continuation);
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9064V2() {
        C3244l c3244l;
        Object value;
        ja5 ja5Var;
        do {
            c3244l = this.f26658G;
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, null, null, null, null, null, new h68(0, 127, null, false), 255), null, null, false, false, false, 2015)));
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9065W2(Language language, List list) {
        AbstractC1263a.m7050e(new m83(this.f26688m.m8007b(language, list), new LibraryUpdateViewModel$loadLibraryStructure$1(this, (List) this.f26660I.getValue(), null), 2), lda.m16103C(this), "library structure");
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f26677b.mo4587X();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X0 */
    public final Object mo7007X0(Continuation continuation) {
        return this.f26678c.mo7007X0(continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X1 */
    public final eh9 mo7008X1() {
        return this.f26678c.mo7008X1();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9066X2(LibraryShelf libraryShelf, LibraryTab libraryTab) {
        String strM18220E = AbstractC3423or.m18220E(libraryShelf, libraryTab);
        l83 l83Var = new l83(new m83(AbstractC3224d.m15532k(this.f26689n.m8008c(libraryShelf, libraryTab, this.f26677b.mo4589b2()), this.f26674W, this.f26675X, new LibraryUpdateViewModel$loadShelfContent$1(4, null)), new LibraryUpdateViewModel$loadShelfContent$2(this, libraryShelf, libraryTab, strM18220E, null), 2), new LibraryUpdateViewModel$loadShelfContent$3(3, null), 1);
        g41 g41VarM16103C = lda.m16103C(this);
        String strConcat = "shelf_content_".concat(strM18220E);
        v72 v72Var = ph2.f56212a;
        AbstractC1263a.m7049d(l83Var, g41VarM16103C, strConcat, t62.f61909c);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9067Y2(String str) {
        AbstractC1263a.m7050e(new m83(this.f26692q.m8002b(str), new LibraryUpdateViewModel$loadStats$1(this, null), 2), lda.m16103C(this), "stats");
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f26681f.mo3738Z();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo8753Z0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f26656E.mo8753Z0(tooltipStep);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: Z1 */
    public final void mo8245Z1(hf6 hf6Var) {
        this.f26682g.mo8245Z1(hf6Var);
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m9068Z2() {
        C3244l c3244l;
        Object value;
        ja5 ja5Var;
        do {
            c3244l = this.f26658G;
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, new C3436ou(), null, null, null, null, null, null, null, null, 510), null, null, false, false, false, 2015)));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f26677b.mo4588a0();
    }

    /* JADX INFO: renamed from: a3 */
    public final void m9069a3() {
        C3244l c3244l;
        Object value;
        ja5 ja5Var;
        do {
            c3244l = this.f26658G;
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, null, null, null, null, new z25(), null, 383), null, null, false, false, false, 2015)));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f26677b.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m9070b3() {
        C3244l c3244l;
        Object value;
        ja5 ja5Var;
        do {
            c3244l = this.f26658G;
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, new em6(14), null, null, null, null, null, 503), null, null, false, false, false, 2015)));
    }

    /* JADX INFO: renamed from: c3 */
    public final void m9071c3() {
        C3244l c3244l;
        Object value;
        ja5 ja5Var;
        do {
            c3244l = this.f26658G;
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, new op7(14), null, null, null, null, null, null, 507), null, null, false, false, false, 2015)));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f26677b.mo4590d0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: d1 */
    public final void mo8759d1() {
        this.f26656E.mo8759d1();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: d2 */
    public final c83 mo7012d2() {
        return this.f26678c.mo7012d2();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m9072d3() {
        C3244l c3244l;
        Object value;
        ja5 ja5Var;
        do {
            c3244l = this.f26658G;
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, null, null, null, new x58(2), null, null, 447), null, null, false, false, false, 2015)));
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: e0 */
    public final void mo8247e0(String str, long j) {
        str.getClass();
        this.f26682g.mo8247e0(str, j);
    }

    /* JADX INFO: renamed from: e3 */
    public final void m9073e3() {
        C3244l c3244l;
        Object value;
        ja5 ja5Var;
        do {
            c3244l = this.f26658G;
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, null, null, new x16(6), null, null, null, 479), null, null, false, false, false, 2015)));
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: f0 */
    public final void mo8951f0(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f26679d.mo8951f0(str, i, str2, str3);
    }

    /* JADX INFO: renamed from: f3 */
    public final void m9074f3() {
        C3244l c3244l;
        Object value;
        ja5 ja5Var;
        do {
            c3244l = this.f26658G;
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, null, new y58(2), null, null, null, null, 495), null, null, false, false, false, 2015)));
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: g */
    public final eh9 mo8763g() {
        return this.f26656E.mo8763g();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: g1 */
    public final void mo7013g1(h24 h24Var) {
        this.f26678c.mo7013g1(h24Var);
    }

    /* JADX INFO: renamed from: g3 */
    public final void m9075g3() {
        C3244l c3244l;
        Object value;
        ja5 ja5Var;
        do {
            c3244l = this.f26658G;
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, new p68(6), null, null, null, null, null, null, null, 509), null, null, false, false, false, 2015)));
    }

    @Override // p000.qn7
    public final eh9 getState() {
        return this.f26680e.getState();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f26677b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: h1 */
    public final eh9 mo8248h1() {
        return this.f26682g.mo8248h1();
    }

    /* JADX INFO: renamed from: h3 */
    public final void m9076h3() {
        Object value;
        C3244l c3244l = this.f26658G;
        c7a c7aVar = ((ja5) c3244l.getValue()).f45342g;
        TooltipStep tooltipStep = c7aVar != null ? c7aVar.f9664a : null;
        if (tooltipStep != null) {
            this.f26656E.mo8742L(tooltipStep);
        }
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, ja5.m14361a((ja5) value, null, null, false, null, false, null, null, null, false, false, false, 1727)));
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: i0 */
    public final void mo7014i0(h24 h24Var) {
        h24Var.getClass();
        this.f26678c.mo7014i0(h24Var);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: i1 */
    public final void mo8766i1() {
        this.f26656E.mo8766i1();
    }

    /* JADX INFO: renamed from: i3 */
    public final void m9077i3(Language language) {
        wfb.m23926u(lda.m16103C(this), null, null, new LibraryUpdateViewModel$refreshProfileData$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LibraryUpdateViewModel$refreshProfileData$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LibraryUpdateViewModel$refreshProfileData$3(this, language, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LibraryUpdateViewModel$refreshProfileData$4(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LibraryUpdateViewModel$refreshProfileData$5(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LibraryUpdateViewModel$refreshProfileData$6(this, language, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LibraryUpdateViewModel$refreshProfileData$7(this, language, null), 3);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: j0 */
    public final void mo8768j0(boolean z) {
        this.f26656E.mo8768j0(z);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f26681f.mo3739j2();
    }

    /* JADX INFO: renamed from: j3 */
    public final void m9078j3(h68 h68Var) {
        C3244l c3244l;
        Object value;
        ja5 ja5Var;
        do {
            c3244l = this.f26658G;
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, null, null, null, null, null, h68Var, 255), null, null, false, false, false, 2015)));
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: k */
    public final eh9 mo8249k() {
        return this.f26682g.mo8249k();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f26681f.mo3740k2();
    }

    /* JADX INFO: renamed from: k3 */
    public final void m9079k3(EmbeddedMessage embeddedMessage, EmbeddedMessageButton embeddedMessageButton) {
        Object objM22587E0;
        embeddedMessage.getClass();
        embeddedMessageButton.getClass();
        w41 w41Var = this.f26685j;
        w41Var.getClass();
        hm5 hm5Var = (hm5) w41Var.f66365a;
        String strM7039b = embeddedMessageButton.m7039b();
        String strM7036a = embeddedMessageButton.m7038a().m7036a();
        ((C1240a) hm5Var).getClass();
        strM7039b.getClass();
        strM7036a.getClass();
        ArrayList arrayList = fb4.f38769t.m11694e().f57538b;
        ArrayList<Iterable> arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            objM22587E0 = null;
            if (!it.hasNext()) {
                break;
            }
            List list = (List) fb4.f38769t.m11694e().f57537a.get(Long.valueOf(((Number) it.next()).longValue()));
            if (list != null) {
                objM22587E0 = u91.m22587E0(list);
            }
            arrayList2.add(objM22587E0);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Iterable iterable : arrayList2) {
            if (iterable == null) {
                iterable = EmptyList.f47638a;
            }
            u91.m22630w0(iterable, arrayList3);
        }
        for (Object obj : arrayList3) {
            if (((String) ((rb4) obj).f59022a.f64166c).equals(embeddedMessage.m7035b().m7040a())) {
                objM22587E0 = obj;
                break;
            }
        }
        rb4 rb4Var = (rb4) objM22587E0;
        if (rb4Var != null) {
            fb4 fb4Var = fb4.f38769t;
            if (fb4Var.m11690a()) {
                bl2 bl2Var = fb4Var.f38780k;
                JSONObject jSONObject = new JSONObject();
                try {
                    bl2Var.m3855l(jSONObject);
                    jSONObject.put("messageId", (String) rb4Var.f59022a.f64166c);
                    jSONObject.put("buttonIdentifier", strM7039b);
                    jSONObject.put("targetUrl", strM7036a);
                    jSONObject.put("deviceInfo", bl2Var.m3828H());
                    bl2Var.m3835P("embedded-messaging/events/click", jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l3 */
    public final void m9080l3(LibraryItem libraryItem, boolean z) {
        InterfaceC3274ku c3160ju;
        String str = libraryItem.f19428b;
        int i = libraryItem.f19426a;
        if (fa4.m11650l(str, LibraryItemType.Content.getValue())) {
            c3160ju = new C3123iu(i);
        } else if (fa4.m11650l(str, LibraryItemType.Collection.getValue())) {
            c3160ju = new C3088hu(i);
        } else if (!fa4.m11650l(str, LibraryItemType.Folder.getValue())) {
            return;
        } else {
            c3160ju = new C3160ju(i);
        }
        wfb.m23926u(lda.m16103C(this), null, null, new LibraryUpdateViewModel$updateArchiveStatus$1(this, c3160ju, z, null), 3);
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: m */
    public final Object mo8953m(String str, int i, String str2, String str3, Continuation continuation) {
        return this.f26679d.mo8953m(str, i, str2, str3, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f26677b.mo4592m0();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: o2 */
    public final c83 mo7015o2() {
        return this.f26678c.mo7015o2();
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: p */
    public final void mo8954p(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f26679d.mo8954p(str, i, str2, str3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f26677b.mo4593p0();
    }

    @Override // p000.qn7
    /* JADX INFO: renamed from: p2 */
    public final Object mo8578p2(Continuation continuation) {
        return this.f26680e.mo8578p2(continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: q0 */
    public final c83 mo8771q0() {
        return this.f26656E.mo8771q0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f26681f.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f26677b.mo4594r1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: s */
    public final void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        this.f26656E.mo8775s(y5aVar, rect, rect2, z, z2, z3, ui3Var);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f26681f.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f26677b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f26677b.mo4596t();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: t0 */
    public final void mo8777t0() {
        this.f26656E.mo8777t0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: u0 */
    public final c83 mo8778u0() {
        return this.f26656E.mo8778u0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: w */
    public final c83 mo8780w() {
        return this.f26656E.mo8780w();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f26677b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f26677b.mo4598w2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: y0 */
    public final c83 mo8781y0() {
        return this.f26656E.mo8781y0();
    }
}
