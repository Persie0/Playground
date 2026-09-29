package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pm2 implements ux8, vm2 {

    /* JADX INFO: renamed from: a */
    public final ux8 f56462a;

    /* JADX INFO: renamed from: b */
    public final int f56463b;

    public pm2(ux8 ux8Var, int i) {
        ux8Var.getClass();
        this.f56462a = ux8Var;
        this.f56463b = i;
        if (i >= 0) {
            return;
        }
        C3386nv.m17624j(wq1.m24114j("count must be non-negative, but was ", i, '.'));
        throw null;
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: a */
    public final ux8 mo19393a(int i) {
        int i2 = this.f56463b + i;
        return i2 < 0 ? new pm2(this, i) : new pm2(this.f56462a, i2);
    }

    @Override // p000.ux8
    public final Iterator iterator() {
        return new om2(this);
    }
}
