package com.lingq.shared.uimodel.token;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/token/TokenMeaning;", "Landroid/os/Parcelable;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TokenMeaning implements Parcelable {
    public static final Parcelable.Creator<TokenMeaning> CREATOR = new C3407a();

    /* JADX INFO: renamed from: a */
    public final int f22088a;

    /* JADX INFO: renamed from: b */
    public final String f22089b;

    /* JADX INFO: renamed from: c */
    public final String f22090c;

    /* JADX INFO: renamed from: d */
    public final int f22091d;

    /* JADX INFO: renamed from: e */
    public final boolean f22092e;

    /* JADX INFO: renamed from: f */
    public final String f22093f;

    /* JADX INFO: renamed from: g */
    public final boolean f22094g;

    /* JADX INFO: renamed from: h */
    public final int f22095h;

    /* JADX INFO: renamed from: com.lingq.shared.uimodel.token.TokenMeaning$a */
    public static final class C3407a implements Parcelable.Creator<TokenMeaning> {
        @Override // android.os.Parcelable.Creator
        public final TokenMeaning createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return new TokenMeaning(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TokenMeaning[] newArray(int i10) {
            return new TokenMeaning[i10];
        }
    }

    public TokenMeaning() {
        this(0, null, null, 0, false, null, false, 0, 255, null);
    }

    public TokenMeaning(int i10, String str, String str2, int i11, boolean z10, String str3, boolean z11, int i12) {
        C5207g.m11111f(str, "locale");
        C5207g.m11111f(str2, "text");
        C5207g.m11111f(str3, "detectedLocale");
        this.f22088a = i10;
        this.f22089b = str;
        this.f22090c = str2;
        this.f22091d = i11;
        this.f22092e = z10;
        this.f22093f = str3;
        this.f22094g = z11;
        this.f22095h = i12;
    }

    public /* synthetic */ TokenMeaning(int i10, String str, String str2, int i11, boolean z10, String str3, boolean z11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? false : z10, (i13 & 32) == 0 ? str3 : "", (i13 & 64) != 0 ? false : z11, (i13 & BuildConfig.SDK_TRUNCATE_LENGTH) == 0 ? i12 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenMeaning)) {
            return false;
        }
        TokenMeaning tokenMeaning = (TokenMeaning) obj;
        if (this.f22088a == tokenMeaning.f22088a && C5207g.m11106a(this.f22089b, tokenMeaning.f22089b) && C5207g.m11106a(this.f22090c, tokenMeaning.f22090c) && this.f22091d == tokenMeaning.f22091d && this.f22092e == tokenMeaning.f22092e && C5207g.m11106a(this.f22093f, tokenMeaning.f22093f) && this.f22094g == tokenMeaning.f22094g && this.f22095h == tokenMeaning.f22095h) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f22091d, C0166e.m758d(this.f22090c, C0166e.m758d(this.f22089b, Integer.hashCode(this.f22088a) * 31, 31), 31), 31);
        ?? r10 = 1;
        boolean z10 = this.f22092e;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int iM758d = C0166e.m758d(this.f22093f, (iM16d + r11) * 31, 31);
        boolean z11 = this.f22094g;
        if (!z11) {
            r10 = z11;
        }
        return Integer.hashCode(this.f22095h) + ((iM758d + r10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenMeaning(id=");
        sb2.append(this.f22088a);
        sb2.append(", locale=");
        sb2.append(this.f22089b);
        sb2.append(", text=");
        sb2.append(this.f22090c);
        sb2.append(", popularity=");
        sb2.append(this.f22091d);
        sb2.append(", flagged=");
        sb2.append(this.f22092e);
        sb2.append(", detectedLocale=");
        sb2.append(this.f22093f);
        sb2.append(", isGoogleTranslate=");
        sb2.append(this.f22094g);
        sb2.append(", wordId=");
        return C0166e.m768o(sb2, this.f22095h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeInt(this.f22088a);
        parcel.writeString(this.f22089b);
        parcel.writeString(this.f22090c);
        parcel.writeInt(this.f22091d);
        parcel.writeInt(this.f22092e ? 1 : 0);
        parcel.writeString(this.f22093f);
        parcel.writeInt(this.f22094g ? 1 : 0);
        parcel.writeInt(this.f22095h);
    }
}
