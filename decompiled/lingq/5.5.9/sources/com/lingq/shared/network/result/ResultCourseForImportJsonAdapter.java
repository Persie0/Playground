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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultCourseForImportJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultCourseForImport;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultCourseForImportJsonAdapter extends AbstractC4949k<ResultCourseForImport> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18383a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18384b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18385c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<ResultCourseForImport> f18386d;

    public ResultCourseForImportJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18383a = JsonReader.C4932a.m10513a("id", "title");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18384b = c4955q.m10565c(cls, emptySet, "id");
        this.f18385c = c4955q.m10565c(String.class, emptySet, "title");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultCourseForImport mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        String strMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18383a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numM850i = this.f18384b.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("id", "id", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a = this.f18385c.mo9385a(jsonReader);
                i10 &= -3;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4) {
            return new ResultCourseForImport(strMo9385a, numM850i.intValue());
        }
        Constructor<ResultCourseForImport> declaredConstructor = this.f18386d;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultCourseForImport.class.getDeclaredConstructor(cls, String.class, cls, C9756b.f49813c);
            this.f18386d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultCourseForImport::c…his.constructorRef = it }");
        }
        ResultCourseForImport resultCourseForImportNewInstance = declaredConstructor.newInstance(numM850i, strMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(resultCourseForImportNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultCourseForImportNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultCourseForImport resultCourseForImport) throws IOException {
        ResultCourseForImport resultCourseForImport2 = resultCourseForImport;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultCourseForImport2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        this.f18384b.mo9386f(abstractC9310n, Integer.valueOf(resultCourseForImport2.f18381a));
        abstractC9310n.mo10551C("title");
        this.f18385c.mo9386f(abstractC9310n, resultCourseForImport2.f18382b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(43, "GeneratedJsonAdapter(ResultCourseForImport)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
