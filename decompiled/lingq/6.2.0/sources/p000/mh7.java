package p000;

import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mh7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f51328b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f51329c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f51330d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f51331e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f51332f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f51333g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f51334h;

    public /* synthetic */ mh7(Object obj, boolean z, boolean z2, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f51327a = i2;
        this.f51331e = obj;
        this.f51328b = z;
        this.f51329c = z2;
        this.f51332f = obj2;
        this.f51333g = obj3;
        this.f51334h = obj4;
        this.f51330d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f51327a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f51330d;
        Object obj3 = this.f51334h;
        Object obj4 = this.f51333g;
        Object obj5 = this.f51332f;
        Object obj6 = this.f51331e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                bgc.m3707a((TokenMeaning) obj6, this.f51328b, this.f51329c, (vi3) obj5, (vi3) obj4, (vi3) obj3, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                ap9.m2974b((e16) obj6, this.f51328b, this.f51329c, (xo9) obj5, (v56) obj4, (o39) obj3, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }
}
