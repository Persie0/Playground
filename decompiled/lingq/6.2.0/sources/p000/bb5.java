package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bb5 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Set f8277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d95 f8278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b85 f8279c;

    public bb5(Set set, d95 d95Var, b85 b85Var) {
        this.f8277a = set;
        this.f8278b = d95Var;
        this.f8279c = b85Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Set set = this.f8277a;
            d95 d95Var = this.f8278b;
            if (set.add(d95Var.f35219d)) {
                this.f8279c.mo3471x(d95Var.f35217b);
            }
        }
        return xfa.f68157a;
    }
}
