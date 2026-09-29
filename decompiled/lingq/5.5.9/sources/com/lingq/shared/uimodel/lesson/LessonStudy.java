package com.lingq.shared.uimodel.lesson;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonStudy {

    /* JADX INFO: renamed from: a */
    public final int f21815a;

    /* JADX INFO: renamed from: b */
    public final String f21816b;

    /* JADX INFO: renamed from: c */
    public final String f21817c;

    /* JADX INFO: renamed from: d */
    public final String f21818d;

    /* JADX INFO: renamed from: e */
    public final String f21819e;

    /* JADX INFO: renamed from: f */
    public final String f21820f;

    /* JADX INFO: renamed from: g */
    public final int f21821g;

    /* JADX INFO: renamed from: h */
    public final int f21822h;

    /* JADX INFO: renamed from: i */
    public final String f21823i;

    /* JADX INFO: renamed from: j */
    public final LessonStudyTranslation f21824j;

    /* JADX INFO: renamed from: k */
    public final Integer f21825k;

    /* JADX INFO: renamed from: l */
    public final Integer f21826l;

    /* JADX INFO: renamed from: m */
    public final boolean f21827m;

    /* JADX INFO: renamed from: n */
    public final int f21828n;

    /* JADX INFO: renamed from: o */
    public final List<LessonStudyTranslationSentence> f21829o;

    /* JADX INFO: renamed from: p */
    public final String f21830p;

    /* JADX INFO: renamed from: q */
    public final String f21831q;

    /* JADX INFO: renamed from: r */
    public final String f21832r;

    /* JADX INFO: renamed from: s */
    public final int f21833s;

    /* JADX INFO: renamed from: t */
    public final Boolean f21834t;

    /* JADX INFO: renamed from: u */
    public final String f21835u;

    /* JADX INFO: renamed from: v */
    public final boolean f21836v;

    /* JADX INFO: renamed from: w */
    public final String f21837w;

    /* JADX INFO: renamed from: x */
    public final boolean f21838x;

    /* JADX INFO: renamed from: y */
    public final boolean f21839y;

    /* JADX INFO: renamed from: z */
    public final int f21840z;

    public LessonStudy(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, LessonStudyTranslation lessonStudyTranslation, Integer num, Integer num2, boolean z10, int i13, List<LessonStudyTranslationSentence> list, String str7, String str8, String str9, int i14, Boolean bool, String str10, boolean z11, String str11, boolean z12, boolean z13, int i15) {
        C5207g.m11111f(str, "title");
        C5207g.m11111f(list, "translationSentence");
        this.f21815a = i10;
        this.f21816b = str;
        this.f21817c = str2;
        this.f21818d = str3;
        this.f21819e = str4;
        this.f21820f = str5;
        this.f21821g = i11;
        this.f21822h = i12;
        this.f21823i = str6;
        this.f21824j = lessonStudyTranslation;
        this.f21825k = num;
        this.f21826l = num2;
        this.f21827m = z10;
        this.f21828n = i13;
        this.f21829o = list;
        this.f21830p = str7;
        this.f21831q = str8;
        this.f21832r = str9;
        this.f21833s = i14;
        this.f21834t = bool;
        this.f21835u = str10;
        this.f21836v = z11;
        this.f21837w = str11;
        this.f21838x = z12;
        this.f21839y = z13;
        this.f21840z = i15;
    }

    public LessonStudy(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, LessonStudyTranslation lessonStudyTranslation, Integer num, Integer num2, boolean z10, int i13, List list, String str7, String str8, String str9, int i14, Boolean bool, String str10, boolean z11, String str11, boolean z12, boolean z13, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i10, (i16 & 2) != 0 ? "" : str, (i16 & 4) != 0 ? "" : str2, (i16 & 8) != 0 ? "" : str3, (i16 & 16) != 0 ? "" : str4, (i16 & 32) != 0 ? "" : str5, (i16 & 64) != 0 ? 0 : i11, (i16 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i12, (i16 & 256) != 0 ? "" : str6, lessonStudyTranslation, (i16 & 1024) != 0 ? 0 : num, (i16 & 2048) != 0 ? 0 : num2, (i16 & 4096) != 0 ? false : z10, (i16 & 8192) != 0 ? 0 : i13, (i16 & 16384) != 0 ? EmptyList.f38032a : list, (32768 & i16) != 0 ? "" : str7, (65536 & i16) != 0 ? "" : str8, (131072 & i16) != 0 ? "" : str9, i14, bool, str10, (2097152 & i16) != 0 ? false : z11, str11, (8388608 & i16) != 0 ? true : z12, (16777216 & i16) != 0 ? false : z13, (i16 & 33554432) != 0 ? 0 : i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonStudy)) {
            return false;
        }
        LessonStudy lessonStudy = (LessonStudy) obj;
        return this.f21815a == lessonStudy.f21815a && C5207g.m11106a(this.f21816b, lessonStudy.f21816b) && C5207g.m11106a(this.f21817c, lessonStudy.f21817c) && C5207g.m11106a(this.f21818d, lessonStudy.f21818d) && C5207g.m11106a(this.f21819e, lessonStudy.f21819e) && C5207g.m11106a(this.f21820f, lessonStudy.f21820f) && this.f21821g == lessonStudy.f21821g && this.f21822h == lessonStudy.f21822h && C5207g.m11106a(this.f21823i, lessonStudy.f21823i) && C5207g.m11106a(this.f21824j, lessonStudy.f21824j) && C5207g.m11106a(this.f21825k, lessonStudy.f21825k) && C5207g.m11106a(this.f21826l, lessonStudy.f21826l) && this.f21827m == lessonStudy.f21827m && this.f21828n == lessonStudy.f21828n && C5207g.m11106a(this.f21829o, lessonStudy.f21829o) && C5207g.m11106a(this.f21830p, lessonStudy.f21830p) && C5207g.m11106a(this.f21831q, lessonStudy.f21831q) && C5207g.m11106a(this.f21832r, lessonStudy.f21832r) && this.f21833s == lessonStudy.f21833s && C5207g.m11106a(this.f21834t, lessonStudy.f21834t) && C5207g.m11106a(this.f21835u, lessonStudy.f21835u) && this.f21836v == lessonStudy.f21836v && C5207g.m11106a(this.f21837w, lessonStudy.f21837w) && this.f21838x == lessonStudy.f21838x && this.f21839y == lessonStudy.f21839y && this.f21840z == lessonStudy.f21840z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f21816b, Integer.hashCode(this.f21815a) * 31, 31);
        int iHashCode = 0;
        String str = this.f21817c;
        int iHashCode2 = (iM758d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21818d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21819e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21820f;
        int iM16d = C0009a.m16d(this.f21822h, C0009a.m16d(this.f21821g, (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31);
        String str5 = this.f21823i;
        int iHashCode5 = (iM16d + (str5 == null ? 0 : str5.hashCode())) * 31;
        LessonStudyTranslation lessonStudyTranslation = this.f21824j;
        int iHashCode6 = (iHashCode5 + (lessonStudyTranslation == null ? 0 : lessonStudyTranslation.hashCode())) * 31;
        Integer num = this.f21825k;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f21826l;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z10 = this.f21827m;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM848g = C0204c.m848g(this.f21829o, C0009a.m16d(this.f21828n, (iHashCode8 + r10) * 31, 31), 31);
        String str6 = this.f21830p;
        int iHashCode9 = (iM848g + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f21831q;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f21832r;
        int iM16d2 = C0009a.m16d(this.f21833s, (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31, 31);
        Boolean bool = this.f21834t;
        int iHashCode11 = (iM16d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.f21835u;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        boolean z11 = this.f21836v;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i10 = (iHashCode12 + r11) * 31;
        String str10 = this.f21837w;
        if (str10 != null) {
            iHashCode = str10.hashCode();
        }
        int i11 = (i10 + iHashCode) * 31;
        boolean z12 = this.f21838x;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.f21839y;
        return Integer.hashCode(this.f21840z) + ((i12 + (z13 ? 1 : z13)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonStudy(id=");
        sb2.append(this.f21815a);
        sb2.append(", title=");
        sb2.append(this.f21816b);
        sb2.append(", description=");
        sb2.append(this.f21817c);
        sb2.append(", originalImageUrl=");
        sb2.append(this.f21818d);
        sb2.append(", imageUrl=");
        sb2.append(this.f21819e);
        sb2.append(", audioUrl=");
        sb2.append(this.f21820f);
        sb2.append(", duration=");
        sb2.append(this.f21821g);
        sb2.append(", collectionId=");
        sb2.append(this.f21822h);
        sb2.append(", collectionTitle=");
        sb2.append(this.f21823i);
        sb2.append(", translation=");
        sb2.append(this.f21824j);
        sb2.append(", previousLessonId=");
        sb2.append(this.f21825k);
        sb2.append(", nextLessonId=");
        sb2.append(this.f21826l);
        sb2.append(", isCompleted=");
        sb2.append(this.f21827m);
        sb2.append(", progressDownloaded=");
        sb2.append(this.f21828n);
        sb2.append(", translationSentence=");
        sb2.append(this.f21829o);
        sb2.append(", mediaImageUrl=");
        sb2.append(this.f21830p);
        sb2.append(", mediaTitle=");
        sb2.append(this.f21831q);
        sb2.append(", level=");
        sb2.append(this.f21832r);
        sb2.append(", newWordsCount=");
        sb2.append(this.f21833s);
        sb2.append(", isTaken=");
        sb2.append(this.f21834t);
        sb2.append(", videoUrl=");
        sb2.append(this.f21835u);
        sb2.append(", audioPending=");
        sb2.append(this.f21836v);
        sb2.append(", sharedByName=");
        sb2.append(this.f21837w);
        sb2.append(", isProtected=");
        sb2.append(this.f21838x);
        sb2.append(", canEditSentence=");
        sb2.append(this.f21839y);
        sb2.append(", price=");
        return C0166e.m768o(sb2, this.f21840z, ")");
    }
}
