package com.lingq.p055ui.lesson.edit;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import dm.C5207g;
import java.util.List;

/* JADX INFO: renamed from: com.lingq.ui.lesson.edit.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4307b extends FragmentStateAdapter {

    /* JADX INFO: renamed from: m */
    public final List<a> f28124m;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f28125a;

        /* JADX INFO: renamed from: b */
        public final boolean f28126b;

        /* JADX INFO: renamed from: c */
        public final int f28127c;

        public a(int i10, int i11, boolean z10) {
            this.f28125a = i10;
            this.f28126b = z10;
            this.f28127c = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f28125a == aVar.f28125a && this.f28126b == aVar.f28126b && this.f28127c == aVar.f28127c) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f28125a) * 31;
            boolean z10 = this.f28126b;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return Integer.hashCode(this.f28127c) + ((iHashCode + r10) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SentenceData(lessonId=");
            sb2.append(this.f28125a);
            sb2.append(", hasAudio=");
            sb2.append(this.f28126b);
            sb2.append(", sentenceIndex=");
            return C0166e.m768o(sb2, this.f28127c, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4307b(List list, SentenceEditPagerFragment sentenceEditPagerFragment) {
        super(sentenceEditPagerFragment);
        C5207g.m11111f(list, "data");
        C5207g.m11111f(sentenceEditPagerFragment, "fragment");
        this.f28124m = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return this.f28124m.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: r */
    public final Fragment mo4670r(int i10) {
        SentenceEditPageFragment.C4294a c4294a = SentenceEditPageFragment.f27986E0;
        a aVar = this.f28124m.get(i10);
        c4294a.getClass();
        C5207g.m11111f(aVar, "sentenceData");
        Bundle bundle = new Bundle();
        SentenceEditPageFragment sentenceEditPageFragment = new SentenceEditPageFragment();
        bundle.putInt("lessonId", aVar.f28125a);
        bundle.putBoolean("hasAudio", aVar.f28126b);
        bundle.putInt("sentenceIndex", aVar.f28127c);
        sentenceEditPageFragment.m3583e0(bundle);
        return sentenceEditPageFragment;
    }
}
