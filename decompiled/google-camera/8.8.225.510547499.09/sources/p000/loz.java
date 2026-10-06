package p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class loz {

    /* JADX INFO: renamed from: a */
    public static final Map f38869a = new C1109wy();

    /* JADX INFO: renamed from: b */
    public static final String[] f38870b = {"key", "value"};

    /* JADX INFO: renamed from: c */
    public final ContentResolver f38871c;

    /* JADX INFO: renamed from: d */
    public final Uri f38872d;

    /* JADX INFO: renamed from: e */
    public final Object f38873e;

    /* JADX INFO: renamed from: f */
    public volatile Map f38874f;

    /* JADX INFO: renamed from: g */
    private final ContentObserver f38875g;

    /* JADX INFO: renamed from: h */
    private final List f38876h;

    private loz(ContentResolver contentResolver, Uri uri) {
        loy loyVar = new loy(this);
        this.f38875g = loyVar;
        this.f38873e = new Object();
        this.f38876h = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f38871c = contentResolver;
        this.f38872d = uri;
        contentResolver.registerContentObserver(uri, false, loyVar);
    }

    /* JADX INFO: renamed from: a */
    static synchronized void m15793a() {
        for (loz lozVar : f38869a.values()) {
            lozVar.f38871c.unregisterContentObserver(lozVar.f38875g);
        }
        f38869a.clear();
    }

    /* JADX INFO: renamed from: c */
    public static loz m15794c(ContentResolver contentResolver, Uri uri) {
        loz lozVar;
        synchronized (loz.class) {
            Map map = f38869a;
            lozVar = (loz) map.get(uri);
            if (lozVar == null) {
                try {
                    loz lozVar2 = new loz(contentResolver, uri);
                    try {
                        map.put(uri, lozVar2);
                    } catch (SecurityException e) {
                    }
                    lozVar = lozVar2;
                } catch (SecurityException e2) {
                }
            }
        }
        return lozVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m15795b() {
        synchronized (this.f38873e) {
            this.f38874f = null;
            lpv.m15842g();
        }
        synchronized (this) {
            Iterator it = this.f38876h.iterator();
            while (it.hasNext()) {
                ((lpa) it.next()).m15800a();
            }
        }
    }
}
