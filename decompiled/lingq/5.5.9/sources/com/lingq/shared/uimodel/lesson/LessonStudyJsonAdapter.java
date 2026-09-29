package com.lingq.shared.uimodel.lesson;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonStudyJsonAdapter extends AbstractC4949k<LessonStudy> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21848a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f21849b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f21850c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f21851d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<LessonStudyTranslation> f21852e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Integer> f21853f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Boolean> f21854g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<List<LessonStudyTranslationSentence>> f21855h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<Boolean> f21856i;

    /* JADX INFO: renamed from: j */
    public volatile Constructor<LessonStudy> f21857j;

    public LessonStudyJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21848a = JsonReader.C4932a.m10513a("id", "title", "description", "originalImageUrl", "imageUrl", "audioUrl", "duration", "collectionId", "collectionTitle", "translation", "previousLessonId", "nextLessonId", "isCompleted", "progressDownloaded", "translationSentence", "mediaImageUrl", "mediaTitle", "level", "newWordsCount", "isTaken", "videoUrl", "audioPending", "sharedByName", "isProtected", "canEditSentence", "price");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f21849b = c4955q.m10565c(cls, emptySet, "id");
        this.f21850c = c4955q.m10565c(String.class, emptySet, "title");
        this.f21851d = c4955q.m10565c(String.class, emptySet, "description");
        this.f21852e = c4955q.m10565c(LessonStudyTranslation.class, emptySet, "translation");
        this.f21853f = c4955q.m10565c(Integer.class, emptySet, "previousLessonId");
        this.f21854g = c4955q.m10565c(Boolean.TYPE, emptySet, "isCompleted");
        this.f21855h = c4955q.m10565c(C9312p.m17659d(List.class, LessonStudyTranslationSentence.class), emptySet, "translationSentence");
        this.f21856i = c4955q.m10565c(Boolean.class, emptySet, "isTaken");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LessonStudy mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        int i11;
        int i12;
        int i13;
        C5207g.m11111f(jsonReader, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer num2 = num;
        Integer numMo9385a = num2;
        Boolean bool2 = bool;
        Boolean boolMo9385a = bool2;
        Boolean boolMo9385a2 = boolMo9385a;
        Boolean boolMo9385a3 = boolMo9385a2;
        int i14 = -1;
        String strMo9385a = null;
        List<LessonStudyTranslationSentence> listMo9385a = null;
        Integer numMo9385a2 = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        LessonStudyTranslation lessonStudyTranslationMo9385a = null;
        Integer numMo9385a3 = null;
        Integer numMo9385a4 = null;
        String strMo9385a7 = null;
        String strMo9385a8 = null;
        String strMo9385a9 = null;
        Boolean boolMo9385a4 = null;
        String strMo9385a10 = null;
        String strMo9385a11 = null;
        Integer num3 = numMo9385a;
        Integer num4 = num3;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f21848a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    Integer numMo9385a5 = this.f21849b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i14 &= -2;
                    num = numMo9385a5;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f21850c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("title", "title", jsonReader);
                    }
                    i10 = i14 & (-3);
                    i14 = i10;
                    break;
                    break;
                case 2:
                    strMo9385a2 = this.f21851d.mo9385a(jsonReader);
                    i10 = i14 & (-5);
                    i14 = i10;
                    break;
                case 3:
                    strMo9385a3 = this.f21851d.mo9385a(jsonReader);
                    i10 = i14 & (-9);
                    i14 = i10;
                    break;
                case 4:
                    strMo9385a4 = this.f21851d.mo9385a(jsonReader);
                    i10 = i14 & (-17);
                    i14 = i10;
                    break;
                case 5:
                    strMo9385a5 = this.f21851d.mo9385a(jsonReader);
                    i10 = i14 & (-33);
                    i14 = i10;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    Integer numMo9385a6 = this.f21849b.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("duration", "duration", jsonReader);
                    }
                    i14 &= -65;
                    num3 = numMo9385a6;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    Integer numMo9385a7 = this.f21849b.mo9385a(jsonReader);
                    if (numMo9385a7 == null) {
                        throw C9756b.m18254m("collectionId", "collectionId", jsonReader);
                    }
                    i11 = i14 & (-129);
                    num4 = numMo9385a7;
                    i14 = i11;
                    break;
                    break;
                case 8:
                    strMo9385a6 = this.f21851d.mo9385a(jsonReader);
                    i10 = i14 & (-257);
                    i14 = i10;
                    break;
                case 9:
                    lessonStudyTranslationMo9385a = this.f21852e.mo9385a(jsonReader);
                    break;
                case 10:
                    numMo9385a3 = this.f21853f.mo9385a(jsonReader);
                    i10 = i14 & (-1025);
                    i14 = i10;
                    break;
                case 11:
                    numMo9385a4 = this.f21853f.mo9385a(jsonReader);
                    i10 = i14 & (-2049);
                    i14 = i10;
                    break;
                case 12:
                    Boolean boolMo9385a5 = this.f21854g.mo9385a(jsonReader);
                    if (boolMo9385a5 == null) {
                        throw C9756b.m18254m("isCompleted", "isCompleted", jsonReader);
                    }
                    i11 = i14 & (-4097);
                    bool2 = boolMo9385a5;
                    i14 = i11;
                    break;
                    break;
                case 13:
                    Integer numMo9385a8 = this.f21849b.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("progressDownloaded", "progressDownloaded", jsonReader);
                    }
                    i11 = i14 & (-8193);
                    num2 = numMo9385a8;
                    i14 = i11;
                    break;
                    break;
                case 14:
                    listMo9385a = this.f21855h.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("translationSentence", "translationSentence", jsonReader);
                    }
                    i10 = i14 & (-16385);
                    i14 = i10;
                    break;
                    break;
                case 15:
                    i12 = -32769;
                    strMo9385a7 = this.f21851d.mo9385a(jsonReader);
                    i13 = i12;
                    i10 = i13 & i14;
                    i14 = i10;
                    break;
                case 16:
                    i12 = -65537;
                    strMo9385a8 = this.f21851d.mo9385a(jsonReader);
                    i13 = i12;
                    i10 = i13 & i14;
                    i14 = i10;
                    break;
                case 17:
                    i12 = -131073;
                    strMo9385a9 = this.f21851d.mo9385a(jsonReader);
                    i13 = i12;
                    i10 = i13 & i14;
                    i14 = i10;
                    break;
                case 18:
                    numMo9385a2 = this.f21849b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    break;
                    break;
                case 19:
                    boolMo9385a4 = this.f21856i.mo9385a(jsonReader);
                    break;
                case 20:
                    strMo9385a10 = this.f21851d.mo9385a(jsonReader);
                    break;
                case 21:
                    boolMo9385a = this.f21854g.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("audioPending", "audioPending", jsonReader);
                    }
                    i13 = -2097153;
                    i10 = i13 & i14;
                    i14 = i10;
                    break;
                    break;
                case 22:
                    strMo9385a11 = this.f21851d.mo9385a(jsonReader);
                    break;
                case 23:
                    boolMo9385a2 = this.f21854g.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isProtected", "isProtected", jsonReader);
                    }
                    i13 = -8388609;
                    i10 = i13 & i14;
                    i14 = i10;
                    break;
                    break;
                case 24:
                    boolMo9385a3 = this.f21854g.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("canEditSentence", "canEditSentence", jsonReader);
                    }
                    i13 = -16777217;
                    i10 = i13 & i14;
                    i14 = i10;
                    break;
                    break;
                case 25:
                    numMo9385a = this.f21849b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("price", "price", jsonReader);
                    }
                    i13 = -33554433;
                    i10 = i13 & i14;
                    i14 = i10;
                    break;
                    break;
                default:
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i14 == -61079040) {
            int iIntValue = num.intValue();
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            int iIntValue2 = num3.intValue();
            int iIntValue3 = num4.intValue();
            boolean zBooleanValue = bool2.booleanValue();
            int iIntValue4 = num2.intValue();
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence?>");
            if (numMo9385a2 != null) {
                return new LessonStudy(iIntValue, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, iIntValue2, iIntValue3, strMo9385a6, lessonStudyTranslationMo9385a, numMo9385a3, numMo9385a4, zBooleanValue, iIntValue4, listMo9385a, strMo9385a7, strMo9385a8, strMo9385a9, numMo9385a2.intValue(), boolMo9385a4, strMo9385a10, boolMo9385a.booleanValue(), strMo9385a11, boolMo9385a2.booleanValue(), boolMo9385a3.booleanValue(), numMo9385a.intValue());
            }
            throw C9756b.m18248g("newWordsCount", "newWordsCount", jsonReader);
        }
        String str = strMo9385a;
        List<LessonStudyTranslationSentence> list = listMo9385a;
        Constructor<LessonStudy> declaredConstructor = this.f21857j;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            declaredConstructor = LessonStudy.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, cls, cls, String.class, LessonStudyTranslation.class, Integer.class, Integer.class, cls2, cls, List.class, String.class, String.class, String.class, cls, Boolean.class, String.class, cls2, String.class, cls2, cls2, cls, cls, C9756b.f49813c);
            this.f21857j = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LessonStudy::class.java.…his.constructorRef = it }");
        }
        Object[] objArr = new Object[28];
        objArr[0] = num;
        objArr[1] = str;
        objArr[2] = strMo9385a2;
        objArr[3] = strMo9385a3;
        objArr[4] = strMo9385a4;
        objArr[5] = strMo9385a5;
        objArr[6] = num3;
        objArr[7] = num4;
        objArr[8] = strMo9385a6;
        objArr[9] = lessonStudyTranslationMo9385a;
        objArr[10] = numMo9385a3;
        objArr[11] = numMo9385a4;
        objArr[12] = bool2;
        objArr[13] = num2;
        objArr[14] = list;
        objArr[15] = strMo9385a7;
        objArr[16] = strMo9385a8;
        objArr[17] = strMo9385a9;
        if (numMo9385a2 == null) {
            throw C9756b.m18248g("newWordsCount", "newWordsCount", jsonReader);
        }
        objArr[18] = Integer.valueOf(numMo9385a2.intValue());
        objArr[19] = boolMo9385a4;
        objArr[20] = strMo9385a10;
        objArr[21] = boolMo9385a;
        objArr[22] = strMo9385a11;
        objArr[23] = boolMo9385a2;
        objArr[24] = boolMo9385a3;
        objArr[25] = numMo9385a;
        objArr[26] = Integer.valueOf(i14);
        objArr[27] = null;
        LessonStudy lessonStudyNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(lessonStudyNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return lessonStudyNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LessonStudy lessonStudy) throws IOException {
        LessonStudy lessonStudy2 = lessonStudy;
        C5207g.m11111f(abstractC9310n, "writer");
        if (lessonStudy2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(lessonStudy2.f21815a);
        AbstractC4949k<Integer> abstractC4949k = this.f21849b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("title");
        this.f21850c.mo9386f(abstractC9310n, lessonStudy2.f21816b);
        abstractC9310n.mo10551C("description");
        String str = lessonStudy2.f21817c;
        AbstractC4949k<String> abstractC4949k2 = this.f21851d;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("originalImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, lessonStudy2.f21818d);
        abstractC9310n.mo10551C("imageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, lessonStudy2.f21819e);
        abstractC9310n.mo10551C("audioUrl");
        abstractC4949k2.mo9386f(abstractC9310n, lessonStudy2.f21820f);
        abstractC9310n.mo10551C("duration");
        C0166e.m775v(lessonStudy2.f21821g, abstractC4949k, abstractC9310n, "collectionId");
        C0166e.m775v(lessonStudy2.f21822h, abstractC4949k, abstractC9310n, "collectionTitle");
        abstractC4949k2.mo9386f(abstractC9310n, lessonStudy2.f21823i);
        abstractC9310n.mo10551C("translation");
        this.f21852e.mo9386f(abstractC9310n, lessonStudy2.f21824j);
        abstractC9310n.mo10551C("previousLessonId");
        Integer num = lessonStudy2.f21825k;
        AbstractC4949k<Integer> abstractC4949k3 = this.f21853f;
        abstractC4949k3.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("nextLessonId");
        abstractC4949k3.mo9386f(abstractC9310n, lessonStudy2.f21826l);
        abstractC9310n.mo10551C("isCompleted");
        Boolean boolValueOf = Boolean.valueOf(lessonStudy2.f21827m);
        AbstractC4949k<Boolean> abstractC4949k4 = this.f21854g;
        abstractC4949k4.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("progressDownloaded");
        C0166e.m775v(lessonStudy2.f21828n, abstractC4949k, abstractC9310n, "translationSentence");
        this.f21855h.mo9386f(abstractC9310n, lessonStudy2.f21829o);
        abstractC9310n.mo10551C("mediaImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, lessonStudy2.f21830p);
        abstractC9310n.mo10551C("mediaTitle");
        abstractC4949k2.mo9386f(abstractC9310n, lessonStudy2.f21831q);
        abstractC9310n.mo10551C("level");
        abstractC4949k2.mo9386f(abstractC9310n, lessonStudy2.f21832r);
        abstractC9310n.mo10551C("newWordsCount");
        C0166e.m775v(lessonStudy2.f21833s, abstractC4949k, abstractC9310n, "isTaken");
        this.f21856i.mo9386f(abstractC9310n, lessonStudy2.f21834t);
        abstractC9310n.mo10551C("videoUrl");
        abstractC4949k2.mo9386f(abstractC9310n, lessonStudy2.f21835u);
        abstractC9310n.mo10551C("audioPending");
        C0141b.m623s(lessonStudy2.f21836v, abstractC4949k4, abstractC9310n, "sharedByName");
        abstractC4949k2.mo9386f(abstractC9310n, lessonStudy2.f21837w);
        abstractC9310n.mo10551C("isProtected");
        C0141b.m623s(lessonStudy2.f21838x, abstractC4949k4, abstractC9310n, "canEditSentence");
        C0141b.m623s(lessonStudy2.f21839y, abstractC4949k4, abstractC9310n, "price");
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(lessonStudy2.f21840z));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(33, "GeneratedJsonAdapter(LessonStudy)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
