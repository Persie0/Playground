package p000;

import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class ih5 extends w56 {

    /* JADX INFO: renamed from: l */
    public final leb f44109l;

    /* JADX INFO: renamed from: m */
    public ub5 f44110m;

    /* JADX INFO: renamed from: n */
    public jh5 f44111n;

    public ih5(leb lebVar) {
        this.f44109l = lebVar;
        if (lebVar.f49565a == null) {
            lebVar.f49565a = this;
        } else {
            C3386nv.m17633t("There is already a listener registered");
            throw null;
        }
    }

    @Override // p000.w56
    /* JADX INFO: renamed from: e */
    public final void mo13908e() {
        leb lebVar = this.f44109l;
        lebVar.f49566b = true;
        lebVar.f49568d = false;
        lebVar.f49567c = false;
        lebVar.f49573i.drainPermits();
        lebVar.m16154c();
    }

    @Override // p000.w56
    /* JADX INFO: renamed from: f */
    public final void mo13909f() {
        this.f44109l.f49566b = false;
    }

    @Override // p000.w56
    /* JADX INFO: renamed from: h */
    public final void mo13910h(op6 op6Var) {
        super.mo13910h(op6Var);
        this.f44110m = null;
        this.f44111n = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m13911j() {
        leb lebVar = this.f44109l;
        lebVar.m16152a();
        lebVar.f49567c = true;
        jh5 jh5Var = this.f44111n;
        if (jh5Var != null) {
            mo13910h(jh5Var);
        }
        ih5 ih5Var = lebVar.f49565a;
        if (ih5Var == null) {
            C3386nv.m17633t("No listener register");
            return;
        }
        if (ih5Var != this) {
            C3386nv.m17626m("Attempting to unregister the wrong listener");
            return;
        }
        lebVar.f49565a = null;
        if (jh5Var != null) {
            boolean z = jh5Var.f45547b;
        }
        lebVar.f49568d = true;
        lebVar.f49566b = false;
        lebVar.f49567c = false;
        lebVar.f49569e = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m13912k(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(0);
        printWriter.print(" mArgs=");
        printWriter.println((Object) null);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.f44109l);
        leb lebVar = this.f44109l;
        String strConcat = str.concat("  ");
        lebVar.getClass();
        printWriter.print(strConcat);
        printWriter.print("mId=");
        printWriter.print(0);
        printWriter.print(" mListener=");
        printWriter.println(lebVar.f49565a);
        if (lebVar.f49566b || lebVar.f49569e) {
            printWriter.print(strConcat);
            printWriter.print("mStarted=");
            printWriter.print(lebVar.f49566b);
            printWriter.print(" mContentChanged=");
            printWriter.print(lebVar.f49569e);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (lebVar.f49567c || lebVar.f49568d) {
            printWriter.print(strConcat);
            printWriter.print("mAbandoned=");
            printWriter.print(lebVar.f49567c);
            printWriter.print(" mReset=");
            printWriter.println(lebVar.f49568d);
        }
        if (lebVar.f49571g != null) {
            printWriter.print(strConcat);
            printWriter.print("mTask=");
            printWriter.print(lebVar.f49571g);
            printWriter.print(" waiting=");
            lebVar.f49571g.getClass();
            printWriter.println(false);
        }
        if (lebVar.f49572h != null) {
            printWriter.print(strConcat);
            printWriter.print("mCancellingTask=");
            printWriter.print(lebVar.f49572h);
            printWriter.print(" waiting=");
            lebVar.f49572h.getClass();
            printWriter.println(false);
        }
        if (this.f44111n != null) {
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f44111n);
            jh5 jh5Var = this.f44111n;
            String strConcat2 = str.concat("  ");
            jh5Var.getClass();
            printWriter.print(strConcat2);
            printWriter.print("mDeliveredData=");
            printWriter.println(jh5Var.f45547b);
        }
        printWriter.print(str);
        printWriter.print("mData=");
        leb lebVar2 = this.f44109l;
        Object obj = this.f66421e;
        Object obj2 = obj != w56.f66416k ? obj : null;
        lebVar2.getClass();
        StringBuilder sb = new StringBuilder(64);
        if (obj2 == null) {
            sb.append("null");
        } else {
            Class<?> cls = obj2.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        printWriter.println(sb.toString());
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.println(this.f66419c > 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m13913l() {
        ub5 ub5Var = this.f44110m;
        jh5 jh5Var = this.f44111n;
        if (ub5Var == null || jh5Var == null) {
            return;
        }
        super.mo13910h(jh5Var);
        m23763d(ub5Var, jh5Var);
    }

    /* JADX INFO: renamed from: m */
    public final leb m13914m(ub5 ub5Var, jh9 jh9Var) {
        leb lebVar = this.f44109l;
        jh5 jh5Var = new jh5(lebVar, jh9Var);
        m23763d(ub5Var, jh5Var);
        op6 op6Var = this.f44111n;
        if (op6Var != null) {
            mo13910h(op6Var);
        }
        this.f44110m = ub5Var;
        this.f44111n = jh5Var;
        return lebVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.f44109l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
