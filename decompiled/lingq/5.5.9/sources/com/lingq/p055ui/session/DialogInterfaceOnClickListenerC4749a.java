package com.lingq.p055ui.session;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.ToolTipsViewManager;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.text.C7076b;
import no.C7828f;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.lingq.ui.session.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC4749a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30841a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f30842b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f30843c;

    public /* synthetic */ DialogInterfaceOnClickListenerC4749a(Object obj, int i10, Object obj2) {
        this.f30841a = i10;
        this.f30842b = obj;
        this.f30843c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f30841a;
        Object obj = this.f30843c;
        Object obj2 = this.f30842b;
        switch (i11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                LoginFragment loginFragment = (LoginFragment) obj2;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
                C5207g.m11111f(loginFragment, "this$0");
                AuthenticationViewModel authenticationViewModelM10336p0 = loginFragment.m10336p0();
                View viewFindViewById = ((View) obj).findViewById(R.id.et_email);
                C5207g.m11109d(viewFindViewById, "null cannot be cast to non-null type android.widget.EditText");
                String string = C7076b.m14277B3(((EditText) viewFindViewById).getText().toString()).toString();
                C5207g.m11111f(string, "email");
                C7828f.m15570d(C8573r0.m16767w0(authenticationViewModelM10336p0), null, null, new AuthenticationViewModel$recoverPassword$1(authenticationViewModelM10336p0, string, null), 3);
                dialogInterface.dismiss();
                break;
            default:
                ToolTipsViewManager toolTipsViewManager = (ToolTipsViewManager) obj2;
                TooltipStep tooltipStep = (TooltipStep) obj;
                C5207g.m11111f(toolTipsViewManager, "this$0");
                C5207g.m11111f(tooltipStep, "$step");
                toolTipsViewManager.f31915g.mo9716a(tooltipStep);
                break;
        }
    }
}
