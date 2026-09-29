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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/CardJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Card;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CardJsonAdapter extends AbstractC4949k<Card> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f16873a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f16874b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f16875c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f16876d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f16877e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<List<Meaning>> f16878f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<List<String>> f16879g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<LessonTransliteration> f16880h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<Boolean> f16881i;

    /* JADX INFO: renamed from: j */
    public volatile Constructor<Card> f16882j;

    public CardJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f16873a = JsonReader.C4932a.m10513a("term", "termWithLanguage", "pk", "url", "fragment", "status", "extended_status", "last_reviewed_correct", "srs_due_date", "notes", "audio", "importance", "meanings", "meaningTerms", "tags", "gTags", "words", "transliteration", "isPhrase");
        EmptySet emptySet = EmptySet.f38034a;
        this.f16874b = c4955q.m10565c(String.class, emptySet, "term");
        this.f16875c = c4955q.m10565c(Integer.TYPE, emptySet, "id");
        this.f16876d = c4955q.m10565c(String.class, emptySet, "url");
        this.f16877e = c4955q.m10565c(Integer.class, emptySet, "extendedStatus");
        this.f16878f = c4955q.m10565c(C9312p.m17659d(List.class, Meaning.class), emptySet, "meanings");
        this.f16879g = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f16880h = c4955q.m10565c(LessonTransliteration.class, emptySet, "transliteration");
        this.f16881i = c4955q.m10565c(Boolean.TYPE, emptySet, "isPhrase");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Card mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a = bool;
        int i11 = -1;
        List<String> listMo9385a = null;
        List<Meaning> listMo9385a2 = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<String> listMo9385a3 = null;
        String strMo9385a3 = null;
        List<String> listMo9385a4 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        Integer numMo9385a2 = null;
        String strMo9385a6 = null;
        String strMo9385a7 = null;
        String strMo9385a8 = null;
        String strMo9385a9 = null;
        LessonTransliteration lessonTransliterationMo9385a = null;
        Integer numMo9385a3 = numMo9385a;
        Integer numMo9385a4 = numMo9385a3;
        while (true) {
            List<String> list = listMo9385a3;
            if (!jsonReader.mo10511w()) {
                String str = strMo9385a4;
                jsonReader.mo10508q();
                if (i11 == -522277) {
                    if (strMo9385a == null) {
                        throw C9756b.m18248g("term", "term", jsonReader);
                    }
                    if (strMo9385a2 == null) {
                        throw C9756b.m18248g("termWithLanguage", "termWithLanguage", jsonReader);
                    }
                    int iIntValue = numMo9385a.intValue();
                    int iIntValue2 = numMo9385a3.intValue();
                    int iIntValue3 = numMo9385a4.intValue();
                    C5207g.m11109d(listMo9385a2, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.Meaning>");
                    C5207g.m11109d(str, "null cannot be cast to non-null type kotlin.String");
                    C5207g.m11109d(listMo9385a4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    C5207g.m11109d(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    return new Card(strMo9385a, strMo9385a2, iIntValue, strMo9385a3, strMo9385a5, iIntValue2, numMo9385a2, strMo9385a6, strMo9385a7, strMo9385a8, strMo9385a9, iIntValue3, listMo9385a2, str, listMo9385a4, list, listMo9385a, lessonTransliterationMo9385a, boolMo9385a.booleanValue());
                }
                List<Meaning> list2 = listMo9385a2;
                List<String> list3 = listMo9385a4;
                Constructor<Card> declaredConstructor = this.f16882j;
                int i12 = 21;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    declaredConstructor = Card.class.getDeclaredConstructor(String.class, String.class, cls, String.class, String.class, cls, Integer.class, String.class, String.class, String.class, String.class, cls, List.class, String.class, List.class, List.class, List.class, LessonTransliteration.class, Boolean.TYPE, cls, C9756b.f49813c);
                    this.f16882j = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "Card::class.java.getDecl…his.constructorRef = it }");
                    i12 = 21;
                }
                Object[] objArr = new Object[i12];
                if (strMo9385a == null) {
                    throw C9756b.m18248g("term", "term", jsonReader);
                }
                objArr[0] = strMo9385a;
                if (strMo9385a2 == null) {
                    throw C9756b.m18248g("termWithLanguage", "termWithLanguage", jsonReader);
                }
                objArr[1] = strMo9385a2;
                objArr[2] = numMo9385a;
                objArr[3] = strMo9385a3;
                objArr[4] = strMo9385a5;
                objArr[5] = numMo9385a3;
                objArr[6] = numMo9385a2;
                objArr[7] = strMo9385a6;
                objArr[8] = strMo9385a7;
                objArr[9] = strMo9385a8;
                objArr[10] = strMo9385a9;
                objArr[11] = numMo9385a4;
                objArr[12] = list2;
                objArr[13] = str;
                objArr[14] = list3;
                objArr[15] = list;
                objArr[16] = listMo9385a;
                objArr[17] = lessonTransliterationMo9385a;
                objArr[18] = boolMo9385a;
                objArr[19] = Integer.valueOf(i11);
                objArr[20] = null;
                Card cardNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(cardNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return cardNewInstance;
            }
            String str2 = strMo9385a4;
            switch (jsonReader.mo10512y0(this.f16873a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f16874b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("term", "term", jsonReader);
                    }
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                case 1:
                    strMo9385a2 = this.f16874b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("termWithLanguage", "termWithLanguage", jsonReader);
                    }
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                case 2:
                    numMo9385a = this.f16875c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "pk", jsonReader);
                    }
                    i11 &= -5;
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                    break;
                case 3:
                    strMo9385a3 = this.f16876d.mo9385a(jsonReader);
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                case 4:
                    strMo9385a5 = this.f16876d.mo9385a(jsonReader);
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                case 5:
                    numMo9385a3 = this.f16875c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("status", "status", jsonReader);
                    }
                    i11 &= -33;
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a2 = this.f16877e.mo9385a(jsonReader);
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a6 = this.f16876d.mo9385a(jsonReader);
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                case 8:
                    strMo9385a7 = this.f16876d.mo9385a(jsonReader);
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                case 9:
                    strMo9385a8 = this.f16876d.mo9385a(jsonReader);
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                case 10:
                    strMo9385a9 = this.f16876d.mo9385a(jsonReader);
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                case 11:
                    numMo9385a4 = this.f16875c.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("importance", "importance", jsonReader);
                    }
                    i11 &= -2049;
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                    break;
                case 12:
                    listMo9385a2 = this.f16878f.mo9385a(jsonReader);
                    if (listMo9385a2 == null) {
                        throw C9756b.m18254m("meanings", "meanings", jsonReader);
                    }
                    i11 &= -4097;
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                    break;
                case 13:
                    strMo9385a4 = this.f16874b.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("meaningTerms", "meaningTerms", jsonReader);
                    }
                    i11 &= -8193;
                    listMo9385a3 = list;
                    break;
                    break;
                case 14:
                    listMo9385a4 = this.f16879g.mo9385a(jsonReader);
                    if (listMo9385a4 == null) {
                        throw C9756b.m18254m("tags", "tags", jsonReader);
                    }
                    i11 &= -16385;
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
                    break;
                case 15:
                    listMo9385a3 = this.f16879g.mo9385a(jsonReader);
                    if (listMo9385a3 == null) {
                        throw C9756b.m18254m("gTags", "gTags", jsonReader);
                    }
                    i10 = -32769;
                    i11 &= i10;
                    strMo9385a4 = str2;
                    break;
                    break;
                case 16:
                    listMo9385a = this.f16879g.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("words", "words", jsonReader);
                    }
                    i10 = -65537;
                    listMo9385a3 = list;
                    i11 &= i10;
                    strMo9385a4 = str2;
                    break;
                    break;
                case 17:
                    lessonTransliterationMo9385a = this.f16880h.mo9385a(jsonReader);
                    i10 = -131073;
                    listMo9385a3 = list;
                    i11 &= i10;
                    strMo9385a4 = str2;
                    break;
                case 18:
                    boolMo9385a = this.f16881i.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isPhrase", "isPhrase", jsonReader);
                    }
                    i10 = -262145;
                    listMo9385a3 = list;
                    i11 &= i10;
                    strMo9385a4 = str2;
                    break;
                    break;
                default:
                    listMo9385a3 = list;
                    strMo9385a4 = str2;
                    break;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Card card) throws IOException {
        Card card2 = card;
        C5207g.m11111f(abstractC9310n, "writer");
        if (card2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("term");
        String str = card2.f16854a;
        AbstractC4949k<String> abstractC4949k = this.f16874b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("termWithLanguage");
        abstractC4949k.mo9386f(abstractC9310n, card2.f16855b);
        abstractC9310n.mo10551C("pk");
        Integer numValueOf = Integer.valueOf(card2.f16856c);
        AbstractC4949k<Integer> abstractC4949k2 = this.f16875c;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("url");
        String str2 = card2.f16857d;
        AbstractC4949k<String> abstractC4949k3 = this.f16876d;
        abstractC4949k3.mo9386f(abstractC9310n, str2);
        abstractC9310n.mo10551C("fragment");
        abstractC4949k3.mo9386f(abstractC9310n, card2.f16858e);
        abstractC9310n.mo10551C("status");
        C0166e.m775v(card2.f16859f, abstractC4949k2, abstractC9310n, "extended_status");
        this.f16877e.mo9386f(abstractC9310n, card2.f16860g);
        abstractC9310n.mo10551C("last_reviewed_correct");
        abstractC4949k3.mo9386f(abstractC9310n, card2.f16861h);
        abstractC9310n.mo10551C("srs_due_date");
        abstractC4949k3.mo9386f(abstractC9310n, card2.f16862i);
        abstractC9310n.mo10551C("notes");
        abstractC4949k3.mo9386f(abstractC9310n, card2.f16863j);
        abstractC9310n.mo10551C("audio");
        abstractC4949k3.mo9386f(abstractC9310n, card2.f16864k);
        abstractC9310n.mo10551C("importance");
        C0166e.m775v(card2.f16865l, abstractC4949k2, abstractC9310n, "meanings");
        this.f16878f.mo9386f(abstractC9310n, card2.f16866m);
        abstractC9310n.mo10551C("meaningTerms");
        abstractC4949k.mo9386f(abstractC9310n, card2.f16867n);
        abstractC9310n.mo10551C("tags");
        List<String> list = card2.f16868o;
        AbstractC4949k<List<String>> abstractC4949k4 = this.f16879g;
        abstractC4949k4.mo9386f(abstractC9310n, list);
        abstractC9310n.mo10551C("gTags");
        abstractC4949k4.mo9386f(abstractC9310n, card2.f16869p);
        abstractC9310n.mo10551C("words");
        abstractC4949k4.mo9386f(abstractC9310n, card2.f16870q);
        abstractC9310n.mo10551C("transliteration");
        this.f16880h.mo9386f(abstractC9310n, card2.f16871r);
        abstractC9310n.mo10551C("isPhrase");
        this.f16881i.mo9386f(abstractC9310n, Boolean.valueOf(card2.f16872s));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(26, "GeneratedJsonAdapter(Card)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
