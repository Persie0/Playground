package p000;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p021j$.util.Map;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpw extends mvn implements Map {

    /* JADX INFO: renamed from: a */
    private final java.util.Map f38926a;

    private lpw(java.util.Map map) {
        this.f38926a = map;
    }

    /* JADX INFO: renamed from: b */
    public static lpw m15847b() {
        return new lpw(new ConcurrentHashMap());
    }

    @Override // p000.mvn, p000.mvq
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object mo3816a() {
        return this.f38926a;
    }

    @Override // p000.mvn
    /* JADX INFO: renamed from: c */
    protected final java.util.Map mo15848c() {
        return this.f38926a;
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        return ((ConcurrentHashMap) this.f38926a).putIfAbsent(obj, obj2);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, p021j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }
}
