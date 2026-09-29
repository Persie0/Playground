package om;

import cm.InterfaceC2052l;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7646c;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;

/* JADX INFO: renamed from: om.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8088e implements InterfaceC2052l<C7648e, InterfaceC8830c> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC6795c f43905a;

    public C8088e(AbstractC6795c abstractC6795c) {
        this.f43905a = abstractC6795c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final InterfaceC8830c mo528n(C7648e c7648e) {
        C7648e c7648e2 = c7648e;
        C6829c c6829cM13555l = this.f43905a.m13555l();
        C7646c c7646c = C6797e.f38344j;
        MemberScope memberScopeMo13628q = c6829cM13555l.mo11873R(c7646c).mo13628q();
        if (memberScopeMo13628q == null) {
            AbstractC6795c.m13540a(11);
            throw null;
        }
        InterfaceC8834e interfaceC8834eMo5304g = memberScopeMo13628q.mo5304g(c7648e2, NoLookupLocation.FROM_BUILTINS);
        if (interfaceC8834eMo5304g == null) {
            throw new AssertionError("Built-in class " + c7646c.m15215c(c7648e2) + " is not found");
        }
        if (interfaceC8834eMo5304g instanceof InterfaceC8830c) {
            return (InterfaceC8830c) interfaceC8834eMo5304g;
        }
        throw new AssertionError("Must be a class descriptor " + c7648e2 + ", but was " + interfaceC8834eMo5304g);
    }
}
