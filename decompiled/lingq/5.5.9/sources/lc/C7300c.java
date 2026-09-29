package lc;

import android.view.View;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p507yc.C10347n;

/* JADX INFO: renamed from: lc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7300c implements C10347n.b {
    @Override // p507yc.C10347n.b
    /* JADX INFO: renamed from: a */
    public final C10063s0 mo14692a(View view, C10063s0 c10063s0, C10347n.c cVar) {
        cVar.f52056d = c10063s0.m18865b() + cVar.f52056d;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean z10 = true;
        if (C10029b0.e.m18686d(view) != 1) {
            z10 = false;
        }
        int iM18866c = c10063s0.m18866c();
        int iM18867d = c10063s0.m18867d();
        int i10 = cVar.f52053a + (z10 ? iM18867d : iM18866c);
        cVar.f52053a = i10;
        int i11 = cVar.f52055c;
        if (!z10) {
            iM18866c = iM18867d;
        }
        int i12 = i11 + iM18866c;
        cVar.f52055c = i12;
        C10029b0.e.m18693k(view, i10, cVar.f52054b, i12, cVar.f52056d);
        return c10063s0;
    }
}
