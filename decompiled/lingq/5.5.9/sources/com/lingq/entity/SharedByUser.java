package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/SharedByUser;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class SharedByUser {

    /* JADX INFO: renamed from: a */
    public final int f17408a;

    /* JADX INFO: renamed from: b */
    public final String f17409b;

    /* JADX INFO: renamed from: c */
    public final String f17410c;

    /* JADX INFO: renamed from: d */
    public final String f17411d;

    /* JADX INFO: renamed from: e */
    public final String f17412e;

    /* JADX INFO: renamed from: f */
    public final String f17413f;

    /* JADX INFO: renamed from: g */
    public final String f17414g;

    public SharedByUser(int i10, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f17408a = i10;
        this.f17409b = str;
        this.f17410c = str2;
        this.f17411d = str3;
        this.f17412e = str4;
        this.f17413f = str5;
        this.f17414g = str6;
    }

    public /* synthetic */ SharedByUser(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str, str2, str3, str4, str5, (i11 & 64) != 0 ? null : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedByUser)) {
            return false;
        }
        SharedByUser sharedByUser = (SharedByUser) obj;
        if (this.f17408a == sharedByUser.f17408a && C5207g.m11106a(this.f17409b, sharedByUser.f17409b) && C5207g.m11106a(this.f17410c, sharedByUser.f17410c) && C5207g.m11106a(this.f17411d, sharedByUser.f17411d) && C5207g.m11106a(this.f17412e, sharedByUser.f17412e) && C5207g.m11106a(this.f17413f, sharedByUser.f17413f) && C5207g.m11106a(this.f17414g, sharedByUser.f17414g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17408a) * 31;
        int iHashCode2 = 0;
        String str = this.f17409b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17410c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17411d;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17412e;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17413f;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17414g;
        if (str6 != null) {
            iHashCode2 = str6.hashCode();
        }
        return iHashCode7 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SharedByUser(id=");
        sb2.append(this.f17408a);
        sb2.append(", language=");
        sb2.append(this.f17409b);
        sb2.append(", firstName=");
        sb2.append(this.f17410c);
        sb2.append(", lastName=");
        sb2.append(this.f17411d);
        sb2.append(", photo=");
        sb2.append(this.f17412e);
        sb2.append(", username=");
        sb2.append(this.f17413f);
        sb2.append(", role=");
        return C0009a.m23l(sb2, this.f17414g, ")");
    }
}
