package p102eo;

import dm.C5207g;
import fo.C5602h;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p139go.InterfaceC5848b;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;

/* JADX INFO: renamed from: eo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C5441f extends AbstractC5265x implements InterfaceC5848b {

    /* JADX INFO: renamed from: b */
    public final CaptureStatus f33985b;

    /* JADX INFO: renamed from: c */
    public final NewCapturedTypeConstructor f33986c;

    /* JADX INFO: renamed from: d */
    public final AbstractC5262v0 f33987d;

    /* JADX INFO: renamed from: e */
    public final C5238j0 f33988e;

    /* JADX INFO: renamed from: f */
    public final boolean f33989f;

    /* JADX INFO: renamed from: g */
    public final boolean f33990g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5441f(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, AbstractC5262v0 abstractC5262v0, C5238j0 c5238j0, boolean z10, int i10) {
        if ((i10 & 8) != 0) {
            C5238j0.f33329b.getClass();
            c5238j0 = C5238j0.f33330c;
        }
        this(captureStatus, newCapturedTypeConstructor, abstractC5262v0, c5238j0, (i10 & 16) != 0 ? false : z10, false);
    }

    public C5441f(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, AbstractC5262v0 abstractC5262v0, C5238j0 c5238j0, boolean z10, boolean z11) {
        C5207g.m11111f(captureStatus, "captureStatus");
        C5207g.m11111f(newCapturedTypeConstructor, "constructor");
        C5207g.m11111f(c5238j0, "attributes");
        this.f33985b = captureStatus;
        this.f33986c = newCapturedTypeConstructor;
        this.f33987d = abstractC5262v0;
        this.f33988e = c5238j0;
        this.f33989f = z10;
        this.f33990g = z11;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: V0 */
    public final List<InterfaceC5246n0> mo11240V0() {
        return EmptyList.f38032a;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: W0 */
    public final C5238j0 mo11241W0() {
        return this.f33988e;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: X0 */
    public final InterfaceC5240k0 mo11250X0() {
        return this.f33986c;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11242Y0() {
        return this.f33989f;
    }

    @Override // p543do.AbstractC5265x, p543do.AbstractC5262v0
    /* JADX INFO: renamed from: b1 */
    public final AbstractC5262v0 mo11217b1(boolean z10) {
        return new C5441f(this.f33985b, this.f33986c, this.f33987d, this.f33988e, z10, 32);
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11217b1(boolean z10) {
        return new C5441f(this.f33985b, this.f33986c, this.f33987d, this.f33988e, z10, 32);
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: f1 */
    public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return new C5441f(this.f33985b, this.f33986c, this.f33987d, c5238j0, this.f33989f, this.f33990g);
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final C5441f mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f33985b;
        NewCapturedTypeConstructor newCapturedTypeConstructorM14221d = this.f33986c.m14221d(abstractC5439d);
        AbstractC5262v0 abstractC5262v0 = this.f33987d;
        return new C5441f(captureStatus, newCapturedTypeConstructorM14221d, abstractC5262v0 != null ? abstractC5439d.mo11663o0(abstractC5262v0).mo11288a1() : null, this.f33988e, this.f33989f, 32);
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: q */
    public final MemberScope mo11245q() {
        return C5602h.m11910a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }
}
