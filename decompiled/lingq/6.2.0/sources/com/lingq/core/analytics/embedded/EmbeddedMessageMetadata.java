package com.lingq.core.analytics.embedded;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class EmbeddedMessageMetadata {
    public static final C1255e Companion = new C1255e();

    /* JADX INFO: renamed from: a */
    public final String f14333a;

    /* JADX INFO: renamed from: b */
    public final long f14334b;

    /* JADX INFO: renamed from: c */
    public final int f14335c;

    /* JADX INFO: renamed from: d */
    public final boolean f14336d;

    public /* synthetic */ EmbeddedMessageMetadata(int i, int i2, long j, String str, boolean z) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, EmbeddedMessageMetadata$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f14333a = str;
        this.f14334b = j;
        this.f14335c = i2;
        this.f14336d = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m7040a() {
        return this.f14333a;
    }

    /* JADX INFO: renamed from: b */
    public final long m7041b() {
        return this.f14334b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedMessageMetadata)) {
            return false;
        }
        EmbeddedMessageMetadata embeddedMessageMetadata = (EmbeddedMessageMetadata) obj;
        return fa4.m11650l(this.f14333a, embeddedMessageMetadata.f14333a) && this.f14334b == embeddedMessageMetadata.f14334b && this.f14335c == embeddedMessageMetadata.f14335c && this.f14336d == embeddedMessageMetadata.f14336d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14336d) + wq1.m24106b(this.f14335c, ux5.m22981d(this.f14334b, this.f14333a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "EmbeddedMessageMetadata(messageId=" + this.f14333a + ", placementId=" + this.f14334b + ", campaignId=" + this.f14335c + ", isProof=" + this.f14336d + ")";
    }

    public EmbeddedMessageMetadata(int i, long j, String str, boolean z) {
        this.f14333a = str;
        this.f14334b = j;
        this.f14335c = i;
        this.f14336d = z;
    }
}
