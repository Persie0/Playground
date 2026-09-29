package com.lingq.shared.network.requests;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestLessonUpdateStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestLessonUpdateStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestLessonUpdateStatsJsonAdapter extends AbstractC4949k<RequestLessonUpdateStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18117a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Double> f18118b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f18119c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<RequestLessonUpdateStats> f18120d;

    public RequestLessonUpdateStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18117a = JsonReader.C4932a.m10513a("readTimes", "listenTimes", "automatic");
        Class cls = Double.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18118b = c4955q.m10565c(cls, emptySet, "readTimes");
        this.f18119c = c4955q.m10565c(Boolean.TYPE, emptySet, "automatic");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestLessonUpdateStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Double dValueOf = Double.valueOf(0.0d);
        jsonReader.mo10504b();
        Double dMo9385a = dValueOf;
        Boolean boolMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18117a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                dValueOf = this.f18118b.mo9385a(jsonReader);
                if (dValueOf == null) {
                    throw C9756b.m18254m("readTimes", "readTimes", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                dMo9385a = this.f18118b.mo9385a(jsonReader);
                if (dMo9385a == null) {
                    throw C9756b.m18254m("listenTimes", "listenTimes", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2 && (boolMo9385a = this.f18119c.mo9385a(jsonReader)) == null) {
                throw C9756b.m18254m("automatic", "automatic", jsonReader);
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4) {
            double dDoubleValue = dValueOf.doubleValue();
            double dDoubleValue2 = dMo9385a.doubleValue();
            if (boolMo9385a != null) {
                return new RequestLessonUpdateStats(dDoubleValue, dDoubleValue2, boolMo9385a.booleanValue());
            }
            throw C9756b.m18248g("automatic", "automatic", jsonReader);
        }
        Constructor<RequestLessonUpdateStats> declaredConstructor = this.f18120d;
        if (declaredConstructor == null) {
            Class cls = Double.TYPE;
            declaredConstructor = RequestLessonUpdateStats.class.getDeclaredConstructor(cls, cls, Boolean.TYPE, Integer.TYPE, C9756b.f49813c);
            this.f18120d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "RequestLessonUpdateStats…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        objArr[0] = dValueOf;
        objArr[1] = dMo9385a;
        if (boolMo9385a == null) {
            throw C9756b.m18248g("automatic", "automatic", jsonReader);
        }
        objArr[2] = Boolean.valueOf(boolMo9385a.booleanValue());
        objArr[3] = Integer.valueOf(i10);
        objArr[4] = null;
        RequestLessonUpdateStats requestLessonUpdateStatsNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(requestLessonUpdateStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return requestLessonUpdateStatsNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestLessonUpdateStats requestLessonUpdateStats) throws IOException {
        RequestLessonUpdateStats requestLessonUpdateStats2 = requestLessonUpdateStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestLessonUpdateStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("readTimes");
        Double dValueOf = Double.valueOf(requestLessonUpdateStats2.f18114a);
        AbstractC4949k<Double> abstractC4949k = this.f18118b;
        abstractC4949k.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("listenTimes");
        C0204c.m859s(requestLessonUpdateStats2.f18115b, abstractC4949k, abstractC9310n, "automatic");
        this.f18119c.mo9386f(abstractC9310n, Boolean.valueOf(requestLessonUpdateStats2.f18116c));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(46, "GeneratedJsonAdapter(RequestLessonUpdateStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
