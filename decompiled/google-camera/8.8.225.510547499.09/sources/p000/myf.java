package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class myf implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f41805a;

    /* JADX INFO: renamed from: b */
    public boolean f41806b;

    /* JADX INFO: renamed from: c */
    public Object f41807c;

    public myf(Iterator it) {
        it.getClass();
        this.f41805a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41806b || this.f41805a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f41806b) {
            return this.f41805a.next();
        }
        Object obj = this.f41807c;
        this.f41806b = false;
        this.f41807c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        lku.m15614I(!this.f41806b, "Can't remove after you've peeked at next");
        this.f41805a.remove();
    }
}
