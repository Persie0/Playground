package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzl implements mrf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f12991a;

    public dzl(long j) {
        this.f12991a = j;
    }

    @Override // p000.mrf
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Object objM6965b = mqu.f41450a;
        sQLiteDatabase.getClass();
        Cursor cursorQuery = sQLiteDatabase.query("type_uri", dzn.f12994a, "media_store_id = ?", new String[]{String.valueOf(this.f12991a)}, null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                objM6965b = dzk.m6965b(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("special_type_id")));
            }
        } catch (IllegalArgumentException e) {
        } catch (NullPointerException e2) {
        } finally {
            cursorQuery.close();
        }
        return objM6965b;
    }
}
