package kotlin.reflect.jvm.internal.impl.load.kotlin;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import co.InterfaceC2071c;
import dm.C5207g;
import in.C6357a;
import in.C6369m;
import in.C6370n;
import in.InterfaceC6367k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kn.C6732b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import om.C8091h;
import p248ln.C7404e;
import p248ln.C7407h;
import p372rm.InterfaceC8837f0;
import p373rn.AbstractC8875g;
import p373rn.C8872d;
import p373rn.C8880l;
import p373rn.C8884p;
import p373rn.C8886r;
import p373rn.C8888t;
import p373rn.C8889u;
import p373rn.C8890v;
import p373rn.C8891w;
import p465wm.C9974d;
import p541zn.AbstractC10554r;
import p541zn.InterfaceC10537a;
import p543do.AbstractC5257t;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, C6893a<? extends A, ? extends C>> implements InterfaceC10537a<A, C> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2071c<InterfaceC6367k, C6893a<A, C>> f38892b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$a */
    public static final class C6893a<A, C> extends AbstractBinaryClassAnnotationLoader.AbstractC6896a<A> {

        /* JADX INFO: renamed from: a */
        public final Map<C6370n, List<A>> f38893a;

        /* JADX INFO: renamed from: b */
        public final Map<C6370n, C> f38894b;

        /* JADX INFO: renamed from: c */
        public final Map<C6370n, C> f38895c;

        public C6893a(HashMap map, HashMap map2, HashMap map3) {
            this.f38893a = map;
            this.f38894b = map2;
            this.f38895c = map3;
        }
    }

    public AbstractBinaryClassAnnotationAndConstantLoader(LockBasedStorageManager lockBasedStorageManager, C9974d c9974d) {
        super(c9974d);
        this.f38892b = lockBasedStorageManager.mo6221f(new InterfaceC2052l<InterfaceC6367k, C6893a<Object, Object>>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$storage$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> f38898b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f38898b = this;
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractBinaryClassAnnotationAndConstantLoader.C6893a<Object, Object> mo528n(InterfaceC6367k interfaceC6367k) {
                InterfaceC6367k interfaceC6367k2 = interfaceC6367k;
                C5207g.m11111f(interfaceC6367k2, "kotlinClass");
                AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> abstractBinaryClassAnnotationAndConstantLoader = this.f38898b;
                abstractBinaryClassAnnotationAndConstantLoader.getClass();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                interfaceC6367k2.mo13001c(new C6357a(abstractBinaryClassAnnotationAndConstantLoader, map, interfaceC6367k2, map2));
                return new AbstractBinaryClassAnnotationAndConstantLoader.C6893a<>(map, map2, map3);
            }
        });
    }

    @Override // p541zn.InterfaceC10537a
    /* JADX INFO: renamed from: g */
    public final C mo13746g(AbstractC10554r abstractC10554r, ProtoBuf$Property protoBuf$Property, AbstractC5257t abstractC5257t) {
        C5207g.m11111f(protoBuf$Property, "proto");
        return m13748v(abstractC10554r, protoBuf$Property, AnnotatedCallableKind.PROPERTY, abstractC5257t, new InterfaceC2056p<C6893a<? extends A, ? extends C>, C6370n, C>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Object obj, C6370n c6370n) {
                AbstractBinaryClassAnnotationAndConstantLoader.C6893a c6893a = (AbstractBinaryClassAnnotationAndConstantLoader.C6893a) obj;
                C6370n c6370n2 = c6370n;
                C5207g.m11111f(c6893a, "$this$loadConstantFromProperty");
                C5207g.m11111f(c6370n2, "it");
                return c6893a.f38894b.get(c6370n2);
            }
        });
    }

    @Override // p541zn.InterfaceC10537a
    /* JADX INFO: renamed from: k */
    public final C mo13747k(AbstractC10554r abstractC10554r, ProtoBuf$Property protoBuf$Property, AbstractC5257t abstractC5257t) {
        C5207g.m11111f(protoBuf$Property, "proto");
        return m13748v(abstractC10554r, protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER, abstractC5257t, new InterfaceC2056p<C6893a<? extends A, ? extends C>, C6370n, C>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationDefaultValue$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Object obj, C6370n c6370n) {
                AbstractBinaryClassAnnotationAndConstantLoader.C6893a c6893a = (AbstractBinaryClassAnnotationAndConstantLoader.C6893a) obj;
                C6370n c6370n2 = c6370n;
                C5207g.m11111f(c6893a, "$this$loadConstantFromProperty");
                C5207g.m11111f(c6370n2, "it");
                return c6893a.f38895c.get(c6370n2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final C m13748v(AbstractC10554r abstractC10554r, ProtoBuf$Property protoBuf$Property, AnnotatedCallableKind annotatedCallableKind, AbstractC5257t abstractC5257t, InterfaceC2056p<? super C6893a<? extends A, ? extends C>, ? super C6370n, ? extends C> interfaceC2056p) {
        C cMo1337m0;
        AbstractC8875g c8890v;
        InterfaceC6367k interfaceC6367kM13763q = m13763q(abstractC10554r, true, true, C6732b.f37950A.m13346c(protoBuf$Property.f39193d), C7407h.m14810d(protoBuf$Property));
        if (interfaceC6367kM13763q == null) {
            if (abstractC10554r instanceof AbstractC10554r.a) {
                InterfaceC8837f0 interfaceC8837f0 = ((AbstractC10554r.a) abstractC10554r).f52614c;
                C6369m c6369m = interfaceC8837f0 instanceof C6369m ? (C6369m) interfaceC8837f0 : null;
                if (c6369m != null) {
                    interfaceC6367kM13763q = c6369m.f36758b;
                } else {
                    interfaceC6367kM13763q = null;
                }
            } else {
                interfaceC6367kM13763q = null;
            }
        }
        if (interfaceC6367kM13763q == null) {
            return null;
        }
        C7404e c7404e = interfaceC6367kM13763q.mo12999a().f38909b;
        C7404e c7404e2 = C6898a.f38906e;
        c7404e.getClass();
        C5207g.m11111f(c7404e2, "version");
        C6370n c6370nM13750n = AbstractBinaryClassAnnotationLoader.m13750n(protoBuf$Property, abstractC10554r.f52612a, abstractC10554r.f52613b, annotatedCallableKind, c7404e.m13343a(c7404e2.f37946b, c7404e2.f37947c, c7404e2.f37948d));
        if (c6370nM13750n != null && (cMo1337m0 = interfaceC2056p.mo1337m0((Object) ((LockBasedStorageManager.C7045k) this.f38892b).mo528n(interfaceC6367kM13763q), c6370nM13750n)) != 0) {
            if (!C8091h.m16005a(abstractC5257t)) {
                return cMo1337m0;
            }
            C c10 = (C) ((AbstractC8875g) cMo1337m0);
            if (c10 instanceof C8872d) {
                c8890v = new C8888t(((Number) ((C8872d) c10).f46772a).byteValue());
            } else if (c10 instanceof C8886r) {
                c8890v = new C8891w(((Number) ((C8886r) c10).f46772a).shortValue());
            } else if (c10 instanceof C8880l) {
                c8890v = new C8889u(((Number) ((C8880l) c10).f46772a).intValue());
            } else {
                if (!(c10 instanceof C8884p)) {
                    return c10;
                }
                c8890v = new C8890v(((Number) ((C8884p) c10).f46772a).longValue());
            }
            return (C) c8890v;
        }
        return null;
    }
}
