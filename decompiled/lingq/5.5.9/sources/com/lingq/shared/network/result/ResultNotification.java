package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultNotification;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultNotification {

    /* JADX INFO: renamed from: a */
    public final int f18796a;

    /* JADX INFO: renamed from: b */
    public final String f18797b;

    /* JADX INFO: renamed from: c */
    public final String f18798c;

    /* JADX INFO: renamed from: d */
    public final String f18799d;

    /* JADX INFO: renamed from: e */
    public final String f18800e;

    /* JADX INFO: renamed from: f */
    public final String f18801f;

    /* JADX INFO: renamed from: g */
    public final String f18802g;

    /* JADX INFO: renamed from: h */
    public final Boolean f18803h;

    /* JADX INFO: renamed from: i */
    public final String f18804i;

    public ResultNotification(int i10, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7) {
        this.f18796a = i10;
        this.f18797b = str;
        this.f18798c = str2;
        this.f18799d = str3;
        this.f18800e = str4;
        this.f18801f = str5;
        this.f18802g = str6;
        this.f18803h = bool;
        this.f18804i = str7;
    }

    public /* synthetic */ ResultNotification(int i10, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str, str2, str3, str4, str5, str6, bool, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultNotification)) {
            return false;
        }
        ResultNotification resultNotification = (ResultNotification) obj;
        return this.f18796a == resultNotification.f18796a && C5207g.m11106a(this.f18797b, resultNotification.f18797b) && C5207g.m11106a(this.f18798c, resultNotification.f18798c) && C5207g.m11106a(this.f18799d, resultNotification.f18799d) && C5207g.m11106a(this.f18800e, resultNotification.f18800e) && C5207g.m11106a(this.f18801f, resultNotification.f18801f) && C5207g.m11106a(this.f18802g, resultNotification.f18802g) && C5207g.m11106a(this.f18803h, resultNotification.f18803h) && C5207g.m11106a(this.f18804i, resultNotification.f18804i);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18796a) * 31;
        int iHashCode2 = 0;
        String str = this.f18797b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18798c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18799d;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18800e;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18801f;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18802g;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f18803h;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.f18804i;
        if (str7 != null) {
            iHashCode2 = str7.hashCode();
        }
        return iHashCode9 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultNotification(pk=");
        sb2.append(this.f18796a);
        sb2.append(", url=");
        sb2.append(this.f18797b);
        sb2.append(", language=");
        sb2.append(this.f18798c);
        sb2.append(", type=");
        sb2.append(this.f18799d);
        sb2.append(", title=");
        sb2.append(this.f18800e);
        sb2.append(", message=");
        sb2.append(this.f18801f);
        sb2.append(", image=");
        sb2.append(this.f18802g);
        sb2.append(", isNew=");
        sb2.append(this.f18803h);
        sb2.append(", timestamp=");
        return C0009a.m23l(sb2, this.f18804i, ")");
    }
}
