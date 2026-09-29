package kotlin.reflect.jvm.internal.impl.load.java.components;

import ae.C0062b;
import bn.InterfaceC1622f;
import cm.InterfaceC2041a;
import cn.C2064a;
import co.InterfaceC2073e;
import dm.C5207g;
import dm.C5209i;
import gn.InterfaceC5820a;
import gn.InterfaceC5822b;
import java.util.ArrayList;
import java.util.Map;
import km.InterfaceC6727j;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.jvm.internal.PropertyReference1Impl;
import mn.C7646c;
import mn.C7648e;
import p266n.C7669f;
import p372rm.InterfaceC8837f0;
import p373rn.AbstractC8875g;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import sm.InterfaceC9075c;

/* JADX INFO: loaded from: classes2.dex */
public class JavaAnnotationDescriptor implements InterfaceC9075c, InterfaceC1622f {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38636f = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* JADX INFO: renamed from: a */
    public final C7646c f38637a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8837f0 f38638b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2073e f38639c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5822b f38640d;

    /* JADX INFO: renamed from: e */
    public final boolean f38641e;

    public JavaAnnotationDescriptor(final C7669f c7669f, InterfaceC5820a interfaceC5820a, C7646c c7646c) {
        InterfaceC8837f0 interfaceC8837f0Mo11843a;
        ArrayList arrayListMo12232d;
        C5207g.m11111f(c7669f, "c");
        C5207g.m11111f(c7646c, "fqName");
        this.f38637a = c7646c;
        if (interfaceC5820a == null || (interfaceC8837f0Mo11843a = ((C2064a) c7669f.f42146a).f10504j.mo11843a(interfaceC5820a)) == null) {
            interfaceC8837f0Mo11843a = InterfaceC8837f0.f46730a;
        }
        this.f38638b = interfaceC8837f0Mo11843a;
        this.f38639c = c7669f.m15268b().mo6217b(new InterfaceC2041a<AbstractC5265x>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC5265x mo807E() {
                AbstractC5265x abstractC5265xMo5316v = c7669f.m15267a().mo11877o().m13553j(this.f38637a).mo5316v();
                C5207g.m11110e(abstractC5265xMo5316v, "c.module.builtIns.getBui…qName(fqName).defaultType");
                return abstractC5265xMo5316v;
            }
        });
        this.f38640d = (interfaceC5820a == null || (arrayListMo12232d = interfaceC5820a.mo12232d()) == null) ? null : (InterfaceC5822b) C6752c.m13424R(arrayListMo12232d);
        if (interfaceC5820a != null) {
            interfaceC5820a.mo12234k();
        }
        this.f38641e = false;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: a */
    public Map<C7648e, AbstractC8875g<?>> mo12513a() {
        return C6753d.m13459L0();
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo12514c() {
        return (AbstractC5265x) C0062b.m366l1(this.f38639c, f38636f[0]);
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: e */
    public final C7646c mo12515e() {
        return this.f38637a;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo12516j() {
        return this.f38638b;
    }

    @Override // bn.InterfaceC1622f
    /* JADX INFO: renamed from: k */
    public final boolean mo5290k() {
        return this.f38641e;
    }
}
