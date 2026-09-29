package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y59 {

    /* JADX INFO: renamed from: a */
    public final List f69326a;

    /* JADX INFO: renamed from: b */
    public final c69 f69327b;

    public y59(List list, c69 c69Var) {
        this.f69326a = list;
        this.f69327b = c69Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y59)) {
            return false;
        }
        y59 y59Var = (y59) obj;
        return this.f69326a.equals(y59Var.f69326a) && this.f69327b.equals(y59Var.f69327b);
    }

    public final int hashCode() {
        return this.f69327b.hashCode() + (this.f69326a.hashCode() * 31);
    }

    public final String toString() {
        return "ShelfContentState(items=" + this.f69326a + ", state=" + this.f69327b + ")";
    }
}
