package androidx.compose.p017ui.text.font;

import ae.C0062b;
import android.os.Build;
import dm.C5212l;
import p328q1.InterfaceC8480q;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0700f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8480q f4639a;

    public C0700f() {
        this.f4639a = Build.VERSION.SDK_INT >= 28 ? new C5212l() : new C0062b();
    }
}
