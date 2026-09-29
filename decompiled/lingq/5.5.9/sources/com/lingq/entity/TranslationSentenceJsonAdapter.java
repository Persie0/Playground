package com.lingq.entity;

import android.support.v4.media.session.C0166e;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/TranslationSentenceJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/TranslationSentence;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TranslationSentenceJsonAdapter extends AbstractC4949k<TranslationSentence> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17539a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17540b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Double> f17541c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17542d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<Translation>> f17543e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<TranslationSentence> f17544f;

    public TranslationSentenceJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17539a = JsonReader.C4932a.m10513a("index", "lessonId", "audio", "audio_end", "text", "translations");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17540b = c4955q.m10565c(cls, emptySet, "index");
        this.f17541c = c4955q.m10565c(Double.class, emptySet, "audio");
        this.f17542d = c4955q.m10565c(String.class, emptySet, "text");
        this.f17543e = c4955q.m10565c(C9312p.m17659d(List.class, Translation.class), emptySet, "translations");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final TranslationSentence mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        Integer numMo9385a2 = null;
        Double dMo9385a = null;
        Double dMo9385a2 = null;
        String strMo9385a = null;
        List<Translation> listMo9385a = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17539a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f17540b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("index", "index", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    numMo9385a2 = this.f17540b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("lessonId", "lessonId", jsonReader);
                    }
                    break;
                    break;
                case 2:
                    dMo9385a = this.f17541c.mo9385a(jsonReader);
                    break;
                case 3:
                    dMo9385a2 = this.f17541c.mo9385a(jsonReader);
                    break;
                case 4:
                    strMo9385a = this.f17542d.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("text", "text", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    listMo9385a = this.f17543e.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("translations", "translations", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -49) {
            if (numMo9385a == null) {
                throw C9756b.m18248g("index", "index", jsonReader);
            }
            int iIntValue = numMo9385a.intValue();
            if (numMo9385a2 == null) {
                throw C9756b.m18248g("lessonId", "lessonId", jsonReader);
            }
            int iIntValue2 = numMo9385a2.intValue();
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.Translation>");
            return new TranslationSentence(iIntValue, iIntValue2, dMo9385a, dMo9385a2, strMo9385a, listMo9385a);
        }
        Constructor<TranslationSentence> declaredConstructor = this.f17544f;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = TranslationSentence.class.getDeclaredConstructor(cls, cls, Double.class, Double.class, String.class, List.class, cls, C9756b.f49813c);
            this.f17544f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "TranslationSentence::cla…his.constructorRef = it }");
        }
        Object[] objArr = new Object[8];
        if (numMo9385a == null) {
            throw C9756b.m18248g("index", "index", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a.intValue());
        if (numMo9385a2 == null) {
            throw C9756b.m18248g("lessonId", "lessonId", jsonReader);
        }
        objArr[1] = Integer.valueOf(numMo9385a2.intValue());
        objArr[2] = dMo9385a;
        objArr[3] = dMo9385a2;
        objArr[4] = strMo9385a;
        objArr[5] = listMo9385a;
        objArr[6] = Integer.valueOf(i10);
        objArr[7] = null;
        TranslationSentence translationSentenceNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(translationSentenceNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return translationSentenceNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, TranslationSentence translationSentence) throws IOException {
        TranslationSentence translationSentence2 = translationSentence;
        C5207g.m11111f(abstractC9310n, "writer");
        if (translationSentence2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("index");
        Integer numValueOf = Integer.valueOf(translationSentence2.f17533a);
        AbstractC4949k<Integer> abstractC4949k = this.f17540b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("lessonId");
        C0166e.m775v(translationSentence2.f17534b, abstractC4949k, abstractC9310n, "audio");
        Double d10 = translationSentence2.f17535c;
        AbstractC4949k<Double> abstractC4949k2 = this.f17541c;
        abstractC4949k2.mo9386f(abstractC9310n, d10);
        abstractC9310n.mo10551C("audio_end");
        abstractC4949k2.mo9386f(abstractC9310n, translationSentence2.f17536d);
        abstractC9310n.mo10551C("text");
        this.f17542d.mo9386f(abstractC9310n, translationSentence2.f17537e);
        abstractC9310n.mo10551C("translations");
        this.f17543e.mo9386f(abstractC9310n, translationSentence2.f17538f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(41, "GeneratedJsonAdapter(TranslationSentence)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
