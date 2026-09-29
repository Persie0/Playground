package com.lingq.p055ui.lesson;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.lingq.p055ui.lesson.page.LessonPageFragment;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;
import p265mj.C7567a;

/* JADX INFO: renamed from: com.lingq.ui.lesson.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C4270d extends FragmentStateAdapter {

    /* JADX INFO: renamed from: m */
    public List<a> f27857m;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C7567a f27858a;

        /* JADX INFO: renamed from: b */
        public final String f27859b;

        /* JADX INFO: renamed from: c */
        public final String f27860c;

        /* JADX INFO: renamed from: d */
        public final String f27861d;

        /* JADX INFO: renamed from: e */
        public final boolean f27862e;

        /* JADX INFO: renamed from: f */
        public final int f27863f;

        public a(C7567a c7567a, String str, String str2, String str3, boolean z10, int i10) {
            C5207g.m11111f(str, "lessonTitle");
            this.f27858a = c7567a;
            this.f27859b = str;
            this.f27860c = str2;
            this.f27861d = str3;
            this.f27862e = z10;
            this.f27863f = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f27858a, aVar.f27858a) && C5207g.m11106a(this.f27859b, aVar.f27859b) && C5207g.m11106a(this.f27860c, aVar.f27860c) && C5207g.m11106a(this.f27861d, aVar.f27861d) && this.f27862e == aVar.f27862e && this.f27863f == aVar.f27863f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final int hashCode() {
            int iM758d = C0166e.m758d(this.f27861d, C0166e.m758d(this.f27860c, C0166e.m758d(this.f27859b, this.f27858a.hashCode() * 31, 31), 31), 31);
            boolean z10 = this.f27862e;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return Integer.hashCode(this.f27863f) + ((iM758d + r10) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PageData(page=");
            sb2.append(this.f27858a);
            sb2.append(", lessonTitle=");
            sb2.append(this.f27859b);
            sb2.append(", collectionTitle=");
            sb2.append(this.f27860c);
            sb2.append(", lessonImage=");
            sb2.append(this.f27861d);
            sb2.append(", isSentenceMode=");
            sb2.append(this.f27862e);
            sb2.append(", lessonId=");
            return C0166e.m768o(sb2, this.f27863f, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4270d(EmptyList emptyList, Fragment fragment) {
        super(fragment);
        C5207g.m11111f(emptyList, "data");
        C5207g.m11111f(fragment, "fragment");
        this.f27857m = emptyList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return this.f27857m.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: r */
    public final Fragment mo4670r(int i10) {
        LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
        a aVar = this.f27857m.get(i10);
        c4337a.getClass();
        C5207g.m11111f(aVar, "pageData");
        Bundle bundle = new Bundle();
        LessonPageFragment lessonPageFragment = new LessonPageFragment();
        bundle.putInt("pagePosition", i10);
        bundle.putInt("lessonId", aVar.f27863f);
        bundle.putString("lessonTitle", aVar.f27859b);
        bundle.putString("collectionTitle", aVar.f27860c);
        bundle.putString("lessonImage", aVar.f27861d);
        bundle.putBoolean("isSentenceMode", aVar.f27862e);
        lessonPageFragment.m3583e0(bundle);
        return lessonPageFragment;
    }
}
