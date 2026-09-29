package com.lingq.core.network.api.requests;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.m78;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestTopics {
    public static final C1611y0 Companion = new C1611y0();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f20456b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new m78(6))};

    /* JADX INFO: renamed from: a */
    public final List f20457a;

    public /* synthetic */ RequestTopics(int i, List list) {
        if ((i & 1) == 0) {
            this.f20457a = null;
        } else {
            this.f20457a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestTopics) && fa4.m11650l(this.f20457a, ((RequestTopics) obj).f20457a);
    }

    public final int hashCode() {
        List list = this.f20457a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return e65.m10874f("RequestTopics(tabs=", ")", this.f20457a);
    }

    public RequestTopics(List list) {
        this.f20457a = list;
    }
}
