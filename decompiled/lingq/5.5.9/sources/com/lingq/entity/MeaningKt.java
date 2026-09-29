package com.lingq.entity;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.List;
import kotlin.collections.C6752c;

/* JADX INFO: loaded from: classes.dex */
public final class MeaningKt {
    /* JADX INFO: renamed from: a */
    public static final String m9387a(List<Meaning> list) {
        C5207g.m11111f(list, "<this>");
        return C6752c.m13430X(list, " ", null, null, new InterfaceC2052l<Meaning, CharSequence>() { // from class: com.lingq.entity.MeaningKt$toMeaningTerms$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(Meaning meaning) {
                String str;
                Meaning meaning2 = meaning;
                return (meaning2 == null || (str = meaning2.f17278c) == null) ? "" : str;
            }
        }, 30);
    }
}
