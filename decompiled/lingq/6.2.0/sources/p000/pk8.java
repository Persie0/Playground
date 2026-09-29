package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class pk8 implements Iterable {

    /* JADX INFO: renamed from: a */
    public mk8 f56352a;

    /* JADX INFO: renamed from: b */
    public mk8 f56353b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f56354c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f56355d = 0;

    /* JADX INFO: renamed from: d */
    public mk8 mo19364d(Object obj) {
        mk8 mk8Var = this.f56352a;
        while (mk8Var != null && !mk8Var.f51441a.equals(obj)) {
            mk8Var = mk8Var.f51443c;
        }
        return mk8Var;
    }

    public final boolean equals(Object obj) {
        lk8 lk8Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pk8)) {
            return false;
        }
        pk8 pk8Var = (pk8) obj;
        if (this.f56355d != pk8Var.f56355d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = pk8Var.iterator();
        while (true) {
            lk8Var = (lk8) it;
            if (!lk8Var.hasNext()) {
                break;
            }
            lk8 lk8Var2 = (lk8) it2;
            if (!lk8Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) lk8Var.next();
            Object next = lk8Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (lk8Var.hasNext() || ((lk8) it2).hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public Object mo19365f(Object obj) {
        mk8 mk8VarMo19364d = mo19364d(obj);
        if (mk8VarMo19364d == null) {
            return null;
        }
        this.f56355d--;
        WeakHashMap weakHashMap = this.f56354c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((ok8) it.next()).mo16330a(mk8VarMo19364d);
            }
        }
        mk8 mk8Var = mk8VarMo19364d.f51444d;
        mk8 mk8Var2 = mk8VarMo19364d.f51443c;
        if (mk8Var != null) {
            mk8Var.f51443c = mk8Var2;
        } else {
            this.f56352a = mk8Var2;
        }
        mk8 mk8Var3 = mk8VarMo19364d.f51443c;
        if (mk8Var3 != null) {
            mk8Var3.f51444d = mk8Var;
        } else {
            this.f56353b = mk8Var;
        }
        mk8VarMo19364d.f51443c = null;
        mk8VarMo19364d.f51444d = null;
        return mk8VarMo19364d.f51442b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            lk8 lk8Var = (lk8) it;
            if (!lk8Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) lk8Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        lk8 lk8Var = new lk8(this.f56352a, this.f56353b, 0);
        this.f56354c.put(lk8Var, Boolean.FALSE);
        return lk8Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            lk8 lk8Var = (lk8) it;
            if (!lk8Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) lk8Var.next()).toString());
            if (lk8Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
