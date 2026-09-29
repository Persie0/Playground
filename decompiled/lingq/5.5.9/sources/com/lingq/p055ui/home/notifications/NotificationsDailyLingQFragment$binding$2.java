package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8375w0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class NotificationsDailyLingQFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8375w0> {

    /* JADX INFO: renamed from: j */
    public static final NotificationsDailyLingQFragment$binding$2 f25183j = new NotificationsDailyLingQFragment$binding$2();

    public NotificationsDailyLingQFragment$binding$2() {
        super(1, C8375w0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentNotificationsDailyLingqBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8375w0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.swEmail;
        SwitchCompat switchCompat = (SwitchCompat) C0062b.m298P0(view2, R.id.swEmail);
        if (switchCompat != null) {
            i10 = R.id.swSiteNotification;
            SwitchCompat switchCompat2 = (SwitchCompat) C0062b.m298P0(view2, R.id.swSiteNotification);
            if (switchCompat2 != null) {
                i10 = R.id.tvCount;
                TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvCount);
                if (textView != null) {
                    i10 = R.id.tvTitle;
                    TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvTitle);
                    if (textView2 != null) {
                        i10 = R.id.viewCount;
                        RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.viewCount);
                        if (relativeLayout != null) {
                            i10 = R.id.viewEmail;
                            if (((RelativeLayout) C0062b.m298P0(view2, R.id.viewEmail)) != null) {
                                i10 = R.id.viewNotification;
                                if (((RelativeLayout) C0062b.m298P0(view2, R.id.viewNotification)) != null) {
                                    return new C8375w0(switchCompat, switchCompat2, textView, textView2, relativeLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
