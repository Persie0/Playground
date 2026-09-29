package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.common.collect.h */
/* JADX INFO: loaded from: classes2.dex */
public class C1092h extends C1087c implements SortedMap {

    /* JADX INFO: renamed from: e */
    public SortedSet f13462e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Multimaps$CustomListMultimap f13463f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092h(Multimaps$CustomListMultimap multimaps$CustomListMultimap, SortedMap sortedMap) {
        super(multimaps$CustomListMultimap, sortedMap);
        this.f13463f = multimaps$CustomListMultimap;
    }

    /* JADX INFO: renamed from: b */
    public SortedSet mo6328b() {
        return new C1093i(this.f13463f, mo6330d());
    }

    @Override // com.google.common.collect.C1087c, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f13462e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo6328b = mo6328b();
        this.f13462e = sortedSetMo6328b;
        return sortedSetMo6328b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo6330d().comparator();
    }

    /* JADX INFO: renamed from: d */
    public SortedMap mo6330d() {
        return (SortedMap) this.f13451c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo6330d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C1092h(this.f13463f, mo6330d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo6330d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C1092h(this.f13463f, mo6330d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C1092h(this.f13463f, mo6330d().tailMap(obj));
    }
}
