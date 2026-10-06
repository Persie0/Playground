package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jet {

    /* JADX INFO: renamed from: c */
    public final int f33841c;

    public jet(int i) {
        this.f33841c = i;
    }

    /* JADX INFO: renamed from: h */
    public static Status m12978h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo12974d(Status status);

    /* JADX INFO: renamed from: e */
    public abstract void mo12975e(Exception exc);

    /* JADX INFO: renamed from: f */
    public abstract void mo12976f(jfj jfjVar);

    /* JADX INFO: renamed from: g */
    public abstract void mo12977g(ihk ihkVar, boolean z);
}
