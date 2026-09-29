package kotlin.reflect.jvm.internal;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.lang.reflect.Member;
import km.InterfaceC6726i;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.CallableReference;
import p247lm.C7396i;
import p372rm.InterfaceC8829b0;

/* JADX INFO: loaded from: classes2.dex */
public class KProperty2Impl<D, E, V> extends KPropertyImpl<V> implements InterfaceC6726i<D, E, V> {

    /* JADX INFO: renamed from: i */
    public final C7396i.b<C6779a<D, E, V>> f38248i;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KProperty2Impl$a */
    public static final class C6779a<D, E, V> extends KPropertyImpl.Getter<V> implements InterfaceC6726i.a<D, E, V> {

        /* JADX INFO: renamed from: e */
        public final KProperty2Impl<D, E, V> f38250e;

        /* JADX WARN: Multi-variable type inference failed */
        public C6779a(KProperty2Impl<D, E, ? extends V> kProperty2Impl) {
            C5207g.m11111f(kProperty2Impl, "property");
            this.f38250e = kProperty2Impl;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.AbstractC6780a
        /* JADX INFO: renamed from: j */
        public final KPropertyImpl mo13509j() {
            return this.f38250e;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final V mo1337m0(D d10, E e10) {
            C6779a<D, E, V> c6779aM14786E = this.f38250e.f38248i.m14786E();
            C5207g.m11110e(c6779aM14786E, "_getter()");
            return c6779aM14786E.mo13337b(d10, e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2) {
        super(kDeclarationContainerImpl, str, str2, CallableReference.f38110g);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "signature");
        this.f38248i = C7396i.m14784b(new InterfaceC2041a<C6779a<D, E, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$_getter$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty2Impl<D, E, V> f38249b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38249b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                return new KProperty2Impl.C6779a(this.f38249b);
            }
        });
        C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$delegateSource$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty2Impl<D, E, V> f38251b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38251b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Member mo807E() {
                return this.f38251b.m13512i();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC8829b0 interfaceC8829b0) {
        super(kDeclarationContainerImpl, interfaceC8829b0);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(interfaceC8829b0, "descriptor");
        this.f38248i = C7396i.m14784b(new InterfaceC2041a<C6779a<D, E, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$_getter$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty2Impl<D, E, V> f38249b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38249b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                return new KProperty2Impl.C6779a(this.f38249b);
            }
        });
        C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$delegateSource$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty2Impl<D, E, V> f38251b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38251b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Member mo807E() {
                return this.f38251b.m13512i();
            }
        });
    }

    @Override // km.InterfaceC6726i
    /* JADX INFO: renamed from: h */
    public final InterfaceC6726i.a mo13339h() {
        C6779a<D, E, V> c6779aM14786E = this.f38248i.m14786E();
        C5207g.m11110e(c6779aM14786E, "_getter()");
        return c6779aM14786E;
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    /* JADX INFO: renamed from: k */
    public final KPropertyImpl.Getter mo13511k() {
        C6779a<D, E, V> c6779aM14786E = this.f38248i.m14786E();
        C5207g.m11110e(c6779aM14786E, "_getter()");
        return c6779aM14786E;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final V mo1337m0(D d10, E e10) {
        C6779a<D, E, V> c6779aM14786E = this.f38248i.m14786E();
        C5207g.m11110e(c6779aM14786E, "_getter()");
        return c6779aM14786E.mo13337b(d10, e10);
    }
}
