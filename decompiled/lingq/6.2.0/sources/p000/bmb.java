package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class bmb implements kmb, xlb {

    /* JADX INFO: renamed from: a */
    public final HashMap f8698a = new HashMap();

    @Override // p000.kmb
    /* JADX INFO: renamed from: b */
    public final Boolean mo3808b() {
        return Boolean.TRUE;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: c */
    public final String mo3809c() {
        return "[object Object]";
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: d */
    public final Iterator mo3810d() {
        return new qlb(this.f8698a.keySet().iterator());
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: e */
    public final Double mo3811e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bmb) {
            return this.f8698a.equals(((bmb) obj).f8698a);
        }
        return false;
    }

    @Override // p000.xlb
    /* JADX INFO: renamed from: f */
    public final kmb mo3880f(String str) {
        HashMap map = this.f8698a;
        return map.containsKey(str) ? (kmb) map.get(str) : kmb.f47523y;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: g */
    public kmb mo3812g(String str, C3329mb c3329mb, ArrayList arrayList) {
        return "toString".equals(str) ? new xmb(toString()) : xlb.m24611h(this, new xmb(str), c3329mb, arrayList);
    }

    public final int hashCode() {
        return this.f8698a.hashCode();
    }

    @Override // p000.xlb
    /* JADX INFO: renamed from: i */
    public final void mo3881i(String str, kmb kmbVar) {
        HashMap map = this.f8698a;
        if (kmbVar == null) {
            map.remove(str);
        } else {
            map.put(str, kmbVar);
        }
    }

    @Override // p000.xlb
    /* JADX INFO: renamed from: j */
    public final boolean mo3882j(String str) {
        return this.f8698a.containsKey(str);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: k */
    public final kmb mo3813k() {
        bmb bmbVar = new bmb();
        for (Map.Entry entry : this.f8698a.entrySet()) {
            boolean z = entry.getValue() instanceof xlb;
            HashMap map = bmbVar.f8698a;
            if (z) {
                map.put((String) entry.getKey(), (kmb) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((kmb) entry.getValue()).mo3813k());
            }
        }
        return bmbVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f8698a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
