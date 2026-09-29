package com.lingq.shared.persistent;

import ai.C0080b;
import ai.C0081c;
import ai.C0082d;
import ai.C0083e;
import android.content.Context;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import bi.AbstractC1388a;
import bi.AbstractC1402b5;
import bi.AbstractC1413d0;
import bi.AbstractC1440g3;
import bi.AbstractC1450h5;
import bi.AbstractC1454i2;
import bi.AbstractC1469k3;
import bi.AbstractC1485m5;
import bi.AbstractC1486n;
import bi.AbstractC1495o1;
import bi.AbstractC1497o3;
import bi.AbstractC1518r3;
import bi.AbstractC1520r5;
import bi.AbstractC1529t0;
import bi.AbstractC1562x5;
import bi.AbstractC1568y4;
import bi.C1404c;
import bi.C1421e0;
import bi.C1422e1;
import bi.C1426e5;
import bi.C1461j2;
import bi.C1462j3;
import bi.C1476l3;
import bi.C1478l5;
import bi.C1480m0;
import bi.C1492n5;
import bi.C1493o;
import bi.C1502p1;
import bi.C1504p3;
import bi.C1527s5;
import bi.C1532t3;
import bi.C1543v0;
import bi.C1546v3;
import bi.C1560x3;
import bi.C1575z4;
import bi.C1576z5;
import bi.InterfaceC1539u3;
import com.lingq.shared.persistent.dao.DictionaryDao;
import com.lingq.shared.persistent.dao.LanguageStatsDao;
import com.lingq.shared.persistent.dao.PlaylistDao;
import dm.C5207g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p041c5.C1727y;
import p041c5.C1728z;
import p213k4.C6581a;
import p213k4.C6586f;
import p213k4.C6594n;
import p234l4.InterfaceC7251a;
import p256m4.C7478a;
import p288o4.InterfaceC7916b;
import p288o4.InterfaceC7917c;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
public final class LingQDatabase_Impl extends LingQDatabase {

    /* JADX INFO: renamed from: A */
    public volatile C1493o f19348A;

    /* JADX INFO: renamed from: B */
    public volatile C1532t3 f19349B;

    /* JADX INFO: renamed from: C */
    public volatile C1476l3 f19350C;

    /* JADX INFO: renamed from: D */
    public volatile C1426e5 f19351D;

    /* JADX INFO: renamed from: E */
    public volatile C1504p3 f19352E;

    /* JADX INFO: renamed from: F */
    public volatile C1575z4 f19353F;

    /* JADX INFO: renamed from: m */
    public volatile C1461j2 f19354m;

    /* JADX INFO: renamed from: n */
    public volatile C1502p1 f19355n;

    /* JADX INFO: renamed from: o */
    public volatile C1421e0 f19356o;

    /* JADX INFO: renamed from: p */
    public volatile C1404c f19357p;

    /* JADX INFO: renamed from: q */
    public volatile C1576z5 f19358q;

    /* JADX INFO: renamed from: r */
    public volatile C1478l5 f19359r;

    /* JADX INFO: renamed from: s */
    public volatile C1543v0 f19360s;

    /* JADX INFO: renamed from: t */
    public volatile C1422e1 f19361t;

    /* JADX INFO: renamed from: u */
    public volatile C1560x3 f19362u;

    /* JADX INFO: renamed from: v */
    public volatile C1527s5 f19363v;

    /* JADX INFO: renamed from: w */
    public volatile C1480m0 f19364w;

    /* JADX INFO: renamed from: x */
    public volatile C1462j3 f19365x;

    /* JADX INFO: renamed from: y */
    public volatile C1492n5 f19366y;

    /* JADX INFO: renamed from: z */
    public volatile C1546v3 f19367z;

