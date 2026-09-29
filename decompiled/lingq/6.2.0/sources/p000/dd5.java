package p000;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dd5 {

    /* JADX INFO: renamed from: a */
    public boolean f35436a;

    /* JADX INFO: renamed from: b */
    public int f35437b;

    /* JADX INFO: renamed from: c */
    public int f35438c;

    /* JADX INFO: renamed from: d */
    public int f35439d;

    /* JADX INFO: renamed from: e */
    public int f35440e;

    /* JADX INFO: renamed from: f */
    public int f35441f;

    /* JADX INFO: renamed from: g */
    public int f35442g;

    /* JADX INFO: renamed from: h */
    public int f35443h;

    /* JADX INFO: renamed from: i */
    public int f35444i;

    /* JADX INFO: renamed from: j */
    public int f35445j;

    /* JADX INFO: renamed from: k */
    public List f35446k;

    /* JADX INFO: renamed from: l */
    public boolean f35447l;

    /* JADX INFO: renamed from: a */
    public final void m10294a(View view) {
        int iM17784d;
        int size = this.f35446k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((o38) this.f35446k.get(i2)).f53781a;
            z28 z28Var = (z28) view3.getLayoutParams();
            if (view3 != view && !z28Var.f70799a.m17790j() && (iM17784d = (z28Var.f70799a.m17784d() - this.f35439d) * this.f35440e) >= 0 && iM17784d < i) {
                view2 = view3;
                if (iM17784d == 0) {
                    break;
                } else {
                    i = iM17784d;
                }
            }
        }
        if (view2 == null) {
            this.f35439d = -1;
        } else {
            this.f35439d = ((z28) view2.getLayoutParams()).f70799a.m17784d();
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m10295b(g38 g38Var) {
        List list = this.f35446k;
        if (list == null) {
            View viewM12332d = g38Var.m12332d(this.f35439d);
            this.f35439d += this.f35440e;
            return viewM12332d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((o38) this.f35446k.get(i)).f53781a;
            z28 z28Var = (z28) view.getLayoutParams();
            if (!z28Var.f70799a.m17790j() && this.f35439d == z28Var.f70799a.m17784d()) {
                m10294a(view);
                return view;
            }
        }
        return null;
    }
}
