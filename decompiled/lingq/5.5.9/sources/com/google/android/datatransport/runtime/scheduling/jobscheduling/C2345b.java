package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.support.v4.media.session.C0166e;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2345b extends SchedulerConfig.AbstractC2343a {

    /* JADX INFO: renamed from: a */
    public final long f11784a;

    /* JADX INFO: renamed from: b */
    public final long f11785b;

    /* JADX INFO: renamed from: c */
    public final Set<SchedulerConfig.Flag> f11786c;

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$a */
    public static final class a extends SchedulerConfig.AbstractC2343a.a {

        /* JADX INFO: renamed from: a */
        public Long f11787a;

        /* JADX INFO: renamed from: b */
        public Long f11788b;

        /* JADX INFO: renamed from: c */
        public Set<SchedulerConfig.Flag> f11789c;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C2345b m6766a() {
            String strM765k = this.f11787a == null ? " delta" : "";
            if (this.f11788b == null) {
                strM765k = strM765k.concat(" maxAllowedDelay");
            }
            if (this.f11789c == null) {
                strM765k = C0166e.m765k(strM765k, " flags");
            }
            if (strM765k.isEmpty()) {
                return new C2345b(this.f11787a.longValue(), this.f11788b.longValue(), this.f11789c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    public C2345b(long j10, long j11, Set set) {
        this.f11784a = j10;
        this.f11785b = j11;
        this.f11786c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.AbstractC2343a
    /* JADX INFO: renamed from: a */
    public final long mo6763a() {
        return this.f11784a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.AbstractC2343a
    /* JADX INFO: renamed from: b */
    public final Set<SchedulerConfig.Flag> mo6764b() {
        return this.f11786c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.AbstractC2343a
    /* JADX INFO: renamed from: c */
    public final long mo6765c() {
        return this.f11785b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.AbstractC2343a)) {
            return false;
        }
        SchedulerConfig.AbstractC2343a abstractC2343a = (SchedulerConfig.AbstractC2343a) obj;
        return this.f11784a == abstractC2343a.mo6763a() && this.f11785b == abstractC2343a.mo6765c() && this.f11786c.equals(abstractC2343a.mo6764b());
    }

    public final int hashCode() {
        long j10 = this.f11784a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f11785b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f11786c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f11784a + ", maxAllowedDelay=" + this.f11785b + ", flags=" + this.f11786c + "}";
    }
}
