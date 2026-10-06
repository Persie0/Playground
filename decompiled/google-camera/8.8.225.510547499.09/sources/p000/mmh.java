package p000;

import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmh implements mly {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f41032a;

    /* JADX INFO: renamed from: b */
    private final ViewGroup f41033b;

    public mmh(ViewPager viewPager, int i) {
        this.f41032a = i;
        this.f41033b = viewPager;
    }

    public mmh(ViewPager2 viewPager2, int i) {
        this.f41032a = i;
        this.f41033b = viewPager2;
    }

    @Override // p000.mlx
    /* JADX INFO: renamed from: b */
    public final void mo5865b(mmb mmbVar) {
        int i = this.f41032a;
    }

    @Override // p000.mlx
    /* JADX INFO: renamed from: c */
    public final void mo5866c() {
        int i = this.f41032a;
    }

    @Override // p000.mlx
    /* JADX INFO: renamed from: a */
    public final void mo5864a(mmb mmbVar) {
        switch (this.f41032a) {
            case 0:
                ((ViewPager2) this.f41033b).m1561d(mmbVar.f41013d, true);
                break;
            default:
                ((ViewPager) this.f41033b).m1550b(false);
                break;
        }
    }
}
