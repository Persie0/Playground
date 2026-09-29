package p000;

import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iob {

    /* JADX INFO: renamed from: a */
    public static ClassLoader f44381a;

    /* JADX INFO: renamed from: b */
    public static Thread f44382b;

    /* JADX INFO: renamed from: c */
    public static final C0282a f44383c = new C0282a(-1654263583, false, new jd1(16));

    /* JADX INFO: renamed from: d */
    public static final C0282a f44384d = new C0282a(-543773991, false, new jd1(17));

    /* JADX INFO: renamed from: a */
    public static int m14057a(doa doaVar, boolean z) {
        int i = doaVar.f35972b;
        int i2 = doaVar.f35973c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) doaVar.f35974d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b2 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
      0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static synchronized ClassLoader m14058b() {
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        if (f44381a == null) {
            Thread thread2 = f44382b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f44382b.getContextClassLoader();
                    } catch (SecurityException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                f44381a = contextClassLoader;
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
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        jfb jfbVar = new jfb(threadGroup, "GmsDynamite");
                                        try {
                                            jfbVar.setContextClassLoader(null);
                                            jfbVar.start();
                                            thread = jfbVar;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = jfbVar;
                                            String message2 = e.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (SecurityException e5) {
                            e = e5;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                f44382b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f44382b.getContextClassLoader();
                    }
                }
                f44381a = contextClassLoader;
            }
        }
        return f44381a;
    }
}
