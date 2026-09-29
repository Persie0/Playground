package p325po;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p338qd.C8573r0;

/* JADX INFO: renamed from: po.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8426b extends LockFreeLinkedListNode.AbstractC7147b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC8425a f45555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8426b(C8443s c8443s, AbstractC8425a abstractC8425a) {
        super(c8443s);
        this.f45555d = abstractC8425a;
    }

    @Override // kotlinx.coroutines.internal.AbstractC7153c
    /* JADX INFO: renamed from: i */
    public final Object mo14357i(LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (this.f45555d.mo16482o()) {
            return null;
        }
        return C8573r0.f45973j;
    }
}
