package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.linguist.R;
import dm.C5207g;
import p278nh.InterfaceC7774a;
import ph.C8362t2;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: renamed from: com.lingq.ui.lesson.edit.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4306a extends AbstractC1170u<a, c> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<LessonStudyTranslationSentence> f28121e;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final LessonStudyTranslationSentence f28122a;

        public a(LessonStudyTranslationSentence lessonStudyTranslationSentence) {
            C5207g.m11111f(lessonStudyTranslationSentence, "sentence");
            this.f28122a = lessonStudyTranslationSentence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C5207g.m11106a(this.f28122a, ((a) obj).f28122a);
        }

        public final int hashCode() {
            return this.f28122a.hashCode();
        }

        public final String toString() {
            return "AdapterItem(sentence=" + this.f28122a + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.a$b */
    public static final class b extends C1162m.e<a> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(a aVar, a aVar2) {
            return C5207g.m11106a(aVar.f28122a, aVar2.f28122a);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(a aVar, a aVar2) {
            return aVar.f28122a.f21895a == aVar2.f28122a.f21895a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.a$c */
    public static final class c extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8362t2 f28123u;

        public c(C8362t2 c8362t2) {
            super(c8362t2.m16413b());
            this.f28123u = c8362t2;
        }
    }

    public C4306a(LessonEditSentencesFragment.C4279a c4279a) {
        super(new b());
        this.f28121e = c4279a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        c cVar = (c) abstractC1109b0;
        String str = m4528p(i10).f28122a.f21899e;
        C5207g.m11111f(str, "sentence");
        C8362t2 c8362t2 = cVar.f28123u;
        ((TextView) c8362t2.f45286c).setText(str);
        c8362t2.m16413b().setOnClickListener(new ViewOnClickListenerC9734i(cVar, 10, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_lesson_sentence, recyclerView, false);
        TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvSentence);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(R.id.tvSentence)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) viewM849h;
        return new c(new C8362t2(relativeLayout, textView, relativeLayout, 2));
    }
}
