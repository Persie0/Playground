package com.lingq.p055ui.home.search;

import ae.C0062b;
import android.content.Context;
import android.support.v4.media.C0141b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lingq.shared.uimodel.library.FastSearchData;
import com.lingq.shared.uimodel.library.FastSearchType;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mo.C7661i;
import ni.C7793a;
import p003a2.C0009a;
import p048cj.C2028b;
import p181ii.C6332a;
import p225kk.C6716m;
import p408u6.ViewOnClickListenerC9466e;
import p512yi.ViewOnClickListenerC10371b;
import ph.C8259b3;
import ph.C8319l3;
import ph.C8325m3;
import ph.C8330n2;
import ph.C8347q2;
import ph.C8382x2;
import si.ViewOnClickListenerC9029m;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
public final class SearchAdapter extends AbstractC1170u<AbstractC3964c, AbstractC3962a> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC3965d f25941e;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m13365d2 = {"Lcom/lingq/ui/home/search/SearchAdapter$SearchAdapterItemType;", "", "(Ljava/lang/String;I)V", "Search", "Lesson", "Course", "Selection", "Empty", "Loading", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum SearchAdapterItemType {
        Search,
        Lesson,
        Course,
        Selection,
        Empty,
        Loading
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$a */
    public static abstract class AbstractC3962a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$a$a */
        public static final class a extends AbstractC3962a {

