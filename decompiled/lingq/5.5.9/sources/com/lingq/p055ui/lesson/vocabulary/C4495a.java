package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
import com.lingq.util.ViewsUtilsKt;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kotlin.collections.C6752c;
import li.C7374a;
import li.C7378e;
import li.InterfaceC7379f;
import p024b3.C1299f;
import p096ei.C5408a;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import p254m2.C7472a;
import p278nh.InterfaceC7774a;
import p408u6.ViewOnClickListenerC9466e;
import p512yi.ViewOnClickListenerC10369a;
import ph.C8353r3;

/* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4495a extends AbstractC1170u<InterfaceC7379f, a> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<InterfaceC7379f> f29354e;

    /* JADX INFO: renamed from: f */
    public final c f29355f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.a$a */
    public static final class a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8353r3 f29356u;

        public a(C8353r3 c8353r3) {
            super((ConstraintLayout) c8353r3.f45209d);
            this.f29356u = c8353r3;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.a$b */
    public static final class b extends C1162m.e<InterfaceC7379f> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(InterfaceC7379f interfaceC7379f, InterfaceC7379f interfaceC7379f2) {
            return C5207g.m11106a(interfaceC7379f, interfaceC7379f2);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(InterfaceC7379f interfaceC7379f, InterfaceC7379f interfaceC7379f2) {
            return C5207g.m11106a(interfaceC7379f.mo14774c(), interfaceC7379f2.mo14774c());
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo10233a(String str, int i10, Integer num, View view);
    }

    public C4495a(LessonVocabularyPageFragment.C4471b c4471b, LessonVocabularyPageFragment$onViewCreated$adapter$2 lessonVocabularyPageFragment$onViewCreated$adapter$2) {
        super(new b());
        this.f29354e = c4471b;
        this.f29355f = lessonVocabularyPageFragment$onViewCreated$adapter$2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        a aVar = (a) abstractC1109b0;
        InterfaceC7379f interfaceC7379fM4528p = m4528p(i10);
        C5207g.m11110e(interfaceC7379fM4528p, "item");
        C8353r3 c8353r3 = aVar.f29356u;
        TextView textView = c8353r3.f45208c;
        String strMo14774c = interfaceC7379fM4528p.mo14774c();
        List<String> listMo14775d = interfaceC7379fM4528p.mo14775d();
        if (listMo14775d.isEmpty()) {
            listMo14775d = interfaceC7379fM4528p.mo14773b();
        }
        textView.setText(C4924a.m10452c(listMo14775d, strMo14774c));
        TokenMeaning tokenMeaning = (TokenMeaning) C6752c.m13425S(interfaceC7379fM4528p.mo14772a());
        c8353r3.f45206a.setText(tokenMeaning != null ? tokenMeaning.f22090c : null);
        boolean z10 = interfaceC7379fM4528p instanceof C7374a;
        TextView textView2 = c8353r3.f45207b;
        View view = c8353r3.f45210e;
        View view2 = aVar.f7054a;
        if (z10) {
            C7374a c7374a = (C7374a) interfaceC7379fM4528p;
            int i11 = c7374a.f41150i;
            Integer num = c7374a.f41151j;
            int iM11568a = C5408a.m11568a(i11, num);
            if (iM11568a == CardStatus.Ignored.getValue() || iM11568a == CardStatus.Known.getValue()) {
                C5207g.m11110e(textView2, "tvStatus");
                C4924a.m10422A(textView2);
                ImageButton imageButton = (ImageButton) view;
                C5207g.m11110e(imageButton, "ibStatus");
                C4924a.m10457e0(imageButton);
                List<Integer> list = C6716m.f37937a;
                Context context = view2.getContext();
                C5207g.m11110e(context, "itemView.context");
                C6716m.m13323h(context, iM11568a, imageButton);
                Context context2 = view2.getContext();
                C5207g.m11110e(context2, "itemView.context");
                C4924a.m10455d0(imageButton, C6716m.m13333r(ViewsUtilsKt.m10416b(i11, num), context2));
                imageButton.setActivated(true);
            } else {
                C5207g.m11110e(textView2, "tvStatus");
                C4924a.m10457e0(textView2);
                ImageButton imageButton2 = (ImageButton) view;
                C5207g.m11110e(imageButton2, "ibStatus");
                C4924a.m10422A(imageButton2);
                List<Integer> list2 = C6716m.f37937a;
                C6716m.m13324i(textView2, iM11568a);
                Context context3 = view2.getContext();
                C5207g.m11110e(context3, "itemView.context");
                C4924a.m10455d0(textView2, C6716m.m13333r(ViewsUtilsKt.m10416b(i11, num), context3));
                textView2.setActivated(true);
            }
        } else if (interfaceC7379fM4528p instanceof C7378e) {
            WordStatus wordStatus = WordStatus.Ignored;
            String value = wordStatus.getValue();
            String str = ((C7378e) interfaceC7379fM4528p).f41174h;
            if (C5207g.m11106a(str, value) || C5207g.m11106a(str, WordStatus.Known.getValue())) {
                C5207g.m11110e(textView2, "tvStatus");
                C4924a.m10422A(textView2);
                ImageButton imageButton3 = (ImageButton) view;
                C5207g.m11110e(imageButton3, "ibStatus");
                C4924a.m10457e0(imageButton3);
                List<Integer> list3 = C6716m.f37937a;
                Context context4 = view2.getContext();
                C5207g.m11110e(context4, "itemView.context");
                C5207g.m11111f(str, "status");
                if (C5207g.m11106a(str, wordStatus.getValue())) {
                    Object obj = C7472a.f41322a;
                    imageButton3.setImageDrawable(C7472a.c.m14849b(context4, R.drawable.ic_trash));
                } else if (C5207g.m11106a(str, WordStatus.Known.getValue())) {
                    Object obj2 = C7472a.f41322a;
                    imageButton3.setImageDrawable(C7472a.c.m14849b(context4, R.drawable.ic_check_thick));
                }
                C1299f.m4817c(imageButton3, ColorStateList.valueOf(C6716m.m13333r(R.attr.primaryTextColor, context4)));
                Context context5 = view2.getContext();
                C5207g.m11110e(context5, "itemView.context");
                C4924a.m10455d0(imageButton3, C6716m.m13333r(ViewsUtilsKt.m10418d(str), context5));
                imageButton3.setActivated(true);
            } else {
                C5207g.m11110e(textView2, "tvStatus");
                C4924a.m10457e0(textView2);
                ImageButton imageButton4 = (ImageButton) view;
                C5207g.m11110e(imageButton4, "ibStatus");
                C4924a.m10422A(imageButton4);
                List<Integer> list4 = C6716m.f37937a;
                C5207g.m11111f(str, "status");
                if (C5207g.m11106a(str, WordStatus.New.getValue())) {
                    textView2.setText("1");
                }
                Context context6 = view2.getContext();
                C5207g.m11110e(context6, "itemView.context");
                C4924a.m10455d0(textView2, C6716m.m13333r(ViewsUtilsKt.m10418d(str), context6));
                textView2.setActivated(true);
            }
        }
        ((ConstraintLayout) c8353r3.f45209d).setOnClickListener(new ViewOnClickListenerC10369a(aVar, this, interfaceC7379fM4528p, 2));
        ((ImageButton) view).setOnClickListener(new ViewOnClickListenerC6464i(aVar, 18, this));
        textView2.setOnClickListener(new ViewOnClickListenerC9466e(aVar, 13, this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_lesson_vocabulary, recyclerView, false);
        int i11 = R.id.ibStatus;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(viewM849h, R.id.ibStatus);
        if (imageButton != null) {
            i11 = R.id.tvMeaning;
            TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvMeaning);
            if (textView != null) {
                i11 = R.id.tvStatus;
                TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tvStatus);
                if (textView2 != null) {
                    i11 = R.id.tvTerm;
                    TextView textView3 = (TextView) C0062b.m298P0(viewM849h, R.id.tvTerm);
                    if (textView3 != null) {
                        return new a(new C8353r3((ConstraintLayout) viewM849h, imageButton, textView, textView2, textView3));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
    }
}
