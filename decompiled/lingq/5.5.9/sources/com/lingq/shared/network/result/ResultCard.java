package com.lingq.shared.network.result;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LessonTransliteration;
import com.lingq.entity.Meaning;
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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultCard;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultCard {

    /* JADX INFO: renamed from: a */
    public final String f18282a;

    /* JADX INFO: renamed from: b */
    @InterfaceC9303g(name = "pk")
    public int f18283b;

    /* JADX INFO: renamed from: c */
    public final String f18284c;

    /* JADX INFO: renamed from: d */
    public final String f18285d;

    /* JADX INFO: renamed from: e */
    public final int f18286e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "extended_status")
    public final Integer f18287f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "last_reviewed_correct")
    public final String f18288g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "srs_due_date")
    public final String f18289h;

    /* JADX INFO: renamed from: i */
    public final String f18290i;

    /* JADX INFO: renamed from: j */
    public final String f18291j;

    /* JADX INFO: renamed from: k */
    public final int f18292k;

    /* JADX INFO: renamed from: l */
    @InterfaceC9303g(name = "hints")
    public final List<Meaning> f18293l;

    /* JADX INFO: renamed from: m */
    public final List<String> f18294m;

    /* JADX INFO: renamed from: n */
    public final List<String> f18295n;

    /* JADX INFO: renamed from: o */
    public final List<String> f18296o;

    /* JADX INFO: renamed from: p */
    public final LessonTransliteration f18297p;

    public ResultCard(String str, int i10, String str2, String str3, int i11, Integer num, String str4, String str5, String str6, String str7, int i12, List<Meaning> list, List<String> list2, List<String> list3, List<String> list4, LessonTransliteration lessonTransliteration) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(list, "meanings");
        C5207g.m11111f(list2, "tags");
        C5207g.m11111f(list3, "gTags");
        C5207g.m11111f(list4, "words");
        this.f18282a = str;
        this.f18283b = i10;
        this.f18284c = str2;
        this.f18285d = str3;
        this.f18286e = i11;
        this.f18287f = num;
        this.f18288g = str4;
        this.f18289h = str5;
        this.f18290i = str6;
        this.f18291j = str7;
        this.f18292k = i12;
        this.f18293l = list;
        this.f18294m = list2;
        this.f18295n = list3;
        this.f18296o = list4;
        this.f18297p = lessonTransliteration;
    }

    public ResultCard(String str, int i10, String str2, String str3, int i11, Integer num, String str4, String str5, String str6, String str7, int i12, List list, List list2, List list3, List list4, LessonTransliteration lessonTransliteration, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? 0 : i10, str2, str3, (i13 & 16) != 0 ? 0 : i11, num, str4, str5, str6, str7, (i13 & 1024) != 0 ? 0 : i12, (i13 & 2048) != 0 ? EmptyList.f38032a : list, (i13 & 4096) != 0 ? EmptyList.f38032a : list2, (i13 & 8192) != 0 ? EmptyList.f38032a : list3, (i13 & 16384) != 0 ? EmptyList.f38032a : list4, (i13 & 32768) != 0 ? null : lessonTransliteration);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCard)) {
            return false;
        }
        ResultCard resultCard = (ResultCard) obj;
        return C5207g.m11106a(this.f18282a, resultCard.f18282a) && this.f18283b == resultCard.f18283b && C5207g.m11106a(this.f18284c, resultCard.f18284c) && C5207g.m11106a(this.f18285d, resultCard.f18285d) && this.f18286e == resultCard.f18286e && C5207g.m11106a(this.f18287f, resultCard.f18287f) && C5207g.m11106a(this.f18288g, resultCard.f18288g) && C5207g.m11106a(this.f18289h, resultCard.f18289h) && C5207g.m11106a(this.f18290i, resultCard.f18290i) && C5207g.m11106a(this.f18291j, resultCard.f18291j) && this.f18292k == resultCard.f18292k && C5207g.m11106a(this.f18293l, resultCard.f18293l) && C5207g.m11106a(this.f18294m, resultCard.f18294m) && C5207g.m11106a(this.f18295n, resultCard.f18295n) && C5207g.m11106a(this.f18296o, resultCard.f18296o) && C5207g.m11106a(this.f18297p, resultCard.f18297p);
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f18283b, this.f18282a.hashCode() * 31, 31);
        int iHashCode = 0;
        String str = this.f18284c;
        int iHashCode2 = (iM16d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18285d;
        int iM16d2 = C0009a.m16d(this.f18286e, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f18287f;
        int iHashCode3 = (iM16d2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f18288g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18289h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18290i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18291j;
        int iM848g = C0204c.m848g(this.f18296o, C0204c.m848g(this.f18295n, C0204c.m848g(this.f18294m, C0204c.m848g(this.f18293l, C0009a.m16d(this.f18292k, (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31), 31), 31);
        LessonTransliteration lessonTransliteration = this.f18297p;
        if (lessonTransliteration != null) {
            iHashCode = lessonTransliteration.hashCode();
        }
        return iM848g + iHashCode;
    }

    public final String toString() {
        return "ResultCard(term=" + this.f18282a + ", id=" + this.f18283b + ", url=" + this.f18284c + ", fragment=" + this.f18285d + ", status=" + this.f18286e + ", extendedStatus=" + this.f18287f + ", lastReviewedCorrect=" + this.f18288g + ", srsDueDate=" + this.f18289h + ", notes=" + this.f18290i + ", audio=" + this.f18291j + ", importance=" + this.f18292k + ", meanings=" + this.f18293l + ", tags=" + this.f18294m + ", gTags=" + this.f18295n + ", words=" + this.f18296o + ", transliteration=" + this.f18297p + ")";
    }
}
