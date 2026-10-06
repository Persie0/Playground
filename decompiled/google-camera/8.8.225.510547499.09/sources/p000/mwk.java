package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mwk extends mto implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final Object f41728a;

    /* JADX INFO: renamed from: b */
    final Object f41729b;

    public mwk(Object obj, Object obj2) {
        this.f41728a = obj;
        this.f41729b = obj2;
    }

    @Override // p000.mto, java.util.Map.Entry
    public final Object getKey() {
        return this.f41728a;
    }

    @Override // p000.mto, java.util.Map.Entry
    public final Object getValue() {
        return this.f41729b;
    }

    @Override // p000.mto, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
