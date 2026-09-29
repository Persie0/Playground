package si;

import android.support.v4.media.session.C0166e;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.challenges.ChallengeShareFragment;
import com.lingq.p055ui.home.challenges.ChallengeShareViewModel;
import com.lingq.p055ui.home.challenges.ChallengesFragment;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.challenge.ChallengeSocialSettings;
import com.lingq.shared.uimodel.challenge.ChallengeSocialSettingsNetwork;
import com.lingq.shared.uimodel.challenge.ChallengeSocialSettingsType;
import dm.C5207g;
import java.net.URLEncoder;
import km.InterfaceC6727j;
import p338qd.C8573r0;

/* JADX INFO: renamed from: si.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9024h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47258a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Fragment f47259b;

    public /* synthetic */ ViewOnClickListenerC9024h(int i10, Fragment fragment) {
        this.f47258a = i10;
        this.f47259b = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        ChallengeSocialSettingsNetwork challengeSocialSettingsNetwork;
        ChallengeSocialSettingsType challengeSocialSettingsType;
        int i10 = this.f47258a;
        Fragment fragment = this.f47259b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ChallengeShareFragment challengeShareFragment = (ChallengeShareFragment) fragment;
                InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeShareFragment.f22987T0;
                C5207g.m11111f(challengeShareFragment, "this$0");
                ChallengeShareViewModel challengeShareViewModelM9790u0 = challengeShareFragment.m9790u0();
                ChallengeDetail challengeDetail = (ChallengeDetail) challengeShareViewModelM9790u0.f23027J.getValue();
                if (challengeDetail != null) {
                    StringBuilder sbM854m = C0204c.m854m("https://www.lingq.com/en/learn/", challengeShareViewModelM9790u0.mo498E1(), "/web/community/challenges/");
                    sbM854m.append(challengeDetail.f21634b);
                    String string = sbM854m.toString();
                    ChallengeSocialSettings challengeSocialSettings = challengeDetail.f21645m;
                    if (challengeSocialSettings == null || (challengeSocialSettingsNetwork = challengeSocialSettings.f21653a) == null || (challengeSocialSettingsType = challengeSocialSettingsNetwork.f21658a) == null || (str = challengeSocialSettingsType.f21661a) == null) {
                        str = "";
                    }
                    challengeShareViewModelM9790u0.f23032g.mo14371k(C0166e.m766l("http://www.twitter.com/intent/tweet?url=", string, "&text=", URLEncoder.encode(str.concat(" via @LingQ_Central"), "utf-8"), "."));
                }
                break;
            default:
                ChallengesFragment challengesFragment = (ChallengesFragment) fragment;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = ChallengesFragment.f23048E0;
                C5207g.m11111f(challengesFragment, "this$0");
                C8573r0.m16725g0(challengesFragment).m3995p();
                break;
        }
    }
}
