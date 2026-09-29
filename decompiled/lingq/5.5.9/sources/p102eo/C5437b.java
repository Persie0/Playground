package p102eo;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5853g;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;

/* JADX INFO: renamed from: eo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5437b extends TypeCheckerState.AbstractC7055b.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5436a f33980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TypeSubstitutor f33981b;

    public C5437b(InterfaceC5436a interfaceC5436a, TypeSubstitutor typeSubstitutor) {
        this.f33980a = interfaceC5436a;
        this.f33981b = typeSubstitutor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.AbstractC7055b
    /* JADX INFO: renamed from: a */
    public final InterfaceC5853g mo11656a(TypeCheckerState typeCheckerState, InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(typeCheckerState, "state");
        C5207g.m11111f(interfaceC5852f, "type");
        InterfaceC5436a interfaceC5436a = this.f33980a;
        InterfaceC5852f interfaceC5852fMo11071e = interfaceC5436a.mo11071e(interfaceC5852f);
        C5207g.m11109d(interfaceC5852fMo11071e, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        Variance variance = Variance.INVARIANT;
        AbstractC5257t abstractC5257tM14204i = this.f33981b.m14204i((AbstractC5257t) interfaceC5852fMo11071e, variance);
        C5207g.m11110e(abstractC5257tM14204i, "substitutor.safeSubstitu…VARIANT\n                )");
        AbstractC5265x abstractC5265xMo11036C = interfaceC5436a.mo11036C(abstractC5257tM14204i);
        C5207g.m11108c(abstractC5265xMo11036C);
        return abstractC5265xMo11036C;
    }
}
