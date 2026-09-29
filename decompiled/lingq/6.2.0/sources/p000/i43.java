package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i43 implements ux8 {

    /* JADX INFO: renamed from: a */
    public final ux8 f43477a;

    /* JADX INFO: renamed from: b */
    public final boolean f43478b;

    /* JADX INFO: renamed from: c */
    public final vi3 f43479c;

    public i43(ux8 ux8Var, boolean z, vi3 vi3Var) {
        this.f43477a = ux8Var;
        this.f43478b = z;
        this.f43479c = vi3Var;
    }

    @Override // p000.ux8
    public final Iterator iterator() {
        return new h43(this);
    }
}
