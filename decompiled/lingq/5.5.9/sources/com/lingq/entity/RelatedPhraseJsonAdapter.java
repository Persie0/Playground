package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/RelatedPhraseJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/RelatedPhrase;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RelatedPhraseJsonAdapter extends AbstractC4949k<RelatedPhrase> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17390a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17391b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<Meaning>> f17392c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<RelatedPhrase> f17393d;

    public RelatedPhraseJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17390a = JsonReader.C4932a.m10513a("term", "normalizedTerm", "hints");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17391b = c4955q.m10565c(String.class, emptySet, "term");
        this.f17392c = c4955q.m10565c(C9312p.m17659d(List.class, Meaning.class), emptySet, "meanings");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RelatedPhrase mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        List<Meaning> listMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17390a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f17391b.mo9385a(jsonReader);
            } else if (iMo10512y0 == 1) {
                strMo9385a2 = this.f17391b.mo9385a(jsonReader);
            } else if (iMo10512y0 == 2) {
                listMo9385a = this.f17392c.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("meanings", "hints", jsonReader);
                }
                i10 &= -5;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -5) {
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.Meaning?>");
            return new RelatedPhrase(strMo9385a, strMo9385a2, listMo9385a);
        }
        Constructor<RelatedPhrase> declaredConstructor = this.f17393d;
        if (declaredConstructor == null) {
            declaredConstructor = RelatedPhrase.class.getDeclaredConstructor(String.class, String.class, List.class, Integer.TYPE, C9756b.f49813c);
            this.f17393d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "RelatedPhrase::class.jav…his.constructorRef = it }");
        }
        RelatedPhrase relatedPhraseNewInstance = declaredConstructor.newInstance(strMo9385a, strMo9385a2, listMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(relatedPhraseNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return relatedPhraseNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RelatedPhrase relatedPhrase) throws IOException {
        RelatedPhrase relatedPhrase2 = relatedPhrase;
        C5207g.m11111f(abstractC9310n, "writer");
        if (relatedPhrase2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("term");
        String str = relatedPhrase2.f17387a;
        AbstractC4949k<String> abstractC4949k = this.f17391b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("normalizedTerm");
        abstractC4949k.mo9386f(abstractC9310n, relatedPhrase2.f17388b);
        abstractC9310n.mo10551C("hints");
        this.f17392c.mo9386f(abstractC9310n, relatedPhrase2.f17389c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(35, "GeneratedJsonAdapter(RelatedPhrase)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
