package pn;

import cm.InterfaceC2056p;
import dm.C5207g;
import hn.C6084d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p102eo.AbstractC5439d;
import p102eo.C5437b;
import p102eo.InterfaceC5436a;
import p102eo.InterfaceC5438c;
import p139go.InterfaceC5847a;
import p139go.InterfaceC5848b;
import p139go.InterfaceC5849c;
import p139go.InterfaceC5850d;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5853g;
import p139go.InterfaceC5854h;
import p139go.InterfaceC5855i;
import p139go.InterfaceC5856j;
import p139go.InterfaceC5857k;
import p139go.InterfaceC5861o;
import p348qn.C8651a;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5237j;
import p543do.C5247o;
import p543do.C5250p0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;

/* JADX INFO: renamed from: pn.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C8422m implements InterfaceC5436a {

    /* JADX INFO: renamed from: a */
    public final Map<InterfaceC5240k0, InterfaceC5240k0> f45545a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5438c.a f45546b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5439d f45547c;

    /* JADX INFO: renamed from: d */
    public final KotlinTypePreparator f45548d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2056p<AbstractC5257t, AbstractC5257t, Boolean> f45549e;

    public C8422m(HashMap map, InterfaceC5438c.a aVar, AbstractC5439d abstractC5439d, KotlinTypePreparator kotlinTypePreparator, InterfaceC2056p interfaceC2056p) {
        C5207g.m11111f(aVar, "equalityAxioms");
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        C5207g.m11111f(kotlinTypePreparator, "kotlinTypePreparator");
        this.f45545a = map;
        this.f45546b = aVar;
        this.f45547c = abstractC5439d;
        this.f45548d = kotlinTypePreparator;
        this.f45549e = interfaceC2056p;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: A */
    public final AbstractC5265x mo11034A(InterfaceC5849c interfaceC5849c) {
        return InterfaceC5436a.a.m11620d0(interfaceC5849c);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: B */
    public final boolean mo11035B(InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(interfaceC5852f, "$receiver");
        return interfaceC5852f instanceof C6084d;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: C */
    public final AbstractC5265x mo11036C(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11629i(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: D */
    public final AbstractC5249p mo11037D(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11625g(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: E */
    public final TypeVariance mo11038E(InterfaceC5855i interfaceC5855i) {
        return InterfaceC5436a.a.m11588B(interfaceC5855i);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: F */
    public final boolean mo11039F(InterfaceC5853g interfaceC5853g) {
        C5207g.m11111f(interfaceC5853g, "$receiver");
        return mo11094r(mo11077h(interfaceC5853g));
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: G */
    public final NewCapturedTypeConstructor mo11040G(InterfaceC5848b interfaceC5848b) {
        return InterfaceC5436a.a.m11638m0(interfaceC5848b);
    }

    @Override // p102eo.InterfaceC5436a
    /* JADX INFO: renamed from: H */
    public final AbstractC5262v0 mo11041H(InterfaceC5853g interfaceC5853g, InterfaceC5853g interfaceC5853g2) {
        return InterfaceC5436a.a.m11637m(this, interfaceC5853g, interfaceC5853g2);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: I */
    public final boolean mo11042I(InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(interfaceC5852f, "$receiver");
        return mo11083k(mo11071e(interfaceC5852f)) != mo11083k(mo11090n0(interfaceC5852f));
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: J */
    public final Set mo11043J(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11624f0(this, interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: K */
    public final AbstractC5262v0 mo11044K(InterfaceC5855i interfaceC5855i) {
        return InterfaceC5436a.a.m11652w(interfaceC5855i);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: L */
    public final boolean mo11045L(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11601O(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: M */
    public final int mo11046M(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11615b(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: N */
    public final boolean mo11047N(InterfaceC5848b interfaceC5848b) {
        C5207g.m11111f(interfaceC5848b, "$receiver");
        return interfaceC5848b instanceof C8651a;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: O */
    public final boolean mo11048O(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11597K(this, interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: P */
    public final AbstractC5262v0 mo11049P(ArrayList arrayList) {
        return InterfaceC5436a.a.m11593G(arrayList);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: Q */
    public final int mo11050Q(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11622e0(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: R */
    public final AbstractC5262v0 mo11051R(InterfaceC5848b interfaceC5848b) {
        return InterfaceC5436a.a.m11616b0(interfaceC5848b);
    }

    @Override // p139go.InterfaceC5860n
    /* JADX INFO: renamed from: S */
    public final boolean mo11053S(InterfaceC5853g interfaceC5853g, InterfaceC5853g interfaceC5853g2) {
        return InterfaceC5436a.a.m11592F(interfaceC5853g, interfaceC5853g2);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: T */
    public final boolean mo11054T(InterfaceC5853g interfaceC5853g) {
        C5207g.m11111f(interfaceC5853g, "$receiver");
        return mo11045L(mo11077h(interfaceC5853g));
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: U */
    public final boolean mo11055U(InterfaceC5857k interfaceC5857k, InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11591E(interfaceC5857k, interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: V */
    public final boolean mo11056V(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11602P(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: W */
    public final boolean mo11057W(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11604R(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: X */
    public final InterfaceC5852f mo11058X(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11646q0(this, interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: Y */
    public final InterfaceC5857k mo11059Y(InterfaceC5856j interfaceC5856j, int i10) {
        return InterfaceC5436a.a.m11647r(interfaceC5856j, i10);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: Z */
    public final InterfaceC5848b mo11060Z(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11619d(this, interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: a */
    public final InterfaceC5855i mo11061a(InterfaceC5852f interfaceC5852f, int i10) {
        return InterfaceC5436a.a.m11641o(interfaceC5852f, i10);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: a0 */
    public final boolean mo11062a0(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11610X(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: b */
    public final boolean mo11063b(InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(interfaceC5852f, "$receiver");
        return mo11057W(mo11101w(interfaceC5852f)) && !m16471p(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: b0 */
    public final C5250p0 mo11064b0(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11631j(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: c */
    public final boolean mo11065c(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11609W(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: c0 */
    public final CaptureStatus mo11066c0(InterfaceC5848b interfaceC5848b) {
        return InterfaceC5436a.a.m11635l(interfaceC5848b);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: d */
    public final AbstractC5265x mo11068d(InterfaceC5853g interfaceC5853g, boolean z10) {
        return InterfaceC5436a.a.m11644p0(interfaceC5853g, z10);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: d0 */
    public final AbstractC5265x mo11069d0(InterfaceC5850d interfaceC5850d) {
        return InterfaceC5436a.a.m11640n0(interfaceC5850d);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: e */
    public final InterfaceC5853g mo11071e(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11614a0(this, interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: e0 */
    public final boolean mo11072e0(InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(interfaceC5852f, "$receiver");
        AbstractC5249p abstractC5249pMo11037D = mo11037D(interfaceC5852f);
        return (abstractC5249pMo11037D != null ? m16470o(abstractC5249pMo11037D) : null) != null;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: f */
    public final InterfaceC8847k0 mo11073f(InterfaceC5861o interfaceC5861o) {
        return InterfaceC5436a.a.m11653x(interfaceC5861o);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: f0 */
    public final int mo11074f0(InterfaceC5854h interfaceC5854h) {
        return InterfaceC5436a.a.m11628h0(this, interfaceC5854h);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: g */
    public final C5437b mo11075g(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11630i0(this, interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC5855i mo11076g0(InterfaceC5854h interfaceC5854h, int i10) {
        return InterfaceC5436a.a.m11639n(this, interfaceC5854h, i10);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: h */
    public final InterfaceC5240k0 mo11077h(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11634k0(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: h0 */
    public final boolean mo11078h0(InterfaceC5855i interfaceC5855i) {
        return InterfaceC5436a.a.m11608V(interfaceC5855i);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: i */
    public final AbstractC5262v0 mo11080i(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11618c0(interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: i0 */
    public final Collection<InterfaceC5852f> mo11081i0(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11632j0(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: j */
    public final C5237j mo11082j(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11621e(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: k */
    public final boolean mo11083k(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11603Q(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC5246n0 mo11084k0(InterfaceC5847a interfaceC5847a) {
        return InterfaceC5436a.a.m11626g0(interfaceC5847a);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: l */
    public final void mo11085l(InterfaceC5853g interfaceC5853g, InterfaceC5856j interfaceC5856j) {
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: l0 */
    public final boolean mo11086l0(InterfaceC5853g interfaceC5853g) {
        C5207g.m11111f(interfaceC5853g, "$receiver");
        AbstractC5265x abstractC5265xMo11036C = mo11036C(interfaceC5853g);
        return (abstractC5265xMo11036C != null ? mo11060Z(abstractC5265xMo11036C) : null) != null;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: m */
    public final AbstractC5265x mo11087m(InterfaceC5850d interfaceC5850d) {
        return InterfaceC5436a.a.m11612Z(interfaceC5850d);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: m0 */
    public final boolean mo11088m0(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11598L(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: n */
    public final boolean mo11089n(InterfaceC5848b interfaceC5848b) {
        return InterfaceC5436a.a.m11607U(interfaceC5848b);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC5853g mo11090n0(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11642o0(this, interfaceC5852f);
    }

    /* JADX INFO: renamed from: o */
    public final C5247o m16470o(InterfaceC5850d interfaceC5850d) {
        return InterfaceC5436a.a.m11623f(interfaceC5850d);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16471p(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11605S(interfaceC5852f);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: p0 */
    public final boolean mo11092p0(InterfaceC5856j interfaceC5856j, InterfaceC5856j interfaceC5856j2) {
        boolean z10;
        C5207g.m11111f(interfaceC5856j, "c1");
        C5207g.m11111f(interfaceC5856j2, "c2");
        if (!(interfaceC5856j instanceof InterfaceC5240k0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(interfaceC5856j2 instanceof InterfaceC5240k0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (InterfaceC5436a.a.m11613a(interfaceC5856j, interfaceC5856j2)) {
            return true;
        }
        InterfaceC5240k0 interfaceC5240k0 = (InterfaceC5240k0) interfaceC5856j;
        InterfaceC5240k0 interfaceC5240k1 = (InterfaceC5240k0) interfaceC5856j2;
        if (!this.f45546b.mo11658a(interfaceC5240k0, interfaceC5240k1)) {
            Map<InterfaceC5240k0, InterfaceC5240k0> map = this.f45545a;
            if (map != null) {
                InterfaceC5240k0 interfaceC5240k2 = map.get(interfaceC5240k0);
                InterfaceC5240k0 interfaceC5240k3 = map.get(interfaceC5240k1);
                if (interfaceC5240k2 == null || !C5207g.m11106a(interfaceC5240k2, interfaceC5240k1)) {
                    if (interfaceC5240k3 == null || !C5207g.m11106a(interfaceC5240k3, interfaceC5240k0)) {
                    }
                }
            }
            z10 = false;
            if (z10) {
                return true;
            }
            return false;
        }
        z10 = true;
        if (z10) {
            return true;
        }
        return false;
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: q */
    public final AbstractC5265x mo11093q(InterfaceC5853g interfaceC5853g, CaptureStatus captureStatus) {
        return InterfaceC5436a.a.m11633k(interfaceC5853g, captureStatus);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: r */
    public final boolean mo11094r(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11595I(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: s */
    public final boolean mo11096s(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11596J(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: t */
    public final InterfaceC5854h mo11097t(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11617c(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: u */
    public final boolean mo11099u(InterfaceC5856j interfaceC5856j) {
        return InterfaceC5436a.a.m11594H(interfaceC5856j);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: v */
    public final boolean mo11100v(InterfaceC5853g interfaceC5853g) {
        return InterfaceC5436a.a.m11599M(interfaceC5853g);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: w */
    public final InterfaceC5856j mo11101w(InterfaceC5852f interfaceC5852f) {
        return InterfaceC5436a.a.m11636l0(this, interfaceC5852f);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: x */
    public final TypeVariance mo11103x(InterfaceC5857k interfaceC5857k) {
        return InterfaceC5436a.a.m11589C(interfaceC5857k);
    }

    @Override // p139go.InterfaceC5858l
    /* JADX INFO: renamed from: z */
    public final InterfaceC5855i mo11105z(InterfaceC5853g interfaceC5853g, int i10) {
        C5207g.m11111f(interfaceC5853g, "$receiver");
        if (i10 >= 0 && i10 < mo11046M(interfaceC5853g)) {
            return mo11061a(interfaceC5853g, i10);
        }
        return null;
    }
}
