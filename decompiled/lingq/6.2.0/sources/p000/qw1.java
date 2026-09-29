package p000;

import com.lingq.feature.challenges.cup.AbstractC1976c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qw1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58265a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f58266b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f58267c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f58268d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ e16 f58269e;

    public /* synthetic */ qw1(String str, boolean z, ui3 ui3Var, e16 e16Var, int i) {
        this.f58267c = str;
        this.f58266b = z;
        this.f58268d = ui3Var;
        this.f58269e = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f58265a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1976c.m8836s(pk9.m19383z(1), (ye1) obj, this.f58268d, this.f58269e, this.f58267c, this.f58266b);
                break;
            default:
                ((Integer) obj2).getClass();
                n2d.m17193b(pk9.m19383z(1), (ye1) obj, this.f58268d, this.f58269e, this.f58267c, this.f58266b);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ qw1(boolean z, String str, ui3 ui3Var, e16 e16Var, int i) {
        this.f58266b = z;
        this.f58267c = str;
        this.f58268d = ui3Var;
        this.f58269e = e16Var;
    }
}
