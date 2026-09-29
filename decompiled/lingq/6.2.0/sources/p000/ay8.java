package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ay8 implements Iterable, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xs2 f7672a;

    public ay8(xs2 xs2Var) {
        this.f7672a = xs2Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new om2(this.f7672a);
    }
}
