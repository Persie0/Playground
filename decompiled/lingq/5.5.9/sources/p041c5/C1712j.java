package p041c5;

import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: c5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1712j extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public static final C1712j f9524c = new C1712j();

    public C1712j() {
        super(4, 5);
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4600u("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        frameworkSQLiteDatabase.mo4600u("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
