package com.lingq.p055ui.lesson.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/lesson/data/TokenFragmentData;", "Landroid/os/Parcelable;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TokenFragmentData implements Parcelable {
    public static final Parcelable.Creator<TokenFragmentData> CREATOR = new C4271a();

    /* JADX INFO: renamed from: a */
    public final String f27865a;

    /* JADX INFO: renamed from: b */
    public final int f27866b;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.data.TokenFragmentData$a */
    public static final class C4271a implements Parcelable.Creator<TokenFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final TokenFragmentData createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return new TokenFragmentData(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TokenFragmentData[] newArray(int i10) {
            return new TokenFragmentData[i10];
        }
    }

    public TokenFragmentData() {
        this(0);
    }

    public /* synthetic */ TokenFragmentData(int i10) {
        this("", -1);
    }

    public TokenFragmentData(String str, int i10) {
        C5207g.m11111f(str, "fragment");
        this.f27865a = str;
        this.f27866b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenFragmentData)) {
            return false;
        }
        TokenFragmentData tokenFragmentData = (TokenFragmentData) obj;
        return C5207g.m11106a(this.f27865a, tokenFragmentData.f27865a) && this.f27866b == tokenFragmentData.f27866b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27866b) + (this.f27865a.hashCode() * 31);
    }

    public final String toString() {
        return "TokenFragmentData(fragment=" + this.f27865a + ", start=" + this.f27866b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeString(this.f27865a);
        parcel.writeInt(this.f27866b);
    }
}
