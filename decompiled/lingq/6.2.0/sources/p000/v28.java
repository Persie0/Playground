package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class v28 {

    /* JADX INFO: renamed from: a */
    public o28 f64742a;

    /* JADX INFO: renamed from: b */
    public ArrayList f64743b;

    /* JADX INFO: renamed from: c */
    public long f64744c;

    /* JADX INFO: renamed from: d */
    public long f64745d;

    /* JADX INFO: renamed from: e */
    public long f64746e;

    /* JADX INFO: renamed from: f */
    public long f64747f;

    /* JADX INFO: renamed from: b */
    public static void m23067b(o38 o38Var) {
        int i = o38Var.f53790j;
        if (!o38Var.m17788h() && (i & 4) == 0) {
            o38Var.m17782b();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo150a(o38 o38Var, o38 o38Var2, xp7 xp7Var, xp7 xp7Var2);

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x007c, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m23068c(o38 o38Var) {
        o28 o28Var = this.f64742a;
        if (o28Var != null) {
            RecyclerView recyclerView = o28Var.f53654a;
            boolean z = true;
            o38Var.m17796p(true);
            View view = o38Var.f53781a;
            if (o38Var.f53788h != null && o38Var.f53789i == null) {
                o38Var.f53788h = null;
            }
            o38Var.f53789i = null;
            if ((o38Var.f53790j & 16) != 0) {
                return;
            }
            g38 g38Var = recyclerView.f6647c;
            recyclerView.m2749m0();
            u8a u8aVar = recyclerView.f6653f;
            s01 s01Var = (s01) u8aVar.f63595d;
            n28 n28Var = (n28) u8aVar.f63594c;
            int i = u8aVar.f63593b;
            if (i != 1) {
                if (i == 2) {
                    C3386nv.m17633t("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    u8aVar.f63593b = 2;
                    int iIndexOfChild = n28Var.f52241a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        u8aVar.m22564y(view);
                    } else if (s01Var.m20993d(iIndexOfChild)) {
                        s01Var.m20996h(iIndexOfChild);
                        u8aVar.m22564y(view);
                        n28Var.m17191c(iIndexOfChild);
                    } else {
                        u8aVar.f63593b = 0;
                    }
                    u8aVar.f63593b = 0;
                    if (z) {
                        o38 o38VarM2699N = RecyclerView.m2699N(view);
                        g38Var.m12341m(o38VarM2699N);
                        g38Var.m12338j(o38VarM2699N);
                        if (RecyclerView.f6596Y0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.m2752o0(!z);
                    if (z && o38Var.m17792l()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    u8aVar.f63593b = 0;
                    throw th;
                }
            }
            if (((View) u8aVar.f63597f) != view) {
                C3386nv.m17633t("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
                o38 o38VarM2699N2 = RecyclerView.m2699N(view);
                g38Var.m12341m(o38VarM2699N2);
                g38Var.m12338j(o38VarM2699N2);
                if (RecyclerView.f6596Y0) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.m2752o0(!z);
            if (z) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo151d(o38 o38Var);

    /* JADX INFO: renamed from: e */
    public abstract void mo152e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo153f();
}
