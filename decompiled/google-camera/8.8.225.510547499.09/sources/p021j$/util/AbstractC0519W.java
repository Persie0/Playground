package p021j$.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: renamed from: j$.util.W */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0519W {

    /* JADX INFO: renamed from: a */
    static final boolean f33172a = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: j$.util.V
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    })).booleanValue();

    /* JADX INFO: renamed from: a */
    static void m12525a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
