package p514yk;

import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.tonyodev.fetch2.EnqueueAction;

/* JADX INFO: renamed from: yk.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10411c extends AbstractC10409a {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f52217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10411c(int i10) {
        super(4, 5);
        this.f52217c = i10;
        if (i10 != 1) {
        } else {
            super(2, 3);
        }
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        switch (this.f52217c) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE 'requests' ADD COLUMN '_download_on_enqueue' INTEGER NOT NULL DEFAULT 1");
                break;
            default:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE 'requests' ADD COLUMN '_enqueue_action' INTEGER NOT NULL DEFAULT " + EnqueueAction.REPLACE_EXISTING.getValue());
                break;
        }
    }
}
