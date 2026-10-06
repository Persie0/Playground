package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: wv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1106wv implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    int f47968a;

    /* JADX INFO: renamed from: b */
    int f47969b = -1;

    /* JADX INFO: renamed from: c */
    boolean f47970c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C1109wy f47971d;

    public C1106wv(C1109wy c1109wy) {
        this.f47971d = c1109wy;
        this.f47968a = c1109wy.f48004d - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f47970c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ooc.m18737c(entry.getKey(), this.f47971d.m19559d(this.f47969b)) && ooc.m18737c(entry.getValue(), this.f47971d.m19560g(this.f47969b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f47970c) {
            return this.f47971d.m19559d(this.f47969b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f47970c) {
            return this.f47971d.m19560g(this.f47969b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47969b < this.f47968a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f47970c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object objM19559d = this.f47971d.m19559d(this.f47969b);
        Object objM19560g = this.f47971d.m19560g(this.f47969b);
        return (objM19559d == null ? 0 : objM19559d.hashCode()) ^ (objM19560g != null ? objM19560g.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f47969b++;
        this.f47970c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f47970c) {
            throw new IllegalStateException();
        }
        this.f47971d.mo3366e(this.f47969b);
        this.f47969b--;
        this.f47968a--;
        this.f47970c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f47970c) {
            return this.f47971d.mo3367f(this.f47969b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
