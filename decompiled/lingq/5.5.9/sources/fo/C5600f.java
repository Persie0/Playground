package fo;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p102eo.AbstractC5439d;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;

/* JADX INFO: renamed from: fo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C5600f extends AbstractC5265x {

    /* JADX INFO: renamed from: b */
    public final InterfaceC5240k0 f34408b;

    /* JADX INFO: renamed from: c */
    public final MemberScope f34409c;

    /* JADX INFO: renamed from: d */
    public final ErrorTypeKind f34410d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC5246n0> f34411e;

    /* JADX INFO: renamed from: f */
    public final boolean f34412f;

    /* JADX INFO: renamed from: g */
    public final String[] f34413g;

    /* JADX INFO: renamed from: h */
    public final String f34414h;

    /* JADX WARN: Multi-variable type inference failed */
    public C5600f(InterfaceC5240k0 interfaceC5240k0, MemberScope memberScope, ErrorTypeKind errorTypeKind, List<? extends InterfaceC5246n0> list, boolean z10, String... strArr) {
        C5207g.m11111f(interfaceC5240k0, "constructor");
        C5207g.m11111f(memberScope, "memberScope");
        C5207g.m11111f(errorTypeKind, "kind");
        C5207g.m11111f(list, "arguments");
        C5207g.m11111f(strArr, "formatParams");
        this.f34408b = interfaceC5240k0;
        this.f34409c = memberScope;
        this.f34410d = errorTypeKind;
        this.f34411e = list;
        this.f34412f = z10;
        this.f34413g = strArr;
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f34414h = C0166e.m770q(objArrCopyOf, objArrCopyOf.length, debugMessage, "format(format, *args)");
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: V0 */
    public final List<InterfaceC5246n0> mo11240V0() {
        return this.f34411e;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: W0 */
    public final C5238j0 mo11241W0() {
        C5238j0.f33329b.getClass();
        return C5238j0.f33330c;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: X0 */
    public final InterfaceC5240k0 mo11250X0() {
        return this.f34408b;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11242Y0() {
        return this.f34412f;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Z0 */
    public final AbstractC5257t mo11218c1(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        return this;
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5262v0 mo11218c1(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        return this;
    }

    @Override // p543do.AbstractC5265x, p543do.AbstractC5262v0
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5262v0 mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return this;
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11217b1(boolean z10) {
        InterfaceC5240k0 interfaceC5240k0 = this.f34408b;
        MemberScope memberScope = this.f34409c;
        ErrorTypeKind errorTypeKind = this.f34410d;
        List<InterfaceC5246n0> list = this.f34411e;
        String[] strArr = this.f34413g;
        return new C5600f(interfaceC5240k0, memberScope, errorTypeKind, list, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: f1 */
    public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return this;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: q */
    public final MemberScope mo11245q() {
        return this.f34409c;
    }
}
