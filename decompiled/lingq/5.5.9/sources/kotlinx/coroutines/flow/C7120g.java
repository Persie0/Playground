package kotlinx.coroutines.flow;

import cm.InterfaceC2057q;
import dm.C5206f;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC7125a;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7818b1;
import no.C7832g0;
import no.C7848l1;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p325po.InterfaceC8428d;
import p349qo.C8656b;
import p393t6.C9213c;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7120g {

    /* JADX INFO: renamed from: a */
    public static final C7168r f40283a = new C7168r("NONE");

    /* JADX INFO: renamed from: b */
    public static final C7168r f40284b = new C7168r("PENDING");

    /* JADX INFO: renamed from: a */
    public static final StateFlowImpl m14379a(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            obj2 = C5206f.f33272g;
        }
        return new StateFlowImpl(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: b */
    public static final Object m14380b(C7145z c7145z, InterfaceC2057q interfaceC2057q, Throwable th2, InterfaceC9968c interfaceC9968c) throws Throwable {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (interfaceC9968c instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) interfaceC9968c;
            int i10 = flowKt__EmittersKt$invokeSafely$1.f40089f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.f40089f = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(interfaceC9968c);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(interfaceC9968c);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.f40088e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = flowKt__EmittersKt$invokeSafely$1.f40089f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                flowKt__EmittersKt$invokeSafely$1.f40087d = th2;
                flowKt__EmittersKt$invokeSafely$1.f40089f = 1;
                if (interfaceC2057q.mo1343M(c7145z, th2, flowKt__EmittersKt$invokeSafely$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = flowKt__EmittersKt$invokeSafely$1.f40087d;
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                C8656b.m16899g(th3, th2);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C9213c m14381c(InterfaceC7116c interfaceC7116c, int i10) {
        AbstractC7125a abstractC7125a;
        InterfaceC7116c interfaceC7116cMo14375g;
        InterfaceC8428d.f45562D.getClass();
        int i11 = InterfaceC8428d.a.f45564b;
        if (i10 >= i11) {
            i11 = i10;
        }
        int i12 = i11 - i10;
        if (!(interfaceC7116c instanceof AbstractC7125a) || (interfaceC7116cMo14375g = (abstractC7125a = (AbstractC7125a) interfaceC7116c).mo14375g()) == null) {
            return new C9213c(i12, EmptyCoroutineContext.f38093a, BufferOverflow.SUSPEND, interfaceC7116c);
        }
        int i13 = abstractC7125a.f40357b;
        if (i13 == -3 || i13 == -2 || i13 == 0) {
            if (abstractC7125a.f40358c == BufferOverflow.SUSPEND) {
                if (i13 == 0) {
                }
            } else if (i10 == 0) {
                i12 = 1;
            }
            i12 = 0;
        } else {
            i12 = i13;
        }
        return new C9213c(i12, abstractC7125a.f40356a, abstractC7125a.f40358c, interfaceC7116cMo14375g);
    }

    /* JADX INFO: renamed from: d */
    public static final C7848l1 m14382d(InterfaceC7882z interfaceC7882z, CoroutineContext coroutineContext, InterfaceC7116c interfaceC7116c, InterfaceC7132m interfaceC7132m, InterfaceC7140u interfaceC7140u, Object obj) {
        CoroutineStart coroutineStart = C5207g.m11106a(interfaceC7140u, InterfaceC7140u.a.f40387a) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED;
        FlowKt__ShareKt$launchSharing$1 flowKt__ShareKt$launchSharing$1 = new FlowKt__ShareKt$launchSharing$1(interfaceC7140u, interfaceC7116c, interfaceC7132m, obj, null);
        CoroutineContext coroutineContextM14307a = CoroutineContextKt.m14307a(interfaceC7882z.getF6528b(), coroutineContext, true);
        C7178b c7178b = C7832g0.f42930a;
        if (coroutineContextM14307a != c7178b && coroutineContextM14307a.mo1474w(InterfaceC9969d.a.f50692a) == null) {
            coroutineContextM14307a = coroutineContextM14307a.mo1471C(c7178b);
        }
        C7848l1 c7818b1 = coroutineStart.isLazy() ? new C7818b1(coroutineContextM14307a, flowKt__ShareKt$launchSharing$1) : new C7848l1(coroutineContextM14307a, true);
        coroutineStart.invoke(flowKt__ShareKt$launchSharing$1, c7818b1, c7818b1);
        return c7818b1;
    }
}
