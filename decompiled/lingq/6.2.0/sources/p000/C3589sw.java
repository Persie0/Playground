package p000;

import coil.C0855a;
import java.util.Arrays;

/* JADX INFO: renamed from: sw */
/* JADX INFO: loaded from: classes.dex */
public final class C3589sw {

    /* JADX INFO: renamed from: a */
    public final Object f61503a;

    /* JADX INFO: renamed from: b */
    public final g9c f61504b;

    /* JADX INFO: renamed from: c */
    public final C0855a f61505c;

    public C3589sw(Object obj, g9c g9cVar, C0855a c0855a) {
        this.f61503a = obj;
        this.f61504b = g9cVar;
        this.f61505c = c0855a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public final boolean equals(Object obj) {
        boolean zM11650l;
        if (this != obj) {
            if (obj instanceof C3589sw) {
                C3589sw c3589sw = (C3589sw) obj;
                Object obj2 = c3589sw.f61503a;
                this.f61504b.getClass();
                Object obj3 = this.f61503a;
                if (obj3 == obj2) {
                    zM11650l = true;
                } else if ((obj3 instanceof e04) && (obj2 instanceof e04)) {
                    e04 e04Var = (e04) obj3;
                    e04 e04Var2 = (e04) obj2;
                    if (fa4.m11650l(e04Var.f36502a, e04Var2.f36502a) && e04Var.f36503b.equals(e04Var2.f36503b) && e04Var.f36505d == e04Var2.f36505d && fa4.m11650l(e04Var.f36507f, e04Var2.f36507f) && fa4.m11650l(e04Var.f36509h, e04Var2.f36509h) && e04Var.f36511j == e04Var2.f36511j && e04Var.f36512k == e04Var2.f36512k && e04Var.f36513l == e04Var2.f36513l && e04Var.f36514m == e04Var2.f36514m && e04Var.f36515n == e04Var2.f36515n && e04Var.f36516o == e04Var2.f36516o && e04Var.f36517p == e04Var2.f36517p && e04Var.f36523v.equals(e04Var2.f36523v) && e04Var.f36524w == e04Var2.f36524w && e04Var.f36506e == e04Var2.f36506e && fa4.m11650l(e04Var.f36525x, e04Var2.f36525x)) {
                        zM11650l = true;
                    } else {
                        zM11650l = false;
                    }
                } else {
                    zM11650l = fa4.m11650l(obj3, obj2);
                }
                if (!zM11650l || !this.f61505c.equals(c3589sw.f61505c)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        this.f61504b.getClass();
        Object obj = this.f61503a;
        if (obj instanceof e04) {
            e04 e04Var = (e04) obj;
            iHashCode = e04Var.f36525x.f70835a.hashCode() + ((e04Var.f36506e.hashCode() + ((e04Var.f36524w.hashCode() + ((e04Var.f36523v.hashCode() + ((e04Var.f36517p.hashCode() + ((e04Var.f36516o.hashCode() + ((e04Var.f36515n.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((ux5.m22979b((e04Var.f36505d.hashCode() + ((e04Var.f36503b.hashCode() + (e04Var.f36502a.hashCode() * 31)) * 923521)) * 961, 31, e04Var.f36507f) + Arrays.hashCode(e04Var.f36509h.f58110a)) * 31, 31, e04Var.f36511j), 31, e04Var.f36512k), 31, e04Var.f36513l), 31, e04Var.f36514m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return this.f61505c.hashCode() + (iHashCode * 31);
    }
}
