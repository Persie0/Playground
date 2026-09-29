package com.lingq.shared.uimodel.library;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LessonInfoJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/library/LessonInfo;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonInfoJsonAdapter extends AbstractC4949k<LessonInfo> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21990a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f21991b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f21992c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f21993d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f21994e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Boolean> f21995f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<List<String>> f21996g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<LessonMediaSource> f21997h;

    /* JADX INFO: renamed from: i */
    public volatile Constructor<LessonInfo> f21998i;

    public LessonInfoJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21990a = JsonReader.C4932a.m10513a("id", "title", "description", "imageUrl", "audioUrl", "status", "duration", "collectionId", "collectionTitle", "previousLessonId", "nextLessonId", "isCompleted", "mediaImageUrl", "mediaTitle", "wordCount", "uniqueWordCount", "rosesCount", "newWordsCount", "cardsCount", "isRoseGiven", "giveRoseUrl", "newWords", "providerId", "providerName", "providerDescription", "originalImageUrl", "providerImageUrl", "sharedById", "sharedByName", "sharedByImageUrl", "sharedByRole", "isSharedByIsFriend", "tags", "lessonPreview", "url", "level", "source", "price", "originalUrl", "videoUrl");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f21991b = c4955q.m10565c(cls, emptySet, "id");
        this.f21992c = c4955q.m10565c(String.class, emptySet, "title");
        this.f21993d = c4955q.m10565c(String.class, emptySet, "description");
        this.f21994e = c4955q.m10565c(Integer.class, emptySet, "previousLessonId");
        this.f21995f = c4955q.m10565c(Boolean.class, emptySet, "isCompleted");
        this.f21996g = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f21997h = c4955q.m10565c(LessonMediaSource.class, emptySet, "source");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LessonInfo mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        Boolean boolMo9385a = null;
        List<String> listMo9385a = null;
        String strMo9385a7 = null;
        String strMo9385a8 = null;
        LessonMediaSource lessonMediaSourceMo9385a = null;
        String strMo9385a9 = null;
        String strMo9385a10 = null;
        String strMo9385a11 = null;
        String strMo9385a12 = null;
        Integer numMo9385a = null;
        Integer numMo9385a2 = null;
        Boolean boolMo9385a2 = null;
        String strMo9385a13 = null;
        Integer numMo9385a3 = null;
        Integer numMo9385a4 = null;
        String strMo9385a14 = null;
        String strMo9385a15 = null;
        String strMo9385a16 = null;
        String strMo9385a17 = null;
        String strMo9385a18 = null;
        String strMo9385a19 = null;
        String strMo9385a20 = null;
        Integer numMo9385a5 = null;
        Integer numMo9385a6 = null;
        Boolean boolMo9385a3 = null;
        Integer numMo9385a7 = numM850i;
        Integer numMo9385a8 = numMo9385a7;
        Integer numMo9385a9 = numMo9385a8;
        int i11 = -1;
        int i12 = -1;
        String strMo9385a21 = null;
        String strMo9385a22 = null;
        Integer numMo9385a10 = numMo9385a9;
        Integer numMo9385a11 = numMo9385a10;
        Integer numMo9385a12 = numMo9385a11;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f21990a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    continue;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numM850i = this.f21991b.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i11 &= -2;
                    continue;
                    break;
                case 1:
                    strMo9385a21 = this.f21992c.mo9385a(jsonReader);
                    if (strMo9385a21 == null) {
                        throw C9756b.m18254m("title", "title", jsonReader);
                    }
                    i11 &= -3;
                    continue;
                    break;
                case 2:
                    strMo9385a16 = this.f21993d.mo9385a(jsonReader);
                    i11 &= -5;
                    continue;
                case 3:
                    strMo9385a17 = this.f21993d.mo9385a(jsonReader);
                    i11 &= -9;
                    continue;
                case 4:
                    strMo9385a18 = this.f21993d.mo9385a(jsonReader);
                    i11 &= -17;
                    continue;
                case 5:
                    strMo9385a19 = this.f21993d.mo9385a(jsonReader);
                    continue;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a10 = this.f21991b.mo9385a(jsonReader);
                    if (numMo9385a10 == null) {
                        throw C9756b.m18254m("duration", "duration", jsonReader);
                    }
                    i11 &= -65;
                    continue;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a11 = this.f21991b.mo9385a(jsonReader);
                    if (numMo9385a11 == null) {
                        throw C9756b.m18254m("collectionId", "collectionId", jsonReader);
                    }
                    i11 &= -129;
                    continue;
                    break;
                case 8:
                    strMo9385a20 = this.f21993d.mo9385a(jsonReader);
                    i11 &= -257;
                    continue;
                case 9:
                    numMo9385a5 = this.f21994e.mo9385a(jsonReader);
                    i11 &= -513;
                    continue;
                case 10:
                    numMo9385a6 = this.f21994e.mo9385a(jsonReader);
                    i11 &= -1025;
                    continue;
                case 11:
                    boolMo9385a3 = this.f21995f.mo9385a(jsonReader);
                    i11 &= -2049;
                    continue;
                case 12:
                    strMo9385a11 = this.f21993d.mo9385a(jsonReader);
                    i11 &= -4097;
                    continue;
                case 13:
                    strMo9385a12 = this.f21993d.mo9385a(jsonReader);
                    i11 &= -8193;
                    continue;
                case 14:
                    numMo9385a = this.f21994e.mo9385a(jsonReader);
                    i11 &= -16385;
                    continue;
                case 15:
                    i10 = -32769;
                    numMo9385a2 = this.f21994e.mo9385a(jsonReader);
                    break;
                case 16:
                    numMo9385a12 = this.f21991b.mo9385a(jsonReader);
                    if (numMo9385a12 == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i10 = -65537;
                    break;
                    break;
                case 17:
                    numMo9385a7 = this.f21991b.mo9385a(jsonReader);
                    if (numMo9385a7 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i10 = -131073;
                    break;
                    break;
                case 18:
                    numMo9385a8 = this.f21991b.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i10 = -262145;
                    break;
                    break;
                case 19:
                    i10 = -524289;
                    boolMo9385a2 = this.f21995f.mo9385a(jsonReader);
                    break;
                case 20:
                    strMo9385a13 = this.f21993d.mo9385a(jsonReader);
                    continue;
                case 21:
                    i10 = -2097153;
                    numMo9385a3 = this.f21994e.mo9385a(jsonReader);
                    break;
                case 22:
                    i10 = -4194305;
                    numMo9385a4 = this.f21994e.mo9385a(jsonReader);
                    break;
                case 23:
                    i10 = -8388609;
                    strMo9385a14 = this.f21993d.mo9385a(jsonReader);
                    break;
                case 24:
                    i10 = -16777217;
                    strMo9385a15 = this.f21993d.mo9385a(jsonReader);
                    break;
                case 25:
                    i10 = -33554433;
                    strMo9385a = this.f21993d.mo9385a(jsonReader);
                    break;
                case 26:
                    i10 = -67108865;
                    strMo9385a2 = this.f21993d.mo9385a(jsonReader);
                    break;
                case 27:
                    i10 = -134217729;
                    strMo9385a3 = this.f21993d.mo9385a(jsonReader);
                    break;
                case 28:
                    i10 = -268435457;
                    strMo9385a4 = this.f21993d.mo9385a(jsonReader);
                    break;
                case 29:
                    i10 = -536870913;
                    strMo9385a5 = this.f21993d.mo9385a(jsonReader);
                    break;
                case 30:
                    i10 = -1073741825;
                    strMo9385a6 = this.f21993d.mo9385a(jsonReader);
                    break;
                case 31:
                    i10 = Integer.MAX_VALUE;
                    boolMo9385a = this.f21995f.mo9385a(jsonReader);
                    break;
                case 32:
                    listMo9385a = this.f21996g.mo9385a(jsonReader);
                    continue;
                case 33:
                    strMo9385a22 = this.f21992c.mo9385a(jsonReader);
                    if (strMo9385a22 == null) {
                        throw C9756b.m18254m("lessonPreview", "lessonPreview", jsonReader);
                    }
                    i12 &= -3;
                    continue;
                    break;
                case 34:
                    strMo9385a7 = this.f21993d.mo9385a(jsonReader);
                    i12 &= -5;
                    continue;
                case 35:
                    strMo9385a8 = this.f21993d.mo9385a(jsonReader);
                    continue;
                case 36:
                    lessonMediaSourceMo9385a = this.f21997h.mo9385a(jsonReader);
                    continue;
                case 37:
                    numMo9385a9 = this.f21991b.mo9385a(jsonReader);
                    if (numMo9385a9 == null) {
                        throw C9756b.m18254m("price", "price", jsonReader);
                    }
                    i12 &= -33;
                    continue;
                    break;
                case 38:
                    strMo9385a9 = this.f21993d.mo9385a(jsonReader);
                    i12 &= -65;
                    continue;
                case 39:
                    strMo9385a10 = this.f21993d.mo9385a(jsonReader);
                    i12 &= -129;
                    continue;
                default:
                    continue;
            }
            i11 &= i10;
        }
        jsonReader.mo10508q();
        if (i11 != 1048608 || i12 != -231) {
            Constructor<LessonInfo> declaredConstructor = this.f21998i;
            if (declaredConstructor == null) {
                Class cls = Integer.TYPE;
                declaredConstructor = LessonInfo.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, cls, cls, String.class, Integer.class, Integer.class, Boolean.class, String.class, String.class, Integer.class, Integer.class, cls, cls, cls, Boolean.class, String.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, List.class, String.class, String.class, String.class, LessonMediaSource.class, cls, String.class, String.class, cls, cls, C9756b.f49813c);
                this.f21998i = declaredConstructor;
                C5207g.m11110e(declaredConstructor, "LessonInfo::class.java.g…his.constructorRef = it }");
            }
            LessonInfo lessonInfoNewInstance = declaredConstructor.newInstance(numM850i, strMo9385a21, strMo9385a16, strMo9385a17, strMo9385a18, strMo9385a19, numMo9385a10, numMo9385a11, strMo9385a20, numMo9385a5, numMo9385a6, boolMo9385a3, strMo9385a11, strMo9385a12, numMo9385a, numMo9385a2, numMo9385a12, numMo9385a7, numMo9385a8, boolMo9385a2, strMo9385a13, numMo9385a3, numMo9385a4, strMo9385a14, strMo9385a15, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, boolMo9385a, listMo9385a, strMo9385a22, strMo9385a7, strMo9385a8, lessonMediaSourceMo9385a, numMo9385a9, strMo9385a9, strMo9385a10, Integer.valueOf(i11), Integer.valueOf(i12), null);
            C5207g.m11110e(lessonInfoNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return lessonInfoNewInstance;
        }
        int iIntValue = numM850i.intValue();
        String str = strMo9385a22;
        C5207g.m11109d(strMo9385a21, "null cannot be cast to non-null type kotlin.String");
        int iIntValue2 = numMo9385a10.intValue();
        int iIntValue3 = numMo9385a11.intValue();
        int iIntValue4 = numMo9385a12.intValue();
        int iIntValue5 = numMo9385a7.intValue();
        int iIntValue6 = numMo9385a8.intValue();
        C5207g.m11109d(str, "null cannot be cast to non-null type kotlin.String");
        return new LessonInfo(iIntValue, strMo9385a21, strMo9385a16, strMo9385a17, strMo9385a18, strMo9385a19, iIntValue2, iIntValue3, strMo9385a20, numMo9385a5, numMo9385a6, boolMo9385a3, strMo9385a11, strMo9385a12, numMo9385a, numMo9385a2, iIntValue4, iIntValue5, iIntValue6, boolMo9385a2, strMo9385a13, numMo9385a3, numMo9385a4, strMo9385a14, strMo9385a15, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, boolMo9385a, listMo9385a, str, strMo9385a7, strMo9385a8, lessonMediaSourceMo9385a, numMo9385a9.intValue(), strMo9385a9, strMo9385a10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LessonInfo lessonInfo) throws IOException {
        LessonInfo lessonInfo2 = lessonInfo;
        C5207g.m11111f(abstractC9310n, "writer");
        if (lessonInfo2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(lessonInfo2.f21964a);
        AbstractC4949k<Integer> abstractC4949k = this.f21991b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("title");
        String str = lessonInfo2.f21965b;
        AbstractC4949k<String> abstractC4949k2 = this.f21992c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("description");
        String str2 = lessonInfo2.f21966c;
        AbstractC4949k<String> abstractC4949k3 = this.f21993d;
        abstractC4949k3.mo9386f(abstractC9310n, str2);
        abstractC9310n.mo10551C("imageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21967d);
        abstractC9310n.mo10551C("audioUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21968e);
        abstractC9310n.mo10551C("status");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21969f);
        abstractC9310n.mo10551C("duration");
        C0166e.m775v(lessonInfo2.f21970g, abstractC4949k, abstractC9310n, "collectionId");
        C0166e.m775v(lessonInfo2.f21971h, abstractC4949k, abstractC9310n, "collectionTitle");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21972i);
        abstractC9310n.mo10551C("previousLessonId");
        Integer num = lessonInfo2.f21973j;
        AbstractC4949k<Integer> abstractC4949k4 = this.f21994e;
        abstractC4949k4.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("nextLessonId");
        abstractC4949k4.mo9386f(abstractC9310n, lessonInfo2.f21974k);
        abstractC9310n.mo10551C("isCompleted");
        Boolean bool = lessonInfo2.f21975l;
        AbstractC4949k<Boolean> abstractC4949k5 = this.f21995f;
        abstractC4949k5.mo9386f(abstractC9310n, bool);
        abstractC9310n.mo10551C("mediaImageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21976m);
        abstractC9310n.mo10551C("mediaTitle");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21977n);
        abstractC9310n.mo10551C("wordCount");
        abstractC4949k4.mo9386f(abstractC9310n, lessonInfo2.f21978o);
        abstractC9310n.mo10551C("uniqueWordCount");
        abstractC4949k4.mo9386f(abstractC9310n, lessonInfo2.f21979p);
        abstractC9310n.mo10551C("rosesCount");
        C0166e.m775v(lessonInfo2.f21980q, abstractC4949k, abstractC9310n, "newWordsCount");
        C0166e.m775v(lessonInfo2.f21981r, abstractC4949k, abstractC9310n, "cardsCount");
        C0166e.m775v(lessonInfo2.f21982s, abstractC4949k, abstractC9310n, "isRoseGiven");
        abstractC4949k5.mo9386f(abstractC9310n, lessonInfo2.f21983t);
        abstractC9310n.mo10551C("giveRoseUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21984u);
        abstractC9310n.mo10551C("newWords");
        abstractC4949k4.mo9386f(abstractC9310n, lessonInfo2.f21985v);
        abstractC9310n.mo10551C("providerId");
        abstractC4949k4.mo9386f(abstractC9310n, lessonInfo2.f21986w);
        abstractC9310n.mo10551C("providerName");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21987x);
        abstractC9310n.mo10551C("providerDescription");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21988y);
        abstractC9310n.mo10551C("originalImageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21989z);
        abstractC9310n.mo10551C("providerImageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21950A);
        abstractC9310n.mo10551C("sharedById");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21951B);
        abstractC9310n.mo10551C("sharedByName");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21952C);
        abstractC9310n.mo10551C("sharedByImageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21953D);
        abstractC9310n.mo10551C("sharedByRole");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21954E);
        abstractC9310n.mo10551C("isSharedByIsFriend");
        abstractC4949k5.mo9386f(abstractC9310n, lessonInfo2.f21955F);
        abstractC9310n.mo10551C("tags");
        this.f21996g.mo9386f(abstractC9310n, lessonInfo2.f21956G);
        abstractC9310n.mo10551C("lessonPreview");
        abstractC4949k2.mo9386f(abstractC9310n, lessonInfo2.f21957H);
        abstractC9310n.mo10551C("url");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21958I);
        abstractC9310n.mo10551C("level");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21959J);
        abstractC9310n.mo10551C("source");
        this.f21997h.mo9386f(abstractC9310n, lessonInfo2.f21960K);
        abstractC9310n.mo10551C("price");
        C0166e.m775v(lessonInfo2.f21961L, abstractC4949k, abstractC9310n, "originalUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21962M);
        abstractC9310n.mo10551C("videoUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lessonInfo2.f21963N);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(32, "GeneratedJsonAdapter(LessonInfo)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
