package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
public final class nd5 extends ry5 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f52623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nd5(int i, int i2, int i3) {
        super(i, i2);
        this.f52623c = i3;
    }

    @Override // p000.ry5
    /* JADX INFO: renamed from: b */
    public final void mo16783b(bk8 bk8Var) {
        switch (this.f52623c) {
            case 0:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `_new_TranslationSentence` (`index` INTEGER NOT NULL, `lessonId` INTEGER NOT NULL, `audio` REAL, `audioEnd` REAL, `text` TEXT NOT NULL, `translations` TEXT NOT NULL, PRIMARY KEY(`index`, `lessonId`))", bk8Var, "INSERT INTO `_new_TranslationSentence` (`index`,`lessonId`,`audio`,`audioEnd`,`text`,`translations`) SELECT `index`,`lessonId`,`audio`,`audioEnd`,`text`,`translations` FROM `TranslationSentence`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE `TranslationSentence`");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `_new_TranslationSentence` RENAME TO `TranslationSentence`");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_TranslationSentence_index_lessonId` ON `TranslationSentence` (`index`, `lessonId`)");
                break;
            case 1:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `providerId` INTEGER DEFAULT NULL", bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `sharedById` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `sharedByRole` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `providerId` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `providerDescription` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `sharedById` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `sharedByRole` TEXT DEFAULT NULL");
                break;
            case 2:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `SharedByUser` ADD COLUMN `role` TEXT DEFAULT NULL");
                break;
            case 3:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Challenge` ADD COLUMN `knownWords` INTEGER NOT NULL DEFAULT 0");
                break;
            case 4:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Challenge` ADD COLUMN `challengeLanguage` TEXT DEFAULT ''");
                break;
            case 5:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LanguageProgressChartEntry` ADD COLUMN `position` INTEGER NOT NULL DEFAULT 0");
                break;
            case 6:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `canEditSentence` INTEGER NOT NULL DEFAULT 0", bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `isProtected` INTEGER NOT NULL DEFAULT 1");
                break;
            case 7:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `Referral` (`pk` INTEGER NOT NULL, `username` TEXT, `photo` TEXT, `dateJoined` TEXT, PRIMARY KEY(`pk`))");
                break;
            case 8:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `videoUrl` TEXT DEFAULT ''");
                break;
            case 9:
                bk8Var.getClass();
                break;
            case 10:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `Card` ADD COLUMN `furigana` TEXT DEFAULT NULL", bk8Var, "ALTER TABLE `Card` ADD COLUMN `latin` TEXT DEFAULT NULL");
                break;
            case 11:
                bk8Var.getClass();
                break;
            case 12:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `promoted_course_ctaText` TEXT DEFAULT NULL", bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `promoted_course_description` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `promoted_course_ctaUrl` TEXT DEFAULT NULL");
                break;
            case 13:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `LessonStats` (`contentId` INTEGER NOT NULL, `readWords` REAL NOT NULL, `lingqsCreated` REAL NOT NULL, `knownWords` REAL NOT NULL, `listeningTime` REAL NOT NULL, `coinsNew` REAL NOT NULL, `earnedCoins` REAL NOT NULL, PRIMARY KEY(`contentId`))", bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonStats_contentId` ON `LessonStats` (`contentId`)");
                break;
            case 14:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `LessonStats` (`contentId` INTEGER NOT NULL, `readWords` REAL NOT NULL, `lingqsCreated` REAL NOT NULL, `knownWords` REAL NOT NULL, `listeningTime` REAL NOT NULL, `coinsNew` REAL NOT NULL, `earnedCoins` REAL NOT NULL, PRIMARY KEY(`contentId`))", bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonStats_contentId` ON `LessonStats` (`contentId`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CardsAndLOTDJoin` (`termWithLanguage` TEXT NOT NULL, `lotd` TEXT NOT NULL, PRIMARY KEY(`termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_CardsAndLOTDJoin_termWithLanguage` ON `CardsAndLOTDJoin` (`termWithLanguage`)");
                break;
            case 15:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `nextLesson_id` INTEGER DEFAULT NULL", bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `nextLesson_price` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `nextLesson_collectionTitle` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `nextLesson_isTaken` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `nextLesson_sharedById` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `nextLesson_status` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `nextLesson_title` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `nextLesson_image` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `nextLesson_duration` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `previousLesson_id` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `previousLesson_price` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `previousLesson_collectionTitle` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `previousLesson_isTaken` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `previousLesson_sharedById` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `previousLesson_status` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `previousLesson_title` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `previousLesson_image` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `previousLesson_duration` INTEGER DEFAULT NULL");
                break;
            case 16:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `LessonAndCardsFromJoin` (`contentId` INTEGER NOT NULL, `termWithLanguage` TEXT NOT NULL, PRIMARY KEY(`contentId`, `termWithLanguage`))", bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonAndCardsFromJoin_contentId_termWithLanguage` ON `LessonAndCardsFromJoin` (`contentId`, `termWithLanguage`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonAndWordsFromJoin` (`contentId` INTEGER NOT NULL, `termWithLanguage` TEXT NOT NULL, PRIMARY KEY(`contentId`, `termWithLanguage`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonAndWordsFromJoin_contentId_termWithLanguage` ON `LessonAndWordsFromJoin` (`contentId`, `termWithLanguage`)");
                break;
            case 17:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `metadata_importMethod` TEXT DEFAULT NULL");
                break;
            case 18:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LibraryCounter` ADD COLUMN `totalWordsCount` INTEGER NOT NULL DEFAULT 0", bk8Var, "ALTER TABLE `LibraryCounter` ADD COLUMN `uniqueWordsCount` INTEGER NOT NULL DEFAULT 0");
                break;
            case 19:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `CoursesAndLessonsSortJoin` (`pk` INTEGER NOT NULL, `contentId` INTEGER NOT NULL, `courseOrder` INTEGER NOT NULL, `sort` TEXT NOT NULL, PRIMARY KEY(`pk`, `contentId`, `sort`))", bk8Var, "CREATE INDEX IF NOT EXISTS `index_CoursesAndLessonsSortJoin_pk_contentId_sort` ON `CoursesAndLessonsSortJoin` (`pk`, `contentId`, `sort`)");
                break;
            case 20:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `isLocked` TEXT DEFAULT NULL", bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `simplified_to_status` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `simplified_to_isLocked` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `simplified_to_id` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `simplified_by_status` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `simplified_by_isLocked` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `simplified_by_id` INTEGER DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `isLocked` TEXT DEFAULT NULL");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonsSimplifiedJoin` (`fromId` INTEGER NOT NULL, `toId` INTEGER, `isLocked` INTEGER NOT NULL, PRIMARY KEY(`fromId`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LessonsSimplifiedJoin_fromId` ON `LessonsSimplifiedJoin` (`fromId`)");
                break;
            case 21:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `metadata_importLesson` TEXT DEFAULT NULL");
                break;
            case 22:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `LessonNext` (`id` INTEGER NOT NULL, `lessonId` INTEGER NOT NULL, `title` TEXT NOT NULL, `image` TEXT, `status` TEXT, `source_type` TEXT, `source_name` TEXT, `source_url` TEXT, PRIMARY KEY(`id`))");
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Shelf` ADD COLUMN `pinnedHard` INTEGER DEFAULT NULL");
                break;
            case 24:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `SourceBlacklist` (`name` TEXT NOT NULL, `language` TEXT NOT NULL, PRIMARY KEY(`name`, `language`))", bk8Var, "CREATE INDEX IF NOT EXISTS `index_SourceBlacklist_name_language` ON `SourceBlacklist` (`name`, `language`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `CourseBlacklist` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`id`, `language`))");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_CourseBlacklist_id_language` ON `CourseBlacklist` (`id`, `language`)");
                break;
            case 25:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryShelfEntity` ADD COLUMN `originalTitle` TEXT NOT NULL DEFAULT ''");
                break;
            case 26:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LessonEntity` ADD COLUMN `lastOpenTime` TEXT DEFAULT NULL");
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LessonEntity` ADD COLUMN `metadata_splittingMethod` TEXT DEFAULT NULL");
                break;
            case 28:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `CourseForImportEntity` ADD COLUMN `order` INTEGER NOT NULL DEFAULT 0");
                break;
            default:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `TokenCwtEntity` (`id` TEXT NOT NULL, `lessonId` INTEGER NOT NULL, `word` TEXT NOT NULL, `sentence` TEXT NOT NULL, `languageSrc` TEXT NOT NULL, `languageDst` TEXT NOT NULL, `translation` TEXT NOT NULL, `sentenceIndex` INTEGER NOT NULL, `sentenceTokenIndex` INTEGER NOT NULL, PRIMARY KEY(`id`))", bk8Var, "CREATE INDEX IF NOT EXISTS `index_TokenCwtEntity_id` ON `TokenCwtEntity` (`id`)");
                break;
        }
    }
}
