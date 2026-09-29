package com.lingq.shared.domain;

import android.support.v4.media.session.C0166e;
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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/domain/ProfileAccount;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ProfileAccount {

    /* JADX INFO: renamed from: a */
    public final int f17801a;

    /* JADX INFO: renamed from: b */
    public final String f17802b;

    /* JADX INFO: renamed from: c */
    public final String f17803c;

    /* JADX INFO: renamed from: d */
    public final String f17804d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "activity_index")
    public final int f17805e;

    /* JADX INFO: renamed from: f */
    public final String f17806f;

    /* JADX INFO: renamed from: g */
    public final String f17807g;

    /* JADX INFO: renamed from: h */
    public Integer f17808h;

    /* JADX INFO: renamed from: i */
    public int f17809i;

    /* JADX INFO: renamed from: j */
    public final AccountTier f17810j;

    /* JADX INFO: renamed from: k */
    public int f17811k;

    /* JADX INFO: renamed from: l */
    public final boolean f17812l;

    /* JADX INFO: renamed from: m */
    public final AccountTier f17813m;

    public ProfileAccount() {
        this(0, null, null, null, 0, null, null, null, 0, null, 0, false, null, 8191, null);
    }

    public ProfileAccount(int i10, String str, String str2, String str3, int i11, String str4, String str5, Integer num, int i12, AccountTier accountTier, int i13, boolean z10, AccountTier accountTier2) {
        C5207g.m11111f(str, "username");
        C5207g.m11111f(str3, "email");
        C5207g.m11111f(str4, "photo");
        C5207g.m11111f(str5, "description");
        this.f17801a = i10;
        this.f17802b = str;
        this.f17803c = str2;
        this.f17804d = str3;
        this.f17805e = i11;
        this.f17806f = str4;
        this.f17807g = str5;
        this.f17808h = num;
        this.f17809i = i12;
        this.f17810j = accountTier;
        this.f17811k = i13;
        this.f17812l = z10;
        this.f17813m = accountTier2;
    }

    public /* synthetic */ ProfileAccount(int i10, String str, String str2, String str3, int i11, String str4, String str5, Integer num, int i12, AccountTier accountTier, int i13, boolean z10, AccountTier accountTier2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? 0 : i11, (i14 & 32) != 0 ? "" : str4, (i14 & 64) == 0 ? str5 : "", (i14 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? null : num, (i14 & 256) != 0 ? 0 : i12, (i14 & 512) != 0 ? null : accountTier, (i14 & 1024) != 0 ? 0 : i13, (i14 & 2048) == 0 ? z10 : false, (i14 & 4096) == 0 ? accountTier2 : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileAccount)) {
            return false;
        }
        ProfileAccount profileAccount = (ProfileAccount) obj;
        return this.f17801a == profileAccount.f17801a && C5207g.m11106a(this.f17802b, profileAccount.f17802b) && C5207g.m11106a(this.f17803c, profileAccount.f17803c) && C5207g.m11106a(this.f17804d, profileAccount.f17804d) && this.f17805e == profileAccount.f17805e && C5207g.m11106a(this.f17806f, profileAccount.f17806f) && C5207g.m11106a(this.f17807g, profileAccount.f17807g) && C5207g.m11106a(this.f17808h, profileAccount.f17808h) && this.f17809i == profileAccount.f17809i && C5207g.m11106a(this.f17810j, profileAccount.f17810j) && this.f17811k == profileAccount.f17811k && this.f17812l == profileAccount.f17812l && C5207g.m11106a(this.f17813m, profileAccount.f17813m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f17802b, Integer.hashCode(this.f17801a) * 31, 31);
        String str = this.f17803c;
        int iM758d2 = C0166e.m758d(this.f17807g, C0166e.m758d(this.f17806f, C0009a.m16d(this.f17805e, C0166e.m758d(this.f17804d, (iM758d + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
        Integer num = this.f17808h;
        int iM16d = C0009a.m16d(this.f17809i, (iM758d2 + (num == null ? 0 : num.hashCode())) * 31, 31);
        AccountTier accountTier = this.f17810j;
        int iM16d2 = C0009a.m16d(this.f17811k, (iM16d + (accountTier == null ? 0 : accountTier.hashCode())) * 31, 31);
        boolean z10 = this.f17812l;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iM16d2 + r10) * 31;
        AccountTier accountTier2 = this.f17813m;
        return i10 + (accountTier2 != null ? accountTier2.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileAccount(id=" + this.f17801a + ", username=" + this.f17802b + ", role=" + this.f17803c + ", email=" + this.f17804d + ", activityIndex=" + this.f17805e + ", photo=" + this.f17806f + ", description=" + this.f17807g + ", cardsLimit=" + this.f17808h + ", cardsCount=" + this.f17809i + ", effectiveTier=" + this.f17810j + ", importsCount=" + this.f17811k + ", isDowngraded=" + this.f17812l + ", tier=" + this.f17813m + ")";
    }
}
