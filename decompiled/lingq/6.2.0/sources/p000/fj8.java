package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.tooltips.components.AbstractC1915b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fj8 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39198a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f39199b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f39200c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f39201d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xi3 f39202e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f39203f;

    public /* synthetic */ fj8(float f, List list, vi3 vi3Var, ui3 ui3Var, int i) {
        this.f39198a = 1;
        this.f39199b = f;
        this.f39201d = list;
        this.f39202e = vi3Var;
        this.f39203f = ui3Var;
        this.f39200c = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f39198a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f39200c;
        Object obj3 = this.f39203f;
        xi3 xi3Var = this.f39202e;
        Object obj4 = this.f39201d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                lyc.m16573a((ArrayList) obj4, (C0282a) xi3Var, (on3) obj3, this.f39199b, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                d4d.m10095a(this.f39199b, (List) obj4, (vi3) xi3Var, (ui3) obj3, (ye1) obj, iM19383z2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                l5d.m15820a((e16) obj4, this.f39199b, (ui3) obj3, (C0282a) xi3Var, (ye1) obj, iM19383z3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z4 = pk9.m19383z(i2 | 1);
                AbstractC1915b.m8790c((c7a) obj4, (ui3) xi3Var, (ui3) obj3, this.f39199b, (ye1) obj, iM19383z4);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ fj8(e16 e16Var, float f, ui3 ui3Var, C0282a c0282a, int i) {
        this.f39198a = 2;
        this.f39201d = e16Var;
        this.f39199b = f;
        this.f39203f = ui3Var;
        this.f39202e = c0282a;
        this.f39200c = i;
    }

    public /* synthetic */ fj8(Object obj, xi3 xi3Var, Object obj2, float f, int i, int i2) {
        this.f39198a = i2;
        this.f39201d = obj;
        this.f39202e = xi3Var;
        this.f39203f = obj2;
        this.f39199b = f;
        this.f39200c = i;
    }
}
