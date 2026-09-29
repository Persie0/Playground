package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager2.widget.ViewPager2;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8345q0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LessonVocabularyFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8345q0> {

    /* JADX INFO: renamed from: j */
    public static final LessonVocabularyFragment$binding$2 f29210j = new LessonVocabularyFragment$binding$2();

    public LessonVocabularyFragment$binding$2() {
        super(1, C8345q0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonVocabularyBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8345q0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.cardView;
            MaterialCardView materialCardView = (MaterialCardView) C0062b.m298P0(view2, R.id.cardView);
            if (materialCardView != null) {
                i10 = R.id.fragment_container_token;
                if (((FragmentContainerView) C0062b.m298P0(view2, R.id.fragment_container_token)) != null) {
                    i10 = R.id.tlVocabulary;
                    TabLayout tabLayout = (TabLayout) C0062b.m298P0(view2, R.id.tlVocabulary);
                    if (tabLayout != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                        if (materialToolbar != null) {
                            i10 = R.id.viewContent;
                            if (((LinearLayout) C0062b.m298P0(view2, R.id.viewContent)) != null) {
                                i10 = R.id.vpVocabulary;
                                ViewPager2 viewPager2 = (ViewPager2) C0062b.m298P0(view2, R.id.vpVocabulary);
                                if (viewPager2 != null) {
                                    return new C8345q0(materialCardView, tabLayout, materialToolbar, viewPager2);
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
