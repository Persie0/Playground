package com.lingq.feature.onboarding.auth.login.magiclink;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.feature.onboarding.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.od3;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CheckEmailFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final CheckEmailFragment$binding$2 f27074i = new CheckEmailFragment$binding$2(1, od3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/onboarding/databinding/FragmentCheckEmailBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.appbar;
        if (((AppBarLayout) lfa.m16159c(view, i)) != null) {
            i = R$id.btnOpenMail;
            MaterialButton materialButton = (MaterialButton) lfa.m16159c(view, i);
            if (materialButton != null) {
                i = R$id.btnResend;
                MaterialButton materialButton2 = (MaterialButton) lfa.m16159c(view, i);
                if (materialButton2 != null) {
                    i = R$id.ivCheckEmail;
                    if (((AppCompatImageView) lfa.m16159c(view, i)) != null) {
                        i = R$id.progress_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) lfa.m16159c(view, i);
                        if (relativeLayout != null) {
                            i = R$id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) lfa.m16159c(view, i);
                            if (materialToolbar != null) {
                                i = R$id.tvInfo;
                                TextView textView = (TextView) lfa.m16159c(view, i);
                                if (textView != null) {
                                    i = R$id.tvTitle;
                                    if (((TextView) lfa.m16159c(view, i)) != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i = R$id.viewProgress;
                                        if (((CircularProgressIndicator) lfa.m16159c(view, i)) != null) {
                                            return new od3(materialButton, materialButton2, relativeLayout, materialToolbar, textView, constraintLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
