package com.lingq.p055ui.token;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.lesson.data.TokenFragmentData;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenType;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/token/TokenData;", "Landroid/os/Parcelable;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TokenData implements Parcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new C4784a();

    /* JADX INFO: renamed from: a */
    public final String f31175a;

    /* JADX INFO: renamed from: b */
    public TokenType f31176b;

    /* JADX INFO: renamed from: c */
    public final int f31177c;

    /* JADX INFO: renamed from: d */
    public final int f31178d;

    /* JADX INFO: renamed from: e */
    public final TokenFragmentData f31179e;

    /* JADX INFO: renamed from: f */
    public final TokenViewState f31180f;

    /* JADX INFO: renamed from: g */
    public final TokenControllerType f31181g;

    /* JADX INFO: renamed from: h */
    public final List<TokenMeaning> f31182h;

    /* JADX INFO: renamed from: i */
    public final int f31183i;

    /* JADX INFO: renamed from: j */
    public final TokenTransliteration f31184j;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenData$a */
    public static final class C4784a implements Parcelable.Creator<TokenData> {
        @Override // android.os.Parcelable.Creator
        public final TokenData createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            String string = parcel.readString();
            TokenType tokenTypeValueOf = TokenType.valueOf(parcel.readString());
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            TokenFragmentData tokenFragmentDataCreateFromParcel = TokenFragmentData.CREATOR.createFromParcel(parcel);
            TokenViewState tokenViewState = (TokenViewState) parcel.readParcelable(TokenData.class.getClassLoader());
            TokenControllerType tokenControllerTypeValueOf = TokenControllerType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(parcel.readParcelable(TokenData.class.getClassLoader()));
            }
            return new TokenData(string, tokenTypeValueOf, i10, i11, tokenFragmentDataCreateFromParcel, tokenViewState, tokenControllerTypeValueOf, arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : TokenTransliteration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TokenData[] newArray(int i10) {
            return new TokenData[i10];
        }
    }

    public TokenData(String str, TokenType tokenType, int i10, int i11, TokenFragmentData tokenFragmentData, TokenViewState tokenViewState, TokenControllerType tokenControllerType, List<TokenMeaning> list, int i12, TokenTransliteration tokenTransliteration) {
        C5207g.m11111f(str, "token");
        C5207g.m11111f(tokenType, "type");
        C5207g.m11111f(tokenFragmentData, "textFragmentData");
        C5207g.m11111f(tokenViewState, "startSize");
        C5207g.m11111f(tokenControllerType, "from");
        C5207g.m11111f(list, "phraseMeanings");
        this.f31175a = str;
        this.f31176b = tokenType;
        this.f31177c = i10;
        this.f31178d = i11;
        this.f31179e = tokenFragmentData;
        this.f31180f = tokenViewState;
        this.f31181g = tokenControllerType;
        this.f31182h = list;
        this.f31183i = i12;
        this.f31184j = tokenTransliteration;
    }

    public /* synthetic */ TokenData(String str, TokenType tokenType, int i10, int i11, TokenFragmentData tokenFragmentData, TokenViewState tokenViewState, TokenControllerType tokenControllerType, List list, int i12, TokenTransliteration tokenTransliteration, int i13) {
        this(str, tokenType, (i13 & 4) != 0 ? -1 : i10, (i13 & 8) != 0 ? -1 : i11, (i13 & 16) != 0 ? new TokenFragmentData(0) : tokenFragmentData, (i13 & 32) != 0 ? TokenViewState.Collapsed.f31716a : tokenViewState, (i13 & 64) != 0 ? TokenControllerType.Lesson : tokenControllerType, (i13 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? new ArrayList() : list, (i13 & 256) != 0 ? -1 : i12, (i13 & 512) != 0 ? null : tokenTransliteration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return C5207g.m11106a(this.f31175a, tokenData.f31175a) && this.f31176b == tokenData.f31176b && this.f31177c == tokenData.f31177c && this.f31178d == tokenData.f31178d && C5207g.m11106a(this.f31179e, tokenData.f31179e) && C5207g.m11106a(this.f31180f, tokenData.f31180f) && this.f31181g == tokenData.f31181g && C5207g.m11106a(this.f31182h, tokenData.f31182h) && this.f31183i == tokenData.f31183i && C5207g.m11106a(this.f31184j, tokenData.f31184j);
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f31183i, C0204c.m848g(this.f31182h, (this.f31181g.hashCode() + ((this.f31180f.hashCode() + ((this.f31179e.hashCode() + C0009a.m16d(this.f31178d, C0009a.m16d(this.f31177c, (this.f31176b.hashCode() + (this.f31175a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31)) * 31, 31), 31);
        TokenTransliteration tokenTransliteration = this.f31184j;
        return iM16d + (tokenTransliteration == null ? 0 : tokenTransliteration.hashCode());
    }

    public final String toString() {
        return "TokenData(token=" + this.f31175a + ", type=" + this.f31176b + ", rectTop=" + this.f31177c + ", rectBottom=" + this.f31178d + ", textFragmentData=" + this.f31179e + ", startSize=" + this.f31180f + ", from=" + this.f31181g + ", phraseMeanings=" + this.f31182h + ", wordIndex=" + this.f31183i + ", transliteration=" + this.f31184j + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeString(this.f31175a);
        parcel.writeString(this.f31176b.name());
        parcel.writeInt(this.f31177c);
        parcel.writeInt(this.f31178d);
        this.f31179e.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f31180f, i10);
        parcel.writeString(this.f31181g.name());
        List<TokenMeaning> list = this.f31182h;
        parcel.writeInt(list.size());
        Iterator<TokenMeaning> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i10);
        }
        parcel.writeInt(this.f31183i);
        TokenTransliteration tokenTransliteration = this.f31184j;
        if (tokenTransliteration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tokenTransliteration.writeToParcel(parcel, i10);
        }
    }
}
