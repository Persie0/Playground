package p541zn;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;

/* JADX INFO: renamed from: zn.m */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10549m {

    /* JADX INFO: renamed from: zn.m$a */
    public static final class a implements InterfaceC10549m {

        /* JADX INFO: renamed from: a */
        public static final a f52602a = new a();

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p541zn.InterfaceC10549m
        /* JADX INFO: renamed from: c */
        public final AbstractC5257t mo16775c(ProtoBuf$Type protoBuf$Type, String str, AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2) {
            C5207g.m11111f(protoBuf$Type, "proto");
            C5207g.m11111f(str, "flexibleId");
            C5207g.m11111f(abstractC5265x, "lowerBound");
            C5207g.m11111f(abstractC5265x2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    /* JADX INFO: renamed from: c */
    AbstractC5257t mo16775c(ProtoBuf$Type protoBuf$Type, String str, AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2);
}
