package p000;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class be6 extends de6 {

    /* JADX INFO: renamed from: r */
    public final Class f8429r;

    public be6(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            v63.m23131i(cls, " does not implement Serializable.");
            throw null;
        }
        try {
            this.f8429r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            v63.m23141s(e);
            throw null;
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: a */
    public final Object mo301a(String str, Bundle bundle) {
        bundle.getClass();
        return (Serializable[]) bundle.get(str);
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: b */
    public final String mo302b() {
        return this.f8429r.getName();
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: d */
    public final Object mo303d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // p000.de6
    /* JADX INFO: renamed from: e */
    public final void mo304e(Bundle bundle, String str, Object obj) {
        ?? r3 = (Serializable[]) obj;
        str.getClass();
        this.f8429r.cast(r3);
        bundle.putSerializable(str, r3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !be6.class.equals(obj.getClass())) {
            return false;
        }
        return fa4.m11650l(this.f8429r, ((be6) obj).f8429r);
    }

    public final int hashCode() {
        return this.f8429r.hashCode();
    }
}
