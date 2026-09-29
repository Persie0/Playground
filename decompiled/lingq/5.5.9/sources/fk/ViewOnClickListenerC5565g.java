package fk;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.shared.uimodel.WordStatus;
import dm.C5207g;
import km.InterfaceC6727j;
import p278nh.C7777d;

/* JADX INFO: renamed from: fk.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5565g implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TokenFragment f34362b;

    public /* synthetic */ ViewOnClickListenerC5565g(TokenFragment tokenFragment, int i10) {
        this.f34361a = i10;
        this.f34362b = tokenFragment;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f34361a;
        TokenFragment tokenFragment = this.f34362b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                tokenFragment.m10363o0().f31474z0.setValue(Boolean.TRUE);
                break;
            case 1:
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                tokenFragment.m10363o0().m10380u2();
                break;
            default:
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                tokenFragment.m10363o0().m10377B2(WordStatus.Known.getValue(), !C7777d.m15481b(tokenFragment));
                break;
        }
    }
}
