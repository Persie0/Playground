package p000;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jre extends jij {
    public static final Parcelable.Creator CREATOR = new jny(19);

    /* JADX INFO: renamed from: a */
    public final jtc f34641a;

    /* JADX INFO: renamed from: b */
    public final IntentFilter[] f34642b;

    /* JADX INFO: renamed from: c */
    public final String f34643c;

    /* JADX INFO: renamed from: d */
    public final String f34644d;

    public jre(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.f34641a = iInterfaceQueryLocalInterface instanceof jtc ? (jtc) iInterfaceQueryLocalInterface : new jta(iBinder);
        } else {
            this.f34641a = null;
        }
        this.f34642b = intentFilterArr;
        this.f34643c = str;
        this.f34644d = str2;
    }

    public jre(jug jugVar) {
        this.f34641a = jugVar;
        this.f34642b = jugVar.f34827b;
        this.f34643c = null;
        this.f34644d = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jtc jtcVar = this.f34641a;
        jiy.m13292s(parcel, 2, jtcVar == null ? null : jtcVar.asBinder());
        jiy.m13299z(parcel, 3, this.f34642b, i);
        jiy.m13296w(parcel, 4, this.f34643c);
        jiy.m13296w(parcel, 5, this.f34644d);
        jiy.m13283j(parcel, iM13281h);
    }
}
