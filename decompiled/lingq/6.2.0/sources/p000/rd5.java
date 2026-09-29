package p000;

import androidx.glance.appwidget.protobuf.C0683q;
import androidx.room.AbstractC0746d;
import androidx.work.impl.WorkDatabase_Impl;
import com.lingq.core.database.LingQDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class rd5 extends lq2 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f59112d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0746d f59113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd5(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.f59113e = workDatabase_Impl;
    }

    /* JADX INFO: renamed from: w */
    private final mc0 m20586w(bk8 bk8Var) throws Exception {
        bk8Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap.put("type", new vq9("type", "TEXT", 0, true, 1, "'content'"));
        linkedHashMap.put("url", new vq9("url", "TEXT", 0, false, 1, null));
        linkedHashMap.put("pos", new vq9("pos", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("title", new vq9("title", "TEXT", 0, false, 1, null));
        linkedHashMap.put("description", new vq9("description", "TEXT", 0, false, 1, null));
        linkedHashMap.put("pubDate", new vq9("pubDate", "TEXT", 0, false, 1, null));
        linkedHashMap.put("imageUrl", new vq9("imageUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("audioUrl", new vq9("audioUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("duration", new vq9("duration", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("status", new vq9("status", "TEXT", 0, false, 1, null));
        linkedHashMap.put("sharedDate", new vq9("sharedDate", "TEXT", 0, false, 1, null));
        linkedHashMap.put("originalUrl", new vq9("originalUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("wordCount", new vq9("wordCount", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("uniqueWordCount", new vq9("uniqueWordCount", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("rosesCount", new vq9("rosesCount", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("lessonRating", new vq9("lessonRating", "REAL", 0, true, 1, null));
        linkedHashMap.put("audioRating", new vq9("audioRating", "REAL", 0, true, 1, null));
        linkedHashMap.put("collectionId", new vq9("collectionId", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("collectionTitle", new vq9("collectionTitle", "TEXT", 0, false, 1, null));
        linkedHashMap.put("transliteration", new vq9("transliteration", "TEXT", 0, true, 1, null));
        linkedHashMap.put("altScript", new vq9("altScript", "TEXT", 0, true, 1, null));
        linkedHashMap.put("classicUrl", new vq9("classicUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("sourceType", new vq9("sourceType", "TEXT", 0, false, 1, null));
        linkedHashMap.put("sourceName", new vq9("sourceName", "TEXT", 0, false, 1, null));
        linkedHashMap.put("sourceUrl", new vq9("sourceUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("previousLessonId", new vq9("previousLessonId", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("nextLessonId", new vq9("nextLessonId", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("readTimes", new vq9("readTimes", "REAL", 0, true, 1, null));
        linkedHashMap.put("listenTimes", new vq9("listenTimes", "REAL", 0, true, 1, null));
        linkedHashMap.put("isCompleted", new vq9("isCompleted", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("newWordsCount", new vq9("newWordsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("cardsCount", new vq9("cardsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("isRoseGiven", new vq9("isRoseGiven", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("giveRoseUrl", new vq9("giveRoseUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("price", new vq9("price", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("opened", new vq9("opened", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("percentCompleted", new vq9("percentCompleted", "REAL", 0, true, 1, null));
        linkedHashMap.put("lastRoseReceived", new vq9("lastRoseReceived", "TEXT", 0, false, 1, null));
        linkedHashMap.put("isFavorite", new vq9("isFavorite", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("printUrl", new vq9("printUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("videoUrl", new vq9("videoUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("exercises", new vq9("exercises", "TEXT", 0, false, 1, null));
        linkedHashMap.put("notes", new vq9("notes", "TEXT", 0, false, 1, null));
        linkedHashMap.put("viewsCount", new vq9("viewsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("providerId", new vq9("providerId", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("providerName", new vq9("providerName", "TEXT", 0, false, 1, null));
        linkedHashMap.put("providerDescription", new vq9("providerDescription", "TEXT", 0, false, 1, null));
        linkedHashMap.put("originalImageUrl", new vq9("originalImageUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("providerImageUrl", new vq9("providerImageUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("sharedById", new vq9("sharedById", "TEXT", 0, false, 1, null));
        linkedHashMap.put("sharedByName", new vq9("sharedByName", "TEXT", 0, false, 1, null));
        linkedHashMap.put("sharedByImageUrl", new vq9("sharedByImageUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("sharedByRole", new vq9("sharedByRole", "TEXT", 0, false, 1, null));
        linkedHashMap.put("isSharedByIsFriend", new vq9("isSharedByIsFriend", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("isCanEdit", new vq9("isCanEdit", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("canEditSentence", new vq9("canEditSentence", "INTEGER", 0, true, 1, "0"));
        linkedHashMap.put("isProtected", new vq9("isProtected", "INTEGER", 0, true, 1, "1"));
        linkedHashMap.put("lessonVotes", new vq9("lessonVotes", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("audioVotes", new vq9("audioVotes", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("level", new vq9("level", "TEXT", 0, false, 1, null));
        linkedHashMap.put("tags", new vq9("tags", "TEXT", 0, false, 1, null));
        linkedHashMap.put("progressDownloaded", new vq9("progressDownloaded", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("progress", new vq9("progress", "REAL", 0, false, 1, null));
        linkedHashMap.put("translationSentence", new vq9("translationSentence", "TEXT", 0, true, 1, null));
        linkedHashMap.put("mediaImageUrl", new vq9("mediaImageUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("mediaTitle", new vq9("mediaTitle", "TEXT", 0, false, 1, null));
        linkedHashMap.put("ptime", new vq9("ptime", "TEXT", 0, false, 1, null));
        linkedHashMap.put("isPinned", new vq9("isPinned", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("difficulty", new vq9("difficulty", "REAL", 0, true, 1, null));
        linkedHashMap.put("newWords", new vq9("newWords", "INTEGER", 0, true, 1, null));
        linkedHashMap.put("lessonPreview", new vq9("lessonPreview", "TEXT", 0, true, 1, null));
        linkedHashMap.put("isTaken", new vq9("isTaken", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("folders", new vq9("folders", "TEXT", 0, false, 1, null));
        linkedHashMap.put("audioPending", new vq9("audioPending", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("isLocked", new vq9("isLocked", "TEXT", 0, false, 1, null));
        linkedHashMap.put("lastOpenTime", new vq9("lastOpenTime", "TEXT", 0, false, 1, null));
        linkedHashMap.put("userLiked_username", new vq9("userLiked_username", "TEXT", 0, false, 1, null));
        linkedHashMap.put("userLiked_liked", new vq9("userLiked_liked", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("userCompleted_username", new vq9("userCompleted_username", "TEXT", 0, false, 1, null));
        linkedHashMap.put("userCompleted_completed", new vq9("userCompleted_completed", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("translation_language", new vq9("translation_language", "TEXT", 0, false, 1, null));
        linkedHashMap.put("translation_sentences", new vq9("translation_sentences", "TEXT", 0, false, 1, null));
        linkedHashMap.put("nextLesson_id", new vq9("nextLesson_id", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("nextLesson_price", new vq9("nextLesson_price", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("nextLesson_collectionTitle", new vq9("nextLesson_collectionTitle", "TEXT", 0, false, 1, null));
        linkedHashMap.put("nextLesson_isTaken", new vq9("nextLesson_isTaken", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("nextLesson_sharedById", new vq9("nextLesson_sharedById", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("nextLesson_status", new vq9("nextLesson_status", "TEXT", 0, false, 1, null));
        linkedHashMap.put("nextLesson_title", new vq9("nextLesson_title", "TEXT", 0, false, 1, null));
        linkedHashMap.put("nextLesson_image", new vq9("nextLesson_image", "TEXT", 0, false, 1, null));
        linkedHashMap.put("nextLesson_duration", new vq9("nextLesson_duration", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("nextLesson_source", new vq9("nextLesson_source", "TEXT", 0, false, 1, null));
        linkedHashMap.put("nextLesson_url", new vq9("nextLesson_url", "TEXT", 0, false, 1, null));
        linkedHashMap.put("previousLesson_id", new vq9("previousLesson_id", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("previousLesson_price", new vq9("previousLesson_price", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("previousLesson_collectionTitle", new vq9("previousLesson_collectionTitle", "TEXT", 0, false, 1, null));
        linkedHashMap.put("previousLesson_isTaken", new vq9("previousLesson_isTaken", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("previousLesson_sharedById", new vq9("previousLesson_sharedById", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("previousLesson_status", new vq9("previousLesson_status", "TEXT", 0, false, 1, null));
        linkedHashMap.put("previousLesson_title", new vq9("previousLesson_title", "TEXT", 0, false, 1, null));
        linkedHashMap.put("previousLesson_image", new vq9("previousLesson_image", "TEXT", 0, false, 1, null));
        linkedHashMap.put("previousLesson_duration", new vq9("previousLesson_duration", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("previousLesson_source", new vq9("previousLesson_source", "TEXT", 0, false, 1, null));
        linkedHashMap.put("previousLesson_url", new vq9("previousLesson_url", "TEXT", 0, false, 1, null));
        linkedHashMap.put("promoted_course_ctaText", new vq9("promoted_course_ctaText", "TEXT", 0, false, 1, null));
        linkedHashMap.put("promoted_course_description", new vq9("promoted_course_description", "TEXT", 0, false, 1, null));
        linkedHashMap.put("promoted_course_ctaUrl", new vq9("promoted_course_ctaUrl", "TEXT", 0, false, 1, null));
        linkedHashMap.put("simplified_to_status", new vq9("simplified_to_status", "TEXT", 0, false, 1, null));
        linkedHashMap.put("simplified_to_isLocked", new vq9("simplified_to_isLocked", "TEXT", 0, false, 1, null));
        linkedHashMap.put("simplified_to_id", new vq9("simplified_to_id", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("simplified_by_status", new vq9("simplified_by_status", "TEXT", 0, false, 1, null));
        linkedHashMap.put("simplified_by_isLocked", new vq9("simplified_by_isLocked", "TEXT", 0, false, 1, null));
        linkedHashMap.put("simplified_by_id", new vq9("simplified_by_id", "INTEGER", 0, false, 1, null));
        linkedHashMap.put("metadata_importLesson", new vq9("metadata_importLesson", "TEXT", 0, false, 1, null));
        linkedHashMap.put("metadata_importMethod", new vq9("metadata_importMethod", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSetM10877i = e65.m10877i(linkedHashMap, "metadata_splittingMethod", new vq9("metadata_splittingMethod", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new xq9("index_LessonEntity_id", false, vz1.m23604J("id"), vz1.m23604J("ASC")));
        linkedHashSet.add(new xq9("index_LessonEntity_id_title_collectionTitle_imageUrl_cardsCount_uniqueWordCount_newWords_duration_isCompleted_percentCompleted", false, vz1.m23605K("id", "title", "collectionTitle", "imageUrl", "cardsCount", "uniqueWordCount", "newWords", "duration", "isCompleted", "percentCompleted"), vz1.m23605K("ASC", "ASC", "ASC", "ASC", "ASC", "ASC", "ASC", "ASC", "ASC", "ASC")));
        yq9 yq9Var = new yq9("LessonEntity", linkedHashMap, linkedHashSetM10877i, linkedHashSet);
        yq9 yq9VarM3392l = b6d.m3392l(bk8Var, "LessonEntity");
        if (!yq9Var.equals(yq9VarM3392l)) {
            return new mc0(false, e65.m10873e("LessonEntity(com.lingq.core.database.entity.LessonEntity).\n Expected:\n", yq9Var, "\n Found:\n", yq9VarM3392l));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("lessonId", new vq9("lessonId", "INTEGER", 1, true, 1, null));
        linkedHashMap2.put("tokens", new vq9("tokens", "TEXT", 0, true, 1, null));
        linkedHashMap2.put("text", new vq9("text", "TEXT", 0, false, 1, null));
        linkedHashMap2.put("normalizedText", new vq9("normalizedText", "TEXT", 0, false, 1, null));
        linkedHashMap2.put("index", new vq9("index", "INTEGER", 2, true, 1, null));
        linkedHashMap2.put("timestamp", new vq9("timestamp", "TEXT", 0, false, 1, null));
        linkedHashMap2.put("startParagraph", new vq9("startParagraph", "INTEGER", 0, true, 1, null));
        linkedHashMap2.put("url", new vq9("url", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSetM10877i2 = e65.m10877i(linkedHashMap2, "opentag", new vq9("opentag", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new xq9("index_LessonSentenceEntity_lessonId_index", false, vz1.m23605K("lessonId", "index"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var2 = new yq9("LessonSentenceEntity", linkedHashMap2, linkedHashSetM10877i2, linkedHashSet2);
        yq9 yq9VarM3392l2 = b6d.m3392l(bk8Var, "LessonSentenceEntity");
        if (!yq9Var2.equals(yq9VarM3392l2)) {
            return new mc0(false, e65.m10873e("LessonSentenceEntity(com.lingq.core.database.entity.LessonSentenceEntity).\n Expected:\n", yq9Var2, "\n Found:\n", yq9VarM3392l2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("term", new vq9("term", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("termWithLanguage", new vq9("termWithLanguage", "TEXT", 1, true, 1, null));
        linkedHashMap3.put("id", new vq9("id", "INTEGER", 0, true, 1, null));
        linkedHashMap3.put("url", new vq9("url", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("fragment", new vq9("fragment", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("status", new vq9("status", "INTEGER", 0, true, 1, null));
        linkedHashMap3.put("extendedStatus", new vq9("extendedStatus", "INTEGER", 0, false, 1, null));
        linkedHashMap3.put("lastReviewedCorrect", new vq9("lastReviewedCorrect", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("srsDueDate", new vq9("srsDueDate", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("notes", new vq9("notes", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("audio", new vq9("audio", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("importance", new vq9("importance", "INTEGER", 0, true, 1, null));
        linkedHashMap3.put("meanings", new vq9("meanings", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("meaningTerms", new vq9("meaningTerms", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("tags", new vq9("tags", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("gTags", new vq9("gTags", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("words", new vq9("words", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("hiragana", new vq9("hiragana", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("romaji", new vq9("romaji", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("pinyin", new vq9("pinyin", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("hant", new vq9("hant", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("hans", new vq9("hans", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("jyutping", new vq9("jyutping", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("chunk", new vq9("chunk", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("furigana", new vq9("furigana", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("latin", new vq9("latin", "TEXT", 0, false, 1, null));
        linkedHashMap3.put("isPhrase", new vq9("isPhrase", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i3 = e65.m10877i(linkedHashMap3, "creationDate", new vq9("creationDate", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new xq9("index_CardEntity_termWithLanguage", false, vz1.m23604J("termWithLanguage"), vz1.m23604J("ASC")));
        yq9 yq9Var3 = new yq9("CardEntity", linkedHashMap3, linkedHashSetM10877i3, linkedHashSet3);
        yq9 yq9VarM3392l3 = b6d.m3392l(bk8Var, "CardEntity");
        if (!yq9Var3.equals(yq9VarM3392l3)) {
            return new mc0(false, e65.m10873e("CardEntity(com.lingq.core.database.entity.CardEntity).\n Expected:\n", yq9Var3, "\n Found:\n", yq9VarM3392l3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("termWithLanguage", new vq9("termWithLanguage", "TEXT", 1, true, 1, null));
        linkedHashMap4.put("term", new vq9("term", "TEXT", 0, true, 1, null));
        linkedHashMap4.put("id", new vq9("id", "INTEGER", 0, true, 1, null));
        linkedHashMap4.put("status", new vq9("status", "TEXT", 0, false, 1, null));
        linkedHashMap4.put("importance", new vq9("importance", "INTEGER", 0, true, 1, null));
        linkedHashMap4.put("isPhrase", new vq9("isPhrase", "INTEGER", 0, true, 1, null));
        linkedHashMap4.put("meanings", new vq9("meanings", "TEXT", 0, true, 1, null));
        linkedHashMap4.put("tags", new vq9("tags", "TEXT", 0, true, 1, null));
        linkedHashMap4.put("gTags", new vq9("gTags", "TEXT", 0, true, 1, null));
        linkedHashMap4.put("romaji", new vq9("romaji", "TEXT", 0, false, 1, null));
        linkedHashMap4.put("hiragana", new vq9("hiragana", "TEXT", 0, false, 1, null));
        linkedHashMap4.put("pinyin", new vq9("pinyin", "TEXT", 0, false, 1, null));
        linkedHashMap4.put("hant", new vq9("hant", "TEXT", 0, false, 1, null));
        linkedHashMap4.put("hans", new vq9("hans", "TEXT", 0, false, 1, null));
        linkedHashMap4.put("jyutping", new vq9("jyutping", "TEXT", 0, false, 1, null));
        yq9 yq9Var4 = new yq9("WordEntity", linkedHashMap4, e65.m10877i(linkedHashMap4, "cardId", new vq9("cardId", "INTEGER", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l4 = b6d.m3392l(bk8Var, "WordEntity");
        if (!yq9Var4.equals(yq9VarM3392l4)) {
            return new mc0(false, e65.m10873e("WordEntity(com.lingq.core.database.entity.WordEntity).\n Expected:\n", yq9Var4, "\n Found:\n", yq9VarM3392l4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("contentId", new vq9("contentId", "INTEGER", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i4 = e65.m10877i(linkedHashMap5, "termWithLanguage", new vq9("termWithLanguage", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new xq9("index_LessonsAndCardsJoin_contentId_termWithLanguage", false, vz1.m23605K("contentId", "termWithLanguage"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var5 = new yq9("LessonsAndCardsJoin", linkedHashMap5, linkedHashSetM10877i4, linkedHashSet4);
        yq9 yq9VarM3392l5 = b6d.m3392l(bk8Var, "LessonsAndCardsJoin");
        if (!yq9Var5.equals(yq9VarM3392l5)) {
            return new mc0(false, e65.m10873e("LessonsAndCardsJoin(com.lingq.core.database.entity.LessonsAndCardsJoin).\n Expected:\n", yq9Var5, "\n Found:\n", yq9VarM3392l5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("contentId", new vq9("contentId", "INTEGER", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i5 = e65.m10877i(linkedHashMap6, "termWithLanguage", new vq9("termWithLanguage", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new xq9("index_LessonsAndWordsJoin_contentId_termWithLanguage", false, vz1.m23605K("contentId", "termWithLanguage"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var6 = new yq9("LessonsAndWordsJoin", linkedHashMap6, linkedHashSetM10877i5, linkedHashSet5);
        yq9 yq9VarM3392l6 = b6d.m3392l(bk8Var, "LessonsAndWordsJoin");
        if (!yq9Var6.equals(yq9VarM3392l6)) {
            return new mc0(false, e65.m10873e("LessonsAndWordsJoin(com.lingq.core.database.entity.LessonsAndWordsJoin).\n Expected:\n", yq9Var6, "\n Found:\n", yq9VarM3392l6));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap7.put("name", new vq9("name", "TEXT", 0, true, 1, null));
        linkedHashMap7.put("order", new vq9("order", "INTEGER", 0, true, 1, null));
        linkedHashMap7.put("urlToTransform", new vq9("urlToTransform", "TEXT", 0, true, 1, null));
        linkedHashMap7.put("urlDefinition", new vq9("urlDefinition", "TEXT", 0, true, 1, null));
        linkedHashMap7.put("isPopUpWindow", new vq9("isPopUpWindow", "INTEGER", 0, true, 1, null));
        linkedHashMap7.put("languageTo", new vq9("languageTo", "TEXT", 0, true, 1, null));
        linkedHashMap7.put("urlVar1", new vq9("urlVar1", "TEXT", 0, true, 1, null));
        linkedHashMap7.put("urlVar2", new vq9("urlVar2", "TEXT", 0, true, 1, null));
        linkedHashMap7.put("urlVar3", new vq9("urlVar3", "TEXT", 0, true, 1, null));
        linkedHashMap7.put("urlVar4", new vq9("urlVar4", "TEXT", 0, true, 1, null));
        linkedHashMap7.put("urlVar5", new vq9("urlVar5", "TEXT", 0, true, 1, null));
        yq9 yq9Var7 = new yq9("DictionaryDataEntity", linkedHashMap7, e65.m10877i(linkedHashMap7, "overrideUrl", new vq9("overrideUrl", "TEXT", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l7 = b6d.m3392l(bk8Var, "DictionaryDataEntity");
        if (!yq9Var7.equals(yq9VarM3392l7)) {
            return new mc0(false, e65.m10873e("DictionaryDataEntity(com.lingq.core.database.entity.DictionaryDataEntity).\n Expected:\n", yq9Var7, "\n Found:\n", yq9VarM3392l7));
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("code", new vq9("code", "TEXT", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i6 = e65.m10877i(linkedHashMap8, "title", new vq9("title", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new xq9("index_DictionaryLocaleEntity_code", false, vz1.m23604J("code"), vz1.m23604J("ASC")));
        yq9 yq9Var8 = new yq9("DictionaryLocaleEntity", linkedHashMap8, linkedHashSetM10877i6, linkedHashSet6);
        yq9 yq9VarM3392l8 = b6d.m3392l(bk8Var, "DictionaryLocaleEntity");
        if (!yq9Var8.equals(yq9VarM3392l8)) {
            return new mc0(false, e65.m10873e("DictionaryLocaleEntity(com.lingq.core.database.entity.DictionaryLocaleEntity).\n Expected:\n", yq9Var8, "\n Found:\n", yq9VarM3392l8));
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("pk", new vq9("pk", "INTEGER", 1, true, 1, null));
        linkedHashMap9.put("code", new vq9("code", "TEXT", 0, false, 1, null));
        linkedHashMap9.put("title", new vq9("title", "TEXT", 0, false, 1, null));
        linkedHashMap9.put("challengeType", new vq9("challengeType", "TEXT", 0, false, 1, null));
        linkedHashMap9.put("description", new vq9("description", "TEXT", 0, false, 1, null));
        linkedHashMap9.put("startDate", new vq9("startDate", "TEXT", 0, false, 1, null));
        linkedHashMap9.put("endDate", new vq9("endDate", "TEXT", 0, false, 1, null));
        linkedHashMap9.put("language", new vq9("language", "TEXT", 0, false, 1, null));
        linkedHashMap9.put("participantsCount", new vq9("participantsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap9.put("isDisabled", new vq9("isDisabled", "INTEGER", 0, true, 1, null));
        linkedHashMap9.put("badgeUrl", new vq9("badgeUrl", "TEXT", 0, false, 1, null));
        linkedHashMap9.put("isCompleted", new vq9("isCompleted", "INTEGER", 0, true, 1, null));
        linkedHashMap9.put("isJoined", new vq9("isJoined", "INTEGER", 0, true, 1, null));
        linkedHashMap9.put("rank", new vq9("rank", "INTEGER", 0, true, 1, null));
        linkedHashMap9.put("order", new vq9("order", "INTEGER", 0, true, 1, null));
        linkedHashMap9.put("knownWords", new vq9("knownWords", "INTEGER", 0, true, 1, "0"));
        linkedHashMap9.put("challengeLanguage", new vq9("challengeLanguage", "TEXT", 0, false, 1, "''"));
        linkedHashMap9.put("status", new vq9("status", "TEXT", 0, false, 1, "''"));
        LinkedHashSet linkedHashSetM10877i7 = e65.m10877i(linkedHashMap9, "signupDeadline", new vq9("signupDeadline", "TEXT", 0, false, 1, "''"));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new xq9("index_ChallengeEntity_pk", false, vz1.m23604J("pk"), vz1.m23604J("ASC")));
        yq9 yq9Var9 = new yq9("ChallengeEntity", linkedHashMap9, linkedHashSetM10877i7, linkedHashSet7);
        yq9 yq9VarM3392l9 = b6d.m3392l(bk8Var, "ChallengeEntity");
        if (!yq9Var9.equals(yq9VarM3392l9)) {
            return new mc0(false, e65.m10873e("ChallengeEntity(com.lingq.core.database.entity.ChallengeEntity).\n Expected:\n", yq9Var9, "\n Found:\n", yq9VarM3392l9));
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("languageAndSlug", new vq9("languageAndSlug", "TEXT", 1, true, 1, null));
        linkedHashMap10.put("language", new vq9("language", "TEXT", 0, false, 1, null));
        linkedHashMap10.put("slug", new vq9("slug", "TEXT", 0, false, 1, null));
        linkedHashMap10.put("name", new vq9("name", "TEXT", 0, false, 1, null));
        linkedHashMap10.put("goal", new vq9("goal", "INTEGER", 0, true, 1, null));
        linkedHashMap10.put("stat", new vq9("stat", "TEXT", 0, false, 1, null));
        linkedHashMap10.put("metAt", new vq9("metAt", "TEXT", 0, false, 1, null));
        linkedHashMap10.put("gainedAt", new vq9("gainedAt", "TEXT", 0, false, 1, null));
        yq9 yq9Var10 = new yq9("BadgeEntity", linkedHashMap10, e65.m10877i(linkedHashMap10, "imageUrl", new vq9("imageUrl", "TEXT", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l10 = b6d.m3392l(bk8Var, "BadgeEntity");
        if (!yq9Var10.equals(yq9VarM3392l10)) {
            return new mc0(false, e65.m10873e("BadgeEntity(com.lingq.core.database.entity.BadgeEntity).\n Expected:\n", yq9Var10, "\n Found:\n", yq9VarM3392l10));
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("languageAndSlug", new vq9("languageAndSlug", "TEXT", 1, true, 1, null));
        linkedHashMap11.put("language", new vq9("language", "TEXT", 0, false, 1, null));
        linkedHashMap11.put("slug", new vq9("slug", "TEXT", 0, false, 1, null));
        linkedHashMap11.put("name", new vq9("name", "TEXT", 0, false, 1, null));
        linkedHashMap11.put("goal", new vq9("goal", "INTEGER", 0, true, 1, null));
        linkedHashMap11.put("stat", new vq9("stat", "TEXT", 0, false, 1, null));
        yq9 yq9Var11 = new yq9("MilestoneEntity", linkedHashMap11, e65.m10877i(linkedHashMap11, "date", new vq9("date", "TEXT", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l11 = b6d.m3392l(bk8Var, "MilestoneEntity");
        if (!yq9Var11.equals(yq9VarM3392l11)) {
            return new mc0(false, e65.m10873e("MilestoneEntity(com.lingq.core.database.entity.MilestoneEntity).\n Expected:\n", yq9Var11, "\n Found:\n", yq9VarM3392l11));
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap12.put("type", new vq9("type", "TEXT", 2, true, 1, null));
        linkedHashMap12.put("title", new vq9("title", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("description", new vq9("description", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("pos", new vq9("pos", "INTEGER", 0, true, 1, null));
        linkedHashMap12.put("url", new vq9("url", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("sourceType", new vq9("sourceType", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("sourceName", new vq9("sourceName", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("sourceUrl", new vq9("sourceUrl", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("imageUrl", new vq9("imageUrl", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("providerId", new vq9("providerId", "INTEGER", 0, false, 1, null));
        linkedHashMap12.put("providerName", new vq9("providerName", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("providerDescription", new vq9("providerDescription", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("originalImageUrl", new vq9("originalImageUrl", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("providerImageUrl", new vq9("providerImageUrl", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("sharedById", new vq9("sharedById", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("sharedByName", new vq9("sharedByName", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("sharedByImageUrl", new vq9("sharedByImageUrl", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("sharedByRole", new vq9("sharedByRole", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("level", new vq9("level", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("newWordsCount", new vq9("newWordsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap12.put("lessonsCount", new vq9("lessonsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap12.put("owner", new vq9("owner", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("price", new vq9("price", "INTEGER", 0, true, 1, null));
        linkedHashMap12.put("cardsCount", new vq9("cardsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap12.put("rosesCount", new vq9("rosesCount", "INTEGER", 0, true, 1, null));
        linkedHashMap12.put("duration", new vq9("duration", "INTEGER", 0, false, 1, null));
        linkedHashMap12.put("collectionId", new vq9("collectionId", "INTEGER", 0, false, 1, null));
        linkedHashMap12.put("collectionTitle", new vq9("collectionTitle", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("difficulty", new vq9("difficulty", "REAL", 0, true, 1, null));
        linkedHashMap12.put("isAvailable", new vq9("isAvailable", "INTEGER", 0, true, 1, null));
        linkedHashMap12.put("tags", new vq9("tags", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("status", new vq9("status", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("folders", new vq9("folders", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("progress", new vq9("progress", "REAL", 0, false, 1, null));
        linkedHashMap12.put("isTaken", new vq9("isTaken", "INTEGER", 0, false, 1, null));
        linkedHashMap12.put("lessonPreview", new vq9("lessonPreview", "TEXT", 0, true, 1, null));
        linkedHashMap12.put("accent", new vq9("accent", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("audioUrl", new vq9("audioUrl", "TEXT", 0, false, 1, "''"));
        linkedHashMap12.put("listenTimes", new vq9("listenTimes", "REAL", 0, true, 1, "0.0"));
        linkedHashMap12.put("readTimes", new vq9("readTimes", "REAL", 0, true, 1, "0.0"));
        linkedHashMap12.put("isCompleted", new vq9("isCompleted", "INTEGER", 0, true, 1, "0"));
        linkedHashMap12.put("isFavorite", new vq9("isFavorite", "INTEGER", 0, true, 1, "0"));
        linkedHashMap12.put("videoUrl", new vq9("videoUrl", "TEXT", 0, false, 1, "''"));
        linkedHashMap12.put("isLocked", new vq9("isLocked", "TEXT", 0, false, 1, null));
        linkedHashMap12.put("lessonsSortBy", new vq9("lessonsSortBy", "TEXT", 0, false, 1, "''"));
        linkedHashMap12.put("isSubscribed", new vq9("isSubscribed", "INTEGER", 0, false, 1, "NULL"));
        linkedHashMap12.put("originalUrl", new vq9("originalUrl", "TEXT", 0, false, 1, "''"));
        LinkedHashSet linkedHashSetM10877i8 = e65.m10877i(linkedHashMap12, "isArchived", new vq9("isArchived", "INTEGER", 0, true, 1, "0"));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new xq9("index_LibraryDataEntity_id_type", false, vz1.m23605K("id", "type"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var12 = new yq9("LibraryDataEntity", linkedHashMap12, linkedHashSetM10877i8, linkedHashSet8);
        yq9 yq9VarM3392l12 = b6d.m3392l(bk8Var, "LibraryDataEntity");
        if (!yq9Var12.equals(yq9VarM3392l12)) {
            return new mc0(false, e65.m10873e("LibraryDataEntity(com.lingq.core.database.entity.LibraryDataEntity).\n Expected:\n", yq9Var12, "\n Found:\n", yq9VarM3392l12));
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        linkedHashMap13.put("code", new vq9("code", "TEXT", 1, true, 1, null));
        linkedHashMap13.put("pk", new vq9("pk", "INTEGER", 0, true, 1, null));
        linkedHashMap13.put("url", new vq9("url", "TEXT", 0, false, 1, null));
        linkedHashMap13.put("repetitionLingQs", new vq9("repetitionLingQs", "INTEGER", 0, true, 1, null));
        linkedHashMap13.put("lotdDates", new vq9("lotdDates", "TEXT", 0, true, 1, null));
        linkedHashMap13.put("isUseFeed", new vq9("isUseFeed", "INTEGER", 0, false, 1, null));
        linkedHashMap13.put("intense", new vq9("intense", "TEXT", 0, false, 1, null));
        linkedHashMap13.put("streakGoal", new vq9("streakGoal", "INTEGER", 0, false, 1, null));
        linkedHashMap13.put("streakDays", new vq9("streakDays", "INTEGER", 0, true, 1, null));
        linkedHashMap13.put("tags", new vq9("tags", "TEXT", 0, true, 1, null));
        linkedHashMap13.put("supported", new vq9("supported", "INTEGER", 0, false, 1, null));
        linkedHashMap13.put("title", new vq9("title", "TEXT", 0, false, 1, null));
        linkedHashMap13.put("lastUsed", new vq9("lastUsed", "TEXT", 0, false, 1, null));
        linkedHashMap13.put("knownWords", new vq9("knownWords", "INTEGER", 0, false, 1, null));
        linkedHashMap13.put("grammarResourceSlug", new vq9("grammarResourceSlug", "TEXT", 0, false, 1, null));
        linkedHashMap13.put("feedLevels", new vq9("feedLevels", "TEXT", 0, false, 1, null));
        linkedHashMap13.put("scheduledForDeletion", new vq9("scheduledForDeletion", "INTEGER", 0, false, 1, "0"));
        linkedHashMap13.put("email_lotd", new vq9("email_lotd", "TEXT", 0, false, 1, null));
        linkedHashMap13.put("email_weekly", new vq9("email_weekly", "TEXT", 0, false, 1, null));
        linkedHashMap13.put("site_lotd", new vq9("site_lotd", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSetM10877i9 = e65.m10877i(linkedHashMap13, "site_weekly", new vq9("site_weekly", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new xq9("index_LanguageContextEntity_code", false, vz1.m23604J("code"), vz1.m23604J("ASC")));
        yq9 yq9Var13 = new yq9("LanguageContextEntity", linkedHashMap13, linkedHashSetM10877i9, linkedHashSet9);
        yq9 yq9VarM3392l13 = b6d.m3392l(bk8Var, "LanguageContextEntity");
        if (!yq9Var13.equals(yq9VarM3392l13)) {
            return new mc0(false, e65.m10873e("LanguageContextEntity(com.lingq.core.database.entity.LanguageContextEntity).\n Expected:\n", yq9Var13, "\n Found:\n", yq9VarM3392l13));
        }
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        linkedHashMap14.put("code", new vq9("code", "TEXT", 1, true, 1, null));
        linkedHashMap14.put("id", new vq9("id", "INTEGER", 0, false, 1, null));
        linkedHashMap14.put("supported", new vq9("supported", "INTEGER", 0, false, 1, null));
        linkedHashMap14.put("title", new vq9("title", "TEXT", 0, false, 1, null));
        linkedHashMap14.put("lastUsed", new vq9("lastUsed", "TEXT", 0, false, 1, null));
        linkedHashMap14.put("knownWords", new vq9("knownWords", "INTEGER", 0, false, 1, null));
        linkedHashMap14.put("dictionaryLocaleActive", new vq9("dictionaryLocaleActive", "TEXT", 0, false, 1, null));
        linkedHashMap14.put("grammarResourceSlug", new vq9("grammarResourceSlug", "TEXT", 0, false, 1, null));
        yq9 yq9Var14 = new yq9("LanguageEntity", linkedHashMap14, e65.m10877i(linkedHashMap14, "scheduledForDeletion", new vq9("scheduledForDeletion", "INTEGER", 0, false, 1, "0")), new LinkedHashSet());
        yq9 yq9VarM3392l14 = b6d.m3392l(bk8Var, "LanguageEntity");
        if (!yq9Var14.equals(yq9VarM3392l14)) {
            return new mc0(false, e65.m10873e("LanguageEntity(com.lingq.core.database.entity.LanguageEntity).\n Expected:\n", yq9Var14, "\n Found:\n", yq9VarM3392l14));
        }
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        linkedHashMap15.put("code", new vq9("code", "TEXT", 1, true, 1, null));
        yq9 yq9Var15 = new yq9("LanguageActiveDictionaryJoin", linkedHashMap15, e65.m10877i(linkedHashMap15, "id", new vq9("id", "INTEGER", 2, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l15 = b6d.m3392l(bk8Var, "LanguageActiveDictionaryJoin");
        if (!yq9Var15.equals(yq9VarM3392l15)) {
            return new mc0(false, e65.m10873e("LanguageActiveDictionaryJoin(com.lingq.core.database.entity.LanguageActiveDictionaryJoin).\n Expected:\n", yq9Var15, "\n Found:\n", yq9VarM3392l15));
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        linkedHashMap16.put("code", new vq9("code", "TEXT", 1, true, 1, null));
        yq9 yq9Var16 = new yq9("LanguageAvailableDictionaryJoin", linkedHashMap16, e65.m10877i(linkedHashMap16, "id", new vq9("id", "INTEGER", 2, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l16 = b6d.m3392l(bk8Var, "LanguageAvailableDictionaryJoin");
        if (!yq9Var16.equals(yq9VarM3392l16)) {
            return new mc0(false, e65.m10873e("LanguageAvailableDictionaryJoin(com.lingq.core.database.entity.LanguageAvailableDictionaryJoin).\n Expected:\n", yq9Var16, "\n Found:\n", yq9VarM3392l16));
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        linkedHashMap17.put("language", new vq9("language", "TEXT", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i10 = e65.m10877i(linkedHashMap17, "code", new vq9("code", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new xq9("index_LanguageDictionaryLocaleJoin_language_code", false, vz1.m23605K("language", "code"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var17 = new yq9("LanguageDictionaryLocaleJoin", linkedHashMap17, linkedHashSetM10877i10, linkedHashSet10);
        yq9 yq9VarM3392l17 = b6d.m3392l(bk8Var, "LanguageDictionaryLocaleJoin");
        if (!yq9Var17.equals(yq9VarM3392l17)) {
            return new mc0(false, e65.m10873e("LanguageDictionaryLocaleJoin(com.lingq.core.database.entity.LanguageDictionaryLocaleJoin).\n Expected:\n", yq9Var17, "\n Found:\n", yq9VarM3392l17));
        }
        LinkedHashMap linkedHashMap18 = new LinkedHashMap();
        linkedHashMap18.put("codeWithLanguage", new vq9("codeWithLanguage", "TEXT", 1, true, 1, null));
        linkedHashMap18.put("id", new vq9("id", "INTEGER", 2, true, 1, null));
        linkedHashMap18.put("type", new vq9("type", "TEXT", 3, true, 1, null));
        linkedHashMap18.put("order", new vq9("order", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i11 = e65.m10877i(linkedHashMap18, "ofQuery", new vq9("ofQuery", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        linkedHashSet11.add(new xq9("index_LibraryShelfAndContentJoin_codeWithLanguage_id_type", false, vz1.m23605K("codeWithLanguage", "id", "type"), vz1.m23605K("ASC", "ASC", "ASC")));
        yq9 yq9Var18 = new yq9("LibraryShelfAndContentJoin", linkedHashMap18, linkedHashSetM10877i11, linkedHashSet11);
        yq9 yq9VarM3392l18 = b6d.m3392l(bk8Var, "LibraryShelfAndContentJoin");
        if (!yq9Var18.equals(yq9VarM3392l18)) {
            return new mc0(false, e65.m10873e("LibraryShelfAndContentJoin(com.lingq.core.database.entity.LibraryShelfAndContentJoin).\n Expected:\n", yq9Var18, "\n Found:\n", yq9VarM3392l18));
        }
        LinkedHashMap linkedHashMap19 = new LinkedHashMap();
        linkedHashMap19.put("codeWithLanguage", new vq9("codeWithLanguage", "TEXT", 1, true, 1, null));
        linkedHashMap19.put("language", new vq9("language", "TEXT", 0, true, 1, null));
        linkedHashMap19.put("pinned", new vq9("pinned", "INTEGER", 0, false, 1, null));
        linkedHashMap19.put("pinnedHard", new vq9("pinnedHard", "INTEGER", 0, false, 1, null));
        linkedHashMap19.put("tabs", new vq9("tabs", "TEXT", 0, true, 1, null));
        linkedHashMap19.put("code", new vq9("code", "TEXT", 0, true, 1, null));
        linkedHashMap19.put("id", new vq9("id", "INTEGER", 0, true, 1, null));
        linkedHashMap19.put("title", new vq9("title", "TEXT", 0, true, 1, null));
        linkedHashMap19.put("order", new vq9("order", "INTEGER", 0, true, 1, null));
        linkedHashMap19.put("levels", new vq9("levels", "TEXT", 0, true, 1, "''"));
        LinkedHashSet linkedHashSetM10877i12 = e65.m10877i(linkedHashMap19, "originalTitle", new vq9("originalTitle", "TEXT", 0, true, 1, "''"));
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        linkedHashSet12.add(new xq9("index_LibraryShelfEntity_codeWithLanguage_title", false, vz1.m23605K("codeWithLanguage", "title"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var19 = new yq9("LibraryShelfEntity", linkedHashMap19, linkedHashSetM10877i12, linkedHashSet12);
        yq9 yq9VarM3392l19 = b6d.m3392l(bk8Var, "LibraryShelfEntity");
        if (!yq9Var19.equals(yq9VarM3392l19)) {
            return new mc0(false, e65.m10873e("LibraryShelfEntity(com.lingq.core.database.entity.LibraryShelfEntity).\n Expected:\n", yq9Var19, "\n Found:\n", yq9VarM3392l19));
        }
        LinkedHashMap linkedHashMap20 = new LinkedHashMap();
        linkedHashMap20.put("nameWithLanguage", new vq9("nameWithLanguage", "TEXT", 1, true, 1, null));
        linkedHashMap20.put("language", new vq9("language", "TEXT", 0, true, 1, null));
        linkedHashMap20.put("name", new vq9("name", "TEXT", 0, true, 1, null));
        linkedHashMap20.put("pk", new vq9("pk", "INTEGER", 0, true, 1, null));
        linkedHashMap20.put("isDefault", new vq9("isDefault", "INTEGER", 0, true, 1, null));
        linkedHashMap20.put("isFeatured", new vq9("isFeatured", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i13 = e65.m10877i(linkedHashMap20, "order", new vq9("order", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSet13 = new LinkedHashSet();
        linkedHashSet13.add(new xq9("index_PlaylistEntity_nameWithLanguage", false, vz1.m23604J("nameWithLanguage"), vz1.m23604J("ASC")));
        linkedHashSet13.add(new xq9("index_PlaylistEntity_name_language", true, vz1.m23605K("name", "language"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var20 = new yq9("PlaylistEntity", linkedHashMap20, linkedHashSetM10877i13, linkedHashSet13);
        yq9 yq9VarM3392l20 = b6d.m3392l(bk8Var, "PlaylistEntity");
        if (!yq9Var20.equals(yq9VarM3392l20)) {
            return new mc0(false, e65.m10873e("PlaylistEntity(com.lingq.core.database.entity.PlaylistEntity).\n Expected:\n", yq9Var20, "\n Found:\n", yq9VarM3392l20));
        }
        LinkedHashMap linkedHashMap21 = new LinkedHashMap();
        linkedHashMap21.put("nameWithLanguage", new vq9("nameWithLanguage", "TEXT", 1, true, 1, null));
        linkedHashMap21.put("language", new vq9("language", "TEXT", 0, true, 1, null));
        linkedHashMap21.put("contentId", new vq9("contentId", "INTEGER", 2, true, 1, null));
        linkedHashMap21.put("order", new vq9("order", "INTEGER", 0, false, 1, null));
        LinkedHashSet linkedHashSetM10877i14 = e65.m10877i(linkedHashMap21, "isCourse", new vq9("isCourse", "INTEGER", 3, true, 1, null));
        LinkedHashSet linkedHashSet14 = new LinkedHashSet();
        linkedHashSet14.add(new xq9("index_PlaylistAndLessonsJoin_nameWithLanguage_contentId_isCourse", false, vz1.m23605K("nameWithLanguage", "contentId", "isCourse"), vz1.m23605K("ASC", "ASC", "ASC")));
        yq9 yq9Var21 = new yq9("PlaylistAndLessonsJoin", linkedHashMap21, linkedHashSetM10877i14, linkedHashSet14);
        yq9 yq9VarM3392l21 = b6d.m3392l(bk8Var, "PlaylistAndLessonsJoin");
        if (!yq9Var21.equals(yq9VarM3392l21)) {
            return new mc0(false, e65.m10873e("PlaylistAndLessonsJoin(com.lingq.core.database.entity.PlaylistAndLessonsJoin).\n Expected:\n", yq9Var21, "\n Found:\n", yq9VarM3392l21));
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        linkedHashMap22.put("termWithLanguageAndTarget", new vq9("termWithLanguageAndTarget", "TEXT", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i15 = e65.m10877i(linkedHashMap22, "translations", new vq9("translations", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet15 = new LinkedHashSet();
        linkedHashSet15.add(new xq9("index_TranslationsEntity_termWithLanguageAndTarget", false, vz1.m23604J("termWithLanguageAndTarget"), vz1.m23604J("ASC")));
        yq9 yq9Var22 = new yq9("TranslationsEntity", linkedHashMap22, linkedHashSetM10877i15, linkedHashSet15);
        yq9 yq9VarM3392l22 = b6d.m3392l(bk8Var, "TranslationsEntity");
        if (!yq9Var22.equals(yq9VarM3392l22)) {
            return new mc0(false, e65.m10873e("TranslationsEntity(com.lingq.core.database.entity.TranslationsEntity).\n Expected:\n", yq9Var22, "\n Found:\n", yq9VarM3392l22));
        }
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        linkedHashMap23.put("name", new vq9("name", "TEXT", 1, true, 1, null));
        linkedHashMap23.put("title", new vq9("title", "TEXT", 0, true, 1, null));
        linkedHashMap23.put("voicesByApp", new vq9("voicesByApp", "TEXT", 0, true, 1, null));
        linkedHashMap23.put("alternative", new vq9("alternative", "INTEGER", 0, false, 1, null));
        linkedHashMap23.put("isPremium", new vq9("isPremium", "INTEGER", 0, true, 1, "0"));
        linkedHashMap23.put("freeTrial", new vq9("freeTrial", "INTEGER", 0, true, 1, "0"));
        linkedHashMap23.put("priority", new vq9("priority", "TEXT", 0, true, 1, null));
        linkedHashMap23.put("accentCode", new vq9("accentCode", "TEXT", 0, false, 1, null));
        linkedHashMap23.put("isSelectable", new vq9("isSelectable", "INTEGER", 0, true, 1, "0"));
        LinkedHashSet linkedHashSetM10877i16 = e65.m10877i(linkedHashMap23, "tags", new vq9("tags", "TEXT", 0, true, 1, "''"));
        LinkedHashSet linkedHashSet16 = new LinkedHashSet();
        linkedHashSet16.add(new xq9("index_TtsVoiceEntity_name", false, vz1.m23604J("name"), vz1.m23604J("ASC")));
        yq9 yq9Var23 = new yq9("TtsVoiceEntity", linkedHashMap23, linkedHashSetM10877i16, linkedHashSet16);
        yq9 yq9VarM3392l23 = b6d.m3392l(bk8Var, "TtsVoiceEntity");
        if (!yq9Var23.equals(yq9VarM3392l23)) {
            return new mc0(false, e65.m10873e("TtsVoiceEntity(com.lingq.core.database.entity.TtsVoiceEntity).\n Expected:\n", yq9Var23, "\n Found:\n", yq9VarM3392l23));
        }
        LinkedHashMap linkedHashMap24 = new LinkedHashMap();
        linkedHashMap24.put("code", new vq9("code", "TEXT", 1, true, 1, null));
        linkedHashMap24.put("name", new vq9("name", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSetM10877i17 = e65.m10877i(linkedHashMap24, "voiceOrder", new vq9("voiceOrder", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSet17 = new LinkedHashSet();
        linkedHashSet17.add(new xq9("index_LanguageAndTtsVoicesJoin_code_name", false, vz1.m23605K("code", "name"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var24 = new yq9("LanguageAndTtsVoicesJoin", linkedHashMap24, linkedHashSetM10877i17, linkedHashSet17);
        yq9 yq9VarM3392l24 = b6d.m3392l(bk8Var, "LanguageAndTtsVoicesJoin");
        if (!yq9Var24.equals(yq9VarM3392l24)) {
            return new mc0(false, e65.m10873e("LanguageAndTtsVoicesJoin(com.lingq.core.database.entity.LanguageAndTtsVoicesJoin).\n Expected:\n", yq9Var24, "\n Found:\n", yq9VarM3392l24));
        }
        LinkedHashMap linkedHashMap25 = new LinkedHashMap();
        linkedHashMap25.put("idWithLanguageAndData", new vq9("idWithLanguageAndData", "TEXT", 1, true, 1, null));
        linkedHashMap25.put("utteranceId", new vq9("utteranceId", "INTEGER", 0, true, 1, null));
        linkedHashMap25.put("audio", new vq9("audio", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i18 = e65.m10877i(linkedHashMap25, "text", new vq9("text", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet18 = new LinkedHashSet();
        linkedHashSet18.add(new xq9("index_TtsUtteranceEntity_idWithLanguageAndData", false, vz1.m23604J("idWithLanguageAndData"), vz1.m23604J("ASC")));
        yq9 yq9Var25 = new yq9("TtsUtteranceEntity", linkedHashMap25, linkedHashSetM10877i18, linkedHashSet18);
        yq9 yq9VarM3392l25 = b6d.m3392l(bk8Var, "TtsUtteranceEntity");
        if (!yq9Var25.equals(yq9VarM3392l25)) {
            return new mc0(false, e65.m10873e("TtsUtteranceEntity(com.lingq.core.database.entity.TtsUtteranceEntity).\n Expected:\n", yq9Var25, "\n Found:\n", yq9VarM3392l25));
        }
        LinkedHashMap linkedHashMap26 = new LinkedHashMap();
        linkedHashMap26.put("index", new vq9("index", "INTEGER", 1, true, 1, null));
        linkedHashMap26.put("lessonId", new vq9("lessonId", "INTEGER", 2, true, 1, null));
        linkedHashMap26.put("audio", new vq9("audio", "REAL", 0, false, 1, null));
        linkedHashMap26.put("audioEnd", new vq9("audioEnd", "REAL", 0, false, 1, null));
        linkedHashMap26.put("text", new vq9("text", "TEXT", 0, true, 1, null));
        linkedHashMap26.put("translations", new vq9("translations", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i19 = e65.m10877i(linkedHashMap26, "notes", new vq9("notes", "TEXT", 0, true, 1, "'[]'"));
        LinkedHashSet linkedHashSet19 = new LinkedHashSet();
        linkedHashSet19.add(new xq9("index_TranslationSentenceEntity_index_lessonId", false, vz1.m23605K("index", "lessonId"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var26 = new yq9("TranslationSentenceEntity", linkedHashMap26, linkedHashSetM10877i19, linkedHashSet19);
        yq9 yq9VarM3392l26 = b6d.m3392l(bk8Var, "TranslationSentenceEntity");
        if (!yq9Var26.equals(yq9VarM3392l26)) {
            return new mc0(false, e65.m10873e("TranslationSentenceEntity(com.lingq.core.database.entity.TranslationSentenceEntity).\n Expected:\n", yq9Var26, "\n Found:\n", yq9VarM3392l26));
        }
        LinkedHashMap linkedHashMap27 = new LinkedHashMap();
        linkedHashMap27.put("interval", new vq9("interval", "TEXT", 2, true, 1, null));
        linkedHashMap27.put("languageCode", new vq9("languageCode", "TEXT", 1, true, 1, null));
        linkedHashMap27.put("writtenWordsGoal", new vq9("writtenWordsGoal", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("speakingTimeGoal", new vq9("speakingTimeGoal", "REAL", 0, true, 1, null));
        linkedHashMap27.put("totalWordsKnown", new vq9("totalWordsKnown", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("readWords", new vq9("readWords", "REAL", 0, true, 1, null));
        linkedHashMap27.put("totalCards", new vq9("totalCards", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("activityIndex", new vq9("activityIndex", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("knownWordsGoal", new vq9("knownWordsGoal", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("listeningTimeGoal", new vq9("listeningTimeGoal", "REAL", 0, true, 1, null));
        linkedHashMap27.put("speakingTime", new vq9("speakingTime", "REAL", 0, true, 1, null));
        linkedHashMap27.put("cardsCreatedGoal", new vq9("cardsCreatedGoal", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("knownWords", new vq9("knownWords", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("intervals", new vq9("intervals", "TEXT", 0, false, 1, null));
        linkedHashMap27.put("cardsCreated", new vq9("cardsCreated", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("readWordsGoal", new vq9("readWordsGoal", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("listeningTime", new vq9("listeningTime", "REAL", 0, true, 1, null));
        linkedHashMap27.put("cardsLearned", new vq9("cardsLearned", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("writtenWords", new vq9("writtenWords", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("cardsLearnedGoal", new vq9("cardsLearnedGoal", "INTEGER", 0, true, 1, null));
        linkedHashMap27.put("earnedCoins", new vq9("earnedCoins", "INTEGER", 0, true, 1, "0"));
        linkedHashMap27.put("earnedCoinsGoal", new vq9("earnedCoinsGoal", "INTEGER", 0, true, 1, "0"));
        linkedHashMap27.put("wpm", new vq9("wpm", "INTEGER", 0, true, 1, "0"));
        yq9 yq9Var27 = new yq9("LanguageProgressEntity", linkedHashMap27, e65.m10877i(linkedHashMap27, "studyTime", new vq9("studyTime", "INTEGER", 0, true, 1, "0")), new LinkedHashSet());
        yq9 yq9VarM3392l27 = b6d.m3392l(bk8Var, "LanguageProgressEntity");
        if (!yq9Var27.equals(yq9VarM3392l27)) {
            return new mc0(false, e65.m10873e("LanguageProgressEntity(com.lingq.core.database.entity.LanguageProgressEntity).\n Expected:\n", yq9Var27, "\n Found:\n", yq9VarM3392l27));
        }
        LinkedHashMap linkedHashMap28 = new LinkedHashMap();
        linkedHashMap28.put("pagingKey", new vq9("pagingKey", "TEXT", 1, true, 1, null));
        linkedHashMap28.put("prevKey", new vq9("prevKey", "INTEGER", 0, false, 1, null));
        yq9 yq9Var28 = new yq9("PagingKeysEntity", linkedHashMap28, e65.m10877i(linkedHashMap28, "nextKey", new vq9("nextKey", "INTEGER", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l28 = b6d.m3392l(bk8Var, "PagingKeysEntity");
        if (!yq9Var28.equals(yq9VarM3392l28)) {
            return new mc0(false, e65.m10873e("PagingKeysEntity(com.lingq.core.database.entity.PagingKeysEntity).\n Expected:\n", yq9Var28, "\n Found:\n", yq9VarM3392l28));
        }
        LinkedHashMap linkedHashMap29 = new LinkedHashMap();
        linkedHashMap29.put("metric", new vq9("metric", "TEXT", 2, true, 1, null));
        linkedHashMap29.put("languageCode", new vq9("languageCode", "TEXT", 1, true, 1, null));
        linkedHashMap29.put("period", new vq9("period", "TEXT", 4, true, 1, "'last_7d'"));
        linkedHashMap29.put("name", new vq9("name", "TEXT", 3, true, 1, null));
        linkedHashMap29.put("daily", new vq9("daily", "REAL", 0, true, 1, null));
        linkedHashMap29.put("cumulative", new vq9("cumulative", "REAL", 0, true, 1, null));
        yq9 yq9Var29 = new yq9("LanguageProgressChartEntryEntity", linkedHashMap29, e65.m10877i(linkedHashMap29, "position", new vq9("position", "INTEGER", 0, true, 1, "0")), new LinkedHashSet());
        yq9 yq9VarM3392l29 = b6d.m3392l(bk8Var, "LanguageProgressChartEntryEntity");
        if (!yq9Var29.equals(yq9VarM3392l29)) {
            return new mc0(false, e65.m10873e("LanguageProgressChartEntryEntity(com.lingq.core.database.entity.LanguageProgressChartEntryEntity).\n Expected:\n", yq9Var29, "\n Found:\n", yq9VarM3392l29));
        }
        LinkedHashMap linkedHashMap30 = new LinkedHashMap();
        linkedHashMap30.put("code", new vq9("code", "TEXT", 1, true, 1, null));
        linkedHashMap30.put("language", new vq9("language", "TEXT", 0, false, 1, null));
        linkedHashMap30.put("activityApple", new vq9("activityApple", "TEXT", 0, false, 1, null));
        linkedHashMap30.put("notificationsCount", new vq9("notificationsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap30.put("dailyGoal", new vq9("dailyGoal", "INTEGER", 0, true, 1, null));
        linkedHashMap30.put("streakDays", new vq9("streakDays", "INTEGER", 0, true, 1, null));
        linkedHashMap30.put("coins", new vq9("coins", "INTEGER", 0, true, 1, null));
        linkedHashMap30.put("knownWords", new vq9("knownWords", "INTEGER", 0, true, 1, null));
        linkedHashMap30.put("isAvatarUpgraded", new vq9("isAvatarUpgraded", "INTEGER", 0, true, 1, null));
        linkedHashMap30.put("dailyScores", new vq9("dailyScores", "TEXT", 0, false, 1, null));
        yq9 yq9Var30 = new yq9("StudyStatsEntity", linkedHashMap30, e65.m10877i(linkedHashMap30, "activityLevel", new vq9("activityLevel", "INTEGER", 0, true, 1, "0")), new LinkedHashSet());
        yq9 yq9VarM3392l30 = b6d.m3392l(bk8Var, "StudyStatsEntity");
        if (!yq9Var30.equals(yq9VarM3392l30)) {
            return new mc0(false, e65.m10873e("StudyStatsEntity(com.lingq.core.database.entity.StudyStatsEntity).\n Expected:\n", yq9Var30, "\n Found:\n", yq9VarM3392l30));
        }
        LinkedHashMap linkedHashMap31 = new LinkedHashMap();
        linkedHashMap31.put("contentId", new vq9("contentId", "INTEGER", 1, true, 1, null));
        linkedHashMap31.put("wordIndex", new vq9("wordIndex", "INTEGER", 0, false, 1, null));
        linkedHashMap31.put("completedWordIndex", new vq9("completedWordIndex", "INTEGER", 0, false, 1, null));
        linkedHashMap31.put("audioPosition", new vq9("audioPosition", "REAL", 0, false, 1, null));
        linkedHashMap31.put("client", new vq9("client", "TEXT", 0, false, 1, null));
        linkedHashMap31.put("timestamp", new vq9("timestamp", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSetM10877i20 = e65.m10877i(linkedHashMap31, "languageTimestamp", new vq9("languageTimestamp", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSet20 = new LinkedHashSet();
        linkedHashSet20.add(new xq9("index_LessonBookmarkEntity_contentId", false, vz1.m23604J("contentId"), vz1.m23604J("ASC")));
        yq9 yq9Var31 = new yq9("LessonBookmarkEntity", linkedHashMap31, linkedHashSetM10877i20, linkedHashSet20);
        yq9 yq9VarM3392l31 = b6d.m3392l(bk8Var, "LessonBookmarkEntity");
        if (!yq9Var31.equals(yq9VarM3392l31)) {
            return new mc0(false, e65.m10873e("LessonBookmarkEntity(com.lingq.core.database.entity.LessonBookmarkEntity).\n Expected:\n", yq9Var31, "\n Found:\n", yq9VarM3392l31));
        }
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        linkedHashMap32.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap32.put("type", new vq9("type", "TEXT", 2, true, 1, null));
        linkedHashMap32.put("roseGiven", new vq9("roseGiven", "INTEGER", 0, true, 1, null));
        linkedHashMap32.put("progress", new vq9("progress", "REAL", 0, false, 1, null));
        linkedHashMap32.put("listenTimes", new vq9("listenTimes", "REAL", 0, false, 1, null));
        linkedHashMap32.put("readTimes", new vq9("readTimes", "REAL", 0, false, 1, null));
        linkedHashMap32.put("isTaken", new vq9("isTaken", "INTEGER", 0, true, 1, null));
        linkedHashMap32.put("difficulty", new vq9("difficulty", "REAL", 0, true, 1, null));
        linkedHashMap32.put("rosesCount", new vq9("rosesCount", "INTEGER", 0, true, 1, null));
        linkedHashMap32.put("newWordsCount", new vq9("newWordsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap32.put("knownWordsCount", new vq9("knownWordsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap32.put("cardsCount", new vq9("cardsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap32.put("lessonsCount", new vq9("lessonsCount", "INTEGER", 0, true, 1, null));
        linkedHashMap32.put("isCompletelyTaken", new vq9("isCompletelyTaken", "INTEGER", 0, true, 1, null));
        linkedHashMap32.put("totalWordsCount", new vq9("totalWordsCount", "INTEGER", 0, true, 1, "0"));
        linkedHashMap32.put("uniqueWordsCount", new vq9("uniqueWordsCount", "INTEGER", 0, true, 1, "0"));
        linkedHashMap32.put("audioStart", new vq9("audioStart", "REAL", 0, false, 1, "NULL"));
        LinkedHashSet linkedHashSetM10877i21 = e65.m10877i(linkedHashMap32, "audioEnd", new vq9("audioEnd", "REAL", 0, false, 1, "NULL"));
        LinkedHashSet linkedHashSet21 = new LinkedHashSet();
        linkedHashSet21.add(new xq9("index_LibraryCounterEntity_id_type", false, vz1.m23605K("id", "type"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var32 = new yq9("LibraryCounterEntity", linkedHashMap32, linkedHashSetM10877i21, linkedHashSet21);
        yq9 yq9VarM3392l32 = b6d.m3392l(bk8Var, "LibraryCounterEntity");
        if (!yq9Var32.equals(yq9VarM3392l32)) {
            return new mc0(false, e65.m10873e("LibraryCounterEntity(com.lingq.core.database.entity.LibraryCounterEntity).\n Expected:\n", yq9Var32, "\n Found:\n", yq9VarM3392l32));
        }
        LinkedHashMap linkedHashMap33 = new LinkedHashMap();
        linkedHashMap33.put("termWithLanguage", new vq9("termWithLanguage", "TEXT", 1, true, 1, null));
        linkedHashMap33.put("locale", new vq9("locale", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSetM10877i22 = e65.m10877i(linkedHashMap33, "popularMeanings", new vq9("popularMeanings", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet22 = new LinkedHashSet();
        linkedHashSet22.add(new xq9("index_TokenPopularMeaningsEntity_termWithLanguage_locale", false, vz1.m23605K("termWithLanguage", "locale"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var33 = new yq9("TokenPopularMeaningsEntity", linkedHashMap33, linkedHashSetM10877i22, linkedHashSet22);
        yq9 yq9VarM3392l33 = b6d.m3392l(bk8Var, "TokenPopularMeaningsEntity");
        if (!yq9Var33.equals(yq9VarM3392l33)) {
            return new mc0(false, e65.m10873e("TokenPopularMeaningsEntity(com.lingq.core.database.entity.TokenPopularMeaningsEntity).\n Expected:\n", yq9Var33, "\n Found:\n", yq9VarM3392l33));
        }
        LinkedHashMap linkedHashMap34 = new LinkedHashMap();
        linkedHashMap34.put("termWithLanguage", new vq9("termWithLanguage", "TEXT", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i23 = e65.m10877i(linkedHashMap34, "relatedPhrases", new vq9("relatedPhrases", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet23 = new LinkedHashSet();
        linkedHashSet23.add(new xq9("index_TokenRelatedPhrasesEntity_termWithLanguage", false, vz1.m23604J("termWithLanguage"), vz1.m23604J("ASC")));
        yq9 yq9Var34 = new yq9("TokenRelatedPhrasesEntity", linkedHashMap34, linkedHashSetM10877i23, linkedHashSet23);
        yq9 yq9VarM3392l34 = b6d.m3392l(bk8Var, "TokenRelatedPhrasesEntity");
        if (!yq9Var34.equals(yq9VarM3392l34)) {
            return new mc0(false, e65.m10873e("TokenRelatedPhrasesEntity(com.lingq.core.database.entity.TokenRelatedPhrasesEntity).\n Expected:\n", yq9Var34, "\n Found:\n", yq9VarM3392l34));
        }
        LinkedHashMap linkedHashMap35 = new LinkedHashMap();
        linkedHashMap35.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap35.put("language", new vq9("language", "TEXT", 2, true, 1, null));
        linkedHashMap35.put("type", new vq9("type", "TEXT", 3, true, 1, "'content'"));
        linkedHashMap35.put("isDownloaded", new vq9("isDownloaded", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i24 = e65.m10877i(linkedHashMap35, "downloadProgress", new vq9("downloadProgress", "INTEGER", 0, false, 1, null));
        LinkedHashSet linkedHashSet24 = new LinkedHashSet();
        linkedHashSet24.add(new xq9("index_LibraryDownloadEntity_id_language_type", false, vz1.m23605K("id", "language", "type"), vz1.m23605K("ASC", "ASC", "ASC")));
        yq9 yq9Var35 = new yq9("LibraryDownloadEntity", linkedHashMap35, linkedHashSetM10877i24, linkedHashSet24);
        yq9 yq9VarM3392l35 = b6d.m3392l(bk8Var, "LibraryDownloadEntity");
        if (!yq9Var35.equals(yq9VarM3392l35)) {
            return new mc0(false, e65.m10873e("LibraryDownloadEntity(com.lingq.core.database.entity.LibraryDownloadEntity).\n Expected:\n", yq9Var35, "\n Found:\n", yq9VarM3392l35));
        }
        LinkedHashMap linkedHashMap36 = new LinkedHashMap();
        linkedHashMap36.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap36.put("language", new vq9("language", "TEXT", 2, true, 1, null));
        linkedHashMap36.put("isDownloaded", new vq9("isDownloaded", "INTEGER", 0, true, 1, null));
        linkedHashMap36.put("downloadProgress", new vq9("downloadProgress", "INTEGER", 0, true, 1, null));
        linkedHashMap36.put("status", new vq9("status", "TEXT", 0, true, 1, "'idle'"));
        linkedHashMap36.put("errorType", new vq9("errorType", "TEXT", 0, false, 1, "NULL"));
        LinkedHashSet linkedHashSetM10877i25 = e65.m10877i(linkedHashMap36, "lastUpdated", new vq9("lastUpdated", "INTEGER", 0, true, 1, "0"));
        LinkedHashSet linkedHashSet25 = new LinkedHashSet();
        linkedHashSet25.add(new xq9("index_LessonAudioDownloadEntity_id_language", false, vz1.m23605K("id", "language"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var36 = new yq9("LessonAudioDownloadEntity", linkedHashMap36, linkedHashSetM10877i25, linkedHashSet25);
        yq9 yq9VarM3392l36 = b6d.m3392l(bk8Var, "LessonAudioDownloadEntity");
        if (!yq9Var36.equals(yq9VarM3392l36)) {
            return new mc0(false, e65.m10873e("LessonAudioDownloadEntity(com.lingq.core.database.entity.LessonAudioDownloadEntity).\n Expected:\n", yq9Var36, "\n Found:\n", yq9VarM3392l36));
        }
        LinkedHashMap linkedHashMap37 = new LinkedHashMap();
        linkedHashMap37.put("code", new vq9("code", "TEXT", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i26 = e65.m10877i(linkedHashMap37, "tags", new vq9("tags", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet26 = new LinkedHashSet();
        linkedHashSet26.add(new xq9("index_LanguageCardsTagsEntity_code", false, vz1.m23604J("code"), vz1.m23604J("ASC")));
        yq9 yq9Var37 = new yq9("LanguageCardsTagsEntity", linkedHashMap37, linkedHashSetM10877i26, linkedHashSet26);
        yq9 yq9VarM3392l37 = b6d.m3392l(bk8Var, "LanguageCardsTagsEntity");
        if (!yq9Var37.equals(yq9VarM3392l37)) {
            return new mc0(false, e65.m10873e("LanguageCardsTagsEntity(com.lingq.core.database.entity.LanguageCardsTagsEntity).\n Expected:\n", yq9Var37, "\n Found:\n", yq9VarM3392l37));
        }
        LinkedHashMap linkedHashMap38 = new LinkedHashMap();
        linkedHashMap38.put("language", new vq9("language", "TEXT", 1, true, 1, null));
        linkedHashMap38.put("pk", new vq9("pk", "INTEGER", 2, true, 1, null));
        linkedHashMap38.put("title", new vq9("title", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i27 = e65.m10877i(linkedHashMap38, "order", new vq9("order", "INTEGER", 0, true, 1, "0"));
        LinkedHashSet linkedHashSet27 = new LinkedHashSet();
        linkedHashSet27.add(new xq9("index_CourseForImportEntity_language_pk", false, vz1.m23605K("language", "pk"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var38 = new yq9("CourseForImportEntity", linkedHashMap38, linkedHashSetM10877i27, linkedHashSet27);
        yq9 yq9VarM3392l38 = b6d.m3392l(bk8Var, "CourseForImportEntity");
        if (!yq9Var38.equals(yq9VarM3392l38)) {
            return new mc0(false, e65.m10873e("CourseForImportEntity(com.lingq.core.database.entity.CourseForImportEntity).\n Expected:\n", yq9Var38, "\n Found:\n", yq9VarM3392l38));
        }
        LinkedHashMap linkedHashMap39 = new LinkedHashMap();
        linkedHashMap39.put("playlistId", new vq9("playlistId", "INTEGER", 1, true, 1, null));
        linkedHashMap39.put("contentId", new vq9("contentId", "INTEGER", 2, true, 1, null));
        LinkedHashSet linkedHashSetM10877i28 = e65.m10877i(linkedHashMap39, "language", new vq9("language", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet28 = new LinkedHashSet();
        linkedHashSet28.add(new xq9("index_LessonsWithPlaylistJoin_playlistId_contentId", false, vz1.m23605K("playlistId", "contentId"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var39 = new yq9("LessonsWithPlaylistJoin", linkedHashMap39, linkedHashSetM10877i28, linkedHashSet28);
        yq9 yq9VarM3392l39 = b6d.m3392l(bk8Var, "LessonsWithPlaylistJoin");
        if (!yq9Var39.equals(yq9VarM3392l39)) {
            return new mc0(false, e65.m10873e("LessonsWithPlaylistJoin(com.lingq.core.database.entity.LessonsWithPlaylistJoin).\n Expected:\n", yq9Var39, "\n Found:\n", yq9VarM3392l39));
        }
        LinkedHashMap linkedHashMap40 = new LinkedHashMap();
        linkedHashMap40.put("pk", new vq9("pk", "INTEGER", 1, true, 1, null));
        linkedHashMap40.put("contentId", new vq9("contentId", "INTEGER", 2, true, 1, null));
        LinkedHashSet linkedHashSetM10877i29 = e65.m10877i(linkedHashMap40, "courseOrder", new vq9("courseOrder", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSet29 = new LinkedHashSet();
        linkedHashSet29.add(new xq9("index_CoursesAndLessonsJoin_pk_contentId", false, vz1.m23605K("pk", "contentId"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var40 = new yq9("CoursesAndLessonsJoin", linkedHashMap40, linkedHashSetM10877i29, linkedHashSet29);
        yq9 yq9VarM3392l40 = b6d.m3392l(bk8Var, "CoursesAndLessonsJoin");
        if (!yq9Var40.equals(yq9VarM3392l40)) {
            return new mc0(false, e65.m10873e("CoursesAndLessonsJoin(com.lingq.core.database.entity.CoursesAndLessonsJoin).\n Expected:\n", yq9Var40, "\n Found:\n", yq9VarM3392l40));
        }
        LinkedHashMap linkedHashMap41 = new LinkedHashMap();
        linkedHashMap41.put("pk", new vq9("pk", "INTEGER", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i30 = e65.m10877i(linkedHashMap41, "language", new vq9("language", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSet30 = new LinkedHashSet();
        linkedHashSet30.add(new xq9("index_CoursesAndLanguageJoin_pk_language", false, vz1.m23605K("pk", "language"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var41 = new yq9("CoursesAndLanguageJoin", linkedHashMap41, linkedHashSetM10877i30, linkedHashSet30);
        yq9 yq9VarM3392l41 = b6d.m3392l(bk8Var, "CoursesAndLanguageJoin");
        if (!yq9Var41.equals(yq9VarM3392l41)) {
            return new mc0(false, e65.m10873e("CoursesAndLanguageJoin(com.lingq.core.database.entity.CoursesAndLanguageJoin).\n Expected:\n", yq9Var41, "\n Found:\n", yq9VarM3392l41));
        }
        LinkedHashMap linkedHashMap42 = new LinkedHashMap();
        linkedHashMap42.put("pk", new vq9("pk", "INTEGER", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i31 = e65.m10877i(linkedHashMap42, "termWithLanguage", new vq9("termWithLanguage", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSet31 = new LinkedHashSet();
        linkedHashSet31.add(new xq9("index_CourseAndCardsJoin_pk_termWithLanguage", false, vz1.m23605K("pk", "termWithLanguage"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var42 = new yq9("CourseAndCardsJoin", linkedHashMap42, linkedHashSetM10877i31, linkedHashSet31);
        yq9 yq9VarM3392l42 = b6d.m3392l(bk8Var, "CourseAndCardsJoin");
        if (!yq9Var42.equals(yq9VarM3392l42)) {
            return new mc0(false, e65.m10873e("CourseAndCardsJoin(com.lingq.core.database.entity.CourseAndCardsJoin).\n Expected:\n", yq9Var42, "\n Found:\n", yq9VarM3392l42));
        }
        LinkedHashMap linkedHashMap43 = new LinkedHashMap();
        linkedHashMap43.put("challengeCode", new vq9("challengeCode", "TEXT", 1, true, 1, null));
        linkedHashMap43.put("metric", new vq9("metric", "TEXT", 2, true, 1, null));
        linkedHashMap43.put("rank", new vq9("rank", "INTEGER", 3, true, 1, null));
        linkedHashMap43.put("language", new vq9("language", "TEXT", 4, true, 1, null));
        linkedHashMap43.put("profile", new vq9("profile", "TEXT", 0, false, 1, null));
        linkedHashMap43.put("score", new vq9("score", "INTEGER", 0, true, 1, null));
        linkedHashMap43.put("scoreBehindLeader", new vq9("scoreBehindLeader", "INTEGER", 0, true, 1, null));
        linkedHashMap43.put("isCompleted", new vq9("isCompleted", "INTEGER", 0, true, 1, null));
        linkedHashMap43.put("bookTitle", new vq9("bookTitle", "TEXT", 0, true, 1, "''"));
        LinkedHashSet linkedHashSetM10877i32 = e65.m10877i(linkedHashMap43, "bookLanguage", new vq9("bookLanguage", "TEXT", 0, true, 1, "''"));
        LinkedHashSet linkedHashSet32 = new LinkedHashSet();
        linkedHashSet32.add(new xq9("index_ChallengeRankingEntity_challengeCode_metric_rank_language", false, vz1.m23605K("challengeCode", "metric", "rank", "language"), vz1.m23605K("ASC", "ASC", "ASC", "ASC")));
        yq9 yq9Var43 = new yq9("ChallengeRankingEntity", linkedHashMap43, linkedHashSetM10877i32, linkedHashSet32);
        yq9 yq9VarM3392l43 = b6d.m3392l(bk8Var, "ChallengeRankingEntity");
        if (!yq9Var43.equals(yq9VarM3392l43)) {
            return new mc0(false, e65.m10873e("ChallengeRankingEntity(com.lingq.core.database.entity.ChallengeRankingEntity).\n Expected:\n", yq9Var43, "\n Found:\n", yq9VarM3392l43));
        }
        LinkedHashMap linkedHashMap44 = new LinkedHashMap();
        linkedHashMap44.put("language", new vq9("language", "TEXT", 3, true, 1, null));
        linkedHashMap44.put("challengeCode", new vq9("challengeCode", "TEXT", 1, true, 1, null));
        linkedHashMap44.put("code", new vq9("code", "TEXT", 2, true, 1, null));
        linkedHashMap44.put("value", new vq9("value", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i33 = e65.m10877i(linkedHashMap44, "title", new vq9("title", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSet33 = new LinkedHashSet();
        linkedHashSet33.add(new xq9("index_ChallengeDetailStatsEntity_challengeCode_code_language", false, vz1.m23605K("challengeCode", "code", "language"), vz1.m23605K("ASC", "ASC", "ASC")));
        yq9 yq9Var44 = new yq9("ChallengeDetailStatsEntity", linkedHashMap44, linkedHashSetM10877i33, linkedHashSet33);
        yq9 yq9VarM3392l44 = b6d.m3392l(bk8Var, "ChallengeDetailStatsEntity");
        if (!yq9Var44.equals(yq9VarM3392l44)) {
            return new mc0(false, e65.m10873e("ChallengeDetailStatsEntity(com.lingq.core.database.entity.ChallengeDetailStatsEntity).\n Expected:\n", yq9Var44, "\n Found:\n", yq9VarM3392l44));
        }
        LinkedHashMap linkedHashMap45 = new LinkedHashMap();
        linkedHashMap45.put("language", new vq9("language", "TEXT", 3, true, 1, null));
        linkedHashMap45.put("challengeCode", new vq9("challengeCode", "TEXT", 1, true, 1, null));
        linkedHashMap45.put("code", new vq9("code", "TEXT", 2, true, 1, null));
        linkedHashMap45.put("title", new vq9("title", "TEXT", 0, true, 1, null));
        linkedHashMap45.put("progress", new vq9("progress", "REAL", 0, true, 1, null));
        linkedHashMap45.put("actual", new vq9("actual", "REAL", 0, true, 1, null));
        linkedHashMap45.put("target", new vq9("target", "REAL", 0, true, 1, null));
        linkedHashMap45.put("bookId", new vq9("bookId", "INTEGER", 0, true, 1, "0"));
        linkedHashMap45.put("bookImage", new vq9("bookImage", "TEXT", 0, true, 1, "''"));
        LinkedHashSet linkedHashSetM10877i34 = e65.m10877i(linkedHashMap45, "bookLanguage", new vq9("bookLanguage", "TEXT", 0, true, 1, "''"));
        LinkedHashSet linkedHashSet34 = new LinkedHashSet();
        linkedHashSet34.add(new xq9("index_ChallengeStatsEntity_challengeCode_code_language", false, vz1.m23605K("challengeCode", "code", "language"), vz1.m23605K("ASC", "ASC", "ASC")));
        yq9 yq9Var45 = new yq9("ChallengeStatsEntity", linkedHashMap45, linkedHashSetM10877i34, linkedHashSet34);
        yq9 yq9VarM3392l45 = b6d.m3392l(bk8Var, "ChallengeStatsEntity");
        if (!yq9Var45.equals(yq9VarM3392l45)) {
            return new mc0(false, e65.m10873e("ChallengeStatsEntity(com.lingq.core.database.entity.ChallengeStatsEntity).\n Expected:\n", yq9Var45, "\n Found:\n", yq9VarM3392l45));
        }
        LinkedHashMap linkedHashMap46 = new LinkedHashMap();
        linkedHashMap46.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap46.put("language", new vq9("language", "TEXT", 0, true, 1, null));
        linkedHashMap46.put("description", new vq9("description", "TEXT", 0, false, 1, null));
        linkedHashMap46.put("image", new vq9("image", "TEXT", 0, false, 1, null));
        linkedHashMap46.put("title", new vq9("title", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSetM10877i35 = e65.m10877i(linkedHashMap46, "url", new vq9("url", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSet35 = new LinkedHashSet();
        linkedHashSet35.add(new xq9("index_ProviderEntity_id", false, vz1.m23604J("id"), vz1.m23604J("ASC")));
        yq9 yq9Var46 = new yq9("ProviderEntity", linkedHashMap46, linkedHashSetM10877i35, linkedHashSet35);
        yq9 yq9VarM3392l46 = b6d.m3392l(bk8Var, "ProviderEntity");
        if (!yq9Var46.equals(yq9VarM3392l46)) {
            return new mc0(false, e65.m10873e("ProviderEntity(com.lingq.core.database.entity.ProviderEntity).\n Expected:\n", yq9Var46, "\n Found:\n", yq9VarM3392l46));
        }
        LinkedHashMap linkedHashMap47 = new LinkedHashMap();
        LinkedHashSet linkedHashSetM10877i36 = e65.m10877i(linkedHashMap47, "title", new vq9("title", "TEXT", 1, true, 1, null));
        LinkedHashSet linkedHashSet36 = new LinkedHashSet();
        linkedHashSet36.add(new xq9("index_LessonTagEntity_title", false, vz1.m23604J("title"), vz1.m23604J("ASC")));
        yq9 yq9Var47 = new yq9("LessonTagEntity", linkedHashMap47, linkedHashSetM10877i36, linkedHashSet36);
        yq9 yq9VarM3392l47 = b6d.m3392l(bk8Var, "LessonTagEntity");
        if (!yq9Var47.equals(yq9VarM3392l47)) {
            return new mc0(false, e65.m10873e("LessonTagEntity(com.lingq.core.database.entity.LessonTagEntity).\n Expected:\n", yq9Var47, "\n Found:\n", yq9VarM3392l47));
        }
        LinkedHashMap linkedHashMap48 = new LinkedHashMap();
        linkedHashMap48.put("pk", new vq9("pk", "INTEGER", 1, true, 1, null));
        linkedHashMap48.put("url", new vq9("url", "TEXT", 0, false, 1, null));
        linkedHashMap48.put("language", new vq9("language", "TEXT", 0, false, 1, null));
        linkedHashMap48.put("notificationLanguage", new vq9("notificationLanguage", "TEXT", 0, false, 1, null));
        linkedHashMap48.put("type", new vq9("type", "TEXT", 0, false, 1, null));
        linkedHashMap48.put("title", new vq9("title", "TEXT", 0, false, 1, null));
        linkedHashMap48.put("message", new vq9("message", "TEXT", 0, false, 1, null));
        linkedHashMap48.put("image", new vq9("image", "TEXT", 0, false, 1, null));
        linkedHashMap48.put("isNew", new vq9("isNew", "INTEGER", 0, false, 1, null));
        yq9 yq9Var48 = new yq9("NotificationEntity", linkedHashMap48, e65.m10877i(linkedHashMap48, "timestamp", new vq9("timestamp", "TEXT", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l48 = b6d.m3392l(bk8Var, "NotificationEntity");
        if (!yq9Var48.equals(yq9VarM3392l48)) {
            return new mc0(false, e65.m10873e("NotificationEntity(com.lingq.core.database.entity.NotificationEntity).\n Expected:\n", yq9Var48, "\n Found:\n", yq9VarM3392l48));
        }
        LinkedHashMap linkedHashMap49 = new LinkedHashMap();
        linkedHashMap49.put("language", new vq9("language", "TEXT", 1, true, 1, null));
        linkedHashMap49.put("streakDays", new vq9("streakDays", "INTEGER", 0, false, 1, null));
        linkedHashMap49.put("coins", new vq9("coins", "REAL", 0, false, 1, null));
        linkedHashMap49.put("latestStreakDays", new vq9("latestStreakDays", "INTEGER", 0, false, 1, null));
        linkedHashMap49.put("isStreakBroken", new vq9("isStreakBroken", "INTEGER", 0, false, 1, null));
        yq9 yq9Var49 = new yq9("StreakEntity", linkedHashMap49, e65.m10877i(linkedHashMap49, "brokenStreakDate", new vq9("brokenStreakDate", "TEXT", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l49 = b6d.m3392l(bk8Var, "StreakEntity");
        if (!yq9Var49.equals(yq9VarM3392l49)) {
            return new mc0(false, e65.m10873e("StreakEntity(com.lingq.core.database.entity.StreakEntity).\n Expected:\n", yq9Var49, "\n Found:\n", yq9VarM3392l49));
        }
        LinkedHashMap linkedHashMap50 = new LinkedHashMap();
        linkedHashMap50.put("languageAndSlug", new vq9("languageAndSlug", "TEXT", 1, true, 1, null));
        yq9 yq9Var50 = new yq9("MilestoneMetEntity", linkedHashMap50, e65.m10877i(linkedHashMap50, "metAt", new vq9("metAt", "TEXT", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l50 = b6d.m3392l(bk8Var, "MilestoneMetEntity");
        if (!yq9Var50.equals(yq9VarM3392l50)) {
            return new mc0(false, e65.m10873e("MilestoneMetEntity(com.lingq.core.database.entity.MilestoneMetEntity).\n Expected:\n", yq9Var50, "\n Found:\n", yq9VarM3392l50));
        }
        LinkedHashMap linkedHashMap51 = new LinkedHashMap();
        linkedHashMap51.put("language", new vq9("language", "TEXT", 1, true, 1, null));
        linkedHashMap51.put("knownWords", new vq9("knownWords", "INTEGER", 0, true, 1, null));
        linkedHashMap51.put("lingqs", new vq9("lingqs", "INTEGER", 0, true, 1, null));
        yq9 yq9Var51 = new yq9("MilestoneStatsEntity", linkedHashMap51, e65.m10877i(linkedHashMap51, "dailyScore", new vq9("dailyScore", "INTEGER", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l51 = b6d.m3392l(bk8Var, "MilestoneStatsEntity");
        if (!yq9Var51.equals(yq9VarM3392l51)) {
            return new mc0(false, e65.m10873e("MilestoneStatsEntity(com.lingq.core.database.entity.MilestoneStatsEntity).\n Expected:\n", yq9Var51, "\n Found:\n", yq9VarM3392l51));
        }
        LinkedHashMap linkedHashMap52 = new LinkedHashMap();
        linkedHashMap52.put("id", new vq9("id", "TEXT", 1, true, 1, null));
        linkedHashMap52.put("language", new vq9("language", "TEXT", 3, true, 1, null));
        linkedHashMap52.put("query", new vq9("query", "TEXT", 4, true, 1, null));
        linkedHashMap52.put("type", new vq9("type", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSetM10877i37 = e65.m10877i(linkedHashMap52, "title", new vq9("title", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSet37 = new LinkedHashSet();
        linkedHashSet37.add(new xq9("index_LibraryFastSearchEntity_id_type_language_query", false, vz1.m23605K("id", "type", "language", "query"), vz1.m23605K("ASC", "ASC", "ASC", "ASC")));
        yq9 yq9Var52 = new yq9("LibraryFastSearchEntity", linkedHashMap52, linkedHashSetM10877i37, linkedHashSet37);
        yq9 yq9VarM3392l52 = b6d.m3392l(bk8Var, "LibraryFastSearchEntity");
        if (!yq9Var52.equals(yq9VarM3392l52)) {
            return new mc0(false, e65.m10873e("LibraryFastSearchEntity(com.lingq.core.database.entity.LibraryFastSearchEntity).\n Expected:\n", yq9Var52, "\n Found:\n", yq9VarM3392l52));
        }
        LinkedHashMap linkedHashMap53 = new LinkedHashMap();
        linkedHashMap53.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap53.put("language", new vq9("language", "TEXT", 0, false, 1, null));
        linkedHashMap53.put("firstName", new vq9("firstName", "TEXT", 0, false, 1, null));
        linkedHashMap53.put("lastName", new vq9("lastName", "TEXT", 0, false, 1, null));
        linkedHashMap53.put("photo", new vq9("photo", "TEXT", 0, false, 1, null));
        linkedHashMap53.put("username", new vq9("username", "TEXT", 0, false, 1, null));
        yq9 yq9Var53 = new yq9("SharedByUserEntity", linkedHashMap53, e65.m10877i(linkedHashMap53, "role", new vq9("role", "TEXT", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l53 = b6d.m3392l(bk8Var, "SharedByUserEntity");
        if (!yq9Var53.equals(yq9VarM3392l53)) {
            return new mc0(false, e65.m10873e("SharedByUserEntity(com.lingq.core.database.entity.SharedByUserEntity).\n Expected:\n", yq9Var53, "\n Found:\n", yq9VarM3392l53));
        }
        LinkedHashMap linkedHashMap54 = new LinkedHashMap();
        linkedHashMap54.put("language", new vq9("language", "TEXT", 1, true, 1, null));
        linkedHashMap54.put("query", new vq9("query", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSetM10877i38 = e65.m10877i(linkedHashMap54, "userId", new vq9("userId", "INTEGER", 3, true, 1, null));
        LinkedHashSet linkedHashSet38 = new LinkedHashSet();
        linkedHashSet38.add(new xq9("index_SharedByUserAndQueryJoin_language_query_userId", false, vz1.m23605K("language", "query", "userId"), vz1.m23605K("ASC", "ASC", "ASC")));
        yq9 yq9Var54 = new yq9("SharedByUserAndQueryJoin", linkedHashMap54, linkedHashSetM10877i38, linkedHashSet38);
        yq9 yq9VarM3392l54 = b6d.m3392l(bk8Var, "SharedByUserAndQueryJoin");
        if (!yq9Var54.equals(yq9VarM3392l54)) {
            return new mc0(false, e65.m10873e("SharedByUserAndQueryJoin(com.lingq.core.database.entity.SharedByUserAndQueryJoin).\n Expected:\n", yq9Var54, "\n Found:\n", yq9VarM3392l54));
        }
        LinkedHashMap linkedHashMap55 = new LinkedHashMap();
        linkedHashMap55.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap55.put("language", new vq9("language", "TEXT", 0, true, 1, null));
        linkedHashMap55.put("title", new vq9("title", "TEXT", 0, true, 1, null));
        linkedHashMap55.put("startDate", new vq9("startDate", "TEXT", 0, true, 1, null));
        linkedHashMap55.put("endDate", new vq9("endDate", "TEXT", 0, true, 1, null));
        linkedHashMap55.put("noticeType", new vq9("noticeType", "TEXT", 0, true, 1, null));
        yq9 yq9Var55 = new yq9("NoticeEntity", linkedHashMap55, e65.m10877i(linkedHashMap55, "isShown", new vq9("isShown", "INTEGER", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l55 = b6d.m3392l(bk8Var, "NoticeEntity");
        if (!yq9Var55.equals(yq9VarM3392l55)) {
            return new mc0(false, e65.m10873e("NoticeEntity(com.lingq.core.database.entity.NoticeEntity).\n Expected:\n", yq9Var55, "\n Found:\n", yq9VarM3392l55));
        }
        LinkedHashMap linkedHashMap56 = new LinkedHashMap();
        linkedHashMap56.put("pk", new vq9("pk", "INTEGER", 1, true, 1, null));
        linkedHashMap56.put("username", new vq9("username", "TEXT", 0, false, 1, null));
        linkedHashMap56.put("photo", new vq9("photo", "TEXT", 0, false, 1, null));
        yq9 yq9Var56 = new yq9("ReferralEntity", linkedHashMap56, e65.m10877i(linkedHashMap56, "dateJoined", new vq9("dateJoined", "TEXT", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l56 = b6d.m3392l(bk8Var, "ReferralEntity");
        if (!yq9Var56.equals(yq9VarM3392l56)) {
            return new mc0(false, e65.m10873e("ReferralEntity(com.lingq.core.database.entity.ReferralEntity).\n Expected:\n", yq9Var56, "\n Found:\n", yq9VarM3392l56));
        }
        LinkedHashMap linkedHashMap57 = new LinkedHashMap();
        linkedHashMap57.put("contentId", new vq9("contentId", "INTEGER", 1, true, 1, null));
        linkedHashMap57.put("readWords", new vq9("readWords", "REAL", 0, true, 1, null));
        linkedHashMap57.put("lingqsCreated", new vq9("lingqsCreated", "REAL", 0, true, 1, null));
        linkedHashMap57.put("knownWords", new vq9("knownWords", "REAL", 0, true, 1, null));
        linkedHashMap57.put("listeningTime", new vq9("listeningTime", "REAL", 0, true, 1, null));
        linkedHashMap57.put("coinsNew", new vq9("coinsNew", "REAL", 0, true, 1, null));
        linkedHashMap57.put("earnedCoins", new vq9("earnedCoins", "REAL", 0, true, 1, null));
        linkedHashMap57.put("studyTime", new vq9("studyTime", "REAL", 0, true, 1, "0.0"));
        LinkedHashSet linkedHashSetM10877i39 = e65.m10877i(linkedHashMap57, "wpm", new vq9("wpm", "REAL", 0, true, 1, "0.0"));
        LinkedHashSet linkedHashSet39 = new LinkedHashSet();
        linkedHashSet39.add(new xq9("index_LessonStatsEntity_contentId", false, vz1.m23604J("contentId"), vz1.m23604J("ASC")));
        yq9 yq9Var57 = new yq9("LessonStatsEntity", linkedHashMap57, linkedHashSetM10877i39, linkedHashSet39);
        yq9 yq9VarM3392l57 = b6d.m3392l(bk8Var, "LessonStatsEntity");
        if (!yq9Var57.equals(yq9VarM3392l57)) {
            return new mc0(false, e65.m10873e("LessonStatsEntity(com.lingq.core.database.entity.LessonStatsEntity).\n Expected:\n", yq9Var57, "\n Found:\n", yq9VarM3392l57));
        }
        LinkedHashMap linkedHashMap58 = new LinkedHashMap();
        linkedHashMap58.put("termWithLanguage", new vq9("termWithLanguage", "TEXT", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i40 = e65.m10877i(linkedHashMap58, "lotd", new vq9("lotd", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet40 = new LinkedHashSet();
        linkedHashSet40.add(new xq9("index_CardsAndLOTDJoin_termWithLanguage", false, vz1.m23604J("termWithLanguage"), vz1.m23604J("ASC")));
        yq9 yq9Var58 = new yq9("CardsAndLOTDJoin", linkedHashMap58, linkedHashSetM10877i40, linkedHashSet40);
        yq9 yq9VarM3392l58 = b6d.m3392l(bk8Var, "CardsAndLOTDJoin");
        if (!yq9Var58.equals(yq9VarM3392l58)) {
            return new mc0(false, e65.m10873e("CardsAndLOTDJoin(com.lingq.core.database.entity.CardsAndLOTDJoin).\n Expected:\n", yq9Var58, "\n Found:\n", yq9VarM3392l58));
        }
        LinkedHashMap linkedHashMap59 = new LinkedHashMap();
        linkedHashMap59.put("contentId", new vq9("contentId", "INTEGER", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i41 = e65.m10877i(linkedHashMap59, "termWithLanguage", new vq9("termWithLanguage", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSet41 = new LinkedHashSet();
        linkedHashSet41.add(new xq9("index_LessonAndCardsFromJoin_contentId_termWithLanguage", false, vz1.m23605K("contentId", "termWithLanguage"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var59 = new yq9("LessonAndCardsFromJoin", linkedHashMap59, linkedHashSetM10877i41, linkedHashSet41);
        yq9 yq9VarM3392l59 = b6d.m3392l(bk8Var, "LessonAndCardsFromJoin");
        if (!yq9Var59.equals(yq9VarM3392l59)) {
            return new mc0(false, e65.m10873e("LessonAndCardsFromJoin(com.lingq.core.database.entity.LessonAndCardsFromJoin).\n Expected:\n", yq9Var59, "\n Found:\n", yq9VarM3392l59));
        }
        LinkedHashMap linkedHashMap60 = new LinkedHashMap();
        linkedHashMap60.put("contentId", new vq9("contentId", "INTEGER", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i42 = e65.m10877i(linkedHashMap60, "termWithLanguage", new vq9("termWithLanguage", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSet42 = new LinkedHashSet();
        linkedHashSet42.add(new xq9("index_LessonAndWordsFromJoin_contentId_termWithLanguage", false, vz1.m23605K("contentId", "termWithLanguage"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var60 = new yq9("LessonAndWordsFromJoin", linkedHashMap60, linkedHashSetM10877i42, linkedHashSet42);
        yq9 yq9VarM3392l60 = b6d.m3392l(bk8Var, "LessonAndWordsFromJoin");
        if (!yq9Var60.equals(yq9VarM3392l60)) {
            return new mc0(false, e65.m10873e("LessonAndWordsFromJoin(com.lingq.core.database.entity.LessonAndWordsFromJoin).\n Expected:\n", yq9Var60, "\n Found:\n", yq9VarM3392l60));
        }
        LinkedHashMap linkedHashMap61 = new LinkedHashMap();
        linkedHashMap61.put("fromId", new vq9("fromId", "INTEGER", 1, true, 1, null));
        linkedHashMap61.put("toId", new vq9("toId", "INTEGER", 0, false, 1, null));
        LinkedHashSet linkedHashSetM10877i43 = e65.m10877i(linkedHashMap61, "isLocked", new vq9("isLocked", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSet43 = new LinkedHashSet();
        linkedHashSet43.add(new xq9("index_LessonsSimplifiedJoin_fromId", false, vz1.m23604J("fromId"), vz1.m23604J("ASC")));
        yq9 yq9Var61 = new yq9("LessonsSimplifiedJoin", linkedHashMap61, linkedHashSetM10877i43, linkedHashSet43);
        yq9 yq9VarM3392l61 = b6d.m3392l(bk8Var, "LessonsSimplifiedJoin");
        if (!yq9Var61.equals(yq9VarM3392l61)) {
            return new mc0(false, e65.m10873e("LessonsSimplifiedJoin(com.lingq.core.database.entity.LessonsSimplifiedJoin).\n Expected:\n", yq9Var61, "\n Found:\n", yq9VarM3392l61));
        }
        LinkedHashMap linkedHashMap62 = new LinkedHashMap();
        linkedHashMap62.put("pk", new vq9("pk", "INTEGER", 1, true, 1, null));
        linkedHashMap62.put("contentId", new vq9("contentId", "INTEGER", 2, true, 1, null));
        linkedHashMap62.put("courseOrder", new vq9("courseOrder", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i44 = e65.m10877i(linkedHashMap62, "sort", new vq9("sort", "TEXT", 3, true, 1, null));
        LinkedHashSet linkedHashSet44 = new LinkedHashSet();
        linkedHashSet44.add(new xq9("index_CoursesAndLessonsSortJoin_pk_contentId_sort", false, vz1.m23605K("pk", "contentId", "sort"), vz1.m23605K("ASC", "ASC", "ASC")));
        yq9 yq9Var62 = new yq9("CoursesAndLessonsSortJoin", linkedHashMap62, linkedHashSetM10877i44, linkedHashSet44);
        yq9 yq9VarM3392l62 = b6d.m3392l(bk8Var, "CoursesAndLessonsSortJoin");
        if (!yq9Var62.equals(yq9VarM3392l62)) {
            return new mc0(false, e65.m10873e("CoursesAndLessonsSortJoin(com.lingq.core.database.entity.CoursesAndLessonsSortJoin).\n Expected:\n", yq9Var62, "\n Found:\n", yq9VarM3392l62));
        }
        LinkedHashMap linkedHashMap63 = new LinkedHashMap();
        linkedHashMap63.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap63.put("lessonId", new vq9("lessonId", "INTEGER", 0, true, 1, null));
        linkedHashMap63.put("title", new vq9("title", "TEXT", 0, true, 1, null));
        linkedHashMap63.put("image", new vq9("image", "TEXT", 0, false, 1, null));
        linkedHashMap63.put("sourceType", new vq9("sourceType", "TEXT", 0, false, 1, null));
        linkedHashMap63.put("sourceName", new vq9("sourceName", "TEXT", 0, false, 1, null));
        linkedHashMap63.put("sourceUrl", new vq9("sourceUrl", "TEXT", 0, false, 1, null));
        yq9 yq9Var63 = new yq9("LessonNextSuggestionEntity", linkedHashMap63, e65.m10877i(linkedHashMap63, "status", new vq9("status", "TEXT", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l63 = b6d.m3392l(bk8Var, "LessonNextSuggestionEntity");
        if (!yq9Var63.equals(yq9VarM3392l63)) {
            return new mc0(false, e65.m10873e("LessonNextSuggestionEntity(com.lingq.core.database.entity.LessonNextSuggestionEntity).\n Expected:\n", yq9Var63, "\n Found:\n", yq9VarM3392l63));
        }
        mc0 mc0VarM20587x = m20587x(bk8Var);
        return !mc0VarM20587x.f51053b ? mc0VarM20587x : new mc0(true, null);
    }

    /* JADX INFO: renamed from: x */
    public static mc0 m20587x(bk8 bk8Var) throws Exception {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("name", new vq9("name", "TEXT", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i = e65.m10877i(linkedHashMap, "language", new vq9("language", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new xq9("index_SourceBlacklistEntity_name_language", false, vz1.m23605K("name", "language"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var = new yq9("SourceBlacklistEntity", linkedHashMap, linkedHashSetM10877i, linkedHashSet);
        yq9 yq9VarM3392l = b6d.m3392l(bk8Var, "SourceBlacklistEntity");
        if (!yq9Var.equals(yq9VarM3392l)) {
            return new mc0(false, e65.m10873e("SourceBlacklistEntity(com.lingq.core.database.entity.SourceBlacklistEntity).\n Expected:\n", yq9Var, "\n Found:\n", yq9VarM3392l));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap2.put("language", new vq9("language", "TEXT", 2, true, 1, null));
        LinkedHashSet linkedHashSetM10877i2 = e65.m10877i(linkedHashMap2, "title", new vq9("title", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new xq9("index_CourseBlacklistEntity_id_language", false, vz1.m23605K("id", "language"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var2 = new yq9("CourseBlacklistEntity", linkedHashMap2, linkedHashSetM10877i2, linkedHashSet2);
        yq9 yq9VarM3392l2 = b6d.m3392l(bk8Var, "CourseBlacklistEntity");
        if (!yq9Var2.equals(yq9VarM3392l2)) {
            return new mc0(false, e65.m10873e("CourseBlacklistEntity(com.lingq.core.database.entity.CourseBlacklistEntity).\n Expected:\n", yq9Var2, "\n Found:\n", yq9VarM3392l2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new vq9("id", "TEXT", 1, true, 1, null));
        linkedHashMap3.put("lessonId", new vq9("lessonId", "INTEGER", 0, true, 1, null));
        linkedHashMap3.put("word", new vq9("word", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("sentence", new vq9("sentence", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("languageSrc", new vq9("languageSrc", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("languageDst", new vq9("languageDst", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("translation", new vq9("translation", "TEXT", 0, true, 1, null));
        linkedHashMap3.put("sentenceIndex", new vq9("sentenceIndex", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i3 = e65.m10877i(linkedHashMap3, "sentenceTokenIndex", new vq9("sentenceTokenIndex", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new xq9("index_TokenCwtEntity_id", false, vz1.m23604J("id"), vz1.m23604J("ASC")));
        yq9 yq9Var3 = new yq9("TokenCwtEntity", linkedHashMap3, linkedHashSetM10877i3, linkedHashSet3);
        yq9 yq9VarM3392l3 = b6d.m3392l(bk8Var, "TokenCwtEntity");
        if (!yq9Var3.equals(yq9VarM3392l3)) {
            return new mc0(false, e65.m10873e("TokenCwtEntity(com.lingq.core.database.entity.TokenCwtEntity).\n Expected:\n", yq9Var3, "\n Found:\n", yq9VarM3392l3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("languageAndPeriod", new vq9("languageAndPeriod", "TEXT", 1, true, 1, null));
        linkedHashMap4.put("language", new vq9("language", "TEXT", 0, true, 1, null));
        linkedHashMap4.put("period", new vq9("period", "TEXT", 0, true, 1, null));
        linkedHashMap4.put("lessonCompleted_overall", new vq9("lessonCompleted_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("lessonCompleted_change", new vq9("lessonCompleted_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("speakingUsage_overall", new vq9("speakingUsage_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("speakingUsage_change", new vq9("speakingUsage_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("coinWords_overall", new vq9("coinWords_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("coinWords_change", new vq9("coinWords_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("lessonShared_overall", new vq9("lessonShared_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("lessonShared_change", new vq9("lessonShared_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("translationsShared_overall", new vq9("translationsShared_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("translationsShared_change", new vq9("translationsShared_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("lessonPublished_overall", new vq9("lessonPublished_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("lessonPublished_change", new vq9("lessonPublished_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("studyTime_overall", new vq9("studyTime_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("studyTime_change", new vq9("studyTime_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("wpm_overall", new vq9("wpm_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("wpm_change", new vq9("wpm_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("lessonTaken_overall", new vq9("lessonTaken_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("lessonTaken_change", new vq9("lessonTaken_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("translationsCreated_overall", new vq9("translationsCreated_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("translationsCreated_change", new vq9("translationsCreated_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("learnedWords_overall", new vq9("learnedWords_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("learnedWords_change", new vq9("learnedWords_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("readingUsage_overall", new vq9("readingUsage_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("readingUsage_change", new vq9("readingUsage_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("listening_overall", new vq9("listening_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("listening_change", new vq9("listening_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("earnedCoins_overall", new vq9("earnedCoins_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("earnedCoins_change", new vq9("earnedCoins_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("coinsRead_overall", new vq9("coinsRead_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("coinsRead_change", new vq9("coinsRead_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("reviewUsage_overall", new vq9("reviewUsage_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("reviewUsage_change", new vq9("reviewUsage_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("listeningUsage_overall", new vq9("listeningUsage_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("listeningUsage_change", new vq9("listeningUsage_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("writing_overall", new vq9("writing_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("writing_change", new vq9("writing_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("createdLingQs_overall", new vq9("createdLingQs_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("createdLingQs_change", new vq9("createdLingQs_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("knownWords_overall", new vq9("knownWords_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("knownWords_change", new vq9("knownWords_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("lessonImported_overall", new vq9("lessonImported_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("lessonImported_change", new vq9("lessonImported_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("translationsUsed_overall", new vq9("translationsUsed_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("translationsUsed_change", new vq9("translationsUsed_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("reading_overall", new vq9("reading_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("reading_change", new vq9("reading_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("coinsListen_overall", new vq9("coinsListen_overall", "REAL", 0, true, 1, null));
        linkedHashMap4.put("coinsListen_change", new vq9("coinsListen_change", "REAL", 0, true, 1, null));
        linkedHashMap4.put("speaking_overall", new vq9("speaking_overall", "REAL", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i4 = e65.m10877i(linkedHashMap4, "speaking_change", new vq9("speaking_change", "REAL", 0, true, 1, null));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new xq9("index_LanguageStatsEntity_languageAndPeriod", false, vz1.m23604J("languageAndPeriod"), vz1.m23604J("ASC")));
        yq9 yq9Var4 = new yq9("LanguageStatsEntity", linkedHashMap4, linkedHashSetM10877i4, linkedHashSet4);
        yq9 yq9VarM3392l4 = b6d.m3392l(bk8Var, "LanguageStatsEntity");
        if (!yq9Var4.equals(yq9VarM3392l4)) {
            return new mc0(false, e65.m10873e("LanguageStatsEntity(com.lingq.core.database.entity.LanguageStatsEntity).\n Expected:\n", yq9Var4, "\n Found:\n", yq9VarM3392l4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("language", new vq9("language", "TEXT", 1, true, 1, null));
        linkedHashMap5.put("dailyGoal", new vq9("dailyGoal", "INTEGER", 0, true, 1, null));
        linkedHashMap5.put("month", new vq9("month", "INTEGER", 2, true, 1, null));
        linkedHashMap5.put("year", new vq9("year", "INTEGER", 3, true, 1, null));
        yq9 yq9Var5 = new yq9("StatsCalendarEntity", linkedHashMap5, e65.m10877i(linkedHashMap5, "stats", new vq9("stats", "TEXT", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l5 = b6d.m3392l(bk8Var, "StatsCalendarEntity");
        if (!yq9Var5.equals(yq9VarM3392l5)) {
            return new mc0(false, e65.m10873e("StatsCalendarEntity(com.lingq.core.database.entity.StatsCalendarEntity).\n Expected:\n", yq9Var5, "\n Found:\n", yq9VarM3392l5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap6.put("title", new vq9("title", "TEXT", 0, true, 1, null));
        linkedHashMap6.put("image", new vq9("image", "TEXT", 0, true, 1, null));
        linkedHashMap6.put("coins", new vq9("coins", "REAL", 0, true, 1, null));
        linkedHashMap6.put("targetLanguage", new vq9("targetLanguage", "TEXT", 0, true, 1, null));
        linkedHashMap6.put("dictionaryLanguage", new vq9("dictionaryLanguage", "TEXT", 0, true, 1, null));
        linkedHashMap6.put("startedAt", new vq9("startedAt", "TEXT", 0, true, 1, null));
        linkedHashMap6.put("updatedAt", new vq9("updatedAt", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i5 = e65.m10877i(linkedHashMap6, "history", new vq9("history", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new xq9("index_ChatHistoryEntity_id", false, vz1.m23604J("id"), vz1.m23604J("ASC")));
        yq9 yq9Var6 = new yq9("ChatHistoryEntity", linkedHashMap6, linkedHashSetM10877i5, linkedHashSet5);
        yq9 yq9VarM3392l6 = b6d.m3392l(bk8Var, "ChatHistoryEntity");
        if (!yq9Var6.equals(yq9VarM3392l6)) {
            return new mc0(false, e65.m10873e("ChatHistoryEntity(com.lingq.core.database.entity.ChatHistoryEntity).\n Expected:\n", yq9Var6, "\n Found:\n", yq9VarM3392l6));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap7.put("sentences", new vq9("sentences", "INTEGER", 0, true, 1, null));
        linkedHashMap7.put("knownWords", new vq9("knownWords", "INTEGER", 0, true, 1, null));
        linkedHashMap7.put("totalWords", new vq9("totalWords", "INTEGER", 0, true, 1, null));
        linkedHashMap7.put("uniqueWords", new vq9("uniqueWords", "INTEGER", 0, true, 1, null));
        linkedHashMap7.put("cards", new vq9("cards", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i6 = e65.m10877i(linkedHashMap7, "coins", new vq9("coins", "REAL", 0, true, 1, null));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new xq9("index_ChatStatsEntity_id", false, vz1.m23604J("id"), vz1.m23604J("ASC")));
        yq9 yq9Var7 = new yq9("ChatStatsEntity", linkedHashMap7, linkedHashSetM10877i6, linkedHashSet6);
        yq9 yq9VarM3392l7 = b6d.m3392l(bk8Var, "ChatStatsEntity");
        if (!yq9Var7.equals(yq9VarM3392l7)) {
            return new mc0(false, e65.m10873e("ChatStatsEntity(com.lingq.core.database.entity.ChatStatsEntity).\n Expected:\n", yq9Var7, "\n Found:\n", yq9VarM3392l7));
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("language", new vq9("language", "TEXT", 1, true, 1, null));
        linkedHashMap8.put("chatId", new vq9("chatId", "INTEGER", 2, true, 1, null));
        linkedHashMap8.put("position", new vq9("position", "INTEGER", 3, true, 1, null));
        linkedHashMap8.put("source", new vq9("source", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSetM10877i7 = e65.m10877i(linkedHashMap8, "target", new vq9("target", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new xq9("index_ChatSuggestionEntity_language_chatId", false, vz1.m23605K("language", "chatId"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var8 = new yq9("ChatSuggestionEntity", linkedHashMap8, linkedHashSetM10877i7, linkedHashSet7);
        yq9 yq9VarM3392l8 = b6d.m3392l(bk8Var, "ChatSuggestionEntity");
        if (!yq9Var8.equals(yq9VarM3392l8)) {
            return new mc0(false, e65.m10873e("ChatSuggestionEntity(com.lingq.core.database.entity.ChatSuggestionEntity).\n Expected:\n", yq9Var8, "\n Found:\n", yq9VarM3392l8));
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("chatId", new vq9("chatId", "INTEGER", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i8 = e65.m10877i(linkedHashMap9, "lessonId", new vq9("lessonId", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new xq9("index_ChatLessonJoin_chatId", false, vz1.m23604J("chatId"), vz1.m23604J("ASC")));
        yq9 yq9Var9 = new yq9("ChatLessonJoin", linkedHashMap9, linkedHashSetM10877i8, linkedHashSet8);
        yq9 yq9VarM3392l9 = b6d.m3392l(bk8Var, "ChatLessonJoin");
        if (!yq9Var9.equals(yq9VarM3392l9)) {
            return new mc0(false, e65.m10873e("ChatLessonJoin(com.lingq.core.database.entity.ChatLessonJoin).\n Expected:\n", yq9Var9, "\n Found:\n", yq9VarM3392l9));
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("query", new vq9("query", "TEXT", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i9 = e65.m10877i(linkedHashMap10, "chatId", new vq9("chatId", "INTEGER", 2, true, 1, null));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new xq9("index_SearchChatHistoryJoin_query_chatId", false, vz1.m23605K("query", "chatId"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var10 = new yq9("SearchChatHistoryJoin", linkedHashMap10, linkedHashSetM10877i9, linkedHashSet9);
        yq9 yq9VarM3392l10 = b6d.m3392l(bk8Var, "SearchChatHistoryJoin");
        if (!yq9Var10.equals(yq9VarM3392l10)) {
            return new mc0(false, e65.m10873e("SearchChatHistoryJoin(com.lingq.core.database.entity.SearchChatHistoryJoin).\n Expected:\n", yq9Var10, "\n Found:\n", yq9VarM3392l10));
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("chatId", new vq9("chatId", "INTEGER", 1, true, 1, null));
        linkedHashMap11.put("messageIndex", new vq9("messageIndex", "INTEGER", 2, true, 1, null));
        linkedHashMap11.put("index", new vq9("index", "INTEGER", 3, true, 1, null));
        linkedHashMap11.put("tokens", new vq9("tokens", "TEXT", 0, true, 1, null));
        linkedHashMap11.put("text", new vq9("text", "TEXT", 0, false, 1, null));
        linkedHashMap11.put("normalizedText", new vq9("normalizedText", "TEXT", 0, false, 1, null));
        linkedHashMap11.put("timestamp", new vq9("timestamp", "TEXT", 0, false, 1, null));
        linkedHashMap11.put("startParagraph", new vq9("startParagraph", "INTEGER", 0, true, 1, null));
        linkedHashMap11.put("url", new vq9("url", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSetM10877i10 = e65.m10877i(linkedHashMap11, "opentag", new vq9("opentag", "TEXT", 0, false, 1, null));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new xq9("index_ChatSentenceEntity_chatId_messageIndex_index", false, vz1.m23605K("chatId", "messageIndex", "index"), vz1.m23605K("ASC", "ASC", "ASC")));
        yq9 yq9Var11 = new yq9("ChatSentenceEntity", linkedHashMap11, linkedHashSetM10877i10, linkedHashSet10);
        yq9 yq9VarM3392l11 = b6d.m3392l(bk8Var, "ChatSentenceEntity");
        if (!yq9Var11.equals(yq9VarM3392l11)) {
            return new mc0(false, e65.m10873e("ChatSentenceEntity(com.lingq.core.database.entity.ChatSentenceEntity).\n Expected:\n", yq9Var11, "\n Found:\n", yq9VarM3392l11));
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("chatId", new vq9("chatId", "INTEGER", 1, true, 1, null));
        linkedHashMap12.put("messageIndex", new vq9("messageIndex", "INTEGER", 2, true, 1, null));
        LinkedHashSet linkedHashSetM10877i11 = e65.m10877i(linkedHashMap12, "translation", new vq9("translation", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        linkedHashSet11.add(new xq9("index_ChatMessageTranslationEntity_chatId_messageIndex", false, vz1.m23605K("chatId", "messageIndex"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var12 = new yq9("ChatMessageTranslationEntity", linkedHashMap12, linkedHashSetM10877i11, linkedHashSet11);
        yq9 yq9VarM3392l12 = b6d.m3392l(bk8Var, "ChatMessageTranslationEntity");
        if (!yq9Var12.equals(yq9VarM3392l12)) {
            return new mc0(false, e65.m10873e("ChatMessageTranslationEntity(com.lingq.core.database.entity.ChatMessageTranslationEntity).\n Expected:\n", yq9Var12, "\n Found:\n", yq9VarM3392l12));
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        linkedHashMap13.put("chatId", new vq9("chatId", "INTEGER", 1, true, 1, null));
        linkedHashMap13.put("messageIndex", new vq9("messageIndex", "INTEGER", 2, true, 1, null));
        LinkedHashSet linkedHashSetM10877i12 = e65.m10877i(linkedHashMap13, "phrases", new vq9("phrases", "TEXT", 0, true, 1, null));
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        linkedHashSet12.add(new xq9("index_ChatMessagePhrasesEntity_chatId_messageIndex", false, vz1.m23605K("chatId", "messageIndex"), vz1.m23605K("ASC", "ASC")));
        yq9 yq9Var13 = new yq9("ChatMessagePhrasesEntity", linkedHashMap13, linkedHashSetM10877i12, linkedHashSet12);
        yq9 yq9VarM3392l13 = b6d.m3392l(bk8Var, "ChatMessagePhrasesEntity");
        if (!yq9Var13.equals(yq9VarM3392l13)) {
            return new mc0(false, e65.m10873e("ChatMessagePhrasesEntity(com.lingq.core.database.entity.ChatMessagePhrasesEntity).\n Expected:\n", yq9Var13, "\n Found:\n", yq9VarM3392l13));
        }
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        linkedHashMap14.put("lessonId", new vq9("lessonId", "INTEGER", 1, true, 1, null));
        yq9 yq9Var14 = new yq9("LessonPreviewEntity", linkedHashMap14, e65.m10877i(linkedHashMap14, "preview", new vq9("preview", "TEXT", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l14 = b6d.m3392l(bk8Var, "LessonPreviewEntity");
        if (!yq9Var14.equals(yq9VarM3392l14)) {
            return new mc0(false, e65.m10873e("LessonPreviewEntity(com.lingq.core.database.entity.LessonPreviewEntity).\n Expected:\n", yq9Var14, "\n Found:\n", yq9VarM3392l14));
        }
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        linkedHashMap15.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap15.put("title", new vq9("title", "TEXT", 0, true, 1, null));
        linkedHashMap15.put("code", new vq9("code", "TEXT", 0, true, 1, null));
        linkedHashMap15.put("type", new vq9("type", "TEXT", 0, true, 1, null));
        linkedHashMap15.put("visibility", new vq9("visibility", "TEXT", 0, true, 1, "'Public'"));
        linkedHashMap15.put("dateStart", new vq9("dateStart", "TEXT", 0, true, 1, null));
        linkedHashMap15.put("dateEnd", new vq9("dateEnd", "TEXT", 0, true, 1, null));
        linkedHashMap15.put("dateCountdown", new vq9("dateCountdown", "TEXT", 0, false, 1, null));
        linkedHashMap15.put("countdownEnabled", new vq9("countdownEnabled", "INTEGER", 0, true, 1, "1"));
        linkedHashMap15.put("countdownEnded", new vq9("countdownEnded", "INTEGER", 0, true, 1, "0"));
        linkedHashMap15.put("isActive", new vq9("isActive", "INTEGER", 0, true, 1, "1"));
        linkedHashMap15.put("tier", new vq9("tier", "INTEGER", 0, false, 1, null));
        linkedHashMap15.put("ctaText", new vq9("ctaText", "TEXT", 0, false, 1, null));
        linkedHashMap15.put("androidCoupon", new vq9("androidCoupon", "TEXT", 0, false, 1, null));
        linkedHashMap15.put("discount", new vq9("discount", "TEXT", 0, true, 1, null));
        linkedHashMap15.put("accentColorLight", new vq9("accentColorLight", "TEXT", 0, true, 1, null));
        linkedHashMap15.put("accentColorDark", new vq9("accentColorDark", "TEXT", 0, true, 1, null));
        linkedHashMap15.put("trialHeader", new vq9("trialHeader", "TEXT", 0, true, 1, "''"));
        yq9 yq9Var15 = new yq9("OfferEntity", linkedHashMap15, e65.m10877i(linkedHashMap15, "banners", new vq9("banners", "TEXT", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l15 = b6d.m3392l(bk8Var, "OfferEntity");
        if (!yq9Var15.equals(yq9VarM3392l15)) {
            return new mc0(false, e65.m10873e("OfferEntity(com.lingq.core.database.entity.OfferEntity).\n Expected:\n", yq9Var15, "\n Found:\n", yq9VarM3392l15));
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        linkedHashMap16.put("lessonId", new vq9("lessonId", "INTEGER", 1, true, 1, null));
        linkedHashMap16.put("language", new vq9("language", "TEXT", 2, true, 1, null));
        linkedHashMap16.put("type", new vq9("type", "TEXT", 3, true, 1, null));
        yq9 yq9Var16 = new yq9("LessonAchievementEntity", linkedHashMap16, e65.m10877i(linkedHashMap16, "dataJson", new vq9("dataJson", "TEXT", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l16 = b6d.m3392l(bk8Var, "LessonAchievementEntity");
        if (!yq9Var16.equals(yq9VarM3392l16)) {
            return new mc0(false, e65.m10873e("LessonAchievementEntity(com.lingq.core.database.entity.LessonAchievementEntity).\n Expected:\n", yq9Var16, "\n Found:\n", yq9VarM3392l16));
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        linkedHashMap17.put("lessonId", new vq9("lessonId", "INTEGER", 1, true, 1, null));
        linkedHashMap17.put("sentenceIndex", new vq9("sentenceIndex", "INTEGER", 2, true, 1, null));
        yq9 yq9Var17 = new yq9("LessonSentenceTranslationEntity", linkedHashMap17, e65.m10877i(linkedHashMap17, "text", new vq9("text", "TEXT", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l17 = b6d.m3392l(bk8Var, "LessonSentenceTranslationEntity");
        if (!yq9Var17.equals(yq9VarM3392l17)) {
            return new mc0(false, e65.m10873e("LessonSentenceTranslationEntity(com.lingq.core.database.entity.LessonSentenceTranslationEntity).\n Expected:\n", yq9Var17, "\n Found:\n", yq9VarM3392l17));
        }
        LinkedHashMap linkedHashMap18 = new LinkedHashMap();
        linkedHashMap18.put("termWithLanguage", new vq9("termWithLanguage", "TEXT", 1, true, 1, null));
        LinkedHashSet linkedHashSetM10877i13 = e65.m10877i(linkedHashMap18, "sortPosition", new vq9("sortPosition", "INTEGER", 0, true, 1, null));
        LinkedHashSet linkedHashSet13 = new LinkedHashSet();
        linkedHashSet13.add(new xq9("index_VocabularyOrderEntity_termWithLanguage", false, vz1.m23604J("termWithLanguage"), vz1.m23604J("ASC")));
        yq9 yq9Var18 = new yq9("VocabularyOrderEntity", linkedHashMap18, linkedHashSetM10877i13, linkedHashSet13);
        yq9 yq9VarM3392l18 = b6d.m3392l(bk8Var, "VocabularyOrderEntity");
        if (!yq9Var18.equals(yq9VarM3392l18)) {
            return new mc0(false, e65.m10873e("VocabularyOrderEntity(com.lingq.core.database.entity.VocabularyOrderEntity).\n Expected:\n", yq9Var18, "\n Found:\n", yq9VarM3392l18));
        }
        LinkedHashMap linkedHashMap19 = new LinkedHashMap();
        linkedHashMap19.put("lessonId", new vq9("lessonId", "INTEGER", 1, true, 1, null));
        linkedHashMap19.put("chatId", new vq9("chatId", "INTEGER", 0, true, 1, null));
        linkedHashMap19.put("messageIndex", new vq9("messageIndex", "INTEGER", 0, true, 1, null));
        yq9 yq9Var19 = new yq9("LessonCoachChatEntity", linkedHashMap19, e65.m10877i(linkedHashMap19, "message", new vq9("message", "TEXT", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l19 = b6d.m3392l(bk8Var, "LessonCoachChatEntity");
        if (!yq9Var19.equals(yq9VarM3392l19)) {
            return new mc0(false, e65.m10873e("LessonCoachChatEntity(com.lingq.core.database.entity.LessonCoachChatEntity).\n Expected:\n", yq9Var19, "\n Found:\n", yq9VarM3392l19));
        }
        LinkedHashMap linkedHashMap20 = new LinkedHashMap();
        linkedHashMap20.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        linkedHashMap20.put("active", new vq9("active", "INTEGER", 0, true, 1, null));
        linkedHashMap20.put("ended", new vq9("ended", "INTEGER", 0, true, 1, null));
        linkedHashMap20.put("startsAt", new vq9("startsAt", "TEXT", 0, false, 1, null));
        linkedHashMap20.put("endsAt", new vq9("endsAt", "TEXT", 0, false, 1, null));
        linkedHashMap20.put("joined", new vq9("joined", "INTEGER", 0, true, 1, null));
        linkedHashMap20.put("champion", new vq9("champion", "TEXT", 0, false, 1, null));
        linkedHashMap20.put("team", new vq9("team", "TEXT", 0, false, 1, null));
        linkedHashMap20.put("my", new vq9("my", "TEXT", 0, false, 1, null));
        linkedHashMap20.put("today", new vq9("today", "TEXT", 0, false, 1, null));
        yq9 yq9Var20 = new yq9("CupEntity", linkedHashMap20, e65.m10877i(linkedHashMap20, "teams", new vq9("teams", "TEXT", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l20 = b6d.m3392l(bk8Var, "CupEntity");
        if (!yq9Var20.equals(yq9VarM3392l20)) {
            return new mc0(false, e65.m10873e("CupEntity(com.lingq.core.database.entity.CupEntity).\n Expected:\n", yq9Var20, "\n Found:\n", yq9VarM3392l20));
        }
        LinkedHashMap linkedHashMap21 = new LinkedHashMap();
        linkedHashMap21.put("date", new vq9("date", "TEXT", 1, true, 1, null));
        linkedHashMap21.put("kind", new vq9("kind", "TEXT", 0, true, 1, null));
        linkedHashMap21.put("source", new vq9("source", "TEXT", 0, true, 1, null));
        linkedHashMap21.put("value", new vq9("value", "INTEGER", 0, true, 1, null));
        linkedHashMap21.put("label", new vq9("label", "TEXT", 0, true, 1, null));
        yq9 yq9Var21 = new yq9("CupPrizeEntity", linkedHashMap21, e65.m10877i(linkedHashMap21, "claim", new vq9("claim", "TEXT", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l21 = b6d.m3392l(bk8Var, "CupPrizeEntity");
        if (!yq9Var21.equals(yq9VarM3392l21)) {
            return new mc0(false, e65.m10873e("CupPrizeEntity(com.lingq.core.database.entity.CupPrizeEntity).\n Expected:\n", yq9Var21, "\n Found:\n", yq9VarM3392l21));
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        linkedHashMap22.put("teamCode", new vq9("teamCode", "TEXT", 1, true, 1, null));
        linkedHashMap22.put("name", new vq9("name", "TEXT", 0, true, 1, null));
        linkedHashMap22.put("totalCoins", new vq9("totalCoins", "INTEGER", 0, true, 1, null));
        linkedHashMap22.put("coinsPerUser", new vq9("coinsPerUser", "REAL", 0, true, 1, null));
        linkedHashMap22.put("participantCount", new vq9("participantCount", "INTEGER", 0, true, 1, null));
        linkedHashMap22.put("rank", new vq9("rank", "INTEGER", 0, true, 1, null));
        linkedHashMap22.put("prevRank", new vq9("prevRank", "INTEGER", 0, false, 1, null));
        yq9 yq9Var22 = new yq9("CupTeamEntity", linkedHashMap22, e65.m10877i(linkedHashMap22, "delta", new vq9("delta", "INTEGER", 0, false, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l22 = b6d.m3392l(bk8Var, "CupTeamEntity");
        if (!yq9Var22.equals(yq9VarM3392l22)) {
            return new mc0(false, e65.m10873e("CupTeamEntity(com.lingq.core.database.entity.CupTeamEntity).\n Expected:\n", yq9Var22, "\n Found:\n", yq9VarM3392l22));
        }
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        linkedHashMap23.put("scope", new vq9("scope", "TEXT", 1, true, 1, null));
        linkedHashMap23.put("profileId", new vq9("profileId", "INTEGER", 2, true, 1, null));
        linkedHashMap23.put("rank", new vq9("rank", "INTEGER", 0, true, 1, null));
        linkedHashMap23.put("prevRank", new vq9("prevRank", "INTEGER", 0, false, 1, null));
        linkedHashMap23.put("delta", new vq9("delta", "INTEGER", 0, false, 1, null));
        linkedHashMap23.put("username", new vq9("username", "TEXT", 0, true, 1, null));
        linkedHashMap23.put("photoUrl", new vq9("photoUrl", "TEXT", 0, false, 1, null));
        linkedHashMap23.put("teamCode", new vq9("teamCode", "TEXT", 0, true, 1, null));
        yq9 yq9Var23 = new yq9("CupContributorEntity", linkedHashMap23, e65.m10877i(linkedHashMap23, "score", new vq9("score", "INTEGER", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l23 = b6d.m3392l(bk8Var, "CupContributorEntity");
        if (!yq9Var23.equals(yq9VarM3392l23)) {
            return new mc0(false, e65.m10873e("CupContributorEntity(com.lingq.core.database.entity.CupContributorEntity).\n Expected:\n", yq9Var23, "\n Found:\n", yq9VarM3392l23));
        }
        LinkedHashMap linkedHashMap24 = new LinkedHashMap();
        linkedHashMap24.put("scope", new vq9("scope", "TEXT", 1, true, 1, null));
        linkedHashMap24.put("rank", new vq9("rank", "INTEGER", 0, false, 1, null));
        yq9 yq9Var24 = new yq9("CupContributorMeEntity", linkedHashMap24, e65.m10877i(linkedHashMap24, "score", new vq9("score", "INTEGER", 0, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l24 = b6d.m3392l(bk8Var, "CupContributorMeEntity");
        if (!yq9Var24.equals(yq9VarM3392l24)) {
            return new mc0(false, e65.m10873e("CupContributorMeEntity(com.lingq.core.database.entity.CupContributorMeEntity).\n Expected:\n", yq9Var24, "\n Found:\n", yq9VarM3392l24));
        }
        LinkedHashMap linkedHashMap25 = new LinkedHashMap();
        linkedHashMap25.put("id", new vq9("id", "INTEGER", 1, true, 1, null));
        yq9 yq9Var25 = new yq9("CollectionSubscriptionEntity", linkedHashMap25, e65.m10877i(linkedHashMap25, "language", new vq9("language", "TEXT", 2, true, 1, null)), new LinkedHashSet());
        yq9 yq9VarM3392l25 = b6d.m3392l(bk8Var, "CollectionSubscriptionEntity");
        return !yq9Var25.equals(yq9VarM3392l25) ? new mc0(false, e65.m10873e("CollectionSubscriptionEntity(com.lingq.core.database.entity.CollectionSubscriptionEntity).\n Expected:\n", yq9Var25, "\n Found:\n", yq9VarM3392l25)) : new mc0(true, null);
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: a */
    public final void mo16444a(bk8 bk8Var) {
        switch (this.f59112d) {
            case 0:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `LessonEntity` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL DEFAULT 'content', `url` TEXT, `pos` INTEGER NOT NULL, `title` TEXT, `description` TEXT, `pubDate` TEXT, `imageUrl` TEXT, `audioUrl` TEXT, `duration` INTEGER NOT NULL, `status` TEXT, `sharedDate` TEXT, `originalUrl` TEXT, `wordCount` INTEGER NOT NULL, `uniqueWordCount` INTEGER NOT NULL, `rosesCount` INTEGER NOT NULL, `lessonRating` REAL NOT NULL, `audioRating` REAL NOT NULL, `collectionId` INTEGER NOT NULL, `collectionTitle` TEXT, `transliteration` TEXT NOT NULL, `altScript` TEXT NOT NULL, `classicUrl` TEXT, `sourceType` TEXT, `sourceName` TEXT, `sourceUrl` TEXT, `previousLessonId` INTEGER, `nextLessonId` INTEGER, `readTimes` REAL NOT NULL, `listenTimes` REAL NOT NULL, `isCompleted` INTEGER NOT NULL, `newWordsCount` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `isRoseGiven` INTEGER NOT NULL, `giveRoseUrl` TEXT, `price` INTEGER NOT NULL, `opened` INTEGER NOT NULL, `percentCompleted` REAL NOT NULL, `lastRoseReceived` TEXT, `isFavorite` INTEGER NOT NULL, `printUrl` TEXT, `videoUrl` TEXT, `exercises` TEXT, `notes` TEXT, `viewsCount` INTEGER NOT NULL, `providerId` INTEGER, `providerName` TEXT, `providerDescription` TEXT, `originalImageUrl` TEXT, `providerImageUrl` TEXT, `sharedById` TEXT, `sharedByName` TEXT, `sharedByImageUrl` TEXT, `sharedByRole` TEXT, `isSharedByIsFriend` INTEGER NOT NULL, `isCanEdit` INTEGER NOT NULL, `canEditSentence` INTEGER NOT NULL DEFAULT 0, `isProtected` INTEGER NOT NULL DEFAULT 1, `lessonVotes` INTEGER NOT NULL, `audioVotes` INTEGER NOT NULL, `level` TEXT, `tags` TEXT, `progressDownloaded` INTEGER NOT NULL, `progress` REAL, `translationSentence` TEXT NOT NULL, `mediaImageUrl` TEXT, `mediaTitle` TEXT, `ptime` TEXT, `isPinned` INTEGER, `difficulty` REAL NOT NULL, `newWords` INTEGER NOT NULL, `lessonPreview` TEXT NOT NULL, `isTaken` INTEGER, `folders` TEXT, `audioPending` INTEGER, `isLocked` TEXT, `lastOpenTime` TEXT, `userLiked_username` TEXT, `userLiked_liked` INTEGER, `userCompleted_username` TEXT, `userCompleted_completed` INTEGER, `translation_language` TEXT, `translation_sentences` TEXT, `nextLesson_id` INTEGER, `nextLesson_price` INTEGER, `nextLesson_collectionTitle` TEXT, `nextLesson_isTaken` INTEGER, `nextLesson_sharedById` INTEGER, `nextLesson_status` TEXT, `nextLesson_title` TEXT, `nextLesson_image` TEXT, `nextLesson_duration` INTEGER, `nextLesson_source` TEXT, `nextLesson_url` TEXT, `previousLesson_id` INTEGER, `previousLesson_price` INTEGER, `previousLesson_collectionTitle` TEXT, `previousLesson_isTaken` INTEGER, `previousLesson_sharedById` INTEGER, `previousLesson_status` TEXT, `previousLesson_title` TEXT, `previousLesson_image` TEXT, `previousLesson_duration` INTEGER, `previousLesson_source` TEXT, `previousLesson_url` TEXT, `promoted_course_ctaText` TEXT, `promoted_course_description` TEXT, `promoted_course_ctaUrl` TEXT, `simplified_to_status` TEXT, `simplified_to_isLocked` TEXT, `simplified_to_id` INTEGER, `simplified_by_status` TEXT, `simplified_by_isLocked` TEXT, `simplified_by_id` INTEGER, `metadata_importLesson` TEXT, `metadata_importMethod` TEXT, `metadata_splittingMethod` TEXT, PRIMARY KEY(`id`))", bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonEntity_id` ON `LessonEntity` (`id`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonEntity_id_title_collectionTitle_imageUrl_cardsCount_uniqueWordCount_newWords_duration_isCompleted_percentCompleted` ON `LessonEntity` (`id`, `title`, `collectionTitle`, `imageUrl`, `cardsCount`, `uniqueWordCount`, `newWords`, `duration`, `isCompleted`, `percentCompleted`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonSentenceEntity` (`lessonId` INTEGER NOT NULL, `tokens` TEXT NOT NULL, `text` TEXT, `normalizedText` TEXT, `index` INTEGER NOT NULL, `timestamp` TEXT, `startParagraph` INTEGER NOT NULL, `url` TEXT, `opentag` TEXT, PRIMARY KEY(`lessonId`, `index`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonSentenceEntity_lessonId_index` ON `LessonSentenceEntity` (`lessonId`, `index`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CardEntity` (`term` TEXT NOT NULL COLLATE LOCALIZED, `termWithLanguage` TEXT NOT NULL, `id` INTEGER NOT NULL, `url` TEXT, `fragment` TEXT, `status` INTEGER NOT NULL, `extendedStatus` INTEGER, `lastReviewedCorrect` TEXT, `srsDueDate` TEXT, `notes` TEXT, `audio` TEXT, `importance` INTEGER NOT NULL, `meanings` TEXT NOT NULL, `meaningTerms` TEXT NOT NULL, `tags` TEXT NOT NULL, `gTags` TEXT NOT NULL, `words` TEXT NOT NULL, `hiragana` TEXT, `romaji` TEXT, `pinyin` TEXT, `hant` TEXT, `hans` TEXT, `jyutping` TEXT, `chunk` TEXT, `furigana` TEXT, `latin` TEXT, `isPhrase` INTEGER NOT NULL, `creationDate` TEXT, PRIMARY KEY(`termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_CardEntity_termWithLanguage` ON `CardEntity` (`termWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `WordEntity` (`termWithLanguage` TEXT NOT NULL, `term` TEXT NOT NULL, `id` INTEGER NOT NULL, `status` TEXT, `importance` INTEGER NOT NULL, `isPhrase` INTEGER NOT NULL, `meanings` TEXT NOT NULL, `tags` TEXT NOT NULL, `gTags` TEXT NOT NULL, `romaji` TEXT, `hiragana` TEXT, `pinyin` TEXT, `hant` TEXT, `hans` TEXT, `jyutping` TEXT, `cardId` INTEGER NOT NULL, PRIMARY KEY(`termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonsAndCardsJoin` (`contentId` INTEGER NOT NULL, `termWithLanguage` TEXT NOT NULL, PRIMARY KEY(`contentId`, `termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonsAndCardsJoin_contentId_termWithLanguage` ON `LessonsAndCardsJoin` (`contentId`, `termWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonsAndWordsJoin` (`contentId` INTEGER NOT NULL, `termWithLanguage` TEXT NOT NULL, PRIMARY KEY(`contentId`, `termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonsAndWordsJoin_contentId_termWithLanguage` ON `LessonsAndWordsJoin` (`contentId`, `termWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `DictionaryDataEntity` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `order` INTEGER NOT NULL, `urlToTransform` TEXT NOT NULL, `urlDefinition` TEXT NOT NULL, `isPopUpWindow` INTEGER NOT NULL, `languageTo` TEXT NOT NULL, `urlVar1` TEXT NOT NULL, `urlVar2` TEXT NOT NULL, `urlVar3` TEXT NOT NULL, `urlVar4` TEXT NOT NULL, `urlVar5` TEXT NOT NULL, `overrideUrl` TEXT NOT NULL, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `DictionaryLocaleEntity` (`code` TEXT NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`code`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_DictionaryLocaleEntity_code` ON `DictionaryLocaleEntity` (`code`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChallengeEntity` (`pk` INTEGER NOT NULL, `code` TEXT, `title` TEXT, `challengeType` TEXT, `description` TEXT, `startDate` TEXT, `endDate` TEXT, `language` TEXT, `participantsCount` INTEGER NOT NULL, `isDisabled` INTEGER NOT NULL, `badgeUrl` TEXT, `isCompleted` INTEGER NOT NULL, `isJoined` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `order` INTEGER NOT NULL, `knownWords` INTEGER NOT NULL DEFAULT 0, `challengeLanguage` TEXT DEFAULT '', `status` TEXT DEFAULT '', `signupDeadline` TEXT DEFAULT '', PRIMARY KEY(`pk`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChallengeEntity_pk` ON `ChallengeEntity` (`pk`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `BadgeEntity` (`languageAndSlug` TEXT NOT NULL, `language` TEXT, `slug` TEXT, `name` TEXT, `goal` INTEGER NOT NULL, `stat` TEXT, `metAt` TEXT, `gainedAt` TEXT, `imageUrl` TEXT, PRIMARY KEY(`languageAndSlug`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `MilestoneEntity` (`languageAndSlug` TEXT NOT NULL, `language` TEXT, `slug` TEXT, `name` TEXT, `goal` INTEGER NOT NULL, `stat` TEXT, `date` TEXT, PRIMARY KEY(`languageAndSlug`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LibraryDataEntity` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT, `description` TEXT, `pos` INTEGER NOT NULL, `url` TEXT, `sourceType` TEXT, `sourceName` TEXT, `sourceUrl` TEXT, `imageUrl` TEXT, `providerId` INTEGER, `providerName` TEXT, `providerDescription` TEXT, `originalImageUrl` TEXT, `providerImageUrl` TEXT, `sharedById` TEXT, `sharedByName` TEXT, `sharedByImageUrl` TEXT, `sharedByRole` TEXT, `level` TEXT, `newWordsCount` INTEGER NOT NULL, `lessonsCount` INTEGER NOT NULL, `owner` TEXT, `price` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `rosesCount` INTEGER NOT NULL, `duration` INTEGER, `collectionId` INTEGER, `collectionTitle` TEXT, `difficulty` REAL NOT NULL, `isAvailable` INTEGER NOT NULL, `tags` TEXT, `status` TEXT, `folders` TEXT, `progress` REAL, `isTaken` INTEGER, `lessonPreview` TEXT NOT NULL, `accent` TEXT, `audioUrl` TEXT DEFAULT '', `listenTimes` REAL NOT NULL DEFAULT 0.0, `readTimes` REAL NOT NULL DEFAULT 0.0, `isCompleted` INTEGER NOT NULL DEFAULT 0, `isFavorite` INTEGER NOT NULL DEFAULT 0, `videoUrl` TEXT DEFAULT '', `isLocked` TEXT, `lessonsSortBy` TEXT DEFAULT '', `isSubscribed` INTEGER DEFAULT NULL, `originalUrl` TEXT DEFAULT '', `isArchived` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`, `type`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LibraryDataEntity_id_type` ON `LibraryDataEntity` (`id`, `type`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageContextEntity` (`code` TEXT NOT NULL, `pk` INTEGER NOT NULL, `url` TEXT, `repetitionLingQs` INTEGER NOT NULL, `lotdDates` TEXT NOT NULL, `isUseFeed` INTEGER, `intense` TEXT, `streakGoal` INTEGER, `streakDays` INTEGER NOT NULL, `tags` TEXT NOT NULL, `supported` INTEGER, `title` TEXT, `lastUsed` TEXT, `knownWords` INTEGER, `grammarResourceSlug` TEXT, `feedLevels` TEXT, `scheduledForDeletion` INTEGER DEFAULT 0, `email_lotd` TEXT, `email_weekly` TEXT, `site_lotd` TEXT, `site_weekly` TEXT, PRIMARY KEY(`code`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LanguageContextEntity_code` ON `LanguageContextEntity` (`code`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageEntity` (`code` TEXT NOT NULL, `id` INTEGER, `supported` INTEGER, `title` TEXT, `lastUsed` TEXT, `knownWords` INTEGER, `dictionaryLocaleActive` TEXT, `grammarResourceSlug` TEXT, `scheduledForDeletion` INTEGER DEFAULT 0, PRIMARY KEY(`code`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageActiveDictionaryJoin` (`code` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`code`, `id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageAvailableDictionaryJoin` (`code` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`code`, `id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageDictionaryLocaleJoin` (`language` TEXT NOT NULL, `code` TEXT NOT NULL, PRIMARY KEY(`language`, `code`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LanguageDictionaryLocaleJoin_language_code` ON `LanguageDictionaryLocaleJoin` (`language`, `code`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LibraryShelfAndContentJoin` (`codeWithLanguage` TEXT NOT NULL, `id` INTEGER NOT NULL, `type` TEXT NOT NULL, `order` INTEGER NOT NULL, `ofQuery` TEXT NOT NULL, PRIMARY KEY(`codeWithLanguage`, `id`, `type`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LibraryShelfAndContentJoin_codeWithLanguage_id_type` ON `LibraryShelfAndContentJoin` (`codeWithLanguage`, `id`, `type`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LibraryShelfEntity` (`codeWithLanguage` TEXT NOT NULL, `language` TEXT NOT NULL, `pinned` INTEGER, `pinnedHard` INTEGER, `tabs` TEXT NOT NULL, `code` TEXT NOT NULL, `id` INTEGER NOT NULL, `title` TEXT NOT NULL, `order` INTEGER NOT NULL, `levels` TEXT NOT NULL DEFAULT '', `originalTitle` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`codeWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LibraryShelfEntity_codeWithLanguage_title` ON `LibraryShelfEntity` (`codeWithLanguage`, `title`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `PlaylistEntity` (`nameWithLanguage` TEXT NOT NULL, `language` TEXT NOT NULL, `name` TEXT NOT NULL, `pk` INTEGER NOT NULL, `isDefault` INTEGER NOT NULL, `isFeatured` INTEGER NOT NULL, `order` INTEGER NOT NULL, PRIMARY KEY(`nameWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_PlaylistEntity_nameWithLanguage` ON `PlaylistEntity` (`nameWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_PlaylistEntity_name_language` ON `PlaylistEntity` (`name`, `language`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `PlaylistAndLessonsJoin` (`nameWithLanguage` TEXT NOT NULL, `language` TEXT NOT NULL, `contentId` INTEGER NOT NULL, `order` INTEGER, `isCourse` INTEGER NOT NULL, PRIMARY KEY(`nameWithLanguage`, `contentId`, `isCourse`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_PlaylistAndLessonsJoin_nameWithLanguage_contentId_isCourse` ON `PlaylistAndLessonsJoin` (`nameWithLanguage`, `contentId`, `isCourse`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `TranslationsEntity` (`termWithLanguageAndTarget` TEXT NOT NULL, `translations` TEXT NOT NULL, PRIMARY KEY(`termWithLanguageAndTarget`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_TranslationsEntity_termWithLanguageAndTarget` ON `TranslationsEntity` (`termWithLanguageAndTarget`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `TtsVoiceEntity` (`name` TEXT NOT NULL, `title` TEXT NOT NULL, `voicesByApp` TEXT NOT NULL, `alternative` INTEGER, `isPremium` INTEGER NOT NULL DEFAULT 0, `freeTrial` INTEGER NOT NULL DEFAULT 0, `priority` TEXT NOT NULL, `accentCode` TEXT, `isSelectable` INTEGER NOT NULL DEFAULT 0, `tags` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`name`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_TtsVoiceEntity_name` ON `TtsVoiceEntity` (`name`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageAndTtsVoicesJoin` (`code` TEXT NOT NULL, `name` TEXT NOT NULL, `voiceOrder` INTEGER NOT NULL, PRIMARY KEY(`code`, `name`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LanguageAndTtsVoicesJoin_code_name` ON `LanguageAndTtsVoicesJoin` (`code`, `name`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `TtsUtteranceEntity` (`idWithLanguageAndData` TEXT NOT NULL, `utteranceId` INTEGER NOT NULL, `audio` TEXT NOT NULL, `text` TEXT NOT NULL, PRIMARY KEY(`idWithLanguageAndData`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_TtsUtteranceEntity_idWithLanguageAndData` ON `TtsUtteranceEntity` (`idWithLanguageAndData`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `TranslationSentenceEntity` (`index` INTEGER NOT NULL, `lessonId` INTEGER NOT NULL, `audio` REAL, `audioEnd` REAL, `text` TEXT NOT NULL, `translations` TEXT NOT NULL, `notes` TEXT NOT NULL DEFAULT '[]', PRIMARY KEY(`index`, `lessonId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_TranslationSentenceEntity_index_lessonId` ON `TranslationSentenceEntity` (`index`, `lessonId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageProgressEntity` (`interval` TEXT NOT NULL, `languageCode` TEXT NOT NULL, `writtenWordsGoal` INTEGER NOT NULL, `speakingTimeGoal` REAL NOT NULL, `totalWordsKnown` INTEGER NOT NULL, `readWords` REAL NOT NULL, `totalCards` INTEGER NOT NULL, `activityIndex` INTEGER NOT NULL, `knownWordsGoal` INTEGER NOT NULL, `listeningTimeGoal` REAL NOT NULL, `speakingTime` REAL NOT NULL, `cardsCreatedGoal` INTEGER NOT NULL, `knownWords` INTEGER NOT NULL, `intervals` TEXT, `cardsCreated` INTEGER NOT NULL, `readWordsGoal` INTEGER NOT NULL, `listeningTime` REAL NOT NULL, `cardsLearned` INTEGER NOT NULL, `writtenWords` INTEGER NOT NULL, `cardsLearnedGoal` INTEGER NOT NULL, `earnedCoins` INTEGER NOT NULL DEFAULT 0, `earnedCoinsGoal` INTEGER NOT NULL DEFAULT 0, `wpm` INTEGER NOT NULL DEFAULT 0, `studyTime` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`languageCode`, `interval`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `PagingKeysEntity` (`pagingKey` TEXT NOT NULL, `prevKey` INTEGER, `nextKey` INTEGER, PRIMARY KEY(`pagingKey`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageProgressChartEntryEntity` (`metric` TEXT NOT NULL, `languageCode` TEXT NOT NULL, `period` TEXT NOT NULL DEFAULT 'last_7d', `name` TEXT NOT NULL, `daily` REAL NOT NULL, `cumulative` REAL NOT NULL, `position` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`languageCode`, `metric`, `name`, `period`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `StudyStatsEntity` (`code` TEXT NOT NULL, `language` TEXT, `activityApple` TEXT, `notificationsCount` INTEGER NOT NULL, `dailyGoal` INTEGER NOT NULL, `streakDays` INTEGER NOT NULL, `coins` INTEGER NOT NULL, `knownWords` INTEGER NOT NULL, `isAvatarUpgraded` INTEGER NOT NULL, `dailyScores` TEXT, `activityLevel` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`code`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonBookmarkEntity` (`contentId` INTEGER NOT NULL, `wordIndex` INTEGER, `completedWordIndex` INTEGER, `audioPosition` REAL, `client` TEXT, `timestamp` TEXT, `languageTimestamp` TEXT, PRIMARY KEY(`contentId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonBookmarkEntity_contentId` ON `LessonBookmarkEntity` (`contentId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LibraryCounterEntity` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `roseGiven` INTEGER NOT NULL, `progress` REAL, `listenTimes` REAL, `readTimes` REAL, `isTaken` INTEGER NOT NULL, `difficulty` REAL NOT NULL, `rosesCount` INTEGER NOT NULL, `newWordsCount` INTEGER NOT NULL, `knownWordsCount` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `lessonsCount` INTEGER NOT NULL, `isCompletelyTaken` INTEGER NOT NULL, `totalWordsCount` INTEGER NOT NULL DEFAULT 0, `uniqueWordsCount` INTEGER NOT NULL DEFAULT 0, `audioStart` REAL DEFAULT NULL, `audioEnd` REAL DEFAULT NULL, PRIMARY KEY(`id`, `type`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LibraryCounterEntity_id_type` ON `LibraryCounterEntity` (`id`, `type`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `TokenPopularMeaningsEntity` (`termWithLanguage` TEXT NOT NULL, `locale` TEXT NOT NULL, `popularMeanings` TEXT NOT NULL, PRIMARY KEY(`termWithLanguage`, `locale`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_TokenPopularMeaningsEntity_termWithLanguage_locale` ON `TokenPopularMeaningsEntity` (`termWithLanguage`, `locale`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `TokenRelatedPhrasesEntity` (`termWithLanguage` TEXT NOT NULL, `relatedPhrases` TEXT NOT NULL, PRIMARY KEY(`termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_TokenRelatedPhrasesEntity_termWithLanguage` ON `TokenRelatedPhrasesEntity` (`termWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LibraryDownloadEntity` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `type` TEXT NOT NULL DEFAULT 'content', `isDownloaded` INTEGER NOT NULL, `downloadProgress` INTEGER, PRIMARY KEY(`id`, `language`, `type`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LibraryDownloadEntity_id_language_type` ON `LibraryDownloadEntity` (`id`, `language`, `type`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonAudioDownloadEntity` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `isDownloaded` INTEGER NOT NULL, `downloadProgress` INTEGER NOT NULL, `status` TEXT NOT NULL DEFAULT 'idle', `errorType` TEXT DEFAULT NULL, `lastUpdated` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`, `language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonAudioDownloadEntity_id_language` ON `LessonAudioDownloadEntity` (`id`, `language`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageCardsTagsEntity` (`code` TEXT NOT NULL, `tags` TEXT NOT NULL, PRIMARY KEY(`code`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LanguageCardsTagsEntity_code` ON `LanguageCardsTagsEntity` (`code`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CourseForImportEntity` (`language` TEXT NOT NULL, `pk` INTEGER NOT NULL, `title` TEXT NOT NULL, `order` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`language`, `pk`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_CourseForImportEntity_language_pk` ON `CourseForImportEntity` (`language`, `pk`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonsWithPlaylistJoin` (`playlistId` INTEGER NOT NULL, `contentId` INTEGER NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`playlistId`, `contentId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonsWithPlaylistJoin_playlistId_contentId` ON `LessonsWithPlaylistJoin` (`playlistId`, `contentId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CoursesAndLessonsJoin` (`pk` INTEGER NOT NULL, `contentId` INTEGER NOT NULL, `courseOrder` INTEGER NOT NULL, PRIMARY KEY(`pk`, `contentId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_CoursesAndLessonsJoin_pk_contentId` ON `CoursesAndLessonsJoin` (`pk`, `contentId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CoursesAndLanguageJoin` (`pk` INTEGER NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`pk`, `language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_CoursesAndLanguageJoin_pk_language` ON `CoursesAndLanguageJoin` (`pk`, `language`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CourseAndCardsJoin` (`pk` INTEGER NOT NULL, `termWithLanguage` TEXT NOT NULL, PRIMARY KEY(`pk`, `termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_CourseAndCardsJoin_pk_termWithLanguage` ON `CourseAndCardsJoin` (`pk`, `termWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChallengeRankingEntity` (`challengeCode` TEXT NOT NULL, `metric` TEXT NOT NULL, `rank` INTEGER NOT NULL, `language` TEXT NOT NULL, `profile` TEXT, `score` INTEGER NOT NULL, `scoreBehindLeader` INTEGER NOT NULL, `isCompleted` INTEGER NOT NULL, `bookTitle` TEXT NOT NULL DEFAULT '', `bookLanguage` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`challengeCode`, `metric`, `rank`, `language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChallengeRankingEntity_challengeCode_metric_rank_language` ON `ChallengeRankingEntity` (`challengeCode`, `metric`, `rank`, `language`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChallengeDetailStatsEntity` (`language` TEXT NOT NULL, `challengeCode` TEXT NOT NULL, `code` TEXT NOT NULL, `value` INTEGER NOT NULL, `title` TEXT, PRIMARY KEY(`challengeCode`, `code`, `language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChallengeDetailStatsEntity_challengeCode_code_language` ON `ChallengeDetailStatsEntity` (`challengeCode`, `code`, `language`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChallengeStatsEntity` (`language` TEXT NOT NULL, `challengeCode` TEXT NOT NULL, `code` TEXT NOT NULL, `title` TEXT NOT NULL, `progress` REAL NOT NULL, `actual` REAL NOT NULL, `target` REAL NOT NULL, `bookId` INTEGER NOT NULL DEFAULT 0, `bookImage` TEXT NOT NULL DEFAULT '', `bookLanguage` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`challengeCode`, `code`, `language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChallengeStatsEntity_challengeCode_code_language` ON `ChallengeStatsEntity` (`challengeCode`, `code`, `language`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ProviderEntity` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `description` TEXT, `image` TEXT, `title` TEXT, `url` TEXT, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ProviderEntity_id` ON `ProviderEntity` (`id`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonTagEntity` (`title` TEXT NOT NULL COLLATE NOCASE, PRIMARY KEY(`title`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonTagEntity_title` ON `LessonTagEntity` (`title`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `NotificationEntity` (`pk` INTEGER NOT NULL, `url` TEXT, `language` TEXT, `notificationLanguage` TEXT, `type` TEXT, `title` TEXT, `message` TEXT, `image` TEXT, `isNew` INTEGER, `timestamp` TEXT, PRIMARY KEY(`pk`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `StreakEntity` (`language` TEXT NOT NULL, `streakDays` INTEGER, `coins` REAL, `latestStreakDays` INTEGER, `isStreakBroken` INTEGER, `brokenStreakDate` TEXT, PRIMARY KEY(`language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `MilestoneMetEntity` (`languageAndSlug` TEXT NOT NULL, `metAt` TEXT NOT NULL, PRIMARY KEY(`languageAndSlug`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `MilestoneStatsEntity` (`language` TEXT NOT NULL, `knownWords` INTEGER NOT NULL, `lingqs` INTEGER NOT NULL, `dailyScore` INTEGER NOT NULL, PRIMARY KEY(`language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LibraryFastSearchEntity` (`id` TEXT NOT NULL, `language` TEXT NOT NULL, `query` TEXT NOT NULL, `type` TEXT NOT NULL, `title` TEXT, PRIMARY KEY(`id`, `type`, `language`, `query`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LibraryFastSearchEntity_id_type_language_query` ON `LibraryFastSearchEntity` (`id`, `type`, `language`, `query`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `SharedByUserEntity` (`id` INTEGER NOT NULL, `language` TEXT, `firstName` TEXT, `lastName` TEXT, `photo` TEXT, `username` TEXT, `role` TEXT, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `SharedByUserAndQueryJoin` (`language` TEXT NOT NULL, `query` TEXT NOT NULL, `userId` INTEGER NOT NULL, PRIMARY KEY(`language`, `query`, `userId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_SharedByUserAndQueryJoin_language_query_userId` ON `SharedByUserAndQueryJoin` (`language`, `query`, `userId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `NoticeEntity` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `title` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT NOT NULL, `noticeType` TEXT NOT NULL, `isShown` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ReferralEntity` (`pk` INTEGER NOT NULL, `username` TEXT, `photo` TEXT, `dateJoined` TEXT, PRIMARY KEY(`pk`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonStatsEntity` (`contentId` INTEGER NOT NULL, `readWords` REAL NOT NULL, `lingqsCreated` REAL NOT NULL, `knownWords` REAL NOT NULL, `listeningTime` REAL NOT NULL, `coinsNew` REAL NOT NULL, `earnedCoins` REAL NOT NULL, `studyTime` REAL NOT NULL DEFAULT 0.0, `wpm` REAL NOT NULL DEFAULT 0.0, PRIMARY KEY(`contentId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonStatsEntity_contentId` ON `LessonStatsEntity` (`contentId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CardsAndLOTDJoin` (`termWithLanguage` TEXT NOT NULL, `lotd` TEXT NOT NULL, PRIMARY KEY(`termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_CardsAndLOTDJoin_termWithLanguage` ON `CardsAndLOTDJoin` (`termWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonAndCardsFromJoin` (`contentId` INTEGER NOT NULL, `termWithLanguage` TEXT NOT NULL, PRIMARY KEY(`contentId`, `termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonAndCardsFromJoin_contentId_termWithLanguage` ON `LessonAndCardsFromJoin` (`contentId`, `termWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonAndWordsFromJoin` (`contentId` INTEGER NOT NULL, `termWithLanguage` TEXT NOT NULL, PRIMARY KEY(`contentId`, `termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonAndWordsFromJoin_contentId_termWithLanguage` ON `LessonAndWordsFromJoin` (`contentId`, `termWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonsSimplifiedJoin` (`fromId` INTEGER NOT NULL, `toId` INTEGER, `isLocked` INTEGER NOT NULL, PRIMARY KEY(`fromId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonsSimplifiedJoin_fromId` ON `LessonsSimplifiedJoin` (`fromId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CoursesAndLessonsSortJoin` (`pk` INTEGER NOT NULL, `contentId` INTEGER NOT NULL, `courseOrder` INTEGER NOT NULL, `sort` TEXT NOT NULL, PRIMARY KEY(`pk`, `contentId`, `sort`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_CoursesAndLessonsSortJoin_pk_contentId_sort` ON `CoursesAndLessonsSortJoin` (`pk`, `contentId`, `sort`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonNextSuggestionEntity` (`id` INTEGER NOT NULL, `lessonId` INTEGER NOT NULL, `title` TEXT NOT NULL, `image` TEXT, `sourceType` TEXT, `sourceName` TEXT, `sourceUrl` TEXT, `status` TEXT, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `SourceBlacklistEntity` (`name` TEXT NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`name`, `language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_SourceBlacklistEntity_name_language` ON `SourceBlacklistEntity` (`name`, `language`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CourseBlacklistEntity` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`id`, `language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_CourseBlacklistEntity_id_language` ON `CourseBlacklistEntity` (`id`, `language`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `TokenCwtEntity` (`id` TEXT NOT NULL, `lessonId` INTEGER NOT NULL, `word` TEXT NOT NULL, `sentence` TEXT NOT NULL, `languageSrc` TEXT NOT NULL, `languageDst` TEXT NOT NULL, `translation` TEXT NOT NULL, `sentenceIndex` INTEGER NOT NULL, `sentenceTokenIndex` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_TokenCwtEntity_id` ON `TokenCwtEntity` (`id`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageStatsEntity` (`languageAndPeriod` TEXT NOT NULL, `language` TEXT NOT NULL, `period` TEXT NOT NULL, `lessonCompleted_overall` REAL NOT NULL, `lessonCompleted_change` REAL NOT NULL, `speakingUsage_overall` REAL NOT NULL, `speakingUsage_change` REAL NOT NULL, `coinWords_overall` REAL NOT NULL, `coinWords_change` REAL NOT NULL, `lessonShared_overall` REAL NOT NULL, `lessonShared_change` REAL NOT NULL, `translationsShared_overall` REAL NOT NULL, `translationsShared_change` REAL NOT NULL, `lessonPublished_overall` REAL NOT NULL, `lessonPublished_change` REAL NOT NULL, `studyTime_overall` REAL NOT NULL, `studyTime_change` REAL NOT NULL, `wpm_overall` REAL NOT NULL, `wpm_change` REAL NOT NULL, `lessonTaken_overall` REAL NOT NULL, `lessonTaken_change` REAL NOT NULL, `translationsCreated_overall` REAL NOT NULL, `translationsCreated_change` REAL NOT NULL, `learnedWords_overall` REAL NOT NULL, `learnedWords_change` REAL NOT NULL, `readingUsage_overall` REAL NOT NULL, `readingUsage_change` REAL NOT NULL, `listening_overall` REAL NOT NULL, `listening_change` REAL NOT NULL, `earnedCoins_overall` REAL NOT NULL, `earnedCoins_change` REAL NOT NULL, `coinsRead_overall` REAL NOT NULL, `coinsRead_change` REAL NOT NULL, `reviewUsage_overall` REAL NOT NULL, `reviewUsage_change` REAL NOT NULL, `listeningUsage_overall` REAL NOT NULL, `listeningUsage_change` REAL NOT NULL, `writing_overall` REAL NOT NULL, `writing_change` REAL NOT NULL, `createdLingQs_overall` REAL NOT NULL, `createdLingQs_change` REAL NOT NULL, `knownWords_overall` REAL NOT NULL, `knownWords_change` REAL NOT NULL, `lessonImported_overall` REAL NOT NULL, `lessonImported_change` REAL NOT NULL, `translationsUsed_overall` REAL NOT NULL, `translationsUsed_change` REAL NOT NULL, `reading_overall` REAL NOT NULL, `reading_change` REAL NOT NULL, `coinsListen_overall` REAL NOT NULL, `coinsListen_change` REAL NOT NULL, `speaking_overall` REAL NOT NULL, `speaking_change` REAL NOT NULL, PRIMARY KEY(`languageAndPeriod`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LanguageStatsEntity_languageAndPeriod` ON `LanguageStatsEntity` (`languageAndPeriod`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `StatsCalendarEntity` (`language` TEXT NOT NULL, `dailyGoal` INTEGER NOT NULL, `month` INTEGER NOT NULL, `year` INTEGER NOT NULL, `stats` TEXT, PRIMARY KEY(`language`, `month`, `year`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChatHistoryEntity` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `image` TEXT NOT NULL, `coins` REAL NOT NULL, `targetLanguage` TEXT NOT NULL, `dictionaryLanguage` TEXT NOT NULL, `startedAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `history` TEXT NOT NULL, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatHistoryEntity_id` ON `ChatHistoryEntity` (`id`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChatStatsEntity` (`id` INTEGER NOT NULL, `sentences` INTEGER NOT NULL, `knownWords` INTEGER NOT NULL, `totalWords` INTEGER NOT NULL, `uniqueWords` INTEGER NOT NULL, `cards` INTEGER NOT NULL, `coins` REAL NOT NULL, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatStatsEntity_id` ON `ChatStatsEntity` (`id`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChatSuggestionEntity` (`language` TEXT NOT NULL, `chatId` INTEGER NOT NULL, `position` INTEGER NOT NULL, `source` TEXT NOT NULL, `target` TEXT NOT NULL, PRIMARY KEY(`language`, `chatId`, `position`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatSuggestionEntity_language_chatId` ON `ChatSuggestionEntity` (`language`, `chatId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChatLessonJoin` (`chatId` INTEGER NOT NULL, `lessonId` INTEGER NOT NULL, PRIMARY KEY(`chatId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatLessonJoin_chatId` ON `ChatLessonJoin` (`chatId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `SearchChatHistoryJoin` (`query` TEXT NOT NULL, `chatId` INTEGER NOT NULL, PRIMARY KEY(`query`, `chatId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_SearchChatHistoryJoin_query_chatId` ON `SearchChatHistoryJoin` (`query`, `chatId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChatSentenceEntity` (`chatId` INTEGER NOT NULL, `messageIndex` INTEGER NOT NULL, `index` INTEGER NOT NULL, `tokens` TEXT NOT NULL, `text` TEXT, `normalizedText` TEXT, `timestamp` TEXT, `startParagraph` INTEGER NOT NULL, `url` TEXT, `opentag` TEXT, PRIMARY KEY(`chatId`, `messageIndex`, `index`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatSentenceEntity_chatId_messageIndex_index` ON `ChatSentenceEntity` (`chatId`, `messageIndex`, `index`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChatMessageTranslationEntity` (`chatId` INTEGER NOT NULL, `messageIndex` INTEGER NOT NULL, `translation` TEXT NOT NULL, PRIMARY KEY(`chatId`, `messageIndex`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatMessageTranslationEntity_chatId_messageIndex` ON `ChatMessageTranslationEntity` (`chatId`, `messageIndex`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChatMessagePhrasesEntity` (`chatId` INTEGER NOT NULL, `messageIndex` INTEGER NOT NULL, `phrases` TEXT NOT NULL, PRIMARY KEY(`chatId`, `messageIndex`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatMessagePhrasesEntity_chatId_messageIndex` ON `ChatMessagePhrasesEntity` (`chatId`, `messageIndex`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonPreviewEntity` (`lessonId` INTEGER NOT NULL, `preview` TEXT NOT NULL, PRIMARY KEY(`lessonId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `OfferEntity` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `code` TEXT NOT NULL, `type` TEXT NOT NULL, `visibility` TEXT NOT NULL DEFAULT 'Public', `dateStart` TEXT NOT NULL, `dateEnd` TEXT NOT NULL, `dateCountdown` TEXT, `countdownEnabled` INTEGER NOT NULL DEFAULT 1, `countdownEnded` INTEGER NOT NULL DEFAULT 0, `isActive` INTEGER NOT NULL DEFAULT 1, `tier` INTEGER, `ctaText` TEXT, `androidCoupon` TEXT, `discount` TEXT NOT NULL, `accentColorLight` TEXT NOT NULL, `accentColorDark` TEXT NOT NULL, `trialHeader` TEXT NOT NULL DEFAULT '', `banners` TEXT NOT NULL, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonAchievementEntity` (`lessonId` INTEGER NOT NULL, `language` TEXT NOT NULL, `type` TEXT NOT NULL, `dataJson` TEXT NOT NULL, PRIMARY KEY(`lessonId`, `language`, `type`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonSentenceTranslationEntity` (`lessonId` INTEGER NOT NULL, `sentenceIndex` INTEGER NOT NULL, `text` TEXT NOT NULL, PRIMARY KEY(`lessonId`, `sentenceIndex`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `VocabularyOrderEntity` (`termWithLanguage` TEXT NOT NULL, `sortPosition` INTEGER NOT NULL, PRIMARY KEY(`termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_VocabularyOrderEntity_termWithLanguage` ON `VocabularyOrderEntity` (`termWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonCoachChatEntity` (`lessonId` INTEGER NOT NULL, `chatId` INTEGER NOT NULL, `messageIndex` INTEGER NOT NULL, `message` TEXT NOT NULL, PRIMARY KEY(`lessonId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CupEntity` (`id` INTEGER NOT NULL, `active` INTEGER NOT NULL, `ended` INTEGER NOT NULL, `startsAt` TEXT, `endsAt` TEXT, `joined` INTEGER NOT NULL, `champion` TEXT, `team` TEXT, `my` TEXT, `today` TEXT, `teams` TEXT NOT NULL, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CupPrizeEntity` (`date` TEXT NOT NULL, `kind` TEXT NOT NULL, `source` TEXT NOT NULL, `value` INTEGER NOT NULL, `label` TEXT NOT NULL, `claim` TEXT, PRIMARY KEY(`date`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CupTeamEntity` (`teamCode` TEXT NOT NULL, `name` TEXT NOT NULL, `totalCoins` INTEGER NOT NULL, `coinsPerUser` REAL NOT NULL, `participantCount` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `prevRank` INTEGER, `delta` INTEGER, PRIMARY KEY(`teamCode`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CupContributorEntity` (`scope` TEXT NOT NULL, `profileId` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `prevRank` INTEGER, `delta` INTEGER, `username` TEXT NOT NULL, `photoUrl` TEXT, `teamCode` TEXT NOT NULL, `score` INTEGER NOT NULL, PRIMARY KEY(`scope`, `profileId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CupContributorMeEntity` (`scope` TEXT NOT NULL, `rank` INTEGER, `score` INTEGER NOT NULL, PRIMARY KEY(`scope`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CollectionSubscriptionEntity` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`id`, `language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                AbstractC3695vr.m23496g(bk8Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3a44617d89a43e37425d4c466dc09fe0')");
                break;
            default:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", bk8Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                AbstractC3695vr.m23496g(bk8Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
        }
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: c */
    public final void mo16445c(bk8 bk8Var) {
        switch (this.f59112d) {
            case 0:
                g9a.m12433j(bk8Var, bk8Var, "DROP TABLE IF EXISTS `LessonEntity`", bk8Var, "DROP TABLE IF EXISTS `LessonSentenceEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CardEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `WordEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonsAndCardsJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonsAndWordsJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `DictionaryDataEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `DictionaryLocaleEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChallengeEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `BadgeEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `MilestoneEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LibraryDataEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LanguageContextEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LanguageEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LanguageActiveDictionaryJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LanguageAvailableDictionaryJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LanguageDictionaryLocaleJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LibraryShelfAndContentJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LibraryShelfEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `PlaylistEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `PlaylistAndLessonsJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `TranslationsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `TtsVoiceEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LanguageAndTtsVoicesJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `TtsUtteranceEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `TranslationSentenceEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LanguageProgressEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `PagingKeysEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LanguageProgressChartEntryEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `StudyStatsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonBookmarkEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LibraryCounterEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `TokenPopularMeaningsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `TokenRelatedPhrasesEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LibraryDownloadEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonAudioDownloadEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LanguageCardsTagsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CourseForImportEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonsWithPlaylistJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CoursesAndLessonsJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CoursesAndLanguageJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CourseAndCardsJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChallengeRankingEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChallengeDetailStatsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChallengeStatsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ProviderEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonTagEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `NotificationEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `StreakEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `MilestoneMetEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `MilestoneStatsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LibraryFastSearchEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `SharedByUserEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `SharedByUserAndQueryJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `NoticeEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ReferralEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonStatsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CardsAndLOTDJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonAndCardsFromJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonAndWordsFromJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonsSimplifiedJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CoursesAndLessonsSortJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonNextSuggestionEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `SourceBlacklistEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CourseBlacklistEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `TokenCwtEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LanguageStatsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `StatsCalendarEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChatHistoryEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChatStatsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChatSuggestionEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChatLessonJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `SearchChatHistoryJoin`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChatSentenceEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChatMessageTranslationEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `ChatMessagePhrasesEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonPreviewEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `OfferEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonAchievementEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonSentenceTranslationEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `VocabularyOrderEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `LessonCoachChatEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CupEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CupPrizeEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CupTeamEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CupContributorEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CupContributorMeEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `CollectionSubscriptionEntity`");
                break;
            default:
                g9a.m12433j(bk8Var, bk8Var, "DROP TABLE IF EXISTS `Dependency`", bk8Var, "DROP TABLE IF EXISTS `WorkSpec`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `WorkTag`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `WorkName`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `WorkProgress`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `Preference`");
                break;
        }
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: r */
    public final void mo16460r(bk8 bk8Var) {
        int i = this.f59112d;
        bk8Var.getClass();
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: s */
    public final void mo16461s(bk8 bk8Var) throws Exception {
        int i = this.f59112d;
        AbstractC0746d abstractC0746d = this.f59113e;
        bk8Var.getClass();
        switch (i) {
            case 0:
                ((LingQDatabase_Impl) abstractC0746d).m2842o(bk8Var);
                break;
            default:
                AbstractC3695vr.m23496g(bk8Var, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) abstractC0746d).m2842o(bk8Var);
                break;
        }
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: t */
    public final void mo16462t(bk8 bk8Var) {
        int i = this.f59112d;
        bk8Var.getClass();
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: u */
    public final void mo16463u(bk8 bk8Var) throws Exception {
        int i = this.f59112d;
        bk8Var.getClass();
        switch (i) {
            case 0:
                C0683q.m2473b(bk8Var);
                break;
            default:
                C0683q.m2473b(bk8Var);
                break;
        }
    }

    @Override // p000.lq2
    /* JADX INFO: renamed from: v */
    public final mc0 mo16464v(bk8 bk8Var) throws Exception {
        switch (this.f59112d) {
            case 0:
                return m20586w(bk8Var);
            default:
                bk8Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("work_spec_id", new vq9("work_spec_id", "TEXT", 1, true, 1, null));
                LinkedHashSet linkedHashSetM10877i = e65.m10877i(linkedHashMap, "prerequisite_id", new vq9("prerequisite_id", "TEXT", 2, true, 1, null));
                linkedHashSetM10877i.add(new wq9("WorkSpec", "CASCADE", "CASCADE", vz1.m23604J("work_spec_id"), vz1.m23604J("id")));
                linkedHashSetM10877i.add(new wq9("WorkSpec", "CASCADE", "CASCADE", vz1.m23604J("prerequisite_id"), vz1.m23604J("id")));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new xq9("index_Dependency_work_spec_id", false, vz1.m23604J("work_spec_id"), vz1.m23604J("ASC")));
                linkedHashSet.add(new xq9("index_Dependency_prerequisite_id", false, vz1.m23604J("prerequisite_id"), vz1.m23604J("ASC")));
                yq9 yq9Var = new yq9("Dependency", linkedHashMap, linkedHashSetM10877i, linkedHashSet);
                yq9 yq9VarM3392l = b6d.m3392l(bk8Var, "Dependency");
                if (!yq9Var.equals(yq9VarM3392l)) {
                    return new mc0(false, e65.m10873e("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", yq9Var, "\n Found:\n", yq9VarM3392l));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new vq9("id", "TEXT", 1, true, 1, null));
                linkedHashMap2.put("state", new vq9("state", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("worker_class_name", new vq9("worker_class_name", "TEXT", 0, true, 1, null));
                linkedHashMap2.put("input_merger_class_name", new vq9("input_merger_class_name", "TEXT", 0, true, 1, null));
                linkedHashMap2.put("input", new vq9("input", "BLOB", 0, true, 1, null));
                linkedHashMap2.put("output", new vq9("output", "BLOB", 0, true, 1, null));
                linkedHashMap2.put("initial_delay", new vq9("initial_delay", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("interval_duration", new vq9("interval_duration", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("flex_duration", new vq9("flex_duration", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("run_attempt_count", new vq9("run_attempt_count", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("backoff_policy", new vq9("backoff_policy", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("backoff_delay_duration", new vq9("backoff_delay_duration", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("last_enqueue_time", new vq9("last_enqueue_time", "INTEGER", 0, true, 1, "-1"));
                linkedHashMap2.put("minimum_retention_duration", new vq9("minimum_retention_duration", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("schedule_requested_at", new vq9("schedule_requested_at", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("run_in_foreground", new vq9("run_in_foreground", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("out_of_quota_policy", new vq9("out_of_quota_policy", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("period_count", new vq9("period_count", "INTEGER", 0, true, 1, "0"));
                linkedHashMap2.put("generation", new vq9("generation", "INTEGER", 0, true, 1, "0"));
                linkedHashMap2.put("next_schedule_time_override", new vq9("next_schedule_time_override", "INTEGER", 0, true, 1, "9223372036854775807"));
                linkedHashMap2.put("next_schedule_time_override_generation", new vq9("next_schedule_time_override_generation", "INTEGER", 0, true, 1, "0"));
                linkedHashMap2.put("stop_reason", new vq9("stop_reason", "INTEGER", 0, true, 1, "-256"));
                linkedHashMap2.put("trace_tag", new vq9("trace_tag", "TEXT", 0, false, 1, null));
                linkedHashMap2.put("backoff_on_system_interruptions", new vq9("backoff_on_system_interruptions", "INTEGER", 0, false, 1, null));
                linkedHashMap2.put("required_network_type", new vq9("required_network_type", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("required_network_request", new vq9("required_network_request", "BLOB", 0, true, 1, "x''"));
                linkedHashMap2.put("requires_charging", new vq9("requires_charging", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("requires_device_idle", new vq9("requires_device_idle", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("requires_battery_not_low", new vq9("requires_battery_not_low", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("requires_storage_not_low", new vq9("requires_storage_not_low", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("trigger_content_update_delay", new vq9("trigger_content_update_delay", "INTEGER", 0, true, 1, null));
                linkedHashMap2.put("trigger_max_content_delay", new vq9("trigger_max_content_delay", "INTEGER", 0, true, 1, null));
                LinkedHashSet linkedHashSetM10877i2 = e65.m10877i(linkedHashMap2, "content_uri_triggers", new vq9("content_uri_triggers", "BLOB", 0, true, 1, null));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new xq9("index_WorkSpec_schedule_requested_at", false, vz1.m23604J("schedule_requested_at"), vz1.m23604J("ASC")));
                linkedHashSet2.add(new xq9("index_WorkSpec_last_enqueue_time", false, vz1.m23604J("last_enqueue_time"), vz1.m23604J("ASC")));
                yq9 yq9Var2 = new yq9("WorkSpec", linkedHashMap2, linkedHashSetM10877i2, linkedHashSet2);
                yq9 yq9VarM3392l2 = b6d.m3392l(bk8Var, "WorkSpec");
                if (!yq9Var2.equals(yq9VarM3392l2)) {
                    return new mc0(false, e65.m10873e("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", yq9Var2, "\n Found:\n", yq9VarM3392l2));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("tag", new vq9("tag", "TEXT", 1, true, 1, null));
                LinkedHashSet linkedHashSetM10877i3 = e65.m10877i(linkedHashMap3, "work_spec_id", new vq9("work_spec_id", "TEXT", 2, true, 1, null));
                linkedHashSetM10877i3.add(new wq9("WorkSpec", "CASCADE", "CASCADE", vz1.m23604J("work_spec_id"), vz1.m23604J("id")));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new xq9("index_WorkTag_work_spec_id", false, vz1.m23604J("work_spec_id"), vz1.m23604J("ASC")));
                yq9 yq9Var3 = new yq9("WorkTag", linkedHashMap3, linkedHashSetM10877i3, linkedHashSet3);
                yq9 yq9VarM3392l3 = b6d.m3392l(bk8Var, "WorkTag");
                if (!yq9Var3.equals(yq9VarM3392l3)) {
                    return new mc0(false, e65.m10873e("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", yq9Var3, "\n Found:\n", yq9VarM3392l3));
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("work_spec_id", new vq9("work_spec_id", "TEXT", 1, true, 1, null));
                linkedHashMap4.put("generation", new vq9("generation", "INTEGER", 2, true, 1, "0"));
                LinkedHashSet linkedHashSetM10877i4 = e65.m10877i(linkedHashMap4, "system_id", new vq9("system_id", "INTEGER", 0, true, 1, null));
                linkedHashSetM10877i4.add(new wq9("WorkSpec", "CASCADE", "CASCADE", vz1.m23604J("work_spec_id"), vz1.m23604J("id")));
                yq9 yq9Var4 = new yq9("SystemIdInfo", linkedHashMap4, linkedHashSetM10877i4, new LinkedHashSet());
                yq9 yq9VarM3392l4 = b6d.m3392l(bk8Var, "SystemIdInfo");
                if (!yq9Var4.equals(yq9VarM3392l4)) {
                    return new mc0(false, e65.m10873e("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", yq9Var4, "\n Found:\n", yq9VarM3392l4));
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("name", new vq9("name", "TEXT", 1, true, 1, null));
                LinkedHashSet linkedHashSetM10877i5 = e65.m10877i(linkedHashMap5, "work_spec_id", new vq9("work_spec_id", "TEXT", 2, true, 1, null));
                linkedHashSetM10877i5.add(new wq9("WorkSpec", "CASCADE", "CASCADE", vz1.m23604J("work_spec_id"), vz1.m23604J("id")));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new xq9("index_WorkName_work_spec_id", false, vz1.m23604J("work_spec_id"), vz1.m23604J("ASC")));
                yq9 yq9Var5 = new yq9("WorkName", linkedHashMap5, linkedHashSetM10877i5, linkedHashSet4);
                yq9 yq9VarM3392l5 = b6d.m3392l(bk8Var, "WorkName");
                if (!yq9Var5.equals(yq9VarM3392l5)) {
                    return new mc0(false, e65.m10873e("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", yq9Var5, "\n Found:\n", yq9VarM3392l5));
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new vq9("work_spec_id", "TEXT", 1, true, 1, null));
                LinkedHashSet linkedHashSetM10877i6 = e65.m10877i(linkedHashMap6, "progress", new vq9("progress", "BLOB", 0, true, 1, null));
                linkedHashSetM10877i6.add(new wq9("WorkSpec", "CASCADE", "CASCADE", vz1.m23604J("work_spec_id"), vz1.m23604J("id")));
                yq9 yq9Var6 = new yq9("WorkProgress", linkedHashMap6, linkedHashSetM10877i6, new LinkedHashSet());
                yq9 yq9VarM3392l6 = b6d.m3392l(bk8Var, "WorkProgress");
                if (!yq9Var6.equals(yq9VarM3392l6)) {
                    return new mc0(false, e65.m10873e("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", yq9Var6, "\n Found:\n", yq9VarM3392l6));
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("key", new vq9("key", "TEXT", 1, true, 1, null));
                yq9 yq9Var7 = new yq9("Preference", linkedHashMap7, e65.m10877i(linkedHashMap7, "long_value", new vq9("long_value", "INTEGER", 0, false, 1, null)), new LinkedHashSet());
                yq9 yq9VarM3392l7 = b6d.m3392l(bk8Var, "Preference");
                return !yq9Var7.equals(yq9VarM3392l7) ? new mc0(false, e65.m10873e("Preference(androidx.work.impl.model.Preference).\n Expected:\n", yq9Var7, "\n Found:\n", yq9VarM3392l7)) : new mc0(true, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd5(LingQDatabase_Impl lingQDatabase_Impl) {
        super("3a44617d89a43e37425d4c466dc09fe0", 311, "dff947f6bc691d6c4831392b6ffb47e7");
        this.f59113e = lingQDatabase_Impl;
    }
}
