package com.lingq.p055ui.session.magiclink;

import ae.C0062b;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8291h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class CheckEmailFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8291h> {

    /* JADX INFO: renamed from: j */
    public static final CheckEmailFragment$binding$2 f30849j = new CheckEmailFragment$binding$2();

    public CheckEmailFragment$binding$2() {
        super(1, C8291h.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentCheckEmailBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8291h mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.btnOpenMail;
            MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnOpenMail);
            if (materialButton != null) {
                i10 = R.id.btnResend;
                MaterialButton materialButton2 = (MaterialButton) C0062b.m298P0(view2, R.id.btnResend);
                if (materialButton2 != null) {
                    i10 = R.id.ivCheckEmail;
                    if (((AppCompatImageView) C0062b.m298P0(view2, R.id.ivCheckEmail)) != null) {
                        i10 = R.id.progress_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.progress_layout);
                        if (relativeLayout != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                            if (materialToolbar != null) {
                                i10 = R.id.tvInfo;
                                TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvInfo);
                                if (textView != null) {
                                    i10 = R.id.tvTitle;
                                    if (((TextView) C0062b.m298P0(view2, R.id.tvTitle)) != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                                        i10 = R.id.viewProgress;
                                        if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                                            return new C8291h(materialButton, materialButton2, relativeLayout, materialToolbar, textView, constraintLayout);
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
