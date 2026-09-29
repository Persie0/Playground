package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Streak;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Streak {

    /* JADX INFO: renamed from: a */
    public final String f17456a;

    /* JADX INFO: renamed from: b */
    public final Integer f17457b;

    /* JADX INFO: renamed from: c */
    public final Double f17458c;

    /* JADX INFO: renamed from: d */
    public final Integer f17459d;

    /* JADX INFO: renamed from: e */
    public final Boolean f17460e;

    public Streak(String str, Integer num, Double d10, Integer num2, Boolean bool) {
        this.f17456a = str;
        this.f17457b = num;
        this.f17458c = d10;
        this.f17459d = num2;
        this.f17460e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Streak)) {
            return false;
        }
        Streak streak = (Streak) obj;
        return C5207g.m11106a(this.f17456a, streak.f17456a) && C5207g.m11106a(this.f17457b, streak.f17457b) && C5207g.m11106a(this.f17458c, streak.f17458c) && C5207g.m11106a(this.f17459d, streak.f17459d) && C5207g.m11106a(this.f17460e, streak.f17460e);
    }

    public final int hashCode() {
        int iHashCode = this.f17456a.hashCode() * 31;
        int iHashCode2 = 0;
        Integer num = this.f17457b;
        int iHashCode3 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d10 = this.f17458c;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num2 = this.f17459d;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f17460e;
        if (bool != null) {
            iHashCode2 = bool.hashCode();
        }
        return iHashCode5 + iHashCode2;
    }

    public final String toString() {
        return "Streak(language=" + this.f17456a + ", streakDays=" + this.f17457b + ", coins=" + this.f17458c + ", latestStreakDays=" + this.f17459d + ", isStreakBroken=" + this.f17460e + ")";
    }
}
