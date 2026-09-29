package p041c5;

import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: renamed from: c5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1700b extends RoomDatabase.AbstractC1181b {

    /* JADX INFO: renamed from: a */
    public static final C1700b f9485a = new C1700b();

    @Override // androidx.room.RoomDatabase.AbstractC1181b
    /* JADX INFO: renamed from: a */
    public final void mo4571a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4597k();
        try {
            frameworkSQLiteDatabase.mo4600u("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - C1725w.f9565a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            frameworkSQLiteDatabase.mo4590Z();
        } finally {
            frameworkSQLiteDatabase.mo4601w0();
        }
    }
}
