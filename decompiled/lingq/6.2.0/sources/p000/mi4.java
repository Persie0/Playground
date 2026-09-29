package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mi4 {

    /* JADX INFO: renamed from: c */
    public static final mi4 f51356c = new mi4("COMPOSITION");

    /* JADX INFO: renamed from: a */
    public final List f51357a;

    /* JADX INFO: renamed from: b */
    public ni4 f51358b;

    public mi4(mi4 mi4Var) {
        this.f51357a = new ArrayList(mi4Var.f51357a);
        this.f51358b = mi4Var.f51358b;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public final boolean m16841a(int i, String str) {
        List list = this.f51357a;
        if (i < list.size()) {
            boolean z = i == list.size() - 1;
            String str2 = (String) list.get(i);
            if (!str2.equals("**")) {
                boolean z2 = str2.equals(str) || str2.equals("*");
                if ((z || (i == list.size() - 2 && ((String) list.get(list.size() - 1)).equals("**"))) && z2) {
                    return true;
                }
            } else {
                if (z || !((String) list.get(i + 1)).equals(str)) {
                    if (!z) {
                        int i2 = i + 1;
                        if (i2 >= list.size() - 1) {
                            return ((String) list.get(i2)).equals(str);
                        }
                    }
                    return true;
                }
                if (i == list.size() - 2 || (i == list.size() - 3 && ((String) list.get(list.size() - 1)).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final int m16842b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f51357a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16843c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f51357a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16844d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f51357a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mi4.class == obj.getClass()) {
            mi4 mi4Var = (mi4) obj;
            if (!this.f51357a.equals(mi4Var.f51357a)) {
                return false;
            }
            ni4 ni4Var = this.f51358b;
            ni4 ni4Var2 = mi4Var.f51358b;
            if (ni4Var != null) {
                return ni4Var.equals(ni4Var2);
            }
            if (ni4Var2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f51357a.hashCode() * 31;
        ni4 ni4Var = this.f51358b;
        return iHashCode + (ni4Var != null ? ni4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f51357a);
        sb.append(",resolved=");
        return ux5.m22993p(sb, this.f51358b != null, '}');
    }

    public mi4(String... strArr) {
        this.f51357a = Arrays.asList(strArr);
    }
}
