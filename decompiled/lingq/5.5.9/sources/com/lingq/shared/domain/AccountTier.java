package com.lingq.shared.domain;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/domain/AccountTier;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class AccountTier {

    /* JADX INFO: renamed from: a */
    public final int f17762a;

    /* JADX INFO: renamed from: b */
    public final String f17763b;

    /* JADX INFO: renamed from: c */
    public final Boolean f17764c;

    /* JADX INFO: renamed from: d */
    public final int f17765d;

    public AccountTier(int i10, String str, Boolean bool, int i11) {
        C5207g.m11111f(str, "title");
        this.f17762a = i10;
        this.f17763b = str;
        this.f17764c = bool;
        this.f17765d = i11;
    }

    public /* synthetic */ AccountTier(int i10, String str, Boolean bool, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, (i12 & 4) != 0 ? null : bool, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTier)) {
            return false;
        }
        AccountTier accountTier = (AccountTier) obj;
        if (this.f17762a == accountTier.f17762a && C5207g.m11106a(this.f17763b, accountTier.f17763b) && C5207g.m11106a(this.f17764c, accountTier.f17764c) && this.f17765d == accountTier.f17765d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f17763b, Integer.hashCode(this.f17762a) * 31, 31);
        Boolean bool = this.f17764c;
        return Integer.hashCode(this.f17765d) + ((iM758d + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccountTier(id=");
        sb2.append(this.f17762a);
        sb2.append(", title=");
        sb2.append(this.f17763b);
        sb2.append(", lifetimePremium=");
        sb2.append(this.f17764c);
        sb2.append(", pointsDiscount=");
        return C0166e.m768o(sb2, this.f17765d, ")");
    }
}
