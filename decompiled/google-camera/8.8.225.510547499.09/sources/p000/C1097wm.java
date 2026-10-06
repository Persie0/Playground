package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: wm */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1097wm implements InterfaceC0978sb {

    /* JADX INFO: renamed from: a */
    public final Map f47939a;

    /* JADX INFO: renamed from: b */
    public final List f47940b;

    /* JADX INFO: renamed from: c */
    public final List f47941c;

    /* JADX INFO: renamed from: d */
    public final List f47942d;

    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Iterable, java.lang.Object] */
    public C1097wm(InterfaceC0953rd interfaceC0953rd, C0948qz c0948qz) {
        boolean z;
        interfaceC0953rd.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) interfaceC0953rd.mo19374a(key);
        if (num != null && num.intValue() == 2) {
            z = false;
        } else if (num != null && num.intValue() == 0) {
            z = false;
        } else {
            z = true;
            if (num != null && num.intValue() == 4) {
                z = false;
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (bkn bknVar : c0948qz.f47515b) {
            for (C0971rv c0971rv : bknVar.f3651a) {
                if (!linkedHashMap.containsKey(c0971rv)) {
                    int iM18846b = C1098wn.f47945c.m18846b();
                    Size size = c0971rv.f47564a;
                    int i = c0971rv.f47565b;
                    String str = c0948qz.f47514a;
                    Integer num2 = (Integer) linkedHashMap3.get(bknVar);
                    if (z) {
                        if ((c0971rv instanceof C0970ru ? (C0970ru) c0971rv : null) != null) {
                            throw null;
                        }
                    }
                    if ((c0971rv instanceof C0969rt ? (C0969rt) c0971rv : null) != null) {
                        throw null;
                    }
                    C1095wk c1095wk = new C1095wk(iM18846b, size, i, str, num2);
                    linkedHashMap.put(c0971rv, c1095wk);
                    arrayList.add(c1095wk);
                    linkedHashMap3 = linkedHashMap3;
                }
            }
        }
        int size2 = c0948qz.f47515b.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bkn bknVar2 = (bkn) c0948qz.f47515b.get(i2);
            ?? r9 = bknVar2.f3651a;
            ArrayList arrayList3 = new ArrayList(omn.m18678R(r9));
            Iterator it = r9.iterator();
            while (it.hasNext()) {
                Object obj = linkedHashMap.get((C0971rv) it.next());
                obj.getClass();
                C1095wk c1095wk2 = (C1095wk) obj;
                arrayList3.add(new C1096wl(C1098wn.f47944b.m18846b(), c1095wk2.f47927a, c1095wk2.f47928b, c1095wk2.f47929c));
            }
            C0959rj c0959rj = new C0959rj(C1098wn.f47943a.m18846b(), arrayList3);
            linkedHashMap2.put(bknVar2, c0959rj);
            arrayList2.add(c0959rj);
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((C1096wl) it2.next()).f47938e = c0959rj;
            }
            Iterator it3 = bknVar2.f3651a.iterator();
            while (it3.hasNext()) {
                Object obj2 = linkedHashMap.get((C0971rv) it3.next());
                obj2.getClass();
                ((C1095wk) obj2).f47931e.add(c0959rj);
            }
        }
        this.f47941c = arrayList2;
        ArrayList arrayList4 = new ArrayList(omn.m18678R(arrayList2));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList4.add(C0979sc.m19386a(((C0959rj) it4.next()).f47553a));
        }
        omn.m18675O(arrayList4);
        this.f47939a = linkedHashMap2;
        List list = this.f47941c;
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            omn.m18677Q(arrayList5, ((C0959rj) it5.next()).f47554b);
        }
        this.f47942d = arrayList5;
        this.f47940b = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StreamGraphImpl ");
        Map map = this.f47939a;
        sb.append(map);
        return "StreamGraphImpl ".concat(map.toString());
    }
}
