package p152hb;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C2557c;
import com.google.android.gms.common.internal.InterfaceC2556b;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import p176ib.C6272i;

/* JADX INFO: renamed from: hb.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5950a0 extends AbstractC5984k0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5966e0 f35411b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zak f35412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5950a0(C5966e0 c5966e0, C5966e0 c5966e1, zak zakVar) {
        super(c5966e0);
        this.f35411b = c5966e1;
        this.f35412c = zakVar;
    }

    @Override // p152hb.AbstractC5984k0
    /* JADX INFO: renamed from: a */
    public final void mo12385a() {
        InterfaceC2556b c2557c;
        C5966e0 c5966e0 = this.f35411b;
        boolean z10 = false;
        if (c5966e0.m12420n(0)) {
            zak zakVar = this.f35412c;
            ConnectionResult connectionResult = zakVar.f14658b;
            if (!connectionResult.m7529C()) {
                if (c5966e0.f35474l && !connectionResult.m7530q()) {
                    z10 = true;
                }
                if (!z10) {
                    c5966e0.m12417k(connectionResult);
                    return;
                } else {
                    c5966e0.m12414h();
                    c5966e0.m12419m();
                    return;
                }
            }
            zav zavVar = zakVar.f14659c;
            C6272i.m12915i(zavVar);
            ConnectionResult connectionResult2 = zavVar.f13977c;
            if (!connectionResult2.m7529C()) {
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                c5966e0.m12417k(connectionResult2);
                return;
            }
            c5966e0.f35476n = true;
            IBinder iBinder = zavVar.f13976b;
            if (iBinder == null) {
                c2557c = null;
            } else {
                int i10 = InterfaceC2556b.a.f13970a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c2557c = iInterfaceQueryLocalInterface instanceof InterfaceC2556b ? (InterfaceC2556b) iInterfaceQueryLocalInterface : new C2557c(iBinder);
            }
            C6272i.m12915i(c2557c);
            c5966e0.f35477o = c2557c;
            c5966e0.f35478p = zavVar.f13978d;
            c5966e0.f35479q = zavVar.f13979e;
            c5966e0.m12419m();
        }
    }
}
