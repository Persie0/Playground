package com.lingq.feature.library.preview;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.core.p012ui.R$id;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.vi3;
import p000.xd3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LessonPreviewFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final LessonPreviewFragment$binding$2 f26707i = new LessonPreviewFragment$binding$2(1, xd3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/core/ui/databinding/FragmentLessonPreviewBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnAction;
        MaterialButton materialButton = (MaterialButton) lfa.m16159c(view, i);
        if (materialButton != null) {
            i = R$id.btnBack;
            ImageButton imageButton = (ImageButton) lfa.m16159c(view, i);
            if (imageButton != null) {
                i = R$id.fragment_top;
                if (((FragmentContainerView) lfa.m16159c(view, i)) != null) {
                    i = R$id.rlToolbar;
                    RelativeLayout relativeLayout = (RelativeLayout) lfa.m16159c(view, i);
                    if (relativeLayout != null) {
                        i = R$id.viewProgress;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) lfa.m16159c(view, i);
                        if (circularProgressIndicator != null) {
                            i = R$id.f23945wv;
                            WebView webView = (WebView) lfa.m16159c(view, i);
                            if (webView != null) {
                                return new xd3(materialButton, imageButton, relativeLayout, circularProgressIndicator, webView);
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
