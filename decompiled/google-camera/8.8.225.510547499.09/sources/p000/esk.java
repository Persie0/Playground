package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class esk implements kbg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15315a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ esl f15316b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f15317c;

    public esk(esl eslVar, int i, AtomicReference atomicReference) {
        this.f15316b = eslVar;
        this.f15317c = i;
        this.f15315a = atomicReference;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f15316b.f15415s.m10426c();
            esl eslVar = this.f15316b;
            fcp fcpVar = eslVar.f15416t;
            int i = this.f15317c;
            hku hkuVar = eslVar.f15415s;
            fcpVar.mo8156aa(i, 1, hkuVar.f28241m, hkuVar.m10436g(hkt.MODE_SWITCH_END));
            if (this.f15315a.get() != null) {
                ((kba) this.f15315a.get()).close();
            }
        }
    }
}
