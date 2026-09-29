package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.entity.LessonBookmark;
import com.lingq.entity.LessonTranslation;
import com.lingq.entity.LessonUserCompleted;
import com.lingq.entity.LessonUserLiked;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import p511yh.C10364a;
import p511yh.C10365b;
import p511yh.C10368e;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultPlaylist;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultPlaylist {

    /* JADX INFO: renamed from: A */
    public final LessonUserCompleted f18821A;

    /* JADX INFO: renamed from: B */
    public final LessonTranslation f18822B;

    /* JADX INFO: renamed from: C */
    public final String f18823C;

    /* JADX INFO: renamed from: D */
    public final Integer f18824D;

    /* JADX INFO: renamed from: E */
    public final Integer f18825E;

    /* JADX INFO: renamed from: F */
    public final double f18826F;

    /* JADX INFO: renamed from: G */
    public final double f18827G;

    /* JADX INFO: renamed from: H */
    public final boolean f18828H;

    /* JADX INFO: renamed from: I */
    public final int f18829I;

    /* JADX INFO: renamed from: J */
    public final int f18830J;

    /* JADX INFO: renamed from: K */
    public final boolean f18831K;

    /* JADX INFO: renamed from: L */
    public final String f18832L;

    /* JADX INFO: renamed from: M */
    public final int f18833M;

    /* JADX INFO: renamed from: N */
    public final boolean f18834N;

    /* JADX INFO: renamed from: O */
    public final double f18835O;

    /* JADX INFO: renamed from: P */
    public final String f18836P;

    /* JADX INFO: renamed from: Q */
    public final boolean f18837Q;

    /* JADX INFO: renamed from: R */
    public final String f18838R;

    /* JADX INFO: renamed from: S */
    public final String f18839S;

    /* JADX INFO: renamed from: T */
    public final String f18840T;

    /* JADX INFO: renamed from: U */
    public final String f18841U;

    /* JADX INFO: renamed from: V */
    public final int f18842V;

    /* JADX INFO: renamed from: W */
    public final Integer f18843W;

    /* JADX INFO: renamed from: X */
    public final String f18844X;

    /* JADX INFO: renamed from: Y */
    public final String f18845Y;

    /* JADX INFO: renamed from: Z */
    public final String f18846Z;

    /* JADX INFO: renamed from: a */
    public final int f18847a;

    /* JADX INFO: renamed from: a0 */
    public final String f18848a0;

    /* JADX INFO: renamed from: b */
    public final String f18849b;

    /* JADX INFO: renamed from: b0 */
    public final String f18850b0;

    /* JADX INFO: renamed from: c */
    public final int f18851c;

    /* JADX INFO: renamed from: c0 */
    public final String f18852c0;

    /* JADX INFO: renamed from: d */
    public final String f18853d;

    /* JADX INFO: renamed from: d0 */
    public final String f18854d0;

    /* JADX INFO: renamed from: e */
    public final String f18855e;

    /* JADX INFO: renamed from: e0 */
    public final String f18856e0;

    /* JADX INFO: renamed from: f */
    public final String f18857f;

    /* JADX INFO: renamed from: f0 */
    public final boolean f18858f0;

    /* JADX INFO: renamed from: g */
    public final String f18859g;

    /* JADX INFO: renamed from: g0 */
    public final boolean f18860g0;

    /* JADX INFO: renamed from: h */
    public final String f18861h;

    /* JADX INFO: renamed from: h0 */
    public final int f18862h0;

    /* JADX INFO: renamed from: i */
    public final int f18863i;

    /* JADX INFO: renamed from: i0 */
    public final int f18864i0;

    /* JADX INFO: renamed from: j */
    public final String f18865j;

    /* JADX INFO: renamed from: j0 */
    public final String f18866j0;

    /* JADX INFO: renamed from: k */
    public final String f18867k;

    /* JADX INFO: renamed from: k0 */
    public final List<String> f18868k0;

    /* JADX INFO: renamed from: l */
    public final String f18869l;

    /* JADX INFO: renamed from: l0 */
    public final int f18870l0;

    /* JADX INFO: renamed from: m */
    public final int f18871m;

    /* JADX INFO: renamed from: m0 */
    public final String f18872m0;

    /* JADX INFO: renamed from: n */
    public final int f18873n;

    /* JADX INFO: renamed from: n0 */
    public final String f18874n0;

    /* JADX INFO: renamed from: o */
    public final String f18875o;

    /* JADX INFO: renamed from: p */
    public final String f18876p;

    /* JADX INFO: renamed from: q */
    public final int f18877q;

    /* JADX INFO: renamed from: r */
    public final double f18878r;

    /* JADX INFO: renamed from: s */
    public final double f18879s;

    /* JADX INFO: renamed from: t */
    public final int f18880t;

    /* JADX INFO: renamed from: u */
    public final String f18881u;

    /* JADX INFO: renamed from: v */
    @InterfaceC9303g(name = "cards")
    public final C10365b f18882v;

    /* JADX INFO: renamed from: w */
    @InterfaceC9303g(name = "words")
    public final C10368e f18883w;

    /* JADX INFO: renamed from: x */
    @InterfaceC9303g(name = "tokenizedText")
    public final List<C10364a> f18884x;

    /* JADX INFO: renamed from: y */
    public final LessonBookmark f18885y;

    /* JADX INFO: renamed from: z */
    public final LessonUserLiked f18886z;

    public ResultPlaylist(int i10, String str, int i11, String str2, String str3, String str4, String str5, String str6, int i12, String str7, String str8, String str9, int i13, int i14, String str10, String str11, int i15, double d10, double d11, int i16, String str12, C10365b c10365b, C10368e c10368e, List<C10364a> list, LessonBookmark lessonBookmark, LessonUserLiked lessonUserLiked, LessonUserCompleted lessonUserCompleted, LessonTranslation lessonTranslation, String str13, Integer num, Integer num2, double d12, double d13, boolean z10, int i17, int i18, boolean z11, String str14, int i19, boolean z12, double d14, String str15, boolean z13, String str16, String str17, String str18, String str19, int i20, Integer num3, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z14, boolean z15, int i21, int i22, String str28, List<String> list2, int i23, String str29, String str30) {
        C5207g.m11111f(list, "paragraphs");
        C5207g.m11111f(str29, "ofQuery");
        C5207g.m11111f(str30, "type");
        this.f18847a = i10;
        this.f18849b = str;
        this.f18851c = i11;
        this.f18853d = str2;
        this.f18855e = str3;
        this.f18857f = str4;
        this.f18859g = str5;
        this.f18861h = str6;
        this.f18863i = i12;
        this.f18865j = str7;
        this.f18867k = str8;
        this.f18869l = str9;
        this.f18871m = i13;
        this.f18873n = i14;
        this.f18875o = str10;
        this.f18876p = str11;
        this.f18877q = i15;
        this.f18878r = d10;
        this.f18879s = d11;
        this.f18880t = i16;
        this.f18881u = str12;
        this.f18882v = c10365b;
        this.f18883w = c10368e;
        this.f18884x = list;
        this.f18885y = lessonBookmark;
        this.f18886z = lessonUserLiked;
        this.f18821A = lessonUserCompleted;
        this.f18822B = lessonTranslation;
        this.f18823C = str13;
        this.f18824D = num;
        this.f18825E = num2;
        this.f18826F = d12;
        this.f18827G = d13;
        this.f18828H = z10;
        this.f18829I = i17;
        this.f18830J = i18;
        this.f18831K = z11;
        this.f18832L = str14;
        this.f18833M = i19;
        this.f18834N = z12;
        this.f18835O = d14;
        this.f18836P = str15;
        this.f18837Q = z13;
        this.f18838R = str16;
        this.f18839S = str17;
        this.f18840T = str18;
        this.f18841U = str19;
        this.f18842V = i20;
        this.f18843W = num3;
        this.f18844X = str20;
        this.f18845Y = str21;
        this.f18846Z = str22;
        this.f18848a0 = str23;
        this.f18850b0 = str24;
        this.f18852c0 = str25;
        this.f18854d0 = str26;
        this.f18856e0 = str27;
        this.f18858f0 = z14;
        this.f18860g0 = z15;
        this.f18862h0 = i21;
        this.f18864i0 = i22;
        this.f18866j0 = str28;
        this.f18868k0 = list2;
        this.f18870l0 = i23;
        this.f18872m0 = str29;
        this.f18874n0 = str30;
    }

    public ResultPlaylist(int i10, String str, int i11, String str2, String str3, String str4, String str5, String str6, int i12, String str7, String str8, String str9, int i13, int i14, String str10, String str11, int i15, double d10, double d11, int i16, String str12, C10365b c10365b, C10368e c10368e, List list, LessonBookmark lessonBookmark, LessonUserLiked lessonUserLiked, LessonUserCompleted lessonUserCompleted, LessonTranslation lessonTranslation, String str13, Integer num, Integer num2, double d12, double d13, boolean z10, int i17, int i18, boolean z11, String str14, int i19, boolean z12, double d14, String str15, boolean z13, String str16, String str17, String str18, String str19, int i20, Integer num3, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z14, boolean z15, int i21, int i22, String str28, List list2, int i23, String str29, String str30, int i24, int i25, int i26, DefaultConstructorMarker defaultConstructorMarker) {
        this((i24 & 1) != 0 ? 0 : i10, str, (i24 & 4) != 0 ? 0 : i11, str2, str3, str4, str5, str6, (i24 & 256) != 0 ? 0 : i12, str7, str8, str9, (i24 & 4096) != 0 ? 0 : i13, (i24 & 8192) != 0 ? 0 : i14, str10, str11, (i24 & 65536) != 0 ? 0 : i15, (i24 & 131072) != 0 ? 0.0d : d10, (i24 & 262144) != 0 ? 0.0d : d11, (i24 & 524288) != 0 ? 0 : i16, str12, c10365b, c10368e, (i24 & 8388608) != 0 ? EmptyList.f38032a : list, lessonBookmark, lessonUserLiked, lessonUserCompleted, lessonTranslation, str13, (536870912 & i24) != 0 ? 0 : num, (1073741824 & i24) != 0 ? 0 : num2, (i24 & Integer.MIN_VALUE) != 0 ? 0.0d : d12, (i25 & 1) != 0 ? 0.0d : d13, (i25 & 2) != 0 ? false : z10, (i25 & 4) != 0 ? 0 : i17, (i25 & 8) != 0 ? 0 : i18, (i25 & 16) != 0 ? false : z11, str14, (i25 & 64) != 0 ? 0 : i19, (i25 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? false : z12, (i25 & 256) != 0 ? 0.0d : d14, str15, (i25 & 1024) != 0 ? false : z13, str16, str17, str18, str19, (32768 & i25) != 0 ? 0 : i20, (i25 & 65536) != 0 ? 0 : num3, (i25 & 131072) != 0 ? null : str20, (i25 & 262144) != 0 ? null : str21, (i25 & 524288) != 0 ? null : str22, (1048576 & i25) != 0 ? null : str23, (2097152 & i25) != 0 ? null : str24, (4194304 & i25) != 0 ? null : str25, (i25 & 8388608) != 0 ? null : str26, (16777216 & i25) != 0 ? null : str27, (33554432 & i25) != 0 ? false : z14, (67108864 & i25) != 0 ? false : z15, (134217728 & i25) != 0 ? 0 : i21, (268435456 & i25) != 0 ? 0 : i22, str28, list2, (i25 & Integer.MIN_VALUE) != 0 ? 0 : i23, (i26 & 1) != 0 ? "" : str29, (i26 & 2) != 0 ? "" : str30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultPlaylist)) {
            return false;
        }
        ResultPlaylist resultPlaylist = (ResultPlaylist) obj;
        return this.f18847a == resultPlaylist.f18847a && C5207g.m11106a(this.f18849b, resultPlaylist.f18849b) && this.f18851c == resultPlaylist.f18851c && C5207g.m11106a(this.f18853d, resultPlaylist.f18853d) && C5207g.m11106a(this.f18855e, resultPlaylist.f18855e) && C5207g.m11106a(this.f18857f, resultPlaylist.f18857f) && C5207g.m11106a(this.f18859g, resultPlaylist.f18859g) && C5207g.m11106a(this.f18861h, resultPlaylist.f18861h) && this.f18863i == resultPlaylist.f18863i && C5207g.m11106a(this.f18865j, resultPlaylist.f18865j) && C5207g.m11106a(this.f18867k, resultPlaylist.f18867k) && C5207g.m11106a(this.f18869l, resultPlaylist.f18869l) && this.f18871m == resultPlaylist.f18871m && this.f18873n == resultPlaylist.f18873n && C5207g.m11106a(this.f18875o, resultPlaylist.f18875o) && C5207g.m11106a(this.f18876p, resultPlaylist.f18876p) && this.f18877q == resultPlaylist.f18877q && Double.compare(this.f18878r, resultPlaylist.f18878r) == 0 && Double.compare(this.f18879s, resultPlaylist.f18879s) == 0 && this.f18880t == resultPlaylist.f18880t && C5207g.m11106a(this.f18881u, resultPlaylist.f18881u) && C5207g.m11106a(this.f18882v, resultPlaylist.f18882v) && C5207g.m11106a(this.f18883w, resultPlaylist.f18883w) && C5207g.m11106a(this.f18884x, resultPlaylist.f18884x) && C5207g.m11106a(this.f18885y, resultPlaylist.f18885y) && C5207g.m11106a(this.f18886z, resultPlaylist.f18886z) && C5207g.m11106a(this.f18821A, resultPlaylist.f18821A) && C5207g.m11106a(this.f18822B, resultPlaylist.f18822B) && C5207g.m11106a(this.f18823C, resultPlaylist.f18823C) && C5207g.m11106a(this.f18824D, resultPlaylist.f18824D) && C5207g.m11106a(this.f18825E, resultPlaylist.f18825E) && Double.compare(this.f18826F, resultPlaylist.f18826F) == 0 && Double.compare(this.f18827G, resultPlaylist.f18827G) == 0 && this.f18828H == resultPlaylist.f18828H && this.f18829I == resultPlaylist.f18829I && this.f18830J == resultPlaylist.f18830J && this.f18831K == resultPlaylist.f18831K && C5207g.m11106a(this.f18832L, resultPlaylist.f18832L) && this.f18833M == resultPlaylist.f18833M && this.f18834N == resultPlaylist.f18834N && Double.compare(this.f18835O, resultPlaylist.f18835O) == 0 && C5207g.m11106a(this.f18836P, resultPlaylist.f18836P) && this.f18837Q == resultPlaylist.f18837Q && C5207g.m11106a(this.f18838R, resultPlaylist.f18838R) && C5207g.m11106a(this.f18839S, resultPlaylist.f18839S) && C5207g.m11106a(this.f18840T, resultPlaylist.f18840T) && C5207g.m11106a(this.f18841U, resultPlaylist.f18841U) && this.f18842V == resultPlaylist.f18842V && C5207g.m11106a(this.f18843W, resultPlaylist.f18843W) && C5207g.m11106a(this.f18844X, resultPlaylist.f18844X) && C5207g.m11106a(this.f18845Y, resultPlaylist.f18845Y) && C5207g.m11106a(this.f18846Z, resultPlaylist.f18846Z) && C5207g.m11106a(this.f18848a0, resultPlaylist.f18848a0) && C5207g.m11106a(this.f18850b0, resultPlaylist.f18850b0) && C5207g.m11106a(this.f18852c0, resultPlaylist.f18852c0) && C5207g.m11106a(this.f18854d0, resultPlaylist.f18854d0) && C5207g.m11106a(this.f18856e0, resultPlaylist.f18856e0) && this.f18858f0 == resultPlaylist.f18858f0 && this.f18860g0 == resultPlaylist.f18860g0 && this.f18862h0 == resultPlaylist.f18862h0 && this.f18864i0 == resultPlaylist.f18864i0 && C5207g.m11106a(this.f18866j0, resultPlaylist.f18866j0) && C5207g.m11106a(this.f18868k0, resultPlaylist.f18868k0) && this.f18870l0 == resultPlaylist.f18870l0 && C5207g.m11106a(this.f18872m0, resultPlaylist.f18872m0) && C5207g.m11106a(this.f18874n0, resultPlaylist.f18874n0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [int] */
    /* JADX WARN: Type inference failed for: r0v56, types: [int] */
    /* JADX WARN: Type inference failed for: r0v60, types: [int] */
    /* JADX WARN: Type inference failed for: r0v65, types: [int] */
    /* JADX WARN: Type inference failed for: r0v70, types: [int] */
    /* JADX WARN: Type inference failed for: r0v99, types: [int] */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v65, types: [int] */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18847a) * 31;
        int iHashCode2 = 0;
        String str = this.f18849b;
        int iM16d = C0009a.m16d(this.f18851c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f18853d;
        int iHashCode3 = (iM16d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18855e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18857f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18859g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18861h;
        int iM16d2 = C0009a.m16d(this.f18863i, (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.f18865j;
        int iHashCode7 = (iM16d2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f18867k;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f18869l;
        int iM16d3 = C0009a.m16d(this.f18873n, C0009a.m16d(this.f18871m, (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31, 31), 31);
        String str10 = this.f18875o;
        int iHashCode9 = (iM16d3 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f18876p;
        int iM16d4 = C0009a.m16d(this.f18880t, C0141b.m609e(this.f18879s, C0141b.m609e(this.f18878r, C0009a.m16d(this.f18877q, (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31, 31), 31), 31), 31);
        String str12 = this.f18881u;
        int iHashCode10 = (iM16d4 + (str12 == null ? 0 : str12.hashCode())) * 31;
        C10365b c10365b = this.f18882v;
        int iHashCode11 = (iHashCode10 + (c10365b == null ? 0 : c10365b.hashCode())) * 31;
        C10368e c10368e = this.f18883w;
        int iM848g = C0204c.m848g(this.f18884x, (iHashCode11 + (c10368e == null ? 0 : c10368e.hashCode())) * 31, 31);
        LessonBookmark lessonBookmark = this.f18885y;
        int iHashCode12 = (iM848g + (lessonBookmark == null ? 0 : lessonBookmark.hashCode())) * 31;
        LessonUserLiked lessonUserLiked = this.f18886z;
        int iHashCode13 = (iHashCode12 + (lessonUserLiked == null ? 0 : lessonUserLiked.hashCode())) * 31;
        LessonUserCompleted lessonUserCompleted = this.f18821A;
        int iHashCode14 = (iHashCode13 + (lessonUserCompleted == null ? 0 : lessonUserCompleted.hashCode())) * 31;
        LessonTranslation lessonTranslation = this.f18822B;
        int iHashCode15 = (iHashCode14 + (lessonTranslation == null ? 0 : lessonTranslation.hashCode())) * 31;
        String str13 = this.f18823C;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num = this.f18824D;
        int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f18825E;
        int iM609e = C0141b.m609e(this.f18827G, C0141b.m609e(this.f18826F, (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31);
        ?? r10 = 1;
        boolean z10 = this.f18828H;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int iM16d5 = C0009a.m16d(this.f18830J, C0009a.m16d(this.f18829I, (iM609e + r11) * 31, 31), 31);
        boolean z11 = this.f18831K;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i10 = (iM16d5 + r12) * 31;
        String str14 = this.f18832L;
        int iM16d6 = C0009a.m16d(this.f18833M, (i10 + (str14 == null ? 0 : str14.hashCode())) * 31, 31);
        boolean z12 = this.f18834N;
        ?? r13 = z12;
        if (z12) {
            r13 = 1;
        }
        int iM609e2 = C0141b.m609e(this.f18835O, (iM16d6 + r13) * 31, 31);
        String str15 = this.f18836P;
        int iHashCode18 = (iM609e2 + (str15 == null ? 0 : str15.hashCode())) * 31;
        boolean z13 = this.f18837Q;
        ?? r14 = z13;
        if (z13) {
            r14 = 1;
        }
        int i11 = (iHashCode18 + r14) * 31;
        String str16 = this.f18838R;
        int iHashCode19 = (i11 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f18839S;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f18840T;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f18841U;
        int iM16d7 = C0009a.m16d(this.f18842V, (iHashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31, 31);
        Integer num3 = this.f18843W;
        int iHashCode22 = (iM16d7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str20 = this.f18844X;
        int iHashCode23 = (iHashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f18845Y;
        int iHashCode24 = (iHashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f18846Z;
        int iHashCode25 = (iHashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f18848a0;
        int iHashCode26 = (iHashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f18850b0;
        int iHashCode27 = (iHashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.f18852c0;
        int iHashCode28 = (iHashCode27 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.f18854d0;
        int iHashCode29 = (iHashCode28 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.f18856e0;
        int iHashCode30 = (iHashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
        boolean z14 = this.f18858f0;
        ?? r15 = z14;
        if (z14) {
            r15 = 1;
        }
        int i12 = (iHashCode30 + r15) * 31;
        boolean z15 = this.f18860g0;
        if (!z15) {
            r10 = z15;
        }
        int iM16d8 = C0009a.m16d(this.f18864i0, C0009a.m16d(this.f18862h0, (i12 + r10) * 31, 31), 31);
        String str28 = this.f18866j0;
        int iHashCode31 = (iM16d8 + (str28 == null ? 0 : str28.hashCode())) * 31;
        List<String> list = this.f18868k0;
        if (list != null) {
            iHashCode2 = list.hashCode();
        }
        return this.f18874n0.hashCode() + C0166e.m758d(this.f18872m0, C0009a.m16d(this.f18870l0, (iHashCode31 + iHashCode2) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultPlaylist(id=");
        sb2.append(this.f18847a);
        sb2.append(", url=");
        sb2.append(this.f18849b);
        sb2.append(", pos=");
        sb2.append(this.f18851c);
        sb2.append(", title=");
        sb2.append(this.f18853d);
        sb2.append(", description=");
        sb2.append(this.f18855e);
        sb2.append(", pubDate=");
        sb2.append(this.f18857f);
        sb2.append(", imageUrl=");
        sb2.append(this.f18859g);
        sb2.append(", audio=");
        sb2.append(this.f18861h);
        sb2.append(", duration=");
        sb2.append(this.f18863i);
        sb2.append(", status=");
        sb2.append(this.f18865j);
        sb2.append(", sharedDate=");
        sb2.append(this.f18867k);
        sb2.append(", originalUrl=");
        sb2.append(this.f18869l);
        sb2.append(", wordCount=");
        sb2.append(this.f18871m);
        sb2.append(", uniqueWordCount=");
        sb2.append(this.f18873n);
        sb2.append(", text=");
        sb2.append(this.f18875o);
        sb2.append(", normalizedText=");
        sb2.append(this.f18876p);
        sb2.append(", rosesCount=");
        sb2.append(this.f18877q);
        sb2.append(", lessonRating=");
        sb2.append(this.f18878r);
        sb2.append(", audioRating=");
        sb2.append(this.f18879s);
        sb2.append(", collectionId=");
        sb2.append(this.f18880t);
        sb2.append(", collectionTitle=");
        sb2.append(this.f18881u);
        sb2.append(", cardsList=");
        sb2.append(this.f18882v);
        sb2.append(", listWords=");
        sb2.append(this.f18883w);
        sb2.append(", paragraphs=");
        sb2.append(this.f18884x);
        sb2.append(", bookmark=");
        sb2.append(this.f18885y);
        sb2.append(", lastUserLiked=");
        sb2.append(this.f18886z);
        sb2.append(", lastUserCompleted=");
        sb2.append(this.f18821A);
        sb2.append(", translation=");
        sb2.append(this.f18822B);
        sb2.append(", classicUrl=");
        sb2.append(this.f18823C);
        sb2.append(", previousLessonId=");
        sb2.append(this.f18824D);
        sb2.append(", nextLessonId=");
        sb2.append(this.f18825E);
        sb2.append(", readTimes=");
        sb2.append(this.f18826F);
        sb2.append(", listenTimes=");
        sb2.append(this.f18827G);
        sb2.append(", isCompleted=");
        sb2.append(this.f18828H);
        sb2.append(", newWordsCount=");
        sb2.append(this.f18829I);
        sb2.append(", cardsCount=");
        sb2.append(this.f18830J);
        sb2.append(", isRoseGiven=");
        sb2.append(this.f18831K);
        sb2.append(", giveRoseUrl=");
        sb2.append(this.f18832L);
        sb2.append(", price=");
        sb2.append(this.f18833M);
        sb2.append(", opened=");
        sb2.append(this.f18834N);
        sb2.append(", percentCompleted=");
        sb2.append(this.f18835O);
        sb2.append(", lastRoseReceived=");
        sb2.append(this.f18836P);
        sb2.append(", isFavorite=");
        sb2.append(this.f18837Q);
        sb2.append(", printUrl=");
        sb2.append(this.f18838R);
        sb2.append(", videoUrl=");
        sb2.append(this.f18839S);
        sb2.append(", exercises=");
        sb2.append(this.f18840T);
        sb2.append(", notes=");
        sb2.append(this.f18841U);
        sb2.append(", viewsCount=");
        sb2.append(this.f18842V);
        sb2.append(", providerId=");
        sb2.append(this.f18843W);
        sb2.append(", providerName=");
        sb2.append(this.f18844X);
        sb2.append(", providerDescription=");
        sb2.append(this.f18845Y);
        sb2.append(", originalImageUrl=");
        sb2.append(this.f18846Z);
        sb2.append(", providerImageUrl=");
        sb2.append(this.f18848a0);
        sb2.append(", sharedById=");
        sb2.append(this.f18850b0);
        sb2.append(", sharedByName=");
        sb2.append(this.f18852c0);
        sb2.append(", sharedByImageUrl=");
        sb2.append(this.f18854d0);
        sb2.append(", sharedByRole=");
        sb2.append(this.f18856e0);
        sb2.append(", isSharedByIsFriend=");
        sb2.append(this.f18858f0);
        sb2.append(", isCanEdit=");
        sb2.append(this.f18860g0);
        sb2.append(", lessonVotes=");
        sb2.append(this.f18862h0);
        sb2.append(", audioVotes=");
        sb2.append(this.f18864i0);
        sb2.append(", level=");
        sb2.append(this.f18866j0);
        sb2.append(", tags=");
        sb2.append(this.f18868k0);
        sb2.append(", progressDownloaded=");
        sb2.append(this.f18870l0);
        sb2.append(", ofQuery=");
        sb2.append(this.f18872m0);
        sb2.append(", type=");
        return C0009a.m23l(sb2, this.f18874n0, ")");
    }
}
