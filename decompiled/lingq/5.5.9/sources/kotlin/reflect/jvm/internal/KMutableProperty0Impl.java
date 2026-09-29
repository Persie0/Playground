package kotlin.reflect.jvm.internal;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.reflect.full.IllegalCallableAccessException;
import p247lm.C7396i;
import p372rm.InterfaceC8829b0;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class KMutableProperty0Impl<V> extends KProperty0Impl<V> {

    /* JADX INFO: renamed from: j */
    public final C7396i.b<C6775a<V>> f38211j;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KMutableProperty0Impl$a */
    public static final class C6775a<R> extends KPropertyImpl.Setter<R> implements InterfaceC2052l {

        /* JADX INFO: renamed from: e */
        public final KMutableProperty0Impl<R> f38213e;

        public C6775a(KMutableProperty0Impl<R> kMutableProperty0Impl) {
            C5207g.m11111f(kMutableProperty0Impl, "property");
            this.f38213e = kMutableProperty0Impl;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.AbstractC6780a
        /* JADX INFO: renamed from: j */
        public final KPropertyImpl mo13509j() {
            return this.f38213e;
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final Object mo528n(Object obj) throws IllegalCallableAccessException {
            C6775a<R> c6775aM14786E = this.f38213e.f38211j.m14786E();
            C5207g.m11110e(c6775aM14786E, "_setter()");
            c6775aM14786E.mo13337b(obj);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC8829b0 interfaceC8829b0) {
        super(kDeclarationContainerImpl, interfaceC8829b0);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(interfaceC8829b0, "descriptor");
        this.f38211j = C7396i.m14784b(new InterfaceC2041a<C6775a<V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty0Impl$_setter$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KMutableProperty0Impl<V> f38212b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f38212b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                return new KMutableProperty0Impl.C6775a(this.f38212b);
            }
        });
    }
}
