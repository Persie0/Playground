package com.lingq.shared.uimodel.lesson;

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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTextToken;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonStudyTextToken {

    /* JADX INFO: renamed from: a */
    public final String f21871a;

    /* JADX INFO: renamed from: b */
    public final String f21872b;

    /* JADX INFO: renamed from: c */
    public final boolean f21873c;

    /* JADX INFO: renamed from: d */
    public final String f21874d;

    /* JADX INFO: renamed from: e */
    public final String f21875e;

    /* JADX INFO: renamed from: f */
    public final LessonStudyTransliteration f21876f;

    /* JADX INFO: renamed from: g */
    public final int f21877g;

    /* JADX INFO: renamed from: h */
    public final int f21878h;

    /* JADX INFO: renamed from: i */
    public final boolean f21879i;

    /* JADX INFO: renamed from: j */
    public final String f21880j;

    /* JADX INFO: renamed from: k */
    public final boolean f21881k;

    /* JADX INFO: renamed from: l */
    public final boolean f21882l;

    /* JADX INFO: renamed from: m */
    public final int f21883m;

    public LessonStudyTextToken(String str, String str2, boolean z10, String str3, String str4, LessonStudyTransliteration lessonStudyTransliteration, int i10, int i11, boolean z11, String str5, boolean z12, boolean z13, int i12) {
        this.f21871a = str;
        this.f21872b = str2;
        this.f21873c = z10;
        this.f21874d = str3;
        this.f21875e = str4;
        this.f21876f = lessonStudyTransliteration;
        this.f21877g = i10;
        this.f21878h = i11;
        this.f21879i = z11;
        this.f21880j = str5;
        this.f21881k = z12;
        this.f21882l = z13;
        this.f21883m = i12;
    }

    public /* synthetic */ LessonStudyTextToken(String str, String str2, boolean z10, String str3, String str4, LessonStudyTransliteration lessonStudyTransliteration, int i10, int i11, boolean z11, String str5, boolean z12, boolean z13, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? false : z10, str3, str4, lessonStudyTransliteration, (i13 & 64) != 0 ? 0 : i10, (i13 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i11, (i13 & 256) != 0 ? false : z11, str5, (i13 & 1024) != 0 ? false : z12, (i13 & 2048) != 0 ? false : z13, (i13 & 4096) != 0 ? 0 : i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonStudyTextToken)) {
            return false;
        }
        LessonStudyTextToken lessonStudyTextToken = (LessonStudyTextToken) obj;
        return C5207g.m11106a(this.f21871a, lessonStudyTextToken.f21871a) && C5207g.m11106a(this.f21872b, lessonStudyTextToken.f21872b) && this.f21873c == lessonStudyTextToken.f21873c && C5207g.m11106a(this.f21874d, lessonStudyTextToken.f21874d) && C5207g.m11106a(this.f21875e, lessonStudyTextToken.f21875e) && C5207g.m11106a(this.f21876f, lessonStudyTextToken.f21876f) && this.f21877g == lessonStudyTextToken.f21877g && this.f21878h == lessonStudyTextToken.f21878h && this.f21879i == lessonStudyTextToken.f21879i && C5207g.m11106a(this.f21880j, lessonStudyTextToken.f21880j) && this.f21881k == lessonStudyTextToken.f21881k && this.f21882l == lessonStudyTextToken.f21882l && this.f21883m == lessonStudyTextToken.f21883m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f21871a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21872b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z10 = this.f21873c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode3 + r10) * 31;
        String str3 = this.f21874d;
        int iHashCode4 = (i10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21875e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LessonStudyTransliteration lessonStudyTransliteration = this.f21876f;
        int iM16d = C0009a.m16d(this.f21878h, C0009a.m16d(this.f21877g, (iHashCode5 + (lessonStudyTransliteration == null ? 0 : lessonStudyTransliteration.hashCode())) * 31, 31), 31);
        boolean z11 = this.f21879i;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iM16d + r11) * 31;
        String str5 = this.f21880j;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        int i12 = (i11 + iHashCode) * 31;
        boolean z12 = this.f21881k;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i13 = (i12 + r12) * 31;
        boolean z13 = this.f21882l;
        return Integer.hashCode(this.f21883m) + ((i13 + (z13 ? 1 : z13)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonStudyTextToken(punct=");
        sb2.append(this.f21871a);
        sb2.append(", whitespace=");
        sb2.append(this.f21872b);
        sb2.append(", isNumber=");
        sb2.append(this.f21873c);
        sb2.append(", opentag=");
        sb2.append(this.f21874d);
        sb2.append(", closetag=");
        sb2.append(this.f21875e);
        sb2.append(", transliteration=");
        sb2.append(this.f21876f);
        sb2.append(", index=");
        sb2.append(this.f21877g);
        sb2.append(", indexInSentence=");
        sb2.append(this.f21878h);
        sb2.append(", isIgnored=");
        sb2.append(this.f21879i);
        sb2.append(", text=");
        sb2.append(this.f21880j);
        sb2.append(", isUnknown=");
        sb2.append(this.f21881k);
        sb2.append(", isKnown=");
        sb2.append(this.f21882l);
        sb2.append(", wordId=");
        return C0166e.m768o(sb2, this.f21883m, ")");
    }
}
