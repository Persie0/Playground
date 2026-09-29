package no;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p338qd.C8573r0;

/* JADX INFO: renamed from: no.a1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7815a1 extends LockFreeLinkedListNode.AbstractC7147b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C7883z0 f42915d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f42916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7815a1(LockFreeLinkedListNode lockFreeLinkedListNode, C7883z0 c7883z0, Object obj) {
        super(lockFreeLinkedListNode);
        this.f42915d = c7883z0;
        this.f42916e = obj;
    }

    @Override // kotlinx.coroutines.internal.AbstractC7153c
    /* JADX INFO: renamed from: i */
    public final Object mo14357i(LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (this.f42915d.m15634M() == this.f42916e) {
            return null;
        }
        return C8573r0.f45973j;
    }
}
