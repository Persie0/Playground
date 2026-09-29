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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LessonJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Lesson;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonJsonAdapter extends AbstractC4949k<Lesson> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17153a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17154b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17155c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17156d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Double> f17157e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<LessonUserLiked> f17158f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<LessonUserCompleted> f17159g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<LessonTranslation> f17160h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<List<LessonTransliteration>> f17161i;

    /* JADX INFO: renamed from: j */
    public final AbstractC4949k<MediaSource> f17162j;

    /* JADX INFO: renamed from: k */
    public final AbstractC4949k<Integer> f17163k;

    /* JADX INFO: renamed from: l */
    public final AbstractC4949k<Boolean> f17164l;

    /* JADX INFO: renamed from: m */
    public final AbstractC4949k<List<String>> f17165m;

    /* JADX INFO: renamed from: n */
    public final AbstractC4949k<Float> f17166n;

    /* JADX INFO: renamed from: o */
    public final AbstractC4949k<List<TranslationSentence>> f17167o;

    /* JADX INFO: renamed from: p */
    public final AbstractC4949k<Boolean> f17168p;

    /* JADX INFO: renamed from: q */
    public volatile Constructor<Lesson> f17169q;

    public LessonJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17153a = JsonReader.C4932a.m10513a("id", "type", "url", "pos", "title", "description", "pubDate", "imageUrl", "audioUrl", "duration", "status", "sharedDate", "originalUrl", "wordCount", "uniqueWordCount", "rosesCount", "lessonRating", "audioRating", "collectionId", "collectionTitle", "lastUserLiked", "lastUserCompleted", "translation", "transliteration", "altScript", "classicUrl", "source", "previousLessonId", "nextLessonId", "readTimes", "listenTimes", "isCompleted", "newWordsCount", "cardsCount", "isRoseGiven", "giveRoseUrl", "price", "opened", "percentCompleted", "lastRoseReceived", "isFavorite", "printUrl", "videoUrl", "exercises", "notes", "viewsCount", "providerId", "providerName", "providerDescription", "originalImageUrl", "providerImageUrl", "sharedById", "sharedByName", "sharedByImageUrl", "sharedByRole", "isSharedByIsFriend", "isCanEdit", "canEditSentence", "isProtected", "lessonVotes", "audioVotes", "level", "tags", "progressDownloaded", "progress", "translationSentence", "image_url", "mediaTitle", "ptime", "isPinned", "difficulty", "newWords", "lessonPreview", "isTaken", "folders", "audioPending");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17154b = c4955q.m10565c(cls, emptySet, "id");
        this.f17155c = c4955q.m10565c(String.class, emptySet, "type");
        this.f17156d = c4955q.m10565c(String.class, emptySet, "url");
        this.f17157e = c4955q.m10565c(Double.TYPE, emptySet, "lessonRating");
        this.f17158f = c4955q.m10565c(LessonUserLiked.class, emptySet, "lastUserLiked");
        this.f17159g = c4955q.m10565c(LessonUserCompleted.class, emptySet, "lastUserCompleted");
        this.f17160h = c4955q.m10565c(LessonTranslation.class, emptySet, "translation");
        this.f17161i = c4955q.m10565c(C9312p.m17659d(List.class, LessonTransliteration.class), emptySet, "transliteration");
        this.f17162j = c4955q.m10565c(MediaSource.class, emptySet, "source");
        this.f17163k = c4955q.m10565c(Integer.class, emptySet, "previousLessonId");
        this.f17164l = c4955q.m10565c(Boolean.TYPE, emptySet, "isCompleted");
        this.f17165m = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f17166n = c4955q.m10565c(Float.class, emptySet, "progress");
        this.f17167o = c4955q.m10565c(C9312p.m17659d(List.class, TranslationSentence.class), emptySet, "translationSentence");
        this.f17168p = c4955q.m10565c(Boolean.class, emptySet, "isPinned");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Lesson mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        int i11;
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Double dValueOf = Double.valueOf(0.0d);
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer num = numMo9385a;
        Integer num2 = num;
        Integer numMo9385a2 = num2;
        Integer numMo9385a3 = numMo9385a2;
        Integer num3 = numMo9385a3;
        Integer num4 = num3;
        Integer num5 = num4;
        Integer num6 = num5;
        Integer num7 = num6;
        Integer num8 = num7;
        Integer num9 = num8;
        Double dMo9385a = dValueOf;
        Double dMo9385a2 = dMo9385a;
        Double dMo9385a3 = dMo9385a2;
        Double dMo9385a4 = dMo9385a3;
        Double d10 = dMo9385a4;
        Double d11 = d10;
        Boolean boolMo9385a = bool;
        Boolean bool2 = boolMo9385a;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean boolMo9385a2 = bool4;
        Boolean boolMo9385a3 = boolMo9385a2;
        Boolean boolMo9385a4 = boolMo9385a3;
        Boolean boolMo9385a5 = boolMo9385a4;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        String strMo9385a = null;
        List<LessonTransliteration> listMo9385a = null;
        List<LessonTransliteration> listMo9385a2 = null;
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
        LessonUserLiked lessonUserLikedMo9385a = null;
        LessonUserCompleted lessonUserCompletedMo9385a = null;
        LessonTranslation lessonTranslationMo9385a = null;
        String strMo9385a12 = null;
        MediaSource mediaSourceMo9385a = null;
        Integer numMo9385a4 = null;
        Integer numMo9385a5 = null;
        String strMo9385a13 = null;
        String strMo9385a14 = null;
        String strMo9385a15 = null;
        String strMo9385a16 = null;
        String strMo9385a17 = null;
        String strMo9385a18 = null;
        Integer numMo9385a6 = null;
        String strMo9385a19 = null;
        String strMo9385a20 = null;
        String strMo9385a21 = null;
        String strMo9385a22 = null;
        String strMo9385a23 = null;
        String strMo9385a24 = null;
        String strMo9385a25 = null;
        String strMo9385a26 = null;
        String strMo9385a27 = null;
        List<String> listMo9385a3 = null;
        Float fMo9385a = null;
        String strMo9385a28 = null;
        String strMo9385a29 = null;
        String strMo9385a30 = null;
        Boolean boolMo9385a6 = null;
        Boolean boolMo9385a7 = null;
        List<String> listMo9385a4 = null;
        Boolean boolMo9385a8 = null;
        List<TranslationSentence> listMo9385a5 = null;
        String strMo9385a31 = null;
        Integer num10 = num9;
        Integer num11 = num10;
        Integer num12 = num11;
        while (jsonReader.mo10511w()) {
            Integer num13 = numMo9385a;
            int i15 = -268435457;
            switch (jsonReader.mo10512y0(this.f17153a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    numMo9385a = num13;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    Integer numMo9385a7 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a7 == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i13 &= -2;
                    num10 = numMo9385a7;
                    numMo9385a = num13;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f17155c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("type", "type", jsonReader);
                    }
                    i10 = i13 & (-3);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                    break;
                case 2:
                    strMo9385a2 = this.f17156d.mo9385a(jsonReader);
                    i10 = i13 & (-5);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 3:
                    Integer numMo9385a8 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("pos", "pos", jsonReader);
                    }
                    i13 &= -9;
                    num11 = numMo9385a8;
                    numMo9385a = num13;
                    break;
                    break;
                case 4:
                    strMo9385a3 = this.f17156d.mo9385a(jsonReader);
                    i10 = i13 & (-17);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 5:
                    strMo9385a4 = this.f17156d.mo9385a(jsonReader);
                    i10 = i13 & (-33);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a5 = this.f17156d.mo9385a(jsonReader);
                    i10 = i13 & (-65);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a6 = this.f17156d.mo9385a(jsonReader);
                    i10 = i13 & (-129);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 8:
                    strMo9385a7 = this.f17156d.mo9385a(jsonReader);
                    i10 = i13 & (-257);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 9:
                    Integer numMo9385a9 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a9 == null) {
                        throw C9756b.m18254m("duration", "duration", jsonReader);
                    }
                    i13 &= -513;
                    num12 = numMo9385a9;
                    numMo9385a = num13;
                    break;
                    break;
                case 10:
                    strMo9385a8 = this.f17156d.mo9385a(jsonReader);
                    i10 = i13 & (-1025);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 11:
                    strMo9385a9 = this.f17156d.mo9385a(jsonReader);
                    i10 = i13 & (-2049);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 12:
                    strMo9385a10 = this.f17156d.mo9385a(jsonReader);
                    i10 = i13 & (-4097);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 13:
                    Integer numMo9385a10 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a10 == null) {
                        throw C9756b.m18254m("wordCount", "wordCount", jsonReader);
                    }
                    i13 &= -8193;
                    num = numMo9385a10;
                    numMo9385a = num13;
                    break;
                    break;
                case 14:
                    Integer numMo9385a11 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a11 == null) {
                        throw C9756b.m18254m("uniqueWordCount", "uniqueWordCount", jsonReader);
                    }
                    i13 &= -16385;
                    num2 = numMo9385a11;
                    numMo9385a = num13;
                    break;
                    break;
                case 15:
                    numMo9385a2 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i15 = -32769;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                    break;
                case 16:
                    dMo9385a = this.f17157e.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("lessonRating", "lessonRating", jsonReader);
                    }
                    i15 = -65537;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                    break;
                case 17:
                    dMo9385a2 = this.f17157e.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("audioRating", "audioRating", jsonReader);
                    }
                    i15 = -131073;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                    break;
                case 18:
                    numMo9385a3 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("collectionId", "collectionId", jsonReader);
                    }
                    i15 = -262145;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                    break;
                case 19:
                    strMo9385a11 = this.f17156d.mo9385a(jsonReader);
                    i10 = i13 & (-524289);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 20:
                    lessonUserLikedMo9385a = this.f17158f.mo9385a(jsonReader);
                    i15 = -1048577;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 21:
                    lessonUserCompletedMo9385a = this.f17159g.mo9385a(jsonReader);
                    i15 = -2097153;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 22:
                    lessonTranslationMo9385a = this.f17160h.mo9385a(jsonReader);
                    i15 = -4194305;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 23:
                    listMo9385a2 = this.f17161i.mo9385a(jsonReader);
                    if (listMo9385a2 == null) {
                        throw C9756b.m18254m("transliteration", "transliteration", jsonReader);
                    }
                    i15 = -8388609;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                    break;
                case 24:
                    listMo9385a = this.f17161i.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("altScript", "altScript", jsonReader);
                    }
                    i15 = -16777217;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                    break;
                case 25:
                    strMo9385a12 = this.f17156d.mo9385a(jsonReader);
                    i15 = -33554433;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 26:
                    mediaSourceMo9385a = this.f17162j.mo9385a(jsonReader);
                    i15 = -67108865;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 27:
                    numMo9385a4 = this.f17163k.mo9385a(jsonReader);
                    i15 = -134217729;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 28:
                    numMo9385a5 = this.f17163k.mo9385a(jsonReader);
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 29:
                    dMo9385a3 = this.f17157e.mo9385a(jsonReader);
                    if (dMo9385a3 == null) {
                        throw C9756b.m18254m("readTimes", "readTimes", jsonReader);
                    }
                    i15 = -536870913;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                    break;
                case 30:
                    dMo9385a4 = this.f17157e.mo9385a(jsonReader);
                    if (dMo9385a4 == null) {
                        throw C9756b.m18254m("listenTimes", "listenTimes", jsonReader);
                    }
                    i15 = -1073741825;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                    break;
                case 31:
                    boolMo9385a = this.f17164l.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isCompleted", "isCompleted", jsonReader);
                    }
                    i15 = Integer.MAX_VALUE;
                    i10 = i13 & i15;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                    break;
                case 32:
                    numMo9385a = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i12 &= -2;
                    break;
                    break;
                case 33:
                    Integer numMo9385a12 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a12 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i12 &= -3;
                    num5 = numMo9385a12;
                    numMo9385a = num13;
                    break;
                    break;
                case 34:
                    Boolean boolMo9385a9 = this.f17164l.mo9385a(jsonReader);
                    if (boolMo9385a9 == null) {
                        throw C9756b.m18254m("isRoseGiven", "isRoseGiven", jsonReader);
                    }
                    i12 &= -5;
                    bool2 = boolMo9385a9;
                    numMo9385a = num13;
                    break;
                    break;
                case 35:
                    strMo9385a13 = this.f17156d.mo9385a(jsonReader);
                    i12 &= -9;
                    numMo9385a = num13;
                    break;
                case 36:
                    Integer numMo9385a13 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a13 == null) {
                        throw C9756b.m18254m("price", "price", jsonReader);
                    }
                    i12 &= -17;
                    num4 = numMo9385a13;
                    numMo9385a = num13;
                    break;
                    break;
                case 37:
                    Boolean boolMo9385a10 = this.f17164l.mo9385a(jsonReader);
                    if (boolMo9385a10 == null) {
                        throw C9756b.m18254m("opened", "opened", jsonReader);
                    }
                    i12 &= -33;
                    bool3 = boolMo9385a10;
                    numMo9385a = num13;
                    break;
                    break;
                case 38:
                    Double dMo9385a5 = this.f17157e.mo9385a(jsonReader);
                    if (dMo9385a5 == null) {
                        throw C9756b.m18254m("percentCompleted", "percentCompleted", jsonReader);
                    }
                    i12 &= -65;
                    d10 = dMo9385a5;
                    numMo9385a = num13;
                    break;
                    break;
                case 39:
                    strMo9385a14 = this.f17156d.mo9385a(jsonReader);
                    i12 &= -129;
                    numMo9385a = num13;
                    break;
                case 40:
                    Boolean boolMo9385a11 = this.f17164l.mo9385a(jsonReader);
                    if (boolMo9385a11 == null) {
                        throw C9756b.m18254m("isFavorite", "isFavorite", jsonReader);
                    }
                    i12 &= -257;
                    bool4 = boolMo9385a11;
                    numMo9385a = num13;
                    break;
                    break;
                case 41:
                    strMo9385a15 = this.f17156d.mo9385a(jsonReader);
                    i12 &= -513;
                    numMo9385a = num13;
                    break;
                case 42:
                    strMo9385a16 = this.f17156d.mo9385a(jsonReader);
                    i12 &= -1025;
                    numMo9385a = num13;
                    break;
                case 43:
                    strMo9385a17 = this.f17156d.mo9385a(jsonReader);
                    i12 &= -2049;
                    numMo9385a = num13;
                    break;
                case 44:
                    strMo9385a18 = this.f17156d.mo9385a(jsonReader);
                    i12 &= -4097;
                    numMo9385a = num13;
                    break;
                case 45:
                    Integer numMo9385a14 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a14 == null) {
                        throw C9756b.m18254m("viewsCount", "viewsCount", jsonReader);
                    }
                    i12 &= -8193;
                    num3 = numMo9385a14;
                    numMo9385a = num13;
                    break;
                    break;
                case 46:
                    numMo9385a6 = this.f17163k.mo9385a(jsonReader);
                    i12 &= -16385;
                    numMo9385a = num13;
                    break;
                case 47:
                    strMo9385a19 = this.f17156d.mo9385a(jsonReader);
                    i15 = -32769;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                case 48:
                    strMo9385a20 = this.f17156d.mo9385a(jsonReader);
                    i15 = -65537;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                case 49:
                    strMo9385a21 = this.f17156d.mo9385a(jsonReader);
                    i15 = -131073;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                case 50:
                    strMo9385a22 = this.f17156d.mo9385a(jsonReader);
                    i15 = -262145;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                case 51:
                    strMo9385a23 = this.f17156d.mo9385a(jsonReader);
                    i12 &= -524289;
                    numMo9385a = num13;
                    break;
                case 52:
                    strMo9385a24 = this.f17156d.mo9385a(jsonReader);
                    i15 = -1048577;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                case 53:
                    strMo9385a25 = this.f17156d.mo9385a(jsonReader);
                    i15 = -2097153;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                case 54:
                    strMo9385a26 = this.f17156d.mo9385a(jsonReader);
                    i15 = -4194305;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                case 55:
                    boolMo9385a2 = this.f17164l.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isSharedByIsFriend", "isSharedByIsFriend", jsonReader);
                    }
                    i15 = -8388609;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                    break;
                case 56:
                    boolMo9385a3 = this.f17164l.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isCanEdit", "isCanEdit", jsonReader);
                    }
                    i15 = -16777217;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                    break;
                case 57:
                    boolMo9385a4 = this.f17164l.mo9385a(jsonReader);
                    if (boolMo9385a4 == null) {
                        throw C9756b.m18254m("canEditSentence", "canEditSentence", jsonReader);
                    }
                    i15 = -33554433;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                    break;
                case 58:
                    boolMo9385a5 = this.f17164l.mo9385a(jsonReader);
                    if (boolMo9385a5 == null) {
                        throw C9756b.m18254m("isProtected", "isProtected", jsonReader);
                    }
                    i15 = -67108865;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                    break;
                case 59:
                    Integer numMo9385a15 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a15 == null) {
                        throw C9756b.m18254m("lessonVotes", "lessonVotes", jsonReader);
                    }
                    num9 = numMo9385a15;
                    i15 = -134217729;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                    break;
                case 60:
                    Integer numMo9385a16 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a16 == null) {
                        throw C9756b.m18254m("audioVotes", "audioVotes", jsonReader);
                    }
                    num8 = numMo9385a16;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                    break;
                case 61:
                    strMo9385a27 = this.f17156d.mo9385a(jsonReader);
                    i15 = -536870913;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                case 62:
                    listMo9385a3 = this.f17165m.mo9385a(jsonReader);
                    i15 = -1073741825;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                case 63:
                    Integer numMo9385a17 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a17 == null) {
                        throw C9756b.m18254m("progressDownloaded", "progressDownloaded", jsonReader);
                    }
                    i15 = Integer.MAX_VALUE;
                    num7 = numMo9385a17;
                    i12 &= i15;
                    numMo9385a = num13;
                    break;
                    break;
                case 64:
                    fMo9385a = this.f17166n.mo9385a(jsonReader);
                    i11 = i14 & (-2);
                    i14 = i11;
                    numMo9385a = num13;
                    break;
                case 65:
                    listMo9385a5 = this.f17167o.mo9385a(jsonReader);
                    if (listMo9385a5 == null) {
                        throw C9756b.m18254m("translationSentence", "translationSentence", jsonReader);
                    }
                    i11 = i14 & (-3);
                    i14 = i11;
                    numMo9385a = num13;
                    break;
                    break;
                case 66:
                    strMo9385a28 = this.f17156d.mo9385a(jsonReader);
                    i11 = i14 & (-5);
                    i14 = i11;
                    numMo9385a = num13;
                    break;
                case 67:
                    strMo9385a29 = this.f17156d.mo9385a(jsonReader);
                    i11 = i14 & (-9);
                    i14 = i11;
                    numMo9385a = num13;
                    break;
                case 68:
                    strMo9385a30 = this.f17156d.mo9385a(jsonReader);
                    i11 = i14 & (-17);
                    i14 = i11;
                    numMo9385a = num13;
                    break;
                case 69:
                    boolMo9385a6 = this.f17168p.mo9385a(jsonReader);
                    i11 = i14 & (-33);
                    i14 = i11;
                    numMo9385a = num13;
                    break;
                case 70:
                    Double dMo9385a6 = this.f17157e.mo9385a(jsonReader);
                    if (dMo9385a6 == null) {
                        throw C9756b.m18254m("difficulty", "difficulty", jsonReader);
                    }
                    i14 &= -65;
                    d11 = dMo9385a6;
                    numMo9385a = num13;
                    break;
                    break;
                case 71:
                    Integer numMo9385a18 = this.f17154b.mo9385a(jsonReader);
                    if (numMo9385a18 == null) {
                        throw C9756b.m18254m("newWords", "newWords", jsonReader);
                    }
                    i14 &= -129;
                    num6 = numMo9385a18;
                    numMo9385a = num13;
                    break;
                    break;
                case 72:
                    strMo9385a31 = this.f17155c.mo9385a(jsonReader);
                    if (strMo9385a31 == null) {
                        throw C9756b.m18254m("lessonPreview", "lessonPreview", jsonReader);
                    }
                    i11 = i14 & (-257);
                    i14 = i11;
                    numMo9385a = num13;
                    break;
                    break;
                case 73:
                    boolMo9385a7 = this.f17168p.mo9385a(jsonReader);
                    i11 = i14 & (-513);
                    i14 = i11;
                    numMo9385a = num13;
                    break;
                case 74:
                    listMo9385a4 = this.f17165m.mo9385a(jsonReader);
                    i11 = i14 & (-1025);
                    i14 = i11;
                    numMo9385a = num13;
                    break;
                case 75:
                    boolMo9385a8 = this.f17168p.mo9385a(jsonReader);
                    i11 = i14 & (-2049);
                    i14 = i11;
                    numMo9385a = num13;
                    break;
                default:
                    numMo9385a = num13;
                    break;
            }
        }
        Integer num14 = numMo9385a;
        jsonReader.mo10508q();
        if (i13 != 0 || i12 != 0 || i14 != -4096) {
            List<TranslationSentence> list = listMo9385a5;
            Constructor<Lesson> declaredConstructor = this.f17169q;
            if (declaredConstructor == null) {
                Class cls = Integer.TYPE;
                Class cls2 = Double.TYPE;
                Class cls3 = Boolean.TYPE;
                declaredConstructor = Lesson.class.getDeclaredConstructor(cls, String.class, String.class, cls, String.class, String.class, String.class, String.class, String.class, cls, String.class, String.class, String.class, cls, cls, cls, cls2, cls2, cls, String.class, LessonUserLiked.class, LessonUserCompleted.class, LessonTranslation.class, List.class, List.class, String.class, MediaSource.class, Integer.class, Integer.class, cls2, cls2, cls3, cls, cls, cls3, String.class, cls, cls3, cls2, String.class, cls3, String.class, String.class, String.class, String.class, cls, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls3, cls3, cls3, cls3, cls, cls, String.class, List.class, cls, Float.class, List.class, String.class, String.class, String.class, Boolean.class, cls2, cls, String.class, Boolean.class, List.class, Boolean.class, cls, cls, cls, C9756b.f49813c);
                this.f17169q = declaredConstructor;
                C5207g.m11110e(declaredConstructor, "Lesson::class.java.getDe…his.constructorRef = it }");
            }
            Lesson lessonNewInstance = declaredConstructor.newInstance(num10, strMo9385a, strMo9385a2, num11, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, strMo9385a7, num12, strMo9385a8, strMo9385a9, strMo9385a10, num, num2, numMo9385a2, dMo9385a, dMo9385a2, numMo9385a3, strMo9385a11, lessonUserLikedMo9385a, lessonUserCompletedMo9385a, lessonTranslationMo9385a, listMo9385a2, listMo9385a, strMo9385a12, mediaSourceMo9385a, numMo9385a4, numMo9385a5, dMo9385a3, dMo9385a4, boolMo9385a, num14, num5, bool2, strMo9385a13, num4, bool3, d10, strMo9385a14, bool4, strMo9385a15, strMo9385a16, strMo9385a17, strMo9385a18, num3, numMo9385a6, strMo9385a19, strMo9385a20, strMo9385a21, strMo9385a22, strMo9385a23, strMo9385a24, strMo9385a25, strMo9385a26, boolMo9385a2, boolMo9385a3, boolMo9385a4, boolMo9385a5, num9, num8, strMo9385a27, listMo9385a3, num7, fMo9385a, list, strMo9385a28, strMo9385a29, strMo9385a30, boolMo9385a6, d11, num6, strMo9385a31, boolMo9385a7, listMo9385a4, boolMo9385a8, Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i14), null);
            C5207g.m11110e(lessonNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return lessonNewInstance;
        }
        int iIntValue = num10.intValue();
        C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
        int iIntValue2 = num11.intValue();
        int iIntValue3 = num12.intValue();
        int iIntValue4 = num.intValue();
        int iIntValue5 = num2.intValue();
        int iIntValue6 = numMo9385a2.intValue();
        double dDoubleValue = dMo9385a.doubleValue();
        double dDoubleValue2 = dMo9385a2.doubleValue();
        int iIntValue7 = numMo9385a3.intValue();
        C5207g.m11109d(listMo9385a2, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.LessonTransliteration>");
        C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.LessonTransliteration>");
        double dDoubleValue3 = dMo9385a3.doubleValue();
        double dDoubleValue4 = dMo9385a4.doubleValue();
        boolean zBooleanValue = boolMo9385a.booleanValue();
        int iIntValue8 = num14.intValue();
        int iIntValue9 = num5.intValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        int iIntValue10 = num4.intValue();
        boolean zBooleanValue3 = bool3.booleanValue();
        double dDoubleValue5 = d10.doubleValue();
        boolean zBooleanValue4 = bool4.booleanValue();
        int iIntValue11 = num3.intValue();
        boolean zBooleanValue5 = boolMo9385a2.booleanValue();
        boolean zBooleanValue6 = boolMo9385a3.booleanValue();
        boolean zBooleanValue7 = boolMo9385a4.booleanValue();
        boolean zBooleanValue8 = boolMo9385a5.booleanValue();
        int iIntValue12 = num9.intValue();
        int iIntValue13 = num8.intValue();
        int iIntValue14 = num7.intValue();
        List<TranslationSentence> list2 = listMo9385a5;
        C5207g.m11109d(list2, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.TranslationSentence?>");
        double dDoubleValue6 = d11.doubleValue();
        int iIntValue15 = num6.intValue();
        String str = strMo9385a31;
        C5207g.m11109d(str, "null cannot be cast to non-null type kotlin.String");
        return new Lesson(iIntValue, strMo9385a, strMo9385a2, iIntValue2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, strMo9385a7, iIntValue3, strMo9385a8, strMo9385a9, strMo9385a10, iIntValue4, iIntValue5, iIntValue6, dDoubleValue, dDoubleValue2, iIntValue7, strMo9385a11, lessonUserLikedMo9385a, lessonUserCompletedMo9385a, lessonTranslationMo9385a, listMo9385a2, listMo9385a, strMo9385a12, mediaSourceMo9385a, numMo9385a4, numMo9385a5, dDoubleValue3, dDoubleValue4, zBooleanValue, iIntValue8, iIntValue9, zBooleanValue2, strMo9385a13, iIntValue10, zBooleanValue3, dDoubleValue5, strMo9385a14, zBooleanValue4, strMo9385a15, strMo9385a16, strMo9385a17, strMo9385a18, iIntValue11, numMo9385a6, strMo9385a19, strMo9385a20, strMo9385a21, strMo9385a22, strMo9385a23, strMo9385a24, strMo9385a25, strMo9385a26, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, iIntValue12, iIntValue13, strMo9385a27, listMo9385a3, iIntValue14, fMo9385a, list2, strMo9385a28, strMo9385a29, strMo9385a30, boolMo9385a6, dDoubleValue6, iIntValue15, str, boolMo9385a7, listMo9385a4, boolMo9385a8);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Lesson lesson) throws IOException {
        Lesson lesson2 = lesson;
        C5207g.m11111f(abstractC9310n, "writer");
        if (lesson2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(lesson2.f17093a);
        AbstractC4949k<Integer> abstractC4949k = this.f17154b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("type");
        String str = lesson2.f17095b;
        AbstractC4949k<String> abstractC4949k2 = this.f17155c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("url");
        String str2 = lesson2.f17097c;
        AbstractC4949k<String> abstractC4949k3 = this.f17156d;
        abstractC4949k3.mo9386f(abstractC9310n, str2);
        abstractC9310n.mo10551C("pos");
        C0166e.m775v(lesson2.f17099d, abstractC4949k, abstractC9310n, "title");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17101e);
        abstractC9310n.mo10551C("description");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17103f);
        abstractC9310n.mo10551C("pubDate");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17105g);
        abstractC9310n.mo10551C("imageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17107h);
        abstractC9310n.mo10551C("audioUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17109i);
        abstractC9310n.mo10551C("duration");
        C0166e.m775v(lesson2.f17111j, abstractC4949k, abstractC9310n, "status");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17113k);
        abstractC9310n.mo10551C("sharedDate");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17115l);
        abstractC9310n.mo10551C("originalUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17117m);
        abstractC9310n.mo10551C("wordCount");
        C0166e.m775v(lesson2.f17119n, abstractC4949k, abstractC9310n, "uniqueWordCount");
        C0166e.m775v(lesson2.f17121o, abstractC4949k, abstractC9310n, "rosesCount");
        C0166e.m775v(lesson2.f17123p, abstractC4949k, abstractC9310n, "lessonRating");
        Double dValueOf = Double.valueOf(lesson2.f17125q);
        AbstractC4949k<Double> abstractC4949k4 = this.f17157e;
        abstractC4949k4.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("audioRating");
        C0204c.m859s(lesson2.f17127r, abstractC4949k4, abstractC9310n, "collectionId");
        C0166e.m775v(lesson2.f17129s, abstractC4949k, abstractC9310n, "collectionTitle");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17131t);
        abstractC9310n.mo10551C("lastUserLiked");
        this.f17158f.mo9386f(abstractC9310n, lesson2.f17133u);
        abstractC9310n.mo10551C("lastUserCompleted");
        this.f17159g.mo9386f(abstractC9310n, lesson2.f17135v);
        abstractC9310n.mo10551C("translation");
        this.f17160h.mo9386f(abstractC9310n, lesson2.f17137w);
        abstractC9310n.mo10551C("transliteration");
        List<LessonTransliteration> list = lesson2.f17139x;
        AbstractC4949k<List<LessonTransliteration>> abstractC4949k5 = this.f17161i;
        abstractC4949k5.mo9386f(abstractC9310n, list);
        abstractC9310n.mo10551C("altScript");
        abstractC4949k5.mo9386f(abstractC9310n, lesson2.f17141y);
        abstractC9310n.mo10551C("classicUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17142z);
        abstractC9310n.mo10551C("source");
        this.f17162j.mo9386f(abstractC9310n, lesson2.f17067A);
        abstractC9310n.mo10551C("previousLessonId");
        Integer num = lesson2.f17068B;
        AbstractC4949k<Integer> abstractC4949k6 = this.f17163k;
        abstractC4949k6.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("nextLessonId");
        abstractC4949k6.mo9386f(abstractC9310n, lesson2.f17069C);
        abstractC9310n.mo10551C("readTimes");
        C0204c.m859s(lesson2.f17070D, abstractC4949k4, abstractC9310n, "listenTimes");
        C0204c.m859s(lesson2.f17071E, abstractC4949k4, abstractC9310n, "isCompleted");
        Boolean boolValueOf = Boolean.valueOf(lesson2.f17072F);
        AbstractC4949k<Boolean> abstractC4949k7 = this.f17164l;
        abstractC4949k7.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("newWordsCount");
        C0166e.m775v(lesson2.f17073G, abstractC4949k, abstractC9310n, "cardsCount");
        C0166e.m775v(lesson2.f17074H, abstractC4949k, abstractC9310n, "isRoseGiven");
        C0141b.m623s(lesson2.f17075I, abstractC4949k7, abstractC9310n, "giveRoseUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17076J);
        abstractC9310n.mo10551C("price");
        C0166e.m775v(lesson2.f17077K, abstractC4949k, abstractC9310n, "opened");
        C0141b.m623s(lesson2.f17078L, abstractC4949k7, abstractC9310n, "percentCompleted");
        C0204c.m859s(lesson2.f17079M, abstractC4949k4, abstractC9310n, "lastRoseReceived");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17080N);
        abstractC9310n.mo10551C("isFavorite");
        C0141b.m623s(lesson2.f17081O, abstractC4949k7, abstractC9310n, "printUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17082P);
        abstractC9310n.mo10551C("videoUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17083Q);
        abstractC9310n.mo10551C("exercises");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17084R);
        abstractC9310n.mo10551C("notes");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17085S);
        abstractC9310n.mo10551C("viewsCount");
        C0166e.m775v(lesson2.f17086T, abstractC4949k, abstractC9310n, "providerId");
        abstractC4949k6.mo9386f(abstractC9310n, lesson2.f17087U);
        abstractC9310n.mo10551C("providerName");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17088V);
        abstractC9310n.mo10551C("providerDescription");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17089W);
        abstractC9310n.mo10551C("originalImageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17090X);
        abstractC9310n.mo10551C("providerImageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17091Y);
        abstractC9310n.mo10551C("sharedById");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17092Z);
        abstractC9310n.mo10551C("sharedByName");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17094a0);
        abstractC9310n.mo10551C("sharedByImageUrl");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17096b0);
        abstractC9310n.mo10551C("sharedByRole");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17098c0);
        abstractC9310n.mo10551C("isSharedByIsFriend");
        C0141b.m623s(lesson2.f17100d0, abstractC4949k7, abstractC9310n, "isCanEdit");
        C0141b.m623s(lesson2.f17102e0, abstractC4949k7, abstractC9310n, "canEditSentence");
        C0141b.m623s(lesson2.f17104f0, abstractC4949k7, abstractC9310n, "isProtected");
        C0141b.m623s(lesson2.f17106g0, abstractC4949k7, abstractC9310n, "lessonVotes");
        C0166e.m775v(lesson2.f17108h0, abstractC4949k, abstractC9310n, "audioVotes");
        C0166e.m775v(lesson2.f17110i0, abstractC4949k, abstractC9310n, "level");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17112j0);
        abstractC9310n.mo10551C("tags");
        List<String> list2 = lesson2.f17114k0;
        AbstractC4949k<List<String>> abstractC4949k8 = this.f17165m;
        abstractC4949k8.mo9386f(abstractC9310n, list2);
        abstractC9310n.mo10551C("progressDownloaded");
        C0166e.m775v(lesson2.f17116l0, abstractC4949k, abstractC9310n, "progress");
        this.f17166n.mo9386f(abstractC9310n, lesson2.f17118m0);
        abstractC9310n.mo10551C("translationSentence");
        this.f17167o.mo9386f(abstractC9310n, lesson2.f17120n0);
        abstractC9310n.mo10551C("image_url");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17122o0);
        abstractC9310n.mo10551C("mediaTitle");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17124p0);
        abstractC9310n.mo10551C("ptime");
        abstractC4949k3.mo9386f(abstractC9310n, lesson2.f17126q0);
        abstractC9310n.mo10551C("isPinned");
        Boolean bool = lesson2.f17128r0;
        AbstractC4949k<Boolean> abstractC4949k9 = this.f17168p;
        abstractC4949k9.mo9386f(abstractC9310n, bool);
        abstractC9310n.mo10551C("difficulty");
        C0204c.m859s(lesson2.f17130s0, abstractC4949k4, abstractC9310n, "newWords");
        C0166e.m775v(lesson2.f17132t0, abstractC4949k, abstractC9310n, "lessonPreview");
        abstractC4949k2.mo9386f(abstractC9310n, lesson2.f17134u0);
        abstractC9310n.mo10551C("isTaken");
        abstractC4949k9.mo9386f(abstractC9310n, lesson2.f17136v0);
        abstractC9310n.mo10551C("folders");
        abstractC4949k8.mo9386f(abstractC9310n, lesson2.f17138w0);
        abstractC9310n.mo10551C("audioPending");
        abstractC4949k9.mo9386f(abstractC9310n, lesson2.f17140x0);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(28, "GeneratedJsonAdapter(Lesson)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
