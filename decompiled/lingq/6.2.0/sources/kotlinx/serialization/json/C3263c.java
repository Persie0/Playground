package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlinx.serialization.KSerializer;
import p000.ey8;
import p000.fa4;
import p000.gg4;
import p000.qy3;
import p000.tg4;
import p000.u91;

/* JADX INFO: renamed from: kotlinx.serialization.json.c */
/* JADX INFO: loaded from: classes.dex */
@ey8(with = gg4.class)
public final class C3263c extends AbstractC3262b implements Map<String, AbstractC3262b>, tg4 {
    public static final JsonObject$Companion Companion = new Object() { // from class: kotlinx.serialization.json.JsonObject$Companion
        public final KSerializer serializer() {
            return gg4.f40769a;
        }
    };

    /* JADX INFO: renamed from: a */
    public final Map f48242a;

    public C3263c(Map map) {
        map.getClass();
        this.f48242a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC3262b compute(String str, BiFunction<? super String, ? super AbstractC3262b, ? extends AbstractC3262b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC3262b computeIfAbsent(String str, Function<? super String, ? extends AbstractC3262b> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC3262b computeIfPresent(String str, BiFunction<? super String, ? super AbstractC3262b, ? extends AbstractC3262b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f48242a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC3262b)) {
            return false;
        }
        return this.f48242a.containsValue((AbstractC3262b) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC3262b>> entrySet() {
        return this.f48242a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return fa4.m11650l(this.f48242a, obj);
    }

    @Override // java.util.Map
    public final AbstractC3262b get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC3262b) this.f48242a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f48242a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f48242a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f48242a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC3262b merge(String str, AbstractC3262b abstractC3262b, BiFunction<? super AbstractC3262b, ? super AbstractC3262b, ? extends AbstractC3262b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC3262b put(String str, AbstractC3262b abstractC3262b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC3262b> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC3262b putIfAbsent(String str, AbstractC3262b abstractC3262b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC3262b remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC3262b replace(String str, AbstractC3262b abstractC3262b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC3262b, ? extends AbstractC3262b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f48242a.size();
    }

    public final String toString() {
        return u91.m22596N0(this.f48242a.entrySet(), ",", "{", "}", new qy3(7), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC3262b> values() {
        return this.f48242a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC3262b abstractC3262b, AbstractC3262b abstractC3262b2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
