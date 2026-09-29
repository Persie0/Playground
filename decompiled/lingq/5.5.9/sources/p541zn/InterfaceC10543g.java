package p541zn;

import bo.C1630h;
import dm.C5207g;
import kn.C6735e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: renamed from: zn.g */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10543g {

    /* JADX INFO: renamed from: zn.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C10690a f52578a = new C10690a();

        /* JADX INFO: renamed from: zn.g$a$a, reason: collision with other inner class name */
        public static final class C10690a implements InterfaceC10543g {
            @Override // p541zn.InterfaceC10543g
            /* JADX INFO: renamed from: a */
            public final void mo19513a(ProtoBuf$Function protoBuf$Function, C1630h c1630h, C6735e c6735e, TypeDeserializer typeDeserializer) {
                C5207g.m11111f(protoBuf$Function, "proto");
                C5207g.m11111f(c6735e, "typeTable");
                C5207g.m11111f(typeDeserializer, "typeDeserializer");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo19513a(ProtoBuf$Function protoBuf$Function, C1630h c1630h, C6735e c6735e, TypeDeserializer typeDeserializer);
}
