package com.lingq.entity;

import android.support.v4.media.C0141b;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LibraryDataJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LibraryData;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LibraryDataJsonAdapter extends AbstractC4949k<LibraryData> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17264a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17265b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17266c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17267d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<MediaSource> f17268e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Integer> f17269f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Double> f17270g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<Boolean> f17271h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<List<String>> f17272i;

    /* JADX INFO: renamed from: j */
    public final AbstractC4949k<Float> f17273j;

    /* JADX INFO: renamed from: k */
    public final AbstractC4949k<Boolean> f17274k;

    /* JADX INFO: renamed from: l */
    public volatile Constructor<LibraryData> f17275l;

    public LibraryDataJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17264a = JsonReader.C4932a.m10513a("id", "type", "title", "description", "pos", "url", "source", "imageUrl", "providerId", "providerName", "providerDescription", "originalImageUrl", "providerImageUrl", "sharedById", "sharedByName", "sharedByImageUrl", "sharedByRole", "level", "newWordsCount", "lessonsCount", "owner", "price", "cardsCount", "rosesCount", "duration", "collectionId", "collectionTitle", "difficulty", "isAvailable", "tags", "status", "folders", "progress", "isTaken", "lessonPreview", "accent", "audioUrl", "listenTimes", "readTimes", "isCompleted", "isFavorite", "videoUrl");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17265b = c4955q.m10565c(cls, emptySet, "id");
        this.f17266c = c4955q.m10565c(String.class, emptySet, "type");
        this.f17267d = c4955q.m10565c(String.class, emptySet, "title");
        this.f17268e = c4955q.m10565c(MediaSource.class, emptySet, "source");
        this.f17269f = c4955q.m10565c(Integer.class, emptySet, "providerId");
        this.f17270g = c4955q.m10565c(Double.TYPE, emptySet, "difficulty");
        this.f17271h = c4955q.m10565c(Boolean.TYPE, emptySet, "isAvailable");
        this.f17272i = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f17273j = c4955q.m10565c(Float.class, emptySet, "progress");
        this.f17274k = c4955q.m10565c(Boolean.class, emptySet, "isTaken");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LibraryData mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Double dValueOf = Double.valueOf(0.0d);
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        Integer numMo9385a4 = numMo9385a3;
        Double dMo9385a = dValueOf;
        Double d10 = dMo9385a;
        Double dMo9385a2 = d10;
        Boolean boolMo9385a = bool;
        Boolean boolMo9385a2 = boolMo9385a;
        Boolean bool2 = boolMo9385a2;
        int i11 = -1;
        int i12 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        MediaSource mediaSourceMo9385a = null;
        String strMo9385a6 = null;
        Integer numMo9385a5 = null;
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
        Integer numMo9385a6 = null;
        Integer numMo9385a7 = null;
        String strMo9385a17 = null;
        List<String> listMo9385a = null;
        String strMo9385a18 = null;
        List<String> listMo9385a2 = null;
        Float fMo9385a = null;
        Boolean boolMo9385a3 = null;
        String strMo9385a19 = null;
        String strMo9385a20 = null;
        String strMo9385a21 = null;
        Integer numMo9385a8 = numMo9385a4;
        Integer numMo9385a9 = numMo9385a8;
        Integer numMo9385a10 = numMo9385a9;
        while (true) {
            Double d11 = dMo9385a;
            if (!jsonReader.mo10511w()) {
                Double d12 = d10;
                jsonReader.mo10508q();
                if (i12 == 2 && i11 == -1024) {
                    int iIntValue = numMo9385a.intValue();
                    if (strMo9385a2 == null) {
                        throw C9756b.m18248g("type", "type", jsonReader);
                    }
                    int iIntValue2 = numMo9385a8.intValue();
                    int iIntValue3 = numMo9385a9.intValue();
                    int iIntValue4 = numMo9385a10.intValue();
                    int iIntValue5 = numMo9385a2.intValue();
                    int iIntValue6 = numMo9385a3.intValue();
                    int iIntValue7 = numMo9385a4.intValue();
                    double dDoubleValue = dMo9385a2.doubleValue();
                    boolean zBooleanValue = boolMo9385a.booleanValue();
                    C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
                    return new LibraryData(iIntValue, strMo9385a2, strMo9385a3, strMo9385a4, iIntValue2, strMo9385a5, mediaSourceMo9385a, strMo9385a6, numMo9385a5, strMo9385a7, strMo9385a8, strMo9385a9, strMo9385a10, strMo9385a11, strMo9385a12, strMo9385a13, strMo9385a14, strMo9385a15, iIntValue3, iIntValue4, strMo9385a16, iIntValue5, iIntValue6, iIntValue7, numMo9385a6, numMo9385a7, strMo9385a17, dDoubleValue, zBooleanValue, listMo9385a, strMo9385a18, listMo9385a2, fMo9385a, boolMo9385a3, strMo9385a, strMo9385a19, strMo9385a20, d12.doubleValue(), d11.doubleValue(), bool2.booleanValue(), boolMo9385a2.booleanValue(), strMo9385a21);
                }
                Constructor<LibraryData> declaredConstructor = this.f17275l;
                int i13 = 45;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    Class cls2 = Double.TYPE;
                    Class cls3 = Boolean.TYPE;
                    declaredConstructor = LibraryData.class.getDeclaredConstructor(cls, String.class, String.class, String.class, cls, String.class, MediaSource.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls, String.class, cls, cls, cls, Integer.class, Integer.class, String.class, cls2, cls3, List.class, String.class, List.class, Float.class, Boolean.class, String.class, String.class, String.class, cls2, cls2, cls3, cls3, String.class, cls, cls, C9756b.f49813c);
                    this.f17275l = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "LibraryData::class.java.…his.constructorRef = it }");
                    i13 = 45;
                }
                Object[] objArr = new Object[i13];
                objArr[0] = numMo9385a;
                if (strMo9385a2 == null) {
                    throw C9756b.m18248g("type", "type", jsonReader);
                }
                objArr[1] = strMo9385a2;
                objArr[2] = strMo9385a3;
                objArr[3] = strMo9385a4;
                objArr[4] = numMo9385a8;
                objArr[5] = strMo9385a5;
                objArr[6] = mediaSourceMo9385a;
                objArr[7] = strMo9385a6;
                objArr[8] = numMo9385a5;
                objArr[9] = strMo9385a7;
                objArr[10] = strMo9385a8;
                objArr[11] = strMo9385a9;
                objArr[12] = strMo9385a10;
                objArr[13] = strMo9385a11;
                objArr[14] = strMo9385a12;
                objArr[15] = strMo9385a13;
                objArr[16] = strMo9385a14;
                objArr[17] = strMo9385a15;
                objArr[18] = numMo9385a9;
                objArr[19] = numMo9385a10;
                objArr[20] = strMo9385a16;
                objArr[21] = numMo9385a2;
                objArr[22] = numMo9385a3;
                objArr[23] = numMo9385a4;
                objArr[24] = numMo9385a6;
                objArr[25] = numMo9385a7;
                objArr[26] = strMo9385a17;
                objArr[27] = dMo9385a2;
                objArr[28] = boolMo9385a;
                objArr[29] = listMo9385a;
                objArr[30] = strMo9385a18;
                objArr[31] = listMo9385a2;
                objArr[32] = fMo9385a;
                objArr[33] = boolMo9385a3;
                objArr[34] = strMo9385a;
                objArr[35] = strMo9385a19;
                objArr[36] = strMo9385a20;
                objArr[37] = d12;
                objArr[38] = d11;
                objArr[39] = bool2;
                objArr[40] = boolMo9385a2;
                objArr[41] = strMo9385a21;
                objArr[42] = Integer.valueOf(i12);
                objArr[43] = Integer.valueOf(i11);
                objArr[44] = null;
                LibraryData libraryDataNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(libraryDataNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return libraryDataNewInstance;
            }
            Double d13 = d10;
            switch (jsonReader.mo10512y0(this.f17264a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f17265b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i12 &= -2;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 1:
                    strMo9385a2 = this.f17266c.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("type", "type", jsonReader);
                    }
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 2:
                    strMo9385a3 = this.f17267d.mo9385a(jsonReader);
                    i12 &= -5;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 3:
                    strMo9385a4 = this.f17267d.mo9385a(jsonReader);
                    i12 &= -9;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 4:
                    numMo9385a8 = this.f17265b.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("pos", "pos", jsonReader);
                    }
                    i12 &= -17;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 5:
                    strMo9385a5 = this.f17267d.mo9385a(jsonReader);
                    i12 &= -33;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    mediaSourceMo9385a = this.f17268e.mo9385a(jsonReader);
                    i12 &= -65;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a6 = this.f17267d.mo9385a(jsonReader);
                    i12 &= -129;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 8:
                    numMo9385a5 = this.f17269f.mo9385a(jsonReader);
                    i12 &= -257;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 9:
                    strMo9385a7 = this.f17267d.mo9385a(jsonReader);
                    i12 &= -513;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 10:
                    strMo9385a8 = this.f17267d.mo9385a(jsonReader);
                    i12 &= -1025;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 11:
                    strMo9385a9 = this.f17267d.mo9385a(jsonReader);
                    i12 &= -2049;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 12:
                    strMo9385a10 = this.f17267d.mo9385a(jsonReader);
                    i12 &= -4097;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 13:
                    strMo9385a11 = this.f17267d.mo9385a(jsonReader);
                    i12 &= -8193;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 14:
                    strMo9385a12 = this.f17267d.mo9385a(jsonReader);
                    i12 &= -16385;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 15:
                    strMo9385a13 = this.f17267d.mo9385a(jsonReader);
                    i10 = -32769;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 16:
                    strMo9385a14 = this.f17267d.mo9385a(jsonReader);
                    i10 = -65537;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 17:
                    strMo9385a15 = this.f17267d.mo9385a(jsonReader);
                    i10 = -131073;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 18:
                    numMo9385a9 = this.f17265b.mo9385a(jsonReader);
                    if (numMo9385a9 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i10 = -262145;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 19:
                    numMo9385a10 = this.f17265b.mo9385a(jsonReader);
                    if (numMo9385a10 == null) {
                        throw C9756b.m18254m("lessonsCount", "lessonsCount", jsonReader);
                    }
                    i10 = -524289;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 20:
                    strMo9385a16 = this.f17267d.mo9385a(jsonReader);
                    i10 = -1048577;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 21:
                    numMo9385a2 = this.f17265b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("price", "price", jsonReader);
                    }
                    i10 = -2097153;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 22:
                    numMo9385a3 = this.f17265b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i10 = -4194305;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 23:
                    numMo9385a4 = this.f17265b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i10 = -8388609;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 24:
                    numMo9385a6 = this.f17269f.mo9385a(jsonReader);
                    i10 = -16777217;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 25:
                    numMo9385a7 = this.f17269f.mo9385a(jsonReader);
                    i10 = -33554433;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 26:
                    strMo9385a17 = this.f17267d.mo9385a(jsonReader);
                    i10 = -67108865;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 27:
                    dMo9385a2 = this.f17270g.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("difficulty", "difficulty", jsonReader);
                    }
                    i10 = -134217729;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 28:
                    boolMo9385a = this.f17271h.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isAvailable", "isAvailable", jsonReader);
                    }
                    i10 = -268435457;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 29:
                    listMo9385a = this.f17272i.mo9385a(jsonReader);
                    i10 = -536870913;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 30:
                    strMo9385a18 = this.f17267d.mo9385a(jsonReader);
                    i10 = -1073741825;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 31:
                    listMo9385a2 = this.f17272i.mo9385a(jsonReader);
                    i10 = Integer.MAX_VALUE;
                    i12 &= i10;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 32:
                    fMo9385a = this.f17273j.mo9385a(jsonReader);
                    i11 &= -2;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 33:
                    boolMo9385a3 = this.f17274k.mo9385a(jsonReader);
                    i11 &= -3;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 34:
                    strMo9385a = this.f17266c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("lessonPreview", "lessonPreview", jsonReader);
                    }
                    i11 &= -5;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 35:
                    strMo9385a19 = this.f17267d.mo9385a(jsonReader);
                    i11 &= -9;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 36:
                    strMo9385a20 = this.f17267d.mo9385a(jsonReader);
                    i11 &= -17;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                case 37:
                    Double dMo9385a3 = this.f17270g.mo9385a(jsonReader);
                    if (dMo9385a3 == null) {
                        throw C9756b.m18254m("listenTimes", "listenTimes", jsonReader);
                    }
                    i11 &= -33;
                    d10 = dMo9385a3;
                    dMo9385a = d11;
                    break;
                    break;
                case 38:
                    dMo9385a = this.f17270g.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("readTimes", "readTimes", jsonReader);
                    }
                    i11 &= -65;
                    d10 = d13;
                    break;
                    break;
                case 39:
                    Boolean boolMo9385a4 = this.f17271h.mo9385a(jsonReader);
                    if (boolMo9385a4 == null) {
                        throw C9756b.m18254m("isCompleted", "isCompleted", jsonReader);
                    }
                    i11 &= -129;
                    bool2 = boolMo9385a4;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 40:
                    boolMo9385a2 = this.f17271h.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isFavorite", "isFavorite", jsonReader);
                    }
                    i11 &= -257;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                    break;
                case 41:
                    strMo9385a21 = this.f17267d.mo9385a(jsonReader);
                    i11 &= -513;
                    d10 = d13;
                    dMo9385a = d11;
                    break;
                default:
                    d10 = d13;
                    dMo9385a = d11;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LibraryData libraryData) throws IOException {
        LibraryData libraryData2 = libraryData;
        C5207g.m11111f(abstractC9310n, "writer");
        if (libraryData2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(libraryData2.f17238a);
        AbstractC4949k<Integer> abstractC4949k = this.f17265b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("type");
        String str = libraryData2.f17239b;
        AbstractC4949k<String> abstractC4949k2 = this.f17266c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("title");
        String str2 = libraryData2.f17240c;
        AbstractC4949k<String> abstractC4949k3 = this.f17267d;
        abstractC4949k3.mo9386f(abstractC9310n, str2);
        abstractC9310n.mo10551C("description");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17241d);
        abstractC9310n.mo10551C("pos");
        C0166e.m775v(libraryData2.f17242e, abstractC4949k, abstractC9310n, "url");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17243f);
        abstractC9310n.mo10551C("source");
        this.f17268e.mo9386f(abstractC9310n, libraryData2.f17244g);
        abstractC9310n.mo10551C("imageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17245h);
        abstractC9310n.mo10551C("providerId");
        Integer num = libraryData2.f17246i;
        AbstractC4949k<Integer> abstractC4949k4 = this.f17269f;
        abstractC4949k4.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("providerName");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17247j);
        abstractC9310n.mo10551C("providerDescription");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17248k);
        abstractC9310n.mo10551C("originalImageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17249l);
        abstractC9310n.mo10551C("providerImageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17250m);
        abstractC9310n.mo10551C("sharedById");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17251n);
        abstractC9310n.mo10551C("sharedByName");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17252o);
        abstractC9310n.mo10551C("sharedByImageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17253p);
        abstractC9310n.mo10551C("sharedByRole");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17254q);
        abstractC9310n.mo10551C("level");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17255r);
        abstractC9310n.mo10551C("newWordsCount");
        C0166e.m775v(libraryData2.f17256s, abstractC4949k, abstractC9310n, "lessonsCount");
        C0166e.m775v(libraryData2.f17257t, abstractC4949k, abstractC9310n, "owner");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17258u);
        abstractC9310n.mo10551C("price");
        C0166e.m775v(libraryData2.f17259v, abstractC4949k, abstractC9310n, "cardsCount");
        C0166e.m775v(libraryData2.f17260w, abstractC4949k, abstractC9310n, "rosesCount");
        C0166e.m775v(libraryData2.f17261x, abstractC4949k, abstractC9310n, "duration");
        abstractC4949k4.mo9386f(abstractC9310n, libraryData2.f17262y);
        abstractC9310n.mo10551C("collectionId");
        abstractC4949k4.mo9386f(abstractC9310n, libraryData2.f17263z);
        abstractC9310n.mo10551C("collectionTitle");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17222A);
        abstractC9310n.mo10551C("difficulty");
        Double dValueOf = Double.valueOf(libraryData2.f17223B);
        AbstractC4949k<Double> abstractC4949k5 = this.f17270g;
        abstractC4949k5.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("isAvailable");
        Boolean boolValueOf = Boolean.valueOf(libraryData2.f17224C);
        AbstractC4949k<Boolean> abstractC4949k6 = this.f17271h;
        abstractC4949k6.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("tags");
        List<String> list = libraryData2.f17225D;
        AbstractC4949k<List<String>> abstractC4949k7 = this.f17272i;
        abstractC4949k7.mo9386f(abstractC9310n, list);
        abstractC9310n.mo10551C("status");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17226E);
        abstractC9310n.mo10551C("folders");
        abstractC4949k7.mo9386f(abstractC9310n, libraryData2.f17227F);
        abstractC9310n.mo10551C("progress");
        this.f17273j.mo9386f(abstractC9310n, libraryData2.f17228G);
        abstractC9310n.mo10551C("isTaken");
        this.f17274k.mo9386f(abstractC9310n, libraryData2.f17229H);
        abstractC9310n.mo10551C("lessonPreview");
        abstractC4949k2.mo9386f(abstractC9310n, libraryData2.f17230I);
        abstractC9310n.mo10551C("accent");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17231J);
        abstractC9310n.mo10551C("audioUrl");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17232K);
        abstractC9310n.mo10551C("listenTimes");
        C0204c.m859s(libraryData2.f17233L, abstractC4949k5, abstractC9310n, "readTimes");
        C0204c.m859s(libraryData2.f17234M, abstractC4949k5, abstractC9310n, "isCompleted");
        C0141b.m623s(libraryData2.f17235N, abstractC4949k6, abstractC9310n, "isFavorite");
        C0141b.m623s(libraryData2.f17236O, abstractC4949k6, abstractC9310n, "videoUrl");
        abstractC4949k3.mo9386f(abstractC9310n, libraryData2.f17237P);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(33, "GeneratedJsonAdapter(LibraryData)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
