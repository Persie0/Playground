package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0001\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultUserReferral;", "", "", "dateJoined", "email", "emailDate", "", "hasUpgraded", "", "lingqsEarned", "pk", "pointsEarned", "tierCategory", "tierLevel", "url", "Lcom/lingq/shared/network/result/ReferralUser;", "user", "username", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/lingq/shared/network/result/ReferralUser;Ljava/lang/String;)Lcom/lingq/shared/network/result/ResultUserReferral;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/lingq/shared/network/result/ReferralUser;Ljava/lang/String;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultUserReferral {

    /* JADX INFO: renamed from: a */
    public final String f19031a;

    /* JADX INFO: renamed from: b */
    public final String f19032b;

    /* JADX INFO: renamed from: c */
    public final Object f19033c;

    /* JADX INFO: renamed from: d */
    public final Boolean f19034d;

    /* JADX INFO: renamed from: e */
    public final Integer f19035e;

    /* JADX INFO: renamed from: f */
    public final Integer f19036f;

    /* JADX INFO: renamed from: g */
    public final Object f19037g;

    /* JADX INFO: renamed from: h */
    public final String f19038h;

    /* JADX INFO: renamed from: i */
    public final Integer f19039i;

    /* JADX INFO: renamed from: j */
    public final String f19040j;

    /* JADX INFO: renamed from: k */
    public final ReferralUser f19041k;

    /* JADX INFO: renamed from: l */
    public final String f19042l;

    public ResultUserReferral() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public ResultUserReferral(@InterfaceC9303g(name = "dateJoined") String str, @InterfaceC9303g(name = "email") String str2, @InterfaceC9303g(name = "emailDate") Object obj, @InterfaceC9303g(name = "hasUpgraded") Boolean bool, @InterfaceC9303g(name = "lingqsEarned") Integer num, @InterfaceC9303g(name = "pk") Integer num2, @InterfaceC9303g(name = "pointsEarned") Object obj2, @InterfaceC9303g(name = "tierCategory") String str3, @InterfaceC9303g(name = "tierLevel") Integer num3, @InterfaceC9303g(name = "url") String str4, @InterfaceC9303g(name = "user") ReferralUser referralUser, @InterfaceC9303g(name = "username") String str5) {
        this.f19031a = str;
        this.f19032b = str2;
        this.f19033c = obj;
        this.f19034d = bool;
        this.f19035e = num;
        this.f19036f = num2;
        this.f19037g = obj2;
        this.f19038h = str3;
        this.f19039i = num3;
        this.f19040j = str4;
        this.f19041k = referralUser;
        this.f19042l = str5;
    }

    public /* synthetic */ ResultUserReferral(String str, String str2, Object obj, Boolean bool, Integer num, Integer num2, Object obj2, String str3, Integer num3, String str4, ReferralUser referralUser, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : obj, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : obj2, (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? null : str3, (i10 & 256) != 0 ? null : num3, (i10 & 512) != 0 ? null : str4, (i10 & 1024) != 0 ? null : referralUser, (i10 & 2048) == 0 ? str5 : null);
    }

    public final ResultUserReferral copy(@InterfaceC9303g(name = "dateJoined") String dateJoined, @InterfaceC9303g(name = "email") String email, @InterfaceC9303g(name = "emailDate") Object emailDate, @InterfaceC9303g(name = "hasUpgraded") Boolean hasUpgraded, @InterfaceC9303g(name = "lingqsEarned") Integer lingqsEarned, @InterfaceC9303g(name = "pk") Integer pk2, @InterfaceC9303g(name = "pointsEarned") Object pointsEarned, @InterfaceC9303g(name = "tierCategory") String tierCategory, @InterfaceC9303g(name = "tierLevel") Integer tierLevel, @InterfaceC9303g(name = "url") String url, @InterfaceC9303g(name = "user") ReferralUser user, @InterfaceC9303g(name = "username") String username) {
        return new ResultUserReferral(dateJoined, email, emailDate, hasUpgraded, lingqsEarned, pk2, pointsEarned, tierCategory, tierLevel, url, user, username);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultUserReferral)) {
            return false;
        }
        ResultUserReferral resultUserReferral = (ResultUserReferral) obj;
        return C5207g.m11106a(this.f19031a, resultUserReferral.f19031a) && C5207g.m11106a(this.f19032b, resultUserReferral.f19032b) && C5207g.m11106a(this.f19033c, resultUserReferral.f19033c) && C5207g.m11106a(this.f19034d, resultUserReferral.f19034d) && C5207g.m11106a(this.f19035e, resultUserReferral.f19035e) && C5207g.m11106a(this.f19036f, resultUserReferral.f19036f) && C5207g.m11106a(this.f19037g, resultUserReferral.f19037g) && C5207g.m11106a(this.f19038h, resultUserReferral.f19038h) && C5207g.m11106a(this.f19039i, resultUserReferral.f19039i) && C5207g.m11106a(this.f19040j, resultUserReferral.f19040j) && C5207g.m11106a(this.f19041k, resultUserReferral.f19041k) && C5207g.m11106a(this.f19042l, resultUserReferral.f19042l);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f19031a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19032b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.f19033c;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.f19034d;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f19035e;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f19036f;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj2 = this.f19037g;
        int iHashCode8 = (iHashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str3 = this.f19038h;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f19039i;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f19040j;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ReferralUser referralUser = this.f19041k;
        int iHashCode12 = (iHashCode11 + (referralUser == null ? 0 : referralUser.hashCode())) * 31;
        String str5 = this.f19042l;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return iHashCode12 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultUserReferral(dateJoined=");
        sb2.append(this.f19031a);
        sb2.append(", email=");
        sb2.append(this.f19032b);
        sb2.append(", emailDate=");
        sb2.append(this.f19033c);
        sb2.append(", hasUpgraded=");
        sb2.append(this.f19034d);
        sb2.append(", lingqsEarned=");
        sb2.append(this.f19035e);
        sb2.append(", pk=");
        sb2.append(this.f19036f);
        sb2.append(", pointsEarned=");
        sb2.append(this.f19037g);
        sb2.append(", tierCategory=");
        sb2.append(this.f19038h);
        sb2.append(", tierLevel=");
        sb2.append(this.f19039i);
        sb2.append(", url=");
        sb2.append(this.f19040j);
        sb2.append(", user=");
        sb2.append(this.f19041k);
        sb2.append(", username=");
        return C0009a.m23l(sb2, this.f19042l, ")");
    }
}
