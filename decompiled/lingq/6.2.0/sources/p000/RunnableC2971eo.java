package p000;

import android.os.Looper;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C1060h;
import com.google.android.material.datepicker.C1061i;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: eo */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2971eo implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37589a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f37590b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37591c;

    public /* synthetic */ RunnableC2971eo(C1061i c1061i, MaterialCalendarGridView materialCalendarGridView, int i) {
        this.f37589a = 4;
        this.f37591c = materialCalendarGridView;
        this.f37590b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM6127a;
        int i = this.f37589a;
        int i2 = this.f37590b;
        Object obj = this.f37591c;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            case 1:
                ew2 ew2Var = ((C3165jz) obj).f46414b;
                String str = uma.f64080a;
                C3488q8 c3488q8 = ew2Var.f37985a.f46254A;
                dw2 dw2Var = new dw2(i2);
                c3488q8.getClass();
                bna.m3987z(Looper.myLooper() == ((qp9) c3488q8.f57370d).f58033a.getLooper());
                c3488q8.f57368b++;
                c3488q8.m19724J(new RunnableC0806bd(11, c3488q8, dw2Var));
                Integer numValueOf = Integer.valueOf(i2);
                Object obj2 = c3488q8.f57372f;
                c3488q8.f57372f = numValueOf;
                if (!obj2.equals(numValueOf)) {
                    ((yv2) c3488q8.f57371e).m25357a(obj2, numValueOf);
                }
                break;
            case 2:
                l52 l52Var = ((rw2) obj).f59908Q;
                C3496qf c3496qfM15803E = l52Var.m15803E();
                l52Var.m15808J(c3496qfM15803E, 1034, new z42(c3496qfM15803E, i2, 1));
                break;
            case 3:
                int[] iArr = MaterialButton.f12752l0;
                ((MaterialButton) obj).setIconSize(i2);
                break;
            case 4:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) obj;
                if (materialCalendarGridView.hasFocus() && i2 != 0) {
                    C1060h c1060hM6115b = materialCalendarGridView.m6115b();
                    if (i2 == 1) {
                        iM6127a = c1060hM6115b.m6128b(c1060hM6115b.m6132f() + 1);
                        if (iM6127a == -1) {
                            iM6127a = c1060hM6115b.m6132f();
                        }
                    } else {
                        iM6127a = c1060hM6115b.m6127a(c1060hM6115b.m6129c() - 1);
                        if (iM6127a == -1) {
                            iM6127a = c1060hM6115b.m6129c();
                        }
                    }
                    materialCalendarGridView.setSelection(iM6127a);
                    break;
                }
                break;
            case 5:
                ((AbstractC3584sr) obj).mo21648Q(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f13100p;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.m6169z(view, i2, false);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC2971eo(Object obj, int i, int i2) {
        this.f37589a = i2;
        this.f37591c = obj;
        this.f37590b = i;
    }
}
