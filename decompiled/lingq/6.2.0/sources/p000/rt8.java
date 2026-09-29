package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rt8 {

    /* JADX INFO: renamed from: a */
    public final ut8 f59799a;

    /* JADX INFO: renamed from: b */
    public final ut8 f59800b;

    public rt8(ut8 ut8Var, ut8 ut8Var2) {
        this.f59799a = ut8Var;
        this.f59800b = ut8Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rt8.class == obj.getClass()) {
            rt8 rt8Var = (rt8) obj;
            if (this.f59799a.equals(rt8Var.f59799a) && this.f59800b.equals(rt8Var.f59800b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f59800b.hashCode() + (this.f59799a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        ut8 ut8Var = this.f59799a;
        sb.append(ut8Var);
        ut8 ut8Var2 = this.f59800b;
        if (ut8Var.equals(ut8Var2)) {
            str = "";
        } else {
            str = ", " + ut8Var2;
        }
        return AbstractC3393o1.m17738m(sb, str, "]");
    }
}
