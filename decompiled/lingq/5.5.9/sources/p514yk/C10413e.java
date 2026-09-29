package p514yk;

import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: renamed from: yk.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10413e extends AbstractC10409a {
    public C10413e() {
        super(6, 7);
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4600u("ALTER TABLE 'requests' ADD COLUMN '_auto_retry_max_attempts' INTEGER NOT NULL DEFAULT '0'");
        frameworkSQLiteDatabase.mo4600u("ALTER TABLE 'requests' ADD COLUMN '_auto_retry_attempts' INTEGER NOT NULL DEFAULT '0'");
    }
}
