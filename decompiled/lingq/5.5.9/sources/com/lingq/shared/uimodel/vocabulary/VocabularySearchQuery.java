package com.lingq.shared.uimodel.vocabulary;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.shared.uimodel.CardStatus;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import p385sf.C9000b;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/vocabulary/VocabularySearchQuery;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class VocabularySearchQuery {

    /* JADX INFO: renamed from: a */
    public int f22127a;

    /* JADX INFO: renamed from: b */
    public int f22128b;

    /* JADX INFO: renamed from: c */
    public VocabularySearch f22129c;

    /* JADX INFO: renamed from: d */
    public final int f22130d;

    /* JADX INFO: renamed from: e */
    public VocabularySort f22131e;

    /* JADX INFO: renamed from: f */
    public final String f22132f;

    /* JADX INFO: renamed from: g */
    public List<String> f22133g;

    /* JADX INFO: renamed from: h */
    public final List<? extends CardStatus> f22134h;

    /* JADX INFO: renamed from: i */
    public Pair<String, Integer> f22135i;

    /* JADX INFO: renamed from: j */
    public Pair<String, Integer> f22136j;

    public VocabularySearchQuery() {
        this(0, 0, null, 0, null, null, null, null, null, null, 1023, null);
    }

    public VocabularySearchQuery(int i10, int i11, VocabularySearch vocabularySearch, int i12, VocabularySort vocabularySort, String str, List<String> list, List<? extends CardStatus> list2, Pair<String, Integer> pair, Pair<String, Integer> pair2) {
        C5207g.m11111f(vocabularySearch, "criteria");
        C5207g.m11111f(vocabularySort, "sortBy");
        C5207g.m11111f(str, "srsDate");
        C5207g.m11111f(list, "tags");
        C5207g.m11111f(list2, "statuses");
        C5207g.m11111f(pair, "course");
        C5207g.m11111f(pair2, "lesson");
        this.f22127a = i10;
        this.f22128b = i11;
        this.f22129c = vocabularySearch;
        this.f22130d = i12;
        this.f22131e = vocabularySort;
        this.f22132f = str;
        this.f22133g = list;
        this.f22134h = list2;
        this.f22135i = pair;
        this.f22136j = pair2;
    }

    public /* synthetic */ VocabularySearchQuery(int i10, int i11, VocabularySearch vocabularySearch, int i12, VocabularySort vocabularySort, String str, List list, List list2, Pair pair, Pair pair2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? CardStatus.New.getValue() : i10, (i13 & 2) != 0 ? CardStatus.Known.getValue() : i11, (i13 & 4) != 0 ? VocabularySearch.Contains : vocabularySearch, (i13 & 8) != 0 ? 20 : i12, (i13 & 16) != 0 ? VocabularySort.AtoZ : vocabularySort, (i13 & 32) != 0 ? "" : str, (i13 & 64) != 0 ? new ArrayList() : list, (i13 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? C9000b.m17252r(CardStatus.New, CardStatus.Recognized, CardStatus.Familiar, CardStatus.Learned, CardStatus.Known) : list2, (i13 & 256) != 0 ? new Pair(null, null) : pair, (i13 & 512) != 0 ? new Pair(null, null) : pair2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VocabularySearchQuery)) {
            return false;
        }
        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) obj;
        return this.f22127a == vocabularySearchQuery.f22127a && this.f22128b == vocabularySearchQuery.f22128b && this.f22129c == vocabularySearchQuery.f22129c && this.f22130d == vocabularySearchQuery.f22130d && this.f22131e == vocabularySearchQuery.f22131e && C5207g.m11106a(this.f22132f, vocabularySearchQuery.f22132f) && C5207g.m11106a(this.f22133g, vocabularySearchQuery.f22133g) && C5207g.m11106a(this.f22134h, vocabularySearchQuery.f22134h) && C5207g.m11106a(this.f22135i, vocabularySearchQuery.f22135i) && C5207g.m11106a(this.f22136j, vocabularySearchQuery.f22136j);
    }

    public final int hashCode() {
        return this.f22136j.hashCode() + ((this.f22135i.hashCode() + C0204c.m848g(this.f22134h, C0204c.m848g(this.f22133g, C0166e.m758d(this.f22132f, (this.f22131e.hashCode() + C0009a.m16d(this.f22130d, (this.f22129c.hashCode() + C0009a.m16d(this.f22128b, Integer.hashCode(this.f22127a) * 31, 31)) * 31, 31)) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        int i10 = this.f22127a;
        int i11 = this.f22128b;
        VocabularySearch vocabularySearch = this.f22129c;
        VocabularySort vocabularySort = this.f22131e;
        List<String> list = this.f22133g;
        Pair<String, Integer> pair = this.f22135i;
        Pair<String, Integer> pair2 = this.f22136j;
        StringBuilder sbM25n = C0009a.m25n("VocabularySearchQuery(minStatus=", i10, ", maxStatus=", i11, ", criteria=");
        sbM25n.append(vocabularySearch);
        sbM25n.append(", pageSize=");
        sbM25n.append(this.f22130d);
        sbM25n.append(", sortBy=");
        sbM25n.append(vocabularySort);
        sbM25n.append(", srsDate=");
        sbM25n.append(this.f22132f);
        sbM25n.append(", tags=");
        sbM25n.append(list);
        sbM25n.append(", statuses=");
        sbM25n.append(this.f22134h);
        sbM25n.append(", course=");
        sbM25n.append(pair);
        sbM25n.append(", lesson=");
        sbM25n.append(pair2);
        sbM25n.append(")");
        return sbM25n.toString();
    }
}
