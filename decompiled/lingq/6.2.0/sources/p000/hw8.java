package p000;

import com.lingq.feature.review.views.unscrambler.SentenceBuilderView;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class hw8 implements kw8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SentenceBuilderView f43077a;

    public hw8(SentenceBuilderView sentenceBuilderView) {
        this.f43077a = sentenceBuilderView;
    }

    @Override // p000.kw8
    /* JADX INFO: renamed from: a */
    public final void mo9668a(sx8 sx8Var) {
        kw8 kw8Var;
        sx8Var.getClass();
        String str = sx8Var.f61555a;
        SentenceBuilderView sentenceBuilderView = this.f43077a;
        ArrayList arrayList = sentenceBuilderView.f32806e;
        HashSet hashSet = sentenceBuilderView.f32808g;
        if (hashSet.contains(sx8Var)) {
            return;
        }
        hashSet.add(sx8Var);
        sentenceBuilderView.m9664c(false);
        arrayList.add(str);
        if (sentenceBuilderView.f32807f != null) {
            str.getClass();
        }
        String string = vk9.m23376L0(u91.m22596N0(arrayList, " ", null, null, new qv7(28), 30)).toString();
        kw8 kw8Var2 = sentenceBuilderView.f32807f;
        if (kw8Var2 != null) {
            kw8Var2.mo257b(string);
        }
        if (string.length() == sentenceBuilderView.f32805d.length() && sentenceBuilderView.m9662a()) {
            kw8 kw8Var3 = sentenceBuilderView.f32807f;
            if (kw8Var3 != null) {
                kw8Var3.onSuccess();
                return;
            }
            return;
        }
        if (string.length() == sentenceBuilderView.f32805d.length() || (kw8Var = sentenceBuilderView.f32807f) == null) {
            return;
        }
        kw8Var.mo258d(sx8Var);
    }
}
