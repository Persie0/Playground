package com.lingq.p055ui.lesson.vocabulary;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import dm.C5207g;

/* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4496b extends FragmentStateAdapter {

    /* JADX INFO: renamed from: m */
    public final int f29357m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4496b(int i10, Fragment fragment) {
        super(fragment);
        C5207g.m11111f(fragment, "fragment");
        this.f29357m = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return 3;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: r */
    public final Fragment mo4670r(int i10) {
        int i11 = this.f29357m;
        if (i10 == 0) {
            LessonVocabularyPageFragment.C4470a c4470a = LessonVocabularyPageFragment.f29235D0;
            VocabularyType vocabularyType = VocabularyType.Cards;
            c4470a.getClass();
            return LessonVocabularyPageFragment.C4470a.m10232a(i11, vocabularyType);
        }
        if (i10 == 1) {
            LessonVocabularyPageFragment.C4470a c4470a2 = LessonVocabularyPageFragment.f29235D0;
            VocabularyType vocabularyType2 = VocabularyType.NewWords;
            c4470a2.getClass();
            return LessonVocabularyPageFragment.C4470a.m10232a(i11, vocabularyType2);
        }
        if (i10 != 2) {
            throw new IllegalStateException();
        }
        LessonVocabularyPageFragment.C4470a c4470a3 = LessonVocabularyPageFragment.f29235D0;
        VocabularyType vocabularyType3 = VocabularyType.All;
        c4470a3.getClass();
        return LessonVocabularyPageFragment.C4470a.m10232a(i11, vocabularyType3);
    }
}
