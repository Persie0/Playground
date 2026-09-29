package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class rmb implements kmb {

    /* JADX INFO: renamed from: a */
    public final String f59555a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f59556b;

    public rmb(String str, ArrayList arrayList) {
        this.f59555a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f59556b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: b */
    public final Boolean mo3808b() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: c */
    public final String mo3809c() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: d */
    public final Iterator mo3810d() {
        return null;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: e */
    public final Double mo3811e() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmb)) {
            return false;
        }
        rmb rmbVar = (rmb) obj;
        String str = rmbVar.f59555a;
        String str2 = this.f59555a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f59556b.equals(rmbVar.f59556b);
        }
        return false;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: g */
    public final kmb mo3812g(String str, C3329mb c3329mb, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        String str = this.f59555a;
        return this.f59556b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: k */
    public final kmb mo3813k() {
        return this;
    }
}
