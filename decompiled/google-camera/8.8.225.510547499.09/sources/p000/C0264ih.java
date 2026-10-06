package p000;

/* JADX INFO: renamed from: ih */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0264ih {

    /* JADX INFO: renamed from: a */
    public int f30905a;

    /* JADX INFO: renamed from: b */
    public int f30906b;

    /* JADX INFO: renamed from: c */
    public Object f30907c;

    /* JADX INFO: renamed from: d */
    public int f30908d;

    public C0264ih(int i, int i2, int i3, Object obj) {
        this.f30905a = i;
        this.f30906b = i2;
        this.f30908d = i3;
        this.f30907c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0264ih)) {
            return false;
        }
        C0264ih c0264ih = (C0264ih) obj;
        if (this.f30905a != c0264ih.f30905a || this.f30908d != c0264ih.f30908d || this.f30906b != c0264ih.f30906b) {
            return false;
        }
        Object obj2 = this.f30907c;
        if (obj2 != null) {
            if (!obj2.equals(c0264ih.f30907c)) {
                return false;
            }
        } else if (c0264ih.f30907c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f30905a * 31) + this.f30906b) * 31) + this.f30908d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        switch (this.f30905a) {
            case 1:
                str = "add";
                break;
            case 2:
                str = "rm";
                break;
            case 3:
            default:
                str = "??";
                break;
            case 4:
                str = "up";
                break;
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f30906b);
        sb.append("c:");
        sb.append(this.f30908d);
        sb.append(",p:");
        sb.append(this.f30907c);
        sb.append("]");
        return sb.toString();
    }
}
