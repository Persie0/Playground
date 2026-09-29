package com.lingq.core.domain.model.onboarding;

import p000.ey8;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RatingController {
    public static final C1483a Companion = new C1483a();

    /* JADX INFO: renamed from: a */
    public long f19548a = 0;

    /* JADX INFO: renamed from: b */
    public long f19549b = 0;

    /* JADX INFO: renamed from: c */
    public int f19550c = 0;

    /* JADX INFO: renamed from: d */
    public int f19551d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f19552e = false;

    /* JADX INFO: renamed from: a */
    public final int m8107a() {
        return this.f19550c;
    }

    /* JADX INFO: renamed from: b */
    public final long m8108b() {
        return this.f19548a;
    }

    /* JADX INFO: renamed from: c */
    public final long m8109c() {
        return this.f19549b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8110d() {
        return this.f19552e;
    }

    /* JADX INFO: renamed from: e */
    public final int m8111e() {
        return this.f19551d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingController)) {
            return false;
        }
        RatingController ratingController = (RatingController) obj;
        return this.f19548a == ratingController.f19548a && this.f19549b == ratingController.f19549b && this.f19550c == ratingController.f19550c && this.f19551d == ratingController.f19551d && this.f19552e == ratingController.f19552e;
    }

    /* JADX INFO: renamed from: f */
    public final void m8112f(int i) {
        this.f19550c = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m8113g(long j) {
        this.f19548a = j;
    }

    /* JADX INFO: renamed from: h */
    public final void m8114h(long j) {
        this.f19549b = j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19552e) + wq1.m24106b(this.f19551d, wq1.m24106b(this.f19550c, ux5.m22981d(this.f19549b, Long.hashCode(this.f19548a) * 31, 31), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final void m8115i(int i) {
        this.f19551d = i;
    }

    public final String toString() {
        long j = this.f19548a;
        long j2 = this.f19549b;
        int i = this.f19550c;
        int i2 = this.f19551d;
        boolean z = this.f19552e;
        StringBuilder sbM22996s = ux5.m22996s(j, "RatingController(firstDisplayDate=", ", lastDisplayDate=");
        sbM22996s.append(j2);
        sbM22996s.append(", displayCount=");
        sbM22996s.append(i);
        sbM22996s.append(", lessonsCompleted=");
        sbM22996s.append(i2);
        sbM22996s.append(", lastResponseIsYes=");
        sbM22996s.append(z);
        sbM22996s.append(")");
        return sbM22996s.toString();
    }
}
