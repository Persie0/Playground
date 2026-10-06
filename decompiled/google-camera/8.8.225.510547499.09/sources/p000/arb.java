package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class arb extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private final Context f2170a;

    /* JADX INFO: renamed from: b */
    private final aqq f2171b;

    /* JADX INFO: renamed from: c */
    private final boolean f2172c;

    /* JADX INFO: renamed from: d */
    private boolean f2173d;

    /* JADX INFO: renamed from: e */
    private final arg f2174e;

    /* JADX INFO: renamed from: f */
    private boolean f2175f;

    /* JADX INFO: renamed from: g */
    private final nax f2176g;

    /* JADX WARN: Illegal instructions before constructor call */
    public arb(Context context, String str, final nax naxVar, aqq aqqVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        String string;
        final byte[] bArr5 = null;
        final byte[] bArr6 = null;
        final byte[] bArr7 = null;
        final byte[] bArr8 = null;
        super(context, str, null, aqqVar.f2147a, new DatabaseErrorHandler(bArr5, bArr6, bArr7, bArr8) { // from class: aqz
            /* JADX WARN: Code duplicated, block: B:18:0x0046  */
            /* JADX WARN: Code duplicated, block: B:21:0x0050 A[LOOP:1: B:19:0x004a->B:21:0x0050, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:22:0x0061  */
            /* JADX WARN: Code duplicated, block: B:25:0x0068  */
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) throws Throwable {
                String strMo1864c;
                Iterator<T> it;
                nax naxVar2 = this.f2162a;
                sQLiteDatabase.getClass();
                aqy aqyVarM1888b = arh.m1888b(naxVar2, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + aqyVarM1888b + ".path");
                if (!aqyVarM1888b.mo1871j()) {
                    String strMo1864c2 = aqyVarM1888b.mo1864c();
                    if (strMo1864c2 != null) {
                        aqq.m1875a(strMo1864c2);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    attachedDbs = aqyVarM1888b.f2161b.getAttachedDbs();
                } catch (SQLiteException e) {
                } catch (Throwable th) {
                    th = th;
                    if (attachedDbs != null) {
                        it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            obj.getClass();
                            aqq.m1875a((String) obj);
                        }
                    } else {
                        strMo1864c = aqyVarM1888b.mo1864c();
                        if (strMo1864c != null) {
                            aqq.m1875a(strMo1864c);
                        }
                    }
                    throw th;
                }
                try {
                    aqyVarM1888b.close();
                } catch (IOException e2) {
                } catch (Throwable th2) {
                    th = th2;
                    if (attachedDbs != null) {
                        it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj2 = ((Pair) it.next()).second;
                            obj2.getClass();
                            aqq.m1875a((String) obj2);
                        }
                    } else {
                        strMo1864c = aqyVarM1888b.mo1864c();
                        if (strMo1864c != null) {
                            aqq.m1875a(strMo1864c);
                        }
                    }
                    throw th;
                }
                if (attachedDbs == null) {
                    String strMo1864c3 = aqyVarM1888b.mo1864c();
                    if (strMo1864c3 != null) {
                        aqq.m1875a(strMo1864c3);
                        return;
                    }
                    return;
                }
                Iterator<T> it2 = attachedDbs.iterator();
                while (it2.hasNext()) {
                    Object obj3 = ((Pair) it2.next()).second;
                    obj3.getClass();
                    aqq.m1875a((String) obj3);
                }
            }
        });
        this.f2170a = context;
        this.f2176g = naxVar;
        this.f2171b = aqqVar;
        this.f2172c = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        this.f2174e = new arg(string, cacheDir);
    }

    /* JADX INFO: renamed from: c */
    private final SQLiteDatabase m1879c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    /* JADX INFO: renamed from: a */
    public final aqy m1880a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return arh.m1888b(this.f2176g, sQLiteDatabase);
    }

    /* JADX INFO: renamed from: b */
    public final aqp m1881b() {
        SQLiteDatabase sQLiteDatabaseM1879c;
        aqp aqpVarM1880a;
        arg argVar;
        File parentFile;
        try {
            this.f2174e.m1885a((this.f2175f || getDatabaseName() == null) ? false : true);
            this.f2173d = false;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.f2170a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid database parent file, not a directory: ");
                    sb.append(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                sQLiteDatabaseM1879c = m1879c();
            } catch (Throwable th) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                }
                try {
                    sQLiteDatabaseM1879c = m1879c();
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof ara) {
                        ara araVar = th2;
                        Throwable th3 = araVar.f2168a;
                        int i = araVar.f2169b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        switch (i2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                throw th3;
                            default:
                                if (!(th3 instanceof SQLiteException)) {
                                    throw th3;
                                }
                                break;
                                break;
                        }
                    } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.f2172c) {
                        throw th2;
                    }
                    this.f2170a.deleteDatabase(databaseName);
                    try {
                        sQLiteDatabaseM1879c = m1879c();
                    } catch (ara e2) {
                        throw e2.f2168a;
                    }
                }
            }
            if (this.f2173d) {
                close();
                aqpVarM1880a = m1881b();
                argVar = this.f2174e;
            } else {
                aqpVarM1880a = m1880a(sQLiteDatabaseM1879c);
                argVar = this.f2174e;
            }
            argVar.m1886b();
            return aqpVarM1880a;
        } catch (Throwable th4) {
            this.f2174e.m1886b();
            throw th4;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            arg argVar = this.f2174e;
            Map map = arg.f2186a;
            boolean z = argVar.f2187b;
            argVar.m1885a(false);
            super.close();
            this.f2176g.f41919a = null;
            this.f2175f = false;
        } finally {
            this.f2174e.m1886b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            m1880a(sQLiteDatabase);
        } catch (Throwable th) {
            throw new ara(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            aqq aqqVar = this.f2171b;
            aqy aqyVarM1880a = m1880a(sQLiteDatabase);
            Cursor cursorMo1863b = aqyVarM1880a.mo1863b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (cursorMo1863b.moveToFirst() && cursorMo1863b.getInt(0) == 0) {
                    z = true;
                }
                omn.m18709n(cursorMo1863b, null);
                aqqVar.f2149c.mo1834a(aqyVarM1880a);
                if (!z) {
                    npk npkVarMo1840g = aqqVar.f2149c.mo1840g(aqyVarM1880a);
                    if (!npkVarMo1840g.f44027a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(npkVarMo1840g.f44028b)));
                    }
                }
                aqqVar.m1877c(aqyVarM1880a);
                aqqVar.f2149c.mo1839f();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    omn.m18709n(cursorMo1863b, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw new ara(2, th3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.f2173d = true;
        try {
            this.f2171b.m1876b(m1880a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ara(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.f2173d) {
            try {
                aqq aqqVar = this.f2171b;
                aqy aqyVarM1880a = m1880a(sQLiteDatabase);
                Cursor cursorMo1863b = aqyVarM1880a.mo1863b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                try {
                    boolean z = cursorMo1863b.moveToFirst() && cursorMo1863b.getInt(0) != 0;
                    omn.m18709n(cursorMo1863b, null);
                    if (z) {
                        Cursor cursorMo1862a = aqyVarM1880a.mo1862a(new aqo("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = cursorMo1862a.moveToFirst() ? cursorMo1862a.getString(0) : null;
                            omn.m18709n(cursorMo1862a, null);
                            if (!ooc.m18737c(aqqVar.f2150d, string) && !ooc.m18737c(aqqVar.f2151e, string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + aqqVar.f2150d + ", found: " + string);
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                omn.m18709n(cursorMo1862a, th);
                                throw th2;
                            }
                        }
                    } else {
                        npk npkVarMo1840g = aqqVar.f2149c.mo1840g(aqyVarM1880a);
                        if (!npkVarMo1840g.f44027a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(npkVarMo1840g.f44028b)));
                        }
                        aqqVar.f2149c.mo1837d(aqyVarM1880a);
                        aqqVar.m1877c(aqyVarM1880a);
                    }
                    aqqVar.f2149c.mo1836c(aqyVarM1880a);
                    aqqVar.f2148b = null;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        omn.m18709n(cursorMo1863b, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw new ara(5, th5);
            }
        }
        this.f2175f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.f2173d = true;
        try {
            this.f2171b.m1876b(m1880a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ara(3, th);
        }
    }
}
