package p000;

import com.lingq.feature.reader.stats.p019ui.components.AbstractC2558b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hn5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mn5 f42654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bj3 f42655c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ aj3 f42656d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f42657e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f42658f;

    public /* synthetic */ hn5(mn5 mn5Var, bj3 bj3Var, aj3 aj3Var, ui3 ui3Var, int i, int i2) {
        this.f42653a = i2;
        this.f42654b = mn5Var;
        this.f42655c = bj3Var;
        this.f42656d = aj3Var;
        this.f42657e = ui3Var;
        this.f42658f = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f42653a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f42658f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                AbstractC2558b.m9470c(this.f42654b, this.f42655c, this.f42656d, this.f42657e, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                AbstractC2558b.m9475h(this.f42654b, this.f42655c, this.f42656d, this.f42657e, (ye1) obj, iM19383z2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                AbstractC2558b.m9475h(this.f42654b, this.f42655c, this.f42656d, this.f42657e, (ye1) obj, iM19383z3);
                break;
        }
        return xfaVar;
    }
}
