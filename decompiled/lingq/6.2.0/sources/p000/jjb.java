package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jjb implements kmb {

    /* JADX INFO: renamed from: a */
    public final kmb f45637a;

    /* JADX INFO: renamed from: b */
    public final String f45638b;

    public jjb(String str) {
        this.f45637a = kmb.f47523y;
        this.f45638b = str;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: b */
    public final Boolean mo3808b() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: c */
    public final String mo3809c() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: d */
    public final Iterator mo3810d() {
        return null;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: e */
    public final Double mo3811e() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jjb)) {
            return false;
        }
        jjb jjbVar = (jjb) obj;
        return this.f45638b.equals(jjbVar.f45638b) && this.f45637a.equals(jjbVar.f45637a);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: g */
    public final kmb mo3812g(String str, C3329mb c3329mb, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return this.f45637a.hashCode() + (this.f45638b.hashCode() * 31);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: k */
    public final kmb mo3813k() {
        return new jjb(this.f45638b, this.f45637a.mo3813k());
    }

    public jjb(String str, kmb kmbVar) {
        this.f45637a = kmbVar;
        this.f45638b = str;
    }
}
