package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class at4 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7457a;

    /* JADX INFO: renamed from: b */
    public int f7458b;

    /* JADX INFO: renamed from: c */
    public int f7459c;

    /* JADX INFO: renamed from: d */
    public int f7460d;

    /* JADX INFO: renamed from: e */
    public int f7461e;

    /* JADX INFO: renamed from: f */
    public int f7462f;

    /* JADX INFO: renamed from: g */
    public final Object f7463g;

    /* JADX INFO: renamed from: h */
    public final Object f7464h;

    /* JADX INFO: renamed from: i */
    public Object f7465i;

    public at4(js4 js4Var) {
        this.f7463g = js4Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ys4(0, 0));
        this.f7457a = arrayList;
        this.f7461e = -1;
        this.f7464h = new ArrayList();
        this.f7465i = EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: a */
    public static at4 m3026a(at4 at4Var, int i, C3552rx c3552rx, co7 co7Var, int i2) {
        if ((i2 & 1) != 0) {
            i = at4Var.f7458b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c3552rx = (C3552rx) at4Var.f7464h;
        }
        C3552rx c3552rx2 = c3552rx;
        if ((i2 & 4) != 0) {
            co7Var = (co7) at4Var.f7465i;
        }
        co7 co7Var2 = co7Var;
        int i4 = at4Var.f7459c;
        int i5 = at4Var.f7460d;
        int i6 = at4Var.f7461e;
        co7Var2.getClass();
        return new at4((i18) at4Var.f7463g, at4Var.f7457a, i3, c3552rx2, co7Var2, i4, i5, i6);
    }

    /* JADX INFO: renamed from: b */
    public int m3027b() {
        return ((int) Math.sqrt((((double) m3030e()) * 1.0d) / ((double) this.f7462f))) + 1;
    }

    /* JADX INFO: renamed from: c */
    public C3126ix m3028c(int i) {
        List list;
        int i2 = this.f7462f;
        int i3 = i * i2;
        int iM3030e = m3030e() - i3;
        if (i2 > iM3030e) {
            i2 = iM3030e;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == ((List) this.f7465i).size()) {
            list = (List) this.f7465i;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new aq3(1L));
            }
            this.f7465i = arrayList;
            list = arrayList;
        }
        return new C3126ix(i3, list, 6);
    }

    /* JADX INFO: renamed from: d */
    public int m3029d(int i) {
        if (m3030e() <= 0) {
            return 0;
        }
        if (i >= m3030e()) {
            l54.m15814a("ItemIndex > total count");
        }
        return i / this.f7462f;
    }

    /* JADX INFO: renamed from: e */
    public int m3030e() {
        return ((js4) this.f7463g).f46073b.f41171b;
    }

    /* JADX INFO: renamed from: f */
    public j88 m3031f(co7 co7Var) {
        C3552rx c3552rx = (C3552rx) this.f7464h;
        co7Var.getClass();
        int i = this.f7458b;
        ArrayList arrayList = this.f7457a;
        if (i >= arrayList.size()) {
            C3386nv.m17633t("Check failed.");
            return null;
        }
        this.f7462f++;
        if (c3552rx != null) {
            p18 p18VarMo18304d = ((su2) c3552rx.f59988c).mo18304d();
            ex3 ex3Var = (ex3) co7Var.f10360c;
            p18VarMo18304d.getClass();
            ex3Var.getClass();
            ex3 ex3Var2 = p18VarMo18304d.f55446i.f43720h;
            if (ex3Var.f38028e != ex3Var2.f38028e || !fa4.m11650l(ex3Var.f38027d, ex3Var2.f38027d)) {
                C3386nv.m17634u("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.f7462f != 1) {
                C3386nv.m17634u("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        at4 at4VarM3026a = m3026a(this, i2, null, co7Var, 58);
        x84 x84Var = (x84) arrayList.get(i);
        j88 j88VarMo8434a = x84Var.mo8434a(at4VarM3026a);
        if (j88VarMo8434a == null) {
            throw new NullPointerException("interceptor " + x84Var + " returned null");
        }
        if (c3552rx == null || i2 >= arrayList.size() || at4VarM3026a.f7462f == 1) {
            return j88VarMo8434a;
        }
        C3386nv.m17634u("network interceptor ", x84Var, " must call proceed() exactly once");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int m3032g(int i) {
        x94 x94VarM12804h = ((js4) this.f7463g).f46073b.m12804h(i);
        int i2 = i - x94VarM12804h.f67972a;
        return (int) ((aq3) ((is4) x94VarM12804h.f67974c).f44505b.invoke(zs4.f72039a, Integer.valueOf(i2))).f7358a;
    }

    public at4(i18 i18Var, ArrayList arrayList, int i, C3552rx c3552rx, co7 co7Var, int i2, int i3, int i4) {
        co7Var.getClass();
        this.f7463g = i18Var;
        this.f7457a = arrayList;
        this.f7458b = i;
        this.f7464h = c3552rx;
        this.f7465i = co7Var;
        this.f7459c = i2;
        this.f7460d = i3;
        this.f7461e = i4;
    }
}
