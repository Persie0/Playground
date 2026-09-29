package fk;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.AbstractC4864a;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.token.TokenViewModel;
import com.lingq.p055ui.tooltips.C4911a;
import com.lingq.p055ui.upgrade.LingQsOfferFragment;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlinx.coroutines.flow.StateFlowImpl;
import li.InterfaceC7379f;
import p278nh.InterfaceC7774a;
import sl.C9072e;

/* JADX INFO: renamed from: fk.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5566h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34364b;

    public /* synthetic */ ViewOnClickListenerC5566h(int i10, Object obj) {
        this.f34363a = i10;
        this.f34364b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f34363a;
        Object obj = this.f34364b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                TokenFragment tokenFragment = (TokenFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                InterfaceC7379f interfaceC7379f = (InterfaceC7379f) tokenViewModelM10363o0.f31437X.getValue();
                if (interfaceC7379f != null) {
                    StateFlowImpl stateFlowImpl = tokenViewModelM10363o0.f31418N0;
                    Object value = stateFlowImpl.getValue();
                    AbstractC4864a.c cVar = AbstractC4864a.c.f31723a;
                    if (C5207g.m11106a(value, cVar)) {
                        stateFlowImpl.setValue(AbstractC4864a.a.f31721a);
                        tokenViewModelM10363o0.m10381v2(interfaceC7379f, (AbstractC4864a) stateFlowImpl.getValue());
                    } else if (C5207g.m11106a(stateFlowImpl.getValue(), AbstractC4864a.a.f31721a)) {
                        stateFlowImpl.setValue(cVar);
                        tokenViewModelM10363o0.m10381v2(interfaceC7379f, (AbstractC4864a) stateFlowImpl.getValue());
                    }
                }
                break;
            case 1:
                InterfaceC7774a interfaceC7774a = (InterfaceC7774a) obj;
                int i11 = C4911a.f31934b;
                C5207g.m11111f(interfaceC7774a, "$moreClickListener");
                interfaceC7774a.mo9795a(C9072e.f47360a);
                break;
            default:
                LingQsOfferFragment lingQsOfferFragment = (LingQsOfferFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LingQsOfferFragment.f31936C0;
                C5207g.m11111f(lingQsOfferFragment, "this$0");
                lingQsOfferFragment.m3598r().m3628T(LingQsOfferFragment.class.getName());
                break;
        }
    }
}
