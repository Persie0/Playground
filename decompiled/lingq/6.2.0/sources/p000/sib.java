package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class sib implements kmb {

    /* JADX INFO: renamed from: a */
    public final boolean f60910a;

    public sib(Boolean bool) {
        this.f60910a = bool == null ? false : bool.booleanValue();
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: b */
    public final Boolean mo3808b() {
        return Boolean.valueOf(this.f60910a);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: c */
    public final String mo3809c() {
        return Boolean.toString(this.f60910a);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: d */
    public final Iterator mo3810d() {
        return null;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: e */
    public final Double mo3811e() {
        return Double.valueOf(true != this.f60910a ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sib) && this.f60910a == ((sib) obj).f60910a;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: g */
    public final kmb mo3812g(String str, C3329mb c3329mb, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f60910a;
        if (zEquals) {
            return new xmb(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f60910a).hashCode();
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: k */
    public final kmb mo3813k() {
        return new sib(Boolean.valueOf(this.f60910a));
    }

    public final String toString() {
        return String.valueOf(this.f60910a);
    }
}
