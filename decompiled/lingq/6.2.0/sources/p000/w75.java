package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w75 {

    /* JADX INFO: renamed from: a */
    public final List f66478a;

    /* JADX INFO: renamed from: b */
    public final r75 f66479b;

    /* JADX INFO: renamed from: c */
    public final vg6 f66480c;

    public w75(List list, r75 r75Var, vg6 vg6Var) {
        list.getClass();
        vg6Var.getClass();
        this.f66478a = list;
        this.f66479b = r75Var;
        this.f66480c = vg6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w75)) {
            return false;
        }
        w75 w75Var = (w75) obj;
        return fa4.m11650l(this.f66478a, w75Var.f66478a) && fa4.m11650l(this.f66479b, w75Var.f66479b) && fa4.m11650l(this.f66480c, w75Var.f66480c);
    }

    public final int hashCode() {
        int iHashCode = this.f66478a.hashCode() * 31;
        r75 r75Var = this.f66479b;
        return this.f66480c.hashCode() + ((iHashCode + (r75Var == null ? 0 : r75Var.hashCode())) * 31);
    }

    public final String toString() {
        return "LevelSelectionUiState(levels=" + this.f66478a + ", selectedLevel=" + this.f66479b + ", navigationDirection=" + this.f66480c + ")";
    }
}
