package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Meaning;
import com.lingq.entity.Readings;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultWordJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultWord;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultWordJsonAdapter extends AbstractC4949k<ResultWord> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f19125a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f19126b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f19127c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f19128d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<Meaning>> f19129e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<List<String>> f19130f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Readings> f19131g;

    /* JADX INFO: renamed from: h */
    public volatile Constructor<ResultWord> f19132h;

    public ResultWordJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f19125a = JsonReader.C4932a.m10513a("text", "id", "status", "importance", "isPhrase", "hints", "tags", "cardId", "readings");
        EmptySet emptySet = EmptySet.f38034a;
        this.f19126b = c4955q.m10565c(String.class, emptySet, "text");
        this.f19127c = c4955q.m10565c(Integer.TYPE, emptySet, "id");
        this.f19128d = c4955q.m10565c(Boolean.TYPE, emptySet, "isPhrase");
        this.f19129e = c4955q.m10565c(C9312p.m17659d(List.class, Meaning.class), emptySet, "meanings");
        this.f19130f = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f19131g = c4955q.m10565c(Readings.class, emptySet, "readings");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultWord mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a = bool;
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<Meaning> listMo9385a = null;
        List<String> listMo9385a2 = null;
        Readings readingsMo9385a = null;
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f19125a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f19126b.mo9385a(jsonReader);
                    break;
                case 1:
                    numMo9385a = this.f19127c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    strMo9385a2 = this.f19126b.mo9385a(jsonReader);
                    break;
                case 3:
                    numMo9385a2 = this.f19127c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("importance", "importance", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    boolMo9385a = this.f19128d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isPhrase", "isPhrase", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    listMo9385a = this.f19129e.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("meanings", "hints", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    listMo9385a2 = this.f19130f.mo9385a(jsonReader);
                    if (listMo9385a2 == null) {
                        throw C9756b.m18254m("tags", "tags", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a3 = this.f19127c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("cardId", "cardId", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
                case 8:
                    readingsMo9385a = this.f19131g.mo9385a(jsonReader);
                    i10 &= -257;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -507) {
            int iIntValue = numMo9385a.intValue();
            int iIntValue2 = numMo9385a2.intValue();
            boolean zBooleanValue = boolMo9385a.booleanValue();
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.Meaning?>");
            C5207g.m11109d(listMo9385a2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new ResultWord(strMo9385a, iIntValue, strMo9385a2, iIntValue2, zBooleanValue, listMo9385a, listMo9385a2, numMo9385a3.intValue(), readingsMo9385a);
        }
        List<Meaning> list = listMo9385a;
        List<String> list2 = listMo9385a2;
        Constructor<ResultWord> declaredConstructor = this.f19132h;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultWord.class.getDeclaredConstructor(String.class, cls, String.class, cls, Boolean.TYPE, List.class, List.class, cls, Readings.class, cls, C9756b.f49813c);
            this.f19132h = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultWord::class.java.g…his.constructorRef = it }");
        }
        ResultWord resultWordNewInstance = declaredConstructor.newInstance(strMo9385a, numMo9385a, strMo9385a2, numMo9385a2, boolMo9385a, list, list2, numMo9385a3, readingsMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(resultWordNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultWordNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultWord resultWord) throws IOException {
        ResultWord resultWord2 = resultWord;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultWord2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("text");
        String str = resultWord2.f19116a;
        AbstractC4949k<String> abstractC4949k = this.f19126b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(resultWord2.f19117b);
        AbstractC4949k<Integer> abstractC4949k2 = this.f19127c;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("status");
        abstractC4949k.mo9386f(abstractC9310n, resultWord2.f19118c);
        abstractC9310n.mo10551C("importance");
        C0166e.m775v(resultWord2.f19119d, abstractC4949k2, abstractC9310n, "isPhrase");
        this.f19128d.mo9386f(abstractC9310n, Boolean.valueOf(resultWord2.f19120e));
        abstractC9310n.mo10551C("hints");
        this.f19129e.mo9386f(abstractC9310n, resultWord2.f19121f);
        abstractC9310n.mo10551C("tags");
        this.f19130f.mo9386f(abstractC9310n, resultWord2.f19122g);
        abstractC9310n.mo10551C("cardId");
        C0166e.m775v(resultWord2.f19123h, abstractC4949k2, abstractC9310n, "readings");
        this.f19131g.mo9386f(abstractC9310n, resultWord2.f19124i);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(32, "GeneratedJsonAdapter(ResultWord)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
