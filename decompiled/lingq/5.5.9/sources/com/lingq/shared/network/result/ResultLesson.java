package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.entity.LessonTranslation;
import com.lingq.entity.LessonUserCompleted;
import com.lingq.entity.LessonUserLiked;
import com.lingq.entity.MediaSource;
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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLesson;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultLesson {

    /* JADX INFO: renamed from: A */
    public final LessonUserCompleted f18494A;

    /* JADX INFO: renamed from: B */
    public final LessonTranslation f18495B;

    /* JADX INFO: renamed from: C */
    public final String f18496C;

    /* JADX INFO: renamed from: D */
    public final MediaSource f18497D;

    /* JADX INFO: renamed from: E */
    public final Integer f18498E;

    /* JADX INFO: renamed from: F */
    public final Integer f18499F;

    /* JADX INFO: renamed from: G */
    public final double f18500G;

    /* JADX INFO: renamed from: H */
    public final double f18501H;

    /* JADX INFO: renamed from: I */
    public final boolean f18502I;

    /* JADX INFO: renamed from: J */
    public final int f18503J;

    /* JADX INFO: renamed from: K */
    public final int f18504K;

    /* JADX INFO: renamed from: L */
    @InterfaceC9303g(name = "roseGiven")
    public final boolean f18505L;

    /* JADX INFO: renamed from: M */
    public final String f18506M;

    /* JADX INFO: renamed from: N */
    public final int f18507N;

    /* JADX INFO: renamed from: O */
    public final boolean f18508O;

    /* JADX INFO: renamed from: P */
    public final double f18509P;

    /* JADX INFO: renamed from: Q */
    public final String f18510Q;

    /* JADX INFO: renamed from: R */
    public final boolean f18511R;

    /* JADX INFO: renamed from: S */
    public final String f18512S;

    /* JADX INFO: renamed from: T */
    public final String f18513T;

    /* JADX INFO: renamed from: U */
    public final String f18514U;

    /* JADX INFO: renamed from: V */
    public final String f18515V;

    /* JADX INFO: renamed from: W */
    public final int f18516W;

    /* JADX INFO: renamed from: X */
    public final Integer f18517X;

    /* JADX INFO: renamed from: Y */
    public final String f18518Y;

    /* JADX INFO: renamed from: Z */
    public final String f18519Z;

    /* JADX INFO: renamed from: a */
    public final int f18520a;

    /* JADX INFO: renamed from: a0 */
    public final String f18521a0;

    /* JADX INFO: renamed from: b */
    public final String f18522b;

    /* JADX INFO: renamed from: b0 */
    public final String f18523b0;

    /* JADX INFO: renamed from: c */
    public final int f18524c;

    /* JADX INFO: renamed from: c0 */
    public final String f18525c0;

    /* JADX INFO: renamed from: d */
    public final String f18526d;

    /* JADX INFO: renamed from: d0 */
    public final String f18527d0;

    /* JADX INFO: renamed from: e */
    public final String f18528e;

    /* JADX INFO: renamed from: e0 */
    public final String f18529e0;

    /* JADX INFO: renamed from: f */
    public final String f18530f;

    /* JADX INFO: renamed from: f0 */
    public final String f18531f0;

    /* JADX INFO: renamed from: g */
    public final String f18532g;

    /* JADX INFO: renamed from: g0 */
    public final boolean f18533g0;

    /* JADX INFO: renamed from: h */
    public final String f18534h;

    /* JADX INFO: renamed from: h0 */
    public final boolean f18535h0;

    /* JADX INFO: renamed from: i */
    public final int f18536i;

    /* JADX INFO: renamed from: i0 */
    public final boolean f18537i0;

    /* JADX INFO: renamed from: j */
    public final String f18538j;

    /* JADX INFO: renamed from: j0 */
    public final Integer f18539j0;

    /* JADX INFO: renamed from: k */
    public final String f18540k;

    /* JADX INFO: renamed from: k0 */
    public final int f18541k0;

    /* JADX INFO: renamed from: l */
    public final String f18542l;

    /* JADX INFO: renamed from: l0 */
    public final int f18543l0;

    /* JADX INFO: renamed from: m */
    public final int f18544m;

    /* JADX INFO: renamed from: m0 */
    public final String f18545m0;

    /* JADX INFO: renamed from: n */
    public final int f18546n;

    /* JADX INFO: renamed from: n0 */
    public final List<String> f18547n0;

    /* JADX INFO: renamed from: o */
    public final String f18548o;

    /* JADX INFO: renamed from: o0 */
    public final boolean f18549o0;

    /* JADX INFO: renamed from: p */
    public final String f18550p;

    /* JADX INFO: renamed from: q */
    public final int f18551q;

    /* JADX INFO: renamed from: r */
    public final double f18552r;

    /* JADX INFO: renamed from: s */
    public final double f18553s;

    /* JADX INFO: renamed from: t */
    public final int f18554t;

    /* JADX INFO: renamed from: u */
    public final String f18555u;

    /* JADX INFO: renamed from: v */
    @InterfaceC9303g(name = "cards")
    public final C10365b f18556v;

    /* JADX INFO: renamed from: w */
    @InterfaceC9303g(name = "words")
    public final C10368e f18557w;

    /* JADX INFO: renamed from: x */
    @InterfaceC9303g(name = "tokenizedText")
    public final List<C10364a> f18558x;

    /* JADX INFO: renamed from: y */
    public final ResultLessonBookmark f18559y;

    /* JADX INFO: renamed from: z */
    public final LessonUserLiked f18560z;

    public ResultLesson(int i10, String str, int i11, String str2, String str3, String str4, String str5, String str6, int i12, String str7, String str8, String str9, int i13, int i14, String str10, String str11, int i15, double d10, double d11, int i16, String str12, C10365b c10365b, C10368e c10368e, List<C10364a> list, ResultLessonBookmark resultLessonBookmark, LessonUserLiked lessonUserLiked, LessonUserCompleted lessonUserCompleted, LessonTranslation lessonTranslation, String str13, MediaSource mediaSource, Integer num, Integer num2, double d12, double d13, boolean z10, int i17, int i18, boolean z11, String str14, int i19, boolean z12, double d14, String str15, boolean z13, String str16, String str17, String str18, String str19, int i20, Integer num3, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z14, boolean z15, boolean z16, Integer num4, int i21, int i22, String str28, List<String> list2, boolean z17) {
        this.f18520a = i10;
        this.f18522b = str;
        this.f18524c = i11;
        this.f18526d = str2;
        this.f18528e = str3;
        this.f18530f = str4;
        this.f18532g = str5;
        this.f18534h = str6;
        this.f18536i = i12;
        this.f18538j = str7;
        this.f18540k = str8;
        this.f18542l = str9;
        this.f18544m = i13;
        this.f18546n = i14;
        this.f18548o = str10;
        this.f18550p = str11;
        this.f18551q = i15;
        this.f18552r = d10;
        this.f18553s = d11;
        this.f18554t = i16;
        this.f18555u = str12;
        this.f18556v = c10365b;
        this.f18557w = c10368e;
        this.f18558x = list;
        this.f18559y = resultLessonBookmark;
        this.f18560z = lessonUserLiked;
        this.f18494A = lessonUserCompleted;
        this.f18495B = lessonTranslation;
        this.f18496C = str13;
        this.f18497D = mediaSource;
        this.f18498E = num;
        this.f18499F = num2;
        this.f18500G = d12;
        this.f18501H = d13;
        this.f18502I = z10;
        this.f18503J = i17;
        this.f18504K = i18;
        this.f18505L = z11;
        this.f18506M = str14;
        this.f18507N = i19;
        this.f18508O = z12;
        this.f18509P = d14;
        this.f18510Q = str15;
        this.f18511R = z13;
        this.f18512S = str16;
        this.f18513T = str17;
        this.f18514U = str18;
        this.f18515V = str19;
        this.f18516W = i20;
        this.f18517X = num3;
        this.f18518Y = str20;
        this.f18519Z = str21;
        this.f18521a0 = str22;
        this.f18523b0 = str23;
        this.f18525c0 = str24;
        this.f18527d0 = str25;
        this.f18529e0 = str26;
        this.f18531f0 = str27;
        this.f18533g0 = z14;
        this.f18535h0 = z15;
        this.f18537i0 = z16;
        this.f18539j0 = num4;
        this.f18541k0 = i21;
        this.f18543l0 = i22;
        this.f18545m0 = str28;
        this.f18547n0 = list2;
        this.f18549o0 = z17;
    }

    public ResultLesson(int i10, String str, int i11, String str2, String str3, String str4, String str5, String str6, int i12, String str7, String str8, String str9, int i13, int i14, String str10, String str11, int i15, double d10, double d11, int i16, String str12, C10365b c10365b, C10368e c10368e, List list, ResultLessonBookmark resultLessonBookmark, LessonUserLiked lessonUserLiked, LessonUserCompleted lessonUserCompleted, LessonTranslation lessonTranslation, String str13, MediaSource mediaSource, Integer num, Integer num2, double d12, double d13, boolean z10, int i17, int i18, boolean z11, String str14, int i19, boolean z12, double d14, String str15, boolean z13, String str16, String str17, String str18, String str19, int i20, Integer num3, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z14, boolean z15, boolean z16, Integer num4, int i21, int i22, String str28, List list2, boolean z17, int i23, int i24, int i25, DefaultConstructorMarker defaultConstructorMarker) {
        this((i23 & 1) != 0 ? 0 : i10, str, (i23 & 4) != 0 ? 0 : i11, str2, str3, str4, str5, str6, (i23 & 256) != 0 ? 0 : i12, str7, str8, str9, (i23 & 4096) != 0 ? 0 : i13, (i23 & 8192) != 0 ? 0 : i14, str10, str11, (i23 & 65536) != 0 ? 0 : i15, (i23 & 131072) != 0 ? 0.0d : d10, (i23 & 262144) != 0 ? 0.0d : d11, (i23 & 524288) != 0 ? 0 : i16, str12, c10365b, c10368e, (i23 & 8388608) != 0 ? EmptyList.f38032a : list, resultLessonBookmark, lessonUserLiked, lessonUserCompleted, lessonTranslation, str13, mediaSource, (i23 & 1073741824) != 0 ? 0 : num, (i23 & Integer.MIN_VALUE) != 0 ? 0 : num2, (i24 & 1) != 0 ? 0.0d : d12, (i24 & 2) != 0 ? 0.0d : d13, (i24 & 4) != 0 ? false : z10, (i24 & 8) != 0 ? 0 : i17, (i24 & 16) != 0 ? 0 : i18, (i24 & 32) != 0 ? false : z11, str14, (i24 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i19, (i24 & 256) != 0 ? false : z12, (i24 & 512) != 0 ? 0.0d : d14, str15, (i24 & 2048) != 0 ? false : z13, str16, str17, str18, str19, (i24 & 65536) != 0 ? 0 : i20, (i24 & 131072) != 0 ? 0 : num3, (i24 & 262144) != 0 ? null : str20, (i24 & 524288) != 0 ? null : str21, (1048576 & i24) != 0 ? null : str22, (2097152 & i24) != 0 ? null : str23, (4194304 & i24) != 0 ? null : str24, (i24 & 8388608) != 0 ? null : str25, (16777216 & i24) != 0 ? null : str26, (33554432 & i24) != 0 ? null : str27, (67108864 & i24) != 0 ? false : z14, (134217728 & i24) != 0 ? false : z15, (268435456 & i24) != 0 ? false : z16, (536870912 & i24) != 0 ? 1 : num4, (i24 & 1073741824) != 0 ? 0 : i21, (i24 & Integer.MIN_VALUE) != 0 ? 0 : i22, str28, list2, (i25 & 4) != 0 ? false : z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLesson)) {
            return false;
        }
        ResultLesson resultLesson = (ResultLesson) obj;
        return this.f18520a == resultLesson.f18520a && C5207g.m11106a(this.f18522b, resultLesson.f18522b) && this.f18524c == resultLesson.f18524c && C5207g.m11106a(this.f18526d, resultLesson.f18526d) && C5207g.m11106a(this.f18528e, resultLesson.f18528e) && C5207g.m11106a(this.f18530f, resultLesson.f18530f) && C5207g.m11106a(this.f18532g, resultLesson.f18532g) && C5207g.m11106a(this.f18534h, resultLesson.f18534h) && this.f18536i == resultLesson.f18536i && C5207g.m11106a(this.f18538j, resultLesson.f18538j) && C5207g.m11106a(this.f18540k, resultLesson.f18540k) && C5207g.m11106a(this.f18542l, resultLesson.f18542l) && this.f18544m == resultLesson.f18544m && this.f18546n == resultLesson.f18546n && C5207g.m11106a(this.f18548o, resultLesson.f18548o) && C5207g.m11106a(this.f18550p, resultLesson.f18550p) && this.f18551q == resultLesson.f18551q && Double.compare(this.f18552r, resultLesson.f18552r) == 0 && Double.compare(this.f18553s, resultLesson.f18553s) == 0 && this.f18554t == resultLesson.f18554t && C5207g.m11106a(this.f18555u, resultLesson.f18555u) && C5207g.m11106a(this.f18556v, resultLesson.f18556v) && C5207g.m11106a(this.f18557w, resultLesson.f18557w) && C5207g.m11106a(this.f18558x, resultLesson.f18558x) && C5207g.m11106a(this.f18559y, resultLesson.f18559y) && C5207g.m11106a(this.f18560z, resultLesson.f18560z) && C5207g.m11106a(this.f18494A, resultLesson.f18494A) && C5207g.m11106a(this.f18495B, resultLesson.f18495B) && C5207g.m11106a(this.f18496C, resultLesson.f18496C) && C5207g.m11106a(this.f18497D, resultLesson.f18497D) && C5207g.m11106a(this.f18498E, resultLesson.f18498E) && C5207g.m11106a(this.f18499F, resultLesson.f18499F) && Double.compare(this.f18500G, resultLesson.f18500G) == 0 && Double.compare(this.f18501H, resultLesson.f18501H) == 0 && this.f18502I == resultLesson.f18502I && this.f18503J == resultLesson.f18503J && this.f18504K == resultLesson.f18504K && this.f18505L == resultLesson.f18505L && C5207g.m11106a(this.f18506M, resultLesson.f18506M) && this.f18507N == resultLesson.f18507N && this.f18508O == resultLesson.f18508O && Double.compare(this.f18509P, resultLesson.f18509P) == 0 && C5207g.m11106a(this.f18510Q, resultLesson.f18510Q) && this.f18511R == resultLesson.f18511R && C5207g.m11106a(this.f18512S, resultLesson.f18512S) && C5207g.m11106a(this.f18513T, resultLesson.f18513T) && C5207g.m11106a(this.f18514U, resultLesson.f18514U) && C5207g.m11106a(this.f18515V, resultLesson.f18515V) && this.f18516W == resultLesson.f18516W && C5207g.m11106a(this.f18517X, resultLesson.f18517X) && C5207g.m11106a(this.f18518Y, resultLesson.f18518Y) && C5207g.m11106a(this.f18519Z, resultLesson.f18519Z) && C5207g.m11106a(this.f18521a0, resultLesson.f18521a0) && C5207g.m11106a(this.f18523b0, resultLesson.f18523b0) && C5207g.m11106a(this.f18525c0, resultLesson.f18525c0) && C5207g.m11106a(this.f18527d0, resultLesson.f18527d0) && C5207g.m11106a(this.f18529e0, resultLesson.f18529e0) && C5207g.m11106a(this.f18531f0, resultLesson.f18531f0) && this.f18533g0 == resultLesson.f18533g0 && this.f18535h0 == resultLesson.f18535h0 && this.f18537i0 == resultLesson.f18537i0 && C5207g.m11106a(this.f18539j0, resultLesson.f18539j0) && this.f18541k0 == resultLesson.f18541k0 && this.f18543l0 == resultLesson.f18543l0 && C5207g.m11106a(this.f18545m0, resultLesson.f18545m0) && C5207g.m11106a(this.f18547n0, resultLesson.f18547n0) && this.f18549o0 == resultLesson.f18549o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [int] */
    /* JADX WARN: Type inference failed for: r0v104, types: [int] */
    /* JADX WARN: Type inference failed for: r0v106, types: [int] */
    /* JADX WARN: Type inference failed for: r0v116, types: [int] */
    /* JADX WARN: Type inference failed for: r0v59, types: [int] */
    /* JADX WARN: Type inference failed for: r0v63, types: [int] */
    /* JADX WARN: Type inference failed for: r0v68, types: [int] */
    /* JADX WARN: Type inference failed for: r0v73, types: [int] */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v64, types: [int] */
    /* JADX WARN: Type inference failed for: r3v66, types: [int] */
    /* JADX WARN: Type inference failed for: r3v68, types: [int] */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r3v98 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18520a) * 31;
        int iHashCode2 = 0;
        String str = this.f18522b;
        int iM16d = C0009a.m16d(this.f18524c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f18526d;
        int iHashCode3 = (iM16d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18528e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18530f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18532g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18534h;
        int iM16d2 = C0009a.m16d(this.f18536i, (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.f18538j;
        int iHashCode7 = (iM16d2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f18540k;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f18542l;
        int iM16d3 = C0009a.m16d(this.f18546n, C0009a.m16d(this.f18544m, (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31, 31), 31);
        String str10 = this.f18548o;
        int iHashCode9 = (iM16d3 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f18550p;
        int iM16d4 = C0009a.m16d(this.f18554t, C0141b.m609e(this.f18553s, C0141b.m609e(this.f18552r, C0009a.m16d(this.f18551q, (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31, 31), 31), 31), 31);
        String str12 = this.f18555u;
        int iHashCode10 = (iM16d4 + (str12 == null ? 0 : str12.hashCode())) * 31;
        C10365b c10365b = this.f18556v;
        int iHashCode11 = (iHashCode10 + (c10365b == null ? 0 : c10365b.hashCode())) * 31;
        C10368e c10368e = this.f18557w;
        int iHashCode12 = (iHashCode11 + (c10368e == null ? 0 : c10368e.hashCode())) * 31;
        List<C10364a> list = this.f18558x;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        ResultLessonBookmark resultLessonBookmark = this.f18559y;
        int iHashCode14 = (iHashCode13 + (resultLessonBookmark == null ? 0 : resultLessonBookmark.hashCode())) * 31;
        LessonUserLiked lessonUserLiked = this.f18560z;
        int iHashCode15 = (iHashCode14 + (lessonUserLiked == null ? 0 : lessonUserLiked.hashCode())) * 31;
        LessonUserCompleted lessonUserCompleted = this.f18494A;
        int iHashCode16 = (iHashCode15 + (lessonUserCompleted == null ? 0 : lessonUserCompleted.hashCode())) * 31;
        LessonTranslation lessonTranslation = this.f18495B;
        int iHashCode17 = (iHashCode16 + (lessonTranslation == null ? 0 : lessonTranslation.hashCode())) * 31;
        String str13 = this.f18496C;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        MediaSource mediaSource = this.f18497D;
        int iHashCode19 = (iHashCode18 + (mediaSource == null ? 0 : mediaSource.hashCode())) * 31;
        Integer num = this.f18498E;
        int iHashCode20 = (iHashCode19 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f18499F;
        int iM609e = C0141b.m609e(this.f18501H, C0141b.m609e(this.f18500G, (iHashCode20 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31);
        ?? r10 = 1;
        boolean z10 = this.f18502I;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int iM16d5 = C0009a.m16d(this.f18504K, C0009a.m16d(this.f18503J, (iM609e + r11) * 31, 31), 31);
        boolean z11 = this.f18505L;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i10 = (iM16d5 + r12) * 31;
        String str14 = this.f18506M;
        int iM16d6 = C0009a.m16d(this.f18507N, (i10 + (str14 == null ? 0 : str14.hashCode())) * 31, 31);
        boolean z12 = this.f18508O;
        ?? r13 = z12;
        if (z12) {
            r13 = 1;
        }
        int iM609e2 = C0141b.m609e(this.f18509P, (iM16d6 + r13) * 31, 31);
        String str15 = this.f18510Q;
        int iHashCode21 = (iM609e2 + (str15 == null ? 0 : str15.hashCode())) * 31;
        boolean z13 = this.f18511R;
        ?? r14 = z13;
        if (z13) {
            r14 = 1;
        }
        int i11 = (iHashCode21 + r14) * 31;
        String str16 = this.f18512S;
        int iHashCode22 = (i11 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f18513T;
        int iHashCode23 = (iHashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f18514U;
        int iHashCode24 = (iHashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f18515V;
        int iM16d7 = C0009a.m16d(this.f18516W, (iHashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31, 31);
        Integer num3 = this.f18517X;
        int iHashCode25 = (iM16d7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str20 = this.f18518Y;
        int iHashCode26 = (iHashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f18519Z;
        int iHashCode27 = (iHashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f18521a0;
        int iHashCode28 = (iHashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f18523b0;
        int iHashCode29 = (iHashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f18525c0;
        int iHashCode30 = (iHashCode29 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.f18527d0;
        int iHashCode31 = (iHashCode30 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.f18529e0;
        int iHashCode32 = (iHashCode31 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.f18531f0;
        int iHashCode33 = (iHashCode32 + (str27 == null ? 0 : str27.hashCode())) * 31;
        boolean z14 = this.f18533g0;
        ?? r15 = z14;
        if (z14) {
            r15 = 1;
        }
        int i12 = (iHashCode33 + r15) * 31;
        boolean z15 = this.f18535h0;
        ?? r16 = z15;
        if (z15) {
            r16 = 1;
        }
        int i13 = (i12 + r16) * 31;
        boolean z16 = this.f18537i0;
        ?? r17 = z16;
        if (z16) {
            r17 = 1;
        }
        int i14 = (i13 + r17) * 31;
        Integer num4 = this.f18539j0;
        int iM16d8 = C0009a.m16d(this.f18543l0, C0009a.m16d(this.f18541k0, (i14 + (num4 == null ? 0 : num4.hashCode())) * 31, 31), 31);
        String str28 = this.f18545m0;
        int iHashCode34 = (iM16d8 + (str28 == null ? 0 : str28.hashCode())) * 31;
        List<String> list2 = this.f18547n0;
        if (list2 != null) {
            iHashCode2 = list2.hashCode();
        }
        int i15 = (iHashCode34 + iHashCode2) * 31;
        boolean z17 = this.f18549o0;
        if (!z17) {
            r10 = z17;
        }
        return i15 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultLesson(contentId=");
        sb2.append(this.f18520a);
        sb2.append(", url=");
        sb2.append(this.f18522b);
        sb2.append(", pos=");
        sb2.append(this.f18524c);
        sb2.append(", title=");
        sb2.append(this.f18526d);
        sb2.append(", description=");
        sb2.append(this.f18528e);
        sb2.append(", pubDate=");
        sb2.append(this.f18530f);
        sb2.append(", imageUrl=");
        sb2.append(this.f18532g);
        sb2.append(", audioUrl=");
        sb2.append(this.f18534h);
        sb2.append(", duration=");
        sb2.append(this.f18536i);
        sb2.append(", status=");
        sb2.append(this.f18538j);
        sb2.append(", sharedDate=");
        sb2.append(this.f18540k);
        sb2.append(", originalUrl=");
        sb2.append(this.f18542l);
        sb2.append(", wordCount=");
        sb2.append(this.f18544m);
        sb2.append(", uniqueWordCount=");
        sb2.append(this.f18546n);
        sb2.append(", text=");
        sb2.append(this.f18548o);
        sb2.append(", normalizedText=");
        sb2.append(this.f18550p);
        sb2.append(", rosesCount=");
        sb2.append(this.f18551q);
        sb2.append(", lessonRating=");
        sb2.append(this.f18552r);
        sb2.append(", audioRating=");
        sb2.append(this.f18553s);
        sb2.append(", collectionId=");
        sb2.append(this.f18554t);
        sb2.append(", collectionTitle=");
        sb2.append(this.f18555u);
        sb2.append(", cardsList=");
        sb2.append(this.f18556v);
        sb2.append(", listWords=");
        sb2.append(this.f18557w);
        sb2.append(", paragraphs=");
        sb2.append(this.f18558x);
        sb2.append(", bookmark=");
        sb2.append(this.f18559y);
        sb2.append(", lastUserLiked=");
        sb2.append(this.f18560z);
        sb2.append(", lastUserCompleted=");
        sb2.append(this.f18494A);
        sb2.append(", translation=");
        sb2.append(this.f18495B);
        sb2.append(", classicUrl=");
        sb2.append(this.f18496C);
        sb2.append(", source=");
        sb2.append(this.f18497D);
        sb2.append(", previousLessonId=");
        sb2.append(this.f18498E);
        sb2.append(", nextLessonId=");
        sb2.append(this.f18499F);
        sb2.append(", readTimes=");
        sb2.append(this.f18500G);
        sb2.append(", listenTimes=");
        sb2.append(this.f18501H);
        sb2.append(", completed=");
        sb2.append(this.f18502I);
        sb2.append(", newWordsCount=");
        sb2.append(this.f18503J);
        sb2.append(", cardsCount=");
        sb2.append(this.f18504K);
        sb2.append(", isRoseGiven=");
        sb2.append(this.f18505L);
        sb2.append(", giveRoseUrl=");
        sb2.append(this.f18506M);
        sb2.append(", price=");
        sb2.append(this.f18507N);
        sb2.append(", opened=");
        sb2.append(this.f18508O);
        sb2.append(", percentCompleted=");
        sb2.append(this.f18509P);
        sb2.append(", lastRoseReceived=");
        sb2.append(this.f18510Q);
        sb2.append(", isFavorite=");
        sb2.append(this.f18511R);
        sb2.append(", printUrl=");
        sb2.append(this.f18512S);
        sb2.append(", videoUrl=");
        sb2.append(this.f18513T);
        sb2.append(", exercises=");
        sb2.append(this.f18514U);
        sb2.append(", notes=");
        sb2.append(this.f18515V);
        sb2.append(", viewsCount=");
        sb2.append(this.f18516W);
        sb2.append(", providerId=");
        sb2.append(this.f18517X);
        sb2.append(", providerName=");
        sb2.append(this.f18518Y);
        sb2.append(", providerDescription=");
        sb2.append(this.f18519Z);
        sb2.append(", originalImageUrl=");
        sb2.append(this.f18521a0);
        sb2.append(", providerImageUrl=");
        sb2.append(this.f18523b0);
        sb2.append(", sharedById=");
        sb2.append(this.f18525c0);
        sb2.append(", sharedByName=");
        sb2.append(this.f18527d0);
        sb2.append(", sharedByImageUrl=");
        sb2.append(this.f18529e0);
        sb2.append(", sharedByRole=");
        sb2.append(this.f18531f0);
        sb2.append(", isSharedByIsFriend=");
        sb2.append(this.f18533g0);
        sb2.append(", canEdit=");
        sb2.append(this.f18535h0);
        sb2.append(", canEditSentence=");
        sb2.append(this.f18537i0);
        sb2.append(", isProtected=");
        sb2.append(this.f18539j0);
        sb2.append(", lessonVotes=");
        sb2.append(this.f18541k0);
        sb2.append(", audioVotes=");
        sb2.append(this.f18543l0);
        sb2.append(", level=");
        sb2.append(this.f18545m0);
        sb2.append(", tags=");
        sb2.append(this.f18547n0);
        sb2.append(", audioPending=");
        return C0166e.m769p(sb2, this.f18549o0, ")");
    }
}
