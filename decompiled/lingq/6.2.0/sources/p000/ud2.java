package p000;

import androidx.room.util.AbstractC0758a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ud2 {

    /* JADX INFO: renamed from: a */
    public static final String f63752a = oj5.m18041h("DiagnosticsWrkr");

    /* JADX INFO: renamed from: a */
    public static final String m22683a(g8b g8bVar, w8b w8bVar, sp9 sp9Var, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p8b p8bVar = (p8b) it.next();
            a8b a8bVarM270b = acd.m270b(p8bVar);
            String str = p8bVar.f55772a;
            rp9 rp9VarM21532a = sp9Var.m21532a(a8bVarM270b);
            Integer numValueOf = rp9VarM21532a != null ? Integer.valueOf(rp9VarM21532a.f59689c) : null;
            g8bVar.getClass();
            str.getClass();
            String strM22596N0 = u91.m22596N0((List) AbstractC0758a.m2859b(g8bVar.f40403a, true, false, new xca(str, 6)), ",", null, null, null, 62);
            w8bVar.getClass();
            String strM22596N1 = u91.m22596N0((List) AbstractC0758a.m2859b(w8bVar.f66537a, true, false, new xca(str, 18)), ",", null, null, null, 62);
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("\n", str, "\t ");
            hn1.m13371u(sbM17742q, p8bVar.f55774c, "\t ", numValueOf, "\t ");
            sbM17742q.append(p8bVar.f55773b.name());
            sbM17742q.append("\t ");
            sbM17742q.append(strM22596N0);
            sbM17742q.append("\t ");
            sbM17742q.append(strM22596N1);
            sbM17742q.append('\t');
            sb.append(sbM17742q.toString());
        }
        return sb.toString();
    }
}
