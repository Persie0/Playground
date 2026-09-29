package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class kr9 implements ux8 {

    /* JADX INFO: renamed from: a */
    public final ux8 f48369a;

    /* JADX INFO: renamed from: b */
    public final vi3 f48370b;

    public kr9(ux8 ux8Var, vi3 vi3Var) {
        this.f48369a = ux8Var;
        this.f48370b = vi3Var;
    }

    @Override // p000.ux8
    public final Iterator iterator() {
        return new jr9(this);
    }
}
