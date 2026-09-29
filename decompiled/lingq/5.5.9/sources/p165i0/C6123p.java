package p165i0;

import dm.C5207g;
import java.util.Iterator;
import p126g0.InterfaceC5632b;
import tl.AbstractC9318f;

/* JADX INFO: renamed from: i0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6123p<K, V> extends AbstractC9318f<K> implements InterfaceC5632b<K> {

    /* JADX INFO: renamed from: a */
    public final C6111d<K, V> f35947a;

    public C6123p(C6111d<K, V> c6111d) {
        C5207g.m11111f(c6111d, "map");
        this.f35947a = c6111d;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: a */
    public final int mo1847a() {
        C6111d<K, V> c6111d = this.f35947a;
        c6111d.getClass();
        return c6111d.f35926b;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f35947a.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new C6124q(this.f35947a.f35925a);
    }
}
