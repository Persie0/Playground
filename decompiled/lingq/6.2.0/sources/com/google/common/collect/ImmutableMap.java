package com.google.common.collect;

import com.google.android.gms.internal.measurement.zzabw;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import p000.AbstractC3489q9;
import p000.bga;
import p000.r2d;
import p000.xnb;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: a */
    public transient ImmutableSet f13396a;

    /* JADX INFO: renamed from: b */
    public transient ImmutableSet f13397b;

    /* JADX INFO: renamed from: c */
    public transient ImmutableCollection f13398c;

    /* JADX INFO: loaded from: classes2.dex */
    public static class SerializedForm<K, V> implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Object[] f13399a;

        /* JADX INFO: renamed from: b */
        public final Object[] f13400b;

        public SerializedForm(ImmutableMap immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            bga it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i] = entry.getKey();
                objArr2[i] = entry.getValue();
                i++;
            }
            this.f13399a = objArr;
            this.f13400b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.f13399a;
            boolean z = objArr instanceof ImmutableSet;
            Object[] objArr2 = this.f13400b;
            if (!z) {
                C1097m c1097m = new C1097m(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    c1097m.m6340b(objArr[i], objArr2[i]);
                }
                return c1097m.m6339a(true);
            }
            ImmutableSet immutableSet = (ImmutableSet) objArr;
            C1097m c1097m2 = new C1097m(immutableSet.size());
            bga it = immutableSet.iterator();
            bga it2 = ((ImmutableCollection) objArr2).iterator();
            while (it.hasNext()) {
                c1097m2.m6340b(it.next(), it2.next());
            }
            return c1097m2.m6339a(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1097m m6295a() {
        return new C1097m(4);
    }

    /* JADX INFO: renamed from: b */
    public static C1097m m6296b(int i) {
        AbstractC3489q9.m19779i(i, "expectedSize");
        return new C1097m(i);
    }

    /* JADX INFO: renamed from: c */
    public static ImmutableMap m6297c(Map map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            return (ImmutableMap) map;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        C1097m c1097m = new C1097m(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        c1097m.m6341c(setEntrySet);
        return c1097m.m6339a(true);
    }

    /* JADX INFO: renamed from: f */
    public static ImmutableMap m6298f() {
        return RegularImmutableMap.f13419g;
    }

    /* JADX INFO: renamed from: g */
    public static ImmutableMap m6299g(zzabw zzabwVar, Object obj, zzabw zzabwVar2, Object obj2, zzabw zzabwVar3, Object obj3, zzabw zzabwVar4, Object obj4, zzabw zzabwVar5, Object obj5, zzabw zzabwVar6, Object obj6, zzabw zzabwVar7, Object obj7) {
        AbstractC3489q9.m19778h(zzabwVar, obj);
        AbstractC3489q9.m19778h(zzabwVar2, obj2);
        AbstractC3489q9.m19778h(zzabwVar3, obj3);
        AbstractC3489q9.m19778h(zzabwVar4, obj4);
        AbstractC3489q9.m19778h(zzabwVar5, obj5);
        AbstractC3489q9.m19778h(zzabwVar6, obj6);
        AbstractC3489q9.m19778h(zzabwVar7, obj7);
        return RegularImmutableMap.m6320l(7, new Object[]{zzabwVar, obj, zzabwVar2, obj2, zzabwVar3, obj3, zzabwVar4, obj4, zzabwVar5, obj5, zzabwVar6, obj6, zzabwVar7, obj7}, null);
    }

    /* JADX INFO: renamed from: h */
    public static ImmutableMap m6300h(String str, Object obj, String str2, Object obj2) {
        AbstractC3489q9.m19778h(str, obj);
        AbstractC3489q9.m19778h(str2, obj2);
        return RegularImmutableMap.m6320l(2, new Object[]{str, obj, str2, obj2}, null);
    }

    /* JADX INFO: renamed from: i */
    public static ImmutableMap m6301i(String str, String str2, String str3, String str4) {
        return RegularImmutableMap.m6320l(4, new Object[]{"Purpose1", str, "Purpose3", str2, "Purpose4", str3, "Purpose7", str4}, null);
    }

    /* JADX INFO: renamed from: j */
    public static ImmutableMap m6302j(String str, String str2, String str3, String str4, String str5) {
        return RegularImmutableMap.m6320l(5, new Object[]{"AuthorizePurpose1", str, "AuthorizePurpose3", str2, "AuthorizePurpose4", str3, "AuthorizePurpose7", str4, "PurposeDiagnostics", str5}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.f13396a;
        if (immutableSet != null) {
            return immutableSet;
        }
        RegularImmutableMap regularImmutableMap = (RegularImmutableMap) this;
        RegularImmutableMap.EntrySet entrySet = new RegularImmutableMap.EntrySet(regularImmutableMap, regularImmutableMap.f13421e, regularImmutableMap.f13422f);
        this.f13396a = entrySet;
        return entrySet;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet keySet() {
        ImmutableSet immutableSet = this.f13397b;
        if (immutableSet != null) {
            return immutableSet;
        }
        RegularImmutableMap regularImmutableMap = (RegularImmutableMap) this;
        RegularImmutableMap.KeySet keySet = new RegularImmutableMap.KeySet(regularImmutableMap, new RegularImmutableMap.KeysOrValuesAsList(regularImmutableMap.f13421e, 0, regularImmutableMap.f13422f));
        this.f13397b = keySet;
        return keySet;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return xnb.m24620a(obj, this);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return r2d.m20264d(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.f13398c;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        RegularImmutableMap regularImmutableMap = (RegularImmutableMap) this;
        RegularImmutableMap.KeysOrValuesAsList keysOrValuesAsList = new RegularImmutableMap.KeysOrValuesAsList(regularImmutableMap.f13421e, 1, regularImmutableMap.f13422f);
        this.f13398c = keysOrValuesAsList;
        return keysOrValuesAsList;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return xnb.m24621b(this);
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
