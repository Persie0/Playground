package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultVocabularyCourseJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultVocabularyCourse;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultVocabularyCourseJsonAdapter extends AbstractC4949k<ResultVocabularyCourse> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f19106a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f19107b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f19108c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f19109d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Double> f19110e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Double> f19111f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Boolean> f19112g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<String> f19113h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<List<String>> f19114i;

    /* JADX INFO: renamed from: j */
    public volatile Constructor<ResultVocabularyCourse> f19115j;

    public ResultVocabularyCourseJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f19106a = JsonReader.C4932a.m10513a("id", "type", "title", "description", "pos", "url", "imageUrl", "providerId", "providerName", "providerDescription", "originalImageUrl", "providerImageUrl", "sharedById", "sharedByName", "sharedByImageUrl", "sharedByRole", "level", "newWordsCount", "lessonsCount", "owner", "price", "cardsCount", "rosesCount", "difficulty", "completedRatio", "isAvailable", "myCourse", "ofQuery", "tags", "duration", "status");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f19107b = c4955q.m10565c(cls, emptySet, "id");
        this.f19108c = c4955q.m10565c(String.class, emptySet, "type");
        this.f19109d = c4955q.m10565c(Integer.class, emptySet, "providerId");
        this.f19110e = c4955q.m10565c(Double.TYPE, emptySet, "difficulty");
        this.f19111f = c4955q.m10565c(Double.class, emptySet, "completedRatio");
        this.f19112g = c4955q.m10565c(Boolean.TYPE, emptySet, "isAvailable");
        this.f19113h = c4955q.m10565c(String.class, emptySet, "ofQuery");
        this.f19114i = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultVocabularyCourse mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        int i11;
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Double dValueOf = Double.valueOf(0.0d);
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer num = numMo9385a;
        Integer num2 = num;
        Integer num3 = num2;
        Double d10 = dValueOf;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        int i12 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        Integer numMo9385a2 = null;
        String strMo9385a7 = null;
        String strMo9385a8 = null;
        String strMo9385a9 = null;
        String strMo9385a10 = null;
        String strMo9385a11 = null;
        String strMo9385a12 = null;
        String strMo9385a13 = null;
        String strMo9385a14 = null;
        String strMo9385a15 = null;
        String strMo9385a16 = null;
        Double dMo9385a = null;
        List<String> listMo9385a = null;
        Integer numMo9385a3 = null;
        String strMo9385a17 = null;
        Integer numMo9385a4 = num3;
        Integer numMo9385a5 = numMo9385a4;
        Integer num4 = numMo9385a5;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f19106a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f19107b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i12 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a2 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -3;
                    break;
                case 2:
                    strMo9385a3 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -5;
                    break;
                case 3:
                    strMo9385a4 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -9;
                    break;
                case 4:
                    numMo9385a4 = this.f19107b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("pos", "pos", jsonReader);
                    }
                    i12 &= -17;
                    break;
                    break;
                case 5:
                    strMo9385a5 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -33;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a6 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -65;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a2 = this.f19109d.mo9385a(jsonReader);
                    i12 &= -129;
                    break;
                case 8:
                    strMo9385a7 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -257;
                    break;
                case 9:
                    strMo9385a8 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -513;
                    break;
                case 10:
                    strMo9385a9 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -1025;
                    break;
                case 11:
                    strMo9385a10 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -2049;
                    break;
                case 12:
                    strMo9385a11 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -4097;
                    break;
                case 13:
                    strMo9385a12 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -8193;
                    break;
                case 14:
                    strMo9385a13 = this.f19108c.mo9385a(jsonReader);
                    i12 &= -16385;
                    break;
                case 15:
                    strMo9385a14 = this.f19108c.mo9385a(jsonReader);
                    i10 = -32769;
                    i12 &= i10;
                    break;
                case 16:
                    strMo9385a15 = this.f19108c.mo9385a(jsonReader);
                    i10 = -65537;
                    i12 &= i10;
                    break;
                case 17:
                    numMo9385a5 = this.f19107b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i10 = -131073;
                    i12 &= i10;
                    break;
                    break;
                case 18:
                    Integer numMo9385a6 = this.f19107b.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("lessonsCount", "lessonsCount", jsonReader);
                    }
                    i11 = -262145;
                    num4 = numMo9385a6;
                    i10 = i11;
                    i12 &= i10;
                    break;
                    break;
                case 19:
                    strMo9385a16 = this.f19108c.mo9385a(jsonReader);
                    i10 = -524289;
                    i12 &= i10;
                    break;
                case 20:
                    Integer numMo9385a7 = this.f19107b.mo9385a(jsonReader);
                    if (numMo9385a7 == null) {
                        throw C9756b.m18254m("price", "price", jsonReader);
                    }
                    i11 = -1048577;
                    num = numMo9385a7;
                    i10 = i11;
                    i12 &= i10;
                    break;
                    break;
                case 21:
                    Integer numMo9385a8 = this.f19107b.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i11 = -2097153;
                    num2 = numMo9385a8;
                    i10 = i11;
                    i12 &= i10;
                    break;
                    break;
                case 22:
                    Integer numMo9385a9 = this.f19107b.mo9385a(jsonReader);
                    if (numMo9385a9 == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i11 = -4194305;
                    num3 = numMo9385a9;
                    i10 = i11;
                    i12 &= i10;
                    break;
                    break;
                case 23:
                    Double dMo9385a2 = this.f19110e.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("difficulty", "difficulty", jsonReader);
                    }
                    i11 = -8388609;
                    d10 = dMo9385a2;
                    i10 = i11;
                    i12 &= i10;
                    break;
                    break;
                case 24:
                    dMo9385a = this.f19111f.mo9385a(jsonReader);
                    i10 = -16777217;
                    i12 &= i10;
                    break;
                case 25:
                    Boolean boolMo9385a = this.f19112g.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isAvailable", "isAvailable", jsonReader);
                    }
                    i11 = -33554433;
                    bool2 = boolMo9385a;
                    i10 = i11;
                    i12 &= i10;
                    break;
                    break;
                case 26:
                    Boolean boolMo9385a2 = this.f19112g.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("myCourse", "myCourse", jsonReader);
                    }
                    i11 = -67108865;
                    bool3 = boolMo9385a2;
                    i10 = i11;
                    i12 &= i10;
                    break;
                    break;
                case 27:
                    strMo9385a = this.f19113h.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("ofQuery", "ofQuery", jsonReader);
                    }
                    i10 = -134217729;
                    i12 &= i10;
                    break;
                    break;
                case 28:
                    listMo9385a = this.f19114i.mo9385a(jsonReader);
                    i10 = -268435457;
                    i12 &= i10;
                    break;
                case 29:
                    numMo9385a3 = this.f19109d.mo9385a(jsonReader);
                    i10 = -536870913;
                    i12 &= i10;
                    break;
                case 30:
                    strMo9385a17 = this.f19108c.mo9385a(jsonReader);
                    i10 = -1073741825;
                    i12 &= i10;
                    break;
                default:
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i12 != Integer.MIN_VALUE) {
            String str = strMo9385a;
            Constructor<ResultVocabularyCourse> declaredConstructor = this.f19115j;
            if (declaredConstructor == null) {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                declaredConstructor = ResultVocabularyCourse.class.getDeclaredConstructor(cls, String.class, String.class, String.class, cls, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls, String.class, cls, cls, cls, Double.TYPE, Double.class, cls2, cls2, String.class, List.class, Integer.class, String.class, cls, C9756b.f49813c);
                this.f19115j = declaredConstructor;
                C5207g.m11110e(declaredConstructor, "ResultVocabularyCourse::…his.constructorRef = it }");
            }
            ResultVocabularyCourse resultVocabularyCourseNewInstance = declaredConstructor.newInstance(numMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, numMo9385a4, strMo9385a5, strMo9385a6, numMo9385a2, strMo9385a7, strMo9385a8, strMo9385a9, strMo9385a10, strMo9385a11, strMo9385a12, strMo9385a13, strMo9385a14, strMo9385a15, numMo9385a5, num4, strMo9385a16, num, num2, num3, d10, dMo9385a, bool2, bool3, str, listMo9385a, numMo9385a3, strMo9385a17, Integer.valueOf(i12), null);
            C5207g.m11110e(resultVocabularyCourseNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return resultVocabularyCourseNewInstance;
        }
        String str2 = strMo9385a;
        int iIntValue = numMo9385a.intValue();
        int iIntValue2 = numMo9385a4.intValue();
        int iIntValue3 = numMo9385a5.intValue();
        int iIntValue4 = num4.intValue();
        int iIntValue5 = num.intValue();
        int iIntValue6 = num2.intValue();
        int iIntValue7 = num3.intValue();
        double dDoubleValue = d10.doubleValue();
        boolean zBooleanValue = bool2.booleanValue();
        boolean zBooleanValue2 = bool3.booleanValue();
        C5207g.m11109d(str2, "null cannot be cast to non-null type kotlin.String");
        return new ResultVocabularyCourse(iIntValue, strMo9385a2, strMo9385a3, strMo9385a4, iIntValue2, strMo9385a5, strMo9385a6, numMo9385a2, strMo9385a7, strMo9385a8, strMo9385a9, strMo9385a10, strMo9385a11, strMo9385a12, strMo9385a13, strMo9385a14, strMo9385a15, iIntValue3, iIntValue4, strMo9385a16, iIntValue5, iIntValue6, iIntValue7, dDoubleValue, dMo9385a, zBooleanValue, zBooleanValue2, str2, listMo9385a, numMo9385a3, strMo9385a17);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultVocabularyCourse resultVocabularyCourse) throws IOException {
        ResultVocabularyCourse resultVocabularyCourse2 = resultVocabularyCourse;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultVocabularyCourse2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(resultVocabularyCourse2.f19080a);
        AbstractC4949k<Integer> abstractC4949k = this.f19107b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("type");
        String str = resultVocabularyCourse2.f19081b;
        AbstractC4949k<String> abstractC4949k2 = this.f19108c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("title");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19082c);
        abstractC9310n.mo10551C("description");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19083d);
        abstractC9310n.mo10551C("pos");
        C0166e.m775v(resultVocabularyCourse2.f19084e, abstractC4949k, abstractC9310n, "url");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19085f);
        abstractC9310n.mo10551C("imageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19086g);
        abstractC9310n.mo10551C("providerId");
        Integer num = resultVocabularyCourse2.f19087h;
        AbstractC4949k<Integer> abstractC4949k3 = this.f19109d;
        abstractC4949k3.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("providerName");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19088i);
        abstractC9310n.mo10551C("providerDescription");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19089j);
        abstractC9310n.mo10551C("originalImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19090k);
        abstractC9310n.mo10551C("providerImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19091l);
        abstractC9310n.mo10551C("sharedById");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19092m);
        abstractC9310n.mo10551C("sharedByName");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19093n);
        abstractC9310n.mo10551C("sharedByImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19094o);
        abstractC9310n.mo10551C("sharedByRole");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19095p);
        abstractC9310n.mo10551C("level");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19096q);
        abstractC9310n.mo10551C("newWordsCount");
        C0166e.m775v(resultVocabularyCourse2.f19097r, abstractC4949k, abstractC9310n, "lessonsCount");
        C0166e.m775v(resultVocabularyCourse2.f19098s, abstractC4949k, abstractC9310n, "owner");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19099t);
        abstractC9310n.mo10551C("price");
        C0166e.m775v(resultVocabularyCourse2.f19100u, abstractC4949k, abstractC9310n, "cardsCount");
        C0166e.m775v(resultVocabularyCourse2.f19101v, abstractC4949k, abstractC9310n, "rosesCount");
        C0166e.m775v(resultVocabularyCourse2.f19102w, abstractC4949k, abstractC9310n, "difficulty");
        this.f19110e.mo9386f(abstractC9310n, Double.valueOf(resultVocabularyCourse2.f19103x));
        abstractC9310n.mo10551C("completedRatio");
        this.f19111f.mo9386f(abstractC9310n, resultVocabularyCourse2.f19104y);
        abstractC9310n.mo10551C("isAvailable");
        Boolean boolValueOf = Boolean.valueOf(resultVocabularyCourse2.f19105z);
        AbstractC4949k<Boolean> abstractC4949k4 = this.f19112g;
        abstractC4949k4.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("myCourse");
        C0141b.m623s(resultVocabularyCourse2.f19075A, abstractC4949k4, abstractC9310n, "ofQuery");
        this.f19113h.mo9386f(abstractC9310n, resultVocabularyCourse2.f19076B);
        abstractC9310n.mo10551C("tags");
        this.f19114i.mo9386f(abstractC9310n, resultVocabularyCourse2.f19077C);
        abstractC9310n.mo10551C("duration");
        abstractC4949k3.mo9386f(abstractC9310n, resultVocabularyCourse2.f19078D);
        abstractC9310n.mo10551C("status");
        abstractC4949k2.mo9386f(abstractC9310n, resultVocabularyCourse2.f19079E);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(44, "GeneratedJsonAdapter(ResultVocabularyCourse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
