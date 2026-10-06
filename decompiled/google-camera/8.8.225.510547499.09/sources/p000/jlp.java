package p000;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jlp extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private final Context f34324a;

    /* JADX INFO: renamed from: b */
    private final String f34325b;

    /* JADX INFO: renamed from: c */
    private final mws f34326c;

    /* JADX INFO: renamed from: d */
    private final int f34327d;

    /* JADX INFO: renamed from: e */
    private boolean f34328e;

    /* JADX WARN: Illegal instructions before constructor call */
    public jlp(Context context, mws mwsVar) {
        mzr mzrVar = (mzr) mwsVar;
        super(context, "primes_example_store", (SQLiteDatabase.CursorFactory) null, mzrVar.f41859c);
        this.f34324a = context;
        this.f34325b = "primes_example_store";
        this.f34326c = mwsVar;
        this.f34327d = mzrVar.f41859c;
    }

    /* JADX INFO: renamed from: a */
    private static SQLiteException m13342a(SQLiteException sQLiteException) {
        return sQLiteException instanceof SQLiteCantOpenDatabaseException ? new jlo(sQLiteException) : sQLiteException;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        String str = rmwTRjObXLGH.BRMfJdWpf;
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e(str, "Error opening database, deleting the database and trying again", e);
            if (!SQLiteDatabase.deleteDatabase(this.f34324a.getDatabasePath(this.f34325b))) {
                Log.e(str, "Deletion of " + this.f34325b + " failed", e);
                throw m13342a(e);
            }
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (SQLiteException e2) {
                Log.e(str, "failed to get the database after recreating", e2);
                throw m13342a(e2);
            }
        }
        if (!this.f34328e) {
            return writableDatabase;
        }
        String path = writableDatabase.getPath();
        writableDatabase.close();
        SQLiteDatabase.deleteDatabase(new File(path));
        this.f34328e = false;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e3) {
            Log.e(str, "Error getting database after downgrading", e3);
            throw m13342a(e3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, this.f34327d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f34328e = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        lku.m15669w(i >= 0);
        lku.m15669w(i < i2);
        lku.m15669w(i2 == this.f34327d);
        sQLiteDatabase.beginTransaction();
        while (i < i2) {
            try {
                sQLiteDatabase.execSQL((String) this.f34326c.get(i));
                i++;
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
    }
}
