package com.lingq.p055ui.home.menu;

import ae.C0062b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.lingq.commons.p053ui.views.CollapsibleToolbar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8259b3;
import ph.C8374w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class MoreFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8374w> {

    /* JADX INFO: renamed from: j */
    public static final MoreFragment$binding$2 f25109j = new MoreFragment$binding$2();

    public MoreFragment$binding$2() {
        super(1, C8374w.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentHomeMoreBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8374w mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.btnSettings;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnSettings);
            if (imageButton != null) {
                i10 = R.id.collapse_toolbar;
                if (((CollapsibleToolbar) C0062b.m298P0(view2, R.id.collapse_toolbar)) != null) {
                    i10 = R.id.ivPlaylist;
                    if (((ImageView) C0062b.m298P0(view2, R.id.ivPlaylist)) != null) {
                        i10 = R.id.tvNotificationsTitle;
                        if (((TextView) C0062b.m298P0(view2, R.id.tvNotificationsTitle)) != null) {
                            i10 = R.id.tvRateDesc;
                            if (((TextView) C0062b.m298P0(view2, R.id.tvRateDesc)) != null) {
                                i10 = R.id.tvRateTitle;
                                if (((TextView) C0062b.m298P0(view2, R.id.tvRateTitle)) != null) {
                                    i10 = R.id.tvTitle;
                                    if (((TextView) C0062b.m298P0(view2, R.id.tvTitle)) != null) {
                                        i10 = R.id.tvUnreadNotifications;
                                        TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvUnreadNotifications);
                                        if (textView != null) {
                                            i10 = R.id.view_challenges;
                                            LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.view_challenges);
                                            if (linearLayout != null) {
                                                i10 = R.id.view_forum;
                                                LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(view2, R.id.view_forum);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.view_grammar_guide;
                                                    LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(view2, R.id.view_grammar_guide);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.view_help;
                                                        LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(view2, R.id.view_help);
                                                        if (linearLayout4 != null) {
                                                            i10 = R.id.viewImportLesson;
                                                            LinearLayout linearLayout5 = (LinearLayout) C0062b.m298P0(view2, R.id.viewImportLesson);
                                                            if (linearLayout5 != null) {
                                                                i10 = R.id.view_invite_friend;
                                                                LinearLayout linearLayout6 = (LinearLayout) C0062b.m298P0(view2, R.id.view_invite_friend);
                                                                if (linearLayout6 != null) {
                                                                    i10 = R.id.viewMore;
                                                                    if (((FrameLayout) C0062b.m298P0(view2, R.id.viewMore)) != null) {
                                                                        i10 = R.id.view_notifications;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.view_notifications);
                                                                        if (relativeLayout != null) {
                                                                            i10 = R.id.view_rate;
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) C0062b.m298P0(view2, R.id.view_rate);
                                                                            if (constraintLayout != null) {
                                                                                i10 = R.id.viewUpgradeBanner;
                                                                                View viewM298P0 = C0062b.m298P0(view2, R.id.viewUpgradeBanner);
                                                                                if (viewM298P0 != null) {
                                                                                    return new C8374w(imageButton, textView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, relativeLayout, constraintLayout, C8259b3.m16398a(viewM298P0));
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
                                        }
                                    }
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
