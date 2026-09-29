package com.lingq.shared.uimodel.vocabulary;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.CardStatus;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import dm.C5213m;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/vocabulary/VocabularySearchQueryJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/vocabulary/VocabularySearchQuery;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class VocabularySearchQueryJsonAdapter extends AbstractC4949k<VocabularySearchQuery> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f22137a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f22138b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<VocabularySearch> f22139c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<VocabularySort> f22140d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<String> f22141e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<List<String>> f22142f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<List<CardStatus>> f22143g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<Pair<String, Integer>> f22144h;

    /* JADX INFO: renamed from: i */
    public volatile Constructor<VocabularySearchQuery> f22145i;

    public VocabularySearchQueryJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f22137a = JsonReader.C4932a.m10513a("minStatus", "maxStatus", "criteria", "pageSize", "sortBy", "srsDate", "tags", "statuses", "course", "lesson");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f22138b = c4955q.m10565c(cls, emptySet, "minStatus");
        this.f22139c = c4955q.m10565c(VocabularySearch.class, emptySet, "criteria");
        this.f22140d = c4955q.m10565c(VocabularySort.class, emptySet, "sortBy");
        this.f22141e = c4955q.m10565c(String.class, emptySet, "srsDate");
        this.f22142f = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f22143g = c4955q.m10565c(C9312p.m17659d(List.class, CardStatus.class), emptySet, "statuses");
        this.f22144h = c4955q.m10565c(C9312p.m17659d(Pair.class, String.class, Integer.class), emptySet, "course");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final VocabularySearchQuery mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        Pair<String, Integer> pairMo9385a = null;
        List<String> listMo9385a = null;
        VocabularySort vocabularySortMo9385a = null;
        String strMo9385a = null;
        Pair<String, Integer> pairMo9385a2 = null;
        Integer numMo9385a = numM850i;
        List<CardStatus> listMo9385a2 = null;
        VocabularySearch vocabularySearchMo9385a = null;
        int i10 = -1;
        Integer numMo9385a2 = numMo9385a;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f22137a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numM850i = this.f22138b.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("minStatus", "minStatus", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    numMo9385a2 = this.f22138b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("maxStatus", "maxStatus", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    vocabularySearchMo9385a = this.f22139c.mo9385a(jsonReader);
                    if (vocabularySearchMo9385a == null) {
                        throw C9756b.m18254m("criteria", "criteria", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    numMo9385a = this.f22138b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("pageSize", "pageSize", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    vocabularySortMo9385a = this.f22140d.mo9385a(jsonReader);
                    if (vocabularySortMo9385a == null) {
                        throw C9756b.m18254m("sortBy", "sortBy", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    strMo9385a = this.f22141e.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("srsDate", "srsDate", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    listMo9385a = this.f22142f.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("tags", "tags", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    listMo9385a2 = this.f22143g.mo9385a(jsonReader);
                    if (listMo9385a2 == null) {
                        throw C9756b.m18254m("statuses", "statuses", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
                case 8:
                    pairMo9385a2 = this.f22144h.mo9385a(jsonReader);
                    if (pairMo9385a2 == null) {
                        throw C9756b.m18254m("course", "course", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    pairMo9385a = this.f22144h.mo9385a(jsonReader);
                    if (pairMo9385a == null) {
                        throw C9756b.m18254m("lesson", "lesson", jsonReader);
                    }
                    i10 &= -513;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -1024) {
            int iIntValue = numM850i.intValue();
            int iIntValue2 = numMo9385a2.intValue();
            C5207g.m11109d(vocabularySearchMo9385a, "null cannot be cast to non-null type com.lingq.shared.uimodel.vocabulary.VocabularySearch");
            int iIntValue3 = numMo9385a.intValue();
            C5207g.m11109d(vocabularySortMo9385a, "null cannot be cast to non-null type com.lingq.shared.uimodel.vocabulary.VocabularySort");
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
            C5213m.m11197b(listMo9385a);
            C5207g.m11109d(listMo9385a2, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.uimodel.CardStatus>");
            C5207g.m11109d(pairMo9385a2, "null cannot be cast to non-null type kotlin.Pair<kotlin.String?, kotlin.Int?>");
            C5207g.m11109d(pairMo9385a, "null cannot be cast to non-null type kotlin.Pair<kotlin.String?, kotlin.Int?>");
            return new VocabularySearchQuery(iIntValue, iIntValue2, vocabularySearchMo9385a, iIntValue3, vocabularySortMo9385a, strMo9385a, listMo9385a, listMo9385a2, pairMo9385a2, pairMo9385a);
        }
        Pair<String, Integer> pair = pairMo9385a2;
        List<CardStatus> list = listMo9385a2;
        Pair<String, Integer> pair2 = pairMo9385a;
        Constructor<VocabularySearchQuery> declaredConstructor = this.f22145i;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = VocabularySearchQuery.class.getDeclaredConstructor(cls, cls, VocabularySearch.class, cls, VocabularySort.class, String.class, List.class, List.class, Pair.class, Pair.class, cls, C9756b.f49813c);
            this.f22145i = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "VocabularySearchQuery::c…his.constructorRef = it }");
        }
        VocabularySearchQuery vocabularySearchQueryNewInstance = declaredConstructor.newInstance(numM850i, numMo9385a2, vocabularySearchMo9385a, numMo9385a, vocabularySortMo9385a, strMo9385a, listMo9385a, list, pair, pair2, Integer.valueOf(i10), null);
        C5207g.m11110e(vocabularySearchQueryNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return vocabularySearchQueryNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, VocabularySearchQuery vocabularySearchQuery) throws IOException {
        VocabularySearchQuery vocabularySearchQuery2 = vocabularySearchQuery;
        C5207g.m11111f(abstractC9310n, "writer");
        if (vocabularySearchQuery2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("minStatus");
        Integer numValueOf = Integer.valueOf(vocabularySearchQuery2.f22127a);
        AbstractC4949k<Integer> abstractC4949k = this.f22138b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("maxStatus");
        C0166e.m775v(vocabularySearchQuery2.f22128b, abstractC4949k, abstractC9310n, "criteria");
        this.f22139c.mo9386f(abstractC9310n, vocabularySearchQuery2.f22129c);
        abstractC9310n.mo10551C("pageSize");
        C0166e.m775v(vocabularySearchQuery2.f22130d, abstractC4949k, abstractC9310n, "sortBy");
        this.f22140d.mo9386f(abstractC9310n, vocabularySearchQuery2.f22131e);
        abstractC9310n.mo10551C("srsDate");
        this.f22141e.mo9386f(abstractC9310n, vocabularySearchQuery2.f22132f);
        abstractC9310n.mo10551C("tags");
        this.f22142f.mo9386f(abstractC9310n, vocabularySearchQuery2.f22133g);
        abstractC9310n.mo10551C("statuses");
        this.f22143g.mo9386f(abstractC9310n, (List<CardStatus>) vocabularySearchQuery2.f22134h);
        abstractC9310n.mo10551C("course");
        Pair<String, Integer> pair = vocabularySearchQuery2.f22135i;
        AbstractC4949k<Pair<String, Integer>> abstractC4949k2 = this.f22144h;
        abstractC4949k2.mo9386f(abstractC9310n, pair);
        abstractC9310n.mo10551C("lesson");
        abstractC4949k2.mo9386f(abstractC9310n, vocabularySearchQuery2.f22136j);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(43, "GeneratedJsonAdapter(VocabularySearchQuery)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
