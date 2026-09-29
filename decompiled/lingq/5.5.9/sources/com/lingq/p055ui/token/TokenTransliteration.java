package com.lingq.p055ui.token;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/token/TokenTransliteration;", "Landroid/os/Parcelable;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TokenTransliteration implements Parcelable {
    public static final Parcelable.Creator<TokenTransliteration> CREATOR = new C4832a();

    /* JADX INFO: renamed from: a */
    public final String f31392a;

    /* JADX INFO: renamed from: b */
    public final String f31393b;

    /* JADX INFO: renamed from: c */
    public final String f31394c;

    /* JADX INFO: renamed from: d */
    public final String f31395d;

    /* JADX INFO: renamed from: e */
    public final String f31396e;

    /* JADX INFO: renamed from: f */
    public final String f31397f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenTransliteration$a */
    public static final class C4832a implements Parcelable.Creator<TokenTransliteration> {
        @Override // android.os.Parcelable.Creator
        public final TokenTransliteration createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return new TokenTransliteration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TokenTransliteration[] newArray(int i10) {
            return new TokenTransliteration[i10];
        }
    }

    public TokenTransliteration() {
        this(null, null, null, null, null, null);
    }

    public TokenTransliteration(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f31392a = str;
        this.f31393b = str2;
        this.f31394c = str3;
        this.f31395d = str4;
        this.f31396e = str5;
        this.f31397f = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenTransliteration)) {
            return false;
        }
        TokenTransliteration tokenTransliteration = (TokenTransliteration) obj;
        return C5207g.m11106a(this.f31392a, tokenTransliteration.f31392a) && C5207g.m11106a(this.f31393b, tokenTransliteration.f31393b) && C5207g.m11106a(this.f31394c, tokenTransliteration.f31394c) && C5207g.m11106a(this.f31395d, tokenTransliteration.f31395d) && C5207g.m11106a(this.f31396e, tokenTransliteration.f31396e) && C5207g.m11106a(this.f31397f, tokenTransliteration.f31397f);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f31392a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31393b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31394c;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31395d;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f31396e;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f31397f;
        if (str6 != null) {
            iHashCode = str6.hashCode();
        }
        return iHashCode6 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenTransliteration(hiragana=");
        sb2.append(this.f31392a);
        sb2.append(", romaji=");
        sb2.append(this.f31393b);
        sb2.append(", pinyin=");
        sb2.append(this.f31394c);
        sb2.append(", hant=");
        sb2.append(this.f31395d);
        sb2.append(", hans=");
        sb2.append(this.f31396e);
        sb2.append(", jyutping=");
        return C0009a.m23l(sb2, this.f31397f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeString(this.f31392a);
        parcel.writeString(this.f31393b);
        parcel.writeString(this.f31394c);
        parcel.writeString(this.f31395d);
        parcel.writeString(this.f31396e);
        parcel.writeString(this.f31397f);
    }
}
