package com.lingq.feature.review;

/* JADX INFO: renamed from: com.lingq.feature.review.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2636a {

    /* JADX INFO: renamed from: a */
    public final int f31911a;

    /* JADX INFO: renamed from: b */
    public final ReviewAnimationType f31912b;

    public C2636a(int i, ReviewAnimationType reviewAnimationType) {
        reviewAnimationType.getClass();
        this.f31911a = i;
        this.f31912b = reviewAnimationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2636a)) {
            return false;
        }
        C2636a c2636a = (C2636a) obj;
        return this.f31911a == c2636a.f31911a && this.f31912b == c2636a.f31912b;
    }

    public final int hashCode() {
        return this.f31912b.hashCode() + (Integer.hashCode(this.f31911a) * 31);
    }

    public final String toString() {
        return "ReviewAnimationKey(progress=" + this.f31911a + ", type=" + this.f31912b + ")";
    }
}
