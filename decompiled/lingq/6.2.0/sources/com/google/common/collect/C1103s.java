package com.google.common.collect;

import java.util.TreeMap;
import p000.bna;
import p000.vf5;

/* JADX INFO: renamed from: com.google.common.collect.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C1103s {
    /* JADX INFO: renamed from: a */
    public final vf5 m6348a() {
        TreeMap treeMap = new TreeMap(NaturalOrdering.f13415a);
        MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier();
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = new Multimaps$CustomListMultimap();
        bna.m3969q(treeMap.isEmpty());
        multimaps$CustomListMultimap.f13381d = treeMap;
        multimaps$CustomListMultimap.f13414f = multimapBuilder$ArrayListSupplier;
        return multimaps$CustomListMultimap;
    }
}
