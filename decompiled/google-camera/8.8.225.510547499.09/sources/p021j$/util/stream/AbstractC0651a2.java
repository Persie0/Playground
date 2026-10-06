package p021j$.util.stream;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: renamed from: j$.util.stream.a2 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0651a2 {

    /* JADX INFO: renamed from: a */
    static final boolean f33376a = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: j$.util.stream.Z1
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    })).booleanValue();

    /* JADX INFO: renamed from: a */
    static void m12681a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
