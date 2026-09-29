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
import p000.g98;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultWords {
    public static final C1620a5 Companion = new C1620a5();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f21734b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new g98(26))};

    /* JADX INFO: renamed from: a */
    public final List f21735a;

    public /* synthetic */ ResultWords(int i, List list) {
        if ((i & 1) == 0) {
            this.f21735a = EmptyList.f47638a;
        } else {
            this.f21735a = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m8403a() {
        return this.f21735a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultWords) && fa4.m11650l(this.f21735a, ((ResultWords) obj).f21735a);
    }

    public final int hashCode() {
        return this.f21735a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultWords(words=", ")", this.f21735a);
    }

    public ResultWords(ArrayList arrayList) {
        this.f21735a = arrayList;
    }
}
