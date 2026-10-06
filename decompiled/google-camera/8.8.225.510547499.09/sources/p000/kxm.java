package p000;

import java.util.Stack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxm {

    /* JADX INFO: renamed from: d */
    private static final Runtime f37654d = Runtime.getRuntime();

    /* JADX INFO: renamed from: a */
    public final long f37655a = Runtime.getRuntime().maxMemory();

    /* JADX INFO: renamed from: b */
    public final Stack f37656b = new Stack();

    /* JADX INFO: renamed from: c */
    public long f37657c;

    /* JADX INFO: renamed from: a */
    public static float m15034a() {
        Runtime runtime = f37654d;
        return (runtime.totalMemory() - runtime.freeMemory()) / runtime.maxMemory();
    }
}
