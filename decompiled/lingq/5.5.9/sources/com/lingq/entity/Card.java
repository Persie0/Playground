package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Card;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Card {

    /* JADX INFO: renamed from: a */
    public final String f16854a;

    /* JADX INFO: renamed from: b */
    public final String f16855b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "pk")
    public final int f16856c;

    /* JADX INFO: renamed from: d */
    public final String f16857d;

    /* JADX INFO: renamed from: e */
    public final String f16858e;

    /* JADX INFO: renamed from: f */
    public final int f16859f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "extended_status")
    public final Integer f16860g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "last_reviewed_correct")
    public final String f16861h;

    /* JADX INFO: renamed from: i */
    @InterfaceC9303g(name = "srs_due_date")
    public final String f16862i;

    /* JADX INFO: renamed from: j */
    public String f16863j;

    /* JADX INFO: renamed from: k */
    public final String f16864k;

    /* JADX INFO: renamed from: l */
    public final int f16865l;

    /* JADX INFO: renamed from: m */
    public final List<Meaning> f16866m;

    /* JADX INFO: renamed from: n */
    public final String f16867n;

    /* JADX INFO: renamed from: o */
    public final List<String> f16868o;

    /* JADX INFO: renamed from: p */
    public final List<String> f16869p;

    /* JADX INFO: renamed from: q */
    public final List<String> f16870q;

    /* JADX INFO: renamed from: r */
    public final LessonTransliteration f16871r;

    /* JADX INFO: renamed from: s */
    public final boolean f16872s;

    public Card(String str, String str2, int i10, String str3, String str4, int i11, Integer num, String str5, String str6, String str7, String str8, int i12, List<Meaning> list, String str9, List<String> list2, List<String> list3, List<String> list4, LessonTransliteration lessonTransliteration, boolean z10) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(str2, "termWithLanguage");
        C5207g.m11111f(list, "meanings");
        C5207g.m11111f(str9, "meaningTerms");
        C5207g.m11111f(list2, "tags");
        C5207g.m11111f(list3, "gTags");
        C5207g.m11111f(list4, "words");
        this.f16854a = str;
        this.f16855b = str2;
        this.f16856c = i10;
        this.f16857d = str3;
        this.f16858e = str4;
        this.f16859f = i11;
        this.f16860g = num;
        this.f16861h = str5;
        this.f16862i = str6;
        this.f16863j = str7;
        this.f16864k = str8;
        this.f16865l = i12;
        this.f16866m = list;
        this.f16867n = str9;
        this.f16868o = list2;
        this.f16869p = list3;
        this.f16870q = list4;
        this.f16871r = lessonTransliteration;
        this.f16872s = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Card(String str, String str2, int i10, String str3, String str4, int i11, Integer num, String str5, String str6, String str7, String str8, int i12, List list, String str9, List list2, List list3, List list4, LessonTransliteration lessonTransliteration, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = (i13 & 4) != 0 ? 0 : i10;
        int i15 = (i13 & 32) != 0 ? 0 : i11;
        int i16 = (i13 & 2048) != 0 ? 0 : i12;
        List list5 = (i13 & 4096) != 0 ? EmptyList.f38032a : list;
        this(str, str2, i14, str3, str4, i15, num, str5, str6, str7, str8, i16, list5, (i13 & 8192) != 0 ? MeaningKt.m9387a(list5) : str9, (i13 & 16384) != 0 ? EmptyList.f38032a : list2, (32768 & i13) != 0 ? EmptyList.f38032a : list3, (65536 & i13) != 0 ? EmptyList.f38032a : list4, (131072 & i13) != 0 ? null : lessonTransliteration, (i13 & 262144) != 0 ? false : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(Card.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.entity.Card");
        Card card = (Card) obj;
        return this.f16859f == card.f16859f && C5207g.m11106a(this.f16860g, card.f16860g) && C5207g.m11106a(this.f16862i, card.f16862i) && C5207g.m11106a(this.f16866m, card.f16866m) && C5207g.m11106a(this.f16868o, card.f16868o);
    }

    public final int hashCode() {
        int i10 = this.f16859f * 31;
        Integer num = this.f16860g;
        int iIntValue = (i10 + (num != null ? num.intValue() : 0)) * 31;
        String str = this.f16862i;
        return this.f16868o.hashCode() + C0204c.m848g(this.f16866m, (iIntValue + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        String str = this.f16863j;
        StringBuilder sb2 = new StringBuilder("Card(term=");
        sb2.append(this.f16854a);
        sb2.append(", termWithLanguage=");
        sb2.append(this.f16855b);
        sb2.append(", id=");
        sb2.append(this.f16856c);
        sb2.append(", url=");
        sb2.append(this.f16857d);
        sb2.append(", fragment=");
        sb2.append(this.f16858e);
        sb2.append(", status=");
        sb2.append(this.f16859f);
        sb2.append(", extendedStatus=");
        sb2.append(this.f16860g);
        sb2.append(", lastReviewedCorrect=");
        sb2.append(this.f16861h);
        sb2.append(", srsDueDate=");
        C0166e.m777x(sb2, this.f16862i, ", notes=", str, ", audio=");
        sb2.append(this.f16864k);
        sb2.append(", importance=");
        sb2.append(this.f16865l);
        sb2.append(", meanings=");
        sb2.append(this.f16866m);
        sb2.append(", meaningTerms=");
        sb2.append(this.f16867n);
        sb2.append(", tags=");
        sb2.append(this.f16868o);
        sb2.append(", gTags=");
        sb2.append(this.f16869p);
        sb2.append(", words=");
        sb2.append(this.f16870q);
        sb2.append(", transliteration=");
        sb2.append(this.f16871r);
        sb2.append(", isPhrase=");
        return C0166e.m769p(sb2, this.f16872s, ")");
    }
}
