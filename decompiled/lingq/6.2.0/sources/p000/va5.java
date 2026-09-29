package p000;

import com.lingq.feature.library.AbstractC2143d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class va5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65138a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f65139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f65140c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f65141d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f65142e;

    public /* synthetic */ va5(e16 e16Var, y59 y59Var, b85 b85Var, boolean z, int i) {
        this.f65140c = e16Var;
        this.f65141d = y59Var;
        this.f65142e = b85Var;
        this.f65139b = z;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f65138a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f65142e;
        Object obj4 = this.f65141d;
        Object obj5 = this.f65140c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2143d.m9060d((e16) obj5, (y59) obj4, (b85) obj3, this.f65139b, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                v56 v56Var = (v56) obj5;
                eu9 eu9Var = (eu9) obj4;
                o39 o39Var = (o39) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    ho5.f42705i.m13405g(this.f65139b, false, v56Var, null, eu9Var, o39Var, 0.0f, 0.0f, tj3Var, 100663296, 200);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ va5(boolean z, v56 v56Var, eu9 eu9Var, o39 o39Var) {
        this.f65139b = z;
        this.f65140c = v56Var;
        this.f65141d = eu9Var;
        this.f65142e = o39Var;
    }
}
