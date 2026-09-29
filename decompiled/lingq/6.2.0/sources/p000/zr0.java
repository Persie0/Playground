package p000;

import com.lingq.core.p012ui.library.CollectionLoadingItemType;
import com.lingq.core.premium.upgrade.UpgradeBadgeTier;
import com.lingq.feature.onboarding.p014v2.pages.p023long.AbstractC2231b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zr0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f71993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f71994c;

    public /* synthetic */ zr0(int i, int i2, List list) {
        this.f71992a = 0;
        this.f71994c = list;
        this.f71993b = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f71992a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f71993b;
        Object obj3 = this.f71994c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                b6d.m3387g(b16.f7762a, (List) obj3, i2, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).intValue();
                u6d.m22517b((nz9) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                e8d.m10944c((CollectionLoadingItemType) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                xd5.m24464c((t17) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC2231b.m9196i(i2, (String) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).intValue();
                s9d.m21185d((UpgradeBadgeTier) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ zr0(int i, String str, int i2) {
        this.f71992a = 4;
        this.f71993b = i;
        this.f71994c = str;
    }

    public /* synthetic */ zr0(Object obj, int i, int i2) {
        this.f71992a = i2;
        this.f71994c = obj;
        this.f71993b = i;
    }
}
