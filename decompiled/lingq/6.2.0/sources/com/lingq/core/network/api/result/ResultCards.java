package com.lingq.core.network.api.result;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.m78;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCards {
    public static final C1783y Companion = new C1783y();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f20654b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new m78(21))};

    /* JADX INFO: renamed from: a */
    public final List f20655a;

    public /* synthetic */ ResultCards(int i, List list) {
        if ((i & 1) == 0) {
            this.f20655a = EmptyList.f47638a;
        } else {
            this.f20655a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultCards) && fa4.m11650l(this.f20655a, ((ResultCards) obj).f20655a);
    }

    public final int hashCode() {
        return this.f20655a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultCards(cards=", ")", this.f20655a);
    }

    public ResultCards(ArrayList arrayList) {
        this.f20655a = arrayList;
    }
}
