package com.lingq.shared.network.result;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultRegistrationErrorJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultRegistrationError;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultRegistrationErrorJsonAdapter extends AbstractC4949k<ResultRegistrationError> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18920a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<List<String>> f18921b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<ResultRegistrationError> f18922c;

    public ResultRegistrationErrorJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18920a = JsonReader.C4932a.m10513a("email", "username");
        this.f18921b = c4955q.m10565c(C9312p.m17659d(List.class, String.class), EmptySet.f38034a, "emailError");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultRegistrationError mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        List<String> listMo9385a = null;
        List<String> listMo9385a2 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18920a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                listMo9385a = this.f18921b.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("emailError", "email", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                listMo9385a2 = this.f18921b.mo9385a(jsonReader);
                if (listMo9385a2 == null) {
                    throw C9756b.m18254m("usernameError", "username", jsonReader);
                }
                i10 &= -3;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4) {
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            C5207g.m11109d(listMo9385a2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new ResultRegistrationError(listMo9385a, listMo9385a2);
        }
        Constructor<ResultRegistrationError> declaredConstructor = this.f18922c;
        if (declaredConstructor == null) {
            declaredConstructor = ResultRegistrationError.class.getDeclaredConstructor(List.class, List.class, Integer.TYPE, C9756b.f49813c);
            this.f18922c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultRegistrationError:…his.constructorRef = it }");
        }
        ResultRegistrationError resultRegistrationErrorNewInstance = declaredConstructor.newInstance(listMo9385a, listMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(resultRegistrationErrorNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultRegistrationErrorNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultRegistrationError resultRegistrationError) throws IOException {
        ResultRegistrationError resultRegistrationError2 = resultRegistrationError;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultRegistrationError2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("email");
        List<String> list = resultRegistrationError2.f18918a;
        AbstractC4949k<List<String>> abstractC4949k = this.f18921b;
        abstractC4949k.mo9386f(abstractC9310n, list);
        abstractC9310n.mo10551C("username");
        abstractC4949k.mo9386f(abstractC9310n, resultRegistrationError2.f18919b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(45, "GeneratedJsonAdapter(ResultRegistrationError)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
