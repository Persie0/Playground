package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class jd5 implements ux8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45440a;

    /* JADX INFO: renamed from: b */
    public final Object f45441b;

    public /* synthetic */ jd5(Object obj, int i) {
        this.f45440a = i;
        this.f45441b = obj;
    }

    @Override // p000.ux8
    public final Iterator iterator() {
        switch (this.f45440a) {
            case 0:
                return new id5(this);
            default:
                return new hd5((String) this.f45441b);
        }
    }
}
