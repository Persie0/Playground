package kotlin.reflect.jvm.internal;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.lang.reflect.Member;
import km.InterfaceC6725h;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import p247lm.C7396i;
import p372rm.InterfaceC8829b0;

/* JADX INFO: loaded from: classes2.dex */
public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements InterfaceC6725h<T, V> {

    /* JADX INFO: renamed from: i */
    public final C7396i.b<C6778a<T, V>> f38244i;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KProperty1Impl$a */
    public static final class C6778a<T, V> extends KPropertyImpl.Getter<V> implements InterfaceC6725h.a<T, V> {

        /* JADX INFO: renamed from: e */
        public final KProperty1Impl<T, V> f38246e;

        /* JADX WARN: Multi-variable type inference failed */
        public C6778a(KProperty1Impl<T, ? extends V> kProperty1Impl) {
            C5207g.m11111f(kProperty1Impl, "property");
            this.f38246e = kProperty1Impl;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.AbstractC6780a
        /* JADX INFO: renamed from: j */
        public final KPropertyImpl mo13509j() {
            return this.f38246e;
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final V mo528n(T t10) {
            C6778a<T, V> c6778aM14786E = this.f38246e.f38244i.m14786E();
            C5207g.m11110e(c6778aM14786E, "_getter()");
            return c6778aM14786E.mo13337b(t10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "signature");
        this.f38244i = C7396i.m14784b(new InterfaceC2041a<C6778a<T, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty1Impl<T, V> f38245b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38245b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                return new KProperty1Impl.C6778a(this.f38245b);
            }
        });
        C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateSource$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty1Impl<T, V> f38247b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38247b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Member mo807E() {
                return this.f38247b.m13512i();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC8829b0 interfaceC8829b0) {
        super(kDeclarationContainerImpl, interfaceC8829b0);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(interfaceC8829b0, "descriptor");
        this.f38244i = C7396i.m14784b(new InterfaceC2041a<C6778a<T, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty1Impl<T, V> f38245b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38245b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                return new KProperty1Impl.C6778a(this.f38245b);
            }
        });
        C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateSource$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty1Impl<T, V> f38247b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38247b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Member mo807E() {
                return this.f38247b.m13512i();
            }
        });
    }

    @Override // km.InterfaceC6725h
    /* JADX INFO: renamed from: h */
    public final InterfaceC6725h.a mo13338h() {
        C6778a<T, V> c6778aM14786E = this.f38244i.m14786E();
        C5207g.m11110e(c6778aM14786E, "_getter()");
        return c6778aM14786E;
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    /* JADX INFO: renamed from: k */
    public final KPropertyImpl.Getter mo13511k() {
        C6778a<T, V> c6778aM14786E = this.f38244i.m14786E();
        C5207g.m11110e(c6778aM14786E, "_getter()");
        return c6778aM14786E;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final V mo528n(T t10) {
        C6778a<T, V> c6778aM14786E = this.f38244i.m14786E();
        C5207g.m11110e(c6778aM14786E, "_getter()");
        return c6778aM14786E.mo13337b(t10);
    }
}
