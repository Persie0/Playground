package p000;

import android.database.Cursor;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.work.OverwritingInputMerger;

/* JADX INFO: loaded from: classes.dex */
public final class sy5 extends ry5 {

    /* JADX INFO: renamed from: d */
    public static final sy5 f61617d = new sy5(11, 12, 0);

    /* JADX INFO: renamed from: e */
    public static final sy5 f61618e = new sy5(12, 13, 1);

    /* JADX INFO: renamed from: f */
    public static final sy5 f61619f = new sy5(15, 16, 2);

    /* JADX INFO: renamed from: g */
    public static final sy5 f61620g = new sy5(16, 17, 3);

    /* JADX INFO: renamed from: h */
    public static final sy5 f61621h = new sy5(1, 2, 4);

    /* JADX INFO: renamed from: i */
    public static final sy5 f61622i = new sy5(3, 4, 5);

    /* JADX INFO: renamed from: j */
    public static final sy5 f61623j = new sy5(4, 5, 6);

    /* JADX INFO: renamed from: k */
    public static final sy5 f61624k = new sy5(6, 7, 7);

    /* JADX INFO: renamed from: l */
    public static final sy5 f61625l = new sy5(7, 8, 8);

    /* JADX INFO: renamed from: m */
    public static final sy5 f61626m = new sy5(8, 9, 9);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f61627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sy5(int i, int i2, int i3) {
        super(i, i2);
        this.f61627c = i3;
    }

