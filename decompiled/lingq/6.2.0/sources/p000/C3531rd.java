package p000;

import android.speech.SpeechRecognizer;
import androidx.compose.material3.C0252k0;
import androidx.compose.p002ui.window.C0461i;
import androidx.compose.p002ui.window.DialogC0460h;
import androidx.lifecycle.runtime.R$id;

/* JADX INFO: renamed from: rd */
/* JADX INFO: loaded from: classes2.dex */
public final class C3531rd implements zh2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59098a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59099b;

    public /* synthetic */ C3531rd(Object obj, int i) {
        this.f59098a = i;
        this.f59099b = obj;
    }

    @Override // p000.zh2
    /* JADX INFO: renamed from: a */
    public final void mo1799a() {
        int i = this.f59098a;
        Object obj = this.f59099b;
        switch (i) {
            case 0:
                ((C3143jd) obj).m14400W2();
                break;
            case 1:
                DialogC0460h dialogC0460h = (DialogC0460h) obj;
                dialogC0460h.dismiss();
                dialogC0460h.f5304h.m1711e();
                break;
            case 2:
                C0461i c0461i = (C0461i) obj;
                c0461i.m1711e();
                c0461i.setTag(R$id.view_tree_lifecycle_owner, null);
                c0461i.f5309K.removeViewImmediate(c0461i);
                break;
            case 3:
                sm0 sm0Var = ((C0252k0) obj).f3550c;
                if (sm0Var != null) {
                    sm0Var.mo10141l(null);
                }
                break;
            case 4:
                n06 n06Var = (n06) obj;
                n06Var.dismiss();
                n06Var.f52125i.m1711e();
                break;
            case 5:
                ((k66) obj).f46768d = null;
                break;
            default:
                ((SpeechRecognizer) obj).destroy();
                break;
        }
    }
}
