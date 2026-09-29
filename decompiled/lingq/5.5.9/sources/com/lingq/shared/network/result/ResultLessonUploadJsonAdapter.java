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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLessonUploadJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultLessonUpload;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultLessonUploadJsonAdapter extends AbstractC4949k<ResultLessonUpload> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18662a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18663b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18664c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f18665d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<ResultLessonUpload> f18666e;

    public ResultLessonUploadJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18662a = JsonReader.C4932a.m10513a("accent", "audio", "duration", "external_audio");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18663b = c4955q.m10565c(String.class, emptySet, "accent");
        this.f18664c = c4955q.m10565c(String.class, emptySet, "audio");
        this.f18665d = c4955q.m10565c(Integer.class, emptySet, "duration");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultLessonUpload mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        Integer numMo9385a = null;
        String strMo9385a3 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18662a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a2 = this.f18663b.mo9385a(jsonReader);
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a = this.f18664c.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("audio", "audio", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                numMo9385a = this.f18665d.mo9385a(jsonReader);
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                strMo9385a3 = this.f18663b.mo9385a(jsonReader);
                i10 &= -9;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -16) {
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            return new ResultLessonUpload(strMo9385a2, strMo9385a, numMo9385a, strMo9385a3);
        }
        Constructor<ResultLessonUpload> declaredConstructor = this.f18666e;
        if (declaredConstructor == null) {
            declaredConstructor = ResultLessonUpload.class.getDeclaredConstructor(String.class, String.class, Integer.class, String.class, Integer.TYPE, C9756b.f49813c);
            this.f18666e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultLessonUpload::clas…his.constructorRef = it }");
        }
        ResultLessonUpload resultLessonUploadNewInstance = declaredConstructor.newInstance(strMo9385a2, strMo9385a, numMo9385a, strMo9385a3, Integer.valueOf(i10), null);
        C5207g.m11110e(resultLessonUploadNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultLessonUploadNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultLessonUpload resultLessonUpload) throws IOException {
        ResultLessonUpload resultLessonUpload2 = resultLessonUpload;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultLessonUpload2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("accent");
        String str = resultLessonUpload2.f18658a;
        AbstractC4949k<String> abstractC4949k = this.f18663b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("audio");
        this.f18664c.mo9386f(abstractC9310n, resultLessonUpload2.f18659b);
        abstractC9310n.mo10551C("duration");
        this.f18665d.mo9386f(abstractC9310n, resultLessonUpload2.f18660c);
        abstractC9310n.mo10551C("external_audio");
        abstractC4949k.mo9386f(abstractC9310n, resultLessonUpload2.f18661d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(ResultLessonUpload)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
