package p000;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.foundation.text.selection.CrossStatus;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x44 {

    /* JADX INFO: renamed from: e */
    public static final String[] f67749e = {"facebook", "instagram", "facebooklite"};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67750a;

    /* JADX INFO: renamed from: b */
    public boolean f67751b;

    /* JADX INFO: renamed from: c */
    public Object f67752c;

    /* JADX INFO: renamed from: d */
    public Object f67753d;

    public x44(int i) {
        this.f67750a = i;
        switch (i) {
            case 4:
                this.f67752c = new Object();
                break;
            default:
                this.f67751b = true;
                this.f67752c = f67749e;
                this.f67753d = "";
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m24264a(long j) {
        Object obj;
        List list = (List) ((fs6) this.f67753d).f39590b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (pk9.m19371i(((mg7) obj).f51291a, j)) {
                break;
            }
            i++;
        }
        mg7 mg7Var = (mg7) obj;
        if (mg7Var != null) {
            return mg7Var.f51298h;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public CrossStatus m24265b() {
        pj3 pj3Var = (pj3) this.f67753d;
        int i = pj3Var.f56311b;
        int i2 = pj3Var.f56312c;
        if (i < i2) {
            return CrossStatus.NOT_CROSSED;
        }
        return i > i2 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    /* JADX INFO: renamed from: c */
    public void m24266c() {
        if (this.f67751b) {
            C0205f.m1101b((C0205f) this.f67753d, (cx9) this.f67752c);
        }
    }

    /* JADX INFO: renamed from: d */
    public long m24267d(vv9 vv9Var, long j, boolean z, ij6 ij6Var) {
        C0205f c0205f = (C0205f) this.f67753d;
        long jM1102c = C0205f.m1102c(c0205f, vv9Var, j, z, false, ij6Var, false, null);
        if (!cx9.m9919a((cx9) this.f67752c, jM1102c)) {
            this.f67751b = false;
        }
        c0205f.m1117r(cx9.m9921c(jM1102c) ? HandleState.Cursor : HandleState.Selection);
        return jM1102c;
    }

    /* JADX INFO: renamed from: e */
    public void m24268e(rbd rbdVar) {
        synchronized (this.f67752c) {
            try {
                if (((ArrayDeque) this.f67753d) == null) {
                    this.f67753d = new ArrayDeque();
                }
                ((ArrayDeque) this.f67753d).add(rbdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m24269f(Task task) {
        rbd rbdVar;
        synchronized (this.f67752c) {
            if (((ArrayDeque) this.f67753d) != null && !this.f67751b) {
                this.f67751b = true;
                while (true) {
                    synchronized (this.f67752c) {
                        try {
                            rbdVar = (rbd) ((ArrayDeque) this.f67753d).poll();
                            if (rbdVar == null) {
                                this.f67751b = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    rbdVar.mo318a(task);
                }
            }
        }
    }

    public String toString() {
        switch (this.f67750a) {
            case 2:
                return "SingleSelectionLayout(isStartHandle=" + this.f67751b + ", crossed=" + m24265b() + ", info=\n\t" + ((pj3) this.f67753d) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ x44(boolean z, Object obj, Object obj2, int i) {
        this.f67750a = i;
        this.f67751b = z;
        this.f67752c = obj;
        this.f67753d = obj2;
    }

    public x44(tk5 tk5Var, fs6 fs6Var) {
        this.f67750a = 1;
        this.f67752c = tk5Var;
        this.f67753d = fs6Var;
    }

    public x44(C0205f c0205f) {
        this.f67750a = 3;
        this.f67753d = c0205f;
        this.f67751b = true;
    }
}
