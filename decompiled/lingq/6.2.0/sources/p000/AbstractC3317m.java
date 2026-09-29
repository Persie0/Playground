package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3317m {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f50370a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final synchronized void m16589a() {
        Set set = lp1.f49971a;
        if (set.contains(AbstractC3317m.class)) {
            return;
        }
        try {
            if (f50370a.getAndSet(true)) {
                return;
            }
            sy2 sy2Var = sy2.f61585a;
            if (ema.m11256c()) {
                m16590b();
            }
            int i = AbstractC3129j.f44817a;
            if (!set.contains(AbstractC3129j.class)) {
                try {
                    AbstractC3129j.f44818b.scheduleWithFixedDelay(AbstractC3129j.f44820d, 0L, 500L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    lp1.m16420a(AbstractC3129j.class, th);
                }
            }
            return;
        } catch (Throwable th2) {
            lp1.m16420a(AbstractC3317m.class, th2);
            return;
        }
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static final void m16590b() {
        File[] fileArrListFiles;
        if (lp1.f49971a.contains(AbstractC3317m.class)) {
            return;
        }
        try {
            if (bna.m3941b0()) {
                return;
            }
            File fileM22058q = thb.m22058q();
            int i = 0;
            if (fileM22058q == null) {
                fileArrListFiles = new File[0];
            } else {
                fileArrListFiles = fileM22058q.listFiles(new jt2(1));
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                arrayList.add(egd.m11102d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((r74) obj).m20432c()) {
                    arrayList2.add(obj);
                }
            }
            List listM22614f1 = u91.m22614f1(arrayList2, new C3166k(0));
            JSONArray jSONArray = new JSONArray();
            Iterator it = l70.m15922M(0, Math.min(listM22614f1.size(), 5)).iterator();
            while (((h84) it).f41941c) {
                jSONArray.put(listM22614f1.get(((a84) it).nextInt()));
            }
            thb.m22037B("anr_reports", jSONArray, new C3280l(listM22614f1, i));
        } catch (Throwable th) {
            lp1.m16420a(AbstractC3317m.class, th);
        }
    }
}
