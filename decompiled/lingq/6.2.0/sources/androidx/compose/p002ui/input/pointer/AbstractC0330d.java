package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.viewinterop.AbstractC0442b;
import p000.e16;
import p000.pg7;
import p000.ri0;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0330d {
    /* JADX INFO: renamed from: a */
    public static final e16 m1467a(e16 e16Var, AbstractC0442b abstractC0442b) {
        pg7 pg7Var = new pg7();
        pg7Var.f56185a = new PointerInteropFilter_androidKt$pointerInteropFilter$3(abstractC0442b);
        ri0 ri0Var = new ri0();
        ri0 ri0Var2 = pg7Var.f56186b;
        if (ri0Var2 != null) {
            ri0Var2.f59343b = null;
        }
        pg7Var.f56186b = ri0Var;
        ri0Var.f59343b = pg7Var;
        abstractC0442b.setOnRequestDisallowInterceptTouchEvent$ui(ri0Var);
        return e16Var.mo3161g(pg7Var);
    }
}
