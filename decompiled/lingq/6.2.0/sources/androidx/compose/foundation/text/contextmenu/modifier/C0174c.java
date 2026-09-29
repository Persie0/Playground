package androidx.compose.foundation.text.contextmenu.modifier;

import kotlinx.coroutines.CoroutineStart;
import p000.kt9;
import p000.l54;
import p000.lt9;
import p000.pg9;
import p000.qt9;
import p000.thb;
import p000.wfb;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0174c {

    /* JADX INFO: renamed from: a */
    public qt9 f2882a;

    /* JADX INFO: renamed from: b */
    public ToolbarHandlerState f2883b;

    /* JADX INFO: renamed from: a */
    public final void m1066a() {
        kt9 kt9Var;
        if (this.f2883b == ToolbarHandlerState.Uninitialized) {
            l54.m15816c("ToolbarRequester is not initialized.");
        }
        qt9 qt9Var = this.f2882a;
        if (qt9Var == null || !qt9Var.f34836I) {
            return;
        }
        pg9 pg9Var = qt9Var.f58196P;
        if ((pg9Var == null || !pg9Var.mo4538b()) && (kt9Var = (kt9) thb.m22050i(qt9Var, lt9.f50119b)) != null) {
            qt9Var.f58196P = wfb.m23926u(qt9Var.m9971N0(), null, CoroutineStart.UNDISPATCHED, new TextContextMenuToolbarHandlerNode$show$1(qt9Var, kt9Var, null), 1);
        }
    }
}
