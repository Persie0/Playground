package androidx.datastore.preferences.core;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C6752c;
import p212k3.AbstractC6579a;

/* JADX INFO: loaded from: classes.dex */
public final class MutablePreferences extends AbstractC6579a {

    /* JADX INFO: renamed from: a */
    public final Map<AbstractC6579a.a<?>, Object> f5782a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f5783b;

    public MutablePreferences() {
        this(false, 3);
    }

    public MutablePreferences(Map<AbstractC6579a.a<?>, Object> map, boolean z10) {
        C5207g.m11111f(map, "preferencesMap");
        this.f5782a = map;
        this.f5783b = new AtomicBoolean(z10);
    }

    public /* synthetic */ MutablePreferences(boolean z10, int i10) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : null, (i10 & 2) != 0 ? true : z10);
    }

    @Override // p212k3.AbstractC6579a
    /* JADX INFO: renamed from: a */
    public final Map<AbstractC6579a.a<?>, Object> mo3049a() {
        Map<AbstractC6579a.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.f5782a);
        C5207g.m11110e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // p212k3.AbstractC6579a
    /* JADX INFO: renamed from: b */
    public final <T> T mo3050b(AbstractC6579a.a<T> aVar) {
        C5207g.m11111f(aVar, "key");
        return (T) this.f5782a.get(aVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m3051c() {
        if (!(!this.f5783b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public final <T> void m3052d(AbstractC6579a.a<T> aVar, T t10) {
        C5207g.m11111f(aVar, "key");
        m3053e(aVar, t10);
    }

    /* JADX INFO: renamed from: e */
    public final void m3053e(AbstractC6579a.a<?> aVar, Object obj) {
        C5207g.m11111f(aVar, "key");
        m3051c();
        Map<AbstractC6579a.a<?>, Object> map = this.f5782a;
        if (obj == null) {
            m3051c();
            map.remove(aVar);
        } else {
            if (!(obj instanceof Set)) {
                map.put(aVar, obj);
                return;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(C6752c.m13457y0((Iterable) obj));
            C5207g.m11110e(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, setUnmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MutablePreferences)) {
            return false;
        }
        return C5207g.m11106a(this.f5782a, ((MutablePreferences) obj).f5782a);
    }

    public final int hashCode() {
        return this.f5782a.hashCode();
    }

    public final String toString() {
        return C6752c.m13430X(this.f5782a.entrySet(), ",\n", "{\n", "\n}", new InterfaceC2052l<Map.Entry<AbstractC6579a.a<?>, Object>, CharSequence>() { // from class: androidx.datastore.preferences.core.MutablePreferences.toString.1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(Map.Entry<AbstractC6579a.a<?>, Object> entry) {
                Map.Entry<AbstractC6579a.a<?>, Object> entry2 = entry;
                C5207g.m11111f(entry2, "entry");
                return "  " + entry2.getKey().f37403a + " = " + entry2.getValue();
            }
        }, 24);
    }
}
