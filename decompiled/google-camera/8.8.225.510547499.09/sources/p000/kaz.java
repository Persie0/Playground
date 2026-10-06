package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kaz {

    /* JADX INFO: renamed from: a */
    public final long f35504a;

    /* JADX INFO: renamed from: b */
    public final long f35505b;

    public kaz(long j, long j2) {
        this.f35504a = j;
        this.f35505b = j2;
    }

    public kaz(kaz kazVar) {
        this.f35504a = kazVar.f35504a;
        this.f35505b = kazVar.f35505b;
    }

    /* JADX INFO: renamed from: b */
    public static String m13894b(kaz[] kazVarArr) {
        if (kazVarArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = kazVarArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(kazVarArr[i].f35504a);
            sb.append("/");
            sb.append(kazVarArr[i].f35505b);
            if (i != length - 1) {
                sb.append(",");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final double m13895a() {
        double d = this.f35504a;
        double d2 = this.f35505b;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof kaz) {
            kaz kazVar = (kaz) obj;
            if (this.f35504a == kazVar.f35504a && this.f35505b == kazVar.f35505b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f35504a), Long.valueOf(this.f35505b)});
    }

    public final String toString() {
        return this.f35504a + "/" + this.f35505b;
    }
}
