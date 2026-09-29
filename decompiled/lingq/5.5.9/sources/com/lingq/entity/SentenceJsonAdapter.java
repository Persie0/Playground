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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/SentenceJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Sentence;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SentenceJsonAdapter extends AbstractC4949k<Sentence> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17401a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17402b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<TextToken>> f17403c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17404d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<Float>> f17405e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Boolean> f17406f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<Sentence> f17407g;

    public SentenceJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17401a = JsonReader.C4932a.m10513a("lessonId", "tokens", "text", "normalizedText", "index", "timestamp", "startParagraph");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17402b = c4955q.m10565c(cls, emptySet, "lessonId");
        this.f17403c = c4955q.m10565c(C9312p.m17659d(List.class, TextToken.class), emptySet, "tokens");
        this.f17404d = c4955q.m10565c(String.class, emptySet, "text");
        this.f17405e = c4955q.m10565c(C9312p.m17659d(List.class, Float.class), emptySet, "timestamp");
        this.f17406f = c4955q.m10565c(Boolean.TYPE, emptySet, "startParagraph");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Sentence mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        Integer numMo9385a2 = null;
        List<TextToken> listMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<Float> listMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17401a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f17402b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("lessonId", "lessonId", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    listMo9385a = this.f17403c.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("tokens", "tokens", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    strMo9385a = this.f17404d.mo9385a(jsonReader);
                    break;
                case 3:
                    strMo9385a2 = this.f17404d.mo9385a(jsonReader);
                    break;
                case 4:
                    numMo9385a2 = this.f17402b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("index", "index", jsonReader);
                    }
                    break;
                    break;
                case 5:
                    listMo9385a2 = this.f17405e.mo9385a(jsonReader);
                    i10 &= -33;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolMo9385a = this.f17406f.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("startParagraph", "startParagraph", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -99) {
            if (numMo9385a == null) {
                throw C9756b.m18248g("lessonId", "lessonId", jsonReader);
            }
            int iIntValue = numMo9385a.intValue();
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.TextToken>");
            if (numMo9385a2 != null) {
                return new Sentence(iIntValue, listMo9385a, strMo9385a, strMo9385a2, numMo9385a2.intValue(), listMo9385a2, boolMo9385a.booleanValue());
            }
            throw C9756b.m18248g("index", "index", jsonReader);
        }
        Constructor<Sentence> declaredConstructor = this.f17407g;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = Sentence.class.getDeclaredConstructor(cls, List.class, String.class, String.class, cls, List.class, Boolean.TYPE, cls, C9756b.f49813c);
            this.f17407g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "Sentence::class.java.get…his.constructorRef = it }");
        }
        Object[] objArr = new Object[9];
        if (numMo9385a == null) {
            throw C9756b.m18248g("lessonId", "lessonId", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a.intValue());
        objArr[1] = listMo9385a;
        objArr[2] = strMo9385a;
        objArr[3] = strMo9385a2;
        if (numMo9385a2 == null) {
            throw C9756b.m18248g("index", "index", jsonReader);
        }
        objArr[4] = Integer.valueOf(numMo9385a2.intValue());
        objArr[5] = listMo9385a2;
        objArr[6] = boolMo9385a;
        objArr[7] = Integer.valueOf(i10);
        objArr[8] = null;
        Sentence sentenceNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(sentenceNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return sentenceNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Sentence sentence) throws IOException {
        Sentence sentence2 = sentence;
        C5207g.m11111f(abstractC9310n, "writer");
        if (sentence2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("lessonId");
        Integer numValueOf = Integer.valueOf(sentence2.f17394a);
        AbstractC4949k<Integer> abstractC4949k = this.f17402b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("tokens");
        this.f17403c.mo9386f(abstractC9310n, sentence2.f17395b);
        abstractC9310n.mo10551C("text");
        String str = sentence2.f17396c;
        AbstractC4949k<String> abstractC4949k2 = this.f17404d;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("normalizedText");
        abstractC4949k2.mo9386f(abstractC9310n, sentence2.f17397d);
        abstractC9310n.mo10551C("index");
        C0166e.m775v(sentence2.f17398e, abstractC4949k, abstractC9310n, "timestamp");
        this.f17405e.mo9386f(abstractC9310n, sentence2.f17399f);
        abstractC9310n.mo10551C("startParagraph");
        this.f17406f.mo9386f(abstractC9310n, Boolean.valueOf(sentence2.f17400g));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(30, "GeneratedJsonAdapter(Sentence)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
