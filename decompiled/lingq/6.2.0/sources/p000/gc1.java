package p000;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class gc1 {

    /* JADX INFO: renamed from: a */
    public String f40515a = null;

    /* JADX INFO: renamed from: b */
    public final HashSet f40516b;

    /* JADX INFO: renamed from: c */
    public final HashSet f40517c;

    /* JADX INFO: renamed from: d */
    public int f40518d;

    /* JADX INFO: renamed from: e */
    public int f40519e;

    /* JADX INFO: renamed from: f */
    public zc1 f40520f;

    /* JADX INFO: renamed from: g */
    public final HashSet f40521g;

    public gc1(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f40516b = hashSet;
        this.f40517c = new HashSet();
        this.f40518d = 0;
        this.f40519e = 0;
        this.f40521g = new HashSet();
        hashSet.add(rp7.m20740a(cls));
        for (Class cls2 : clsArr) {
            wfb.m23913h(cls2, "Null interface");
            this.f40516b.add(rp7.m20740a(cls2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12471a(lb2 lb2Var) {
        if (this.f40516b.contains(lb2Var.f49390a)) {
            C3386nv.m17626m("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.f40517c.add(lb2Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final hc1 m12472b() {
        if (this.f40520f != null) {
            return new hc1(this.f40515a, new HashSet(this.f40516b), new HashSet(this.f40517c), this.f40518d, this.f40519e, this.f40520f, this.f40521g);
        }
        C3386nv.m17633t("Missing required property: factory.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m12473c(int i) {
        if (this.f40518d == 0) {
            this.f40518d = i;
        } else {
            C3386nv.m17633t("Instantiation type has already been set.");
        }
    }

    public gc1(rp7 rp7Var, rp7[] rp7VarArr) {
        HashSet hashSet = new HashSet();
        this.f40516b = hashSet;
        this.f40517c = new HashSet();
        this.f40518d = 0;
        this.f40519e = 0;
        this.f40521g = new HashSet();
        hashSet.add(rp7Var);
        for (rp7 rp7Var2 : rp7VarArr) {
            wfb.m23913h(rp7Var2, "Null interface");
        }
        Collections.addAll(this.f40516b, rp7VarArr);
    }
}
