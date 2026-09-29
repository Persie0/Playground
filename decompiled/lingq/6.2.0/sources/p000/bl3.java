package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bl3 implements ux8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8657a;

    /* JADX INFO: renamed from: b */
    public final vi3 f8658b;

    /* JADX INFO: renamed from: c */
    public final Object f8659c;

    public /* synthetic */ bl3(Object obj, vi3 vi3Var, int i) {
        this.f8657a = i;
        this.f8659c = obj;
        this.f8658b = vi3Var;
    }

    @Override // p000.ux8
    public final Iterator iterator() {
        switch (this.f8657a) {
            case 0:
                return new al3(this);
            default:
                return new p9a(this);
        }
    }
}
