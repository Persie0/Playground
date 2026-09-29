package com.google.android.material.tabs;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.lingq.p055ui.lesson.vocabulary.LessonVocabularyFragment;
import com.linguist.R;
import dm.C5207g;
import java.lang.ref.WeakReference;
import km.InterfaceC6727j;
import p402u0.C9369l;

/* JADX INFO: renamed from: com.google.android.material.tabs.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3083d {

    /* JADX INFO: renamed from: a */
    public final TabLayout f15695a;

    /* JADX INFO: renamed from: b */
    public final ViewPager2 f15696b;

    /* JADX INFO: renamed from: c */
    public final b f15697c;

    /* JADX INFO: renamed from: d */
    public RecyclerView.Adapter<?> f15698d;

    /* JADX INFO: renamed from: e */
    public boolean f15699e;

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$a */
    public class a extends RecyclerView.AbstractC1114g {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: a */
        public final void mo4265a() {
            C3083d.this.m8881a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: b */
        public final void mo4266b() {
            C3083d.this.m8881a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: c */
        public final void mo4267c(int i10, int i11, Object obj) {
            C3083d.this.m8881a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: d */
        public final void mo4268d(int i10, int i11) {
            C3083d.this.m8881a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: e */
        public final void mo4269e(int i10, int i11) {
            C3083d.this.m8881a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: f */
        public final void mo4270f(int i10, int i11) {
            C3083d.this.m8881a();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$b */
    public interface b {
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$c */
    public static class c extends ViewPager2.AbstractC1229e {

        /* JADX INFO: renamed from: a */
        public final WeakReference<TabLayout> f15701a;

        /* JADX INFO: renamed from: c */
        public int f15703c = 0;

        /* JADX INFO: renamed from: b */
        public int f15702b = 0;

        public c(TabLayout tabLayout) {
            this.f15701a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
        /* JADX INFO: renamed from: a */
        public final void mo4680a(int i10) {
            this.f15702b = this.f15703c;
            this.f15703c = i10;
            TabLayout tabLayout = this.f15701a.get();
            if (tabLayout != null) {
                tabLayout.f15656s0 = this.f15703c;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
        /* JADX INFO: renamed from: b */
        public final void mo4686b(float f3, int i10, int i11) {
            TabLayout tabLayout = this.f15701a.get();
            if (tabLayout != null) {
                int i12 = this.f15703c;
                tabLayout.m8865o(i10, f3, i12 != 2 || this.f15702b == 1, (i12 == 2 && this.f15702b == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
        /* JADX INFO: renamed from: c */
        public final void mo4681c(int i10) {
            TabLayout tabLayout = this.f15701a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f15703c;
            tabLayout.m8863m(tabLayout.m8859i(i10), i11 == 0 || (i11 == 2 && this.f15702b == 0));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$d */
    public static class d implements TabLayout.InterfaceC3073d {

        /* JADX INFO: renamed from: a */
        public final ViewPager2 f15704a;

        /* JADX INFO: renamed from: b */
        public final boolean f15705b;

        public d(ViewPager2 viewPager2, boolean z10) {
            this.f15704a = viewPager2;
            this.f15705b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3072c
        /* JADX INFO: renamed from: a */
        public final void mo6541a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3072c
        /* JADX INFO: renamed from: b */
        public final void mo6542b(TabLayout.C3076g c3076g) {
            this.f15704a.m4683b(c3076g.f15668d, this.f15705b);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC3072c
        /* JADX INFO: renamed from: c */
        public final void mo6543c(TabLayout.C3076g c3076g) {
        }
    }

    public C3083d(TabLayout tabLayout, ViewPager2 viewPager2, C9369l c9369l) {
        this.f15695a = tabLayout;
        this.f15696b = viewPager2;
        this.f15697c = c9369l;
    }

    /* JADX INFO: renamed from: a */
    public final void m8881a() {
        String strM3600t;
        TabLayout tabLayout = this.f15695a;
        tabLayout.m8862l();
        RecyclerView.Adapter<?> adapter = this.f15698d;
        if (adapter != null) {
            int iMo4226e = adapter.mo4226e();
            int i10 = 0;
            while (i10 < iMo4226e) {
                TabLayout.C3076g c3076gM8860j = tabLayout.m8860j();
                LessonVocabularyFragment lessonVocabularyFragment = (LessonVocabularyFragment) ((C9369l) this.f15697c).f48141b;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonVocabularyFragment.f29206D0;
                C5207g.m11111f(lessonVocabularyFragment, "this$0");
                if (i10 == 0) {
                    strM3600t = lessonVocabularyFragment.m3600t(R.string.lingq_lingqs);
                } else if (i10 != 1) {
                    strM3600t = i10 != 2 ? "" : lessonVocabularyFragment.m3600t(R.string.search_all);
                } else {
                    strM3600t = lessonVocabularyFragment.m3600t(R.string.feed_words_new);
                }
                if (TextUtils.isEmpty(c3076gM8860j.f15667c) && !TextUtils.isEmpty(strM3600t)) {
                    c3076gM8860j.f15672h.setContentDescription(strM3600t);
                }
                c3076gM8860j.f15666b = strM3600t;
                TabLayout.C3078i c3078i = c3076gM8860j.f15672h;
                if (c3078i != null) {
                    c3078i.m8875d();
                }
                tabLayout.m8853b(c3076gM8860j, false);
                i10++;
            }
            if (iMo4226e > 0) {
                int iMin = Math.min(this.f15696b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.m8863m(tabLayout.m8859i(iMin), true);
                }
            }
        }
    }
}
