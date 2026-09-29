package p000;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zd6 extends de6 {

    /* JADX INFO: renamed from: r */
    public final Class f71388r;

    public zd6(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            v63.m23131i(cls, " does not implement Parcelable.");
            throw null;
        }
        try {
            this.f71388r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            v63.m23141s(e);
            throw null;
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: a */
    public final Object mo301a(String str, Bundle bundle) {
        bundle.getClass();
        return (Parcelable[]) bundle.get(str);
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: b */
    public final String mo302b() {
        return this.f71388r.getName();
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: d */
    public final Object mo303d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: e */
    public final void mo304e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        str.getClass();
        this.f71388r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zd6.class.equals(obj.getClass())) {
            return false;
        }
        return fa4.m11650l(this.f71388r, ((zd6) obj).f71388r);
    }

    public final int hashCode() {
        return this.f71388r.hashCode();
    }
}
