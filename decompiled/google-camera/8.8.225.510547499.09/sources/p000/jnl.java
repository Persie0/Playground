package p000;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnl extends cbr implements IInterface {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f34400a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34401b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnl(jla jlaVar, int i) {
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
        this.f34401b = i;
        this.f34400a = jlaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnl(khb khbVar, int i, byte[] bArr, byte[] bArr2) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
        this.f34401b = i;
        this.f34400a = khbVar;
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        jjc jjaVar;
        jjc jjaVar2;
        jjc jjaVar3;
        jjc jjaVar4;
        jlu jluVar;
        nur nurVar;
        switch (this.f34401b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) cbs.m3402a(parcel, Status.CREATOR);
                Location location = (Location) cbs.m3402a(parcel, Location.CREATOR);
                cbs.m3403b(parcel);
                jib.m13215t(status, location, (khb) this.f34400a);
                return true;
            default:
                jlu jluVar2 = null;
                jjc jjaVar5 = null;
                switch (i) {
                    case 2:
                        String string = parcel.readString();
                        IBinder strongBinder = parcel.readStrongBinder();
                        if (strongBinder == null) {
                            jjaVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                            jjaVar = iInterfaceQueryLocalInterface instanceof jjc ? (jjc) iInterfaceQueryLocalInterface : new jja(strongBinder);
                        }
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 == null) {
                            jjaVar2 = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                            jjaVar2 = iInterfaceQueryLocalInterface2 instanceof jjc ? (jjc) iInterfaceQueryLocalInterface2 : new jja(strongBinder2);
                        }
                        IBinder strongBinder3 = parcel.readStrongBinder();
                        if (strongBinder3 != null) {
                            IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                            jluVar2 = iInterfaceQueryLocalInterface3 instanceof jlu ? (jlu) iInterfaceQueryLocalInterface3 : new jlu(strongBinder3);
                        }
                        cbs.m3403b(parcel);
                        ((jla) this.f34400a).mo3987c(string, (byte[]) jjb.m13305c(jjaVar), (byte[]) jjb.m13305c(jjaVar2), new jlr(jluVar2), nur.f44689a);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel2.writeNoException();
                        int i2 = cbs.f4964a;
                        parcel2.writeInt(1);
                        return true;
                    case 4:
                        String string2 = parcel.readString();
                        IBinder strongBinder4 = parcel.readStrongBinder();
                        if (strongBinder4 == null) {
                            jjaVar3 = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                            jjaVar3 = iInterfaceQueryLocalInterface4 instanceof jjc ? (jjc) iInterfaceQueryLocalInterface4 : new jja(strongBinder4);
                        }
                        IBinder strongBinder5 = parcel.readStrongBinder();
                        if (strongBinder5 == null) {
                            jjaVar4 = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                            jjaVar4 = iInterfaceQueryLocalInterface5 instanceof jjc ? (jjc) iInterfaceQueryLocalInterface5 : new jja(strongBinder5);
                        }
                        IBinder strongBinder6 = parcel.readStrongBinder();
                        if (strongBinder6 == null) {
                            jluVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                            jluVar = iInterfaceQueryLocalInterface6 instanceof jlu ? (jlu) iInterfaceQueryLocalInterface6 : new jlu(strongBinder6);
                        }
                        IBinder strongBinder7 = parcel.readStrongBinder();
                        if (strongBinder7 != null) {
                            IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                            jjaVar5 = iInterfaceQueryLocalInterface7 instanceof jjc ? (jjc) iInterfaceQueryLocalInterface7 : new jja(strongBinder7);
                        }
                        cbs.m3403b(parcel);
                        nur nurVar2 = nur.f44689a;
                        byte[] bArr = (byte[]) jjb.m13305c(jjaVar5);
                        if (bArr != null) {
                            try {
                                nxq nxqVarM18123Q = nxq.m18123Q(nur.f44689a, bArr, 0, bArr.length, nxf.m18011a());
                                nxq.m18132ae(nxqVarM18123Q);
                                nurVar = (nur) nxqVarM18123Q;
                            } catch (nyb e) {
                                new jlr(jluVar).mo13327a(8, e.getMessage());
                            }
                        } else {
                            nurVar = nurVar2;
                        }
                        ((jla) this.f34400a).mo3987c(string2, (byte[]) jjb.m13305c(jjaVar3), (byte[]) jjb.m13305c(jjaVar4), new jlr(jluVar), nurVar);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
        }
    }
}
