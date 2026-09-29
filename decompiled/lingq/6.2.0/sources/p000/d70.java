package p000;

import android.view.View;
import androidx.compose.animation.core.C0061c;
import androidx.compose.foundation.text.C0180h;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d70 implements zh2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35070a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35071b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35072c;

    public /* synthetic */ d70(int i, Object obj, Object obj2) {
        this.f35070a = i;
        this.f35071b = obj;
        this.f35072c = obj2;
    }

    @Override // p000.zh2
    /* JADX INFO: renamed from: a */
    public final void mo1799a() {
        int i = this.f35070a;
        Object obj = this.f35072c;
        Object obj2 = this.f35071b;
        switch (i) {
            case 0:
                ((y60) obj2).m24952b((ke1) obj);
                break;
            case 1:
                ((C0061c) obj2).f1550a.m24313k((l44) obj);
                break;
            case 2:
                ((ov4) obj2).f55033c.m17818k(obj);
                break;
            case 3:
                t66 t66Var = (t66) obj2;
                lj7 lj7Var = (lj7) t66Var.getValue();
                if (lj7Var != null) {
                    kj7 kj7Var = new kj7(lj7Var);
                    v56 v56Var = (v56) obj;
                    if (v56Var != null) {
                        v56Var.m23126b(kj7Var);
                    }
                    t66Var.setValue(null);
                }
                break;
            case 4:
                ((C0180h) obj2).f2909c.remove((vi3) obj);
                break;
            case 5:
                ((faa) obj2).f38744j.remove((faa) obj);
                break;
            case 6:
                faa faaVar = (faa) obj2;
                faaVar.getClass();
                u9a u9aVar = (u9a) ((xc9) ((v9a) obj).f65084b).getValue();
                if (u9aVar != null) {
                    faaVar.f38743i.remove(u9aVar.f63621a);
                }
                break;
            case 7:
                ((faa) obj2).f38743i.remove((baa) obj);
                break;
            default:
                l6b l6bVar = (l6b) obj2;
                View view = (View) obj;
                int i2 = l6bVar.f49225u - 1;
                l6bVar.f49225u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = dta.f36217a;
                    wsa.m24145c(view, null);
                    dta.m10642m(view, null);
                    view.removeOnAttachStateChangeListener(l6bVar.f49226v);
                }
                break;
        }
    }
}
