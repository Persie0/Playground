package p000;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nwl extends nwm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nwr f44833a;

    /* JADX INFO: renamed from: b */
    private int f44834b = 0;

    /* JADX INFO: renamed from: c */
    private final int f44835c;

    public nwl(nwr nwrVar) {
        this.f44833a = nwrVar;
        this.f44835c = nwrVar.mo17783d();
    }

    @Override // p000.nwo
    /* JADX INFO: renamed from: a */
    public final byte mo17779a() {
        int i = this.f44834b;
        if (i >= this.f44835c) {
            throw new NoSuchElementException();
        }
        this.f44834b = i + 1;
        return this.f44833a.mo17781b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44834b < this.f44835c;
    }
}
