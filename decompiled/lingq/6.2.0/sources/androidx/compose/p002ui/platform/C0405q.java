package androidx.compose.p002ui.platform;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import p000.c28;
import p000.fa4;
import p000.m2b;
import p000.to6;
import p000.ui3;
import p000.uo6;
import p000.vi3;
import p000.x66;
import p000.xfa;
import p000.zw4;

/* JADX INFO: renamed from: androidx.compose.ui.platform.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0405q {

    /* JADX INFO: renamed from: a */
    public final zw4 f4856a;

    /* JADX INFO: renamed from: b */
    public final ui3 f4857b;

    /* JADX INFO: renamed from: c */
    public final Object f4858c = new Object();

    /* JADX INFO: renamed from: d */
    public final x66 f4859d = new x66(new m2b[16]);

    /* JADX INFO: renamed from: e */
    public boolean f4860e;

    public C0405q(zw4 zw4Var, ui3 ui3Var) {
        this.f4856a = zw4Var;
        this.f4857b = ui3Var;
    }

    /* JADX INFO: renamed from: a */
    public final to6 m1813a(EditorInfo editorInfo) {
        synchronized (this.f4858c) {
            if (this.f4860e) {
                return null;
            }
            c28 c28VarM25811a = this.f4856a.m25811a(editorInfo);
            vi3 vi3Var = new vi3() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    to6 to6Var = (to6) obj;
                    c28 c28Var = to6Var.f62644b;
                    if (c28Var != null) {
                        c28Var.closeConnection();
                        to6Var.f62644b = null;
                    }
                    C0405q c0405q = this.f4579b;
                    x66 x66Var = c0405q.f4859d;
                    Object[] objArr = x66Var.f67830a;
                    int i = x66Var.f67832c;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            i2 = -1;
                            break;
                        }
                        if (fa4.m11650l((m2b) objArr[i2], to6Var)) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 >= 0) {
                        x66Var.m24314l(i2);
                    }
                    if (x66Var.f67832c == 0) {
                        ((AndroidPlatformTextInputSession$startInputMethod$2.C03781) c0405q.f4857b).mo0a();
                    }
                    return xfa.f68157a;
                }
            };
            to6 uo6Var = Build.VERSION.SDK_INT >= 34 ? new uo6(c28VarM25811a, vi3Var) : new to6(c28VarM25811a, vi3Var);
            this.f4859d.m24305c(new m2b(uo6Var));
            return uo6Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1814b() {
        return !this.f4860e;
    }
}
