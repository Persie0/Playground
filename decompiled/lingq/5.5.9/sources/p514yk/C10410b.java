package p514yk;

import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: renamed from: yk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10410b extends AbstractC10409a {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f52216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10410b(int i10) {
        super(5, 6);
        this.f52216c = i10;
        if (i10 != 1) {
        } else {
            super(3, 4);
        }
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        switch (this.f52216c) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE 'requests' ADD COLUMN '_extras' TEXT NOT NULL DEFAULT '{}'");
                break;
            default:
                frameworkSQLiteDatabase.mo4600u("ALTER TABLE 'requests' ADD COLUMN '_identifier' INTEGER NOT NULL DEFAULT 0");
                break;
        }
    }
}
