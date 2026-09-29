package kotlin.enums;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.RandomAccess;
import p000.AbstractC3550rv;
import p000.AbstractC3816z0;
import p000.v63;
import p000.wq1;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
final class EnumEntriesList<T extends Enum<T>> extends AbstractC3816z0 implements ys2, RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public final Enum[] f47693a;

    public EnumEntriesList(Enum[] enumArr) {
        enumArr.getClass();
        this.f47693a = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.f47693a);
    }

    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) AbstractC3550rv.m20842j0(this.f47693a, r3.ordinal())) == r3;
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f47693a.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f47693a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        v63.m23143u(wq1.m24115k("index: ", i, length, ", size: "));
        return null;
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC3550rv.m20842j0(this.f47693a, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC3550rv.m20842j0(this.f47693a, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
