package p000;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsv extends Exception {

    /* JADX INFO: renamed from: a */
    private static final StackTraceElement[] f4385a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b */
    private final List f4386b;

    /* JADX INFO: renamed from: c */
    private bqn f4387c;

    /* JADX INFO: renamed from: d */
    private Class f4388d;

    /* JADX INFO: renamed from: e */
    private String f4389e;

    /* JADX INFO: renamed from: f */
    private int f4390f;

    public bsv(String str) {
        this(str, Collections.emptyList());
    }

    /* JADX INFO: renamed from: c */
    private final void m3021c(Throwable th, List list) {
        if (!(th instanceof bsv)) {
            list.add(th);
            return;
        }
        Iterator it = ((bsv) th).f4386b.iterator();
        while (it.hasNext()) {
            m3021c((Throwable) it.next(), list);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m3023e(Appendable appendable) {
        m3022d(this, appendable);
        List list = this.f4386b;
        bsu bsuVar = new bsu(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                bsuVar.append("Cause (");
                int i2 = i + 1;
                bsuVar.append(String.valueOf(i2));
                bsuVar.append(" of ");
                bsuVar.append(String.valueOf(size));
                bsuVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof bsv) {
                    ((bsv) th).m3023e(bsuVar);
                } else {
                    m3022d(th, bsuVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m3024a() {
        ArrayList arrayList = new ArrayList();
        m3021c(this, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    final void m3025b(bqn bqnVar, int i, Class cls) {
        this.f4387c = bqnVar;
        this.f4390f = i;
        this.f4388d = cls;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f4389e);
        Class cls = this.f4388d;
        sb.append(cls != null ? ", ".concat(cls.toString()) : "");
        int i = this.f4390f;
        sb.append(i != 0 ? ", ".concat(bzq.m3231D(i)) : "");
        bqn bqnVar = this.f4387c;
        sb.append(bqnVar != null ? ", ".concat(bqnVar.toString()) : "");
        List<Throwable> listM3024a = m3024a();
        if (listM3024a.isEmpty()) {
            return sb.toString();
        }
        if (listM3024a.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listM3024a.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listM3024a) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        m3023e(System.err);
    }

    public bsv(String str, List list) {
        this.f4389e = str;
        setStackTrace(f4385a);
        this.f4386b = list;
    }

    /* JADX INFO: renamed from: d */
    private static void m3022d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException e) {
            throw new RuntimeException(th);
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m3023e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m3023e(printWriter);
    }
}
