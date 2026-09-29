package no;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import sl.C9072e;

/* JADX INFO: renamed from: no.h1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7836h1 extends AbstractC7819c {

    /* JADX INFO: renamed from: a */
    public final LockFreeLinkedListNode f42933a;

    public C7836h1(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f42933a = lockFreeLinkedListNode;
    }

    @Override // no.AbstractC7837i
    /* JADX INFO: renamed from: a */
    public final void mo14353a(Throwable th2) {
        this.f42933a.mo14408F();
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C9072e mo528n(Throwable th2) {
        mo14353a(th2);
        return C9072e.f47360a;
    }

    public final String toString() {
        return "RemoveOnCancel[" + this.f42933a + ']';
    }
}
