package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes.dex */
public final class xg3 implements Closeable {

    /* JADX INFO: renamed from: b */
    public static final String[] f68174b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c */
    public static final String[] f68175c = new String[0];

    /* JADX INFO: renamed from: d */
    public static final cs4 f68176d;

    /* JADX INFO: renamed from: e */
    public static final cs4 f68177e;

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase f68178a;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f68176d = AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3288l7(18));
        f68177e = AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3288l7(19));
    }

    public xg3(SQLiteDatabase sQLiteDatabase) {
        this.f68178a = sQLiteDatabase;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m24493S() {
        return this.f68178a.inTransaction();
    }

    /* JADX INFO: renamed from: a */
    public final void m24494a() {
        this.f68178a.beginTransaction();
    }

    /* JADX INFO: renamed from: b */
    public final void m24495b() {
        this.f68178a.beginTransactionNonExclusive();
    }

    /* JADX INFO: renamed from: c */
    public final ch3 m24496c(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.f68178a.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new ch3(sQLiteStatementCompileStatement);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f68178a.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m24497e() {
        this.f68178a.endTransaction();
    }

    public final boolean isOpen() {
        return this.f68178a.isOpen();
    }

    /* JADX INFO: renamed from: n */
    public final void m24498n(String str) {
        this.f68178a.execSQL(str);
    }

    /* JADX INFO: renamed from: p */
    public final void m24499p(Object[] objArr) {
        this.f68178a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    /* JADX INFO: renamed from: q */
    public final Cursor m24500q(ao9 ao9Var) {
        final C3411oj c3411oj = new C3411oj(ao9Var, 1);
        Cursor cursorRawQueryWithFactory = this.f68178a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: wg3
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) c3411oj.mo825e(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ao9Var.mo2959x(), f68175c, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    /* JADX INFO: renamed from: r */
    public final Cursor m24501r(String str) {
        return m24500q(new p33(str, 20));
    }

    /* JADX INFO: renamed from: u */
    public final void m24502u() {
        this.f68178a.setTransactionSuccessful();
    }
}
