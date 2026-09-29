package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.zzt;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o6d {

    /* JADX INFO: renamed from: a */
    public static final dwb f53914a;

    /* JADX INFO: renamed from: b */
    public static final dwb f53915b;

    /* JADX INFO: renamed from: c */
    public static volatile jhb f53916c;

    /* JADX INFO: renamed from: d */
    public static final Object f53917d;

    /* JADX INFO: renamed from: e */
    public static Context f53918e;

    static {
        new dwb(0, fnc.m11962I("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new dwb(1, fnc.m11962I("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new dwb(2, fnc.m11962I("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new dwb(3, fnc.m11962I("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f53914a = new dwb(4, fnc.m11962I("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f53915b = new dwb(5, fnc.m11962I("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f53917d = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static void m17827a() {
        jhb igbVar;
        if (f53916c != null) {
            return;
        }
        lda.m16130p(f53918e);
        synchronized (f53917d) {
            try {
                if (f53916c == null) {
                    IBinder iBinderM2955b = ao2.m2949c(f53918e, ao2.f7275e, "com.google.android.gms.googlecertificates").m2955b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = xgb.f68190g;
                    if (iBinderM2955b == null) {
                        igbVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM2955b.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        igbVar = iInterfaceQueryLocalInterface instanceof jhb ? (jhb) iInterfaceQueryLocalInterface : new igb(iBinderM2955b, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 3);
                    }
                    f53916c = igbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static wmd m17828b(String str, src srcVar, boolean z, boolean z2) {
        try {
            m17827a();
            lda.m16130p(f53918e);
            zzt zztVar = new zzt(str, srcVar, z, z2);
            try {
                jhb jhbVar = f53916c;
                lp6 lp6Var = new lp6(f53918e.getPackageManager());
                igb igbVar = (igb) jhbVar;
                Parcel parcelM16773J = igbVar.m16773J();
                int i = zrb.f72016a;
                boolean z3 = true;
                parcelM16773J.writeInt(1);
                zztVar.writeToParcel(parcelM16773J, 0);
                zrb.m25757b(parcelM16773J, lp6Var);
                Parcel parcelM16771H = igbVar.m16771H(parcelM16773J, 5);
                if (parcelM16771H.readInt() == 0) {
                    z3 = false;
                }
                parcelM16771H.recycle();
                return z3 ? wmd.f67075d : new hmd(new uvc(z, str, srcVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return wmd.m24061h("module call", e);
            }
        } catch (DynamiteModule$LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return wmd.m24061h("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }
}
