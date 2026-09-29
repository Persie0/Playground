package com.lingq.core.network.api.result.worldcup;

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
public final class ResultCupPrizes {
    public static final C1769n Companion = new C1769n();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f21797b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(2))};

    /* JADX INFO: renamed from: a */
    public final List f21798a;

    public /* synthetic */ ResultCupPrizes(int i, List list) {
        if ((i & 1) == 0) {
            this.f21798a = EmptyList.f47638a;
        } else {
            this.f21798a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultCupPrizes) && fa4.m11650l(this.f21798a, ((ResultCupPrizes) obj).f21798a);
    }

    public final int hashCode() {
        return this.f21798a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultCupPrizes(prizes=", ")", this.f21798a);
    }
}
