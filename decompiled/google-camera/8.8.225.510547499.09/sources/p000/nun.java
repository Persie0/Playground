package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class nun extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nuo f44671a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nun(nuo nuoVar, Context context) {
        super(context, (String) null, (SQLiteDatabase.CursorFactory) null, 1);
        this.f44671a = nuoVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String str = this.f44671a.f44674b.f44655d;
        nuo.f44672d.m15810i("Creating SQLite table as:\n%s", str);
        sQLiteDatabase.execSQL(str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("In-memory database will never call onUpgrade.");
    }
}
