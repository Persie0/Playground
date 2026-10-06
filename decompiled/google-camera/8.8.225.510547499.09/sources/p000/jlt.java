package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jlt extends cbr implements IInterface {

    /* JADX INFO: renamed from: a */
    private final jky f34336a;

    /* JADX INFO: renamed from: b */
    private final msn f34337b;

    /* JADX INFO: renamed from: c */
    private final Object f34338c;

    /* JADX INFO: renamed from: d */
    private boolean f34339d;

    public jlt(jky jkyVar, msn msnVar) {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
        this.f34338c = new Object();
        this.f34339d = false;
        this.f34336a = jkyVar;
        this.f34337b = msnVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m13343b() {
        synchronized (this.f34338c) {
            if (this.f34339d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.close called more than once");
            } else {
                this.f34339d = true;
                this.f34336a.close();
            }
        }
    }

    public jlt() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        jls jlsVar;
        switch (i) {
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    jlsVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
                    jlsVar = iInterfaceQueryLocalInterface instanceof jls ? (jls) iInterfaceQueryLocalInterface : new jls(strongBinder);
                }
                cbs.m3403b(parcel);
                lku.m15669w(jlsVar != null);
                synchronized (this.f34338c) {
                    if (this.f34339d) {
                        Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.next called after close");
                    } else {
                        this.f34336a.mo3981a(new jlq(this, jlsVar, this.f34337b));
                    }
                }
                break;
            case 3:
                parcel.readInt();
                cbs.m3403b(parcel);
                synchronized (this.f34338c) {
                    if (this.f34339d) {
                        Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.request called after close");
                    } else {
                        this.f34336a.mo3982b();
                    }
                }
                break;
            case 4:
                m13343b();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
