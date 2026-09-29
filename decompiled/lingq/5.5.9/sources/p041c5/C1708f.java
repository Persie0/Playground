package p041c5;

import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: c5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1708f extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public static final C1708f f9520c = new C1708f();

    public C1708f() {
        super(12, 13);
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4600u("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        frameworkSQLiteDatabase.mo4600u("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
