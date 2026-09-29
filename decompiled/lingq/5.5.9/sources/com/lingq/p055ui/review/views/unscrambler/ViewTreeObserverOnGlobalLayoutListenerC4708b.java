package com.lingq.p055ui.review.views.unscrambler;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import cm.InterfaceC2041a;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.HashSet;
import p406u4.C9400b;
import p406u4.C9419k0;
import p538zj.C10509b;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.review.views.unscrambler.b */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4708b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f30526a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SentenceBuilderView f30527b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C10509b f30528c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f30529d;

    public ViewTreeObserverOnGlobalLayoutListenerC4708b(SentenceView sentenceView, SentenceBuilderView sentenceBuilderView, C10509b c10509b, long j10) {
        this.f30526a = sentenceView;
        this.f30527b = sentenceBuilderView;
        this.f30528c = c10509b;
        this.f30529d = j10;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.f30526a;
        if (viewGroup.getMeasuredWidth() > 0 && viewGroup.getMeasuredHeight() > 0) {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            final SentenceBuilderView sentenceBuilderView = this.f30527b;
            SentenceView sentenceView = sentenceBuilderView.f30486a;
            View childAt = sentenceView.getChildAt(sentenceView.getChildCount() - 1);
            boolean z10 = sentenceBuilderView.f30494i;
            final C10509b c10509b = this.f30528c;
            int i10 = z10 ? c10509b.f52465c : c10509b.f52464b;
            SentenceView sentenceView2 = sentenceBuilderView.f30487b;
            final View childAt2 = sentenceView2.getChildAt(i10);
            if (childAt != null && childAt2 != null) {
                int[] iArr = new int[2];
                childAt.getLocationOnScreen(iArr);
                float f3 = iArr[0];
                float f10 = iArr[1];
                int[] iArr2 = new int[2];
                childAt2.getLocationOnScreen(iArr2);
                C4924a.m10440S(childAt2, f3 - iArr2[0], f10 - iArr2[1], this.f30529d, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.unscrambler.SentenceBuilderView$moveUp$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        SentenceBuilderView sentenceBuilderView2 = sentenceBuilderView;
                        SentenceView sentenceView3 = sentenceBuilderView2.f30486a;
                        C10509b c10509b2 = c10509b;
                        String str = c10509b2.f52463a;
                        int i11 = c10509b2.f52464b;
                        int childCount = sentenceView3.getChildCount() - 1;
                        C5207g.m11111f(str, "word");
                        sentenceView3.removeViewAt(childCount);
                        sentenceView3.addView(SentenceView.m10321n(sentenceView3, str, i11, false, 0, 12), childCount);
                        boolean z11 = sentenceBuilderView2.f30494i;
                        HashSet<C10509b> hashSet = sentenceBuilderView2.f30492g;
                        View view = childAt2;
                        if (z11) {
                            C9400b c9400b = new C9400b();
                            c9400b.mo17783J(100L);
                            SentenceView sentenceView4 = sentenceBuilderView2.f30487b;
                            C9419k0.m17819a(sentenceView4, c9400b);
                            sentenceView4.removeView(view);
                            sentenceView4.m10324p();
                            SentenceView sentenceView5 = sentenceBuilderView2.f30486a;
                            sentenceView5.m10324p();
                            hashSet.clear();
                            sentenceView5.m10325q();
                        } else {
                            hashSet.remove(c10509b2);
                            if (!hashSet.isEmpty()) {
                                sentenceBuilderView2.m10318c(true);
                            }
                        }
                        C5207g.m11110e(view, "originalSentenceWordView");
                        C4924a.m10422A(view);
                        return C9072e.f47360a;
                    }
                }, 8);
                return;
            }
            boolean z11 = sentenceBuilderView.f30494i;
            HashSet<C10509b> hashSet = sentenceBuilderView.f30492g;
            if (z11) {
                sentenceBuilderView.f30486a.m10324p();
                sentenceView2.m10324p();
                hashSet.clear();
                return;
            }
            hashSet.remove(c10509b);
        }
    }
}
