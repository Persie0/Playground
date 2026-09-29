package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.lingq.R$id;
import com.lingq.R$layout;
import com.lingq.core.tooltips.TooltipContainer;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class bp5 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8794a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MainActivity f8795b;

    public /* synthetic */ bp5(MainActivity mainActivity, int i) {
        this.f8794a = i;
        this.f8795b = mainActivity;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f8794a;
        MainActivity mainActivity = this.f8795b;
        switch (i) {
            case 0:
                LayoutInflater layoutInflater = mainActivity.getLayoutInflater();
                layoutInflater.getClass();
                View viewInflate = layoutInflater.inflate(R$layout.activity_main, (ViewGroup) null, false);
                int i2 = R$id.fragment_top;
                if (((FragmentContainerView) lfa.m16159c(viewInflate, i2)) != null) {
                    i2 = R$id.loadingCompose;
                    if (((ComposeView) lfa.m16159c(viewInflate, i2)) != null) {
                        i2 = R$id.nav_host_fragment_top;
                        if (((FragmentContainerView) lfa.m16159c(viewInflate, i2)) != null) {
                            i2 = R$id.tooltipContainer;
                            TooltipContainer tooltipContainer = (TooltipContainer) lfa.m16159c(viewInflate, i2);
                            if (tooltipContainer != null) {
                                i2 = R$id.tvSwitchLanguage;
                                TextView textView = (TextView) lfa.m16159c(viewInflate, i2);
                                if (textView != null) {
                                    i2 = R$id.viewNotification;
                                    ComposeView composeView = (ComposeView) lfa.m16159c(viewInflate, i2);
                                    if (composeView != null) {
                                        i2 = R$id.viewOffer;
                                        ComposeView composeView2 = (ComposeView) lfa.m16159c(viewInflate, i2);
                                        if (composeView2 != null) {
                                            i2 = R$id.viewProgress;
                                            LinearLayout linearLayout = (LinearLayout) lfa.m16159c(viewInflate, i2);
                                            if (linearLayout != null) {
                                                i2 = R$id.viewRatingDialog;
                                                ComposeView composeView3 = (ComposeView) lfa.m16159c(viewInflate, i2);
                                                if (composeView3 != null) {
                                                    i2 = R$id.viewUpgradeDialog;
                                                    ComposeView composeView4 = (ComposeView) lfa.m16159c(viewInflate, i2);
                                                    if (composeView4 != null) {
                                                        return new C3822z6((ConstraintLayout) viewInflate, tooltipContainer, textView, composeView, composeView2, linearLayout, composeView3, composeView4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                return null;
            case 1:
                return mainActivity.mo2102d();
            case 2:
                return mainActivity.mo2116r();
            default:
                return mainActivity.mo2103e();
        }
    }
}
