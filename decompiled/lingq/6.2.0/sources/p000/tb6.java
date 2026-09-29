package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@jj6("navigation")
public class tb6 extends kj6 {

    /* JADX INFO: renamed from: c */
    public final lj6 f62100c;

    public tb6(lj6 lj6Var) {
        lj6Var.getClass();
        this.f62100c = lj6Var;
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: a */
    public final r86 mo10901a() {
        return new u86(this);
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: d */
    public final void mo11795d(List list, wd6 wd6Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y76 y76Var = (y76) it.next();
            r86 r86Var = y76Var.f69409b;
            r86Var.getClass();
            u86 u86Var = (u86) r86Var;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f47718a = y76Var.f69415h.m170a();
            sg3 sg3Var = u86Var.f63589g;
            int i = sg3Var.f60816b;
            if (i == 0) {
                gm5.m12751g("no start destination defined via app:startDestination for ".concat(u86Var.mo20443i()));
                return;
            }
            r86 r86Var2 = (r86) ((pe9) sg3Var.f60818d).m19078b(i);
            if (r86Var2 == null) {
                if (((String) sg3Var.f60819e) == null) {
                    sg3Var.f60819e = String.valueOf(sg3Var.f60816b);
                }
                String str = (String) sg3Var.f60819e;
                str.getClass();
                C3386nv.m17626m(wq1.m24118n("navigation destination ", str, " is not a direct child of this NavGraph"));
                return;
            }
            this.f62100c.m16259b(r86Var2.f58880a).mo11795d(vz1.m23604J(m15273b().m10154b(r86Var2, r86Var2.m20439d((Bundle) ref$ObjectRef.f47718a))), wd6Var);
        }
    }
}
