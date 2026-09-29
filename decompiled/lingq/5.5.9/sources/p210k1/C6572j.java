package p210k1;

import androidx.compose.p017ui.semantics.C0685a;
import dm.C5207g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p100em.InterfaceC5429a;
import p338qd.C8573r0;

/* JADX INFO: renamed from: k1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6572j implements InterfaceC6577o, Iterable<Map.Entry<? extends C0685a<?>, ? extends Object>>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f37391a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public boolean f37392b;

    /* JADX INFO: renamed from: c */
    public boolean f37393c;

    @Override // p210k1.InterfaceC6577o
    /* JADX INFO: renamed from: a */
    public final <T> void mo13162a(C0685a<T> c0685a, T t10) {
        C5207g.m11111f(c0685a, "key");
        this.f37391a.put(c0685a, t10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6572j)) {
            return false;
        }
        C6572j c6572j = (C6572j) obj;
        return C5207g.m11106a(this.f37391a, c6572j.f37391a) && this.f37392b == c6572j.f37392b && this.f37393c == c6572j.f37393c;
    }

    /* JADX INFO: renamed from: f */
    public final <T> boolean m13163f(C0685a<T> c0685a) {
        C5207g.m11111f(c0685a, "key");
        return this.f37391a.containsKey(c0685a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final <T> T m13164g(C0685a<T> c0685a) {
        C5207g.m11111f(c0685a, "key");
        T t10 = (T) this.f37391a.get(c0685a);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + c0685a + " - consider getOrElse or getOrNull");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37393c) + ((Boolean.hashCode(this.f37392b) + (this.f37391a.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends C0685a<?>, ? extends Object>> iterator() {
        return this.f37391a.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f37392b) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f37393c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f37391a.entrySet()) {
            C0685a c0685a = (C0685a) entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(c0685a.f4445a);
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return C8573r0.m16718c1(this) + "{ " + ((Object) sb2) + " }";
    }
}
