package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/CardLessonTransliteration;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class CardLessonTransliteration {

    /* JADX INFO: renamed from: a */
    public final List<String> f18246a;

    /* JADX INFO: renamed from: b */
    public final List<String> f18247b;

    /* JADX INFO: renamed from: c */
    public final List<String> f18248c;

    /* JADX INFO: renamed from: d */
    public final List<String> f18249d;

    /* JADX INFO: renamed from: e */
    public final List<String> f18250e;

    /* JADX INFO: renamed from: f */
    public final List<String> f18251f;

    public CardLessonTransliteration() {
        this(null, null, null, null, null, null, 63, null);
    }

    public CardLessonTransliteration(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
        this.f18246a = list;
        this.f18247b = list2;
        this.f18248c = list3;
        this.f18249d = list4;
        this.f18250e = list5;
        this.f18251f = list6;
    }

    public CardLessonTransliteration(List list, List list2, List list3, List list4, List list5, List list6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EmptyList.f38032a : list, (i10 & 2) != 0 ? EmptyList.f38032a : list2, (i10 & 4) != 0 ? EmptyList.f38032a : list3, (i10 & 8) != 0 ? EmptyList.f38032a : list4, (i10 & 16) != 0 ? EmptyList.f38032a : list5, (i10 & 32) != 0 ? EmptyList.f38032a : list6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardLessonTransliteration)) {
            return false;
        }
        CardLessonTransliteration cardLessonTransliteration = (CardLessonTransliteration) obj;
        return C5207g.m11106a(this.f18246a, cardLessonTransliteration.f18246a) && C5207g.m11106a(this.f18247b, cardLessonTransliteration.f18247b) && C5207g.m11106a(this.f18248c, cardLessonTransliteration.f18248c) && C5207g.m11106a(this.f18249d, cardLessonTransliteration.f18249d) && C5207g.m11106a(this.f18250e, cardLessonTransliteration.f18250e) && C5207g.m11106a(this.f18251f, cardLessonTransliteration.f18251f);
    }

    public final int hashCode() {
        int iHashCode = 0;
        List<String> list = this.f18246a;
        int iHashCode2 = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f18247b;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f18248c;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.f18249d;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.f18250e;
        int iHashCode6 = (iHashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.f18251f;
        if (list6 != null) {
            iHashCode = list6.hashCode();
        }
        return iHashCode6 + iHashCode;
    }

    public final String toString() {
        return "CardLessonTransliteration(romaji=" + this.f18246a + ", hiragana=" + this.f18247b + ", pinyin=" + this.f18248c + ", hant=" + this.f18249d + ", hans=" + this.f18250e + ", jyutping=" + this.f18251f + ")";
    }
}
