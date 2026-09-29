package androidx.compose.p017ui.text.input;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p352r1.InputConnectionC8716q;
import p352r1.InterfaceC8710k;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0706c implements InterfaceC8710k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0707d f4664a;

    public C0706c(C0707d c0707d) {
        this.f4664a = c0707d;
    }

    @Override // p352r1.InterfaceC8710k
    /* JADX INFO: renamed from: a */
    public final void mo2604a(KeyEvent keyEvent) {
        C5207g.m11111f(keyEvent, "event");
        ((BaseInputConnection) this.f4664a.f4672h.getValue()).sendKeyEvent(keyEvent);
    }

    @Override // p352r1.InterfaceC8710k
    /* JADX INFO: renamed from: b */
    public final void mo2605b(InputConnectionC8716q inputConnectionC8716q) {
        C5207g.m11111f(inputConnectionC8716q, "ic");
        C0707d c0707d = this.f4664a;
        int size = c0707d.f4671g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = c0707d.f4671g;
            if (C5207g.m11106a(((WeakReference) arrayList.get(i10)).get(), inputConnectionC8716q)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // p352r1.InterfaceC8710k
    /* JADX INFO: renamed from: c */
    public final void mo2606c() {
        ((TextInputServiceAndroid$onImeActionPerformed$1) this.f4664a.f4668d).getClass();
        C9072e c9072e = C9072e.f47360a;
    }

    @Override // p352r1.InterfaceC8710k
    /* JADX INFO: renamed from: d */
    public final void mo2607d(ArrayList arrayList) {
        ((TextInputServiceAndroid$onEditCommand$1) this.f4664a.f4667c).mo528n(arrayList);
    }
}
