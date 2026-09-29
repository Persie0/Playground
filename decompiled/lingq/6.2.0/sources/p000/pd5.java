package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pd5 extends ry5 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f55973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd5(int i, int i2, int i3) {
        super(i, i2);
        this.f55973c = i3;
    }

    @Override // p000.ry5
    /* JADX INFO: renamed from: b */
    public final void mo16783b(bk8 bk8Var) {
        switch (this.f55973c) {
            case 0:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `LibraryCounterEntity` ADD COLUMN `audioStart` REAL DEFAULT NULL", bk8Var, "ALTER TABLE `LibraryCounterEntity` ADD COLUMN `audioEnd` REAL DEFAULT NULL");
                break;
            case 1:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `StreakEntity` ADD COLUMN `brokenStreakDate` TEXT DEFAULT NULL");
                break;
            case 2:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `ChatSuggestionEntity` (`language` TEXT NOT NULL, `chatId` INTEGER NOT NULL, `position` INTEGER NOT NULL, `source` TEXT NOT NULL, `target` TEXT NOT NULL, PRIMARY KEY(`language`, `chatId`, `position`))", bk8Var, "CREATE INDEX IF NOT EXISTS `index_ChatSuggestionEntity_language_chatId` ON `ChatSuggestionEntity` (`language`, `chatId`)");
                break;
            case 3:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `LibraryDataEntity` ADD COLUMN `isArchived` INTEGER NOT NULL DEFAULT 0");
                break;
            case 4:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))", bk8Var, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE `WorkSpec`");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                break;
            case 5:
                g9a.m12433j(bk8Var, bk8Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))", bk8Var, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                AbstractC3695vr.m23496g(bk8Var, "DROP TABLE `WorkSpec`");
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                AbstractC3695vr.m23496g(bk8Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                break;
            case 6:
                g9a.m12433j(bk8Var, bk8Var, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807", bk8Var, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                break;
            case 7:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
                break;
            case 8:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
                break;
            case 9:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
                break;
            default:
                bk8Var.getClass();
                AbstractC3695vr.m23496g(bk8Var, "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
                break;
        }
    }
}
