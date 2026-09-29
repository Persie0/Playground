package com.lingq.p055ui.lesson.tutorial;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.linguist.R;
import dm.C5207g;
import kotlin.collections.C6752c;
import li.C7378e;
import ph.C8357s2;
import si.ViewOnClickListenerC9029m;

/* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4465a extends AbstractC1170u<C7378e, a> {

    /* JADX INFO: renamed from: e */
    public final c f29204e;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.a$a */
    public static final class a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8357s2 f29205u;

        public a(C8357s2 c8357s2) {
            super(c8357s2.f45251a);
            this.f29205u = c8357s2;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.a$b */
    public static final class b extends C1162m.e<C7378e> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(C7378e c7378e, C7378e c7378e2) {
            return C5207g.m11106a(c7378e, c7378e2);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(C7378e c7378e, C7378e c7378e2) {
            return C5207g.m11106a(c7378e.f41167a, c7378e2.f41167a);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo10227a(C7378e c7378e);
    }

    public C4465a(LessonDealWithWordsFragment.C4437a c4437a) {
        super(new b());
        this.f29204e = c4437a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        String string;
        a aVar = (a) abstractC1109b0;
        C7378e c7378eM4528p = m4528p(i10);
        C5207g.m11110e(c7378eM4528p, "item");
        C8357s2 c8357s2 = aVar.f29205u;
        c8357s2.f45253c.setText(c7378eM4528p.f41167a);
        TokenMeaning tokenMeaning = (TokenMeaning) C6752c.m13425S(c7378eM4528p.f41171e);
        if (tokenMeaning == null || (string = tokenMeaning.f22090c) == null) {
            string = aVar.f7054a.getContext().getString(R.string.ui_loading);
        }
        c8357s2.f45252b.setText(string);
        ((ImageButton) c8357s2.f45254d).setOnClickListener(new ViewOnClickListenerC9029m(aVar, 14, this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_lesson_move_known_page_complete, recyclerView, false);
        int i11 = R.id.btnHintAdd;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(viewM849h, R.id.btnHintAdd);
        if (imageButton != null) {
            i11 = R.id.tvMeaning;
            TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvMeaning);
            if (textView != null) {
                i11 = R.id.tvTerm;
                TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tvTerm);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewM849h;
                    i11 = R.id.viewTerm;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C0062b.m298P0(viewM849h, R.id.viewTerm);
                    if (constraintLayout2 != null) {
                        return new a(new C8357s2(constraintLayout, imageButton, textView, textView2, constraintLayout, constraintLayout2));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
    }
}
