package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q2c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f57174a = new C0282a(160056073, false, new ud1(28));

    /* JADX INFO: renamed from: b */
    public static final C0282a f57175b = new C0282a(-1742355543, false, new ud1(29));

    /* JADX INFO: renamed from: c */
    public static final C0282a f57176c = new C0282a(362448862, false, new wd1(13));

    /* JADX INFO: renamed from: d */
    public static final C0282a f57177d = new C0282a(1566816859, false, new vd1(1));

    /* JADX INFO: renamed from: a */
    public static final ArrayList m19624a(List list) {
        List listM23604J;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            td7 td7Var = (td7) it.next();
            if (td7Var instanceof sd7) {
                listM23604J = vz1.m23604J(((sd7) td7Var).f60709a);
            } else {
                if (!(td7Var instanceof rd7)) {
                    gm5.m12750e();
                    return null;
                }
                listM23604J = ((rd7) td7Var).f59117b;
            }
            u91.m22630w0(listM23604J, arrayList);
        }
        return arrayList;
    }
}
