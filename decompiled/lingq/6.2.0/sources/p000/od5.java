package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
public final class od5 extends ry5 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f54211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od5(int i, int i2, int i3) {
        super(i, i2);
        this.f54211c = i3;
    }

    @Override // p000.ry5
    /* JADX INFO: renamed from: b */
    public final void mo16783b(bk8 bk8Var) {
        switch (this.f54211c) {
            case 0:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LanguageProgressEntity` ADD COLUMN `earnedCoins` INTEGER NOT NULL DEFAULT 0", bk8Var, "ALTER TABLE `LanguageProgressEntity` ADD COLUMN `earnedCoinsGoal` INTEGER NOT NULL DEFAULT 0");
                break;
            case 1:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LanguageProgressEntity` ADD COLUMN `wpm` INTEGER NOT NULL DEFAULT 0", bk8Var, "ALTER TABLE `LanguageProgressEntity` ADD COLUMN `studyTime` INTEGER NOT NULL DEFAULT 0");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LanguageStatsEntity` (`languageAndPeriod` TEXT NOT NULL, `language` TEXT NOT NULL, `period` TEXT NOT NULL, `lessonCompleted_overall` INTEGER NOT NULL, `lessonCompleted_change` INTEGER NOT NULL, `speakingUsage_overall` INTEGER NOT NULL, `speakingUsage_change` INTEGER NOT NULL, `coinWords_overall` INTEGER NOT NULL, `coinWords_change` INTEGER NOT NULL, `lessonShared_overall` INTEGER NOT NULL, `lessonShared_change` INTEGER NOT NULL, `translationsShared_overall` INTEGER NOT NULL, `translationsShared_change` INTEGER NOT NULL, `lessonPublished_overall` INTEGER NOT NULL, `lessonPublished_change` INTEGER NOT NULL, `studyTime_overall` INTEGER NOT NULL, `studyTime_change` INTEGER NOT NULL, `wpm_overall` INTEGER NOT NULL, `wpm_change` INTEGER NOT NULL, `lessonTaken_overall` INTEGER NOT NULL, `lessonTaken_change` INTEGER NOT NULL, `translationsCreated_overall` INTEGER NOT NULL, `translationsCreated_change` INTEGER NOT NULL, `learnedWords_overall` INTEGER NOT NULL, `learnedWords_change` INTEGER NOT NULL, `readingUsage_overall` INTEGER NOT NULL, `readingUsage_change` INTEGER NOT NULL, `listening_overall` INTEGER NOT NULL, `listening_change` INTEGER NOT NULL, `earnedCoins_overall` INTEGER NOT NULL, `earnedCoins_change` INTEGER NOT NULL, `coinsRead_overall` INTEGER NOT NULL, `coinsRead_change` INTEGER NOT NULL, `reviewUsage_overall` INTEGER NOT NULL, `reviewUsage_change` INTEGER NOT NULL, `listeningUsage_overall` INTEGER NOT NULL, `listeningUsage_change` INTEGER NOT NULL, `writing_overall` INTEGER NOT NULL, `writing_change` INTEGER NOT NULL, `createdLingQs_overall` INTEGER NOT NULL, `createdLingQs_change` INTEGER NOT NULL, `knownWords_overall` INTEGER NOT NULL, `knownWords_change` INTEGER NOT NULL, `lessonImported_overall` INTEGER NOT NULL, `lessonImported_change` INTEGER NOT NULL, `translationsUsed_overall` INTEGER NOT NULL, `translationsUsed_change` INTEGER NOT NULL, `reading_overall` INTEGER NOT NULL, `reading_change` INTEGER NOT NULL, `coinsListen_overall` INTEGER NOT NULL, `coinsListen_change` INTEGER NOT NULL, `speaking_overall` INTEGER NOT NULL, `speaking_change` INTEGER NOT NULL, PRIMARY KEY(`languageAndPeriod`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LanguageStatsEntity_languageAndPeriod` ON `LanguageStatsEntity` (`languageAndPeriod`)");
                break;
            case 2:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `StatsCalendarEntity` (`language` TEXT NOT NULL, `dailyGoal` INTEGER NOT NULL, `month` INTEGER NOT NULL, `year` INTEGER NOT NULL, `stats` TEXT, PRIMARY KEY(`language`, `month`, `year`))");
                break;
            case 3:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `_new_LanguageStatsEntity` (`languageAndPeriod` TEXT NOT NULL, `language` TEXT NOT NULL, `period` TEXT NOT NULL, `lessonCompleted_overall` REAL NOT NULL, `lessonCompleted_change` REAL NOT NULL, `speakingUsage_overall` REAL NOT NULL, `speakingUsage_change` REAL NOT NULL, `coinWords_overall` REAL NOT NULL, `coinWords_change` REAL NOT NULL, `lessonShared_overall` REAL NOT NULL, `lessonShared_change` REAL NOT NULL, `translationsShared_overall` REAL NOT NULL, `translationsShared_change` REAL NOT NULL, `lessonPublished_overall` REAL NOT NULL, `lessonPublished_change` REAL NOT NULL, `studyTime_overall` REAL NOT NULL, `studyTime_change` REAL NOT NULL, `wpm_overall` REAL NOT NULL, `wpm_change` REAL NOT NULL, `lessonTaken_overall` REAL NOT NULL, `lessonTaken_change` REAL NOT NULL, `translationsCreated_overall` REAL NOT NULL, `translationsCreated_change` REAL NOT NULL, `learnedWords_overall` REAL NOT NULL, `learnedWords_change` REAL NOT NULL, `readingUsage_overall` REAL NOT NULL, `readingUsage_change` REAL NOT NULL, `listening_overall` REAL NOT NULL, `listening_change` REAL NOT NULL, `earnedCoins_overall` REAL NOT NULL, `earnedCoins_change` REAL NOT NULL, `coinsRead_overall` REAL NOT NULL, `coinsRead_change` REAL NOT NULL, `reviewUsage_overall` REAL NOT NULL, `reviewUsage_change` REAL NOT NULL, `listeningUsage_overall` REAL NOT NULL, `listeningUsage_change` REAL NOT NULL, `writing_overall` REAL NOT NULL, `writing_change` REAL NOT NULL, `createdLingQs_overall` REAL NOT NULL, `createdLingQs_change` REAL NOT NULL, `knownWords_overall` REAL NOT NULL, `knownWords_change` REAL NOT NULL, `lessonImported_overall` REAL NOT NULL, `lessonImported_change` REAL NOT NULL, `translationsUsed_overall` REAL NOT NULL, `translationsUsed_change` REAL NOT NULL, `reading_overall` REAL NOT NULL, `reading_change` REAL NOT NULL, `coinsListen_overall` REAL NOT NULL, `coinsListen_change` REAL NOT NULL, `speaking_overall` REAL NOT NULL, `speaking_change` REAL NOT NULL, PRIMARY KEY(`languageAndPeriod`))", bk8Var, "INSERT INTO `_new_LanguageStatsEntity` (`languageAndPeriod`,`language`,`period`,`lessonCompleted_overall`,`lessonCompleted_change`,`speakingUsage_overall`,`speakingUsage_change`,`coinWords_overall`,`coinWords_change`,`lessonShared_overall`,`lessonShared_change`,`translationsShared_overall`,`translationsShared_change`,`lessonPublished_overall`,`lessonPublished_change`,`studyTime_overall`,`studyTime_change`,`wpm_overall`,`wpm_change`,`lessonTaken_overall`,`lessonTaken_change`,`translationsCreated_overall`,`translationsCreated_change`,`learnedWords_overall`,`learnedWords_change`,`readingUsage_overall`,`readingUsage_change`,`listening_overall`,`listening_change`,`earnedCoins_overall`,`earnedCoins_change`,`coinsRead_overall`,`coinsRead_change`,`reviewUsage_overall`,`reviewUsage_change`,`listeningUsage_overall`,`listeningUsage_change`,`writing_overall`,`writing_change`,`createdLingQs_overall`,`createdLingQs_change`,`knownWords_overall`,`knownWords_change`,`lessonImported_overall`,`lessonImported_change`,`translationsUsed_overall`,`translationsUsed_change`,`reading_overall`,`reading_change`,`coinsListen_overall`,`coinsListen_change`,`speaking_overall`,`speaking_change`) SELECT `languageAndPeriod`,`language`,`period`,`lessonCompleted_overall`,`lessonCompleted_change`,`speakingUsage_overall`,`speakingUsage_change`,`coinWords_overall`,`coinWords_change`,`lessonShared_overall`,`lessonShared_change`,`translationsShared_overall`,`translationsShared_change`,`lessonPublished_overall`,`lessonPublished_change`,`studyTime_overall`,`studyTime_change`,`wpm_overall`,`wpm_change`,`lessonTaken_overall`,`lessonTaken_change`,`translationsCreated_overall`,`translationsCreated_change`,`learnedWords_overall`,`learnedWords_change`,`readingUsage_overall`,`readingUsage_change`,`listening_overall`,`listening_change`,`earnedCoins_overall`,`earnedCoins_change`,`coinsRead_overall`,`coinsRead_change`,`reviewUsage_overall`,`reviewUsage_change`,`listeningUsage_overall`,`listeningUsage_change`,`writing_overall`,`writing_change`,`createdLingQs_overall`,`createdLingQs_change`,`knownWords_overall`,`knownWords_change`,`lessonImported_overall`,`lessonImported_change`,`translationsUsed_overall`,`translationsUsed_change`,`reading_overall`,`reading_change`,`coinsListen_overall`,`coinsListen_change`,`speaking_overall`,`speaking_change` FROM `LanguageStatsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE `LanguageStatsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `_new_LanguageStatsEntity` RENAME TO `LanguageStatsEntity`");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LanguageStatsEntity_languageAndPeriod` ON `LanguageStatsEntity` (`languageAndPeriod`)");
                break;
            case 4:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `ChallengeRankingEntity` ADD COLUMN `bookTitle` TEXT NOT NULL DEFAULT ''", bk8Var, "ALTER TABLE `ChallengeRankingEntity` ADD COLUMN `bookLanguage` TEXT NOT NULL DEFAULT ''");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `ChallengeStatsEntity` ADD COLUMN `bookId` INTEGER NOT NULL DEFAULT 0");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `ChallengeStatsEntity` ADD COLUMN `bookImage` TEXT NOT NULL DEFAULT ''");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `ChallengeStatsEntity` ADD COLUMN `bookLanguage` TEXT NOT NULL DEFAULT ''");
                break;
            case 5:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LibraryDataEntity` ADD COLUMN `lessonsSortBy` TEXT DEFAULT ''", bk8Var, "CREATE TABLE IF NOT EXISTS `ChatHistoryEntity` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `image` TEXT NOT NULL, `coins` REAL NOT NULL, `targetLanguage` TEXT NOT NULL, `dictionaryLanguage` TEXT NOT NULL, `startedAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `history` TEXT NOT NULL, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatHistoryEntity_id` ON `ChatHistoryEntity` (`id`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChatStatsEntity` (`id` INTEGER NOT NULL, `sentences` INTEGER NOT NULL, `knownWords` INTEGER NOT NULL, `totalWords` INTEGER NOT NULL, `uniqueWords` INTEGER NOT NULL, `cards` INTEGER NOT NULL, `coins` REAL NOT NULL, PRIMARY KEY(`id`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatStatsEntity_id` ON `ChatStatsEntity` (`id`)");
                break;
            case 6:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `ChatLessonJoin` (`chatId` INTEGER NOT NULL, `lessonId` INTEGER NOT NULL, PRIMARY KEY(`chatId`))", bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatLessonJoin_chatId` ON `ChatLessonJoin` (`chatId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `SearchChatHistoryJoin` (`query` TEXT NOT NULL, `chatId` INTEGER NOT NULL, PRIMARY KEY(`query`, `chatId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_SearchChatHistoryJoin_query_chatId` ON `SearchChatHistoryJoin` (`query`, `chatId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `ChatSentenceEntity` (`chatId` INTEGER NOT NULL, `messageIndex` INTEGER NOT NULL, `index` INTEGER NOT NULL, `tokens` TEXT NOT NULL, `text` TEXT, `normalizedText` TEXT, `timestamp` TEXT, `startParagraph` INTEGER NOT NULL, `url` TEXT, `opentag` TEXT, PRIMARY KEY(`chatId`, `messageIndex`, `index`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatSentenceEntity_chatId_messageIndex_index` ON `ChatSentenceEntity` (`chatId`, `messageIndex`, `index`)");
                break;
            case 7:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `TtsVoiceEntity` ADD COLUMN `isPremium` INTEGER NOT NULL DEFAULT 0", bk8Var, "ALTER TABLE `TtsVoiceEntity` ADD COLUMN `freeTrial` INTEGER NOT NULL DEFAULT 0");
                break;
            case 8:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `TtsVoiceEntity` ADD COLUMN `accentCode` TEXT DEFAULT NULL", bk8Var, "ALTER TABLE `TtsVoiceEntity` ADD COLUMN `isSelectable` INTEGER NOT NULL DEFAULT 0");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `TtsVoiceEntity` ADD COLUMN `tags` TEXT NOT NULL DEFAULT ''");
                break;
            case 9:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonPreviewEntity` (`lessonId` INTEGER NOT NULL, `preview` TEXT NOT NULL, PRIMARY KEY(`lessonId`))");
                break;
            case 10:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `CardEntity` ADD COLUMN `chunk` TEXT DEFAULT NULL");
                break;
            case 11:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LessonBookmarkEntity` ADD COLUMN `completedWordIndex` INTEGER DEFAULT NULL", bk8Var, "ALTER TABLE `LessonBookmarkEntity` ADD COLUMN `audioPosition` REAL DEFAULT NULL");
                break;
            case 12:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LessonAudioDownloadEntity` ADD COLUMN `status` TEXT NOT NULL DEFAULT 'idle'", bk8Var, "ALTER TABLE `LessonAudioDownloadEntity` ADD COLUMN `errorType` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LessonAudioDownloadEntity` ADD COLUMN `lastUpdated` INTEGER NOT NULL DEFAULT 0");
                break;
            case 13:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `CardEntity` ADD COLUMN `creationDate` TEXT DEFAULT NULL");
                break;
            case 14:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonAchievementEntity` (`lessonId` INTEGER NOT NULL, `language` TEXT NOT NULL, `type` TEXT NOT NULL, `dataJson` TEXT NOT NULL, PRIMARY KEY(`lessonId`, `language`, `type`))");
                break;
            case 15:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonSentenceTranslationEntity` (`lessonId` INTEGER NOT NULL, `sentenceIndex` INTEGER NOT NULL, `text` TEXT NOT NULL, PRIMARY KEY(`lessonId`, `sentenceIndex`))");
                break;
            case 16:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `TranslationSentenceEntity` ADD COLUMN `notes` TEXT NOT NULL DEFAULT '[]'");
                break;
            case 17:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `OfferEntity` ADD COLUMN `visibility` TEXT NOT NULL DEFAULT 'Public'", bk8Var, "ALTER TABLE `OfferEntity` ADD COLUMN `dateCountdown` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `OfferEntity` ADD COLUMN `tier` INTEGER DEFAULT NULL");
                break;
            case 18:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LessonStatsEntity` ADD COLUMN `studyTime` REAL NOT NULL DEFAULT 0.0", bk8Var, "ALTER TABLE `LessonStatsEntity` ADD COLUMN `wpm` REAL NOT NULL DEFAULT 0.0");
                break;
            case 19:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `VocabularyOrderEntity` (`termWithLanguage` TEXT NOT NULL, `sortPosition` INTEGER NOT NULL, PRIMARY KEY(`termWithLanguage`))", bk8Var, "CREATE INDEX IF NOT EXISTS `index_VocabularyOrderEntity_termWithLanguage` ON `VocabularyOrderEntity` (`termWithLanguage`)");
                break;
            case 20:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `OfferEntity` ADD COLUMN `countdownEnabled` INTEGER NOT NULL DEFAULT 1", bk8Var, "ALTER TABLE `OfferEntity` ADD COLUMN `countdownEnded` INTEGER NOT NULL DEFAULT 0");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `OfferEntity` ADD COLUMN `isActive` INTEGER NOT NULL DEFAULT 1");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `OfferEntity` ADD COLUMN `ctaText` TEXT DEFAULT NULL");
                break;
            case 21:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LanguageContextEntity` ADD COLUMN `scheduledForDeletion` INTEGER DEFAULT 0", bk8Var, "ALTER TABLE `LanguageEntity` ADD COLUMN `id` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LanguageEntity` ADD COLUMN `scheduledForDeletion` INTEGER DEFAULT 0");
                break;
            case 22:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `OfferEntity` ADD COLUMN `trialHeader` TEXT NOT NULL DEFAULT ''");
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryDataEntity` ADD COLUMN `isSubscribed` INTEGER DEFAULT NULL");
                break;
            case 24:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryDataEntity` ADD COLUMN `originalUrl` TEXT DEFAULT ''");
                break;
            case 25:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonCoachChatEntity` (`lessonId` INTEGER NOT NULL, `chatId` INTEGER NOT NULL, `messageIndex` INTEGER NOT NULL, `message` TEXT NOT NULL, PRIMARY KEY(`lessonId`))");
                break;
            case 26:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `CupEntity` (`id` INTEGER NOT NULL, `active` INTEGER NOT NULL, `ended` INTEGER NOT NULL, `startsAt` TEXT, `endsAt` TEXT, `joined` INTEGER NOT NULL, `champion` TEXT, `team` TEXT, `my` TEXT, `today` TEXT, `teams` TEXT NOT NULL, PRIMARY KEY(`id`))", bk8Var, "CREATE TABLE IF NOT EXISTS `CupPrizeEntity` (`date` TEXT NOT NULL, `kind` TEXT NOT NULL, `source` TEXT NOT NULL, `value` INTEGER NOT NULL, `label` TEXT NOT NULL, `claim` TEXT, PRIMARY KEY(`date`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CupTeamEntity` (`teamCode` TEXT NOT NULL, `name` TEXT NOT NULL, `totalCoins` INTEGER NOT NULL, `coinsPerUser` REAL NOT NULL, `participantCount` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `prevRank` INTEGER, `delta` INTEGER, PRIMARY KEY(`teamCode`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CupContributorEntity` (`profileId` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `prevRank` INTEGER, `delta` INTEGER, `username` TEXT NOT NULL, `photoUrl` TEXT, `teamCode` TEXT NOT NULL, `score` INTEGER NOT NULL, PRIMARY KEY(`profileId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CupContributorMeEntity` (`id` INTEGER NOT NULL, `rank` INTEGER, `score` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `BadgeEntity` ADD COLUMN `imageUrl` TEXT DEFAULT NULL");
                break;
            case 28:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CollectionSubscriptionEntity` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`id`, `language`))");
                break;
            default:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LanguageContextEntity` ADD COLUMN `streakGoal` INTEGER DEFAULT NULL");
                break;
        }
    }
}
