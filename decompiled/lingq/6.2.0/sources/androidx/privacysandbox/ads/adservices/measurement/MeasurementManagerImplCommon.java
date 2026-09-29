package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.AbstractC0478a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.AbstractC3584sr;
import p000.ExecutorC3014fu;
import p000.bb2;
import p000.de9;
import p000.h3b;
import p000.i3b;
import p000.sm0;
import p000.tob;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MeasurementManagerImplCommon extends tob {

    /* JADX INFO: renamed from: b */
    public final MeasurementManager f6557b;

    public MeasurementManagerImplCommon(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.f6557b = measurementManager;
    }

    /* JADX INFO: renamed from: e */
    public static Object m2582e(MeasurementManagerImplCommon measurementManagerImplCommon, bb2 bb2Var, Continuation<? super xfa> continuation) {
        new sm0(1, AbstractC3584sr.m21600K(continuation)).m21468u();
        MeasurementManager measurementManager = measurementManagerImplCommon.f6557b;
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static Object m2583f(MeasurementManagerImplCommon measurementManagerImplCommon, Continuation<? super Integer> continuation) {
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        measurementManagerImplCommon.f6557b.getMeasurementApiStatus(new ExecutorC3014fu(1), AbstractC0478a.m1998a(sm0Var));
        Object objM21466r = sm0Var.m21466r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM21466r;
    }

    /* JADX INFO: renamed from: h */
    public static Object m2584h(MeasurementManagerImplCommon measurementManagerImplCommon, de9 de9Var, Continuation<? super xfa> continuation) {
        Object objM23649s = vz1.m23649s(new MeasurementManagerImplCommon$registerSource$4(measurementManagerImplCommon, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }

    /* JADX INFO: renamed from: i */
    public static Object m2585i(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, Continuation<? super xfa> continuation) {
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        measurementManagerImplCommon.f6557b.registerSource(uri, inputEvent, new ExecutorC3014fu(1), AbstractC0478a.m1998a(sm0Var));
        Object objM21466r = sm0Var.m21466r();
        return objM21466r == CoroutineSingletons.COROUTINE_SUSPENDED ? objM21466r : xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    public static Object m2586j(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, Continuation<? super xfa> continuation) {
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        measurementManagerImplCommon.f6557b.registerTrigger(uri, new ExecutorC3014fu(1), AbstractC0478a.m1998a(sm0Var));
        Object objM21466r = sm0Var.m21466r();
        return objM21466r == CoroutineSingletons.COROUTINE_SUSPENDED ? objM21466r : xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    public static Object m2587l(MeasurementManagerImplCommon measurementManagerImplCommon, h3b h3bVar, Continuation<? super xfa> continuation) {
        new sm0(1, AbstractC3584sr.m21600K(continuation)).m21468u();
        MeasurementManager measurementManager = measurementManagerImplCommon.f6557b;
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public static Object m2588n(MeasurementManagerImplCommon measurementManagerImplCommon, i3b i3bVar, Continuation<? super xfa> continuation) {
        new sm0(1, AbstractC3584sr.m21600K(continuation)).m21468u();
        MeasurementManager measurementManager = measurementManagerImplCommon.f6557b;
        throw null;
    }

    @Override // p000.tob
    /* JADX INFO: renamed from: a */
    public Object mo2589a(Continuation<? super Integer> continuation) {
        return m2583f(this, continuation);
    }

    @Override // p000.tob
    /* JADX INFO: renamed from: b */
    public Object mo2590b(Uri uri, InputEvent inputEvent, Continuation<? super xfa> continuation) {
        return m2585i(this, uri, inputEvent, continuation);
    }

    @Override // p000.tob
    /* JADX INFO: renamed from: c */
    public Object mo2591c(Uri uri, Continuation<? super xfa> continuation) {
        return m2586j(this, uri, continuation);
    }

    /* JADX INFO: renamed from: d */
    public Object m2592d(bb2 bb2Var, Continuation<? super xfa> continuation) {
        return m2582e(this, bb2Var, continuation);
    }

    /* JADX INFO: renamed from: g */
    public Object m2593g(de9 de9Var, Continuation<? super xfa> continuation) {
        return m2584h(this, de9Var, continuation);
    }

    /* JADX INFO: renamed from: k */
    public Object m2594k(h3b h3bVar, Continuation<? super xfa> continuation) {
        return m2587l(this, h3bVar, continuation);
    }

    /* JADX INFO: renamed from: m */
    public Object m2595m(i3b i3bVar, Continuation<? super xfa> continuation) {
        return m2588n(this, i3bVar, continuation);
    }
}
