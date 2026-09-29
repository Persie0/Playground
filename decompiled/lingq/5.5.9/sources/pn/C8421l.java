package pn;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import p102eo.AbstractC5439d;
import p139go.InterfaceC5852f;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: pn.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C8421l extends TypeCheckerState {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C8422m f45544i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8421l(C8422m c8422m, KotlinTypePreparator kotlinTypePreparator, AbstractC5439d abstractC5439d) {
        super(true, true, c8422m, kotlinTypePreparator, abstractC5439d);
        this.f45544i = c8422m;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
    /* JADX INFO: renamed from: b */
    public final boolean mo14191b(InterfaceC5852f interfaceC5852f, InterfaceC5852f interfaceC5852f2) {
        C5207g.m11111f(interfaceC5852f, "subType");
        C5207g.m11111f(interfaceC5852f2, "superType");
        if (!(interfaceC5852f instanceof AbstractC5257t)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (interfaceC5852f2 instanceof AbstractC5257t) {
            return this.f45544i.f45549e.mo1337m0(interfaceC5852f, interfaceC5852f2).booleanValue();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
