package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLanguageProgressJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultLanguageProgress;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultLanguageProgressJsonAdapter extends AbstractC4949k<ResultLanguageProgress> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18489a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18490b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Double> f18491c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<List<String>> f18492d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<ResultLanguageProgress> f18493e;

    public ResultLanguageProgressJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18489a = JsonReader.C4932a.m10513a("writtenWordsGoal", "speakingTimeGoal", "totalWordsKnown", "readWords", "totalCards", "activityIndex", "knownWordsGoal", "listeningTimeGoal", "speakingTime", "cardsCreatedGoal", "knownWords", "intervals", "cardsCreated", "readWordsGoal", "listeningTime", "cardsLearned", "writtenWords", "cardsLearnedGoal");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18490b = c4955q.m10565c(cls, emptySet, "writtenWordsGoal");
        this.f18491c = c4955q.m10565c(Double.TYPE, emptySet, "speakingTimeGoal");
        this.f18492d = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "intervals");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultLanguageProgress mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        C5207g.m11111f(jsonReader, "reader");
        Integer num = 0;
        Double dValueOf = Double.valueOf(0.0d);
        jsonReader.mo10504b();
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Integer num5 = num4;
        Integer num6 = num5;
        Integer num7 = num6;
        Integer numMo9385a = num7;
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        Double d10 = dValueOf;
        Double d11 = d10;
        Double d12 = d11;
        Double d13 = d12;
        Double d14 = d13;
        int i11 = -1;
        List<String> listMo9385a = null;
        Integer num8 = numMo9385a3;
        Integer num9 = num8;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f18489a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    continue;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    Integer numMo9385a4 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("writtenWordsGoal", "writtenWordsGoal", jsonReader);
                    }
                    i11 &= -2;
                    num = numMo9385a4;
                    continue;
                    break;
                case 1:
                    Double dMo9385a = this.f18491c.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("speakingTimeGoal", "speakingTimeGoal", jsonReader);
                    }
                    i11 &= -3;
                    d10 = dMo9385a;
                    continue;
                    break;
                case 2:
                    Integer numMo9385a5 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("totalWordsKnown", "totalWordsKnown", jsonReader);
                    }
                    i11 &= -5;
                    num8 = numMo9385a5;
                    continue;
                    break;
                case 3:
                    Double dMo9385a2 = this.f18491c.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("readWords", "readWords", jsonReader);
                    }
                    i11 &= -9;
                    d11 = dMo9385a2;
                    continue;
                    break;
                case 4:
                    Integer numMo9385a6 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("totalCards", "totalCards", jsonReader);
                    }
                    i11 &= -17;
                    num9 = numMo9385a6;
                    continue;
                    break;
                case 5:
                    Integer numMo9385a7 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a7 == null) {
                        throw C9756b.m18254m("activityIndex", "activityIndex", jsonReader);
                    }
                    i11 &= -33;
                    num2 = numMo9385a7;
                    continue;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    Integer numMo9385a8 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("knownWordsGoal", "knownWordsGoal", jsonReader);
                    }
                    i11 &= -65;
                    num3 = numMo9385a8;
                    continue;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    Double dMo9385a3 = this.f18491c.mo9385a(jsonReader);
                    if (dMo9385a3 == null) {
                        throw C9756b.m18254m("listeningTimeGoal", "listeningTimeGoal", jsonReader);
                    }
                    i11 &= -129;
                    d12 = dMo9385a3;
                    continue;
                    break;
                case 8:
                    Double dMo9385a4 = this.f18491c.mo9385a(jsonReader);
                    if (dMo9385a4 == null) {
                        throw C9756b.m18254m("speakingTime", "speakingTime", jsonReader);
                    }
                    i11 &= -257;
                    d13 = dMo9385a4;
                    continue;
                    break;
                case 9:
                    Integer numMo9385a9 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a9 == null) {
                        throw C9756b.m18254m("cardsCreatedGoal", "cardsCreatedGoal", jsonReader);
                    }
                    i11 &= -513;
                    num4 = numMo9385a9;
                    continue;
                    break;
                case 10:
                    Integer numMo9385a10 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a10 == null) {
                        throw C9756b.m18254m("knownWords", "knownWords", jsonReader);
                    }
                    i11 &= -1025;
                    num5 = numMo9385a10;
                    continue;
                    break;
                case 11:
                    listMo9385a = this.f18492d.mo9385a(jsonReader);
                    continue;
                case 12:
                    Integer numMo9385a11 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a11 == null) {
                        throw C9756b.m18254m("cardsCreated", "cardsCreated", jsonReader);
                    }
                    i11 &= -4097;
                    num6 = numMo9385a11;
                    continue;
                    break;
                case 13:
                    Integer numMo9385a12 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a12 == null) {
                        throw C9756b.m18254m("readWordsGoal", "readWordsGoal", jsonReader);
                    }
                    i11 &= -8193;
                    num7 = numMo9385a12;
                    continue;
                    break;
                case 14:
                    Double dMo9385a5 = this.f18491c.mo9385a(jsonReader);
                    if (dMo9385a5 == null) {
                        throw C9756b.m18254m("listeningTime", "listeningTime", jsonReader);
                    }
                    i11 &= -16385;
                    d14 = dMo9385a5;
                    continue;
                    break;
                case 15:
                    numMo9385a = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("cardsLearned", "cardsLearned", jsonReader);
                    }
                    i10 = -32769;
                    break;
                    break;
                case 16:
                    numMo9385a2 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("writtenWords", "writtenWords", jsonReader);
                    }
                    i10 = -65537;
                    break;
                    break;
                case 17:
                    numMo9385a3 = this.f18490b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("cardsLearnedGoal", "cardsLearnedGoal", jsonReader);
                    }
                    i10 = -131073;
                    break;
                    break;
                default:
                    continue;
            }
            i11 = i10 & i11;
        }
        jsonReader.mo10508q();
        if (i11 == -260096) {
            return new ResultLanguageProgress(num.intValue(), d10.doubleValue(), num8.intValue(), d11.doubleValue(), num9.intValue(), num2.intValue(), num3.intValue(), d12.doubleValue(), d13.doubleValue(), num4.intValue(), num5.intValue(), listMo9385a, num6.intValue(), num7.intValue(), d14.doubleValue(), numMo9385a.intValue(), numMo9385a2.intValue(), numMo9385a3.intValue());
        }
        Constructor<ResultLanguageProgress> declaredConstructor = this.f18493e;
        int i12 = 20;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Double.TYPE;
            declaredConstructor = ResultLanguageProgress.class.getDeclaredConstructor(cls, cls2, cls, cls2, cls, cls, cls, cls2, cls2, cls, cls, List.class, cls, cls, cls2, cls, cls, cls, cls, C9756b.f49813c);
            this.f18493e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultLanguageProgress::…his.constructorRef = it }");
            i12 = 20;
        }
        Object[] objArr = new Object[i12];
        objArr[0] = num;
        objArr[1] = d10;
        objArr[2] = num8;
        objArr[3] = d11;
        objArr[4] = num9;
        objArr[5] = num2;
        objArr[6] = num3;
        objArr[7] = d12;
        objArr[8] = d13;
        objArr[9] = num4;
        objArr[10] = num5;
        objArr[11] = listMo9385a;
        objArr[12] = num6;
        objArr[13] = num7;
        objArr[14] = d14;
        objArr[15] = numMo9385a;
        objArr[16] = numMo9385a2;
        objArr[17] = numMo9385a3;
        objArr[18] = Integer.valueOf(i11);
        objArr[19] = null;
        ResultLanguageProgress resultLanguageProgressNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultLanguageProgressNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultLanguageProgressNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultLanguageProgress resultLanguageProgress) throws IOException {
        ResultLanguageProgress resultLanguageProgress2 = resultLanguageProgress;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultLanguageProgress2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("writtenWordsGoal");
        Integer numValueOf = Integer.valueOf(resultLanguageProgress2.f18465a);
        AbstractC4949k<Integer> abstractC4949k = this.f18490b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("speakingTimeGoal");
        Double dValueOf = Double.valueOf(resultLanguageProgress2.f18466b);
        AbstractC4949k<Double> abstractC4949k2 = this.f18491c;
        abstractC4949k2.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("totalWordsKnown");
        C0166e.m775v(resultLanguageProgress2.f18467c, abstractC4949k, abstractC9310n, "readWords");
        C0204c.m859s(resultLanguageProgress2.f18468d, abstractC4949k2, abstractC9310n, "totalCards");
        C0166e.m775v(resultLanguageProgress2.f18469e, abstractC4949k, abstractC9310n, "activityIndex");
        C0166e.m775v(resultLanguageProgress2.f18470f, abstractC4949k, abstractC9310n, "knownWordsGoal");
        C0166e.m775v(resultLanguageProgress2.f18471g, abstractC4949k, abstractC9310n, "listeningTimeGoal");
        C0204c.m859s(resultLanguageProgress2.f18472h, abstractC4949k2, abstractC9310n, "speakingTime");
        C0204c.m859s(resultLanguageProgress2.f18473i, abstractC4949k2, abstractC9310n, "cardsCreatedGoal");
        C0166e.m775v(resultLanguageProgress2.f18474j, abstractC4949k, abstractC9310n, "knownWords");
        C0166e.m775v(resultLanguageProgress2.f18475k, abstractC4949k, abstractC9310n, "intervals");
        this.f18492d.mo9386f(abstractC9310n, resultLanguageProgress2.f18476l);
        abstractC9310n.mo10551C("cardsCreated");
        C0166e.m775v(resultLanguageProgress2.f18477m, abstractC4949k, abstractC9310n, "readWordsGoal");
        C0166e.m775v(resultLanguageProgress2.f18478n, abstractC4949k, abstractC9310n, "listeningTime");
        C0204c.m859s(resultLanguageProgress2.f18479o, abstractC4949k2, abstractC9310n, "cardsLearned");
        C0166e.m775v(resultLanguageProgress2.f18480p, abstractC4949k, abstractC9310n, "writtenWords");
        C0166e.m775v(resultLanguageProgress2.f18481q, abstractC4949k, abstractC9310n, "cardsLearnedGoal");
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(resultLanguageProgress2.f18482r));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(44, "GeneratedJsonAdapter(ResultLanguageProgress)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
