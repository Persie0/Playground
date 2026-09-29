package p000;

import android.view.View;
import com.lingq.feature.review.views.unscrambler.SentenceBuilderView;
import com.lingq.feature.review.views.unscrambler.SentenceView;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class jw8 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46320a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SentenceBuilderView f46321b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sx8 f46322c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f46323d;

    public jw8(View view, SentenceBuilderView sentenceBuilderView, sx8 sx8Var) {
        this.f46323d = view;
        this.f46321b = sentenceBuilderView;
        this.f46322c = sx8Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f46320a;
        xfa xfaVar = xfa.f68157a;
        sx8 sx8Var = this.f46322c;
        SentenceBuilderView sentenceBuilderView = this.f46321b;
        View view = this.f46323d;
        switch (i) {
            case 0:
                jfa.m14429l(view);
                SentenceView sentenceView = sentenceBuilderView.f32802a;
                sentenceView.removeViewAt(sx8Var.f61557c);
                sentenceView.m9671l();
                sentenceBuilderView.f32803b.m9671l();
                sentenceBuilderView.f32809h.clear();
                break;
            default:
                SentenceView sentenceView2 = sentenceBuilderView.f32802a;
                HashSet hashSet = sentenceBuilderView.f32808g;
                SentenceView sentenceView3 = sentenceBuilderView.f32803b;
                String str = sx8Var.f61555a;
                int i2 = sx8Var.f61556b;
                int childCount = sentenceView2.getChildCount() - 1;
                str.getClass();
                sentenceView2.removeViewAt(childCount);
                sentenceView2.addView(SentenceView.m9667j(sentenceView2, str, i2, false, 0, 12), childCount);
                if (sentenceBuilderView.f32810i) {
                    p20 p20Var = new p20();
                    p20Var.mo10194O(100L);
                    oaa.m17884a(sentenceView3, p20Var);
                    sentenceView3.removeView(view);
                    sentenceView3.m9671l();
                    sentenceView2.m9671l();
                    hashSet.clear();
                    sentenceView2.m9672m();
                } else {
                    hashSet.remove(sx8Var);
                    if (!hashSet.isEmpty()) {
                        sentenceBuilderView.m9664c(true);
                    }
                }
                jfa.m14420c(view);
                break;
        }
        return xfaVar;
    }

    public jw8(SentenceBuilderView sentenceBuilderView, sx8 sx8Var, View view) {
        this.f46321b = sentenceBuilderView;
        this.f46322c = sx8Var;
        this.f46323d = view;
    }
}
