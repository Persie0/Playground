package p041c5;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import androidx.activity.result.C0204c;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5206f;
import dm.C5207g;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import no.C7814a0;
import p234l4.AbstractC7252b;
import p234l4.InterfaceC7251a;
import p338qd.C8573r0;
import p392t5.C9203i;
import sl.C9072e;

/* JADX INFO: renamed from: c5.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1728z extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9569c;

    /* JADX INFO: renamed from: d */
    public final Object f9570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728z(int i10) {
        super(14, 15);
        this.f9569c = i10;
        if (i10 == 1) {
            super(231, 232);
            this.f9570d = new C9203i(12);
        } else if (i10 != 2) {
            this.f9570d = new C7814a0();
        } else {
            super(236, 237);
            this.f9570d = new C8573r0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728z(int i10, Context context, int i11) {
        super(i10, i11);
        this.f9569c = 3;
        this.f9570d = context;
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
        int i10 = this.f9569c;
        Object obj = this.f9570d;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))", "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`", "DROP TABLE `WorkSpec`", "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                ((InterfaceC7251a) obj).mo14599j(frameworkSQLiteDatabase);
                return;
            case 1:
                C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE `Course`", "DROP TABLE `LibraryListAndLessonsJoin`", "DROP TABLE `LibraryListAndCoursesJoin`", "DROP TABLE `LessonCounter`");
                C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE `CourseCounter`", "DROP TABLE `CourseDownload`", "CREATE TABLE IF NOT EXISTS `LibraryData` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT, `description` TEXT, `pos` INTEGER NOT NULL, `url` TEXT, `imageUrl` TEXT, `originalImageUrl` TEXT, `sharedByImageUrl` TEXT, `providerImageUrl` TEXT, `providerName` TEXT, `sharedByName` TEXT, `level` TEXT, `newWordsCount` INTEGER NOT NULL, `lessonsCount` INTEGER NOT NULL, `owner` TEXT, `price` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `rosesCount` INTEGER NOT NULL, `duration` INTEGER, `collectionId` INTEGER, `collectionTitle` TEXT, `difficulty` REAL NOT NULL, `isAvailable` INTEGER NOT NULL, `tags` TEXT, `status` TEXT, `folders` TEXT, `progress` REAL, `isTaken` INTEGER, `lessonPreview` TEXT NOT NULL, `accent` TEXT, `source_type` TEXT, `source_name` TEXT, `source_url` TEXT, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_LibraryData_id_type` ON `LibraryData` (`id`, `type`)");
                C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `LibraryListAndCoursesLessonsJoin` (`codeWithLanguage` TEXT NOT NULL, `id` INTEGER NOT NULL, `type` TEXT NOT NULL, `order` INTEGER NOT NULL, `ofQuery` TEXT NOT NULL, PRIMARY KEY(`codeWithLanguage`, `id`))", "CREATE INDEX IF NOT EXISTS `index_LibraryListAndCoursesLessonsJoin_codeWithLanguage_id_type` ON `LibraryListAndCoursesLessonsJoin` (`codeWithLanguage`, `id`, `type`)", "CREATE TABLE IF NOT EXISTS `LibraryCounter` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `roseGiven` INTEGER NOT NULL, `progress` REAL, `listenTimes` REAL, `readTimes` REAL, `isTaken` INTEGER NOT NULL, `difficulty` REAL NOT NULL, `rosesCount` INTEGER NOT NULL, `newWordsCount` INTEGER NOT NULL, `knownWordsCount` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `lessonsCount` INTEGER NOT NULL, `isCompletelyTaken` INTEGER NOT NULL, PRIMARY KEY(`id`, `type`))", "CREATE INDEX IF NOT EXISTS `index_LibraryCounter_id_type` ON `LibraryCounter` (`id`, `type`)");
                C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `_new_Lesson` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL DEFAULT 'content', `url` TEXT, `pos` INTEGER NOT NULL, `title` TEXT, `description` TEXT, `pubDate` TEXT, `imageUrl` TEXT, `audioUrl` TEXT, `duration` INTEGER NOT NULL, `status` TEXT, `sharedDate` TEXT, `originalUrl` TEXT, `wordCount` INTEGER NOT NULL, `uniqueWordCount` INTEGER NOT NULL, `rosesCount` INTEGER NOT NULL, `lessonRating` REAL NOT NULL, `audioRating` REAL NOT NULL, `collectionId` INTEGER NOT NULL, `collectionTitle` TEXT, `transliteration` TEXT NOT NULL, `altScript` TEXT NOT NULL, `classicUrl` TEXT, `previousLessonId` INTEGER, `nextLessonId` INTEGER, `readTimes` REAL NOT NULL, `listenTimes` REAL NOT NULL, `isCompleted` INTEGER NOT NULL, `newWordsCount` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `isRoseGiven` INTEGER NOT NULL, `giveRoseUrl` TEXT, `price` INTEGER NOT NULL, `opened` INTEGER NOT NULL, `percentCompleted` REAL NOT NULL, `lastRoseReceived` TEXT, `sharedByName` TEXT, `isFavorite` INTEGER NOT NULL, `printUrl` TEXT, `videoUrl` TEXT, `exercises` TEXT, `notes` TEXT, `viewsCount` INTEGER NOT NULL, `providerName` TEXT, `providerDescription` TEXT, `originalImageUrl` TEXT, `providerImageUrl` TEXT, `sharedByImageUrl` TEXT, `isSharedByIsFriend` INTEGER NOT NULL, `isCanEdit` INTEGER NOT NULL, `lessonVotes` INTEGER NOT NULL, `audioVotes` INTEGER NOT NULL, `level` TEXT, `tags` TEXT, `progressDownloaded` INTEGER NOT NULL, `progress` REAL, `translationSentence` TEXT NOT NULL, `mediaImageUrl` TEXT, `mediaTitle` TEXT, `ptime` TEXT, `isPinned` INTEGER, `difficulty` REAL NOT NULL, `newWords` INTEGER NOT NULL, `lessonPreview` TEXT NOT NULL, `isTaken` INTEGER, `folders` TEXT, `audioPending` INTEGER, `userLiked_username` TEXT, `userLiked_liked` INTEGER, `userCompleted_username` TEXT, `userCompleted_completed` INTEGER, `translation_language` TEXT, `translation_sentences` TEXT, `source_type` TEXT, `source_name` TEXT, `source_url` TEXT, PRIMARY KEY(`id`))", "INSERT INTO `_new_Lesson` (`id`,`url`,`pos`,`title`,`description`,`pubDate`,`imageUrl`,`audioUrl`,`duration`,`status`,`sharedDate`,`originalUrl`,`wordCount`,`uniqueWordCount`,`rosesCount`,`lessonRating`,`audioRating`,`collectionId`,`collectionTitle`,`transliteration`,`altScript`,`classicUrl`,`previousLessonId`,`nextLessonId`,`readTimes`,`listenTimes`,`isCompleted`,`newWordsCount`,`cardsCount`,`isRoseGiven`,`giveRoseUrl`,`price`,`opened`,`percentCompleted`,`lastRoseReceived`,`sharedByName`,`isFavorite`,`printUrl`,`videoUrl`,`exercises`,`notes`,`viewsCount`,`providerName`,`providerDescription`,`originalImageUrl`,`providerImageUrl`,`sharedByImageUrl`,`isSharedByIsFriend`,`isCanEdit`,`lessonVotes`,`audioVotes`,`level`,`tags`,`progressDownloaded`,`progress`,`translationSentence`,`mediaImageUrl`,`mediaTitle`,`ptime`,`isPinned`,`difficulty`,`newWords`,`lessonPreview`,`isTaken`,`folders`,`audioPending`,`userLiked_username`,`userLiked_liked`,`userCompleted_username`,`userCompleted_completed`,`translation_language`,`translation_sentences`,`source_type`,`source_name`,`source_url`) SELECT `contentId`,`url`,`pos`,`title`,`description`,`pubDate`,`imageUrl`,`audioUrl`,`duration`,`status`,`sharedDate`,`originalUrl`,`wordCount`,`uniqueWordCount`,`rosesCount`,`lessonRating`,`audioRating`,`collectionId`,`collectionTitle`,`transliteration`,`altScript`,`classicUrl`,`previousLessonId`,`nextLessonId`,`readTimes`,`listenTimes`,`isCompleted`,`newWordsCount`,`cardsCount`,`isRoseGiven`,`giveRoseUrl`,`price`,`opened`,`percentCompleted`,`lastRoseReceived`,`sharedByName`,`isFavorite`,`printUrl`,`videoUrl`,`exercises`,`notes`,`viewsCount`,`providerName`,`providerDescription`,`originalImageUrl`,`providerImageUrl`,`sharedByImageUrl`,`isSharedByIsFriend`,`isCanEdit`,`lessonVotes`,`audioVotes`,`level`,`tags`,`progressDownloaded`,`progress`,`translationSentence`,`mediaImageUrl`,`mediaTitle`,`ptime`,`isPinned`,`difficulty`,`newWords`,`lessonPreview`,`isTaken`,`folders`,`audioPending`,`userLiked_username`,`userLiked_liked`,`userCompleted_username`,`userCompleted_completed`,`translation_language`,`translation_sentences`,`source_type`,`source_name`,`source_url` FROM `Lesson`", "DROP TABLE `Lesson`", "ALTER TABLE `_new_Lesson` RENAME TO `Lesson`");
                C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_Lesson_id` ON `Lesson` (`id`)", "CREATE INDEX IF NOT EXISTS `index_Lesson_id_title_collectionTitle_imageUrl_cardsCount_uniqueWordCount_newWords_duration_isCompleted_percentCompleted` ON `Lesson` (`id`, `title`, `collectionTitle`, `imageUrl`, `cardsCount`, `uniqueWordCount`, `newWords`, `duration`, `isCompleted`, `percentCompleted`)", "CREATE TABLE IF NOT EXISTS `_new_TranslationSentence` (`index` INTEGER NOT NULL, `lessonId` INTEGER NOT NULL, `audio` REAL, `audioEnd` REAL, `text` TEXT NOT NULL, `translations` TEXT NOT NULL, PRIMARY KEY(`index`, `lessonId`), FOREIGN KEY(`lessonId`) REFERENCES `Lesson`(`id`) ON UPDATE CASCADE ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED)", "INSERT INTO `_new_TranslationSentence` (`index`,`lessonId`,`audio`,`audioEnd`,`text`,`translations`) SELECT `index`,`lessonId`,`audio`,`audioEnd`,`text`,`translations` FROM `TranslationSentence`");
                frameworkSQLiteDatabase.mo4600u("DROP TABLE `TranslationSentence`");
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `_new_TranslationSentence` RENAME TO `TranslationSentence`");
                frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_TranslationSentence_index_lessonId` ON `TranslationSentence` (`index`, `lessonId`)");
                Cursor cursorMo4599o0 = frameworkSQLiteDatabase.mo4599o0("PRAGMA foreign_key_check(`TranslationSentence`)");
                try {
                    Cursor cursor = cursorMo4599o0;
                    if (cursor.getCount() <= 0) {
                        C9072e c9072e = C9072e.f47360a;
                        C5206f.m11032z0(cursorMo4599o0, null);
                        frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS `_new_LessonAudioDownload` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `isDownloaded` INTEGER NOT NULL, `downloadProgress` INTEGER NOT NULL, PRIMARY KEY(`id`, `language`))");
                        frameworkSQLiteDatabase.mo4600u("INSERT INTO `_new_LessonAudioDownload` (`id`,`language`,`isDownloaded`,`downloadProgress`) SELECT `contentId`,`language`,`isDownloaded`,`downloadProgress` FROM `LessonDownload`");
                        frameworkSQLiteDatabase.mo4600u("DROP TABLE `LessonDownload`");
                        frameworkSQLiteDatabase.mo4600u("ALTER TABLE `_new_LessonAudioDownload` RENAME TO `LessonAudioDownload`");
                        C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_LessonAudioDownload_id_language` ON `LessonAudioDownload` (`id`, `language`)", "CREATE TABLE IF NOT EXISTS `_new_LibraryDownload` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `type` TEXT NOT NULL DEFAULT 'content', `isDownloaded` INTEGER NOT NULL, `downloadProgress` INTEGER, PRIMARY KEY(`id`, `language`, `type`))", "INSERT INTO `_new_LibraryDownload` (`id`,`language`,`isDownloaded`) SELECT `contentId`,`language`,`isDownloaded` FROM `LessonDataDownload`", "DROP TABLE `LessonDataDownload`");
                        frameworkSQLiteDatabase.mo4600u("ALTER TABLE `_new_LibraryDownload` RENAME TO `LibraryDownload`");
                        frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_LibraryDownload_id_language_type` ON `LibraryDownload` (`id`, `language`, `type`)");
                        ((InterfaceC7251a) obj).mo14599j(frameworkSQLiteDatabase);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    int count = cursor.getCount();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (cursor.moveToNext()) {
                        if (cursor.isFirst()) {
                            sb2.append("Foreign key violation(s) detected in '");
                            sb2.append(cursor.getString(0));
                            sb2.append("'.\n");
                        }
                        String string = cursor.getString(3);
                        if (!linkedHashMap.containsKey(string)) {
                            C5207g.m11110e(string, "constraintIndex");
                            String string2 = cursor.getString(2);
                            C5207g.m11110e(string2, "cursor.getString(2)");
                            linkedHashMap.put(string, string2);
                        }
                    }
                    sb2.append("Number of different violations discovered: ");
                    sb2.append(linkedHashMap.keySet().size());
                    sb2.append("\nNumber of rows in violation: ");
                    sb2.append(count);
                    sb2.append("\nViolation(s) detected in the following constraint(s):\n");
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        sb2.append("\tParent Table = ");
                        sb2.append(str2);
                        sb2.append(", Foreign Key Constraint Index = ");
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    String string3 = sb2.toString();
                    C5207g.m11110e(string3, "StringBuilder().apply(builderAction).toString()");
                    throw new SQLiteConstraintException(string3);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C5206f.m11032z0(cursorMo4599o0, th2);
                        throw th3;
                    }
                }
            case 2:
                C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `_new_LibraryShelfAndContentJoin` (`codeWithLanguage` TEXT NOT NULL, `id` INTEGER NOT NULL, `type` TEXT NOT NULL, `order` INTEGER NOT NULL, `ofQuery` TEXT NOT NULL, PRIMARY KEY(`codeWithLanguage`, `id`, `type`))", "INSERT INTO `_new_LibraryShelfAndContentJoin` (`codeWithLanguage`,`id`,`type`,`order`,`ofQuery`) SELECT `codeWithLanguage`,`id`,`type`,`order`,`ofQuery` FROM `LibraryListAndCoursesLessonsJoin`", "DROP TABLE `LibraryListAndCoursesLessonsJoin`", "ALTER TABLE `_new_LibraryShelfAndContentJoin` RENAME TO `LibraryShelfAndContentJoin`");
                frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_LibraryShelfAndContentJoin_codeWithLanguage_id_type` ON `LibraryShelfAndContentJoin` (`codeWithLanguage`, `id`, `type`)");
                ((InterfaceC7251a) obj).mo14599j(frameworkSQLiteDatabase);
                return;
            default:
                if (this.f40734b >= 10) {
                    frameworkSQLiteDatabase.f7569a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    ((Context) obj).getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
        }
    }
}
