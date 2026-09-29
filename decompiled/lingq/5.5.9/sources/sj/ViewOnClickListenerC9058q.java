package sj;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.onboarding.WebActivity;
import com.lingq.p055ui.session.RegisterFragment;
import com.lingq.p055ui.session.magiclink.CheckEmailFragment;
import com.lingq.p055ui.token.TokenEditFragment;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.token.ViewLearnProgress;
import com.lingq.p055ui.upgrade.LingQsOfferFragment;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.WordStatus;
import dm.C5207g;
import km.InterfaceC6727j;
import p278nh.C7777d;
import p338qd.C8573r0;

/* JADX INFO: renamed from: sj.q */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9058q implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f47339b;

    public /* synthetic */ ViewOnClickListenerC9058q(int i10, Object obj) {
        this.f47338a = i10;
        this.f47339b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f47338a;
        Object obj = this.f47339b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                WebActivity webActivity = (WebActivity) obj;
                int i11 = WebActivity.f29425Y;
                C5207g.m11111f(webActivity, "this$0");
                webActivity.f29427X.mo823a();
                break;
            case 1:
                RegisterFragment registerFragment = (RegisterFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = RegisterFragment.f30733J0;
                C5207g.m11111f(registerFragment, "this$0");
                C8573r0.m16725g0(registerFragment).m3995p();
                break;
            case 2:
                CheckEmailFragment checkEmailFragment = (CheckEmailFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = CheckEmailFragment.f30844E0;
                C5207g.m11111f(checkEmailFragment, "this$0");
                C8573r0.m16725g0(checkEmailFragment).m3995p();
                break;
            case 3:
                TokenEditFragment tokenEditFragment = (TokenEditFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = TokenEditFragment.f31188T0;
                C5207g.m11111f(tokenEditFragment, "this$0");
                C8573r0.m16725g0(tokenEditFragment).m3995p();
                break;
            case 4:
                TokenFragment tokenFragment = (TokenFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                tokenFragment.m10363o0().m10377B2(WordStatus.Ignored.getValue(), !C7777d.m15481b(tokenFragment));
                break;
            case 5:
                ViewLearnProgress viewLearnProgress = (ViewLearnProgress) obj;
                int i12 = ViewLearnProgress.f31718c;
                C5207g.m11111f(viewLearnProgress, "this$0");
                ViewLearnProgress.InterfaceC4863a interfaceC4863a = viewLearnProgress.f31720b;
                if (interfaceC4863a != null) {
                    interfaceC4863a.mo10269a(CardStatus.Familiar.getValue());
                }
                break;
            default:
                LingQsOfferFragment lingQsOfferFragment = (LingQsOfferFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = LingQsOfferFragment.f31936C0;
                C5207g.m11111f(lingQsOfferFragment, "this$0");
                lingQsOfferFragment.m3598r().m3628T(LingQsOfferFragment.class.getName());
                break;
        }
    }
}
