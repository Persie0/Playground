package p068d9;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: d9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5087a extends AbstractC5091e {

    /* JADX INFO: renamed from: b */
    public final long f33023b;

    /* JADX INFO: renamed from: c */
    public final int f33024c;

    /* JADX INFO: renamed from: d */
    public final int f33025d;

    /* JADX INFO: renamed from: e */
    public final long f33026e;

    /* JADX INFO: renamed from: f */
    public final int f33027f;

    public C5087a(long j10, int i10, int i11, long j11, int i12) {
        this.f33023b = j10;
        this.f33024c = i10;
        this.f33025d = i11;
        this.f33026e = j11;
        this.f33027f = i12;
    }

    @Override // p068d9.AbstractC5091e
    /* JADX INFO: renamed from: a */
    public final int mo10844a() {
        return this.f33025d;
    }

    @Override // p068d9.AbstractC5091e
    /* JADX INFO: renamed from: b */
    public final long mo10845b() {
        return this.f33026e;
    }

    @Override // p068d9.AbstractC5091e
    /* JADX INFO: renamed from: c */
    public final int mo10846c() {
        return this.f33024c;
    }

    @Override // p068d9.AbstractC5091e
    /* JADX INFO: renamed from: d */
    public final int mo10847d() {
        return this.f33027f;
    }

    @Override // p068d9.AbstractC5091e
    /* JADX INFO: renamed from: e */
    public final long mo10848e() {
        return this.f33023b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5091e)) {
            return false;
        }
        AbstractC5091e abstractC5091e = (AbstractC5091e) obj;
        return this.f33023b == abstractC5091e.mo10848e() && this.f33024c == abstractC5091e.mo10846c() && this.f33025d == abstractC5091e.mo10844a() && this.f33026e == abstractC5091e.mo10845b() && this.f33027f == abstractC5091e.mo10847d();
    }

    public final int hashCode() {
        long j10 = this.f33023b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f33024c) * 1000003) ^ this.f33025d) * 1000003;
        long j11 = this.f33026e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f33027f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f33023b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f33024c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f33025d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f33026e);
        sb2.append(", maxBlobByteSizePerRow=");
        return C0166e.m768o(sb2, this.f33027f, "}");
    }
}
