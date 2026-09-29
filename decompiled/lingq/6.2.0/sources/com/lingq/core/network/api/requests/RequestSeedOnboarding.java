package com.lingq.core.network.api.requests;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.m78;
import p000.n3c;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestSeedOnboarding {
    public static final C1607w0 Companion = new C1607w0();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f20453b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new m78(5))};

    /* JADX INFO: renamed from: a */
    public final List f20454a;

    public /* synthetic */ RequestSeedOnboarding(int i, List list) {
        if (1 == (i & 1)) {
            this.f20454a = list;
        } else {
            n3c.m17204b(i, 1, RequestSeedOnboarding$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestSeedOnboarding) && fa4.m11650l(this.f20454a, ((RequestSeedOnboarding) obj).f20454a);
    }

    public final int hashCode() {
        return this.f20454a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("RequestSeedOnboarding(survey=", ")", this.f20454a);
    }

    public RequestSeedOnboarding(ArrayList arrayList) {
        this.f20454a = arrayList;
    }
}
