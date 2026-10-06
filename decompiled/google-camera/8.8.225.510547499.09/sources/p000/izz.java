package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class izz extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jaa f32746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izz(jaa jaaVar, Context context) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f32746a = jaaVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX INFO: renamed from: a */
    private final boolean m11959a(SQLiteDatabase sQLiteDatabase, String str) throws Throwable {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return zMoveToFirst;
                } catch (SQLiteException e) {
                    e = e;
                    this.f32746a.m11941v("Error querying for table", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private static final Set m11960b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            for (String str2 : cursorRawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            cursorRawQuery.close();
            return hashSet;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        if (!this.f32746a.f33548e.m12812c(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f32746a.f33548e.m12811b();
            this.f32746a.m11933n("Opening the database failed, dropping the table and recreating it");
            this.f32746a.m11924d().getDatabasePath("google_analytics_v4.db").delete();
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                this.f32746a.f33548e.m12810a();
                return writableDatabase;
            } catch (SQLiteException e2) {
                this.f32746a.m11934o("Failed to open freshly created database", e2);
                throw e2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                return;
            }
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        } catch (NumberFormatException e) {
            String str = Build.VERSION.SDK;
            jar jarVar = jar.f33616a;
            if (jarVar != null) {
                jarVar.m11934o("Invalid version number", str);
            } else if (jaq.f33615a != null) {
                int i = jaq.f33615a.f46847a;
                Log.e((String) jam.f33580b.m11334D(), str != null ? "Invalid version number:".concat(str) : "Invalid version number");
            }
            oyo oyoVar = jaq.f33615a;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (m11959a(sQLiteDatabase, "hits2")) {
            Set setM11960b = m11960b(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (!setM11960b.remove(str)) {
                    throw new SQLiteException("Database hits2 is missing required column: ".concat(String.valueOf(str)));
                }
            }
            boolean z = !setM11960b.remove("hit_app_id");
            if (!setM11960b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            }
            if (z) {
                sQLiteDatabase.execSQL(WIxTIdUIdfb.cwdOphTpzksfv);
            }
        } else {
            sQLiteDatabase.execSQL(jaa.f33545a);
        }
        if (!m11959a(sQLiteDatabase, "properties")) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        }
        Set setM11960b2 = m11960b(sQLiteDatabase, "properties");
        String[] strArr2 = {"app_uid", "cid", "tid", CswIK.zTCBiSlTbvfPELa, "adid", "hits_count"};
        for (int i2 = 0; i2 < 6; i2++) {
            String str2 = strArr2[i2];
            if (!setM11960b2.remove(str2)) {
                throw new SQLiteException("Database properties is missing required column: ".concat(String.valueOf(str2)));
            }
        }
        if (!setM11960b2.isEmpty()) {
            throw new SQLiteException("Database properties table has extra columns");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
