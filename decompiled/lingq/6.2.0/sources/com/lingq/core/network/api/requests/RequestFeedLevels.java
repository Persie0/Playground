package com.lingq.core.network.api.requests;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.tx5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestFeedLevels {
    public static final C1598s Companion = new C1598s();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f20358b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new tx5(23))};

    /* JADX INFO: renamed from: a */
    public final List f20359a;

    public /* synthetic */ RequestFeedLevels(int i, List list) {
        if ((i & 1) == 0) {
            this.f20359a = null;
        } else {
            this.f20359a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestFeedLevels) && fa4.m11650l(this.f20359a, ((RequestFeedLevels) obj).f20359a);
    }

    public final int hashCode() {
        List list = this.f20359a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return e65.m10874f("RequestFeedLevels(feedLevels=", ")", this.f20359a);
    }

    public RequestFeedLevels(List list) {
        this.f20359a = list;
    }
}
