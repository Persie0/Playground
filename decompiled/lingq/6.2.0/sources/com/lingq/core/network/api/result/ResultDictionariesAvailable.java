package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultDictionariesAvailable {
    public static final C1630c1 Companion = new C1630c1();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f20819b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(5))};

    /* JADX INFO: renamed from: a */
    public final List f20820a;

    public /* synthetic */ ResultDictionariesAvailable(int i, List list) {
        if ((i & 1) == 0) {
            this.f20820a = EmptyList.f47638a;
        } else {
            this.f20820a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultDictionariesAvailable) && fa4.m11650l(this.f20820a, ((ResultDictionariesAvailable) obj).f20820a);
    }

    public final int hashCode() {
        return this.f20820a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultDictionariesAvailable(dictionaries=", ")", this.f20820a);
    }
}
