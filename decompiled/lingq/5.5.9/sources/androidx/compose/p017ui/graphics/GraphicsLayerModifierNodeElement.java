package androidx.compose.p017ui.graphics;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.NodeCoordinator;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p166i1.AbstractC6165t;
import p166i1.C6139d;
import p387t0.C9162o0;
import p387t0.C9169u;
import p387t0.InterfaceC9154k0;
import p387t0.InterfaceC9172x;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerModifierNodeElement;", "Li1/t;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final /* data */ class GraphicsLayerModifierNodeElement extends AbstractC6165t<SimpleGraphicsLayerModifier> {

    /* JADX INFO: renamed from: H */
    public final boolean f3413H;

    /* JADX INFO: renamed from: I */
    public final long f3414I;

    /* JADX INFO: renamed from: J */
    public final long f3415J;

    /* JADX INFO: renamed from: K */
    public final int f3416K;

    /* JADX INFO: renamed from: a */
    public final float f3417a;

    /* JADX INFO: renamed from: b */
    public final float f3418b;

    /* JADX INFO: renamed from: c */
    public final float f3419c;

    /* JADX INFO: renamed from: d */
    public final float f3420d;

    /* JADX INFO: renamed from: e */
    public final float f3421e;

    /* JADX INFO: renamed from: f */
    public final float f3422f;

    /* JADX INFO: renamed from: g */
    public final float f3423g;

    /* JADX INFO: renamed from: h */
    public final float f3424h;

    /* JADX INFO: renamed from: i */
    public final float f3425i;

    /* JADX INFO: renamed from: j */
    public final float f3426j;

    /* JADX INFO: renamed from: k */
    public final long f3427k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC9154k0 f3428l;

    public GraphicsLayerModifierNodeElement(float f3, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j10, InterfaceC9154k0 interfaceC9154k0, boolean z10, long j11, long j12, int i10) {
        this.f3417a = f3;
        this.f3418b = f10;
        this.f3419c = f11;
        this.f3420d = f12;
        this.f3421e = f13;
        this.f3422f = f14;
        this.f3423g = f15;
        this.f3424h = f16;
        this.f3425i = f17;
        this.f3426j = f18;
        this.f3427k = j10;
        this.f3428l = interfaceC9154k0;
        this.f3413H = z10;
        this.f3414I = j11;
        this.f3415J = j12;
        this.f3416K = i10;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0500b.c mo1935c() {
        return new SimpleGraphicsLayerModifier(this.f3417a, this.f3418b, this.f3419c, this.f3420d, this.f3421e, this.f3422f, this.f3423g, this.f3424h, this.f3425i, this.f3426j, this.f3427k, this.f3428l, this.f3413H, this.f3414I, this.f3415J, this.f3416K);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerModifierNodeElement)) {
            return false;
        }
        GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement = (GraphicsLayerModifierNodeElement) obj;
        if (Float.compare(this.f3417a, graphicsLayerModifierNodeElement.f3417a) != 0 || Float.compare(this.f3418b, graphicsLayerModifierNodeElement.f3418b) != 0 || Float.compare(this.f3419c, graphicsLayerModifierNodeElement.f3419c) != 0 || Float.compare(this.f3420d, graphicsLayerModifierNodeElement.f3420d) != 0 || Float.compare(this.f3421e, graphicsLayerModifierNodeElement.f3421e) != 0 || Float.compare(this.f3422f, graphicsLayerModifierNodeElement.f3422f) != 0 || Float.compare(this.f3423g, graphicsLayerModifierNodeElement.f3423g) != 0 || Float.compare(this.f3424h, graphicsLayerModifierNodeElement.f3424h) != 0 || Float.compare(this.f3425i, graphicsLayerModifierNodeElement.f3425i) != 0 || Float.compare(this.f3426j, graphicsLayerModifierNodeElement.f3426j) != 0) {
            return false;
        }
        int i10 = C9162o0.f47690c;
        if ((this.f3427k == graphicsLayerModifierNodeElement.f3427k) && C5207g.m11106a(this.f3428l, graphicsLayerModifierNodeElement.f3428l) && this.f3413H == graphicsLayerModifierNodeElement.f3413H && C5207g.m11106a(null, null) && C9169u.m17497c(this.f3414I, graphicsLayerModifierNodeElement.f3414I) && C9169u.m17497c(this.f3415J, graphicsLayerModifierNodeElement.f3415J)) {
            return this.f3416K == graphicsLayerModifierNodeElement.f3416K;
        }
        return false;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: h */
    public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = (SimpleGraphicsLayerModifier) cVar;
        C5207g.m11111f(simpleGraphicsLayerModifier, "node");
        simpleGraphicsLayerModifier.f3444k = this.f3417a;
        simpleGraphicsLayerModifier.f3445l = this.f3418b;
        simpleGraphicsLayerModifier.f3429H = this.f3419c;
        simpleGraphicsLayerModifier.f3430I = this.f3420d;
        simpleGraphicsLayerModifier.f3431J = this.f3421e;
        simpleGraphicsLayerModifier.f3432K = this.f3422f;
        simpleGraphicsLayerModifier.f3433L = this.f3423g;
        simpleGraphicsLayerModifier.f3434M = this.f3424h;
        simpleGraphicsLayerModifier.f3435N = this.f3425i;
        simpleGraphicsLayerModifier.f3436O = this.f3426j;
        simpleGraphicsLayerModifier.f3437P = this.f3427k;
        InterfaceC9154k0 interfaceC9154k0 = this.f3428l;
        C5207g.m11111f(interfaceC9154k0, "<set-?>");
        simpleGraphicsLayerModifier.f3438Q = interfaceC9154k0;
        simpleGraphicsLayerModifier.f3439R = this.f3413H;
        simpleGraphicsLayerModifier.f3440S = this.f3414I;
        simpleGraphicsLayerModifier.f3441T = this.f3415J;
        simpleGraphicsLayerModifier.f3442U = this.f3416K;
        NodeCoordinator nodeCoordinator = C6139d.m12651d(simpleGraphicsLayerModifier, 2).f3845h;
        if (nodeCoordinator != null) {
            InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l = simpleGraphicsLayerModifier.f3443V;
            nodeCoordinator.f3849l = interfaceC2052l;
            nodeCoordinator.m2187n1(interfaceC2052l, true);
        }
        return simpleGraphicsLayerModifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    public final int hashCode() {
        int iM846e = C0204c.m846e(this.f3426j, C0204c.m846e(this.f3425i, C0204c.m846e(this.f3424h, C0204c.m846e(this.f3423g, C0204c.m846e(this.f3422f, C0204c.m846e(this.f3421e, C0204c.m846e(this.f3420d, C0204c.m846e(this.f3419c, C0204c.m846e(this.f3418b, Float.hashCode(this.f3417a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = C9162o0.f47690c;
        int iHashCode = (this.f3428l.hashCode() + C0204c.m847f(this.f3427k, iM846e, 31)) * 31;
        boolean z10 = this.f3413H;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (((iHashCode + r10) * 31) + 0) * 31;
        int i12 = C9169u.f47704g;
        return Integer.hashCode(this.f3416K) + C0204c.m847f(this.f3415J, C0204c.m847f(this.f3414I, i11, 31), 31);
    }

    public final String toString() {
        return "GraphicsLayerModifierNodeElement(scaleX=" + this.f3417a + ", scaleY=" + this.f3418b + ", alpha=" + this.f3419c + ", translationX=" + this.f3420d + ", translationY=" + this.f3421e + ", shadowElevation=" + this.f3422f + ", rotationX=" + this.f3423g + ", rotationY=" + this.f3424h + ", rotationZ=" + this.f3425i + ", cameraDistance=" + this.f3426j + ", transformOrigin=" + ((Object) C9162o0.m17481b(this.f3427k)) + ", shape=" + this.f3428l + ", clip=" + this.f3413H + ", renderEffect=null, ambientShadowColor=" + ((Object) C9169u.m17503i(this.f3414I)) + ", spotShadowColor=" + ((Object) C9169u.m17503i(this.f3415J)) + ", compositingStrategy=" + ((Object) ("CompositingStrategy(value=" + this.f3416K + ')')) + ')';
    }
}
