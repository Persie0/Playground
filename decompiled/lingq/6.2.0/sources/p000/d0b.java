package p000;

import com.lingq.core.settings.theme.AbstractC1881a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d0b implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34812a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f34813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f34814c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f34815d;

    public /* synthetic */ d0b(int i, ui3 ui3Var, e16 e16Var) {
        this.f34814c = ui3Var;
        this.f34815d = e16Var;
        this.f34813b = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34812a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f34815d;
        Object obj4 = this.f34814c;
        int i2 = this.f34813b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                fbd.m11759i(iM19383z, (ye1) obj, (ui3) obj4, (e16) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8665d(i2, (List) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ d0b(int i, List list, vi3 vi3Var, int i2) {
        this.f34813b = i;
        this.f34814c = list;
        this.f34815d = vi3Var;
    }
}
