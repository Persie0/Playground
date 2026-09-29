package com.lingq.p055ui.token;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/token/TokenEditData;", "Landroid/os/Parcelable;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TokenEditData implements Parcelable {
    public static final Parcelable.Creator<TokenEditData> CREATOR = new C4785a();

    /* JADX INFO: renamed from: a */
    public final TokenEditType f31185a;

    /* JADX INFO: renamed from: b */
    public final String f31186b;

    /* JADX INFO: renamed from: c */
    public final Object f31187c;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenEditData$a */
    public static final class C4785a implements Parcelable.Creator<TokenEditData> {
        @Override // android.os.Parcelable.Creator
        public final TokenEditData createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return new TokenEditData(TokenEditType.valueOf(parcel.readString()), parcel.readString(), parcel.readValue(TokenEditData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TokenEditData[] newArray(int i10) {
            return new TokenEditData[i10];
        }
    }

    public TokenEditData(TokenEditType tokenEditType, String str, Object obj) {
        C5207g.m11111f(tokenEditType, "type");
        C5207g.m11111f(str, "text");
        this.f31185a = tokenEditType;
        this.f31186b = str;
        this.f31187c = obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenEditData)) {
            return false;
        }
        TokenEditData tokenEditData = (TokenEditData) obj;
        if (this.f31185a == tokenEditData.f31185a && C5207g.m11106a(this.f31186b, tokenEditData.f31186b) && C5207g.m11106a(this.f31187c, tokenEditData.f31187c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f31186b, this.f31185a.hashCode() * 31, 31);
        Object obj = this.f31187c;
        return iM758d + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "TokenEditData(type=" + this.f31185a + ", text=" + this.f31186b + ", data=" + this.f31187c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeString(this.f31185a.name());
        parcel.writeString(this.f31186b);
        parcel.writeValue(this.f31187c);
    }
}
