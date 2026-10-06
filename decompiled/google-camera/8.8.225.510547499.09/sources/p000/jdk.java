package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdk extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(11);

    /* JADX INFO: renamed from: a */
    public final String f33794a;

    /* JADX INFO: renamed from: b */
    public final boolean f33795b;

    /* JADX INFO: renamed from: c */
    public final boolean f33796c;

    /* JADX INFO: renamed from: d */
    private final jhr f33797d;

    public jdk(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f33794a = str;
        jde jdeVar = null;
        if (iBinder != null) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                jjc jjcVarMo13188f = (iInterfaceQueryLocalInterface instanceof jhs ? (jhs) iInterfaceQueryLocalInterface : new jhq(iBinder)).mo13188f();
                byte[] bArr = jjcVarMo13188f == null ? null : (byte[]) jjb.m13305c(jjcVarMo13188f);
                if (bArr != null) {
                    jdeVar = new jde(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f33797d = jdeVar;
        this.f33795b = z;
        this.f33796c = z2;
    }

    public jdk(String str, jhr jhrVar, boolean z, boolean z2) {
        this.f33794a = str;
        this.f33797d = jhrVar;
        this.f33795b = z;
        this.f33796c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 1, this.f33794a);
        jhr jhrVar = this.f33797d;
        if (jhrVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            jhrVar = null;
        }
        jiy.m13292s(parcel, 2, jhrVar);
        jiy.m13284k(parcel, 3, this.f33795b);
        jiy.m13284k(parcel, 4, this.f33796c);
        jiy.m13283j(parcel, iM13281h);
    }
}
