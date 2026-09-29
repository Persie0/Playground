package com.lingq.shared.uimodel.language;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageProgressJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/language/UserLanguageProgress;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserLanguageProgressJsonAdapter extends AbstractC4949k<UserLanguageProgress> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21780a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f21781b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f21782c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Double> f21783d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<String>> f21784e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<UserLanguageProgress> f21785f;

    public UserLanguageProgressJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21780a = JsonReader.C4932a.m10513a("interval", "languageCode", "writtenWordsGoal", "speakingTimeGoal", "totalWordsKnown", "readWords", "totalCards", "activityIndex", "knownWordsGoal", "listeningTimeGoal", "speakingTime", "cardsCreatedGoal", "knownWords", "intervals", "cardsCreated", "readWordsGoal", "listeningTime", "cardsLearned", "writtenWords", "cardsLearnedGoal");
        EmptySet emptySet = EmptySet.f38034a;
        this.f21781b = c4955q.m10565c(String.class, emptySet, "interval");
        this.f21782c = c4955q.m10565c(Integer.TYPE, emptySet, "writtenWordsGoal");
        this.f21783d = c4955q.m10565c(Double.TYPE, emptySet, "speakingTimeGoal");
        this.f21784e = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "intervals");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final UserLanguageProgress mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        int i11;
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Double dValueOf = Double.valueOf(0.0d);
        jsonReader.mo10504b();
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        Integer numMo9385a4 = numMo9385a3;
        Integer numMo9385a5 = numMo9385a4;
        Integer numMo9385a6 = numMo9385a5;
        Integer numMo9385a7 = numMo9385a6;
        Integer numMo9385a8 = numMo9385a7;
        Integer numMo9385a9 = numMo9385a8;
        Integer numMo9385a10 = numMo9385a9;
        Double dMo9385a = dValueOf;
        Double dMo9385a2 = dMo9385a;
        Double dMo9385a3 = dMo9385a2;
        Double dMo9385a4 = dMo9385a3;
        Double dMo9385a5 = dMo9385a4;
        int i12 = -1;
        List<String> listMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        Integer numMo9385a11 = numMo9385a10;
        Integer num = numMo9385a11;
        while (true) {
            Integer num2 = numMo9385a;
            Integer num3 = numMo9385a11;
            if (!jsonReader.mo10511w()) {
                Integer num4 = num;
                jsonReader.mo10508q();
                if (i12 == -1048573) {
                    if (strMo9385a == null) {
                        throw C9756b.m18248g("interval", "interval", jsonReader);
                    }
                    if (strMo9385a2 == null) {
                        throw C9756b.m18248g("languageCode", "languageCode", jsonReader);
                    }
                    int iIntValue = numMo9385a2.intValue();
                    double dDoubleValue = dMo9385a.doubleValue();
                    int iIntValue2 = numMo9385a3.intValue();
                    double dDoubleValue2 = dMo9385a2.doubleValue();
                    int iIntValue3 = numMo9385a4.intValue();
                    int iIntValue4 = numMo9385a5.intValue();
                    int iIntValue5 = numMo9385a6.intValue();
                    double dDoubleValue3 = dMo9385a3.doubleValue();
                    double dDoubleValue4 = dMo9385a4.doubleValue();
                    int iIntValue6 = numMo9385a7.intValue();
                    int iIntValue7 = numMo9385a8.intValue();
                    C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    return new UserLanguageProgress(strMo9385a, strMo9385a2, iIntValue, dDoubleValue, iIntValue2, dDoubleValue2, iIntValue3, iIntValue4, iIntValue5, dDoubleValue3, dDoubleValue4, iIntValue6, iIntValue7, listMo9385a, numMo9385a9.intValue(), numMo9385a10.intValue(), dMo9385a5.doubleValue(), num4.intValue(), num3.intValue(), num2.intValue());
                }
                Constructor<UserLanguageProgress> declaredConstructor = this.f21785f;
                int i13 = 22;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    Class cls2 = Double.TYPE;
                    declaredConstructor = UserLanguageProgress.class.getDeclaredConstructor(String.class, String.class, cls, cls2, cls, cls2, cls, cls, cls, cls2, cls2, cls, cls, List.class, cls, cls, cls2, cls, cls, cls, cls, C9756b.f49813c);
                    this.f21785f = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "UserLanguageProgress::cl…his.constructorRef = it }");
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
                objArr[2] = numMo9385a2;
                objArr[3] = dMo9385a;
                objArr[4] = numMo9385a3;
                objArr[5] = dMo9385a2;
                objArr[6] = numMo9385a4;
                objArr[7] = numMo9385a5;
                objArr[8] = numMo9385a6;
                objArr[9] = dMo9385a3;
                objArr[10] = dMo9385a4;
                objArr[11] = numMo9385a7;
                objArr[12] = numMo9385a8;
                objArr[13] = listMo9385a;
                objArr[14] = numMo9385a9;
                objArr[15] = numMo9385a10;
                objArr[16] = dMo9385a5;
                objArr[17] = num4;
                objArr[18] = num3;
                objArr[19] = num2;
                objArr[20] = Integer.valueOf(i12);
                objArr[21] = null;
                UserLanguageProgress userLanguageProgressNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(userLanguageProgressNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return userLanguageProgressNewInstance;
            }
            Integer num5 = num;
            switch (jsonReader.mo10512y0(this.f21780a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f21781b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("interval", "interval", jsonReader);
                    }
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                case 1:
                    strMo9385a2 = this.f21781b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("languageCode", "languageCode", jsonReader);
                    }
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                case 2:
                    numMo9385a2 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("writtenWordsGoal", "writtenWordsGoal", jsonReader);
                    }
                    i12 &= -5;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 3:
                    dMo9385a = this.f21783d.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("speakingTimeGoal", "speakingTimeGoal", jsonReader);
                    }
                    i12 &= -9;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 4:
                    numMo9385a3 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("totalWordsKnown", "totalWordsKnown", jsonReader);
                    }
                    i12 &= -17;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 5:
                    dMo9385a2 = this.f21783d.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("readWords", "readWords", jsonReader);
                    }
                    i12 &= -33;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a4 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("totalCards", "totalCards", jsonReader);
                    }
                    i12 &= -65;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a5 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("activityIndex", "activityIndex", jsonReader);
                    }
                    i12 &= -129;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 8:
                    numMo9385a6 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("knownWordsGoal", "knownWordsGoal", jsonReader);
                    }
                    i12 &= -257;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 9:
                    dMo9385a3 = this.f21783d.mo9385a(jsonReader);
                    if (dMo9385a3 == null) {
                        throw C9756b.m18254m("listeningTimeGoal", "listeningTimeGoal", jsonReader);
                    }
                    i12 &= -513;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 10:
                    dMo9385a4 = this.f21783d.mo9385a(jsonReader);
                    if (dMo9385a4 == null) {
                        throw C9756b.m18254m("speakingTime", "speakingTime", jsonReader);
                    }
                    i12 &= -1025;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 11:
                    numMo9385a7 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a7 == null) {
                        throw C9756b.m18254m("cardsCreatedGoal", "cardsCreatedGoal", jsonReader);
                    }
                    i12 &= -2049;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 12:
                    numMo9385a8 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("knownWords", "knownWords", jsonReader);
                    }
                    i12 &= -4097;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 13:
                    listMo9385a = this.f21784e.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("intervals", "intervals", jsonReader);
                    }
                    i12 &= -8193;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 14:
                    numMo9385a9 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a9 == null) {
                        throw C9756b.m18254m("cardsCreated", "cardsCreated", jsonReader);
                    }
                    i12 &= -16385;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 15:
                    numMo9385a10 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a10 == null) {
                        throw C9756b.m18254m("readWordsGoal", "readWordsGoal", jsonReader);
                    }
                    i10 = -32769;
                    i12 &= i10;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 16:
                    dMo9385a5 = this.f21783d.mo9385a(jsonReader);
                    if (dMo9385a5 == null) {
                        throw C9756b.m18254m("listeningTime", "listeningTime", jsonReader);
                    }
                    i10 = -65537;
                    i12 &= i10;
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 17:
                    Integer numMo9385a12 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a12 == null) {
                        throw C9756b.m18254m("cardsLearned", "cardsLearned", jsonReader);
                    }
                    num = numMo9385a12;
                    i12 = (-131073) & i12;
                    numMo9385a = num2;
                    numMo9385a11 = num3;
                    break;
                    break;
                case 18:
                    numMo9385a11 = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a11 == null) {
                        throw C9756b.m18254m("writtenWords", "writtenWords", jsonReader);
                    }
                    i12 &= -262145;
                    numMo9385a = num2;
                    num = num5;
                    break;
                    break;
                case 19:
                    numMo9385a = this.f21782c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("cardsLearnedGoal", "cardsLearnedGoal", jsonReader);
                    }
                    i11 = (-524289) & i12;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
                    break;
                default:
                    i11 = i12;
                    numMo9385a = num2;
                    i12 = i11;
                    num = num5;
                    numMo9385a11 = num3;
                    break;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, UserLanguageProgress userLanguageProgress) throws IOException {
        UserLanguageProgress userLanguageProgress2 = userLanguageProgress;
        C5207g.m11111f(abstractC9310n, "writer");
        if (userLanguageProgress2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("interval");
        String str = userLanguageProgress2.f21752a;
        AbstractC4949k<String> abstractC4949k = this.f21781b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("languageCode");
        abstractC4949k.mo9386f(abstractC9310n, userLanguageProgress2.f21753b);
        abstractC9310n.mo10551C("writtenWordsGoal");
        Integer numValueOf = Integer.valueOf(userLanguageProgress2.f21754c);
        AbstractC4949k<Integer> abstractC4949k2 = this.f21782c;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("speakingTimeGoal");
        Double dValueOf = Double.valueOf(userLanguageProgress2.f21755d);
        AbstractC4949k<Double> abstractC4949k3 = this.f21783d;
        abstractC4949k3.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("totalWordsKnown");
        C0166e.m775v(userLanguageProgress2.f21756e, abstractC4949k2, abstractC9310n, "readWords");
        C0204c.m859s(userLanguageProgress2.f21757f, abstractC4949k3, abstractC9310n, "totalCards");
        C0166e.m775v(userLanguageProgress2.f21758g, abstractC4949k2, abstractC9310n, "activityIndex");
        C0166e.m775v(userLanguageProgress2.f21759h, abstractC4949k2, abstractC9310n, "knownWordsGoal");
        C0166e.m775v(userLanguageProgress2.f21760i, abstractC4949k2, abstractC9310n, "listeningTimeGoal");
        C0204c.m859s(userLanguageProgress2.f21761j, abstractC4949k3, abstractC9310n, "speakingTime");
        C0204c.m859s(userLanguageProgress2.f21762k, abstractC4949k3, abstractC9310n, "cardsCreatedGoal");
        C0166e.m775v(userLanguageProgress2.f21763l, abstractC4949k2, abstractC9310n, "knownWords");
        C0166e.m775v(userLanguageProgress2.f21764m, abstractC4949k2, abstractC9310n, "intervals");
        this.f21784e.mo9386f(abstractC9310n, userLanguageProgress2.f21765n);
        abstractC9310n.mo10551C("cardsCreated");
        C0166e.m775v(userLanguageProgress2.f21766o, abstractC4949k2, abstractC9310n, "readWordsGoal");
        C0166e.m775v(userLanguageProgress2.f21767p, abstractC4949k2, abstractC9310n, "listeningTime");
        C0204c.m859s(userLanguageProgress2.f21768q, abstractC4949k3, abstractC9310n, "cardsLearned");
        C0166e.m775v(userLanguageProgress2.f21769r, abstractC4949k2, abstractC9310n, "writtenWords");
        C0166e.m775v(userLanguageProgress2.f21770s, abstractC4949k2, abstractC9310n, "cardsLearnedGoal");
        abstractC4949k2.mo9386f(abstractC9310n, Integer.valueOf(userLanguageProgress2.f21771t));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(UserLanguageProgress)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
