package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Notification;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Notification {

    /* JADX INFO: renamed from: a */
    public final int f17334a;

    /* JADX INFO: renamed from: b */
    public final String f17335b;

    /* JADX INFO: renamed from: c */
    public final String f17336c;

    /* JADX INFO: renamed from: d */
    public final String f17337d;

    /* JADX INFO: renamed from: e */
    public final String f17338e;

    /* JADX INFO: renamed from: f */
    public final String f17339f;

    /* JADX INFO: renamed from: g */
    public final String f17340g;

    /* JADX INFO: renamed from: h */
    public final String f17341h;

    /* JADX INFO: renamed from: i */
    public final Boolean f17342i;

    /* JADX INFO: renamed from: j */
    public final String f17343j;

    public Notification(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8) {
        this.f17334a = i10;
        this.f17335b = str;
        this.f17336c = str2;
        this.f17337d = str3;
        this.f17338e = str4;
        this.f17339f = str5;
        this.f17340g = str6;
        this.f17341h = str7;
        this.f17342i = bool;
        this.f17343j = str8;
    }

    public /* synthetic */ Notification(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str, str2, str3, str4, str5, str6, str7, bool, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) obj;
        return this.f17334a == notification.f17334a && C5207g.m11106a(this.f17335b, notification.f17335b) && C5207g.m11106a(this.f17336c, notification.f17336c) && C5207g.m11106a(this.f17337d, notification.f17337d) && C5207g.m11106a(this.f17338e, notification.f17338e) && C5207g.m11106a(this.f17339f, notification.f17339f) && C5207g.m11106a(this.f17340g, notification.f17340g) && C5207g.m11106a(this.f17341h, notification.f17341h) && C5207g.m11106a(this.f17342i, notification.f17342i) && C5207g.m11106a(this.f17343j, notification.f17343j);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17334a) * 31;
        int iHashCode2 = 0;
        String str = this.f17335b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17336c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17337d;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17338e;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17339f;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17340g;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f17341h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f17342i;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.f17343j;
        if (str8 != null) {
            iHashCode2 = str8.hashCode();
        }
        return iHashCode10 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Notification(pk=");
        sb2.append(this.f17334a);
        sb2.append(", url=");
        sb2.append(this.f17335b);
        sb2.append(", language=");
        sb2.append(this.f17336c);
        sb2.append(", notificationLanguage=");
        sb2.append(this.f17337d);
        sb2.append(", type=");
        sb2.append(this.f17338e);
        sb2.append(", title=");
        sb2.append(this.f17339f);
        sb2.append(", message=");
        sb2.append(this.f17340g);
        sb2.append(", image=");
        sb2.append(this.f17341h);
        sb2.append(", isNew=");
        sb2.append(this.f17342i);
        sb2.append(", timestamp=");
        return C0009a.m23l(sb2, this.f17343j, ")");
    }
}
