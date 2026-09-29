package androidx.sqlite.p018db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteOpenHelper;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.C6740a;
import kotlin.Metadata;
import p288o4.InterfaceC7916b;
import p288o4.InterfaceC7917c;
import p331q4.C8493a;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper implements InterfaceC7917c {

    /* JADX INFO: renamed from: a */
    public final Context f7571a;

    /* JADX INFO: renamed from: b */
    public final String f7572b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7917c.a f7573c;

    /* JADX INFO: renamed from: d */
    public final boolean f7574d;

    /* JADX INFO: renamed from: e */
    public final boolean f7575e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC9070c<OpenHelper> f7576f;

    /* JADX INFO: renamed from: g */
    public boolean f7577g;

    public static final class OpenHelper extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int f7578h = 0;

        /* JADX INFO: renamed from: a */
        public final Context f7579a;

        /* JADX INFO: renamed from: b */
        public final C1192a f7580b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7917c.a f7581c;

        /* JADX INFO: renamed from: d */
        public final boolean f7582d;

        /* JADX INFO: renamed from: e */
        public boolean f7583e;

        /* JADX INFO: renamed from: f */
        public final C8493a f7584f;

        /* JADX INFO: renamed from: g */
        public boolean f7585g;

        @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m13365d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
        public static final class CallbackException extends RuntimeException {

            /* JADX INFO: renamed from: a */
            public final CallbackName f7586a;

            /* JADX INFO: renamed from: b */
            public final Throwable f7587b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(CallbackName callbackName, Throwable th2) {
                super(th2);
                C5207g.m11111f(callbackName, "callbackName");
                this.f7586a = callbackName;
                this.f7587b = th2;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f7587b;
            }
        }

        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13365d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "(Ljava/lang/String;I)V", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$a */
        public static final class C1190a {
            /* JADX INFO: renamed from: a */
            public static FrameworkSQLiteDatabase m4607a(C1192a c1192a, SQLiteDatabase sQLiteDatabase) {
                C5207g.m11111f(c1192a, "refHolder");
                C5207g.m11111f(sQLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = c1192a.f7589a;
                if (frameworkSQLiteDatabase == null || !C5207g.m11106a(frameworkSQLiteDatabase.f7569a, sQLiteDatabase)) {
                    frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sQLiteDatabase);
                    c1192a.f7589a = frameworkSQLiteDatabase;
                }
                return frameworkSQLiteDatabase;
            }
        }

        /* JADX INFO: renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$b */
        public /* synthetic */ class C1191b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f7588a;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f7588a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final C1192a c1192a, final InterfaceC7917c.a aVar, boolean z10) {
            super(context, str, null, aVar.f43145a, new DatabaseErrorHandler() { // from class: p4.c
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C5207g.m11111f(aVar, "$callback");
                    FrameworkSQLiteOpenHelper.C1192a c1192a2 = c1192a;
                    C5207g.m11111f(c1192a2, "$dbRef");
                    int i10 = FrameworkSQLiteOpenHelper.OpenHelper.f7578h;
                    C5207g.m11110e(sQLiteDatabase, "dbObj");
                    FrameworkSQLiteDatabase frameworkSQLiteDatabaseM4607a = FrameworkSQLiteOpenHelper.OpenHelper.C1190a.m4607a(c1192a2, sQLiteDatabase);
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + frameworkSQLiteDatabaseM4607a + ".path");
                    if (!frameworkSQLiteDatabaseM4607a.isOpen()) {
                        String strM4593b = frameworkSQLiteDatabaseM4607a.m4593b();
                        if (strM4593b != null) {
                            InterfaceC7917c.a.m15735a(strM4593b);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> listM4591a = null;
                    try {
                        try {
                            listM4591a = frameworkSQLiteDatabaseM4607a.m4591a();
                        } catch (SQLiteException unused) {
                        }
                        try {
                            frameworkSQLiteDatabaseM4607a.close();
                        } catch (IOException unused2) {
                        }
                        if (listM4591a == null) {
                            String strM4593b2 = frameworkSQLiteDatabaseM4607a.m4593b();
                            if (strM4593b2 != null) {
                                InterfaceC7917c.a.m15735a(strM4593b2);
                                return;
                            }
                            return;
                        }
                        Iterator<T> it = listM4591a.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            C5207g.m11110e(obj, "p.second");
                            InterfaceC7917c.a.m15735a((String) obj);
                        }
                    } catch (Throwable th2) {
                        if (listM4591a != null) {
                            Iterator<T> it2 = listM4591a.iterator();
                            while (it2.hasNext()) {
                                Object obj2 = ((Pair) it2.next()).second;
                                C5207g.m11110e(obj2, "p.second");
                                InterfaceC7917c.a.m15735a((String) obj2);
                            }
                        } else {
                            String strM4593b3 = frameworkSQLiteDatabaseM4607a.m4593b();
                            if (strM4593b3 != null) {
                                InterfaceC7917c.a.m15735a(strM4593b3);
                            }
                        }
                        throw th2;
                    }
                }
            });
            C5207g.m11111f(context, "context");
            C5207g.m11111f(aVar, "callback");
            this.f7579a = context;
            this.f7580b = c1192a;
            this.f7581c = aVar;
            this.f7582d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                C5207g.m11110e(str, "randomUUID().toString()");
            }
            this.f7584f = new C8493a(str, context.getCacheDir(), false);
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC7916b m4603a(boolean z10) {
            C8493a c8493a = this.f7584f;
            try {
                c8493a.m16579a((this.f7585g || getDatabaseName() == null) ? false : true);
                this.f7583e = false;
                SQLiteDatabase sQLiteDatabaseM4606q = m4606q(z10);
                if (!this.f7583e) {
                    return m4604b(sQLiteDatabaseM4606q);
                }
                close();
                return m4603a(z10);
            } finally {
                c8493a.m16580b();
            }
        }

        /* JADX INFO: renamed from: b */
        public final FrameworkSQLiteDatabase m4604b(SQLiteDatabase sQLiteDatabase) {
            C5207g.m11111f(sQLiteDatabase, "sqLiteDatabase");
            return C1190a.m4607a(this.f7580b, sQLiteDatabase);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            C8493a c8493a = this.f7584f;
            try {
                c8493a.m16579a(c8493a.f45689a);
                super.close();
                this.f7580b.f7589a = null;
                this.f7585g = false;
                c8493a.m16580b();
            } catch (Throwable th2) {
                c8493a.m16580b();
                throw th2;
            }
        }

        /* JADX INFO: renamed from: l */
        public final SQLiteDatabase m4605l(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                C5207g.m11110e(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            C5207g.m11110e(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            C5207g.m11111f(sQLiteDatabase, "db");
            boolean z10 = this.f7583e;
            InterfaceC7917c.a aVar = this.f7581c;
            if (!z10 && aVar.f43145a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                aVar.mo13185b(m4604b(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            C5207g.m11111f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f7581c.mo13186c(m4604b(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_CREATE, th2);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            C5207g.m11111f(sQLiteDatabase, "db");
            this.f7583e = true;
            try {
                this.f7581c.mo13187d(m4604b(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            C5207g.m11111f(sQLiteDatabase, "db");
            if (!this.f7583e) {
                try {
                    this.f7581c.mo13188e(m4604b(sQLiteDatabase));
                } catch (Throwable th2) {
                    throw new CallbackException(CallbackName.ON_OPEN, th2);
                }
            }
            this.f7585g = true;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            C5207g.m11111f(sQLiteDatabase, "sqLiteDatabase");
            this.f7583e = true;
            try {
                this.f7581c.mo13189f(m4604b(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th2);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: q */
        public final SQLiteDatabase m4606q(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f7585g;
            Context context = this.f7579a;
            if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return m4605l(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return m4605l(z10);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof CallbackException) {
                        CallbackException callbackException = th2;
                        int i10 = C1191b.f7588a[callbackException.f7586a.ordinal()];
                        Throwable th3 = callbackException.f7587b;
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                            throw th3;
                        }
                        if (!(th3 instanceof SQLiteException)) {
                            throw th3;
                        }
                    } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.f7582d) {
                        throw th2;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return m4605l(z10);
                    } catch (CallbackException e10) {
                        throw e10.f7587b;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$a */
    public static final class C1192a {

        /* JADX INFO: renamed from: a */
        public FrameworkSQLiteDatabase f7589a = null;
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, InterfaceC7917c.a aVar, boolean z10, boolean z11) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(aVar, "callback");
        this.f7571a = context;
        this.f7572b = str;
        this.f7573c = aVar;
        this.f7574d = z10;
        this.f7575e = z11;
        this.f7576f = C6740a.m13372a(new InterfaceC2041a<OpenHelper>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final FrameworkSQLiteOpenHelper.OpenHelper mo807E() {
                FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = this.f7590b;
                if (frameworkSQLiteOpenHelper.f7572b == null || !frameworkSQLiteOpenHelper.f7574d) {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.f7571a, frameworkSQLiteOpenHelper.f7572b, new FrameworkSQLiteOpenHelper.C1192a(), frameworkSQLiteOpenHelper.f7573c, frameworkSQLiteOpenHelper.f7575e);
                } else {
                    Context context2 = frameworkSQLiteOpenHelper.f7571a;
                    C5207g.m11111f(context2, "context");
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    C5207g.m11110e(noBackupFilesDir, "context.noBackupFilesDir");
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.f7571a, new File(noBackupFilesDir, frameworkSQLiteOpenHelper.f7572b).getAbsolutePath(), new FrameworkSQLiteOpenHelper.C1192a(), frameworkSQLiteOpenHelper.f7573c, frameworkSQLiteOpenHelper.f7575e);
                }
                openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.f7577g);
                return openHelper;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC9070c<OpenHelper> interfaceC9070c = this.f7576f;
        if (interfaceC9070c.mo3942b()) {
            interfaceC9070c.getValue().close();
        }
    }

    @Override // p288o4.InterfaceC7917c
    public final String getDatabaseName() {
        return this.f7572b;
    }

    @Override // p288o4.InterfaceC7917c
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC7916b mo4578n0() {
        return this.f7576f.getValue().m4603a(true);
    }

    @Override // p288o4.InterfaceC7917c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        InterfaceC9070c<OpenHelper> interfaceC9070c = this.f7576f;
        if (interfaceC9070c.mo3942b()) {
            OpenHelper value = interfaceC9070c.getValue();
            C5207g.m11111f(value, "sQLiteOpenHelper");
            value.setWriteAheadLoggingEnabled(z10);
        }
        this.f7577g = z10;
    }
}
