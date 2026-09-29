package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vxa {

    /* JADX INFO: renamed from: a */
    public final int f66068a;

    /* JADX INFO: renamed from: b */
    public final Integer f66069b;

    public vxa(int i, Integer num) {
        this.f66068a = i;
        this.f66069b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxa)) {
            return false;
        }
        vxa vxaVar = (vxa) obj;
        return this.f66068a == vxaVar.f66068a && fa4.m11650l(this.f66069b, vxaVar.f66069b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f66068a) * 31;
        Integer num = this.f66069b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "VocabularyEmptyState(title=" + this.f66068a + ", description=" + this.f66069b + ")";
    }
}
