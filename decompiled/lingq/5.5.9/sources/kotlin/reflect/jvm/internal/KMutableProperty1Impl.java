package kotlin.reflect.jvm.internal;

import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import dm.C5207g;
import km.InterfaceC6723f;
import kotlin.reflect.full.IllegalCallableAccessException;
import p247lm.C7396i;
import p372rm.InterfaceC8829b0;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements InterfaceC6723f<T, V> {

    /* JADX INFO: renamed from: j */
    public final C7396i.b<C6776a<T, V>> f38214j;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KMutableProperty1Impl$a */
    public static final class C6776a<T, V> extends KPropertyImpl.Setter<V> implements InterfaceC2056p {

        /* JADX INFO: renamed from: e */
        public final KMutableProperty1Impl<T, V> f38216e;

        public C6776a(KMutableProperty1Impl<T, V> kMutableProperty1Impl) {
            C5207g.m11111f(kMutableProperty1Impl, "property");
            this.f38216e = kMutableProperty1Impl;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.AbstractC6780a
        /* JADX INFO: renamed from: j */
        public final KPropertyImpl mo13509j() {
            return this.f38216e;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Object obj, Object obj2) throws IllegalCallableAccessException {
            C6776a<T, V> c6776aM14786E = this.f38216e.f38214j.m14786E();
            C5207g.m11110e(c6776aM14786E, "_setter()");
            c6776aM14786E.mo13337b(obj, obj2);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "signature");
        this.f38214j = C7396i.m14784b(new InterfaceC2041a<C6776a<T, V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty1Impl$_setter$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KMutableProperty1Impl<T, V> f38215b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f38215b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                return new KMutableProperty1Impl.C6776a(this.f38215b);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC8829b0 interfaceC8829b0) {
        super(kDeclarationContainerImpl, interfaceC8829b0);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(interfaceC8829b0, "descriptor");
        this.f38214j = C7396i.m14784b(new InterfaceC2041a<C6776a<T, V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty1Impl$_setter$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KMutableProperty1Impl<T, V> f38215b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f38215b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                return new KMutableProperty1Impl.C6776a(this.f38215b);
            }
        });
    }
}
