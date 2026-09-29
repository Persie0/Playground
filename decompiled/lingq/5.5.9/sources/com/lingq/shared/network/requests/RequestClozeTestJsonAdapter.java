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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestClozeTestJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestClozeTest;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestClozeTestJsonAdapter extends AbstractC4949k<RequestClozeTest> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18041a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18042b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<SentenceFragment>> f18043c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<List<String>> f18044d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Boolean> f18045e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<RequestClozeTest> f18046f;

    public RequestClozeTestJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18041a = JsonReader.C4932a.m10513a("text", "fragments", "incorrect_answers", "found");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18042b = c4955q.m10565c(String.class, emptySet, "text");
        this.f18043c = c4955q.m10565c(C9312p.m17659d(List.class, SentenceFragment.class), emptySet, "fragments");
        this.f18044d = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "incorrectAnswers");
        this.f18045e = c4955q.m10565c(Boolean.TYPE, emptySet, "isFound");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestClozeTest mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        String strMo9385a = null;
        List<SentenceFragment> listMo9385a = null;
        List<String> listMo9385a2 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18041a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f18042b.mo9385a(jsonReader);
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                listMo9385a = this.f18043c.mo9385a(jsonReader);
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                listMo9385a2 = this.f18044d.mo9385a(jsonReader);
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                boolMo9385a = this.f18045e.mo9385a(jsonReader);
                if (boolMo9385a == null) {
                    throw C9756b.m18254m("isFound", "found", jsonReader);
                }
                i10 &= -9;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -16) {
            return new RequestClozeTest(strMo9385a, listMo9385a, listMo9385a2, boolMo9385a.booleanValue());
        }
        Constructor<RequestClozeTest> declaredConstructor = this.f18046f;
        if (declaredConstructor == null) {
            declaredConstructor = RequestClozeTest.class.getDeclaredConstructor(String.class, List.class, List.class, Boolean.TYPE, Integer.TYPE, C9756b.f49813c);
            this.f18046f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "RequestClozeTest::class.…his.constructorRef = it }");
        }
        RequestClozeTest requestClozeTestNewInstance = declaredConstructor.newInstance(strMo9385a, listMo9385a, listMo9385a2, boolMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(requestClozeTestNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return requestClozeTestNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestClozeTest requestClozeTest) throws IOException {
        RequestClozeTest requestClozeTest2 = requestClozeTest;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestClozeTest2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("text");
        this.f18042b.mo9386f(abstractC9310n, requestClozeTest2.f18037a);
        abstractC9310n.mo10551C("fragments");
        this.f18043c.mo9386f(abstractC9310n, requestClozeTest2.f18038b);
        abstractC9310n.mo10551C("incorrect_answers");
        this.f18044d.mo9386f(abstractC9310n, requestClozeTest2.f18039c);
        abstractC9310n.mo10551C("found");
        this.f18045e.mo9386f(abstractC9310n, Boolean.valueOf(requestClozeTest2.f18040d));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(RequestClozeTest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
