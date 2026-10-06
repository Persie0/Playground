package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mwm extends mwv {

    /* JADX INFO: renamed from: a */
    private final transient EnumMap f41731a;

    public mwm(EnumMap enumMap) {
        this.f41731a = enumMap;
        lku.m15669w(!enumMap.isEmpty());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // p000.mwv
    /* JADX INFO: renamed from: a */
    public final naz mo17078a() {
        return new myq(this.f41731a.entrySet().iterator());
    }

    @Override // p000.mwx, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f41731a.containsKey(obj);
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: cv */
    public final naz mo17079cv() {
        return mkv.m16507O(this.f41731a.keySet().iterator());
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: cw */
    public final boolean mo17080cw() {
        return false;
    }

    @Override // p000.mwx, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwm) {
            obj = ((mwm) obj).f41731a;
        }
        return this.f41731a.equals(obj);
    }

    @Override // p000.mwx, java.util.Map
    public final Object get(Object obj) {
        return this.f41731a.get(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f41731a.size();
    }

    @Override // p000.mwx
    Object writeReplace() {
        return new mwl(this.f41731a);
    }
}
