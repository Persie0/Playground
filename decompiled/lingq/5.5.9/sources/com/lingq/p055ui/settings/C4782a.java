package com.lingq.p055ui.settings;

import ae.C0062b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.lingq.commons.p053ui.SettingsSelectionItemType;
import com.lingq.shared.storage.C3398a;
import com.lingq.shared.storage.LessonFont;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import ni.C7793a;
import p160hj.ViewOnTouchListenerC6057c;
import p278nh.AbstractC7789p;
import p408u6.ViewOnClickListenerC9466e;
import p512yi.ViewOnClickListenerC10371b;
import ph.C8265c3;
import ph.C8319l3;
import ph.C8330n2;
import ph.C8331n3;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: renamed from: com.lingq.ui.settings.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4782a extends AbstractC1170u<AbstractC7789p, a> {

    /* JADX INFO: renamed from: e */
    public final c f31150e;

    /* JADX INFO: renamed from: com.lingq.ui.settings.a$a */
    public static abstract class a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.settings.a$a$a, reason: collision with other inner class name */
        public static final class C10632a extends a {

            /* JADX INFO: renamed from: u */
            public final C8319l3 f31151u;

            /* JADX WARN: Illegal instructions before constructor call */
            public C10632a(C8319l3 c8319l3) {
                ConstraintLayout constraintLayout = c8319l3.f45010a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f31151u = c8319l3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.settings.a$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: u */
            public final C8331n3 f31152u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8331n3 c8331n3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c8331n3.f45087a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f31152u = c8331n3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.settings.a$a$c */
        public static final class c extends a {

            /* JADX INFO: renamed from: u */
            public final C8265c3 f31153u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8265c3 c8265c3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c8265c3.f44646b;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f31153u = c8265c3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.settings.a$a$d */
        public static final class d extends a {

            /* JADX INFO: renamed from: u */
            public final C8330n2 f31154u;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8330n2 c8330n2) {
                TextView textView = (TextView) c8330n2.f45085a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f31154u = c8330n2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.settings.a$a$e */
        public static final class e extends a {

            /* JADX INFO: renamed from: u */
            public final C8331n3 f31155u;

            /* JADX WARN: Illegal instructions before constructor call */
            public e(C8331n3 c8331n3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c8331n3.f45087a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f31155u = c8331n3;
            }
        }

        public a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.settings.a$b */
    public static final class b extends C1162m.e<AbstractC7789p> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC7789p abstractC7789p, AbstractC7789p abstractC7789p2) {
            AbstractC7789p abstractC7789p3 = abstractC7789p;
            AbstractC7789p abstractC7789p4 = abstractC7789p2;
            if ((abstractC7789p3 instanceof AbstractC7789p.b) && (abstractC7789p4 instanceof AbstractC7789p.b)) {
                return C5207g.m11106a(abstractC7789p3, abstractC7789p4);
            }
            if ((abstractC7789p3 instanceof AbstractC7789p.a) && (abstractC7789p4 instanceof AbstractC7789p.a)) {
                return C5207g.m11106a(abstractC7789p3, abstractC7789p4);
            }
            if ((abstractC7789p3 instanceof AbstractC7789p.e) && (abstractC7789p4 instanceof AbstractC7789p.e)) {
                return C5207g.m11106a(abstractC7789p3, abstractC7789p4);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(AbstractC7789p abstractC7789p, AbstractC7789p abstractC7789p2) {
            AbstractC7789p abstractC7789p3 = abstractC7789p;
            AbstractC7789p abstractC7789p4 = abstractC7789p2;
            boolean z10 = abstractC7789p3 instanceof AbstractC7789p.b;
            int i10 = abstractC7789p3.f42796a;
            int i11 = abstractC7789p4.f42796a;
            if (z10 && (abstractC7789p4 instanceof AbstractC7789p.b)) {
                if (i10 == i11) {
                    return true;
                }
                return false;
            }
            if ((abstractC7789p3 instanceof AbstractC7789p.a) && (abstractC7789p4 instanceof AbstractC7789p.a)) {
                if (i10 == i11) {
                    return true;
                }
                return false;
            }
            if ((abstractC7789p3 instanceof AbstractC7789p.e) && (abstractC7789p4 instanceof AbstractC7789p.e) && i10 == i11) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.settings.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo10355a(AbstractC7789p abstractC7789p);

        /* JADX INFO: renamed from: b */
        void mo10356b(AbstractC7789p.e eVar);

        /* JADX INFO: renamed from: c */
        void mo10357c(AbstractC7789p.a aVar, boolean z10);
    }

    public C4782a(SettingsSelectionFragment.C4773a c4773a) {
        super(new b());
        this.f31150e = c4773a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC7789p abstractC7789pM4528p = m4528p(i10);
        if (abstractC7789pM4528p instanceof AbstractC7789p.d) {
            return SettingsSelectionItemType.Title.ordinal();
        }
        if (abstractC7789pM4528p instanceof AbstractC7789p.b) {
            return SettingsSelectionItemType.Selection.ordinal();
        }
        if (abstractC7789pM4528p instanceof AbstractC7789p.a) {
            return SettingsSelectionItemType.FontDownloadSelection.ordinal();
        }
        if (abstractC7789pM4528p instanceof AbstractC7789p.e) {
            return SettingsSelectionItemType.TopicSelection.ordinal();
        }
        if (abstractC7789pM4528p instanceof AbstractC7789p.c) {
            return SettingsSelectionItemType.Switch.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        a aVar = (a) abstractC1109b0;
        if (aVar instanceof a.d) {
            AbstractC7789p abstractC7789pM4528p = m4528p(i10);
            C5207g.m11109d(abstractC7789pM4528p, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsSelectionAdapterItem.Title");
            a.d dVar = (a.d) aVar;
            ((TextView) dVar.f31154u.f45086b).setText(dVar.f7054a.getContext().getString(((AbstractC7789p.d) abstractC7789pM4528p).f42813e));
            return;
        }
        if (aVar instanceof a.b) {
            AbstractC7789p abstractC7789pM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC7789pM4528p2, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsSelectionAdapterItem.Selection");
            AbstractC7789p.b bVar = (AbstractC7789p.b) abstractC7789pM4528p2;
            a.b bVar2 = (a.b) aVar;
            C8331n3 c8331n3 = bVar2.f31152u;
            ImageView imageView = (ImageView) c8331n3.f45089c;
            C5207g.m11110e(imageView, "isSelected");
            imageView.setVisibility(Boolean.valueOf(bVar.f42799d).booleanValue() ? 0 : 4);
            TextView textView = (TextView) c8331n3.f45090d;
            textView.setText(bVar.f42797b);
            int i11 = bVar.f42809i;
            if (i11 != 0) {
                textView.setText(bVar2.f7054a.getContext().getString(i11));
            }
            ((ConstraintLayout) c8331n3.f45087a).setOnClickListener(new ViewOnClickListenerC9734i(this, 16, bVar));
            return;
        }
        if (!(aVar instanceof a.C10632a)) {
            if (aVar instanceof a.e) {
                AbstractC7789p abstractC7789pM4528p3 = m4528p(i10);
                C5207g.m11109d(abstractC7789pM4528p3, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsSelectionAdapterItem.TopicSelection");
                AbstractC7789p.e eVar = (AbstractC7789p.e) abstractC7789pM4528p3;
                a.e eVar2 = (a.e) aVar;
                C8331n3 c8331n4 = eVar2.f31155u;
                ImageView imageView2 = (ImageView) c8331n4.f45089c;
                C5207g.m11110e(imageView2, "isSelected");
                imageView2.setVisibility(Boolean.valueOf(eVar.f42799d).booleanValue() ? 0 : 4);
                ((TextView) c8331n4.f45090d).setText(C4924a.m10467j0(eVar.f42817h, eVar2.f7054a.getContext()));
                ((ConstraintLayout) c8331n4.f45087a).setOnClickListener(new ViewOnClickListenerC9466e(this, 17, eVar));
                return;
            }
            if (aVar instanceof a.c) {
                AbstractC7789p abstractC7789pM4528p4 = m4528p(i10);
                C5207g.m11109d(abstractC7789pM4528p4, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsSelectionAdapterItem.Switch");
                AbstractC7789p.c cVar = (AbstractC7789p.c) abstractC7789pM4528p4;
                a.c cVar2 = (a.c) aVar;
                C8265c3 c8265c3 = cVar2.f31153u;
                ((SwitchMaterial) c8265c3.f44648d).setOnCheckedChangeListener(null);
                ((TextView) c8265c3.f44647c).setText(cVar2.f7054a.getContext().getString(cVar.f42811f));
                SwitchMaterial switchMaterial = (SwitchMaterial) c8265c3.f44648d;
                switchMaterial.setChecked(cVar.f42812g);
                switchMaterial.setClickable(false);
                switchMaterial.setOnTouchListener(new ViewOnTouchListenerC6057c(this, 1, cVar));
                return;
            }
            return;
        }
        AbstractC7789p abstractC7789pM4528p5 = m4528p(i10);
        C5207g.m11109d(abstractC7789pM4528p5, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsSelectionAdapterItem.FontDownloadSelection");
        AbstractC7789p.a aVar2 = (AbstractC7789p.a) abstractC7789pM4528p5;
        a.C10632a c10632a = (a.C10632a) aVar;
        C8319l3 c8319l3 = c10632a.f31151u;
        c8319l3.f45013d.setText(aVar2.f42797b);
        LessonFont.INSTANCE.getClass();
        LessonFont lessonFontM9552b = LessonFont.Companion.m9552b(aVar2.f42798c);
        View view = c10632a.f7054a;
        Context context = view.getContext();
        C5207g.m11110e(context, "itemView.context");
        File fileM10466j = C4924a.m10466j(lessonFontM9552b, context);
        ImageView imageView3 = c8319l3.f45011b;
        TextView textView2 = c8319l3.f45013d;
        ImageView imageView4 = c8319l3.f45012c;
        View view2 = c8319l3.f45014e;
        if (fileM10466j != null) {
            C5207g.m11110e(imageView4, "ivDownload");
            C4924a.m10442U(imageView4);
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) view2;
            C5207g.m11110e(linearProgressIndicator, "lpiDownloadProgress");
            C4924a.m10442U(linearProgressIndicator);
            Context context2 = view.getContext();
            C5207g.m11110e(context2, "itemView.context");
            textView2.setTypeface(C4924a.m10475n0(lessonFontM9552b, context2));
            C5207g.m11110e(imageView3, "isSelected");
            imageView3.setVisibility(Boolean.valueOf(aVar2.f42799d).booleanValue() ? 0 : 4);
        } else {
            int i12 = aVar2.f42804i;
            if (1 <= i12 && i12 < 100) {
                LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) view2;
                linearProgressIndicator2.m4935d();
                linearProgressIndicator2.setProgress(i12, true);
                C5207g.m11110e(imageView4, "ivDownload");
                C4924a.m10442U(imageView4);
                LessonFont.Rubik rubik = LessonFont.Rubik.INSTANCE;
                Context context3 = view.getContext();
                C5207g.m11110e(context3, "itemView.context");
                textView2.setTypeface(C4924a.m10475n0(rubik, context3));
            } else if (C3398a.m9699b(lessonFontM9552b)) {
                Context context4 = view.getContext();
                C5207g.m11110e(context4, "itemView.context");
                textView2.setTypeface(C4924a.m10475n0(lessonFontM9552b, context4));
                C5207g.m11110e(imageView4, "ivDownload");
                C4924a.m10442U(imageView4);
                LinearProgressIndicator linearProgressIndicator3 = (LinearProgressIndicator) view2;
                C5207g.m11110e(linearProgressIndicator3, "lpiDownloadProgress");
                C4924a.m10442U(linearProgressIndicator3);
                C5207g.m11110e(imageView3, "isSelected");
                imageView3.setVisibility(Boolean.valueOf(aVar2.f42799d).booleanValue() ? 0 : 4);
            } else {
                C5207g.m11110e(imageView4, "ivDownload");
                C4924a.m10457e0(imageView4);
                LinearProgressIndicator linearProgressIndicator4 = (LinearProgressIndicator) view2;
                C5207g.m11110e(linearProgressIndicator4, "lpiDownloadProgress");
                C4924a.m10442U(linearProgressIndicator4);
                LessonFont.Rubik rubik2 = LessonFont.Rubik.INSTANCE;
                Context context5 = view.getContext();
                C5207g.m11110e(context5, "itemView.context");
                textView2.setTypeface(C4924a.m10475n0(rubik2, context5));
            }
        }
        c8319l3.f45010a.setOnClickListener(new ViewOnClickListenerC10371b(5, aVar2, aVar, this));
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == SettingsSelectionItemType.Title.ordinal()) {
            return new a.d(C8330n2.m16407b(C7793a.m15500d(recyclerView), recyclerView));
        }
        if (i10 == SettingsSelectionItemType.Selection.ordinal()) {
            return new a.b(C8331n3.m16408a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
        }
        if (i10 != SettingsSelectionItemType.FontDownloadSelection.ordinal()) {
            if (i10 == SettingsSelectionItemType.TopicSelection.ordinal()) {
                return new a.e(C8331n3.m16408a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            }
            if (i10 != SettingsSelectionItemType.Switch.ordinal()) {
                throw new IllegalStateException();
            }
            View viewInflate = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_settings_selection_switch, (ViewGroup) recyclerView, false);
            int i11 = R.id.switchState;
            SwitchMaterial switchMaterial = (SwitchMaterial) C0062b.m298P0(viewInflate, R.id.switchState);
            if (switchMaterial != null) {
                i11 = R.id.tvTitle;
                TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvTitle);
                if (textView != null) {
                    return new a.c(new C8265c3((ConstraintLayout) viewInflate, switchMaterial, textView));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        }
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_filter_download_selection, recyclerView, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewM849h;
        int i12 = R.id.isSelected;
        ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.isSelected);
        if (imageView != null) {
            i12 = R.id.ivDownload;
            ImageView imageView2 = (ImageView) C0062b.m298P0(viewM849h, R.id.ivDownload);
            if (imageView2 != null) {
                i12 = R.id.lpiDownloadProgress;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C0062b.m298P0(viewM849h, R.id.lpiDownloadProgress);
                if (linearProgressIndicator != null) {
                    i12 = R.id.tvFilter;
                    TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tvFilter);
                    if (textView2 != null) {
                        return new a.C10632a(new C8319l3(constraintLayout, imageView, imageView2, linearProgressIndicator, textView2));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i12)));
    }
}
