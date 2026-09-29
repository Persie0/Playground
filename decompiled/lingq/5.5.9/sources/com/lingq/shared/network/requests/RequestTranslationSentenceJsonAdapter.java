package com.lingq.shared.network.requests;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestTranslationSentenceJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestTranslationSentence;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestTranslationSentenceJsonAdapter extends AbstractC4949k<RequestTranslationSentence> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18215a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18216b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<Double>> f18217c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f18218d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<RequestTranslation>> f18219e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Boolean> f18220f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<RequestTranslationSentence> f18221g;

    public RequestTranslationSentenceJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18215a = JsonReader.C4932a.m10513a("index", "timestamp", "text", "translations", "lone", "action");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18216b = c4955q.m10565c(cls, emptySet, "index");
        this.f18217c = c4955q.m10565c(C9312p.m17659d(List.class, Double.class), emptySet, "timestamp");
        this.f18218d = c4955q.m10565c(String.class, emptySet, "text");
        this.f18219e = c4955q.m10565c(C9312p.m17659d(List.class, RequestTranslation.class), emptySet, "translations");
        this.f18220f = c4955q.m10565c(Boolean.TYPE, emptySet, "lone");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestTranslationSentence mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<Double> listMo9385a = null;
        List<RequestTranslation> listMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f18215a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f18216b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("index", "index", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    listMo9385a = this.f18217c.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("timestamp", "timestamp", jsonReader);
                    }
                    break;
                    break;
                case 2:
                    strMo9385a = this.f18218d.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("text", "text", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    listMo9385a2 = this.f18219e.mo9385a(jsonReader);
                    i10 &= -9;
                    break;
                case 4:
                    boolMo9385a = this.f18220f.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("lone", "lone", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    strMo9385a2 = this.f18218d.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("action", "action", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -61) {
            if (numMo9385a == null) {
                throw C9756b.m18248g("index", "index", jsonReader);
            }
            int iIntValue = numMo9385a.intValue();
            if (listMo9385a == null) {
                throw C9756b.m18248g("timestamp", "timestamp", jsonReader);
            }
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            boolean zBooleanValue = boolMo9385a.booleanValue();
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            return new RequestTranslationSentence(iIntValue, strMo9385a, strMo9385a2, listMo9385a, listMo9385a2, zBooleanValue);
        }
        Constructor<RequestTranslationSentence> declaredConstructor = this.f18221g;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = RequestTranslationSentence.class.getDeclaredConstructor(cls, List.class, String.class, List.class, Boolean.TYPE, String.class, cls, C9756b.f49813c);
            this.f18221g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "RequestTranslationSenten…his.constructorRef = it }");
        }
        Object[] objArr = new Object[8];
        if (numMo9385a == null) {
            throw C9756b.m18248g("index", "index", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a.intValue());
        if (listMo9385a == null) {
            throw C9756b.m18248g("timestamp", "timestamp", jsonReader);
        }
        objArr[1] = listMo9385a;
        objArr[2] = strMo9385a;
        objArr[3] = listMo9385a2;
        objArr[4] = boolMo9385a;
        objArr[5] = strMo9385a2;
        objArr[6] = Integer.valueOf(i10);
        objArr[7] = null;
        RequestTranslationSentence requestTranslationSentenceNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(requestTranslationSentenceNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return requestTranslationSentenceNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestTranslationSentence requestTranslationSentence) throws IOException {
        RequestTranslationSentence requestTranslationSentence2 = requestTranslationSentence;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestTranslationSentence2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("index");
        this.f18216b.mo9386f(abstractC9310n, Integer.valueOf(requestTranslationSentence2.f18209a));
        abstractC9310n.mo10551C("timestamp");
        this.f18217c.mo9386f(abstractC9310n, requestTranslationSentence2.f18210b);
        abstractC9310n.mo10551C("text");
        String str = requestTranslationSentence2.f18211c;
        AbstractC4949k<String> abstractC4949k = this.f18218d;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("translations");
        this.f18219e.mo9386f(abstractC9310n, requestTranslationSentence2.f18212d);
        abstractC9310n.mo10551C("lone");
        this.f18220f.mo9386f(abstractC9310n, Boolean.valueOf(requestTranslationSentence2.f18213e));
        abstractC9310n.mo10551C("action");
        abstractC4949k.mo9386f(abstractC9310n, requestTranslationSentence2.f18214f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(48, "GeneratedJsonAdapter(RequestTranslationSentence)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
