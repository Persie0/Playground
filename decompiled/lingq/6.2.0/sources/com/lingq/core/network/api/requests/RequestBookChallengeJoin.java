package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestBookChallengeJoin {
    public static final C1561c Companion = new C1561c();

    /* JADX INFO: renamed from: a */
    public final int f20316a;

    /* JADX INFO: renamed from: b */
    public final Integer f20317b;

    public /* synthetic */ RequestBookChallengeJoin(int i, int i2, Integer num) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, RequestBookChallengeJoin$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20316a = i2;
        if ((i & 2) == 0) {
            this.f20317b = null;
        } else {
            this.f20317b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestBookChallengeJoin)) {
            return false;
        }
        RequestBookChallengeJoin requestBookChallengeJoin = (RequestBookChallengeJoin) obj;
        return this.f20316a == requestBookChallengeJoin.f20316a && fa4.m11650l(this.f20317b, requestBookChallengeJoin.f20317b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20316a) * 31;
        Integer num = this.f20317b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "RequestBookChallengeJoin(bookId=" + this.f20316a + ", replaceBookId=" + this.f20317b + ")";
    }

    public RequestBookChallengeJoin(int i, Integer num) {
        this.f20316a = i;
        this.f20317b = num;
    }

    public /* synthetic */ RequestBookChallengeJoin(int i) {
        this(i, null);
    }
}
