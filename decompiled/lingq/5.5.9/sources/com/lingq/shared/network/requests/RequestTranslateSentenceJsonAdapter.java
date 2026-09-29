package com.lingq.shared.network.requests;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestTranslateSentenceJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestTranslateSentence;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestTranslateSentenceJsonAdapter extends AbstractC4949k<RequestTranslateSentence> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18197a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18198b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f18199c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f18200d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<RequestTranslateSentence> f18201e;

    public RequestTranslateSentenceJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18197a = JsonReader.C4932a.m10513a("language", "is_google_translate", "index");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18198b = c4955q.m10565c(String.class, emptySet, "language");
        this.f18199c = c4955q.m10565c(Boolean.TYPE, emptySet, "isGoogleTranslate");
        this.f18200d = c4955q.m10565c(Integer.TYPE, emptySet, "index");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestTranslateSentence mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        String strMo9385a = null;
        Integer numMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18197a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f18198b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("language", "language", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                boolMo9385a = this.f18199c.mo9385a(jsonReader);
                if (boolMo9385a == null) {
                    throw C9756b.m18254m("isGoogleTranslate", "is_google_translate", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2 && (numMo9385a = this.f18200d.mo9385a(jsonReader)) == null) {
                throw C9756b.m18254m("index", "index", jsonReader);
            }
        }
        jsonReader.mo10508q();
        if (i10 == -3) {
            if (strMo9385a == null) {
                throw C9756b.m18248g("language", "language", jsonReader);
            }
            boolean zBooleanValue = boolMo9385a.booleanValue();
            if (numMo9385a != null) {
                return new RequestTranslateSentence(strMo9385a, numMo9385a.intValue(), zBooleanValue);
            }
            throw C9756b.m18248g("index", "index", jsonReader);
        }
        Constructor<RequestTranslateSentence> declaredConstructor = this.f18201e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = RequestTranslateSentence.class.getDeclaredConstructor(String.class, Boolean.TYPE, cls, cls, C9756b.f49813c);
            this.f18201e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "RequestTranslateSentence…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        if (strMo9385a == null) {
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        objArr[0] = strMo9385a;
        objArr[1] = boolMo9385a;
        if (numMo9385a == null) {
            throw C9756b.m18248g("index", "index", jsonReader);
        }
        objArr[2] = Integer.valueOf(numMo9385a.intValue());
        objArr[3] = Integer.valueOf(i10);
        objArr[4] = null;
        RequestTranslateSentence requestTranslateSentenceNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(requestTranslateSentenceNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return requestTranslateSentenceNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestTranslateSentence requestTranslateSentence) throws IOException {
        RequestTranslateSentence requestTranslateSentence2 = requestTranslateSentence;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestTranslateSentence2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("language");
        this.f18198b.mo9386f(abstractC9310n, requestTranslateSentence2.f18194a);
        abstractC9310n.mo10551C("is_google_translate");
        this.f18199c.mo9386f(abstractC9310n, Boolean.valueOf(requestTranslateSentence2.f18195b));
        abstractC9310n.mo10551C("index");
        this.f18200d.mo9386f(abstractC9310n, Integer.valueOf(requestTranslateSentence2.f18196c));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(46, "GeneratedJsonAdapter(RequestTranslateSentence)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
