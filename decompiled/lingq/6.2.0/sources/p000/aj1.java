package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class aj1 implements ux8 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f724a;

    public aj1(ux8 ux8Var) {
        this.f724a = new AtomicReference(ux8Var);
    }

    @Override // p000.ux8
    public final Iterator iterator() {
        ux8 ux8Var = (ux8) this.f724a.getAndSet(null);
        if (ux8Var != null) {
            return ux8Var.iterator();
        }
        C3386nv.m17633t("This sequence can be consumed only once.");
        return null;
    }
}
