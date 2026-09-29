package p041c5;

import androidx.activity.result.C0204c;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: c5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1710h extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public static final C1710h f9522c = new C1710h();

    public C1710h() {
        super(1, 2);
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        C0204c.m860t(frameworkSQLiteDatabase, "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ", "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ", "DROP TABLE IF EXISTS alarmInfo", "\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
