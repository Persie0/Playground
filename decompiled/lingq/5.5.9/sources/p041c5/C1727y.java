package p041c5;

import androidx.activity.result.C0204c;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: c5.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1727y extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727y(int i10) {
        super(13, 14);
        this.f9568c = i10;
        if (i10 == 1) {
            super(226, 227);
            return;
        }
        if (i10 == 2) {
            super(235, 236);
            return;
        }
        if (i10 == 3) {
            super(239, 240);
            return;
        }
        if (i10 == 4) {
            super(243, 244);
        } else if (i10 != 5) {
        } else {
            super(249, 250);
        }
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        switch (this.f9568c) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))", "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`", "DROP TABLE `WorkSpec`", "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                break;
            case 1:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `Lesson` ADD COLUMN `audioPending` INTEGER DEFAULT NULL");
                break;
            case 2:
                C0204c.m860t(frameworkSQLiteDatabase, "ALTER TABLE `LibraryData` ADD COLUMN `audioUrl` TEXT DEFAULT ''", "ALTER TABLE `LibraryData` ADD COLUMN `listenTimes` REAL NOT NULL DEFAULT 0.0", "ALTER TABLE `LibraryData` ADD COLUMN `readTimes` REAL NOT NULL DEFAULT 0.0", "ALTER TABLE `LibraryData` ADD COLUMN `isCompleted` INTEGER NOT NULL DEFAULT 0");
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `LibraryData` ADD COLUMN `isFavorite` INTEGER NOT NULL DEFAULT 0");
                break;
            case 3:
                C0204c.m860t(frameworkSQLiteDatabase, "ALTER TABLE `Lesson` ADD COLUMN `providerId` INTEGER DEFAULT NULL", "ALTER TABLE `Lesson` ADD COLUMN `sharedById` TEXT DEFAULT NULL", "ALTER TABLE `Lesson` ADD COLUMN `sharedByRole` TEXT DEFAULT NULL", "ALTER TABLE `LibraryData` ADD COLUMN `providerId` INTEGER DEFAULT NULL");
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `LibraryData` ADD COLUMN `providerDescription` TEXT DEFAULT NULL");
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `LibraryData` ADD COLUMN `sharedById` TEXT DEFAULT NULL");
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `LibraryData` ADD COLUMN `sharedByRole` TEXT DEFAULT NULL");
                break;
            case 4:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE `LanguageProgressChartEntry` ADD COLUMN `position` INTEGER NOT NULL DEFAULT 0");
                break;
        }
    }
}
