package androidx.glance.appwidget;

import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.qr4;
import p000.rr4;
import p000.sr4;
import p000.tr4;
import p000.vk3;
import p000.vr4;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.LayoutConfiguration$save$2", m4291f = "WidgetLayout.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class LayoutConfiguration$save$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f5963a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0664l f5964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutConfiguration$save$2(C0664l c0664l, Continuation continuation) {
        super(2, continuation);
        this.f5964b = c0664l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LayoutConfiguration$save$2 layoutConfiguration$save$2 = new LayoutConfiguration$save$2(this.f5964b, continuation);
        layoutConfiguration$save$2.f5963a = obj;
        return layoutConfiguration$save$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LayoutConfiguration$save$2) create((rr4) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        rr4 rr4Var = (rr4) this.f5963a;
        rr4Var.getClass();
        vk3 vk3Var = (vk3) rr4Var.mo2383d(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
        if (!vk3Var.f65531a.equals(rr4Var)) {
            vk3Var.m23361c();
            vk3.m23358d(vk3Var.f65532b, rr4Var);
        }
        qr4 qr4Var = (qr4) vk3Var;
        int iM20766s = ((rr4) qr4Var.f65532b).m20766s();
        qr4Var.m23361c();
        rr4.m20762p((rr4) qr4Var.f65532b, iM20766s);
        qr4Var.m23361c();
        rr4.m20761o((rr4) qr4Var.f65532b);
        C0664l c0664l = this.f5964b;
        for (Map.Entry entry : c0664l.f6025b.entrySet()) {
            vr4 vr4Var = (vr4) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (c0664l.f6028e.contains(new Integer(iIntValue))) {
                sr4 sr4VarM22273r = tr4.m22273r();
                sr4VarM22273r.m23361c();
                tr4.m22271n((tr4) sr4VarM22273r.f65532b, vr4Var);
                sr4VarM22273r.m23361c();
                tr4.m22272o((tr4) sr4VarM22273r.f65532b, iIntValue);
                qr4Var.m23361c();
                rr4.m20760n((rr4) qr4Var.f65532b, (tr4) sr4VarM22273r.m23359a());
            }
        }
        return qr4Var.m23359a();
    }
}
