package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LessonTranslation;
import com.lingq.entity.LessonUserCompleted;
import com.lingq.entity.LessonUserLiked;
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
import p511yh.C10364a;
import p511yh.C10365b;
import p511yh.C10368e;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLessonJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultLesson;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultLessonJsonAdapter extends AbstractC4949k<ResultLesson> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18639a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18640b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18641c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Double> f18642d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<C10365b> f18643e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<C10368e> f18644f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<List<C10364a>> f18645g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<ResultLessonBookmark> f18646h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<LessonUserLiked> f18647i;

    /* JADX INFO: renamed from: j */
    public final AbstractC4949k<LessonUserCompleted> f18648j;

    /* JADX INFO: renamed from: k */
    public final AbstractC4949k<LessonTranslation> f18649k;

    /* JADX INFO: renamed from: l */
    public final AbstractC4949k<MediaSource> f18650l;

    /* JADX INFO: renamed from: m */
    public final AbstractC4949k<Integer> f18651m;

    /* JADX INFO: renamed from: n */
    public final AbstractC4949k<Boolean> f18652n;

    /* JADX INFO: renamed from: o */
    public final AbstractC4949k<List<String>> f18653o;

    /* JADX INFO: renamed from: p */
    public volatile Constructor<ResultLesson> f18654p;

    public ResultLessonJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18639a = JsonReader.C4932a.m10513a("contentId", "url", "pos", "title", "description", "pubDate", "imageUrl", "audioUrl", "duration", "status", "sharedDate", "originalUrl", "wordCount", "uniqueWordCount", "text", "normalizedText", "rosesCount", "lessonRating", "audioRating", "collectionId", "collectionTitle", "cards", "words", "tokenizedText", "bookmark", "lastUserLiked", "lastUserCompleted", "translation", "classicUrl", "source", "previousLessonId", "nextLessonId", "readTimes", "listenTimes", "completed", "newWordsCount", "cardsCount", "roseGiven", "giveRoseUrl", "price", "opened", "percentCompleted", "lastRoseReceived", "isFavorite", "printUrl", "videoUrl", "exercises", "notes", "viewsCount", "providerId", "providerName", "providerDescription", "originalImageUrl", "providerImageUrl", "sharedById", "sharedByName", "sharedByImageUrl", "sharedByRole", "isSharedByIsFriend", "canEdit", "canEditSentence", "isProtected", "lessonVotes", "audioVotes", "level", "tags", "audioPending");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18640b = c4955q.m10565c(cls, emptySet, "contentId");
        this.f18641c = c4955q.m10565c(String.class, emptySet, "url");
        this.f18642d = c4955q.m10565c(Double.TYPE, emptySet, "lessonRating");
        this.f18643e = c4955q.m10565c(C10365b.class, emptySet, "cardsList");
        this.f18644f = c4955q.m10565c(C10368e.class, emptySet, "listWords");
        this.f18645g = c4955q.m10565c(C9312p.m17659d(List.class, C10364a.class), emptySet, "paragraphs");
        this.f18646h = c4955q.m10565c(ResultLessonBookmark.class, emptySet, "bookmark");
        this.f18647i = c4955q.m10565c(LessonUserLiked.class, emptySet, "lastUserLiked");
        this.f18648j = c4955q.m10565c(LessonUserCompleted.class, emptySet, "lastUserCompleted");
        this.f18649k = c4955q.m10565c(LessonTranslation.class, emptySet, "translation");
        this.f18650l = c4955q.m10565c(MediaSource.class, emptySet, "source");
        this.f18651m = c4955q.m10565c(Integer.class, emptySet, "previousLessonId");
        this.f18652n = c4955q.m10565c(Boolean.TYPE, emptySet, "completed");
        this.f18653o = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultLesson mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
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
        Integer num4 = num3;
        Integer num5 = num4;
        Integer num6 = num5;
        Integer num7 = num6;
        Integer num8 = num7;
        Integer num9 = num8;
        Double d10 = dValueOf;
        Double d11 = d10;
        Double d12 = d11;
        Double d13 = d12;
        Double d14 = d13;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Boolean boolMo9385a = bool5;
        Boolean boolMo9385a2 = boolMo9385a;
        Boolean boolMo9385a3 = boolMo9385a2;
        Boolean bool6 = boolMo9385a3;
        int i12 = -1;
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
        C10365b c10365bMo9385a = null;
        C10368e c10368eMo9385a = null;
        List<C10364a> listMo9385a = null;
        ResultLessonBookmark resultLessonBookmarkMo9385a = null;
        LessonUserLiked lessonUserLikedMo9385a = null;
        LessonUserCompleted lessonUserCompletedMo9385a = null;
        LessonTranslation lessonTranslationMo9385a = null;
        String strMo9385a13 = null;
        MediaSource mediaSourceMo9385a = null;
        Integer numMo9385a2 = null;
        Integer numMo9385a3 = null;
        String strMo9385a14 = null;
        String strMo9385a15 = null;
        String strMo9385a16 = null;
        String strMo9385a17 = null;
        String strMo9385a18 = null;
        String strMo9385a19 = null;
        Integer numMo9385a4 = null;
        String strMo9385a20 = null;
        String strMo9385a21 = null;
        String strMo9385a22 = null;
        String strMo9385a23 = null;
        String strMo9385a24 = null;
        String strMo9385a25 = null;
        String strMo9385a26 = null;
        String strMo9385a27 = null;
        Integer numMo9385a5 = null;
        String strMo9385a28 = null;
        List<String> listMo9385a2 = null;
        Integer num10 = num9;
        Integer num11 = num10;
        Integer num12 = num11;
        while (jsonReader.mo10511w()) {
            Integer num13 = numMo9385a;
            switch (jsonReader.mo10512y0(this.f18639a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    numMo9385a = num13;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    Integer numMo9385a6 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("contentId", "contentId", jsonReader);
                    }
                    i13 &= -2;
                    num10 = numMo9385a6;
                    numMo9385a = num13;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 2:
                    Integer numMo9385a7 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a7 == null) {
                        throw C9756b.m18254m("pos", "pos", jsonReader);
                    }
                    i13 &= -5;
                    num11 = numMo9385a7;
                    numMo9385a = num13;
                    break;
                    break;
                case 3:
                    strMo9385a2 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 4:
                    strMo9385a3 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 5:
                    strMo9385a4 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a5 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a6 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 8:
                    Integer numMo9385a8 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("duration", "duration", jsonReader);
                    }
                    i13 &= -257;
                    num12 = numMo9385a8;
                    numMo9385a = num13;
                    break;
                    break;
                case 9:
                    strMo9385a7 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 10:
                    strMo9385a8 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 11:
                    strMo9385a9 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 12:
                    Integer numMo9385a9 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a9 == null) {
                        throw C9756b.m18254m("wordCount", "wordCount", jsonReader);
                    }
                    i13 &= -4097;
                    num = numMo9385a9;
                    numMo9385a = num13;
                    break;
                    break;
                case 13:
                    Integer numMo9385a10 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a10 == null) {
                        throw C9756b.m18254m("uniqueWordCount", "uniqueWordCount", jsonReader);
                    }
                    i13 &= -8193;
                    num2 = numMo9385a10;
                    numMo9385a = num13;
                    break;
                    break;
                case 14:
                    strMo9385a10 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 15:
                    strMo9385a11 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 16:
                    Integer numMo9385a11 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a11 == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i13 &= -65537;
                    num3 = numMo9385a11;
                    numMo9385a = num13;
                    break;
                    break;
                case 17:
                    Double dMo9385a = this.f18642d.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("lessonRating", "lessonRating", jsonReader);
                    }
                    i13 &= -131073;
                    d10 = dMo9385a;
                    numMo9385a = num13;
                    break;
                    break;
                case 18:
                    Double dMo9385a2 = this.f18642d.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("audioRating", "audioRating", jsonReader);
                    }
                    i13 &= -262145;
                    d11 = dMo9385a2;
                    numMo9385a = num13;
                    break;
                    break;
                case 19:
                    Integer numMo9385a12 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a12 == null) {
                        throw C9756b.m18254m("collectionId", "collectionId", jsonReader);
                    }
                    i13 &= -524289;
                    num4 = numMo9385a12;
                    numMo9385a = num13;
                    break;
                    break;
                case 20:
                    strMo9385a12 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 21:
                    c10365bMo9385a = this.f18643e.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 22:
                    c10368eMo9385a = this.f18644f.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 23:
                    listMo9385a = this.f18645g.mo9385a(jsonReader);
                    i10 = i13 & (-8388609);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 24:
                    resultLessonBookmarkMo9385a = this.f18646h.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 25:
                    lessonUserLikedMo9385a = this.f18647i.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 26:
                    lessonUserCompletedMo9385a = this.f18648j.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 27:
                    lessonTranslationMo9385a = this.f18649k.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 28:
                    strMo9385a13 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 29:
                    mediaSourceMo9385a = this.f18650l.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 30:
                    numMo9385a2 = this.f18651m.mo9385a(jsonReader);
                    i10 = i13 & (-1073741825);
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 31:
                    numMo9385a3 = this.f18651m.mo9385a(jsonReader);
                    i10 = i13 & Integer.MAX_VALUE;
                    i13 = i10;
                    numMo9385a = num13;
                    break;
                case 32:
                    Double dMo9385a3 = this.f18642d.mo9385a(jsonReader);
                    if (dMo9385a3 == null) {
                        throw C9756b.m18254m("readTimes", "readTimes", jsonReader);
                    }
                    i12 &= -2;
                    d12 = dMo9385a3;
                    numMo9385a = num13;
                    break;
                    break;
                case 33:
                    Double dMo9385a4 = this.f18642d.mo9385a(jsonReader);
                    if (dMo9385a4 == null) {
                        throw C9756b.m18254m("listenTimes", "listenTimes", jsonReader);
                    }
                    i12 &= -3;
                    d13 = dMo9385a4;
                    numMo9385a = num13;
                    break;
                    break;
                case 34:
                    Boolean boolMo9385a4 = this.f18652n.mo9385a(jsonReader);
                    if (boolMo9385a4 == null) {
                        throw C9756b.m18254m("completed", "completed", jsonReader);
                    }
                    i12 &= -5;
                    bool2 = boolMo9385a4;
                    numMo9385a = num13;
                    break;
                    break;
                case 35:
                    Integer numMo9385a13 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a13 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i12 &= -9;
                    num5 = numMo9385a13;
                    numMo9385a = num13;
                    break;
                    break;
                case 36:
                    Integer numMo9385a14 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a14 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i12 &= -17;
                    num6 = numMo9385a14;
                    numMo9385a = num13;
                    break;
                    break;
                case 37:
                    Boolean boolMo9385a5 = this.f18652n.mo9385a(jsonReader);
                    if (boolMo9385a5 == null) {
                        throw C9756b.m18254m("isRoseGiven", "roseGiven", jsonReader);
                    }
                    i12 &= -33;
                    bool3 = boolMo9385a5;
                    numMo9385a = num13;
                    break;
                    break;
                case 38:
                    strMo9385a14 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 39:
                    Integer numMo9385a15 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a15 == null) {
                        throw C9756b.m18254m("price", "price", jsonReader);
                    }
                    i12 &= -129;
                    num7 = numMo9385a15;
                    numMo9385a = num13;
                    break;
                    break;
                case 40:
                    Boolean boolMo9385a6 = this.f18652n.mo9385a(jsonReader);
                    if (boolMo9385a6 == null) {
                        throw C9756b.m18254m("opened", "opened", jsonReader);
                    }
                    i12 &= -257;
                    bool4 = boolMo9385a6;
                    numMo9385a = num13;
                    break;
                    break;
                case 41:
                    Double dMo9385a5 = this.f18642d.mo9385a(jsonReader);
                    if (dMo9385a5 == null) {
                        throw C9756b.m18254m("percentCompleted", "percentCompleted", jsonReader);
                    }
                    i12 &= -513;
                    d14 = dMo9385a5;
                    numMo9385a = num13;
                    break;
                    break;
                case 42:
                    strMo9385a15 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 43:
                    Boolean boolMo9385a7 = this.f18652n.mo9385a(jsonReader);
                    if (boolMo9385a7 == null) {
                        throw C9756b.m18254m("isFavorite", "isFavorite", jsonReader);
                    }
                    i12 &= -2049;
                    bool5 = boolMo9385a7;
                    numMo9385a = num13;
                    break;
                    break;
                case 44:
                    strMo9385a16 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 45:
                    strMo9385a17 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 46:
                    strMo9385a18 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 47:
                    strMo9385a19 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 48:
                    numMo9385a = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("viewsCount", "viewsCount", jsonReader);
                    }
                    i12 &= -65537;
                    break;
                    break;
                case 49:
                    numMo9385a4 = this.f18651m.mo9385a(jsonReader);
                    i12 &= -131073;
                    numMo9385a = num13;
                    break;
                case 50:
                    strMo9385a20 = this.f18641c.mo9385a(jsonReader);
                    i12 &= -262145;
                    numMo9385a = num13;
                    break;
                case 51:
                    strMo9385a21 = this.f18641c.mo9385a(jsonReader);
                    i12 &= -524289;
                    numMo9385a = num13;
                    break;
                case 52:
                    strMo9385a22 = this.f18641c.mo9385a(jsonReader);
                    i11 = -1048577;
                    i12 &= i11;
                    numMo9385a = num13;
                    break;
                case 53:
                    strMo9385a23 = this.f18641c.mo9385a(jsonReader);
                    i11 = -2097153;
                    i12 &= i11;
                    numMo9385a = num13;
                    break;
                case 54:
                    strMo9385a24 = this.f18641c.mo9385a(jsonReader);
                    i11 = -4194305;
                    i12 &= i11;
                    numMo9385a = num13;
                    break;
                case 55:
                    strMo9385a25 = this.f18641c.mo9385a(jsonReader);
                    i12 &= -8388609;
                    numMo9385a = num13;
                    break;
                case 56:
                    strMo9385a26 = this.f18641c.mo9385a(jsonReader);
                    i11 = -16777217;
                    i12 &= i11;
                    numMo9385a = num13;
                    break;
                case 57:
                    strMo9385a27 = this.f18641c.mo9385a(jsonReader);
                    i11 = -33554433;
                    i12 &= i11;
                    numMo9385a = num13;
                    break;
                case 58:
                    boolMo9385a = this.f18652n.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isSharedByIsFriend", "isSharedByIsFriend", jsonReader);
                    }
                    i11 = -67108865;
                    i12 &= i11;
                    numMo9385a = num13;
                    break;
                    break;
                case 59:
                    boolMo9385a2 = this.f18652n.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("canEdit", "canEdit", jsonReader);
                    }
                    i11 = -134217729;
                    i12 &= i11;
                    numMo9385a = num13;
                    break;
                    break;
                case 60:
                    boolMo9385a3 = this.f18652n.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("canEditSentence", "canEditSentence", jsonReader);
                    }
                    i11 = -268435457;
                    i12 &= i11;
                    numMo9385a = num13;
                    break;
                    break;
                case 61:
                    numMo9385a5 = this.f18651m.mo9385a(jsonReader);
                    i11 = -536870913;
                    i12 &= i11;
                    numMo9385a = num13;
                    break;
                case 62:
                    Integer numMo9385a16 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a16 == null) {
                        throw C9756b.m18254m("lessonVotes", "lessonVotes", jsonReader);
                    }
                    i12 &= -1073741825;
                    num8 = numMo9385a16;
                    numMo9385a = num13;
                    break;
                    break;
                case 63:
                    Integer numMo9385a17 = this.f18640b.mo9385a(jsonReader);
                    if (numMo9385a17 == null) {
                        throw C9756b.m18254m("audioVotes", "audioVotes", jsonReader);
                    }
                    i12 &= Integer.MAX_VALUE;
                    num9 = numMo9385a17;
                    numMo9385a = num13;
                    break;
                    break;
                case 64:
                    strMo9385a28 = this.f18641c.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 65:
                    listMo9385a2 = this.f18653o.mo9385a(jsonReader);
                    numMo9385a = num13;
                    break;
                case 66:
                    Boolean boolMo9385a8 = this.f18652n.mo9385a(jsonReader);
                    if (boolMo9385a8 == null) {
                        throw C9756b.m18254m("audioPending", "audioPending", jsonReader);
                    }
                    i14 &= -5;
                    bool6 = boolMo9385a8;
                    numMo9385a = num13;
                    break;
                    break;
                default:
                    numMo9385a = num13;
                    break;
            }
        }
        Integer num14 = numMo9385a;
        jsonReader.mo10508q();
        if (i13 == 1064357626 && i12 == 62528 && i14 == -5) {
            return new ResultLesson(num10.intValue(), strMo9385a, num11.intValue(), strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, num12.intValue(), strMo9385a7, strMo9385a8, strMo9385a9, num.intValue(), num2.intValue(), strMo9385a10, strMo9385a11, num3.intValue(), d10.doubleValue(), d11.doubleValue(), num4.intValue(), strMo9385a12, c10365bMo9385a, c10368eMo9385a, listMo9385a, resultLessonBookmarkMo9385a, lessonUserLikedMo9385a, lessonUserCompletedMo9385a, lessonTranslationMo9385a, strMo9385a13, mediaSourceMo9385a, numMo9385a2, numMo9385a3, d12.doubleValue(), d13.doubleValue(), bool2.booleanValue(), num5.intValue(), num6.intValue(), bool3.booleanValue(), strMo9385a14, num7.intValue(), bool4.booleanValue(), d14.doubleValue(), strMo9385a15, bool5.booleanValue(), strMo9385a16, strMo9385a17, strMo9385a18, strMo9385a19, num14.intValue(), numMo9385a4, strMo9385a20, strMo9385a21, strMo9385a22, strMo9385a23, strMo9385a24, strMo9385a25, strMo9385a26, strMo9385a27, boolMo9385a.booleanValue(), boolMo9385a2.booleanValue(), boolMo9385a3.booleanValue(), numMo9385a5, num8.intValue(), num9.intValue(), strMo9385a28, listMo9385a2, bool6.booleanValue());
        }
        Constructor<ResultLesson> declaredConstructor = this.f18654p;
        int i15 = 71;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = ResultLesson.class.getDeclaredConstructor(cls, String.class, cls, String.class, String.class, String.class, String.class, String.class, cls, String.class, String.class, String.class, cls, cls, String.class, String.class, cls, cls2, cls2, cls, String.class, C10365b.class, C10368e.class, List.class, ResultLessonBookmark.class, LessonUserLiked.class, LessonUserCompleted.class, LessonTranslation.class, String.class, MediaSource.class, Integer.class, Integer.class, cls2, cls2, cls3, cls, cls, cls3, String.class, cls, cls3, cls2, String.class, cls3, String.class, String.class, String.class, String.class, cls, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls3, cls3, cls3, Integer.class, cls, cls, String.class, List.class, cls3, cls, cls, cls, C9756b.f49813c);
            this.f18654p = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultLesson::class.java…his.constructorRef = it }");
            i15 = 71;
        }
        Object[] objArr = new Object[i15];
        objArr[0] = num10;
        objArr[1] = strMo9385a;
        objArr[2] = num11;
        objArr[3] = strMo9385a2;
        objArr[4] = strMo9385a3;
        objArr[5] = strMo9385a4;
        objArr[6] = strMo9385a5;
        objArr[7] = strMo9385a6;
        objArr[8] = num12;
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
        objArr[24] = resultLessonBookmarkMo9385a;
        objArr[25] = lessonUserLikedMo9385a;
        objArr[26] = lessonUserCompletedMo9385a;
        objArr[27] = lessonTranslationMo9385a;
        objArr[28] = strMo9385a13;
        objArr[29] = mediaSourceMo9385a;
        objArr[30] = numMo9385a2;
        objArr[31] = numMo9385a3;
        objArr[32] = d12;
        objArr[33] = d13;
        objArr[34] = bool2;
        objArr[35] = num5;
        objArr[36] = num6;
        objArr[37] = bool3;
        objArr[38] = strMo9385a14;
        objArr[39] = num7;
        objArr[40] = bool4;
        objArr[41] = d14;
        objArr[42] = strMo9385a15;
        objArr[43] = bool5;
        objArr[44] = strMo9385a16;
        objArr[45] = strMo9385a17;
        objArr[46] = strMo9385a18;
        objArr[47] = strMo9385a19;
        objArr[48] = num14;
        objArr[49] = numMo9385a4;
        objArr[50] = strMo9385a20;
        objArr[51] = strMo9385a21;
        objArr[52] = strMo9385a22;
        objArr[53] = strMo9385a23;
        objArr[54] = strMo9385a24;
        objArr[55] = strMo9385a25;
        objArr[56] = strMo9385a26;
        objArr[57] = strMo9385a27;
        objArr[58] = boolMo9385a;
        objArr[59] = boolMo9385a2;
        objArr[60] = boolMo9385a3;
        objArr[61] = numMo9385a5;
        objArr[62] = num8;
        objArr[63] = num9;
        objArr[64] = strMo9385a28;
        objArr[65] = listMo9385a2;
        objArr[66] = bool6;
        objArr[67] = Integer.valueOf(i13);
        objArr[68] = Integer.valueOf(i12);
        objArr[69] = Integer.valueOf(i14);
        objArr[70] = null;
        ResultLesson resultLessonNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultLessonNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultLessonNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultLesson resultLesson) throws IOException {
        ResultLesson resultLesson2 = resultLesson;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultLesson2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("contentId");
        Integer numValueOf = Integer.valueOf(resultLesson2.f18520a);
        AbstractC4949k<Integer> abstractC4949k = this.f18640b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("url");
        String str = resultLesson2.f18522b;
        AbstractC4949k<String> abstractC4949k2 = this.f18641c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("pos");
        C0166e.m775v(resultLesson2.f18524c, abstractC4949k, abstractC9310n, "title");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18526d);
        abstractC9310n.mo10551C("description");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18528e);
        abstractC9310n.mo10551C("pubDate");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18530f);
        abstractC9310n.mo10551C("imageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18532g);
        abstractC9310n.mo10551C("audioUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18534h);
        abstractC9310n.mo10551C("duration");
        C0166e.m775v(resultLesson2.f18536i, abstractC4949k, abstractC9310n, "status");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18538j);
        abstractC9310n.mo10551C("sharedDate");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18540k);
        abstractC9310n.mo10551C("originalUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18542l);
        abstractC9310n.mo10551C("wordCount");
        C0166e.m775v(resultLesson2.f18544m, abstractC4949k, abstractC9310n, "uniqueWordCount");
        C0166e.m775v(resultLesson2.f18546n, abstractC4949k, abstractC9310n, "text");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18548o);
        abstractC9310n.mo10551C("normalizedText");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18550p);
        abstractC9310n.mo10551C("rosesCount");
        C0166e.m775v(resultLesson2.f18551q, abstractC4949k, abstractC9310n, "lessonRating");
        Double dValueOf = Double.valueOf(resultLesson2.f18552r);
        AbstractC4949k<Double> abstractC4949k3 = this.f18642d;
        abstractC4949k3.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("audioRating");
        C0204c.m859s(resultLesson2.f18553s, abstractC4949k3, abstractC9310n, "collectionId");
        C0166e.m775v(resultLesson2.f18554t, abstractC4949k, abstractC9310n, "collectionTitle");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18555u);
        abstractC9310n.mo10551C("cards");
        this.f18643e.mo9386f(abstractC9310n, resultLesson2.f18556v);
        abstractC9310n.mo10551C("words");
        this.f18644f.mo9386f(abstractC9310n, resultLesson2.f18557w);
        abstractC9310n.mo10551C("tokenizedText");
        this.f18645g.mo9386f(abstractC9310n, resultLesson2.f18558x);
        abstractC9310n.mo10551C("bookmark");
        this.f18646h.mo9386f(abstractC9310n, resultLesson2.f18559y);
        abstractC9310n.mo10551C("lastUserLiked");
        this.f18647i.mo9386f(abstractC9310n, resultLesson2.f18560z);
        abstractC9310n.mo10551C("lastUserCompleted");
        this.f18648j.mo9386f(abstractC9310n, resultLesson2.f18494A);
        abstractC9310n.mo10551C("translation");
        this.f18649k.mo9386f(abstractC9310n, resultLesson2.f18495B);
        abstractC9310n.mo10551C("classicUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18496C);
        abstractC9310n.mo10551C("source");
        this.f18650l.mo9386f(abstractC9310n, resultLesson2.f18497D);
        abstractC9310n.mo10551C("previousLessonId");
        Integer num = resultLesson2.f18498E;
        AbstractC4949k<Integer> abstractC4949k4 = this.f18651m;
        abstractC4949k4.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("nextLessonId");
        abstractC4949k4.mo9386f(abstractC9310n, resultLesson2.f18499F);
        abstractC9310n.mo10551C("readTimes");
        C0204c.m859s(resultLesson2.f18500G, abstractC4949k3, abstractC9310n, "listenTimes");
        C0204c.m859s(resultLesson2.f18501H, abstractC4949k3, abstractC9310n, "completed");
        Boolean boolValueOf = Boolean.valueOf(resultLesson2.f18502I);
        AbstractC4949k<Boolean> abstractC4949k5 = this.f18652n;
        abstractC4949k5.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("newWordsCount");
        C0166e.m775v(resultLesson2.f18503J, abstractC4949k, abstractC9310n, "cardsCount");
        C0166e.m775v(resultLesson2.f18504K, abstractC4949k, abstractC9310n, "roseGiven");
        C0141b.m623s(resultLesson2.f18505L, abstractC4949k5, abstractC9310n, "giveRoseUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18506M);
        abstractC9310n.mo10551C("price");
        C0166e.m775v(resultLesson2.f18507N, abstractC4949k, abstractC9310n, "opened");
        C0141b.m623s(resultLesson2.f18508O, abstractC4949k5, abstractC9310n, "percentCompleted");
        C0204c.m859s(resultLesson2.f18509P, abstractC4949k3, abstractC9310n, "lastRoseReceived");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18510Q);
        abstractC9310n.mo10551C("isFavorite");
        C0141b.m623s(resultLesson2.f18511R, abstractC4949k5, abstractC9310n, "printUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18512S);
        abstractC9310n.mo10551C("videoUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18513T);
        abstractC9310n.mo10551C("exercises");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18514U);
        abstractC9310n.mo10551C("notes");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18515V);
        abstractC9310n.mo10551C("viewsCount");
        C0166e.m775v(resultLesson2.f18516W, abstractC4949k, abstractC9310n, "providerId");
        abstractC4949k4.mo9386f(abstractC9310n, resultLesson2.f18517X);
        abstractC9310n.mo10551C("providerName");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18518Y);
        abstractC9310n.mo10551C("providerDescription");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18519Z);
        abstractC9310n.mo10551C("originalImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18521a0);
        abstractC9310n.mo10551C("providerImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18523b0);
        abstractC9310n.mo10551C("sharedById");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18525c0);
        abstractC9310n.mo10551C("sharedByName");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18527d0);
        abstractC9310n.mo10551C("sharedByImageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18529e0);
        abstractC9310n.mo10551C("sharedByRole");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18531f0);
        abstractC9310n.mo10551C("isSharedByIsFriend");
        C0141b.m623s(resultLesson2.f18533g0, abstractC4949k5, abstractC9310n, "canEdit");
        C0141b.m623s(resultLesson2.f18535h0, abstractC4949k5, abstractC9310n, "canEditSentence");
        C0141b.m623s(resultLesson2.f18537i0, abstractC4949k5, abstractC9310n, "isProtected");
        abstractC4949k4.mo9386f(abstractC9310n, resultLesson2.f18539j0);
        abstractC9310n.mo10551C("lessonVotes");
        C0166e.m775v(resultLesson2.f18541k0, abstractC4949k, abstractC9310n, "audioVotes");
        C0166e.m775v(resultLesson2.f18543l0, abstractC4949k, abstractC9310n, "level");
        abstractC4949k2.mo9386f(abstractC9310n, resultLesson2.f18545m0);
        abstractC9310n.mo10551C("tags");
        this.f18653o.mo9386f(abstractC9310n, resultLesson2.f18547n0);
        abstractC9310n.mo10551C("audioPending");
        abstractC4949k5.mo9386f(abstractC9310n, Boolean.valueOf(resultLesson2.f18549o0));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(ResultLesson)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
