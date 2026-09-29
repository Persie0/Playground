package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jgb {

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f45524h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public static final String[] f45525i = {"key", "value"};

    /* JADX INFO: renamed from: a */
    public final ContentResolver f45526a;

    /* JADX INFO: renamed from: b */
    public final Uri f45527b;

    /* JADX INFO: renamed from: e */
    public volatile HashMap f45530e;

    /* JADX INFO: renamed from: d */
    public final Object f45529d = new Object();

    /* JADX INFO: renamed from: f */
    public final Object f45531f = new Object();

    /* JADX INFO: renamed from: g */
    public final ArrayList f45532g = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ygb f45528c = new ygb(this);

    public jgb(ContentResolver contentResolver, Uri uri) {
        this.f45526a = contentResolver;
        this.f45527b = uri;
    }

    /* JADX INFO: renamed from: a */
    public final HashMap m14446a() {
        try {
            HashMap map = new HashMap();
            Cursor cursorQuery = this.f45526a.query(this.f45527b, f45525i, null, null, null);
            if (cursorQuery == null) {
                return map;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
            return map;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }
}
