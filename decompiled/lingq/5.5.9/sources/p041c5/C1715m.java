package p041c5;

import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: c5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1715m extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public static final C1715m f9527c = new C1715m();

    public C1715m() {
        super(8, 9);
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4600u("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
