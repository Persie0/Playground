package kotlin.reflect.jvm.internal.impl.load.java.components;

import ae.C0062b;
import cm.InterfaceC2041a;
import co.InterfaceC2073e;
import dm.C5207g;
import dm.C5209i;
import gn.InterfaceC5820a;
import gn.InterfaceC5822b;
import gn.InterfaceC5825e;
import gn.InterfaceC5833m;
import java.util.EnumSet;
import java.util.Map;
import km.InterfaceC6727j;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import mn.C7648e;
import p016an.C0128b;
import p260m8.C7499b;
import p266n.C7669f;
import p373rn.AbstractC8875g;
import p373rn.C8870b;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38651h = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g */
    public final InterfaceC2073e f38652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(InterfaceC5820a interfaceC5820a, C7669f c7669f) {
        super(c7669f, interfaceC5820a, C6797e.a.f38397t);
        C5207g.m11111f(interfaceC5820a, "annotation");
        C5207g.m11111f(c7669f, "c");
        this.f38652g = c7669f.m15268b().mo6217b(new InterfaceC2041a<Map<C7648e, ? extends AbstractC8875g<? extends Object>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Map<C7648e, ? extends AbstractC8875g<? extends Object>> mo807E() {
                C8870b c8870bM13676a;
                InterfaceC5822b interfaceC5822b = this.f38653b.f38640d;
                Map<C7648e, ? extends AbstractC8875g<? extends Object>> mapM13459L0 = null;
                if (interfaceC5822b instanceof InterfaceC5825e) {
                    Map<String, EnumSet<KotlinTarget>> map = C6843a.f38654a;
                    c8870bM13676a = C6843a.m13676a(((InterfaceC5825e) interfaceC5822b).mo12242f());
                } else if (interfaceC5822b instanceof InterfaceC5833m) {
                    Map<String, EnumSet<KotlinTarget>> map2 = C6843a.f38654a;
                    c8870bM13676a = C6843a.m13676a(C9000b.m17251q(interfaceC5822b));
                } else {
                    c8870bM13676a = null;
                }
                if (c8870bM13676a != null) {
                    mapM13459L0 = C7499b.m14943h0(new Pair(C0128b.f333b, c8870bM13676a));
                }
                if (mapM13459L0 == null) {
                    mapM13459L0 = C6753d.m13459L0();
                }
                return mapM13459L0;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, sm.InterfaceC9075c
    /* JADX INFO: renamed from: a */
    public final Map<C7648e, AbstractC8875g<Object>> mo12513a() {
        return (Map) C0062b.m366l1(this.f38652g, f38651h[0]);
    }
}
