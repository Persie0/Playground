package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import p000.AbstractC3489q9;
import p000.on9;

/* JADX INFO: loaded from: classes2.dex */
final class MultimapBuilder$ArrayListSupplier<V> implements on9, Serializable {

    /* JADX INFO: renamed from: a */
    public final int f13413a;

    public MultimapBuilder$ArrayListSupplier() {
        AbstractC3489q9.m19779i(2, "expectedValuesPerKey");
        this.f13413a = 2;
    }

    @Override // p000.on9
    public final Object get() {
        return new ArrayList(this.f13413a);
    }
}
