package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.common.collect.q */
/* JADX INFO: loaded from: classes.dex */
public final class C3198q extends AbstractC3185e0<Map.Entry<Object, Object>, Object> {
    public C3198q(Iterator it) {
        super(it);
    }

    @Override // com.google.common.collect.AbstractC3185e0
    /* JADX INFO: renamed from: a */
    public final Object mo9129a(Map.Entry<Object, Object> entry) {
        return entry.getValue();
    }
}
