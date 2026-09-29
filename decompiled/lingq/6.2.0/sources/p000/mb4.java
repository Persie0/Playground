package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class mb4 extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS OfflineTask (task_id TEXT PRIMARY KEY,name TEXT,version INTEGER,created BIGINT,modified BIGINT,last_attempt BIGINT,scheduled BIGINT,requested BIGINT,processing BOOLEAN,failed BOOLEAN,blocking BOOLEAN,data TEXT,error TEXT,type TEXT,attempts INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
