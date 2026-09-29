package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LanguageProgressJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LanguageProgress;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageProgressJsonAdapter extends AbstractC4949k<LanguageProgress> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17061a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17062b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17063c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Double> f17064d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<String>> f17065e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<LanguageProgress> f17066f;

    public LanguageProgressJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17061a = JsonReader.C4932a.m10513a("interval", "languageCode", "writtenWordsGoal", "speakingTimeGoal", "totalWordsKnown", "readWords", "totalCards", "activityIndex", "knownWordsGoal", "listeningTimeGoal", "speakingTime", "cardsCreatedGoal", "knownWords", "intervals", "cardsCreated", "readWordsGoal", "listeningTime", "cardsLearned", "writtenWords", "cardsLearnedGoal");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17062b = c4955q.m10565c(String.class, emptySet, "interval");
        this.f17063c = c4955q.m10565c(Integer.TYPE, emptySet, "writtenWordsGoal");
        this.f17064d = c4955q.m10565c(Double.TYPE, emptySet, "speakingTimeGoal");
        this.f17065e = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "intervals");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LanguageProgress mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        int i11;
        C5207g.m11111f(jsonReader, "reader");
        Integer num = 0;
        Double dValueOf = Double.valueOf(0.0d);
        jsonReader.mo10504b();
        Integer numMo9385a = num;
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        Integer numMo9385a4 = numMo9385a3;
        Integer numMo9385a5 = numMo9385a4;
        Integer numMo9385a6 = numMo9385a5;
        Integer numMo9385a7 = numMo9385a6;
        Integer numMo9385a8 = numMo9385a7;
        Integer numMo9385a9 = numMo9385a8;
        Double dMo9385a = dValueOf;
        Double dMo9385a2 = dMo9385a;
        Double dMo9385a3 = dMo9385a2;
        Double dMo9385a4 = dMo9385a3;
        Double dMo9385a5 = dMo9385a4;
        int i12 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<String> listMo9385a = null;
        Integer numMo9385a10 = numMo9385a9;
        Integer numMo9385a11 = numMo9385a10;
        while (true) {
            Integer num2 = num;
            if (!jsonReader.mo10511w()) {
                Integer num3 = numMo9385a10;
                jsonReader.mo10508q();
                if (i12 == -1040381) {
                    if (strMo9385a == null) {
                        throw C9756b.m18248g("interval", "interval", jsonReader);
                    }
                    if (strMo9385a2 != null) {
                        return new LanguageProgress(strMo9385a, strMo9385a2, numMo9385a11.intValue(), dMo9385a.doubleValue(), numMo9385a.intValue(), dMo9385a2.doubleValue(), numMo9385a2.intValue(), numMo9385a3.intValue(), numMo9385a4.intValue(), dMo9385a3.doubleValue(), dMo9385a4.doubleValue(), numMo9385a5.intValue(), numMo9385a6.intValue(), listMo9385a, numMo9385a7.intValue(), numMo9385a8.intValue(), dMo9385a5.doubleValue(), numMo9385a9.intValue(), num3.intValue(), num2.intValue());
                    }
                    throw C9756b.m18248g("languageCode", "languageCode", jsonReader);
                }
                Constructor<LanguageProgress> declaredConstructor = this.f17066f;
                int i13 = 22;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    Class cls2 = Double.TYPE;
                    declaredConstructor = LanguageProgress.class.getDeclaredConstructor(String.class, String.class, cls, cls2, cls, cls2, cls, cls, cls, cls2, cls2, cls, cls, List.class, cls, cls, cls2, cls, cls, cls, cls, C9756b.f49813c);
                    this.f17066f = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "LanguageProgress::class.…his.constructorRef = it }");
                    i13 = 22;
                }
                Object[] objArr = new Object[i13];
                if (strMo9385a == null) {
                    throw C9756b.m18248g("interval", "interval", jsonReader);
                }
                objArr[0] = strMo9385a;
                if (strMo9385a2 == null) {
                    throw C9756b.m18248g("languageCode", "languageCode", jsonReader);
                }
                objArr[1] = strMo9385a2;
                objArr[2] = numMo9385a11;
                objArr[3] = dMo9385a;
                objArr[4] = numMo9385a;
                objArr[5] = dMo9385a2;
                objArr[6] = numMo9385a2;
                objArr[7] = numMo9385a3;
                objArr[8] = numMo9385a4;
                objArr[9] = dMo9385a3;
                objArr[10] = dMo9385a4;
                objArr[11] = numMo9385a5;
                objArr[12] = numMo9385a6;
                objArr[13] = listMo9385a;
                objArr[14] = numMo9385a7;
                objArr[15] = numMo9385a8;
                objArr[16] = dMo9385a5;
                objArr[17] = numMo9385a9;
                objArr[18] = num3;
                objArr[19] = num2;
                objArr[20] = Integer.valueOf(i12);
                objArr[21] = null;
                LanguageProgress languageProgressNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(languageProgressNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return languageProgressNewInstance;
            }
            Integer num4 = numMo9385a10;
            switch (jsonReader.mo10512y0(this.f17061a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f17062b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("interval", "interval", jsonReader);
                    }
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                case 1:
                    strMo9385a2 = this.f17062b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("languageCode", "languageCode", jsonReader);
                    }
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                case 2:
                    numMo9385a11 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a11 == null) {
                        throw C9756b.m18254m("writtenWordsGoal", "writtenWordsGoal", jsonReader);
                    }
                    i12 &= -5;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 3:
                    dMo9385a = this.f17064d.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("speakingTimeGoal", "speakingTimeGoal", jsonReader);
                    }
                    i12 &= -9;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 4:
                    numMo9385a = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("totalWordsKnown", "totalWordsKnown", jsonReader);
                    }
                    i12 &= -17;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 5:
                    dMo9385a2 = this.f17064d.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("readWords", "readWords", jsonReader);
                    }
                    i12 &= -33;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a2 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("totalCards", "totalCards", jsonReader);
                    }
                    i12 &= -65;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a3 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("activityIndex", "activityIndex", jsonReader);
                    }
                    i12 &= -129;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 8:
                    numMo9385a4 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("knownWordsGoal", "knownWordsGoal", jsonReader);
                    }
                    i12 &= -257;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 9:
                    dMo9385a3 = this.f17064d.mo9385a(jsonReader);
                    if (dMo9385a3 == null) {
                        throw C9756b.m18254m("listeningTimeGoal", "listeningTimeGoal", jsonReader);
                    }
                    i12 &= -513;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 10:
                    dMo9385a4 = this.f17064d.mo9385a(jsonReader);
                    if (dMo9385a4 == null) {
                        throw C9756b.m18254m("speakingTime", "speakingTime", jsonReader);
                    }
                    i12 &= -1025;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 11:
                    numMo9385a5 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("cardsCreatedGoal", "cardsCreatedGoal", jsonReader);
                    }
                    i12 &= -2049;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 12:
                    numMo9385a6 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("knownWords", "knownWords", jsonReader);
                    }
                    i12 &= -4097;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 13:
                    listMo9385a = this.f17065e.mo9385a(jsonReader);
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                case 14:
                    numMo9385a7 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a7 == null) {
                        throw C9756b.m18254m("cardsCreated", "cardsCreated", jsonReader);
                    }
                    i12 &= -16385;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 15:
                    numMo9385a8 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("readWordsGoal", "readWordsGoal", jsonReader);
                    }
                    i11 = -32769;
                    i12 &= i11;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 16:
                    dMo9385a5 = this.f17064d.mo9385a(jsonReader);
                    if (dMo9385a5 == null) {
                        throw C9756b.m18254m("listeningTime", "listeningTime", jsonReader);
                    }
                    i11 = -65537;
                    i12 &= i11;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 17:
                    numMo9385a9 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a9 == null) {
                        throw C9756b.m18254m("cardsLearned", "cardsLearned", jsonReader);
                    }
                    i11 = -131073;
                    i12 &= i11;
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 18:
                    numMo9385a10 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a10 == null) {
                        throw C9756b.m18254m("writtenWords", "writtenWords", jsonReader);
                    }
                    i10 = (-262145) & i12;
                    i12 = i10;
                    num = num2;
                    break;
                    break;
                case 19:
                    Integer numMo9385a12 = this.f17063c.mo9385a(jsonReader);
                    if (numMo9385a12 == null) {
                        throw C9756b.m18254m("cardsLearnedGoal", "cardsLearnedGoal", jsonReader);
                    }
                    i12 = (-524289) & i12;
                    numMo9385a10 = num4;
                    num = numMo9385a12;
                    break;
                    break;
                default:
                    i10 = i12;
                    numMo9385a10 = num4;
                    i12 = i10;
                    num = num2;
                    break;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LanguageProgress languageProgress) throws IOException {
        LanguageProgress languageProgress2 = languageProgress;
        C5207g.m11111f(abstractC9310n, "writer");
        if (languageProgress2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("interval");
        String str = languageProgress2.f17030a;
        AbstractC4949k<String> abstractC4949k = this.f17062b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("languageCode");
        abstractC4949k.mo9386f(abstractC9310n, languageProgress2.f17031b);
        abstractC9310n.mo10551C("writtenWordsGoal");
        Integer numValueOf = Integer.valueOf(languageProgress2.f17032c);
        AbstractC4949k<Integer> abstractC4949k2 = this.f17063c;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("speakingTimeGoal");
        Double dValueOf = Double.valueOf(languageProgress2.f17033d);
        AbstractC4949k<Double> abstractC4949k3 = this.f17064d;
        abstractC4949k3.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("totalWordsKnown");
        C0166e.m775v(languageProgress2.f17034e, abstractC4949k2, abstractC9310n, "readWords");
        C0204c.m859s(languageProgress2.f17035f, abstractC4949k3, abstractC9310n, "totalCards");
        C0166e.m775v(languageProgress2.f17036g, abstractC4949k2, abstractC9310n, "activityIndex");
        C0166e.m775v(languageProgress2.f17037h, abstractC4949k2, abstractC9310n, "knownWordsGoal");
        C0166e.m775v(languageProgress2.f17038i, abstractC4949k2, abstractC9310n, "listeningTimeGoal");
        C0204c.m859s(languageProgress2.f17039j, abstractC4949k3, abstractC9310n, "speakingTime");
        C0204c.m859s(languageProgress2.f17040k, abstractC4949k3, abstractC9310n, "cardsCreatedGoal");
        C0166e.m775v(languageProgress2.f17041l, abstractC4949k2, abstractC9310n, "knownWords");
        C0166e.m775v(languageProgress2.f17042m, abstractC4949k2, abstractC9310n, "intervals");
        this.f17065e.mo9386f(abstractC9310n, languageProgress2.f17043n);
        abstractC9310n.mo10551C("cardsCreated");
        C0166e.m775v(languageProgress2.f17044o, abstractC4949k2, abstractC9310n, "readWordsGoal");
        C0166e.m775v(languageProgress2.f17045p, abstractC4949k2, abstractC9310n, "listeningTime");
        C0204c.m859s(languageProgress2.f17046q, abstractC4949k3, abstractC9310n, "cardsLearned");
        C0166e.m775v(languageProgress2.f17047r, abstractC4949k2, abstractC9310n, "writtenWords");
        C0166e.m775v(languageProgress2.f17048s, abstractC4949k2, abstractC9310n, "cardsLearnedGoal");
        abstractC4949k2.mo9386f(abstractC9310n, Integer.valueOf(languageProgress2.f17049t));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(LanguageProgress)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
