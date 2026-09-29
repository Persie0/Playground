package p000;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: bx */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0827bx implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9108a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eu5 f9109b;

    public /* synthetic */ C0827bx(st5 st5Var, eu5 eu5Var, int i) {
        this.f9108a = i;
        this.f9109b = eu5Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.f9108a;
        eu5 eu5Var = this.f9109b;
        switch (i) {
            case 0:
                Handler handler = eu5Var.f37867a;
                if (Build.VERSION.SDK_INT >= 30) {
                    eu5Var.m11343a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                Handler handler2 = eu5Var.f37867a;
                if (Build.VERSION.SDK_INT >= 30) {
                    eu5Var.m11343a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
