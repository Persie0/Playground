package com.lingq.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/util/DailyGoalMet;", "Landroid/os/Parcelable;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class DailyGoalMet implements Parcelable {
    public static final Parcelable.Creator<DailyGoalMet> CREATOR = new C3410a();

    /* JADX INFO: renamed from: a */
    public final String f22146a;

    /* JADX INFO: renamed from: b */
    public final int f22147b;

    /* JADX INFO: renamed from: c */
    public final int f22148c;

    /* JADX INFO: renamed from: d */
    public final int f22149d;

    /* JADX INFO: renamed from: e */
    public final boolean f22150e;

    /* JADX INFO: renamed from: f */
    public final String f22151f;

    /* JADX INFO: renamed from: g */
    public int f22152g;

    /* JADX INFO: renamed from: com.lingq.shared.util.DailyGoalMet$a */
    public static final class C3410a implements Parcelable.Creator<DailyGoalMet> {
        @Override // android.os.Parcelable.Creator
        public final DailyGoalMet createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return new DailyGoalMet(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DailyGoalMet[] newArray(int i10) {
            return new DailyGoalMet[i10];
        }
    }

    public DailyGoalMet(String str, int i10, int i11, int i12, boolean z10, String str2, int i13) {
        C5207g.m11111f(str, "date");
        C5207g.m11111f(str2, "slug");
        this.f22146a = str;
        this.f22147b = i10;
        this.f22148c = i11;
        this.f22149d = i12;
        this.f22150e = z10;
        this.f22151f = str2;
        this.f22152g = i13;
    }

    public /* synthetic */ DailyGoalMet(String str, int i10, int i11, int i12, boolean z10, String str2, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, i12, z10, str2, (i14 & 64) != 0 ? -1 : i13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyGoalMet)) {
            return false;
        }
        DailyGoalMet dailyGoalMet = (DailyGoalMet) obj;
        return C5207g.m11106a(this.f22146a, dailyGoalMet.f22146a) && this.f22147b == dailyGoalMet.f22147b && this.f22148c == dailyGoalMet.f22148c && this.f22149d == dailyGoalMet.f22149d && this.f22150e == dailyGoalMet.f22150e && C5207g.m11106a(this.f22151f, dailyGoalMet.f22151f) && this.f22152g == dailyGoalMet.f22152g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f22149d, C0009a.m16d(this.f22148c, C0009a.m16d(this.f22147b, this.f22146a.hashCode() * 31, 31), 31), 31);
        boolean z10 = this.f22150e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.f22152g) + C0166e.m758d(this.f22151f, (iM16d + r10) * 31, 31);
    }

    public final String toString() {
        return "DailyGoalMet(date=" + this.f22146a + ", met=" + this.f22147b + ", goal=" + this.f22148c + ", activityId=" + this.f22149d + ", isDouble=" + this.f22150e + ", slug=" + this.f22151f + ", streak=" + this.f22152g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeString(this.f22146a);
        parcel.writeInt(this.f22147b);
        parcel.writeInt(this.f22148c);
        parcel.writeInt(this.f22149d);
        parcel.writeInt(this.f22150e ? 1 : 0);
        parcel.writeString(this.f22151f);
        parcel.writeInt(this.f22152g);
    }
}
