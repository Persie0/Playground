package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdb {

    /* JADX INFO: renamed from: a */
    public final int f57628a;

    public qdb(int i) {
        this.f57628a = i;
    }

    /* JADX INFO: renamed from: e */
    public static Status m19873e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo13797a(Status status);

    /* JADX INFO: renamed from: b */
    public abstract void mo13798b(Exception exc);

    /* JADX INFO: renamed from: c */
    public abstract void mo13799c(qfa qfaVar, boolean z);

    /* JADX INFO: renamed from: d */
    public abstract void mo13800d(scb scbVar);
}
