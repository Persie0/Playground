package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.common.collect.i */
/* JADX INFO: loaded from: classes2.dex */
public class C1093i extends C1089e implements SortedSet {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Multimaps$CustomListMultimap f13464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1093i(Multimaps$CustomListMultimap multimaps$CustomListMultimap, SortedMap sortedMap) {
        super(multimaps$CustomListMultimap, sortedMap);
        this.f13464c = multimaps$CustomListMultimap;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo6333d().comparator();
    }

    /* JADX INFO: renamed from: d */
    public SortedMap mo6333d() {
        return (SortedMap) this.f13458a;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo6333d().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C1093i(this.f13464c, mo6333d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo6333d().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C1093i(this.f13464c, mo6333d().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C1093i(this.f13464c, mo6333d().tailMap(obj));
    }
}
