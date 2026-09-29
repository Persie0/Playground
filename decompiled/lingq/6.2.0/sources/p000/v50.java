package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class v50 {

    /* JADX INFO: renamed from: a */
    public final boolean f64874a;

    /* JADX INFO: renamed from: b */
    public final boolean f64875b;

    /* JADX INFO: renamed from: c */
    public final boolean f64876c;

    /* JADX INFO: renamed from: d */
    public final boolean f64877d;

    /* JADX INFO: renamed from: e */
    public final List f64878e;

    public v50(boolean z, boolean z2, boolean z3, boolean z4, ListBuilder listBuilder) {
        listBuilder.getClass();
        this.f64874a = z;
        this.f64875b = z2;
        this.f64876c = z3;
        this.f64877d = z4;
        this.f64878e = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v50)) {
            return false;
        }
        v50 v50Var = (v50) obj;
        return this.f64874a == v50Var.f64874a && this.f64875b == v50Var.f64875b && this.f64876c == v50Var.f64876c && this.f64877d == v50Var.f64877d && fa4.m11650l(this.f64878e, v50Var.f64878e);
    }

    public final int hashCode() {
        return this.f64878e.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f64874a) * 31, 31, this.f64875b), 31, this.f64876c), 31, this.f64877d);
    }

    public final String toString() {
        ListBuilder listBuilderM23650t = vz1.m23650t();
        if (this.f64874a) {
            listBuilderM23650t.add("sessions");
        }
        if (this.f64875b) {
            listBuilderM23650t.add("appLifecycles");
        }
        if (this.f64877d) {
            listBuilderM23650t.add("deepLinks");
        }
        if (this.f64876c) {
            listBuilderM23650t.add("screenViews");
        }
        List<u84> list = this.f64878e;
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((u84) it.next()) instanceof s84) {
                    listBuilderM23650t.add("elementInteractions");
                    break;
                }
            }
        }
        if (!z || !list.isEmpty()) {
            for (u84 u84Var : list) {
                if ((u84Var instanceof t84) || (u84Var instanceof r84)) {
                    listBuilderM23650t.add("frustrationInteractions");
                    break;
                }
            }
        }
        ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
        return listBuilderM23635i.isEmpty() ? "none" : u91.m22596N0(listBuilderM23635i, ",", null, null, null, 62);
    }
}
