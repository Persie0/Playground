package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.commons.p053ui.views.StreakActivityLevelView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8293h1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class RepairStreakFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8293h1> {

    /* JADX INFO: renamed from: j */
    public static final RepairStreakFragment$binding$2 f24940j = new RepairStreakFragment$binding$2();

    public RepairStreakFragment$binding$2() {
        super(1, C8293h1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentRepairStreakBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8293h1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnNotNow;
        MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnNotNow);
        if (materialButton != null) {
            i10 = R.id.btnRepair;
            MaterialButton materialButton2 = (MaterialButton) C0062b.m298P0(view2, R.id.btnRepair);
            if (materialButton2 != null) {
                i10 = R.id.llRepairActions;
                if (((LinearLayout) C0062b.m298P0(view2, R.id.llRepairActions)) != null) {
                    i10 = R.id.tvDescription;
                    if (((TextView) C0062b.m298P0(view2, R.id.tvDescription)) != null) {
                        i10 = R.id.tvError;
                        TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvError);
                        if (textView != null) {
                            i10 = R.id.tvRepair;
                            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvRepair);
                            if (textView2 != null) {
                                i10 = R.id.tvTitle;
                                TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvTitle);
                                if (textView3 != null) {
                                    i10 = R.id.viewError;
                                    RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.viewError);
                                    if (relativeLayout != null) {
                                        i10 = R.id.viewProgress;
                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress);
                                        if (circularProgressIndicator != null) {
                                            i10 = R.id.viewStreakActivityLevel;
                                            StreakActivityLevelView streakActivityLevelView = (StreakActivityLevelView) C0062b.m298P0(view2, R.id.viewStreakActivityLevel);
                                            if (streakActivityLevelView != null) {
                                                return new C8293h1(materialButton, materialButton2, textView, textView2, textView3, relativeLayout, circularProgressIndicator, streakActivityLevelView);
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