    /* JADX INFO: renamed from: com.lingq.shared.persistent.LingQDatabase_Impl$a */
    public class C3314a extends C6594n.a {
        public C3314a() {
            super(250);
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: a */
        public final void mo4719a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `Lesson` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL DEFAULT 'content', `url` TEXT, `pos` INTEGER NOT NULL, `title` TEXT, `description` TEXT, `pubDate` TEXT, `imageUrl` TEXT, `audioUrl` TEXT, `duration` INTEGER NOT NULL, `status` TEXT, `sharedDate` TEXT, `originalUrl` TEXT, `wordCount` INTEGER NOT NULL, `uniqueWordCount` INTEGER NOT NULL, `rosesCount` INTEGER NOT NULL, `lessonRating` REAL NOT NULL, `audioRating` REAL NOT NULL, `collectionId` INTEGER NOT NULL, `collectionTitle` TEXT, `transliteration` TEXT NOT NULL, `altScript` TEXT NOT NULL, `classicUrl` TEXT, `previousLessonId` INTEGER, `nextLessonId` INTEGER, `readTimes` REAL NOT NULL, `listenTimes` REAL NOT NULL, `isCompleted` INTEGER NOT NULL, `newWordsCount` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `isRoseGiven` INTEGER NOT NULL, `giveRoseUrl` TEXT, `price` INTEGER NOT NULL, `opened` INTEGER NOT NULL, `percentCompleted` REAL NOT NULL, `lastRoseReceived` TEXT, `isFavorite` INTEGER NOT NULL, `printUrl` TEXT, `videoUrl` TEXT, `exercises` TEXT, `notes` TEXT, `viewsCount` INTEGER NOT NULL, `providerId` INTEGER, `providerName` TEXT, `providerDescription` TEXT, `originalImageUrl` TEXT, `providerImageUrl` TEXT, `sharedById` TEXT, `sharedByName` TEXT, `sharedByImageUrl` TEXT, `sharedByRole` TEXT, `isSharedByIsFriend` INTEGER NOT NULL, `isCanEdit` INTEGER NOT NULL, `canEditSentence` INTEGER NOT NULL DEFAULT 0, `isProtected` INTEGER NOT NULL DEFAULT 1, `lessonVotes` INTEGER NOT NULL, `audioVotes` INTEGER NOT NULL, `level` TEXT, `tags` TEXT, `progressDownloaded` INTEGER NOT NULL, `progress` REAL, `translationSentence` TEXT NOT NULL, `mediaImageUrl` TEXT, `mediaTitle` TEXT, `ptime` TEXT, `isPinned` INTEGER, `difficulty` REAL NOT NULL, `newWords` INTEGER NOT NULL, `lessonPreview` TEXT NOT NULL, `isTaken` INTEGER, `folders` TEXT, `audioPending` INTEGER, `userLiked_username` TEXT, `userLiked_liked` INTEGER, `userCompleted_username` TEXT, `userCompleted_completed` INTEGER, `translation_language` TEXT, `translation_sentences` TEXT, `source_type` TEXT, `source_name` TEXT, `source_url` TEXT, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_Lesson_id` ON `Lesson` (`id`)", "CREATE INDEX IF NOT EXISTS `index_Lesson_id_title_collectionTitle_imageUrl_cardsCount_uniqueWordCount_newWords_duration_isCompleted_percentCompleted` ON `Lesson` (`id`, `title`, `collectionTitle`, `imageUrl`, `cardsCount`, `uniqueWordCount`, `newWords`, `duration`, `isCompleted`, `percentCompleted`)", "CREATE TABLE IF NOT EXISTS `Sentence` (`lessonId` INTEGER NOT NULL, `tokens` TEXT NOT NULL, `text` TEXT, `normalizedText` TEXT, `index` INTEGER NOT NULL, `timestamp` TEXT, `startParagraph` INTEGER NOT NULL, PRIMARY KEY(`lessonId`, `index`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_Sentence_lessonId_index` ON `Sentence` (`lessonId`, `index`)", "CREATE TABLE IF NOT EXISTS `Card` (`term` TEXT NOT NULL COLLATE LOCALIZED, `termWithLanguage` TEXT NOT NULL, `id` INTEGER NOT NULL, `url` TEXT, `fragment` TEXT, `status` INTEGER NOT NULL, `extendedStatus` INTEGER, `lastReviewedCorrect` TEXT, `srsDueDate` TEXT, `notes` TEXT, `audio` TEXT, `importance` INTEGER NOT NULL, `meanings` TEXT NOT NULL, `meaningTerms` TEXT NOT NULL, `tags` TEXT NOT NULL, `gTags` TEXT NOT NULL, `words` TEXT NOT NULL, `isPhrase` INTEGER NOT NULL, `hiragana` TEXT, `romaji` TEXT, `pinyin` TEXT, `hant` TEXT, `hans` TEXT, `jyutping` TEXT, PRIMARY KEY(`termWithLanguage`))", "CREATE INDEX IF NOT EXISTS `index_Card_termWithLanguage` ON `Card` (`termWithLanguage`)", "CREATE TABLE IF NOT EXISTS `Word` (`termWithLanguage` TEXT NOT NULL, `term` TEXT NOT NULL, `id` INTEGER NOT NULL, `status` TEXT, `importance` INTEGER NOT NULL, `isPhrase` INTEGER NOT NULL, `meanings` TEXT NOT NULL, `tags` TEXT NOT NULL, `gTags` TEXT NOT NULL, `cardId` INTEGER NOT NULL, `romaji` TEXT, `hiragana` TEXT, `pinyin` TEXT, `hant` TEXT, `hans` TEXT, PRIMARY KEY(`termWithLanguage`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `LessonsAndCardsJoin` (`contentId` INTEGER NOT NULL, `termWithLanguage` TEXT NOT NULL, PRIMARY KEY(`contentId`, `termWithLanguage`))", "CREATE INDEX IF NOT EXISTS `index_LessonsAndCardsJoin_contentId_termWithLanguage` ON `LessonsAndCardsJoin` (`contentId`, `termWithLanguage`)", "CREATE TABLE IF NOT EXISTS `LessonsAndWordsJoin` (`contentId` INTEGER NOT NULL, `termWithLanguage` TEXT NOT NULL, PRIMARY KEY(`contentId`, `termWithLanguage`))", "CREATE INDEX IF NOT EXISTS `index_LessonsAndWordsJoin_contentId_termWithLanguage` ON `LessonsAndWordsJoin` (`contentId`, `termWithLanguage`)");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `DictionaryData` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `order` INTEGER NOT NULL, `urlToTransform` TEXT NOT NULL, `urlDefinition` TEXT NOT NULL, `isPopUpWindow` INTEGER NOT NULL, `languageTo` TEXT NOT NULL, `urlVar1` TEXT NOT NULL, `urlVar2` TEXT NOT NULL, `urlVar3` TEXT NOT NULL, `urlVar4` TEXT NOT NULL, `urlVar5` TEXT NOT NULL, `overrideUrl` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `DictionaryLocale` (`code` TEXT NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`code`))", "CREATE INDEX IF NOT EXISTS `index_DictionaryLocale_code` ON `DictionaryLocale` (`code`)", "CREATE TABLE IF NOT EXISTS `Challenge` (`pk` INTEGER NOT NULL, `code` TEXT, `title` TEXT, `challengeType` TEXT, `description` TEXT, `prize` TEXT, `startDate` TEXT, `endDate` TEXT, `language` TEXT, `timeLeft` TEXT, `isPermanent` INTEGER NOT NULL, `participantsCount` INTEGER NOT NULL, `isDisabled` INTEGER NOT NULL, `isActive` INTEGER NOT NULL, `badge` TEXT, `badgeUrl` TEXT, `duration` INTEGER NOT NULL, `contextParticipants` INTEGER NOT NULL, `screenTitle` TEXT, `socialSettings` TEXT, `isCompleted` INTEGER NOT NULL, `isPast` INTEGER NOT NULL, `isJoined` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `order` INTEGER NOT NULL, `knownWords` INTEGER NOT NULL DEFAULT 0, `challengeLanguage` TEXT DEFAULT '', PRIMARY KEY(`pk`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_Challenge_pk` ON `Challenge` (`pk`)", "CREATE TABLE IF NOT EXISTS `Badge` (`languageAndSlug` TEXT NOT NULL, `language` TEXT, `slug` TEXT, `name` TEXT, `goal` INTEGER NOT NULL, `stat` TEXT, `metAt` TEXT, `gainedAt` TEXT, PRIMARY KEY(`languageAndSlug`))", "CREATE TABLE IF NOT EXISTS `Milestone` (`languageAndSlug` TEXT NOT NULL, `language` TEXT, `slug` TEXT, `name` TEXT, `goal` INTEGER NOT NULL, `stat` TEXT, `date` TEXT, PRIMARY KEY(`languageAndSlug`))", "CREATE TABLE IF NOT EXISTS `LibraryData` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT, `description` TEXT, `pos` INTEGER NOT NULL, `url` TEXT, `imageUrl` TEXT, `providerId` INTEGER, `providerName` TEXT, `providerDescription` TEXT, `originalImageUrl` TEXT, `providerImageUrl` TEXT, `sharedById` TEXT, `sharedByName` TEXT, `sharedByImageUrl` TEXT, `sharedByRole` TEXT, `level` TEXT, `newWordsCount` INTEGER NOT NULL, `lessonsCount` INTEGER NOT NULL, `owner` TEXT, `price` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `rosesCount` INTEGER NOT NULL, `duration` INTEGER, `collectionId` INTEGER, `collectionTitle` TEXT, `difficulty` REAL NOT NULL, `isAvailable` INTEGER NOT NULL, `tags` TEXT, `status` TEXT, `folders` TEXT, `progress` REAL, `isTaken` INTEGER, `lessonPreview` TEXT NOT NULL, `accent` TEXT, `audioUrl` TEXT DEFAULT '', `listenTimes` REAL NOT NULL DEFAULT 0.0, `readTimes` REAL NOT NULL DEFAULT 0.0, `isCompleted` INTEGER NOT NULL DEFAULT 0, `isFavorite` INTEGER NOT NULL DEFAULT 0, `videoUrl` TEXT DEFAULT '', `source_type` TEXT, `source_name` TEXT, `source_url` TEXT, PRIMARY KEY(`id`, `type`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_LibraryData_id_type` ON `LibraryData` (`id`, `type`)", "CREATE TABLE IF NOT EXISTS `LanguageContext` (`code` TEXT NOT NULL, `pk` INTEGER NOT NULL, `url` TEXT, `repetitionLingQs` INTEGER NOT NULL, `lotdDates` TEXT NOT NULL, `isUseFeed` INTEGER, `intense` TEXT, `streakDays` INTEGER NOT NULL, `tags` TEXT NOT NULL, `supported` INTEGER, `title` TEXT, `lastUsed` TEXT, `knownWords` INTEGER, `grammarResourceSlug` TEXT, `feedLevels` TEXT, `email_lotd` TEXT, `email_weekly` TEXT, `site_lotd` TEXT, `site_weekly` TEXT, PRIMARY KEY(`code`))", "CREATE INDEX IF NOT EXISTS `index_LanguageContext_code` ON `LanguageContext` (`code`)", "CREATE TABLE IF NOT EXISTS `Language` (`code` TEXT NOT NULL, `supported` INTEGER, `title` TEXT, `lastUsed` TEXT, `knownWords` INTEGER, `dictionaryLocaleActive` TEXT, `grammarResourceSlug` TEXT, PRIMARY KEY(`code`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `LanguageActiveDictionaryJoin` (`code` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`code`, `id`))", "CREATE TABLE IF NOT EXISTS `LanguageAvailableDictionaryJoin` (`code` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`code`, `id`))", "CREATE TABLE IF NOT EXISTS `LanguageDictionaryLocaleJoin` (`language` TEXT NOT NULL, `code` TEXT NOT NULL, PRIMARY KEY(`language`, `code`))", "CREATE INDEX IF NOT EXISTS `index_LanguageDictionaryLocaleJoin_language_code` ON `LanguageDictionaryLocaleJoin` (`language`, `code`)");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `LibraryShelfAndContentJoin` (`codeWithLanguage` TEXT NOT NULL, `id` INTEGER NOT NULL, `type` TEXT NOT NULL, `order` INTEGER NOT NULL, `ofQuery` TEXT NOT NULL, PRIMARY KEY(`codeWithLanguage`, `id`, `type`))", "CREATE INDEX IF NOT EXISTS `index_LibraryShelfAndContentJoin_codeWithLanguage_id_type` ON `LibraryShelfAndContentJoin` (`codeWithLanguage`, `id`, `type`)", "CREATE TABLE IF NOT EXISTS `Shelf` (`codeWithLanguage` TEXT NOT NULL, `language` TEXT NOT NULL, `pinned` INTEGER, `tabs` TEXT NOT NULL, `code` TEXT NOT NULL, `id` INTEGER NOT NULL, `title` TEXT NOT NULL, `order` INTEGER NOT NULL, `levels` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`codeWithLanguage`))", "CREATE INDEX IF NOT EXISTS `index_Shelf_codeWithLanguage_title` ON `Shelf` (`codeWithLanguage`, `title`)");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `Playlist` (`nameWithLanguage` TEXT NOT NULL, `language` TEXT NOT NULL, `name` TEXT NOT NULL, `pk` INTEGER NOT NULL, `isDefault` INTEGER NOT NULL, `isFeatured` INTEGER NOT NULL, `order` INTEGER NOT NULL, PRIMARY KEY(`nameWithLanguage`))", "CREATE INDEX IF NOT EXISTS `index_Playlist_nameWithLanguage` ON `Playlist` (`nameWithLanguage`)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_Playlist_name_language` ON `Playlist` (`name`, `language`)", "CREATE TABLE IF NOT EXISTS `PlaylistAndLessonsJoin` (`nameWithLanguage` TEXT NOT NULL, `language` TEXT NOT NULL, `contentId` INTEGER NOT NULL, `order` INTEGER, `isCourse` INTEGER NOT NULL, PRIMARY KEY(`nameWithLanguage`, `contentId`, `isCourse`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_PlaylistAndLessonsJoin_nameWithLanguage_contentId_isCourse` ON `PlaylistAndLessonsJoin` (`nameWithLanguage`, `contentId`, `isCourse`)", "CREATE TABLE IF NOT EXISTS `Translations` (`termWithLanguageAndTarget` TEXT NOT NULL, `translations` TEXT NOT NULL, PRIMARY KEY(`termWithLanguageAndTarget`))", "CREATE INDEX IF NOT EXISTS `index_Translations_termWithLanguageAndTarget` ON `Translations` (`termWithLanguageAndTarget`)", "CREATE TABLE IF NOT EXISTS `TtsVoice` (`name` TEXT NOT NULL, `title` TEXT NOT NULL, `voicesByApp` TEXT NOT NULL, `alternative` INTEGER, `priority` TEXT NOT NULL, PRIMARY KEY(`name`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_TtsVoice_name` ON `TtsVoice` (`name`)", "CREATE TABLE IF NOT EXISTS `LanguageAndTtsVoicesJoin` (`code` TEXT NOT NULL, `name` TEXT NOT NULL, `voiceOrder` INTEGER NOT NULL, PRIMARY KEY(`code`, `name`))", "CREATE INDEX IF NOT EXISTS `index_LanguageAndTtsVoicesJoin_code_name` ON `LanguageAndTtsVoicesJoin` (`code`, `name`)", "CREATE TABLE IF NOT EXISTS `TtsUtterance` (`idWithLanguageAndData` TEXT NOT NULL, `utteranceId` INTEGER NOT NULL, `audio` TEXT NOT NULL, `text` TEXT NOT NULL, PRIMARY KEY(`idWithLanguageAndData`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_TtsUtterance_idWithLanguageAndData` ON `TtsUtterance` (`idWithLanguageAndData`)", "CREATE TABLE IF NOT EXISTS `TranslationSentence` (`index` INTEGER NOT NULL, `lessonId` INTEGER NOT NULL, `audio` REAL, `audioEnd` REAL, `text` TEXT NOT NULL, `translations` TEXT NOT NULL, PRIMARY KEY(`index`, `lessonId`))", "CREATE INDEX IF NOT EXISTS `index_TranslationSentence_index_lessonId` ON `TranslationSentence` (`index`, `lessonId`)", "CREATE TABLE IF NOT EXISTS `LanguageProgress` (`interval` TEXT NOT NULL, `languageCode` TEXT NOT NULL, `writtenWordsGoal` INTEGER NOT NULL, `speakingTimeGoal` REAL NOT NULL, `totalWordsKnown` INTEGER NOT NULL, `readWords` REAL NOT NULL, `totalCards` INTEGER NOT NULL, `activityIndex` INTEGER NOT NULL, `knownWordsGoal` INTEGER NOT NULL, `listeningTimeGoal` REAL NOT NULL, `speakingTime` REAL NOT NULL, `cardsCreatedGoal` INTEGER NOT NULL, `knownWords` INTEGER NOT NULL, `intervals` TEXT, `cardsCreated` INTEGER NOT NULL, `readWordsGoal` INTEGER NOT NULL, `listeningTime` REAL NOT NULL, `cardsLearned` INTEGER NOT NULL, `writtenWords` INTEGER NOT NULL, `cardsLearnedGoal` INTEGER NOT NULL, PRIMARY KEY(`languageCode`, `interval`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `PagingKeys` (`pagingKey` TEXT NOT NULL, `prevKey` INTEGER, `nextKey` INTEGER, PRIMARY KEY(`pagingKey`))", "CREATE TABLE IF NOT EXISTS `LanguageProgressChartEntry` (`metric` TEXT NOT NULL, `languageCode` TEXT NOT NULL, `period` TEXT NOT NULL DEFAULT 'last_7d', `name` TEXT NOT NULL, `daily` REAL NOT NULL, `cumulative` REAL NOT NULL, `position` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`languageCode`, `metric`, `name`, `period`))", "CREATE TABLE IF NOT EXISTS `StudyStats` (`code` TEXT NOT NULL, `language` TEXT, `activityApple` TEXT, `notificationsCount` INTEGER NOT NULL, `dailyGoal` INTEGER NOT NULL, `streakDays` INTEGER NOT NULL, `coins` INTEGER NOT NULL, `knownWords` INTEGER NOT NULL, `isAvatarUpgraded` INTEGER NOT NULL, `dailyScores` TEXT, `activityLevel` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`code`))", "CREATE TABLE IF NOT EXISTS `LessonBookmark` (`contentId` INTEGER NOT NULL, `wordIndex` INTEGER, `client` TEXT, `timestamp` TEXT, `languageTimestamp` TEXT, PRIMARY KEY(`contentId`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_LessonBookmark_contentId` ON `LessonBookmark` (`contentId`)", "CREATE TABLE IF NOT EXISTS `LibraryCounter` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `roseGiven` INTEGER NOT NULL, `progress` REAL, `listenTimes` REAL, `readTimes` REAL, `isTaken` INTEGER NOT NULL, `difficulty` REAL NOT NULL, `rosesCount` INTEGER NOT NULL, `newWordsCount` INTEGER NOT NULL, `knownWordsCount` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `lessonsCount` INTEGER NOT NULL, `isCompletelyTaken` INTEGER NOT NULL, PRIMARY KEY(`id`, `type`))", "CREATE INDEX IF NOT EXISTS `index_LibraryCounter_id_type` ON `LibraryCounter` (`id`, `type`)", "CREATE TABLE IF NOT EXISTS `TokenAndPopularMeanings` (`termWithLanguage` TEXT NOT NULL, `locale` TEXT NOT NULL, `popularMeanings` TEXT NOT NULL, PRIMARY KEY(`termWithLanguage`, `locale`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_TokenAndPopularMeanings_termWithLanguage_locale` ON `TokenAndPopularMeanings` (`termWithLanguage`, `locale`)", "CREATE TABLE IF NOT EXISTS `TokenAndRelatedPhrases` (`termWithLanguage` TEXT NOT NULL, `relatedPhrases` TEXT NOT NULL, PRIMARY KEY(`termWithLanguage`))", "CREATE INDEX IF NOT EXISTS `index_TokenAndRelatedPhrases_termWithLanguage` ON `TokenAndRelatedPhrases` (`termWithLanguage`)", "CREATE TABLE IF NOT EXISTS `LibraryDownload` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `type` TEXT NOT NULL DEFAULT 'content', `isDownloaded` INTEGER NOT NULL, `downloadProgress` INTEGER, PRIMARY KEY(`id`, `language`, `type`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_LibraryDownload_id_language_type` ON `LibraryDownload` (`id`, `language`, `type`)", "CREATE TABLE IF NOT EXISTS `LessonAudioDownload` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `isDownloaded` INTEGER NOT NULL, `downloadProgress` INTEGER NOT NULL, PRIMARY KEY(`id`, `language`))", "CREATE INDEX IF NOT EXISTS `index_LessonAudioDownload_id_language` ON `LessonAudioDownload` (`id`, `language`)", "CREATE TABLE IF NOT EXISTS `LanguageCardsTags` (`code` TEXT NOT NULL, `tags` TEXT NOT NULL, PRIMARY KEY(`code`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_LanguageCardsTags_code` ON `LanguageCardsTags` (`code`)", "CREATE TABLE IF NOT EXISTS `CourseForImport` (`language` TEXT NOT NULL, `pk` INTEGER NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`language`, `pk`))", "CREATE INDEX IF NOT EXISTS `index_CourseForImport_language_pk` ON `CourseForImport` (`language`, `pk`)", "CREATE TABLE IF NOT EXISTS `LessonsWithPlaylistJoin` (`playlistId` INTEGER NOT NULL, `contentId` INTEGER NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`playlistId`, `contentId`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_LessonsWithPlaylistJoin_playlistId_contentId` ON `LessonsWithPlaylistJoin` (`playlistId`, `contentId`)", "CREATE TABLE IF NOT EXISTS `CoursesAndLessonsJoin` (`pk` INTEGER NOT NULL, `contentId` INTEGER NOT NULL, `courseOrder` INTEGER NOT NULL, PRIMARY KEY(`pk`, `contentId`))", "CREATE INDEX IF NOT EXISTS `index_CoursesAndLessonsJoin_pk_contentId` ON `CoursesAndLessonsJoin` (`pk`, `contentId`)", "CREATE TABLE IF NOT EXISTS `CoursesAndLanguageJoin` (`pk` INTEGER NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`pk`, `language`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_CoursesAndLanguageJoin_pk_language` ON `CoursesAndLanguageJoin` (`pk`, `language`)", "CREATE TABLE IF NOT EXISTS `CourseAndCardsJoin` (`pk` INTEGER NOT NULL, `termWithLanguage` TEXT NOT NULL, PRIMARY KEY(`pk`, `termWithLanguage`))", "CREATE INDEX IF NOT EXISTS `index_CourseAndCardsJoin_pk_termWithLanguage` ON `CourseAndCardsJoin` (`pk`, `termWithLanguage`)", "CREATE TABLE IF NOT EXISTS `ChallengeRanking` (`challengeCode` TEXT NOT NULL, `metric` TEXT NOT NULL, `rank` INTEGER NOT NULL, `language` TEXT NOT NULL, `profile` TEXT, `score` INTEGER NOT NULL, `scoreBehindLeader` INTEGER NOT NULL, `isCompleted` INTEGER NOT NULL, PRIMARY KEY(`challengeCode`, `metric`, `rank`, `language`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_ChallengeRanking_challengeCode_metric_rank_language` ON `ChallengeRanking` (`challengeCode`, `metric`, `rank`, `language`)", "CREATE TABLE IF NOT EXISTS `ChallengeDetailStats` (`language` TEXT NOT NULL, `challengeCode` TEXT NOT NULL, `code` TEXT NOT NULL, `value` INTEGER NOT NULL, `title` TEXT, PRIMARY KEY(`challengeCode`, `code`, `language`))", "CREATE INDEX IF NOT EXISTS `index_ChallengeDetailStats_challengeCode_code_language` ON `ChallengeDetailStats` (`challengeCode`, `code`, `language`)", "CREATE TABLE IF NOT EXISTS `ChallengeStats` (`language` TEXT NOT NULL, `challengeCode` TEXT NOT NULL, `code` TEXT NOT NULL, `title` TEXT NOT NULL, `progress` REAL NOT NULL, `actual` REAL NOT NULL, `target` REAL NOT NULL, PRIMARY KEY(`challengeCode`, `code`, `language`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_ChallengeStats_challengeCode_code_language` ON `ChallengeStats` (`challengeCode`, `code`, `language`)", "CREATE TABLE IF NOT EXISTS `Provider` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `description` TEXT, `image` TEXT, `title` TEXT, `url` TEXT, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_Provider_id` ON `Provider` (`id`)", "CREATE TABLE IF NOT EXISTS `LessonTag` (`title` TEXT NOT NULL COLLATE NOCASE, PRIMARY KEY(`title`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_LessonTag_title` ON `LessonTag` (`title`)", "CREATE TABLE IF NOT EXISTS `Notification` (`pk` INTEGER NOT NULL, `url` TEXT, `language` TEXT, `notificationLanguage` TEXT, `type` TEXT, `title` TEXT, `message` TEXT, `image` TEXT, `isNew` INTEGER, `timestamp` TEXT, PRIMARY KEY(`pk`))", "CREATE TABLE IF NOT EXISTS `Streak` (`language` TEXT NOT NULL, `streakDays` INTEGER, `coins` REAL, `latestStreakDays` INTEGER, `isStreakBroken` INTEGER, PRIMARY KEY(`language`))", "CREATE TABLE IF NOT EXISTS `MilestoneMet` (`languageAndSlug` TEXT NOT NULL, `metAt` TEXT NOT NULL, PRIMARY KEY(`languageAndSlug`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `MilestoneStats` (`language` TEXT NOT NULL, `knownWords` INTEGER NOT NULL, `lingqs` INTEGER NOT NULL, `dailyScore` INTEGER NOT NULL, PRIMARY KEY(`language`))", "CREATE TABLE IF NOT EXISTS `FastSearch` (`id` TEXT NOT NULL, `language` TEXT NOT NULL, `query` TEXT NOT NULL, `type` TEXT NOT NULL, `title` TEXT, PRIMARY KEY(`id`, `type`, `language`, `query`))", "CREATE INDEX IF NOT EXISTS `index_FastSearch_id_type_language_query` ON `FastSearch` (`id`, `type`, `language`, `query`)", "CREATE TABLE IF NOT EXISTS `SharedByUser` (`id` INTEGER NOT NULL, `language` TEXT, `firstName` TEXT, `lastName` TEXT, `photo` TEXT, `username` TEXT, `role` TEXT, PRIMARY KEY(`id`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SharedByUserAndQueryJoin` (`language` TEXT NOT NULL, `query` TEXT NOT NULL, `userId` INTEGER NOT NULL, PRIMARY KEY(`language`, `query`, `userId`))", "CREATE INDEX IF NOT EXISTS `index_SharedByUserAndQueryJoin_language_query_userId` ON `SharedByUserAndQueryJoin` (`language`, `query`, `userId`)", "CREATE TABLE IF NOT EXISTS `Notice` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `title` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT NOT NULL, `noticeType` TEXT NOT NULL, `isShown` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `Referral` (`pk` INTEGER NOT NULL, `username` TEXT, `photo` TEXT, `dateJoined` TEXT, PRIMARY KEY(`pk`))");
            frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            frameworkSQLiteDatabase.mo4600u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd63001fed805b92a99bc26ac544cfaea')");
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: b */
        public final void mo4720b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `Lesson`", "DROP TABLE IF EXISTS `Sentence`", "DROP TABLE IF EXISTS `Card`", "DROP TABLE IF EXISTS `Word`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `LessonsAndCardsJoin`", "DROP TABLE IF EXISTS `LessonsAndWordsJoin`", "DROP TABLE IF EXISTS `DictionaryData`", "DROP TABLE IF EXISTS `DictionaryLocale`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `Challenge`", "DROP TABLE IF EXISTS `Badge`", "DROP TABLE IF EXISTS `Milestone`", "DROP TABLE IF EXISTS `LibraryData`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `LanguageContext`", "DROP TABLE IF EXISTS `Language`", "DROP TABLE IF EXISTS `LanguageActiveDictionaryJoin`", "DROP TABLE IF EXISTS `LanguageAvailableDictionaryJoin`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `LanguageDictionaryLocaleJoin`", "DROP TABLE IF EXISTS `LibraryShelfAndContentJoin`", "DROP TABLE IF EXISTS `Shelf`", "DROP TABLE IF EXISTS `Playlist`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `PlaylistAndLessonsJoin`", "DROP TABLE IF EXISTS `Translations`", "DROP TABLE IF EXISTS `TtsVoice`", "DROP TABLE IF EXISTS `LanguageAndTtsVoicesJoin`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `TtsUtterance`", "DROP TABLE IF EXISTS `TranslationSentence`", "DROP TABLE IF EXISTS `LanguageProgress`", "DROP TABLE IF EXISTS `PagingKeys`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `LanguageProgressChartEntry`", "DROP TABLE IF EXISTS `StudyStats`", "DROP TABLE IF EXISTS `LessonBookmark`", "DROP TABLE IF EXISTS `LibraryCounter`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `TokenAndPopularMeanings`", "DROP TABLE IF EXISTS `TokenAndRelatedPhrases`", "DROP TABLE IF EXISTS `LibraryDownload`", "DROP TABLE IF EXISTS `LessonAudioDownload`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `LanguageCardsTags`", "DROP TABLE IF EXISTS `CourseForImport`", "DROP TABLE IF EXISTS `LessonsWithPlaylistJoin`", "DROP TABLE IF EXISTS `CoursesAndLessonsJoin`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `CoursesAndLanguageJoin`", "DROP TABLE IF EXISTS `CourseAndCardsJoin`", "DROP TABLE IF EXISTS `ChallengeRanking`", "DROP TABLE IF EXISTS `ChallengeDetailStats`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `ChallengeStats`", "DROP TABLE IF EXISTS `Provider`", "DROP TABLE IF EXISTS `LessonTag`", "DROP TABLE IF EXISTS `Notification`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `Streak`", "DROP TABLE IF EXISTS `MilestoneMet`", "DROP TABLE IF EXISTS `MilestoneStats`", "DROP TABLE IF EXISTS `FastSearch`");
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `SharedByUser`", "DROP TABLE IF EXISTS `SharedByUserAndQueryJoin`", "DROP TABLE IF EXISTS `Notice`", "DROP TABLE IF EXISTS `Referral`");
            LingQDatabase_Impl lingQDatabase_Impl = LingQDatabase_Impl.this;
            List<? extends RoomDatabase.AbstractC1181b> list = lingQDatabase_Impl.f7516g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    lingQDatabase_Impl.f7516g.get(i10).getClass();
                }
            }
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: c */
        public final void mo4721c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            LingQDatabase_Impl lingQDatabase_Impl = LingQDatabase_Impl.this;
            List<? extends RoomDatabase.AbstractC1181b> list = lingQDatabase_Impl.f7516g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    lingQDatabase_Impl.f7516g.get(i10).getClass();
                }
            }
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: d */
        public final void mo4722d(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            LingQDatabase_Impl.this.f7510a = frameworkSQLiteDatabase;
            LingQDatabase_Impl.this.m4564o(frameworkSQLiteDatabase);
            List<? extends RoomDatabase.AbstractC1181b> list = LingQDatabase_Impl.this.f7516g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LingQDatabase_Impl.this.f7516g.get(i10).mo4571a(frameworkSQLiteDatabase);
                }
            }
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: e */
        public final void mo4723e() {
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: f */
        public final void mo4724f(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
            C8573r0.m16717c0(frameworkSQLiteDatabase);
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: g */
        public final C6594n.b mo4725g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
            HashMap map = new HashMap(81);
            map.put("id", new C7478a.a(1, 1, "id", "INTEGER", null, true));
            map.put("type", new C7478a.a(0, 1, "type", "TEXT", "'content'", true));
            map.put("url", new C7478a.a(0, 1, "url", "TEXT", null, false));
            map.put("pos", new C7478a.a(0, 1, "pos", "INTEGER", null, true));
            map.put("title", new C7478a.a(0, 1, "title", "TEXT", null, false));
            map.put("description", new C7478a.a(0, 1, "description", "TEXT", null, false));
            map.put("pubDate", new C7478a.a(0, 1, "pubDate", "TEXT", null, false));
            map.put("imageUrl", new C7478a.a(0, 1, "imageUrl", "TEXT", null, false));
            map.put("audioUrl", new C7478a.a(0, 1, "audioUrl", "TEXT", null, false));
            map.put("duration", new C7478a.a(0, 1, "duration", "INTEGER", null, true));
            map.put("status", new C7478a.a(0, 1, "status", "TEXT", null, false));
            map.put("sharedDate", new C7478a.a(0, 1, "sharedDate", "TEXT", null, false));
            map.put("originalUrl", new C7478a.a(0, 1, "originalUrl", "TEXT", null, false));
            map.put("wordCount", new C7478a.a(0, 1, "wordCount", "INTEGER", null, true));
            map.put("uniqueWordCount", new C7478a.a(0, 1, "uniqueWordCount", "INTEGER", null, true));
            map.put("rosesCount", new C7478a.a(0, 1, "rosesCount", "INTEGER", null, true));
            map.put("lessonRating", new C7478a.a(0, 1, "lessonRating", "REAL", null, true));
            map.put("audioRating", new C7478a.a(0, 1, "audioRating", "REAL", null, true));
            map.put("collectionId", new C7478a.a(0, 1, "collectionId", "INTEGER", null, true));
            map.put("collectionTitle", new C7478a.a(0, 1, "collectionTitle", "TEXT", null, false));
            map.put("transliteration", new C7478a.a(0, 1, "transliteration", "TEXT", null, true));
            map.put("altScript", new C7478a.a(0, 1, "altScript", "TEXT", null, true));
            map.put("classicUrl", new C7478a.a(0, 1, "classicUrl", "TEXT", null, false));
            map.put("previousLessonId", new C7478a.a(0, 1, "previousLessonId", "INTEGER", null, false));
            map.put("nextLessonId", new C7478a.a(0, 1, "nextLessonId", "INTEGER", null, false));
            map.put("readTimes", new C7478a.a(0, 1, "readTimes", "REAL", null, true));
            map.put("listenTimes", new C7478a.a(0, 1, "listenTimes", "REAL", null, true));
            map.put("isCompleted", new C7478a.a(0, 1, "isCompleted", "INTEGER", null, true));
            map.put("newWordsCount", new C7478a.a(0, 1, "newWordsCount", "INTEGER", null, true));
            map.put("cardsCount", new C7478a.a(0, 1, "cardsCount", "INTEGER", null, true));
            map.put("isRoseGiven", new C7478a.a(0, 1, "isRoseGiven", "INTEGER", null, true));
            map.put("giveRoseUrl", new C7478a.a(0, 1, "giveRoseUrl", "TEXT", null, false));
            map.put("price", new C7478a.a(0, 1, "price", "INTEGER", null, true));
            map.put("opened", new C7478a.a(0, 1, "opened", "INTEGER", null, true));
            map.put("percentCompleted", new C7478a.a(0, 1, "percentCompleted", "REAL", null, true));
            map.put("lastRoseReceived", new C7478a.a(0, 1, "lastRoseReceived", "TEXT", null, false));
            map.put("isFavorite", new C7478a.a(0, 1, "isFavorite", "INTEGER", null, true));
            map.put("printUrl", new C7478a.a(0, 1, "printUrl", "TEXT", null, false));
            map.put("videoUrl", new C7478a.a(0, 1, "videoUrl", "TEXT", null, false));
            map.put("exercises", new C7478a.a(0, 1, "exercises", "TEXT", null, false));
            map.put("notes", new C7478a.a(0, 1, "notes", "TEXT", null, false));
            map.put("viewsCount", new C7478a.a(0, 1, "viewsCount", "INTEGER", null, true));
            map.put("providerId", new C7478a.a(0, 1, "providerId", "INTEGER", null, false));
            map.put("providerName", new C7478a.a(0, 1, "providerName", "TEXT", null, false));
            map.put("providerDescription", new C7478a.a(0, 1, "providerDescription", "TEXT", null, false));
            map.put("originalImageUrl", new C7478a.a(0, 1, "originalImageUrl", "TEXT", null, false));
            map.put("providerImageUrl", new C7478a.a(0, 1, "providerImageUrl", "TEXT", null, false));
            map.put("sharedById", new C7478a.a(0, 1, "sharedById", "TEXT", null, false));
            map.put("sharedByName", new C7478a.a(0, 1, "sharedByName", "TEXT", null, false));
            map.put("sharedByImageUrl", new C7478a.a(0, 1, "sharedByImageUrl", "TEXT", null, false));
            map.put("sharedByRole", new C7478a.a(0, 1, "sharedByRole", "TEXT", null, false));
            map.put("isSharedByIsFriend", new C7478a.a(0, 1, "isSharedByIsFriend", "INTEGER", null, true));
            map.put("isCanEdit", new C7478a.a(0, 1, "isCanEdit", "INTEGER", null, true));
            map.put("canEditSentence", new C7478a.a(0, 1, "canEditSentence", "INTEGER", "0", true));
            map.put("isProtected", new C7478a.a(0, 1, "isProtected", "INTEGER", "1", true));
            map.put("lessonVotes", new C7478a.a(0, 1, "lessonVotes", "INTEGER", null, true));
            map.put("audioVotes", new C7478a.a(0, 1, "audioVotes", "INTEGER", null, true));
            map.put("level", new C7478a.a(0, 1, "level", "TEXT", null, false));
            map.put("tags", new C7478a.a(0, 1, "tags", "TEXT", null, false));
            map.put("progressDownloaded", new C7478a.a(0, 1, "progressDownloaded", "INTEGER", null, true));
            map.put("progress", new C7478a.a(0, 1, "progress", "REAL", null, false));
            map.put("translationSentence", new C7478a.a(0, 1, "translationSentence", "TEXT", null, true));
            map.put("mediaImageUrl", new C7478a.a(0, 1, "mediaImageUrl", "TEXT", null, false));
            map.put("mediaTitle", new C7478a.a(0, 1, "mediaTitle", "TEXT", null, false));
            map.put("ptime", new C7478a.a(0, 1, "ptime", "TEXT", null, false));
            map.put("isPinned", new C7478a.a(0, 1, "isPinned", "INTEGER", null, false));
            map.put("difficulty", new C7478a.a(0, 1, "difficulty", "REAL", null, true));
            map.put("newWords", new C7478a.a(0, 1, "newWords", "INTEGER", null, true));
            map.put("lessonPreview", new C7478a.a(0, 1, "lessonPreview", "TEXT", null, true));
            map.put("isTaken", new C7478a.a(0, 1, "isTaken", "INTEGER", null, false));
            map.put("folders", new C7478a.a(0, 1, "folders", "TEXT", null, false));
            map.put("audioPending", new C7478a.a(0, 1, "audioPending", "INTEGER", null, false));
            map.put("userLiked_username", new C7478a.a(0, 1, "userLiked_username", "TEXT", null, false));
            map.put("userLiked_liked", new C7478a.a(0, 1, "userLiked_liked", "INTEGER", null, false));
            map.put("userCompleted_username", new C7478a.a(0, 1, "userCompleted_username", "TEXT", null, false));
            map.put("userCompleted_completed", new C7478a.a(0, 1, "userCompleted_completed", "INTEGER", null, false));
            map.put("translation_language", new C7478a.a(0, 1, "translation_language", "TEXT", null, false));
            map.put("translation_sentences", new C7478a.a(0, 1, "translation_sentences", "TEXT", null, false));
            map.put("source_type", new C7478a.a(0, 1, "source_type", "TEXT", null, false));
            map.put("source_name", new C7478a.a(0, 1, "source_name", "TEXT", null, false));
            HashSet hashSetM615k = C0141b.m615k(map, "source_url", new C7478a.a(0, 1, "source_url", "TEXT", null, false), 0);
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C7478a.d("index_Lesson_id", Arrays.asList("id"), Arrays.asList("ASC"), false));
            hashSet.add(new C7478a.d("index_Lesson_id_title_collectionTitle_imageUrl_cardsCount_uniqueWordCount_newWords_duration_isCompleted_percentCompleted", Arrays.asList("id", "title", "collectionTitle", "imageUrl", "cardsCount", "uniqueWordCount", "newWords", "duration", "isCompleted", "percentCompleted"), Arrays.asList("ASC", "ASC", "ASC", "ASC", "ASC", "ASC", "ASC", "ASC", "ASC", "ASC"), false));
            C7478a c7478a = new C7478a("Lesson", map, hashSetM615k, hashSet);
            C7478a c7478aM14861a = C7478a.m14861a(frameworkSQLiteDatabase, "Lesson");
            if (!c7478a.equals(c7478aM14861a)) {
                return new C6594n.b(C0166e.m767m("Lesson(com.lingq.entity.Lesson).\n Expected:\n", c7478a, "\n Found:\n", c7478aM14861a), false);
            }
            HashMap map2 = new HashMap(7);
            map2.put("lessonId", new C7478a.a(1, 1, "lessonId", "INTEGER", null, true));
            map2.put("tokens", new C7478a.a(0, 1, "tokens", "TEXT", null, true));
            map2.put("text", new C7478a.a(0, 1, "text", "TEXT", null, false));
            map2.put("normalizedText", new C7478a.a(0, 1, "normalizedText", "TEXT", null, false));
            map2.put("index", new C7478a.a(2, 1, "index", "INTEGER", null, true));
            map2.put("timestamp", new C7478a.a(0, 1, "timestamp", "TEXT", null, false));
            HashSet hashSetM615k2 = C0141b.m615k(map2, "startParagraph", new C7478a.a(0, 1, "startParagraph", "INTEGER", null, true), 0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C7478a.d("index_Sentence_lessonId_index", Arrays.asList("lessonId", "index"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a2 = new C7478a("Sentence", map2, hashSetM615k2, hashSet2);
            C7478a c7478aM14861a2 = C7478a.m14861a(frameworkSQLiteDatabase, "Sentence");
            if (!c7478a2.equals(c7478aM14861a2)) {
                return new C6594n.b(C0166e.m767m("Sentence(com.lingq.entity.Sentence).\n Expected:\n", c7478a2, "\n Found:\n", c7478aM14861a2), false);
            }
            HashMap map3 = new HashMap(24);
            map3.put("term", new C7478a.a(0, 1, "term", "TEXT", null, true));
            map3.put("termWithLanguage", new C7478a.a(1, 1, "termWithLanguage", "TEXT", null, true));
            map3.put("id", new C7478a.a(0, 1, "id", "INTEGER", null, true));
            map3.put("url", new C7478a.a(0, 1, "url", "TEXT", null, false));
            map3.put("fragment", new C7478a.a(0, 1, "fragment", "TEXT", null, false));
            map3.put("status", new C7478a.a(0, 1, "status", "INTEGER", null, true));
            map3.put("extendedStatus", new C7478a.a(0, 1, "extendedStatus", "INTEGER", null, false));
            map3.put("lastReviewedCorrect", new C7478a.a(0, 1, "lastReviewedCorrect", "TEXT", null, false));
            map3.put("srsDueDate", new C7478a.a(0, 1, "srsDueDate", "TEXT", null, false));
            map3.put("notes", new C7478a.a(0, 1, "notes", "TEXT", null, false));
            map3.put("audio", new C7478a.a(0, 1, "audio", "TEXT", null, false));
            map3.put("importance", new C7478a.a(0, 1, "importance", "INTEGER", null, true));
            map3.put("meanings", new C7478a.a(0, 1, "meanings", "TEXT", null, true));
            map3.put("meaningTerms", new C7478a.a(0, 1, "meaningTerms", "TEXT", null, true));
            map3.put("tags", new C7478a.a(0, 1, "tags", "TEXT", null, true));
            map3.put("gTags", new C7478a.a(0, 1, "gTags", "TEXT", null, true));
            map3.put("words", new C7478a.a(0, 1, "words", "TEXT", null, true));
            map3.put("isPhrase", new C7478a.a(0, 1, "isPhrase", "INTEGER", null, true));
            map3.put("hiragana", new C7478a.a(0, 1, "hiragana", "TEXT", null, false));
            map3.put("romaji", new C7478a.a(0, 1, "romaji", "TEXT", null, false));
            map3.put("pinyin", new C7478a.a(0, 1, "pinyin", "TEXT", null, false));
            map3.put("hant", new C7478a.a(0, 1, "hant", "TEXT", null, false));
            map3.put("hans", new C7478a.a(0, 1, "hans", "TEXT", null, false));
            HashSet hashSetM615k3 = C0141b.m615k(map3, "jyutping", new C7478a.a(0, 1, "jyutping", "TEXT", null, false), 0);
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new C7478a.d("index_Card_termWithLanguage", Arrays.asList("termWithLanguage"), Arrays.asList("ASC"), false));
            C7478a c7478a3 = new C7478a("Card", map3, hashSetM615k3, hashSet3);
            C7478a c7478aM14861a3 = C7478a.m14861a(frameworkSQLiteDatabase, "Card");
            if (!c7478a3.equals(c7478aM14861a3)) {
                return new C6594n.b(C0166e.m767m("Card(com.lingq.entity.Card).\n Expected:\n", c7478a3, "\n Found:\n", c7478aM14861a3), false);
            }
            HashMap map4 = new HashMap(15);
            map4.put("termWithLanguage", new C7478a.a(1, 1, "termWithLanguage", "TEXT", null, true));
            map4.put("term", new C7478a.a(0, 1, "term", "TEXT", null, true));
            map4.put("id", new C7478a.a(0, 1, "id", "INTEGER", null, true));
            map4.put("status", new C7478a.a(0, 1, "status", "TEXT", null, false));
            map4.put("importance", new C7478a.a(0, 1, "importance", "INTEGER", null, true));
            map4.put("isPhrase", new C7478a.a(0, 1, "isPhrase", "INTEGER", null, true));
            map4.put("meanings", new C7478a.a(0, 1, "meanings", "TEXT", null, true));
            map4.put("tags", new C7478a.a(0, 1, "tags", "TEXT", null, true));
            map4.put("gTags", new C7478a.a(0, 1, "gTags", "TEXT", null, true));
            map4.put("cardId", new C7478a.a(0, 1, "cardId", "INTEGER", null, true));
            map4.put("romaji", new C7478a.a(0, 1, "romaji", "TEXT", null, false));
            map4.put("hiragana", new C7478a.a(0, 1, "hiragana", "TEXT", null, false));
            map4.put("pinyin", new C7478a.a(0, 1, "pinyin", "TEXT", null, false));
            map4.put("hant", new C7478a.a(0, 1, "hant", "TEXT", null, false));
            C7478a c7478a4 = new C7478a("Word", map4, C0141b.m615k(map4, "hans", new C7478a.a(0, 1, "hans", "TEXT", null, false), 0), new HashSet(0));
            C7478a c7478aM14861a4 = C7478a.m14861a(frameworkSQLiteDatabase, "Word");
            if (!c7478a4.equals(c7478aM14861a4)) {
                return new C6594n.b(C0166e.m767m("Word(com.lingq.entity.Word).\n Expected:\n", c7478a4, "\n Found:\n", c7478aM14861a4), false);
            }
            HashMap map5 = new HashMap(2);
            map5.put("contentId", new C7478a.a(1, 1, "contentId", "INTEGER", null, true));
            HashSet hashSetM615k4 = C0141b.m615k(map5, "termWithLanguage", new C7478a.a(2, 1, "termWithLanguage", "TEXT", null, true), 0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new C7478a.d("index_LessonsAndCardsJoin_contentId_termWithLanguage", Arrays.asList("contentId", "termWithLanguage"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a5 = new C7478a("LessonsAndCardsJoin", map5, hashSetM615k4, hashSet4);
            C7478a c7478aM14861a5 = C7478a.m14861a(frameworkSQLiteDatabase, "LessonsAndCardsJoin");
            if (!c7478a5.equals(c7478aM14861a5)) {
                return new C6594n.b(C0166e.m767m("LessonsAndCardsJoin(com.lingq.entity.LessonsAndCardsJoin).\n Expected:\n", c7478a5, "\n Found:\n", c7478aM14861a5), false);
            }
            HashMap map6 = new HashMap(2);
            map6.put("contentId", new C7478a.a(1, 1, "contentId", "INTEGER", null, true));
            HashSet hashSetM615k5 = C0141b.m615k(map6, "termWithLanguage", new C7478a.a(2, 1, "termWithLanguage", "TEXT", null, true), 0);
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C7478a.d("index_LessonsAndWordsJoin_contentId_termWithLanguage", Arrays.asList("contentId", "termWithLanguage"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a6 = new C7478a("LessonsAndWordsJoin", map6, hashSetM615k5, hashSet5);
            C7478a c7478aM14861a6 = C7478a.m14861a(frameworkSQLiteDatabase, "LessonsAndWordsJoin");
            if (!c7478a6.equals(c7478aM14861a6)) {
                return new C6594n.b(C0166e.m767m("LessonsAndWordsJoin(com.lingq.entity.LessonsAndWordsJoin).\n Expected:\n", c7478a6, "\n Found:\n", c7478aM14861a6), false);
            }
            HashMap map7 = new HashMap(13);
            map7.put("id", new C7478a.a(1, 1, "id", "INTEGER", null, true));
            map7.put("name", new C7478a.a(0, 1, "name", "TEXT", null, true));
            map7.put("order", new C7478a.a(0, 1, "order", "INTEGER", null, true));
            map7.put("urlToTransform", new C7478a.a(0, 1, "urlToTransform", "TEXT", null, true));
            map7.put("urlDefinition", new C7478a.a(0, 1, "urlDefinition", "TEXT", null, true));
            map7.put("isPopUpWindow", new C7478a.a(0, 1, "isPopUpWindow", "INTEGER", null, true));
            map7.put("languageTo", new C7478a.a(0, 1, "languageTo", "TEXT", null, true));
            map7.put("urlVar1", new C7478a.a(0, 1, "urlVar1", "TEXT", null, true));
            map7.put("urlVar2", new C7478a.a(0, 1, "urlVar2", "TEXT", null, true));
            map7.put("urlVar3", new C7478a.a(0, 1, "urlVar3", "TEXT", null, true));
            map7.put("urlVar4", new C7478a.a(0, 1, "urlVar4", "TEXT", null, true));
            map7.put("urlVar5", new C7478a.a(0, 1, "urlVar5", "TEXT", null, true));
            C7478a c7478a7 = new C7478a("DictionaryData", map7, C0141b.m615k(map7, "overrideUrl", new C7478a.a(0, 1, "overrideUrl", "TEXT", null, true), 0), new HashSet(0));
            C7478a c7478aM14861a7 = C7478a.m14861a(frameworkSQLiteDatabase, "DictionaryData");
            if (!c7478a7.equals(c7478aM14861a7)) {
                return new C6594n.b(C0166e.m767m("DictionaryData(com.lingq.entity.DictionaryData).\n Expected:\n", c7478a7, "\n Found:\n", c7478aM14861a7), false);
            }
            HashMap map8 = new HashMap(2);
            map8.put("code", new C7478a.a(1, 1, "code", "TEXT", null, true));
            HashSet hashSetM615k6 = C0141b.m615k(map8, "title", new C7478a.a(0, 1, "title", "TEXT", null, true), 0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C7478a.d("index_DictionaryLocale_code", Arrays.asList("code"), Arrays.asList("ASC"), false));
            C7478a c7478a8 = new C7478a("DictionaryLocale", map8, hashSetM615k6, hashSet6);
            C7478a c7478aM14861a8 = C7478a.m14861a(frameworkSQLiteDatabase, "DictionaryLocale");
            if (!c7478a8.equals(c7478aM14861a8)) {
                return new C6594n.b(C0166e.m767m("DictionaryLocale(com.lingq.entity.DictionaryLocale).\n Expected:\n", c7478a8, "\n Found:\n", c7478aM14861a8), false);
            }
            HashMap map9 = new HashMap(27);
            map9.put("pk", new C7478a.a(1, 1, "pk", "INTEGER", null, true));
            map9.put("code", new C7478a.a(0, 1, "code", "TEXT", null, false));
            map9.put("title", new C7478a.a(0, 1, "title", "TEXT", null, false));
            map9.put("challengeType", new C7478a.a(0, 1, "challengeType", "TEXT", null, false));
            map9.put("description", new C7478a.a(0, 1, "description", "TEXT", null, false));
            map9.put("prize", new C7478a.a(0, 1, "prize", "TEXT", null, false));
            map9.put("startDate", new C7478a.a(0, 1, "startDate", "TEXT", null, false));
            map9.put("endDate", new C7478a.a(0, 1, "endDate", "TEXT", null, false));
            map9.put("language", new C7478a.a(0, 1, "language", "TEXT", null, false));
            map9.put("timeLeft", new C7478a.a(0, 1, "timeLeft", "TEXT", null, false));
            map9.put("isPermanent", new C7478a.a(0, 1, "isPermanent", "INTEGER", null, true));
            map9.put("participantsCount", new C7478a.a(0, 1, "participantsCount", "INTEGER", null, true));
            map9.put("isDisabled", new C7478a.a(0, 1, "isDisabled", "INTEGER", null, true));
            map9.put("isActive", new C7478a.a(0, 1, "isActive", "INTEGER", null, true));
            map9.put("badge", new C7478a.a(0, 1, "badge", "TEXT", null, false));
            map9.put("badgeUrl", new C7478a.a(0, 1, "badgeUrl", "TEXT", null, false));
            map9.put("duration", new C7478a.a(0, 1, "duration", "INTEGER", null, true));
            map9.put("contextParticipants", new C7478a.a(0, 1, "contextParticipants", "INTEGER", null, true));
            map9.put("screenTitle", new C7478a.a(0, 1, "screenTitle", "TEXT", null, false));
            map9.put("socialSettings", new C7478a.a(0, 1, "socialSettings", "TEXT", null, false));
            map9.put("isCompleted", new C7478a.a(0, 1, "isCompleted", "INTEGER", null, true));
            map9.put("isPast", new C7478a.a(0, 1, "isPast", "INTEGER", null, true));
            map9.put("isJoined", new C7478a.a(0, 1, "isJoined", "INTEGER", null, true));
            map9.put("rank", new C7478a.a(0, 1, "rank", "INTEGER", null, true));
            map9.put("order", new C7478a.a(0, 1, "order", "INTEGER", null, true));
            map9.put("knownWords", new C7478a.a(0, 1, "knownWords", "INTEGER", "0", true));
            HashSet hashSetM615k7 = C0141b.m615k(map9, "challengeLanguage", new C7478a.a(0, 1, "challengeLanguage", "TEXT", "''", false), 0);
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C7478a.d("index_Challenge_pk", Arrays.asList("pk"), Arrays.asList("ASC"), false));
            C7478a c7478a9 = new C7478a("Challenge", map9, hashSetM615k7, hashSet7);
            C7478a c7478aM14861a9 = C7478a.m14861a(frameworkSQLiteDatabase, "Challenge");
            if (!c7478a9.equals(c7478aM14861a9)) {
                return new C6594n.b(C0166e.m767m("Challenge(com.lingq.entity.Challenge).\n Expected:\n", c7478a9, "\n Found:\n", c7478aM14861a9), false);
            }
            HashMap map10 = new HashMap(8);
            map10.put("languageAndSlug", new C7478a.a(1, 1, "languageAndSlug", "TEXT", null, true));
            map10.put("language", new C7478a.a(0, 1, "language", "TEXT", null, false));
            map10.put("slug", new C7478a.a(0, 1, "slug", "TEXT", null, false));
            map10.put("name", new C7478a.a(0, 1, "name", "TEXT", null, false));
            map10.put("goal", new C7478a.a(0, 1, "goal", "INTEGER", null, true));
            map10.put("stat", new C7478a.a(0, 1, "stat", "TEXT", null, false));
            map10.put("metAt", new C7478a.a(0, 1, "metAt", "TEXT", null, false));
            C7478a c7478a10 = new C7478a("Badge", map10, C0141b.m615k(map10, "gainedAt", new C7478a.a(0, 1, "gainedAt", "TEXT", null, false), 0), new HashSet(0));
            C7478a c7478aM14861a10 = C7478a.m14861a(frameworkSQLiteDatabase, "Badge");
            if (!c7478a10.equals(c7478aM14861a10)) {
                return new C6594n.b(C0166e.m767m("Badge(com.lingq.entity.Badge).\n Expected:\n", c7478a10, "\n Found:\n", c7478aM14861a10), false);
            }
            HashMap map11 = new HashMap(7);
            map11.put("languageAndSlug", new C7478a.a(1, 1, "languageAndSlug", "TEXT", null, true));
            map11.put("language", new C7478a.a(0, 1, "language", "TEXT", null, false));
            map11.put("slug", new C7478a.a(0, 1, "slug", "TEXT", null, false));
            map11.put("name", new C7478a.a(0, 1, "name", "TEXT", null, false));
            map11.put("goal", new C7478a.a(0, 1, "goal", "INTEGER", null, true));
            map11.put("stat", new C7478a.a(0, 1, "stat", "TEXT", null, false));
            C7478a c7478a11 = new C7478a("Milestone", map11, C0141b.m615k(map11, "date", new C7478a.a(0, 1, "date", "TEXT", null, false), 0), new HashSet(0));
            C7478a c7478aM14861a11 = C7478a.m14861a(frameworkSQLiteDatabase, "Milestone");
            if (!c7478a11.equals(c7478aM14861a11)) {
                return new C6594n.b(C0166e.m767m("Milestone(com.lingq.entity.Milestone).\n Expected:\n", c7478a11, "\n Found:\n", c7478aM14861a11), false);
            }
            HashMap map12 = new HashMap(44);
            map12.put("id", new C7478a.a(1, 1, "id", "INTEGER", null, true));
            map12.put("type", new C7478a.a(2, 1, "type", "TEXT", null, true));
            map12.put("title", new C7478a.a(0, 1, "title", "TEXT", null, false));
            map12.put("description", new C7478a.a(0, 1, "description", "TEXT", null, false));
            map12.put("pos", new C7478a.a(0, 1, "pos", "INTEGER", null, true));
            map12.put("url", new C7478a.a(0, 1, "url", "TEXT", null, false));
            map12.put("imageUrl", new C7478a.a(0, 1, "imageUrl", "TEXT", null, false));
            map12.put("providerId", new C7478a.a(0, 1, "providerId", "INTEGER", null, false));
            map12.put("providerName", new C7478a.a(0, 1, "providerName", "TEXT", null, false));
            map12.put("providerDescription", new C7478a.a(0, 1, "providerDescription", "TEXT", null, false));
            map12.put("originalImageUrl", new C7478a.a(0, 1, "originalImageUrl", "TEXT", null, false));
            map12.put("providerImageUrl", new C7478a.a(0, 1, "providerImageUrl", "TEXT", null, false));
            map12.put("sharedById", new C7478a.a(0, 1, "sharedById", "TEXT", null, false));
            map12.put("sharedByName", new C7478a.a(0, 1, "sharedByName", "TEXT", null, false));
            map12.put("sharedByImageUrl", new C7478a.a(0, 1, "sharedByImageUrl", "TEXT", null, false));
            map12.put("sharedByRole", new C7478a.a(0, 1, "sharedByRole", "TEXT", null, false));
            map12.put("level", new C7478a.a(0, 1, "level", "TEXT", null, false));
            map12.put("newWordsCount", new C7478a.a(0, 1, "newWordsCount", "INTEGER", null, true));
            map12.put("lessonsCount", new C7478a.a(0, 1, "lessonsCount", "INTEGER", null, true));
            map12.put("owner", new C7478a.a(0, 1, "owner", "TEXT", null, false));
            map12.put("price", new C7478a.a(0, 1, "price", "INTEGER", null, true));
            map12.put("cardsCount", new C7478a.a(0, 1, "cardsCount", "INTEGER", null, true));
            map12.put("rosesCount", new C7478a.a(0, 1, "rosesCount", "INTEGER", null, true));
            map12.put("duration", new C7478a.a(0, 1, "duration", "INTEGER", null, false));
            map12.put("collectionId", new C7478a.a(0, 1, "collectionId", "INTEGER", null, false));
            map12.put("collectionTitle", new C7478a.a(0, 1, "collectionTitle", "TEXT", null, false));
            map12.put("difficulty", new C7478a.a(0, 1, "difficulty", "REAL", null, true));
            map12.put("isAvailable", new C7478a.a(0, 1, "isAvailable", "INTEGER", null, true));
            map12.put("tags", new C7478a.a(0, 1, "tags", "TEXT", null, false));
            map12.put("status", new C7478a.a(0, 1, "status", "TEXT", null, false));
            map12.put("folders", new C7478a.a(0, 1, "folders", "TEXT", null, false));
            map12.put("progress", new C7478a.a(0, 1, "progress", "REAL", null, false));
            map12.put("isTaken", new C7478a.a(0, 1, "isTaken", "INTEGER", null, false));
            map12.put("lessonPreview", new C7478a.a(0, 1, "lessonPreview", "TEXT", null, true));
            map12.put("accent", new C7478a.a(0, 1, "accent", "TEXT", null, false));
            map12.put("audioUrl", new C7478a.a(0, 1, "audioUrl", "TEXT", "''", false));
            map12.put("listenTimes", new C7478a.a(0, 1, "listenTimes", "REAL", "0.0", true));
            map12.put("readTimes", new C7478a.a(0, 1, "readTimes", "REAL", "0.0", true));
            map12.put("isCompleted", new C7478a.a(0, 1, "isCompleted", "INTEGER", "0", true));
            map12.put("isFavorite", new C7478a.a(0, 1, "isFavorite", "INTEGER", "0", true));
            map12.put("videoUrl", new C7478a.a(0, 1, "videoUrl", "TEXT", "''", false));
            map12.put("source_type", new C7478a.a(0, 1, "source_type", "TEXT", null, false));
            map12.put("source_name", new C7478a.a(0, 1, "source_name", "TEXT", null, false));
            HashSet hashSetM615k8 = C0141b.m615k(map12, "source_url", new C7478a.a(0, 1, "source_url", "TEXT", null, false), 0);
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C7478a.d("index_LibraryData_id_type", Arrays.asList("id", "type"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a12 = new C7478a("LibraryData", map12, hashSetM615k8, hashSet8);
            C7478a c7478aM14861a12 = C7478a.m14861a(frameworkSQLiteDatabase, "LibraryData");
            if (!c7478a12.equals(c7478aM14861a12)) {
                return new C6594n.b(C0166e.m767m("LibraryData(com.lingq.entity.LibraryData).\n Expected:\n", c7478a12, "\n Found:\n", c7478aM14861a12), false);
            }
            HashMap map13 = new HashMap(19);
            map13.put("code", new C7478a.a(1, 1, "code", "TEXT", null, true));
            map13.put("pk", new C7478a.a(0, 1, "pk", "INTEGER", null, true));
            map13.put("url", new C7478a.a(0, 1, "url", "TEXT", null, false));
            map13.put("repetitionLingQs", new C7478a.a(0, 1, "repetitionLingQs", "INTEGER", null, true));
            map13.put("lotdDates", new C7478a.a(0, 1, "lotdDates", "TEXT", null, true));
            map13.put("isUseFeed", new C7478a.a(0, 1, "isUseFeed", "INTEGER", null, false));
            map13.put("intense", new C7478a.a(0, 1, "intense", "TEXT", null, false));
            map13.put("streakDays", new C7478a.a(0, 1, "streakDays", "INTEGER", null, true));
            map13.put("tags", new C7478a.a(0, 1, "tags", "TEXT", null, true));
            map13.put("supported", new C7478a.a(0, 1, "supported", "INTEGER", null, false));
            map13.put("title", new C7478a.a(0, 1, "title", "TEXT", null, false));
            map13.put("lastUsed", new C7478a.a(0, 1, "lastUsed", "TEXT", null, false));
            map13.put("knownWords", new C7478a.a(0, 1, "knownWords", "INTEGER", null, false));
            map13.put("grammarResourceSlug", new C7478a.a(0, 1, "grammarResourceSlug", "TEXT", null, false));
            map13.put("feedLevels", new C7478a.a(0, 1, "feedLevels", "TEXT", null, false));
            map13.put("email_lotd", new C7478a.a(0, 1, "email_lotd", "TEXT", null, false));
            map13.put("email_weekly", new C7478a.a(0, 1, "email_weekly", "TEXT", null, false));
            map13.put("site_lotd", new C7478a.a(0, 1, "site_lotd", "TEXT", null, false));
            HashSet hashSetM615k9 = C0141b.m615k(map13, "site_weekly", new C7478a.a(0, 1, "site_weekly", "TEXT", null, false), 0);
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C7478a.d("index_LanguageContext_code", Arrays.asList("code"), Arrays.asList("ASC"), false));
            C7478a c7478a13 = new C7478a("LanguageContext", map13, hashSetM615k9, hashSet9);
            C7478a c7478aM14861a13 = C7478a.m14861a(frameworkSQLiteDatabase, "LanguageContext");
            if (!c7478a13.equals(c7478aM14861a13)) {
                return new C6594n.b(C0166e.m767m("LanguageContext(com.lingq.entity.LanguageContext).\n Expected:\n", c7478a13, "\n Found:\n", c7478aM14861a13), false);
            }
            HashMap map14 = new HashMap(7);
            map14.put("code", new C7478a.a(1, 1, "code", "TEXT", null, true));
            map14.put("supported", new C7478a.a(0, 1, "supported", "INTEGER", null, false));
            map14.put("title", new C7478a.a(0, 1, "title", "TEXT", null, false));
            map14.put("lastUsed", new C7478a.a(0, 1, "lastUsed", "TEXT", null, false));
            map14.put("knownWords", new C7478a.a(0, 1, "knownWords", "INTEGER", null, false));
            map14.put("dictionaryLocaleActive", new C7478a.a(0, 1, "dictionaryLocaleActive", "TEXT", null, false));
            C7478a c7478a14 = new C7478a("Language", map14, C0141b.m615k(map14, "grammarResourceSlug", new C7478a.a(0, 1, "grammarResourceSlug", "TEXT", null, false), 0), new HashSet(0));
            C7478a c7478aM14861a14 = C7478a.m14861a(frameworkSQLiteDatabase, "Language");
            if (!c7478a14.equals(c7478aM14861a14)) {
                return new C6594n.b(C0166e.m767m("Language(com.lingq.entity.Language).\n Expected:\n", c7478a14, "\n Found:\n", c7478aM14861a14), false);
            }
            HashMap map15 = new HashMap(2);
            map15.put("code", new C7478a.a(1, 1, "code", "TEXT", null, true));
            C7478a c7478a15 = new C7478a("LanguageActiveDictionaryJoin", map15, C0141b.m615k(map15, "id", new C7478a.a(2, 1, "id", "INTEGER", null, true), 0), new HashSet(0));
            C7478a c7478aM14861a15 = C7478a.m14861a(frameworkSQLiteDatabase, "LanguageActiveDictionaryJoin");
            if (!c7478a15.equals(c7478aM14861a15)) {
                return new C6594n.b(C0166e.m767m("LanguageActiveDictionaryJoin(com.lingq.entity.LanguageActiveDictionaryJoin).\n Expected:\n", c7478a15, "\n Found:\n", c7478aM14861a15), false);
            }
            HashMap map16 = new HashMap(2);
            map16.put("code", new C7478a.a(1, 1, "code", "TEXT", null, true));
            C7478a c7478a16 = new C7478a("LanguageAvailableDictionaryJoin", map16, C0141b.m615k(map16, "id", new C7478a.a(2, 1, "id", "INTEGER", null, true), 0), new HashSet(0));
            C7478a c7478aM14861a16 = C7478a.m14861a(frameworkSQLiteDatabase, "LanguageAvailableDictionaryJoin");
            if (!c7478a16.equals(c7478aM14861a16)) {
                return new C6594n.b(C0166e.m767m("LanguageAvailableDictionaryJoin(com.lingq.entity.LanguageAvailableDictionaryJoin).\n Expected:\n", c7478a16, "\n Found:\n", c7478aM14861a16), false);
            }
            HashMap map17 = new HashMap(2);
            map17.put("language", new C7478a.a(1, 1, "language", "TEXT", null, true));
            HashSet hashSetM615k10 = C0141b.m615k(map17, "code", new C7478a.a(2, 1, "code", "TEXT", null, true), 0);
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C7478a.d("index_LanguageDictionaryLocaleJoin_language_code", Arrays.asList("language", "code"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a17 = new C7478a("LanguageDictionaryLocaleJoin", map17, hashSetM615k10, hashSet10);
            C7478a c7478aM14861a17 = C7478a.m14861a(frameworkSQLiteDatabase, "LanguageDictionaryLocaleJoin");
            if (!c7478a17.equals(c7478aM14861a17)) {
                return new C6594n.b(C0166e.m767m("LanguageDictionaryLocaleJoin(com.lingq.entity.LanguageDictionaryLocaleJoin).\n Expected:\n", c7478a17, "\n Found:\n", c7478aM14861a17), false);
            }
            HashMap map18 = new HashMap(5);
            map18.put("codeWithLanguage", new C7478a.a(1, 1, "codeWithLanguage", "TEXT", null, true));
            map18.put("id", new C7478a.a(2, 1, "id", "INTEGER", null, true));
            map18.put("type", new C7478a.a(3, 1, "type", "TEXT", null, true));
            map18.put("order", new C7478a.a(0, 1, "order", "INTEGER", null, true));
            HashSet hashSetM615k11 = C0141b.m615k(map18, "ofQuery", new C7478a.a(0, 1, "ofQuery", "TEXT", null, true), 0);
            HashSet hashSet11 = new HashSet(1);
            hashSet11.add(new C7478a.d("index_LibraryShelfAndContentJoin_codeWithLanguage_id_type", Arrays.asList("codeWithLanguage", "id", "type"), Arrays.asList("ASC", "ASC", "ASC"), false));
            C7478a c7478a18 = new C7478a("LibraryShelfAndContentJoin", map18, hashSetM615k11, hashSet11);
            C7478a c7478aM14861a18 = C7478a.m14861a(frameworkSQLiteDatabase, "LibraryShelfAndContentJoin");
            if (!c7478a18.equals(c7478aM14861a18)) {
                return new C6594n.b(C0166e.m767m("LibraryShelfAndContentJoin(com.lingq.entity.LibraryShelfAndContentJoin).\n Expected:\n", c7478a18, "\n Found:\n", c7478aM14861a18), false);
            }
            HashMap map19 = new HashMap(9);
            map19.put("codeWithLanguage", new C7478a.a(1, 1, "codeWithLanguage", "TEXT", null, true));
            map19.put("language", new C7478a.a(0, 1, "language", "TEXT", null, true));
            map19.put("pinned", new C7478a.a(0, 1, "pinned", "INTEGER", null, false));
            map19.put("tabs", new C7478a.a(0, 1, "tabs", "TEXT", null, true));
            map19.put("code", new C7478a.a(0, 1, "code", "TEXT", null, true));
            map19.put("id", new C7478a.a(0, 1, "id", "INTEGER", null, true));
            map19.put("title", new C7478a.a(0, 1, "title", "TEXT", null, true));
            map19.put("order", new C7478a.a(0, 1, "order", "INTEGER", null, true));
            HashSet hashSetM615k12 = C0141b.m615k(map19, "levels", new C7478a.a(0, 1, "levels", "TEXT", "''", true), 0);
            HashSet hashSet12 = new HashSet(1);
            hashSet12.add(new C7478a.d("index_Shelf_codeWithLanguage_title", Arrays.asList("codeWithLanguage", "title"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a19 = new C7478a("Shelf", map19, hashSetM615k12, hashSet12);
            C7478a c7478aM14861a19 = C7478a.m14861a(frameworkSQLiteDatabase, "Shelf");
            if (!c7478a19.equals(c7478aM14861a19)) {
                return new C6594n.b(C0166e.m767m("Shelf(com.lingq.entity.Shelf).\n Expected:\n", c7478a19, "\n Found:\n", c7478aM14861a19), false);
            }
            HashMap map20 = new HashMap(7);
            map20.put("nameWithLanguage", new C7478a.a(1, 1, "nameWithLanguage", "TEXT", null, true));
            map20.put("language", new C7478a.a(0, 1, "language", "TEXT", null, true));
            map20.put("name", new C7478a.a(0, 1, "name", "TEXT", null, true));
            map20.put("pk", new C7478a.a(0, 1, "pk", "INTEGER", null, true));
            map20.put("isDefault", new C7478a.a(0, 1, "isDefault", "INTEGER", null, true));
            map20.put("isFeatured", new C7478a.a(0, 1, "isFeatured", "INTEGER", null, true));
            HashSet hashSetM615k13 = C0141b.m615k(map20, "order", new C7478a.a(0, 1, "order", "INTEGER", null, true), 0);
            HashSet hashSet13 = new HashSet(2);
            hashSet13.add(new C7478a.d("index_Playlist_nameWithLanguage", Arrays.asList("nameWithLanguage"), Arrays.asList("ASC"), false));
            hashSet13.add(new C7478a.d("index_Playlist_name_language", Arrays.asList("name", "language"), Arrays.asList("ASC", "ASC"), true));
            C7478a c7478a20 = new C7478a("Playlist", map20, hashSetM615k13, hashSet13);
            C7478a c7478aM14861a20 = C7478a.m14861a(frameworkSQLiteDatabase, "Playlist");
            if (!c7478a20.equals(c7478aM14861a20)) {
                return new C6594n.b(C0166e.m767m("Playlist(com.lingq.entity.Playlist).\n Expected:\n", c7478a20, "\n Found:\n", c7478aM14861a20), false);
            }
            HashMap map21 = new HashMap(5);
            map21.put("nameWithLanguage", new C7478a.a(1, 1, "nameWithLanguage", "TEXT", null, true));
            map21.put("language", new C7478a.a(0, 1, "language", "TEXT", null, true));
            map21.put("contentId", new C7478a.a(2, 1, "contentId", "INTEGER", null, true));
            map21.put("order", new C7478a.a(0, 1, "order", "INTEGER", null, false));
            HashSet hashSetM615k14 = C0141b.m615k(map21, "isCourse", new C7478a.a(3, 1, "isCourse", "INTEGER", null, true), 0);
            HashSet hashSet14 = new HashSet(1);
            hashSet14.add(new C7478a.d("index_PlaylistAndLessonsJoin_nameWithLanguage_contentId_isCourse", Arrays.asList("nameWithLanguage", "contentId", "isCourse"), Arrays.asList("ASC", "ASC", "ASC"), false));
            C7478a c7478a21 = new C7478a("PlaylistAndLessonsJoin", map21, hashSetM615k14, hashSet14);
            C7478a c7478aM14861a21 = C7478a.m14861a(frameworkSQLiteDatabase, "PlaylistAndLessonsJoin");
            if (!c7478a21.equals(c7478aM14861a21)) {
                return new C6594n.b(C0166e.m767m("PlaylistAndLessonsJoin(com.lingq.entity.PlaylistAndLessonsJoin).\n Expected:\n", c7478a21, "\n Found:\n", c7478aM14861a21), false);
            }
            HashMap map22 = new HashMap(2);
            map22.put("termWithLanguageAndTarget", new C7478a.a(1, 1, "termWithLanguageAndTarget", "TEXT", null, true));
            HashSet hashSetM615k15 = C0141b.m615k(map22, "translations", new C7478a.a(0, 1, "translations", "TEXT", null, true), 0);
            HashSet hashSet15 = new HashSet(1);
            hashSet15.add(new C7478a.d("index_Translations_termWithLanguageAndTarget", Arrays.asList("termWithLanguageAndTarget"), Arrays.asList("ASC"), false));
            C7478a c7478a22 = new C7478a("Translations", map22, hashSetM615k15, hashSet15);
            C7478a c7478aM14861a22 = C7478a.m14861a(frameworkSQLiteDatabase, "Translations");
            if (!c7478a22.equals(c7478aM14861a22)) {
                return new C6594n.b(C0166e.m767m("Translations(com.lingq.entity.Translations).\n Expected:\n", c7478a22, "\n Found:\n", c7478aM14861a22), false);
            }
            HashMap map23 = new HashMap(5);
            map23.put("name", new C7478a.a(1, 1, "name", "TEXT", null, true));
            map23.put("title", new C7478a.a(0, 1, "title", "TEXT", null, true));
            map23.put("voicesByApp", new C7478a.a(0, 1, "voicesByApp", "TEXT", null, true));
            map23.put("alternative", new C7478a.a(0, 1, "alternative", "INTEGER", null, false));
            HashSet hashSetM615k16 = C0141b.m615k(map23, "priority", new C7478a.a(0, 1, "priority", "TEXT", null, true), 0);
            HashSet hashSet16 = new HashSet(1);
            hashSet16.add(new C7478a.d("index_TtsVoice_name", Arrays.asList("name"), Arrays.asList("ASC"), false));
            C7478a c7478a23 = new C7478a("TtsVoice", map23, hashSetM615k16, hashSet16);
            C7478a c7478aM14861a23 = C7478a.m14861a(frameworkSQLiteDatabase, "TtsVoice");
            if (!c7478a23.equals(c7478aM14861a23)) {
                return new C6594n.b(C0166e.m767m("TtsVoice(com.lingq.entity.TtsVoice).\n Expected:\n", c7478a23, "\n Found:\n", c7478aM14861a23), false);
            }
            HashMap map24 = new HashMap(3);
            map24.put("code", new C7478a.a(1, 1, "code", "TEXT", null, true));
            map24.put("name", new C7478a.a(2, 1, "name", "TEXT", null, true));
            HashSet hashSetM615k17 = C0141b.m615k(map24, "voiceOrder", new C7478a.a(0, 1, "voiceOrder", "INTEGER", null, true), 0);
            HashSet hashSet17 = new HashSet(1);
            hashSet17.add(new C7478a.d("index_LanguageAndTtsVoicesJoin_code_name", Arrays.asList("code", "name"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a24 = new C7478a("LanguageAndTtsVoicesJoin", map24, hashSetM615k17, hashSet17);
            C7478a c7478aM14861a24 = C7478a.m14861a(frameworkSQLiteDatabase, "LanguageAndTtsVoicesJoin");
            if (!c7478a24.equals(c7478aM14861a24)) {
                return new C6594n.b(C0166e.m767m("LanguageAndTtsVoicesJoin(com.lingq.entity.LanguageAndTtsVoicesJoin).\n Expected:\n", c7478a24, "\n Found:\n", c7478aM14861a24), false);
            }
            HashMap map25 = new HashMap(4);
            map25.put("idWithLanguageAndData", new C7478a.a(1, 1, "idWithLanguageAndData", "TEXT", null, true));
            map25.put("utteranceId", new C7478a.a(0, 1, "utteranceId", "INTEGER", null, true));
            map25.put("audio", new C7478a.a(0, 1, "audio", "TEXT", null, true));
            HashSet hashSetM615k18 = C0141b.m615k(map25, "text", new C7478a.a(0, 1, "text", "TEXT", null, true), 0);
            HashSet hashSet18 = new HashSet(1);
            hashSet18.add(new C7478a.d("index_TtsUtterance_idWithLanguageAndData", Arrays.asList("idWithLanguageAndData"), Arrays.asList("ASC"), false));
            C7478a c7478a25 = new C7478a("TtsUtterance", map25, hashSetM615k18, hashSet18);
            C7478a c7478aM14861a25 = C7478a.m14861a(frameworkSQLiteDatabase, "TtsUtterance");
            if (!c7478a25.equals(c7478aM14861a25)) {
                return new C6594n.b(C0166e.m767m("TtsUtterance(com.lingq.entity.TtsUtterance).\n Expected:\n", c7478a25, "\n Found:\n", c7478aM14861a25), false);
            }
            HashMap map26 = new HashMap(6);
            map26.put("index", new C7478a.a(1, 1, "index", "INTEGER", null, true));
            map26.put("lessonId", new C7478a.a(2, 1, "lessonId", "INTEGER", null, true));
            map26.put("audio", new C7478a.a(0, 1, "audio", "REAL", null, false));
            map26.put("audioEnd", new C7478a.a(0, 1, "audioEnd", "REAL", null, false));
            map26.put("text", new C7478a.a(0, 1, "text", "TEXT", null, true));
            HashSet hashSetM615k19 = C0141b.m615k(map26, "translations", new C7478a.a(0, 1, "translations", "TEXT", null, true), 0);
            HashSet hashSet19 = new HashSet(1);
            hashSet19.add(new C7478a.d("index_TranslationSentence_index_lessonId", Arrays.asList("index", "lessonId"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a26 = new C7478a("TranslationSentence", map26, hashSetM615k19, hashSet19);
            C7478a c7478aM14861a26 = C7478a.m14861a(frameworkSQLiteDatabase, "TranslationSentence");
            if (!c7478a26.equals(c7478aM14861a26)) {
                return new C6594n.b(C0166e.m767m("TranslationSentence(com.lingq.entity.TranslationSentence).\n Expected:\n", c7478a26, "\n Found:\n", c7478aM14861a26), false);
            }
            HashMap map27 = new HashMap(20);
            map27.put("interval", new C7478a.a(2, 1, "interval", "TEXT", null, true));
            map27.put("languageCode", new C7478a.a(1, 1, "languageCode", "TEXT", null, true));
            map27.put("writtenWordsGoal", new C7478a.a(0, 1, "writtenWordsGoal", "INTEGER", null, true));
            map27.put("speakingTimeGoal", new C7478a.a(0, 1, "speakingTimeGoal", "REAL", null, true));
            map27.put("totalWordsKnown", new C7478a.a(0, 1, "totalWordsKnown", "INTEGER", null, true));
            map27.put("readWords", new C7478a.a(0, 1, "readWords", "REAL", null, true));
            map27.put("totalCards", new C7478a.a(0, 1, "totalCards", "INTEGER", null, true));
            map27.put("activityIndex", new C7478a.a(0, 1, "activityIndex", "INTEGER", null, true));
            map27.put("knownWordsGoal", new C7478a.a(0, 1, "knownWordsGoal", "INTEGER", null, true));
            map27.put("listeningTimeGoal", new C7478a.a(0, 1, "listeningTimeGoal", "REAL", null, true));
            map27.put("speakingTime", new C7478a.a(0, 1, "speakingTime", "REAL", null, true));
            map27.put("cardsCreatedGoal", new C7478a.a(0, 1, "cardsCreatedGoal", "INTEGER", null, true));
            map27.put("knownWords", new C7478a.a(0, 1, "knownWords", "INTEGER", null, true));
            map27.put("intervals", new C7478a.a(0, 1, "intervals", "TEXT", null, false));
            map27.put("cardsCreated", new C7478a.a(0, 1, "cardsCreated", "INTEGER", null, true));
            map27.put("readWordsGoal", new C7478a.a(0, 1, "readWordsGoal", "INTEGER", null, true));
            map27.put("listeningTime", new C7478a.a(0, 1, "listeningTime", "REAL", null, true));
            map27.put("cardsLearned", new C7478a.a(0, 1, "cardsLearned", "INTEGER", null, true));
            map27.put("writtenWords", new C7478a.a(0, 1, "writtenWords", "INTEGER", null, true));
            C7478a c7478a27 = new C7478a("LanguageProgress", map27, C0141b.m615k(map27, "cardsLearnedGoal", new C7478a.a(0, 1, "cardsLearnedGoal", "INTEGER", null, true), 0), new HashSet(0));
            C7478a c7478aM14861a27 = C7478a.m14861a(frameworkSQLiteDatabase, "LanguageProgress");
            if (!c7478a27.equals(c7478aM14861a27)) {
                return new C6594n.b(C0166e.m767m("LanguageProgress(com.lingq.entity.LanguageProgress).\n Expected:\n", c7478a27, "\n Found:\n", c7478aM14861a27), false);
            }
            HashMap map28 = new HashMap(3);
            map28.put("pagingKey", new C7478a.a(1, 1, "pagingKey", "TEXT", null, true));
            map28.put("prevKey", new C7478a.a(0, 1, "prevKey", "INTEGER", null, false));
            C7478a c7478a28 = new C7478a("PagingKeys", map28, C0141b.m615k(map28, "nextKey", new C7478a.a(0, 1, "nextKey", "INTEGER", null, false), 0), new HashSet(0));
            C7478a c7478aM14861a28 = C7478a.m14861a(frameworkSQLiteDatabase, "PagingKeys");
            if (!c7478a28.equals(c7478aM14861a28)) {
                return new C6594n.b(C0166e.m767m("PagingKeys(com.lingq.entity.PagingKeys).\n Expected:\n", c7478a28, "\n Found:\n", c7478aM14861a28), false);
            }
            HashMap map29 = new HashMap(7);
            map29.put("metric", new C7478a.a(2, 1, "metric", "TEXT", null, true));
            map29.put("languageCode", new C7478a.a(1, 1, "languageCode", "TEXT", null, true));
            map29.put("period", new C7478a.a(4, 1, "period", "TEXT", "'last_7d'", true));
            map29.put("name", new C7478a.a(3, 1, "name", "TEXT", null, true));
            map29.put("daily", new C7478a.a(0, 1, "daily", "REAL", null, true));
            map29.put("cumulative", new C7478a.a(0, 1, "cumulative", "REAL", null, true));
            C7478a c7478a29 = new C7478a("LanguageProgressChartEntry", map29, C0141b.m615k(map29, "position", new C7478a.a(0, 1, "position", "INTEGER", "0", true), 0), new HashSet(0));
            C7478a c7478aM14861a29 = C7478a.m14861a(frameworkSQLiteDatabase, "LanguageProgressChartEntry");
            if (!c7478a29.equals(c7478aM14861a29)) {
                return new C6594n.b(C0166e.m767m("LanguageProgressChartEntry(com.lingq.entity.LanguageProgressChartEntry).\n Expected:\n", c7478a29, "\n Found:\n", c7478aM14861a29), false);
            }
            HashMap map30 = new HashMap(11);
            map30.put("code", new C7478a.a(1, 1, "code", "TEXT", null, true));
            map30.put("language", new C7478a.a(0, 1, "language", "TEXT", null, false));
            map30.put("activityApple", new C7478a.a(0, 1, "activityApple", "TEXT", null, false));
            map30.put("notificationsCount", new C7478a.a(0, 1, "notificationsCount", "INTEGER", null, true));
            map30.put("dailyGoal", new C7478a.a(0, 1, "dailyGoal", "INTEGER", null, true));
            map30.put("streakDays", new C7478a.a(0, 1, "streakDays", "INTEGER", null, true));
            map30.put("coins", new C7478a.a(0, 1, "coins", "INTEGER", null, true));
            map30.put("knownWords", new C7478a.a(0, 1, "knownWords", "INTEGER", null, true));
            map30.put("isAvatarUpgraded", new C7478a.a(0, 1, "isAvatarUpgraded", "INTEGER", null, true));
            map30.put("dailyScores", new C7478a.a(0, 1, "dailyScores", "TEXT", null, false));
            C7478a c7478a30 = new C7478a("StudyStats", map30, C0141b.m615k(map30, "activityLevel", new C7478a.a(0, 1, "activityLevel", "INTEGER", "0", true), 0), new HashSet(0));
            C7478a c7478aM14861a30 = C7478a.m14861a(frameworkSQLiteDatabase, "StudyStats");
            if (!c7478a30.equals(c7478aM14861a30)) {
                return new C6594n.b(C0166e.m767m("StudyStats(com.lingq.entity.StudyStats).\n Expected:\n", c7478a30, "\n Found:\n", c7478aM14861a30), false);
            }
            HashMap map31 = new HashMap(5);
            map31.put("contentId", new C7478a.a(1, 1, "contentId", "INTEGER", null, true));
            map31.put("wordIndex", new C7478a.a(0, 1, "wordIndex", "INTEGER", null, false));
            map31.put("client", new C7478a.a(0, 1, "client", "TEXT", null, false));
            map31.put("timestamp", new C7478a.a(0, 1, "timestamp", "TEXT", null, false));
            HashSet hashSetM615k20 = C0141b.m615k(map31, "languageTimestamp", new C7478a.a(0, 1, "languageTimestamp", "TEXT", null, false), 0);
            HashSet hashSet20 = new HashSet(1);
            hashSet20.add(new C7478a.d("index_LessonBookmark_contentId", Arrays.asList("contentId"), Arrays.asList("ASC"), false));
            C7478a c7478a31 = new C7478a("LessonBookmark", map31, hashSetM615k20, hashSet20);
            C7478a c7478aM14861a31 = C7478a.m14861a(frameworkSQLiteDatabase, "LessonBookmark");
            if (!c7478a31.equals(c7478aM14861a31)) {
                return new C6594n.b(C0166e.m767m("LessonBookmark(com.lingq.entity.LessonBookmark).\n Expected:\n", c7478a31, "\n Found:\n", c7478aM14861a31), false);
            }
            HashMap map32 = new HashMap(14);
            map32.put("id", new C7478a.a(1, 1, "id", "INTEGER", null, true));
            map32.put("type", new C7478a.a(2, 1, "type", "TEXT", null, true));
            map32.put("roseGiven", new C7478a.a(0, 1, "roseGiven", "INTEGER", null, true));
            map32.put("progress", new C7478a.a(0, 1, "progress", "REAL", null, false));
            map32.put("listenTimes", new C7478a.a(0, 1, "listenTimes", "REAL", null, false));
            map32.put("readTimes", new C7478a.a(0, 1, "readTimes", "REAL", null, false));
            map32.put("isTaken", new C7478a.a(0, 1, "isTaken", "INTEGER", null, true));
            map32.put("difficulty", new C7478a.a(0, 1, "difficulty", "REAL", null, true));
            map32.put("rosesCount", new C7478a.a(0, 1, "rosesCount", "INTEGER", null, true));
            map32.put("newWordsCount", new C7478a.a(0, 1, "newWordsCount", "INTEGER", null, true));
            map32.put("knownWordsCount", new C7478a.a(0, 1, "knownWordsCount", "INTEGER", null, true));
            map32.put("cardsCount", new C7478a.a(0, 1, "cardsCount", "INTEGER", null, true));
            map32.put("lessonsCount", new C7478a.a(0, 1, "lessonsCount", "INTEGER", null, true));
            HashSet hashSetM615k21 = C0141b.m615k(map32, "isCompletelyTaken", new C7478a.a(0, 1, "isCompletelyTaken", "INTEGER", null, true), 0);
            HashSet hashSet21 = new HashSet(1);
            hashSet21.add(new C7478a.d("index_LibraryCounter_id_type", Arrays.asList("id", "type"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a32 = new C7478a("LibraryCounter", map32, hashSetM615k21, hashSet21);
            C7478a c7478aM14861a32 = C7478a.m14861a(frameworkSQLiteDatabase, "LibraryCounter");
            if (!c7478a32.equals(c7478aM14861a32)) {
                return new C6594n.b(C0166e.m767m("LibraryCounter(com.lingq.entity.LibraryCounter).\n Expected:\n", c7478a32, "\n Found:\n", c7478aM14861a32), false);
            }
            HashMap map33 = new HashMap(3);
            map33.put("termWithLanguage", new C7478a.a(1, 1, "termWithLanguage", "TEXT", null, true));
            map33.put("locale", new C7478a.a(2, 1, "locale", "TEXT", null, true));
            HashSet hashSetM615k22 = C0141b.m615k(map33, "popularMeanings", new C7478a.a(0, 1, "popularMeanings", "TEXT", null, true), 0);
            HashSet hashSet22 = new HashSet(1);
            hashSet22.add(new C7478a.d("index_TokenAndPopularMeanings_termWithLanguage_locale", Arrays.asList("termWithLanguage", "locale"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a33 = new C7478a("TokenAndPopularMeanings", map33, hashSetM615k22, hashSet22);
            C7478a c7478aM14861a33 = C7478a.m14861a(frameworkSQLiteDatabase, "TokenAndPopularMeanings");
            if (!c7478a33.equals(c7478aM14861a33)) {
                return new C6594n.b(C0166e.m767m("TokenAndPopularMeanings(com.lingq.entity.TokenAndPopularMeanings).\n Expected:\n", c7478a33, "\n Found:\n", c7478aM14861a33), false);
            }
            HashMap map34 = new HashMap(2);
            map34.put("termWithLanguage", new C7478a.a(1, 1, "termWithLanguage", "TEXT", null, true));
            HashSet hashSetM615k23 = C0141b.m615k(map34, "relatedPhrases", new C7478a.a(0, 1, "relatedPhrases", "TEXT", null, true), 0);
            HashSet hashSet23 = new HashSet(1);
            hashSet23.add(new C7478a.d("index_TokenAndRelatedPhrases_termWithLanguage", Arrays.asList("termWithLanguage"), Arrays.asList("ASC"), false));
            C7478a c7478a34 = new C7478a("TokenAndRelatedPhrases", map34, hashSetM615k23, hashSet23);
            C7478a c7478aM14861a34 = C7478a.m14861a(frameworkSQLiteDatabase, "TokenAndRelatedPhrases");
            if (!c7478a34.equals(c7478aM14861a34)) {
                return new C6594n.b(C0166e.m767m("TokenAndRelatedPhrases(com.lingq.entity.TokenAndRelatedPhrases).\n Expected:\n", c7478a34, "\n Found:\n", c7478aM14861a34), false);
            }
            HashMap map35 = new HashMap(5);
            map35.put("id", new C7478a.a(1, 1, "id", "INTEGER", null, true));
            map35.put("language", new C7478a.a(2, 1, "language", "TEXT", null, true));
            map35.put("type", new C7478a.a(3, 1, "type", "TEXT", "'content'", true));
            map35.put("isDownloaded", new C7478a.a(0, 1, "isDownloaded", "INTEGER", null, true));
            HashSet hashSetM615k24 = C0141b.m615k(map35, "downloadProgress", new C7478a.a(0, 1, "downloadProgress", "INTEGER", null, false), 0);
            HashSet hashSet24 = new HashSet(1);
            hashSet24.add(new C7478a.d("index_LibraryDownload_id_language_type", Arrays.asList("id", "language", "type"), Arrays.asList("ASC", "ASC", "ASC"), false));
            C7478a c7478a35 = new C7478a("LibraryDownload", map35, hashSetM615k24, hashSet24);
            C7478a c7478aM14861a35 = C7478a.m14861a(frameworkSQLiteDatabase, "LibraryDownload");
            if (!c7478a35.equals(c7478aM14861a35)) {
                return new C6594n.b(C0166e.m767m("LibraryDownload(com.lingq.entity.LibraryDownload).\n Expected:\n", c7478a35, "\n Found:\n", c7478aM14861a35), false);
            }
            HashMap map36 = new HashMap(4);
            map36.put("id", new C7478a.a(1, 1, "id", "INTEGER", null, true));
            map36.put("language", new C7478a.a(2, 1, "language", "TEXT", null, true));
            map36.put("isDownloaded", new C7478a.a(0, 1, "isDownloaded", "INTEGER", null, true));
            HashSet hashSetM615k25 = C0141b.m615k(map36, "downloadProgress", new C7478a.a(0, 1, "downloadProgress", "INTEGER", null, true), 0);
            HashSet hashSet25 = new HashSet(1);
            hashSet25.add(new C7478a.d("index_LessonAudioDownload_id_language", Arrays.asList("id", "language"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a36 = new C7478a("LessonAudioDownload", map36, hashSetM615k25, hashSet25);
            C7478a c7478aM14861a36 = C7478a.m14861a(frameworkSQLiteDatabase, "LessonAudioDownload");
            if (!c7478a36.equals(c7478aM14861a36)) {
                return new C6594n.b(C0166e.m767m("LessonAudioDownload(com.lingq.entity.LessonAudioDownload).\n Expected:\n", c7478a36, "\n Found:\n", c7478aM14861a36), false);
            }
            HashMap map37 = new HashMap(2);
            map37.put("code", new C7478a.a(1, 1, "code", "TEXT", null, true));
            HashSet hashSetM615k26 = C0141b.m615k(map37, "tags", new C7478a.a(0, 1, "tags", "TEXT", null, true), 0);
            HashSet hashSet26 = new HashSet(1);
            hashSet26.add(new C7478a.d("index_LanguageCardsTags_code", Arrays.asList("code"), Arrays.asList("ASC"), false));
            C7478a c7478a37 = new C7478a("LanguageCardsTags", map37, hashSetM615k26, hashSet26);
            C7478a c7478aM14861a37 = C7478a.m14861a(frameworkSQLiteDatabase, "LanguageCardsTags");
            if (!c7478a37.equals(c7478aM14861a37)) {
                return new C6594n.b(C0166e.m767m("LanguageCardsTags(com.lingq.entity.LanguageCardsTags).\n Expected:\n", c7478a37, "\n Found:\n", c7478aM14861a37), false);
            }
            HashMap map38 = new HashMap(3);
            map38.put("language", new C7478a.a(1, 1, "language", "TEXT", null, true));
            map38.put("pk", new C7478a.a(2, 1, "pk", "INTEGER", null, true));
            HashSet hashSetM615k27 = C0141b.m615k(map38, "title", new C7478a.a(0, 1, "title", "TEXT", null, true), 0);
            HashSet hashSet27 = new HashSet(1);
            hashSet27.add(new C7478a.d("index_CourseForImport_language_pk", Arrays.asList("language", "pk"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a38 = new C7478a("CourseForImport", map38, hashSetM615k27, hashSet27);
            C7478a c7478aM14861a38 = C7478a.m14861a(frameworkSQLiteDatabase, "CourseForImport");
            if (!c7478a38.equals(c7478aM14861a38)) {
                return new C6594n.b(C0166e.m767m("CourseForImport(com.lingq.entity.CourseForImport).\n Expected:\n", c7478a38, "\n Found:\n", c7478aM14861a38), false);
            }
            HashMap map39 = new HashMap(3);
            map39.put("playlistId", new C7478a.a(1, 1, "playlistId", "INTEGER", null, true));
            map39.put("contentId", new C7478a.a(2, 1, "contentId", "INTEGER", null, true));
            HashSet hashSetM615k28 = C0141b.m615k(map39, "language", new C7478a.a(0, 1, "language", "TEXT", null, true), 0);
            HashSet hashSet28 = new HashSet(1);
            hashSet28.add(new C7478a.d("index_LessonsWithPlaylistJoin_playlistId_contentId", Arrays.asList("playlistId", "contentId"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a39 = new C7478a("LessonsWithPlaylistJoin", map39, hashSetM615k28, hashSet28);
            C7478a c7478aM14861a39 = C7478a.m14861a(frameworkSQLiteDatabase, "LessonsWithPlaylistJoin");
            if (!c7478a39.equals(c7478aM14861a39)) {
                return new C6594n.b(C0166e.m767m("LessonsWithPlaylistJoin(com.lingq.entity.LessonsWithPlaylistJoin).\n Expected:\n", c7478a39, "\n Found:\n", c7478aM14861a39), false);
            }
            HashMap map40 = new HashMap(3);
            map40.put("pk", new C7478a.a(1, 1, "pk", "INTEGER", null, true));
            map40.put("contentId", new C7478a.a(2, 1, "contentId", "INTEGER", null, true));
            HashSet hashSetM615k29 = C0141b.m615k(map40, "courseOrder", new C7478a.a(0, 1, "courseOrder", "INTEGER", null, true), 0);
            HashSet hashSet29 = new HashSet(1);
            hashSet29.add(new C7478a.d("index_CoursesAndLessonsJoin_pk_contentId", Arrays.asList("pk", "contentId"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a40 = new C7478a("CoursesAndLessonsJoin", map40, hashSetM615k29, hashSet29);
            C7478a c7478aM14861a40 = C7478a.m14861a(frameworkSQLiteDatabase, "CoursesAndLessonsJoin");
            if (!c7478a40.equals(c7478aM14861a40)) {
                return new C6594n.b(C0166e.m767m("CoursesAndLessonsJoin(com.lingq.entity.CoursesAndLessonsJoin).\n Expected:\n", c7478a40, "\n Found:\n", c7478aM14861a40), false);
            }
            HashMap map41 = new HashMap(2);
            map41.put("pk", new C7478a.a(1, 1, "pk", "INTEGER", null, true));
            HashSet hashSetM615k30 = C0141b.m615k(map41, "language", new C7478a.a(2, 1, "language", "TEXT", null, true), 0);
            HashSet hashSet30 = new HashSet(1);
            hashSet30.add(new C7478a.d("index_CoursesAndLanguageJoin_pk_language", Arrays.asList("pk", "language"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a41 = new C7478a("CoursesAndLanguageJoin", map41, hashSetM615k30, hashSet30);
            C7478a c7478aM14861a41 = C7478a.m14861a(frameworkSQLiteDatabase, "CoursesAndLanguageJoin");
            if (!c7478a41.equals(c7478aM14861a41)) {
                return new C6594n.b(C0166e.m767m("CoursesAndLanguageJoin(com.lingq.entity.CoursesAndLanguageJoin).\n Expected:\n", c7478a41, "\n Found:\n", c7478aM14861a41), false);
            }
            HashMap map42 = new HashMap(2);
            map42.put("pk", new C7478a.a(1, 1, "pk", "INTEGER", null, true));
            HashSet hashSetM615k31 = C0141b.m615k(map42, "termWithLanguage", new C7478a.a(2, 1, "termWithLanguage", "TEXT", null, true), 0);
            HashSet hashSet31 = new HashSet(1);
            hashSet31.add(new C7478a.d("index_CourseAndCardsJoin_pk_termWithLanguage", Arrays.asList("pk", "termWithLanguage"), Arrays.asList("ASC", "ASC"), false));
            C7478a c7478a42 = new C7478a("CourseAndCardsJoin", map42, hashSetM615k31, hashSet31);
            C7478a c7478aM14861a42 = C7478a.m14861a(frameworkSQLiteDatabase, "CourseAndCardsJoin");
            if (!c7478a42.equals(c7478aM14861a42)) {
                return new C6594n.b(C0166e.m767m("CourseAndCardsJoin(com.lingq.entity.CourseAndCardsJoin).\n Expected:\n", c7478a42, "\n Found:\n", c7478aM14861a42), false);
            }
            HashMap map43 = new HashMap(8);
            map43.put("challengeCode", new C7478a.a(1, 1, "challengeCode", "TEXT", null, true));
            map43.put("metric", new C7478a.a(2, 1, "metric", "TEXT", null, true));
            map43.put("rank", new C7478a.a(3, 1, "rank", "INTEGER", null, true));
            map43.put("language", new C7478a.a(4, 1, "language", "TEXT", null, true));
            map43.put("profile", new C7478a.a(0, 1, "profile", "TEXT", null, false));
            map43.put("score", new C7478a.a(0, 1, "score", "INTEGER", null, true));
            map43.put("scoreBehindLeader", new C7478a.a(0, 1, "scoreBehindLeader", "INTEGER", null, true));
            HashSet hashSetM615k32 = C0141b.m615k(map43, "isCompleted", new C7478a.a(0, 1, "isCompleted", "INTEGER", null, true), 0);
            HashSet hashSet32 = new HashSet(1);
            hashSet32.add(new C7478a.d("index_ChallengeRanking_challengeCode_metric_rank_language", Arrays.asList("challengeCode", "metric", "rank", "language"), Arrays.asList("ASC", "ASC", "ASC", "ASC"), false));
            C7478a c7478a43 = new C7478a("ChallengeRanking", map43, hashSetM615k32, hashSet32);
            C7478a c7478aM14861a43 = C7478a.m14861a(frameworkSQLiteDatabase, "ChallengeRanking");
            if (!c7478a43.equals(c7478aM14861a43)) {
                return new C6594n.b(C0166e.m767m("ChallengeRanking(com.lingq.entity.ChallengeRanking).\n Expected:\n", c7478a43, "\n Found:\n", c7478aM14861a43), false);
            }
            HashMap map44 = new HashMap(5);
            map44.put("language", new C7478a.a(3, 1, "language", "TEXT", null, true));
            map44.put("challengeCode", new C7478a.a(1, 1, "challengeCode", "TEXT", null, true));
            map44.put("code", new C7478a.a(2, 1, "code", "TEXT", null, true));
            map44.put("value", new C7478a.a(0, 1, "value", "INTEGER", null, true));
            HashSet hashSetM615k33 = C0141b.m615k(map44, "title", new C7478a.a(0, 1, "title", "TEXT", null, false), 0);
            HashSet hashSet33 = new HashSet(1);
            hashSet33.add(new C7478a.d("index_ChallengeDetailStats_challengeCode_code_language", Arrays.asList("challengeCode", "code", "language"), Arrays.asList("ASC", "ASC", "ASC"), false));
            C7478a c7478a44 = new C7478a("ChallengeDetailStats", map44, hashSetM615k33, hashSet33);
            C7478a c7478aM14861a44 = C7478a.m14861a(frameworkSQLiteDatabase, "ChallengeDetailStats");
            if (!c7478a44.equals(c7478aM14861a44)) {
                return new C6594n.b(C0166e.m767m("ChallengeDetailStats(com.lingq.entity.ChallengeDetailStats).\n Expected:\n", c7478a44, "\n Found:\n", c7478aM14861a44), false);
            }
            HashMap map45 = new HashMap(7);
            map45.put("language", new C7478a.a(3, 1, "language", "TEXT", null, true));
            map45.put("challengeCode", new C7478a.a(1, 1, "challengeCode", "TEXT", null, true));
            map45.put("code", new C7478a.a(2, 1, "code", "TEXT", null, true));
            map45.put("title", new C7478a.a(0, 1, "title", "TEXT", null, true));
            map45.put("progress", new C7478a.a(0, 1, "progress", "REAL", null, true));
            map45.put("actual", new C7478a.a(0, 1, "actual", "REAL", null, true));
            HashSet hashSetM615k34 = C0141b.m615k(map45, "target", new C7478a.a(0, 1, "target", "REAL", null, true), 0);
            HashSet hashSet34 = new HashSet(1);
            hashSet34.add(new C7478a.d("index_ChallengeStats_challengeCode_code_language", Arrays.asList("challengeCode", "code", "language"), Arrays.asList("ASC", "ASC", "ASC"), false));
            C7478a c7478a45 = new C7478a("ChallengeStats", map45, hashSetM615k34, hashSet34);
            C7478a c7478aM14861a45 = C7478a.m14861a(frameworkSQLiteDatabase, "ChallengeStats");
            if (!c7478a45.equals(c7478aM14861a45)) {
                return new C6594n.b(C0166e.m767m("ChallengeStats(com.lingq.entity.ChallengeStats).\n Expected:\n", c7478a45, "\n Found:\n", c7478aM14861a45), false);
            }
            HashMap map46 = new HashMap(6);
            map46.put("id", new C7478a.a(1, 1, "id", "INTEGER", null, true));
            map46.put("language", new C7478a.a(0, 1, "language", "TEXT", null, true));
            map46.put("description", new C7478a.a(0, 1, "description", "TEXT", null, false));
            map46.put("image", new C7478a.a(0, 1, "image", "TEXT", null, false));
            map46.put("title", new C7478a.a(0, 1, "title", "TEXT", null, false));
            HashSet hashSetM615k35 = C0141b.m615k(map46, "url", new C7478a.a(0, 1, "url", "TEXT", null, false), 0);
            HashSet hashSet35 = new HashSet(1);
            hashSet35.add(new C7478a.d("index_Provider_id", Arrays.asList("id"), Arrays.asList("ASC"), false));
            C7478a c7478a46 = new C7478a("Provider", map46, hashSetM615k35, hashSet35);
            C7478a c7478aM14861a46 = C7478a.m14861a(frameworkSQLiteDatabase, "Provider");
            if (!c7478a46.equals(c7478aM14861a46)) {
                return new C6594n.b(C0166e.m767m("Provider(com.lingq.entity.Provider).\n Expected:\n", c7478a46, "\n Found:\n", c7478aM14861a46), false);
            }
            HashMap map47 = new HashMap(1);
            HashSet hashSetM615k36 = C0141b.m615k(map47, "title", new C7478a.a(1, 1, "title", "TEXT", null, true), 0);
            HashSet hashSet36 = new HashSet(1);
            hashSet36.add(new C7478a.d("index_LessonTag_title", Arrays.asList("title"), Arrays.asList("ASC"), false));
            C7478a c7478a47 = new C7478a("LessonTag", map47, hashSetM615k36, hashSet36);
            C7478a c7478aM14861a47 = C7478a.m14861a(frameworkSQLiteDatabase, "LessonTag");
            if (!c7478a47.equals(c7478aM14861a47)) {
                return new C6594n.b(C0166e.m767m("LessonTag(com.lingq.entity.LessonTag).\n Expected:\n", c7478a47, "\n Found:\n", c7478aM14861a47), false);
            }
            HashMap map48 = new HashMap(10);
            map48.put("pk", new C7478a.a(1, 1, "pk", "INTEGER", null, true));
            map48.put("url", new C7478a.a(0, 1, "url", "TEXT", null, false));
            map48.put("language", new C7478a.a(0, 1, "language", "TEXT", null, false));
            map48.put("notificationLanguage", new C7478a.a(0, 1, "notificationLanguage", "TEXT", null, false));
            map48.put("type", new C7478a.a(0, 1, "type", "TEXT", null, false));
            map48.put("title", new C7478a.a(0, 1, "title", "TEXT", null, false));
            map48.put("message", new C7478a.a(0, 1, "message", "TEXT", null, false));
            map48.put("image", new C7478a.a(0, 1, "image", "TEXT", null, false));
            map48.put("isNew", new C7478a.a(0, 1, "isNew", "INTEGER", null, false));
            C7478a c7478a48 = new C7478a("Notification", map48, C0141b.m615k(map48, "timestamp", new C7478a.a(0, 1, "timestamp", "TEXT", null, false), 0), new HashSet(0));
            C7478a c7478aM14861a48 = C7478a.m14861a(frameworkSQLiteDatabase, "Notification");
            if (!c7478a48.equals(c7478aM14861a48)) {
                return new C6594n.b(C0166e.m767m("Notification(com.lingq.entity.Notification).\n Expected:\n", c7478a48, "\n Found:\n", c7478aM14861a48), false);
            }
            HashMap map49 = new HashMap(5);
            map49.put("language", new C7478a.a(1, 1, "language", "TEXT", null, true));
            map49.put("streakDays", new C7478a.a(0, 1, "streakDays", "INTEGER", null, false));
            map49.put("coins", new C7478a.a(0, 1, "coins", "REAL", null, false));
            map49.put("latestStreakDays", new C7478a.a(0, 1, "latestStreakDays", "INTEGER", null, false));
            C7478a c7478a49 = new C7478a("Streak", map49, C0141b.m615k(map49, "isStreakBroken", new C7478a.a(0, 1, "isStreakBroken", "INTEGER", null, false), 0), new HashSet(0));
            C7478a c7478aM14861a49 = C7478a.m14861a(frameworkSQLiteDatabase, "Streak");
            if (!c7478a49.equals(c7478aM14861a49)) {
                return new C6594n.b(C0166e.m767m("Streak(com.lingq.entity.Streak).\n Expected:\n", c7478a49, "\n Found:\n", c7478aM14861a49), false);
            }
            HashMap map50 = new HashMap(2);
            map50.put("languageAndSlug", new C7478a.a(1, 1, "languageAndSlug", "TEXT", null, true));
            C7478a c7478a50 = new C7478a("MilestoneMet", map50, C0141b.m615k(map50, "metAt", new C7478a.a(0, 1, "metAt", "TEXT", null, true), 0), new HashSet(0));
            C7478a c7478aM14861a50 = C7478a.m14861a(frameworkSQLiteDatabase, "MilestoneMet");
            if (!c7478a50.equals(c7478aM14861a50)) {
                return new C6594n.b(C0166e.m767m("MilestoneMet(com.lingq.entity.MilestoneMet).\n Expected:\n", c7478a50, "\n Found:\n", c7478aM14861a50), false);
            }
            HashMap map51 = new HashMap(4);
            map51.put("language", new C7478a.a(1, 1, "language", "TEXT", null, true));
            map51.put("knownWords", new C7478a.a(0, 1, "knownWords", "INTEGER", null, true));
            map51.put("lingqs", new C7478a.a(0, 1, "lingqs", "INTEGER", null, true));
            C7478a c7478a51 = new C7478a("MilestoneStats", map51, C0141b.m615k(map51, "dailyScore", new C7478a.a(0, 1, "dailyScore", "INTEGER", null, true), 0), new HashSet(0));
            C7478a c7478aM14861a51 = C7478a.m14861a(frameworkSQLiteDatabase, "MilestoneStats");
            if (!c7478a51.equals(c7478aM14861a51)) {
                return new C6594n.b(C0166e.m767m("MilestoneStats(com.lingq.entity.MilestoneStats).\n Expected:\n", c7478a51, "\n Found:\n", c7478aM14861a51), false);
            }
            HashMap map52 = new HashMap(5);
            map52.put("id", new C7478a.a(1, 1, "id", "TEXT", null, true));
            map52.put("language", new C7478a.a(3, 1, "language", "TEXT", null, true));
            map52.put("query", new C7478a.a(4, 1, "query", "TEXT", null, true));
            map52.put("type", new C7478a.a(2, 1, "type", "TEXT", null, true));
            HashSet hashSetM615k37 = C0141b.m615k(map52, "title", new C7478a.a(0, 1, "title", "TEXT", null, false), 0);
            HashSet hashSet37 = new HashSet(1);
            hashSet37.add(new C7478a.d("index_FastSearch_id_type_language_query", Arrays.asList("id", "type", "language", "query"), Arrays.asList("ASC", "ASC", "ASC", "ASC"), false));
            C7478a c7478a52 = new C7478a("FastSearch", map52, hashSetM615k37, hashSet37);
            C7478a c7478aM14861a52 = C7478a.m14861a(frameworkSQLiteDatabase, "FastSearch");
            if (!c7478a52.equals(c7478aM14861a52)) {
                return new C6594n.b(C0166e.m767m("FastSearch(com.lingq.entity.FastSearch).\n Expected:\n", c7478a52, "\n Found:\n", c7478aM14861a52), false);
            }
            HashMap map53 = new HashMap(7);
            map53.put("id", new C7478a.a(1, 1, "id", "INTEGER", null, true));
            map53.put("language", new C7478a.a(0, 1, "language", "TEXT", null, false));
            map53.put("firstName", new C7478a.a(0, 1, "firstName", "TEXT", null, false));
            map53.put("lastName", new C7478a.a(0, 1, "lastName", "TEXT", null, false));
            map53.put("photo", new C7478a.a(0, 1, "photo", "TEXT", null, false));
            map53.put("username", new C7478a.a(0, 1, "username", "TEXT", null, false));
            C7478a c7478a53 = new C7478a("SharedByUser", map53, C0141b.m615k(map53, "role", new C7478a.a(0, 1, "role", "TEXT", null, false), 0), new HashSet(0));
            C7478a c7478aM14861a53 = C7478a.m14861a(frameworkSQLiteDatabase, "SharedByUser");
            if (!c7478a53.equals(c7478aM14861a53)) {
                return new C6594n.b(C0166e.m767m("SharedByUser(com.lingq.entity.SharedByUser).\n Expected:\n", c7478a53, "\n Found:\n", c7478aM14861a53), false);
            }
            HashMap map54 = new HashMap(3);
            map54.put("language", new C7478a.a(1, 1, "language", "TEXT", null, true));
            map54.put("query", new C7478a.a(2, 1, "query", "TEXT", null, true));
            HashSet hashSetM615k38 = C0141b.m615k(map54, "userId", new C7478a.a(3, 1, "userId", "INTEGER", null, true), 0);
            HashSet hashSet38 = new HashSet(1);
            hashSet38.add(new C7478a.d("index_SharedByUserAndQueryJoin_language_query_userId", Arrays.asList("language", "query", "userId"), Arrays.asList("ASC", "ASC", "ASC"), false));
            C7478a c7478a54 = new C7478a("SharedByUserAndQueryJoin", map54, hashSetM615k38, hashSet38);
            C7478a c7478aM14861a54 = C7478a.m14861a(frameworkSQLiteDatabase, "SharedByUserAndQueryJoin");
            if (!c7478a54.equals(c7478aM14861a54)) {
                return new C6594n.b(C0166e.m767m("SharedByUserAndQueryJoin(com.lingq.entity.SharedByUserAndQueryJoin).\n Expected:\n", c7478a54, "\n Found:\n", c7478aM14861a54), false);
            }
            HashMap map55 = new HashMap(7);
            map55.put("id", new C7478a.a(1, 1, "id", "INTEGER", null, true));
            map55.put("language", new C7478a.a(0, 1, "language", "TEXT", null, true));
            map55.put("title", new C7478a.a(0, 1, "title", "TEXT", null, true));
            map55.put("startDate", new C7478a.a(0, 1, "startDate", "TEXT", null, true));
            map55.put("endDate", new C7478a.a(0, 1, "endDate", "TEXT", null, true));
            map55.put("noticeType", new C7478a.a(0, 1, "noticeType", "TEXT", null, true));
            C7478a c7478a55 = new C7478a("Notice", map55, C0141b.m615k(map55, "isShown", new C7478a.a(0, 1, "isShown", "INTEGER", null, true), 0), new HashSet(0));
            C7478a c7478aM14861a55 = C7478a.m14861a(frameworkSQLiteDatabase, "Notice");
            if (!c7478a55.equals(c7478aM14861a55)) {
                return new C6594n.b(C0166e.m767m("Notice(com.lingq.entity.Notice).\n Expected:\n", c7478a55, "\n Found:\n", c7478aM14861a55), false);
            }
            HashMap map56 = new HashMap(4);
            map56.put("pk", new C7478a.a(1, 1, "pk", "INTEGER", null, true));
            map56.put("username", new C7478a.a(0, 1, "username", "TEXT", null, false));
            map56.put("photo", new C7478a.a(0, 1, "photo", "TEXT", null, false));
            C7478a c7478a56 = new C7478a("Referral", map56, C0141b.m615k(map56, "dateJoined", new C7478a.a(0, 1, "dateJoined", "TEXT", null, false), 0), new HashSet(0));
            C7478a c7478aM14861a56 = C7478a.m14861a(frameworkSQLiteDatabase, "Referral");
            return !c7478a56.equals(c7478aM14861a56) ? new C6594n.b(C0166e.m767m("Referral(com.lingq.entity.Referral).\n Expected:\n", c7478a56, "\n Found:\n", c7478aM14861a56), false) : new C6594n.b(null, true);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: A */
    public final AbstractC1495o1 mo9452A() {
        C1502p1 c1502p1;
        if (this.f19355n != null) {
            return this.f19355n;
        }
        synchronized (this) {
            if (this.f19355n == null) {
                this.f19355n = new C1502p1(this);
            }
            c1502p1 = this.f19355n;
        }
        return c1502p1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: B */
    public final AbstractC1454i2 mo9453B() {
        C1461j2 c1461j2;
        if (this.f19354m != null) {
            return this.f19354m;
        }
        synchronized (this) {
            if (this.f19354m == null) {
                this.f19354m = new C1461j2(this);
            }
            c1461j2 = this.f19354m;
        }
        return c1461j2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: C */
    public final AbstractC1440g3 mo9454C() {
        C1462j3 c1462j3;
        if (this.f19365x != null) {
            return this.f19365x;
        }
        synchronized (this) {
            if (this.f19365x == null) {
                this.f19365x = new C1462j3(this);
            }
            c1462j3 = this.f19365x;
        }
        return c1462j3;
    }

    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: D */
    public final AbstractC1469k3 mo9455D() {
        C1476l3 c1476l3;
        if (this.f19350C != null) {
            return this.f19350C;
        }
        synchronized (this) {
            if (this.f19350C == null) {
                this.f19350C = new C1476l3(this);
            }
            c1476l3 = this.f19350C;
        }
        return c1476l3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: E */
    public final AbstractC1497o3 mo9456E() {
        C1504p3 c1504p3;
        if (this.f19352E != null) {
            return this.f19352E;
        }
        synchronized (this) {
            if (this.f19352E == null) {
                this.f19352E = new C1504p3(this);
            }
            c1504p3 = this.f19352E;
        }
        return c1504p3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: F */
    public final AbstractC1518r3 mo9457F() {
        C1532t3 c1532t3;
        if (this.f19349B != null) {
            return this.f19349B;
        }
        synchronized (this) {
            if (this.f19349B == null) {
                this.f19349B = new C1532t3(this);
            }
            c1532t3 = this.f19349B;
        }
        return c1532t3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: G */
    public final InterfaceC1539u3 mo9458G() {
        C1546v3 c1546v3;
        if (this.f19367z != null) {
            return this.f19367z;
        }
        synchronized (this) {
            if (this.f19367z == null) {
                this.f19367z = new C1546v3(this);
            }
            c1546v3 = this.f19367z;
        }
        return c1546v3;
    }

    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: H */
    public final PlaylistDao mo9459H() {
        C1560x3 c1560x3;
        if (this.f19362u != null) {
            return this.f19362u;
        }
        synchronized (this) {
            if (this.f19362u == null) {
                this.f19362u = new C1560x3(this);
            }
            c1560x3 = this.f19362u;
        }
        return c1560x3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: I */
    public final AbstractC1568y4 mo9460I() {
        C1575z4 c1575z4;
        if (this.f19353F != null) {
            return this.f19353F;
        }
        synchronized (this) {
            if (this.f19353F == null) {
                this.f19353F = new C1575z4(this);
            }
            c1575z4 = this.f19353F;
        }
        return c1575z4;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: J */
    public final AbstractC1402b5 mo9461J() {
        C1426e5 c1426e5;
        if (this.f19351D != null) {
            return this.f19351D;
        }
        synchronized (this) {
            if (this.f19351D == null) {
                this.f19351D = new C1426e5(this);
            }
            c1426e5 = this.f19351D;
        }
        return c1426e5;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: K */
    public final AbstractC1450h5 mo9462K() {
        C1478l5 c1478l5;
        if (this.f19359r != null) {
            return this.f19359r;
        }
        synchronized (this) {
            if (this.f19359r == null) {
                this.f19359r = new C1478l5(this);
            }
            c1478l5 = this.f19359r;
        }
        return c1478l5;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: L */
    public final AbstractC1485m5 mo9463L() {
        C1492n5 c1492n5;
        if (this.f19366y != null) {
            return this.f19366y;
        }
        synchronized (this) {
            if (this.f19366y == null) {
                this.f19366y = new C1492n5(this);
            }
            c1492n5 = this.f19366y;
        }
        return c1492n5;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: M */
    public final AbstractC1520r5 mo9464M() {
        C1527s5 c1527s5;
        if (this.f19363v != null) {
            return this.f19363v;
        }
        synchronized (this) {
            if (this.f19363v == null) {
                this.f19363v = new C1527s5(this);
            }
            c1527s5 = this.f19363v;
        }
        return c1527s5;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: N */
    public final AbstractC1562x5 mo9465N() {
        C1576z5 c1576z5;
        if (this.f19358q != null) {
            return this.f19358q;
        }
        synchronized (this) {
            if (this.f19358q == null) {
                this.f19358q = new C1576z5(this);
            }
            c1576z5 = this.f19358q;
        }
        return c1576z5;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: d */
    public final void mo4553d() {
        m4550a();
        InterfaceC7916b interfaceC7916bMo4578n0 = m4559j().mo4578n0();
        try {
            m4552c();
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Lesson`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Sentence`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Card`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Word`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LessonsAndCardsJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LessonsAndWordsJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `DictionaryData`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `DictionaryLocale`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Challenge`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Badge`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Milestone`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LibraryData`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LanguageContext`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Language`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LanguageActiveDictionaryJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LanguageAvailableDictionaryJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LanguageDictionaryLocaleJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LibraryShelfAndContentJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Shelf`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Playlist`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `PlaylistAndLessonsJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Translations`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `TtsVoice`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LanguageAndTtsVoicesJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `TtsUtterance`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `TranslationSentence`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LanguageProgress`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `PagingKeys`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LanguageProgressChartEntry`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `StudyStats`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LessonBookmark`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LibraryCounter`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `TokenAndPopularMeanings`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `TokenAndRelatedPhrases`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LibraryDownload`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LessonAudioDownload`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LanguageCardsTags`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `CourseForImport`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LessonsWithPlaylistJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `CoursesAndLessonsJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `CoursesAndLanguageJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `CourseAndCardsJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `ChallengeRanking`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `ChallengeDetailStats`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `ChallengeStats`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Provider`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `LessonTag`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Notification`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Streak`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `MilestoneMet`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `MilestoneStats`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `FastSearch`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `SharedByUser`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `SharedByUserAndQueryJoin`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Notice`");
            interfaceC7916bMo4578n0.mo4600u("DELETE FROM `Referral`");
            m4568s();
        } finally {
            m4563n();
            interfaceC7916bMo4578n0.mo4599o0("PRAGMA wal_checkpoint(FULL)").close();
            if (!interfaceC7916bMo4578n0.mo4589S0()) {
                interfaceC7916bMo4578n0.mo4600u("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: g */
    public final C6586f mo4556g() {
        return new C6586f(this, new HashMap(0), new HashMap(0), "Lesson", "Sentence", "Card", "Word", "LessonsAndCardsJoin", "LessonsAndWordsJoin", "DictionaryData", "DictionaryLocale", "Challenge", "Badge", "Milestone", "LibraryData", "LanguageContext", "Language", "LanguageActiveDictionaryJoin", "LanguageAvailableDictionaryJoin", "LanguageDictionaryLocaleJoin", "LibraryShelfAndContentJoin", "Shelf", "Playlist", "PlaylistAndLessonsJoin", "Translations", "TtsVoice", "LanguageAndTtsVoicesJoin", "TtsUtterance", "TranslationSentence", "LanguageProgress", "PagingKeys", "LanguageProgressChartEntry", "StudyStats", "LessonBookmark", "LibraryCounter", "TokenAndPopularMeanings", "TokenAndRelatedPhrases", "LibraryDownload", "LessonAudioDownload", "LanguageCardsTags", "CourseForImport", "LessonsWithPlaylistJoin", "CoursesAndLessonsJoin", "CoursesAndLanguageJoin", "CourseAndCardsJoin", "ChallengeRanking", "ChallengeDetailStats", "ChallengeStats", "Provider", "LessonTag", "Notification", "Streak", "MilestoneMet", "MilestoneStats", "FastSearch", "SharedByUser", "SharedByUserAndQueryJoin", "Notice", "Referral");
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h */
    public final InterfaceC7917c mo4557h(C6581a c6581a) {
        C6594n c6594n = new C6594n(c6581a, new C3314a(), "d63001fed805b92a99bc26ac544cfaea", "4c47a375cc903954537d927efa3360a1");
        Context context = c6581a.f37406a;
        C5207g.m11111f(context, "context");
        return c6581a.f37408c.mo5467a(new InterfaceC7917c.b(context, c6581a.f37407b, c6594n, false, false));
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: i */
    public final List mo4558i(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new C0080b(0), new C0081c(0), new C0082d(0), new C1727y(1), new C0080b(1), new C0081c(1), new C0082d(1), new C0083e(), new C1728z(1), new C0081c(2), new C0082d(2), new C1727y(2), new C1728z(2), new C0081c(3), new C0082d(3), new C1727y(3), new C0080b(2), new C0081c(4), new C0082d(4), new C1727y(4), new C0080b(3), new C0081c(5), new C0082d(5), new C1727y(5));
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: k */
    public final Set<Class<? extends InterfaceC7251a>> mo4560k() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: l */
    public final Map<Class<?>, List<Class<?>>> mo4561l() {
        HashMap map = new HashMap();
        map.put(AbstractC1454i2.class, Collections.emptyList());
        map.put(AbstractC1495o1.class, Collections.emptyList());
        map.put(AbstractC1413d0.class, Collections.emptyList());
        map.put(AbstractC1388a.class, Collections.emptyList());
        map.put(AbstractC1562x5.class, Collections.emptyList());
        map.put(AbstractC1450h5.class, Collections.emptyList());
        map.put(AbstractC1529t0.class, Collections.emptyList());
        map.put(LanguageStatsDao.class, Collections.emptyList());
        map.put(PlaylistDao.class, Collections.emptyList());
        map.put(AbstractC1520r5.class, Collections.emptyList());
        map.put(DictionaryDao.class, Collections.emptyList());
        map.put(AbstractC1440g3.class, Collections.emptyList());
        map.put(AbstractC1485m5.class, Collections.emptyList());
        map.put(InterfaceC1539u3.class, Collections.emptyList());
        map.put(AbstractC1486n.class, Collections.emptyList());
        map.put(AbstractC1518r3.class, Collections.emptyList());
        map.put(AbstractC1469k3.class, Collections.emptyList());
        map.put(AbstractC1402b5.class, Collections.emptyList());
        map.put(AbstractC1497o3.class, Collections.emptyList());
        map.put(AbstractC1568y4.class, Collections.emptyList());
        return map;
    }

    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: u */
    public final AbstractC1388a mo9466u() {
        C1404c c1404c;
        if (this.f19357p != null) {
            return this.f19357p;
        }
        synchronized (this) {
            if (this.f19357p == null) {
                this.f19357p = new C1404c(this);
            }
            c1404c = this.f19357p;
        }
        return c1404c;
    }

    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: v */
    public final AbstractC1486n mo9467v() {
        C1493o c1493o;
        if (this.f19348A != null) {
            return this.f19348A;
        }
        synchronized (this) {
            if (this.f19348A == null) {
                this.f19348A = new C1493o(this);
            }
            c1493o = this.f19348A;
        }
        return c1493o;
    }

    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: w */
    public final AbstractC1413d0 mo9468w() {
        C1421e0 c1421e0;
        if (this.f19356o != null) {
            return this.f19356o;
        }
        synchronized (this) {
            if (this.f19356o == null) {
                this.f19356o = new C1421e0(this);
            }
            c1421e0 = this.f19356o;
        }
        return c1421e0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: x */
    public final DictionaryDao mo9469x() {
        C1480m0 c1480m0;
        if (this.f19364w != null) {
            return this.f19364w;
        }
        synchronized (this) {
            if (this.f19364w == null) {
                this.f19364w = new C1480m0(this);
            }
            c1480m0 = this.f19364w;
        }
        return c1480m0;
    }

    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: y */
    public final AbstractC1529t0 mo9470y() {
        C1543v0 c1543v0;
        if (this.f19360s != null) {
            return this.f19360s;
        }
        synchronized (this) {
            if (this.f19360s == null) {
                this.f19360s = new C1543v0(this);
            }
            c1543v0 = this.f19360s;
        }
        return c1543v0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.lingq.shared.persistent.LingQDatabase
    /* JADX INFO: renamed from: z */
    public final LanguageStatsDao mo9471z() {
        C1422e1 c1422e1;
        if (this.f19361t != null) {
            return this.f19361t;
        }
        synchronized (this) {
            if (this.f19361t == null) {
                this.f19361t = new C1422e1(this);
            }
            c1422e1 = this.f19361t;
        }
        return c1422e1;
    }
}
