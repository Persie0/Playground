package p000;

import com.lingq.feature.widget.C2864b;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: renamed from: cp */
/* JADX INFO: loaded from: classes.dex */
public final class C2892cp implements wr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC2935dp f34329b;

    public /* synthetic */ C2892cp(AbstractActivityC2935dp abstractActivityC2935dp, int i) {
        this.f34328a = i;
        this.f34329b = abstractActivityC2935dp;
    }

    @Override // p000.wr6
    /* JADX INFO: renamed from: a */
    public final void mo9822a(uc1 uc1Var) {
        int i = this.f34328a;
        AbstractActivityC2935dp abstractActivityC2935dp = this.f34329b;
        switch (i) {
            case 0:
                AbstractC3343mp abstractC3343mpM10565l = abstractActivityC2935dp.m10565l();
                abstractC3343mpM10565l.mo16967a();
                ((fs6) abstractActivityC2935dp.f63700d.f39591c).m12108m("androidx:appcompat");
                abstractC3343mpM10565l.mo16968c();
                break;
            default:
                MainActivity mainActivity = (MainActivity) abstractActivityC2935dp;
                if (!mainActivity.f33997Y) {
                    mainActivity.f33997Y = true;
                    ky1 ky1Var = ((cy1) ((cp5) mainActivity.mo6995b())).f34704a;
                    mainActivity.f34003e0 = (ob1) ky1Var.f48696h.get();
                    mainActivity.f34004f0 = (C3509qs) ky1Var.f48768z.get();
                    mainActivity.f34005g0 = (hm5) ky1Var.f48736r.get();
                    mainActivity.f34006h0 = (C2864b) ky1Var.f48647T.get();
                    mainActivity.f34007i0 = (qn7) ky1Var.f48628M1.get();
                }
                break;
        }
    }
}
