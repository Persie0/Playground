package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes.dex */
public final class jbc extends i9c {

    /* JADX INFO: renamed from: e */
    public static final String[] f45387e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: c */
    public final inb f45388c;

    /* JADX INFO: renamed from: d */
    public boolean f45389d;

    public jbc(kjc kjcVar) {
        super(kjcVar);
        this.f45388c = new inb(this, ((kjc) this.f60774a).f47433a);
    }

    @Override // p000.i9c
    /* JADX INFO: renamed from: G */
    public final boolean mo5850G() {
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m14375H() {
        int iDelete;
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        try {
            SQLiteDatabase sQLiteDatabaseM14377J = m14377J();
            if (sQLiteDatabaseM14377J == null || (iDelete = sQLiteDatabaseM14377J.delete("messages", null, null)) <= 0) {
                return;
            }
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17924b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17924b(e, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[PHI: r4
      0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: I */
    public final void m14376I() {
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        if (!this.f45389d && kjcVar.f47433a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseM14377J = m14377J();
                        if (sQLiteDatabaseM14377J == null) {
                            this.f45389d = true;
                            return;
                        }
                        sQLiteDatabaseM14377J.beginTransaction();
                        sQLiteDatabaseM14377J.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseM14377J.setTransactionSuccessful();
                        sQLiteDatabaseM14377J.endTransaction();
                        sQLiteDatabaseM14377J.close();
                        return;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        xcc xccVar = kjcVar.f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68080f.m17924b(e, "Error deleting app launch break from local database");
                        this.f45389d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e2) {
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17924b(e2, "Error deleting app launch break from local database");
                    this.f45389d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            xcc xccVar3 = kjcVar.f47438f;
            kjc.m15280l(xccVar3);
            xccVar3.f68083i.m17923a("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX INFO: renamed from: J */
    public final SQLiteDatabase m14377J() {
        if (this.f45389d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f45388c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f45389d = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
      0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX INFO: renamed from: K */
    public final boolean m14378K(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseM14377J;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        boolean z3 = false;
        z3 = false;
        if (!this.f45389d) {
            cmb cmbVar = kjcVar.f47436d;
            xcc xccVar = kjcVar.f47438f;
            t8c t8cVar = z8c.f71146W0;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarM21926H = cmbVar.m4869O(null, t8cVar) ? kjcVar.m15289q().m21926H(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (kjcVar.f47436d.m4869O(null, t8cVar) && zzrVarM21926H != null) {
                contentValues.put("app_version", zzrVarM21926H.f12435c);
                contentValues.put("app_version_int", Long.valueOf(zzrVarM21926H.f12442j));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseM14377J = m14377J();
                    if (sQLiteDatabaseM14377J == null) {
                        this.f45389d = true;
                    } else {
                        try {
                            sQLiteDatabaseM14377J.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseM14377J.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseM14377J != null) {
                                            sQLiteDatabaseM14377J.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM14377J != null) {
                                        sQLiteDatabaseM14377J.close();
                                    }
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z = z3 ? 1 : 0;
                                    kjc.m15280l(xccVar);
                                    xccVar.f68080f.m17924b(e, "Error writing entry; local database full");
                                    this.f45389d = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM14377J != null) {
                                        sQLiteDatabaseM14377J.close();
                                    }
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabaseM14377J != null) {
                                        sQLiteDatabaseM14377J.endTransaction();
                                    }
                                    kjc.m15280l(xccVar);
                                    xccVar.f68080f.m17924b(e, "Error writing entry to local database");
                                    this.f45389d = z2;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM14377J != null) {
                                        sQLiteDatabaseM14377J.close();
                                    }
                                    i3++;
                                    z3 = z;
                                }
                            }
                            if (j >= 100000) {
                                kjc.m15280l(xccVar);
                                xccVar.f68080f.m17923a("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseM14377J.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    kjc.m15280l(xccVar);
                                    occ occVar = xccVar.f68080f;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                            try {
                                                occVar.m17926d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e3) {
                                                e = e3;
                                                kjc.m15280l(xccVar);
                                                xccVar.f68080f.m17924b(e, "Error writing entry; local database full");
                                                this.f45389d = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM14377J != null) {
                                                    sQLiteDatabaseM14377J.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                if (sQLiteDatabaseM14377J != null) {
                                                    sQLiteDatabaseM14377J.endTransaction();
                                                }
                                                kjc.m15280l(xccVar);
                                                xccVar.f68080f.m17924b(e, "Error writing entry to local database");
                                                this.f45389d = z2;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM14377J != null) {
                                                    sQLiteDatabaseM14377J.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM14377J != null) {
                                                sQLiteDatabaseM14377J.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        kjc.m15280l(xccVar);
                                        xccVar.f68080f.m17924b(e, "Error writing entry; local database full");
                                        this.f45389d = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM14377J != null) {
                                            sQLiteDatabaseM14377J.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        z2 = true;
                                        if (sQLiteDatabaseM14377J != null && sQLiteDatabaseM14377J.inTransaction()) {
                                            sQLiteDatabaseM14377J.endTransaction();
                                        }
                                        kjc.m15280l(xccVar);
                                        xccVar.f68080f.m17924b(e, "Error writing entry to local database");
                                        this.f45389d = z2;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM14377J != null) {
                                            sQLiteDatabaseM14377J.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                z2 = true;
                            }
                            sQLiteDatabaseM14377J.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseM14377J.setTransactionSuccessful();
                            sQLiteDatabaseM14377J.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseM14377J.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseM14377J = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseM14377J = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseM14377J = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseM14377J = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17923a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }
}
