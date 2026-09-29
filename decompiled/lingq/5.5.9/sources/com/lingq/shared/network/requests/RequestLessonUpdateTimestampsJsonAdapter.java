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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestLessonUpdateTimestampsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestLessonUpdateTimestamps;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestLessonUpdateTimestampsJsonAdapter extends AbstractC4949k<RequestLessonUpdateTimestamps> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18123a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18124b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<Double>> f18125c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<RequestLessonUpdateTimestamps> f18126d;

    public RequestLessonUpdateTimestampsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18123a = JsonReader.C4932a.m10513a("index", "timestamp");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18124b = c4955q.m10565c(Integer.class, emptySet, "index");
        this.f18125c = c4955q.m10565c(C9312p.m17659d(List.class, Double.class), emptySet, "timestamp");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestLessonUpdateTimestamps mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        List<Double> listMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18123a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numMo9385a = this.f18124b.mo9385a(jsonReader);
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                listMo9385a = this.f18125c.mo9385a(jsonReader);
                i10 &= -3;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4) {
            return new RequestLessonUpdateTimestamps(numMo9385a, listMo9385a);
        }
        Constructor<RequestLessonUpdateTimestamps> declaredConstructor = this.f18126d;
        if (declaredConstructor == null) {
            declaredConstructor = RequestLessonUpdateTimestamps.class.getDeclaredConstructor(Integer.class, List.class, Integer.TYPE, C9756b.f49813c);
            this.f18126d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "RequestLessonUpdateTimes…his.constructorRef = it }");
        }
        RequestLessonUpdateTimestamps requestLessonUpdateTimestampsNewInstance = declaredConstructor.newInstance(numMo9385a, listMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(requestLessonUpdateTimestampsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return requestLessonUpdateTimestampsNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestLessonUpdateTimestamps requestLessonUpdateTimestamps) throws IOException {
        RequestLessonUpdateTimestamps requestLessonUpdateTimestamps2 = requestLessonUpdateTimestamps;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestLessonUpdateTimestamps2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("index");
        this.f18124b.mo9386f(abstractC9310n, requestLessonUpdateTimestamps2.f18121a);
        abstractC9310n.mo10551C("timestamp");
        this.f18125c.mo9386f(abstractC9310n, requestLessonUpdateTimestamps2.f18122b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(51, "GeneratedJsonAdapter(RequestLessonUpdateTimestamps)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
