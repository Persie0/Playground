package p000;

import android.os.Trace;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0358h;
import androidx.work.impl.C0778d;
import androidx.work.impl.WorkerStoppedException;
import com.lingq.feature.reader.rating.p016ui.RatingContentType;

/* JADX INFO: renamed from: ek */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2967ek implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37372a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f37373b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37374c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f37375d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f37376e;

    public /* synthetic */ C2967ek(vi3 vi3Var, boolean z, ui3 ui3Var, t66 t66Var) {
        this.f37372a = 1;
        this.f37375d = vi3Var;
        this.f37373b = z;
        this.f37374c = ui3Var;
        this.f37376e = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f37372a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f37376e;
        Object obj3 = this.f37375d;
        boolean z = this.f37373b;
        Object obj4 = this.f37374c;
        switch (i) {
            case 0:
                C3185ki c3185ki = (C3185ki) obj3;
                qd0 qd0Var = (qd0) obj2;
                C0358h c0358h = (C0358h) obj;
                c0358h.m1614b();
                an0 an0Var = c0358h.f4358a;
                if (((Boolean) ((ui3) obj4).mo0a()).booleanValue()) {
                    if (z) {
                        long jMo1423z0 = an0Var.mo1423z0();
                        C3309ls c3309ls = an0Var.f853b;
                        long jM16483A = c3309ls.m16483A();
                        c3309ls.m16515r().mo17016h();
                        try {
                            ((qn3) c3309ls.f50064b).m20053G(-1.0f, 1.0f, jMo1423z0);
                            InterfaceC0310a.m1410E(c0358h, c3185ki, 0L, 0.0f, qd0Var, 46);
                        } finally {
                            AbstractC3393o1.m17751z(c3309ls, jM16483A);
                        }
                    } else {
                        InterfaceC0310a.m1410E(c0358h, c3185ki, 0L, 0.0f, qd0Var, 46);
                    }
                }
                return xfaVar;
            case 1:
                ui3 ui3Var = (ui3) obj4;
                t66 t66Var = (t66) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ((vi3) obj3).invoke(bool);
                if (zBooleanValue && !z) {
                    ui3Var.mo0a();
                } else if (zBooleanValue) {
                    t66Var.setValue(RatingContentType.Rate);
                } else {
                    t66Var.setValue(RatingContentType.Feedback);
                }
                return xfaVar;
            default:
                pg5 pg5Var = (pg5) obj4;
                String str = (String) obj3;
                C0778d c0778d = (C0778d) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof WorkerStoppedException) {
                    pg5Var.f56133c.compareAndSet(-256, ((WorkerStoppedException) th).f7186a);
                }
                if (z && str != null) {
                    iy5 iy5Var = c0778d.f7244e.f42359m;
                    int iHashCode = c0778d.f7240a.hashCode();
                    iy5Var.getClass();
                    String strSubstring = str.length() <= 127 ? str : null;
                    if (strSubstring == null) {
                        strSubstring = str.substring(0, 127);
                    }
                    Trace.endAsyncSection(strSubstring, iHashCode);
                }
                return xfaVar;
        }
    }

    public /* synthetic */ C2967ek(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.f37372a = i;
        this.f37374c = obj;
        this.f37373b = z;
        this.f37375d = obj2;
        this.f37376e = obj3;
    }
}
