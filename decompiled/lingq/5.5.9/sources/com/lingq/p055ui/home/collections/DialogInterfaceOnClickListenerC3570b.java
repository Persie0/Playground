package com.lingq.p055ui.home.collections;

import android.content.DialogInterface;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.ToolTipsViewManager;
import com.lingq.p055ui.tooltips.TooltipStep;
import dm.C5207g;
import km.InterfaceC6727j;
import no.InterfaceC7882z;
import p181ii.C6332a;
import p260m8.C7499b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.lingq.ui.home.collections.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3570b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23440c;

    public /* synthetic */ DialogInterfaceOnClickListenerC3570b(Object obj, int i10, Object obj2) {
        this.f23438a = i10;
        this.f23439b = obj;
        this.f23440c = obj2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f23438a;
        Object obj = this.f23440c;
        Object obj2 = this.f23439b;
        switch (i11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                CollectionsFragment collectionsFragment = (CollectionsFragment) obj2;
                C6332a c6332a = (C6332a) obj;
                C5207g.m11111f(collectionsFragment, "this$0");
                C5207g.m11111f(c6332a, "$course");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                CollectionsViewModel collectionsViewModelM9800p0 = collectionsFragment.m9800p0();
                InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(collectionsViewModelM9800p0);
                StringBuilder sb2 = new StringBuilder("downloadCourse ");
                int i12 = c6332a.f36595a;
                sb2.append(i12);
                C7499b.m14933c0(interfaceC7882zM16767w0, collectionsViewModelM9800p0.f23255h, collectionsViewModelM9800p0.f23253g, sb2.toString(), new CollectionsViewModel$downloadCourse$1(collectionsViewModelM9800p0, i12, c6332a.f36601g, null));
                break;
            default:
                ToolTipsViewManager toolTipsViewManager = (ToolTipsViewManager) obj2;
                TooltipStep tooltipStep = (TooltipStep) obj;
                C5207g.m11111f(toolTipsViewManager, "this$0");
                C5207g.m11111f(tooltipStep, "$step");
                dialogInterface.dismiss();
                toolTipsViewManager.f31914f.mo9715a(tooltipStep);
                break;
        }
    }
}
