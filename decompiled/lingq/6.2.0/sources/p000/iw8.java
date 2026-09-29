package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.lingq.feature.review.views.unscrambler.SentenceBuilderView;
import com.lingq.feature.review.views.unscrambler.SentenceView;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class iw8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f44711b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SentenceBuilderView f44712c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sx8 f44713d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f44714e;

    public /* synthetic */ iw8(ViewGroup viewGroup, SentenceBuilderView sentenceBuilderView, sx8 sx8Var, long j, int i) {
        this.f44710a = i;
        this.f44711b = viewGroup;
        this.f44712c = sentenceBuilderView;
        this.f44713d = sx8Var;
        this.f44714e = j;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f44710a;
        ViewGroup viewGroup = this.f44711b;
        SentenceBuilderView sentenceBuilderView = this.f44712c;
        sx8 sx8Var = this.f44713d;
        switch (i) {
            case 0:
                SentenceView sentenceView = sentenceBuilderView.f32803b;
                SentenceView sentenceView2 = sentenceBuilderView.f32802a;
                if (viewGroup.getMeasuredWidth() > 0 && viewGroup.getMeasuredHeight() > 0) {
                    viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    View childAt = sentenceView2.getChildAt(sx8Var.f61557c);
                    childAt.getClass();
                    jfa.m14429l(childAt);
                    View childAt2 = sentenceView.getChildAt(0);
                    if (childAt2 != null) {
                        int[] iArr = new int[2];
                        childAt2.getLocationOnScreen(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        int[] iArr2 = new int[2];
                        childAt.getLocationOnScreen(iArr2);
                        jfa.m14424g(childAt, f - iArr2[0], f2 - iArr2[1], this.f44714e, new jw8(childAt2, sentenceBuilderView, sx8Var), 8);
                    } else {
                        sentenceView2.m9671l();
                        sentenceView.m9671l();
                        sentenceBuilderView.f32809h.clear();
                    }
                    break;
                }
                break;
            default:
                HashSet hashSet = sentenceBuilderView.f32808g;
                SentenceView sentenceView3 = sentenceBuilderView.f32803b;
                SentenceView sentenceView4 = sentenceBuilderView.f32802a;
                if (viewGroup.getMeasuredWidth() > 0 && viewGroup.getMeasuredHeight() > 0) {
                    viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    View childAt3 = sentenceView4.getChildAt(sentenceView4.getChildCount() - 1);
                    View childAt4 = sentenceView3.getChildAt(sentenceBuilderView.f32810i ? sx8Var.f61557c : sx8Var.f61556b);
                    if (childAt3 != null && childAt4 != null) {
                        int[] iArr3 = new int[2];
                        childAt3.getLocationOnScreen(iArr3);
                        float f3 = iArr3[0];
                        float f4 = iArr3[1];
                        int[] iArr4 = new int[2];
                        childAt4.getLocationOnScreen(iArr4);
                        jfa.m14424g(childAt4, f3 - iArr4[0], f4 - iArr4[1], this.f44714e, new jw8(sentenceBuilderView, sx8Var, childAt4), 8);
                    } else if (!sentenceBuilderView.f32810i) {
                        hashSet.remove(sx8Var);
                    } else {
                        sentenceView4.m9671l();
                        sentenceView3.m9671l();
                        hashSet.clear();
                    }
                    break;
                }
                break;
        }
    }
}
