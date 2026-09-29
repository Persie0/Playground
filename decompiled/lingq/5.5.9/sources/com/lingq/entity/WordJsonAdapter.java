package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/WordJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Word;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class WordJsonAdapter extends AbstractC4949k<Word> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17587a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17588b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17589c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17590d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Boolean> f17591e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<List<Meaning>> f17592f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<List<String>> f17593g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<Readings> f17594h;

    /* JADX INFO: renamed from: i */
    public volatile Constructor<Word> f17595i;

    public WordJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17587a = JsonReader.C4932a.m10513a("termWithLanguage", "term", "id", "status", "importance", "isPhrase", "meanings", "tags", "gTags", "readings", "cardId");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17588b = c4955q.m10565c(String.class, emptySet, "termWithLanguage");
        this.f17589c = c4955q.m10565c(Integer.TYPE, emptySet, "id");
        this.f17590d = c4955q.m10565c(String.class, emptySet, "status");
        this.f17591e = c4955q.m10565c(Boolean.TYPE, emptySet, "isPhrase");
        this.f17592f = c4955q.m10565c(C9312p.m17659d(List.class, Meaning.class), emptySet, "meanings");
        this.f17593g = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f17594h = c4955q.m10565c(Readings.class, emptySet, "readings");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Word mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        int i11;
        C5207g.m11111f(jsonReader, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean bool2 = bool;
        int i12 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<String> listMo9385a = null;
        String strMo9385a3 = null;
        List<Meaning> listMo9385a2 = null;
        List<String> listMo9385a3 = null;
        Readings readingsMo9385a = null;
        Integer num2 = num;
        Integer num3 = num2;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17587a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f17588b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("termWithLanguage", "termWithLanguage", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    strMo9385a2 = this.f17588b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("term", "term", jsonReader);
                    }
                    break;
                    break;
                case 2:
                    Integer numMo9385a = this.f17589c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i12 &= -5;
                    num = numMo9385a;
                    break;
                    break;
                case 3:
                    strMo9385a3 = this.f17590d.mo9385a(jsonReader);
                    break;
                case 4:
                    Integer numMo9385a2 = this.f17589c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("importance", "importance", jsonReader);
                    }
                    i12 &= -17;
                    num2 = numMo9385a2;
                    break;
                    break;
                case 5:
                    Boolean boolMo9385a = this.f17591e.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isPhrase", "isPhrase", jsonReader);
                    }
                    i10 = i12 & (-33);
                    bool2 = boolMo9385a;
                    i12 = i10;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    listMo9385a2 = this.f17592f.mo9385a(jsonReader);
                    if (listMo9385a2 == null) {
                        throw C9756b.m18254m("meanings", "meanings", jsonReader);
                    }
                    i11 = i12 & (-65);
                    i12 = i11;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    listMo9385a = this.f17593g.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("tags", "tags", jsonReader);
                    }
                    i11 = i12 & (-129);
                    i12 = i11;
                    break;
                    break;
                case 8:
                    listMo9385a3 = this.f17593g.mo9385a(jsonReader);
                    if (listMo9385a3 == null) {
                        throw C9756b.m18254m("gTags", "gTags", jsonReader);
                    }
                    i11 = i12 & (-257);
                    i12 = i11;
                    break;
                    break;
                case 9:
                    readingsMo9385a = this.f17594h.mo9385a(jsonReader);
                    i11 = i12 & (-513);
                    i12 = i11;
                    break;
                case 10:
                    Integer numMo9385a3 = this.f17589c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("cardId", "cardId", jsonReader);
                    }
                    i10 = i12 & (-1025);
                    num3 = numMo9385a3;
                    i12 = i10;
                    break;
                    break;
                default:
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i12 == -2037) {
            if (strMo9385a == null) {
                throw C9756b.m18248g("termWithLanguage", "termWithLanguage", jsonReader);
            }
            if (strMo9385a2 == null) {
                throw C9756b.m18248g("term", "term", jsonReader);
            }
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            boolean zBooleanValue = bool2.booleanValue();
            C5207g.m11109d(listMo9385a2, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.Meaning?>");
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            C5207g.m11109d(listMo9385a3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new Word(strMo9385a, strMo9385a2, iIntValue, strMo9385a3, iIntValue2, zBooleanValue, listMo9385a2, listMo9385a, listMo9385a3, readingsMo9385a, num3.intValue());
        }
        List<String> list = listMo9385a;
        List<Meaning> list2 = listMo9385a2;
        List<String> list3 = listMo9385a3;
        Constructor<Word> declaredConstructor = this.f17595i;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = Word.class.getDeclaredConstructor(String.class, String.class, cls, String.class, cls, Boolean.TYPE, List.class, List.class, List.class, Readings.class, cls, cls, C9756b.f49813c);
            this.f17595i = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "Word::class.java.getDecl…his.constructorRef = it }");
        }
        Object[] objArr = new Object[13];
        if (strMo9385a == null) {
            throw C9756b.m18248g("termWithLanguage", "termWithLanguage", jsonReader);
        }
        objArr[0] = strMo9385a;
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("term", "term", jsonReader);
        }
        objArr[1] = strMo9385a2;
        objArr[2] = num;
        objArr[3] = strMo9385a3;
        objArr[4] = num2;
        objArr[5] = bool2;
        objArr[6] = list2;
        objArr[7] = list;
        objArr[8] = list3;
        objArr[9] = readingsMo9385a;
        objArr[10] = num3;
        objArr[11] = Integer.valueOf(i12);
        objArr[12] = null;
        Word wordNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(wordNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return wordNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Word word) throws IOException {
        Word word2 = word;
        C5207g.m11111f(abstractC9310n, "writer");
        if (word2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("termWithLanguage");
        String str = word2.f17576a;
        AbstractC4949k<String> abstractC4949k = this.f17588b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("term");
        abstractC4949k.mo9386f(abstractC9310n, word2.f17577b);
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(word2.f17578c);
        AbstractC4949k<Integer> abstractC4949k2 = this.f17589c;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("status");
        this.f17590d.mo9386f(abstractC9310n, word2.f17579d);
        abstractC9310n.mo10551C("importance");
        C0166e.m775v(word2.f17580e, abstractC4949k2, abstractC9310n, "isPhrase");
        this.f17591e.mo9386f(abstractC9310n, Boolean.valueOf(word2.f17581f));
        abstractC9310n.mo10551C("meanings");
        this.f17592f.mo9386f(abstractC9310n, word2.f17582g);
        abstractC9310n.mo10551C("tags");
        List<String> list = word2.f17583h;
        AbstractC4949k<List<String>> abstractC4949k3 = this.f17593g;
        abstractC4949k3.mo9386f(abstractC9310n, list);
        abstractC9310n.mo10551C("gTags");
        abstractC4949k3.mo9386f(abstractC9310n, word2.f17584i);
        abstractC9310n.mo10551C("readings");
        this.f17594h.mo9386f(abstractC9310n, word2.f17585j);
        abstractC9310n.mo10551C("cardId");
        abstractC4949k2.mo9386f(abstractC9310n, Integer.valueOf(word2.f17586k));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(26, "GeneratedJsonAdapter(Word)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
