package p000;

import android.content.Context;
import androidx.glance.text.AbstractC0704a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pr2 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56712a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f56713b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f56714c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f56715d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f56716e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f56717f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f56718g;

    public /* synthetic */ pr2(Context context, int i, int i2, Integer num, int i3, tg9 tg9Var) {
        this.f56716e = context;
        this.f56713b = i;
        this.f56714c = i2;
        this.f56717f = num;
        this.f56715d = i3;
        this.f56718g = tg9Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f56712a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f56714c;
        Object obj3 = this.f56718g;
        Object obj4 = this.f56717f;
        Object obj5 = this.f56716e;
        switch (i) {
            case 0:
                Context context = (Context) obj5;
                Integer num = (Integer) obj4;
                tg9 tg9Var = (tg9) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    String string = context.getString(this.f56713b);
                    string.getClass();
                    String string2 = context.getString(i2);
                    string2.getClass();
                    AbstractC3695vr.m23495e(num, string, string2, this.f56715d, tg9Var, tj3Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0704a.m2506a((String) obj5, (on3) obj4, (ux9) obj3, this.f56713b, (ye1) obj, pk9.m19383z(i2 | 1), this.f56715d);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ pr2(String str, on3 on3Var, ux9 ux9Var, int i, int i2, int i3) {
        this.f56716e = str;
        this.f56717f = on3Var;
        this.f56718g = ux9Var;
        this.f56713b = i;
        this.f56714c = i2;
        this.f56715d = i3;
    }
}
