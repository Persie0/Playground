package com.lingq.core.network.api.result.worldcup;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupJoin {
    public static final C1763h Companion = new C1763h();

    /* JADX INFO: renamed from: a */
    public final boolean f21769a;

    /* JADX INFO: renamed from: b */
    public final ResultCupJoinTeam f21770b;

    /* JADX INFO: renamed from: c */
    public final boolean f21771c;

    public /* synthetic */ ResultCupJoin(int i, boolean z, ResultCupJoinTeam resultCupJoinTeam, boolean z2) {
        if ((i & 1) == 0) {
            this.f21769a = false;
        } else {
            this.f21769a = z;
        }
        if ((i & 2) == 0) {
            this.f21770b = null;
        } else {
            this.f21770b = resultCupJoinTeam;
        }
        if ((i & 4) == 0) {
            this.f21771c = false;
        } else {
            this.f21771c = z2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8416a() {
        return this.f21769a;
    }

    /* JADX INFO: renamed from: b */
    public final ResultCupJoinTeam m8417b() {
        return this.f21770b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupJoin)) {
            return false;
        }
        ResultCupJoin resultCupJoin = (ResultCupJoin) obj;
        return this.f21769a == resultCupJoin.f21769a && fa4.m11650l(this.f21770b, resultCupJoin.f21770b) && this.f21771c == resultCupJoin.f21771c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f21769a) * 31;
        ResultCupJoinTeam resultCupJoinTeam = this.f21770b;
        return Boolean.hashCode(this.f21771c) + ((iHashCode + (resultCupJoinTeam == null ? 0 : resultCupJoinTeam.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultCupJoin(created=");
        sb.append(this.f21769a);
        sb.append(", team=");
        sb.append(this.f21770b);
        sb.append(", notifications=");
        return AbstractC3393o1.m17740o(sb, this.f21771c, ")");
    }
}
