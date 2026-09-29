package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.appcompat.view.menu.C0224f;
import p080e.LayoutInflaterFactory2C5275g;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.appcompat.widget.d0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0305d0 {
    /* JADX INFO: renamed from: a */
    boolean mo1134a();

    /* JADX INFO: renamed from: b */
    void mo1135b();

    /* JADX INFO: renamed from: c */
    void mo1136c(C0224f c0224f, LayoutInflaterFactory2C5275g.c cVar);

    void collapseActionView();

    /* JADX INFO: renamed from: d */
    boolean mo1137d();

    /* JADX INFO: renamed from: e */
    Context mo1138e();

    /* JADX INFO: renamed from: f */
    boolean mo1139f();

    /* JADX INFO: renamed from: g */
    boolean mo1140g();

    CharSequence getTitle();

    /* JADX INFO: renamed from: h */
    boolean mo1141h();

    /* JADX INFO: renamed from: i */
    void mo1142i();

    /* JADX INFO: renamed from: j */
    void mo1143j();

    /* JADX INFO: renamed from: k */
    boolean mo1144k();

    /* JADX INFO: renamed from: l */
    void mo1145l(int i10);

    /* JADX INFO: renamed from: m */
    void mo1146m();

    /* JADX INFO: renamed from: n */
    void mo1147n(int i10);

    /* JADX INFO: renamed from: o */
    void mo1148o();

    /* JADX INFO: renamed from: p */
    C10049l0 mo1149p(int i10, long j10);

    /* JADX INFO: renamed from: q */
    int mo1150q();

    /* JADX INFO: renamed from: r */
    void mo1151r();

    /* JADX INFO: renamed from: s */
    void mo1152s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* JADX INFO: renamed from: t */
    void mo1153t(boolean z10);
}
