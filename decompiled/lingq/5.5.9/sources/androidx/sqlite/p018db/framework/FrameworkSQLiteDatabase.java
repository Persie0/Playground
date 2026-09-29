package androidx.sqlite.p018db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import cm.InterfaceC2058r;
import dm.C5207g;
import java.io.IOException;
import java.util.List;
import p288o4.C7915a;
import p288o4.InterfaceC7916b;
import p288o4.InterfaceC7919e;
import p288o4.InterfaceC7920f;
import p314p4.C8187d;
import p314p4.C8188e;

/* JADX INFO: loaded from: classes.dex */
public final class FrameworkSQLiteDatabase implements InterfaceC7916b {

    /* JADX INFO: renamed from: b */
    public static final String[] f7567b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c */
    public static final String[] f7568c = new String[0];

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase f7569a;

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        C5207g.m11111f(sQLiteDatabase, "delegate");
        this.f7569a = sQLiteDatabase;
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: B */
    public final InterfaceC7920f mo4588B(String str) {
        C5207g.m11111f(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f7569a.compileStatement(str);
        C5207g.m11110e(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new C8188e(sQLiteStatementCompileStatement);
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: S0 */
    public final boolean mo4589S0() {
        return this.f7569a.inTransaction();
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: Z */
    public final void mo4590Z() {
        this.f7569a.setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: a */
    public final List<Pair<String, String>> m4591a() {
        return this.f7569a.getAttachedDbs();
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: a0 */
    public final void mo4592a0(String str, Object[] objArr) throws SQLException {
        this.f7569a.execSQL(str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public final String m4593b() {
        return this.f7569a.getPath();
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: b1 */
    public final Cursor mo4594b1(final InterfaceC7919e interfaceC7919e) {
        C5207g.m11111f(interfaceC7919e, "query");
        final InterfaceC2058r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> interfaceC2058r = new InterfaceC2058r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // cm.InterfaceC2058r
            /* JADX INFO: renamed from: T */
            public final SQLiteCursor mo1851T(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                SQLiteQuery sQLiteQuery2 = sQLiteQuery;
                C5207g.m11108c(sQLiteQuery2);
                interfaceC7919e.mo13195a(new C8187d(sQLiteQuery2));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery2);
            }
        };
        Cursor cursorRawQueryWithFactory = this.f7569a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: p4.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                InterfaceC2058r interfaceC2058r2 = interfaceC2058r;
                C5207g.m11111f(interfaceC2058r2, "$tmp0");
                return (Cursor) interfaceC2058r2.mo1851T(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC7919e.mo13196b(), f7568c, null);
        C5207g.m11110e(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: c0 */
    public final void mo4595c0() {
        this.f7569a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7569a.close();
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: f1 */
    public final boolean mo4596f1() {
        SQLiteDatabase sQLiteDatabase = this.f7569a;
        C5207g.m11111f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // p288o4.InterfaceC7916b
    public final boolean isOpen() {
        return this.f7569a.isOpen();
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: k */
    public final void mo4597k() {
        this.f7569a.beginTransaction();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final int m4598l(ContentValues contentValues, Object[] objArr) {
        int i10 = 0;
        if (!(contentValues.size() != 0)) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f7567b[3]);
        sb2.append("WorkSpec SET ");
        for (String str : contentValues.keySet()) {
            sb2.append(i10 > 0 ? "," : "");
            sb2.append(str);
            objArr2[i10] = contentValues.get(str);
            sb2.append("=?");
            i10++;
        }
        for (int i11 = size; i11 < length; i11++) {
            objArr2[i11] = objArr[i11 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        InterfaceC7920f interfaceC7920fMo4588B = mo4588B(string);
        C7915a.a.m15734a(interfaceC7920fMo4588B, objArr2);
        return ((C8188e) interfaceC7920fMo4588B).mo15736A();
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: o0 */
    public final Cursor mo4599o0(String str) {
        C5207g.m11111f(str, "query");
        return mo4594b1(new C7915a(str));
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: u */
    public final void mo4600u(String str) throws SQLException {
        C5207g.m11111f(str, "sql");
        this.f7569a.execSQL(str);
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: w0 */
    public final void mo4601w0() {
        this.f7569a.endTransaction();
    }

    @Override // p288o4.InterfaceC7916b
    /* JADX INFO: renamed from: y */
    public final Cursor mo4602y(final InterfaceC7919e interfaceC7919e, CancellationSignal cancellationSignal) {
        C5207g.m11111f(interfaceC7919e, "query");
        String strMo13196b = interfaceC7919e.mo13196b();
        String[] strArr = f7568c;
        C5207g.m11108c(cancellationSignal);
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: p4.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                InterfaceC7919e interfaceC7919e2 = interfaceC7919e;
                C5207g.m11111f(interfaceC7919e2, "$query");
                C5207g.m11108c(sQLiteQuery);
                interfaceC7919e2.mo13195a(new C8187d(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        SQLiteDatabase sQLiteDatabase = this.f7569a;
        C5207g.m11111f(sQLiteDatabase, "sQLiteDatabase");
        C5207g.m11111f(strMo13196b, "sql");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, strMo13196b, strArr, null, cancellationSignal);
        C5207g.m11110e(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }
}
