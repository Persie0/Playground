package tl;

import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: tl.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9334v implements Iterator<Integer>, InterfaceC5429a {
    /* JADX INFO: renamed from: a */
    public abstract int mo13105a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(mo13105a());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
