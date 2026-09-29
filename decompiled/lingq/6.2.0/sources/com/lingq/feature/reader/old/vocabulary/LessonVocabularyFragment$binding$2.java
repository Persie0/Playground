package com.lingq.feature.reader.old.vocabulary;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.lingq.feature.reader.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.vi3;
import p000.yd3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LessonVocabularyFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final LessonVocabularyFragment$binding$2 f29681i = new LessonVocabularyFragment$binding$2(1, yd3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/reader/databinding/FragmentLessonVocabularyBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.cardView;
        MaterialCardView materialCardView = (MaterialCardView) lfa.m16159c(view, i);
        if (materialCardView != null) {
            i = R$id.fragment_container_token;
            if (((FragmentContainerView) lfa.m16159c(view, i)) != null) {
                i = R$id.fragment_upgrade;
                if (((FragmentContainerView) lfa.m16159c(view, i)) != null) {
                    i = R$id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) lfa.m16159c(view, i);
                    if (materialToolbar != null) {
                        i = R$id.viewContent;
                        if (((LinearLayout) lfa.m16159c(view, i)) != null) {
                            i = R$id.viewVocabularyList;
                            ComposeView composeView = (ComposeView) lfa.m16159c(view, i);
                            if (composeView != null) {
                                return new yd3(materialCardView, materialToolbar, composeView);
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
