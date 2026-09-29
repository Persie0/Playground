package kotlin.reflect.jvm.internal.impl.load.java.components;

import ae.C0062b;
import cm.InterfaceC2041a;
import co.InterfaceC2073e;
import dm.C5207g;
import dm.C5209i;
import gn.InterfaceC5820a;
import gn.InterfaceC5822b;
import gn.InterfaceC5833m;
import java.util.EnumSet;
import java.util.Map;
import km.InterfaceC6727j;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import mn.C7645b;
import mn.C7648e;
import p016an.C0128b;
import p260m8.C7499b;
import p266n.C7669f;
import p373rn.AbstractC8875g;
import p373rn.C8877i;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38648h = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(JavaRetentionAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g */
    public final InterfaceC2073e f38649g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(InterfaceC5820a interfaceC5820a, C7669f c7669f) {
        super(c7669f, interfaceC5820a, C6797e.a.f38400w);
        C5207g.m11111f(interfaceC5820a, "annotation");
        C5207g.m11111f(c7669f, "c");
        this.f38649g = c7669f.m15268b().mo6217b(new InterfaceC2041a<Map<C7648e, ? extends AbstractC8875g<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x0048  */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Map<C7648e, ? extends AbstractC8875g<?>> mo807E() {
                C8877i c8877i;
                Map<String, EnumSet<KotlinTarget>> map = C6843a.f38654a;
                InterfaceC5822b interfaceC5822b = this.f38650b.f38640d;
                Map<C7648e, ? extends AbstractC8875g<?>> mapM13459L0 = null;
                InterfaceC5833m interfaceC5833m = interfaceC5822b instanceof InterfaceC5833m ? (InterfaceC5833m) interfaceC5822b : null;
                if (interfaceC5833m != null) {
                    Map<String, KotlinRetention> map2 = C6843a.f38655b;
                    C7648e c7648eMo12268e = interfaceC5833m.mo12268e();
                    KotlinRetention kotlinRetention = map2.get(c7648eMo12268e != null ? c7648eMo12268e.m15235f() : null);
                    if (kotlinRetention != null) {
                        c8877i = new C8877i(C7645b.m15203l(C6797e.a.f38399v), C7648e.m15232l(kotlinRetention.name()));
                    } else {
                        c8877i = null;
                    }
                } else {
                    c8877i = null;
                }
                if (c8877i != null) {
                    mapM13459L0 = C7499b.m14943h0(new Pair(C0128b.f334c, c8877i));
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
    public final Map<C7648e, AbstractC8875g<?>> mo12513a() {
        return (Map) C0062b.m366l1(this.f38649g, f38648h[0]);
    }
}
