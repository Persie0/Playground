package com.lingq.core.token;

import android.os.Parcel;
import android.os.Parcelable;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import p000.AbstractC3393o1;
import p000.C3670v2;
import p000.b8d;
import p000.e65;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.v7d;
import p000.wq1;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class TokenPopupData implements Parcelable {
    public static final Parcelable.Creator<TokenPopupData> CREATOR = new C3670v2(10);

    /* JADX INFO: renamed from: H */
    public final int f23434H;

    /* JADX INFO: renamed from: I */
    public final int f23435I;

    /* JADX INFO: renamed from: J */
    public final Map f23436J;

    /* JADX INFO: renamed from: K */
    public final int f23437K;

    /* JADX INFO: renamed from: L */
    public final int f23438L;

    /* JADX INFO: renamed from: M */
    public final int f23439M;

    /* JADX INFO: renamed from: N */
    public final int f23440N;

    /* JADX INFO: renamed from: O */
    public final boolean f23441O;

    /* JADX INFO: renamed from: P */
    public final String f23442P;

    /* JADX INFO: renamed from: Q */
    public final String f23443Q;

    /* JADX INFO: renamed from: R */
    public final boolean f23444R;

    /* JADX INFO: renamed from: a */
    public final String f23445a;

    /* JADX INFO: renamed from: b */
    public final String f23446b;

    /* JADX INFO: renamed from: c */
    public final TokenType f23447c;

    /* JADX INFO: renamed from: d */
    public final int f23448d;

    /* JADX INFO: renamed from: e */
    public final int f23449e;

    /* JADX INFO: renamed from: f */
    public final TokenFragmentData f23450f;

    /* JADX INFO: renamed from: g */
    public final TokenViewState f23451g;

    /* JADX INFO: renamed from: h */
    public final TokenControllerType f23452h;

    /* JADX INFO: renamed from: i */
    public final List f23453i;

    /* JADX INFO: renamed from: j */
    public final int f23454j;

    /* JADX INFO: renamed from: k */
    public final TokenTransliteration f23455k;

    /* JADX INFO: renamed from: l */
    public final boolean f23456l;

    public /* synthetic */ TokenPopupData(String str, String str2, TokenType tokenType, int i, int i2, TokenFragmentData tokenFragmentData, TokenViewState tokenViewState, TokenControllerType tokenControllerType, List list, int i3, TokenTransliteration tokenTransliteration, boolean z, int i4, int i5, Map map, int i6, int i7, int i8, int i9, boolean z2, String str3, String str4, boolean z3, int i10, y52 y52Var) {
        this(str, str2, tokenType, (i10 & 8) != 0 ? -1 : i, (i10 & 16) != 0 ? -1 : i2, (i10 & 32) != 0 ? new TokenFragmentData() : tokenFragmentData, (i10 & 64) != 0 ? TokenViewState.Collapsed.f23708a : tokenViewState, (i10 & 128) != 0 ? TokenControllerType.Lesson : tokenControllerType, (i10 & 256) != 0 ? new ArrayList() : list, (i10 & 512) != 0 ? -1 : i3, (i10 & 1024) != 0 ? null : tokenTransliteration, (i10 & 2048) != 0 ? false : z, (i10 & 4096) != 0 ? 0 : i4, (i10 & 8192) != 0 ? 0 : i5, (i10 & 16384) != 0 ? AbstractC3194a.m15360M() : map, (32768 & i10) != 0 ? -1 : i6, (65536 & i10) != 0 ? -1 : i7, (131072 & i10) != 0 ? -1 : i8, (262144 & i10) != 0 ? 0 : i9, (524288 & i10) != 0 ? false : z2, (1048576 & i10) != 0 ? null : str3, (2097152 & i10) != 0 ? null : str4, (i10 & 4194304) != 0 ? false : z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenPopupData)) {
            return false;
        }
        TokenPopupData tokenPopupData = (TokenPopupData) obj;
        return fa4.m11650l(this.f23445a, tokenPopupData.f23445a) && fa4.m11650l(this.f23446b, tokenPopupData.f23446b) && this.f23447c == tokenPopupData.f23447c && this.f23448d == tokenPopupData.f23448d && this.f23449e == tokenPopupData.f23449e && fa4.m11650l(this.f23450f, tokenPopupData.f23450f) && fa4.m11650l(this.f23451g, tokenPopupData.f23451g) && this.f23452h == tokenPopupData.f23452h && fa4.m11650l(this.f23453i, tokenPopupData.f23453i) && this.f23454j == tokenPopupData.f23454j && fa4.m11650l(this.f23455k, tokenPopupData.f23455k) && this.f23456l == tokenPopupData.f23456l && this.f23434H == tokenPopupData.f23434H && this.f23435I == tokenPopupData.f23435I && fa4.m11650l(this.f23436J, tokenPopupData.f23436J) && this.f23437K == tokenPopupData.f23437K && this.f23438L == tokenPopupData.f23438L && this.f23439M == tokenPopupData.f23439M && this.f23440N == tokenPopupData.f23440N && this.f23441O == tokenPopupData.f23441O && fa4.m11650l(this.f23442P, tokenPopupData.f23442P) && fa4.m11650l(this.f23443Q, tokenPopupData.f23443Q) && this.f23444R == tokenPopupData.f23444R;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f23454j, ux5.m22979b((this.f23452h.hashCode() + ((this.f23451g.hashCode() + ((this.f23450f.hashCode() + wq1.m24106b(this.f23449e, wq1.m24106b(this.f23448d, (this.f23447c.hashCode() + ux5.m22980c(this.f23445a.hashCode() * 31, this.f23446b, 31)) * 31, 31), 31)) * 31)) * 31)) * 31, 31, this.f23453i), 31);
        TokenTransliteration tokenTransliteration = this.f23455k;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f23440N, wq1.m24106b(this.f23439M, wq1.m24106b(this.f23438L, wq1.m24106b(this.f23437K, e65.m10869a(wq1.m24106b(this.f23435I, wq1.m24106b(this.f23434H, g9a.m12428e((iM24106b + (tokenTransliteration == null ? 0 : tokenTransliteration.hashCode())) * 31, 31, this.f23456l), 31), 31), 31, this.f23436J), 31), 31), 31), 31), 31, this.f23441O);
        String str = this.f23442P;
        int iHashCode = (iM12428e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23443Q;
        return Boolean.hashCode(this.f23444R) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("TokenPopupData(token=", this.f23445a, ", normalizedTerm=", this.f23446b, ", type=");
        sbM23000w.append(this.f23447c);
        sbM23000w.append(", rectTop=");
        sbM23000w.append(this.f23448d);
        sbM23000w.append(", rectBottom=");
        sbM23000w.append(this.f23449e);
        sbM23000w.append(", textFragmentData=");
        sbM23000w.append(this.f23450f);
        sbM23000w.append(", startSize=");
        sbM23000w.append(this.f23451g);
        sbM23000w.append(", from=");
        sbM23000w.append(this.f23452h);
        sbM23000w.append(", phraseMeanings=");
        sbM23000w.append(this.f23453i);
        sbM23000w.append(", wordIndex=");
        sbM23000w.append(this.f23454j);
        sbM23000w.append(", transliteration=");
        sbM23000w.append(this.f23455k);
        sbM23000w.append(", isRelatedPhrase=");
        sbM23000w.append(this.f23456l);
        sbM23000w.append(", sentenceIndex=");
        hn1.m13360j(this.f23434H, this.f23435I, ", sentenceTokenIndex=", ", translation=", sbM23000w);
        sbM23000w.append(this.f23436J);
        sbM23000w.append(", rectStart=");
        sbM23000w.append(this.f23437K);
        sbM23000w.append(", rectEnd=");
        hn1.m13360j(this.f23438L, this.f23439M, ", chatId=", ", messageIndex=", sbM23000w);
        hn1.m13368r(sbM23000w, this.f23440N, ", docked=", this.f23441O, ", chatLocale=");
        AbstractC3393o1.m17725C(sbM23000w, this.f23442P, ", sentenceText=", this.f23443Q, ", isPhrase=");
        return AbstractC3393o1.m17740o(sbM23000w, this.f23444R, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f23445a);
        parcel.writeString(this.f23446b);
        parcel.writeString(this.f23447c.name());
        parcel.writeInt(this.f23448d);
        parcel.writeInt(this.f23449e);
        this.f23450f.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f23451g, i);
        parcel.writeString(this.f23452h.name());
        v7d.m23162d(this.f23453i, parcel);
        parcel.writeInt(this.f23454j);
        b8d.m3489c(this.f23455k, parcel);
        parcel.writeInt(this.f23456l ? 1 : 0);
        parcel.writeInt(this.f23434H);
        parcel.writeInt(this.f23435I);
        Map map = this.f23436J;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.f23437K);
        parcel.writeInt(this.f23438L);
        parcel.writeInt(this.f23439M);
        parcel.writeInt(this.f23440N);
        parcel.writeInt(this.f23441O ? 1 : 0);
        parcel.writeString(this.f23442P);
        parcel.writeString(this.f23443Q);
        parcel.writeInt(this.f23444R ? 1 : 0);
    }

    public TokenPopupData(String str, String str2, TokenType tokenType, int i, int i2, TokenFragmentData tokenFragmentData, TokenViewState tokenViewState, TokenControllerType tokenControllerType, List list, int i3, TokenTransliteration tokenTransliteration, boolean z, int i4, int i5, Map map, int i6, int i7, int i8, int i9, boolean z2, String str3, String str4, boolean z3) {
        str.getClass();
        str2.getClass();
        tokenType.getClass();
        tokenFragmentData.getClass();
        tokenViewState.getClass();
        tokenControllerType.getClass();
        list.getClass();
        map.getClass();
        this.f23445a = str;
        this.f23446b = str2;
        this.f23447c = tokenType;
        this.f23448d = i;
        this.f23449e = i2;
        this.f23450f = tokenFragmentData;
        this.f23451g = tokenViewState;
        this.f23452h = tokenControllerType;
        this.f23453i = list;
        this.f23454j = i3;
        this.f23455k = tokenTransliteration;
        this.f23456l = z;
        this.f23434H = i4;
        this.f23435I = i5;
        this.f23436J = map;
        this.f23437K = i6;
        this.f23438L = i7;
        this.f23439M = i8;
        this.f23440N = i9;
        this.f23441O = z2;
        this.f23442P = str3;
        this.f23443Q = str4;
        this.f23444R = z3;
    }
}
