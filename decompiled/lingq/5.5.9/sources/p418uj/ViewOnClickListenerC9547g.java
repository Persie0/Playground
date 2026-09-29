package p418uj;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.review.ReviewFragment;
import com.lingq.p055ui.review.data.ReviewActivityResult;
import dm.C5207g;
import km.InterfaceC6727j;
import p462wj.InterfaceC9956d;
import p462wj.InterfaceC9957e;
import sl.C9072e;

/* JADX INFO: renamed from: uj.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9547g implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49118a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewFragment f49119b;

    public /* synthetic */ ViewOnClickListenerC9547g(ReviewFragment reviewFragment, int i10) {
        this.f49118a = i10;
        this.f49119b = reviewFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f49118a;
        ReviewFragment reviewFragment = this.f49119b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
                C5207g.m11111f(reviewFragment, "this$0");
                Object objM10261t2 = reviewFragment.m10240o0().m10261t2();
                if (objM10261t2 instanceof InterfaceC9957e) {
                    reviewFragment.m10241p0((InterfaceC9957e) objM10261t2, ReviewActivityResult.None, "");
                } else if (objM10261t2 instanceof InterfaceC9956d) {
                    reviewFragment.m10240o0().m10255F2();
                    reviewFragment.m10240o0().m10266z2();
                }
                break;
            default:
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = ReviewFragment.f29431E0;
                C5207g.m11111f(reviewFragment, "this$0");
                reviewFragment.m10240o0().f29623O0.mo14371k(C9072e.f47360a);
                break;
        }
    }
}
