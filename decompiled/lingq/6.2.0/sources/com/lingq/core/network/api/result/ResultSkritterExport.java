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
public final class ResultSkritterExport {
    public static final C1742u3 Companion = new C1742u3();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f21513b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new g98(4))};

    /* JADX INFO: renamed from: a */
    public final List f21514a;

    public /* synthetic */ ResultSkritterExport(int i, List list) {
        if ((i & 1) == 0) {
            this.f21514a = EmptyList.f47638a;
        } else {
            this.f21514a = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m8392a() {
        return this.f21514a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultSkritterExport) && fa4.m11650l(this.f21514a, ((ResultSkritterExport) obj).f21514a);
    }

    public final int hashCode() {
        return this.f21514a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultSkritterExport(vocabs=", ")", this.f21514a);
    }
}
