package androidx.datastore.preferences;

import androidx.datastore.preferences.core.MutablePreferences;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p168i3.C6174b;
import p212k3.AbstractC6579a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Li3/b;", "sharedPrefs", "Lk3/a;", "currentData", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
@InterfaceC10224c(m19205c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", m19206f = "SharedPreferencesMigration.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements InterfaceC2057q<C6174b, AbstractC6579a, InterfaceC9968c<? super AbstractC6579a>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C6174b f5773e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ AbstractC6579a f5774f;

    public SharedPreferencesMigrationKt$getMigrationFunction$1(InterfaceC9968c<? super SharedPreferencesMigrationKt$getMigrationFunction$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(C6174b c6174b, AbstractC6579a abstractC6579a, InterfaceC9968c<? super AbstractC6579a> interfaceC9968c) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(interfaceC9968c);
        sharedPreferencesMigrationKt$getMigrationFunction$1.f5773e = c6174b;
        sharedPreferencesMigrationKt$getMigrationFunction$1.f5774f = abstractC6579a;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        C6174b c6174b = this.f5773e;
        AbstractC6579a abstractC6579a = this.f5774f;
        Set<AbstractC6579a.a<?>> setKeySet = abstractC6579a.mo3049a().keySet();
        ArrayList arrayList = new ArrayList(C9325m.m17681z(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC6579a.a) it.next()).f37403a);
        }
        Map<String, ?> all = c6174b.f36012a.getAll();
        C5207g.m11110e(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        loop1: while (true) {
            while (true) {
                boolean zContains = true;
                if (!it2.hasNext()) {
                    break loop1;
                }
                Map.Entry<String, ?> next = it2.next();
                String key = next.getKey();
                Set<String> set = c6174b.f36013b;
                if (set != null) {
                    zContains = set.contains(key);
                }
                if (zContains) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C7499b.m14941g0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = C6752c.m13457y0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it3 = linkedHashMap2.entrySet().iterator();
        loop4: while (true) {
            while (true) {
                if (!it3.hasNext()) {
                    break loop4;
                }
                Map.Entry entry2 = (Map.Entry) it3.next();
                if (Boolean.valueOf(!arrayList.contains((String) entry2.getKey())).booleanValue()) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        MutablePreferences mutablePreferences = new MutablePreferences((Map<AbstractC6579a.a<?>, Object>) C6753d.m13467T0(abstractC6579a.mo3049a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                mutablePreferences.m3053e(C7499b.m14938f(str), value2);
            } else if (value2 instanceof Float) {
                C5207g.m11111f(str, "name");
                mutablePreferences.m3053e(new AbstractC6579a.a<>(str), value2);
            } else if (value2 instanceof Integer) {
                mutablePreferences.m3053e(C7499b.m14922T(str), value2);
            } else if (value2 instanceof Long) {
                C5207g.m11111f(str, "name");
                mutablePreferences.m3053e(new AbstractC6579a.a<>(str), value2);
            } else if (value2 instanceof String) {
                mutablePreferences.m3053e(C7499b.m14975y0(str), value2);
            } else if (value2 instanceof Set) {
                C5207g.m11111f(str, "name");
                AbstractC6579a.a<?> aVar = new AbstractC6579a.a<>(str);
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                }
                mutablePreferences.m3053e(aVar, (Set) value2);
            } else {
                continue;
            }
        }
        return new MutablePreferences((Map<AbstractC6579a.a<?>, Object>) C6753d.m13467T0(mutablePreferences.mo3049a()), true);
    }
}
