package p041c5;

import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: c5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1706e extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public static final C1706e f9492c = new C1706e();

    public C1706e() {
        super(11, 12);
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4600u("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
