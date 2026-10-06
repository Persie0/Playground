package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nzs implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nzu f45090a;

    /* JADX INFO: renamed from: b */
    private int f45091b = -1;

    /* JADX INFO: renamed from: c */
    private boolean f45092c;

    /* JADX INFO: renamed from: d */
    private Iterator f45093d;

    public nzs(nzu nzuVar) {
        this.f45090a = nzuVar;
    }

    /* JADX INFO: renamed from: a */
    private final Iterator m18318a() {
        if (this.f45093d == null) {
            this.f45093d = this.f45090a.f45096b.entrySet().iterator();
        }
        return this.f45093d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f45091b + 1 >= this.f45090a.f45095a.size()) {
            return !this.f45090a.f45096b.isEmpty() && m18318a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f45092c = true;
        int i = this.f45091b + 1;
        this.f45091b = i;
        return i < this.f45090a.f45095a.size() ? (Map.Entry) this.f45090a.f45095a.get(this.f45091b) : (Map.Entry) m18318a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f45092c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f45092c = false;
        this.f45090a.m18327g();
        if (this.f45091b >= this.f45090a.f45095a.size()) {
            m18318a().remove();
            return;
        }
        nzu nzuVar = this.f45090a;
        int i = this.f45091b;
        this.f45091b = i - 1;
        nzuVar.m18325e(i);
    }
}
