package p000;

import androidx.compose.foundation.text.AbstractC0176d;
import androidx.compose.foundation.text.selection.C0205f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rm1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59524a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f59525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f59526c;

    public /* synthetic */ rm1(C0205f c0205f, boolean z, int i) {
        this.f59526c = c0205f;
        this.f59525b = z;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f59524a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f59526c;
        boolean z = this.f59525b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0176d.m1070c((C0205f) obj3, z, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                ci8.m4718c(iM19383z, (ye1) obj, (String) obj3, z);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ rm1(String str, int i, boolean z) {
        this.f59525b = z;
        this.f59526c = str;
    }
}
