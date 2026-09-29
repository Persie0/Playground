package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.vision.zzam;

/* JADX INFO: loaded from: classes2.dex */
public final class jmb {

    /* JADX INFO: renamed from: a */
    public final Context f45843a;

    /* JADX INFO: renamed from: g */
    public ahb f45849g;

    /* JADX INFO: renamed from: h */
    public final zzam f45850h;

    /* JADX INFO: renamed from: b */
    public final Object f45844b = new Object();

    /* JADX INFO: renamed from: e */
    public boolean f45847e = false;

    /* JADX INFO: renamed from: f */
    public boolean f45848f = false;

    /* JADX INFO: renamed from: c */
    public final String f45845c = "com.google.android.gms.vision.dynamite.".concat("ocr");

    /* JADX INFO: renamed from: d */
    public final String f45846d = "ocr";

    public jmb(Context context, zzam zzamVar) {
        this.f45843a = context;
        this.f45850h = zzamVar;
        m14535b();
    }

    /* JADX INFO: renamed from: a */
    public final ahb m14534a(ao2 ao2Var, Context context) {
        eib eibVar;
        IBinder iBinderM2955b = ao2Var.m2955b("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
        ahb ahbVar = null;
        if (iBinderM2955b == null) {
            eibVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderM2955b.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
            eibVar = iInterfaceQueryLocalInterface instanceof eib ? (eib) iInterfaceQueryLocalInterface : new eib(iBinderM2955b, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator", 5);
        }
        if (eibVar == null) {
            return null;
        }
        lp6 lp6Var = new lp6(context);
        zzam zzamVar = this.f45850h;
        lda.m16130p(zzamVar);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(eibVar.f51090h);
        int i = iwb.f44718a;
        parcelObtain.writeStrongBinder(lp6Var);
        parcelObtain.writeInt(1);
        zzamVar.writeToParcel(parcelObtain, 0);
        Parcel parcelM16774K = eibVar.m16774K(parcelObtain, 1);
        IBinder strongBinder = parcelM16774K.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            ahbVar = iInterfaceQueryLocalInterface2 instanceof ahb ? (ahb) iInterfaceQueryLocalInterface2 : new ahb(strongBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer", 5);
        }
        parcelM16774K.recycle();
        return ahbVar;
    }

    /* JADX INFO: renamed from: b */
    public final Object m14535b() {
        ao2 ao2VarM2949c;
        synchronized (this.f45844b) {
            ahb ahbVar = this.f45849g;
            if (ahbVar != null) {
                return ahbVar;
            }
            try {
                ao2VarM2949c = ao2.m2949c(this.f45843a, ao2.f7276f, this.f45845c);
            } catch (DynamiteModule$LoadingException unused) {
                String str = "com.google.android.gms.vision." + this.f45846d;
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module ".concat(str));
                }
                try {
                    ao2VarM2949c = ao2.m2949c(this.f45843a, ao2.f7272b, str);
                } catch (DynamiteModule$LoadingException e) {
                    qhd.m19975a(e, "Error loading optional module %s", str);
                    if (!this.f45847e) {
                        String str2 = this.f45846d;
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", "Broadcasting download intent for dependency " + str2);
                        }
                        String str3 = this.f45846d;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str3);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f45843a.sendBroadcast(intent);
                        this.f45847e = true;
                    }
                    ao2VarM2949c = null;
                }
            }
            if (ao2VarM2949c != null) {
                try {
                    this.f45849g = m14534a(ao2VarM2949c, this.f45843a);
                } catch (RemoteException | DynamiteModule$LoadingException e2) {
                    Log.e("TextNativeHandle", "Error creating remote native handle", e2);
                }
            }
            boolean z = this.f45848f;
            if (!z && this.f45849g == null) {
                Log.w("TextNativeHandle", "Native handle not yet available. Reverting to no-op handle.");
                this.f45848f = true;
            } else if (z && this.f45849g != null) {
                Log.w("TextNativeHandle", "Native handle is now available.");
            }
            return this.f45849g;
        }
    }
}
