package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0a {

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f40034a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public void mo11430a(String str, Object... objArr) {
        m12273f(3, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: b */
    public void mo11431b(String str, Object... objArr) {
        m12273f(6, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: c */
    public void mo11432c(Throwable th) {
        m12273f(6, th, null, new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String mo10784d() {
        ThreadLocal threadLocal = this.f40034a;
        String str = (String) threadLocal.get();
        if (str != null) {
            threadLocal.remove();
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo10785e(String str, int i, String str2);

    /* JADX INFO: renamed from: f */
    public final void m12273f(int i, Throwable th, String str, Object... objArr) {
        String strMo10784d = mo10784d();
        if (str != null && str.length() != 0) {
            if (objArr.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) str);
                sb.append('\n');
                StringWriter stringWriter = new StringWriter(256);
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                string.getClass();
                sb.append(string);
                str = sb.toString();
            }
        } else {
            if (th == null) {
                return;
            }
            StringWriter stringWriter2 = new StringWriter(256);
            PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
            th.printStackTrace(printWriter2);
            printWriter2.flush();
            str = stringWriter2.toString();
            str.getClass();
        }
        mo10785e(strMo10784d, i, str);
    }

    /* JADX INFO: renamed from: g */
    public void mo11433g(String str, Object... objArr) {
        m12273f(5, null, str, Arrays.copyOf(objArr, objArr.length));
    }
}
