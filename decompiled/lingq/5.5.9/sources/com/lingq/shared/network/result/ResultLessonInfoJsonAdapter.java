package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.MediaSource;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLessonInfoJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultLessonInfo;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultLessonInfoJsonAdapter extends AbstractC4949k<ResultLessonInfo> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18628a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18629b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18630c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Double> f18631d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<MediaSource> f18632e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Integer> f18633f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Boolean> f18634g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<List<String>> f18635h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<String> f18636i;

    /* JADX INFO: renamed from: j */
    public final AbstractC4949k<Boolean> f18637j;

    /* JADX INFO: renamed from: k */
    public volatile Constructor<ResultLessonInfo> f18638k;

    public ResultLessonInfoJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18628a = JsonReader.C4932a.m10513a("id", "url", "pos", "title", "description", "pubDate", "imageUrl", "audio", "externalAudio", "duration", "status", "sharedDate", "originalUrl", "wordCount", "uniqueWordCount", "rosesCount", "lessonRating", "audioRating", "collectionId", "collectionTitle", "classicUrl", "source", "previousLessonId", "nextLessonId", "readTimes", "listenTimes", "isCompleted", "newWordsCount", "cardsCount", "roseGiven", "giveRoseUrl", "price", "opened", "percentCompleted", "lastRoseReceived", "isFavorite", "printUrl", "videoUrl", "exercises", "notes", "viewsCount", "providerId", "providerName", "providerDescription", "originalImageUrl", "providerImageUrl", "sharedById", "sharedByName", "sharedByImageUrl", "sharedByRole", "isSharedByIsFriend", "isCanEdit", "lessonVotes", "audioVotes", "level", "tags", "ofQuery", "difficulty", "isTaken", "audioPending");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18629b = c4955q.m10565c(cls, emptySet, "id");
        this.f18630c = c4955q.m10565c(String.class, emptySet, "url");
        this.f18631d = c4955q.m10565c(Double.TYPE, emptySet, "lessonRating");
        this.f18632e = c4955q.m10565c(MediaSource.class, emptySet, "source");
        this.f18633f = c4955q.m10565c(Integer.class, emptySet, "previousLessonId");
        this.f18634g = c4955q.m10565c(Boolean.TYPE, emptySet, "isCompleted");
        this.f18635h = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f18636i = c4955q.m10565c(String.class, emptySet, "ofQuery");
        this.f18637j = c4955q.m10565c(Boolean.class, emptySet, "isTaken");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultLessonInfo mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        int i11;
        int i12;
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Double dValueOf = Double.valueOf(0.0d);
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer num = numMo9385a;
        Integer num2 = num;
        Integer num3 = num2;
        Integer numMo9385a2 = num3;
        Integer numMo9385a3 = numMo9385a2;
        Integer numMo9385a4 = numMo9385a3;
        Integer numMo9385a5 = numMo9385a4;
        Integer num4 = numMo9385a5;
        Integer numMo9385a6 = num4;
        Double d10 = dValueOf;
        Double d11 = d10;
        Double dMo9385a = d11;
        Double dMo9385a2 = dMo9385a;
        Double d12 = dMo9385a2;
        Double dMo9385a3 = d12;
        Boolean boolMo9385a = bool;
        Boolean boolMo9385a2 = boolMo9385a;
        Boolean bool2 = boolMo9385a2;
        Boolean bool3 = bool2;
        Boolean boolMo9385a3 = bool3;
        Boolean boolMo9385a4 = boolMo9385a3;
        Boolean boolMo9385a5 = boolMo9385a4;
        int i13 = -1;
        int i14 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        String strMo9385a7 = null;
        String strMo9385a8 = null;
        String strMo9385a9 = null;
        String strMo9385a10 = null;
        String strMo9385a11 = null;
        String strMo9385a12 = null;
        MediaSource mediaSourceMo9385a = null;
        Integer numMo9385a7 = null;
        Integer numMo9385a8 = null;
        String strMo9385a13 = null;
        String strMo9385a14 = null;
        String strMo9385a15 = null;
        String strMo9385a16 = null;
        String strMo9385a17 = null;
        String strMo9385a18 = null;
        Integer numMo9385a9 = null;
        String strMo9385a19 = null;
        String strMo9385a20 = null;
        String strMo9385a21 = null;
        String strMo9385a22 = null;
        String strMo9385a23 = null;
        String strMo9385a24 = null;
        String strMo9385a25 = null;
        String strMo9385a26 = null;
        String strMo9385a27 = null;
        List<String> listMo9385a = null;
        Boolean boolMo9385a6 = null;
        String strMo9385a28 = null;
        Integer num5 = numMo9385a6;
        Integer num6 = num5;
        Integer num7 = num6;
        while (jsonReader.mo10511w()) {
            Integer num8 = numMo9385a;
            switch (jsonReader.mo10512y0(this.f18628a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    numMo9385a = num8;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    Integer numMo9385a10 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a10 == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i14 &= -2;
                    num5 = numMo9385a10;
                    numMo9385a = num8;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 2:
                    Integer numMo9385a11 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a11 == null) {
                        throw C9756b.m18254m("pos", "pos", jsonReader);
                    }
                    i14 &= -5;
                    num6 = numMo9385a11;
                    numMo9385a = num8;
                    break;
                    break;
                case 3:
                    strMo9385a2 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 4:
                    strMo9385a3 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 5:
                    strMo9385a4 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a5 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a6 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 8:
                    strMo9385a7 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 9:
                    Integer numMo9385a12 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a12 == null) {
                        throw C9756b.m18254m("duration", "duration", jsonReader);
                    }
                    i14 &= -513;
                    num7 = numMo9385a12;
                    numMo9385a = num8;
                    break;
                    break;
                case 10:
                    strMo9385a8 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 11:
                    strMo9385a9 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 12:
                    strMo9385a10 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 13:
                    Integer numMo9385a13 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a13 == null) {
                        throw C9756b.m18254m("wordCount", "wordCount", jsonReader);
                    }
                    i14 &= -8193;
                    num = numMo9385a13;
                    numMo9385a = num8;
                    break;
                    break;
                case 14:
                    Integer numMo9385a14 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a14 == null) {
                        throw C9756b.m18254m("uniqueWordCount", "uniqueWordCount", jsonReader);
                    }
                    i14 &= -16385;
                    num2 = numMo9385a14;
                    numMo9385a = num8;
                    break;
                    break;
                case 15:
                    Integer numMo9385a15 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a15 == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i14 &= -32769;
                    num3 = numMo9385a15;
                    numMo9385a = num8;
                    break;
                    break;
                case 16:
                    Double dMo9385a4 = this.f18631d.mo9385a(jsonReader);
                    if (dMo9385a4 == null) {
                        throw C9756b.m18254m("lessonRating", "lessonRating", jsonReader);
                    }
                    i14 &= -65537;
                    d10 = dMo9385a4;
                    numMo9385a = num8;
                    break;
                    break;
                case 17:
                    Double dMo9385a5 = this.f18631d.mo9385a(jsonReader);
                    if (dMo9385a5 == null) {
                        throw C9756b.m18254m("audioRating", "audioRating", jsonReader);
                    }
                    i14 &= -131073;
                    d11 = dMo9385a5;
                    numMo9385a = num8;
                    break;
                    break;
                case 18:
                    numMo9385a2 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("collectionId", "collectionId", jsonReader);
                    }
                    i10 = -262145;
                    i11 = i10 & i14;
                    i14 = i11;
                    numMo9385a = num8;
                    break;
                    break;
                case 19:
                    strMo9385a11 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 20:
                    strMo9385a12 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 21:
                    mediaSourceMo9385a = this.f18632e.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 22:
                    numMo9385a7 = this.f18633f.mo9385a(jsonReader);
                    i10 = -4194305;
                    i11 = i10 & i14;
                    i14 = i11;
                    numMo9385a = num8;
                    break;
                case 23:
                    numMo9385a8 = this.f18633f.mo9385a(jsonReader);
                    i11 = i14 & (-8388609);
                    i14 = i11;
                    numMo9385a = num8;
                    break;
                case 24:
                    dMo9385a = this.f18631d.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("readTimes", "readTimes", jsonReader);
                    }
                    i10 = -16777217;
                    i11 = i10 & i14;
                    i14 = i11;
                    numMo9385a = num8;
                    break;
                    break;
                case 25:
                    dMo9385a2 = this.f18631d.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("listenTimes", "listenTimes", jsonReader);
                    }
                    i10 = -33554433;
                    i11 = i10 & i14;
                    i14 = i11;
                    numMo9385a = num8;
                    break;
                    break;
                case 26:
                    boolMo9385a = this.f18634g.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isCompleted", "isCompleted", jsonReader);
                    }
                    i10 = -67108865;
                    i11 = i10 & i14;
                    i14 = i11;
                    numMo9385a = num8;
                    break;
                    break;
                case 27:
                    numMo9385a3 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i10 = -134217729;
                    i11 = i10 & i14;
                    i14 = i11;
                    numMo9385a = num8;
                    break;
                    break;
                case 28:
                    numMo9385a4 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i10 = -268435457;
                    i11 = i10 & i14;
                    i14 = i11;
                    numMo9385a = num8;
                    break;
                    break;
                case 29:
                    boolMo9385a2 = this.f18634g.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isRoseGiven", "roseGiven", jsonReader);
                    }
                    i10 = -536870913;
                    i11 = i10 & i14;
                    i14 = i11;
                    numMo9385a = num8;
                    break;
                    break;
                case 30:
                    strMo9385a13 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 31:
                    numMo9385a5 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("price", "price", jsonReader);
                    }
                    i10 = Integer.MAX_VALUE;
                    i11 = i10 & i14;
                    i14 = i11;
                    numMo9385a = num8;
                    break;
                    break;
                case 32:
                    Boolean boolMo9385a7 = this.f18634g.mo9385a(jsonReader);
                    if (boolMo9385a7 == null) {
                        throw C9756b.m18254m("opened", "opened", jsonReader);
                    }
                    i13 &= -2;
                    bool2 = boolMo9385a7;
                    numMo9385a = num8;
                    break;
                    break;
                case 33:
                    Double dMo9385a6 = this.f18631d.mo9385a(jsonReader);
                    if (dMo9385a6 == null) {
                        throw C9756b.m18254m("percentCompleted", "percentCompleted", jsonReader);
                    }
                    i13 &= -3;
                    d12 = dMo9385a6;
                    numMo9385a = num8;
                    break;
                    break;
                case 34:
                    strMo9385a14 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 35:
                    Boolean boolMo9385a8 = this.f18634g.mo9385a(jsonReader);
                    if (boolMo9385a8 == null) {
                        throw C9756b.m18254m("isFavorite", "isFavorite", jsonReader);
                    }
                    i13 &= -9;
                    bool3 = boolMo9385a8;
                    numMo9385a = num8;
                    break;
                    break;
                case 36:
                    strMo9385a15 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 37:
                    strMo9385a16 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 38:
                    strMo9385a17 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 39:
                    strMo9385a18 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 40:
                    Integer numMo9385a16 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a16 == null) {
                        throw C9756b.m18254m("viewsCount", "viewsCount", jsonReader);
                    }
                    i13 &= -257;
                    num4 = numMo9385a16;
                    numMo9385a = num8;
                    break;
                    break;
                case 41:
                    numMo9385a9 = this.f18633f.mo9385a(jsonReader);
                    i13 &= -513;
                    numMo9385a = num8;
                    break;
                case 42:
                    strMo9385a19 = this.f18630c.mo9385a(jsonReader);
                    i13 &= -1025;
                    numMo9385a = num8;
                    break;
                case 43:
                    strMo9385a20 = this.f18630c.mo9385a(jsonReader);
                    i13 &= -2049;
                    numMo9385a = num8;
                    break;
                case 44:
                    strMo9385a21 = this.f18630c.mo9385a(jsonReader);
                    i13 &= -4097;
                    numMo9385a = num8;
                    break;
                case 45:
                    strMo9385a22 = this.f18630c.mo9385a(jsonReader);
                    i13 &= -8193;
                    numMo9385a = num8;
                    break;
                case 46:
                    strMo9385a23 = this.f18630c.mo9385a(jsonReader);
                    i13 &= -16385;
                    numMo9385a = num8;
                    break;
                case 47:
                    strMo9385a24 = this.f18630c.mo9385a(jsonReader);
                    i13 &= -32769;
                    numMo9385a = num8;
                    break;
                case 48:
                    strMo9385a25 = this.f18630c.mo9385a(jsonReader);
                    i13 &= -65537;
                    numMo9385a = num8;
                    break;
                case 49:
                    strMo9385a26 = this.f18630c.mo9385a(jsonReader);
                    i13 &= -131073;
                    numMo9385a = num8;
                    break;
                case 50:
                    boolMo9385a3 = this.f18634g.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isSharedByIsFriend", "isSharedByIsFriend", jsonReader);
                    }
                    i12 = -262145;
                    i13 &= i12;
                    numMo9385a = num8;
                    break;
                    break;
                case 51:
                    boolMo9385a4 = this.f18634g.mo9385a(jsonReader);
                    if (boolMo9385a4 == null) {
                        throw C9756b.m18254m("isCanEdit", "isCanEdit", jsonReader);
                    }
                    i12 = -524289;
                    i13 &= i12;
                    numMo9385a = num8;
                    break;
                    break;
                case 52:
                    numMo9385a = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("lessonVotes", "lessonVotes", jsonReader);
                    }
                    i13 &= -1048577;
                    break;
                    break;
                case 53:
                    numMo9385a6 = this.f18629b.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("audioVotes", "audioVotes", jsonReader);
                    }
                    i12 = -2097153;
                    i13 &= i12;
                    numMo9385a = num8;
                    break;
                    break;
                case 54:
                    strMo9385a27 = this.f18630c.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 55:
                    listMo9385a = this.f18635h.mo9385a(jsonReader);
                    i13 &= -8388609;
                    numMo9385a = num8;
                    break;
                case 56:
                    strMo9385a28 = this.f18636i.mo9385a(jsonReader);
                    if (strMo9385a28 == null) {
                        throw C9756b.m18254m("ofQuery", "ofQuery", jsonReader);
                    }
                    i12 = -16777217;
                    i13 &= i12;
                    numMo9385a = num8;
                    break;
                    break;
                case 57:
                    dMo9385a3 = this.f18631d.mo9385a(jsonReader);
                    if (dMo9385a3 == null) {
                        throw C9756b.m18254m("difficulty", "difficulty", jsonReader);
                    }
                    i12 = -33554433;
                    i13 &= i12;
                    numMo9385a = num8;
                    break;
                    break;
                case 58:
                    boolMo9385a6 = this.f18637j.mo9385a(jsonReader);
                    numMo9385a = num8;
                    break;
                case 59:
                    boolMo9385a5 = this.f18634g.mo9385a(jsonReader);
                    if (boolMo9385a5 == null) {
                        throw C9756b.m18254m("audioPending", "audioPending", jsonReader);
                    }
                    i12 = -134217729;
                    i13 &= i12;
                    numMo9385a = num8;
                    break;
                    break;
                default:
                    numMo9385a = num8;
                    break;
            }
        }
        Integer num9 = numMo9385a;
        jsonReader.mo10508q();
        if (i14 == 1077419514 && i13 == -197132044) {
            int iIntValue = num5.intValue();
            int iIntValue2 = num6.intValue();
            int iIntValue3 = num7.intValue();
            int iIntValue4 = num.intValue();
            int iIntValue5 = num2.intValue();
            int iIntValue6 = num3.intValue();
            double dDoubleValue = d10.doubleValue();
            double dDoubleValue2 = d11.doubleValue();
            int iIntValue7 = numMo9385a2.intValue();
            double dDoubleValue3 = dMo9385a.doubleValue();
            double dDoubleValue4 = dMo9385a2.doubleValue();
            boolean zBooleanValue = boolMo9385a.booleanValue();
            int iIntValue8 = numMo9385a3.intValue();
            int iIntValue9 = numMo9385a4.intValue();
            boolean zBooleanValue2 = boolMo9385a2.booleanValue();
            int iIntValue10 = numMo9385a5.intValue();
            boolean zBooleanValue3 = bool2.booleanValue();
            double dDoubleValue5 = d12.doubleValue();
            boolean zBooleanValue4 = bool3.booleanValue();
            int iIntValue11 = num4.intValue();
            boolean zBooleanValue5 = boolMo9385a3.booleanValue();
            boolean zBooleanValue6 = boolMo9385a4.booleanValue();
            int iIntValue12 = num9.intValue();
            int iIntValue13 = numMo9385a6.intValue();
            String str = strMo9385a28;
            C5207g.m11109d(str, "null cannot be cast to non-null type kotlin.String");
            return new ResultLessonInfo(iIntValue, strMo9385a, iIntValue2, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, strMo9385a7, iIntValue3, strMo9385a8, strMo9385a9, strMo9385a10, iIntValue4, iIntValue5, iIntValue6, dDoubleValue, dDoubleValue2, iIntValue7, strMo9385a11, strMo9385a12, mediaSourceMo9385a, numMo9385a7, numMo9385a8, dDoubleValue3, dDoubleValue4, zBooleanValue, iIntValue8, iIntValue9, zBooleanValue2, strMo9385a13, iIntValue10, zBooleanValue3, dDoubleValue5, strMo9385a14, zBooleanValue4, strMo9385a15, strMo9385a16, strMo9385a17, strMo9385a18, iIntValue11, numMo9385a9, strMo9385a19, strMo9385a20, strMo9385a21, strMo9385a22, strMo9385a23, strMo9385a24, strMo9385a25, strMo9385a26, zBooleanValue5, zBooleanValue6, iIntValue12, iIntValue13, strMo9385a27, listMo9385a, str, dMo9385a3.doubleValue(), boolMo9385a6, boolMo9385a5.booleanValue());
        }
        String str2 = strMo9385a28;
        Constructor<ResultLessonInfo> declaredConstructor = this.f18638k;
        int i15 = i13;
        int i16 = 63;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = ResultLessonInfo.class.getDeclaredConstructor(cls, String.class, cls, String.class, String.class, String.class, String.class, String.class, String.class, cls, String.class, String.class, String.class, cls, cls, cls, cls2, cls2, cls, String.class, String.class, MediaSource.class, Integer.class, Integer.class, cls2, cls2, cls3, cls, cls, cls3, String.class, cls, cls3, cls2, String.class, cls3, String.class, String.class, String.class, String.class, cls, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls3, cls3, cls, cls, String.class, List.class, String.class, cls2, Boolean.class, cls3, cls, cls, C9756b.f49813c);
            this.f18638k = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultLessonInfo::class.…his.constructorRef = it }");
            i16 = 63;
        }
        Object[] objArr = new Object[i16];
        objArr[0] = num5;
        objArr[1] = strMo9385a;
        objArr[2] = num6;
        objArr[3] = strMo9385a2;
        objArr[4] = strMo9385a3;
        objArr[5] = strMo9385a4;
        objArr[6] = strMo9385a5;
        objArr[7] = strMo9385a6;
        objArr[8] = strMo9385a7;
        objArr[9] = num7;
        objArr[10] = strMo9385a8;
        objArr[11] = strMo9385a9;
        objArr[12] = strMo9385a10;
        objArr[13] = num;
        objArr[14] = num2;
        objArr[15] = num3;
        objArr[16] = d10;
        objArr[17] = d11;
        objArr[18] = numMo9385a2;
        objArr[19] = strMo9385a11;
        objArr[20] = strMo9385a12;
        objArr[21] = mediaSourceMo9385a;
        objArr[22] = numMo9385a7;
        objArr[23] = numMo9385a8;
        objArr[24] = dMo9385a;
        objArr[25] = dMo9385a2;
        objArr[26] = boolMo9385a;
        objArr[27] = numMo9385a3;
        objArr[28] = numMo9385a4;
        objArr[29] = boolMo9385a2;
        objArr[30] = strMo9385a13;
        objArr[31] = numMo9385a5;
        objArr[32] = bool2;
        objArr[33] = d12;
        objArr[34] = strMo9385a14;
        objArr[35] = bool3;
        objArr[36] = strMo9385a15;
        objArr[37] = strMo9385a16;
        objArr[38] = strMo9385a17;
        objArr[39] = strMo9385a18;
        objArr[40] = num4;
        objArr[41] = numMo9385a9;
        objArr[42] = strMo9385a19;
        objArr[43] = strMo9385a20;
        objArr[44] = strMo9385a21;
        objArr[45] = strMo9385a22;
        objArr[46] = strMo9385a23;
        objArr[47] = strMo9385a24;
        objArr[48] = strMo9385a25;
        objArr[49] = strMo9385a26;
        objArr[50] = boolMo9385a3;
        objArr[51] = boolMo9385a4;
        objArr[52] = num9;
        objArr[53] = numMo9385a6;
        objArr[54] = strMo9385a27;
        objArr[55] = listMo9385a;
        objArr[56] = str2;
        objArr[57] = dMo9385a3;
        objArr[58] = boolMo9385a6;
        objArr[59] = boolMo9385a5;
        objArr[60] = Integer.valueOf(i14);
        objArr[61] = Integer.valueOf(i15);
        objArr[62] = null;
        ResultLessonInfo resultLessonInfoNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultLessonInfoNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultLessonInfoNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultLessonInfo resultLessonInfo) throws IOException {
        ResultLessonInfo resultLessonInfo2 = resultLessonInfo;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultLessonInfo2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(resultLessonInfo2.f18594a);
        AbstractC4949k<Integer> abstractC4949k = this.f18629b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("url");
        String str = resultLessonInfo2.f18596b;
        AbstractC4949k<String> abstractC4949k2 = this.f18630c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("pos");
        C0166e.m775v(resultLessonInfo2.f18598c, abstractC4949k, abstractC9310n, "title");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18600d);
        abstractC9310n.mo10551C("description");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18602e);
        abstractC9310n.mo10551C("pubDate");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18604f);
        abstractC9310n.mo10551C("imageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18606g);
        abstractC9310n.mo10551C("audio");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18608h);
        abstractC9310n.mo10551C("externalAudio");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18610i);
        abstractC9310n.mo10551C("duration");
        C0166e.m775v(resultLessonInfo2.f18611j, abstractC4949k, abstractC9310n, "status");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18612k);
        abstractC9310n.mo10551C("sharedDate");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18613l);
        abstractC9310n.mo10551C("originalUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18614m);
        abstractC9310n.mo10551C("wordCount");
        C0166e.m775v(resultLessonInfo2.f18615n, abstractC4949k, abstractC9310n, "uniqueWordCount");
        C0166e.m775v(resultLessonInfo2.f18616o, abstractC4949k, abstractC9310n, "rosesCount");
        C0166e.m775v(resultLessonInfo2.f18617p, abstractC4949k, abstractC9310n, "lessonRating");
        Double dValueOf = Double.valueOf(resultLessonInfo2.f18618q);
        AbstractC4949k<Double> abstractC4949k3 = this.f18631d;
        abstractC4949k3.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("audioRating");
        C0204c.m859s(resultLessonInfo2.f18619r, abstractC4949k3, abstractC9310n, "collectionId");
        C0166e.m775v(resultLessonInfo2.f18620s, abstractC4949k, abstractC9310n, "collectionTitle");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18621t);
        abstractC9310n.mo10551C("classicUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18622u);
        abstractC9310n.mo10551C("source");
        this.f18632e.mo9386f(abstractC9310n, resultLessonInfo2.f18623v);
        abstractC9310n.mo10551C("previousLessonId");
        Integer num = resultLessonInfo2.f18624w;
        AbstractC4949k<Integer> abstractC4949k4 = this.f18633f;
        abstractC4949k4.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("nextLessonId");
        abstractC4949k4.mo9386f(abstractC9310n, resultLessonInfo2.f18625x);
        abstractC9310n.mo10551C("readTimes");
        C0204c.m859s(resultLessonInfo2.f18626y, abstractC4949k3, abstractC9310n, "listenTimes");
        C0204c.m859s(resultLessonInfo2.f18627z, abstractC4949k3, abstractC9310n, "isCompleted");
        Boolean boolValueOf = Boolean.valueOf(resultLessonInfo2.f18568A);
        AbstractC4949k<Boolean> abstractC4949k5 = this.f18634g;
        abstractC4949k5.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("newWordsCount");
        C0166e.m775v(resultLessonInfo2.f18569B, abstractC4949k, abstractC9310n, "cardsCount");
        C0166e.m775v(resultLessonInfo2.f18570C, abstractC4949k, abstractC9310n, "roseGiven");
        C0141b.m623s(resultLessonInfo2.f18571D, abstractC4949k5, abstractC9310n, "giveRoseUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18572E);
        abstractC9310n.mo10551C("price");
        C0166e.m775v(resultLessonInfo2.f18573F, abstractC4949k, abstractC9310n, "opened");
        C0141b.m623s(resultLessonInfo2.f18574G, abstractC4949k5, abstractC9310n, "percentCompleted");
        C0204c.m859s(resultLessonInfo2.f18575H, abstractC4949k3, abstractC9310n, "lastRoseReceived");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18576I);
        abstractC9310n.mo10551C("isFavorite");
        C0141b.m623s(resultLessonInfo2.f18577J, abstractC4949k5, abstractC9310n, "printUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18578K);
        abstractC9310n.mo10551C("videoUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18579L);
        abstractC9310n.mo10551C("exercises");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18580M);
        abstractC9310n.mo10551C("notes");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18581N);
        abstractC9310n.mo10551C("viewsCount");
        C0166e.m775v(resultLessonInfo2.f18582O, abstractC4949k, abstractC9310n, "providerId");
        abstractC4949k4.mo9386f(abstractC9310n, resultLessonInfo2.f18583P);
        abstractC9310n.mo10551C("providerName");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18584Q);
        abstractC9310n.mo10551C("providerDescription");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18585R);
        abstractC9310n.mo10551C("originalImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18586S);
        abstractC9310n.mo10551C("providerImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18587T);
        abstractC9310n.mo10551C("sharedById");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18588U);
        abstractC9310n.mo10551C("sharedByName");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18589V);
        abstractC9310n.mo10551C("sharedByImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18590W);
        abstractC9310n.mo10551C("sharedByRole");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18591X);
        abstractC9310n.mo10551C("isSharedByIsFriend");
        C0141b.m623s(resultLessonInfo2.f18592Y, abstractC4949k5, abstractC9310n, "isCanEdit");
        C0141b.m623s(resultLessonInfo2.f18593Z, abstractC4949k5, abstractC9310n, "lessonVotes");
        C0166e.m775v(resultLessonInfo2.f18595a0, abstractC4949k, abstractC9310n, "audioVotes");
        C0166e.m775v(resultLessonInfo2.f18597b0, abstractC4949k, abstractC9310n, "level");
        abstractC4949k2.mo9386f(abstractC9310n, resultLessonInfo2.f18599c0);
        abstractC9310n.mo10551C("tags");
        this.f18635h.mo9386f(abstractC9310n, resultLessonInfo2.f18601d0);
        abstractC9310n.mo10551C("ofQuery");
        this.f18636i.mo9386f(abstractC9310n, resultLessonInfo2.f18603e0);
        abstractC9310n.mo10551C("difficulty");
        C0204c.m859s(resultLessonInfo2.f18605f0, abstractC4949k3, abstractC9310n, "isTaken");
        this.f18637j.mo9386f(abstractC9310n, resultLessonInfo2.f18607g0);
        abstractC9310n.mo10551C("audioPending");
        abstractC4949k5.mo9386f(abstractC9310n, Boolean.valueOf(resultLessonInfo2.f18609h0));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(ResultLessonInfo)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
