package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class j34 implements nm1 {

    /* JADX INFO: renamed from: a */
    public Boolean f45005a;

    /* JADX INFO: renamed from: b */
    public Integer f45006b;

    /* JADX INFO: renamed from: c */
    public Integer f45007c;

    /* JADX INFO: renamed from: d */
    public Integer f45008d;

    public j34(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.f45005a = bool;
        this.f45006b = num;
        this.f45007c = num2;
        this.f45008d = num3;
    }

    @Override // p000.nm1
    public final Object copy() {
        return new j34(this.f45005a, this.f45006b, this.f45007c, this.f45008d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j34)) {
            return false;
        }
        j34 j34Var = (j34) obj;
        return fa4.m11650l(this.f45005a, j34Var.f45005a) && fa4.m11650l(this.f45006b, j34Var.f45006b) && fa4.m11650l(this.f45007c, j34Var.f45007c) && fa4.m11650l(this.f45008d, j34Var.f45008d);
    }

    public final int hashCode() {
        Boolean bool = this.f45005a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.f45006b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.f45007c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.f45008d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Boolean bool = this.f45005a;
        if (bool != null) {
            str = bool.booleanValue() ? "-" : "+";
        } else {
            str = " ";
        }
        sb.append(str);
        Object obj = this.f45006b;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.f45007c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.f45008d;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }
}
