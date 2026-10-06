package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jey extends BasePendingResult implements jez {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected jey(jec jecVar) {
        super(jecVar);
        jib.m13206k(jecVar, BEeWZPor.HEIhmMvtuq);
    }

    /* JADX INFO: renamed from: d */
    private final void m13006d(RemoteException remoteException) {
        m13008f(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo12838b(jdp jdpVar);

    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ void mo12841c(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m13007e(jdp jdpVar) throws DeadObjectException {
        try {
            mo12838b(jdpVar);
        } catch (DeadObjectException e) {
            m13006d(e);
            throw e;
        } catch (RemoteException e2) {
            m13006d(e2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13008f(Status status) {
        jib.m13197b(!status.m4645b(), "Failed result must not be success");
        m4649i(mo4647a(status));
    }
}
