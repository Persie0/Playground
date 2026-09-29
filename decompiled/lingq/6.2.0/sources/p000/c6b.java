package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c6b {

    /* JADX INFO: renamed from: b */
    public static final f6b f9645b;

    /* JADX INFO: renamed from: a */
    public final f6b f9646a;

    static {
        t5b o5bVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            o5bVar = new s5b();
        } else if (i >= 35) {
            o5bVar = new r5b();
        } else if (i >= 34) {
            o5bVar = new q5b();
        } else if (i >= 31) {
            o5bVar = new p5b();
        } else {
            o5bVar = i >= 30 ? new o5b() : new n5b();
        }
        f9645b = o5bVar.mo17237b().f38536a.mo4360a().f38536a.mo4361b().f38536a.mo4362c();
    }

    public c6b(f6b f6bVar) {
        this.f9646a = f6bVar;
    }

    /* JADX INFO: renamed from: A */
    public void mo4358A(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: B */
    public void mo4359B(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: a */
    public f6b mo4360a() {
        return this.f9646a;
    }

    /* JADX INFO: renamed from: b */
    public f6b mo4361b() {
        return this.f9646a;
    }

    /* JADX INFO: renamed from: c */
    public f6b mo4362c() {
        return this.f9646a;
    }

    /* JADX INFO: renamed from: d */
    public void mo4363d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public void mo4364e(f6b f6bVar) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6b)) {
            return false;
        }
        c6b c6bVar = (c6b) obj;
        return mo4373t() == c6bVar.mo4373t() && mo4372s() == c6bVar.mo4372s() && Objects.equals(mo4369n(), c6bVar.mo4369n()) && Objects.equals(mo4367l(), c6bVar.mo4367l()) && Objects.equals(mo4365h(), c6bVar.mo4365h());
    }

    /* JADX INFO: renamed from: f */
    public List<Rect> mo3378f(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: g */
    public List<Rect> mo3379g(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: h */
    public rh2 mo4365h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo4373t()), Boolean.valueOf(mo4372s()), mo4369n(), mo4367l(), mo4365h());
    }

    /* JADX INFO: renamed from: i */
    public l64 mo136i(int i) {
        return l64.f49115e;
    }

    /* JADX INFO: renamed from: j */
    public l64 mo137j(int i) {
        if ((i & 8) == 0) {
            return l64.f49115e;
        }
        C3386nv.m17626m("Unable to query the maximum insets for IME");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public l64 mo4366k() {
        return mo4369n();
    }

    /* JADX INFO: renamed from: l */
    public l64 mo4367l() {
        return l64.f49115e;
    }

    /* JADX INFO: renamed from: m */
    public l64 mo4368m() {
        return mo4369n();
    }

    /* JADX INFO: renamed from: n */
    public l64 mo4369n() {
        return l64.f49115e;
    }

    /* JADX INFO: renamed from: o */
    public l64 mo4370o() {
        return mo4369n();
    }

    /* JADX INFO: renamed from: p */
    public void mo138p(View view) {
    }

    /* JADX INFO: renamed from: q */
    public void mo3380q() {
    }

    /* JADX INFO: renamed from: r */
    public f6b mo4371r(int i, int i2, int i3, int i4) {
        return f9645b;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo4372s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean mo4373t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo139u(int i) {
        return true;
    }

    /* JADX INFO: renamed from: v */
    public void mo4374v(th2 th2Var) {
    }

    /* JADX INFO: renamed from: w */
    public void mo4375w(l64[] l64VarArr) {
    }

    /* JADX INFO: renamed from: x */
    public void mo4376x(l64 l64Var) {
    }

    /* JADX INFO: renamed from: y */
    public void mo4377y(f6b f6bVar) {
    }

    /* JADX INFO: renamed from: z */
    public void mo4378z(int i) {
    }
}
