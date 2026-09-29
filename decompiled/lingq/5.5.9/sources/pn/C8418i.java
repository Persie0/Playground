package pn;

import cm.InterfaceC2052l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p372rm.C8850m;
import p372rm.InterfaceC8830c;

/* JADX INFO: renamed from: pn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C8418i implements InterfaceC2052l<CallableMemberDescriptor, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8830c f45541a;

    public C8418i(InterfaceC8830c interfaceC8830c) {
        this.f45541a = interfaceC8830c;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Boolean mo528n(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        boolean z10 = false;
        if (!C8850m.m17102e(callableMemberDescriptor2.mo11886f())) {
            InterfaceC8830c interfaceC8830c = this.f45541a;
            if (interfaceC8830c == null) {
                C8850m.m17098a(3);
                throw null;
            }
            if (C8850m.m17100c(C8850m.f46747n, callableMemberDescriptor2, interfaceC8830c) == null) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
