package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.impl.constraints.AbstractC0776b;
import androidx.work.impl.constraints.C0775a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f57 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f38440a;

    public f57(w8a w8aVar) {
        w8aVar.getClass();
        String str = AbstractC0776b.f7235a;
        ArrayList arrayListM23608N = vz1.m23608N(new xb0(w8aVar.f66534b, 0), new xb0(w8aVar.f66535c), new xb0(w8aVar.f66536d, 2));
        Context context = w8aVar.f66533a;
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        arrayListM23608N.add(new C0775a((ConnectivityManager) systemService));
        this.f38440a = arrayListM23608N;
    }

    /* JADX INFO: renamed from: a */
    public void m11546a() {
        this.f38440a.add(m57.f50613c);
    }

    /* JADX INFO: renamed from: b */
    public void m11547b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f38440a.add(new n57(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: c */
    public void m11548c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f38440a.add(new v57(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: d */
    public void m11549d(float f) {
        this.f38440a.add(new o57(f));
    }

    /* JADX INFO: renamed from: e */
    public void m11550e(float f) {
        this.f38440a.add(new w57(f));
    }

    /* JADX INFO: renamed from: f */
    public void m11551f(float f, float f2) {
        this.f38440a.add(new p57(f, f2));
    }

    /* JADX INFO: renamed from: g */
    public void m11552g(float f, float f2) {
        this.f38440a.add(new x57(f, f2));
    }

    /* JADX INFO: renamed from: h */
    public void m11553h(float f, float f2) {
        this.f38440a.add(new q57(f, f2));
    }

    /* JADX INFO: renamed from: i */
    public void m11554i(float f, float f2, float f3, float f4) {
        this.f38440a.add(new s57(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: j */
    public void m11555j(float f, float f2, float f3, float f4) {
        this.f38440a.add(new a67(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: k */
    public void m11556k(float f) {
        this.f38440a.add(new d67(f));
    }

    /* JADX INFO: renamed from: l */
    public void m11557l(float f) {
        this.f38440a.add(new c67(f));
    }

    public f57() {
        this.f38440a = new ArrayList(32);
    }
}
