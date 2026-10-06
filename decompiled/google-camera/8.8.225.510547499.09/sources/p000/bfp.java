package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfp implements Iterator {

    /* JADX INFO: renamed from: a */
    public final bgb f3122a;

    /* JADX INFO: renamed from: b */
    public String f3123b = null;

    /* JADX INFO: renamed from: c */
    private Iterator f3124c;

    public bfp(bfr bfrVar) {
        this.f3124c = null;
        bgb bgbVar = new bgb();
        this.f3122a = bgbVar;
        bfu bfuVar = bfrVar.f3126a;
        if (bgbVar.m2384h(256)) {
            this.f3124c = new bfo(this, bfuVar);
        } else {
            this.f3124c = new bfn(this, bfuVar, null, 1);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3124c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f3124c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}
