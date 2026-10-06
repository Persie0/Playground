package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqy implements aqp {

    /* JADX INFO: renamed from: a */
    public static final String[] f2159a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c */
    private static final String[] f2160c = new String[0];

    /* JADX INFO: renamed from: b */
    public final SQLiteDatabase f2161b;

    public aqy(SQLiteDatabase sQLiteDatabase) {
        this.f2161b = sQLiteDatabase;
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: a */
    public final Cursor mo1862a(aqv aqvVar) {
        final aqx aqxVar = new aqx(aqvVar);
        Cursor cursorRawQueryWithFactory = this.f2161b.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: aqw
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                ono onoVar = aqxVar;
                String[] strArr = aqy.f2159a;
                aqv aqvVar2 = ((aqx) onoVar).f2158a;
                sQLiteQuery.getClass();
                aqvVar2.mo1848h(new are(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, aqvVar.mo1842b(), f2160c, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: b */
    public final Cursor mo1863b(String str) {
        return mo1862a(new aqo(str));
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: c */
    public final String mo1864c() {
        return this.f2161b.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2161b.close();
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: d */
    public final void mo1865d() {
        this.f2161b.beginTransaction();
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: e */
    public final void mo1866e() {
        this.f2161b.beginTransactionNonExclusive();
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: f */
    public final void mo1867f() {
        this.f2161b.endTransaction();
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: g */
    public final void mo1868g(String str) {
        this.f2161b.execSQL(str);
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: h */
    public final void mo1869h() {
        this.f2161b.setTransactionSuccessful();
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: i */
    public final boolean mo1870i() {
        return this.f2161b.inTransaction();
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: j */
    public final boolean mo1871j() {
        return this.f2161b.isOpen();
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: k */
    public final boolean mo1872k() {
        return this.f2161b.isWriteAheadLoggingEnabled();
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: l */
    public final arf mo1873l(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f2161b.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new arf(sQLiteStatementCompileStatement);
    }

    @Override // p000.aqp
    /* JADX INFO: renamed from: m */
    public final void mo1874m(Object[] objArr) {
        this.f2161b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
