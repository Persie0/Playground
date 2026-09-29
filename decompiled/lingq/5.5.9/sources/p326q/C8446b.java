package p326q;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: q.b */
/* JADX INFO: loaded from: classes.dex */
public class C8446b<K, V> extends C8452h<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: h */
    public C8445a f45576h;

    public C8446b() {
    }

    public C8446b(int i10) {
        super(i10);
    }

    public C8446b(C8446b c8446b) {
        if (c8446b != null) {
            mo14868i(c8446b);
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f45576h == null) {
            this.f45576h = new C8445a(this);
        }
        C8445a c8445a = this.f45576h;
        if (c8445a.f45598a == null) {
            c8445a.f45598a = new AbstractC8451g.b();
        }
        return c8445a.f45598a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.f45576h == null) {
            this.f45576h = new C8445a(this);
        }
        C8445a c8445a = this.f45576h;
        if (c8445a.f45599b == null) {
            c8445a.f45599b = new AbstractC8451g.c();
        }
        return c8445a.f45599b;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m16524b(map.size() + this.f45619c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.f45576h == null) {
            this.f45576h = new C8445a(this);
        }
        C8445a c8445a = this.f45576h;
        if (c8445a.f45600c == null) {
            c8445a.f45600c = new AbstractC8451g.e();
        }
        return c8445a.f45600c;
    }
}
