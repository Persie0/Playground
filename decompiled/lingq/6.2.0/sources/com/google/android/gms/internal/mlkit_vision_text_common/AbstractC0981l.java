package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import p000.lkd;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0981l {
    /* JADX INFO: renamed from: a */
    public static AbstractList m5477a(List list, lkd lkdVar) {
        return list instanceof RandomAccess ? new zzbr(list, lkdVar) : new zzbt(list, lkdVar);
    }
}
