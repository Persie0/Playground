package kotlin.reflect.jvm.internal.impl.descriptors;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p102eo.AbstractC5439d;
import p372rm.InterfaceC8830c;

/* JADX INFO: loaded from: classes2.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8830c f38465a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<AbstractC5439d, T> f38466b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5439d f38467c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2073e f38468d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38464f = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: e */
    public static final C6812a f38463e = new C6812a();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$a */
    public static final class C6812a {
        /* JADX INFO: renamed from: a */
        public static ScopesHolderForClass m13610a(InterfaceC2052l interfaceC2052l, InterfaceC8830c interfaceC8830c, InterfaceC2076h interfaceC2076h, AbstractC5439d abstractC5439d) {
            C5207g.m11111f(interfaceC8830c, "classDescriptor");
            C5207g.m11111f(interfaceC2076h, "storageManager");
            C5207g.m11111f(abstractC5439d, "kotlinTypeRefinerForOwnerModule");
            return new ScopesHolderForClass(interfaceC8830c, interfaceC2076h, interfaceC2052l, abstractC5439d);
        }
    }

    public ScopesHolderForClass(InterfaceC8830c interfaceC8830c, InterfaceC2076h interfaceC2076h, InterfaceC2052l interfaceC2052l, AbstractC5439d abstractC5439d) {
        this.f38465a = interfaceC8830c;
        this.f38466b = interfaceC2052l;
        this.f38467c = abstractC5439d;
        this.f38468d = interfaceC2076h.mo6217b(new InterfaceC2041a<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$scopeForOwnerModule$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ScopesHolderForClass<T> f38469b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f38469b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                ScopesHolderForClass<T> scopesHolderForClass = this.f38469b;
                return (MemberScope) scopesHolderForClass.f38466b.mo528n(scopesHolderForClass.f38467c);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final T m13609a(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        abstractC5439d.mo11660l0(DescriptorUtilsKt.m14113j(this.f38465a));
        return (T) C0062b.m366l1(this.f38468d, f38464f[0]);
    }
}
