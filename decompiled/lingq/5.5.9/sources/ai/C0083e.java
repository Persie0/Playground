package ai;

import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import p234l4.AbstractC7252b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: ai.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0083e extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public final C8573r0 f217c;

    public C0083e() {
        super(230, 231);
        this.f217c = new C8573r0();
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4600u("DROP TABLE `GeneratedTranslationSentence`");
        this.f217c.getClass();
    }
}
