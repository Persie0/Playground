package kotlinx.coroutines.internal;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C7164n {

    /* JADX INFO: renamed from: a */
    public final LockFreeLinkedListNode f40439a;

    public C7164n(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f40439a = lockFreeLinkedListNode;
    }

    public final String toString() {
        return "Removed[" + this.f40439a + ']';
    }
}
