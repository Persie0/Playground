package in;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: renamed from: in.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6364h {

    /* JADX INFO: renamed from: a */
    public static final c f36743a = new c(JvmPrimitiveType.BOOLEAN);

    /* JADX INFO: renamed from: b */
    public static final c f36744b = new c(JvmPrimitiveType.CHAR);

    /* JADX INFO: renamed from: c */
    public static final c f36745c = new c(JvmPrimitiveType.BYTE);

    /* JADX INFO: renamed from: d */
    public static final c f36746d = new c(JvmPrimitiveType.SHORT);

    /* JADX INFO: renamed from: e */
    public static final c f36747e = new c(JvmPrimitiveType.INT);

    /* JADX INFO: renamed from: f */
    public static final c f36748f = new c(JvmPrimitiveType.FLOAT);

    /* JADX INFO: renamed from: g */
    public static final c f36749g = new c(JvmPrimitiveType.LONG);

    /* JADX INFO: renamed from: h */
    public static final c f36750h = new c(JvmPrimitiveType.DOUBLE);

    /* JADX INFO: renamed from: in.h$a */
    public static final class a extends AbstractC6364h {

        /* JADX INFO: renamed from: i */
        public final AbstractC6364h f36751i;

        public a(AbstractC6364h abstractC6364h) {
            C5207g.m11111f(abstractC6364h, "elementType");
            this.f36751i = abstractC6364h;
        }
    }

    /* JADX INFO: renamed from: in.h$b */
    public static final class b extends AbstractC6364h {

        /* JADX INFO: renamed from: i */
        public final String f36752i;

        public b(String str) {
            C5207g.m11111f(str, "internalName");
            this.f36752i = str;
        }
    }

    /* JADX INFO: renamed from: in.h$c */
    public static final class c extends AbstractC6364h {

        /* JADX INFO: renamed from: i */
        public final JvmPrimitiveType f36753i;

        public c(JvmPrimitiveType jvmPrimitiveType) {
            this.f36753i = jvmPrimitiveType;
        }
    }

    public final String toString() {
        return C6365i.m12992e(this);
    }
}
