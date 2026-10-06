package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class biw {

    /* JADX INFO: renamed from: a */
    public static final biw f3464a = new biw("COMPOSITION");

    /* JADX INFO: renamed from: b */
    public bix f3465b;

    /* JADX INFO: renamed from: c */
    private final List f3466c;

    private biw(biw biwVar) {
        this.f3466c = new ArrayList(biwVar.f3466c);
        this.f3465b = biwVar.f3465b;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m2514g() {
        List list = this.f3466c;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m2515h(String str) {
        return "__container".equals(str);
    }

    /* JADX INFO: renamed from: a */
    public final int m2516a(String str, int i) {
        if (m2515h(str)) {
            return 0;
        }
        if (((String) this.f3466c.get(i)).equals("**")) {
            return (i != this.f3466c.size() + (-1) && ((String) this.f3466c.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final biw m2517b(String str) {
        biw biwVar = new biw(this);
        biwVar.f3466c.add(str);
        return biwVar;
    }

    /* JADX INFO: renamed from: c */
    public final biw m2518c(bix bixVar) {
        biw biwVar = new biw(this);
        biwVar.f3465b = bixVar;
        return biwVar;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2519d(String str, int i) {
        if (i >= this.f3466c.size()) {
            return false;
        }
        int size = this.f3466c.size() - 1;
        String str2 = (String) this.f3466c.get(i);
        if (!str2.equals("**")) {
            boolean z = str2.equals(str) || str2.equals("*");
            return (i == size || (i == this.f3466c.size() + (-2) && m2514g())) && z;
        }
        if (i == size) {
            return true;
        }
        int i2 = i + 1;
        if (((String) this.f3466c.get(i2)).equals(str)) {
            return i == this.f3466c.size() + (-2) || (i == this.f3466c.size() + (-3) && m2514g());
        }
        if (i2 < this.f3466c.size() - 1) {
            return false;
        }
        return ((String) this.f3466c.get(i2)).equals(str);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2520e(String str, int i) {
        if (m2515h(str)) {
            return true;
        }
        if (i >= this.f3466c.size()) {
            return false;
        }
        return ((String) this.f3466c.get(i)).equals(str) || ((String) this.f3466c.get(i)).equals("**") || ((String) this.f3466c.get(i)).equals("*");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2521f(String str, int i) {
        return "__container".equals(str) || i < this.f3466c.size() + (-1) || ((String) this.f3466c.get(i)).equals("**");
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3466c);
        bix bixVar = this.f3465b;
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(strValueOf);
        sb.append(",resolved=");
        sb.append(bixVar != null);
        sb.append("}");
        return sb.toString();
    }

    public biw(String... strArr) {
        this.f3466c = Arrays.asList(strArr);
    }
}
