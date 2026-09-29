package tn;

import java.util.Collection;
import jo.C6530b;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: renamed from: tn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9344a<N> implements C6530b.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f48077a;

    public C9344a(boolean z10) {
        this.f48077a = z10;
    }

    @Override // jo.C6530b.b
    /* JADX INFO: renamed from: c */
    public final Iterable mo13114c(Object obj) {
        CallableMemberDescriptor callableMemberDescriptorMo11875b = (CallableMemberDescriptor) obj;
        Collection<? extends CallableMemberDescriptor> collectionMo11893p = null;
        if (this.f48077a) {
            callableMemberDescriptorMo11875b = callableMemberDescriptorMo11875b != null ? callableMemberDescriptorMo11875b.mo11875b() : null;
        }
        if (callableMemberDescriptorMo11875b != null) {
            collectionMo11893p = callableMemberDescriptorMo11875b.mo11893p();
        }
        return collectionMo11893p == null ? EmptyList.f38032a : collectionMo11893p;
    }
}
