package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jqj extends cbr implements IInterface {
    public jqj() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    /* JADX INFO: renamed from: b */
    public void mo13465b(Status status, jqi jqiVar) {
        throw new IllegalStateException("Not implemented.");
    }

    /* JADX INFO: renamed from: c */
    public void mo13468c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    /* JADX INFO: renamed from: d */
    public void mo13469d(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) cbs.m3402a(parcel, Status.CREATOR);
                jqi jqiVar = (jqi) cbs.m3402a(parcel, jqi.CREATOR);
                cbs.m3403b(parcel);
                mo13465b(status, jqiVar);
                return true;
            case 3:
                cbs.m3403b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                Status status2 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                cbs.m3403b(parcel);
                mo13468c(status2);
                return true;
            case 5:
                Status status3 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                cbs.m3403b(parcel);
                mo13469d(status3);
                return true;
            case 6:
                parcel.createStringArrayList();
                cbs.m3403b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                cbs.m3403b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                cbs.m3406e(parcel);
                cbs.m3403b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                cbs.m3403b(parcel);
                throw new IllegalStateException("Not implemented");
            case 10:
                cbs.m3403b(parcel);
                throw new IllegalStateException("Not implemented");
            default:
                return false;
        }
    }
}
