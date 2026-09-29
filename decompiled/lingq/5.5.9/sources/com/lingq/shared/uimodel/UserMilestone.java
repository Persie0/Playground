package com.lingq.shared.uimodel;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/UserMilestone;", "Landroid/os/Parcelable;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserMilestone implements Parcelable {
    public static final Parcelable.Creator<UserMilestone> CREATOR = new C3402a();

    /* JADX INFO: renamed from: a */
    public final String f21626a;

    /* JADX INFO: renamed from: b */
    public final String f21627b;

    /* JADX INFO: renamed from: c */
    public final int f21628c;

    /* JADX INFO: renamed from: d */
    public final String f21629d;

    /* JADX INFO: renamed from: com.lingq.shared.uimodel.UserMilestone$a */
    public static final class C3402a implements Parcelable.Creator<UserMilestone> {
        @Override // android.os.Parcelable.Creator
        public final UserMilestone createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return new UserMilestone(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserMilestone[] newArray(int i10) {
            return new UserMilestone[i10];
        }
    }

    public UserMilestone() {
        this("", 0, "", "");
    }

    public UserMilestone(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "slug");
        C5207g.m11111f(str3, "stat");
        this.f21626a = str;
        this.f21627b = str2;
        this.f21628c = i10;
        this.f21629d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMilestone)) {
            return false;
        }
        UserMilestone userMilestone = (UserMilestone) obj;
        return C5207g.m11106a(this.f21626a, userMilestone.f21626a) && C5207g.m11106a(this.f21627b, userMilestone.f21627b) && this.f21628c == userMilestone.f21628c && C5207g.m11106a(this.f21629d, userMilestone.f21629d);
    }

    public final int hashCode() {
        return this.f21629d.hashCode() + C0009a.m16d(this.f21628c, C0166e.m758d(this.f21627b, this.f21626a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserMilestone(language=");
        sb2.append(this.f21626a);
        sb2.append(", slug=");
        sb2.append(this.f21627b);
        sb2.append(", goal=");
        sb2.append(this.f21628c);
        sb2.append(", stat=");
        return C0009a.m23l(sb2, this.f21629d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeString(this.f21626a);
        parcel.writeString(this.f21627b);
        parcel.writeInt(this.f21628c);
        parcel.writeString(this.f21629d);
    }
}
