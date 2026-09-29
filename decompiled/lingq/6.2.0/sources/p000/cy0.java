package p000;

import android.app.Activity;
import androidx.activity.compose.C0033a;
import androidx.compose.material3.C0228e0;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cy0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34701a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f34702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f34703c;

    public /* synthetic */ cy0(Object obj, boolean z, int i) {
        this.f34701a = i;
        this.f34703c = obj;
        this.f34702b = z;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f34701a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f34703c;
        boolean z = this.f34702b;
        switch (i) {
            case 0:
                dh9 dh9Var = (dh9) obj2;
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                q98Var.m19813c(z ? ((Number) dh9Var.getValue()).floatValue() : 1.0f);
                return xfaVar;
            case 1:
                vi3 vi3Var = (vi3) obj2;
                pbb pbbVar = (pbb) obj;
                pbbVar.getClass();
                if (z) {
                    vi3Var.invoke(pbbVar);
                }
                return xfaVar;
            case 2:
                ui3 ui3Var = (ui3) obj2;
                ((fj4) obj).getClass();
                if (z) {
                    ui3Var.mo0a();
                }
                return xfaVar;
            case 3:
                C0033a c0033a = (C0033a) obj2;
                c0033a.m635m(z);
                return new pi7((ac5) obj, c0033a);
            case 4:
                ((ai2) obj).getClass();
                return new q08((Activity) obj2, z);
            default:
                C0228e0 c0228e0 = (C0228e0) obj2;
                tv8 tv8Var = (tv8) obj;
                if (!z) {
                    bh4[] bh4VarArr = AbstractC0426f.f5022a;
                    tv8Var.mo3709d(AbstractC0424d.f5003j, xfaVar);
                }
                String strValueOf = String.valueOf(ss5.m21693T(c0228e0.f3403d.m19861h() * 100.0f) / 100.0f);
                bh4[] bh4VarArr2 = AbstractC0426f.f5022a;
                C0427g c0427g = AbstractC0424d.f4995b;
                bh4 bh4Var = AbstractC0426f.f5022a[0];
                tv8Var.mo3709d(c0427g, strValueOf);
                AbstractC0426f.m1862f(tv8Var, new qa9(c0228e0, 2));
                return xfaVar;
        }
    }

    public /* synthetic */ cy0(boolean z, Object obj, int i) {
        this.f34701a = i;
        this.f34702b = z;
        this.f34703c = obj;
    }
}
