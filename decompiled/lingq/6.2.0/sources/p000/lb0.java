package p000;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import androidx.compose.p002ui.unit.LayoutDirection;
import com.lingq.p020ui.MainActivity;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49383a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49384b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f49385c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f49386d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f49387e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f49388f;

    public /* synthetic */ lb0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f49383a = i;
        this.f49384b = obj;
        this.f49385c = obj2;
        this.f49386d = obj3;
        this.f49387e = obj4;
        this.f49388f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s66 s66VarMo3579C;
        int i = this.f49383a;
        Object obj = this.f49388f;
        Object obj2 = this.f49387e;
        Object obj3 = this.f49386d;
        Object obj4 = this.f49385c;
        Object obj5 = this.f49384b;
        switch (i) {
            case 0:
                vx9 vx9Var = (vx9) obj5;
                LayoutDirection layoutDirection = (LayoutDirection) obj4;
                String str = (String) obj3;
                fb2 fb2Var = (fb2) obj2;
                wa3 wa3Var = (wa3) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    jc9 jc9VarM17358j = nc9.m17358j();
                    s66 s66Var = jc9VarM17358j instanceof s66 ? (s66) jc9VarM17358j : null;
                    if (s66Var == null || (s66VarMo3579C = s66Var.mo3579C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        jc9 jc9VarM14393j = s66VarMo3579C.m14393j();
                        try {
                            vx9 vx9VarM23615W = vz1.m23615W(vx9Var, layoutDirection);
                            EmptyList emptyList = EmptyList.f47638a;
                            C3462pj c3462pj = new C3462pj(str, vx9VarM23615W, emptyList, emptyList, wa3Var, fb2Var);
                            c3462pj.mo13026c();
                            c3462pj.mo13025b();
                            jc9.m14390q(jc9VarM14393j);
                            s66VarMo3579C.mo3587w().mo3989l();
                            s66VarMo3579C.mo3162c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            jc9.m14390q(jc9VarM14393j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            s66VarMo3579C.mo3162c();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            default:
                oo2 oo2Var = (oo2) obj5;
                kp9 kp9Var = (kp9) obj4;
                kp9 kp9Var2 = (kp9) obj3;
                View view = (View) obj;
                Window window = ((MainActivity) obj2).getWindow();
                window.getClass();
                vi3 vi3Var = kp9Var.f48299c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) vi3Var.invoke(resources)).booleanValue();
                vi3 vi3Var2 = kp9Var2.f48299c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                oo2Var.mo18183b(kp9Var, kp9Var2, window, view, zBooleanValue, ((Boolean) vi3Var2.invoke(resources2)).booleanValue());
                return;
        }
    }
}
