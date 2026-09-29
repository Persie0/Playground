package p176ib;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.AbstractBinderC2564p;
import p320pb.InterfaceC8214a;
import p455wb.BinderC9896b;
import p455wb.C9897c;

/* JADX INFO: renamed from: ib.e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC6265e1 extends BinderC9896b implements InterfaceC6269g0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f36461a = 0;

    public AbstractBinderC6265e1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // p455wb.BinderC9896b
    /* JADX INFO: renamed from: h */
    public final boolean mo12899h(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            InterfaceC8214a interfaceC8214aMo7614a = ((AbstractBinderC2564p) this).mo7614a();
            parcel2.writeNoException();
            C9897c.m18404c(parcel2, interfaceC8214aMo7614a);
        } else {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(((AbstractBinderC2564p) this).f13991b);
        }
        return true;
    }
}
