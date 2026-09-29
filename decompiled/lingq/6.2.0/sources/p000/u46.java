package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes2.dex */
public final class u46 extends Binder implements ay3 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MultiInstanceInvalidationService f63402f;

    public u46(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f63402f = multiInstanceInvalidationService;
        attachInterface(this, ay3.f7661d);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        v46 v46Var;
        String str = ay3.f7661d;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        zx3 zx3Var = null;
        zx3 zx3Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(zx3.f72336c);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zx3)) {
                    yx3 yx3Var = new yx3();
                    yx3Var.f70616f = strongBinder;
                    zx3Var = yx3Var;
                } else {
                    zx3Var = (zx3) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            zx3Var.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f63402f;
                synchronized (multiInstanceInvalidationService.f6725c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f6723a + 1;
                        multiInstanceInvalidationService.f6723a = i4;
                        if (multiInstanceInvalidationService.f6725c.register(zx3Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f6724b.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f6723a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(zx3.f72336c);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof zx3)) {
                    yx3 yx3Var2 = new yx3();
                    yx3Var2.f70616f = strongBinder2;
                    zx3Var2 = yx3Var2;
                } else {
                    zx3Var2 = (zx3) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            zx3Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f63402f;
            synchronized (multiInstanceInvalidationService2.f6725c) {
                multiInstanceInvalidationService2.f6725c.unregister(zx3Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f63402f;
        synchronized (multiInstanceInvalidationService3.f6725c) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.f6724b.get(Integer.valueOf(i6));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = multiInstanceInvalidationService3.f6725c.beginBroadcast();
                    while (true) {
                        v46Var = multiInstanceInvalidationService3.f6725c;
                        if (i3 >= iBeginBroadcast) {
                            break;
                        }
                        try {
                            Object broadcastCookie = v46Var.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f6724b.get(num);
                            if (i6 != iIntValue && str2.equals(str3)) {
                                try {
                                    ((zx3) multiInstanceInvalidationService3.f6725c.getBroadcastItem(i3)).mo25371f(strArrCreateStringArray);
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.f6725c.finishBroadcast();
                            throw th2;
                        }
                    }
                    v46Var.finishBroadcast();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
