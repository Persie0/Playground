package com.google.p020vr.cardboard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.p020vr.vrcore.base.api.VrCoreUtils;
import com.google.p020vr.vrcore.library.api.ObjectWrapper;
import p000.cbr;
import p000.cbs;
import p000.lkm;
import p000.oft;
import p000.oga;
import p000.ogw;
import p000.ogx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class VrCoreLibraryLoader {
    public static long loadNativeDlsymMethod(Context context) {
        return 0L;
    }

    public static long loadNativeGvrLibrary(Context context) {
        return loadNativeGvrLibrary(context, oft.f45877b, oft.f45876a);
    }

    public static long loadNativeGvrLibrary(Context context, oft oftVar, oft oftVar2) {
        int i;
        int i2;
        int i3;
        int i4;
        ogw ogwVar;
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
                if (applicationInfo == null) {
                    throw new oga(8);
                }
                if (!applicationInfo.enabled) {
                    throw new oga(2);
                }
                if (applicationInfo.metaData == null) {
                    throw new oga(4);
                }
                String string = applicationInfo.metaData.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
                if (string.isEmpty()) {
                    throw new oga(4);
                }
                String strSubstring = string.substring(1);
                oft oftVarM18470a = oft.m18470a(strSubstring);
                if (oftVarM18470a == null) {
                    throw new oga(4);
                }
                int i5 = oftVarM18470a.f45878c;
                int i6 = oftVar.f45878c;
                if (i5 <= i6 && (i5 < i6 || ((i = oftVarM18470a.f45879d) <= (i2 = oftVar.f45879d) && (i < i2 || ((i3 = oftVarM18470a.f45880e) <= (i4 = oftVar.f45880e) && i3 < i4))))) {
                    Log.w("VrCoreLibraryLoader", String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", strSubstring, oftVar.toString()));
                    throw new oga(4);
                }
                Context contextM15566G = lkm.m15566G(context);
                lkm.m15566G(context);
                int i7 = lkm.f38490a;
                ogx ogxVar = null;
                if (lkm.f38491b == null) {
                    IBinder iBinderM15567H = lkm.m15567H(lkm.m15566G(context).getClassLoader());
                    if (iBinderM15567H == null) {
                        ogwVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM15567H.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                        ogwVar = iInterfaceQueryLocalInterface instanceof ogw ? (ogw) iInterfaceQueryLocalInterface : new ogw(iBinderM15567H);
                    }
                    lkm.f38491b = ogwVar;
                }
                ogw ogwVar2 = lkm.f38491b;
                cbr cbrVarM5207b = ObjectWrapper.m5207b(contextM15566G);
                cbr cbrVarM5207b2 = ObjectWrapper.m5207b(context);
                Parcel parcelM3398a = ogwVar2.m3398a();
                cbs.m3405d(parcelM3398a, cbrVarM5207b);
                cbs.m3405d(parcelM3398a, cbrVarM5207b2);
                Parcel parcelM3399y = ogwVar2.m3399y(4, parcelM3398a);
                IBinder strongBinder = parcelM3399y.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
                    ogxVar = iInterfaceQueryLocalInterface2 instanceof ogx ? (ogx) iInterfaceQueryLocalInterface2 : new ogx(strongBinder);
                }
                parcelM3399y.recycle();
                if (ogxVar == null) {
                    Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore: no library loader available.");
                    return 0L;
                }
                if (i7 >= 19) {
                    String string2 = oftVar.toString();
                    String string3 = oftVar2.toString();
                    Parcel parcelM3398a2 = ogxVar.m3398a();
                    parcelM3398a2.writeString(string2);
                    parcelM3398a2.writeString(string3);
                    Parcel parcelM3399y2 = ogxVar.m3399y(5, parcelM3398a2);
                    long j = parcelM3399y2.readLong();
                    parcelM3399y2.recycle();
                    return j;
                }
                int i8 = oftVar2.f45878c;
                int i9 = oftVar2.f45879d;
                int i10 = oftVar2.f45880e;
                Parcel parcelM3398a3 = ogxVar.m3398a();
                parcelM3398a3.writeInt(i8);
                parcelM3398a3.writeInt(i9);
                parcelM3398a3.writeInt(i10);
                Parcel parcelM3399y3 = ogxVar.m3399y(2, parcelM3398a3);
                long j2 = parcelM3399y3.readLong();
                parcelM3399y3.recycle();
                return j2;
            } catch (PackageManager.NameNotFoundException e) {
                throw new oga(VrCoreUtils.m5191a(context));
            }
        } catch (RemoteException e2) {
            e = e2;
            Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore:\n  ".concat(e.toString()));
            return 0L;
        } catch (IllegalArgumentException e3) {
            e = e3;
            Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore:\n  ".concat(e.toString()));
            return 0L;
        } catch (IllegalStateException e4) {
            e = e4;
            Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore:\n  ".concat(e.toString()));
            return 0L;
        } catch (SecurityException e5) {
            e = e5;
            Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore:\n  ".concat(e.toString()));
            return 0L;
        } catch (UnsatisfiedLinkError e6) {
            e = e6;
            Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore:\n  ".concat(e.toString()));
            return 0L;
        } catch (oga e7) {
            e = e7;
            Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore:\n  ".concat(e.toString()));
            return 0L;
        }
    }
}
