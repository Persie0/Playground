package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Meaning;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultVocabularyCardJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultVocabularyCard;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultVocabularyCardJsonAdapter extends AbstractC4949k<ResultVocabularyCard> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f19066a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f19067b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f19068c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f19069d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f19070e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<List<Meaning>> f19071f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<List<String>> f19072g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<CardLessonTransliteration> f19073h;

    /* JADX INFO: renamed from: i */
    public volatile Constructor<ResultVocabularyCard> f19074i;

    public ResultVocabularyCardJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f19066a = JsonReader.C4932a.m10513a("term", "pk", "url", "fragment", "status", "extended_status", "last_reviewed_correct", "srs_due_date", "notes", "audio", "importance", "hints", "tags", "gTags", "words", "transliteration");
        EmptySet emptySet = EmptySet.f38034a;
        this.f19067b = c4955q.m10565c(String.class, emptySet, "term");
        this.f19068c = c4955q.m10565c(Integer.TYPE, emptySet, "id");
        this.f19069d = c4955q.m10565c(String.class, emptySet, "url");
        this.f19070e = c4955q.m10565c(Integer.class, emptySet, "extendedStatus");
        this.f19071f = c4955q.m10565c(C9312p.m17659d(List.class, Meaning.class), emptySet, "meanings");
        this.f19072g = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f19073h = c4955q.m10565c(CardLessonTransliteration.class, emptySet, "transliteration");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultVocabularyCard mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        List<String> list = null;
        String strMo9385a = null;
        CardLessonTransliteration cardLessonTransliterationMo9385a = null;
        List<Meaning> list2 = null;
        String strMo9385a2 = null;
        Integer numMo9385a = numM850i;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        Integer numMo9385a2 = null;
        String strMo9385a5 = null;
        List<String> listMo9385a = null;
        List<String> listMo9385a2 = null;
        String strMo9385a6 = null;
        String strMo9385a7 = null;
        int i10 = -1;
        Integer numMo9385a3 = numMo9385a;
        while (true) {
            List<String> list3 = listMo9385a;
            if (!jsonReader.mo10511w()) {
                List<String> list4 = list;
                jsonReader.mo10508q();
                if (i10 == -64531) {
                    if (strMo9385a7 == null) {
                        throw C9756b.m18248g("term", "term", jsonReader);
                    }
                    int iIntValue = numM850i.intValue();
                    int iIntValue2 = numMo9385a3.intValue();
                    int iIntValue3 = numMo9385a.intValue();
                    C5207g.m11109d(list2, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.Meaning>");
                    C5207g.m11109d(listMo9385a2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    C5207g.m11109d(list4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    C5207g.m11109d(list3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    return new ResultVocabularyCard(strMo9385a7, iIntValue, strMo9385a6, strMo9385a5, iIntValue2, numMo9385a2, strMo9385a4, strMo9385a3, strMo9385a2, strMo9385a, iIntValue3, list2, listMo9385a2, list4, list3, cardLessonTransliterationMo9385a);
                }
                List<Meaning> list5 = list2;
                List<String> list6 = listMo9385a2;
                Constructor<ResultVocabularyCard> declaredConstructor = this.f19074i;
                int i11 = 18;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    declaredConstructor = ResultVocabularyCard.class.getDeclaredConstructor(String.class, cls, String.class, String.class, cls, Integer.class, String.class, String.class, String.class, String.class, cls, List.class, List.class, List.class, List.class, CardLessonTransliteration.class, cls, C9756b.f49813c);
                    this.f19074i = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "ResultVocabularyCard::cl…his.constructorRef = it }");
                    i11 = 18;
                }
                Object[] objArr = new Object[i11];
                if (strMo9385a7 == null) {
                    throw C9756b.m18248g("term", "term", jsonReader);
                }
                objArr[0] = strMo9385a7;
                objArr[1] = numM850i;
                objArr[2] = strMo9385a6;
                objArr[3] = strMo9385a5;
                objArr[4] = numMo9385a3;
                objArr[5] = numMo9385a2;
                objArr[6] = strMo9385a4;
                objArr[7] = strMo9385a3;
                objArr[8] = strMo9385a2;
                objArr[9] = strMo9385a;
                objArr[10] = numMo9385a;
                objArr[11] = list5;
                objArr[12] = list6;
                objArr[13] = list4;
                objArr[14] = list3;
                objArr[15] = cardLessonTransliterationMo9385a;
                objArr[16] = Integer.valueOf(i10);
                objArr[17] = null;
                ResultVocabularyCard resultVocabularyCardNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(resultVocabularyCardNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return resultVocabularyCardNewInstance;
            }
            List<String> list7 = list;
            switch (jsonReader.mo10512y0(this.f19066a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    list = list7;
                    listMo9385a = list3;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a7 = this.f19067b.mo9385a(jsonReader);
                    if (strMo9385a7 == null) {
                        throw C9756b.m18254m("term", "term", jsonReader);
                    }
                    list = list7;
                    listMo9385a = list3;
                    break;
                case 1:
                    numM850i = this.f19068c.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("id", "pk", jsonReader);
                    }
                    i10 &= -3;
                    list = list7;
                    listMo9385a = list3;
                    break;
                    break;
                case 2:
                    strMo9385a6 = this.f19069d.mo9385a(jsonReader);
                    list = list7;
                    listMo9385a = list3;
                    break;
                case 3:
                    strMo9385a5 = this.f19069d.mo9385a(jsonReader);
                    list = list7;
                    listMo9385a = list3;
                    break;
                case 4:
                    numMo9385a3 = this.f19068c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("status", "status", jsonReader);
                    }
                    i10 &= -17;
                    list = list7;
                    listMo9385a = list3;
                    break;
                    break;
                case 5:
                    numMo9385a2 = this.f19070e.mo9385a(jsonReader);
                    list = list7;
                    listMo9385a = list3;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a4 = this.f19069d.mo9385a(jsonReader);
                    list = list7;
                    listMo9385a = list3;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a3 = this.f19069d.mo9385a(jsonReader);
                    list = list7;
                    listMo9385a = list3;
                    break;
                case 8:
                    strMo9385a2 = this.f19069d.mo9385a(jsonReader);
                    list = list7;
                    listMo9385a = list3;
                    break;
                case 9:
                    strMo9385a = this.f19069d.mo9385a(jsonReader);
                    list = list7;
                    listMo9385a = list3;
                    break;
                case 10:
                    numMo9385a = this.f19068c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("importance", "importance", jsonReader);
                    }
                    i10 &= -1025;
                    list = list7;
                    listMo9385a = list3;
                    break;
                    break;
                case 11:
                    List<Meaning> listMo9385a3 = this.f19071f.mo9385a(jsonReader);
                    if (listMo9385a3 == null) {
                        throw C9756b.m18254m("meanings", "hints", jsonReader);
                    }
                    i10 &= -2049;
                    list2 = listMo9385a3;
                    list = list7;
                    listMo9385a = list3;
                    break;
                    break;
                case 12:
                    listMo9385a2 = this.f19072g.mo9385a(jsonReader);
                    if (listMo9385a2 == null) {
                        throw C9756b.m18254m("tags", "tags", jsonReader);
                    }
                    i10 &= -4097;
                    list = list7;
                    listMo9385a = list3;
                    break;
                    break;
                case 13:
                    List<String> listMo9385a4 = this.f19072g.mo9385a(jsonReader);
                    if (listMo9385a4 == null) {
                        throw C9756b.m18254m("gTags", "gTags", jsonReader);
                    }
                    i10 &= -8193;
                    list = listMo9385a4;
                    listMo9385a = list3;
                    break;
                    break;
                case 14:
                    listMo9385a = this.f19072g.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("words", "words", jsonReader);
                    }
                    i10 &= -16385;
                    list = list7;
                    break;
                    break;
                case 15:
                    i10 &= -32769;
                    cardLessonTransliterationMo9385a = this.f19073h.mo9385a(jsonReader);
                    list = list7;
                    listMo9385a = list3;
                    break;
                default:
                    list = list7;
                    listMo9385a = list3;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultVocabularyCard resultVocabularyCard) throws IOException {
        ResultVocabularyCard resultVocabularyCard2 = resultVocabularyCard;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultVocabularyCard2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("term");
        this.f19067b.mo9386f(abstractC9310n, resultVocabularyCard2.f19050a);
        abstractC9310n.mo10551C("pk");
        Integer numValueOf = Integer.valueOf(resultVocabularyCard2.f19051b);
        AbstractC4949k<Integer> abstractC4949k = this.f19068c;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("url");
        String str = resultVocabularyCard2.f19052c;
        AbstractC4949k<String> abstractC4949k2 = this.f19069d;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("fragment");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCard2.f19053d);
        abstractC9310n.mo10551C("status");
        C0166e.m775v(resultVocabularyCard2.f19054e, abstractC4949k, abstractC9310n, "extended_status");
        this.f19070e.mo9386f(abstractC9310n, resultVocabularyCard2.f19055f);
        abstractC9310n.mo10551C("last_reviewed_correct");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCard2.f19056g);
        abstractC9310n.mo10551C("srs_due_date");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCard2.f19057h);
        abstractC9310n.mo10551C("notes");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCard2.f19058i);
        abstractC9310n.mo10551C("audio");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCard2.f19059j);
        abstractC9310n.mo10551C("importance");
        C0166e.m775v(resultVocabularyCard2.f19060k, abstractC4949k, abstractC9310n, "hints");
        this.f19071f.mo9386f(abstractC9310n, resultVocabularyCard2.f19061l);
        abstractC9310n.mo10551C("tags");
        List<String> list = resultVocabularyCard2.f19062m;
        AbstractC4949k<List<String>> abstractC4949k3 = this.f19072g;
        abstractC4949k3.mo9386f(abstractC9310n, list);
        abstractC9310n.mo10551C("gTags");
        abstractC4949k3.mo9386f(abstractC9310n, resultVocabularyCard2.f19063n);
        abstractC9310n.mo10551C("words");
        abstractC4949k3.mo9386f(abstractC9310n, resultVocabularyCard2.f19064o);
        abstractC9310n.mo10551C("transliteration");
        this.f19073h.mo9386f(abstractC9310n, resultVocabularyCard2.f19065p);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(ResultVocabularyCard)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
