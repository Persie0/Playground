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
public final class ResultPhrases {
    public static final C1652f3 Companion = new C1652f3();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f21390b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(25))};

    /* JADX INFO: renamed from: a */
    public final List f21391a;

    public /* synthetic */ ResultPhrases(int i, List list) {
        if ((i & 1) == 0) {
            this.f21391a = EmptyList.f47638a;
        } else {
            this.f21391a = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m8380a() {
        return this.f21391a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultPhrases) && fa4.m11650l(this.f21391a, ((ResultPhrases) obj).f21391a);
    }

    public final int hashCode() {
        return this.f21391a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultPhrases(phrases=", ")", this.f21391a);
    }
}
