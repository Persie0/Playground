package kotlinx.coroutines.internal;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.h */
/* JADX INFO: loaded from: classes2.dex */
public class C7158h extends LockFreeLinkedListNode {
    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* JADX INFO: renamed from: D */
    public final boolean mo14407D() {
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* JADX INFO: renamed from: F */
    public final boolean mo14408F() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}
