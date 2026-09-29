package sj;

import androidx.appcompat.app.ActivityC0216c;
import androidx.view.C1042k0;
import dagger.hilt.android.internal.managers.C5114a;
import ml.C7634a;
import ml.C7636c;
import p385sf.C9000b;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: sj.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractActivityC9049h extends ActivityC0216c implements InterfaceC8405b {

    /* JADX INFO: renamed from: T */
    public volatile C5114a f47328T;

    /* JADX INFO: renamed from: U */
    public final Object f47329U = new Object();

    /* JADX INFO: renamed from: V */
    public boolean f47330V = false;

    public AbstractActivityC9049h() {
        m787I(new C9048g(this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        if (this.f47328T == null) {
            synchronized (this.f47329U) {
                if (this.f47328T == null) {
                    this.f47328T = new C5114a(this);
                }
            }
        }
        return this.f47328T.mo469d();
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
