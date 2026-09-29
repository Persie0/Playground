package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rsb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f59769a = new C0282a(165496392, false, new qd1(25));

    /* JADX INFO: renamed from: b */
    public static final C0282a f59770b = new C0282a(-1152080013, false, new sd1(0));

    /* JADX INFO: renamed from: a */
    public static final on3 m20769a(ArrayList arrayList) {
        on3 on3VarMo16935d;
        Iterator it = arrayList.iterator();
        mn3 mn3Var = mn3.f51554a;
        while (it.hasNext()) {
            on3 on3Var = (on3) it.next();
            if (on3Var != null && (on3VarMo16935d = mn3Var.mo16935d(on3Var)) != null) {
                mn3Var = on3VarMo16935d;
            }
        }
        return mn3Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX INFO: renamed from: b */
    public static final void m20770b(w58 w58Var, boolean z) {
        ArrayList<vp2> arrayList = w58Var.f45997c;
        int i = 1;
        if (!arrayList.isEmpty()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((vp2) it.next()) instanceof gq2)) {
                            if (arrayList.size() != 1) {
                                wp2 wp2Var = new wp2();
                                u91.m22630w0(arrayList, wp2Var.f45997c);
                                arrayList.clear();
                                arrayList.add(wp2Var);
                            }
                        }
                    }
                }
            }
            for (vp2 vp2Var : arrayList) {
                vp2Var.getClass();
                ArrayList arrayList2 = ((gq2) vp2Var).f45997c;
                if (arrayList2.size() != 1) {
                    wp2 wp2Var2 = new wp2();
                    u91.m22630w0(arrayList2, wp2Var2.f45997c);
                    arrayList2.clear();
                    arrayList2.add(wp2Var2);
                }
            }
        } else if (arrayList.size() != 1) {
            wp2 wp2Var3 = new wp2();
            u91.m22630w0(arrayList, wp2Var3.f45997c);
            arrayList.clear();
            arrayList.add(wp2Var3);
        }
        m20771c(w58Var);
        m20772d(w58Var, new cz1(i, z));
    }

    /* JADX INFO: renamed from: c */
    public static final void m20771c(jq2 jq2Var) {
        ArrayList<vp2> arrayList = jq2Var.f45997c;
        for (vp2 vp2Var : arrayList) {
            if (vp2Var instanceof jq2) {
                m20771c((jq2) vp2Var);
            }
        }
        cs3 cs3Var = (cs3) jq2Var.mo2977a().mo11685a(null, uz3.f64592J);
        pg2 pg2Var = og2.f54304a;
        if (((cs3Var != null ? cs3Var.f34485a : pg2Var) instanceof og2) && (arrayList == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cs3 cs3Var2 = (cs3) ((vp2) it.next()).mo2977a().mo11685a(null, uz3.f64594L);
                if ((cs3Var2 != null ? cs3Var2.f34485a : null) instanceof kg2) {
                    jq2Var.mo2978b(jq2Var.mo2977a().mo16935d(new cs3(kg2.f47164a)));
                    break;
                }
            }
        }
        m4b m4bVar = (m4b) jq2Var.mo2977a().mo11685a(null, uz3.f64593K);
        if (m4bVar != null) {
            pg2Var = m4bVar.f50591a;
        }
        if (pg2Var instanceof og2) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    m4b m4bVar2 = (m4b) ((vp2) it2.next()).mo2977a().mo11685a(null, uz3.f64595M);
                    if ((m4bVar2 != null ? m4bVar2.f50591a : null) instanceof kg2) {
                        jq2Var.mo2978b(ci8.m4735t(jq2Var.mo2977a()));
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m20772d(jq2 jq2Var, cz1 cz1Var) {
        int i = 0;
        for (Object obj : jq2Var.f45997c) {
            int i2 = i + 1;
            if (i < 0) {
                vz1.m23628e0();
                throw null;
            }
            vp2 vp2Var = (vp2) cz1Var.invoke((vp2) obj);
            jq2Var.f45997c.set(i, vp2Var);
            if (vp2Var instanceof jq2) {
                m20772d((jq2) vp2Var, cz1Var);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final LinkedHashMap m20773e(jq2 jq2Var) {
        ArrayList arrayList = jq2Var.f45997c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                vz1.m23628e0();
                throw null;
            }
            vp2 vp2Var = (vp2) obj;
            on3 on3VarMo2977a = vp2Var.mo2977a();
            Pair pair = on3VarMo2977a.mo11687c(cm6.f10272b) ? (Pair) on3VarMo2977a.mo11685a(new Pair(null, mn3.f51554a), uz3.f64591I) : new Pair(null, on3VarMo2977a);
            C0836c6 c0836c6 = (C0836c6) pair.f47623a;
            on3 on3Var = (on3) pair.f47624b;
            InterfaceC3063h5 interfaceC3063h5 = c0836c6 != null ? c0836c6.f9603a : null;
            Pair pair2 = interfaceC3063h5 instanceof cl4 ? new Pair(interfaceC3063h5, on3Var) : new Pair(null, on3Var);
            if (vp2Var instanceof jq2) {
                for (Map.Entry entry : m20773e((jq2) vp2Var).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object arrayList2 = linkedHashMap.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str, arrayList2);
                    }
                    ((List) arrayList2).addAll(list);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }
}
