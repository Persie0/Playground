package p000;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: wd */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC3718wd extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66632a;

    /* JADX INFO: renamed from: b */
    public Object f66633b;

    public HandlerC3718wd(f97 f97Var) {
        this.f66632a = 3;
        this.f66633b = f97Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ev5 ev5Var;
        dv5 dv5Var;
        HandlerC3718wd handlerC3718wd;
        dv5 dv5Var2;
        C2980ex c2980ex = null;
        switch (this.f66632a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f66633b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                C3017fx c3017fx = (C3017fx) this.f66633b;
                int i2 = message.what;
                if (i2 == 1) {
                    C2980ex c2980ex2 = (C2980ex) message.obj;
                    try {
                        c3017fx.f39825a.queueInputBuffer(c2980ex2.f38013a, 0, c2980ex2.f38014b, c2980ex2.f38016d, c2980ex2.f38017e);
                        break;
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = c3017fx.f39828d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    c2980ex = c2980ex2;
                } else if (i2 == 2) {
                    C2980ex c2980ex3 = (C2980ex) message.obj;
                    int i3 = c2980ex3.f38013a;
                    MediaCodec.CryptoInfo cryptoInfo = c2980ex3.f38015c;
                    long j = c2980ex3.f38016d;
                    int i4 = c2980ex3.f38017e;
                    try {
                        synchronized (C3017fx.f39824h) {
                            c3017fx.f39825a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                            break;
                        }
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = c3017fx.f39828d;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    c2980ex = c2980ex3;
                } else if (i2 == 3) {
                    c3017fx.f39829e.m13225b();
                } else if (i2 != 4) {
                    AtomicReference atomicReference3 = c3017fx.f39828d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i2));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        c3017fx.f39825a.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = c3017fx.f39828d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (c2980ex != null) {
                    ArrayDeque arrayDeque = C3017fx.f39823g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(c2980ex);
                        break;
                    }
                    return;
                }
                return;
            case 2:
                if (message.what == 1) {
                    synchronized (((dv5) this.f66633b).f36267a) {
                        ev5Var = (ev5) ((dv5) this.f66633b).f36269c.get();
                        dv5Var = (dv5) this.f66633b;
                        handlerC3718wd = dv5Var.f36270d;
                        break;
                    }
                    if (ev5Var != null) {
                        fv5 fv5Var = (fv5) ev5Var;
                        synchronized (fv5Var.f39751c) {
                            dv5Var2 = fv5Var.f39755g;
                            break;
                        }
                        if (dv5Var != dv5Var2 || handlerC3718wd == null) {
                            return;
                        }
                        ((dv5) this.f66633b).getClass();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (lp1.f49971a.contains(this)) {
                    return;
                }
                try {
                    message.getClass();
                    f97 f97Var = (f97) this.f66633b;
                    if (message.what == f97Var.f38682g) {
                        Bundle data = message.getData();
                        if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                            f97Var.m11619a(null);
                        } else {
                            f97Var.m11619a(data);
                        }
                        try {
                            f97Var.f38676a.unbindService(f97Var);
                            return;
                        } catch (IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    lp1.m16420a(this, th);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC3718wd(Object obj, Looper looper, int i) {
        super(looper);
        this.f66632a = i;
        this.f66633b = obj;
    }
}
