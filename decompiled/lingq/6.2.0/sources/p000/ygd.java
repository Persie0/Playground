package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ygd {
    /* JADX INFO: renamed from: a */
    public static final String m25141a(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }
}
