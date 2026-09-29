package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class db2 implements ux8 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f35348a;

    /* JADX INFO: renamed from: b */
    public final int f35349b;

    /* JADX INFO: renamed from: c */
    public final zi3 f35350c;

    public db2(CharSequence charSequence, int i, zi3 zi3Var) {
        charSequence.getClass();
        this.f35348a = charSequence;
        this.f35349b = i;
        this.f35350c = zi3Var;
    }

    @Override // p000.ux8
    public final Iterator iterator() {
        return new cb2(this);
    }
}
