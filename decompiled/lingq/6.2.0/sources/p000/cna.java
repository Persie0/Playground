package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class cna implements GenericArrayType {

    /* JADX INFO: renamed from: a */
    public final Type f10337a;

    public cna(Type type) {
        this.f10337a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && ci8.m4733r(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f10337a;
    }

    public final int hashCode() {
        return this.f10337a.hashCode();
    }

    public final String toString() {
        return ci8.m4715a0(this.f10337a) + "[]";
    }
}
