package tl;

import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: tl.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9324l implements Iterator<Character>, InterfaceC5429a {
    /* JADX INFO: renamed from: a */
    public abstract char mo13101a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(mo13101a());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
