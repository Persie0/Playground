package p000;

import com.lingq.feature.karaoke.C2118c;
import com.lingq.feature.karaoke.KaraokeFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dh4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35648a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KaraokeFragment f35649b;

    public /* synthetic */ dh4(KaraokeFragment karaokeFragment, int i) {
        this.f35648a = i;
        this.f35649b = karaokeFragment;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f35648a;
        xfa xfaVar = xfa.f68157a;
        KaraokeFragment karaokeFragment = this.f35649b;
        switch (i) {
            case 0:
                ((C2118c) karaokeFragment.f26193B0.getValue()).mo8768j0(true);
                break;
            default:
                vg6 vg6Var = (vg6) obj;
                vg6Var.getClass();
                if (vg6Var.equals(tg6.f62255a)) {
                    b34.m3244j(karaokeFragment).m22689f();
                }
                break;
        }
        return xfaVar;
    }
}
