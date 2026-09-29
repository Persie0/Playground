package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8334o0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LessonPreviewFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8334o0> {

    /* JADX INFO: renamed from: j */
    public static final LessonPreviewFragment$binding$2 f24535j = new LessonPreviewFragment$binding$2();

    public LessonPreviewFragment$binding$2() {
        super(1, C8334o0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonPreviewBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8334o0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnCancel;
        TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnCancel);
        if (textView != null) {
            i10 = R.id.btnDone;
            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.btnDone);
            if (textView2 != null) {
                i10 = R.id.fragment_top;
                if (((FragmentContainerView) C0062b.m298P0(view2, R.id.fragment_top)) != null) {
                    i10 = R.id.viewProgress;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress);
                    if (circularProgressIndicator != null) {
                        i10 = R.id.viewProgressImport;
                        CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgressImport);
                        if (circularProgressIndicator2 != null) {
                            i10 = R.id.f32129wv;
                            WebView webView = (WebView) C0062b.m298P0(view2, R.id.f32129wv);
                            if (webView != null) {
                                return new C8334o0(textView, textView2, circularProgressIndicator, circularProgressIndicator2, webView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
