package p176ib;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.dynamic.RemoteCreator;
import p320pb.BinderC8215b;

/* JADX INFO: renamed from: ib.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6264e0 extends RemoteCreator<C6304y> {

    /* JADX INFO: renamed from: c */
    public static final C6264e0 f36460c = new C6264e0();

    /* JADX INFO: renamed from: c */
    public static View m12898c(int i10, Context context, int i11) throws RemoteCreator.RemoteCreatorException {
        C6264e0 c6264e0 = f36460c;
        try {
            zax zaxVar = new zax(1, i10, i11, null);
            return (View) BinderC8215b.m16362h0(c6264e0.m7623b(context).m12934j(new BinderC8215b(context), zaxVar));
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("Could not get button with size ");
            sb2.append(i10);
            sb2.append(" and color ");
            sb2.append(i11);
            throw new RemoteCreator.RemoteCreatorException(sb2.toString(), e10);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6304y mo7622a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof C6304y ? (C6304y) iInterfaceQueryLocalInterface : new C6304y(iBinder);
    }
}
