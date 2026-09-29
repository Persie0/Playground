package p000;

import com.google.android.gms.internal.measurement.AbstractC0965i;
import com.google.common.collect.AbstractC1102r;
import com.google.common.collect.ImmutableList;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pld {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f56432a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f56433b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static void m19392a(Throwable th) {
        Throwable cause;
        a3d a3dVar;
        Closeable closeable;
        WeakHashMap weakHashMap = f56433b;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = f56432a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cause2 == null) {
                a3dVar = null;
            } else {
                weakHashMap2.put(th, (mld) weakHashMap2.get(cause2));
                a3dVar = new a3d();
            }
        }
        if (a3dVar != null || (closeable = qld.m20022c().f39318b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (closeable = qld.m20022c().f39318b; closeable != null; closeable = ((AbstractC0965i) closeable).f11860a) {
            arrayList.add(closeable);
        }
        UUID uuid = ((AbstractC0965i) ((gmd) arrayList.get(0))).f11861b;
        if (uuid == null) {
            C3386nv.m17635v("Null rootTraceId");
            return;
        }
        ((gmd) arrayList.get(0)).getClass();
        c14 c14VarM6285n = ImmutableList.m6285n(arrayList.size());
        c14 c14VarM6285n2 = ImmutableList.m6285n(arrayList.size());
        for (gmd gmdVar : AbstractC1102r.m6346a(arrayList)) {
            c14VarM6285n2.m3157b(((AbstractC0965i) gmdVar).f11863d);
            c14VarM6285n.m3157b(gmdVar.mo12759f());
        }
        WeakHashMap weakHashMap3 = f56432a;
        synchronized (weakHashMap3) {
            try {
                ImmutableList immutableListM4280g = c14VarM6285n2.m4280g();
                if (immutableListM4280g == null) {
                    throw new NullPointerException("Null spansNames");
                }
                ImmutableList immutableListM4280g2 = c14VarM6285n.m4280g();
                if (immutableListM4280g2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new mld(immutableListM4280g, immutableListM4280g2, uuid));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
