package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ney implements nex {
    /* JADX INFO: renamed from: c */
    private static final int m17430c(StackTraceElement[] stackTraceElementArr, Class cls) {
        String name = cls.getName();
        boolean z = false;
        for (int i = 3; i < stackTraceElementArr.length; i++) {
            if (stackTraceElementArr[i].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.nex
    /* JADX INFO: renamed from: a */
    public final StackTraceElement mo17428a(Class cls) {
        nea.m17395i(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iM17430c = m17430c(stackTrace, cls);
        if (iM17430c != -1) {
            return stackTrace[iM17430c];
        }
        return null;
    }

    @Override // p000.nex
    /* JADX INFO: renamed from: b */
    public final StackTraceElement[] mo17429b(Class cls, int i) {
        boolean z = i == -1 || i > 0;
        nea.m17395i(z, "maxDepth must be > 0 or -1");
        nea.m17395i(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iM17430c = m17430c(stackTrace, cls);
        if (iM17430c == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - iM17430c;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, iM17430c, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
