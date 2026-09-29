package kotlin.reflect.jvm.internal.impl.builtins;

import cm.InterfaceC2041a;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6796d {

    /* JADX INFO: renamed from: a */
    public final NotFoundClasses f38332a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9070c f38333b;

    /* JADX INFO: renamed from: c */
    public final a f38334c = new a();

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38331e = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(C6796d.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(C6796d.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(C6796d.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(C6796d.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(C6796d.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(C6796d.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(C6796d.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(C6796d.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* JADX INFO: renamed from: d */
    public static final b f38330d = new b();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.d$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.d$b */
    public static final class b {
    }

    public C6796d(final C6829c c6829c, NotFoundClasses notFoundClasses) {
        this.f38332a = notFoundClasses;
        this.f38333b = C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$kotlinReflectScope$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final MemberScope mo807E() {
                return c6829c.mo11873R(C6797e.f38341g).mo13628q();
            }
        });
    }
}
