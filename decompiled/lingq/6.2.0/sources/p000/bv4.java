package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.glance.appwidget.lazy.AbstractC0665a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bv4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9049a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f9050b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3532re f9051c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0282a f9052d;

    public /* synthetic */ bv4(long j, C3532re c3532re, C0282a c0282a, int i, int i2) {
        this.f9049a = i2;
        this.f9050b = j;
        this.f9051c = c3532re;
        this.f9052d = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f9049a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(385);
                AbstractC0665a.m2257b(this.f9050b, this.f9051c, this.f9052d, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(385);
                AbstractC0665a.m2259d(this.f9050b, this.f9051c, this.f9052d, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }
}
