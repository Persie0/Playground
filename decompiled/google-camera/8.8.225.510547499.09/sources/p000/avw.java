package p000;

import android.app.Activity;
import androidx.window.extensions.area.WindowAreaComponent;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avw implements avs {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f2556e = 0;

    /* JADX INFO: renamed from: b */
    public final WindowAreaComponent f2557b;

    /* JADX INFO: renamed from: c */
    public Consumer f2558c;

    /* JADX INFO: renamed from: d */
    public avx f2559d;

    static {
        ooj.m18762a(avw.class).mo18731b();
    }

    public avw(WindowAreaComponent windowAreaComponent) {
        this.f2557b = windowAreaComponent;
    }

    @Override // p000.avs
    /* JADX INFO: renamed from: a */
    public final our mo2061a() {
        return ova.m19084a(ook.m18783U(new avv(this, null)));
    }

    @Override // p000.avs
    /* JADX INFO: renamed from: b */
    public final void mo2062b(Activity activity, Executor executor, eno enoVar) throws Throwable {
        avx avxVar = this.f2559d;
        if (avxVar != null && !ooc.m18737c(avxVar, avx.f2562c)) {
            throw avr.f2544a;
        }
        this.f2558c = new avt(enoVar, this.f2557b);
        ClassLoader classLoader = avw.class.getClassLoader();
        if (classLoader != null) {
            awc awcVar = new awc(classLoader);
            try {
                WindowAreaComponent windowAreaComponent = this.f2557b;
                windowAreaComponent.getClass().getMethod("startRearDisplaySession", Activity.class, awcVar.m2069a()).invoke(windowAreaComponent, activity, awcVar.m2070b(ooj.m18762a(Integer.TYPE), new avu(this, 0)));
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e;
            }
        }
    }
}
