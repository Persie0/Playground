package p000;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axc implements axa {

    /* JADX INFO: renamed from: a */
    private final WindowLayoutComponent f2631a;

    /* JADX INFO: renamed from: b */
    private final awc f2632b;

    /* JADX INFO: renamed from: c */
    private final ReentrantLock f2633c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    private final Map f2634d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    private final Map f2635e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    private final Map f2636f = new LinkedHashMap();

    public axc(WindowLayoutComponent windowLayoutComponent, awc awcVar) {
        this.f2631a = windowLayoutComponent;
        this.f2632b = awcVar;
    }

    @Override // p000.axa
    /* JADX INFO: renamed from: a */
    public final void mo2078a(Context context, Executor executor, aea aeaVar) {
        oki okiVar;
        awb awbVar;
        ReentrantLock reentrantLock = this.f2633c;
        reentrantLock.lock();
        try {
            axb axbVar = (axb) this.f2634d.get(context);
            if (axbVar != null) {
                axbVar.m2081c(aeaVar);
                this.f2635e.put(aeaVar, context);
                okiVar = oki.f46196a;
            } else {
                okiVar = null;
            }
            if (okiVar == null) {
                axb axbVar2 = new axb(context);
                this.f2634d.put(context, axbVar2);
                this.f2635e.put(aeaVar, context);
                axbVar2.m2081c(aeaVar);
                avu avuVar = new avu(axbVar2, 3);
                int i = awd.f2576a;
                switch (awd.m2071a()) {
                    case 1:
                        awc awcVar = this.f2632b;
                        WindowLayoutComponent windowLayoutComponent = this.f2631a;
                        Object objM2070b = awcVar.m2070b(ooj.m18762a(WindowLayoutInfo.class), avuVar);
                        windowLayoutComponent.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, awcVar.m2069a()).invoke(windowLayoutComponent, context, objM2070b);
                        awbVar = new awb(windowLayoutComponent.getClass().getMethod("removeWindowLayoutInfoListener", awcVar.m2069a()), windowLayoutComponent, objM2070b, 1);
                        break;
                    case 2:
                        awc awcVar2 = this.f2632b;
                        WindowLayoutComponent windowLayoutComponent2 = this.f2631a;
                        Object objM2070b2 = awcVar2.m2070b(ooj.m18762a(WindowLayoutInfo.class), avuVar);
                        windowLayoutComponent2.getClass().getMethod("addWindowLayoutInfoListener", Context.class, awcVar2.m2069a()).invoke(windowLayoutComponent2, context, objM2070b2);
                        awbVar = new awb(windowLayoutComponent2.getClass().getMethod("removeWindowLayoutInfoListener", awcVar2.m2069a()), windowLayoutComponent2, objM2070b2, 0);
                        break;
                    default:
                        axbVar2.mo309a(new WindowLayoutInfo(okv.f46215a));
                        return;
                }
                this.f2636f.put(axbVar2, awbVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.axa
    /* JADX INFO: renamed from: b */
    public final void mo2079b(aea aeaVar) {
        ReentrantLock reentrantLock = this.f2633c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f2635e.get(aeaVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            axb axbVar = (axb) this.f2634d.get(context);
            if (axbVar == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = axbVar.f2627a;
            reentrantLock2.lock();
            try {
                axbVar.f2628b.remove(aeaVar);
                reentrantLock2.unlock();
                this.f2635e.remove(aeaVar);
                if (axbVar.f2628b.isEmpty()) {
                    awa awaVar = (awa) this.f2636f.remove(axbVar);
                    if (awaVar != null) {
                        awaVar.mo2068a();
                    }
                    this.f2634d.remove(context);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
