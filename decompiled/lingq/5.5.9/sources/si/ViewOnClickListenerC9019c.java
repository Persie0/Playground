package si;

import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.challenges.ChallengeDetailsFragment;
import com.lingq.p055ui.home.challenges.ChallengeShareFragment;
import com.lingq.p055ui.home.challenges.ChallengeShareViewModel;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import dm.C5207g;
import km.InterfaceC6727j;
import p338qd.C8573r0;

/* JADX INFO: renamed from: si.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9019c implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Fragment f47248b;

    public /* synthetic */ ViewOnClickListenerC9019c(int i10, Fragment fragment) {
        this.f47247a = i10;
        this.f47248b = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f47247a;
        Fragment fragment = this.f47248b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ChallengeDetailsFragment challengeDetailsFragment = (ChallengeDetailsFragment) fragment;
                InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeDetailsFragment.f22857E0;
                C5207g.m11111f(challengeDetailsFragment, "this$0");
                C8573r0.m16725g0(challengeDetailsFragment).m3995p();
                break;
            default:
                ChallengeShareFragment challengeShareFragment = (ChallengeShareFragment) fragment;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = ChallengeShareFragment.f22987T0;
                C5207g.m11111f(challengeShareFragment, "this$0");
                ChallengeShareViewModel challengeShareViewModelM9790u0 = challengeShareFragment.m9790u0();
                ChallengeDetail challengeDetail = (ChallengeDetail) challengeShareViewModelM9790u0.f23027J.getValue();
                if (challengeDetail != null) {
                    StringBuilder sbM855o = C0204c.m855o("https://www.lingq.com/", challengeShareViewModelM9790u0.mo507p1(), "/learn/", challengeShareViewModelM9790u0.mo498E1(), "/web/community/challenges/");
                    sbM855o.append(challengeDetail.f21634b);
                    challengeShareViewModelM9790u0.f23034i.mo14371k(sbM855o.toString());
                }
                break;
        }
    }
}