    @Override // p000.ry5
    /* JADX INFO: renamed from: a */
    public void mo18937a(xg3 xg3Var) {
        switch (this.f61627c) {
            case 0:
                xg3Var.getClass();
                xg3Var.m24498n("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
            case 1:
                xg3Var.getClass();
                xg3Var.m24498n("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                xg3Var.m24498n("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                break;
            case 2:
                xg3Var.getClass();
                xg3Var.m24498n("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                xg3Var.m24498n("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                xg3Var.m24498n("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                xg3Var.m24498n("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                xg3Var.m24498n("DROP TABLE `SystemIdInfo`");
                xg3Var.m24498n("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                break;
            case 3:
                xg3Var.getClass();
                xg3Var.m24498n(wk9.m24029L("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
                xg3Var.m24498n("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                xg3Var.m24498n("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                xg3Var.m24498n("DROP TABLE `WorkSpec`");
                xg3Var.m24498n("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                xg3Var.m24498n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                xg3Var.m24498n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                break;
            case 4:
                xg3Var.getClass();
                xg3Var.m24498n("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                xg3Var.m24498n("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                xg3Var.m24498n("DROP TABLE IF EXISTS alarmInfo");
                xg3Var.m24498n("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                break;
            case 5:
                xg3Var.getClass();
                xg3Var.m24498n("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                break;
            case 6:
                xg3Var.getClass();
                xg3Var.m24498n("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                xg3Var.m24498n("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            case 7:
                xg3Var.getClass();
                xg3Var.m24498n("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                break;
            case 8:
                xg3Var.getClass();
                xg3Var.m24498n("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                break;
            case 9:
                xg3Var.getClass();
                xg3Var.m24498n("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                break;
            case 10:
                xg3Var.getClass();
                xg3Var.m24498n("CREATE TABLE IF NOT EXISTS `_new_LibraryCounter` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `roseGiven` INTEGER NOT NULL, `progress` REAL, `listenTimes` REAL, `readTimes` REAL, `isTaken` INTEGER NOT NULL, `difficulty` REAL NOT NULL, `rosesCount` INTEGER NOT NULL, `newWordsCount` INTEGER NOT NULL, `knownWordsCount` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `lessonsCount` INTEGER NOT NULL, `isCompletelyTaken` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`, `type`))");
                xg3Var.m24498n("INSERT INTO `_new_LibraryCounter` (`listenTimes`,`isTaken`,`cardsCount`,`knownWordsCount`,`type`,`newWordsCount`,`lessonsCount`,`difficulty`,`readTimes`,`roseGiven`,`rosesCount`,`progress`,`id`) SELECT `listenTimes`,`isTaken`,`cardsCount`,`knownWordsCount`,`type`,`newWordsCount`,`lessonsCount`,`difficulty`,`readTimes`,`roseGiven`,`rosesCount`,`progress`,`id` FROM `LibraryCounter`");
                xg3Var.m24498n("DROP TABLE `LibraryCounter`");
                xg3Var.m24498n("ALTER TABLE `_new_LibraryCounter` RENAME TO `LibraryCounter`");
                xg3Var.m24498n("CREATE INDEX IF NOT EXISTS `index_LibraryCounter_id_type` ON `LibraryCounter` (`id`, `type`)");
                break;
            case 11:
                xg3Var.getClass();
                xg3Var.m24498n("ALTER TABLE `Card` ADD COLUMN `jyutping` TEXT DEFAULT NULL");
                break;
            case 12:
                xg3Var.getClass();
                xg3Var.m24498n("ALTER TABLE `Card` ADD COLUMN `gTags` TEXT NOT NULL DEFAULT ''");
                xg3Var.m24498n("ALTER TABLE `Word` ADD COLUMN `gTags` TEXT NOT NULL DEFAULT ''");
                break;
            case 13:
                xg3Var.getClass();
                if (!AbstractC3489q9.m19781k(xg3Var, "Sentence", "url")) {
                    xg3Var.m24498n("ALTER TABLE `Sentence` ADD COLUMN `url` TEXT DEFAULT NULL");
                }
                if (!AbstractC3489q9.m19781k(xg3Var, "Sentence", "opentag")) {
                    xg3Var.m24498n("ALTER TABLE `Sentence` ADD COLUMN `opentag` TEXT DEFAULT NULL");
                }
                break;
            case 14:
                xg3Var.getClass();
                xg3Var.m24498n("CREATE TABLE IF NOT EXISTS `ChatHistoryEntity` (`languageWithDictionary` TEXT NOT NULL, `level` TEXT NOT NULL, `targetLanguage` TEXT NOT NULL, `dictionaryLanguage` TEXT NOT NULL, `startedAt` TEXT NOT NULL, `expireAt` TEXT NOT NULL, `session` TEXT NOT NULL, `history` TEXT NOT NULL, PRIMARY KEY(`languageWithDictionary`))");
                xg3Var.m24498n("CREATE INDEX IF NOT EXISTS `index_ChatHistoryEntity_languageWithDictionary` ON `ChatHistoryEntity` (`languageWithDictionary`)");
                xg3Var.m24498n("CREATE TABLE IF NOT EXISTS `ChatStatsEntity` (`languageWithDictionary` TEXT NOT NULL, `sentences` INTEGER NOT NULL, `knownWords` INTEGER NOT NULL, `totalWords` INTEGER NOT NULL, `uniqueWords` INTEGER NOT NULL, `cards` INTEGER NOT NULL, PRIMARY KEY(`languageWithDictionary`))");
                xg3Var.m24498n("CREATE INDEX IF NOT EXISTS `index_ChatStatsEntity_languageWithDictionary` ON `ChatStatsEntity` (`languageWithDictionary`)");
                break;
            case 15:
                xg3Var.getClass();
                Cursor cursorM24501r = xg3Var.m24501r("PRAGMA table_info(CardEntity)");
                while (cursorM24501r.moveToNext()) {
                    int columnIndex = cursorM24501r.getColumnIndex("name");
                    if (columnIndex != -1 && fa4.m11650l(cursorM24501r.getString(columnIndex), "chunk")) {
                        xg3Var.m24498n("CREATE TABLE IF NOT EXISTS `OfferEntity` (\n    `id` INTEGER NOT NULL PRIMARY KEY,\n    `title` TEXT NOT NULL,\n    `code` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `visibility` TEXT NOT NULL DEFAULT 'Public',\n    `dateStart` TEXT NOT NULL,\n    `dateEnd` TEXT NOT NULL,\n    `dateCountdown` TEXT,\n    `tier` INTEGER,\n    `androidCoupon` TEXT,\n    `discount` TEXT NOT NULL,\n    `accentColorLight` TEXT NOT NULL,\n    `accentColorDark` TEXT NOT NULL,\n    `banners` TEXT NOT NULL\n)");
                        break;
                    }
                }
                xg3Var.m24498n("ALTER TABLE CardEntity ADD COLUMN `chunk` TEXT");
                xg3Var.m24498n("CREATE TABLE IF NOT EXISTS `OfferEntity` (\n    `id` INTEGER NOT NULL PRIMARY KEY,\n    `title` TEXT NOT NULL,\n    `code` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `visibility` TEXT NOT NULL DEFAULT 'Public',\n    `dateStart` TEXT NOT NULL,\n    `dateEnd` TEXT NOT NULL,\n    `dateCountdown` TEXT,\n    `tier` INTEGER,\n    `androidCoupon` TEXT,\n    `discount` TEXT NOT NULL,\n    `accentColorLight` TEXT NOT NULL,\n    `accentColorDark` TEXT NOT NULL,\n    `banners` TEXT NOT NULL\n)");
                break;
            case 16:
                xg3Var.getClass();
                if (!AbstractC3489q9.m19781k(xg3Var, "LessonAudioDownloadEntity", "status")) {
                    xg3Var.m24498n("ALTER TABLE LessonAudioDownloadEntity ADD COLUMN `status` TEXT NOT NULL DEFAULT 'idle'");
                }
                if (!AbstractC3489q9.m19781k(xg3Var, "LessonAudioDownloadEntity", "errorType")) {
                    xg3Var.m24498n("ALTER TABLE LessonAudioDownloadEntity ADD COLUMN `errorType` TEXT DEFAULT NULL");
                }
                if (!AbstractC3489q9.m19781k(xg3Var, "LessonAudioDownloadEntity", "lastUpdated")) {
                    xg3Var.m24498n("ALTER TABLE LessonAudioDownloadEntity ADD COLUMN `lastUpdated` INTEGER NOT NULL DEFAULT 0");
                }
                break;
            case 17:
                xg3Var.getClass();
                if (!AbstractC3489q9.m19781k(xg3Var, "OfferEntity", "visibility")) {
                    xg3Var.m24498n("ALTER TABLE OfferEntity ADD COLUMN `visibility` TEXT NOT NULL DEFAULT 'Public'");
                }
                if (!AbstractC3489q9.m19781k(xg3Var, "OfferEntity", "dateCountdown")) {
                    xg3Var.m24498n("ALTER TABLE OfferEntity ADD COLUMN `dateCountdown` TEXT");
                }
                if (!AbstractC3489q9.m19781k(xg3Var, "OfferEntity", "tier")) {
                    xg3Var.m24498n("ALTER TABLE OfferEntity ADD COLUMN `tier` INTEGER");
                }
                break;
            case 18:
                xg3Var.getClass();
                xg3Var.m24498n("DROP TABLE IF EXISTS `CupContributorEntity`");
                xg3Var.m24498n("DROP TABLE IF EXISTS `CupContributorMeEntity`");
                xg3Var.m24498n("CREATE TABLE IF NOT EXISTS `CupContributorEntity` (`scope` TEXT NOT NULL, `profileId` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `prevRank` INTEGER, `delta` INTEGER, `username` TEXT NOT NULL, `photoUrl` TEXT, `teamCode` TEXT NOT NULL, `score` INTEGER NOT NULL, PRIMARY KEY(`scope`, `profileId`))");
                xg3Var.m24498n("CREATE TABLE IF NOT EXISTS `CupContributorMeEntity` (`scope` TEXT NOT NULL, `rank` INTEGER, `score` INTEGER NOT NULL, PRIMARY KEY(`scope`))");
                break;
            default:
                super.mo18937a(xg3Var);
                break;
        }
    }

    @Override // p000.ry5
    /* JADX INFO: renamed from: b */
    public void mo16783b(bk8 bk8Var) {
        switch (this.f61627c) {
            case 19:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `Notice` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `title` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT NOT NULL, `noticeType` TEXT NOT NULL, `isShown` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 20:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `MilestoneStats` (`language` TEXT NOT NULL, `knownWords` INTEGER NOT NULL, `lingqs` INTEGER NOT NULL, `dailyScore` INTEGER NOT NULL, PRIMARY KEY(`language`))", bk8Var, "CREATE TABLE IF NOT EXISTS `Notice` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `title` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT NOT NULL, `noticeType` TEXT NOT NULL, `isShown` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 21:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS `MilestoneStats` (`language` TEXT NOT NULL, `knownWords` INTEGER NOT NULL, `lingqs` INTEGER NOT NULL, `dailyScore` INTEGER NOT NULL, PRIMARY KEY(`language`))");
                break;
            case 22:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `Lesson` ADD COLUMN `audioPending` INTEGER DEFAULT NULL");
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `_new_LanguageProgressChartEntry` (`metric` TEXT NOT NULL, `languageCode` TEXT NOT NULL, `period` TEXT NOT NULL DEFAULT 'last_7d', `name` TEXT NOT NULL, `daily` REAL NOT NULL, `cumulative` REAL NOT NULL, PRIMARY KEY(`languageCode`, `metric`, `name`, `period`))", bk8Var, "INSERT INTO `_new_LanguageProgressChartEntry` (`metric`,`languageCode`,`name`,`daily`,`cumulative`) SELECT `metric`,`languageCode`,`name`,`daily`,`cumulative` FROM `LanguageProgressChartEntry`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE `LanguageProgressChartEntry`");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `_new_LanguageProgressChartEntry` RENAME TO `LanguageProgressChartEntry`");
                break;
            case 24:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LanguageContext` ADD COLUMN `feedLevels` TEXT DEFAULT NULL", bk8Var, "ALTER TABLE `Shelf` ADD COLUMN `levels` TEXT NOT NULL DEFAULT ''");
                break;
            case 25:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `TranslationSentence` ADD COLUMN `audioEnd` REAL DEFAULT NULL");
                break;
            case 26:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `_new_ChallengeStats` (`language` TEXT NOT NULL, `challengeCode` TEXT NOT NULL, `code` TEXT NOT NULL, `title` TEXT NOT NULL, `progress` REAL NOT NULL, `actual` REAL NOT NULL, `target` REAL NOT NULL, PRIMARY KEY(`challengeCode`, `code`, `language`))", bk8Var, "INSERT INTO `_new_ChallengeStats` (`language`,`challengeCode`,`code`,`title`,`progress`,`actual`,`target`) SELECT `language`,`challengeCode`,`code`,`title`,`progress`,`actual`,`target` FROM `ChallengeStats`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE `ChallengeStats`");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `_new_ChallengeStats` RENAME TO `ChallengeStats`");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChallengeStats_challengeCode_code_language` ON `ChallengeStats` (`challengeCode`, `code`, `language`)");
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `StudyStats` ADD COLUMN `activityLevel` INTEGER NOT NULL DEFAULT 0");
                break;
            case 28:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `audioUrl` TEXT DEFAULT ''", bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `listenTimes` REAL NOT NULL DEFAULT 0.0");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `readTimes` REAL NOT NULL DEFAULT 0.0");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `isCompleted` INTEGER NOT NULL DEFAULT 0");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryData` ADD COLUMN `isFavorite` INTEGER NOT NULL DEFAULT 0");
                break;
            case 29:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `_new_LibraryData` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT, `description` TEXT, `pos` INTEGER NOT NULL, `url` TEXT, `imageUrl` TEXT, `originalImageUrl` TEXT, `sharedByImageUrl` TEXT, `providerImageUrl` TEXT, `providerName` TEXT, `sharedByName` TEXT, `level` TEXT, `newWordsCount` INTEGER NOT NULL, `lessonsCount` INTEGER NOT NULL, `owner` TEXT, `price` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `rosesCount` INTEGER NOT NULL, `duration` INTEGER, `collectionId` INTEGER, `collectionTitle` TEXT, `difficulty` REAL NOT NULL, `isAvailable` INTEGER NOT NULL, `tags` TEXT, `status` TEXT, `folders` TEXT, `progress` REAL, `isTaken` INTEGER, `lessonPreview` TEXT NOT NULL, `accent` TEXT, `audioUrl` TEXT DEFAULT '', `listenTimes` REAL NOT NULL DEFAULT 0.0, `readTimes` REAL NOT NULL DEFAULT 0.0, `isCompleted` INTEGER NOT NULL DEFAULT 0, `isFavorite` INTEGER NOT NULL DEFAULT 0, `source_type` TEXT, `source_name` TEXT, `source_url` TEXT, PRIMARY KEY(`id`, `type`))", bk8Var, "INSERT INTO `_new_LibraryData` (`id`,`type`,`title`,`description`,`pos`,`url`,`imageUrl`,`originalImageUrl`,`sharedByImageUrl`,`providerImageUrl`,`providerName`,`sharedByName`,`level`,`newWordsCount`,`lessonsCount`,`owner`,`price`,`cardsCount`,`rosesCount`,`duration`,`collectionId`,`collectionTitle`,`difficulty`,`isAvailable`,`tags`,`status`,`folders`,`progress`,`isTaken`,`lessonPreview`,`accent`,`audioUrl`,`listenTimes`,`readTimes`,`isCompleted`,`isFavorite`,`source_type`,`source_name`,`source_url`) SELECT `id`,`type`,`title`,`description`,`pos`,`url`,`imageUrl`,`originalImageUrl`,`sharedByImageUrl`,`providerImageUrl`,`providerName`,`sharedByName`,`level`,`newWordsCount`,`lessonsCount`,`owner`,`price`,`cardsCount`,`rosesCount`,`duration`,`collectionId`,`collectionTitle`,`difficulty`,`isAvailable`,`tags`,`status`,`folders`,`progress`,`isTaken`,`lessonPreview`,`accent`,`audioUrl`,`listenTimes`,`readTimes`,`isCompleted`,`isFavorite`,`source_type`,`source_name`,`source_url` FROM `LibraryData`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE `LibraryData`");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `_new_LibraryData` RENAME TO `LibraryData`");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_LibraryData_id_type` ON `LibraryData` (`id`, `type`)");
                break;
            default:
                super.mo16783b(bk8Var);
                break;
        }
    }
}
