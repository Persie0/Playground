package dagger.hilt.android.lifecycle;

import p000.nt3;
import p000.p56;
import p000.qr1;
import p000.vi3;
import p000.wta;

/* JADX INFO: renamed from: dagger.hilt.android.lifecycle.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2921a {
    /* JADX INFO: renamed from: a */
    public static final p56 m10257a(qr1 qr1Var, final vi3 vi3Var) {
        qr1Var.getClass();
        vi3Var.getClass();
        p56 p56Var = new p56(qr1Var);
        p56Var.f58099a.put(nt3.f53233d, new vi3() { // from class: dagger.hilt.android.lifecycle.HiltViewModelExtensions$addCreationCallback$1$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                return (wta) vi3Var.invoke(obj);
            }
        });
        return p56Var;
    }
}
