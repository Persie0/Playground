package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class cnb implements kmb {
    @Override // p000.kmb
    /* JADX INFO: renamed from: b */
    public final Boolean mo3808b() {
        return Boolean.FALSE;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: c */
    public final String mo3809c() {
        return "undefined";
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: d */
    public final Iterator mo3810d() {
        return null;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: e */
    public final Double mo3811e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof cnb;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: g */
    public final kmb mo3812g(String str, C3329mb c3329mb, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: k */
    public final kmb mo3813k() {
        return kmb.f47523y;
    }
}
