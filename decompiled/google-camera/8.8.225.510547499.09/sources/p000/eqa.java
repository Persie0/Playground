package p000;

import android.media.MediaCodec;
import android.os.Handler;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eqa implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f15089c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f15090d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f15091e;

    public eqa(bnu bnuVar, int i, Handler handler, bnm bnmVar, int i2) {
        this.f15091e = i2;
        this.f15089c = bnuVar;
        this.f15087a = i;
        this.f15088b = handler;
        this.f15090d = bnmVar;
    }

    public /* synthetic */ eqa(eqc eqcVar, String str, int i, Runnable runnable, int i2) {
        this.f15091e = i2;
        this.f15088b = eqcVar;
        this.f15089c = str;
        this.f15087a = i;
        this.f15090d = runnable;
    }

    public /* synthetic */ eqa(kxz kxzVar, int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i2) {
        this.f15091e = i2;
        this.f15090d = kxzVar;
        this.f15087a = i;
        this.f15089c = byteBuffer;
        this.f15088b = bufferInfo;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bnm, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        switch (this.f15091e) {
            case 0:
                Object obj = this.f15088b;
                Object obj2 = this.f15089c;
                int i = this.f15087a;
                ?? r3 = this.f15090d;
                eqc eqcVar = (eqc) obj;
                eqcVar.f15103e.mo13961e("MotionBlurQueue#" + ((String) obj2) + "-" + i);
                r3.run();
                eqcVar.f15103e.mo13962f();
                return;
            case 1:
                ((bnu) this.f15089c).mo2742a().obtainMessage(1, this.f15087a, 0, bnn.m2773e((Handler) this.f15088b, this.f15090d)).sendToTarget();
                return;
            default:
                Object obj3 = this.f15090d;
                int i2 = this.f15087a;
                Object obj4 = this.f15089c;
                Object obj5 = this.f15088b;
                kxz kxzVar = (kxz) obj3;
                synchronized (kxzVar.f37694e) {
                    num = (Integer) ((kxz) obj3).f37695f.get(Integer.valueOf(i2));
                    if (num == null) {
                        throw new IllegalArgumentException("Unknown track id: " + i2);
                    }
                }
                kxzVar.f37691b.mo14524h(num.intValue(), (ByteBuffer) obj4, (MediaCodec.BufferInfo) obj5);
                return;
        }
    }
}
