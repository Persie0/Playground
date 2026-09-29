package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import p372rm.InterfaceC8863u;
import p373rn.C8870b;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7024b extends C8870b {

    /* JADX INFO: renamed from: c */
    public final AbstractC5257t f39748c;

    public C7024b(ArrayList arrayList, final AbstractC5257t abstractC5257t) {
        super(arrayList, new InterfaceC2052l<InterfaceC8863u, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedArrayValue$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5257t mo528n(InterfaceC8863u interfaceC8863u) {
                C5207g.m11111f(interfaceC8863u, "it");
                return abstractC5257t;
            }
        });
        this.f39748c = abstractC5257t;
    }
}
