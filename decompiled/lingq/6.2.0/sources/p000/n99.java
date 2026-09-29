package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n99 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f52517b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f52518c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f52519d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f52520e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ e16 f52521f;

    public /* synthetic */ n99(Set set, vi3 vi3Var, boolean z, ui3 ui3Var, e16 e16Var, int i, int i2) {
        this.f52516a = i2;
        this.f52517b = set;
        this.f52518c = vi3Var;
        this.f52519d = z;
        this.f52520e = ui3Var;
        this.f52521f = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f52516a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                r3d.m20286a(this.f52517b, this.f52518c, this.f52519d, this.f52520e, this.f52521f, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(1);
                q7a.m19708c(this.f52517b, this.f52518c, this.f52519d, this.f52520e, this.f52521f, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }
}
