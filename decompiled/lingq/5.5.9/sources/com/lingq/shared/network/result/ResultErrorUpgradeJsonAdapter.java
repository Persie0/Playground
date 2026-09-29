package com.lingq.shared.network.result;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultErrorUpgradeJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultErrorUpgrade;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultErrorUpgradeJsonAdapter extends AbstractC4949k<ResultErrorUpgrade> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18424a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18425b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<ResultErrorUpgrade> f18426c;

    public ResultErrorUpgradeJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18424a = JsonReader.C4932a.m10513a("detail");
        this.f18425b = c4955q.m10565c(String.class, EmptySet.f38034a, "detail");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultErrorUpgrade mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18424a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f18425b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("detail", "detail", jsonReader);
                }
                i10 &= -2;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -2) {
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            return new ResultErrorUpgrade(strMo9385a);
        }
        Constructor<ResultErrorUpgrade> declaredConstructor = this.f18426c;
        if (declaredConstructor == null) {
            declaredConstructor = ResultErrorUpgrade.class.getDeclaredConstructor(String.class, Integer.TYPE, C9756b.f49813c);
            this.f18426c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultErrorUpgrade::clas…his.constructorRef = it }");
        }
        ResultErrorUpgrade resultErrorUpgradeNewInstance = declaredConstructor.newInstance(strMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(resultErrorUpgradeNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultErrorUpgradeNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultErrorUpgrade resultErrorUpgrade) throws IOException {
        ResultErrorUpgrade resultErrorUpgrade2 = resultErrorUpgrade;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultErrorUpgrade2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("detail");
        this.f18425b.mo9386f(abstractC9310n, resultErrorUpgrade2.f18423a);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(ResultErrorUpgrade)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
