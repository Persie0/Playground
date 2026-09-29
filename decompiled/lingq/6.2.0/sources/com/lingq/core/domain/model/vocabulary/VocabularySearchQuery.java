package com.lingq.core.domain.model.vocabulary;

import com.lingq.core.domain.model.status.CardStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import p000.b98;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g1b;
import p000.hn1;
import p000.ux5;
import p000.vz1;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class VocabularySearchQuery {
    public static final C1514a Companion = new C1514a();

    /* JADX INFO: renamed from: k */
    public static final cs4[] f19858k;

    /* JADX INFO: renamed from: a */
    public int f19859a;

    /* JADX INFO: renamed from: b */
    public int f19860b;

    /* JADX INFO: renamed from: c */
    public VocabularySearch f19861c;

    /* JADX INFO: renamed from: d */
    public int f19862d;

    /* JADX INFO: renamed from: e */
    public VocabularySort f19863e;

    /* JADX INFO: renamed from: f */
    public String f19864f;

    /* JADX INFO: renamed from: g */
    public List f19865g;

    /* JADX INFO: renamed from: h */
    public List f19866h;

    /* JADX INFO: renamed from: i */
    public Pair f19867i;

    /* JADX INFO: renamed from: j */
    public Pair f19868j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19858k = new cs4[]{null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(27)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(28)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(29)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g1b(0)), null, null};
    }

    public VocabularySearchQuery() {
        CardStatus cardStatus = CardStatus.New;
        int value = cardStatus.getValue();
        CardStatus cardStatus2 = CardStatus.Known;
        int value2 = cardStatus2.getValue();
        VocabularySearch vocabularySearch = VocabularySearch.Contains;
        VocabularySort vocabularySort = VocabularySort.AtoZ;
        ArrayList arrayList = new ArrayList();
        List listM23605K = vz1.m23605K(cardStatus, CardStatus.Recognized, CardStatus.Familiar, CardStatus.Learned, cardStatus2);
        Pair pair = new Pair(null, null);
        Pair pair2 = new Pair(null, null);
        vocabularySearch.getClass();
        vocabularySort.getClass();
        this.f19859a = value;
        this.f19860b = value2;
        this.f19861c = vocabularySearch;
        this.f19862d = 20;
        this.f19863e = vocabularySort;
        this.f19864f = "";
        this.f19865g = arrayList;
        this.f19866h = listM23605K;
        this.f19867i = pair;
        this.f19868j = pair2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VocabularySearchQuery)) {
            return false;
        }
        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) obj;
        return this.f19859a == vocabularySearchQuery.f19859a && this.f19860b == vocabularySearchQuery.f19860b && this.f19861c == vocabularySearchQuery.f19861c && this.f19862d == vocabularySearchQuery.f19862d && this.f19863e == vocabularySearchQuery.f19863e && fa4.m11650l(this.f19864f, vocabularySearchQuery.f19864f) && fa4.m11650l(this.f19865g, vocabularySearchQuery.f19865g) && fa4.m11650l(this.f19866h, vocabularySearchQuery.f19866h) && fa4.m11650l(this.f19867i, vocabularySearchQuery.f19867i) && fa4.m11650l(this.f19868j, vocabularySearchQuery.f19868j);
    }

    public final int hashCode() {
        return this.f19868j.hashCode() + ((this.f19867i.hashCode() + ux5.m22979b(ux5.m22979b(ux5.m22980c((this.f19863e.hashCode() + wq1.m24106b(this.f19862d, (this.f19861c.hashCode() + wq1.m24106b(this.f19860b, Integer.hashCode(this.f19859a) * 31, 31)) * 31, 31)) * 31, this.f19864f, 31), 31, this.f19865g), 31, this.f19866h)) * 31);
    }

    public final String toString() {
        int i = this.f19859a;
        int i2 = this.f19860b;
        VocabularySearch vocabularySearch = this.f19861c;
        int i3 = this.f19862d;
        VocabularySort vocabularySort = this.f19863e;
        String str = this.f19864f;
        List list = this.f19865g;
        List list2 = this.f19866h;
        Pair pair = this.f19867i;
        Pair pair2 = this.f19868j;
        StringBuilder sbM22994q = ux5.m22994q(i, i2, "VocabularySearchQuery(minStatus=", ", maxStatus=", ", criteria=");
        sbM22994q.append(vocabularySearch);
        sbM22994q.append(", pageSize=");
        sbM22994q.append(i3);
        sbM22994q.append(", sortBy=");
        sbM22994q.append(vocabularySort);
        sbM22994q.append(", srsDate=");
        sbM22994q.append(str);
        sbM22994q.append(", tags=");
        hn1.m13372v(sbM22994q, list, ", statuses=", list2, ", course=");
        sbM22994q.append(pair);
        sbM22994q.append(", lesson=");
        sbM22994q.append(pair2);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
