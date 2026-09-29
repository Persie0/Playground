package androidx.compose.p002ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.Lambda;
import p000.dp5;
import p000.eh0;
import p000.ph2;
import p000.ui3;
import p000.v72;
import p000.wfb;

/* JADX INFO: loaded from: classes.dex */
final class AndroidUiDispatcher$Companion$Main$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final AndroidUiDispatcher$Companion$Main$2 f4524b = new AndroidUiDispatcher$Companion$Main$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographer = Choreographer.getInstance();
        } else {
            v72 v72Var = ph2.f56212a;
            choreographer = (Choreographer) wfb.m23900B(dp5.f36000a, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(2, null));
        }
        C0397i c0397i = new C0397i(choreographer, Handler.createAsync(Looper.getMainLooper()));
        return eh0.m11113J(c0397i, c0397i.f4781l);
    }
}
