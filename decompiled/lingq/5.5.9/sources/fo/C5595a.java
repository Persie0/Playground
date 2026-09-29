package fo;

import dm.C5207g;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import mn.C7648e;
import p102eo.AbstractC5439d;
import p260m8.C7499b;
import p372rm.C8850m;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8840h;
import p420um.C9573j;
import p420um.C9577l;
import p543do.AbstractC5252q0;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: fo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5595a extends C9577l {
    /* JADX WARN: Illegal instructions before constructor call */
    public C5595a(C7648e c7648e) {
        C5602h c5602h = C5602h.f34418a;
        C5597c c5597c = C5602h.f34419b;
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.CLASS;
        EmptyList emptyList = EmptyList.f38032a;
        InterfaceC8837f0.a aVar = InterfaceC8837f0.f46730a;
        super(c5597c, c7648e, modality, classKind, emptyList, LockBasedStorageManager.f39828e);
        C9573j c9573j = new C9573j(this, null, InterfaceC9077e.a.f47365a, true, CallableMemberDescriptor.Kind.DECLARATION, aVar);
        c9573j.m18029g1(emptyList, C8850m.f46737d);
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String str = c9573j.mo11874a().f42086a;
        C5207g.m11110e(str, "errorConstructor.name.toString()");
        C5599e c5599eM11911b = C5602h.m11911b(errorScopeKind, str, "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        c9573j.m13639d1(new C5600f(C5602h.m11913d(errorTypeKind, new String[0]), c5599eM11911b, errorTypeKind, emptyList, false, new String[0]));
        m18038V0(c5599eM11911b, C7499b.m14972w0(c9573j), c9573j);
    }

    @Override // p420um.AbstractC9557b, p420um.AbstractC9590w
    /* JADX INFO: renamed from: N */
    public final MemberScope mo11844N(AbstractC5252q0 abstractC5252q0, AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5252q0, "typeSubstitution");
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String str = mo11874a().f42086a;
        C5207g.m11110e(str, "name.toString()");
        return C5602h.m11911b(errorScopeKind, str, abstractC5252q0.toString());
    }

    @Override // p420um.AbstractC9557b
    /* JADX INFO: renamed from: P0 */
    public final InterfaceC8830c mo5312d(TypeSubstitutor typeSubstitutor) {
        C5207g.m11111f(typeSubstitutor, "substitutor");
        return this;
    }

    @Override // p420um.AbstractC9557b, p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final InterfaceC8840h mo5312d(TypeSubstitutor typeSubstitutor) {
        C5207g.m11111f(typeSubstitutor, "substitutor");
        return this;
    }

    @Override // p420um.C9577l
    public final String toString() {
        String strM15235f = mo11874a().m15235f();
        C5207g.m11110e(strM15235f, "name.asString()");
        return strM15235f;
    }
}
