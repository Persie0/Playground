package com.lingq.core.domain.model.offer;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.tx5;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class OfferBanner {
    public static final C1482a Companion = new C1482a();

    /* JADX INFO: renamed from: d */
    public static final cs4[] f19544d = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new tx5(6)), null, null};

    /* JADX INFO: renamed from: a */
    public final BannerType f19545a;

    /* JADX INFO: renamed from: b */
    public final String f19546b;

    /* JADX INFO: renamed from: c */
    public final String f19547c;

    public /* synthetic */ OfferBanner(int i, BannerType bannerType, String str, String str2) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, OfferBanner$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19545a = bannerType;
        this.f19546b = str;
        this.f19547c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m8104a() {
        return this.f19546b;
    }

    /* JADX INFO: renamed from: b */
    public final String m8105b() {
        return this.f19547c;
    }

    /* JADX INFO: renamed from: c */
    public final BannerType m8106c() {
        return this.f19545a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferBanner)) {
            return false;
        }
        OfferBanner offerBanner = (OfferBanner) obj;
        return this.f19545a == offerBanner.f19545a && fa4.m11650l(this.f19546b, offerBanner.f19546b) && fa4.m11650l(this.f19547c, offerBanner.f19547c);
    }

    public final int hashCode() {
        return this.f19547c.hashCode() + ux5.m22980c(this.f19545a.hashCode() * 31, this.f19546b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferBanner(type=");
        sb.append(this.f19545a);
        sb.append(", imageUrl=");
        sb.append(this.f19546b);
        sb.append(", locale=");
        return AbstractC3393o1.m17738m(sb, this.f19547c, ")");
    }

    public OfferBanner(BannerType bannerType, String str, String str2) {
        bannerType.getClass();
        str.getClass();
        str2.getClass();
        this.f19545a = bannerType;
        this.f19546b = str;
        this.f19547c = str2;
    }
}
