package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jgu extends jgo {

    /* JADX INFO: renamed from: g */
    public final IBinder f33981g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ jgw f33982h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgu(jgw jgwVar, int i, IBinder iBinder, Bundle bundle) {
        super(jgwVar, i, bundle);
        this.f33982h = jgwVar;
        this.f33981g = iBinder;
    }

    @Override // p000.jgo
    /* JADX INFO: renamed from: a */
    protected final void mo13142a(jcu jcuVar) {
        AmbientMode.AmbientController ambientController = this.f33982h.f34000q;
        if (ambientController != null) {
            ambientController.m1647t(jcuVar);
        }
        System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jfe] */
    @Override // p000.jgo
    /* JADX INFO: renamed from: c */
    protected final boolean mo13144c() {
        try {
            IBinder iBinder = this.f33981g;
            jib.m13205j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f33982h.mo12835c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f33982h.mo12835c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceMo12834b = this.f33982h.mo12834b(this.f33981g);
            if (iInterfaceMo12834b == null || !(this.f33982h.m13174z(2, 4, iInterfaceMo12834b) || this.f33982h.m13174z(3, 4, iInterfaceMo12834b))) {
                return false;
            }
            jgw jgwVar = this.f33982h;
            jgwVar.f33995l = null;
            AmbientMode.AmbientController ambientController = jgwVar.f34001r;
            if (ambientController == null) {
                return true;
            }
            ambientController.f1697a.mo13015b();
            return true;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
