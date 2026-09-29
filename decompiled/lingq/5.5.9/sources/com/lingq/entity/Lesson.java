package com.lingq.entity;

import android.support.v4.media.C0141b;
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
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Lesson;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Lesson {

    /* JADX INFO: renamed from: A */
    public final MediaSource f17067A;

    /* JADX INFO: renamed from: B */
    public final Integer f17068B;

    /* JADX INFO: renamed from: C */
    public final Integer f17069C;

    /* JADX INFO: renamed from: D */
    public double f17070D;

    /* JADX INFO: renamed from: E */
    public double f17071E;

    /* JADX INFO: renamed from: F */
    public boolean f17072F;

    /* JADX INFO: renamed from: G */
    public final int f17073G;

    /* JADX INFO: renamed from: H */
    public int f17074H;

    /* JADX INFO: renamed from: I */
    public boolean f17075I;

    /* JADX INFO: renamed from: J */
    public final String f17076J;

    /* JADX INFO: renamed from: K */
    public final int f17077K;

    /* JADX INFO: renamed from: L */
    public final boolean f17078L;

    /* JADX INFO: renamed from: M */
    public final double f17079M;

    /* JADX INFO: renamed from: N */
    public final String f17080N;

    /* JADX INFO: renamed from: O */
    public final boolean f17081O;

    /* JADX INFO: renamed from: P */
    public final String f17082P;

    /* JADX INFO: renamed from: Q */
    public final String f17083Q;

    /* JADX INFO: renamed from: R */
    public final String f17084R;

    /* JADX INFO: renamed from: S */
    public final String f17085S;

    /* JADX INFO: renamed from: T */
    public final int f17086T;

    /* JADX INFO: renamed from: U */
    public final Integer f17087U;

    /* JADX INFO: renamed from: V */
    public final String f17088V;

    /* JADX INFO: renamed from: W */
    public final String f17089W;

    /* JADX INFO: renamed from: X */
    public final String f17090X;

    /* JADX INFO: renamed from: Y */
    public final String f17091Y;

    /* JADX INFO: renamed from: Z */
    public final String f17092Z;

    /* JADX INFO: renamed from: a */
    public final int f17093a;

    /* JADX INFO: renamed from: a0 */
    public final String f17094a0;

    /* JADX INFO: renamed from: b */
    public final String f17095b;

    /* JADX INFO: renamed from: b0 */
    public final String f17096b0;

    /* JADX INFO: renamed from: c */
    public final String f17097c;

    /* JADX INFO: renamed from: c0 */
    public final String f17098c0;

    /* JADX INFO: renamed from: d */
    public final int f17099d;

    /* JADX INFO: renamed from: d0 */
    public final boolean f17100d0;

    /* JADX INFO: renamed from: e */
    public final String f17101e;

    /* JADX INFO: renamed from: e0 */
    public final boolean f17102e0;

    /* JADX INFO: renamed from: f */
    public final String f17103f;

    /* JADX INFO: renamed from: f0 */
    public final boolean f17104f0;

    /* JADX INFO: renamed from: g */
    public final String f17105g;

    /* JADX INFO: renamed from: g0 */
    public final boolean f17106g0;

    /* JADX INFO: renamed from: h */
    public final String f17107h;

    /* JADX INFO: renamed from: h0 */
    public final int f17108h0;

    /* JADX INFO: renamed from: i */
    public String f17109i;

    /* JADX INFO: renamed from: i0 */
    public final int f17110i0;

    /* JADX INFO: renamed from: j */
    public int f17111j;

    /* JADX INFO: renamed from: j0 */
    public final String f17112j0;

    /* JADX INFO: renamed from: k */
    public final String f17113k;

    /* JADX INFO: renamed from: k0 */
    public final List<String> f17114k0;

    /* JADX INFO: renamed from: l */
    public final String f17115l;

    /* JADX INFO: renamed from: l0 */
    public final int f17116l0;

    /* JADX INFO: renamed from: m */
    public final String f17117m;

    /* JADX INFO: renamed from: m0 */
    public final Float f17118m0;

    /* JADX INFO: renamed from: n */
    public final int f17119n;

    /* JADX INFO: renamed from: n0 */
    public final List<TranslationSentence> f17120n0;

    /* JADX INFO: renamed from: o */
    public final int f17121o;

    /* JADX INFO: renamed from: o0 */
    @InterfaceC9303g(name = "image_url")
    public final String f17122o0;

    /* JADX INFO: renamed from: p */
    public int f17123p;

    /* JADX INFO: renamed from: p0 */
    public final String f17124p0;

    /* JADX INFO: renamed from: q */
    public final double f17125q;

    /* JADX INFO: renamed from: q0 */
    public final String f17126q0;

    /* JADX INFO: renamed from: r */
    public final double f17127r;

    /* JADX INFO: renamed from: r0 */
    public final Boolean f17128r0;

    /* JADX INFO: renamed from: s */
    public final int f17129s;

    /* JADX INFO: renamed from: s0 */
    public final double f17130s0;

    /* JADX INFO: renamed from: t */
    public final String f17131t;

    /* JADX INFO: renamed from: t0 */
    public final int f17132t0;

    /* JADX INFO: renamed from: u */
    public final LessonUserLiked f17133u;

    /* JADX INFO: renamed from: u0 */
    public String f17134u0;

    /* JADX INFO: renamed from: v */
    public final LessonUserCompleted f17135v;

    /* JADX INFO: renamed from: v0 */
    public Boolean f17136v0;

    /* JADX INFO: renamed from: w */
    public final LessonTranslation f17137w;

    /* JADX INFO: renamed from: w0 */
    public final List<String> f17138w0;

    /* JADX INFO: renamed from: x */
    public final List<LessonTransliteration> f17139x;

    /* JADX INFO: renamed from: x0 */
    public final Boolean f17140x0;

    /* JADX INFO: renamed from: y */
    public final List<LessonTransliteration> f17141y;

    /* JADX INFO: renamed from: z */
    public final String f17142z;

    public Lesson() {
        this(0, null, null, 0, null, null, null, null, null, 0, null, null, null, 0, 0, 0, 0.0d, 0.0d, 0, null, null, null, null, null, null, null, null, null, null, 0.0d, 0.0d, false, 0, 0, false, null, 0, false, 0.0d, null, false, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, null, 0, null, null, null, null, null, null, 0.0d, 0, null, null, null, null, -1, -1, 4095, null);
    }

    public Lesson(int i10, String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, int i12, String str8, String str9, String str10, int i13, int i14, int i15, double d10, double d11, int i16, String str11, LessonUserLiked lessonUserLiked, LessonUserCompleted lessonUserCompleted, LessonTranslation lessonTranslation, List<LessonTransliteration> list, List<LessonTransliteration> list2, String str12, MediaSource mediaSource, Integer num, Integer num2, double d12, double d13, boolean z10, int i17, int i18, boolean z11, String str13, int i19, boolean z12, double d14, String str14, boolean z13, String str15, String str16, String str17, String str18, int i20, Integer num3, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, boolean z14, boolean z15, boolean z16, boolean z17, int i21, int i22, String str27, List<String> list3, int i23, Float f3, List<TranslationSentence> list4, String str28, String str29, String str30, Boolean bool, double d15, int i24, String str31, Boolean bool2, List<String> list5, Boolean bool3) {
        C5207g.m11111f(str, "type");
        C5207g.m11111f(list, "transliteration");
        C5207g.m11111f(list2, "altScript");
        C5207g.m11111f(list4, "translationSentence");
        C5207g.m11111f(str31, "lessonPreview");
        this.f17093a = i10;
        this.f17095b = str;
        this.f17097c = str2;
        this.f17099d = i11;
        this.f17101e = str3;
        this.f17103f = str4;
        this.f17105g = str5;
        this.f17107h = str6;
        this.f17109i = str7;
        this.f17111j = i12;
        this.f17113k = str8;
        this.f17115l = str9;
        this.f17117m = str10;
        this.f17119n = i13;
        this.f17121o = i14;
        this.f17123p = i15;
        this.f17125q = d10;
        this.f17127r = d11;
        this.f17129s = i16;
        this.f17131t = str11;
        this.f17133u = lessonUserLiked;
        this.f17135v = lessonUserCompleted;
        this.f17137w = lessonTranslation;
        this.f17139x = list;
        this.f17141y = list2;
        this.f17142z = str12;
        this.f17067A = mediaSource;
        this.f17068B = num;
        this.f17069C = num2;
        this.f17070D = d12;
        this.f17071E = d13;
        this.f17072F = z10;
        this.f17073G = i17;
        this.f17074H = i18;
        this.f17075I = z11;
        this.f17076J = str13;
        this.f17077K = i19;
        this.f17078L = z12;
        this.f17079M = d14;
        this.f17080N = str14;
        this.f17081O = z13;
        this.f17082P = str15;
        this.f17083Q = str16;
        this.f17084R = str17;
        this.f17085S = str18;
        this.f17086T = i20;
        this.f17087U = num3;
        this.f17088V = str19;
        this.f17089W = str20;
        this.f17090X = str21;
        this.f17091Y = str22;
        this.f17092Z = str23;
        this.f17094a0 = str24;
        this.f17096b0 = str25;
        this.f17098c0 = str26;
        this.f17100d0 = z14;
        this.f17102e0 = z15;
        this.f17104f0 = z16;
        this.f17106g0 = z17;
        this.f17108h0 = i21;
        this.f17110i0 = i22;
        this.f17112j0 = str27;
        this.f17114k0 = list3;
        this.f17116l0 = i23;
        this.f17118m0 = f3;
        this.f17120n0 = list4;
        this.f17122o0 = str28;
        this.f17124p0 = str29;
        this.f17126q0 = str30;
        this.f17128r0 = bool;
        this.f17130s0 = d15;
        this.f17132t0 = i24;
        this.f17134u0 = str31;
        this.f17136v0 = bool2;
        this.f17138w0 = list5;
        this.f17140x0 = bool3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Lesson(int i10, String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, int i12, String str8, String str9, String str10, int i13, int i14, int i15, double d10, double d11, int i16, String str11, LessonUserLiked lessonUserLiked, LessonUserCompleted lessonUserCompleted, LessonTranslation lessonTranslation, List list, List list2, String str12, MediaSource mediaSource, Integer num, Integer num2, double d12, double d13, boolean z10, int i17, int i18, boolean z11, String str13, int i19, boolean z12, double d14, String str14, boolean z13, String str15, String str16, String str17, String str18, int i20, Integer num3, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, boolean z14, boolean z15, boolean z16, boolean z17, int i21, int i22, String str27, List list3, int i23, Float f3, List list4, String str28, String str29, String str30, Boolean bool, double d15, int i24, String str31, Boolean bool2, List list5, Boolean bool3, int i25, int i26, int i27, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num4 = 0;
        this((i25 & 1) != 0 ? 0 : i10, (i25 & 2) != 0 ? "content" : str, (i25 & 4) != 0 ? null : str2, (i25 & 8) != 0 ? 0 : i11, (i25 & 16) != 0 ? null : str3, (i25 & 32) != 0 ? null : str4, (i25 & 64) != 0 ? null : str5, (i25 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? null : str6, (i25 & 256) != 0 ? null : str7, (i25 & 512) != 0 ? 0 : i12, (i25 & 1024) != 0 ? null : str8, (i25 & 2048) != 0 ? null : str9, (i25 & 4096) != 0 ? null : str10, (i25 & 8192) != 0 ? 0 : i13, (i25 & 16384) != 0 ? 0 : i14, (i25 & 32768) != 0 ? 0 : i15, (i25 & 65536) != 0 ? 0.0d : d10, (i25 & 131072) != 0 ? 0.0d : d11, (i25 & 262144) != 0 ? 0 : i16, (i25 & 524288) != 0 ? null : str11, (i25 & 1048576) != 0 ? null : lessonUserLiked, (i25 & 2097152) != 0 ? null : lessonUserCompleted, (i25 & 4194304) != 0 ? null : lessonTranslation, (i25 & 8388608) != 0 ? EmptyList.f38032a : list, (i25 & 16777216) != 0 ? EmptyList.f38032a : list2, (i25 & 33554432) != 0 ? null : str12, (i25 & 67108864) != 0 ? null : mediaSource, (i25 & 134217728) != 0 ? null : num, (i25 & 268435456) != 0 ? null : num2, (i25 & 536870912) != 0 ? 0.0d : d12, (i25 & 1073741824) != 0 ? 0.0d : d13, (i25 & Integer.MIN_VALUE) != 0 ? false : z10, (i26 & 1) != 0 ? 0 : i17, (i26 & 2) != 0 ? 0 : i18, (i26 & 4) != 0 ? false : z11, (i26 & 8) != 0 ? null : str13, (i26 & 16) != 0 ? 0 : i19, (i26 & 32) != 0 ? false : z12, (i26 & 64) != 0 ? 0.0d : d14, (i26 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? null : str14, (i26 & 256) != 0 ? false : z13, (i26 & 512) != 0 ? null : str15, (i26 & 1024) != 0 ? null : str16, (i26 & 2048) != 0 ? null : str17, (i26 & 4096) != 0 ? null : str18, (i26 & 8192) != 0 ? 0 : i20, (i26 & 16384) == 0 ? num3 : num4, (i26 & 32768) != 0 ? null : str19, (i26 & 65536) != 0 ? null : str20, (i26 & 131072) != 0 ? null : str21, (i26 & 262144) != 0 ? null : str22, (i26 & 524288) != 0 ? null : str23, (i26 & 1048576) != 0 ? null : str24, (i26 & 2097152) != 0 ? null : str25, (i26 & 4194304) != 0 ? null : str26, (i26 & 8388608) != 0 ? false : z14, (i26 & 16777216) != 0 ? false : z15, (i26 & 33554432) != 0 ? false : z16, (i26 & 67108864) != 0 ? true : z17, (i26 & 134217728) != 0 ? 0 : i21, (i26 & 268435456) != 0 ? 0 : i22, (i26 & 536870912) != 0 ? null : str27, (i26 & 1073741824) != 0 ? EmptyList.f38032a : list3, (i26 & Integer.MIN_VALUE) != 0 ? 0 : i23, (i27 & 1) != 0 ? null : f3, (i27 & 2) != 0 ? EmptyList.f38032a : list4, (i27 & 4) != 0 ? null : str28, (i27 & 8) != 0 ? null : str29, (i27 & 16) != 0 ? null : str30, (i27 & 32) != 0 ? null : bool, (i27 & 64) == 0 ? d15 : 0.0d, (i27 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i24, (i27 & 256) != 0 ? "" : str31, (i27 & 512) != 0 ? null : bool2, (i27 & 1024) != 0 ? EmptyList.f38032a : list5, (i27 & 2048) != 0 ? Boolean.FALSE : bool3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lesson)) {
            return false;
        }
        Lesson lesson = (Lesson) obj;
        return this.f17093a == lesson.f17093a && C5207g.m11106a(this.f17095b, lesson.f17095b) && C5207g.m11106a(this.f17097c, lesson.f17097c) && this.f17099d == lesson.f17099d && C5207g.m11106a(this.f17101e, lesson.f17101e) && C5207g.m11106a(this.f17103f, lesson.f17103f) && C5207g.m11106a(this.f17105g, lesson.f17105g) && C5207g.m11106a(this.f17107h, lesson.f17107h) && C5207g.m11106a(this.f17109i, lesson.f17109i) && this.f17111j == lesson.f17111j && C5207g.m11106a(this.f17113k, lesson.f17113k) && C5207g.m11106a(this.f17115l, lesson.f17115l) && C5207g.m11106a(this.f17117m, lesson.f17117m) && this.f17119n == lesson.f17119n && this.f17121o == lesson.f17121o && this.f17123p == lesson.f17123p && Double.compare(this.f17125q, lesson.f17125q) == 0 && Double.compare(this.f17127r, lesson.f17127r) == 0 && this.f17129s == lesson.f17129s && C5207g.m11106a(this.f17131t, lesson.f17131t) && C5207g.m11106a(this.f17133u, lesson.f17133u) && C5207g.m11106a(this.f17135v, lesson.f17135v) && C5207g.m11106a(this.f17137w, lesson.f17137w) && C5207g.m11106a(this.f17139x, lesson.f17139x) && C5207g.m11106a(this.f17141y, lesson.f17141y) && C5207g.m11106a(this.f17142z, lesson.f17142z) && C5207g.m11106a(this.f17067A, lesson.f17067A) && C5207g.m11106a(this.f17068B, lesson.f17068B) && C5207g.m11106a(this.f17069C, lesson.f17069C) && Double.compare(this.f17070D, lesson.f17070D) == 0 && Double.compare(this.f17071E, lesson.f17071E) == 0 && this.f17072F == lesson.f17072F && this.f17073G == lesson.f17073G && this.f17074H == lesson.f17074H && this.f17075I == lesson.f17075I && C5207g.m11106a(this.f17076J, lesson.f17076J) && this.f17077K == lesson.f17077K && this.f17078L == lesson.f17078L && Double.compare(this.f17079M, lesson.f17079M) == 0 && C5207g.m11106a(this.f17080N, lesson.f17080N) && this.f17081O == lesson.f17081O && C5207g.m11106a(this.f17082P, lesson.f17082P) && C5207g.m11106a(this.f17083Q, lesson.f17083Q) && C5207g.m11106a(this.f17084R, lesson.f17084R) && C5207g.m11106a(this.f17085S, lesson.f17085S) && this.f17086T == lesson.f17086T && C5207g.m11106a(this.f17087U, lesson.f17087U) && C5207g.m11106a(this.f17088V, lesson.f17088V) && C5207g.m11106a(this.f17089W, lesson.f17089W) && C5207g.m11106a(this.f17090X, lesson.f17090X) && C5207g.m11106a(this.f17091Y, lesson.f17091Y) && C5207g.m11106a(this.f17092Z, lesson.f17092Z) && C5207g.m11106a(this.f17094a0, lesson.f17094a0) && C5207g.m11106a(this.f17096b0, lesson.f17096b0) && C5207g.m11106a(this.f17098c0, lesson.f17098c0) && this.f17100d0 == lesson.f17100d0 && this.f17102e0 == lesson.f17102e0 && this.f17104f0 == lesson.f17104f0 && this.f17106g0 == lesson.f17106g0 && this.f17108h0 == lesson.f17108h0 && this.f17110i0 == lesson.f17110i0 && C5207g.m11106a(this.f17112j0, lesson.f17112j0) && C5207g.m11106a(this.f17114k0, lesson.f17114k0) && this.f17116l0 == lesson.f17116l0 && C5207g.m11106a(this.f17118m0, lesson.f17118m0) && C5207g.m11106a(this.f17120n0, lesson.f17120n0) && C5207g.m11106a(this.f17122o0, lesson.f17122o0) && C5207g.m11106a(this.f17124p0, lesson.f17124p0) && C5207g.m11106a(this.f17126q0, lesson.f17126q0) && C5207g.m11106a(this.f17128r0, lesson.f17128r0) && Double.compare(this.f17130s0, lesson.f17130s0) == 0 && this.f17132t0 == lesson.f17132t0 && C5207g.m11106a(this.f17134u0, lesson.f17134u0) && C5207g.m11106a(this.f17136v0, lesson.f17136v0) && C5207g.m11106a(this.f17138w0, lesson.f17138w0) && C5207g.m11106a(this.f17140x0, lesson.f17140x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54, types: [int] */
    /* JADX WARN: Type inference failed for: r0v59, types: [int] */
    /* JADX WARN: Type inference failed for: r0v64, types: [int] */
    /* JADX WARN: Type inference failed for: r0v93, types: [int] */
    /* JADX WARN: Type inference failed for: r0v95, types: [int] */
    /* JADX WARN: Type inference failed for: r0v97, types: [int] */
    /* JADX WARN: Type inference failed for: r0v99, types: [int] */
    /* JADX WARN: Type inference failed for: r2v123, types: [int] */
    /* JADX WARN: Type inference failed for: r2v125, types: [int] */
    /* JADX WARN: Type inference failed for: r2v127, types: [int] */
    /* JADX WARN: Type inference failed for: r2v173 */
    /* JADX WARN: Type inference failed for: r2v174 */
    /* JADX WARN: Type inference failed for: r2v175 */
    /* JADX WARN: Type inference failed for: r2v189 */
    /* JADX WARN: Type inference failed for: r2v191 */
    /* JADX WARN: Type inference failed for: r2v193 */
    /* JADX WARN: Type inference failed for: r2v194 */
    /* JADX WARN: Type inference failed for: r2v212 */
    /* JADX WARN: Type inference failed for: r2v213 */
    /* JADX WARN: Type inference failed for: r2v214 */
    /* JADX WARN: Type inference failed for: r2v215 */
    /* JADX WARN: Type inference failed for: r2v216 */
    /* JADX WARN: Type inference failed for: r2v217 */
    /* JADX WARN: Type inference failed for: r2v218 */
    /* JADX WARN: Type inference failed for: r2v65, types: [int] */
    /* JADX WARN: Type inference failed for: r2v69, types: [int] */
    /* JADX WARN: Type inference failed for: r2v75, types: [int] */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f17095b, Integer.hashCode(this.f17093a) * 31, 31);
        int iHashCode = 0;
        String str = this.f17097c;
        int iM16d = C0009a.m16d(this.f17099d, (iM758d + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f17101e;
        int iHashCode2 = (iM16d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17103f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17105g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17107h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17109i;
        int iM16d2 = C0009a.m16d(this.f17111j, (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.f17113k;
        int iHashCode6 = (iM16d2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f17115l;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f17117m;
        int iM16d3 = C0009a.m16d(this.f17129s, C0141b.m609e(this.f17127r, C0141b.m609e(this.f17125q, C0009a.m16d(this.f17123p, C0009a.m16d(this.f17121o, C0009a.m16d(this.f17119n, (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str10 = this.f17131t;
        int iHashCode8 = (iM16d3 + (str10 == null ? 0 : str10.hashCode())) * 31;
        LessonUserLiked lessonUserLiked = this.f17133u;
        int iHashCode9 = (iHashCode8 + (lessonUserLiked == null ? 0 : lessonUserLiked.hashCode())) * 31;
        LessonUserCompleted lessonUserCompleted = this.f17135v;
        int iHashCode10 = (iHashCode9 + (lessonUserCompleted == null ? 0 : lessonUserCompleted.hashCode())) * 31;
        LessonTranslation lessonTranslation = this.f17137w;
        int iM848g = C0204c.m848g(this.f17141y, C0204c.m848g(this.f17139x, (iHashCode10 + (lessonTranslation == null ? 0 : lessonTranslation.hashCode())) * 31, 31), 31);
        String str11 = this.f17142z;
        int iHashCode11 = (iM848g + (str11 == null ? 0 : str11.hashCode())) * 31;
        MediaSource mediaSource = this.f17067A;
        int iHashCode12 = (iHashCode11 + (mediaSource == null ? 0 : mediaSource.hashCode())) * 31;
        Integer num = this.f17068B;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17069C;
        int iM609e = C0141b.m609e(this.f17071E, C0141b.m609e(this.f17070D, (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31);
        boolean z10 = this.f17072F;
        ?? r10 = 1;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int iM16d4 = C0009a.m16d(this.f17074H, C0009a.m16d(this.f17073G, (iM609e + r11) * 31, 31), 31);
        boolean z11 = this.f17075I;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i10 = (iM16d4 + r12) * 31;
        String str12 = this.f17076J;
        int iM16d5 = C0009a.m16d(this.f17077K, (i10 + (str12 == null ? 0 : str12.hashCode())) * 31, 31);
        boolean z12 = this.f17078L;
        ?? r13 = z12;
        if (z12) {
            r13 = 1;
        }
        int iM609e2 = C0141b.m609e(this.f17079M, (iM16d5 + r13) * 31, 31);
        String str13 = this.f17080N;
        int iHashCode14 = (iM609e2 + (str13 == null ? 0 : str13.hashCode())) * 31;
        boolean z13 = this.f17081O;
        ?? r14 = z13;
        if (z13) {
            r14 = 1;
        }
        int i11 = (iHashCode14 + r14) * 31;
        String str14 = this.f17082P;
        int iHashCode15 = (i11 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f17083Q;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f17084R;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f17085S;
        int iM16d6 = C0009a.m16d(this.f17086T, (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31, 31);
        Integer num3 = this.f17087U;
        int iHashCode18 = (iM16d6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str18 = this.f17088V;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f17089W;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f17090X;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f17091Y;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f17092Z;
        int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f17094a0;
        int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f17096b0;
        int iHashCode25 = (iHashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.f17098c0;
        int iHashCode26 = (iHashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        boolean z14 = this.f17100d0;
        ?? r15 = z14;
        if (z14) {
            r15 = 1;
        }
        int i12 = (iHashCode26 + r15) * 31;
        boolean z15 = this.f17102e0;
        ?? r16 = z15;
        if (z15) {
            r16 = 1;
        }
        int i13 = (i12 + r16) * 31;
        boolean z16 = this.f17104f0;
        ?? r17 = z16;
        if (z16) {
            r17 = 1;
        }
        int i14 = (i13 + r17) * 31;
        boolean z17 = this.f17106g0;
        if (!z17) {
            r10 = z17;
        }
        int iM16d7 = C0009a.m16d(this.f17110i0, C0009a.m16d(this.f17108h0, (i14 + r10) * 31, 31), 31);
        String str26 = this.f17112j0;
        int iHashCode27 = (iM16d7 + (str26 == null ? 0 : str26.hashCode())) * 31;
        List<String> list = this.f17114k0;
        int iM16d8 = C0009a.m16d(this.f17116l0, (iHashCode27 + (list == null ? 0 : list.hashCode())) * 31, 31);
        Float f3 = this.f17118m0;
        int iM848g2 = C0204c.m848g(this.f17120n0, (iM16d8 + (f3 == null ? 0 : f3.hashCode())) * 31, 31);
        String str27 = this.f17122o0;
        int iHashCode28 = (iM848g2 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.f17124p0;
        int iHashCode29 = (iHashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.f17126q0;
        int iHashCode30 = (iHashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Boolean bool = this.f17128r0;
        int iM758d2 = C0166e.m758d(this.f17134u0, C0009a.m16d(this.f17132t0, C0141b.m609e(this.f17130s0, (iHashCode30 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31), 31);
        Boolean bool2 = this.f17136v0;
        int iHashCode31 = (iM758d2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list2 = this.f17138w0;
        int iHashCode32 = (iHashCode31 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool3 = this.f17140x0;
        if (bool3 != null) {
            iHashCode = bool3.hashCode();
        }
        return iHashCode32 + iHashCode;
    }

    public final String toString() {
        String str = this.f17109i;
        int i10 = this.f17111j;
        int i11 = this.f17123p;
        double d10 = this.f17070D;
        double d11 = this.f17071E;
        boolean z10 = this.f17072F;
        int i12 = this.f17074H;
        boolean z11 = this.f17075I;
        String str2 = this.f17134u0;
        Boolean bool = this.f17136v0;
        StringBuilder sb2 = new StringBuilder("Lesson(id=");
        sb2.append(this.f17093a);
        sb2.append(", type=");
        sb2.append(this.f17095b);
        sb2.append(", url=");
        sb2.append(this.f17097c);
        sb2.append(", pos=");
        sb2.append(this.f17099d);
        sb2.append(", title=");
        sb2.append(this.f17101e);
        sb2.append(", description=");
        sb2.append(this.f17103f);
        sb2.append(", pubDate=");
        sb2.append(this.f17105g);
        sb2.append(", imageUrl=");
        C0166e.m777x(sb2, this.f17107h, ", audioUrl=", str, ", duration=");
        sb2.append(i10);
        sb2.append(", status=");
        sb2.append(this.f17113k);
        sb2.append(", sharedDate=");
        sb2.append(this.f17115l);
        sb2.append(", originalUrl=");
        sb2.append(this.f17117m);
        sb2.append(", wordCount=");
        sb2.append(this.f17119n);
        sb2.append(", uniqueWordCount=");
        sb2.append(this.f17121o);
        sb2.append(", rosesCount=");
        sb2.append(i11);
        sb2.append(", lessonRating=");
        sb2.append(this.f17125q);
        sb2.append(", audioRating=");
        sb2.append(this.f17127r);
        sb2.append(", collectionId=");
        sb2.append(this.f17129s);
        sb2.append(", collectionTitle=");
        sb2.append(this.f17131t);
        sb2.append(", lastUserLiked=");
        sb2.append(this.f17133u);
        sb2.append(", lastUserCompleted=");
        sb2.append(this.f17135v);
        sb2.append(", translation=");
        sb2.append(this.f17137w);
        sb2.append(", transliteration=");
        sb2.append(this.f17139x);
        sb2.append(", altScript=");
        sb2.append(this.f17141y);
        sb2.append(", classicUrl=");
        sb2.append(this.f17142z);
        sb2.append(", source=");
        sb2.append(this.f17067A);
        sb2.append(", previousLessonId=");
        sb2.append(this.f17068B);
        sb2.append(", nextLessonId=");
        sb2.append(this.f17069C);
        sb2.append(", readTimes=");
        sb2.append(d10);
        sb2.append(", listenTimes=");
        sb2.append(d11);
        sb2.append(", isCompleted=");
        sb2.append(z10);
        sb2.append(", newWordsCount=");
        sb2.append(this.f17073G);
        sb2.append(", cardsCount=");
        sb2.append(i12);
        sb2.append(", isRoseGiven=");
        sb2.append(z11);
        sb2.append(", giveRoseUrl=");
        sb2.append(this.f17076J);
        sb2.append(", price=");
        sb2.append(this.f17077K);
        sb2.append(", opened=");
        sb2.append(this.f17078L);
        sb2.append(", percentCompleted=");
        sb2.append(this.f17079M);
        sb2.append(", lastRoseReceived=");
        sb2.append(this.f17080N);
        sb2.append(", isFavorite=");
        sb2.append(this.f17081O);
        sb2.append(", printUrl=");
        sb2.append(this.f17082P);
        sb2.append(", videoUrl=");
        sb2.append(this.f17083Q);
        sb2.append(", exercises=");
        sb2.append(this.f17084R);
        sb2.append(", notes=");
        sb2.append(this.f17085S);
        sb2.append(", viewsCount=");
        sb2.append(this.f17086T);
        sb2.append(", providerId=");
        sb2.append(this.f17087U);
        sb2.append(", providerName=");
        sb2.append(this.f17088V);
        sb2.append(", providerDescription=");
        sb2.append(this.f17089W);
        sb2.append(", originalImageUrl=");
        sb2.append(this.f17090X);
        sb2.append(", providerImageUrl=");
        sb2.append(this.f17091Y);
        sb2.append(", sharedById=");
        sb2.append(this.f17092Z);
        sb2.append(", sharedByName=");
        sb2.append(this.f17094a0);
        sb2.append(", sharedByImageUrl=");
        sb2.append(this.f17096b0);
        sb2.append(", sharedByRole=");
        sb2.append(this.f17098c0);
        sb2.append(", isSharedByIsFriend=");
        sb2.append(this.f17100d0);
        sb2.append(", isCanEdit=");
        sb2.append(this.f17102e0);
        sb2.append(", canEditSentence=");
        sb2.append(this.f17104f0);
        sb2.append(", isProtected=");
        sb2.append(this.f17106g0);
        sb2.append(", lessonVotes=");
        sb2.append(this.f17108h0);
        sb2.append(", audioVotes=");
        sb2.append(this.f17110i0);
        sb2.append(", level=");
        sb2.append(this.f17112j0);
        sb2.append(", tags=");
        sb2.append(this.f17114k0);
        sb2.append(", progressDownloaded=");
        sb2.append(this.f17116l0);
        sb2.append(", progress=");
        sb2.append(this.f17118m0);
        sb2.append(", translationSentence=");
        sb2.append(this.f17120n0);
        sb2.append(", mediaImageUrl=");
        sb2.append(this.f17122o0);
        sb2.append(", mediaTitle=");
        sb2.append(this.f17124p0);
        sb2.append(", ptime=");
        sb2.append(this.f17126q0);
        sb2.append(", isPinned=");
        sb2.append(this.f17128r0);
        sb2.append(", difficulty=");
        sb2.append(this.f17130s0);
        sb2.append(", newWords=");
        sb2.append(this.f17132t0);
        sb2.append(", lessonPreview=");
        sb2.append(str2);
        sb2.append(", isTaken=");
        sb2.append(bool);
        sb2.append(", folders=");
        sb2.append(this.f17138w0);
        sb2.append(", audioPending=");
        sb2.append(this.f17140x0);
        sb2.append(")");
        return sb2.toString();
    }
}
