package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class btl {

    /* JADX INFO: renamed from: a */
    private final btk f4432a = new btk(null);

    /* JADX INFO: renamed from: b */
    private final Map f4433b = new HashMap();

    /* JADX INFO: renamed from: d */
    private static void m3049d(btk btkVar) {
        btk btkVar2 = btkVar.f4431d;
        btkVar2.f4430c = btkVar.f4430c;
        btkVar.f4430c.f4431d = btkVar2;
    }

    /* JADX INFO: renamed from: e */
    private static void m3050e(btk btkVar) {
        btkVar.f4430c.f4431d = btkVar;
        btkVar.f4431d.f4430c = btkVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m3051a(bts btsVar) {
        btk btkVar = (btk) this.f4433b.get(btsVar);
        if (btkVar == null) {
            btkVar = new btk(btsVar);
            this.f4433b.put(btsVar, btkVar);
        } else {
            btsVar.mo3054a();
        }
        m3049d(btkVar);
        btk btkVar2 = this.f4432a;
        btkVar.f4431d = btkVar2;
        btkVar.f4430c = btkVar2.f4430c;
        m3050e(btkVar);
        return btkVar.m3048b();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [bts, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final Object m3052b() {
        for (btk btkVar = this.f4432a.f4431d; !btkVar.equals(this.f4432a); btkVar = btkVar.f4431d) {
            Object objM3048b = btkVar.m3048b();
            if (objM3048b != null) {
                return objM3048b;
            }
            m3049d(btkVar);
            this.f4433b.remove(btkVar.f4428a);
            btkVar.f4428a.mo3054a();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m3053c(bts btsVar, Object obj) {
        btk btkVar = (btk) this.f4433b.get(btsVar);
        if (btkVar == null) {
            btkVar = new btk(btsVar);
            m3049d(btkVar);
            btk btkVar2 = this.f4432a;
            btkVar.f4431d = btkVar2.f4431d;
            btkVar.f4430c = btkVar2;
            m3050e(btkVar);
            this.f4433b.put(btsVar, btkVar);
        } else {
            btsVar.mo3054a();
        }
        if (btkVar.f4429b == null) {
            btkVar.f4429b = new ArrayList();
        }
        btkVar.f4429b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        btk btkVar = this.f4432a.f4430c;
        boolean z = false;
        while (!btkVar.equals(this.f4432a)) {
            sb.append('{');
            sb.append(btkVar.f4428a);
            sb.append(':');
            sb.append(btkVar.m3047a());
            sb.append("}, ");
            btkVar = btkVar.f4430c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
