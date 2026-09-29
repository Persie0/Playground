package p165i0;

import dm.C5207g;
import kotlin.collections.AbstractMap;
import p126g0.InterfaceC5634d;
import p186j0.C6398a;

/* JADX INFO: renamed from: i0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6111d<K, V> extends AbstractMap<K, V> implements InterfaceC5634d<K, V> {

    /* JADX INFO: renamed from: c */
    public static final C6111d f35924c = new C6111d(C6127t.f35949e, 0);

    /* JADX INFO: renamed from: a */
    public final C6127t<K, V> f35925a;

    /* JADX INFO: renamed from: b */
    public final int f35926b;

    public C6111d(C6127t<K, V> c6127t, int i10) {
        C5207g.m11111f(c6127t, "node");
        this.f35925a = c6127t;
        this.f35926b = i10;
    }

    /* JADX INFO: renamed from: a */
    public final C6111d m12613a(Object obj, C6398a c6398a) {
        C6127t.a aVarM12642u = this.f35925a.m12642u(obj != null ? obj.hashCode() : 0, 0, obj, c6398a);
        return aVarM12642u == null ? this : new C6111d(aVarM12642u.f35954a, this.f35926b + aVarM12642u.f35955b);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f35925a.m12626d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) this.f35925a.m12629g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // p126g0.InterfaceC5634d
    /* JADX INFO: renamed from: j */
    public final C6113f mo12008j() {
        return new C6113f(this);
    }
}
