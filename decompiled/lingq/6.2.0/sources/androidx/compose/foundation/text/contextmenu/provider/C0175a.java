package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.C0145m;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.text.contextmenu.provider.C0175a;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.dt9;
import p000.kt9;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.x18;
import p000.xc9;
import p000.xfa;
import p000.ye1;
import p000.za0;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0175a implements kt9 {

    /* JADX INFO: renamed from: a */
    public final C0282a f2887a;

    /* JADX INFO: renamed from: b */
    public final C0145m f2888b = new C0145m();

    /* JADX INFO: renamed from: c */
    public final t66 f2889c = AbstractC0278f.m1260j(null);

    public C0175a(C0282a c0282a) {
        this.f2887a = c0282a;
    }

    @Override // p000.kt9
    /* JADX INFO: renamed from: a */
    public final Object mo1064a(dt9 dt9Var, SuspendLambda suspendLambda) {
        Object objM1026b = this.f2888b.m1026b(MutatePriority.Default, new BasicTextContextMenuProvider$showTextContextMenu$2(this, new za0(dt9Var), null), suspendLambda);
        return objM1026b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1026b : xfa.f68157a;
    }

    /* JADX INFO: renamed from: b */
    public final void m1067b(final int i, ye1 ye1Var, final ui3 ui3Var) {
        final ui3 ui3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(723898654);
        int i2 = (tj3Var.m22120g(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            za0 za0Var = (za0) ((xc9) this.f2889c).getValue();
            if (za0Var == null) {
                x18 x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3(this, ui3Var, i, i3) { // from class: ya0

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ int f69537a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C0175a f69538b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ ui3 f69539c;

                        {
                            this.f69537a = i3;
                            this.f69538b = this;
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.f69537a;
                            xfa xfaVar = xfa.f68157a;
                            ui3 ui3Var3 = this.f69539c;
                            C0175a c0175a = this.f69538b;
                            ye1 ye1Var2 = (ye1) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c0175a.m1067b(pk9.m19383z(7), ye1Var2, ui3Var3);
                                    break;
                                default:
                                    c0175a.m1067b(pk9.m19383z(7), ye1Var2, ui3Var3);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    return;
                }
                return;
            }
            ui3Var2 = ui3Var;
            this.f2887a.mo1291i(za0Var, za0Var.f71248a, ui3Var2, tj3Var, 384);
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new zi3(this, ui3Var2, i, i4) { // from class: ya0

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f69537a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0175a f69538b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ui3 f69539c;

                {
                    this.f69537a = i4;
                    this.f69538b = this;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f69537a;
                    xfa xfaVar = xfa.f68157a;
                    ui3 ui3Var3 = this.f69539c;
                    C0175a c0175a = this.f69538b;
                    ye1 ye1Var2 = (ye1) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c0175a.m1067b(pk9.m19383z(7), ye1Var2, ui3Var3);
                            break;
                        default:
                            c0175a.m1067b(pk9.m19383z(7), ye1Var2, ui3Var3);
                            break;
                    }
                    return xfaVar;
                }
            };
        }
    }
}
