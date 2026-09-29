package tm;

import dm.C5207g;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import mn.C7648e;

/* JADX INFO: renamed from: tm.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9339a {

    /* JADX INFO: renamed from: tm.a$a */
    public static final class a implements InterfaceC9339a {

        /* JADX INFO: renamed from: a */
        public static final a f48072a = new a();

        @Override // tm.InterfaceC9339a
        /* JADX INFO: renamed from: a */
        public final Collection mo13574a(DeserializedClassDescriptor deserializedClassDescriptor) {
            C5207g.m11111f(deserializedClassDescriptor, "classDescriptor");
            return EmptyList.f38032a;
        }

        @Override // tm.InterfaceC9339a
        /* JADX INFO: renamed from: c */
        public final Collection mo13576c(DeserializedClassDescriptor deserializedClassDescriptor) {
            return EmptyList.f38032a;
        }

        @Override // tm.InterfaceC9339a
        /* JADX INFO: renamed from: d */
        public final Collection mo13577d(DeserializedClassDescriptor deserializedClassDescriptor) {
            C5207g.m11111f(deserializedClassDescriptor, "classDescriptor");
            return EmptyList.f38032a;
        }

        @Override // tm.InterfaceC9339a
        /* JADX INFO: renamed from: e */
        public final Collection mo13578e(C7648e c7648e, DeserializedClassDescriptor deserializedClassDescriptor) {
            C5207g.m11111f(c7648e, "name");
            C5207g.m11111f(deserializedClassDescriptor, "classDescriptor");
            return EmptyList.f38032a;
        }
    }

    /* JADX INFO: renamed from: a */
    Collection mo13574a(DeserializedClassDescriptor deserializedClassDescriptor);

    /* JADX INFO: renamed from: c */
    Collection mo13576c(DeserializedClassDescriptor deserializedClassDescriptor);

    /* JADX INFO: renamed from: d */
    Collection mo13577d(DeserializedClassDescriptor deserializedClassDescriptor);

    /* JADX INFO: renamed from: e */
    Collection mo13578e(C7648e c7648e, DeserializedClassDescriptor deserializedClassDescriptor);
}
