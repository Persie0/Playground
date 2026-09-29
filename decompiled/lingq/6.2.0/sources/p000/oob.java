package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oob {

    /* JADX INFO: renamed from: a */
    public static final C0282a f54661a = new C0282a(-1699567474, false, new z70(24));

    /* JADX INFO: renamed from: b */
    public static final C0282a f54662b = new C0282a(-1461905781, false, new z70(25));

    /* JADX INFO: renamed from: a */
    public static void m18190a(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* JADX INFO: renamed from: b */
    public static void m18191b(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
