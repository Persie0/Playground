package p021j$.util.concurrent;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: j$.util.concurrent.w */
/* JADX INFO: loaded from: classes3.dex */
final class C0545w implements PrivilegedAction {
    C0545w() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
