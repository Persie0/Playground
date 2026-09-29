package p352r1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p017ui.platform.AndroidComposeView;
import dm.C5207g;
import p471x2.C10067u0;
import p521z1.InterfaceC10429c;

/* JADX INFO: renamed from: r1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C8709j {

    /* JADX INFO: renamed from: a */
    public final View f46300a;

    /* JADX INFO: renamed from: b */
    public C8708i f46301b;

    public C8709j(AndroidComposeView androidComposeView) {
        C5207g.m11111f(androidComposeView, "view");
        this.f46300a = androidComposeView;
    }

    /* JADX INFO: renamed from: a */
    public final C10067u0 m16953a() {
        Window window;
        View view = this.f46300a;
        ViewParent parent = view.getParent();
        InterfaceC10429c interfaceC10429c = parent instanceof InterfaceC10429c ? (InterfaceC10429c) parent : null;
        if (interfaceC10429c != null && (window = interfaceC10429c.m19404a()) != null) {
            break;
            break;
        }
        Context context = view.getContext();
        C5207g.m11110e(context, "context");
        while (true) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    window = null;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
                C5207g.m11110e(context, "baseContext");
            } else {
                window = ((Activity) context).getWindow();
                break;
            }
        }
        return window != null ? new C10067u0(window, view) : null;
    }

    /* JADX INFO: renamed from: b */
    public void m16954b(InputMethodManager inputMethodManager) {
        C5207g.m11111f(inputMethodManager, "imm");
        C10067u0 c10067u0M16953a = m16953a();
        if (c10067u0M16953a != null) {
            c10067u0M16953a.f51112a.mo18906a();
            return;
        }
        C8708i c8708i = this.f46301b;
        if (c8708i == null) {
            c8708i = new C8708i(this.f46300a);
            this.f46301b = c8708i;
        }
        c8708i.m16951a(inputMethodManager);
    }

    /* JADX INFO: renamed from: c */
    public void m16955c(InputMethodManager inputMethodManager) {
        C5207g.m11111f(inputMethodManager, "imm");
        C10067u0 c10067u0M16953a = m16953a();
        if (c10067u0M16953a != null) {
            c10067u0M16953a.f51112a.mo18907e();
            return;
        }
        C8708i c8708i = this.f46301b;
        if (c8708i == null) {
            c8708i = new C8708i(this.f46300a);
            this.f46301b = c8708i;
        }
        c8708i.m16952b(inputMethodManager);
    }
}
