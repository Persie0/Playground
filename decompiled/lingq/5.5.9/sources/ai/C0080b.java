package ai;

import androidx.activity.result.C0204c;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: ai.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0080b extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f214c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0080b(int i10) {
        super(222, 225);
        this.f214c = i10;
        if (i10 == 1) {
            super(227, 228);
            return;
        }
        if (i10 == 2) {
            super(240, 241);
        } else if (i10 != 3) {
        } else {
            super(245, 246);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        switch (this.f214c) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS `Notice` (`id` INTEGER NOT NULL, `language` TEXT NOT NULL, `title` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT NOT NULL, `noticeType` TEXT NOT NULL, `isShown` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 1:
                C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `_new_LanguageProgressChartEntry` (`metric` TEXT NOT NULL, `languageCode` TEXT NOT NULL, `period` TEXT NOT NULL DEFAULT 'last_7d', `name` TEXT NOT NULL, `daily` REAL NOT NULL, `cumulative` REAL NOT NULL, PRIMARY KEY(`languageCode`, `metric`, `name`, `period`))", "INSERT INTO `_new_LanguageProgressChartEntry` (`metric`,`languageCode`,`name`,`daily`,`cumulative`) SELECT `metric`,`languageCode`,`name`,`daily`,`cumulative` FROM `LanguageProgressChartEntry`", "DROP TABLE `LanguageProgressChartEntry`", "ALTER TABLE `_new_LanguageProgressChartEntry` RENAME TO `LanguageProgressChartEntry`");
                break;
            case 2:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `SharedByUser` ADD COLUMN `role` TEXT DEFAULT NULL");
                break;
            default:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `Lesson` ADD COLUMN `canEditSentence` INTEGER NOT NULL DEFAULT 0");
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `Lesson` ADD COLUMN `isProtected` INTEGER NOT NULL DEFAULT 1");
                break;
        }
    }
}
