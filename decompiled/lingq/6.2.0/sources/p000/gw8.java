package p000;

import com.lingq.feature.review.views.unscrambler.SentenceBuilderView;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class gw8 implements kw8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SentenceBuilderView f41430a;

    public gw8(SentenceBuilderView sentenceBuilderView) {
        this.f41430a = sentenceBuilderView;
    }

    @Override // p000.kw8
    /* JADX INFO: renamed from: a */
    public final void mo9668a(sx8 sx8Var) {
        sx8Var.getClass();
        SentenceBuilderView sentenceBuilderView = this.f41430a;
        ArrayList arrayList = sentenceBuilderView.f32806e;
        HashSet hashSet = sentenceBuilderView.f32809h;
        if (hashSet.contains(sx8Var)) {
            return;
        }
        hashSet.add(sx8Var);
        sentenceBuilderView.m9663b(false);
        arrayList.remove(sx8Var.f61557c);
        String string = vk9.m23376L0(u91.m22596N0(arrayList, " ", null, null, new qv7(26), 30)).toString();
        kw8 kw8Var = sentenceBuilderView.f32807f;
        if (kw8Var != null) {
            kw8Var.mo257b(string);
        }
    }

    @Override // p000.kw8
    /* JADX INFO: renamed from: c */
    public final void mo12933c(ArrayList arrayList) {
        SentenceBuilderView sentenceBuilderView = this.f41430a;
        ArrayList arrayList2 = sentenceBuilderView.f32806e;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        String string = vk9.m23376L0(u91.m22596N0(arrayList2, " ", null, null, new qv7(27), 30)).toString();
        kw8 kw8Var = sentenceBuilderView.f32807f;
        if (kw8Var != null) {
            kw8Var.mo257b(string);
        }
    }
}
