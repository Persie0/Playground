package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vk4 implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final vk4 f65533b = new vk4();

    /* JADX INFO: renamed from: a */
    public final int f65534a = 131861;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vk4 vk4Var = (vk4) obj;
        vk4Var.getClass();
        return this.f65534a - vk4Var.f65534a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        vk4 vk4Var = obj instanceof vk4 ? (vk4) obj : null;
        return vk4Var != null && this.f65534a == vk4Var.f65534a;
    }

    public final int hashCode() {
        return this.f65534a;
    }

    public final String toString() {
        return "2.3.21";
    }
}
