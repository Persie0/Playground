package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.shared.uimodel.library.LibraryItemType;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultVocabularyCourse;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultVocabularyCourse {

    /* JADX INFO: renamed from: A */
    public final boolean f19075A;

    /* JADX INFO: renamed from: B */
    public final String f19076B;

    /* JADX INFO: renamed from: C */
    public final List<String> f19077C;

    /* JADX INFO: renamed from: D */
    public final Integer f19078D;

    /* JADX INFO: renamed from: E */
    public final String f19079E;

    /* JADX INFO: renamed from: a */
    public final int f19080a;

    /* JADX INFO: renamed from: b */
    public final String f19081b;

    /* JADX INFO: renamed from: c */
    public final String f19082c;

    /* JADX INFO: renamed from: d */
    public final String f19083d;

    /* JADX INFO: renamed from: e */
    public final int f19084e;

    /* JADX INFO: renamed from: f */
    public final String f19085f;

    /* JADX INFO: renamed from: g */
    public final String f19086g;

    /* JADX INFO: renamed from: h */
    public final Integer f19087h;

    /* JADX INFO: renamed from: i */
    public final String f19088i;

    /* JADX INFO: renamed from: j */
    public final String f19089j;

    /* JADX INFO: renamed from: k */
    public final String f19090k;

    /* JADX INFO: renamed from: l */
    public final String f19091l;

    /* JADX INFO: renamed from: m */
    public final String f19092m;

    /* JADX INFO: renamed from: n */
    public final String f19093n;

    /* JADX INFO: renamed from: o */
    public final String f19094o;

    /* JADX INFO: renamed from: p */
    public final String f19095p;

    /* JADX INFO: renamed from: q */
    public final String f19096q;

    /* JADX INFO: renamed from: r */
    public final int f19097r;

    /* JADX INFO: renamed from: s */
    public final int f19098s;

    /* JADX INFO: renamed from: t */
    public final String f19099t;

    /* JADX INFO: renamed from: u */
    public final int f19100u;

    /* JADX INFO: renamed from: v */
    public final int f19101v;

    /* JADX INFO: renamed from: w */
    public final int f19102w;

    /* JADX INFO: renamed from: x */
    public final double f19103x;

    /* JADX INFO: renamed from: y */
    public final Double f19104y;

    /* JADX INFO: renamed from: z */
    public final boolean f19105z;

    public ResultVocabularyCourse() {
        this(0, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, 0, 0, 0.0d, null, false, false, null, null, null, null, Integer.MAX_VALUE, null);
    }

    public ResultVocabularyCourse(int i10, String str, String str2, String str3, int i11, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i12, int i13, String str15, int i14, int i15, int i16, double d10, Double d11, boolean z10, boolean z11, String str16, List<String> list, Integer num2, String str17) {
        C5207g.m11111f(str16, "ofQuery");
        this.f19080a = i10;
        this.f19081b = str;
        this.f19082c = str2;
        this.f19083d = str3;
        this.f19084e = i11;
        this.f19085f = str4;
        this.f19086g = str5;
        this.f19087h = num;
        this.f19088i = str6;
        this.f19089j = str7;
        this.f19090k = str8;
        this.f19091l = str9;
        this.f19092m = str10;
        this.f19093n = str11;
        this.f19094o = str12;
        this.f19095p = str13;
        this.f19096q = str14;
        this.f19097r = i12;
        this.f19098s = i13;
        this.f19099t = str15;
        this.f19100u = i14;
        this.f19101v = i15;
        this.f19102w = i16;
        this.f19103x = d10;
        this.f19104y = d11;
        this.f19105z = z10;
        this.f19075A = z11;
        this.f19076B = str16;
        this.f19077C = list;
        this.f19078D = num2;
        this.f19079E = str17;
    }

    public ResultVocabularyCourse(int i10, String str, String str2, String str3, int i11, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i12, int i13, String str15, int i14, int i15, int i16, double d10, Double d11, boolean z10, boolean z11, String str16, List list, Integer num2, String str17, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i10, (i17 & 2) != 0 ? LibraryItemType.Collection.getValue() : str, (i17 & 4) != 0 ? null : str2, (i17 & 8) != 0 ? null : str3, (i17 & 16) != 0 ? 0 : i11, (i17 & 32) != 0 ? null : str4, (i17 & 64) != 0 ? null : str5, (i17 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : num, (i17 & 256) != 0 ? null : str6, (i17 & 512) != 0 ? null : str7, (i17 & 1024) != 0 ? null : str8, (i17 & 2048) != 0 ? null : str9, (i17 & 4096) != 0 ? null : str10, (i17 & 8192) != 0 ? null : str11, (i17 & 16384) != 0 ? null : str12, (i17 & 32768) != 0 ? null : str13, (i17 & 65536) != 0 ? null : str14, (i17 & 131072) != 0 ? 0 : i12, (i17 & 262144) != 0 ? 0 : i13, (i17 & 524288) != 0 ? null : str15, (i17 & 1048576) != 0 ? 0 : i14, (i17 & 2097152) != 0 ? 0 : i15, (i17 & 4194304) != 0 ? 0 : i16, (i17 & 8388608) != 0 ? 0.0d : d10, (i17 & 16777216) != 0 ? Double.valueOf(0.0d) : d11, (i17 & 33554432) != 0 ? false : z10, (i17 & 67108864) != 0 ? false : z11, (i17 & 134217728) != 0 ? "" : str16, (i17 & 268435456) != 0 ? EmptyList.f38032a : list, (i17 & 536870912) != 0 ? null : num2, (i17 & 1073741824) != 0 ? null : str17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultVocabularyCourse)) {
            return false;
        }
        ResultVocabularyCourse resultVocabularyCourse = (ResultVocabularyCourse) obj;
        return this.f19080a == resultVocabularyCourse.f19080a && C5207g.m11106a(this.f19081b, resultVocabularyCourse.f19081b) && C5207g.m11106a(this.f19082c, resultVocabularyCourse.f19082c) && C5207g.m11106a(this.f19083d, resultVocabularyCourse.f19083d) && this.f19084e == resultVocabularyCourse.f19084e && C5207g.m11106a(this.f19085f, resultVocabularyCourse.f19085f) && C5207g.m11106a(this.f19086g, resultVocabularyCourse.f19086g) && C5207g.m11106a(this.f19087h, resultVocabularyCourse.f19087h) && C5207g.m11106a(this.f19088i, resultVocabularyCourse.f19088i) && C5207g.m11106a(this.f19089j, resultVocabularyCourse.f19089j) && C5207g.m11106a(this.f19090k, resultVocabularyCourse.f19090k) && C5207g.m11106a(this.f19091l, resultVocabularyCourse.f19091l) && C5207g.m11106a(this.f19092m, resultVocabularyCourse.f19092m) && C5207g.m11106a(this.f19093n, resultVocabularyCourse.f19093n) && C5207g.m11106a(this.f19094o, resultVocabularyCourse.f19094o) && C5207g.m11106a(this.f19095p, resultVocabularyCourse.f19095p) && C5207g.m11106a(this.f19096q, resultVocabularyCourse.f19096q) && this.f19097r == resultVocabularyCourse.f19097r && this.f19098s == resultVocabularyCourse.f19098s && C5207g.m11106a(this.f19099t, resultVocabularyCourse.f19099t) && this.f19100u == resultVocabularyCourse.f19100u && this.f19101v == resultVocabularyCourse.f19101v && this.f19102w == resultVocabularyCourse.f19102w && Double.compare(this.f19103x, resultVocabularyCourse.f19103x) == 0 && C5207g.m11106a(this.f19104y, resultVocabularyCourse.f19104y) && this.f19105z == resultVocabularyCourse.f19105z && this.f19075A == resultVocabularyCourse.f19075A && C5207g.m11106a(this.f19076B, resultVocabularyCourse.f19076B) && C5207g.m11106a(this.f19077C, resultVocabularyCourse.f19077C) && C5207g.m11106a(this.f19078D, resultVocabularyCourse.f19078D) && C5207g.m11106a(this.f19079E, resultVocabularyCourse.f19079E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59, types: [int] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f19080a) * 31;
        int iHashCode2 = 0;
        String str = this.f19081b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19082c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19083d;
        int iM16d = C0009a.m16d(this.f19084e, (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f19085f;
        int iHashCode5 = (iM16d + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19086g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f19087h;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f19088i;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f19089j;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f19090k;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f19091l;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f19092m;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f19093n;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f19094o;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f19095p;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f19096q;
        int iM16d2 = C0009a.m16d(this.f19098s, C0009a.m16d(this.f19097r, (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31, 31), 31);
        String str15 = this.f19099t;
        int iM609e = C0141b.m609e(this.f19103x, C0009a.m16d(this.f19102w, C0009a.m16d(this.f19101v, C0009a.m16d(this.f19100u, (iM16d2 + (str15 == null ? 0 : str15.hashCode())) * 31, 31), 31), 31), 31);
        Double d10 = this.f19104y;
        int iHashCode16 = (iM609e + (d10 == null ? 0 : d10.hashCode())) * 31;
        boolean z10 = this.f19105z;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode16 + r10) * 31;
        boolean z11 = this.f19075A;
        int iM758d = C0166e.m758d(this.f19076B, (i10 + (z11 ? 1 : z11)) * 31, 31);
        List<String> list = this.f19077C;
        int iHashCode17 = (iM758d + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f19078D;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str16 = this.f19079E;
        if (str16 != null) {
            iHashCode2 = str16.hashCode();
        }
        return iHashCode18 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultVocabularyCourse(id=");
        sb2.append(this.f19080a);
        sb2.append(", type=");
        sb2.append(this.f19081b);
        sb2.append(", title=");
        sb2.append(this.f19082c);
        sb2.append(", description=");
        sb2.append(this.f19083d);
        sb2.append(", pos=");
        sb2.append(this.f19084e);
        sb2.append(", url=");
        sb2.append(this.f19085f);
        sb2.append(", imageUrl=");
        sb2.append(this.f19086g);
        sb2.append(", providerId=");
        sb2.append(this.f19087h);
        sb2.append(", providerName=");
        sb2.append(this.f19088i);
        sb2.append(", providerDescription=");
        sb2.append(this.f19089j);
        sb2.append(", originalImageUrl=");
        sb2.append(this.f19090k);
        sb2.append(", providerImageUrl=");
        sb2.append(this.f19091l);
        sb2.append(", sharedById=");
        sb2.append(this.f19092m);
        sb2.append(", sharedByName=");
        sb2.append(this.f19093n);
        sb2.append(", sharedByImageUrl=");
        sb2.append(this.f19094o);
        sb2.append(", sharedByRole=");
        sb2.append(this.f19095p);
        sb2.append(", level=");
        sb2.append(this.f19096q);
        sb2.append(", newWordsCount=");
        sb2.append(this.f19097r);
        sb2.append(", lessonsCount=");
        sb2.append(this.f19098s);
        sb2.append(", owner=");
        sb2.append(this.f19099t);
        sb2.append(", price=");
        sb2.append(this.f19100u);
        sb2.append(", cardsCount=");
        sb2.append(this.f19101v);
        sb2.append(", rosesCount=");
        sb2.append(this.f19102w);
        sb2.append(", difficulty=");
        sb2.append(this.f19103x);
        sb2.append(", completedRatio=");
        sb2.append(this.f19104y);
        sb2.append(", isAvailable=");
        sb2.append(this.f19105z);
        sb2.append(", myCourse=");
        sb2.append(this.f19075A);
        sb2.append(", ofQuery=");
        sb2.append(this.f19076B);
        sb2.append(", tags=");
        sb2.append(this.f19077C);
        sb2.append(", duration=");
        sb2.append(this.f19078D);
        sb2.append(", status=");
        return C0009a.m23l(sb2, this.f19079E, ")");
    }
}
