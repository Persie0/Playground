package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jaa extends izs implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final String f33545a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");

    /* JADX INFO: renamed from: c */
    public static final String f33546c = String.format(VCYBIzY.RTwsFlfCfepvt, "hit_time", "hits2");

    /* JADX INFO: renamed from: d */
    public final jay f33547d;

    /* JADX INFO: renamed from: e */
    public final jay f33548e;

    /* JADX INFO: renamed from: f */
    private final izz f33549f;

    public jaa(izv izvVar) {
        super(izvVar);
        this.f33547d = new jay();
        this.f33548e = new jay();
        this.f33549f = new izz(this, izvVar.f32728a);
    }

    /* JADX INFO: renamed from: C */
    final Map m12753C(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = "?" + str;
            }
            URI uri = new URI(str);
            Map mapEmptyMap = Collections.emptyMap();
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null && rawQuery.length() > 0) {
                mapEmptyMap = new HashMap();
                msa msaVarM16846b = msa.m16846b('=');
                Iterator it = msa.m16846b('&').m16848a().m16849d(rawQuery).iterator();
                while (it.hasNext()) {
                    List listM16851f = msaVarM16846b.m16851f((String) it.next());
                    if (listM16851f.isEmpty() || listM16851f.size() > 2) {
                        throw new IllegalArgumentException("bad parameter");
                    }
                    mapEmptyMap.put(jiu.m13236a((String) listM16851f.get(0)), listM16851f.size() == 2 ? jiu.m13236a((String) listM16851f.get(1)) : null);
                }
            }
            return mapEmptyMap;
        } catch (URISyntaxException e) {
            m11934o("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m12754D(long j) {
        izo.m11916a();
        m11946z();
        ArrayList arrayList = new ArrayList(1);
        Long lValueOf = Long.valueOf(j);
        arrayList.add(lValueOf);
        m11937r("Deleting hit, id", lValueOf);
        m12755E(arrayList);
    }

    /* JADX INFO: renamed from: E */
    public final void m12755E(List list) {
        jib.m13205j(list);
        izo.m11916a();
        m11946z();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id");
        sb.append(" in (");
        for (int i = 0; i < list.size(); i++) {
            Long l = (Long) list.get(i);
            if (l == null || l.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i > 0) {
                sb.append(",");
            }
            sb.append(l);
        }
        sb.append(")");
        String string = sb.toString();
        try {
            SQLiteDatabase sQLiteDatabaseM12759b = m12759b();
            m11937r("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int iDelete = sQLiteDatabaseM12759b.delete("hits2", string, null);
            if (iDelete != list.size()) {
                super.m11942w(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(iDelete), string);
            }
        } catch (SQLiteException e) {
            m11934o("Error deleting hits", e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m12756F() {
        m11946z();
        m12759b().endTransaction();
    }

    /* JADX INFO: renamed from: G */
    public final void m12757G() {
        m11946z();
        m12759b().setTransactionSuccessful();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX INFO: renamed from: H */
    public final boolean m12758H() throws Throwable {
        izo.m11916a();
        m11946z();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = m12759b().rawQuery("SELECT COUNT(*) FROM hits2", null);
            try {
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j == 0;
            } catch (SQLiteException e) {
                e = e;
                try {
                    m11935p("Database error", "SELECT COUNT(*) FROM hits2", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p000.izs
    /* JADX INFO: renamed from: a */
    protected final void mo11918a() {
    }

    /* JADX INFO: renamed from: b */
    final SQLiteDatabase m12759b() {
        try {
            return this.f33549f.getWritableDatabase();
        } catch (SQLiteException e) {
            m11940u("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX INFO: renamed from: c */
    public final List m12760c(long j) throws Throwable {
        int i = 0;
        jib.m13196a(j >= 0);
        izo.m11916a();
        m11946z();
        Cursor cursor = null;
        try {
            int i2 = 2;
            int i3 = 3;
            int i4 = 4;
            Cursor cursorQuery = m12759b().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
            try {
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        long j2 = cursorQuery.getLong(i);
                        long j3 = cursorQuery.getLong(1);
                        String string = cursorQuery.getString(i2);
                        String string2 = cursorQuery.getString(i3);
                        int i5 = cursorQuery.getInt(i4);
                        Map mapM12753C = m12753C(string);
                        boolean z = TextUtils.isEmpty(string2) || !string2.startsWith("http:");
                        arrayList.add(new jao(this, mapM12753C, j3, z, j2, i5));
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        i3 = 3;
                        i4 = 4;
                        i2 = 2;
                        i = 0;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    m11934o("Error loading hits from the database", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f33549f.close();
        } catch (SQLiteException e) {
            m11934o("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            m11934o("Error closing database", e2);
        }
    }
}
