package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LessonBookmark;
import com.lingq.entity.LessonTranslation;
import com.lingq.entity.LessonUserCompleted;
import com.lingq.entity.LessonUserLiked;
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
import p511yh.C10364a;
import p511yh.C10365b;
import p511yh.C10368e;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultPlaylistJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultPlaylist;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultPlaylistJsonAdapter extends AbstractC4949k<ResultPlaylist> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18896a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18897b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18898c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Double> f18899d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<C10365b> f18900e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<C10368e> f18901f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<List<C10364a>> f18902g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<LessonBookmark> f18903h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<LessonUserLiked> f18904i;

    /* JADX INFO: renamed from: j */
    public final AbstractC4949k<LessonUserCompleted> f18905j;

    /* JADX INFO: renamed from: k */
    public final AbstractC4949k<LessonTranslation> f18906k;

    /* JADX INFO: renamed from: l */
    public final AbstractC4949k<Integer> f18907l;

    /* JADX INFO: renamed from: m */
    public final AbstractC4949k<Boolean> f18908m;

    /* JADX INFO: renamed from: n */
    public final AbstractC4949k<List<String>> f18909n;

    /* JADX INFO: renamed from: o */
    public final AbstractC4949k<String> f18910o;

    /* JADX INFO: renamed from: p */
    public volatile Constructor<ResultPlaylist> f18911p;

    public ResultPlaylistJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18896a = JsonReader.C4932a.m10513a("id", "url", "pos", "title", "description", "pubDate", "imageUrl", "audio", "duration", "status", "sharedDate", "originalUrl", "wordCount", "uniqueWordCount", "text", "normalizedText", "rosesCount", "lessonRating", "audioRating", "collectionId", "collectionTitle", "cards", "words", "tokenizedText", "bookmark", "lastUserLiked", "lastUserCompleted", "translation", "classicUrl", "previousLessonId", "nextLessonId", "readTimes", "listenTimes", "isCompleted", "newWordsCount", "cardsCount", "isRoseGiven", "giveRoseUrl", "price", "opened", "percentCompleted", "lastRoseReceived", "isFavorite", "printUrl", "videoUrl", "exercises", "notes", "viewsCount", "providerId", "providerName", "providerDescription", "originalImageUrl", "providerImageUrl", "sharedById", "sharedByName", "sharedByImageUrl", "sharedByRole", "isSharedByIsFriend", "isCanEdit", "lessonVotes", "audioVotes", "level", "tags", "progressDownloaded", "ofQuery", "type");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18897b = c4955q.m10565c(cls, emptySet, "id");
        this.f18898c = c4955q.m10565c(String.class, emptySet, "url");
        this.f18899d = c4955q.m10565c(Double.TYPE, emptySet, "lessonRating");
        this.f18900e = c4955q.m10565c(C10365b.class, emptySet, "cardsList");
        this.f18901f = c4955q.m10565c(C10368e.class, emptySet, "listWords");
        this.f18902g = c4955q.m10565c(C9312p.m17659d(List.class, C10364a.class), emptySet, "paragraphs");
        this.f18903h = c4955q.m10565c(LessonBookmark.class, emptySet, "bookmark");
        this.f18904i = c4955q.m10565c(LessonUserLiked.class, emptySet, "lastUserLiked");
        this.f18905j = c4955q.m10565c(LessonUserCompleted.class, emptySet, "lastUserCompleted");
        this.f18906k = c4955q.m10565c(LessonTranslation.class, emptySet, "translation");
        this.f18907l = c4955q.m10565c(Integer.class, emptySet, "previousLessonId");
        this.f18908m = c4955q.m10565c(Boolean.TYPE, emptySet, "isCompleted");
        this.f18909n = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f18910o = c4955q.m10565c(String.class, emptySet, "ofQuery");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultPlaylist mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
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
        Integer num4 = num3;
        Integer num5 = num4;
        Integer num6 = num5;
        Integer numMo9385a2 = num6;
        Integer numMo9385a3 = numMo9385a2;
        Integer num7 = numMo9385a3;
        Integer num8 = num7;
        Double d10 = dValueOf;
        Double d11 = d10;
        Double dMo9385a = d11;
        Double d12 = dMo9385a;
        Double d13 = d12;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Boolean boolMo9385a = bool5;
        Boolean boolMo9385a2 = boolMo9385a;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        List<C10364a> listMo9385a = null;
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
        C10365b c10365bMo9385a = null;
        C10368e c10368eMo9385a = null;
        LessonBookmark lessonBookmarkMo9385a = null;
        LessonUserLiked lessonUserLikedMo9385a = null;
        LessonUserCompleted lessonUserCompletedMo9385a = null;
        LessonTranslation lessonTranslationMo9385a = null;
        String strMo9385a13 = null;
        Integer numMo9385a4 = null;
        Integer numMo9385a5 = null;
        String strMo9385a14 = null;
        String strMo9385a15 = null;
        String strMo9385a16 = null;
        String strMo9385a17 = null;
        String strMo9385a18 = null;
        String strMo9385a19 = null;
        Integer numMo9385a6 = null;
        String strMo9385a20 = null;
        String strMo9385a21 = null;
        String strMo9385a22 = null;
        String strMo9385a23 = null;
        String strMo9385a24 = null;
        String strMo9385a25 = null;
        String strMo9385a26 = null;
        String strMo9385a27 = null;
        String strMo9385a28 = null;
        List<String> listMo9385a2 = null;
        String strMo9385a29 = null;
        String strMo9385a30 = null;
        Integer num9 = num8;
        Integer num10 = num9;
        Integer num11 = num10;
        while (jsonReader.mo10511w()) {
            Integer num12 = numMo9385a;
            switch (jsonReader.mo10512y0(this.f18896a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    numMo9385a = num12;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    Integer numMo9385a7 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a7 == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i15 &= -2;
                    num9 = numMo9385a7;
                    numMo9385a = num12;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 2:
                    Integer numMo9385a8 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("pos", "pos", jsonReader);
                    }
                    i15 &= -5;
                    num10 = numMo9385a8;
                    numMo9385a = num12;
                    break;
                    break;
                case 3:
                    strMo9385a2 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 4:
                    strMo9385a3 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 5:
                    strMo9385a4 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a5 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a6 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 8:
                    Integer numMo9385a9 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a9 == null) {
                        throw C9756b.m18254m("duration", "duration", jsonReader);
                    }
                    i15 &= -257;
                    num11 = numMo9385a9;
                    numMo9385a = num12;
                    break;
                    break;
                case 9:
                    strMo9385a7 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 10:
                    strMo9385a8 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 11:
                    strMo9385a9 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 12:
                    Integer numMo9385a10 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a10 == null) {
                        throw C9756b.m18254m("wordCount", "wordCount", jsonReader);
                    }
                    i15 &= -4097;
                    num = numMo9385a10;
                    numMo9385a = num12;
                    break;
                    break;
                case 13:
                    Integer numMo9385a11 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a11 == null) {
                        throw C9756b.m18254m("uniqueWordCount", "uniqueWordCount", jsonReader);
                    }
                    i15 &= -8193;
                    num2 = numMo9385a11;
                    numMo9385a = num12;
                    break;
                    break;
                case 14:
                    strMo9385a10 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 15:
                    strMo9385a11 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 16:
                    Integer numMo9385a12 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a12 == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i15 &= -65537;
                    num3 = numMo9385a12;
                    numMo9385a = num12;
                    break;
                    break;
                case 17:
                    Double dMo9385a2 = this.f18899d.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("lessonRating", "lessonRating", jsonReader);
                    }
                    i15 &= -131073;
                    d10 = dMo9385a2;
                    numMo9385a = num12;
                    break;
                    break;
                case 18:
                    Double dMo9385a3 = this.f18899d.mo9385a(jsonReader);
                    if (dMo9385a3 == null) {
                        throw C9756b.m18254m("audioRating", "audioRating", jsonReader);
                    }
                    i15 &= -262145;
                    d11 = dMo9385a3;
                    numMo9385a = num12;
                    break;
                    break;
                case 19:
                    Integer numMo9385a13 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a13 == null) {
                        throw C9756b.m18254m("collectionId", "collectionId", jsonReader);
                    }
                    i15 &= -524289;
                    num4 = numMo9385a13;
                    numMo9385a = num12;
                    break;
                    break;
                case 20:
                    strMo9385a12 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 21:
                    c10365bMo9385a = this.f18900e.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 22:
                    c10368eMo9385a = this.f18901f.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 23:
                    listMo9385a = this.f18902g.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("paragraphs", "tokenizedText", jsonReader);
                    }
                    i10 = i15 & (-8388609);
                    i15 = i10;
                    numMo9385a = num12;
                    break;
                    break;
                case 24:
                    lessonBookmarkMo9385a = this.f18903h.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 25:
                    lessonUserLikedMo9385a = this.f18904i.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 26:
                    lessonUserCompletedMo9385a = this.f18905j.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 27:
                    lessonTranslationMo9385a = this.f18906k.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 28:
                    strMo9385a13 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 29:
                    numMo9385a4 = this.f18907l.mo9385a(jsonReader);
                    i11 = -536870913;
                    i10 = i11 & i15;
                    i15 = i10;
                    numMo9385a = num12;
                    break;
                case 30:
                    numMo9385a5 = this.f18907l.mo9385a(jsonReader);
                    i11 = -1073741825;
                    i10 = i11 & i15;
                    i15 = i10;
                    numMo9385a = num12;
                    break;
                case 31:
                    dMo9385a = this.f18899d.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("readTimes", "readTimes", jsonReader);
                    }
                    i11 = Integer.MAX_VALUE;
                    i10 = i11 & i15;
                    i15 = i10;
                    numMo9385a = num12;
                    break;
                    break;
                case 32:
                    Double dMo9385a4 = this.f18899d.mo9385a(jsonReader);
                    if (dMo9385a4 == null) {
                        throw C9756b.m18254m("listenTimes", "listenTimes", jsonReader);
                    }
                    i14 &= -2;
                    d12 = dMo9385a4;
                    numMo9385a = num12;
                    break;
                    break;
                case 33:
                    Boolean boolMo9385a3 = this.f18908m.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isCompleted", "isCompleted", jsonReader);
                    }
                    i14 &= -3;
                    bool2 = boolMo9385a3;
                    numMo9385a = num12;
                    break;
                    break;
                case 34:
                    Integer numMo9385a14 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a14 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i14 &= -5;
                    num5 = numMo9385a14;
                    numMo9385a = num12;
                    break;
                    break;
                case 35:
                    Integer numMo9385a15 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a15 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i14 &= -9;
                    num6 = numMo9385a15;
                    numMo9385a = num12;
                    break;
                    break;
                case 36:
                    Boolean boolMo9385a4 = this.f18908m.mo9385a(jsonReader);
                    if (boolMo9385a4 == null) {
                        throw C9756b.m18254m("isRoseGiven", "isRoseGiven", jsonReader);
                    }
                    i14 &= -17;
                    bool3 = boolMo9385a4;
                    numMo9385a = num12;
                    break;
                    break;
                case 37:
                    strMo9385a14 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 38:
                    numMo9385a = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("price", "price", jsonReader);
                    }
                    i14 &= -65;
                    break;
                    break;
                case 39:
                    Boolean boolMo9385a5 = this.f18908m.mo9385a(jsonReader);
                    if (boolMo9385a5 == null) {
                        throw C9756b.m18254m("opened", "opened", jsonReader);
                    }
                    i14 &= -129;
                    bool4 = boolMo9385a5;
                    numMo9385a = num12;
                    break;
                    break;
                case 40:
                    Double dMo9385a5 = this.f18899d.mo9385a(jsonReader);
                    if (dMo9385a5 == null) {
                        throw C9756b.m18254m("percentCompleted", "percentCompleted", jsonReader);
                    }
                    i14 &= -257;
                    d13 = dMo9385a5;
                    numMo9385a = num12;
                    break;
                    break;
                case 41:
                    strMo9385a15 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 42:
                    Boolean boolMo9385a6 = this.f18908m.mo9385a(jsonReader);
                    if (boolMo9385a6 == null) {
                        throw C9756b.m18254m("isFavorite", "isFavorite", jsonReader);
                    }
                    i14 &= -1025;
                    bool5 = boolMo9385a6;
                    numMo9385a = num12;
                    break;
                    break;
                case 43:
                    strMo9385a16 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 44:
                    strMo9385a17 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 45:
                    strMo9385a18 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 46:
                    strMo9385a19 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 47:
                    numMo9385a3 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("viewsCount", "viewsCount", jsonReader);
                    }
                    i12 = -32769;
                    i14 &= i12;
                    numMo9385a = num12;
                    break;
                    break;
                case 48:
                    numMo9385a6 = this.f18907l.mo9385a(jsonReader);
                    i14 &= -65537;
                    numMo9385a = num12;
                    break;
                case 49:
                    strMo9385a20 = this.f18898c.mo9385a(jsonReader);
                    i14 &= -131073;
                    numMo9385a = num12;
                    break;
                case 50:
                    strMo9385a21 = this.f18898c.mo9385a(jsonReader);
                    i14 &= -262145;
                    numMo9385a = num12;
                    break;
                case 51:
                    strMo9385a22 = this.f18898c.mo9385a(jsonReader);
                    i14 &= -524289;
                    numMo9385a = num12;
                    break;
                case 52:
                    strMo9385a23 = this.f18898c.mo9385a(jsonReader);
                    i12 = -1048577;
                    i14 &= i12;
                    numMo9385a = num12;
                    break;
                case 53:
                    strMo9385a24 = this.f18898c.mo9385a(jsonReader);
                    i12 = -2097153;
                    i14 &= i12;
                    numMo9385a = num12;
                    break;
                case 54:
                    strMo9385a25 = this.f18898c.mo9385a(jsonReader);
                    i12 = -4194305;
                    i14 &= i12;
                    numMo9385a = num12;
                    break;
                case 55:
                    strMo9385a26 = this.f18898c.mo9385a(jsonReader);
                    i14 &= -8388609;
                    numMo9385a = num12;
                    break;
                case 56:
                    strMo9385a27 = this.f18898c.mo9385a(jsonReader);
                    i12 = -16777217;
                    i14 &= i12;
                    numMo9385a = num12;
                    break;
                case 57:
                    boolMo9385a = this.f18908m.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isSharedByIsFriend", "isSharedByIsFriend", jsonReader);
                    }
                    i12 = -33554433;
                    i14 &= i12;
                    numMo9385a = num12;
                    break;
                    break;
                case 58:
                    boolMo9385a2 = this.f18908m.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isCanEdit", "isCanEdit", jsonReader);
                    }
                    i12 = -67108865;
                    i14 &= i12;
                    numMo9385a = num12;
                    break;
                    break;
                case 59:
                    numMo9385a2 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("lessonVotes", "lessonVotes", jsonReader);
                    }
                    i12 = -134217729;
                    i14 &= i12;
                    numMo9385a = num12;
                    break;
                    break;
                case 60:
                    Integer numMo9385a16 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a16 == null) {
                        throw C9756b.m18254m("audioVotes", "audioVotes", jsonReader);
                    }
                    num8 = numMo9385a16;
                    i12 = -268435457;
                    i14 &= i12;
                    numMo9385a = num12;
                    break;
                    break;
                case 61:
                    strMo9385a28 = this.f18898c.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 62:
                    listMo9385a2 = this.f18909n.mo9385a(jsonReader);
                    numMo9385a = num12;
                    break;
                case 63:
                    Integer numMo9385a17 = this.f18897b.mo9385a(jsonReader);
                    if (numMo9385a17 == null) {
                        throw C9756b.m18254m("progressDownloaded", "progressDownloaded", jsonReader);
                    }
                    num7 = numMo9385a17;
                    i12 = Integer.MAX_VALUE;
                    i14 &= i12;
                    numMo9385a = num12;
                    break;
                    break;
                case 64:
                    strMo9385a29 = this.f18910o.mo9385a(jsonReader);
                    if (strMo9385a29 == null) {
                        throw C9756b.m18254m("ofQuery", "ofQuery", jsonReader);
                    }
                    i13 = i16 & (-2);
                    i16 = i13;
                    numMo9385a = num12;
                    break;
                    break;
                case 65:
                    strMo9385a30 = this.f18910o.mo9385a(jsonReader);
                    if (strMo9385a30 == null) {
                        throw C9756b.m18254m("type", "type", jsonReader);
                    }
                    i13 = i16 & (-3);
                    i16 = i13;
                    numMo9385a = num12;
                    break;
                    break;
                default:
                    numMo9385a = num12;
                    break;
            }
        }
        Integer num13 = numMo9385a;
        jsonReader.mo10508q();
        if (i15 == 527486714 && i14 == 1610644000 && i16 == -4) {
            int iIntValue = num9.intValue();
            int iIntValue2 = num10.intValue();
            int iIntValue3 = num11.intValue();
            int iIntValue4 = num.intValue();
            int iIntValue5 = num2.intValue();
            int iIntValue6 = num3.intValue();
            double dDoubleValue = d10.doubleValue();
            double dDoubleValue2 = d11.doubleValue();
            int iIntValue7 = num4.intValue();
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.network.result.Paragraph>");
            double dDoubleValue3 = dMo9385a.doubleValue();
            double dDoubleValue4 = d12.doubleValue();
            boolean zBooleanValue = bool2.booleanValue();
            int iIntValue8 = num5.intValue();
            int iIntValue9 = num6.intValue();
            boolean zBooleanValue2 = bool3.booleanValue();
            int iIntValue10 = num13.intValue();
            boolean zBooleanValue3 = bool4.booleanValue();
            double dDoubleValue5 = d13.doubleValue();
            boolean zBooleanValue4 = bool5.booleanValue();
            int iIntValue11 = numMo9385a3.intValue();
            boolean zBooleanValue5 = boolMo9385a.booleanValue();
            boolean zBooleanValue6 = boolMo9385a2.booleanValue();
            int iIntValue12 = numMo9385a2.intValue();
            int iIntValue13 = num8.intValue();
            int iIntValue14 = num7.intValue();
            String str = strMo9385a29;
            C5207g.m11109d(str, "null cannot be cast to non-null type kotlin.String");
            String str2 = strMo9385a30;
            C5207g.m11109d(str2, "null cannot be cast to non-null type kotlin.String");
            return new ResultPlaylist(iIntValue, strMo9385a, iIntValue2, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, iIntValue3, strMo9385a7, strMo9385a8, strMo9385a9, iIntValue4, iIntValue5, strMo9385a10, strMo9385a11, iIntValue6, dDoubleValue, dDoubleValue2, iIntValue7, strMo9385a12, c10365bMo9385a, c10368eMo9385a, listMo9385a, lessonBookmarkMo9385a, lessonUserLikedMo9385a, lessonUserCompletedMo9385a, lessonTranslationMo9385a, strMo9385a13, numMo9385a4, numMo9385a5, dDoubleValue3, dDoubleValue4, zBooleanValue, iIntValue8, iIntValue9, zBooleanValue2, strMo9385a14, iIntValue10, zBooleanValue3, dDoubleValue5, strMo9385a15, zBooleanValue4, strMo9385a16, strMo9385a17, strMo9385a18, strMo9385a19, iIntValue11, numMo9385a6, strMo9385a20, strMo9385a21, strMo9385a22, strMo9385a23, strMo9385a24, strMo9385a25, strMo9385a26, strMo9385a27, zBooleanValue5, zBooleanValue6, iIntValue12, iIntValue13, strMo9385a28, listMo9385a2, iIntValue14, str, str2);
        }
        String str3 = strMo9385a29;
        Constructor<ResultPlaylist> declaredConstructor = this.f18911p;
        int i17 = i16;
        int i18 = 70;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = ResultPlaylist.class.getDeclaredConstructor(cls, String.class, cls, String.class, String.class, String.class, String.class, String.class, cls, String.class, String.class, String.class, cls, cls, String.class, String.class, cls, cls2, cls2, cls, String.class, C10365b.class, C10368e.class, List.class, LessonBookmark.class, LessonUserLiked.class, LessonUserCompleted.class, LessonTranslation.class, String.class, Integer.class, Integer.class, cls2, cls2, cls3, cls, cls, cls3, String.class, cls, cls3, cls2, String.class, cls3, String.class, String.class, String.class, String.class, cls, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls3, cls3, cls, cls, String.class, List.class, cls, String.class, String.class, cls, cls, cls, C9756b.f49813c);
            this.f18911p = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultPlaylist::class.ja…his.constructorRef = it }");
            i18 = 70;
        }
        Object[] objArr = new Object[i18];
        objArr[0] = num9;
        objArr[1] = strMo9385a;
        objArr[2] = num10;
        objArr[3] = strMo9385a2;
        objArr[4] = strMo9385a3;
        objArr[5] = strMo9385a4;
        objArr[6] = strMo9385a5;
        objArr[7] = strMo9385a6;
        objArr[8] = num11;
        objArr[9] = strMo9385a7;
        objArr[10] = strMo9385a8;
        objArr[11] = strMo9385a9;
        objArr[12] = num;
        objArr[13] = num2;
        objArr[14] = strMo9385a10;
        objArr[15] = strMo9385a11;
        objArr[16] = num3;
        objArr[17] = d10;
        objArr[18] = d11;
        objArr[19] = num4;
        objArr[20] = strMo9385a12;
        objArr[21] = c10365bMo9385a;
        objArr[22] = c10368eMo9385a;
        objArr[23] = listMo9385a;
        objArr[24] = lessonBookmarkMo9385a;
        objArr[25] = lessonUserLikedMo9385a;
        objArr[26] = lessonUserCompletedMo9385a;
        objArr[27] = lessonTranslationMo9385a;
        objArr[28] = strMo9385a13;
        objArr[29] = numMo9385a4;
        objArr[30] = numMo9385a5;
        objArr[31] = dMo9385a;
        objArr[32] = d12;
        objArr[33] = bool2;
        objArr[34] = num5;
        objArr[35] = num6;
        objArr[36] = bool3;
        objArr[37] = strMo9385a14;
        objArr[38] = num13;
        objArr[39] = bool4;
        objArr[40] = d13;
        objArr[41] = strMo9385a15;
        objArr[42] = bool5;
        objArr[43] = strMo9385a16;
        objArr[44] = strMo9385a17;
        objArr[45] = strMo9385a18;
        objArr[46] = strMo9385a19;
        objArr[47] = numMo9385a3;
        objArr[48] = numMo9385a6;
        objArr[49] = strMo9385a20;
        objArr[50] = strMo9385a21;
        objArr[51] = strMo9385a22;
        objArr[52] = strMo9385a23;
        objArr[53] = strMo9385a24;
        objArr[54] = strMo9385a25;
        objArr[55] = strMo9385a26;
        objArr[56] = strMo9385a27;
        objArr[57] = boolMo9385a;
        objArr[58] = boolMo9385a2;
        objArr[59] = numMo9385a2;
        objArr[60] = num8;
        objArr[61] = strMo9385a28;
        objArr[62] = listMo9385a2;
        objArr[63] = num7;
        objArr[64] = str3;
        objArr[65] = strMo9385a30;
        objArr[66] = Integer.valueOf(i15);
        objArr[67] = Integer.valueOf(i14);
        objArr[68] = Integer.valueOf(i17);
        objArr[69] = null;
        ResultPlaylist resultPlaylistNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultPlaylistNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultPlaylistNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultPlaylist resultPlaylist) throws IOException {
        ResultPlaylist resultPlaylist2 = resultPlaylist;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultPlaylist2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(resultPlaylist2.f18847a);
        AbstractC4949k<Integer> abstractC4949k = this.f18897b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("url");
        String str = resultPlaylist2.f18849b;
        AbstractC4949k<String> abstractC4949k2 = this.f18898c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("pos");
        C0166e.m775v(resultPlaylist2.f18851c, abstractC4949k, abstractC9310n, "title");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18853d);
        abstractC9310n.mo10551C("description");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18855e);
        abstractC9310n.mo10551C("pubDate");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18857f);
        abstractC9310n.mo10551C("imageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18859g);
        abstractC9310n.mo10551C("audio");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18861h);
        abstractC9310n.mo10551C("duration");
        C0166e.m775v(resultPlaylist2.f18863i, abstractC4949k, abstractC9310n, "status");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18865j);
        abstractC9310n.mo10551C("sharedDate");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18867k);
        abstractC9310n.mo10551C("originalUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18869l);
        abstractC9310n.mo10551C("wordCount");
        C0166e.m775v(resultPlaylist2.f18871m, abstractC4949k, abstractC9310n, "uniqueWordCount");
        C0166e.m775v(resultPlaylist2.f18873n, abstractC4949k, abstractC9310n, "text");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18875o);
        abstractC9310n.mo10551C("normalizedText");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18876p);
        abstractC9310n.mo10551C("rosesCount");
        C0166e.m775v(resultPlaylist2.f18877q, abstractC4949k, abstractC9310n, "lessonRating");
        Double dValueOf = Double.valueOf(resultPlaylist2.f18878r);
        AbstractC4949k<Double> abstractC4949k3 = this.f18899d;
        abstractC4949k3.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("audioRating");
        C0204c.m859s(resultPlaylist2.f18879s, abstractC4949k3, abstractC9310n, "collectionId");
        C0166e.m775v(resultPlaylist2.f18880t, abstractC4949k, abstractC9310n, "collectionTitle");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18881u);
        abstractC9310n.mo10551C("cards");
        this.f18900e.mo9386f(abstractC9310n, resultPlaylist2.f18882v);
        abstractC9310n.mo10551C("words");
        this.f18901f.mo9386f(abstractC9310n, resultPlaylist2.f18883w);
        abstractC9310n.mo10551C("tokenizedText");
        this.f18902g.mo9386f(abstractC9310n, resultPlaylist2.f18884x);
        abstractC9310n.mo10551C("bookmark");
        this.f18903h.mo9386f(abstractC9310n, resultPlaylist2.f18885y);
        abstractC9310n.mo10551C("lastUserLiked");
        this.f18904i.mo9386f(abstractC9310n, resultPlaylist2.f18886z);
        abstractC9310n.mo10551C("lastUserCompleted");
        this.f18905j.mo9386f(abstractC9310n, resultPlaylist2.f18821A);
        abstractC9310n.mo10551C("translation");
        this.f18906k.mo9386f(abstractC9310n, resultPlaylist2.f18822B);
        abstractC9310n.mo10551C("classicUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18823C);
        abstractC9310n.mo10551C("previousLessonId");
        Integer num = resultPlaylist2.f18824D;
        AbstractC4949k<Integer> abstractC4949k4 = this.f18907l;
        abstractC4949k4.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("nextLessonId");
        abstractC4949k4.mo9386f(abstractC9310n, resultPlaylist2.f18825E);
        abstractC9310n.mo10551C("readTimes");
        C0204c.m859s(resultPlaylist2.f18826F, abstractC4949k3, abstractC9310n, "listenTimes");
        C0204c.m859s(resultPlaylist2.f18827G, abstractC4949k3, abstractC9310n, "isCompleted");
        Boolean boolValueOf = Boolean.valueOf(resultPlaylist2.f18828H);
        AbstractC4949k<Boolean> abstractC4949k5 = this.f18908m;
        abstractC4949k5.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("newWordsCount");
        C0166e.m775v(resultPlaylist2.f18829I, abstractC4949k, abstractC9310n, "cardsCount");
        C0166e.m775v(resultPlaylist2.f18830J, abstractC4949k, abstractC9310n, "isRoseGiven");
        C0141b.m623s(resultPlaylist2.f18831K, abstractC4949k5, abstractC9310n, "giveRoseUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18832L);
        abstractC9310n.mo10551C("price");
        C0166e.m775v(resultPlaylist2.f18833M, abstractC4949k, abstractC9310n, "opened");
        C0141b.m623s(resultPlaylist2.f18834N, abstractC4949k5, abstractC9310n, "percentCompleted");
        C0204c.m859s(resultPlaylist2.f18835O, abstractC4949k3, abstractC9310n, "lastRoseReceived");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18836P);
        abstractC9310n.mo10551C("isFavorite");
        C0141b.m623s(resultPlaylist2.f18837Q, abstractC4949k5, abstractC9310n, "printUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18838R);
        abstractC9310n.mo10551C("videoUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18839S);
        abstractC9310n.mo10551C("exercises");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18840T);
        abstractC9310n.mo10551C("notes");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18841U);
        abstractC9310n.mo10551C("viewsCount");
        C0166e.m775v(resultPlaylist2.f18842V, abstractC4949k, abstractC9310n, "providerId");
        abstractC4949k4.mo9386f(abstractC9310n, resultPlaylist2.f18843W);
        abstractC9310n.mo10551C("providerName");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18844X);
        abstractC9310n.mo10551C("providerDescription");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18845Y);
        abstractC9310n.mo10551C("originalImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18846Z);
        abstractC9310n.mo10551C("providerImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18848a0);
        abstractC9310n.mo10551C("sharedById");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18850b0);
        abstractC9310n.mo10551C("sharedByName");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18852c0);
        abstractC9310n.mo10551C("sharedByImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18854d0);
        abstractC9310n.mo10551C("sharedByRole");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18856e0);
        abstractC9310n.mo10551C("isSharedByIsFriend");
        C0141b.m623s(resultPlaylist2.f18858f0, abstractC4949k5, abstractC9310n, "isCanEdit");
        C0141b.m623s(resultPlaylist2.f18860g0, abstractC4949k5, abstractC9310n, "lessonVotes");
        C0166e.m775v(resultPlaylist2.f18862h0, abstractC4949k, abstractC9310n, "audioVotes");
        C0166e.m775v(resultPlaylist2.f18864i0, abstractC4949k, abstractC9310n, "level");
        abstractC4949k2.mo9386f(abstractC9310n, resultPlaylist2.f18866j0);
        abstractC9310n.mo10551C("tags");
        this.f18909n.mo9386f(abstractC9310n, resultPlaylist2.f18868k0);
        abstractC9310n.mo10551C("progressDownloaded");
        C0166e.m775v(resultPlaylist2.f18870l0, abstractC4949k, abstractC9310n, "ofQuery");
        String str2 = resultPlaylist2.f18872m0;
        AbstractC4949k<String> abstractC4949k6 = this.f18910o;
        abstractC4949k6.mo9386f(abstractC9310n, str2);
        abstractC9310n.mo10551C("type");
        abstractC4949k6.mo9386f(abstractC9310n, resultPlaylist2.f18874n0);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(ResultPlaylist)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
