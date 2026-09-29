package tm;

import bo.C1630h;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: renamed from: tm.c */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9341c {

    /* JADX INFO: renamed from: tm.c$a */
    public static final class a implements InterfaceC9341c {

        /* JADX INFO: renamed from: a */
        public static final a f48073a = new a();

        @Override // tm.InterfaceC9341c
        /* JADX INFO: renamed from: b */
        public final boolean mo13575b(DeserializedClassDescriptor deserializedClassDescriptor, C1630h c1630h) {
            C5207g.m11111f(deserializedClassDescriptor, "classDescriptor");
            return true;
        }
    }

    /* JADX INFO: renamed from: tm.c$b */
    public static final class b implements InterfaceC9341c {

        /* JADX INFO: renamed from: a */
        public static final b f48074a = new b();

        @Override // tm.InterfaceC9341c
        /* JADX INFO: renamed from: b */
        public final boolean mo13575b(DeserializedClassDescriptor deserializedClassDescriptor, C1630h c1630h) {
            C5207g.m11111f(deserializedClassDescriptor, "classDescriptor");
            return !c1630h.mo11289w().mo5292x(C9342d.f48075a);
        }
    }

    /* JADX INFO: renamed from: b */
    boolean mo13575b(DeserializedClassDescriptor deserializedClassDescriptor, C1630h c1630h);
}
