package com.lingq.p055ui.lesson.tutorial;

import ae.C0062b;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8292h0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LessonDealWithWordsFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8292h0> {

    /* JADX INFO: renamed from: j */
    public static final LessonDealWithWordsFragment$binding$2 f29093j = new LessonDealWithWordsFragment$binding$2();

    public LessonDealWithWordsFragment$binding$2() {
        super(1, C8292h0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonDealWithWordsBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8292h0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnCancel;
        Button button = (Button) C0062b.m298P0(view2, R.id.btnCancel);
        if (button != null) {
            i10 = R.id.btnKnowWords;
            Button button2 = (Button) C0062b.m298P0(view2, R.id.btnKnowWords);
            if (button2 != null) {
                i10 = R.id.cardView;
                MaterialCardView materialCardView = (MaterialCardView) C0062b.m298P0(view2, R.id.cardView);
                if (materialCardView != null) {
                    i10 = R.id.rvWords;
                    RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvWords);
                    if (recyclerView != null) {
                        i10 = R.id.tvDontShowAgain;
                        TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvDontShowAgain);
                        if (textView != null) {
                            i10 = R.id.tvSaveLabel;
                            if (((TextView) C0062b.m298P0(view2, R.id.tvSaveLabel)) != null) {
                                i10 = R.id.tvTitle;
                                TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvTitle);
                                if (textView2 != null) {
                                    i10 = R.id.viewBottom;
                                    if (((ConstraintLayout) C0062b.m298P0(view2, R.id.viewBottom)) != null) {
                                        return new C8292h0(button, button2, materialCardView, recyclerView, textView, textView2, (FrameLayout) view2);
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
