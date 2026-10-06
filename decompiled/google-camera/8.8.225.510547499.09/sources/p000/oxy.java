package p000;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oxy {

    /* JADX INFO: renamed from: a */
    private static final String f46798a;

    /* JADX INFO: renamed from: b */
    private static final String f46799b;

    static {
        Object objM15591r;
        Object objM15591r2;
        try {
            objM15591r = Class.forName("omd").getCanonicalName();
        } catch (Throwable th) {
            objM15591r = lkm.m15591r(th);
        }
        if (okd.m18589a(objM15591r) != null) {
            objM15591r = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f46798a = (String) objM15591r;
        try {
            objM15591r2 = Class.forName("oxy").getCanonicalName();
        } catch (Throwable th2) {
            objM15591r2 = lkm.m15591r(th2);
        }
        if (okd.m18589a(objM15591r2) != null) {
            objM15591r2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f46799b = (String) objM15591r2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX INFO: renamed from: a */
    public static final Throwable m19156a(Throwable th, omg omgVar) {
        okb okbVarM15590q;
        Throwable cause = th.getCause();
        int i = 0;
        if (cause == null) {
            okbVarM15590q = lkm.m15590q(th, new StackTraceElement[0]);
        } else if (ooc.m18737c(cause.getClass(), th.getClass())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    okbVarM15590q = lkm.m15590q(th, new StackTraceElement[0]);
                    break;
                }
                if (m19159d(stackTrace[i2])) {
                    okbVarM15590q = lkm.m15590q(cause, stackTrace);
                    break;
                }
                i2++;
            }
        } else {
            okbVarM15590q = lkm.m15590q(th, new StackTraceElement[0]);
        }
        Throwable th2 = (Throwable) okbVarM15590q.f46186a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) okbVarM15590q.f46187b;
        Throwable thM19162g = m19162g(th2);
        if (thM19162g == null) {
            return th;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement stackTraceElementMo18652cM = omgVar.mo18652cM();
        if (stackTraceElementMo18652cM != null) {
            arrayDeque.add(stackTraceElementMo18652cM);
        }
        while (true) {
            if (true != (omgVar instanceof omg)) {
                omgVar = null;
            }
            if (omgVar == null || (omgVar = omgVar.mo18653g()) == null) {
                break;
            }
            StackTraceElement stackTraceElementMo18652cM2 = omgVar.mo18652cM();
            if (stackTraceElementMo18652cM2 != null) {
                arrayDeque.add(stackTraceElementMo18652cM2);
            }
        }
        if (arrayDeque.isEmpty()) {
            return th;
        }
        if (th2 != th) {
            int length2 = stackTraceElementArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    i3 = -1;
                    break;
                }
                if (m19159d(stackTraceElementArr[i3])) {
                    break;
                }
                i3++;
            }
            int i4 = i3 + 1;
            int length3 = stackTraceElementArr.length - 1;
            if (i4 <= length3) {
                while (true) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[length3];
                    StackTraceElement stackTraceElement2 = (StackTraceElement) arrayDeque.getLast();
                    if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && ooc.m18737c(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && ooc.m18737c(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && ooc.m18737c(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
                        arrayDeque.removeLast();
                    }
                    arrayDeque.addFirst(stackTraceElementArr[length3]);
                    if (length3 == i4) {
                        break;
                    }
                    length3--;
                }
            }
        }
        arrayDeque.addFirst(m19160e());
        StackTraceElement[] stackTrace2 = th2.getStackTrace();
        int iM19161f = m19161f(stackTrace2, f46798a);
        if (iM19161f == -1) {
            thM19162g.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
        } else {
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[arrayDeque.size() + iM19161f];
            for (int i5 = 0; i5 < iM19161f; i5++) {
                stackTraceElementArr2[i5] = stackTrace2[i5];
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                stackTraceElementArr2[i + iM19161f] = (StackTraceElement) it.next();
                i++;
            }
            thM19162g.setStackTrace(stackTraceElementArr2);
        }
        return thM19162g;
    }

    /* JADX INFO: renamed from: b */
    public static final Throwable m19157b(Throwable th) {
        Throwable thM19162g;
        if (!oqu.f46433b || (thM19162g = m19162g(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = thM19162g.getStackTrace();
        int length = stackTrace.length;
        int iM19161f = m19161f(stackTrace, f46799b);
        int i = iM19161f + 1;
        int iM19161f2 = m19161f(stackTrace, f46798a);
        int i2 = 0;
        int i3 = (length - iM19161f) - (iM19161f2 == -1 ? 0 : length - iM19161f2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i3];
        while (i2 < i3) {
            stackTraceElementArr[i2] = i2 == 0 ? m19160e() : stackTrace[(i + i2) - 1];
            i2++;
        }
        thM19162g.setStackTrace(stackTraceElementArr);
        return thM19162g;
    }

    /* JADX INFO: renamed from: c */
    public static final Throwable m19158c(Throwable th) {
        th.getClass();
        Throwable cause = th.getCause();
        if (cause != null) {
            if (ooc.m18737c(cause.getClass(), th.getClass())) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (m19159d(stackTraceElement)) {
                        return cause;
                    }
                }
                return th;
            }
        }
        return th;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m19159d(StackTraceElement stackTraceElement) {
        stackTraceElement.getClass();
        return ook.m18766D(stackTraceElement.getClassName(), "\b\b\b");
    }

    /* JADX INFO: renamed from: e */
    public static final StackTraceElement m19160e() {
        return new StackTraceElement("\b\b\b(Coroutine boundary", "\b", "\b", -1);
    }

    /* JADX INFO: renamed from: f */
    private static final int m19161f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (ooc.m18737c(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    private static final Throwable m19162g(Throwable th) {
        Object objM15591r;
        Throwable th2;
        oxe oxeVar = oxh.f46772a;
        th.getClass();
        boolean z = th instanceof oql;
        if (z) {
            try {
                objM15591r = ((oql) th).mo18910a();
            } catch (Throwable th3) {
                objM15591r = lkm.m15591r(th3);
            }
            if (true == (objM15591r instanceof okc)) {
                objM15591r = null;
            }
            th2 = (Throwable) objM15591r;
        } else {
            th2 = (Throwable) oxh.f46772a.mo19116a(th.getClass()).mo1803a(th);
        }
        if (th2 == null) {
            return null;
        }
        if (z || ooc.m18737c(th2.getMessage(), th.getMessage())) {
            return th2;
        }
        return null;
    }
}
