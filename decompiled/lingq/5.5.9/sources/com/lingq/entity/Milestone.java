package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Milestone;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Milestone {

    /* JADX INFO: renamed from: a */
    public final String f17299a;

    /* JADX INFO: renamed from: b */
    public final String f17300b;

    /* JADX INFO: renamed from: c */
    public final String f17301c;

    /* JADX INFO: renamed from: d */
    public final String f17302d;

    /* JADX INFO: renamed from: e */
    public final int f17303e;

    /* JADX INFO: renamed from: f */
    public final String f17304f;

    /* JADX INFO: renamed from: g */
    public final String f17305g;

    public Milestone(int i10, String str, String str2, String str3, String str4, String str5, String str6) {
        C5207g.m11111f(str, "languageAndSlug");
        this.f17299a = str;
        this.f17300b = str2;
        this.f17301c = str3;
        this.f17302d = str4;
        this.f17303e = i10;
        this.f17304f = str5;
        this.f17305g = str6;
    }

    public /* synthetic */ Milestone(String str, String str2, String str3, String str4, int i10, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 16) != 0 ? 0 : i10, str, str2, str3, str4, str5, (i11 & 64) != 0 ? null : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Milestone)) {
            return false;
        }
        Milestone milestone = (Milestone) obj;
        return C5207g.m11106a(this.f17299a, milestone.f17299a) && C5207g.m11106a(this.f17300b, milestone.f17300b) && C5207g.m11106a(this.f17301c, milestone.f17301c) && C5207g.m11106a(this.f17302d, milestone.f17302d) && this.f17303e == milestone.f17303e && C5207g.m11106a(this.f17304f, milestone.f17304f) && C5207g.m11106a(this.f17305g, milestone.f17305g);
    }

    public final int hashCode() {
        int iHashCode = this.f17299a.hashCode() * 31;
        int iHashCode2 = 0;
        String str = this.f17300b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17301c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17302d;
        int iM16d = C0009a.m16d(this.f17303e, (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f17304f;
        int iHashCode5 = (iM16d + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17305g;
        if (str5 != null) {
            iHashCode2 = str5.hashCode();
        }
        return iHashCode5 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Milestone(languageAndSlug=");
        sb2.append(this.f17299a);
        sb2.append(", language=");
        sb2.append(this.f17300b);
        sb2.append(", slug=");
        sb2.append(this.f17301c);
        sb2.append(", name=");
        sb2.append(this.f17302d);
        sb2.append(", goal=");
        sb2.append(this.f17303e);
        sb2.append(", stat=");
        sb2.append(this.f17304f);
        sb2.append(", date=");
        return C0009a.m23l(sb2, this.f17305g, ")");
    }
}
