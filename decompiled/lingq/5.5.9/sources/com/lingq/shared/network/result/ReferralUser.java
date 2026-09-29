package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010Jp\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m13365d2 = {"Lcom/lingq/shared/network/result/ReferralUser;", "", "", "activityIndex", "blogUrl", "", "deleted", "", "description", "id", "photo", "role", "username", "copy", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcom/lingq/shared/network/result/ReferralUser;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ReferralUser {

    /* JADX INFO: renamed from: a */
    public final Integer f18268a;

    /* JADX INFO: renamed from: b */
    public final Object f18269b;

    /* JADX INFO: renamed from: c */
    public final Boolean f18270c;

    /* JADX INFO: renamed from: d */
    public final String f18271d;

    /* JADX INFO: renamed from: e */
    public final Integer f18272e;

    /* JADX INFO: renamed from: f */
    public final String f18273f;

    /* JADX INFO: renamed from: g */
    public final Object f18274g;

    /* JADX INFO: renamed from: h */
    public final String f18275h;

    public ReferralUser() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public ReferralUser(@InterfaceC9303g(name = "activity_index") Integer num, @InterfaceC9303g(name = "blog_url") Object obj, @InterfaceC9303g(name = "deleted") Boolean bool, @InterfaceC9303g(name = "description") String str, @InterfaceC9303g(name = "id") Integer num2, @InterfaceC9303g(name = "photo") String str2, @InterfaceC9303g(name = "role") Object obj2, @InterfaceC9303g(name = "username") String str3) {
        this.f18268a = num;
        this.f18269b = obj;
        this.f18270c = bool;
        this.f18271d = str;
        this.f18272e = num2;
        this.f18273f = str2;
        this.f18274g = obj2;
        this.f18275h = str3;
    }

    public /* synthetic */ ReferralUser(Integer num, Object obj, Boolean bool, String str, Integer num2, String str2, Object obj2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : obj2, (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 0 ? str3 : null);
    }

    public final ReferralUser copy(@InterfaceC9303g(name = "activity_index") Integer activityIndex, @InterfaceC9303g(name = "blog_url") Object blogUrl, @InterfaceC9303g(name = "deleted") Boolean deleted, @InterfaceC9303g(name = "description") String description, @InterfaceC9303g(name = "id") Integer id2, @InterfaceC9303g(name = "photo") String photo, @InterfaceC9303g(name = "role") Object role, @InterfaceC9303g(name = "username") String username) {
        return new ReferralUser(activityIndex, blogUrl, deleted, description, id2, photo, role, username);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralUser)) {
            return false;
        }
        ReferralUser referralUser = (ReferralUser) obj;
        if (C5207g.m11106a(this.f18268a, referralUser.f18268a) && C5207g.m11106a(this.f18269b, referralUser.f18269b) && C5207g.m11106a(this.f18270c, referralUser.f18270c) && C5207g.m11106a(this.f18271d, referralUser.f18271d) && C5207g.m11106a(this.f18272e, referralUser.f18272e) && C5207g.m11106a(this.f18273f, referralUser.f18273f) && C5207g.m11106a(this.f18274g, referralUser.f18274g) && C5207g.m11106a(this.f18275h, referralUser.f18275h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        Integer num = this.f18268a;
        int iHashCode2 = (num == null ? 0 : num.hashCode()) * 31;
        Object obj = this.f18269b;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.f18270c;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f18271d;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f18272e;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f18273f;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj2 = this.f18274g;
        int iHashCode8 = (iHashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str3 = this.f18275h;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iHashCode8 + iHashCode;
    }

    public final String toString() {
        return "ReferralUser(activityIndex=" + this.f18268a + ", blogUrl=" + this.f18269b + ", deleted=" + this.f18270c + ", description=" + this.f18271d + ", id=" + this.f18272e + ", photo=" + this.f18273f + ", role=" + this.f18274g + ", username=" + this.f18275h + ")";
    }
}
