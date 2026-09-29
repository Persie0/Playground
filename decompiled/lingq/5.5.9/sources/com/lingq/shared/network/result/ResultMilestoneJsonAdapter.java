package com.lingq.shared.network.result;

import androidx.activity.result.C0204c;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultMilestoneJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultMilestone;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultMilestoneJsonAdapter extends AbstractC4949k<ResultMilestone> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18771a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18772b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18773c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f18774d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<ResultMilestone> f18775e;

    public ResultMilestoneJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18771a = JsonReader.C4932a.m10513a("slug", "name", "goal", "stat");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18772b = c4955q.m10565c(String.class, emptySet, "slug");
        this.f18773c = c4955q.m10565c(String.class, emptySet, "name");
        this.f18774d = c4955q.m10565c(Integer.TYPE, emptySet, "goal");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultMilestone mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18771a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f18772b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("slug", "slug", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                strMo9385a2 = this.f18773c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 2) {
                numM850i = this.f18774d.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("goal", "goal", jsonReader);
                }
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                strMo9385a3 = this.f18773c.mo9385a(jsonReader);
            }
        }
        jsonReader.mo10508q();
        if (i10 == -5) {
            if (strMo9385a != null) {
                return new ResultMilestone(strMo9385a, numM850i.intValue(), strMo9385a2, strMo9385a3);
            }
            throw C9756b.m18248g("slug", "slug", jsonReader);
        }
        Constructor<ResultMilestone> declaredConstructor = this.f18775e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultMilestone.class.getDeclaredConstructor(String.class, String.class, cls, String.class, cls, C9756b.f49813c);
            this.f18775e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultMilestone::class.j…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (strMo9385a == null) {
            throw C9756b.m18248g("slug", "slug", jsonReader);
        }
        objArr[0] = strMo9385a;
        objArr[1] = strMo9385a2;
        objArr[2] = numM850i;
        objArr[3] = strMo9385a3;
        objArr[4] = Integer.valueOf(i10);
        objArr[5] = null;
        ResultMilestone resultMilestoneNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultMilestoneNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultMilestoneNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultMilestone resultMilestone) throws IOException {
        ResultMilestone resultMilestone2 = resultMilestone;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultMilestone2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("slug");
        this.f18772b.mo9386f(abstractC9310n, resultMilestone2.f18767a);
        abstractC9310n.mo10551C("name");
        String str = resultMilestone2.f18768b;
        AbstractC4949k<String> abstractC4949k = this.f18773c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("goal");
        this.f18774d.mo9386f(abstractC9310n, Integer.valueOf(resultMilestone2.f18769c));
        abstractC9310n.mo10551C("stat");
        abstractC4949k.mo9386f(abstractC9310n, resultMilestone2.f18770d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(37, "GeneratedJsonAdapter(ResultMilestone)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
