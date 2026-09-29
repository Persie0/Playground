package kotlin.reflect.jvm.internal.impl.load.java.components;

import ae.C0062b;
import cm.InterfaceC2041a;
import co.InterfaceC2073e;
import dm.C5207g;
import dm.C5209i;
import gn.InterfaceC5820a;
import java.util.Map;
import km.InterfaceC6727j;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import mn.C7648e;
import p016an.C0128b;
import p260m8.C7499b;
import p266n.C7669f;
import p373rn.AbstractC8875g;
import p373rn.C8887s;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38645h = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(JavaDeprecatedAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g */
    public final InterfaceC2073e f38646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(InterfaceC5820a interfaceC5820a, C7669f c7669f) {
        super(c7669f, interfaceC5820a, C6797e.a.f38390m);
        C5207g.m11111f(c7669f, "c");
        this.f38646g = c7669f.m15268b().mo6217b(new InterfaceC2041a<Map<C7648e, ? extends C8887s>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Map<C7648e, ? extends C8887s> mo807E() {
                return C7499b.m14943h0(new Pair(C0128b.f332a, new C8887s("Deprecated in Java")));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, sm.InterfaceC9075c
    /* JADX INFO: renamed from: a */
    public final Map<C7648e, AbstractC8875g<?>> mo12513a() {
        return (Map) C0062b.m366l1(this.f38646g, f38645h[0]);
    }
}
