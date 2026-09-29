package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import cm.InterfaceC2041a;
import java.util.Collection;
import java.util.Iterator;
import jo.C6531c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6827a implements InterfaceC2041a<Collection<InterfaceC6822c>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TypeSubstitutor f38512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC6828b f38513b;

    public C6827a(AbstractC6828b abstractC6828b, TypeSubstitutor typeSubstitutor) {
        this.f38513b = abstractC6828b;
        this.f38512a = typeSubstitutor;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final Collection<InterfaceC6822c> mo807E() {
        C6531c c6531c = new C6531c();
        Iterator<? extends InterfaceC6822c> it = this.f38513b.mo11893p().iterator();
        while (it.hasNext()) {
            c6531c.add(it.next().mo5312d(this.f38512a));
        }
        return c6531c;
    }
}
