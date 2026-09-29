package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LibraryData;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLibraryItemJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultLibraryItem;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultLibraryItemJsonAdapter extends AbstractC4949k<ResultLibraryItem> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18754a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18755b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18756c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f18757d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Double> f18758e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<MediaSource> f18759f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Integer> f18760g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<Boolean> f18761h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<List<String>> f18762i;

    /* JADX INFO: renamed from: j */
    public final AbstractC4949k<Boolean> f18763j;

    /* JADX INFO: renamed from: k */
    public final AbstractC4949k<Float> f18764k;

    /* JADX INFO: renamed from: l */
    public final AbstractC4949k<List<LibraryData>> f18765l;

    /* JADX INFO: renamed from: m */
    public volatile Constructor<ResultLibraryItem> f18766m;

    public ResultLibraryItemJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18754a = JsonReader.C4932a.m10513a("id", "type", "url", "pos", "title", "description", "pubDate", "imageUrl", "audioUrl", "duration", "status", "sharedDate", "originalUrl", "wordCount", "uniqueWordCount", "rosesCount", "lessonRating", "audioRating", "collectionId", "collectionTitle", "classicUrl", "source", "previousLessonId", "nextLessonId", "readTimes", "listenTimes", "isCompleted", "newWordsCount", "cardsCount", "roseGiven", "giveRoseUrl", "price", "opened", "percentCompleted", "lastRoseReceived", "isFavorite", "printUrl", "videoUrl", "exercises", "notes", "viewsCount", "providerId", "providerName", "providerDescription", "originalImageUrl", "providerImageUrl", "sharedById", "sharedByName", "sharedByImageUrl", "sharedByRole", "isSharedByIsFriend", "isCanEdit", "lessonVotes", "audioVotes", "level", "tags", "difficulty", "isTaken", "folders", "audioPending", "lessonsCount", "owner", "progress", "isAvailable", "myCourse", "lessons", "accent", "lessonPreview");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18755b = c4955q.m10565c(cls, emptySet, "id");
        this.f18756c = c4955q.m10565c(String.class, emptySet, "type");
        this.f18757d = c4955q.m10565c(String.class, emptySet, "url");
        this.f18758e = c4955q.m10565c(Double.TYPE, emptySet, "lessonRating");
        this.f18759f = c4955q.m10565c(MediaSource.class, emptySet, "source");
        this.f18760g = c4955q.m10565c(Integer.class, emptySet, "previousLessonId");
        this.f18761h = c4955q.m10565c(Boolean.TYPE, emptySet, "isCompleted");
        this.f18762i = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f18763j = c4955q.m10565c(Boolean.class, emptySet, "isTaken");
        this.f18764k = c4955q.m10565c(Float.class, emptySet, "progress");
        this.f18765l = c4955q.m10565c(C9312p.m17659d(List.class, LibraryData.class), emptySet, "lessons");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultLibraryItem mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        int i11;
        int i12;
        int i13;
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
        Integer num5 = num4;
        Integer num6 = num5;
        Double d10 = dValueOf;
        Double d11 = d10;
        Double dMo9385a = d11;
        Double dMo9385a2 = dMo9385a;
        Double d12 = dMo9385a2;
        Double dMo9385a3 = d12;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Boolean boolMo9385a = bool5;
        Boolean boolMo9385a2 = boolMo9385a;
        Boolean boolMo9385a3 = boolMo9385a2;
        Boolean boolMo9385a4 = boolMo9385a3;
        Boolean bool6 = boolMo9385a4;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
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
        Integer numMo9385a6 = null;
        Integer numMo9385a7 = null;
        String strMo9385a13 = null;
        String strMo9385a14 = null;
        String strMo9385a15 = null;
        String strMo9385a16 = null;
        String strMo9385a17 = null;
        String strMo9385a18 = null;
        Integer numMo9385a8 = null;
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
        Boolean boolMo9385a5 = null;
        List<String> listMo9385a2 = null;
        String strMo9385a28 = null;
        Float fMo9385a = null;
        String strMo9385a29 = null;
        String strMo9385a30 = null;
        List<LibraryData> listMo9385a3 = null;
        Integer num7 = num6;
        Integer num8 = num7;
        Integer num9 = num8;
        while (jsonReader.mo10511w()) {
            Integer num10 = numMo9385a;
            switch (jsonReader.mo10512y0(this.f18754a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    numMo9385a = num10;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    Integer numMo9385a9 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a9 == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i15 &= -2;
                    num7 = numMo9385a9;
                    numMo9385a = num10;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f18756c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("type", "type", jsonReader);
                    }
                    i10 = i15 & (-3);
                    i15 = i10;
                    numMo9385a = num10;
                    break;
                    break;
                case 2:
                    strMo9385a2 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 3:
                    Integer numMo9385a10 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a10 == null) {
                        throw C9756b.m18254m("pos", "pos", jsonReader);
                    }
                    i15 &= -9;
                    num8 = numMo9385a10;
                    numMo9385a = num10;
                    break;
                    break;
                case 4:
                    strMo9385a3 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 5:
                    strMo9385a4 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a5 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a6 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 8:
                    strMo9385a7 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 9:
                    Integer numMo9385a11 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a11 == null) {
                        throw C9756b.m18254m("duration", "duration", jsonReader);
                    }
                    i15 &= -513;
                    num9 = numMo9385a11;
                    numMo9385a = num10;
                    break;
                    break;
                case 10:
                    strMo9385a8 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 11:
                    strMo9385a9 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 12:
                    strMo9385a10 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 13:
                    Integer numMo9385a12 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a12 == null) {
                        throw C9756b.m18254m("wordCount", "wordCount", jsonReader);
                    }
                    i15 &= -8193;
                    num = numMo9385a12;
                    numMo9385a = num10;
                    break;
                    break;
                case 14:
                    Integer numMo9385a13 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a13 == null) {
                        throw C9756b.m18254m("uniqueWordCount", "uniqueWordCount", jsonReader);
                    }
                    i15 &= -16385;
                    num2 = numMo9385a13;
                    numMo9385a = num10;
                    break;
                    break;
                case 15:
                    Integer numMo9385a14 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a14 == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i15 &= -32769;
                    num3 = numMo9385a14;
                    numMo9385a = num10;
                    break;
                    break;
                case 16:
                    Double dMo9385a4 = this.f18758e.mo9385a(jsonReader);
                    if (dMo9385a4 == null) {
                        throw C9756b.m18254m("lessonRating", "lessonRating", jsonReader);
                    }
                    i15 &= -65537;
                    d10 = dMo9385a4;
                    numMo9385a = num10;
                    break;
                    break;
                case 17:
                    Double dMo9385a5 = this.f18758e.mo9385a(jsonReader);
                    if (dMo9385a5 == null) {
                        throw C9756b.m18254m("audioRating", "audioRating", jsonReader);
                    }
                    i15 &= -131073;
                    d11 = dMo9385a5;
                    numMo9385a = num10;
                    break;
                    break;
                case 18:
                    numMo9385a2 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("collectionId", "collectionId", jsonReader);
                    }
                    i11 = -262145;
                    i10 = i11 & i15;
                    i15 = i10;
                    numMo9385a = num10;
                    break;
                    break;
                case 19:
                    strMo9385a11 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 20:
                    strMo9385a12 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 21:
                    mediaSourceMo9385a = this.f18759f.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 22:
                    numMo9385a6 = this.f18760g.mo9385a(jsonReader);
                    i11 = -4194305;
                    i10 = i11 & i15;
                    i15 = i10;
                    numMo9385a = num10;
                    break;
                case 23:
                    numMo9385a7 = this.f18760g.mo9385a(jsonReader);
                    i10 = i15 & (-8388609);
                    i15 = i10;
                    numMo9385a = num10;
                    break;
                case 24:
                    dMo9385a = this.f18758e.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("readTimes", "readTimes", jsonReader);
                    }
                    i11 = -16777217;
                    i10 = i11 & i15;
                    i15 = i10;
                    numMo9385a = num10;
                    break;
                    break;
                case 25:
                    dMo9385a2 = this.f18758e.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("listenTimes", "listenTimes", jsonReader);
                    }
                    i11 = -33554433;
                    i10 = i11 & i15;
                    i15 = i10;
                    numMo9385a = num10;
                    break;
                    break;
                case 26:
                    Boolean boolMo9385a6 = this.f18761h.mo9385a(jsonReader);
                    if (boolMo9385a6 == null) {
                        throw C9756b.m18254m("isCompleted", "isCompleted", jsonReader);
                    }
                    i15 &= -67108865;
                    bool2 = boolMo9385a6;
                    numMo9385a = num10;
                    break;
                    break;
                case 27:
                    numMo9385a3 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i11 = -134217729;
                    i10 = i11 & i15;
                    i15 = i10;
                    numMo9385a = num10;
                    break;
                    break;
                case 28:
                    numMo9385a4 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i11 = -268435457;
                    i10 = i11 & i15;
                    i15 = i10;
                    numMo9385a = num10;
                    break;
                    break;
                case 29:
                    Boolean boolMo9385a7 = this.f18761h.mo9385a(jsonReader);
                    if (boolMo9385a7 == null) {
                        throw C9756b.m18254m("isRoseGiven", "roseGiven", jsonReader);
                    }
                    i15 &= -536870913;
                    bool3 = boolMo9385a7;
                    numMo9385a = num10;
                    break;
                    break;
                case 30:
                    strMo9385a13 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 31:
                    numMo9385a = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("price", "price", jsonReader);
                    }
                    i15 &= Integer.MAX_VALUE;
                    break;
                    break;
                case 32:
                    Boolean boolMo9385a8 = this.f18761h.mo9385a(jsonReader);
                    if (boolMo9385a8 == null) {
                        throw C9756b.m18254m("opened", "opened", jsonReader);
                    }
                    i14 &= -2;
                    bool4 = boolMo9385a8;
                    numMo9385a = num10;
                    break;
                    break;
                case 33:
                    Double dMo9385a6 = this.f18758e.mo9385a(jsonReader);
                    if (dMo9385a6 == null) {
                        throw C9756b.m18254m("percentCompleted", "percentCompleted", jsonReader);
                    }
                    i14 &= -3;
                    d12 = dMo9385a6;
                    numMo9385a = num10;
                    break;
                    break;
                case 34:
                    strMo9385a14 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 35:
                    Boolean boolMo9385a9 = this.f18761h.mo9385a(jsonReader);
                    if (boolMo9385a9 == null) {
                        throw C9756b.m18254m("isFavorite", "isFavorite", jsonReader);
                    }
                    i14 &= -9;
                    bool5 = boolMo9385a9;
                    numMo9385a = num10;
                    break;
                    break;
                case 36:
                    strMo9385a15 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 37:
                    strMo9385a16 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 38:
                    strMo9385a17 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 39:
                    strMo9385a18 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 40:
                    Integer numMo9385a15 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a15 == null) {
                        throw C9756b.m18254m("viewsCount", "viewsCount", jsonReader);
                    }
                    i14 &= -257;
                    num4 = numMo9385a15;
                    numMo9385a = num10;
                    break;
                    break;
                case 41:
                    numMo9385a8 = this.f18760g.mo9385a(jsonReader);
                    i14 &= -513;
                    numMo9385a = num10;
                    break;
                case 42:
                    strMo9385a19 = this.f18757d.mo9385a(jsonReader);
                    i14 &= -1025;
                    numMo9385a = num10;
                    break;
                case 43:
                    strMo9385a20 = this.f18757d.mo9385a(jsonReader);
                    i14 &= -2049;
                    numMo9385a = num10;
                    break;
                case 44:
                    strMo9385a21 = this.f18757d.mo9385a(jsonReader);
                    i14 &= -4097;
                    numMo9385a = num10;
                    break;
                case 45:
                    strMo9385a22 = this.f18757d.mo9385a(jsonReader);
                    i14 &= -8193;
                    numMo9385a = num10;
                    break;
                case 46:
                    strMo9385a23 = this.f18757d.mo9385a(jsonReader);
                    i14 &= -16385;
                    numMo9385a = num10;
                    break;
                case 47:
                    strMo9385a24 = this.f18757d.mo9385a(jsonReader);
                    i14 &= -32769;
                    numMo9385a = num10;
                    break;
                case 48:
                    strMo9385a25 = this.f18757d.mo9385a(jsonReader);
                    i14 &= -65537;
                    numMo9385a = num10;
                    break;
                case 49:
                    strMo9385a26 = this.f18757d.mo9385a(jsonReader);
                    i14 &= -131073;
                    numMo9385a = num10;
                    break;
                case 50:
                    boolMo9385a = this.f18761h.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isSharedByIsFriend", "isSharedByIsFriend", jsonReader);
                    }
                    i12 = -262145;
                    i14 &= i12;
                    numMo9385a = num10;
                    break;
                    break;
                case 51:
                    boolMo9385a2 = this.f18761h.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isCanEdit", "isCanEdit", jsonReader);
                    }
                    i12 = -524289;
                    i14 &= i12;
                    numMo9385a = num10;
                    break;
                    break;
                case 52:
                    numMo9385a5 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("lessonVotes", "lessonVotes", jsonReader);
                    }
                    i12 = -1048577;
                    i14 &= i12;
                    numMo9385a = num10;
                    break;
                    break;
                case 53:
                    Integer numMo9385a16 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a16 == null) {
                        throw C9756b.m18254m("audioVotes", "audioVotes", jsonReader);
                    }
                    num6 = numMo9385a16;
                    i12 = -2097153;
                    i14 &= i12;
                    numMo9385a = num10;
                    break;
                    break;
                case 54:
                    strMo9385a27 = this.f18757d.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 55:
                    listMo9385a = this.f18762i.mo9385a(jsonReader);
                    i14 &= -8388609;
                    numMo9385a = num10;
                    break;
                case 56:
                    dMo9385a3 = this.f18758e.mo9385a(jsonReader);
                    if (dMo9385a3 == null) {
                        throw C9756b.m18254m("difficulty", "difficulty", jsonReader);
                    }
                    i12 = -16777217;
                    i14 &= i12;
                    numMo9385a = num10;
                    break;
                    break;
                case 57:
                    boolMo9385a5 = this.f18763j.mo9385a(jsonReader);
                    numMo9385a = num10;
                    break;
                case 58:
                    listMo9385a2 = this.f18762i.mo9385a(jsonReader);
                    i14 &= -67108865;
                    numMo9385a = num10;
                    break;
                case 59:
                    boolMo9385a3 = this.f18761h.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("audioPending", "audioPending", jsonReader);
                    }
                    i12 = -134217729;
                    i14 &= i12;
                    numMo9385a = num10;
                    break;
                    break;
                case 60:
                    Integer numMo9385a17 = this.f18755b.mo9385a(jsonReader);
                    if (numMo9385a17 == null) {
                        throw C9756b.m18254m("lessonsCount", "lessonsCount", jsonReader);
                    }
                    num5 = numMo9385a17;
                    i12 = -268435457;
                    i14 &= i12;
                    numMo9385a = num10;
                    break;
                    break;
                case 61:
                    strMo9385a28 = this.f18757d.mo9385a(jsonReader);
                    i14 &= -536870913;
                    numMo9385a = num10;
                    break;
                case 62:
                    fMo9385a = this.f18764k.mo9385a(jsonReader);
                    i12 = -1073741825;
                    i14 &= i12;
                    numMo9385a = num10;
                    break;
                case 63:
                    boolMo9385a4 = this.f18761h.mo9385a(jsonReader);
                    if (boolMo9385a4 == null) {
                        throw C9756b.m18254m("isAvailable", "isAvailable", jsonReader);
                    }
                    i12 = Integer.MAX_VALUE;
                    i14 &= i12;
                    numMo9385a = num10;
                    break;
                    break;
                case 64:
                    Boolean boolMo9385a10 = this.f18761h.mo9385a(jsonReader);
                    if (boolMo9385a10 == null) {
                        throw C9756b.m18254m("myCourse", "myCourse", jsonReader);
                    }
                    i16 &= -2;
                    bool6 = boolMo9385a10;
                    numMo9385a = num10;
                    break;
                    break;
                case 65:
                    listMo9385a3 = this.f18765l.mo9385a(jsonReader);
                    if (listMo9385a3 == null) {
                        throw C9756b.m18254m("lessons", "lessons", jsonReader);
                    }
                    i13 = i16 & (-3);
                    i16 = i13;
                    numMo9385a = num10;
                    break;
                    break;
                case 66:
                    strMo9385a29 = this.f18757d.mo9385a(jsonReader);
                    i13 = i16 & (-5);
                    i16 = i13;
                    numMo9385a = num10;
                    break;
                case 67:
                    strMo9385a30 = this.f18757d.mo9385a(jsonReader);
                    i13 = i16 & (-9);
                    i16 = i13;
                    numMo9385a = num10;
                    break;
                default:
                    numMo9385a = num10;
                    break;
            }
        }
        Integer num11 = numMo9385a;
        jsonReader.mo10508q();
        if (i15 == 1077419508 && i14 == 37748980 && i16 == -16) {
            int iIntValue = num7.intValue();
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            int iIntValue2 = num8.intValue();
            int iIntValue3 = num9.intValue();
            int iIntValue4 = num.intValue();
            int iIntValue5 = num2.intValue();
            int iIntValue6 = num3.intValue();
            double dDoubleValue = d10.doubleValue();
            double dDoubleValue2 = d11.doubleValue();
            int iIntValue7 = numMo9385a2.intValue();
            double dDoubleValue3 = dMo9385a.doubleValue();
            double dDoubleValue4 = dMo9385a2.doubleValue();
            boolean zBooleanValue = bool2.booleanValue();
            int iIntValue8 = numMo9385a3.intValue();
            int iIntValue9 = numMo9385a4.intValue();
            boolean zBooleanValue2 = bool3.booleanValue();
            int iIntValue10 = num11.intValue();
            boolean zBooleanValue3 = bool4.booleanValue();
            double dDoubleValue5 = d12.doubleValue();
            boolean zBooleanValue4 = bool5.booleanValue();
            int iIntValue11 = num4.intValue();
            boolean zBooleanValue5 = boolMo9385a.booleanValue();
            boolean zBooleanValue6 = boolMo9385a2.booleanValue();
            int iIntValue12 = numMo9385a5.intValue();
            int iIntValue13 = num6.intValue();
            double dDoubleValue6 = dMo9385a3.doubleValue();
            boolean zBooleanValue7 = boolMo9385a3.booleanValue();
            int iIntValue14 = num5.intValue();
            boolean zBooleanValue8 = boolMo9385a4.booleanValue();
            boolean zBooleanValue9 = bool6.booleanValue();
            List<LibraryData> list = listMo9385a3;
            C5207g.m11109d(list, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.LibraryData?>");
            return new ResultLibraryItem(iIntValue, strMo9385a, strMo9385a2, iIntValue2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, strMo9385a7, iIntValue3, strMo9385a8, strMo9385a9, strMo9385a10, iIntValue4, iIntValue5, iIntValue6, dDoubleValue, dDoubleValue2, iIntValue7, strMo9385a11, strMo9385a12, mediaSourceMo9385a, numMo9385a6, numMo9385a7, dDoubleValue3, dDoubleValue4, zBooleanValue, iIntValue8, iIntValue9, zBooleanValue2, strMo9385a13, iIntValue10, zBooleanValue3, dDoubleValue5, strMo9385a14, zBooleanValue4, strMo9385a15, strMo9385a16, strMo9385a17, strMo9385a18, iIntValue11, numMo9385a8, strMo9385a19, strMo9385a20, strMo9385a21, strMo9385a22, strMo9385a23, strMo9385a24, strMo9385a25, strMo9385a26, zBooleanValue5, zBooleanValue6, iIntValue12, iIntValue13, strMo9385a27, listMo9385a, dDoubleValue6, boolMo9385a5, listMo9385a2, zBooleanValue7, iIntValue14, strMo9385a28, fMo9385a, zBooleanValue8, zBooleanValue9, list, strMo9385a29, strMo9385a30);
        }
        List<LibraryData> list2 = listMo9385a3;
        Constructor<ResultLibraryItem> declaredConstructor = this.f18766m;
        int i17 = i16;
        int i18 = 72;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = ResultLibraryItem.class.getDeclaredConstructor(cls, String.class, String.class, cls, String.class, String.class, String.class, String.class, String.class, cls, String.class, String.class, String.class, cls, cls, cls, cls2, cls2, cls, String.class, String.class, MediaSource.class, Integer.class, Integer.class, cls2, cls2, cls3, cls, cls, cls3, String.class, cls, cls3, cls2, String.class, cls3, String.class, String.class, String.class, String.class, cls, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls3, cls3, cls, cls, String.class, List.class, cls2, Boolean.class, List.class, cls3, cls, String.class, Float.class, cls3, cls3, List.class, String.class, String.class, cls, cls, cls, C9756b.f49813c);
            this.f18766m = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultLibraryItem::class…his.constructorRef = it }");
            i18 = 72;
        }
        Object[] objArr = new Object[i18];
        objArr[0] = num7;
        objArr[1] = strMo9385a;
        objArr[2] = strMo9385a2;
        objArr[3] = num8;
        objArr[4] = strMo9385a3;
        objArr[5] = strMo9385a4;
        objArr[6] = strMo9385a5;
        objArr[7] = strMo9385a6;
        objArr[8] = strMo9385a7;
        objArr[9] = num9;
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
        objArr[22] = numMo9385a6;
        objArr[23] = numMo9385a7;
        objArr[24] = dMo9385a;
        objArr[25] = dMo9385a2;
        objArr[26] = bool2;
        objArr[27] = numMo9385a3;
        objArr[28] = numMo9385a4;
        objArr[29] = bool3;
        objArr[30] = strMo9385a13;
        objArr[31] = num11;
        objArr[32] = bool4;
        objArr[33] = d12;
        objArr[34] = strMo9385a14;
        objArr[35] = bool5;
        objArr[36] = strMo9385a15;
        objArr[37] = strMo9385a16;
        objArr[38] = strMo9385a17;
        objArr[39] = strMo9385a18;
        objArr[40] = num4;
        objArr[41] = numMo9385a8;
        objArr[42] = strMo9385a19;
        objArr[43] = strMo9385a20;
        objArr[44] = strMo9385a21;
        objArr[45] = strMo9385a22;
        objArr[46] = strMo9385a23;
        objArr[47] = strMo9385a24;
        objArr[48] = strMo9385a25;
        objArr[49] = strMo9385a26;
        objArr[50] = boolMo9385a;
        objArr[51] = boolMo9385a2;
        objArr[52] = numMo9385a5;
        objArr[53] = num6;
        objArr[54] = strMo9385a27;
        objArr[55] = listMo9385a;
        objArr[56] = dMo9385a3;
        objArr[57] = boolMo9385a5;
        objArr[58] = listMo9385a2;
        objArr[59] = boolMo9385a3;
        objArr[60] = num5;
        objArr[61] = strMo9385a28;
        objArr[62] = fMo9385a;
        objArr[63] = boolMo9385a4;
        objArr[64] = bool6;
        objArr[65] = list2;
        objArr[66] = strMo9385a29;
        objArr[67] = strMo9385a30;
        objArr[68] = Integer.valueOf(i15);
        objArr[69] = Integer.valueOf(i14);
        objArr[70] = Integer.valueOf(i17);
        objArr[71] = null;
        ResultLibraryItem resultLibraryItemNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultLibraryItemNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultLibraryItemNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultLibraryItem resultLibraryItem) throws IOException {
        ResultLibraryItem resultLibraryItem2 = resultLibraryItem;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultLibraryItem2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(resultLibraryItem2.f18712a);
        AbstractC4949k<Integer> abstractC4949k = this.f18755b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("type");
        this.f18756c.mo9386f(abstractC9310n, resultLibraryItem2.f18714b);
        abstractC9310n.mo10551C("url");
        String str = resultLibraryItem2.f18716c;
        AbstractC4949k<String> abstractC4949k2 = this.f18757d;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("pos");
        C0166e.m775v(resultLibraryItem2.f18718d, abstractC4949k, abstractC9310n, "title");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18720e);
        abstractC9310n.mo10551C("description");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18722f);
        abstractC9310n.mo10551C("pubDate");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18724g);
        abstractC9310n.mo10551C("imageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18726h);
        abstractC9310n.mo10551C("audioUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18728i);
        abstractC9310n.mo10551C("duration");
        C0166e.m775v(resultLibraryItem2.f18730j, abstractC4949k, abstractC9310n, "status");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18732k);
        abstractC9310n.mo10551C("sharedDate");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18734l);
        abstractC9310n.mo10551C("originalUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18736m);
        abstractC9310n.mo10551C("wordCount");
        C0166e.m775v(resultLibraryItem2.f18738n, abstractC4949k, abstractC9310n, "uniqueWordCount");
        C0166e.m775v(resultLibraryItem2.f18740o, abstractC4949k, abstractC9310n, "rosesCount");
        C0166e.m775v(resultLibraryItem2.f18742p, abstractC4949k, abstractC9310n, "lessonRating");
        Double dValueOf = Double.valueOf(resultLibraryItem2.f18744q);
        AbstractC4949k<Double> abstractC4949k3 = this.f18758e;
        abstractC4949k3.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("audioRating");
        C0204c.m859s(resultLibraryItem2.f18745r, abstractC4949k3, abstractC9310n, "collectionId");
        C0166e.m775v(resultLibraryItem2.f18746s, abstractC4949k, abstractC9310n, "collectionTitle");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18747t);
        abstractC9310n.mo10551C("classicUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18748u);
        abstractC9310n.mo10551C("source");
        this.f18759f.mo9386f(abstractC9310n, resultLibraryItem2.f18749v);
        abstractC9310n.mo10551C("previousLessonId");
        Integer num = resultLibraryItem2.f18750w;
        AbstractC4949k<Integer> abstractC4949k4 = this.f18760g;
        abstractC4949k4.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("nextLessonId");
        abstractC4949k4.mo9386f(abstractC9310n, resultLibraryItem2.f18751x);
        abstractC9310n.mo10551C("readTimes");
        C0204c.m859s(resultLibraryItem2.f18752y, abstractC4949k3, abstractC9310n, "listenTimes");
        C0204c.m859s(resultLibraryItem2.f18753z, abstractC4949k3, abstractC9310n, "isCompleted");
        Boolean boolValueOf = Boolean.valueOf(resultLibraryItem2.f18686A);
        AbstractC4949k<Boolean> abstractC4949k5 = this.f18761h;
        abstractC4949k5.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("newWordsCount");
        C0166e.m775v(resultLibraryItem2.f18687B, abstractC4949k, abstractC9310n, "cardsCount");
        C0166e.m775v(resultLibraryItem2.f18688C, abstractC4949k, abstractC9310n, "roseGiven");
        C0141b.m623s(resultLibraryItem2.f18689D, abstractC4949k5, abstractC9310n, "giveRoseUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18690E);
        abstractC9310n.mo10551C("price");
        C0166e.m775v(resultLibraryItem2.f18691F, abstractC4949k, abstractC9310n, "opened");
        C0141b.m623s(resultLibraryItem2.f18692G, abstractC4949k5, abstractC9310n, "percentCompleted");
        C0204c.m859s(resultLibraryItem2.f18693H, abstractC4949k3, abstractC9310n, "lastRoseReceived");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18694I);
        abstractC9310n.mo10551C("isFavorite");
        C0141b.m623s(resultLibraryItem2.f18695J, abstractC4949k5, abstractC9310n, "printUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18696K);
        abstractC9310n.mo10551C("videoUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18697L);
        abstractC9310n.mo10551C("exercises");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18698M);
        abstractC9310n.mo10551C("notes");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18699N);
        abstractC9310n.mo10551C("viewsCount");
        C0166e.m775v(resultLibraryItem2.f18700O, abstractC4949k, abstractC9310n, "providerId");
        abstractC4949k4.mo9386f(abstractC9310n, resultLibraryItem2.f18701P);
        abstractC9310n.mo10551C("providerName");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18702Q);
        abstractC9310n.mo10551C("providerDescription");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18703R);
        abstractC9310n.mo10551C("originalImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18704S);
        abstractC9310n.mo10551C("providerImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18705T);
        abstractC9310n.mo10551C("sharedById");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18706U);
        abstractC9310n.mo10551C("sharedByName");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18707V);
        abstractC9310n.mo10551C("sharedByImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18708W);
        abstractC9310n.mo10551C("sharedByRole");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18709X);
        abstractC9310n.mo10551C("isSharedByIsFriend");
        C0141b.m623s(resultLibraryItem2.f18710Y, abstractC4949k5, abstractC9310n, "isCanEdit");
        C0141b.m623s(resultLibraryItem2.f18711Z, abstractC4949k5, abstractC9310n, "lessonVotes");
        C0166e.m775v(resultLibraryItem2.f18713a0, abstractC4949k, abstractC9310n, "audioVotes");
        C0166e.m775v(resultLibraryItem2.f18715b0, abstractC4949k, abstractC9310n, "level");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18717c0);
        abstractC9310n.mo10551C("tags");
        List<String> list = resultLibraryItem2.f18719d0;
        AbstractC4949k<List<String>> abstractC4949k6 = this.f18762i;
        abstractC4949k6.mo9386f(abstractC9310n, list);
        abstractC9310n.mo10551C("difficulty");
        C0204c.m859s(resultLibraryItem2.f18721e0, abstractC4949k3, abstractC9310n, "isTaken");
        this.f18763j.mo9386f(abstractC9310n, resultLibraryItem2.f18723f0);
        abstractC9310n.mo10551C("folders");
        abstractC4949k6.mo9386f(abstractC9310n, resultLibraryItem2.f18725g0);
        abstractC9310n.mo10551C("audioPending");
        C0141b.m623s(resultLibraryItem2.f18727h0, abstractC4949k5, abstractC9310n, "lessonsCount");
        C0166e.m775v(resultLibraryItem2.f18729i0, abstractC4949k, abstractC9310n, "owner");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18731j0);
        abstractC9310n.mo10551C("progress");
        this.f18764k.mo9386f(abstractC9310n, resultLibraryItem2.f18733k0);
        abstractC9310n.mo10551C("isAvailable");
        C0141b.m623s(resultLibraryItem2.f18735l0, abstractC4949k5, abstractC9310n, "myCourse");
        C0141b.m623s(resultLibraryItem2.f18737m0, abstractC4949k5, abstractC9310n, "lessons");
        this.f18765l.mo9386f(abstractC9310n, resultLibraryItem2.f18739n0);
        abstractC9310n.mo10551C("accent");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18741o0);
        abstractC9310n.mo10551C("lessonPreview");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryItem2.f18743p0);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(39, "GeneratedJsonAdapter(ResultLibraryItem)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
