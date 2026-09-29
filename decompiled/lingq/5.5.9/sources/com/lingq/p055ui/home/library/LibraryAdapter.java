package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1146d;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.material.card.MaterialCardView;
import com.lingq.commons.p053ui.views.StreakFireView;
import com.lingq.shared.uimodel.FeedTopic;
import com.lingq.shared.uimodel.library.LibraryContentType;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryItemType;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ni.C7793a;
import p003a2.C0009a;
import p096ei.C5408a;
import p181ii.C6332a;
import p181ii.C6333b;
import p181ii.C6334c;
import p181ii.C6336e;
import p225kk.C6716m;
import p286o2.RunnableC7907g;
import p301oh.C8045d;
import p512yi.C10374c0;
import p512yi.InterfaceC10396x;
import ph.C8259b3;
import ph.C8271d3;
import ph.C8325m3;
import ph.C8330n2;
import ph.C8336o2;
import ph.C8358s3;
import ph.C8387y2;
import si.ViewOnClickListenerC9029m;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class LibraryAdapter extends AbstractC1170u<AbstractC3755a, AbstractC3756b> {

    /* JADX INFO: renamed from: e */
    public final CollectionsAdapter.InnerListLayout f24601e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC10396x f24602f;

    /* JADX INFO: renamed from: g */
    public final RecyclerView.C1126s f24603g;

    /* JADX INFO: renamed from: h */
    public final RecyclerView.C1126s f24604h;

    /* JADX INFO: renamed from: i */
    public final RecyclerView.C1126s f24605i;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m13365d2 = {"Lcom/lingq/ui/home/library/LibraryAdapter$LibraryListItemType;", "", "(Ljava/lang/String;I)V", "Header", "Lessons", "Courses", "Loading", "Stats", "HeaderSelectable", "Empty", "UpgradeBanner", "Divider", "SpaceVertical", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum LibraryListItemType {
        Header,
        Lessons,
        Courses,
        Loading,
        Stats,
        HeaderSelectable,
        Empty,
        UpgradeBanner,
        Divider,
        SpaceVertical
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$a */
    public static abstract class AbstractC3755a {

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$a$a */
        public static final class a extends AbstractC3755a {

            /* JADX INFO: renamed from: a */
            public static final a f24606a = new a();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$a$b */
        public static final class b extends AbstractC3755a {

            /* JADX INFO: renamed from: a */
            public static final b f24607a = new b();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$a$c */
        public static final class c extends AbstractC3755a {

            /* JADX INFO: renamed from: a */
            public final String f24608a;

            /* JADX INFO: renamed from: b */
            public final LibraryShelf f24609b;

            /* JADX INFO: renamed from: c */
            public final List<C6336e> f24610c;

            public c(String str, LibraryShelf libraryShelf, ArrayList arrayList) {
                C5207g.m11111f(str, "header");
                this.f24608a = str;
                this.f24609b = libraryShelf;
                this.f24610c = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C5207g.m11106a(this.f24608a, cVar.f24608a) && C5207g.m11106a(this.f24609b, cVar.f24609b) && C5207g.m11106a(this.f24610c, cVar.f24610c);
            }

            public final int hashCode() {
                return this.f24610c.hashCode() + ((this.f24609b.hashCode() + (this.f24608a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Header(header=");
                sb2.append(this.f24608a);
                sb2.append(", shelf=");
                sb2.append(this.f24609b);
                sb2.append(", tabs=");
                return C0009a.m24m(sb2, this.f24610c, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$a$d */
        public static final class d extends AbstractC3755a {

            /* JADX INFO: renamed from: a */
            public final LibraryShelf f24611a;

            /* JADX INFO: renamed from: b */
            public final AbstractC3757c.a f24612b;

            public d(LibraryShelf libraryShelf, AbstractC3757c.a aVar) {
                C5207g.m11111f(libraryShelf, "shelf");
                this.f24611a = libraryShelf;
                this.f24612b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                if (C5207g.m11106a(this.f24611a, dVar.f24611a) && C5207g.m11106a(this.f24612b, dVar.f24612b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f24612b.hashCode() + (this.f24611a.hashCode() * 31);
            }

            public final String toString() {
                return "LibraryItems(shelf=" + this.f24611a + ", content=" + this.f24612b + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$a$e */
        public static final class e extends AbstractC3755a {

            /* JADX INFO: renamed from: a */
            public final LibraryShelf f24613a;

            /* JADX INFO: renamed from: b */
            public final AbstractC3757c.b f24614b;

            public e(LibraryShelf libraryShelf, AbstractC3757c.b bVar) {
                this.f24613a = libraryShelf;
                this.f24614b = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                if (C5207g.m11106a(this.f24613a, eVar.f24613a) && C5207g.m11106a(this.f24614b, eVar.f24614b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f24614b.hashCode() + (this.f24613a.hashCode() * 31);
            }

            public final String toString() {
                return "Loading(shelf=" + this.f24613a + ", content=" + this.f24614b + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$a$f */
        public static final class f extends AbstractC3755a {

            /* JADX INFO: renamed from: a */
            public final int f24615a;

            public f(int i10) {
                this.f24615a = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof f) && this.f24615a == ((f) obj).f24615a) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f24615a);
            }

            public final String toString() {
                return C0166e.m768o(new StringBuilder("SpaceVertical(height="), this.f24615a, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$a$g */
        public static final class g extends AbstractC3755a {

            /* JADX INFO: renamed from: a */
            public final int f24616a;

            /* JADX INFO: renamed from: b */
            public final int f24617b;

            /* JADX INFO: renamed from: c */
            public final int f24618c;

            /* JADX INFO: renamed from: d */
            public final int f24619d;

            /* JADX INFO: renamed from: e */
            public final double f24620e;

            /* JADX INFO: renamed from: f */
            public final int f24621f;

            /* JADX INFO: renamed from: g */
            public final boolean f24622g;

            public g() {
                this(0, 0, 0, 0, 0.0d, 0, false, 127);
            }

            public g(int i10, int i11, int i12, int i13, double d10, int i14, boolean z10, int i15) {
                i10 = (i15 & 1) != 0 ? 0 : i10;
                i11 = (i15 & 2) != 0 ? 0 : i11;
                i12 = (i15 & 4) != 0 ? 0 : i12;
                i13 = (i15 & 8) != 0 ? 0 : i13;
                d10 = (i15 & 16) != 0 ? 0.0d : d10;
                i14 = (i15 & 32) != 0 ? 1 : i14;
                z10 = (i15 & 64) != 0 ? false : z10;
                this.f24616a = i10;
                this.f24617b = i11;
                this.f24618c = i12;
                this.f24619d = i13;
                this.f24620e = d10;
                this.f24621f = i14;
                this.f24622g = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                if (this.f24616a == gVar.f24616a && this.f24617b == gVar.f24617b && this.f24618c == gVar.f24618c && this.f24619d == gVar.f24619d && Double.compare(this.f24620e, gVar.f24620e) == 0 && this.f24621f == gVar.f24621f && this.f24622g == gVar.f24622g) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v8, types: [int] */
            /* JADX WARN: Type inference failed for: r1v6, types: [int] */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v8 */
            public final int hashCode() {
                int iM16d = C0009a.m16d(this.f24621f, C0141b.m609e(this.f24620e, C0009a.m16d(this.f24619d, C0009a.m16d(this.f24618c, C0009a.m16d(this.f24617b, Integer.hashCode(this.f24616a) * 31, 31), 31), 31), 31), 31);
                boolean z10 = this.f24622g;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return iM16d + r10;
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Stats(days=");
                sb2.append(this.f24616a);
                sb2.append(", coins=");
                sb2.append(this.f24617b);
                sb2.append(", goal=");
                sb2.append(this.f24618c);
                sb2.append(", knownWords=");
                sb2.append(this.f24619d);
                sb2.append(", listeningTime=");
                sb2.append(this.f24620e);
                sb2.append(", activityID=");
                sb2.append(this.f24621f);
                sb2.append(", isLoading=");
                return C0166e.m769p(sb2, this.f24622g, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$a$h */
        public static final class h extends AbstractC3755a {

            /* JADX INFO: renamed from: a */
            public static final h f24623a = new h();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b */
    public static abstract class AbstractC3756b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b$a */
        public static final class a extends AbstractC3756b {
            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8336o2 c8336o2) {
                View view = c8336o2.f45111a;
                C5207g.m11110e(view, "binding.root");
                super(view);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b$b */
        public static final class b extends AbstractC3756b {
            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8325m3 c8325m3) {
                LinearLayout linearLayout = (LinearLayout) c8325m3.f45035c;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b$c */
        public static final class c extends AbstractC3756b {

            /* JADX INFO: renamed from: w */
            public static final /* synthetic */ int f24624w = 0;

            /* JADX INFO: renamed from: u */
            public final C8271d3 f24625u;

            /* JADX INFO: renamed from: v */
            public final C10374c0 f24626v;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8271d3 c8271d3, RecyclerView.C1126s c1126s, InterfaceC10396x interfaceC10396x) {
                C5207g.m11111f(c1126s, "headersViewPool");
                C5207g.m11111f(interfaceC10396x, "libraryInteraction");
                ConstraintLayout constraintLayoutM16401a = c8271d3.m16401a();
                C5207g.m11110e(constraintLayoutM16401a, "binding.root");
                super(constraintLayoutM16401a);
                this.f24625u = c8271d3;
                this.f24626v = new C10374c0(interfaceC10396x);
                RecyclerView recyclerView = (RecyclerView) c8271d3.f44673d;
                constraintLayoutM16401a.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(0));
                while (recyclerView.getItemDecorationCount() > 0) {
                    recyclerView.m4193b0();
                }
                List<Integer> list = C6716m.f37937a;
                recyclerView.m4199g(new C8045d((int) C6716m.m13316a(16)));
                RecyclerView.AbstractC1117j itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.f7080f = 0L;
                }
                recyclerView.setRecycledViewPool(c1126s);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b$d */
        public static final class d extends AbstractC3756b {

            /* JADX INFO: renamed from: u */
            public final C8387y2 f24627u;

            /* JADX INFO: renamed from: v */
            public final CollectionsAdapter f24628v;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8387y2 c8387y2, RecyclerView.C1126s c1126s, InterfaceC10396x interfaceC10396x, CollectionsAdapter.InnerListLayout innerListLayout) {
                C5207g.m11111f(c1126s, "lessonsViewPool");
                C5207g.m11111f(interfaceC10396x, "libraryInteraction");
                C5207g.m11111f(innerListLayout, "innerListOrientation");
                RecyclerView recyclerView = (RecyclerView) c8387y2.f45479a;
                C5207g.m11110e(recyclerView, "binding.root");
                super(recyclerView);
                this.f24627u = c8387y2;
                this.f24628v = new CollectionsAdapter(innerListLayout, interfaceC10396x);
                RecyclerView recyclerView2 = (RecyclerView) c8387y2.f45480b;
                recyclerView.getContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager(0));
                while (recyclerView2.getItemDecorationCount() > 0) {
                    recyclerView2.m4193b0();
                }
                List<Integer> list = C6716m.f37937a;
                recyclerView2.m4199g(new C8045d((int) C6716m.m13316a(20)));
                recyclerView2.setRecycledViewPool(c1126s);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b$e */
        public static final class e extends AbstractC3756b {

            /* JADX INFO: renamed from: u */
            public final C8387y2 f24629u;

            /* JADX INFO: renamed from: v */
            public final CollectionsAdapter f24630v;

            /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b$e$a */
            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f24631a;

                static {
                    int[] iArr = new int[LibraryContentType.values().length];
                    try {
                        iArr[LibraryContentType.Lessons.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LibraryContentType.Courses.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f24631a = iArr;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b$e$b */
            public static final class b implements InterfaceC10396x {
                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: a */
                public final void mo9801a(String str) {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: b */
                public final void mo9802b() {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: c */
                public final void mo9803c(View view, C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                    C5207g.m11111f(view, "view");
                    C5207g.m11111f(c6332a, "lesson");
                    C5207g.m11111f(str, "shelf");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: d */
                public final void mo9804d(C6336e c6336e) {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: e */
                public final void mo9805e(C6332a c6332a) {
                    C5207g.m11111f(c6332a, "course");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: f */
                public final void mo9806f(Sort sort) {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: g */
                public final void mo9807g(C6332a c6332a) {
                    C5207g.m11111f(c6332a, "course");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: h */
                public final void mo9808h(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                    C5207g.m11111f(c6332a, "lesson");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: i */
                public final void mo9809i(C6332a c6332a, String str) {
                    C5207g.m11111f(c6332a, "course");
                    C5207g.m11111f(str, "shelf");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: j */
                public final void mo9810j(C6332a c6332a) {
                    C5207g.m11111f(c6332a, "course");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: k */
                public final void mo9811k(LibraryShelf libraryShelf) {
                    C5207g.m11111f(libraryShelf, "shelf");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: l */
                public final void mo9812l(View view, C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                    C5207g.m11111f(view, "view");
                    C5207g.m11111f(c6332a, "course");
                    C5207g.m11111f(str, "shelfId");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: m */
                public final void mo9813m(C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                    C5207g.m11111f(c6332a, "lesson");
                    C5207g.m11111f(str, "shelf");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: n */
                public final void mo9814n(boolean z10) {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: o */
                public final void mo9815o(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                    C5207g.m11111f(c6332a, "lesson");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: p */
                public final void mo9816p() {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: q */
                public final void mo9817q(String str) {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: r */
                public final void mo9818r(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                    C5207g.m11111f(c6332a, "lesson");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: s */
                public final void mo9819s(String str) {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: t */
                public final void mo9820t(C6332a c6332a) {
                    C5207g.m11111f(c6332a, "course");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: u */
                public final void mo9821u() {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: v */
                public final void mo9822v(boolean z10) {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: w */
                public final void mo9823w(Sort sort) {
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: x */
                public final void mo9824x(View view, C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                    C5207g.m11111f(view, "view");
                    C5207g.m11111f(c6332a, "course");
                    C5207g.m11111f(str, "shelfId");
                }

                @Override // p512yi.InterfaceC10396x
                /* JADX INFO: renamed from: y */
                public final void mo9825y(View view, C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                    C5207g.m11111f(view, "view");
                    C5207g.m11111f(c6332a, "lesson");
                    C5207g.m11111f(str, "shelf");
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public e(C8387y2 c8387y2, RecyclerView.C1126s c1126s, CollectionsAdapter.InnerListLayout innerListLayout) {
                C5207g.m11111f(c1126s, "loadingViewPool");
                C5207g.m11111f(innerListLayout, "innerListOrientation");
                RecyclerView recyclerView = (RecyclerView) c8387y2.f45479a;
                C5207g.m11110e(recyclerView, "binding.root");
                super(recyclerView);
                this.f24629u = c8387y2;
                this.f24630v = new CollectionsAdapter(innerListLayout, new b());
                RecyclerView recyclerView2 = (RecyclerView) c8387y2.f45480b;
                recyclerView.getContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager(0));
                while (recyclerView2.getItemDecorationCount() > 0) {
                    recyclerView2.m4193b0();
                }
                List<Integer> list = C6716m.f37937a;
                recyclerView2.m4199g(new C8045d((int) C6716m.m13316a(20)));
                recyclerView2.setRecycledViewPool(c1126s);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b$f */
        public static final class f extends AbstractC3756b {

            /* JADX INFO: renamed from: u */
            public final C8330n2 f24632u;

            /* JADX WARN: Illegal instructions before constructor call */
            public f(C8330n2 c8330n2) {
                Space space = (Space) c8330n2.f45085a;
                C5207g.m11110e(space, "binding.root");
                super(space);
                this.f24632u = c8330n2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b$g */
        public static final class g extends AbstractC3756b {

            /* JADX INFO: renamed from: u */
            public final C8358s3 f24633u;

            /* JADX WARN: Illegal instructions before constructor call */
            public g(C8358s3 c8358s3) {
                MaterialCardView materialCardView = c8358s3.f45257a;
                C5207g.m11110e(materialCardView, "binding.root");
                super(materialCardView);
                this.f24633u = c8358s3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$b$h */
        public static final class h extends AbstractC3756b {

            /* JADX INFO: renamed from: u */
            public final C8259b3 f24634u;

            /* JADX WARN: Illegal instructions before constructor call */
            public h(C8259b3 c8259b3) {
                MaterialCardView materialCardView = (MaterialCardView) c8259b3.f44618c;
                C5207g.m11110e(materialCardView, "binding.root");
                super(materialCardView);
                this.f24634u = c8259b3;
            }
        }

        public AbstractC3756b(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$c */
    public static abstract class AbstractC3757c {

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$c$a */
        public static final class a extends AbstractC3757c {

            /* JADX INFO: renamed from: a */
            public final List<C6332a> f24635a;

            /* JADX INFO: renamed from: b */
            public final List<LibraryItemCounter> f24636b;

            public a(List<C6332a> list, List<LibraryItemCounter> list2) {
                C5207g.m11111f(list, "items");
                C5207g.m11111f(list2, "counters");
                this.f24635a = list;
                this.f24636b = list2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (C5207g.m11106a(this.f24635a, aVar.f24635a) && C5207g.m11106a(this.f24636b, aVar.f24636b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f24636b.hashCode() + (this.f24635a.hashCode() * 31);
            }

            public final String toString() {
                return "LibraryItemsType(items=" + this.f24635a + ", counters=" + this.f24636b + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$c$b */
        public static final class b extends AbstractC3757c {

            /* JADX INFO: renamed from: a */
            public final List<LibraryContentType> f24637a;

            public b(ArrayList arrayList) {
                this.f24637a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C5207g.m11106a(this.f24637a, ((b) obj).f24637a);
            }

            public final int hashCode() {
                return this.f24637a.hashCode();
            }

            public final String toString() {
                return "LoadingType(loadings=" + this.f24637a + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryAdapter$d */
    public static final class C3758d extends C1162m.e<AbstractC3755a> {
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
        
            if ((r7.f24620e == r8.f24620e) != false) goto L40;
         */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo480a(AbstractC3755a abstractC3755a, AbstractC3755a abstractC3755a2) {
            AbstractC3755a abstractC3755a3 = abstractC3755a;
            AbstractC3755a abstractC3755a4 = abstractC3755a2;
            boolean z10 = false;
            if (abstractC3755a3 instanceof AbstractC3755a.d) {
                if (abstractC3755a4 instanceof AbstractC3755a.d) {
                    return C5207g.m11106a(((AbstractC3755a.d) abstractC3755a3).f24612b, ((AbstractC3755a.d) abstractC3755a4).f24612b);
                }
            } else if (abstractC3755a3 instanceof AbstractC3755a.e) {
                if (abstractC3755a4 instanceof AbstractC3755a.e) {
                    return C5207g.m11106a(((AbstractC3755a.e) abstractC3755a3).f24614b, ((AbstractC3755a.e) abstractC3755a4).f24614b);
                }
            } else if (abstractC3755a3 instanceof AbstractC3755a.c) {
                if (abstractC3755a4 instanceof AbstractC3755a.c) {
                    AbstractC3755a.c cVar = (AbstractC3755a.c) abstractC3755a3;
                    AbstractC3755a.c cVar2 = (AbstractC3755a.c) abstractC3755a4;
                    if (C5207g.m11106a(cVar.f24608a, cVar2.f24608a) && C5207g.m11106a(cVar.f24610c, cVar2.f24610c)) {
                        return true;
                    }
                }
            } else if (abstractC3755a3 instanceof AbstractC3755a.g) {
                if (abstractC3755a4 instanceof AbstractC3755a.g) {
                    AbstractC3755a.g gVar = (AbstractC3755a.g) abstractC3755a3;
                    AbstractC3755a.g gVar2 = (AbstractC3755a.g) abstractC3755a4;
                    if (gVar.f24616a == gVar2.f24616a && gVar.f24617b == gVar2.f24617b && gVar.f24618c == gVar2.f24618c && gVar.f24622g == gVar2.f24622g && gVar.f24619d == gVar2.f24619d) {
                    }
                }
            } else {
                if (C5207g.m11106a(abstractC3755a3, AbstractC3755a.b.f24607a)) {
                    return abstractC3755a4 instanceof AbstractC3755a.b;
                }
                if (C5207g.m11106a(abstractC3755a3, AbstractC3755a.h.f24623a)) {
                    return abstractC3755a4 instanceof AbstractC3755a.h;
                }
                if (abstractC3755a3 instanceof AbstractC3755a.f) {
                    return abstractC3755a4 instanceof AbstractC3755a.f;
                }
                if (!C5207g.m11106a(abstractC3755a3, AbstractC3755a.a.f24606a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = abstractC3755a4 instanceof AbstractC3755a.a;
            }
            return z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (dm.C5207g.m11106a(((com.lingq.p055ui.home.library.LibraryAdapter.AbstractC3755a.e) r4).f24613a.f22050c, ((com.lingq.p055ui.home.library.LibraryAdapter.AbstractC3755a.e) r5).f24613a.f22050c) != false) goto L15;
         */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo481b(AbstractC3755a abstractC3755a, AbstractC3755a abstractC3755a2) {
            AbstractC3755a abstractC3755a3 = abstractC3755a;
            AbstractC3755a abstractC3755a4 = abstractC3755a2;
            if (abstractC3755a3 instanceof AbstractC3755a.d) {
                if ((abstractC3755a4 instanceof AbstractC3755a.d) && C5207g.m11106a(((AbstractC3755a.d) abstractC3755a3).f24611a.f22050c, ((AbstractC3755a.d) abstractC3755a4).f24611a.f22050c)) {
                    return true;
                }
                return false;
            }
            if (abstractC3755a3 instanceof AbstractC3755a.e) {
                if (abstractC3755a4 instanceof AbstractC3755a.e) {
                }
                return false;
            }
            if (abstractC3755a3 instanceof AbstractC3755a.c) {
                return abstractC3755a4 instanceof AbstractC3755a.c;
            }
            if (abstractC3755a3 instanceof AbstractC3755a.g) {
                return abstractC3755a4 instanceof AbstractC3755a.g;
            }
            if (C5207g.m11106a(abstractC3755a3, AbstractC3755a.b.f24607a)) {
                return abstractC3755a4 instanceof AbstractC3755a.b;
            }
            if (C5207g.m11106a(abstractC3755a3, AbstractC3755a.h.f24623a)) {
                return abstractC3755a4 instanceof AbstractC3755a.h;
            }
            if (abstractC3755a3 instanceof AbstractC3755a.f) {
                return abstractC3755a4 instanceof AbstractC3755a.f;
            }
            if (C5207g.m11106a(abstractC3755a3, AbstractC3755a.a.f24606a)) {
                return abstractC3755a4 instanceof AbstractC3755a.a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryAdapter(LibraryFragment$onViewCreated$1 libraryFragment$onViewCreated$1) {
        super(new C3758d());
        CollectionsAdapter.InnerListLayout innerListLayout = CollectionsAdapter.InnerListLayout.Horizontal;
        C5207g.m11111f(innerListLayout, "innerListOrientation");
        this.f24601e = innerListLayout;
        this.f24602f = libraryFragment$onViewCreated$1;
        this.f24603g = new RecyclerView.C1126s();
        this.f24604h = new RecyclerView.C1126s();
        this.f24605i = new RecyclerView.C1126s();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC3755a abstractC3755aM4528p = m4528p(i10);
        if (abstractC3755aM4528p instanceof AbstractC3755a.d) {
            return LibraryListItemType.Lessons.ordinal();
        }
        if (abstractC3755aM4528p instanceof AbstractC3755a.e) {
            return LibraryListItemType.Loading.ordinal();
        }
        if (abstractC3755aM4528p instanceof AbstractC3755a.c) {
            return LibraryListItemType.Header.ordinal();
        }
        if (abstractC3755aM4528p instanceof AbstractC3755a.g) {
            return LibraryListItemType.Stats.ordinal();
        }
        if (C5207g.m11106a(abstractC3755aM4528p, AbstractC3755a.b.f24607a)) {
            return LibraryListItemType.Empty.ordinal();
        }
        if (C5207g.m11106a(abstractC3755aM4528p, AbstractC3755a.h.f24623a)) {
            return LibraryListItemType.UpgradeBanner.ordinal();
        }
        if (C5207g.m11106a(abstractC3755aM4528p, AbstractC3755a.a.f24606a)) {
            return LibraryListItemType.Divider.ordinal();
        }
        if (abstractC3755aM4528p instanceof AbstractC3755a.f) {
            return LibraryListItemType.SpaceVertical.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01b8 A[EDGE_INSN: B:139:0x01b8->B:73:0x01b8 BREAK  A[LOOP:4: B:67:0x01a3->B:71:0x01b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x019d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b4 A[LOOP:4: B:67:0x01a3->B:71:0x01b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01be  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        FeedTopic[] feedTopicArrValues;
        int length;
        int i11;
        FeedTopic feedTopic;
        String strM10467j0;
        Object next;
        CollectionsAdapter.AbstractC3739a aVar;
        Object next2;
        AbstractC3756b abstractC3756b = (AbstractC3756b) abstractC1109b0;
        int i12 = 1;
        if (abstractC3756b instanceof AbstractC3756b.d) {
            AbstractC3755a abstractC3755aM4528p = m4528p(i10);
            C5207g.m11109d(abstractC3755aM4528p, "null cannot be cast to non-null type com.lingq.ui.home.library.LibraryAdapter.AdapterItem.LibraryItems");
            AbstractC3755a.d dVar = (AbstractC3755a.d) abstractC3755aM4528p;
            AbstractC3756b.d dVar2 = (AbstractC3756b.d) abstractC3756b;
            AbstractC3757c.a aVar2 = dVar.f24612b;
            List<C6332a> list = aVar2.f24635a;
            String str = dVar.f24611a.f22050c;
            C5207g.m11111f(list, "items");
            List<LibraryItemCounter> list2 = aVar2.f24636b;
            C5207g.m11111f(list2, "counters");
            C5207g.m11111f(str, "shelfId");
            RecyclerView recyclerView = (RecyclerView) dVar2.f24627u.f45480b;
            CollectionsAdapter collectionsAdapter = dVar2.f24628v;
            recyclerView.m4214o0(collectionsAdapter, true);
            collectionsAdapter.m4529q(null);
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (C6332a c6332a : list) {
                boolean zM11106a = C5207g.m11106a(c6332a.f36596b, LibraryItemType.Content.getValue());
                int i13 = c6332a.f36595a;
                if (zM11106a) {
                    Iterator it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!(i13 == ((LibraryItemCounter) next2).f22004a));
                    aVar = new CollectionsAdapter.AbstractC3739a.j(c6332a, (LibraryItemCounter) next2, (C6333b) null, (C6334c) null, str, 28);
                } else {
                    Iterator it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!(i13 == ((LibraryItemCounter) next).f22004a));
                    aVar = new CollectionsAdapter.AbstractC3739a.a(c6332a, (LibraryItemCounter) next, false, false, str);
                }
                arrayList.add(aVar);
            }
            collectionsAdapter.m4529q(arrayList);
            return;
        }
        if (abstractC3756b instanceof AbstractC3756b.e) {
            AbstractC3755a abstractC3755aM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC3755aM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.library.LibraryAdapter.AdapterItem.Loading");
            AbstractC3756b.e eVar = (AbstractC3756b.e) abstractC3756b;
            List<LibraryContentType> list3 = ((AbstractC3755a.e) abstractC3755aM4528p2).f24614b.f24637a;
            C5207g.m11111f(list3, "loadings");
            RecyclerView recyclerView2 = (RecyclerView) eVar.f24629u.f45480b;
            CollectionsAdapter collectionsAdapter2 = eVar.f24630v;
            recyclerView2.m4214o0(collectionsAdapter2, true);
            collectionsAdapter2.m4529q(null);
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                int i14 = AbstractC3756b.e.a.f24631a[((LibraryContentType) it3.next()).ordinal()];
                arrayList2.add(i14 != 1 ? i14 != 2 ? CollectionsAdapter.AbstractC3739a.k.f24502a : CollectionsAdapter.AbstractC3739a.f.f24489a : CollectionsAdapter.AbstractC3739a.k.f24502a);
            }
            collectionsAdapter2.m4529q(arrayList2);
            return;
        }
        if (!(abstractC3756b instanceof AbstractC3756b.c)) {
            if (!(abstractC3756b instanceof AbstractC3756b.g)) {
                if (abstractC3756b instanceof AbstractC3756b.b) {
                    return;
                }
                if (abstractC3756b instanceof AbstractC3756b.h) {
                    ((MaterialCardView) ((AbstractC3756b.h) abstractC3756b).f24634u.f44618c).setOnClickListener(new ViewOnClickListenerC2239y(14, this));
                    return;
                }
                if ((abstractC3756b instanceof AbstractC3756b.a) || !(abstractC3756b instanceof AbstractC3756b.f)) {
                    return;
                }
                AbstractC3755a abstractC3755aM4528p3 = m4528p(i10);
                C5207g.m11109d(abstractC3755aM4528p3, "null cannot be cast to non-null type com.lingq.ui.home.library.LibraryAdapter.AdapterItem.SpaceVertical");
                Space space = (Space) ((AbstractC3756b.f) abstractC3756b).f24632u.f45086b;
                C5207g.m11110e(space, "binding.viewSpace");
                List<Integer> list4 = C6716m.f37937a;
                C4924a.m10444W(space, (int) C6716m.m13316a(((AbstractC3755a.f) abstractC3755aM4528p3).f24615a));
                return;
            }
            AbstractC3755a abstractC3755aM4528p4 = m4528p(i10);
            C5207g.m11109d(abstractC3755aM4528p4, "null cannot be cast to non-null type com.lingq.ui.home.library.LibraryAdapter.AdapterItem.Stats");
            AbstractC3755a.g gVar = (AbstractC3755a.g) abstractC3755aM4528p4;
            AbstractC3756b.g gVar2 = (AbstractC3756b.g) abstractC3756b;
            C8358s3 c8358s3 = gVar2.f24633u;
            if (gVar.f24622g) {
                LinearLayout linearLayout = c8358s3.f45265i;
                C5207g.m11110e(linearLayout, "binding.viewLoading");
                C4924a.m10457e0(linearLayout);
                ConstraintLayout constraintLayout = c8358s3.f45264h;
                C5207g.m11110e(constraintLayout, "binding.viewContent");
                C4924a.m10442U(constraintLayout);
            } else {
                TextView textView = c8358s3.f45261e;
                Locale locale = Locale.getDefault();
                int i15 = gVar.f24616a;
                C0009a.m32u(new Object[]{Integer.valueOf(i15)}, 1, locale, "%d", "format(locale, format, *args)", textView);
                View view = gVar2.f7054a;
                c8358s3.f45262f.setText(i15 == 1 ? view.getContext().getString(R.string.stats_day) : view.getContext().getString(R.string.stats_days));
                Locale locale2 = Locale.getDefault();
                int i16 = gVar.f24617b;
                c8358s3.f45258b.setText(C0141b.m613i(new Object[]{Integer.valueOf(i16)}, 1, locale2, "%d", "format(locale, format, *args)"));
                Locale locale3 = Locale.getDefault();
                int i17 = gVar.f24618c;
                c8358s3.f45259c.setText(C0009a.m21i(C0141b.m613i(new Object[]{Integer.valueOf(i17)}, 1, locale3, "/%d", "format(locale, format, *args)"), " ", view.getContext().getString(R.string.lesson_coins)));
                TextView textView2 = c8358s3.f45263g;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(gVar.f24619d));
                }
                TextView textView3 = c8358s3.f45260d;
                if (textView3 != null) {
                    double d10 = gVar.f24620e;
                    textView3.setText(C4924a.m10428G(d10) ? String.valueOf((int) d10) : C0166e.m770q(new Object[]{Double.valueOf(d10)}, 1, "%.1f", "format(format, *args)"));
                }
                StreakFireView streakFireView = c8358s3.f45266j;
                streakFireView.m9379b(i16, i17, gVar.f24621f);
                List<Integer> list5 = C6716m.f37937a;
                streakFireView.m9378a((int) C6716m.m13316a(24), false);
                LinearLayout linearLayout2 = c8358s3.f45265i;
                C5207g.m11110e(linearLayout2, "binding.viewLoading");
                C4924a.m10442U(linearLayout2);
                ConstraintLayout constraintLayout2 = c8358s3.f45264h;
                C5207g.m11110e(constraintLayout2, "binding.viewContent");
                C4924a.m10457e0(constraintLayout2);
            }
            c8358s3.f45257a.setOnClickListener(new ViewOnClickListenerC3807a(i12, this));
            return;
        }
        AbstractC3755a abstractC3755aM4528p5 = m4528p(i10);
        C5207g.m11109d(abstractC3755aM4528p5, "null cannot be cast to non-null type com.lingq.ui.home.library.LibraryAdapter.AdapterItem.Header");
        AbstractC3755a.c cVar = (AbstractC3755a.c) abstractC3755aM4528p5;
        AbstractC3756b.c cVar2 = (AbstractC3756b.c) abstractC3756b;
        LibraryShelf libraryShelf = cVar.f24609b;
        String str2 = libraryShelf.f22050c;
        int iHashCode = str2.hashCode();
        C8271d3 c8271d3 = cVar2.f24625u;
        View view2 = cVar2.f7054a;
        if (iHashCode != -1473101144) {
            if (iHashCode != -1234885400) {
                if (iHashCode == 3138974 && str2.equals("feed")) {
                    ((TextView) c8271d3.f44674e).setText(view2.getContext().getString(R.string.feed_trending));
                } else {
                    feedTopicArrValues = FeedTopic.values();
                    length = feedTopicArrValues.length;
                    i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            feedTopic = null;
                            break;
                        }
                        feedTopic = feedTopicArrValues[i11];
                        if (C5207g.m11106a(C5408a.m11574g(feedTopic), libraryShelf.f22050c)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    TextView textView4 = (TextView) c8271d3.f44674e;
                    if (feedTopic != null) {
                        strM10467j0 = C4924a.m10467j0(feedTopic, view2.getContext());
                    } else {
                        strM10467j0 = cVar.f24608a;
                    }
                    textView4.setText(strM10467j0);
                }
            } else if (str2.equals("guided")) {
                ((TextView) c8271d3.f44674e).setText(view2.getContext().getString(R.string.feed_guided_course));
            } else {
                feedTopicArrValues = FeedTopic.values();
                length = feedTopicArrValues.length;
                i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        feedTopic = null;
                        break;
                    }
                    feedTopic = feedTopicArrValues[i11];
                    if (C5207g.m11106a(C5408a.m11574g(feedTopic), libraryShelf.f22050c)) {
                        break;
                        break;
                    }
                    i11++;
                }
                TextView textView5 = (TextView) c8271d3.f44674e;
                if (feedTopic != null) {
                    strM10467j0 = C4924a.m10467j0(feedTopic, view2.getContext());
                } else {
                    strM10467j0 = cVar.f24608a;
                }
                textView5.setText(strM10467j0);
            }
        } else if (str2.equals("my_lessons")) {
            ((TextView) c8271d3.f44674e).setText(view2.getContext().getString(R.string.feed_continue_studying));
        } else {
            feedTopicArrValues = FeedTopic.values();
            length = feedTopicArrValues.length;
            i11 = 0;
            while (true) {
                if (i11 >= length) {
                    feedTopic = null;
                    break;
                }
                feedTopic = feedTopicArrValues[i11];
                if (C5207g.m11106a(C5408a.m11574g(feedTopic), libraryShelf.f22050c)) {
                    break;
                    break;
                }
                i11++;
            }
            TextView textView6 = (TextView) c8271d3.f44674e;
            if (feedTopic != null) {
                strM10467j0 = C4924a.m10467j0(feedTopic, view2.getContext());
            } else {
                strM10467j0 = cVar.f24608a;
            }
            textView6.setText(strM10467j0);
        }
        RecyclerView recyclerView3 = (RecyclerView) c8271d3.f44673d;
        C10374c0 c10374c0 = cVar2.f24626v;
        recyclerView3.m4214o0(c10374c0, false);
        c10374c0.m4529q(null);
        RunnableC7907g runnableC7907g = new RunnableC7907g(cVar, 19, cVar2);
        C1146d<T> c1146d = c10374c0.f7471d;
        List list6 = cVar.f24610c;
        c1146d.m4439b((List<T>) list6, runnableC7907g);
        boolean zIsEmpty = list6.isEmpty();
        View view3 = c8271d3.f44673d;
        if (zIsEmpty || list6.size() == 1) {
            RecyclerView recyclerView4 = (RecyclerView) view3;
            C5207g.m11110e(recyclerView4, "binding.rvContent");
            C4924a.m10442U(recyclerView4);
        } else {
            RecyclerView recyclerView5 = (RecyclerView) view3;
            C5207g.m11110e(recyclerView5, "binding.rvContent");
            C4924a.m10457e0(recyclerView5);
        }
        ((TextView) c8271d3.f44671b).setOnClickListener(new ViewOnClickListenerC9029m(this, 4, cVar));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x015e A[PHI: r3
      0x015e: PHI (r3v29 int) = (r3v28 int), (r3v30 int) binds: [B:32:0x0135, B:34:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a7 A[PHI: r3
      0x01a7: PHI (r3v24 int) = (r3v23 int), (r3v25 int) binds: [B:44:0x018b, B:46:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        int iOrdinal = LibraryListItemType.Lessons.ordinal();
        CollectionsAdapter.InnerListLayout innerListLayout = this.f24601e;
        InterfaceC10396x interfaceC10396x = this.f24602f;
        if (i10 == iOrdinal) {
            return new AbstractC3756b.d(C8387y2.m16419a(LayoutInflater.from(recyclerView.getContext()), recyclerView), this.f24603g, interfaceC10396x, innerListLayout);
        }
        if (i10 == LibraryListItemType.Loading.ordinal()) {
            return new AbstractC3756b.e(C8387y2.m16419a(LayoutInflater.from(recyclerView.getContext()), recyclerView), this.f24604h, innerListLayout);
        }
        if (i10 == LibraryListItemType.Stats.ordinal()) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_library_stats, recyclerView, false);
            int i11 = R.id.ivCoins;
            if (((ImageView) C0062b.m298P0(viewM849h, R.id.ivCoins)) != null) {
                i11 = R.id.tvCoins;
                TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvCoins);
                if (textView != null) {
                    i11 = R.id.tvCoinsLabel;
                    TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tvCoinsLabel);
                    if (textView2 != null) {
                        TextView textView3 = (TextView) C0062b.m298P0(viewM849h, R.id.tvListening);
                        i11 = R.id.tvStreakDays;
                        TextView textView4 = (TextView) C0062b.m298P0(viewM849h, R.id.tvStreakDays);
                        if (textView4 != null) {
                            i11 = R.id.tvStreakDaysLabel;
                            TextView textView5 = (TextView) C0062b.m298P0(viewM849h, R.id.tvStreakDaysLabel);
                            if (textView5 != null) {
                                TextView textView6 = (TextView) C0062b.m298P0(viewM849h, R.id.tvWords);
                                i11 = R.id.viewContent;
                                ConstraintLayout constraintLayout = (ConstraintLayout) C0062b.m298P0(viewM849h, R.id.viewContent);
                                if (constraintLayout != null) {
                                    i11 = R.id.view_loading;
                                    LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewM849h, R.id.view_loading);
                                    if (linearLayout != null) {
                                        i11 = R.id.viewStreakFire;
                                        StreakFireView streakFireView = (StreakFireView) C0062b.m298P0(viewM849h, R.id.viewStreakFire);
                                        if (streakFireView != null) {
                                            return new AbstractC3756b.g(new C8358s3((MaterialCardView) viewM849h, textView, textView2, textView3, textView4, textView5, textView6, constraintLayout, linearLayout, streakFireView));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
        }
        int iOrdinal2 = LibraryListItemType.Header.ordinal();
        int i12 = R.id.tvTitle;
        if (i10 == iOrdinal2) {
            View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_item_library_header, recyclerView, false);
            int i13 = R.id.rvContent;
            RecyclerView recyclerView2 = (RecyclerView) C0062b.m298P0(viewM849h2, R.id.rvContent);
            if (recyclerView2 != null) {
                i13 = R.id.tvExplore;
                TextView textView7 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvExplore);
                if (textView7 != null) {
                    TextView textView8 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvTitle);
                    if (textView8 != null) {
                        return new AbstractC3756b.c(new C8271d3((ConstraintLayout) viewM849h2, (ViewGroup) recyclerView2, textView7, textView8, 1), this.f24605i, interfaceC10396x);
                    }
                } else {
                    i12 = i13;
                }
            } else {
                i12 = i13;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(i12)));
        }
        if (i10 != LibraryListItemType.Empty.ordinal()) {
            if (i10 == LibraryListItemType.UpgradeBanner.ordinal()) {
                return new AbstractC3756b.h(C8259b3.m16398a(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.list_item_library_upgrade_banner, (ViewGroup) recyclerView, false)));
            }
            if (i10 != LibraryListItemType.SpaceVertical.ordinal()) {
                if (i10 == LibraryListItemType.Divider.ordinal()) {
                    return new AbstractC3756b.a(C8336o2.m16409a(C7793a.m15500d(recyclerView), recyclerView));
                }
                throw new IllegalStateException();
            }
            View viewM849h3 = C0204c.m849h(recyclerView, R.layout.list_item_space_vertical, recyclerView, false);
            if (viewM849h3 == null) {
                throw new NullPointerException("rootView");
            }
            Space space = (Space) viewM849h3;
            return new AbstractC3756b.f(new C8330n2(space, space));
        }
        View viewM849h4 = C0204c.m849h(recyclerView, R.layout.list_item_library_empty, recyclerView, false);
        int i14 = R.id.mainCard;
        ImageView imageView = (ImageView) C0062b.m298P0(viewM849h4, R.id.mainCard);
        if (imageView != null) {
            i14 = R.id.tvLessons;
            View viewM298P0 = C0062b.m298P0(viewM849h4, R.id.tvLessons);
            if (viewM298P0 != null) {
                View viewM298P1 = C0062b.m298P0(viewM849h4, R.id.tvTitle);
                if (viewM298P1 != null) {
                    return new AbstractC3756b.b(new C8325m3((LinearLayout) viewM849h4, imageView, viewM298P0, viewM298P1));
                }
            } else {
                i12 = i14;
            }
        } else {
            i12 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h4.getResources().getResourceName(i12)));
    }
}
