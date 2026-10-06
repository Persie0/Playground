package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: wy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C1109wy extends C1117xf implements Map, p021j$.util.Map {

    /* JADX INFO: renamed from: a */
    C1103ws f47974a;

    /* JADX INFO: renamed from: b */
    C1105wu f47975b;

    /* JADX INFO: renamed from: c */
    C1107ww f47976c;

    public C1109wy() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19535a(Collection collection) {
        int i = this.f48004d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(m19559d(i2))) {
                mo3366e(i2);
            }
        }
        return i != this.f48004d;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return p021j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return p021j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return p021j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1103ws c1103ws = this.f47974a;
        if (c1103ws != null) {
            return c1103ws;
        }
        C1103ws c1103ws2 = new C1103ws(this);
        this.f47974a = c1103ws2;
        return c1103ws2;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        p021j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1105wu c1105wu = this.f47975b;
        if (c1105wu != null) {
            return c1105wu;
        }
        C1105wu c1105wu2 = new C1105wu(this);
        this.f47975b = c1105wu2;
        return c1105wu2;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return p021j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m19561h(this.f48004d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        p021j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        C1107ww c1107ww = this.f47976c;
        if (c1107ww != null) {
            return c1107ww;
        }
        C1107ww c1107ww2 = new C1107ww(this);
        this.f47976c = c1107ww2;
        return c1107ww2;
    }

    public C1109wy(int i) {
        super(i);
    }

    public C1109wy(C1117xf c1117xf) {
        super((byte[]) null);
        mo3368i(c1117xf);
    }
}
