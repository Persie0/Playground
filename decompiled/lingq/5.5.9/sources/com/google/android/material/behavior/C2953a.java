package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.snackbar.C3066e;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.InterfaceC10288j;

/* JADX INFO: renamed from: com.google.android.material.behavior.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2953a implements InterfaceC10288j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f14793a;

    public C2953a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f14793a = swipeDismissBehavior;
    }

    @Override // p497y2.InterfaceC10288j
    /* JADX INFO: renamed from: a */
    public final boolean mo4689a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f14793a;
        boolean z10 = false;
        if (!swipeDismissBehavior.mo8583s(view)) {
            return false;
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean z11 = C10029b0.e.m18686d(view) == 1;
        int i10 = swipeDismissBehavior.f14782e;
        if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
            z10 = true;
        }
        int width = view.getWidth();
        if (z10) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.InterfaceC2951b interfaceC2951b = swipeDismissBehavior.f14779b;
        if (interfaceC2951b != null) {
            ((C3066e) interfaceC2951b).m8846a(view);
        }
        return true;
    }
}
