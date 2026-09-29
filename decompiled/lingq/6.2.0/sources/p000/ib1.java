package p000;

import com.lingq.feature.onboarding.p014v2.pages.AbstractC2228a;
import com.lingq.feature.onboarding.p014v2.pages.p023long.AbstractC2231b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ib1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43880a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f43881b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f43882c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e16 f43883d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f43884e;

    public /* synthetic */ ib1(int i, int i2, ui3 ui3Var, e16 e16Var, String str) {
        this.f43881b = str;
        this.f43884e = i;
        this.f43882c = ui3Var;
        this.f43883d = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f43880a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                AbstractC2231b.m9188a(this.f43884e, iM19383z, (ye1) obj, this.f43882c, this.f43883d, this.f43881b);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2228a.m9184d(pk9.m19383z(this.f43884e | 1), (ye1) obj, this.f43882c, this.f43883d, this.f43881b);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ib1(String str, ui3 ui3Var, e16 e16Var, int i) {
        this.f43881b = str;
        this.f43882c = ui3Var;
        this.f43883d = e16Var;
        this.f43884e = i;
    }
}
