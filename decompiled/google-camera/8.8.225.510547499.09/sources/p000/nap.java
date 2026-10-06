package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nap extends nai implements Set {
    private static final long serialVersionUID = 0;

    public nap(Set set, Object obj) {
        super(set, obj);
    }

    @Override // p000.nai
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set mo17199a() {
        return (Set) super.mo17199a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f41902h) {
            zEquals = mo17199a().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f41902h) {
            iHashCode = mo17199a().hashCode();
        }
        return iHashCode;
    }
}
