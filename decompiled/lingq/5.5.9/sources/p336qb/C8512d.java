package p336qb;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: qb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8512d {

    /* JADX INFO: renamed from: a */
    public static ClassLoader f45779a;

    /* JADX INFO: renamed from: b */
    public static Thread f45780b;

    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[PHI: r1
      0x00c7: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000e, B:46:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static synchronized ClassLoader m16618a() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        try {
            if (f45779a == null) {
                Thread thread2 = f45780b;
                ClassLoader contextClassLoader = null;
                if (thread2 != null) {
                    synchronized (thread2) {
                        try {
                            try {
                                contextClassLoader = f45780b.getContextClassLoader();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (SecurityException e11) {
                            Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e11.getMessage());
                        }
                    }
                    f45779a = contextClassLoader;
                } else {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int iActiveGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= iActiveGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i11];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i11++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int iActiveCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[iActiveCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i10 >= iActiveCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i10];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    if (thread == null) {
                                        try {
                                            C8511c c8511c = new C8511c(threadGroup);
                                            try {
                                                c8511c.setContextClassLoader(null);
                                                c8511c.start();
                                                thread = c8511c;
                                            } catch (SecurityException e12) {
                                                e10 = e12;
                                                thread = c8511c;
                                                Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                                            }
                                        } catch (SecurityException e13) {
                                            e10 = e13;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            } catch (SecurityException e14) {
                                e10 = e14;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    f45780b = thread2;
                    if (thread2 != null) {
                        synchronized (thread2) {
                            contextClassLoader = f45780b.getContextClassLoader();
                        }
                    }
                    f45779a = contextClassLoader;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f45779a;
    }
}
