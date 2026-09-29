package p000;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ce6 extends de6 {

    /* JADX INFO: renamed from: r */
    public final Class f9983r;

    public ce6(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            v63.m23131i(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            v63.m23131i(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.f9983r = cls;
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: a */
    public final Object mo301a(String str, Bundle bundle) {
        bundle.getClass();
        return (Serializable) bundle.get(str);
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: b */
    public String mo302b() {
        return this.f9983r.getName();
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: e */
    public final void mo304e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.f9983r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce6)) {
            return false;
        }
        return fa4.m11650l(this.f9983r, ((ce6) obj).f9983r);
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable mo303d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f9983r.hashCode();
    }

    public ce6(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f9983r = cls;
        } else {
            v63.m23131i(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
