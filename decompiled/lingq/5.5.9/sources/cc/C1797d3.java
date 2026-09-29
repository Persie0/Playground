package cc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: cc.d3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1797d3 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1806e3 f9756a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1797d3(C1806e3 c1806e3, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f9756a = c1806e3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            C1806e3 c1806e3 = this.f9756a;
            C1860k3 c1860k3 = ((C1897o4) c1806e3.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Opening the local database failed, dropping and recreating it");
            ((C1897o4) c1806e3.f10430a).getClass();
            if (!((C1897o4) c1806e3.f10430a).f10076a.getDatabasePath("google_app_measurement_local.db").delete()) {
                C1860k3 c1860k4 = ((C1897o4) c1806e3.f10430a).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5624b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                C1860k3 c1860k5 = ((C1897o4) c1806e3.f10430a).f10086i;
                C1897o4.m5776k(c1860k5);
                c1860k5.f9942f.m5624b(e11, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1860k3 c1860k3 = ((C1897o4) this.f9756a.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        C1856k.m5699b(c1860k3, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        C1860k3 c1860k3 = ((C1897o4) this.f9756a.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        C1856k.m5698a(c1860k3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
