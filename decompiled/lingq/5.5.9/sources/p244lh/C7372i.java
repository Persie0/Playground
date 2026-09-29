package p244lh;

import com.google.android.exoplayer2.InterfaceC2532v;
import com.lingq.commons.controllers.TtsControllerImpl;

/* JADX INFO: renamed from: lh.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7372i implements InterfaceC2532v.c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TtsControllerImpl f41135a;

    public C7372i(TtsControllerImpl ttsControllerImpl) {
        this.f41135a = ttsControllerImpl;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: J */
    public final void mo7408J(int i10) {
        TtsControllerImpl ttsControllerImpl = this.f41135a;
        if (i10 == 3 && ttsControllerImpl.f16576g.isPlaying()) {
            ttsControllerImpl.f16578i.mo16479j(Boolean.TRUE);
            return;
        }
        if (i10 == 3) {
            ttsControllerImpl.f16580k.mo16479j(0L);
            ttsControllerImpl.f16578i.mo16479j(Boolean.FALSE);
        } else {
            if (i10 != 2 && i10 == 4) {
                ttsControllerImpl.f16578i.mo16479j(Boolean.FALSE);
                ttsControllerImpl.f16580k.mo16479j(0L);
            }
        }
    }
}
