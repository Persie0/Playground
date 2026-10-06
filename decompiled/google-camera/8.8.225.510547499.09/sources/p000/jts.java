package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jts extends jij {
    public static final Parcelable.Creator CREATOR = new jtt(0);

    /* JADX INFO: renamed from: a */
    final int f34796a;

    /* JADX INFO: renamed from: b */
    public final jtc f34797b;

    public jts(int i, IBinder iBinder) {
        jtc jtaVar;
        this.f34796a = i;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(VzWFSVj.mcoJC);
            jtaVar = iInterfaceQueryLocalInterface instanceof jtc ? (jtc) iInterfaceQueryLocalInterface : new jta(iBinder);
        } else {
            jtaVar = null;
        }
        this.f34797b = jtaVar;
    }

    public jts(jtc jtcVar) {
        this.f34796a = 1;
        this.f34797b = jtcVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34796a);
        jtc jtcVar = this.f34797b;
        jiy.m13292s(parcel, 2, jtcVar == null ? null : jtcVar.asBinder());
        jiy.m13283j(parcel, iM13281h);
    }
}
