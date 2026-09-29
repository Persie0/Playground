package ai;

import androidx.activity.result.C0204c;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: ai.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0081c extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081c(int i10) {
        super(222, 226);
        this.f215c = i10;
        if (i10 == 1) {
            super(228, 229);
            return;
        }
        if (i10 == 2) {
            super(233, 234);
            return;
        }
        if (i10 == 3) {
            super(237, 238);
            return;
        }
        if (i10 == 4) {
            super(241, 242);
        } else if (i10 != 5) {
        } else {
            super(246, 247);
        }
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        switch (this.f215c) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS `MilestoneStats` (`language` TEXT NOT NULL, `knownWords` INTEGER NOT NULL, `lingqs` INTEGER NOT NULL, `dailyScore` INTEGER NOT NULL, PRIMARY KEY(`language`))");
                frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS `Notice` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `title` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT NOT NULL, `noticeType` TEXT NOT NULL, `isShown` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 1:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `LanguageContext` ADD COLUMN `feedLevels` TEXT DEFAULT NULL");
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `Shelf` ADD COLUMN `levels` TEXT NOT NULL DEFAULT ''");
                break;
            case 2:
                C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `_new_ChallengeStats` (`language` TEXT NOT NULL, `challengeCode` TEXT NOT NULL, `code` TEXT NOT NULL, `title` TEXT NOT NULL, `progress` REAL NOT NULL, `actual` REAL NOT NULL, `target` REAL NOT NULL, PRIMARY KEY(`challengeCode`, `code`, `language`))", "INSERT INTO `_new_ChallengeStats` (`language`,`challengeCode`,`code`,`title`,`progress`,`actual`,`target`) SELECT `language`,`challengeCode`,`code`,`title`,`progress`,`actual`,`target` FROM `ChallengeStats`", "DROP TABLE `ChallengeStats`", "ALTER TABLE `_new_ChallengeStats` RENAME TO `ChallengeStats`");
                frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_ChallengeStats_challengeCode_code_language` ON `ChallengeStats` (`challengeCode`, `code`, `language`)");
                break;
            case 3:
                C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `_new_LibraryData` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT, `description` TEXT, `pos` INTEGER NOT NULL, `url` TEXT, `imageUrl` TEXT, `originalImageUrl` TEXT, `sharedByImageUrl` TEXT, `providerImageUrl` TEXT, `providerName` TEXT, `sharedByName` TEXT, `level` TEXT, `newWordsCount` INTEGER NOT NULL, `lessonsCount` INTEGER NOT NULL, `owner` TEXT, `price` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `rosesCount` INTEGER NOT NULL, `duration` INTEGER, `collectionId` INTEGER, `collectionTitle` TEXT, `difficulty` REAL NOT NULL, `isAvailable` INTEGER NOT NULL, `tags` TEXT, `status` TEXT, `folders` TEXT, `progress` REAL, `isTaken` INTEGER, `lessonPreview` TEXT NOT NULL, `accent` TEXT, `audioUrl` TEXT DEFAULT '', `listenTimes` REAL NOT NULL DEFAULT 0.0, `readTimes` REAL NOT NULL DEFAULT 0.0, `isCompleted` INTEGER NOT NULL DEFAULT 0, `isFavorite` INTEGER NOT NULL DEFAULT 0, `source_type` TEXT, `source_name` TEXT, `source_url` TEXT, PRIMARY KEY(`id`, `type`))", "INSERT INTO `_new_LibraryData` (`id`,`type`,`title`,`description`,`pos`,`url`,`imageUrl`,`originalImageUrl`,`sharedByImageUrl`,`providerImageUrl`,`providerName`,`sharedByName`,`level`,`newWordsCount`,`lessonsCount`,`owner`,`price`,`cardsCount`,`rosesCount`,`duration`,`collectionId`,`collectionTitle`,`difficulty`,`isAvailable`,`tags`,`status`,`folders`,`progress`,`isTaken`,`lessonPreview`,`accent`,`audioUrl`,`listenTimes`,`readTimes`,`isCompleted`,`isFavorite`,`source_type`,`source_name`,`source_url`) SELECT `id`,`type`,`title`,`description`,`pos`,`url`,`imageUrl`,`originalImageUrl`,`sharedByImageUrl`,`providerImageUrl`,`providerName`,`sharedByName`,`level`,`newWordsCount`,`lessonsCount`,`owner`,`price`,`cardsCount`,`rosesCount`,`duration`,`collectionId`,`collectionTitle`,`difficulty`,`isAvailable`,`tags`,`status`,`folders`,`progress`,`isTaken`,`lessonPreview`,`accent`,`audioUrl`,`listenTimes`,`readTimes`,`isCompleted`,`isFavorite`,`source_type`,`source_name`,`source_url` FROM `LibraryData`", "DROP TABLE `LibraryData`", "ALTER TABLE `_new_LibraryData` RENAME TO `LibraryData`");
                frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_LibraryData_id_type` ON `LibraryData` (`id`, `type`)");
                break;
            case 4:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `Challenge` ADD COLUMN `knownWords` INTEGER NOT NULL DEFAULT 0");
                break;
            default:
                frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS `Referral` (`pk` INTEGER NOT NULL, `username` TEXT, `photo` TEXT, `dateJoined` TEXT, PRIMARY KEY(`pk`))");
                break;
        }
    }
}
