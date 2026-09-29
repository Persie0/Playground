package com.lingq.p055ui.review.views.unscrambler;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import cm.InterfaceC2041a;
import com.lingq.util.C4924a;
import dm.C5207g;
import p538zj.C10509b;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.review.views.unscrambler.a */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4707a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f30522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SentenceBuilderView f30523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C10509b f30524c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f30525d;

    public ViewTreeObserverOnGlobalLayoutListenerC4707a(SentenceView sentenceView, SentenceBuilderView sentenceBuilderView, C10509b c10509b, long j10) {
        this.f30522a = sentenceView;
        this.f30523b = sentenceBuilderView;
        this.f30524c = c10509b;
        this.f30525d = j10;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.f30522a;
        if (viewGroup.getMeasuredWidth() > 0 && viewGroup.getMeasuredHeight() > 0) {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            final SentenceBuilderView sentenceBuilderView = this.f30523b;
            SentenceView sentenceView = sentenceBuilderView.f30486a;
            final C10509b c10509b = this.f30524c;
            View childAt = sentenceView.getChildAt(c10509b.f52465c);
            C5207g.m11110e(childAt, "builderSentenceWordView");
            C4924a.m10457e0(childAt);
            SentenceView sentenceView2 = sentenceBuilderView.f30487b;
            final View childAt2 = sentenceView2.getChildAt(0);
            if (childAt2 == null) {
                sentenceBuilderView.f30486a.m10324p();
                sentenceView2.m10324p();
                sentenceBuilderView.f30493h.clear();
                return;
            }
            int[] iArr = new int[2];
            childAt2.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f10 = iArr[1];
            int[] iArr2 = new int[2];
            childAt.getLocationOnScreen(iArr2);
            C4924a.m10440S(childAt, f3 - iArr2[0], f10 - iArr2[1], this.f30525d, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.unscrambler.SentenceBuilderView$moveDownWithoutOutline$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    View view = childAt2;
                    C5207g.m11110e(view, "originalBackgroundWordView");
                    C4924a.m10457e0(view);
                    SentenceBuilderView sentenceBuilderView2 = sentenceBuilderView;
                    sentenceBuilderView2.f30486a.removeViewAt(c10509b.f52465c);
                    sentenceBuilderView2.f30486a.m10324p();
                    sentenceBuilderView2.f30487b.m10324p();
                    sentenceBuilderView2.f30493h.clear();
                    return C9072e.f47360a;
                }
            }, 8);
        }
    }
}
