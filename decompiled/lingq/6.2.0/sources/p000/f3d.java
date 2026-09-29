package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class f3d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f38373a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f38374b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f38375c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzr f38376d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f38377e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ v4d f38378f;

    public f3d(v4d v4dVar, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z) {
        this.f38373a = atomicReference;
        this.f38374b = str;
        this.f38375c = str2;
        this.f38376d = zzrVar;
        this.f38377e = z;
        this.f38378f = v4dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f38373a;
        synchronized (atomicReference2) {
            try {
                try {
                    v4d v4dVar = this.f38378f;
                    q9c q9cVar = v4dVar.f64866d;
                    if (q9cVar == null) {
                        xcc xccVar = ((kjc) v4dVar.f60774a).f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68080f.m17926d("(legacy) Failed to get user properties; not connected to service", null, this.f38374b, this.f38375c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(q9cVar.mo11308z(this.f38374b, this.f38375c, this.f38377e, this.f38376d));
                    } else {
                        atomicReference2.set(q9cVar.mo11291a(null, this.f38374b, this.f38375c, this.f38377e));
                    }
                    v4dVar.m23116Q();
                    atomicReference = this.f38373a;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    xcc xccVar2 = ((kjc) this.f38378f.f60774a).f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17926d("(legacy) Failed to get user properties; remote exception", null, this.f38374b, e);
                    this.f38373a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f38373a;
                }
            } catch (Throwable th) {
                this.f38373a.notify();
                throw th;
            }
        }
    }
}
