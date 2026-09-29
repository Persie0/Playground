package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class w15 {

    /* JADX INFO: renamed from: a */
    public final sid f66219a;

    /* JADX INFO: renamed from: b */
    public final boolean f66220b;

    /* JADX INFO: renamed from: c */
    public final boolean f66221c;

    public w15(sid sidVar, boolean z, boolean z2) {
        sidVar.getClass();
        this.f66219a = sidVar;
        this.f66220b = z;
        this.f66221c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static w15 m23674a(w15 w15Var, sid sidVar, boolean z, int i) {
        if ((i & 1) != 0) {
            sidVar = w15Var.f66219a;
        }
        if ((i & 2) != 0) {
            z = w15Var.f66220b;
        }
        boolean z2 = (i & 4) != 0 ? w15Var.f66221c : true;
        w15Var.getClass();
        sidVar.getClass();
        return new w15(sidVar, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w15)) {
            return false;
        }
        w15 w15Var = (w15) obj;
        return fa4.m11650l(this.f66219a, w15Var.f66219a) && this.f66220b == w15Var.f66220b && this.f66221c == w15Var.f66221c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66221c) + g9a.m12428e(this.f66219a.hashCode() * 31, 31, this.f66220b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonEditState(currentScreen=");
        sb.append(this.f66219a);
        sb.append(", isSaving=");
        sb.append(this.f66220b);
        sb.append(", shouldDismiss=");
        return AbstractC3393o1.m17740o(sb, this.f66221c, ")");
    }
}
