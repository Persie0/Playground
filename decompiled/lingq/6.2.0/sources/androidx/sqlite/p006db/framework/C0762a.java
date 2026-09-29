package androidx.sqlite.p006db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.driver.C0763a;
import androidx.sqlite.p006db.framework.C0762a;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p000.C3126ix;
import p000.dl7;
import p000.gm5;
import p000.m58;
import p000.sb2;
import p000.xg3;
import p000.zg3;

/* JADX INFO: renamed from: androidx.sqlite.db.framework.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0762a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f7061h = 0;

    /* JADX INFO: renamed from: a */
    public final Context f7062a;

    /* JADX INFO: renamed from: b */
    public final m58 f7063b;

    /* JADX INFO: renamed from: c */
    public final C3126ix f7064c;

    /* JADX INFO: renamed from: d */
    public final boolean f7065d;

    /* JADX INFO: renamed from: e */
    public boolean f7066e;

    /* JADX INFO: renamed from: f */
    public final dl7 f7067f;

    /* JADX INFO: renamed from: g */
    public boolean f7068g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0762a(Context context, String str, final m58 m58Var, final C3126ix c3126ix, boolean z) {
        String string;
        super(context, str, null, c3126ix.f44720b, new DatabaseErrorHandler() { // from class: yg3
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = C0762a.f7061h;
                sQLiteDatabase.getClass();
                m58 m58Var2 = m58Var;
                xg3 xg3Var = (xg3) m58Var2.f50618b;
                if (xg3Var == null || !xg3Var.f68178a.equals(sQLiteDatabase)) {
                    xg3Var = new xg3(sQLiteDatabase);
                    m58Var2.f50618b = xg3Var;
                }
                SQLiteDatabase sQLiteDatabase2 = xg3Var.f68178a;
                c3126ix.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + xg3Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        C3126ix.m14166f(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                C3126ix.m14166f((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                C3126ix.m14166f(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    xg3Var.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        context.getClass();
        c3126ix.getClass();
        this.f7062a = context;
        this.f7063b = m58Var;
        this.f7064c = c3126ix;
        this.f7065d = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.f7067f = new dl7(string, context.getCacheDir(), false);
    }

    /* JADX INFO: renamed from: a */
    public final xg3 m2869a(boolean z) {
        dl7 dl7Var = this.f7067f;
        try {
            dl7Var.m10452a((this.f7068g || getDatabaseName() == null) ? false : true);
            this.f7066e = false;
            SQLiteDatabase sQLiteDatabaseM2871c = m2871c(z);
            if (!this.f7066e) {
                return m2870b(sQLiteDatabaseM2871c);
            }
            close();
            return m2869a(z);
        } finally {
            dl7Var.m10453b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final xg3 m2870b(SQLiteDatabase sQLiteDatabase) {
        m58 m58Var = this.f7063b;
        m58Var.getClass();
        xg3 xg3Var = (xg3) m58Var.f50618b;
        if (xg3Var != null && xg3Var.f68178a.equals(sQLiteDatabase)) {
            return xg3Var;
        }
        xg3 xg3Var2 = new xg3(sQLiteDatabase);
        m58Var.f50618b = xg3Var2;
        return xg3Var2;
    }

    /* JADX INFO: renamed from: c */
    public final SQLiteDatabase m2871c(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.f7068g;
        Context context = this.f7062a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof FrameworkSQLiteOpenHelper$OpenHelper$CallbackException) {
                    FrameworkSQLiteOpenHelper$OpenHelper$CallbackException frameworkSQLiteOpenHelper$OpenHelper$CallbackException = (FrameworkSQLiteOpenHelper$OpenHelper$CallbackException) th;
                    int i = zg3.f71531a[frameworkSQLiteOpenHelper$OpenHelper$CallbackException.f7059a.ordinal()];
                    th = frameworkSQLiteOpenHelper$OpenHelper$CallbackException.f7060b;
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        throw th;
                    }
                    if (i != 5) {
                        gm5.m12750e();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f7065d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (FrameworkSQLiteOpenHelper$OpenHelper$CallbackException e) {
                    throw e.f7060b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        dl7 dl7Var = this.f7067f;
        try {
            dl7Var.m10452a(dl7Var.f35791a);
            super.close();
            this.f7063b.f50618b = null;
            this.f7068g = false;
        } finally {
            dl7Var.m10453b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.f7066e;
        C3126ix c3126ix = this.f7064c;
        if (!z && c3126ix.f44720b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            m2870b(sQLiteDatabase);
            c3126ix.getClass();
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.ON_CONFIGURE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((sb2) this.f7064c.f44721c).m21201j(new C0763a(m2870b(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.ON_CREATE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.f7066e = true;
        try {
            this.f7064c.m14173i(m2870b(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.ON_DOWNGRADE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.f7066e) {
            try {
                C3126ix c3126ix = this.f7064c;
                xg3 xg3VarM2870b = m2870b(sQLiteDatabase);
                sb2 sb2Var = (sb2) c3126ix.f44721c;
                sb2Var.m21203l(new C0763a(xg3VarM2870b));
                sb2Var.f60619i = xg3VarM2870b;
            } catch (Throwable th) {
                throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.ON_OPEN, th);
            }
        }
        this.f7068g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.f7066e = true;
        try {
            this.f7064c.m14173i(m2870b(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.ON_UPGRADE, th);
        }
    }
}
