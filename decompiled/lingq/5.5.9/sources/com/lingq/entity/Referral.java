package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Referral;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Referral {

    /* JADX INFO: renamed from: a */
    public final int f17379a;

    /* JADX INFO: renamed from: b */
    public final String f17380b;

    /* JADX INFO: renamed from: c */
    public final String f17381c;

    /* JADX INFO: renamed from: d */
    public final String f17382d;

    public /* synthetic */ Referral(int i10, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 1) != 0 ? 0 : i10, str2, str3);
    }

    public Referral(String str, int i10, String str2, String str3) {
        this.f17379a = i10;
        this.f17380b = str;
        this.f17381c = str2;
        this.f17382d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Referral)) {
            return false;
        }
        Referral referral = (Referral) obj;
        if (this.f17379a == referral.f17379a && C5207g.m11106a(this.f17380b, referral.f17380b) && C5207g.m11106a(this.f17381c, referral.f17381c) && C5207g.m11106a(this.f17382d, referral.f17382d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17379a) * 31;
        int iHashCode2 = 0;
        String str = this.f17380b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17381c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17382d;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Referral(pk=");
        sb2.append(this.f17379a);
        sb2.append(", username=");
        sb2.append(this.f17380b);
        sb2.append(", photo=");
        sb2.append(this.f17381c);
        sb2.append(", dateJoined=");
        return C0009a.m23l(sb2, this.f17382d, ")");
    }
}
