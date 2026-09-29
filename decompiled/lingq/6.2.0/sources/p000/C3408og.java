package p000;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.spatial.C0429a;

/* JADX INFO: renamed from: og */
/* JADX INFO: loaded from: classes.dex */
public final class C3408og extends z50 implements t93 {

    /* JADX INFO: renamed from: a */
    public final fs6 f54290a;

    /* JADX INFO: renamed from: b */
    public final sv8 f54291b;

    /* JADX INFO: renamed from: c */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f54292c;

    /* JADX INFO: renamed from: d */
    public final C0429a f54293d;

    /* JADX INFO: renamed from: e */
    public final String f54294e;

    /* JADX INFO: renamed from: f */
    public final Rect f54295f = new Rect();

    /* JADX INFO: renamed from: g */
    public final AutofillId f54296g;

    /* JADX INFO: renamed from: h */
    public final u56 f54297h;

    /* JADX INFO: renamed from: i */
    public boolean f54298i;

    public C3408og(fs6 fs6Var, sv8 sv8Var, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, C0429a c0429a, String str) {
        this.f54290a = fs6Var;
        this.f54291b = sv8Var;
        this.f54292c = viewTreeObserverOnGlobalLayoutListenerC0391c;
        this.f54293d = c0429a;
        this.f54294e = str;
        viewTreeObserverOnGlobalLayoutListenerC0391c.setImportantForAutofill(1);
        AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC0391c.getAutofillId();
        if (autofillId == null) {
            throw AbstractC3393o1.m17745t("Required value was null.");
        }
        this.f54296g = autofillId;
        this.f54297h = new u56();
    }

    @Override // p000.t93
    /* JADX INFO: renamed from: a */
    public final void mo1745a(C0302d c0302d, C0302d c0302d2) {
        C0357g c0357gM21979L;
        kv8 kv8VarM1613z;
        C0357g c0357gM21979L2;
        kv8 kv8VarM1613z2;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f54292c;
        fs6 fs6Var = this.f54290a;
        if (c0302d != null && (c0357gM21979L2 = te1.m21979L(c0302d)) != null && (kv8VarM1613z2 = c0357gM21979L2.m1613z()) != null && omd.m18158n(kv8VarM1613z2)) {
            fs6Var.m12115v().notifyViewExited(viewTreeObserverOnGlobalLayoutListenerC0391c, c0357gM21979L2.f4336b);
        }
        if (c0302d2 == null || (c0357gM21979L = te1.m21979L(c0302d2)) == null || (kv8VarM1613z = c0357gM21979L.m1613z()) == null || !omd.m18158n(kv8VarM1613z)) {
            return;
        }
        int i = c0357gM21979L.f4336b;
        C0429a c0429a = this.f54293d;
        C0357g c0357g = (C0357g) c0429a.f5029a.m10152b(i);
        if (c0357g == null || c0357g.f4346g == -4) {
            return;
        }
        C3047gq c3047gq = c0429a.f5031c;
        int iM1876e = c0429a.m1876e(c0357g);
        long[] jArr = (long[]) c3047gq.f41172c;
        long j = jArr[iM1876e];
        long j2 = jArr[iM1876e + 1];
        fs6Var.m12115v().notifyViewEntered(viewTreeObserverOnGlobalLayoutListenerC0391c, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
