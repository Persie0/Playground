package p000;

import android.view.WindowManager;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class exk implements bno {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ exm f20739a;

    public exk(exm exmVar) {
        this.f20739a = exmVar;
    }

    @Override // p000.bno
    /* JADX INFO: renamed from: a */
    public final void mo2774a(byte[] bArr) {
        exm exmVar = this.f20739a;
        exmVar.f20776r = false;
        ewt ewtVar = exmVar.f20761c;
        WindowManager windowManagerM5650I = exmVar.f20753J.m5650I();
        exm exmVar2 = this.f20739a;
        if (ewtVar.m7956a(windowManagerM5650I, exmVar2.f20775q, exmVar2.f20752I, false) != null) {
            this.f20739a.m8009g();
            exm exmVar3 = this.f20739a;
            exmVar3.f20777s = false;
            exmVar3.f20761c.f20688b.m2775r(exmVar3.f20751H, new fnr(this, 1));
        }
        exm exmVar4 = this.f20739a;
        float[] fArrM8046f = exmVar4.f20765g.m8046f();
        float[] fArr = {fArrM8046f[0], fArrM8046f[1], fArrM8046f[2], fArrM8046f[4], fArrM8046f[5], fArrM8046f[6], fArrM8046f[8], fArrM8046f[9], fArrM8046f[10]};
        String str = new String();
        float f = 0.0f;
        for (int i = 0; i < 9; i++) {
            str = str + fArr[i] + " ";
            f += fArr[i];
        }
        try {
            exmVar4.f20773o.write(str + f + "\n");
            exmVar4.f20773o.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        exm exmVar5 = this.f20739a;
        exmVar5.f20783y.post(new ewo(exmVar5, bArr, 2));
        Object obj = exh.f20734a;
        if (LightCycleNative.GetNumCapturedTargets() == LightCycleNative.GetNumTotalTargets()) {
            this.f20739a.f20760b.m8019c();
            if (this.f20739a.f20782x == null || LightCycleNative.GetNumTotalTargets() != 1) {
                eyp eypVar = this.f20739a.f20781w;
                if (eypVar != null) {
                    eypVar.mo8051a(null);
                }
            } else {
                this.f20739a.f20782x.mo8051a(null);
            }
        }
        eyp eypVar2 = this.f20739a.f20745B;
        if (eypVar2 != null) {
            eypVar2.mo8051a(null);
        }
    }
}
