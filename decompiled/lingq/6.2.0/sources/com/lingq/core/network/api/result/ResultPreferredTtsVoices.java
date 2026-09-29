package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultPreferredTtsVoices {
    public static final C1676j3 Companion = new C1676j3();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f21466c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(28))};

    /* JADX INFO: renamed from: a */
    public final int f21467a;

    /* JADX INFO: renamed from: b */
    public final List f21468b;

    public /* synthetic */ ResultPreferredTtsVoices(int i, int i2, List list) {
        this.f21467a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f21468b = EmptyList.f47638a;
        } else {
            this.f21468b = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m8386a() {
        return this.f21468b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultPreferredTtsVoices)) {
            return false;
        }
        ResultPreferredTtsVoices resultPreferredTtsVoices = (ResultPreferredTtsVoices) obj;
        return this.f21467a == resultPreferredTtsVoices.f21467a && fa4.m11650l(this.f21468b, resultPreferredTtsVoices.f21468b);
    }

    public final int hashCode() {
        return this.f21468b.hashCode() + (Integer.hashCode(this.f21467a) * 31);
    }

    public final String toString() {
        return "ResultPreferredTtsVoices(count=" + this.f21467a + ", results=" + this.f21468b + ")";
    }
}
