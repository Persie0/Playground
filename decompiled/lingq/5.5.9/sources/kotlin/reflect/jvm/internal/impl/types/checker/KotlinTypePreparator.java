package kotlin.reflect.jvm.internal.impl.types.checker;

import ae.C0062b;
import android.support.v4.media.AbstractC0140a;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p102eo.C5441f;
import p139go.InterfaceC5852f;
import p348qn.C8653c;
import p373rn.C8882n;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KotlinTypePreparator extends AbstractC0140a {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator$a */
    public static final class C7059a extends KotlinTypePreparator {

        /* JADX INFO: renamed from: a */
        public static final C7059a f39903a = new C7059a();
    }

    /* JADX INFO: renamed from: l0 */
    public static AbstractC5265x m14217l0(AbstractC5265x abstractC5265x) {
        AbstractC5257t abstractC5257tMo11236c;
        InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5265x.mo11250X0();
        boolean z10 = false;
        IntersectionTypeConstructor intersectionTypeConstructor = null;
        abstractC5262v0Mo11288a1 = null;
        AbstractC5262v0 abstractC5262v0Mo11288a1 = null;
        if (interfaceC5240k0Mo11250X0 instanceof C8653c) {
            C8653c c8653c = (C8653c) interfaceC5240k0Mo11250X0;
            InterfaceC5246n0 interfaceC5246n0 = c8653c.f46229a;
            if (!(interfaceC5246n0.mo11237d() == Variance.IN_VARIANCE)) {
                interfaceC5246n0 = null;
            }
            if (interfaceC5246n0 != null && (abstractC5257tMo11236c = interfaceC5246n0.mo11236c()) != null) {
                abstractC5262v0Mo11288a1 = abstractC5257tMo11236c.mo11288a1();
            }
            AbstractC5262v0 abstractC5262v0 = abstractC5262v0Mo11288a1;
            if (c8653c.f46230b == null) {
                Collection<AbstractC5257t> collectionMo11278p = c8653c.mo11278p();
                final ArrayList arrayList = new ArrayList(C9325m.m17681z(collectionMo11278p, 10));
                Iterator<T> it = collectionMo11278p.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC5257t) it.next()).mo11288a1());
                }
                InterfaceC5246n0 interfaceC5246n1 = c8653c.f46229a;
                C5207g.m11111f(interfaceC5246n1, "projection");
                c8653c.f46230b = new NewCapturedTypeConstructor(interfaceC5246n1, new InterfaceC2041a<List<? extends AbstractC5262v0>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final List<? extends AbstractC5262v0> mo807E() {
                        return arrayList;
                    }
                }, null, null, 8);
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newCapturedTypeConstructor = c8653c.f46230b;
            C5207g.m11108c(newCapturedTypeConstructor);
            return new C5441f(captureStatus, newCapturedTypeConstructor, abstractC5262v0, abstractC5265x.mo11241W0(), abstractC5265x.mo11242Y0(), 32);
        }
        if (interfaceC5240k0Mo11250X0 instanceof C8882n) {
            ((C8882n) interfaceC5240k0Mo11250X0).getClass();
            C9325m.m17681z(null, 10);
            throw null;
        }
        if (!(interfaceC5240k0Mo11250X0 instanceof IntersectionTypeConstructor) || !abstractC5265x.mo11242Y0()) {
            return abstractC5265x;
        }
        IntersectionTypeConstructor intersectionTypeConstructor2 = (IntersectionTypeConstructor) interfaceC5240k0Mo11250X0;
        LinkedHashSet<AbstractC5257t> linkedHashSet = intersectionTypeConstructor2.f39864b;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(linkedHashSet, 10));
        Iterator<T> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(TypeUtilsKt.m14235l((AbstractC5257t) it2.next()));
            z10 = true;
        }
        if (z10) {
            AbstractC5257t abstractC5257t = intersectionTypeConstructor2.f39863a;
            AbstractC5262v0 abstractC5262v0M14235l = abstractC5257t != null ? TypeUtilsKt.m14235l(abstractC5257t) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            intersectionTypeConstructor = new IntersectionTypeConstructor(linkedHashSet2, abstractC5262v0M14235l);
        }
        if (intersectionTypeConstructor != null) {
            intersectionTypeConstructor2 = intersectionTypeConstructor;
        }
        return intersectionTypeConstructor2.m14179c();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final AbstractC5262v0 mo590a0(InterfaceC5852f interfaceC5852f) {
        AbstractC5262v0 abstractC5262v0M14184c;
        C5207g.m11111f(interfaceC5852f, "type");
        if (!(interfaceC5852f instanceof AbstractC5257t)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        AbstractC5262v0 abstractC5262v0Mo11288a1 = ((AbstractC5257t) interfaceC5852f).mo11288a1();
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5265x) {
            abstractC5262v0M14184c = m14217l0((AbstractC5265x) abstractC5262v0Mo11288a1);
        } else {
            if (!(abstractC5262v0Mo11288a1 instanceof AbstractC5249p)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC5249p abstractC5249p = (AbstractC5249p) abstractC5262v0Mo11288a1;
            AbstractC5265x abstractC5265xM14217l0 = m14217l0(abstractC5249p.f33340b);
            AbstractC5265x abstractC5265x = abstractC5249p.f33341c;
            AbstractC5265x abstractC5265xM14217l1 = m14217l0(abstractC5265x);
            abstractC5262v0M14184c = (abstractC5265xM14217l0 == abstractC5249p.f33340b && abstractC5265xM14217l1 == abstractC5265x) ? abstractC5262v0Mo11288a1 : KotlinTypeFactory.m14184c(abstractC5265xM14217l0, abstractC5265xM14217l1);
        }
        KotlinTypePreparator$prepareType$1 kotlinTypePreparator$prepareType$1 = new KotlinTypePreparator$prepareType$1(this);
        C5207g.m11111f(abstractC5262v0M14184c, "<this>");
        C5207g.m11111f(abstractC5262v0Mo11288a1, "origin");
        AbstractC5257t abstractC5257tM346f1 = C0062b.m346f1(abstractC5262v0Mo11288a1);
        return C0062b.m247A2(abstractC5262v0M14184c, abstractC5257tM346f1 != null ? (AbstractC5257t) kotlinTypePreparator$prepareType$1.mo528n(abstractC5257tM346f1) : null);
    }
}
