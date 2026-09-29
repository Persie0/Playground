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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultDictionariesForUserJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultDictionariesForUser;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultDictionariesForUserJsonAdapter extends AbstractC4949k<ResultDictionariesForUser> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18390a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<List<ResultDictionaryData>> f18391b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Map<String, List<ResultDictionaryData>>> f18392c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Map<String, String>> f18393d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<ResultDictionariesForUser> f18394e;

    public ResultDictionariesForUserJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18390a = JsonReader.C4932a.m10513a("userDicts", "availableDicts", "langs");
        C9756b.b bVarM17659d = C9312p.m17659d(List.class, ResultDictionaryData.class);
        EmptySet emptySet = EmptySet.f38034a;
        this.f18391b = c4955q.m10565c(bVarM17659d, emptySet, "activeDictionaries");
        this.f18392c = c4955q.m10565c(C9312p.m17659d(Map.class, String.class, C9312p.m17659d(List.class, ResultDictionaryData.class)), emptySet, "availableDictionaries");
        this.f18393d = c4955q.m10565c(C9312p.m17659d(Map.class, String.class, String.class), emptySet, "dictionaryLanguages");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultDictionariesForUser mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        List<ResultDictionaryData> listMo9385a = null;
        Map<String, List<ResultDictionaryData>> mapMo9385a = null;
        Map<String, String> mapMo9385a2 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18390a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                listMo9385a = this.f18391b.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("activeDictionaries", "userDicts", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                mapMo9385a = this.f18392c.mo9385a(jsonReader);
                if (mapMo9385a == null) {
                    throw C9756b.m18254m("availableDictionaries", "availableDicts", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                mapMo9385a2 = this.f18393d.mo9385a(jsonReader);
                if (mapMo9385a2 == null) {
                    throw C9756b.m18254m("dictionaryLanguages", "langs", jsonReader);
                }
                i10 &= -5;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -8) {
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.network.result.ResultDictionaryData>");
            C5207g.m11109d(mapMo9385a, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.collections.List<com.lingq.shared.network.result.ResultDictionaryData>>");
            C5207g.m11109d(mapMo9385a2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
            return new ResultDictionariesForUser(listMo9385a, mapMo9385a, mapMo9385a2);
        }
        Constructor<ResultDictionariesForUser> declaredConstructor = this.f18394e;
        if (declaredConstructor == null) {
            declaredConstructor = ResultDictionariesForUser.class.getDeclaredConstructor(List.class, Map.class, Map.class, Integer.TYPE, C9756b.f49813c);
            this.f18394e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultDictionariesForUse…his.constructorRef = it }");
        }
        ResultDictionariesForUser resultDictionariesForUserNewInstance = declaredConstructor.newInstance(listMo9385a, mapMo9385a, mapMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(resultDictionariesForUserNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultDictionariesForUserNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultDictionariesForUser resultDictionariesForUser) throws IOException {
        ResultDictionariesForUser resultDictionariesForUser2 = resultDictionariesForUser;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultDictionariesForUser2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("userDicts");
        this.f18391b.mo9386f(abstractC9310n, resultDictionariesForUser2.f18387a);
        abstractC9310n.mo10551C("availableDicts");
        this.f18392c.mo9386f(abstractC9310n, resultDictionariesForUser2.f18388b);
        abstractC9310n.mo10551C("langs");
        this.f18393d.mo9386f(abstractC9310n, resultDictionariesForUser2.f18389c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(47, "GeneratedJsonAdapter(ResultDictionariesForUser)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
