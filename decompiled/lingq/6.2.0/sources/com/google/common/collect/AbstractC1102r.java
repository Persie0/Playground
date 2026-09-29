package com.google.common.collect;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import p000.gj3;
import p000.wg5;
import p000.yg5;

/* JADX INFO: renamed from: com.google.common.collect.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1102r {
    /* JADX INFO: renamed from: a */
    public static List m6346a(List list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).mo6292D();
        }
        if (list instanceof yg5) {
            return ((yg5) list).m25123d();
        }
        return list instanceof RandomAccess ? new wg5(list) : new yg5(list);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractList m6347b(List list, gj3 gj3Var) {
        return list instanceof RandomAccess ? new Lists$TransformingRandomAccessList(list, gj3Var) : new Lists$TransformingSequentialList(list, gj3Var);
    }
}
