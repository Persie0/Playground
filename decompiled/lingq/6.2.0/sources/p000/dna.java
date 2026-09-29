package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dna implements ParameterizedType {

    /* JADX INFO: renamed from: a */
    public final Type f35911a;

    /* JADX INFO: renamed from: b */
    public final Type f35912b;

    /* JADX INFO: renamed from: c */
    public final Type[] f35913c;

    public dna(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                ij6.m13959q();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            ci8.m4726k(type3);
        }
        this.f35911a = type;
        this.f35912b = type2;
        this.f35913c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && ci8.m4733r(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f35913c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f35911a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f35912b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f35913c) ^ this.f35912b.hashCode();
        Type type = this.f35911a;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f35913c;
        int length = typeArr.length;
        Type type = this.f35912b;
        if (length == 0) {
            return ci8.m4715a0(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(ci8.m4715a0(type));
        sb.append("<");
        sb.append(ci8.m4715a0(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(ci8.m4715a0(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
