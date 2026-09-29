package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.g98;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTranslationGoogle {
    public static final C1683k4 Companion = new C1683k4();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f21608b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new g98(13))};

    /* JADX INFO: renamed from: a */
    public final List f21609a;

    public /* synthetic */ ResultTranslationGoogle(int i, List list) {
        if ((i & 1) == 0) {
            this.f21609a = EmptyList.f47638a;
        } else {
            this.f21609a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultTranslationGoogle) && fa4.m11650l(this.f21609a, ((ResultTranslationGoogle) obj).f21609a);
    }

    public final int hashCode() {
        return this.f21609a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultTranslationGoogle(translations=", ")", this.f21609a);
    }
}
