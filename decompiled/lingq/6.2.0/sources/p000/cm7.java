package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cm7 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10276a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10277b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.f10276a;
        Object obj = this.f10277b;
        switch (i) {
            case 0:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new dm7((Context) obj, 0), new Random().nextInt(Math.max(DescriptorProtos.Edition.EDITION_2023_VALUE, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
