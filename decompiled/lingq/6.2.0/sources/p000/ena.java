package p000;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes3.dex */
public final class ena implements WildcardType {

    /* JADX INFO: renamed from: a */
    public final Type f37577a;

    /* JADX INFO: renamed from: b */
    public final Type f37578b;

    public ena(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            ij6.m13959q();
            throw null;
        }
        if (typeArr.length != 1) {
            ij6.m13959q();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            ci8.m4726k(typeArr[0]);
            this.f37578b = null;
            this.f37577a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        ci8.m4726k(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            ij6.m13959q();
            throw null;
        }
        this.f37578b = typeArr2[0];
        this.f37577a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && ci8.m4733r(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f37578b;
        return type != null ? new Type[]{type} : ci8.f10125i;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f37577a};
    }

    public final int hashCode() {
        Type type = this.f37578b;
        return (this.f37577a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f37578b;
        if (type != null) {
            return "? super " + ci8.m4715a0(type);
        }
        Type type2 = this.f37577a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + ci8.m4715a0(type2);
    }
}
