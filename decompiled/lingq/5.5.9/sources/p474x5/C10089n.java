package p474x5;

import java.util.ArrayDeque;
import p258m6.C7492l;

/* JADX INFO: renamed from: x5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C10089n<A, B> {

    /* JADX INFO: renamed from: a */
    public final C10088m f51174a = new C10088m();

    /* JADX INFO: renamed from: x5.n$a */
    public static final class a<A> {

        /* JADX INFO: renamed from: d */
        public static final ArrayDeque f51175d;

        /* JADX INFO: renamed from: a */
        public int f51176a;

        /* JADX INFO: renamed from: b */
        public int f51177b;

        /* JADX INFO: renamed from: c */
        public A f51178c;

        static {
            char[] cArr = C7492l.f41383a;
            f51175d = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static a m18938a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f51175d;
            synchronized (arrayDeque) {
                try {
                    aVar = (a) arrayDeque.poll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f51178c = obj;
            aVar.f51177b = 0;
            aVar.f51176a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f51177b == aVar.f51177b && this.f51176a == aVar.f51176a && this.f51178c.equals(aVar.f51178c);
        }

        public final int hashCode() {
            return this.f51178c.hashCode() + (((this.f51176a * 31) + this.f51177b) * 31);
        }
    }
}
