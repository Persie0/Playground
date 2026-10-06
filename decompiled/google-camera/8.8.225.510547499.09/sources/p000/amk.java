package p000;

import android.content.Context;
import android.os.Looper;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class amk {

    /* JADX INFO: renamed from: b */
    public int f699b;

    /* JADX INFO: renamed from: c */
    public final Context f700c;

    /* JADX INFO: renamed from: d */
    public boolean f701d = false;

    /* JADX INFO: renamed from: e */
    public boolean f702e = false;

    /* JADX INFO: renamed from: f */
    public boolean f703f = true;

    /* JADX INFO: renamed from: g */
    public boolean f704g = false;

    /* JADX INFO: renamed from: h */
    public ame f705h;

    public amk(Context context) {
        this.f700c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: j */
    public static final String m954j(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    protected void mo950c() {
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public void mo952e(String str, PrintWriter printWriter) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public void mo953f() {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public void mo955g(Object obj) {
        ame ameVar = this.f705h;
        if (ameVar != null) {
            if (amd.m937b(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(ameVar);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ameVar.mo904g(obj);
            } else {
                ameVar.m905h(obj);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo956h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo957i() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.f699b);
        sb.append("}");
        return sb.toString();
    }
}
