package p514yk;

import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: renamed from: yk.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C10412d extends AbstractC10409a {
    public C10412d() {
        super(1, 2);
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4600u("ALTER TABLE 'requests' ADD COLUMN '_tag' TEXT NULL DEFAULT NULL");
    }
}
