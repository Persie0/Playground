package com.lingq.core.database.entity;

import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class StreakEntity {
    public static final C1349m0 Companion = new C1349m0();

    /* JADX INFO: renamed from: a */
    public final String f17455a;

    /* JADX INFO: renamed from: b */
    public final Integer f17456b;

    /* JADX INFO: renamed from: c */
    public final Double f17457c;

    /* JADX INFO: renamed from: d */
    public final Integer f17458d;

    /* JADX INFO: renamed from: e */
    public final Boolean f17459e;

    /* JADX INFO: renamed from: f */
    public final String f17460f;

    public /* synthetic */ StreakEntity(int i, String str, Integer num, Double d, Integer num2, Boolean bool, String str2) {
        if (31 != (i & 31)) {
            n3c.m17204b(i, 31, StreakEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17455a = str;
        this.f17456b = num;
        this.f17457c = d;
        this.f17458d = num2;
        this.f17459e = bool;
        if ((i & 32) == 0) {
            this.f17460f = null;
        } else {
            this.f17460f = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakEntity)) {
            return false;
        }
        StreakEntity streakEntity = (StreakEntity) obj;
        return fa4.m11650l(this.f17455a, streakEntity.f17455a) && fa4.m11650l(this.f17456b, streakEntity.f17456b) && fa4.m11650l(this.f17457c, streakEntity.f17457c) && fa4.m11650l(this.f17458d, streakEntity.f17458d) && fa4.m11650l(this.f17459e, streakEntity.f17459e) && fa4.m11650l(this.f17460f, streakEntity.f17460f);
    }

    public final int hashCode() {
        int iHashCode = this.f17455a.hashCode() * 31;
        Integer num = this.f17456b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.f17457c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.f17458d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f17459e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f17460f;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "StreakEntity(language=" + this.f17455a + ", streakDays=" + this.f17456b + ", coins=" + this.f17457c + ", latestStreakDays=" + this.f17458d + ", isStreakBroken=" + this.f17459e + ", brokenStreakDate=" + this.f17460f + ")";
    }

    public StreakEntity(String str, Integer num, Double d, Integer num2, Boolean bool, String str2) {
        this.f17455a = str;
        this.f17456b = num;
        this.f17457c = d;
        this.f17458d = num2;
        this.f17459e = bool;
        this.f17460f = str2;
    }
}
