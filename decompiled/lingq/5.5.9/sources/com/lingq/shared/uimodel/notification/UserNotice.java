package com.lingq.shared.uimodel.notification;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/notification/UserNotice;", "Landroid/os/Parcelable;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserNotice implements Parcelable {
    public static final Parcelable.Creator<UserNotice> CREATOR = new C3406a();

    /* JADX INFO: renamed from: a */
    public final int f22072a;

    /* JADX INFO: renamed from: b */
    public final String f22073b;

    /* JADX INFO: renamed from: c */
    public final String f22074c;

    /* JADX INFO: renamed from: d */
    public final String f22075d;

    /* JADX INFO: renamed from: e */
    public final String f22076e;

    /* JADX INFO: renamed from: com.lingq.shared.uimodel.notification.UserNotice$a */
    public static final class C3406a implements Parcelable.Creator<UserNotice> {
        @Override // android.os.Parcelable.Creator
        public final UserNotice createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return new UserNotice(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserNotice[] newArray(int i10) {
            return new UserNotice[i10];
        }
    }

    public UserNotice() {
        this(0, "", "", "", "");
    }

    public UserNotice(int i10, String str, String str2, String str3, String str4) {
        C5207g.m11111f(str, "title");
        C5207g.m11111f(str2, "endDate");
        C5207g.m11111f(str3, "startDate");
        C5207g.m11111f(str4, "noticeType");
        this.f22072a = i10;
        this.f22073b = str;
        this.f22074c = str2;
        this.f22075d = str3;
        this.f22076e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserNotice)) {
            return false;
        }
        UserNotice userNotice = (UserNotice) obj;
        if (this.f22072a == userNotice.f22072a && C5207g.m11106a(this.f22073b, userNotice.f22073b) && C5207g.m11106a(this.f22074c, userNotice.f22074c) && C5207g.m11106a(this.f22075d, userNotice.f22075d) && C5207g.m11106a(this.f22076e, userNotice.f22076e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22076e.hashCode() + C0166e.m758d(this.f22075d, C0166e.m758d(this.f22074c, C0166e.m758d(this.f22073b, Integer.hashCode(this.f22072a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserNotice(id=");
        sb2.append(this.f22072a);
        sb2.append(", title=");
        sb2.append(this.f22073b);
        sb2.append(", endDate=");
        sb2.append(this.f22074c);
        sb2.append(", startDate=");
        sb2.append(this.f22075d);
        sb2.append(", noticeType=");
        return C0009a.m23l(sb2, this.f22076e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeInt(this.f22072a);
        parcel.writeString(this.f22073b);
        parcel.writeString(this.f22074c);
        parcel.writeString(this.f22075d);
        parcel.writeString(this.f22076e);
    }
}
