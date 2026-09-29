package p000;

import androidx.glance.layout.AbstractC0686a;
import androidx.glance.text.AbstractC0704a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xj9 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68302a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f68303b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f68304c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f68305d;

    public /* synthetic */ xj9(Object obj, float f, long j, int i) {
        this.f68302a = i;
        this.f68305d = obj;
        this.f68303b = f;
        this.f68304c = j;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f68302a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f68305d;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((uj8) obj).getClass();
                Iterator it = ((List) obj4).iterator();
                while (it.hasNext()) {
                    AbstractC0686a.m2486b(new m4b(jg2.f45515a), 0, 1, ci8.m4703P(1877981080, new xj9((ek9) it.next(), this.f68303b, this.f68304c, 1), ye1Var), ye1Var, 3072, 2);
                }
                return xfaVar;
            default:
                ek9 ek9Var = (ek9) obj4;
                ye1 ye1Var2 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((cb1) obj).getClass();
                dk9.m10443b(null, ek9Var, this.f68303b, ye1Var2, 0);
                AbstractC0686a.m2488d(ci8.m4694G(mn3.f51554a, 2.0f), ye1Var2, 0);
                String str = ek9Var.f37392a;
                str.getClass();
                if (str.length() != 0) {
                    AbstractC0704a.m2506a(String.valueOf(str.charAt(0)), null, new ux9(dk9.f35752e, new zx9(this.f68304c), new ac3(ek9Var.f37396e ? 700 : 400), 120), 0, ye1Var2, 0, 10);
                    return xfaVar;
                }
                uk9.m22775i("Char sequence is empty.");
                return null;
        }
    }
}
