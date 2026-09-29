package ai;

import androidx.activity.result.C0204c;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: ai.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0082d extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082d(int i10) {
        super(225, 226);
        this.f216c = i10;
        if (i10 == 1) {
            super(229, 230);
            return;
        }
        if (i10 == 2) {
            super(234, 235);
            return;
        }
        if (i10 == 3) {
            super(238, 239);
            return;
        }
        if (i10 == 4) {
            super(242, 243);
        } else if (i10 != 5) {
        } else {
            super(248, 249);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        switch (this.f216c) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS `MilestoneStats` (`language` TEXT NOT NULL, `knownWords` INTEGER NOT NULL, `lingqs` INTEGER NOT NULL, `dailyScore` INTEGER NOT NULL, PRIMARY KEY(`language`))");
                break;
            case 1:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `TranslationSentence` ADD COLUMN `audioEnd` REAL DEFAULT NULL");
                break;
            case 2:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `StudyStats` ADD COLUMN `activityLevel` INTEGER NOT NULL DEFAULT 0");
                break;
            case 3:
                C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `_new_TranslationSentence` (`index` INTEGER NOT NULL, `lessonId` INTEGER NOT NULL, `audio` REAL, `audioEnd` REAL, `text` TEXT NOT NULL, `translations` TEXT NOT NULL, PRIMARY KEY(`index`, `lessonId`))", "INSERT INTO `_new_TranslationSentence` (`index`,`lessonId`,`audio`,`audioEnd`,`text`,`translations`) SELECT `index`,`lessonId`,`audio`,`audioEnd`,`text`,`translations` FROM `TranslationSentence`", "DROP TABLE `TranslationSentence`", "ALTER TABLE `_new_TranslationSentence` RENAME TO `TranslationSentence`");
                frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_TranslationSentence_index_lessonId` ON `TranslationSentence` (`index`, `lessonId`)");
                break;
            case 4:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `Challenge` ADD COLUMN `challengeLanguage` TEXT DEFAULT ''");
                break;
            default:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `LibraryData` ADD COLUMN `videoUrl` TEXT DEFAULT ''");
                break;
        }
    }
}
