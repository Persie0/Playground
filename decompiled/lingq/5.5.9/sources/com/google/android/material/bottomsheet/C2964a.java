package com.google.android.material.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2964a implements InterfaceC10060r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogC2965b f14888a;

    public C2964a(DialogC2965b dialogC2965b) {
        this.f14888a = dialogC2965b;
    }

    @Override // p471x2.InterfaceC10060r
    /* JADX INFO: renamed from: c */
    public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
        DialogC2965b dialogC2965b = this.f14888a;
        DialogC2965b.b bVar = dialogC2965b.f14889H;
        if (bVar != null) {
            dialogC2965b.f14892f.f14840W.remove(bVar);
        }
        DialogC2965b.b bVar2 = new DialogC2965b.b(dialogC2965b.f14895i, c10063s0);
        dialogC2965b.f14889H = bVar2;
        bVar2.m8628e(dialogC2965b.getWindow());
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = dialogC2965b.f14892f;
        DialogC2965b.b bVar3 = dialogC2965b.f14889H;
        ArrayList<BottomSheetBehavior.AbstractC2962c> arrayList = bottomSheetBehavior.f14840W;
        if (!arrayList.contains(bVar3)) {
            arrayList.add(bVar3);
        }
        return c10063s0;
    }
}
