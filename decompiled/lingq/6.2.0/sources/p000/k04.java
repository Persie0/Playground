package p000;

import com.lingq.feature.onboarding.p014v2.OnboardingSelections;
import com.lingq.feature.onboarding.p014v2.pages.AbstractC2228a;
import com.lingq.feature.widget.layout.collections.layout.AbstractC2868d;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k04 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46470a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f46471b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f46472c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f46473d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f46474e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f46475f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f46476g;

    public /* synthetic */ k04(boolean z, vi3 vi3Var, e16 e16Var, boolean z2, xo9 xo9Var, int i) {
        this.f46470a = 3;
        this.f46471b = z;
        this.f46474e = vi3Var;
        this.f46475f = e16Var;
        this.f46472c = z2;
        this.f46476g = xo9Var;
        this.f46473d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f46470a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f46473d;
        Object obj3 = this.f46476g;
        Object obj4 = this.f46475f;
        Object obj5 = this.f46474e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                AbstractC2868d.m9781b((h04) obj5, this.f46471b, this.f46472c, (zj8) obj4, (on3) obj3, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                wnb.m24085b(this.f46471b, this.f46472c, (String) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, iM19383z2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                AbstractC2228a.m9185e((OnboardingSelections) obj5, this.f46471b, this.f46472c, (ui3) obj4, (e16) obj3, (ye1) obj, iM19383z3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z4 = pk9.m19383z(i2 | 1);
                ap9.m2973a(this.f46471b, (vi3) obj5, (e16) obj4, this.f46472c, (xo9) obj3, (ye1) obj, iM19383z4);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ k04(Object obj, boolean z, boolean z2, Object obj2, Object obj3, int i, int i2) {
        this.f46470a = i2;
        this.f46474e = obj;
        this.f46471b = z;
        this.f46472c = z2;
        this.f46475f = obj2;
        this.f46476g = obj3;
        this.f46473d = i;
    }

    public /* synthetic */ k04(boolean z, boolean z2, String str, ui3 ui3Var, ui3 ui3Var2, int i) {
        this.f46470a = 1;
        this.f46471b = z;
        this.f46472c = z2;
        this.f46474e = str;
        this.f46475f = ui3Var;
        this.f46476g = ui3Var2;
        this.f46473d = i;
    }
}
