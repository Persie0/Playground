package p000;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public abstract class kj6 {

    /* JADX INFO: renamed from: a */
    public d86 f47395a;

    /* JADX INFO: renamed from: b */
    public boolean f47396b;

    /* JADX INFO: renamed from: a */
    public abstract r86 mo10901a();

    /* JADX INFO: renamed from: b */
    public final d86 m15273b() {
        d86 d86Var = this.f47395a;
        if (d86Var != null) {
            return d86Var;
        }
        C3386nv.m17633t("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public r86 mo10902c(r86 r86Var, Bundle bundle, wd6 wd6Var) {
        return r86Var;
    }

    /* JADX INFO: renamed from: d */
    public void mo11795d(List list, wd6 wd6Var) {
        h43 h43Var = new h43(new i43(new bl3(new z91(list, 0), new h85(17, this, wd6Var), 1), false, new wx8(0)));
        while (h43Var.hasNext()) {
            m15273b().m10159g((y76) h43Var.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo11796e(d86 d86Var) {
        this.f47395a = d86Var;
        this.f47396b = true;
    }

    /* JADX INFO: renamed from: f */
    public void mo11797f(y76 y76Var) {
        r86 r86Var = y76Var.f69409b;
        if (r86Var == null) {
            r86Var = null;
        }
        if (r86Var == null) {
            return;
        }
        mo10902c(r86Var, null, xqb.m24650a(new lz5(13)));
        m15273b().m10156d(y76Var);
    }

    /* JADX INFO: renamed from: g */
    public void mo15274g(Bundle bundle) {
    }

    /* JADX INFO: renamed from: h */
    public Bundle mo15275h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void mo11798i(y76 y76Var, boolean z) {
        List list = (List) ((C3244l) m15273b().f35168e.f9311a).getValue();
        if (!list.contains(y76Var)) {
            ij6.m13955m("popBackStack was called with ", y76Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        y76 y76Var2 = null;
        while (mo10903j()) {
            y76Var2 = (y76) listIterator.previous();
            if (fa4.m11650l(y76Var2, y76Var)) {
                break;
            }
        }
        if (y76Var2 != null) {
            m15273b().m10157e(y76Var2, z);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean mo10903j() {
        return true;
    }
}
