package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p356r5.InterfaceC8732b;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: f */
    public static final StackTraceElement[] f10673f = new StackTraceElement[0];

    /* JADX INFO: renamed from: a */
    public final List<Throwable> f10674a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8732b f10675b;

    /* JADX INFO: renamed from: c */
    public DataSource f10676c;

    /* JADX INFO: renamed from: d */
    public Class<?> f10677d;

    /* JADX INFO: renamed from: e */
    public final String f10678e;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C2114a implements Appendable {

        /* JADX INFO: renamed from: a */
        public final Appendable f10679a;

        /* JADX INFO: renamed from: b */
        public boolean f10680b = true;

        public C2114a(Appendable appendable) {
            this.f10679a = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c10) throws IOException {
            boolean z10 = this.f10680b;
            Appendable appendable = this.f10679a;
            boolean z11 = false;
            if (z10) {
                this.f10680b = false;
                appendable.append("  ");
            }
            if (c10 == '\n') {
                z11 = true;
            }
            this.f10680b = z11;
            appendable.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = this.f10680b;
            Appendable appendable = this.f10679a;
            boolean z11 = false;
            if (z10) {
                this.f10680b = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
                z11 = true;
            }
            this.f10680b = z11;
            appendable.append(charSequence, i10, i11);
            return this;
        }
    }

    public GlideException(String str) {
        this(Collections.emptyList(), str);
    }

    public GlideException(List list, String str) {
        this.f10678e = str;
        setStackTrace(f10673f);
        this.f10674a = list;
    }

    /* JADX INFO: renamed from: a */
    public static void m6299a(Throwable th2, ArrayList arrayList) {
        if (!(th2 instanceof GlideException)) {
            arrayList.add(th2);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th2).f10674a.iterator();
        while (it.hasNext()) {
            m6299a(it.next(), arrayList);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static void m6300b(List list, C2114a c2114a) {
        try {
            m6301c(list, c2114a);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6301c(List list, C2114a c2114a) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            c2114a.append("Cause (");
            int i11 = i10 + 1;
            c2114a.append(String.valueOf(i11));
            c2114a.append(" of ");
            c2114a.append(String.valueOf(size));
            c2114a.append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).m6304h(c2114a);
            } else {
                m6302d(th2, c2114a);
            }
            i10 = i11;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static void m6302d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6303e(String str) {
        ArrayList arrayList = new ArrayList();
        m6299a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f10678e);
        sb2.append(this.f10677d != null ? ", " + this.f10677d : "");
        sb2.append(this.f10676c != null ? ", " + this.f10676c : "");
        sb2.append(this.f10675b != null ? ", " + this.f10675b : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        m6299a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : arrayList) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: h */
    public final void m6304h(Appendable appendable) {
        m6302d(this, appendable);
        m6300b(this.f10674a, new C2114a(appendable));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        m6304h(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m6304h(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m6304h(printWriter);
    }
}
