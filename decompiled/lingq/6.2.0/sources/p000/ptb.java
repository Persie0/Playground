package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ptb extends wpb implements oub {

    /* JADX INFO: renamed from: f */
    public final AtomicReference f56788f;

    /* JADX INFO: renamed from: g */
    public boolean f56789g;

    public ptb() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f56788f = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m19477H(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", wq1.m24119o("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // p000.wpb
    /* JADX INFO: renamed from: F */
    public final boolean mo3072F(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
        bqb.m4109f(parcel);
        mo16549u(bundle);
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final Bundle m19478G(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f56788f;
        synchronized (atomicReference) {
            if (!this.f56789g) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f56788f.get();
        }
        return bundle;
    }

    @Override // p000.oub
    /* JADX INFO: renamed from: u */
    public final void mo16549u(Bundle bundle) {
        AtomicReference atomicReference = this.f56788f;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f56789g = true;
                    this.f56788f.notify();
                } catch (Throwable th) {
                    this.f56788f.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
