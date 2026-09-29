package p302oi;

import androidx.appcompat.app.ActivityC0216c;
import androidx.view.C1042k0;
import dagger.hilt.android.internal.managers.C5114a;
import ml.C7634a;
import ml.C7636c;
import p385sf.C9000b;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: oi.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC8051b extends ActivityC0216c implements InterfaceC8405b {

    /* JADX INFO: renamed from: T */
    public volatile C5114a f43734T;

    /* JADX INFO: renamed from: U */
    public final Object f43735U = new Object();

    /* JADX INFO: renamed from: V */
    public boolean f43736V = false;

    public AbstractActivityC8051b() {
        m787I(new C8050a(this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        if (this.f43734T == null) {
            synchronized (this.f43735U) {
                if (this.f43734T == null) {
                    this.f43734T = new C5114a(this);
                }
            }
        }
        return this.f43734T.mo469d();
    }

    @Override // androidx.activity.ComponentActivity, androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: i */
    public final C1042k0.b mo470i() {
        C1042k0.b bVarMo470i = super.mo470i();
        C7634a.c cVarMo15082a = ((C7634a.a) C9000b.m17245k(C7634a.a.class, this)).mo15082a();
        cVarMo15082a.getClass();
        bVarMo470i.getClass();
        return new C7636c(cVarMo15082a.f42038a, bVarMo470i, cVarMo15082a.f42039b);
    }
}
