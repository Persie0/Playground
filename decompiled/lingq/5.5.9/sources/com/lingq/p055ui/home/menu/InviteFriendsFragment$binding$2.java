package com.lingq.p055ui.home.menu;

import ae.C0062b;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8256b0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class InviteFriendsFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8256b0> {

    /* JADX INFO: renamed from: j */
    public static final InviteFriendsFragment$binding$2 f25042j = new InviteFriendsFragment$binding$2();

    public InviteFriendsFragment$binding$2() {
        super(1, C8256b0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentInviteFriendsBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8256b0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnCopy;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C0062b.m298P0(view2, R.id.btnCopy);
        if (appCompatImageView != null) {
            i10 = R.id.btnDone;
            TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnDone);
            if (textView != null) {
                i10 = R.id.btnInviteFriends;
                MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnInviteFriends);
                if (materialButton != null) {
                    i10 = R.id.ivLink;
                    if (((AppCompatImageView) C0062b.m298P0(view2, R.id.ivLink)) != null) {
                        i10 = R.id.ivPointEarned;
                        if (((ImageView) C0062b.m298P0(view2, R.id.ivPointEarned)) != null) {
                            i10 = R.id.ivReferral1;
                            ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.ivReferral1);
                            if (imageView != null) {
                                i10 = R.id.ivReferral2;
                                ImageView imageView2 = (ImageView) C0062b.m298P0(view2, R.id.ivReferral2);
                                if (imageView2 != null) {
                                    i10 = R.id.ivReferral3;
                                    ImageView imageView3 = (ImageView) C0062b.m298P0(view2, R.id.ivReferral3);
                                    if (imageView3 != null) {
                                        i10 = R.id.ivReferral4;
                                        ImageView imageView4 = (ImageView) C0062b.m298P0(view2, R.id.ivReferral4);
                                        if (imageView4 != null) {
                                            i10 = R.id.ivReferral5;
                                            ImageView imageView5 = (ImageView) C0062b.m298P0(view2, R.id.ivReferral5);
                                            if (imageView5 != null) {
                                                i10 = R.id.ivReferralSignup;
                                                if (((ImageView) C0062b.m298P0(view2, R.id.ivReferralSignup)) != null) {
                                                    i10 = R.id.tvInviteFriendDescription;
                                                    TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvInviteFriendDescription);
                                                    if (textView2 != null) {
                                                        i10 = R.id.tvPointEarned;
                                                        if (((TextView) C0062b.m298P0(view2, R.id.tvPointEarned)) != null) {
                                                            i10 = R.id.tvPointEarnedNumber;
                                                            TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvPointEarnedNumber);
                                                            if (textView3 != null) {
                                                                i10 = R.id.tvReferral;
                                                                if (((TextView) C0062b.m298P0(view2, R.id.tvReferral)) != null) {
                                                                    i10 = R.id.tvReferralLink;
                                                                    TextView textView4 = (TextView) C0062b.m298P0(view2, R.id.tvReferralLink);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.tvReferralNumber;
                                                                        TextView textView5 = (TextView) C0062b.m298P0(view2, R.id.tvReferralNumber);
                                                                        if (textView5 != null) {
                                                                            i10 = R.id.tvShareLink;
                                                                            if (((TextView) C0062b.m298P0(view2, R.id.tvShareLink)) != null) {
                                                                                i10 = R.id.tvYourReferrals;
                                                                                if (((TextView) C0062b.m298P0(view2, R.id.tvYourReferrals)) != null) {
                                                                                    i10 = R.id.viewLink;
                                                                                    if (((RelativeLayout) C0062b.m298P0(view2, R.id.viewLink)) != null) {
                                                                                        return new C8256b0((LinearLayout) view2, appCompatImageView, textView, materialButton, imageView, imageView2, imageView3, imageView4, imageView5, textView2, textView3, textView4, textView5);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
