package p504y9;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: y9.d */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC10311d extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C10312e f51842a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC10311d(C10312e c10312e, Looper looper) {
        super(looper);
        this.f51842a = c10312e;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C10312e c10312e = this.f51842a;
        c10312e.getClass();
        int i10 = message.what;
        C10312e.a aVar = null;
        if (i10 == 0) {
            C10312e.a aVar2 = (C10312e.a) message.obj;
            try {
                c10312e.f51845a.queueInputBuffer(aVar2.f51851a, aVar2.f51852b, aVar2.f51853c, aVar2.f51855e, aVar2.f51856f);
            } catch (RuntimeException e10) {
                AtomicReference<RuntimeException> atomicReference = c10312e.f51848d;
                while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                }
            }
            aVar = aVar2;
        } else if (i10 == 1) {
            C10312e.a aVar3 = (C10312e.a) message.obj;
            int i11 = aVar3.f51851a;
            int i12 = aVar3.f51852b;
            MediaCodec.CryptoInfo cryptoInfo = aVar3.f51854d;
            long j10 = aVar3.f51855e;
            int i13 = aVar3.f51856f;
            try {
                synchronized (C10312e.f51844h) {
                    c10312e.f51845a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                }
            } catch (RuntimeException e11) {
                AtomicReference<RuntimeException> atomicReference2 = c10312e.f51848d;
                while (!atomicReference2.compareAndSet(null, e11) && atomicReference2.get() == null) {
                }
            }
            aVar = aVar3;
        } else if (i10 != 2) {
            AtomicReference<RuntimeException> atomicReference3 = c10312e.f51848d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            c10312e.f51849e.m19062a();
        }
        if (aVar != null) {
            ArrayDeque<C10312e.a> arrayDeque = C10312e.f51843g;
            synchronized (arrayDeque) {
                arrayDeque.add(aVar);
            }
        }
    }
}
