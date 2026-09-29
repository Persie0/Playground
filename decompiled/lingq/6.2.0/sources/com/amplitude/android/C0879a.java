package com.amplitude.android;

import android.app.Application;
import android.content.Context;
import com.amplitude.android.migration.C0892b;
import com.amplitude.android.plugins.C0895b;
import com.amplitude.android.plugins.C0896c;
import com.amplitude.android.storage.StorageVersion;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.platform.plugins.C0910a;
import com.amplitude.core.remoteconfig.C0912a;
import com.amplitude.p007id.C0916a;
import com.amplitude.p007id.IdentityUpdateType;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC3192a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C2926df;
import p000.C3145jf;
import p000.C3296lf;
import p000.C3386nv;
import p000.C3409oh;
import p000.C3600t6;
import p000.cs4;
import p000.fa4;
import p000.gz3;
import p000.iz3;
import p000.jz3;
import p000.kz3;
import p000.ll3;
import p000.r46;
import p000.sq5;
import p000.t50;
import p000.ui3;
import p000.v84;
import p000.vl1;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.xfa;
import p000.y92;
import p000.yu2;

/* JADX INFO: renamed from: com.amplitude.android.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0879a extends AbstractC0903a {

    /* JADX INFO: renamed from: r */
    public final cs4 f10785r;

    /* JADX INFO: renamed from: s */
    public C3600t6 f10786s;

    /* JADX INFO: renamed from: t */
    public C3409oh f10787t;

    public C0879a(final C0880b c0880b) {
        sq5 sq5Var = new sq5(14);
        vl1 vl1VarM23619a = vz1.m23619a(r46.m20384i());
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        executorServiceNewCachedThreadPool.getClass();
        yu2 yu2Var = new yu2(executorServiceNewCachedThreadPool);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        yu2 yu2Var2 = new yu2(executorServiceNewSingleThreadExecutor);
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor2.getClass();
        super(c0880b, sq5Var, vl1VarM23619a, yu2Var, yu2Var2, new yu2(executorServiceNewSingleThreadExecutor2));
        this.f10785r = AbstractC3192a.m15356a(new ui3() { // from class: com.amplitude.android.Amplitude$autocaptureManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0880b c0880b2 = c0880b;
                Set set = c0880b2.f10809v;
                v84 v84Var = c0880b2.f10805r;
                boolean z = c0880b2.f10807t;
                C0879a c0879a = this;
                return new t50(set, v84Var, z ? (C0912a) c0879a.f11031p.getValue() : null, c0879a.m5113g(), c0879a.m5110d());
            }
        });
        try {
            Runtime.getRuntime().addShutdownHook(new C2926df(this, 0));
        } catch (IllegalStateException unused) {
        }
        Context context = c0880b.f10789b;
        context.getClass();
        Application application = (Application) context;
        C3600t6 c3600t6 = this.f10786s;
        if (c3600t6 != null) {
            application.registerActivityLifecycleCallbacks(c3600t6);
        } else {
            fa4.m11636J("activityLifecycleCallbacks");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public static Object m5059m(C0879a c0879a, iz3 iz3Var, ContinuationImpl continuationImpl) throws Throwable {
        Amplitude$buildInternal$1 amplitude$buildInternal$1;
        jz3 jz3Var;
        if (continuationImpl instanceof Amplitude$buildInternal$1) {
            amplitude$buildInternal$1 = (Amplitude$buildInternal$1) continuationImpl;
            int i = amplitude$buildInternal$1.f10755e;
            if ((i & Integer.MIN_VALUE) != 0) {
                amplitude$buildInternal$1.f10755e = i - Integer.MIN_VALUE;
            } else {
                amplitude$buildInternal$1 = new Amplitude$buildInternal$1(c0879a, continuationImpl);
            }
        } else {
            amplitude$buildInternal$1 = new Amplitude$buildInternal$1(c0879a, continuationImpl);
        }
        Object obj = amplitude$buildInternal$1.f10753c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = amplitude$buildInternal$1.f10755e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            C0892b c0892b = new C0892b(c0879a);
            amplitude$buildInternal$1.f10751a = c0879a;
            amplitude$buildInternal$1.f10752b = iz3Var;
            amplitude$buildInternal$1.f10755e = 1;
            Object obj2 = xfa.f68157a;
            int i3 = c0892b.f10932d;
            StorageVersion storageVersion = StorageVersion.V3;
            if (i3 < storageVersion.getRawValue()) {
                c0892b.f10931c.mo16256b("Migrating storage to version " + storageVersion.getRawValue());
                Object objM5081a = c0892b.m5081a(amplitude$buildInternal$1);
                if (objM5081a == coroutineSingletons) {
                    obj2 = objM5081a;
                }
            } else {
                c0879a.m5113g().mo16256b("Storage already at version " + storageVersion.getRawValue());
            }
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iz3Var = amplitude$buildInternal$1.f10752b;
            c0879a = amplitude$buildInternal$1.f10751a;
            AbstractC3193b.m15359b(obj);
        }
        c0879a.getClass();
        iz3Var.getClass();
        synchronized (jz3.f46417b) {
            try {
                LinkedHashMap linkedHashMap = jz3.f46418c;
                String str = iz3Var.f44797a;
                Object jz3Var2 = linkedHashMap.get(str);
                if (jz3Var2 == null) {
                    jz3Var2 = new jz3(iz3Var);
                    linkedHashMap.put(str, jz3Var2);
                }
                jz3Var = (jz3) jz3Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        w41 w41Var = c0879a.f11029n;
        C0916a c0916a = jz3Var.f46419a;
        w41Var.getClass();
        c0916a.getClass();
        synchronized (w41Var.f66366b) {
            try {
                w41Var.f66367c = c0916a;
                gz3 gz3VarM5171a = c0916a.m5171a();
                kz3 kz3Var = (kz3) w41Var.f66368d;
                Object obj3 = gz3VarM5171a.f41547a;
                if (kz3Var != null) {
                    obj3 = kz3Var.f48794a;
                }
                String str2 = (String) obj3;
                kz3 kz3Var2 = (kz3) w41Var.f66369e;
                Object obj4 = gz3VarM5171a.f41548b;
                if (kz3Var2 != null) {
                    obj4 = kz3Var2.f48794a;
                }
                String str3 = (String) obj4;
                ((sq5) w41Var.f66365a).m21554C(str2);
                ((sq5) w41Var.f66365a).m21553B(str3);
                String str4 = c0916a.m5171a().f41547a;
                c0916a.m5172b(new gz3(str2, str3), IdentityUpdateType.Updated);
                w41Var.f66368d = null;
                w41Var.f66369e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!fa4.m11650l(c0879a.f11016a.f10804q, null)) {
            c0879a.m5108a(new C0896c());
        }
        C3409oh c3409oh = c0879a.f10787t;
        if (c3409oh == null) {
            fa4.m11636J("androidContextPlugin");
            throw null;
        }
        c0879a.m5108a(c3409oh);
        c0879a.m5108a(new ll3());
        C3600t6 c3600t6 = c0879a.f10786s;
        if (c3600t6 == null) {
            fa4.m11636J("activityLifecycleCallbacks");
            throw null;
        }
        c0879a.m5108a(new C0895b(c3600t6));
        c0879a.m5108a(new C3145jf());
        c0879a.m5108a(new C3296lf(0));
        c0879a.m5108a(new C0910a());
        C0882d c0882d = c0879a.f11022g;
        c0882d.getClass();
        AbstractC0903a abstractC0903aM12113t = c0882d.m12113t();
        wfb.m23926u(abstractC0903aM12113t.f11018c, abstractC0903aM12113t.f11021f, null, new Timeline$start$1$1(abstractC0903aM12113t, c0882d, null), 2);
        return xfa.f68157a;
    }

    @Override // com.amplitude.core.AbstractC0903a
    /* JADX INFO: renamed from: b */
    public final y92 mo5060b() {
        this.f10786s = new C3600t6(0);
        this.f10787t = new C3409oh();
        return super.mo5060b();
    }
}
