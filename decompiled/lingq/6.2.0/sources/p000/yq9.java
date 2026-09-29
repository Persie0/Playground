package p000;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class yq9 {

    /* JADX INFO: renamed from: a */
    public final String f70298a;

    /* JADX INFO: renamed from: b */
    public final Map f70299b;

    /* JADX INFO: renamed from: c */
    public final Set f70300c;

    /* JADX INFO: renamed from: d */
    public final Set f70301d;

    public yq9(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.f70298a = str;
        this.f70299b = map;
        this.f70300c = abstractSet;
        this.f70301d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq9)) {
            return false;
        }
        yq9 yq9Var = (yq9) obj;
        if (!this.f70298a.equals(yq9Var.f70298a) || !this.f70299b.equals(yq9Var.f70299b) || !fa4.m11650l(this.f70300c, yq9Var.f70300c)) {
            return false;
        }
        Set set2 = this.f70301d;
        if (set2 == null || (set = yq9Var.f70301d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f70300c.hashCode() + e65.m10869a(this.f70298a.hashCode() * 31, 31, this.f70299b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f70298a);
        sb.append("',\n            |    columns = {");
        sb.append(e6d.m10897b(u91.m22614f1(this.f70299b.values(), new yd7(5))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(e6d.m10897b(this.f70300c));
        sb.append("\n            |    indices = {");
        Set set = this.f70301d;
        sb.append(e6d.m10897b(set != null ? u91.m22614f1(set, new yd7(6)) : EmptyList.f47638a));
        sb.append("\n            |}\n        ");
        return wk9.m24030M(sb.toString());
    }
}
