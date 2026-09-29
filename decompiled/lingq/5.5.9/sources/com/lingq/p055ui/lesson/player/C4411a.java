package com.lingq.p055ui.lesson.player;

import ae.C0062b;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.linguist.R;
import dm.C5207g;
import p254m2.C7472a;
import p278nh.InterfaceC7774a;
import p408u6.ViewOnClickListenerC9466e;
import ph.C8387y2;

/* JADX INFO: renamed from: com.lingq.ui.lesson.player.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4411a extends AbstractC1170u<a, c> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<LessonStudyTranslationSentence> f28886e;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final LessonStudyTranslationSentence f28887a;

        /* JADX INFO: renamed from: b */
        public final boolean f28888b;

        public a(LessonStudyTranslationSentence lessonStudyTranslationSentence, boolean z10) {
            this.f28887a = lessonStudyTranslationSentence;
            this.f28888b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f28887a, aVar.f28887a) && this.f28888b == aVar.f28888b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public final int hashCode() {
            int iHashCode = this.f28887a.hashCode() * 31;
            boolean z10 = this.f28888b;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            return "AdapterItem(sentence=" + this.f28887a + ", isActive=" + this.f28888b + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.a$b */
    public static final class b extends C1162m.e<a> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(a aVar, a aVar2) {
            return C5207g.m11106a(aVar, aVar2);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(a aVar, a aVar2) {
            return aVar.f28887a.f21895a == aVar2.f28887a.f21895a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.a$c */
    public static final class c extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8387y2 f28889u;

        public c(C8387y2 c8387y2) {
            super((ConstraintLayout) c8387y2.f45479a);
            this.f28889u = c8387y2;
        }
    }

    public C4411a(ListeningModeFragment.C4390c c4390c) {
        super(new b());
        this.f28886e = c4390c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        c cVar = (c) abstractC1109b0;
        a aVarM4528p = m4528p(i10);
        C5207g.m11110e(aVarM4528p, "getItem(position)");
        a aVar = aVarM4528p;
        C8387y2 c8387y2 = cVar.f28889u;
        ((TextView) c8387y2.f45480b).setText(aVar.f28887a.f21899e);
        boolean z10 = aVar.f28888b;
        View view = cVar.f7054a;
        View view2 = c8387y2.f45480b;
        if (z10) {
            Context context = view.getContext();
            Object obj = C7472a.f41322a;
            ((TextView) view2).setTextColor(C7472a.d.m14851a(context, R.color.white));
        } else {
            Context context2 = view.getContext();
            Object obj2 = C7472a.f41322a;
            ((TextView) view2).setTextColor(C7472a.d.m14851a(context2, R.color.grey));
        }
        ((ConstraintLayout) c8387y2.f45479a).setOnClickListener(new ViewOnClickListenerC9466e(cVar, 12, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_listening_mode, recyclerView, false);
        TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvSentence);
        if (textView != null) {
            return new c(new C8387y2((ConstraintLayout) viewM849h, textView));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(R.id.tvSentence)));
    }
}
