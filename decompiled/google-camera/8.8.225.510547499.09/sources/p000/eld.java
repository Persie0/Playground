package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eld extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ elf f14550a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eld(elf elfVar) {
        super("EncoderDrainerWriteThread");
        this.f14550a = elfVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        gtd gtdVar;
        elf elfVar = this.f14550a;
        while (elfVar.f14561j) {
            synchronized (elfVar.f14556e) {
                while (elfVar.f14555d.size() > 100) {
                    ((nbe) ((nbe) elf.f14552a.m17251b()).mo17276G(1570)).mo17290o("Dropping frames in drainer!");
                    elfVar.f14555d.poll();
                    elfVar.f14562k++;
                }
                gtdVar = (gtd) elfVar.f14555d.poll();
            }
            if (gtdVar != null) {
                elfVar.f14554c.m7450c(elfVar.f14557f, (ByteBuffer) gtdVar.f26335b, (MediaCodec.BufferInfo) gtdVar.f26334a);
            }
            synchronized (elfVar.f14556e) {
                if (elfVar.f14555d.isEmpty() && elfVar.f14559h) {
                    return;
                }
                while (elfVar.f14555d.isEmpty() && !elfVar.f14559h) {
                    try {
                        elfVar.f14556e.wait();
                    } catch (InterruptedException e) {
                        ((nbe) ((nbe) ((nbe) elf.f14552a.m17251b()).mo17283h(e)).mo17276G(1569)).mo17290o("Interrupted during wait");
                    }
                }
                throw th;
            }
        }
    }
}
