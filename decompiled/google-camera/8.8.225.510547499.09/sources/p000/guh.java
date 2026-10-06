package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class guh {
    public guh() {
    }

    public guh(dhv dhvVar) {
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
    }

    /* JADX INFO: renamed from: a */
    public static void m9772a() {
        kbi.m13938a(guh.class);
    }

    /* JADX INFO: renamed from: c */
    public static final float m9774c(gth gthVar, Collection collection) {
        Iterator it = collection.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            gth gthVar2 = (gth) it.next();
            if (gthVar != gthVar2) {
                long jAbs = Math.abs(TimeUnit.MILLISECONDS.convert(gthVar.f26339a - gthVar2.f26339a, TimeUnit.NANOSECONDS));
                if (jAbs < j) {
                    j = jAbs;
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return 0.0f;
        }
        return j;
    }
}
