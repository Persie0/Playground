package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6993d {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f39517b = 0;

    /* JADX INFO: renamed from: a */
    public final Map<a, GeneratedMessageLite.C6985e<?, ?>> f39518a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f39519a;

        /* JADX INFO: renamed from: b */
        public final int f39520b;

        public a(int i10, InterfaceC6997h interfaceC6997h) {
            this.f39519a = interfaceC6997h;
            this.f39520b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f39519a == aVar.f39519a && this.f39520b == aVar.f39520b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f39519a) * 65535) + this.f39520b;
        }
    }

    static {
        new C6993d(0);
    }

    public C6993d() {
        this.f39518a = new HashMap();
    }

    public C6993d(int i10) {
        this.f39518a = Collections.emptyMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m13958a(GeneratedMessageLite.C6985e<?, ?> c6985e) {
        this.f39518a.put(new a(c6985e.f39504d.f39497b, c6985e.f39501a), c6985e);
    }
}
