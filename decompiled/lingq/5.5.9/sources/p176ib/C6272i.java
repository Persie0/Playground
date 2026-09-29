package p176ib;

import android.os.Looper;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: ib.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6272i {
    /* JADX INFO: renamed from: a */
    public static void m12907a(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static void m12908b(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12909c(HandlerC9517f handlerC9517f) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handlerC9517f.getLooper()) {
            throw new IllegalStateException(C0166e.m766l("Must be called on ", handlerC9517f.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", "."));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static void m12910d(HandlerC9517f handlerC9517f, String str) {
        if (Looper.myLooper() != handlerC9517f.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static void m12911e(String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    /* JADX INFO: renamed from: f */
    public static void m12912f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @EnsuresNonNull({"#1"})
    /* JADX INFO: renamed from: g */
    public static void m12913g(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public static void m12914h(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    /* JADX INFO: renamed from: i */
    public static void m12915i(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    @EnsuresNonNull({"#1"})
    /* JADX INFO: renamed from: j */
    public static void m12916j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public static void m12917k(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }
}
