package p288o4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import dm.C5207g;
import java.io.Closeable;
import java.io.File;
import mo.C7661i;

/* JADX INFO: renamed from: o4.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7917c extends Closeable {

    /* JADX INFO: renamed from: o4.c$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public final int f43145a;

        public a(int i10) {
            this.f43145a = i10;
        }

        /* JADX INFO: renamed from: a */
        public static void m15735a(String str) {
            if (!C7661i.m15249O2(str, ":memory:")) {
                boolean z10 = true;
                int length = str.length() - 1;
                int i10 = 0;
                boolean z11 = false;
                while (i10 <= length) {
                    boolean z12 = C5207g.m11113h(str.charAt(!z11 ? i10 : length), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z12) {
                        i10++;
                    } else {
                        z11 = true;
                    }
                }
                if (str.subSequence(i10, length + 1).toString().length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e10) {
                    Log.w("SupportSQLite", "delete failed: ", e10);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo13185b(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        /* JADX INFO: renamed from: c */
        public abstract void mo13186c(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        /* JADX INFO: renamed from: d */
        public abstract void mo13187d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11);

        /* JADX INFO: renamed from: e */
        public abstract void mo13188e(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        /* JADX INFO: renamed from: f */
        public abstract void mo13189f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11);
    }

    /* JADX INFO: renamed from: o4.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Context f43146a;

        /* JADX INFO: renamed from: b */
        public final String f43147b;

        /* JADX INFO: renamed from: c */
        public final a f43148c;

        /* JADX INFO: renamed from: d */
        public final boolean f43149d;

        /* JADX INFO: renamed from: e */
        public final boolean f43150e;

        public b(Context context, String str, a aVar, boolean z10, boolean z11) {
            C5207g.m11111f(context, "context");
            this.f43146a = context;
            this.f43147b = str;
            this.f43148c = aVar;
            this.f43149d = z10;
            this.f43150e = z11;
        }
    }

    /* JADX INFO: renamed from: o4.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC7917c mo5467a(b bVar);
    }

    String getDatabaseName();

    /* JADX INFO: renamed from: n0 */
    InterfaceC7916b mo4578n0();

    void setWriteAheadLoggingEnabled(boolean z10);
}
