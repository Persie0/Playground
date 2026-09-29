package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ae6 extends de6 {

    /* JADX INFO: renamed from: r */
    public final Class f543r;

    public ae6(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f543r = cls;
        } else {
            v63.m23131i(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: a */
    public final Object mo301a(String str, Bundle bundle) {
        bundle.getClass();
        return bundle.get(str);
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: b */
    public final String mo302b() {
        return this.f543r.getName();
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: d */
    public final Object mo303d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: e */
    public final void mo304e(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.f543r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ae6.class.equals(obj.getClass())) {
            return false;
        }
        return fa4.m11650l(this.f543r, ((ae6) obj).f543r);
    }

    public final int hashCode() {
        return this.f543r.hashCode();
    }
}
