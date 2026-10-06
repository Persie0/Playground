package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cns extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private static final nbh f6377a = nbh.m17259h("com/google/android/apps/camera/brella/examplestore/lib/VersionedSqliteOpenHelper");

    /* JADX INFO: renamed from: b */
    private final Context f6378b;

    /* JADX INFO: renamed from: c */
    private final String f6379c;

    /* JADX INFO: renamed from: d */
    private final mws f6380d;

    /* JADX INFO: renamed from: e */
    private final int f6381e;

    /* JADX INFO: renamed from: f */
    private boolean f6382f;

    public cns(Context context, mws mwsVar) {
        super(context, "example_store_ng", (SQLiteDatabase.CursorFactory) null, mwsVar.size());
        this.f6378b = context;
        this.f6379c = "example_store_ng";
        this.f6380d = mwsVar;
        this.f6381e = mwsVar.size();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            ((nbe) ((nbe) ((nbe) f6377a.m17251b()).mo17283h(e)).mo17276G((char) 344)).mo17290o(VzWFSVj.yiruXjxrMM);
            if (!SQLiteDatabase.deleteDatabase(this.f6378b.getDatabasePath(this.f6379c))) {
                ((nbe) ((nbe) ((nbe) f6377a.m17251b()).mo17283h(e)).mo17276G(346)).mo17293r("Deletion of %s failed", this.f6379c);
                throw e;
            }
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (SQLiteException e2) {
                ((nbe) ((nbe) ((nbe) f6377a.m17251b()).mo17283h(e2)).mo17276G((char) 345)).mo17290o("failed to get the database after recreating");
                throw e2;
            }
        }
        if (!this.f6382f) {
            return writableDatabase;
        }
        String path = writableDatabase.getPath();
        writableDatabase.close();
        SQLiteDatabase.deleteDatabase(new File(path));
        this.f6382f = false;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e3) {
            ((nbe) ((nbe) ((nbe) f6377a.m17251b()).mo17283h(e3)).mo17276G((char) 343)).mo17290o("Error getting database after downgrading");
            throw e3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, this.f6381e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f6382f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        lku.m15669w(i >= 0);
        lku.m15669w(i < i2);
        lku.m15669w(i2 == this.f6381e);
        sQLiteDatabase.beginTransaction();
        while (i < i2) {
            try {
                sQLiteDatabase.execSQL((String) this.f6380d.get(i));
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
