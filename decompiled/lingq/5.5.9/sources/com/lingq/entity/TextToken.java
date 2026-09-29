package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/TextToken;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TextToken {

    /* JADX INFO: renamed from: a */
    public final String f17504a;

    /* JADX INFO: renamed from: b */
    public final String f17505b;

    /* JADX INFO: renamed from: c */
    public final boolean f17506c;

    /* JADX INFO: renamed from: d */
    public final String f17507d;

    /* JADX INFO: renamed from: e */
    public final String f17508e;

    /* JADX INFO: renamed from: f */
    public final LessonTransliteration f17509f;

    /* JADX INFO: renamed from: g */
    public final int f17510g;

    /* JADX INFO: renamed from: h */
    public final int f17511h;

    /* JADX INFO: renamed from: i */
    public final boolean f17512i;

    /* JADX INFO: renamed from: j */
    public final String f17513j;

    /* JADX INFO: renamed from: k */
    public final boolean f17514k;

    /* JADX INFO: renamed from: l */
    public final boolean f17515l;

    /* JADX INFO: renamed from: m */
    public final int f17516m;

    public TextToken(String str, String str2, boolean z10, String str3, String str4, LessonTransliteration lessonTransliteration, int i10, int i11, boolean z11, String str5, boolean z12, boolean z13, int i12) {
        this.f17504a = str;
        this.f17505b = str2;
        this.f17506c = z10;
        this.f17507d = str3;
        this.f17508e = str4;
        this.f17509f = lessonTransliteration;
        this.f17510g = i10;
        this.f17511h = i11;
        this.f17512i = z11;
        this.f17513j = str5;
        this.f17514k = z12;
        this.f17515l = z13;
        this.f17516m = i12;
    }

    public /* synthetic */ TextToken(String str, String str2, boolean z10, String str3, String str4, LessonTransliteration lessonTransliteration, int i10, int i11, boolean z11, String str5, boolean z12, boolean z13, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? false : z10, str3, str4, lessonTransliteration, (i13 & 64) != 0 ? 0 : i10, (i13 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i11, (i13 & 256) != 0 ? false : z11, str5, (i13 & 1024) != 0 ? false : z12, (i13 & 2048) != 0 ? false : z13, (i13 & 4096) != 0 ? 0 : i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextToken)) {
            return false;
        }
        TextToken textToken = (TextToken) obj;
        if (C5207g.m11106a(this.f17504a, textToken.f17504a) && C5207g.m11106a(this.f17505b, textToken.f17505b) && this.f17506c == textToken.f17506c && C5207g.m11106a(this.f17507d, textToken.f17507d) && C5207g.m11106a(this.f17508e, textToken.f17508e) && C5207g.m11106a(this.f17509f, textToken.f17509f) && this.f17510g == textToken.f17510g && this.f17511h == textToken.f17511h && this.f17512i == textToken.f17512i && C5207g.m11106a(this.f17513j, textToken.f17513j) && this.f17514k == textToken.f17514k && this.f17515l == textToken.f17515l && this.f17516m == textToken.f17516m) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f17504a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17505b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ?? r10 = 1;
        boolean z10 = this.f17506c;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode3 + r11) * 31;
        String str3 = this.f17507d;
        int iHashCode4 = (i10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17508e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LessonTransliteration lessonTransliteration = this.f17509f;
        int iM16d = C0009a.m16d(this.f17511h, C0009a.m16d(this.f17510g, (iHashCode5 + (lessonTransliteration == null ? 0 : lessonTransliteration.hashCode())) * 31, 31), 31);
        boolean z11 = this.f17512i;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i11 = (iM16d + r12) * 31;
        String str5 = this.f17513j;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        int i12 = (i11 + iHashCode) * 31;
        boolean z12 = this.f17514k;
        ?? r13 = z12;
        if (z12) {
            r13 = 1;
        }
        int i13 = (i12 + r13) * 31;
        boolean z13 = this.f17515l;
        if (!z13) {
            r10 = z13;
        }
        return Integer.hashCode(this.f17516m) + ((i13 + r10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextToken(punct=");
        sb2.append(this.f17504a);
        sb2.append(", whitespace=");
        sb2.append(this.f17505b);
        sb2.append(", isNumber=");
        sb2.append(this.f17506c);
        sb2.append(", opentag=");
        sb2.append(this.f17507d);
        sb2.append(", closetag=");
        sb2.append(this.f17508e);
        sb2.append(", transliteration=");
        sb2.append(this.f17509f);
        sb2.append(", index=");
        sb2.append(this.f17510g);
        sb2.append(", indexInSentence=");
        sb2.append(this.f17511h);
        sb2.append(", isIgnored=");
        sb2.append(this.f17512i);
        sb2.append(", text=");
        sb2.append(this.f17513j);
        sb2.append(", isUnknown=");
        sb2.append(this.f17514k);
        sb2.append(", isKnown=");
        sb2.append(this.f17515l);
        sb2.append(", wordId=");
        return C0166e.m768o(sb2, this.f17516m, ")");
    }
}
