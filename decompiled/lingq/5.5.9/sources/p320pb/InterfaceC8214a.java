package p320pb;

import android.os.IBinder;
import android.os.IInterface;
import p455wb.BinderC9896b;

/* JADX INFO: renamed from: pb.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8214a extends IInterface {

    /* JADX INFO: renamed from: pb.a$a */
    public static abstract class a extends BinderC9896b implements InterfaceC8214a {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* JADX INFO: renamed from: j */
        public static InterfaceC8214a m16361j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof InterfaceC8214a ? (InterfaceC8214a) iInterfaceQueryLocalInterface : new C8216c(iBinder);
        }
    }
}
