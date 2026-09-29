package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.Map;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import mn.C7646c;
import mn.C7648e;
import p372rm.InterfaceC8837f0;
import p373rn.AbstractC8875g;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import sl.InterfaceC9070c;
import sm.InterfaceC9075c;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInAnnotationDescriptor implements InterfaceC9075c {

    /* JADX INFO: renamed from: a */
    public final AbstractC6795c f38474a;

    /* JADX INFO: renamed from: b */
    public final C7646c f38475b;

    /* JADX INFO: renamed from: c */
    public final Map<C7648e, AbstractC8875g<?>> f38476c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9070c f38477d;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(AbstractC6795c abstractC6795c, C7646c c7646c, Map<C7648e, ? extends AbstractC8875g<?>> map) {
        C5207g.m11111f(abstractC6795c, "builtIns");
        C5207g.m11111f(c7646c, "fqName");
        this.f38474a = abstractC6795c;
        this.f38475b = c7646c;
        this.f38476c = map;
        this.f38477d = C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<AbstractC5265x>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC5265x mo807E() {
                BuiltInAnnotationDescriptor builtInAnnotationDescriptor = this.f38478b;
                return builtInAnnotationDescriptor.f38474a.m13553j(builtInAnnotationDescriptor.f38475b).mo5316v();
            }
        });
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: a */
    public final Map<C7648e, AbstractC8875g<?>> mo12513a() {
        return this.f38476c;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo12514c() {
        Object value = this.f38477d.getValue();
        C5207g.m11110e(value, "<get-type>(...)");
        return (AbstractC5257t) value;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: e */
    public final C7646c mo12515e() {
        return this.f38475b;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo12516j() {
        return InterfaceC8837f0.f46730a;
    }
}
