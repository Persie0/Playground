package com.lingq.p055ui.lesson.tutorial;

import ae.C0062b;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8386y1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LessonFirstLingQCongratsFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8386y1> {

    /* JADX INFO: renamed from: j */
    public static final LessonFirstLingQCongratsFragment$binding$2 f29192j = new LessonFirstLingQCongratsFragment$binding$2();

    public LessonFirstLingQCongratsFragment$binding$2() {
        super(1, C8386y1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentTooltipsFirstLingqBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8386y1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnContinue;
        MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnContinue);
        if (materialButton != null) {
            i10 = R.id.tvTitle;
            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvTitle);
            if (textView != null) {
                i10 = R.id.tvTitle1;
                TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvTitle1);
                if (textView2 != null) {
                    i10 = R.id.tvTitle2;
                    if (((TextView) C0062b.m298P0(view2, R.id.tvTitle2)) != null) {
                        i10 = R.id.tvTitle3;
                        if (((TextView) C0062b.m298P0(view2, R.id.tvTitle3)) != null) {
                            i10 = R.id.tvTitle4;
                            if (((TextView) C0062b.m298P0(view2, R.id.tvTitle4)) != null) {
                                i10 = R.id.tvTitle5;
                                if (((TextView) C0062b.m298P0(view2, R.id.tvTitle5)) != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) view2;
                                    return new C8386y1(relativeLayout, materialButton, textView, textView2, relativeLayout);
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