            /* JADX INFO: renamed from: u */
            public final C8319l3 f25942u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8319l3 c8319l3) {
                ConstraintLayout constraintLayout = c8319l3.f45010a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f25942u = c8319l3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$a$b */
        public static final class b extends AbstractC3962a {

            /* JADX INFO: renamed from: u */
            public final C8259b3 f25943u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8259b3 c8259b3) {
                LinearLayout linearLayout = (LinearLayout) c8259b3.f44618c;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f25943u = c8259b3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$a$c */
        public static final class c extends AbstractC3962a {

            /* JADX INFO: renamed from: u */
            public final C8347q2 f25944u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8347q2 c8347q2) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c8347q2.f45172d;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f25944u = c8347q2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$a$d */
        public static final class d extends AbstractC3962a {
            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8382x2 c8382x2) {
                ConstraintLayout constraintLayout;
                int i10 = c8382x2.f45463a;
                ViewGroup viewGroup = c8382x2.f45465c;
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
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$a$e */
        public static final class e extends AbstractC3962a {

            /* JADX INFO: renamed from: u */
            public final C8330n2 f25945u;

            /* JADX WARN: Illegal instructions before constructor call */
            public e(C8330n2 c8330n2) {
                TextInputLayout textInputLayout = (TextInputLayout) c8330n2.f45085a;
                C5207g.m11110e(textInputLayout, "binding.root");
                super(textInputLayout);
                this.f25945u = c8330n2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$a$f */
        public static final class f extends AbstractC3962a {

            /* JADX INFO: renamed from: u */
            public final C8325m3 f25946u;

            /* JADX WARN: Illegal instructions before constructor call */
            public f(C8325m3 c8325m3) {
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
                this.f25946u = c8325m3;
            }
        }

        public AbstractC3962a(ViewGroup viewGroup) {
            super(viewGroup);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$b */
    public static final class C3963b extends C1162m.e<AbstractC3964c> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC3964c abstractC3964c, AbstractC3964c abstractC3964c2) {
            AbstractC3964c abstractC3964c3 = abstractC3964c;
            AbstractC3964c abstractC3964c4 = abstractC3964c2;
            if ((abstractC3964c3 instanceof AbstractC3964c.c) && (abstractC3964c4 instanceof AbstractC3964c.c)) {
                return C5207g.m11106a(abstractC3964c3, abstractC3964c4);
            }
            if ((abstractC3964c3 instanceof AbstractC3964c.a) && (abstractC3964c4 instanceof AbstractC3964c.a)) {
                return C5207g.m11106a(abstractC3964c3, abstractC3964c4);
            }
            if ((abstractC3964c3 instanceof AbstractC3964c.f) && (abstractC3964c4 instanceof AbstractC3964c.f)) {
                return C5207g.m11106a(abstractC3964c3, abstractC3964c4);
            }
            if ((abstractC3964c3 instanceof AbstractC3964c.b) && (abstractC3964c4 instanceof AbstractC3964c.b)) {
                return C5207g.m11106a(abstractC3964c3, abstractC3964c4);
            }
            if ((abstractC3964c3 instanceof AbstractC3964c.e) && (abstractC3964c4 instanceof AbstractC3964c.e)) {
                return true;
            }
            if ((abstractC3964c3 instanceof AbstractC3964c.d) && (abstractC3964c4 instanceof AbstractC3964c.d)) {
                return C5207g.m11106a(abstractC3964c3, abstractC3964c4);
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        
            if ((r6 instanceof com.lingq.p055ui.home.search.SearchAdapter.AbstractC3964c.d) != false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (((com.lingq.p055ui.home.search.SearchAdapter.AbstractC3964c.c) r5).f25949a.f36595a == ((com.lingq.p055ui.home.search.SearchAdapter.AbstractC3964c.c) r6).f25949a.f36595a) goto L37;
         */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo481b(AbstractC3964c abstractC3964c, AbstractC3964c abstractC3964c2) {
            AbstractC3964c abstractC3964c3 = abstractC3964c;
            AbstractC3964c abstractC3964c4 = abstractC3964c2;
            if (!(abstractC3964c3 instanceof AbstractC3964c.c) || !(abstractC3964c4 instanceof AbstractC3964c.c)) {
                if ((abstractC3964c3 instanceof AbstractC3964c.a) && (abstractC3964c4 instanceof AbstractC3964c.a)) {
                    if (((AbstractC3964c.a) abstractC3964c3).f25947a.f36595a == ((AbstractC3964c.a) abstractC3964c4).f25947a.f36595a) {
                        return true;
                    }
                    return false;
                }
                if ((abstractC3964c3 instanceof AbstractC3964c.f) && (abstractC3964c4 instanceof AbstractC3964c.f)) {
                    return C5207g.m11106a(((AbstractC3964c.f) abstractC3964c3).f25953a.f21941a, ((AbstractC3964c.f) abstractC3964c4).f25953a.f21941a);
                }
                if ((abstractC3964c3 instanceof AbstractC3964c.b) && (abstractC3964c4 instanceof AbstractC3964c.b)) {
                    if (((AbstractC3964c.b) abstractC3964c3).f25948a == ((AbstractC3964c.b) abstractC3964c4).f25948a) {
                        return true;
                    }
                    return false;
                }
                if (abstractC3964c3 instanceof AbstractC3964c.e) {
                    if (!(abstractC3964c4 instanceof AbstractC3964c.e)) {
                    }
                    return true;
                }
                if (abstractC3964c3 instanceof AbstractC3964c.d) {
                }
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$c */
    public static abstract class AbstractC3964c {

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$c$a */
        public static final class a extends AbstractC3964c {

            /* JADX INFO: renamed from: a */
            public final C6332a f25947a;

            public a(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
                this.f25947a = c6332a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && C5207g.m11106a(this.f25947a, ((a) obj).f25947a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f25947a.hashCode();
            }

            public final String toString() {
                return "Course(course=" + this.f25947a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$c$b */
        public static final class b extends AbstractC3964c {

            /* JADX INFO: renamed from: a */
            public final boolean f25948a;

            public b(boolean z10) {
                this.f25948a = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f25948a == ((b) obj).f25948a;
            }

            public final int hashCode() {
                boolean z10 = this.f25948a;
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            public final String toString() {
                return "Empty(noResults=" + this.f25948a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$c$c */
        public static final class c extends AbstractC3964c {

            /* JADX INFO: renamed from: a */
            public final C6332a f25949a;

            /* JADX INFO: renamed from: b */
            public final LibraryItemCounter f25950b;

            public c(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(c6332a, "lesson");
                this.f25949a = c6332a;
                this.f25950b = libraryItemCounter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C5207g.m11106a(this.f25949a, cVar.f25949a) && C5207g.m11106a(this.f25950b, cVar.f25950b);
            }

            public final int hashCode() {
                int iHashCode = this.f25949a.hashCode() * 31;
                LibraryItemCounter libraryItemCounter = this.f25950b;
                return iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode());
            }

            public final String toString() {
                return "Lesson(lesson=" + this.f25949a + ", counter=" + this.f25950b + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$c$d */
        public static final class d extends AbstractC3964c {

            /* JADX INFO: renamed from: a */
            public static final d f25951a = new d();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$c$e */
        public static final class e extends AbstractC3964c {

            /* JADX INFO: renamed from: a */
            public final String f25952a;

            public e(String str) {
                C5207g.m11111f(str, "query");
                this.f25952a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && C5207g.m11106a(this.f25952a, ((e) obj).f25952a);
            }

            public final int hashCode() {
                return this.f25952a.hashCode();
            }

            public final String toString() {
                return C0009a.m23l(new StringBuilder("Search(query="), this.f25952a, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$c$f */
        public static final class f extends AbstractC3964c {

            /* JADX INFO: renamed from: a */
            public final FastSearchData f25953a;

            public f(FastSearchData fastSearchData) {
                C5207g.m11111f(fastSearchData, "searchData");
                this.f25953a = fastSearchData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof f) && C5207g.m11106a(this.f25953a, ((f) obj).f25953a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f25953a.hashCode();
            }

            public final String toString() {
                return "Selection(searchData=" + this.f25953a + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchAdapter$d */
    public interface InterfaceC3965d {
        /* JADX INFO: renamed from: a */
        void mo10005a(String str);

        /* JADX INFO: renamed from: b */
        void mo10006b(View view, C6332a c6332a, LibraryItemCounter libraryItemCounter);

        /* JADX INFO: renamed from: c */
        void mo10007c(C6332a c6332a);

        /* JADX INFO: renamed from: d */
        void mo10008d(C6332a c6332a);

        /* JADX INFO: renamed from: e */
        void mo10009e(FastSearchData fastSearchData);
    }

    public SearchAdapter(SearchFragment$onViewCreated$3$3 searchFragment$onViewCreated$3$3) {
        super(new C3963b());
        this.f25941e = searchFragment$onViewCreated$3$3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC3964c abstractC3964cM4528p = m4528p(i10);
        if (abstractC3964cM4528p instanceof AbstractC3964c.e) {
            return SearchAdapterItemType.Search.ordinal();
        }
        if (abstractC3964cM4528p instanceof AbstractC3964c.c) {
            return SearchAdapterItemType.Lesson.ordinal();
        }
        if (abstractC3964cM4528p instanceof AbstractC3964c.a) {
            return SearchAdapterItemType.Course.ordinal();
        }
        if (abstractC3964cM4528p instanceof AbstractC3964c.f) {
            return SearchAdapterItemType.Selection.ordinal();
        }
        if (abstractC3964cM4528p instanceof AbstractC3964c.b) {
            return SearchAdapterItemType.Empty.ordinal();
        }
        if (abstractC3964cM4528p instanceof AbstractC3964c.d) {
            return SearchAdapterItemType.Loading.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        String string;
        String strM21i;
        AbstractC3962a abstractC3962a = (AbstractC3962a) abstractC1109b0;
        boolean z10 = abstractC3962a instanceof AbstractC3962a.c;
        View view = abstractC3962a.f7054a;
        if (z10) {
            AbstractC3964c abstractC3964cM4528p = m4528p(i10);
            C5207g.m11109d(abstractC3964cM4528p, "null cannot be cast to non-null type com.lingq.ui.home.search.SearchAdapter.SearchAdapterItem.Lesson");
            AbstractC3964c.c cVar = (AbstractC3964c.c) abstractC3964cM4528p;
            AbstractC3962a.c cVar2 = (AbstractC3962a.c) abstractC3962a;
            C6332a c6332a = cVar.f25949a;
            C5207g.m11111f(c6332a, "lesson");
            C8347q2 c8347q2 = cVar2.f25944u;
            c8347q2.f45171c.setText(c6332a.f36599e);
            String str = c6332a.f36608n;
            int i11 = 2;
            if ((str == null || C7661i.m15250P2(str)) ? false : true) {
                c8347q2.f45170b.setText(C0141b.m613i(new Object[]{cVar2.f7054a.getContext().getString(R.string.lingq_lesson), str}, 2, Locale.getDefault(), "%s • %s", "format(locale, format, *args)"));
            }
            ImageView imageView = c8347q2.f45169a;
            C5207g.m11110e(imageView, "binding.ivLesson");
            C4924a.m10438Q(imageView, c6332a.f36602h, 0.0f, 0, 0, 14);
            view.setOnClickListener(new ViewOnClickListenerC9734i(this, 4, cVar));
            ((ImageView) c8347q2.f45173e).setOnClickListener(new ViewOnClickListenerC10371b(i11, abstractC3962a, this, cVar));
            return;
        }
        if (abstractC3962a instanceof AbstractC3962a.a) {
            AbstractC3964c abstractC3964cM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC3964cM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.search.SearchAdapter.SearchAdapterItem.Course");
            AbstractC3964c.a aVar = (AbstractC3964c.a) abstractC3964cM4528p2;
            C6332a c6332a2 = aVar.f25947a;
            C5207g.m11111f(c6332a2, "course");
            C8319l3 c8319l3 = ((AbstractC3962a.a) abstractC3962a).f25942u;
            ((TextView) c8319l3.f45014e).setText(c6332a2.f36599e);
            ImageView imageView2 = c8319l3.f45011b;
            C5207g.m11110e(imageView2, "binding.ivCourse");
            C4924a.m10438Q(imageView2, c6332a2.f36602h, 0.0f, 0, 0, 14);
            view.setOnClickListener(new ViewOnClickListenerC9466e(this, 5, aVar));
            return;
        }
        if (!(abstractC3962a instanceof AbstractC3962a.f)) {
            if (abstractC3962a instanceof AbstractC3962a.b) {
                AbstractC3964c abstractC3964cM4528p3 = m4528p(i10);
                C5207g.m11109d(abstractC3964cM4528p3, "null cannot be cast to non-null type com.lingq.ui.home.search.SearchAdapter.SearchAdapterItem.Empty");
                AbstractC3962a.b bVar = (AbstractC3962a.b) abstractC3962a;
                TextView textView = (TextView) bVar.f25943u.f44617b;
                boolean z11 = ((AbstractC3964c.b) abstractC3964cM4528p3).f25948a;
                View view2 = bVar.f7054a;
                textView.setText(z11 ? view2.getContext().getString(R.string.search_no_search_results) : view2.getContext().getString(R.string.search_just_start_typing));
                return;
            }
            if (!(abstractC3962a instanceof AbstractC3962a.e)) {
                boolean z12 = abstractC3962a instanceof AbstractC3962a.d;
                return;
            }
            AbstractC3964c abstractC3964cM4528p4 = m4528p(i10);
            C5207g.m11109d(abstractC3964cM4528p4, "null cannot be cast to non-null type com.lingq.ui.home.search.SearchAdapter.SearchAdapterItem.Search");
            String str2 = ((AbstractC3964c.e) abstractC3964cM4528p4).f25952a;
            C5207g.m11111f(str2, "query");
            C8330n2 c8330n2 = ((AbstractC3962a.e) abstractC3962a).f25945u;
            ((TextInputEditText) c8330n2.f45086b).setText(str2);
            TextInputEditText textInputEditText = (TextInputEditText) c8330n2.f45086b;
            textInputEditText.requestFocus();
            C5207g.m11110e(textInputEditText, "holder.binding.etSearch");
            textInputEditText.addTextChangedListener(new C2028b(this));
            textInputEditText.setOnEditorActionListener(new C3985a(this));
            return;
        }
        AbstractC3964c abstractC3964cM4528p5 = m4528p(i10);
        C5207g.m11109d(abstractC3964cM4528p5, "null cannot be cast to non-null type com.lingq.ui.home.search.SearchAdapter.SearchAdapterItem.Selection");
        AbstractC3964c.f fVar = (AbstractC3964c.f) abstractC3964cM4528p5;
        FastSearchData fastSearchData = fVar.f25953a;
        C5207g.m11111f(fastSearchData, "searchData");
        List<Integer> list = C6716m.f37937a;
        TextView textView2 = (TextView) ((AbstractC3962a.f) abstractC3962a).f25946u.f45037e;
        C5207g.m11110e(textView2, "binding.tvTitle");
        String value = FastSearchType.MoreLessons.getValue();
        String str3 = fastSearchData.f21943c;
        if (C5207g.m11106a(str3, value)) {
            textView2.setText(textView2.getContext().getString(R.string.search_all_lessons));
        } else if (C5207g.m11106a(str3, FastSearchType.MoreCourses.getValue())) {
            textView2.setText(textView2.getContext().getString(R.string.search_all_courses));
        } else {
            boolean zM11106a = C5207g.m11106a(str3, FastSearchType.Accent.getValue());
            String string2 = fastSearchData.f21944d;
            if (zM11106a) {
                int identifier = textView2.getContext().getResources().getIdentifier(C0204c.m852k("feed_topics_", string2), "string", textView2.getContext().getPackageName());
                if (identifier != 0) {
                    strM21i = C0009a.m21i(textView2.getContext().getString(R.string.accent), ": ", textView2.getContext().getString(identifier));
                } else {
                    String string3 = textView2.getContext().getString(R.string.accent);
                    if (string2.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        String strValueOf = String.valueOf(string2.charAt(0));
                        C5207g.m11109d(strValueOf, "null cannot be cast to non-null type java.lang.String");
                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        sb2.append((Object) upperCase);
                        String strSubstring = string2.substring(1);
                        C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                        sb2.append(strSubstring);
                        string2 = sb2.toString();
                    }
                    strM21i = C0009a.m21i(string3, ": ", string2);
                }
                textView2.setText(strM21i);
            } else if (C5207g.m11106a(str3, FastSearchType.Shelf.getValue())) {
                int identifier2 = textView2.getContext().getResources().getIdentifier(C0204c.m852k("feed_topics_", string2), "string", textView2.getContext().getPackageName());
                if (identifier2 != 0) {
                    string = textView2.getContext().getString(R.string.search_see_all, textView2.getContext().getString(identifier2));
                } else {
                    Context context = textView2.getContext();
                    Object[] objArr = new Object[1];
                    String strM15254T2 = C7661i.m15254T2(string2, "_", " ");
                    if (strM15254T2.length() > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        String strValueOf2 = String.valueOf(strM15254T2.charAt(0));
                        C5207g.m11109d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                        String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                        C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        sb3.append((Object) upperCase2);
                        String strSubstring2 = strM15254T2.substring(1);
                        C5207g.m11110e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                        sb3.append(strSubstring2);
                        strM15254T2 = sb3.toString();
                    }
                    objArr[0] = strM15254T2;
                    string = context.getString(R.string.search_see_all, objArr);
                }
                textView2.setText(string);
            } else {
                textView2.setText("");
            }
        }
        view.setOnClickListener(new ViewOnClickListenerC9029m(this, 8, fVar));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == SearchAdapterItemType.Lesson.ordinal()) {
            View viewInflate = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_fast_search_lesson, (ViewGroup) recyclerView, false);
            int i11 = R.id.ivLesson;
            ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.ivLesson);
            if (imageView != null) {
                i11 = R.id.ivMenu;
                ImageView imageView2 = (ImageView) C0062b.m298P0(viewInflate, R.id.ivMenu);
                if (imageView2 != null) {
                    i11 = R.id.tvLessonDescription;
                    TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvLessonDescription);
                    if (textView != null) {
                        i11 = R.id.tvLessonTitle;
                        TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvLessonTitle);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            return new AbstractC3962a.c(new C8347q2(constraintLayout, imageView, imageView2, textView, textView2, constraintLayout));
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        }
        int iOrdinal = SearchAdapterItemType.Course.ordinal();
        int i12 = R.id.ivForward;
        if (i10 == iOrdinal) {
            View viewInflate2 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_fast_search_course, (ViewGroup) recyclerView, false);
            ImageView imageView3 = (ImageView) C0062b.m298P0(viewInflate2, R.id.ivCourse);
            if (imageView3 != null) {
                ImageView imageView4 = (ImageView) C0062b.m298P0(viewInflate2, R.id.ivForward);
                if (imageView4 != null) {
                    i12 = R.id.tvCourseLabel;
                    TextView textView3 = (TextView) C0062b.m298P0(viewInflate2, R.id.tvCourseLabel);
                    if (textView3 != null) {
                        i12 = R.id.tvCourseTitle;
                        TextView textView4 = (TextView) C0062b.m298P0(viewInflate2, R.id.tvCourseTitle);
                        if (textView4 != null) {
                            return new AbstractC3962a.a(new C8319l3((ConstraintLayout) viewInflate2, imageView3, imageView4, textView3, textView4));
                        }
                    }
                }
            } else {
                i12 = R.id.ivCourse;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i12)));
        }
        if (i10 == SearchAdapterItemType.Selection.ordinal()) {
            View viewInflate3 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_fast_search_selection, (ViewGroup) recyclerView, false);
            ImageView imageView5 = (ImageView) C0062b.m298P0(viewInflate3, R.id.ivForward);
            if (imageView5 != null) {
                i12 = R.id.tvTitle;
                TextView textView5 = (TextView) C0062b.m298P0(viewInflate3, R.id.tvTitle);
                if (textView5 != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate3;
                    return new AbstractC3962a.f(new C8325m3(constraintLayout2, imageView5, textView5, constraintLayout2));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i12)));
        }
        if (i10 == SearchAdapterItemType.Empty.ordinal()) {
            return new AbstractC3962a.b(C8259b3.m16399c(C7793a.m15500d(recyclerView), recyclerView));
        }
        if (i10 == SearchAdapterItemType.Search.ordinal()) {
            return new AbstractC3962a.e(C8330n2.m16406a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
        }
        if (i10 != SearchAdapterItemType.Loading.ordinal()) {
            throw new IllegalStateException();
        }
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_fast_search_loading, recyclerView, false);
        int i13 = R.id.viewCourseLabel;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C0062b.m298P0(viewM849h, R.id.viewCourseLabel);
        if (shimmerFrameLayout != null) {
            i13 = R.id.viewCourseTitle;
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C0062b.m298P0(viewM849h, R.id.viewCourseTitle);
            if (shimmerFrameLayout2 != null) {
                i13 = R.id.viewImage;
                ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) C0062b.m298P0(viewM849h, R.id.viewImage);
                if (shimmerFrameLayout3 != null) {
                    return new AbstractC3962a.d(new C8382x2((ConstraintLayout) viewM849h, shimmerFrameLayout, shimmerFrameLayout2, shimmerFrameLayout3, 2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i13)));
    }
}
