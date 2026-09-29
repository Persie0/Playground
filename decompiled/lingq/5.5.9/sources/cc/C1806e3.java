package cc;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: renamed from: cc.e3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1806e3 extends AbstractC1914q3 {

    /* JADX INFO: renamed from: c */
    public final C1797d3 f9769c;

    /* JADX INFO: renamed from: d */
    public boolean f9770d;

    public C1806e3(C1897o4 c1897o4) {
        super(c1897o4);
        C1897o4 c1897o5 = (C1897o4) this.f10430a;
        Context context = c1897o5.f10076a;
        c1897o5.getClass();
        this.f9769c = new C1797d3(this, context);
    }

    @Override // cc.AbstractC1914q3
    /* JADX INFO: renamed from: k */
    public final boolean mo5519k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final SQLiteDatabase m5587l() throws SQLiteException {
        if (this.f9770d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f9769c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f9770d = true;
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m5588m() {
        int iDelete;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        mo5748g();
        try {
            SQLiteDatabase sQLiteDatabaseM5587l = m5587l();
            if (sQLiteDatabaseM5587l == null || (iDelete = sQLiteDatabaseM5587l.delete("messages", null, null)) <= 0) {
                return;
            }
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9938I.m5624b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e10) {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5624b(e10, "Error resetting local analytics data. error");
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5589n() {
        mo5748g();
        if (this.f9770d) {
            return;
        }
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
        Context context = c1897o4.f10076a;
        c1897o4.getClass();
        if (context.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseM5587l = m5587l();
                        if (sQLiteDatabaseM5587l == null) {
                            this.f9770d = true;
                            return;
                        }
                        sQLiteDatabaseM5587l.beginTransaction();
                        sQLiteDatabaseM5587l.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseM5587l.setTransactionSuccessful();
                        sQLiteDatabaseM5587l.endTransaction();
                        sQLiteDatabaseM5587l.close();
                        return;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i10);
                        i10 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e10) {
                    C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5624b(e10, "Error deleting app launch break from local database");
                    this.f9770d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5624b(e11, "Error deleting app launch break from local database");
                    this.f9770d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k5);
            c1860k5.f9945i.m5623a("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:87:0x0150  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: o */
    public final boolean m5590o(byte[] bArr, int i10) {
        ?? r10;
        SQLiteDatabase sQLiteDatabaseM5587l;
        ?? r11;
        SQLiteDatabase sQLiteDatabase;
        ?? r12;
        ?? r13;
        long j10;
        String str;
        mo5748g();
        ?? r14 = 0;
        if (this.f9770d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i10));
        contentValues.put("entry", bArr);
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
        c1897o4.getClass();
        int i11 = 0;
        int i12 = 5;
        for (int i13 = 5; i11 < i13; i13 = 5) {
            try {
                sQLiteDatabaseM5587l = m5587l();
                if (sQLiteDatabaseM5587l == null) {
                    this.f9770d = true;
                    return r14;
                }
                try {
                    sQLiteDatabaseM5587l.beginTransaction();
                    ?? RawQuery = sQLiteDatabaseM5587l.rawQuery("select count(1) from messages", null);
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j10 = RawQuery.getLong(r14);
                            } else {
                                j10 = 0;
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r10 = RawQuery;
                            try {
                                SystemClock.sleep(i12);
                                i12 += 20;
                                if (r10 != 0) {
                                    r10.close();
                                }
                                if (sQLiteDatabaseM5587l != null) {
                                    sQLiteDatabaseM5587l.close();
                                }
                                i11++;
                                r14 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                if (r10 != 0) {
                                    r10.close();
                                }
                                if (sQLiteDatabaseM5587l != null) {
                                    sQLiteDatabaseM5587l.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e10) {
                            e = e10;
                            r12 = RawQuery;
                            try {
                                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                                C1897o4.m5776k(c1860k3);
                                c1860k3.f9942f.m5624b(e, "Error writing entry; local database full");
                                this.f9770d = true;
                                if (r12 != 0) {
                                    r12.close();
                                }
                                if (sQLiteDatabaseM5587l != null) {
                                    sQLiteDatabase = sQLiteDatabaseM5587l;
                                    sQLiteDatabase.close();
                                }
                                i11++;
                                r14 = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                r11 = r12;
                                sQLiteDatabase = sQLiteDatabaseM5587l;
                                sQLiteDatabaseM5587l = sQLiteDatabase;
                                r13 = r11;
                                r10 = r13;
                                if (r10 != 0) {
                                    r10.close();
                                }
                                if (sQLiteDatabaseM5587l != null) {
                                    sQLiteDatabaseM5587l.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            sQLiteDatabase = sQLiteDatabaseM5587l;
                            r11 = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteDatabaseM5587l = sQLiteDatabase;
                                    r13 = r11;
                                    r10 = r13;
                                    if (r10 != 0) {
                                        r10.close();
                                    }
                                    if (sQLiteDatabaseM5587l != null) {
                                        sQLiteDatabaseM5587l.close();
                                    }
                                    throw th;
                                }
                            }
                            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                            C1897o4.m5776k(c1860k4);
                            c1860k4.f9942f.m5624b(e, "Error writing entry to local database");
                            this.f9770d = true;
                            if (r11 != 0) {
                                r11.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i11++;
                            r14 = 0;
                        } catch (Throwable th5) {
                            th = th5;
                            r10 = RawQuery;
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (sQLiteDatabaseM5587l != null) {
                                sQLiteDatabaseM5587l.close();
                            }
                            throw th;
                        }
                    } else {
                        j10 = 0;
                    }
                    if (j10 >= 100000) {
                        C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k5);
                        c1860k5.f9942f.m5623a("Data loss, local db full");
                        String[] strArr = new String[1];
                        long j11 = (100000 - j10) + 1;
                        strArr[r14] = Long.toString(j11);
                        long jDelete = sQLiteDatabaseM5587l.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j11) {
                            C1860k3 c1860k6 = ((C1897o4) interfaceC1781b5).f10086i;
                            C1897o4.m5776k(c1860k6);
                            c1860k6.f9942f.m5626d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j11), Long.valueOf(jDelete), Long.valueOf(j11 - jDelete));
                        }
                        str = null;
                    } else {
                        str = null;
                    }
                    sQLiteDatabaseM5587l.insertOrThrow("messages", str, contentValues);
                    sQLiteDatabaseM5587l.setTransactionSuccessful();
                    sQLiteDatabaseM5587l.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseM5587l.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                    r10 = 0;
                } catch (SQLiteFullException e12) {
                    e = e12;
                    r12 = 0;
                } catch (SQLiteException e13) {
                    e = e13;
                    r11 = 0;
                    sQLiteDatabase = sQLiteDatabaseM5587l;
                } catch (Throwable th6) {
                    th = th6;
                    r13 = 0;
                    r10 = r13;
                    if (r10 != 0) {
                        r10.close();
                    }
                    if (sQLiteDatabaseM5587l != null) {
                        sQLiteDatabaseM5587l.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                r10 = 0;
                sQLiteDatabaseM5587l = null;
            } catch (SQLiteFullException e14) {
                e = e14;
                r12 = 0;
                sQLiteDatabaseM5587l = null;
            } catch (SQLiteException e15) {
                e = e15;
                r11 = 0;
                sQLiteDatabase = null;
            } catch (Throwable th7) {
                th = th7;
                r10 = 0;
                sQLiteDatabaseM5587l = null;
            }
        }
        C1860k3 c1860k7 = c1897o4.f10086i;
        C1897o4.m5776k(c1860k7);
        c1860k7.f9938I.m5623a("Failed to write entry to local database");
        return false;
    }
}
