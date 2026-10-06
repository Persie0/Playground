package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class igc implements igf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ige f30723a;

    public igc(ige igeVar) {
        this.f30723a = igeVar;
    }

    @Override // p000.igf
    public final void onShutterButtonClick() {
        synchronized (this.f30723a.f30727b) {
            for (igf igfVar : this.f30723a.f30728c) {
                ige igeVar = this.f30723a;
                ikt iktVar = igeVar.f30731f;
                if (iktVar == null || !iktVar.f31381h) {
                    igfVar.onShutterButtonClick();
                } else {
                    if (igeVar.m11261ap()) {
                        this.f30723a.f30726a.setPressed(true);
                    }
                    igfVar.onShutterButtonLongPressUnlock();
                }
            }
        }
    }

    @Override // p000.igf
    public final void onShutterButtonDown() {
        synchronized (this.f30723a.f30727b) {
            Iterator it = this.f30723a.f30728c.iterator();
            while (it.hasNext()) {
                ((igf) it.next()).onShutterButtonDown();
            }
        }
    }

    @Override // p000.igf
    public final void onShutterButtonLongPressRelease() {
        synchronized (this.f30723a.f30727b) {
            this.f30723a.f30726a.setVisualFeedbackForEnableState(true);
            Iterator it = this.f30723a.f30728c.iterator();
            while (it.hasNext()) {
                ((igf) it.next()).onShutterButtonLongPressRelease();
            }
        }
    }

    @Override // p000.igf
    public final void onShutterButtonLongPressUnlock() {
        synchronized (this.f30723a.f30727b) {
            this.f30723a.f30726a.setVisualFeedbackForEnableState(true);
            Iterator it = this.f30723a.f30728c.iterator();
            while (it.hasNext()) {
                ((igf) it.next()).onShutterButtonLongPressUnlock();
            }
        }
    }

    @Override // p000.igf
    public final void onShutterButtonLongPressed() {
        synchronized (this.f30723a.f30727b) {
            this.f30723a.f30726a.setVisualFeedbackForEnableState(false);
            Iterator it = this.f30723a.f30728c.iterator();
            while (it.hasNext()) {
                ((igf) it.next()).onShutterButtonLongPressed();
            }
        }
    }

    @Override // p000.igf
    public final void onShutterButtonPressedStateChanged(boolean z) {
        synchronized (this.f30723a.f30727b) {
            Iterator it = this.f30723a.f30728c.iterator();
            while (it.hasNext()) {
                ((igf) it.next()).onShutterButtonPressedStateChanged(z);
            }
        }
    }

    @Override // p000.igf
    public final void onShutterTouch(ili iliVar) {
        synchronized (this.f30723a.f30727b) {
            Iterator it = this.f30723a.f30728c.iterator();
            while (it.hasNext()) {
                ((igf) it.next()).onShutterTouch(iliVar);
            }
        }
    }

    @Override // p000.igf
    public final void onShutterTouchStart() {
        synchronized (this.f30723a.f30727b) {
            Iterator it = this.f30723a.f30728c.iterator();
            while (it.hasNext()) {
                ((igf) it.next()).onShutterTouchStart();
            }
        }
    }
}
