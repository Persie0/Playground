package com.lingq.p055ui.home.vocabulary.filter;

import ae.C0062b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.C0141b;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.lingq.commons.p053ui.SettingsItemType;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.commons.p053ui.views.DiscreteSlider;
import com.lingq.commons.p053ui.views.NumberStepper;
import com.lingq.p055ui.home.vocabulary.filter.C4079a;
import com.lingq.shared.storage.LessonFont;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import mo.C7661i;
import ni.C7793a;
import p003a2.C0009a;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import p254m2.C7472a;
import p278nh.AbstractC7787n;
import p278nh.C7776c;
import p278nh.InterfaceC7788o;
import p385sf.C9000b;
import p408u6.ViewOnClickListenerC9466e;
import ph.C8259b3;
import ph.C8271d3;
import ph.C8325m3;
import ph.C8330n2;
import ph.C8336o2;
import ph.C8353r3;
import ph.C8362t2;
import ph.C8367u2;
import ph.C8387y2;
import ph.C8392z2;
import si.ViewOnClickListenerC9029m;
import tl.C9325m;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4079a extends AbstractC1170u<AbstractC7787n, a> {

    /* JADX INFO: renamed from: e */
    public final Context f26528e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7788o f26529f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a */
    public static abstract class a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$a, reason: collision with other inner class name */
        public static final class C10627a extends a {

            /* JADX INFO: renamed from: u */
            public final C8353r3 f26530u;

            /* JADX WARN: Illegal instructions before constructor call */
            public C10627a(C8353r3 c8353r3) {
                RelativeLayout relativeLayout = (RelativeLayout) c8353r3.f45209d;
                C5207g.m11110e(relativeLayout, "binding.root");
                super(relativeLayout);
                this.f26530u = c8353r3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: u */
            public final C8367u2 f26531u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8367u2 c8367u2) {
                TextView textView = c8367u2.f45315a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f26531u = c8367u2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$c */
        public static final class c extends a {

            /* JADX INFO: renamed from: u */
            public final C8367u2 f26532u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8367u2 c8367u2) {
                TextView textView = c8367u2.f45315a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f26532u = c8367u2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$d */
        public static final class d extends a {
            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8336o2 c8336o2) {
                View view = c8336o2.f45111a;
                C5207g.m11110e(view, "binding.root");
                super(view);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$e */
        public static final class e extends a {

            /* JADX INFO: renamed from: u */
            public final C8367u2 f26533u;

            /* JADX WARN: Illegal instructions before constructor call */
            public e(C8367u2 c8367u2) {
                TextView textView = c8367u2.f45315a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f26533u = c8367u2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$f */
        public static final class f extends a {

            /* JADX INFO: renamed from: u */
            public final C8330n2 f26534u;

            /* JADX WARN: Illegal instructions before constructor call */
            public f(C8330n2 c8330n2) {
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) c8330n2.f45085a;
                C5207g.m11110e(appCompatSpinner, "binding.root");
                super(appCompatSpinner);
                this.f26534u = c8330n2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$g */
        public static final class g extends a {

            /* JADX INFO: renamed from: u */
            public final C8387y2 f26535u;

            /* JADX WARN: Illegal instructions before constructor call */
            public g(C8387y2 c8387y2) {
                DiscreteSlider discreteSlider = (DiscreteSlider) c8387y2.f45479a;
                C5207g.m11110e(discreteSlider, "binding.root");
                super(discreteSlider);
                this.f26535u = c8387y2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$h */
        public static final class h extends a {

            /* JADX INFO: renamed from: u */
            public final C8392z2 f26536u;

            /* JADX WARN: Illegal instructions before constructor call */
            public h(C8392z2 c8392z2) {
                TextView textView = c8392z2.f45505a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f26536u = c8392z2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$i */
        public static final class i extends a {

            /* JADX INFO: renamed from: u */
            public final C8271d3 f26537u;

            /* JADX WARN: Illegal instructions before constructor call */
            public i(C8271d3 c8271d3) {
                ConstraintLayout constraintLayoutM16401a = c8271d3.m16401a();
                C5207g.m11110e(constraintLayoutM16401a, "binding.root");
                super(constraintLayoutM16401a);
                this.f26537u = c8271d3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$j */
        public static final class j extends a {

            /* JADX INFO: renamed from: u */
            public final C8271d3 f26538u;

            /* JADX WARN: Illegal instructions before constructor call */
            public j(C8271d3 c8271d3) {
                ConstraintLayout constraintLayoutM16401a = c8271d3.m16401a();
                C5207g.m11110e(constraintLayoutM16401a, "binding.root");
                super(constraintLayoutM16401a);
                this.f26538u = c8271d3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$k */
        public static final class k extends a {

            /* JADX INFO: renamed from: u */
            public final C8325m3 f26539u;

            /* JADX WARN: Illegal instructions before constructor call */
            public k(C8325m3 c8325m3) {
                ConstraintLayout constraintLayout;
                int i10 = c8325m3.f45033a;
                ViewGroup viewGroup = c8325m3.f45035c;
                switch (i10) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        constraintLayout = (ConstraintLayout) viewGroup;
                        break;
                    default:
                        constraintLayout = (ConstraintLayout) viewGroup;
                        break;
                }
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f26539u = c8325m3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$l */
        public static final class l extends a {

            /* JADX INFO: renamed from: u */
            public final C8259b3 f26540u;

            /* JADX WARN: Illegal instructions before constructor call */
            public l(C8259b3 c8259b3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c8259b3.f44618c;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f26540u = c8259b3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$m */
        public static final class m extends a {

            /* JADX INFO: renamed from: u */
            public final C8362t2 f26541u;

            /* JADX WARN: Illegal instructions before constructor call */
            public m(C8362t2 c8362t2) {
                LinearLayout linearLayoutM16412a = c8362t2.m16412a();
                C5207g.m11110e(linearLayoutM16412a, "binding.root");
                super(linearLayoutM16412a);
                this.f26541u = c8362t2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$n */
        public static final class n extends a {

            /* JADX INFO: renamed from: u */
            public final C8392z2 f26542u;

            /* JADX WARN: Illegal instructions before constructor call */
            public n(C8392z2 c8392z2) {
                TextView textView = c8392z2.f45505a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f26542u = c8392z2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$a$o */
        public static final class o extends a {

            /* JADX INFO: renamed from: u */
            public final C8259b3 f26543u;

            /* JADX WARN: Illegal instructions before constructor call */
            public o(C8259b3 c8259b3) {
                RelativeLayout relativeLayoutM16400b = c8259b3.m16400b();
                C5207g.m11110e(relativeLayoutM16400b, "binding.root");
                super(relativeLayoutM16400b);
                this.f26543u = c8259b3;
            }
        }

        public a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.a$b */
    public static final class b extends C1162m.e<AbstractC7787n> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC7787n abstractC7787n, AbstractC7787n abstractC7787n2) {
            AbstractC7787n abstractC7787n3 = abstractC7787n;
            AbstractC7787n abstractC7787n4 = abstractC7787n2;
            if ((abstractC7787n3 instanceof AbstractC7787n.m) && (abstractC7787n4 instanceof AbstractC7787n.m)) {
                return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
            }
            if ((abstractC7787n3 instanceof AbstractC7787n.c) && (abstractC7787n4 instanceof AbstractC7787n.c)) {
                return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
            }
            if ((abstractC7787n3 instanceof AbstractC7787n.n) && (abstractC7787n4 instanceof AbstractC7787n.n)) {
                return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
            }
            if ((abstractC7787n3 instanceof AbstractC7787n.k) && (abstractC7787n4 instanceof AbstractC7787n.k)) {
                return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
            }
            if (!(abstractC7787n3 instanceof AbstractC7787n.b) || !(abstractC7787n4 instanceof AbstractC7787n.b)) {
                if ((abstractC7787n3 instanceof AbstractC7787n.h) && (abstractC7787n4 instanceof AbstractC7787n.h)) {
                    return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
                }
                if ((abstractC7787n3 instanceof AbstractC7787n.e) && (abstractC7787n4 instanceof AbstractC7787n.e)) {
                    return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
                }
                if ((abstractC7787n3 instanceof AbstractC7787n.g) && (abstractC7787n4 instanceof AbstractC7787n.g)) {
                    return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
                }
                if ((abstractC7787n3 instanceof AbstractC7787n.f) && (abstractC7787n4 instanceof AbstractC7787n.f)) {
                    return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
                }
                if ((abstractC7787n3 instanceof AbstractC7787n.i) && (abstractC7787n4 instanceof AbstractC7787n.i)) {
                    return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
                }
                if ((abstractC7787n3 instanceof AbstractC7787n.j) && (abstractC7787n4 instanceof AbstractC7787n.j)) {
                    return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
                }
                if ((abstractC7787n3 instanceof AbstractC7787n.l) && (abstractC7787n4 instanceof AbstractC7787n.l)) {
                    return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
                }
                if (!(abstractC7787n3 instanceof AbstractC7787n.d) || !(abstractC7787n4 instanceof AbstractC7787n.d)) {
                    if ((abstractC7787n3 instanceof AbstractC7787n.o) && (abstractC7787n4 instanceof AbstractC7787n.o)) {
                        return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
                    }
                    if ((abstractC7787n3 instanceof AbstractC7787n.a) && (abstractC7787n4 instanceof AbstractC7787n.a)) {
                        return C5207g.m11106a(abstractC7787n3, abstractC7787n4);
                    }
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            if (((p278nh.AbstractC7787n.n) r4).f42790c == ((p278nh.AbstractC7787n.n) r5).f42790c) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
        
            if (((p278nh.AbstractC7787n.e) r4).f42751d == ((p278nh.AbstractC7787n.e) r5).f42751d) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00f3, code lost:
        
            if (((p278nh.AbstractC7787n.i) r4).f42768d == ((p278nh.AbstractC7787n.i) r5).f42768d) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x010a, code lost:
        
            if (((p278nh.AbstractC7787n.j) r4).f42776h == ((p278nh.AbstractC7787n.j) r5).f42776h) goto L95;
         */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo481b(AbstractC7787n abstractC7787n, AbstractC7787n abstractC7787n2) {
            AbstractC7787n abstractC7787n3 = abstractC7787n;
            AbstractC7787n abstractC7787n4 = abstractC7787n2;
            if ((abstractC7787n3 instanceof AbstractC7787n.m) && (abstractC7787n4 instanceof AbstractC7787n.m)) {
                return C5207g.m11106a(((AbstractC7787n.m) abstractC7787n3).f42787b, ((AbstractC7787n.m) abstractC7787n4).f42787b);
            }
            if ((abstractC7787n3 instanceof AbstractC7787n.c) && (abstractC7787n4 instanceof AbstractC7787n.c)) {
                return C5207g.m11106a(null, null);
            }
            if (!(abstractC7787n3 instanceof AbstractC7787n.n) || !(abstractC7787n4 instanceof AbstractC7787n.n)) {
                if ((abstractC7787n3 instanceof AbstractC7787n.k) && (abstractC7787n4 instanceof AbstractC7787n.k)) {
                    if (((AbstractC7787n.k) abstractC7787n3).f42780d == ((AbstractC7787n.k) abstractC7787n4).f42780d) {
                        return true;
                    }
                    return false;
                }
                if (!(abstractC7787n3 instanceof AbstractC7787n.b) || !(abstractC7787n4 instanceof AbstractC7787n.b)) {
                    if ((abstractC7787n3 instanceof AbstractC7787n.h) && (abstractC7787n4 instanceof AbstractC7787n.h)) {
                        if (((AbstractC7787n.h) abstractC7787n3).f42764c == ((AbstractC7787n.h) abstractC7787n4).f42764c) {
                        }
                        return false;
                    }
                    if (!(abstractC7787n3 instanceof AbstractC7787n.e) || !(abstractC7787n4 instanceof AbstractC7787n.e)) {
                        if ((abstractC7787n3 instanceof AbstractC7787n.g) && (abstractC7787n4 instanceof AbstractC7787n.g)) {
                            if (((AbstractC7787n.g) abstractC7787n3).f42759e == ((AbstractC7787n.g) abstractC7787n4).f42759e) {
                            }
                            return false;
                        }
                        if ((abstractC7787n3 instanceof AbstractC7787n.f) && (abstractC7787n4 instanceof AbstractC7787n.f)) {
                            if (((AbstractC7787n.f) abstractC7787n3).f42754c == ((AbstractC7787n.f) abstractC7787n4).f42754c) {
                            }
                            return false;
                        }
                        if (!(abstractC7787n3 instanceof AbstractC7787n.i) || !(abstractC7787n4 instanceof AbstractC7787n.i)) {
                            if (!(abstractC7787n3 instanceof AbstractC7787n.j) || !(abstractC7787n4 instanceof AbstractC7787n.j)) {
                                if ((abstractC7787n3 instanceof AbstractC7787n.l) && (abstractC7787n4 instanceof AbstractC7787n.l)) {
                                    if (((AbstractC7787n.l) abstractC7787n3).f42785d == ((AbstractC7787n.l) abstractC7787n4).f42785d) {
                                    }
                                    return false;
                                }
                                if (((abstractC7787n3 instanceof AbstractC7787n.d) && (abstractC7787n4 instanceof AbstractC7787n.d)) || (((abstractC7787n3 instanceof AbstractC7787n.o) && (abstractC7787n4 instanceof AbstractC7787n.o)) || ((abstractC7787n3 instanceof AbstractC7787n.a) && (abstractC7787n4 instanceof AbstractC7787n.a)))) {
                                }
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
        }
    }

    public C4079a(Context context, InterfaceC7788o interfaceC7788o) {
        super(new b());
        this.f26528e = context;
        this.f26529f = interfaceC7788o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC7787n abstractC7787nM4528p = m4528p(i10);
        if (abstractC7787nM4528p instanceof AbstractC7787n.g) {
            return SettingsItemType.Range.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.m) {
            return SettingsItemType.Title.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.c) {
            return SettingsItemType.Description.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.n) {
            return SettingsItemType.TitleDescription.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.k) {
            return SettingsItemType.Switch.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.b) {
            return SettingsItemType.CategoryTitle.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.h) {
            return SettingsItemType.Selection.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.e) {
            return SettingsItemType.HintSelection.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.f) {
            return SettingsItemType.Options.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.i) {
            return SettingsItemType.SharedBy.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.j) {
            return SettingsItemType.FontSize.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.l) {
            return SettingsItemType.TextIcon.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.d) {
            return SettingsItemType.Divider.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.o) {
            return SettingsItemType.UserLogout.ordinal();
        }
        if (abstractC7787nM4528p instanceof AbstractC7787n.a) {
            return SettingsItemType.About.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        String string;
        Integer num;
        a aVar = (a) abstractC1109b0;
        boolean z10 = true;
        if (aVar instanceof a.g) {
            AbstractC7787n abstractC7787nM4528p = m4528p(i10);
            C5207g.m11109d(abstractC7787nM4528p, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.Range");
            AbstractC7787n.g gVar = (AbstractC7787n.g) abstractC7787nM4528p;
            a.g gVar2 = (a.g) aVar;
            List<Integer> list = gVar.f42755a;
            int length = list.isEmpty() ? LearningLevel.values().length : list.size();
            C8387y2 c8387y2 = gVar2.f26535u;
            if (length != 5) {
                ((DiscreteSlider) c8387y2.f45480b).setSectionCount(length);
            }
            boolean zIsEmpty = list.isEmpty();
            View view = gVar2.f7054a;
            if (zIsEmpty) {
                DiscreteSlider discreteSlider = (DiscreteSlider) c8387y2.f45480b;
                LearningLevel[] learningLevelArrValues = LearningLevel.values();
                ArrayList arrayList = new ArrayList(learningLevelArrValues.length);
                for (LearningLevel learningLevel : learningLevelArrValues) {
                    Context context = view.getContext();
                    C5207g.m11110e(context, "itemView.context");
                    arrayList.add(C4924a.m10434M(learningLevel, context));
                }
                discreteSlider.setRangeTextValues(arrayList);
            } else {
                DiscreteSlider discreteSlider2 = (DiscreteSlider) c8387y2.f45480b;
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String string2 = view.getContext().getString(((Number) it.next()).intValue());
                    C5207g.m11110e(string2, "itemView.context.getStri…                        )");
                    arrayList2.add(string2);
                }
                discreteSlider2.setRangeTextValues(arrayList2);
            }
            DiscreteSlider discreteSlider3 = (DiscreteSlider) c8387y2.f45480b;
            List<Integer> list2 = gVar.f42756b;
            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                String string3 = view.getContext().getString(((Number) it2.next()).intValue());
                C5207g.m11110e(string3, "itemView.context.getString(it)");
                arrayList3.add(string3);
            }
            discreteSlider3.setLabels(arrayList3);
            DiscreteSlider discreteSlider4 = (DiscreteSlider) c8387y2.f45480b;
            discreteSlider4.setValues(C9000b.m17252r(Float.valueOf(gVar.f42757c), Float.valueOf(gVar.f42758d)));
            String str = gVar.f42760f;
            if (true ^ C7661i.m15250P2(str)) {
                Context context2 = view.getContext();
                C5207g.m11110e(context2, "itemView.context");
                discreteSlider4.setTitle(C4924a.m10439R(context2, str));
                float dimension = view.getContext().getResources().getDimension(R.dimen.activity_horizontal_margin);
                List<Integer> list3 = C6716m.f37937a;
                discreteSlider4.setSideMargins((int) (dimension - C6716m.m13316a(10)));
            }
            discreteSlider4.setDetectDragFinished(gVar.f42761g);
            discreteSlider4.setDiscreteSliderListener(new C4082d(gVar, this));
            return;
        }
        int i11 = 7;
        if (aVar instanceof a.n) {
            AbstractC7787n abstractC7787nM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC7787nM4528p2, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.Title");
            AbstractC7787n.m mVar = (AbstractC7787n.m) abstractC7787nM4528p2;
            a.n nVar = (a.n) aVar;
            C8392z2 c8392z2 = nVar.f26542u;
            c8392z2.f45506b.setText(nVar.f7054a.getContext().getString(mVar.f42786a));
            if (mVar.f42787b != null) {
                c8392z2.f45505a.setOnClickListener(new ViewOnClickListenerC9466e(this, i11, mVar));
                return;
            }
            return;
        }
        if (aVar instanceof a.c) {
            AbstractC7787n abstractC7787nM4528p3 = m4528p(i10);
            C5207g.m11109d(abstractC7787nM4528p3, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.Description");
            a.c cVar = (a.c) aVar;
            cVar.f26532u.f45316b.setText(cVar.f7054a.getContext().getString(0));
            return;
        }
        if (aVar instanceof a.b) {
            AbstractC7787n abstractC7787nM4528p4 = m4528p(i10);
            C5207g.m11109d(abstractC7787nM4528p4, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.CategoryTitle");
            a.b bVar = (a.b) aVar;
            bVar.f26531u.f45316b.setText(bVar.f7054a.getContext().getString(((AbstractC7787n.b) abstractC7787nM4528p4).f42746a));
            return;
        }
        if (aVar instanceof a.m) {
            AbstractC7787n abstractC7787nM4528p5 = m4528p(i10);
            C5207g.m11109d(abstractC7787nM4528p5, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.TitleDescription");
            AbstractC7787n.n nVar2 = (AbstractC7787n.n) abstractC7787nM4528p5;
            a.m mVar2 = (a.m) aVar;
            C8362t2 c8362t2 = mVar2.f26541u;
            TextView textView = (TextView) c8362t2.f45287d;
            View view2 = mVar2.f7054a;
            String string4 = nVar2.f42791d;
            if (string4 == null) {
                string4 = view2.getContext().getString(nVar2.f42788a);
            }
            textView.setText(string4);
            TextView textView2 = (TextView) c8362t2.f45286c;
            String string5 = nVar2.f42792e;
            if (string5 == null) {
                string5 = view2.getContext().getString(nVar2.f42789b);
            }
            textView2.setText(string5);
            CharSequence text = textView2.getText();
            C5207g.m11110e(text, "tvDescription.text");
            if (C7661i.m15250P2(text)) {
                C4924a.m10442U(textView2);
            } else {
                C4924a.m10457e0(textView2);
            }
            if (nVar2.f42790c == ViewKeys.LessonFont.ordinal()) {
                LessonFont.INSTANCE.getClass();
                LessonFont lessonFontM9552b = LessonFont.Companion.m9552b(nVar2.f42793f);
                Context context3 = view2.getContext();
                C5207g.m11110e(context3, "itemView.context");
                textView2.setTypeface(C4924a.m10475n0(lessonFontM9552b, context3));
            } else {
                textView2.setTextAppearance(R.style.TextAppearance_Settings_Description);
            }
            c8362t2.m16412a().setOnClickListener(new ViewOnClickListenerC9734i(this, 6, nVar2));
            return;
        }
        Drawable drawableM14849b = null;
        if (aVar instanceof a.k) {
            AbstractC7787n abstractC7787nM4528p6 = m4528p(i10);
            C5207g.m11109d(abstractC7787nM4528p6, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.Switch");
            final AbstractC7787n.k kVar = (AbstractC7787n.k) abstractC7787nM4528p6;
            a.k kVar2 = (a.k) aVar;
            C8325m3 c8325m3 = kVar2.f26539u;
            ((SwitchMaterial) c8325m3.f45036d).setOnCheckedChangeListener(null);
            TextView textView3 = (TextView) c8325m3.f45034b;
            View view3 = kVar2.f7054a;
            textView3.setText(view3.getContext().getString(kVar.f42777a));
            TextView textView4 = (TextView) c8325m3.f45037e;
            textView4.setText(view3.getContext().getString(kVar.f42778b));
            CharSequence text2 = textView4.getText();
            C5207g.m11110e(text2, "tvDescription.text");
            if (C7661i.m15250P2(text2)) {
                C4924a.m10442U(textView4);
            } else {
                C4924a.m10457e0(textView4);
            }
            SwitchMaterial switchMaterial = (SwitchMaterial) c8325m3.f45036d;
            switchMaterial.setChecked(kVar.f42779c);
            if (kVar.f42781e) {
                switchMaterial.setClickable(false);
                switchMaterial.setOnTouchListener(new View.OnTouchListener() { // from class: ej.d
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view4, MotionEvent motionEvent) {
                        C4079a c4079a = this.f33847a;
                        C5207g.m11111f(c4079a, "this$0");
                        AbstractC7787n.k kVar3 = kVar;
                        C5207g.m11111f(kVar3, "$item");
                        c4079a.f26529f.mo9848b(kVar3.f42780d, Boolean.valueOf(!kVar3.f42779c));
                        return false;
                    }
                });
                return;
            } else {
                switchMaterial.setClickable(true);
                switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ej.e
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        C4079a c4079a = this.f33849a;
                        C5207g.m11111f(c4079a, "this$0");
                        AbstractC7787n.k kVar3 = kVar;
                        C5207g.m11111f(kVar3, "$item");
                        c4079a.f26529f.mo9848b(kVar3.f42780d, Boolean.valueOf(z11));
                    }
                });
                return;
            }
        }
        if (aVar instanceof a.h) {
            AbstractC7787n abstractC7787nM4528p7 = m4528p(i10);
            C5207g.m11109d(abstractC7787nM4528p7, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.Selection");
            AbstractC7787n.h hVar = (AbstractC7787n.h) abstractC7787nM4528p7;
            a.h hVar2 = (a.h) aVar;
            C8392z2 c8392z3 = hVar2.f26536u;
            Integer num2 = hVar.f42762a;
            if (num2 != null) {
                c8392z3.f45506b.setText(hVar2.f7054a.getContext().getString(num2.intValue()));
            }
            String str2 = hVar.f42763b;
            if (str2 != null) {
                c8392z3.f45506b.setText(str2);
            }
            c8392z3.f45506b.setOnClickListener(new ViewOnClickListenerC9029m(this, 11, hVar));
            return;
        }
        if (aVar instanceof a.e) {
            AbstractC7787n abstractC7787nM4528p8 = m4528p(i10);
            C5207g.m11109d(abstractC7787nM4528p8, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.HintSelection");
            AbstractC7787n.e eVar = (AbstractC7787n.e) abstractC7787nM4528p8;
            final a.e eVar2 = (a.e) aVar;
            C8367u2 c8367u2 = eVar2.f26533u;
            View view4 = eVar2.f7054a;
            String str3 = eVar.f42748a;
            if (str3 != null || (num = eVar.f42749b) == null) {
                List<Integer> list4 = eVar.f42750c;
                if (list4 != null && !list4.isEmpty()) {
                    z10 = false;
                }
                if (!z10) {
                    c8367u2.f45316b.setText(C6752c.m13430X(eVar.f42750c, null, null, null, new InterfaceC2052l<Integer, CharSequence>() { // from class: com.lingq.ui.home.vocabulary.filter.SettingsAdapter$BaseViewHolder$HintSelectionViewHolder$bind$1
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final CharSequence mo528n(Integer num3) {
                            String string6 = eVar2.f7054a.getContext().getString(num3.intValue());
                            C5207g.m11110e(string6, "itemView.context.getString(it)");
                            return string6;
                        }
                    }, 31));
                } else if (str3 != null) {
                    c8367u2.f45316b.setText(str3);
                } else {
                    c8367u2.f45316b.setText(view4.getContext().getString(R.string.search_all));
                }
            } else {
                TextView textView5 = c8367u2.f45316b;
                List<Integer> list5 = C6716m.f37937a;
                Context context4 = c8367u2.f45315a.getContext();
                C5207g.m11110e(context4, "binding.root.context");
                textView5.setTextColor(C6716m.m13333r(R.attr.backgroundSectionColor, context4));
                c8367u2.f45316b.setText(view4.getContext().getString(num.intValue()));
            }
            c8367u2.f45316b.setOnClickListener(new ViewOnClickListenerC9734i(this, i11, eVar));
            return;
        }
        if (aVar instanceof a.i) {
            AbstractC7787n abstractC7787nM4528p9 = m4528p(i10);
            C5207g.m11109d(abstractC7787nM4528p9, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.SharedBy");
            AbstractC7787n.i iVar = (AbstractC7787n.i) abstractC7787nM4528p9;
            a.i iVar2 = (a.i) aVar;
            C8271d3 c8271d3 = iVar2.f26537u;
            View view5 = iVar2.f7054a;
            String str4 = iVar.f42765a;
            if (str4 != null) {
                ((TextView) c8271d3.f44671b).setText(str4);
                ImageView imageView = (ImageView) c8271d3.f44673d;
                C5207g.m11110e(imageView, "ivUser");
                C4924a.m10436O(imageView, iVar.f42766b, 0.0f, null, 14);
                View view6 = c8271d3.f44674e;
                String str5 = iVar.f42767c;
                if (str5 != null) {
                    ImageView imageView2 = (ImageView) view6;
                    int iHashCode = str5.hashCode();
                    if (iHashCode != -1307827859) {
                        if (iHashCode != 94630981) {
                            if (iHashCode == 812757528 && str5.equals("librarian")) {
                                Context context5 = view5.getContext();
                                Object obj = C7472a.f41322a;
                                drawableM14849b = C7472a.c.m14849b(context5, R.drawable.ic_profile_librarian);
                            }
                        } else if (str5.equals("chief")) {
                            Context context6 = view5.getContext();
                            Object obj2 = C7472a.f41322a;
                            drawableM14849b = C7472a.c.m14849b(context6, R.drawable.ic_profile_chief_librarian);
                        }
                    } else if (str5.equals("editor")) {
                        Context context7 = view5.getContext();
                        Object obj3 = C7472a.f41322a;
                        drawableM14849b = C7472a.c.m14849b(context7, R.drawable.ic_profile_editor);
                    }
                    imageView2.setImageDrawable(drawableM14849b);
                } else {
                    ((ImageView) view6).setImageDrawable(null);
                }
            } else {
                ImageView imageView3 = (ImageView) c8271d3.f44673d;
                C5207g.m11110e(imageView3, "ivUser");
                C4924a.m10436O(imageView3, Integer.valueOf(R.mipmap.ic_launcher_round), 0.0f, null, 14);
                ((TextView) c8271d3.f44671b).setText(view5.getContext().getString(R.string.search_all));
            }
            c8271d3.m16401a().setOnClickListener(new ViewOnClickListenerC6464i(this, 15, iVar));
            return;
        }
        if (aVar instanceof a.f) {
            AbstractC7787n abstractC7787nM4528p10 = m4528p(i10);
            C5207g.m11109d(abstractC7787nM4528p10, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.Options");
            AbstractC7787n.f fVar = (AbstractC7787n.f) abstractC7787nM4528p10;
            a.f fVar2 = (a.f) aVar;
            List<Integer> list6 = fVar.f42752a;
            ArrayList arrayList4 = new ArrayList(C9325m.m17681z(list6, 10));
            Iterator<T> it3 = list6.iterator();
            while (it3.hasNext()) {
                arrayList4.add(aVar.f7054a.getContext().getString(((Number) it3.next()).intValue()));
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.f26528e, R.layout.view_spinner_text, arrayList4);
            C8330n2 c8330n2 = fVar2.f26534u;
            ((AppCompatSpinner) c8330n2.f45086b).setAdapter((SpinnerAdapter) arrayAdapter);
            View view7 = c8330n2.f45086b;
            int i12 = fVar.f42753b;
            if (i12 != -1) {
                ((AppCompatSpinner) view7).setSelection(i12, true);
            }
            ((AppCompatSpinner) view7).setOnItemSelectedListener(new C4080b(this, fVar));
            return;
        }
        if (!(aVar instanceof a.j)) {
            if (aVar instanceof a.l) {
                AbstractC7787n abstractC7787nM4528p11 = m4528p(i10);
                C5207g.m11109d(abstractC7787nM4528p11, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.TextIcon");
                AbstractC7787n.l lVar = (AbstractC7787n.l) abstractC7787nM4528p11;
                C8259b3 c8259b3 = ((a.l) aVar).f26540u;
                ((TextView) c8259b3.f44617b).setText(lVar.f42782a);
                ImageView imageView4 = (ImageView) c8259b3.f44619d;
                imageView4.setImageResource(lVar.f42784c);
                imageView4.setOnClickListener(new ViewOnClickListenerC9466e(this, 8, lVar));
                return;
            }
            if (aVar instanceof a.d) {
                return;
            }
            if (aVar instanceof a.o) {
                AbstractC7787n abstractC7787nM4528p12 = m4528p(i10);
                C5207g.m11109d(abstractC7787nM4528p12, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.UserLogout");
                AbstractC7787n.o oVar = (AbstractC7787n.o) abstractC7787nM4528p12;
                C8259b3 c8259b4 = ((a.o) aVar).f26543u;
                ((TextView) c8259b4.f44617b).setText(oVar.f42794a);
                ((RelativeLayout) c8259b4.f44619d).setOnClickListener(new ViewOnClickListenerC9029m(this, 12, oVar));
                return;
            }
            if (aVar instanceof a.C10627a) {
                AbstractC7787n abstractC7787nM4528p13 = m4528p(i10);
                C5207g.m11109d(abstractC7787nM4528p13, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.About");
                AbstractC7787n.a aVar2 = (AbstractC7787n.a) abstractC7787nM4528p13;
                a.C10627a c10627a = (a.C10627a) aVar;
                C8353r3 c8353r3 = c10627a.f26530u;
                C0009a.m32u(new Object[]{aVar2.f42744b, Long.valueOf(aVar2.f42743a)}, 2, Locale.getDefault(), "LingQ v. %s (%d)", "format(locale, format, *args)", c8353r3.f45208c);
                TextView textView6 = c8353r3.f45207b;
                textView6.setTransformationMethod(null);
                textView6.setMovementMethod(C7776c.f42711a);
                List<Integer> list7 = C6716m.f37937a;
                View view8 = c10627a.f7054a;
                Context context8 = view8.getContext();
                C5207g.m11110e(context8, "itemView.context");
                String string6 = view8.getContext().getString(R.string.welcome_by_using_lingq);
                C5207g.m11110e(string6, "itemView.context.getStri…g.welcome_by_using_lingq)");
                textView6.setText(C6716m.m13332q(context8, string6), TextView.BufferType.SPANNABLE);
                return;
            }
            return;
        }
        AbstractC7787n abstractC7787nM4528p14 = m4528p(i10);
        C5207g.m11109d(abstractC7787nM4528p14, "null cannot be cast to non-null type com.lingq.commons.ui.SettingsItem.Step");
        AbstractC7787n.j jVar = (AbstractC7787n.j) abstractC7787nM4528p14;
        a.j jVar2 = (a.j) aVar;
        C8271d3 c8271d4 = jVar2.f26538u;
        TextView textView7 = (TextView) c8271d4.f44674e;
        View view9 = jVar2.f7054a;
        textView7.setText(view9.getContext().getString(jVar.f42769a));
        int iOrdinal = ViewKeys.LessonLineSpacing.ordinal();
        float f3 = jVar.f42771c;
        int i13 = jVar.f42770b;
        int i14 = jVar.f42776h;
        if (i14 == iOrdinal) {
            Locale locale = Locale.getDefault();
            String string7 = view9.getContext().getString(i13);
            C5207g.m11110e(string7, "itemView.context.getString(step.description)");
            string = C0141b.m613i(new Object[]{Float.valueOf(f3)}, 1, locale, string7, "format(locale, format, *args)");
        } else {
            string = view9.getContext().getString(i13);
            C5207g.m11110e(string, "{\n                      …on)\n                    }");
        }
        TextView textView8 = (TextView) c8271d4.f44671b;
        textView8.setText(string);
        if (jVar.f42774f) {
            textView8.setText(view9.getContext().getText(R.string.settings_text_sample));
            textView8.setTextAppearance(R.style.TextAppearance);
            List<Integer> list8 = C6716m.f37937a;
            Context context9 = view9.getContext();
            C5207g.m11110e(context9, "itemView.context");
            textView8.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, context9));
            textView8.setTextSize(2, f3);
            if (i14 == ViewKeys.LessonFontSize.ordinal()) {
                LessonFont.INSTANCE.getClass();
                LessonFont lessonFontM9552b2 = LessonFont.Companion.m9552b(jVar.f42775g);
                Context context10 = view9.getContext();
                C5207g.m11110e(context10, "itemView.context");
                textView8.setTypeface(C4924a.m10475n0(lessonFontM9552b2, context10));
            }
        } else {
            textView8.setTextAppearance(R.style.TextAppearance_Settings_Description);
        }
        NumberStepper numberStepper = (NumberStepper) c8271d4.f44673d;
        numberStepper.setMaxStep(jVar.f42772d);
        numberStepper.setNumber(jVar.f42773e);
        numberStepper.setOnNumberChangedListener(new C4081c(this, jVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == SettingsItemType.Range.ordinal()) {
            View viewInflate = C7793a.m15500d(recyclerView).inflate(R.layout.list_range_generic, (ViewGroup) recyclerView, false);
            if (viewInflate == null) {
                throw new NullPointerException("rootView");
            }
            DiscreteSlider discreteSlider = (DiscreteSlider) viewInflate;
            return new a.g(new C8387y2(discreteSlider, discreteSlider));
        }
        if (i10 == SettingsItemType.Title.ordinal()) {
            return new a.n(C8392z2.m16420a(C7793a.m15500d(recyclerView), recyclerView));
        }
        if (i10 == SettingsItemType.Description.ordinal()) {
            View viewInflate2 = C7793a.m15500d(recyclerView).inflate(R.layout.list_generic_description, (ViewGroup) recyclerView, false);
            if (viewInflate2 == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView = (TextView) viewInflate2;
            return new a.c(new C8367u2(textView, textView, 0));
        }
        if (i10 == SettingsItemType.CategoryTitle.ordinal()) {
            View viewInflate3 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_settings_category_title, (ViewGroup) recyclerView, false);
            if (viewInflate3 == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView2 = (TextView) viewInflate3;
            return new a.b(new C8367u2(textView2, textView2, 1));
        }
        int iOrdinal = SettingsItemType.TitleDescription.ordinal();
        int i11 = R.id.tvDescription;
        int i12 = R.id.tvTitle;
        if (i10 == iOrdinal) {
            View viewInflate4 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_settings_text_description, (ViewGroup) recyclerView, false);
            TextView textView3 = (TextView) C0062b.m298P0(viewInflate4, R.id.tvDescription);
            if (textView3 != null) {
                TextView textView4 = (TextView) C0062b.m298P0(viewInflate4, R.id.tvTitle);
                if (textView4 != null) {
                    return new a.m(new C8362t2((LinearLayout) viewInflate4, textView3, textView4, 6));
                }
                i11 = R.id.tvTitle;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i11)));
        }
        if (i10 == SettingsItemType.Switch.ordinal()) {
            View viewInflate5 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_settings_switch, (ViewGroup) recyclerView, false);
            SwitchMaterial switchMaterial = (SwitchMaterial) C0062b.m298P0(viewInflate5, R.id.switchState);
            if (switchMaterial != null) {
                TextView textView5 = (TextView) C0062b.m298P0(viewInflate5, R.id.tvDescription);
                if (textView5 != null) {
                    TextView textView6 = (TextView) C0062b.m298P0(viewInflate5, R.id.tvTitle);
                    if (textView6 != null) {
                        return new a.k(new C8325m3((ConstraintLayout) viewInflate5, switchMaterial, textView5, textView6));
                    }
                    i11 = R.id.tvTitle;
                }
            } else {
                i11 = R.id.switchState;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i11)));
        }
        if (i10 == SettingsItemType.Selection.ordinal()) {
            View viewInflate6 = C7793a.m15500d(recyclerView).inflate(R.layout.list_selection_text_generic, (ViewGroup) recyclerView, false);
            if (viewInflate6 == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView7 = (TextView) viewInflate6;
            return new a.h(new C8392z2(textView7, textView7, 4));
        }
        if (i10 == SettingsItemType.HintSelection.ordinal()) {
            View viewInflate7 = C7793a.m15500d(recyclerView).inflate(R.layout.list_selection_text_generic_clear_background, (ViewGroup) recyclerView, false);
            if (viewInflate7 == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView8 = (TextView) viewInflate7;
            return new a.e(new C8367u2(textView8, textView8, 6));
        }
        if (i10 == SettingsItemType.Options.ordinal()) {
            View viewInflate8 = C7793a.m15500d(recyclerView).inflate(R.layout.list_options_generic, (ViewGroup) recyclerView, false);
            if (viewInflate8 == null) {
                throw new NullPointerException("rootView");
            }
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) viewInflate8;
            return new a.f(new C8330n2(appCompatSpinner, appCompatSpinner));
        }
        if (i10 == SettingsItemType.SharedBy.ordinal()) {
            View viewInflate9 = C7793a.m15500d(recyclerView).inflate(R.layout.list_selection_shared_by_user, (ViewGroup) recyclerView, false);
            int i13 = R.id.ivRole;
            ImageView imageView = (ImageView) C0062b.m298P0(viewInflate9, R.id.ivRole);
            if (imageView != null) {
                i13 = R.id.ivUser;
                ImageView imageView2 = (ImageView) C0062b.m298P0(viewInflate9, R.id.ivUser);
                if (imageView2 != null) {
                    i13 = R.id.tvName;
                    TextView textView9 = (TextView) C0062b.m298P0(viewInflate9, R.id.tvName);
                    if (textView9 != null) {
                        return new a.i(new C8271d3((ConstraintLayout) viewInflate9, imageView, imageView2, textView9));
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate9.getResources().getResourceName(i13)));
        }
        if (i10 == SettingsItemType.FontSize.ordinal()) {
            View viewInflate10 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_settings_font_size, (ViewGroup) recyclerView, false);
            NumberStepper numberStepper = (NumberStepper) C0062b.m298P0(viewInflate10, R.id.numbersView);
            if (numberStepper != null) {
                TextView textView10 = (TextView) C0062b.m298P0(viewInflate10, R.id.tvDescription);
                if (textView10 != null) {
                    TextView textView11 = (TextView) C0062b.m298P0(viewInflate10, R.id.tvTitle);
                    if (textView11 != null) {
                        return new a.j(new C8271d3((ConstraintLayout) viewInflate10, (ViewGroup) numberStepper, textView10, textView11, 2));
                    }
                    i11 = R.id.tvTitle;
                }
            } else {
                i11 = R.id.numbersView;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate10.getResources().getResourceName(i11)));
        }
        if (i10 == SettingsItemType.TextIcon.ordinal()) {
            View viewInflate11 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_settings_text_icon, (ViewGroup) recyclerView, false);
            ImageView imageView3 = (ImageView) C0062b.m298P0(viewInflate11, R.id.ivIcon);
            if (imageView3 != null) {
                TextView textView12 = (TextView) C0062b.m298P0(viewInflate11, R.id.tvTitle);
                if (textView12 != null) {
                    return new a.l(new C8259b3(5, imageView3, (ConstraintLayout) viewInflate11, textView12));
                }
            } else {
                i12 = R.id.ivIcon;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate11.getResources().getResourceName(i12)));
        }
        if (i10 == SettingsItemType.Divider.ordinal()) {
            return new a.d(C8336o2.m16409a(C7793a.m15500d(recyclerView), recyclerView));
        }
        if (i10 == SettingsItemType.UserLogout.ordinal()) {
            View viewInflate12 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_settings_logout, (ViewGroup) recyclerView, false);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate12;
            TextView textView13 = (TextView) C0062b.m298P0(viewInflate12, R.id.tv_username);
            if (textView13 != null) {
                return new a.o(new C8259b3(4, relativeLayout, relativeLayout, textView13));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate12.getResources().getResourceName(R.id.tv_username)));
        }
        if (i10 != SettingsItemType.About.ordinal()) {
            throw new IllegalStateException();
        }
        View viewInflate13 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_settings_about, (ViewGroup) recyclerView, false);
        int i14 = R.id.tvCopyright;
        TextView textView14 = (TextView) C0062b.m298P0(viewInflate13, R.id.tvCopyright);
        if (textView14 != null) {
            RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate13;
            i14 = R.id.tvTerms;
            TextView textView15 = (TextView) C0062b.m298P0(viewInflate13, R.id.tvTerms);
            if (textView15 != null) {
                i14 = R.id.tvVersion;
                TextView textView16 = (TextView) C0062b.m298P0(viewInflate13, R.id.tvVersion);
                if (textView16 != null) {
                    return new a.C10627a(new C8353r3(relativeLayout2, textView14, relativeLayout2, textView15, textView16));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate13.getResources().getResourceName(i14)));
    }
}
