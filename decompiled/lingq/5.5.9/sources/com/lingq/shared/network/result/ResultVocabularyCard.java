package com.lingq.shared.network.result;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultVocabularyCard;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultVocabularyCard {

    /* JADX INFO: renamed from: a */
    public final String f19050a;

    /* JADX INFO: renamed from: b */
    @InterfaceC9303g(name = "pk")
    public final int f19051b;

    /* JADX INFO: renamed from: c */
    public final String f19052c;

    /* JADX INFO: renamed from: d */
    public final String f19053d;

    /* JADX INFO: renamed from: e */
    public final int f19054e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "extended_status")
    public final Integer f19055f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "last_reviewed_correct")
    public final String f19056g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "srs_due_date")
    public final String f19057h;

    /* JADX INFO: renamed from: i */
    public final String f19058i;

    /* JADX INFO: renamed from: j */
    public final String f19059j;

    /* JADX INFO: renamed from: k */
    public final int f19060k;

    /* JADX INFO: renamed from: l */
    @InterfaceC9303g(name = "hints")
    public List<Meaning> f19061l;

    /* JADX INFO: renamed from: m */
    public final List<String> f19062m;

    /* JADX INFO: renamed from: n */
    public final List<String> f19063n;

    /* JADX INFO: renamed from: o */
    public final List<String> f19064o;

    /* JADX INFO: renamed from: p */
    public final CardLessonTransliteration f19065p;

    public ResultVocabularyCard(String str, int i10, String str2, String str3, int i11, Integer num, String str4, String str5, String str6, String str7, int i12, List<Meaning> list, List<String> list2, List<String> list3, List<String> list4, CardLessonTransliteration cardLessonTransliteration) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(list, "meanings");
        C5207g.m11111f(list2, "tags");
        C5207g.m11111f(list3, "gTags");
        C5207g.m11111f(list4, "words");
        this.f19050a = str;
        this.f19051b = i10;
        this.f19052c = str2;
        this.f19053d = str3;
        this.f19054e = i11;
        this.f19055f = num;
        this.f19056g = str4;
        this.f19057h = str5;
        this.f19058i = str6;
        this.f19059j = str7;
        this.f19060k = i12;
        this.f19061l = list;
        this.f19062m = list2;
        this.f19063n = list3;
        this.f19064o = list4;
        this.f19065p = cardLessonTransliteration;
    }

    public ResultVocabularyCard(String str, int i10, String str2, String str3, int i11, Integer num, String str4, String str5, String str6, String str7, int i12, List list, List list2, List list3, List list4, CardLessonTransliteration cardLessonTransliteration, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? 0 : i10, str2, str3, (i13 & 16) != 0 ? 0 : i11, num, str4, str5, str6, str7, (i13 & 1024) != 0 ? 0 : i12, (i13 & 2048) != 0 ? EmptyList.f38032a : list, (i13 & 4096) != 0 ? EmptyList.f38032a : list2, (i13 & 8192) != 0 ? EmptyList.f38032a : list3, (i13 & 16384) != 0 ? EmptyList.f38032a : list4, (i13 & 32768) != 0 ? null : cardLessonTransliteration);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultVocabularyCard)) {
            return false;
        }
        ResultVocabularyCard resultVocabularyCard = (ResultVocabularyCard) obj;
        return C5207g.m11106a(this.f19050a, resultVocabularyCard.f19050a) && this.f19051b == resultVocabularyCard.f19051b && C5207g.m11106a(this.f19052c, resultVocabularyCard.f19052c) && C5207g.m11106a(this.f19053d, resultVocabularyCard.f19053d) && this.f19054e == resultVocabularyCard.f19054e && C5207g.m11106a(this.f19055f, resultVocabularyCard.f19055f) && C5207g.m11106a(this.f19056g, resultVocabularyCard.f19056g) && C5207g.m11106a(this.f19057h, resultVocabularyCard.f19057h) && C5207g.m11106a(this.f19058i, resultVocabularyCard.f19058i) && C5207g.m11106a(this.f19059j, resultVocabularyCard.f19059j) && this.f19060k == resultVocabularyCard.f19060k && C5207g.m11106a(this.f19061l, resultVocabularyCard.f19061l) && C5207g.m11106a(this.f19062m, resultVocabularyCard.f19062m) && C5207g.m11106a(this.f19063n, resultVocabularyCard.f19063n) && C5207g.m11106a(this.f19064o, resultVocabularyCard.f19064o) && C5207g.m11106a(this.f19065p, resultVocabularyCard.f19065p);
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f19051b, this.f19050a.hashCode() * 31, 31);
        String str = this.f19052c;
        int iHashCode = (iM16d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19053d;
        int iM16d2 = C0009a.m16d(this.f19054e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f19055f;
        int iHashCode2 = (iM16d2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f19056g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19057h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19058i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f19059j;
        int iM848g = C0204c.m848g(this.f19064o, C0204c.m848g(this.f19063n, C0204c.m848g(this.f19062m, C0204c.m848g(this.f19061l, C0009a.m16d(this.f19060k, (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31), 31), 31);
        CardLessonTransliteration cardLessonTransliteration = this.f19065p;
        return iM848g + (cardLessonTransliteration != null ? cardLessonTransliteration.hashCode() : 0);
    }

    public final String toString() {
        return "ResultVocabularyCard(term=" + this.f19050a + ", id=" + this.f19051b + ", url=" + this.f19052c + ", fragment=" + this.f19053d + ", status=" + this.f19054e + ", extendedStatus=" + this.f19055f + ", lastReviewedCorrect=" + this.f19056g + ", srsDueDate=" + this.f19057h + ", notes=" + this.f19058i + ", audio=" + this.f19059j + ", importance=" + this.f19060k + ", meanings=" + this.f19061l + ", tags=" + this.f19062m + ", gTags=" + this.f19063n + ", words=" + this.f19064o + ", transliteration=" + this.f19065p + ")";
    }
}
