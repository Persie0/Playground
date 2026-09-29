package in;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;
import mn.C7645b;
import p465wm.C9971a;

/* JADX INFO: renamed from: in.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6358b implements InterfaceC6367k.c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractBinaryClassAnnotationLoader<Object, AbstractBinaryClassAnnotationLoader.AbstractC6896a<Object>> f36713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList<Object> f36714b;

    public C6358b(AbstractBinaryClassAnnotationLoader<Object, AbstractBinaryClassAnnotationLoader.AbstractC6896a<Object>> abstractBinaryClassAnnotationLoader, ArrayList<Object> arrayList) {
        this.f36713a = abstractBinaryClassAnnotationLoader;
        this.f36714b = arrayList;
    }

    @Override // in.InterfaceC6367k.c
    /* JADX INFO: renamed from: a */
    public final void mo12972a() {
    }

    @Override // in.InterfaceC6367k.c
    /* JADX INFO: renamed from: b */
    public final InterfaceC6367k.a mo12973b(C7645b c7645b, C9971a c9971a) {
        return this.f36713a.m13765t(c7645b, c9971a, this.f36714b);
    }
}
