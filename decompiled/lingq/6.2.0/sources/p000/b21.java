package p000;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class b21 implements jk7 {

    /* JADX INFO: renamed from: a */
    public static final b21 f7780a = new b21();

    @Override // p000.jk7
    /* JADX INFO: renamed from: a */
    public final Class mo3177a() {
        return z11.class;
    }

    @Override // p000.jk7
    /* JADX INFO: renamed from: b */
    public final Object mo3178b(sq5 sq5Var) throws GeneralSecurityException {
        if (((hk7) sq5Var.f61249c) == null) {
            v63.m23147y("no primary in primitive set");
            return null;
        }
        Iterator it = ((ConcurrentMap) sq5Var.f61248b).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new a21();
    }

    @Override // p000.jk7
    /* JADX INFO: renamed from: c */
    public final Class mo3179c() {
        return z11.class;
    }
}
