package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.cn8;
import p000.do7;
import p000.eh0;

/* JADX INFO: renamed from: kotlinx.coroutines.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3209b extends cn8 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f47763g = AtomicIntegerFieldUpdater.newUpdater(C3209b.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p000.cn8, kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: t */
    public final void mo4900t(Object obj) throws DispatchException {
        mo4901v(obj);
    }

    @Override // p000.cn8, kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: v */
    public final void mo4901v(Object obj) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f47763g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    C3386nv.m17633t("Already resumed");
                    return;
                } else {
                    eh0.m11116M(do7.m10550z(obj), AbstractC3584sr.m21600K(this.f10336f));
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
