package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0855m {

    /* JADX INFO: renamed from: b */
    public static volatile C0855m f5904b;

    /* JADX INFO: renamed from: c */
    public static final C0855m f5905c;

    /* JADX INFO: renamed from: a */
    public final Map<a, GeneratedMessageLite.C0815e<?, ?>> f5906a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f5907a;

        /* JADX INFO: renamed from: b */
        public final int f5908b;

        public a(int i10, Object obj) {
            this.f5907a = obj;
            this.f5908b = i10;
        }

        public final boolean equals(Object obj) {
            boolean z10 = false;
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f5907a == aVar.f5907a && this.f5908b == aVar.f5908b) {
                z10 = true;
            }
            return z10;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f5907a) * 65535) + this.f5908b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f5905c = new C0855m(0);
    }

    public C0855m() {
        this.f5906a = new HashMap();
    }

    public C0855m(int i10) {
        this.f5906a = Collections.emptyMap();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C0855m m3406a() {
        C0855m c0855m = f5904b;
        if (c0855m == null) {
            synchronized (C0855m.class) {
                c0855m = f5904b;
                if (c0855m == null) {
                    Class<?> cls = C0853l.f5884a;
                    if (cls != null) {
                        try {
                            c0855m = (C0855m) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                            c0855m = f5905c;
                        }
                    } else {
                        c0855m = f5905c;
                    }
                    f5904b = c0855m;
                }
            }
        }
        return c0855m;
    }
}
