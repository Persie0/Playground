package kotlin.reflect.jvm.internal.impl.types.checker;

import cm.InterfaceC2056p;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;
import p102eo.C5443h;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C7062xc97d8c34 extends FunctionReference implements InterfaceC2056p<AbstractC5257t, AbstractC5257t, Boolean> {
    public C7062xc97d8c34(C5443h c5443h) {
        super(2, c5443h);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "equalTypes";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(C5443h.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Boolean mo1337m0(AbstractC5257t abstractC5257t, AbstractC5257t abstractC5257t2) {
        AbstractC5257t abstractC5257t3 = abstractC5257t;
        AbstractC5257t abstractC5257t4 = abstractC5257t2;
        C5207g.m11111f(abstractC5257t3, "p0");
        C5207g.m11111f(abstractC5257t4, "p1");
        return Boolean.valueOf(((C5443h) this.f38112b).mo11657a(abstractC5257t3, abstractC5257t4));
    }
}
