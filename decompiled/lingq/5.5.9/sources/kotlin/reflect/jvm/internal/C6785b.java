package kotlin.reflect.jvm.internal;

import cm.InterfaceC2041a;
import cm.InterfaceC2057q;
import dm.C5207g;
import kotlin.reflect.full.IllegalCallableAccessException;
import p247lm.C7396i;
import p372rm.InterfaceC8829b0;
import sl.C9072e;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6785b<D, E, V> extends KProperty2Impl<D, E, V> {

    /* JADX INFO: renamed from: j */
    public final C7396i.b<a<D, E, V>> f38295j;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.b$a */
    public static final class a<D, E, V> extends KPropertyImpl.Setter<V> implements InterfaceC2057q {

        /* JADX INFO: renamed from: e */
        public final C6785b<D, E, V> f38296e;

        public a(C6785b<D, E, V> c6785b) {
            C5207g.m11111f(c6785b, "property");
            this.f38296e = c6785b;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            a<D, E, V> aVarM14786E = this.f38296e.f38295j.m14786E();
            C5207g.m11110e(aVarM14786E, "_setter()");
            aVarM14786E.mo13337b(obj, obj2, obj3);
            return C9072e.f47360a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.AbstractC6780a
        /* JADX INFO: renamed from: j */
        public final KPropertyImpl mo13509j() {
            return this.f38296e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6785b(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC8829b0 interfaceC8829b0) {
        super(kDeclarationContainerImpl, interfaceC8829b0);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(interfaceC8829b0, "descriptor");
        this.f38295j = C7396i.m14784b(new InterfaceC2041a<a<Object, Object, Object>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty2Impl$_setter$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C6785b<Object, Object, Object> f38217b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f38217b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C6785b.a<Object, Object, Object> mo807E() {
                return new C6785b.a<>(this.f38217b);
            }
        });
    }
}
