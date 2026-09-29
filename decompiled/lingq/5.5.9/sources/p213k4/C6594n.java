package p213k4;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import dm.C5206f;
import dm.C5207g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import kotlin.collections.EmptyList;
import p003a2.C0009a;
import p234l4.AbstractC7252b;
import p288o4.C7915a;
import p288o4.InterfaceC7917c;

/* JADX INFO: renamed from: k4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6594n extends InterfaceC7917c.a {

    /* JADX INFO: renamed from: b */
    public C6581a f37474b;

    /* JADX INFO: renamed from: c */
    public final a f37475c;

    /* JADX INFO: renamed from: d */
    public final String f37476d;

    /* JADX INFO: renamed from: e */
    public final String f37477e;

    /* JADX INFO: renamed from: k4.n$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public final int f37478a;

        public a(int i10) {
            this.f37478a = i10;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo4719a(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        /* JADX INFO: renamed from: b */
        public abstract void mo4720b(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        /* JADX INFO: renamed from: c */
        public abstract void mo4721c(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        /* JADX INFO: renamed from: d */
        public abstract void mo4722d(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        /* JADX INFO: renamed from: e */
        public abstract void mo4723e();

        /* JADX INFO: renamed from: f */
        public abstract void mo4724f(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        /* JADX INFO: renamed from: g */
        public abstract b mo4725g(FrameworkSQLiteDatabase frameworkSQLiteDatabase);
    }

    /* JADX INFO: renamed from: k4.n$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final boolean f37479a;

        /* JADX INFO: renamed from: b */
        public final String f37480b;

        public b(String str, boolean z10) {
            this.f37479a = z10;
            this.f37480b = str;
        }
    }

    public C6594n(C6581a c6581a, a aVar, String str, String str2) {
        super(aVar.f37478a);
        this.f37474b = c6581a;
        this.f37475c = aVar;
        this.f37476d = str;
        this.f37477e = str2;
    }

    @Override // p288o4.InterfaceC7917c.a
    /* JADX INFO: renamed from: b */
    public final void mo13185b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p288o4.InterfaceC7917c.a
    /* JADX INFO: renamed from: c */
    public final void mo13186c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
        Cursor cursorMo4599o0 = frameworkSQLiteDatabase.mo4599o0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            Cursor cursor = cursorMo4599o0;
            boolean z10 = false;
            if (cursor.moveToFirst() && cursor.getInt(0) == 0) {
                z10 = true;
            }
            C5206f.m11032z0(cursorMo4599o0, null);
            a aVar = this.f37475c;
            aVar.mo4719a(frameworkSQLiteDatabase);
            if (!z10) {
                b bVarMo4725g = aVar.mo4725g(frameworkSQLiteDatabase);
                if (!bVarMo4725g.f37479a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarMo4725g.f37480b);
                }
            }
            m13190g(frameworkSQLiteDatabase);
            aVar.mo4721c(frameworkSQLiteDatabase);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C5206f.m11032z0(cursorMo4599o0, th2);
                throw th3;
            }
        }
    }

    @Override // p288o4.InterfaceC7917c.a
    /* JADX INFO: renamed from: d */
    public final void mo13187d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11) {
        mo13189f(frameworkSQLiteDatabase, i10, i11);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p288o4.InterfaceC7917c.a
    /* JADX INFO: renamed from: e */
    public final void mo13188e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
        Cursor cursorMo4599o0 = frameworkSQLiteDatabase.mo4599o0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            Cursor cursor = cursorMo4599o0;
            boolean z10 = cursor.moveToFirst() && cursor.getInt(0) != 0;
            C5206f.m11032z0(cursorMo4599o0, null);
            a aVar = this.f37475c;
            if (z10) {
                Cursor cursorMo4594b1 = frameworkSQLiteDatabase.mo4594b1(new C7915a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    Cursor cursor2 = cursorMo4594b1;
                    String string = cursor2.moveToFirst() ? cursor2.getString(0) : null;
                    C5206f.m11032z0(cursorMo4594b1, null);
                    String str = this.f37476d;
                    if (!C5207g.m11106a(str, string)) {
                        if (!C5207g.m11106a(this.f37477e, string)) {
                            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + str + ", found: " + string);
                        }
                    }
                    aVar.mo4722d(frameworkSQLiteDatabase);
                    this.f37474b = null;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C5206f.m11032z0(cursorMo4594b1, th2);
                        throw th3;
                    }
                }
            }
            b bVarMo4725g = aVar.mo4725g(frameworkSQLiteDatabase);
            if (!bVarMo4725g.f37479a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarMo4725g.f37480b);
            }
            aVar.mo4723e();
            m13190g(frameworkSQLiteDatabase);
            aVar.mo4722d(frameworkSQLiteDatabase);
            this.f37474b = null;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C5206f.m11032z0(cursorMo4599o0, th4);
                throw th5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    @Override // p288o4.InterfaceC7917c.a
    /* JADX INFO: renamed from: f */
    public final void mo13189f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11) {
        Iterable iterable;
        boolean z10;
        boolean z11;
        C6581a c6581a = this.f37474b;
        a aVar = this.f37475c;
        boolean z12 = false;
        if (c6581a != null) {
            RoomDatabase.C1182c c1182c = c6581a.f37409d;
            c1182c.getClass();
            if (i10 != i11) {
                boolean z13 = i11 > i10;
                ArrayList arrayList = new ArrayList();
                int iIntValue = i10;
                while (true) {
                    if (!(!z13 ? iIntValue <= i11 : iIntValue >= i11)) {
                        iterable = arrayList;
                        break;
                    }
                    TreeMap treeMap = (TreeMap) c1182c.f7539a.get(Integer.valueOf(iIntValue));
                    if (treeMap != null) {
                        Iterator it = (z13 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                            Integer num = (Integer) it.next();
                            if (z13) {
                                int i12 = iIntValue + 1;
                                C5207g.m11110e(num, "targetVersion");
                                int iIntValue2 = num.intValue();
                                if (i12 > iIntValue2 || iIntValue2 > i11) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                            } else {
                                C5207g.m11110e(num, "targetVersion");
                                int iIntValue3 = num.intValue();
                                if (i11 > iIntValue3 || iIntValue3 >= iIntValue) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                            }
                            if (z11) {
                                Object obj = treeMap.get(num);
                                C5207g.m11108c(obj);
                                arrayList.add(obj);
                                iIntValue = num.intValue();
                                z10 = true;
                                break;
                            }
                        }
                        if (!z10) {
                        }
                    }
                    iterable = null;
                    break;
                }
            }
            iterable = EmptyList.f38032a;
            if (iterable != null) {
                aVar.mo4724f(frameworkSQLiteDatabase);
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((AbstractC7252b) it2.next()).mo465a(frameworkSQLiteDatabase);
                }
                b bVarMo4725g = aVar.mo4725g(frameworkSQLiteDatabase);
                if (!bVarMo4725g.f37479a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + bVarMo4725g.f37480b);
                }
                aVar.mo4723e();
                m13190g(frameworkSQLiteDatabase);
                z12 = true;
            }
        }
        if (z12) {
            return;
        }
        C6581a c6581a2 = this.f37474b;
        if (c6581a2 == null || c6581a2.m13168a(i10, i11)) {
            throw new IllegalStateException(C0009a.m20h("A migration from ", i10, " to ", i11, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        aVar.mo4720b(frameworkSQLiteDatabase);
        aVar.mo4719a(frameworkSQLiteDatabase);
    }

    /* JADX INFO: renamed from: g */
    public final void m13190g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f37476d;
        C5207g.m11111f(str, "hash");
        frameworkSQLiteDatabase.mo4600u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }
}
