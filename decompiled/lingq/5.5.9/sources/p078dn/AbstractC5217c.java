package p078dn;

import dm.C5207g;
import gn.InterfaceC5837q;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import mn.C7648e;
import p266n.C7669f;
import p372rm.InterfaceC8835e0;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: dn.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5217c extends LazyJavaScope {
    public AbstractC5217c(C7669f c7669f) {
        super(c7669f, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: n */
    public void mo11210n(ArrayList arrayList, C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: p */
    public final InterfaceC8835e0 mo11211p() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: s */
    public final LazyJavaScope.C6851a mo11212s(InterfaceC5837q interfaceC5837q, ArrayList arrayList, AbstractC5257t abstractC5257t, List list) {
        C5207g.m11111f(interfaceC5837q, "method");
        C5207g.m11111f(list, "valueParameters");
        return new LazyJavaScope.C6851a(list, arrayList, EmptyList.f38032a, abstractC5257t);
    }
}
