package p115fb;

import ae.C0062b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5745a;

/* JADX INFO: renamed from: fb.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5496l implements InterfaceC5745a {

    /* JADX INFO: renamed from: a */
    public final Object f34100a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f34101b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5496l(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f34100a = new Messenger(iBinder);
            this.f34101b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f34101b = new zzd(iBinder);
            this.f34100a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public /* synthetic */ C5496l(C5486b c5486b, Bundle bundle) {
        this.f34100a = c5486b;
        this.f34101b = bundle;
    }

    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public final Object mo5485i(AbstractC5751g abstractC5751g) {
        C5486b c5486b = (C5486b) this.f34100a;
        Bundle bundle = (Bundle) this.f34101b;
        c5486b.getClass();
        if (!abstractC5751g.mo12111m()) {
            return abstractC5751g;
        }
        Bundle bundle2 = (Bundle) abstractC5751g.mo12107i();
        return !(bundle2 != null && bundle2.containsKey("google.messenger")) ? abstractC5751g : c5486b.m11716a(bundle).mo12112n(ExecutorC5503s.f34117a, C0062b.f162i);
    }
}
