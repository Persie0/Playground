package com.lingq.p055ui.token;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/token/DictionaryData;", "Landroid/os/Parcelable;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class DictionaryData implements Parcelable {
    public static final Parcelable.Creator<DictionaryData> CREATOR = new C4783a();

    /* JADX INFO: renamed from: a */
    public final String f31171a;

    /* JADX INFO: renamed from: b */
    public final String f31172b;

    /* JADX INFO: renamed from: c */
    public final String f31173c;

    /* JADX INFO: renamed from: d */
    public final String f31174d;

    /* JADX INFO: renamed from: com.lingq.ui.token.DictionaryData$a */
    public static final class C4783a implements Parcelable.Creator<DictionaryData> {
        @Override // android.os.Parcelable.Creator
        public final DictionaryData createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return new DictionaryData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DictionaryData[] newArray(int i10) {
            return new DictionaryData[i10];
        }
    }

    public DictionaryData(String str, String str2, String str3, String str4) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(str2, "urlToSend");
        C5207g.m11111f(str3, "dictionaryTitle");
        C5207g.m11111f(str4, "languageTo");
        this.f31171a = str;
        this.f31172b = str2;
        this.f31173c = str3;
        this.f31174d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionaryData)) {
            return false;
        }
        DictionaryData dictionaryData = (DictionaryData) obj;
        if (C5207g.m11106a(this.f31171a, dictionaryData.f31171a) && C5207g.m11106a(this.f31172b, dictionaryData.f31172b) && C5207g.m11106a(this.f31173c, dictionaryData.f31173c) && C5207g.m11106a(this.f31174d, dictionaryData.f31174d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31174d.hashCode() + C0166e.m758d(this.f31173c, C0166e.m758d(this.f31172b, this.f31171a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DictionaryData(term=");
        sb2.append(this.f31171a);
        sb2.append(", urlToSend=");
        sb2.append(this.f31172b);
        sb2.append(", dictionaryTitle=");
        sb2.append(this.f31173c);
        sb2.append(", languageTo=");
        return C0009a.m23l(sb2, this.f31174d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeString(this.f31171a);
        parcel.writeString(this.f31172b);
        parcel.writeString(this.f31173c);
        parcel.writeString(this.f31174d);
    }
}
