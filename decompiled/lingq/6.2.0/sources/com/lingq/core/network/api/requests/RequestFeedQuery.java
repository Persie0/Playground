package com.lingq.core.network.api.requests;

import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.tx5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestFeedQuery {
    public static final C1600t Companion = new C1600t();

    /* JADX INFO: renamed from: d */
    public static final cs4[] f20360d = {null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new tx5(24))};

    /* JADX INFO: renamed from: a */
    public boolean f20361a;

    /* JADX INFO: renamed from: b */
    public boolean f20362b;

    /* JADX INFO: renamed from: c */
    public Set f20363c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestFeedQuery)) {
            return false;
        }
        RequestFeedQuery requestFeedQuery = (RequestFeedQuery) obj;
        return this.f20361a == requestFeedQuery.f20361a && this.f20362b == requestFeedQuery.f20362b && fa4.m11650l(this.f20363c, requestFeedQuery.f20363c);
    }

    public final int hashCode() {
        return this.f20363c.hashCode() + g9a.m12428e(Boolean.hashCode(this.f20361a) * 31, 31, this.f20362b);
    }

    public final String toString() {
        boolean z = this.f20361a;
        boolean z2 = this.f20362b;
        Set set = this.f20363c;
        StringBuilder sbM13357g = hn1.m13357g("RequestFeedQuery(isFriendsOnly=", ", isIncludeMedia=", ", level=", z, z2);
        sbM13357g.append(set);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
