package p000;

import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfv {

    /* JADX INFO: renamed from: a */
    public static final Map f3140a;

    static {
        HashMap map = new HashMap();
        f3140a = map;
        bge bgeVar = new bge();
        bgeVar.m2398q();
        map.put("dc:contributor", bgeVar);
        map.put("dc:language", bgeVar);
        map.put("dc:publisher", bgeVar);
        map.put("dc:relation", bgeVar);
        map.put("dc:subject", bgeVar);
        map.put("dc:type", bgeVar);
        bge bgeVar2 = new bge();
        bgeVar2.m2398q();
        bgeVar2.m2401t();
        map.put("dc:creator", bgeVar2);
        map.put("dc:date", bgeVar2);
        bge bgeVar3 = new bge();
        bgeVar3.m2398q();
        bgeVar3.m2401t();
        bgeVar3.m2400s();
        bgeVar3.m2399r();
        map.put(CswIK.pPHhHAHsRDDs, bgeVar3);
        map.put("dc:rights", bgeVar3);
        map.put("dc:title", bgeVar3);
    }

    /* JADX INFO: renamed from: a */
    public static void m2354a(bfu bfuVar, bfu bfuVar2, boolean z) throws bfc {
        boolean zEquals = bfuVar.f3131b.equals(bfuVar2.f3131b);
        String str = KMNlNMe.OiSPfnJkVEa;
        if (!zEquals || bfuVar.m2334a() != bfuVar2.m2334a()) {
            throw new bfc(str, 203);
        }
        if (!z && (!bfuVar.f3130a.equals(bfuVar2.f3130a) || !bfuVar.m2340g().equals(bfuVar2.m2340g()) || bfuVar.m2335b() != bfuVar2.m2335b())) {
            throw new bfc(str, 203);
        }
        Iterator itM2341h = bfuVar.m2341h();
        Iterator itM2341h2 = bfuVar2.m2341h();
        while (itM2341h.hasNext() && itM2341h2.hasNext()) {
            m2354a((bfu) itM2341h.next(), (bfu) itM2341h2.next(), false);
        }
        Iterator itM2342i = bfuVar.m2342i();
        Iterator itM2342i2 = bfuVar2.m2342i();
        while (itM2342i.hasNext() && itM2342i2.hasNext()) {
            m2354a((bfu) itM2342i.next(), (bfu) itM2342i2.next(), false);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2355b(bfu bfuVar) throws bfc {
        if (bfuVar == null || !bfuVar.m2340g().m2389d()) {
            return;
        }
        bge bgeVarM2340g = bfuVar.m2340g();
        bgeVarM2340g.m2401t();
        bgeVarM2340g.m2400s();
        bgeVarM2340g.m2399r();
        Iterator itM2341h = bfuVar.m2341h();
        while (itM2341h.hasNext()) {
            bfu bfuVar2 = (bfu) itM2341h.next();
            if (bfuVar2.m2340g().m2393l()) {
                itM2341h.remove();
            } else if (!bfuVar2.m2340g().m2388c()) {
                String str = bfuVar2.f3131b;
                if (str == null || str.length() == 0) {
                    itM2341h.remove();
                } else {
                    bfuVar2.m2346m(new bfu("xml:lang", "x-repair", null));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2356c(Iterator it, bfu bfuVar, bfu bfuVar2) throws bfc {
        if (bfuVar2.m2340g().m2390i()) {
            if (bfuVar.m2340g().m2388c()) {
                throw new bfc("Alias to x-default already has a language qualifier", 203);
            }
            bfuVar.m2346m(new bfu("xml:lang", "x-default", null));
        }
        it.remove();
        bfuVar.f3130a = "[]";
        bfuVar2.m2344k(bfuVar);
    }
}
