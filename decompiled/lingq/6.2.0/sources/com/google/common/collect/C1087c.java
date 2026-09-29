package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import p000.C0831c1;
import p000.fq5;

/* JADX INFO: renamed from: com.google.common.collect.c */
/* JADX INFO: loaded from: classes2.dex */
public class C1087c extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public transient C1085a f13449a;

    /* JADX INFO: renamed from: b */
    public transient fq5 f13450b;

    /* JADX INFO: renamed from: c */
    public final transient Map f13451c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Multimaps$CustomListMultimap f13452d;

    public C1087c(Multimaps$CustomListMultimap multimaps$CustomListMultimap, Map map) {
        this.f13452d = multimaps$CustomListMultimap;
        this.f13451c = map;
    }

    /* JADX INFO: renamed from: a */
    public final Map.Entry m6327a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = this.f13452d;
        return new ImmutableEntry(key, z ? new C0831c1(multimaps$CustomListMultimap, key, list, null) : new C1095k(multimaps$CustomListMultimap, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = this.f13452d;
        if (this.f13451c == multimaps$CustomListMultimap.f13381d) {
            multimaps$CustomListMultimap.m6272e();
            return;
        }
        C1086b c1086b = new C1086b(this);
        while (c1086b.hasNext()) {
            c1086b.next();
            c1086b.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f13451c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1085a c1085a = this.f13449a;
        if (c1085a != null) {
            return c1085a;
        }
        C1085a c1085a2 = new C1085a(this);
        this.f13449a = c1085a2;
        return c1085a2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f13451c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f13451c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = this.f13452d;
        return z ? new C0831c1(multimaps$CustomListMultimap, obj, list, null) : new C1095k(multimaps$CustomListMultimap, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f13451c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = this.f13452d;
        Set set = multimaps$CustomListMultimap.f36547a;
        if (set != null) {
            return set;
        }
        Set setMo6318c = multimaps$CustomListMultimap.mo6318c();
        multimaps$CustomListMultimap.f36547a = setMo6318c;
        return setMo6318c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f13451c.remove(obj);
        if (collection == null) {
            return null;
        }
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = this.f13452d;
        List list = (List) multimaps$CustomListMultimap.f13414f.get();
        list.addAll(collection);
        multimaps$CustomListMultimap.f13382e -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13451c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f13451c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        fq5 fq5Var = this.f13450b;
        if (fq5Var != null) {
            return fq5Var;
        }
        fq5 fq5Var2 = new fq5(this, 0);
        this.f13450b = fq5Var2;
        return fq5Var2;
    }
}
