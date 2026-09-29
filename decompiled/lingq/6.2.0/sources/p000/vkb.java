package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vkb implements kmb, xlb {

    /* JADX INFO: renamed from: a */
    public final String f65549a;

    /* JADX INFO: renamed from: b */
    public final HashMap f65550b = new HashMap();

    public vkb(String str) {
        this.f65549a = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract kmb mo12757a(C3329mb c3329mb, List list);

    @Override // p000.kmb
    /* JADX INFO: renamed from: b */
    public final Boolean mo3808b() {
        return Boolean.TRUE;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: c */
    public final String mo3809c() {
        return this.f65549a;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: d */
    public final Iterator mo3810d() {
        return new qlb(this.f65550b.keySet().iterator());
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
        if (!(obj instanceof vkb)) {
            return false;
        }
        vkb vkbVar = (vkb) obj;
        String str = this.f65549a;
        if (str != null) {
            return str.equals(vkbVar.f65549a);
        }
        return false;
    }

    @Override // p000.xlb
    /* JADX INFO: renamed from: f */
    public final kmb mo3880f(String str) {
        HashMap map = this.f65550b;
        return map.containsKey(str) ? (kmb) map.get(str) : kmb.f47523y;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: g */
    public final kmb mo3812g(String str, C3329mb c3329mb, ArrayList arrayList) {
        return "toString".equals(str) ? new xmb(this.f65549a) : xlb.m24611h(this, new xmb(str), c3329mb, arrayList);
    }

    public final int hashCode() {
        String str = this.f65549a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // p000.xlb
    /* JADX INFO: renamed from: i */
    public final void mo3881i(String str, kmb kmbVar) {
        HashMap map = this.f65550b;
        if (kmbVar == null) {
            map.remove(str);
        } else {
            map.put(str, kmbVar);
        }
    }

    @Override // p000.xlb
    /* JADX INFO: renamed from: j */
    public final boolean mo3882j(String str) {
        return this.f65550b.containsKey(str);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: k */
    public kmb mo3813k() {
        return this;
    }
}
