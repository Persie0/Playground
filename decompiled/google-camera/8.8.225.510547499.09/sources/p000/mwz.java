package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class mwz extends mxk {
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    /* JADX INFO: renamed from: a */
    public abstract mwx mo17112a();

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = mo17112a().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return mo17112a().mo17080cw();
    }

    @Override // p000.mxk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return mo17112a().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo17112a().size();
    }

    @Override // p000.mxk
    /* JADX INFO: renamed from: w */
    public final boolean mo17026w() {
        return false;
    }

    @Override // p000.mxk, p000.mwj
    Object writeReplace() {
        return new mwy(mo17112a());
    }
}
