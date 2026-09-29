package je;

import android.os.Bundle;
import android.util.Log;
import dm.C5212l;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p387t0.C9166r;

/* JADX INFO: renamed from: je.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6467c implements InterfaceC6466b, InterfaceC6465a {

    /* JADX INFO: renamed from: a */
    public final C9166r f37036a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f37037b;

    /* JADX INFO: renamed from: c */
    public final Object f37038c = new Object();

    /* JADX INFO: renamed from: d */
    public CountDownLatch f37039d;

    public C6467c(C9166r c9166r, TimeUnit timeUnit) {
        this.f37036a = c9166r;
        this.f37037b = timeUnit;
    }

    @Override // je.InterfaceC6466b
    /* JADX INFO: renamed from: a */
    public final void mo13075a(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.f37039d;
        if (countDownLatch == null) {
            return;
        }
        if ("_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // je.InterfaceC6465a
    /* JADX INFO: renamed from: p */
    public final void mo13074p(Bundle bundle) {
        synchronized (this.f37038c) {
            C5212l c5212l = C5212l.f33289h;
            c5212l.m11193q0("Logging event _ae to Firebase Analytics with params " + bundle);
            this.f37039d = new CountDownLatch(1);
            this.f37036a.mo13074p(bundle);
            c5212l.m11193q0("Awaiting app exception callback from Analytics...");
            try {
                if (this.f37039d.await(500, this.f37037b)) {
                    c5212l.m11193q0("App exception callback received from Analytics listener.");
                } else {
                    c5212l.m11194r0("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f37039d = null;
        }
    }
}
