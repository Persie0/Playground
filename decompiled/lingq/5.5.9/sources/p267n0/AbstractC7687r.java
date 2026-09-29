package p267n0;

import dm.C5207g;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import sl.C9072e;

/* JADX INFO: renamed from: n0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7687r<K, V> {

    /* JADX INFO: renamed from: a */
    public final C7682m<K, V> f42183a;

    /* JADX INFO: renamed from: b */
    public final Iterator<Map.Entry<K, V>> f42184b;

    /* JADX INFO: renamed from: c */
    public int f42185c;

    /* JADX INFO: renamed from: d */
    public Map.Entry<? extends K, ? extends V> f42186d;

    /* JADX INFO: renamed from: e */
    public Map.Entry<? extends K, ? extends V> f42187e;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC7687r(C7682m<K, V> c7682m, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        C5207g.m11111f(c7682m, "map");
        C5207g.m11111f(it, "iterator");
        this.f42183a = c7682m;
        this.f42184b = it;
        this.f42185c = c7682m.m15278a().f42175d;
        m15282a();
    }

    /* JADX INFO: renamed from: a */
    public final void m15282a() {
        this.f42186d = this.f42187e;
        Iterator<Map.Entry<K, V>> it = this.f42184b;
        this.f42187e = it.hasNext() ? it.next() : null;
    }

    public final boolean hasNext() {
        return this.f42187e != null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void remove() {
        C7682m<K, V> c7682m = this.f42183a;
        if (c7682m.m15278a().f42175d != this.f42185c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f42186d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        c7682m.remove(entry.getKey());
        this.f42186d = null;
        C9072e c9072e = C9072e.f47360a;
        this.f42185c = c7682m.m15278a().f42175d;
    }
}
