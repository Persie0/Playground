package com.lingq.p055ui.home.library;

import android.view.View;
import androidx.appcompat.view.menu.C0227i;
import androidx.appcompat.widget.C0337q0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.HomeViewModel;
import dm.C5207g;
import km.InterfaceC6727j;
import no.C7828f;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.lingq.ui.home.library.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3807a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f25005b;

    public /* synthetic */ ViewOnClickListenerC3807a(int i10, Object obj) {
        this.f25004a = i10;
        this.f25005b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f25004a;
        Object obj = this.f25005b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C0337q0 c0337q0 = (C0337q0) obj;
                C5207g.m11111f(c0337q0, "$popupMenu");
                C0227i c0227i = c0337q0.f1317b;
                if (!c0227i.m951b()) {
                    z10 = false;
                    if (c0227i.f755f != null) {
                        c0227i.m953d(0, 0, false, false);
                    }
                    if (z10) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    return;
                }
                z10 = true;
                if (z10) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                return;
            case 1:
                LibraryAdapter libraryAdapter = (LibraryAdapter) obj;
                C5207g.m11111f(libraryAdapter, "this$0");
                libraryAdapter.f24602f.mo9821u();
                return;
            case 2:
                LibraryFragment libraryFragment = (LibraryFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                C5207g.m11111f(libraryFragment, "this$0");
                libraryFragment.m9937r0().f22743S.mo16479j(HomeViewModel.AbstractC3479a.c.f22772a);
                return;
            default:
                RepairStreakFragment repairStreakFragment = (RepairStreakFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = RepairStreakFragment.f24937S0;
                C5207g.m11111f(repairStreakFragment, "this$0");
                RepairStreakViewModel repairStreakViewModelM9952v0 = repairStreakFragment.m9952v0();
                C7828f.m15570d(C8573r0.m16767w0(repairStreakViewModelM9952v0), repairStreakViewModelM9952v0.f24985f, null, new RepairStreakViewModel$repairStreak$1(repairStreakViewModelM9952v0, null), 2);
                return;
        }
    }
}
