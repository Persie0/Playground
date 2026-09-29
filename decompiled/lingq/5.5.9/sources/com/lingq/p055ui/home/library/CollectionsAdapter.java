package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.C0337q0;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.bumptech.glide.ComponentCallbacks2C2090l;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.shared.uimodel.library.SortType;
import com.lingq.util.C4924a;
import com.lingq.util.ImageSize;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import mo.C7661i;
import p003a2.C0009a;
import p128g2.RunnableC5682t;
import p137gj.C5810f;
import p181ii.C6332a;
import p181ii.C6333b;
import p181ii.C6334c;
import p181ii.C6335d;
import p181ii.C6336e;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import p254m2.C7472a;
import p274n8.ViewOnClickListenerC7718c;
import p290o6.C7946b;
import p301oh.C8045d;
import p338qd.C8573r0;
import p408u6.ViewOnClickListenerC9466e;
import p512yi.C10374c0;
import p512yi.InterfaceC10396x;
import p512yi.ViewOnClickListenerC10369a;
import p512yi.ViewOnClickListenerC10371b;
import p512yi.ViewOnClickListenerC10373c;
import p512yi.ViewOnClickListenerC10377e;
import p512yi.ViewOnClickListenerC10380h;
import p512yi.ViewOnTouchListenerC10379g;
import p512yi.ViewTreeObserverOnGlobalLayoutListenerC10382j;
import p512yi.ViewTreeObserverOnGlobalLayoutListenerC10383k;
import ph.C8253a3;
import ph.C8259b3;
import ph.C8295h3;
import ph.C8301i3;
import ph.C8307j3;
import ph.C8313k3;
import ph.C8324m2;
import ph.C8330n2;
import ph.C8343p3;
import ph.C8348q3;
import ph.C8363t3;
import ph.C8368u3;
import ph.C8377w2;
import ph.C8382x2;
import si.ViewOnClickListenerC9028l;
import si.ViewOnClickListenerC9029m;
import sl.C9072e;
import tl.C9325m;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionsAdapter extends AbstractC1170u<AbstractC3739a, AbstractC3740b> {

    /* JADX INFO: renamed from: e */
    public final InnerListLayout f24477e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC10396x f24478f;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m13365d2 = {"Lcom/lingq/ui/home/library/CollectionsAdapter$CollectionsListItemType;", "", "(Ljava/lang/String;I)V", "Lesson", "Course", "Search", "HeaderSelectable", "Filter", "CourseFilter", "CourseHeader", "CourseInfo", "LessonLoading", "CourseLoading", "CourseHeaderLoading", "Empty", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum CollectionsListItemType {
        Lesson,
        Course,
        Search,
        HeaderSelectable,
        Filter,
        CourseFilter,
        CourseHeader,
        CourseInfo,
        LessonLoading,
        CourseLoading,
        CourseHeaderLoading,
        Empty
    }

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/home/library/CollectionsAdapter$InnerListLayout;", "", "(Ljava/lang/String;I)V", "Horizontal", "VerticalFullWidth", "VerticalGrid", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum InnerListLayout {
        Horizontal,
        VerticalFullWidth,
        VerticalGrid
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a */
    public static abstract class AbstractC3739a {

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$a */
        public static final class a extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public final C6332a f24479a;

            /* JADX INFO: renamed from: b */
            public final LibraryItemCounter f24480b;

            /* JADX INFO: renamed from: c */
            public final boolean f24481c;

            /* JADX INFO: renamed from: d */
            public final boolean f24482d;

            /* JADX INFO: renamed from: e */
            public final String f24483e;

            public a(C6332a c6332a, LibraryItemCounter libraryItemCounter, boolean z10, boolean z11, String str) {
                C5207g.m11111f(c6332a, "course");
                C5207g.m11111f(str, "shelfId");
                this.f24479a = c6332a;
                this.f24480b = libraryItemCounter;
                this.f24481c = z10;
                this.f24482d = z11;
                this.f24483e = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (C5207g.m11106a(this.f24479a, aVar.f24479a) && C5207g.m11106a(this.f24480b, aVar.f24480b) && this.f24481c == aVar.f24481c && this.f24482d == aVar.f24482d && C5207g.m11106a(this.f24483e, aVar.f24483e)) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [int] */
            /* JADX WARN: Type inference failed for: r0v7, types: [int] */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4, types: [int] */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4 */
            public final int hashCode() {
                int iHashCode = this.f24479a.hashCode() * 31;
                LibraryItemCounter libraryItemCounter = this.f24480b;
                int iHashCode2 = (iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31;
                ?? r10 = 1;
                boolean z10 = this.f24481c;
                ?? r11 = z10;
                if (z10) {
                    r11 = 1;
                }
                int i10 = (iHashCode2 + r11) * 31;
                boolean z11 = this.f24482d;
                if (!z11) {
                    r10 = z11;
                }
                return this.f24483e.hashCode() + ((i10 + r10) * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Course(course=");
                sb2.append(this.f24479a);
                sb2.append(", counter=");
                sb2.append(this.f24480b);
                sb2.append(", isDownloaded=");
                sb2.append(this.f24481c);
                sb2.append(", isDownloading=");
                sb2.append(this.f24482d);
                sb2.append(", shelfId=");
                return C0009a.m23l(sb2, this.f24483e, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$b */
        public static final class b extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public final Sort f24484a;

            public b(Sort sort) {
                C5207g.m11111f(sort, "sort");
                this.f24484a = sort;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f24484a == ((b) obj).f24484a;
            }

            public final int hashCode() {
                return this.f24484a.hashCode();
            }

            public final String toString() {
                return "CourseFilter(sort=" + this.f24484a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$c */
        public static final class c extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public final C6332a f24485a;

            /* JADX INFO: renamed from: b */
            public final LibraryItemCounter f24486b;

            public c(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(c6332a, "course");
                C5207g.m11111f(libraryItemCounter, "counter");
                this.f24485a = c6332a;
                this.f24486b = libraryItemCounter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C5207g.m11106a(this.f24485a, cVar.f24485a) && C5207g.m11106a(this.f24486b, cVar.f24486b);
            }

            public final int hashCode() {
                return this.f24486b.hashCode() + (this.f24485a.hashCode() * 31);
            }

            public final String toString() {
                return "CourseHeader(course=" + this.f24485a + ", counter=" + this.f24486b + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$d */
        public static final class d extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public static final d f24487a = new d();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$e */
        public static final class e extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public final C3741c f24488a;

            public e(C3741c c3741c) {
                C5207g.m11111f(c3741c, "info");
                this.f24488a = c3741c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && C5207g.m11106a(this.f24488a, ((e) obj).f24488a);
            }

            public final int hashCode() {
                return this.f24488a.hashCode();
            }

            public final String toString() {
                return "CourseInfo(info=" + this.f24488a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$f */
        public static final class f extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public static final f f24489a = new f();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$g */
        public static final class g extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public static final g f24490a = new g();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$h */
        public static final class h extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public final SortType f24491a;

            /* JADX INFO: renamed from: b */
            public final Sort f24492b;

            /* JADX INFO: renamed from: c */
            public final Pair<LearningLevel, LearningLevel> f24493c;

            /* JADX INFO: renamed from: d */
            public final String f24494d;

            /* JADX WARN: Multi-variable type inference failed */
            public h(SortType sortType, Sort sort, Pair<? extends LearningLevel, ? extends LearningLevel> pair, String str) {
                C5207g.m11111f(sortType, "sortType");
                C5207g.m11111f(sort, "sort");
                C5207g.m11111f(pair, "levels");
                C5207g.m11111f(str, "libraryShelfType");
                this.f24491a = sortType;
                this.f24492b = sort;
                this.f24493c = pair;
                this.f24494d = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                if (this.f24491a == hVar.f24491a && this.f24492b == hVar.f24492b && C5207g.m11106a(this.f24493c, hVar.f24493c) && C5207g.m11106a(this.f24494d, hVar.f24494d)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f24494d.hashCode() + ((this.f24493c.hashCode() + ((this.f24492b.hashCode() + (this.f24491a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Filter(sortType=" + this.f24491a + ", sort=" + this.f24492b + ", levels=" + this.f24493c + ", libraryShelfType=" + this.f24494d + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$i */
        public static final class i extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public final List<C6336e> f24495a;

            public i(ArrayList arrayList) {
                this.f24495a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && C5207g.m11106a(this.f24495a, ((i) obj).f24495a);
            }

            public final int hashCode() {
                return this.f24495a.hashCode();
            }

            public final String toString() {
                return "HeaderSelectable(tabs=" + this.f24495a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$j */
        public static final class j extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public final C6332a f24496a;

            /* JADX INFO: renamed from: b */
            public final LibraryItemCounter f24497b;

            /* JADX INFO: renamed from: c */
            public final C6333b f24498c;

            /* JADX INFO: renamed from: d */
            public final C6334c f24499d;

            /* JADX INFO: renamed from: e */
            public final boolean f24500e;

            /* JADX INFO: renamed from: f */
            public final String f24501f;

            public /* synthetic */ j(C6332a c6332a, LibraryItemCounter libraryItemCounter, C6333b c6333b, C6334c c6334c, String str, int i10) {
                this(c6332a, (i10 & 2) != 0 ? null : libraryItemCounter, (i10 & 4) != 0 ? null : c6333b, (i10 & 8) != 0 ? null : c6334c, (i10 & 16) != 0, str);
            }

            public j(C6332a c6332a, LibraryItemCounter libraryItemCounter, C6333b c6333b, C6334c c6334c, boolean z10, String str) {
                C5207g.m11111f(c6332a, "lesson");
                C5207g.m11111f(str, "shelfId");
                this.f24496a = c6332a;
                this.f24497b = libraryItemCounter;
                this.f24498c = c6333b;
                this.f24499d = c6334c;
                this.f24500e = z10;
                this.f24501f = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return C5207g.m11106a(this.f24496a, jVar.f24496a) && C5207g.m11106a(this.f24497b, jVar.f24497b) && C5207g.m11106a(this.f24498c, jVar.f24498c) && C5207g.m11106a(this.f24499d, jVar.f24499d) && this.f24500e == jVar.f24500e && C5207g.m11106a(this.f24501f, jVar.f24501f);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v9, types: [int] */
            /* JADX WARN: Type inference failed for: r1v4, types: [int] */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r1v9 */
            public final int hashCode() {
                int iHashCode = this.f24496a.hashCode() * 31;
                int iHashCode2 = 0;
                LibraryItemCounter libraryItemCounter = this.f24497b;
                int iHashCode3 = (iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31;
                C6333b c6333b = this.f24498c;
                int iHashCode4 = (iHashCode3 + (c6333b == null ? 0 : c6333b.hashCode())) * 31;
                C6334c c6334c = this.f24499d;
                if (c6334c != null) {
                    iHashCode2 = c6334c.hashCode();
                }
                int i10 = (iHashCode4 + iHashCode2) * 31;
                boolean z10 = this.f24500e;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return this.f24501f.hashCode() + ((i10 + r10) * 31);
            }

            public final String toString() {
                return "Lesson(lesson=" + this.f24496a + ", counter=" + this.f24497b + ", lessonDownload=" + this.f24498c + ", lessonDataDownload=" + this.f24499d + ", shouldShowCourseTitle=" + this.f24500e + ", shelfId=" + this.f24501f + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$k */
        public static final class k extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public static final k f24502a = new k();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$a$l */
        public static final class l extends AbstractC3739a {

            /* JADX INFO: renamed from: a */
            public final boolean f24503a;

            /* JADX INFO: renamed from: b */
            public final String f24504b;

            public l(String str, boolean z10) {
                C5207g.m11111f(str, "query");
                this.f24503a = z10;
                this.f24504b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                if (this.f24503a == lVar.f24503a && C5207g.m11106a(this.f24504b, lVar.f24504b)) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v4 */
            public final int hashCode() {
                boolean z10 = this.f24503a;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return this.f24504b.hashCode() + (r10 * 31);
            }

            public final String toString() {
                return "Search(defaultSelected=" + this.f24503a + ", query=" + this.f24504b + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b */
    public static abstract class AbstractC3740b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$a */
        public static final class a extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8382x2 f24505u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8382x2 c8382x2) {
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
                this.f24505u = c8382x2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$b */
        public static final class b extends AbstractC3740b {
            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8301i3 c8301i3) {
                LinearLayout linearLayout = c8301i3.f44894a;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$c */
        public static final class c extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8377w2 f24506u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8377w2 c8377w2) {
                LinearLayout linearLayout = c8377w2.f45437a;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f24506u = c8377w2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$d */
        public static final class d extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8307j3 f24507u;

            /* JADX INFO: renamed from: v */
            public final C5810f f24508v;

            /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$d$a */
            public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f24509a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C8307j3 f24510b;

                public a(TextView textView, C8307j3 c8307j3) {
                    this.f24509a = textView;
                    this.f24510b = c8307j3;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    View view = this.f24509a;
                    if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                        return;
                    }
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    C8307j3 c8307j3 = this.f24510b;
                    int lineCount = c8307j3.f44923m.getLineCount();
                    TextView textView = c8307j3.f44917g;
                    if (lineCount > 4) {
                        C5207g.m11110e(textView, "btnShowAll");
                        C4924a.m10457e0(textView);
                    } else {
                        C5207g.m11110e(textView, "btnShowAll");
                        C4924a.m10442U(textView);
                    }
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8307j3 c8307j3) {
                ConstraintLayout constraintLayout = c8307j3.f44911a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f24507u = c8307j3;
                this.f24508v = new C5810f();
            }

            /* JADX INFO: renamed from: s */
            public final void m9926s(C3741c c3741c) {
                ImageButton imageButton;
                CircularProgressIndicator circularProgressIndicator;
                boolean z10;
                C5207g.m11111f(c3741c, "info");
                C8307j3 c8307j3 = this.f24507u;
                TextView textView = c8307j3.f44922l;
                LibraryItemCounter libraryItemCounter = c3741c.f24523b;
                textView.setText(String.valueOf(libraryItemCounter.f22014k));
                int i10 = libraryItemCounter.f22013j;
                int i11 = libraryItemCounter.f22015l;
                int i12 = libraryItemCounter.f22014k;
                LinearProgressIndicator linearProgressIndicator = c8307j3.f44932v;
                linearProgressIndicator.setMax(i10 + i11 + i12);
                boolean z11 = true;
                linearProgressIndicator.setProgress(i12, true);
                c8307j3.f44929s.setText(String.valueOf(i10));
                LinearProgressIndicator linearProgressIndicator2 = c8307j3.f44934x;
                linearProgressIndicator2.setMax(i10 + i11 + i12);
                linearProgressIndicator2.setProgress(i10, true);
                c8307j3.f44924n.setText(String.valueOf(i11));
                int i13 = i10 + i11 + i12;
                LinearProgressIndicator linearProgressIndicator3 = c8307j3.f44933w;
                linearProgressIndicator3.setMax(i13);
                linearProgressIndicator3.setProgress(i11, true);
                C6332a c6332a = c3741c.f24522a;
                String str = c6332a.f36600f;
                boolean z12 = str != null && (C7661i.m15250P2(str) ^ true);
                TextView textView2 = c8307j3.f44923m;
                if (z12) {
                    C5207g.m11110e(textView2, "tvLessonDescription");
                    C4924a.m10457e0(textView2);
                    textView2.setText(c6332a.f36600f);
                    if (textView2.getVisibility() == 0) {
                        textView2.getViewTreeObserver().addOnGlobalLayoutListener(new a(textView2, c8307j3));
                    }
                } else {
                    C5207g.m11110e(textView2, "tvLessonDescription");
                    C4924a.m10442U(textView2);
                }
                ConstraintLayout constraintLayout = c8307j3.f44911a;
                ComponentCallbacks2C2080b.m6238e(constraintLayout.getContext()).m6259o(c6332a.f36585L).m12716c().m6245E(c8307j3.f44919i);
                boolean zM11106a = C5207g.m11106a(c6332a.f36601g, "private");
                TextView textView3 = c8307j3.f44927q;
                View view = this.f7054a;
                TextView textView4 = c8307j3.f44928r;
                if (zM11106a) {
                    C5207g.m11110e(textView4, "tvSharedByTitle");
                    C4924a.m10422A(textView4);
                    textView3.setText(view.getContext().getString(R.string.lesson_private));
                } else {
                    C5207g.m11110e(textView4, "tvSharedByTitle");
                    C4924a.m10457e0(textView4);
                    textView3.setText(c6332a.f36584K);
                }
                String upperCase = textView4.getText().toString().toUpperCase(Locale.ROOT);
                C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                textView4.setText(upperCase);
                Drawable drawableM14849b = null;
                ImageView imageView = c8307j3.f44920j;
                String str2 = c6332a.f36586M;
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -1307827859) {
                        if (iHashCode != 94630981) {
                            if (iHashCode == 812757528 && str2.equals("librarian")) {
                                Context context = view.getContext();
                                Object obj = C7472a.f41322a;
                                drawableM14849b = C7472a.c.m14849b(context, R.drawable.ic_profile_librarian);
                            }
                        } else if (str2.equals("chief")) {
                            Context context2 = view.getContext();
                            Object obj2 = C7472a.f41322a;
                            drawableM14849b = C7472a.c.m14849b(context2, R.drawable.ic_profile_chief_librarian);
                        }
                    } else if (str2.equals("editor")) {
                        Context context3 = view.getContext();
                        Object obj3 = C7472a.f41322a;
                        drawableM14849b = C7472a.c.m14849b(context3, R.drawable.ic_profile_editor);
                    }
                    imageView.setImageDrawable(drawableM14849b);
                } else {
                    imageView.setImageDrawable(null);
                }
                constraintLayout.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
                RecyclerView recyclerView = c8307j3.f44921k;
                recyclerView.setLayoutManager(linearLayoutManager);
                if (recyclerView.getItemDecorationCount() > 0) {
                    recyclerView.m4193b0();
                }
                List<Integer> list = C6716m.f37937a;
                recyclerView.m4199g(new C8045d((int) C6716m.m13316a(5)));
                C5810f c5810f = this.f24508v;
                recyclerView.setAdapter(c5810f);
                List<String> list2 = c6332a.f36593T;
                if (list2 != null && !list2.isEmpty()) {
                    z11 = false;
                }
                if (z11) {
                    C4924a.m10442U(recyclerView);
                } else {
                    C4924a.m10457e0(recyclerView);
                }
                c5810f.m4529q(list2);
                boolean z13 = libraryItemCounter.f22005b;
                ImageButton imageButton2 = c8307j3.f44915e;
                if (z13) {
                    Context context4 = view.getContext();
                    Object obj4 = C7472a.f41322a;
                    imageButton2.setImageDrawable(C7472a.c.m14849b(context4, R.drawable.ic_heart_filled_s));
                } else {
                    Context context5 = view.getContext();
                    Object obj5 = C7472a.f41322a;
                    imageButton2.setImageDrawable(C7472a.c.m14849b(context5, R.drawable.ic_heart_s));
                }
                boolean z14 = libraryItemCounter.f22009f;
                MaterialButton materialButton = c8307j3.f44918h;
                if (z14) {
                    materialButton.setText(view.getContext().getString(R.string.course_continue_course));
                } else {
                    materialButton.setText(view.getContext().getString(R.string.course_start_course));
                }
                int i14 = c6332a.f36594U;
                MaterialButton materialButton2 = c8307j3.f44916f;
                TextView textView5 = c8307j3.f44926p;
                CircularProgressIndicator circularProgressIndicator2 = c8307j3.f44931u;
                ImageButton imageButton3 = c8307j3.f44914d;
                if (i14 > 0) {
                    C5207g.m11110e(textView5, "tvPremium");
                    C4924a.m10457e0(textView5);
                    Locale locale = Locale.getDefault();
                    String string = view.getContext().getString(R.string.course_premium_points);
                    C5207g.m11110e(string, "itemView.context.getStri…ng.course_premium_points)");
                    imageButton = imageButton3;
                    C0009a.m32u(new Object[]{Integer.valueOf(i14)}, 1, locale, string, "format(locale, format, *args)", textView5);
                    if (c3741c.f24527f) {
                        circularProgressIndicator2.m4935d();
                        C5207g.m11110e(imageButton, "btnDownload");
                        C4924a.m10442U(imageButton);
                        circularProgressIndicator = circularProgressIndicator2;
                    } else if (libraryItemCounter.f22016m) {
                        C5207g.m11110e(materialButton2, "btnPurchaseCourse");
                        C4924a.m10442U(materialButton2);
                        circularProgressIndicator = circularProgressIndicator2;
                        C5207g.m11110e(circularProgressIndicator, "viewProgress");
                        C4924a.m10442U(circularProgressIndicator);
                    } else {
                        circularProgressIndicator = circularProgressIndicator2;
                        C5207g.m11110e(materialButton2, "btnPurchaseCourse");
                        C4924a.m10457e0(materialButton2);
                        C5207g.m11110e(circularProgressIndicator, "viewProgress");
                        C4924a.m10442U(circularProgressIndicator);
                    }
                    z10 = true;
                } else {
                    imageButton = imageButton3;
                    circularProgressIndicator = circularProgressIndicator2;
                    z10 = true;
                    C5207g.m11110e(textView5, "tvPremium");
                    C4924a.m10442U(textView5);
                    C5207g.m11110e(materialButton2, "btnPurchaseCourse");
                    C4924a.m10442U(materialButton2);
                }
                LessonMediaSource lessonMediaSource = c6332a.f36612r;
                String str3 = lessonMediaSource != null ? lessonMediaSource.f22001c : null;
                if (str3 != null && !C7661i.m15250P2(str3)) {
                    z10 = false;
                }
                ConstraintLayout constraintLayout2 = c8307j3.f44930t;
                if (z10) {
                    C5207g.m11110e(constraintLayout2, "viewLink");
                    C4924a.m10442U(constraintLayout2);
                } else {
                    C5207g.m11110e(constraintLayout2, "viewLink");
                    C4924a.m10457e0(constraintLayout2);
                    c8307j3.f44925o.setText(lessonMediaSource != null ? lessonMediaSource.f22001c : null);
                }
                boolean z15 = c3741c.f24524c;
                ImageButton imageButton4 = c8307j3.f44912b;
                if (z15) {
                    imageButton4.setImageDrawable(C7472a.c.m14849b(view.getContext(), R.drawable.ic_check_thick));
                    Context context6 = view.getContext();
                    C5207g.m11110e(context6, "itemView.context");
                    imageButton4.setColorFilter(C6716m.m13333r(R.attr.greenTint, context6));
                } else {
                    imageButton4.setImageDrawable(C7472a.c.m14849b(view.getContext(), R.drawable.ic_plus_s));
                    Context context7 = view.getContext();
                    C5207g.m11110e(context7, "itemView.context");
                    imageButton4.setColorFilter(C6716m.m13333r(R.attr.primaryTextColor, context7));
                }
                if (c3741c.f24525d) {
                    Context context8 = view.getContext();
                    C5207g.m11110e(context8, "itemView.context");
                    imageButton.setColorFilter(C6716m.m13333r(R.attr.greenTint, context8));
                    imageButton.setEnabled(false);
                } else {
                    Context context9 = view.getContext();
                    C5207g.m11110e(context9, "itemView.context");
                    imageButton.setColorFilter(C6716m.m13333r(R.attr.primaryTextColor, context9));
                }
                if (c3741c.f24526e) {
                    circularProgressIndicator.m4935d();
                    C5207g.m11110e(imageButton, "btnDownload");
                    C4924a.m10442U(imageButton);
                } else {
                    C5207g.m11110e(circularProgressIndicator, "viewProgress");
                    C4924a.m10442U(circularProgressIndicator);
                    C5207g.m11110e(imageButton, "btnDownload");
                    C4924a.m10457e0(imageButton);
                }
                if (c3741c.f24528g) {
                    textView2.setMaxLines(Integer.MAX_VALUE);
                    c8307j3.f44917g.setText(view.getContext().getString(R.string.ui_show_less));
                } else {
                    textView2.setMaxLines(4);
                    c8307j3.f44917g.setText(view.getContext().getString(R.string.ui_show_all));
                }
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$e */
        public static final class e extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8313k3 f24511u;

            /* JADX WARN: Illegal instructions before constructor call */
            public e(C8313k3 c8313k3) {
                FrameLayout frameLayout = c8313k3.f44962a;
                C5207g.m11110e(frameLayout, "binding.root");
                super(frameLayout);
                this.f24511u = c8313k3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$f */
        public static final class f extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8363t3 f24512u;

            /* JADX WARN: Illegal instructions before constructor call */
            public f(C8363t3 c8363t3) {
                ConstraintLayout constraintLayout = c8363t3.f45288a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f24512u = c8363t3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$g */
        public static final class g extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8295h3 f24513u;

            /* JADX WARN: Illegal instructions before constructor call */
            public g(C8295h3 c8295h3) {
                FrameLayout frameLayout;
                int i10 = c8295h3.f44851a;
                ViewGroup viewGroup = c8295h3.f44856f;
                switch (i10) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        frameLayout = (FrameLayout) viewGroup;
                        break;
                    default:
                        frameLayout = (FrameLayout) viewGroup;
                        break;
                }
                C5207g.m11110e(frameLayout, "binding.root");
                super(frameLayout);
                this.f24513u = c8295h3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$h */
        public static final class h extends AbstractC3740b {
            /* JADX WARN: Illegal instructions before constructor call */
            public h(C8259b3 c8259b3) {
                LinearLayout linearLayout = (LinearLayout) c8259b3.f44618c;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$i */
        public static final class i extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8253a3 f24514u;

            /* JADX WARN: Illegal instructions before constructor call */
            public i(C8253a3 c8253a3) {
                LinearLayout linearLayout = (LinearLayout) c8253a3.f44570b;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f24514u = c8253a3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$j */
        public static final class j extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8348q3 f24515u;

            /* JADX WARN: Illegal instructions before constructor call */
            public j(C8348q3 c8348q3) {
                LinearLayout linearLayout = c8348q3.f45176b;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f24515u = c8348q3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$k */
        public static final class k extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8368u3 f24516u;

            /* JADX WARN: Illegal instructions before constructor call */
            public k(C8368u3 c8368u3) {
                ConstraintLayout constraintLayout = c8368u3.f45317a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f24516u = c8368u3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$l */
        public static final class l extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8343p3 f24517u;

            /* JADX WARN: Illegal instructions before constructor call */
            public l(C8343p3 c8343p3) {
                LinearLayout linearLayout = c8343p3.f45148a;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f24517u = c8343p3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$m */
        public static final class m extends AbstractC3740b {
            /* JADX WARN: Illegal instructions before constructor call */
            public m(C8324m2 c8324m2) {
                ConstraintLayout constraintLayoutM16405b = c8324m2.m16405b();
                C5207g.m11110e(constraintLayoutM16405b, "binding.root");
                super(constraintLayoutM16405b);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$n */
        public static final class n extends AbstractC3740b {

            /* JADX INFO: renamed from: u */
            public final C8330n2 f24518u;

            /* JADX WARN: Illegal instructions before constructor call */
            public n(C8330n2 c8330n2) {
                TextInputLayout textInputLayout = (TextInputLayout) c8330n2.f45085a;
                C5207g.m11110e(textInputLayout, "binding.root");
                super(textInputLayout);
                this.f24518u = c8330n2;
            }

            /* JADX INFO: renamed from: s */
            public final void m9927s(String str) {
                C5207g.m11111f(str, "query");
                if (!C7661i.m15250P2(str)) {
                    ((TextInputEditText) this.f24518u.f45086b).setText(str);
                }
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$b$o */
        public static final class o extends AbstractC3740b {

            /* JADX INFO: renamed from: w */
            public static final /* synthetic */ int f24519w = 0;

            /* JADX INFO: renamed from: u */
            public final C8330n2 f24520u;

            /* JADX INFO: renamed from: v */
            public final C10374c0 f24521v;

            /* JADX WARN: Illegal instructions before constructor call */
            public o(C8330n2 c8330n2, InterfaceC10396x interfaceC10396x) {
                C5207g.m11111f(interfaceC10396x, "libraryInteraction");
                RecyclerView recyclerView = (RecyclerView) c8330n2.f45085a;
                C5207g.m11110e(recyclerView, "binding.root");
                super(recyclerView);
                this.f24520u = c8330n2;
                this.f24521v = new C10374c0(interfaceC10396x);
                RecyclerView recyclerView2 = (RecyclerView) c8330n2.f45086b;
                recyclerView.getContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager(0));
                while (recyclerView2.getItemDecorationCount() > 0) {
                    recyclerView2.m4193b0();
                }
                List<Integer> list = C6716m.f37937a;
                recyclerView2.m4199g(new C8045d((int) C6716m.m13316a(16)));
                RecyclerView.AbstractC1117j itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    return;
                }
                itemAnimator.f7080f = 0L;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: s */
            public final void m9928s(List<C6336e> list) {
                C5207g.m11111f(list, "tabs");
                RecyclerView recyclerView = (RecyclerView) this.f24520u.f45086b;
                C10374c0 c10374c0 = this.f24521v;
                recyclerView.m4214o0(c10374c0, false);
                c10374c0.m4529q(null);
                c10374c0.f7471d.m4439b((List<T>) list, new RunnableC5682t(list, 18, this));
            }
        }

        public AbstractC3740b(ViewGroup viewGroup) {
            super(viewGroup);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$c */
    public static final class C3741c {

        /* JADX INFO: renamed from: a */
        public final C6332a f24522a;

        /* JADX INFO: renamed from: b */
        public final LibraryItemCounter f24523b;

        /* JADX INFO: renamed from: c */
        public final boolean f24524c;

        /* JADX INFO: renamed from: d */
        public final boolean f24525d;

        /* JADX INFO: renamed from: e */
        public final boolean f24526e;

        /* JADX INFO: renamed from: f */
        public final boolean f24527f;

        /* JADX INFO: renamed from: g */
        public final boolean f24528g;

        public C3741c(C6332a c6332a, LibraryItemCounter libraryItemCounter, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            this.f24522a = c6332a;
            this.f24523b = libraryItemCounter;
            this.f24524c = z10;
            this.f24525d = z11;
            this.f24526e = z12;
            this.f24527f = z13;
            this.f24528g = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3741c)) {
                return false;
            }
            C3741c c3741c = (C3741c) obj;
            return C5207g.m11106a(this.f24522a, c3741c.f24522a) && C5207g.m11106a(this.f24523b, c3741c.f24523b) && this.f24524c == c3741c.f24524c && this.f24525d == c3741c.f24525d && this.f24526e == c3741c.f24526e && this.f24527f == c3741c.f24527f && this.f24528g == c3741c.f24528g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10, types: [int] */
        /* JADX WARN: Type inference failed for: r1v12, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9 */
        public final int hashCode() {
            int iHashCode = (this.f24523b.hashCode() + (this.f24522a.hashCode() * 31)) * 31;
            ?? r10 = 1;
            boolean z10 = this.f24524c;
            ?? r11 = z10;
            if (z10) {
                r11 = 1;
            }
            int i10 = (iHashCode + r11) * 31;
            boolean z11 = this.f24525d;
            ?? r12 = z11;
            if (z11) {
                r12 = 1;
            }
            int i11 = (i10 + r12) * 31;
            boolean z12 = this.f24526e;
            ?? r13 = z12;
            if (z12) {
                r13 = 1;
            }
            int i12 = (i11 + r13) * 31;
            boolean z13 = this.f24527f;
            ?? r14 = z13;
            if (z13) {
                r14 = 1;
            }
            int i13 = (i12 + r14) * 31;
            boolean z14 = this.f24528g;
            if (!z14) {
                r10 = z14;
            }
            return i13 + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CourseInformation(course=");
            sb2.append(this.f24522a);
            sb2.append(", counter=");
            sb2.append(this.f24523b);
            sb2.append(", isAddedToContinueStudying=");
            sb2.append(this.f24524c);
            sb2.append(", isDownloaded=");
            sb2.append(this.f24525d);
            sb2.append(", isDownloading=");
            sb2.append(this.f24526e);
            sb2.append(", isBuyingCourse=");
            sb2.append(this.f24527f);
            sb2.append(", isExpanded=");
            return C0166e.m769p(sb2, this.f24528g, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$d */
    public static final class C3742d extends C1162m.e<AbstractC3739a> {
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
        
            if (((com.lingq.p055ui.home.library.CollectionsAdapter.AbstractC3739a.b) r5).f24484a == ((com.lingq.p055ui.home.library.CollectionsAdapter.AbstractC3739a.b) r6).f24484a) goto L54;
         */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo480a(AbstractC3739a abstractC3739a, AbstractC3739a abstractC3739a2) {
            AbstractC3739a abstractC3739a3 = abstractC3739a;
            AbstractC3739a abstractC3739a4 = abstractC3739a2;
            if (abstractC3739a3 instanceof AbstractC3739a.j) {
                if (abstractC3739a4 instanceof AbstractC3739a.j) {
                    return C5207g.m11106a(abstractC3739a3, abstractC3739a4);
                }
            } else if (abstractC3739a3 instanceof AbstractC3739a.a) {
                if (abstractC3739a4 instanceof AbstractC3739a.a) {
                    return C5207g.m11106a(abstractC3739a3, abstractC3739a4);
                }
            } else if (abstractC3739a3 instanceof AbstractC3739a.c) {
                if (abstractC3739a4 instanceof AbstractC3739a.c) {
                    AbstractC3739a.c cVar = (AbstractC3739a.c) abstractC3739a3;
                    AbstractC3739a.c cVar2 = (AbstractC3739a.c) abstractC3739a4;
                    if (C5207g.m11106a(cVar.f24485a, cVar2.f24485a) && C5207g.m11106a(cVar.f24486b, cVar2.f24486b)) {
                        return true;
                    }
                }
            } else if (abstractC3739a3 instanceof AbstractC3739a.e) {
                if (abstractC3739a4 instanceof AbstractC3739a.e) {
                    return C5207g.m11106a(abstractC3739a3, abstractC3739a4);
                }
            } else {
                if (abstractC3739a3 instanceof AbstractC3739a.l) {
                    return abstractC3739a4 instanceof AbstractC3739a.l;
                }
                if (abstractC3739a3 instanceof AbstractC3739a.i) {
                    if (abstractC3739a4 instanceof AbstractC3739a.i) {
                        return C5207g.m11106a(((AbstractC3739a.i) abstractC3739a3).f24495a, ((AbstractC3739a.i) abstractC3739a4).f24495a);
                    }
                } else if (abstractC3739a3 instanceof AbstractC3739a.h) {
                    if (abstractC3739a4 instanceof AbstractC3739a.h) {
                        return C5207g.m11106a(abstractC3739a3, abstractC3739a4);
                    }
                } else {
                    if (C5207g.m11106a(abstractC3739a3, AbstractC3739a.k.f24502a)) {
                        return abstractC3739a4 instanceof AbstractC3739a.k;
                    }
                    if (C5207g.m11106a(abstractC3739a3, AbstractC3739a.f.f24489a)) {
                        return abstractC3739a4 instanceof AbstractC3739a.f;
                    }
                    if (C5207g.m11106a(abstractC3739a3, AbstractC3739a.d.f24487a)) {
                        return abstractC3739a4 instanceof AbstractC3739a.d;
                    }
                    if (!(abstractC3739a3 instanceof AbstractC3739a.b)) {
                        if (C5207g.m11106a(abstractC3739a3, AbstractC3739a.g.f24490a)) {
                            return abstractC3739a4 instanceof AbstractC3739a.g;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (abstractC3739a4 instanceof AbstractC3739a.b) {
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (((com.lingq.p055ui.home.library.CollectionsAdapter.AbstractC3739a.a) r6).f24479a.f36595a == ((com.lingq.p055ui.home.library.CollectionsAdapter.AbstractC3739a.a) r7).f24479a.f36595a) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (((com.lingq.p055ui.home.library.CollectionsAdapter.AbstractC3739a.j) r6).f24496a.f36595a == ((com.lingq.p055ui.home.library.CollectionsAdapter.AbstractC3739a.j) r7).f24496a.f36595a) goto L19;
         */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo481b(AbstractC3739a abstractC3739a, AbstractC3739a abstractC3739a2) {
            AbstractC3739a abstractC3739a3 = abstractC3739a;
            AbstractC3739a abstractC3739a4 = abstractC3739a2;
            if (abstractC3739a3 instanceof AbstractC3739a.j) {
                if (abstractC3739a4 instanceof AbstractC3739a.j) {
                }
                return false;
            }
            if (abstractC3739a3 instanceof AbstractC3739a.a) {
                if (abstractC3739a4 instanceof AbstractC3739a.a) {
                }
                return false;
            }
            if (abstractC3739a3.getClass() == abstractC3739a4.getClass()) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.CollectionsAdapter$e */
    public /* synthetic */ class C3743e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24529a;

        static {
            int[] iArr = new int[InnerListLayout.values().length];
            try {
                iArr[InnerListLayout.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InnerListLayout.VerticalFullWidth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InnerListLayout.VerticalGrid.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24529a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsAdapter(InnerListLayout innerListLayout, InterfaceC10396x interfaceC10396x) {
        super(new C3742d());
        C5207g.m11111f(innerListLayout, "innerListLayout");
        C5207g.m11111f(interfaceC10396x, "libraryInteraction");
        this.f24477e = innerListLayout;
        this.f24478f = interfaceC10396x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC3739a abstractC3739aM4528p = m4528p(i10);
        if (abstractC3739aM4528p instanceof AbstractC3739a.i) {
            return CollectionsListItemType.HeaderSelectable.ordinal();
        }
        if (abstractC3739aM4528p instanceof AbstractC3739a.l) {
            return CollectionsListItemType.Search.ordinal();
        }
        if (abstractC3739aM4528p instanceof AbstractC3739a.h) {
            return CollectionsListItemType.Filter.ordinal();
        }
        if (abstractC3739aM4528p instanceof AbstractC3739a.b) {
            return CollectionsListItemType.CourseFilter.ordinal();
        }
        if (abstractC3739aM4528p instanceof AbstractC3739a.c) {
            return CollectionsListItemType.CourseHeader.ordinal();
        }
        if (abstractC3739aM4528p instanceof AbstractC3739a.e) {
            return CollectionsListItemType.CourseInfo.ordinal();
        }
        if (abstractC3739aM4528p instanceof AbstractC3739a.j) {
            return CollectionsListItemType.Lesson.ordinal();
        }
        if (abstractC3739aM4528p instanceof AbstractC3739a.a) {
            return CollectionsListItemType.Course.ordinal();
        }
        if (C5207g.m11106a(abstractC3739aM4528p, AbstractC3739a.k.f24502a)) {
            return CollectionsListItemType.LessonLoading.ordinal();
        }
        if (C5207g.m11106a(abstractC3739aM4528p, AbstractC3739a.f.f24489a)) {
            return CollectionsListItemType.CourseLoading.ordinal();
        }
        if (C5207g.m11106a(abstractC3739aM4528p, AbstractC3739a.d.f24487a)) {
            return CollectionsListItemType.CourseHeaderLoading.ordinal();
        }
        if (C5207g.m11106a(abstractC3739aM4528p, AbstractC3739a.g.f24490a)) {
            return CollectionsListItemType.Empty.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:151:0x045f  */
    /* JADX WARN: Code duplicated, block: B:201:0x067b  */
    /* JADX WARN: Code duplicated, block: B:204:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:205:0x06be  */
    /* JADX WARN: Code duplicated, block: B:208:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:209:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:212:0x06df  */
    /* JADX WARN: Code duplicated, block: B:216:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:218:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:219:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:221:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:222:0x0702  */
    /* JADX WARN: Code duplicated, block: B:224:0x070c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0720  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        final CollectionsAdapter collectionsAdapter;
        int i11;
        long jIntValue;
        int i12;
        int iIntValue;
        int i13;
        int i14;
        int i15;
        ImageView imageView;
        boolean z10;
        CircularProgressIndicator circularProgressIndicator;
        boolean z11;
        int iIntValue2;
        Float f3;
        LibraryItemCounter libraryItemCounter;
        AbstractC3739a.j jVar;
        int i16;
        int i17;
        long jIntValue2;
        String str;
        Float f10;
        int i18;
        long jIntValue3;
        final AbstractC3740b abstractC3740b = (AbstractC3740b) abstractC1109b0;
        if (abstractC3740b instanceof AbstractC3740b.l) {
            AbstractC3739a abstractC3739aM4528p = m4528p(i10);
            C5207g.m11109d(abstractC3739aM4528p, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Lesson");
            final AbstractC3739a.j jVar2 = (AbstractC3739a.j) abstractC3739aM4528p;
            AbstractC3740b.l lVar = (AbstractC3740b.l) abstractC3740b;
            C6332a c6332a = jVar2.f24496a;
            C5207g.m11111f(c6332a, "lesson");
            ImageSize imageSize = ImageSize.Medium;
            String str2 = c6332a.f36602h;
            String str3 = c6332a.f36581H;
            String strM10423B = C4924a.m10423B(str3, str2, imageSize);
            C8343p3 c8343p3 = lVar.f24517u;
            if (str3 != null) {
                c8343p3.f45151d.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                c8343p3.f45151d.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            RelativeLayout relativeLayout = c8343p3.f45158k;
            List<Integer> list = C6716m.f37937a;
            View view = lVar.f7054a;
            Context context = view.getContext();
            C5207g.m11110e(context, "itemView.context");
            relativeLayout.setBackgroundColor(C6716m.m13333r(R.attr.loadingColor, context));
            ComponentCallbacks2C2080b.m6238e(view.getContext()).m6254c().m6247G(strM10423B).m6251z(new C3810d(strM10423B, c8343p3)).m6245E(c8343p3.f45151d);
            ComponentCallbacks2C2090l componentCallbacks2C2090lM6238e = ComponentCallbacks2C2080b.m6238e(view.getContext());
            componentCallbacks2C2090lM6238e.getClass();
            ImageView imageView2 = c8343p3.f45150c;
            componentCallbacks2C2090lM6238e.m6256f(new ComponentCallbacks2C2090l.b(imageView2));
            String str4 = c6332a.f36582I;
            if (str4 != null) {
                C4924a.m10436O(imageView2, str4, 4.0f, null, 12);
                C4924a.m10457e0(imageView2);
            } else {
                C4924a.m10422A(imageView2);
            }
            c8343p3.f45155h.setText(c6332a.f36599e);
            LinearProgressIndicator linearProgressIndicator = c8343p3.f45159l;
            linearProgressIndicator.m4935d();
            String str5 = c6332a.f36601g;
            boolean zM11106a = C5207g.m11106a(str5, "external");
            TextView textView = c8343p3.f45153f;
            if (zM11106a) {
                C4924a.m10442U(linearProgressIndicator);
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_import_s, 0, 0, 0);
                LessonMediaSource lessonMediaSource = c6332a.f36612r;
                textView.setText(lessonMediaSource != null ? lessonMediaSource.f22000b : null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                textView.setText(c6332a.f36608n);
            }
            boolean zM11106a2 = C5207g.m11106a(c6332a.f36611q, Boolean.TRUE);
            LibraryItemCounter libraryItemCounter2 = jVar2.f24497b;
            if (zM11106a2) {
                linearProgressIndicator.mo4934c(100, false);
            } else {
                linearProgressIndicator.mo4934c((libraryItemCounter2 == null || (f10 = libraryItemCounter2.f22006c) == null) ? 0 : (int) f10.floatValue(), false);
            }
            c8343p3.f45154g.setText(String.valueOf(libraryItemCounter2 != null ? libraryItemCounter2.f22014k : 0));
            c8343p3.f45157j.setText(String.valueOf(libraryItemCounter2 != null ? libraryItemCounter2.f22013j : 0));
            c8343p3.f45156i.setText(String.valueOf(libraryItemCounter2 != null ? libraryItemCounter2.f22015l : 0));
            Integer num = c6332a.f36603i;
            if (num != null) {
                jIntValue3 = num.intValue();
                i18 = 1000;
            } else {
                i18 = 1000;
                jIntValue3 = 0;
            }
            String strM13317b = C6716m.m13317b(((long) i18) * jIntValue3);
            TextView textView2 = c8343p3.f45152e;
            C5207g.m11110e(textView2, "tvAudio");
            C4924a.m10457e0(textView2);
            if (!C7661i.m15250P2(strM13317b)) {
                textView2.setText(strM13317b);
                C4924a.m10457e0(textView2);
            } else if (C5207g.m11106a(str5, "shared") || C5207g.m11106a(str5, "private")) {
                textView2.setText("--:--");
                C4924a.m10457e0(textView2);
            } else {
                C4924a.m10442U(textView2);
            }
            c8343p3.f45149b.setOnClickListener(new ViewOnClickListenerC10369a(abstractC3740b, this, jVar2, 0));
            c8343p3.f45149b.setOnLongClickListener(new View.OnLongClickListener() { // from class: yi.f
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    CollectionsAdapter.AbstractC3740b abstractC3740b2 = abstractC3740b;
                    C5207g.m11111f(abstractC3740b2, "$holder");
                    CollectionsAdapter collectionsAdapter2 = this;
                    C5207g.m11111f(collectionsAdapter2, "this$0");
                    CollectionsAdapter.AbstractC3739a.j jVar3 = jVar2;
                    C5207g.m11111f(jVar3, "$item");
                    int iM4241d = ((CollectionsAdapter.AbstractC3740b.l) abstractC3740b2).m4241d();
                    if (iM4241d != -1) {
                        CollectionsAdapter.AbstractC3739a abstractC3739aM4528p2 = collectionsAdapter2.m4528p(iM4241d);
                        C5207g.m11109d(abstractC3739aM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Lesson");
                        CollectionsAdapter.AbstractC3739a.j jVar4 = (CollectionsAdapter.AbstractC3739a.j) abstractC3739aM4528p2;
                        C5207g.m11110e(view2, "it");
                        collectionsAdapter2.f24478f.mo9803c(view2, jVar4.f24496a, jVar4.f24497b, jVar3.f24501f);
                    }
                    return true;
                }
            });
            return;
        }
        if (abstractC3740b instanceof AbstractC3740b.k) {
            AbstractC3739a abstractC3739aM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC3739aM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Lesson");
            AbstractC3739a.j jVar3 = (AbstractC3739a.j) abstractC3739aM4528p2;
            AbstractC3740b.k kVar = (AbstractC3740b.k) abstractC3740b;
            C6332a c6332a2 = jVar3.f24496a;
            C5207g.m11111f(c6332a2, "lesson");
            String strM10423B2 = C4924a.m10423B(c6332a2.f36581H, c6332a2.f36602h, ImageSize.Medium);
            C8368u3 c8368u3 = kVar.f24516u;
            c8368u3.f45320d.setScaleType(ImageView.ScaleType.CENTER_CROP);
            View view2 = kVar.f7054a;
            ComponentCallbacks2C2090l componentCallbacks2C2090lM6238e2 = ComponentCallbacks2C2080b.m6238e(view2.getContext());
            ImageView imageView3 = c8368u3.f45320d;
            componentCallbacks2C2090lM6238e2.getClass();
            componentCallbacks2C2090lM6238e2.m6256f(new ComponentCallbacks2C2090l.b(imageView3));
            C4924a.m10438Q(imageView3, strM10423B2, 0.0f, 0, 0, 14);
            c8368u3.f45325i.setText(c6332a2.f36599e);
            boolean z12 = jVar3.f24500e;
            TextView textView3 = c8368u3.f45323g;
            if (z12) {
                textView3.setText(c6332a2.f36608n);
            } else {
                C5207g.m11110e(textView3, "tvCourse");
                C4924a.m10442U(textView3);
            }
            boolean zM11106a3 = C5207g.m11106a(c6332a2.f36611q, Boolean.TRUE);
            LibraryItemCounter libraryItemCounter3 = jVar3.f24497b;
            LinearProgressIndicator linearProgressIndicator2 = c8368u3.f45335s;
            if (zM11106a3) {
                linearProgressIndicator2.mo4934c(100, false);
            } else {
                linearProgressIndicator2.mo4934c((libraryItemCounter3 == null || (f3 = libraryItemCounter3.f22006c) == null) ? 0 : (int) f3.floatValue(), false);
            }
            if ((libraryItemCounter3 != null ? libraryItemCounter3.f22006c : null) == null) {
                linearProgressIndicator2.m4933b();
            } else {
                linearProgressIndicator2.m4935d();
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(libraryItemCounter3 != null ? libraryItemCounter3.f22013j : 0);
            objArr[1] = Integer.valueOf(C8573r0.m16708X0(c6332a2.f36587N));
            c8368u3.f45328l.setText(C0141b.m613i(objArr, 2, locale, "%d (%d%%)", "format(locale, format, *args)"));
            c8368u3.f45326j.setText(String.valueOf(libraryItemCounter3 != null ? libraryItemCounter3.f22015l : 0));
            boolean z13 = (libraryItemCounter3 == null || libraryItemCounter3.f22009f) ? false : true;
            RelativeLayout relativeLayout2 = c8368u3.f45332p;
            RelativeLayout relativeLayout3 = c8368u3.f45329m;
            RelativeLayout relativeLayout4 = c8368u3.f45330n;
            TextView textView4 = c8368u3.f45327k;
            if (!z13 || c6332a2.f36594U <= 0) {
                libraryItemCounter = libraryItemCounter3;
                C5207g.m11110e(textView4, "tvPremium");
                C4924a.m10442U(textView4);
                C5207g.m11110e(relativeLayout4, "viewDownload");
                C4924a.m10457e0(relativeLayout4);
                C5207g.m11110e(relativeLayout3, "viewAdded");
                C4924a.m10457e0(relativeLayout3);
                C5207g.m11110e(relativeLayout2, "viewLike");
                C4924a.m10457e0(relativeLayout2);
            } else {
                C5207g.m11110e(textView4, "tvPremium");
                C4924a.m10457e0(textView4);
                C5207g.m11110e(relativeLayout4, "viewDownload");
                C4924a.m10442U(relativeLayout4);
                C5207g.m11110e(relativeLayout3, "viewAdded");
                C4924a.m10442U(relativeLayout3);
                C5207g.m11110e(relativeLayout2, "viewLike");
                C4924a.m10442U(relativeLayout2);
                String string = view2.getContext().getString(R.string.ui_points);
                C5207g.m11110e(string, "itemView.context.getString(R.string.ui_points)");
                C0009a.m32u(new Object[]{Integer.valueOf(c6332a2.f36594U)}, 1, locale, string, "format(locale, format, *args)", textView4);
                libraryItemCounter = libraryItemCounter3;
            }
            boolean z14 = libraryItemCounter != null && libraryItemCounter.f22005b;
            ImageView imageView4 = c8368u3.f45321e;
            if (z14) {
                Context context2 = view2.getContext();
                Object obj = C7472a.f41322a;
                imageView4.setImageDrawable(C7472a.c.m14849b(context2, R.drawable.ic_heart_filled_s));
            } else {
                Context context3 = view2.getContext();
                Object obj2 = C7472a.f41322a;
                imageView4.setImageDrawable(C7472a.c.m14849b(context3, R.drawable.ic_heart_s));
            }
            boolean z15 = libraryItemCounter != null && libraryItemCounter.f22009f;
            ImageView imageView5 = c8368u3.f45318b;
            if (z15) {
                imageView5.setImageDrawable(C7472a.c.m14849b(view2.getContext(), R.drawable.ic_check));
                List<Integer> list2 = C6716m.f37937a;
                Context context4 = view2.getContext();
                C5207g.m11110e(context4, "itemView.context");
                imageView5.setColorFilter(C6716m.m13333r(R.attr.greenTint, context4));
            } else {
                imageView5.setImageDrawable(C7472a.c.m14849b(view2.getContext(), R.drawable.ic_plus_s));
                List<Integer> list3 = C6716m.f37937a;
                Context context5 = view2.getContext();
                C5207g.m11110e(context5, "itemView.context");
                imageView5.setColorFilter(C6716m.m13333r(R.attr.primaryTextColor, context5));
            }
            boolean zM11106a4 = C5207g.m11106a(c6332a2.f36601g, "external");
            TextView textView5 = c8368u3.f45324h;
            ImageView imageView6 = c8368u3.f45319c;
            if (zM11106a4) {
                C5207g.m11110e(textView5, "tvImport");
                C4924a.m10457e0(textView5);
                LessonMediaSource lessonMediaSource2 = c6332a2.f36612r;
                if (lessonMediaSource2 == null || (str = lessonMediaSource2.f22000b) == null) {
                    str = "";
                }
                textView5.setText(str);
                C5207g.m11110e(imageView5, "ivAdded");
                C4924a.m10422A(imageView5);
                C5207g.m11110e(imageView6, "ivDownload");
                C4924a.m10422A(imageView6);
                C5207g.m11110e(imageView4, "ivLike");
                C4924a.m10422A(imageView4);
                jVar = jVar3;
            } else {
                C5207g.m11110e(textView5, "tvImport");
                C4924a.m10442U(textView5);
                C5207g.m11110e(imageView5, "ivAdded");
                C4924a.m10457e0(imageView5);
                C5207g.m11110e(imageView6, "ivDownload");
                C4924a.m10457e0(imageView6);
                C5207g.m11110e(imageView4, "ivLike");
                C4924a.m10457e0(imageView4);
                jVar = jVar3;
                C6333b c6333b = jVar.f24498c;
                C6334c c6334c = jVar.f24499d;
                CircularProgressIndicator circularProgressIndicator2 = c8368u3.f45334r;
                if (c6333b == null && c6334c == null) {
                    C4924a.m10457e0(imageView6);
                    C5207g.m11110e(circularProgressIndicator2, "viewProgress");
                    C4924a.m10442U(circularProgressIndicator2);
                    List<Integer> list4 = C6716m.f37937a;
                    Context context6 = view2.getContext();
                    C5207g.m11110e(context6, "itemView.context");
                    imageView6.setColorFilter(C6716m.m13333r(R.attr.primaryTextColor, context6));
                } else {
                    if ((c6333b == null || c6333b.f36622b) ? false : true) {
                        C4924a.m10442U(imageView6);
                        circularProgressIndicator2.m4935d();
                    } else {
                        if (!((c6334c == null || c6334c.f36625b) ? false : true) || (i16 = c6334c.f36626c) <= 0 || i16 >= 100) {
                            if (c6334c != null && c6334c.f36625b) {
                                C4924a.m10457e0(imageView6);
                                C5207g.m11110e(circularProgressIndicator2, "viewProgress");
                                C4924a.m10442U(circularProgressIndicator2);
                                List<Integer> list5 = C6716m.f37937a;
                                Context context7 = view2.getContext();
                                C5207g.m11110e(context7, "itemView.context");
                                imageView6.setColorFilter(C6716m.m13333r(R.attr.greenTint, context7));
                            } else {
                                C4924a.m10457e0(imageView6);
                                C5207g.m11110e(circularProgressIndicator2, "viewProgress");
                                C4924a.m10442U(circularProgressIndicator2);
                                List<Integer> list6 = C6716m.f37937a;
                                Context context8 = view2.getContext();
                                C5207g.m11110e(context8, "itemView.context");
                                imageView6.setColorFilter(C6716m.m13333r(R.attr.primaryTextColor, context8));
                            }
                        } else {
                            C4924a.m10442U(imageView6);
                            circularProgressIndicator2.m4935d();
                        }
                    }
                }
            }
            List<Integer> list7 = C6716m.f37937a;
            Integer num2 = c6332a2.f36603i;
            if (num2 != null) {
                jIntValue2 = num2.intValue();
                i17 = 1000;
            } else {
                i17 = 1000;
                jIntValue2 = 0;
            }
            String strM13317b2 = C6716m.m13317b(jIntValue2 * ((long) i17));
            if (C7661i.m15250P2(strM13317b2)) {
                TextView textView6 = c8368u3.f45322f;
                C5207g.m11110e(textView6, "tvAudio");
                C4924a.m10442U(textView6);
            } else {
                c8368u3.f45322f.setText(strM13317b2);
            }
            collectionsAdapter = this;
            c8368u3.f45331o.setOnClickListener(new ViewOnClickListenerC10371b(1, abstractC3740b, collectionsAdapter, jVar));
            c8368u3.f45333q.setOnClickListener(new ViewOnClickListenerC9028l(abstractC3740b, collectionsAdapter, jVar, 2));
            c8368u3.f45330n.setOnClickListener(new ViewOnClickListenerC9029m(collectionsAdapter, 3, jVar));
            relativeLayout2.setOnClickListener(new ViewOnClickListenerC9734i(collectionsAdapter, 1, jVar));
            c8368u3.f45329m.setOnClickListener(new ViewOnClickListenerC6464i(collectionsAdapter, 6, jVar));
            c8368u3.f45327k.setOnClickListener(new ViewOnClickListenerC9466e(collectionsAdapter, 3, jVar));
        } else {
            collectionsAdapter = this;
            if (!(abstractC3740b instanceof AbstractC3740b.g)) {
                if (abstractC3740b instanceof AbstractC3740b.f) {
                    AbstractC3739a abstractC3739aM4528p3 = collectionsAdapter.m4528p(i10);
                    C5207g.m11109d(abstractC3739aM4528p3, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Course");
                    AbstractC3739a.a aVar = (AbstractC3739a.a) abstractC3739aM4528p3;
                    AbstractC3740b.f fVar = (AbstractC3740b.f) abstractC3740b;
                    C6332a c6332a3 = aVar.f24479a;
                    C5207g.m11111f(c6332a3, "course");
                    String strM10423B3 = C4924a.m10423B(c6332a3.f36581H, c6332a3.f36602h, ImageSize.Medium);
                    C8363t3 c8363t3 = fVar.f24512u;
                    c8363t3.f45289b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    View view3 = fVar.f7054a;
                    ComponentCallbacks2C2090l componentCallbacks2C2090lM6238e3 = ComponentCallbacks2C2080b.m6238e(view3.getContext());
                    ImageView imageView7 = c8363t3.f45289b;
                    componentCallbacks2C2090lM6238e3.getClass();
                    componentCallbacks2C2090lM6238e3.m6256f(new ComponentCallbacks2C2090l.b(imageView7));
                    C4924a.m10438Q(imageView7, strM10423B3, 0.0f, 0, 12, 6);
                    c8363t3.f45292e.setText(c6332a3.f36599e);
                    Resources resources = view3.getContext().getResources();
                    LibraryItemCounter libraryItemCounter4 = aVar.f24480b;
                    Integer numValueOf = c6332a3.f36590Q;
                    if (libraryItemCounter4 == null) {
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            i12 = 1;
                            iIntValue = 0;
                        }
                        Object[] objArr2 = new Object[i12];
                        if (libraryItemCounter4 != null) {
                            numValueOf = Integer.valueOf(libraryItemCounter4.f22012i);
                        }
                        objArr2[0] = numValueOf;
                        c8363t3.f45291d.setText(resources.getQuantityString(R.plurals.lingq_lessons_count_Lessons, iIntValue, objArr2));
                        Locale locale2 = Locale.US;
                        Object[] objArr3 = new Object[i12];
                        objArr3[0] = Integer.valueOf(C8573r0.m16708X0(c6332a3.f36587N));
                        String str6 = String.format(locale2, "· %d%%", Arrays.copyOf(objArr3, i12));
                        C5207g.m11110e(str6, "format(locale, format, *args)");
                        c8363t3.f45293f.setText(Html.fromHtml(str6));
                        if (libraryItemCounter4 != null) {
                            i13 = libraryItemCounter4.f22013j;
                        } else {
                            i13 = 0;
                        }
                        c8363t3.f45295h.setText(String.valueOf(i13));
                        if (libraryItemCounter4 != null) {
                            i14 = libraryItemCounter4.f22015l;
                        } else {
                            i14 = 0;
                        }
                        c8363t3.f45294g.setText(String.valueOf(i14));
                        i15 = c6332a3.f36594U;
                        imageView = c8363t3.f45290c;
                        if (i15 <= 0) {
                            z10 = aVar.f24482d;
                            circularProgressIndicator = c8363t3.f45299l;
                            if (z10) {
                                circularProgressIndicator.m4935d();
                                C5207g.m11110e(imageView, "ivDownload");
                                C4924a.m10442U(imageView);
                            } else {
                                C5207g.m11110e(circularProgressIndicator, "viewProgress");
                                C4924a.m10442U(circularProgressIndicator);
                                if (aVar.f24481c) {
                                    List<Integer> list8 = C6716m.f37937a;
                                    Context context9 = view3.getContext();
                                    C5207g.m11110e(context9, "itemView.context");
                                    imageView.setColorFilter(C6716m.m13333r(R.attr.greenTint, context9));
                                } else {
                                    List<Integer> list9 = C6716m.f37937a;
                                    Context context10 = view3.getContext();
                                    C5207g.m11110e(context10, "itemView.context");
                                    imageView.setColorFilter(C6716m.m13333r(R.attr.primaryTextColor, context10));
                                }
                                C9072e c9072e = C9072e.f47360a;
                            }
                        } else {
                            if (libraryItemCounter4 != null || libraryItemCounter4.f22016m) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                C5207g.m11110e(imageView, "ivDownload");
                                C4924a.m10442U(imageView);
                            } else {
                                z10 = aVar.f24482d;
                                circularProgressIndicator = c8363t3.f45299l;
                                if (z10) {
                                    circularProgressIndicator.m4935d();
                                    C5207g.m11110e(imageView, "ivDownload");
                                    C4924a.m10442U(imageView);
                                } else {
                                    C5207g.m11110e(circularProgressIndicator, "viewProgress");
                                    C4924a.m10442U(circularProgressIndicator);
                                    if (aVar.f24481c) {
                                        List<Integer> list10 = C6716m.f37937a;
                                        Context context11 = view3.getContext();
                                        C5207g.m11110e(context11, "itemView.context");
                                        imageView.setColorFilter(C6716m.m13333r(R.attr.greenTint, context11));
                                    } else {
                                        List<Integer> list11 = C6716m.f37937a;
                                        Context context12 = view3.getContext();
                                        C5207g.m11110e(context12, "itemView.context");
                                        imageView.setColorFilter(C6716m.m13333r(R.attr.primaryTextColor, context12));
                                    }
                                    C9072e c9072e2 = C9072e.f47360a;
                                }
                            }
                        }
                        c8363t3.f45296i.setOnClickListener(new ViewOnClickListenerC10371b(0, abstractC3740b, this, aVar));
                        int i19 = 1;
                        c8363t3.f45298k.setOnClickListener(new ViewOnClickListenerC9028l(abstractC3740b, this, aVar, i19));
                        c8363t3.f45297j.setOnClickListener(new ViewOnClickListenerC9029m(abstractC3740b, i19, this));
                        return;
                    }
                    iIntValue = libraryItemCounter4.f22012i;
                    i12 = 1;
                    Object[] objArr4 = new Object[i12];
                    if (libraryItemCounter4 != null) {
                        numValueOf = Integer.valueOf(libraryItemCounter4.f22012i);
                    }
                    objArr4[0] = numValueOf;
                    c8363t3.f45291d.setText(resources.getQuantityString(R.plurals.lingq_lessons_count_Lessons, iIntValue, objArr4));
                    Locale locale3 = Locale.US;
                    Object[] objArr5 = new Object[i12];
                    objArr5[0] = Integer.valueOf(C8573r0.m16708X0(c6332a3.f36587N));
                    String str7 = String.format(locale3, "· %d%%", Arrays.copyOf(objArr5, i12));
                    C5207g.m11110e(str7, "format(locale, format, *args)");
                    c8363t3.f45293f.setText(Html.fromHtml(str7));
                    if (libraryItemCounter4 != null) {
                        i13 = libraryItemCounter4.f22013j;
                    } else {
                        i13 = 0;
                    }
                    c8363t3.f45295h.setText(String.valueOf(i13));
                    if (libraryItemCounter4 != null) {
                        i14 = libraryItemCounter4.f22015l;
                    } else {
                        i14 = 0;
                    }
                    c8363t3.f45294g.setText(String.valueOf(i14));
                    i15 = c6332a3.f36594U;
                    imageView = c8363t3.f45290c;
                    if (i15 <= 0) {
                        z10 = aVar.f24482d;
                        circularProgressIndicator = c8363t3.f45299l;
                        if (z10) {
                            circularProgressIndicator.m4935d();
                            C5207g.m11110e(imageView, "ivDownload");
                            C4924a.m10442U(imageView);
                        } else {
                            C5207g.m11110e(circularProgressIndicator, "viewProgress");
                            C4924a.m10442U(circularProgressIndicator);
                            if (aVar.f24481c) {
                                List<Integer> list12 = C6716m.f37937a;
                                Context context13 = view3.getContext();
                                C5207g.m11110e(context13, "itemView.context");
                                imageView.setColorFilter(C6716m.m13333r(R.attr.greenTint, context13));
                            } else {
                                List<Integer> list13 = C6716m.f37937a;
                                Context context14 = view3.getContext();
                                C5207g.m11110e(context14, "itemView.context");
                                imageView.setColorFilter(C6716m.m13333r(R.attr.primaryTextColor, context14));
                            }
                            C9072e c9072e3 = C9072e.f47360a;
                        }
                    } else {
                        if (libraryItemCounter4 != null) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            C5207g.m11110e(imageView, "ivDownload");
                            C4924a.m10442U(imageView);
                        } else {
                            z10 = aVar.f24482d;
                            circularProgressIndicator = c8363t3.f45299l;
                            if (z10) {
                                circularProgressIndicator.m4935d();
                                C5207g.m11110e(imageView, "ivDownload");
                                C4924a.m10442U(imageView);
                            } else {
                                C5207g.m11110e(circularProgressIndicator, "viewProgress");
                                C4924a.m10442U(circularProgressIndicator);
                                if (aVar.f24481c) {
                                    List<Integer> list14 = C6716m.f37937a;
                                    Context context15 = view3.getContext();
                                    C5207g.m11110e(context15, "itemView.context");
                                    imageView.setColorFilter(C6716m.m13333r(R.attr.greenTint, context15));
                                } else {
                                    List<Integer> list15 = C6716m.f37937a;
                                    Context context16 = view3.getContext();
                                    C5207g.m11110e(context16, "itemView.context");
                                    imageView.setColorFilter(C6716m.m13333r(R.attr.primaryTextColor, context16));
                                }
                                C9072e c9072e4 = C9072e.f47360a;
                            }
                        }
                    }
                    c8363t3.f45296i.setOnClickListener(new ViewOnClickListenerC10371b(0, abstractC3740b, this, aVar));
                    int i110 = 1;
                    c8363t3.f45298k.setOnClickListener(new ViewOnClickListenerC9028l(abstractC3740b, this, aVar, i110));
                    c8363t3.f45297j.setOnClickListener(new ViewOnClickListenerC9029m(abstractC3740b, i110, this));
                    return;
                }
                if (abstractC3740b instanceof AbstractC3740b.c) {
                    AbstractC3739a abstractC3739aM4528p4 = collectionsAdapter.m4528p(i10);
                    C5207g.m11109d(abstractC3739aM4528p4, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.CourseHeader");
                    AbstractC3739a.c cVar = (AbstractC3739a.c) abstractC3739aM4528p4;
                    AbstractC3740b.c cVar2 = (AbstractC3740b.c) abstractC3740b;
                    C6332a c6332a4 = cVar.f24485a;
                    C5207g.m11111f(c6332a4, "course");
                    LibraryItemCounter libraryItemCounter5 = cVar.f24486b;
                    C5207g.m11111f(libraryItemCounter5, "courseCounter");
                    ImageSize imageSize2 = ImageSize.Large;
                    String str8 = c6332a4.f36602h;
                    String str9 = c6332a4.f36581H;
                    String strM10423B4 = C4924a.m10423B(str9, str8, imageSize2);
                    C8377w2 c8377w2 = cVar2.f24506u;
                    if (str9 != null) {
                        c8377w2.f45438b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    } else {
                        c8377w2.f45438b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    }
                    RelativeLayout relativeLayout5 = (RelativeLayout) c8377w2.f45444h;
                    List<Integer> list16 = C6716m.f37937a;
                    View view4 = cVar2.f7054a;
                    Context context17 = view4.getContext();
                    C5207g.m11110e(context17, "itemView.context");
                    relativeLayout5.setBackgroundColor(C6716m.m13333r(R.attr.loadingColor, context17));
                    ComponentCallbacks2C2080b.m6238e(view4.getContext()).m6254c().m6247G(strM10423B4).m6251z(new C3808b(strM10423B4, c8377w2)).m6245E(c8377w2.f45438b);
                    ((TextView) c8377w2.f45440d).setText(c6332a4.f36599e);
                    TextView textView7 = (TextView) c8377w2.f45443g;
                    Resources resources2 = view4.getContext().getResources();
                    int i20 = libraryItemCounter5.f22011h;
                    textView7.setText(resources2.getQuantityString(R.plurals.lingq_likes_count_like, i20, Integer.valueOf(i20)));
                    TextView textView8 = (TextView) c8377w2.f45441e;
                    Resources resources3 = view4.getContext().getResources();
                    int i21 = libraryItemCounter5.f22012i;
                    textView8.setText(resources3.getQuantityString(R.plurals.lingq_lessons_count_Lessons, i21, Integer.valueOf(i21)));
                    Integer num3 = c6332a4.f36603i;
                    if (num3 != null) {
                        jIntValue = num3.intValue();
                        i11 = 1000;
                    } else {
                        i11 = 1000;
                        jIntValue = 0;
                    }
                    String strM13318c = C6716m.m13318c(((long) i11) * jIntValue);
                    boolean zM15250P2 = C7661i.m15250P2(strM13318c);
                    TextView textView9 = c8377w2.f45439c;
                    if (zM15250P2) {
                        textView9.setText("--:--:--");
                    } else {
                        textView9.setText(strM13318c);
                    }
                    ((TextView) c8377w2.f45442f).setText(c6332a4.f36619y);
                    return;
                }
                if (abstractC3740b instanceof AbstractC3740b.d) {
                    AbstractC3739a abstractC3739aM4528p5 = collectionsAdapter.m4528p(i10);
                    C5207g.m11109d(abstractC3739aM4528p5, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.CourseInfo");
                    final AbstractC3739a.e eVar = (AbstractC3739a.e) abstractC3739aM4528p5;
                    AbstractC3740b.d dVar = (AbstractC3740b.d) abstractC3740b;
                    dVar.m9926s(eVar.f24488a);
                    C8307j3 c8307j3 = dVar.f24507u;
                    final int i22 = 0;
                    c8307j3.f44917g.setOnClickListener(new ViewOnClickListenerC10373c(collectionsAdapter, eVar, 0));
                    c8307j3.f44918h.setOnClickListener(new View.OnClickListener(collectionsAdapter) { // from class: yi.d

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ CollectionsAdapter f52139b;

                        {
                            this.f52139b = collectionsAdapter;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            int i23 = i22;
                            CollectionsAdapter.AbstractC3739a.e eVar2 = eVar;
                            CollectionsAdapter collectionsAdapter2 = this.f52139b;
                            switch (i23) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(collectionsAdapter2, "this$0");
                                    C5207g.m11111f(eVar2, "$item");
                                    collectionsAdapter2.f24478f.mo9814n(eVar2.f24488a.f24523b.f22009f);
                                    break;
                                default:
                                    C5207g.m11111f(collectionsAdapter2, "this$0");
                                    C5207g.m11111f(eVar2, "$item");
                                    collectionsAdapter2.f24478f.mo9820t(eVar2.f24488a.f24522a);
                                    break;
                            }
                        }
                    });
                    c8307j3.f44912b.setOnClickListener(new ViewOnClickListenerC10377e(collectionsAdapter, eVar));
                    c8307j3.f44914d.setOnClickListener(new ViewOnClickListenerC9029m(collectionsAdapter, 2, eVar));
                    final int i23 = 1;
                    c8307j3.f44915e.setOnClickListener(new ViewOnClickListenerC10373c(collectionsAdapter, eVar, 1));
                    c8307j3.f44916f.setOnClickListener(new View.OnClickListener(collectionsAdapter) { // from class: yi.d

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ CollectionsAdapter f52139b;

                        {
                            this.f52139b = collectionsAdapter;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            int i24 = i23;
                            CollectionsAdapter.AbstractC3739a.e eVar2 = eVar;
                            CollectionsAdapter collectionsAdapter2 = this.f52139b;
                            switch (i24) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(collectionsAdapter2, "this$0");
                                    C5207g.m11111f(eVar2, "$item");
                                    collectionsAdapter2.f24478f.mo9814n(eVar2.f24488a.f24523b.f22009f);
                                    break;
                                default:
                                    C5207g.m11111f(collectionsAdapter2, "this$0");
                                    C5207g.m11111f(eVar2, "$item");
                                    collectionsAdapter2.f24478f.mo9820t(eVar2.f24488a.f24522a);
                                    break;
                            }
                        }
                    });
                    c8307j3.f44930t.setOnClickListener(new ViewOnClickListenerC10377e(eVar, collectionsAdapter));
                    c8307j3.f44913c.setOnClickListener(new ViewOnClickListenerC10373c(eVar, collectionsAdapter));
                    return;
                }
                if (abstractC3740b instanceof AbstractC3740b.o) {
                    AbstractC3739a abstractC3739aM4528p6 = collectionsAdapter.m4528p(i10);
                    C5207g.m11109d(abstractC3739aM4528p6, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.HeaderSelectable");
                    ((AbstractC3740b.o) abstractC3740b).m9928s(((AbstractC3739a.i) abstractC3739aM4528p6).f24495a);
                    return;
                }
                boolean z16 = abstractC3740b instanceof AbstractC3740b.i;
                View view5 = abstractC3740b.f7054a;
                if (z16) {
                    AbstractC3739a abstractC3739aM4528p7 = collectionsAdapter.m4528p(i10);
                    C5207g.m11109d(abstractC3739aM4528p7, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Filter");
                    AbstractC3739a.h hVar = (AbstractC3739a.h) abstractC3739aM4528p7;
                    if (C5207g.m11106a(hVar.f24494d, LibraryShelfType.Trending.getValue())) {
                        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) ((AbstractC3740b.i) abstractC3740b).f24514u.f44573e;
                        C5207g.m11110e(appCompatSpinner, "holder.binding.spinnerContent");
                        C4924a.m10442U(appCompatSpinner);
                    } else {
                        C8253a3 c8253a3 = ((AbstractC3740b.i) abstractC3740b).f24514u;
                        AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) c8253a3.f44573e;
                        C5207g.m11110e(appCompatSpinner2, "holder.binding.spinnerContent");
                        C4924a.m10457e0(appCompatSpinner2);
                        List<Sort> listM12965a = C6335d.m12965a(hVar.f24491a);
                        ArrayList arrayList = new ArrayList(C9325m.m17681z(listM12965a, 10));
                        Iterator<T> it = listM12965a.iterator();
                        while (it.hasNext()) {
                            arrayList.add(view5.getContext().getString(C4924a.m10465i0((Sort) it.next())));
                        }
                        ArrayAdapter arrayAdapter = new ArrayAdapter(view5.getContext(), R.layout.view_spinner_text, arrayList);
                        arrayAdapter.setDropDownViewResource(R.layout.view_spinner_dropdown_text);
                        ((AppCompatSpinner) c8253a3.f44573e).setAdapter((SpinnerAdapter) arrayAdapter);
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        ((AppCompatSpinner) c8253a3.f44573e).setOnTouchListener(new ViewOnTouchListenerC10379g(0, ref$BooleanRef));
                        AppCompatSpinner appCompatSpinner3 = (AppCompatSpinner) c8253a3.f44573e;
                        C5207g.m11110e(appCompatSpinner3, "holder.binding.spinnerContent");
                        C4924a.m10449a0(appCompatSpinner3, view5.getContext().getString(C4924a.m10465i0(hVar.f24492b)));
                        ((AppCompatSpinner) c8253a3.f44573e).setOnItemSelectedListener(new C3811e(ref$BooleanRef, abstractC3740b, arrayList, collectionsAdapter));
                    }
                    C8253a3 c8253a4 = ((AbstractC3740b.i) abstractC3740b).f24514u;
                    TextView textView10 = c8253a4.f44569a;
                    Pair<LearningLevel, LearningLevel> pair = hVar.f24493c;
                    LearningLevel learningLevel = pair.f38012a;
                    Context context18 = view5.getContext();
                    C5207g.m11110e(context18, "holder.itemView.context");
                    LearningLevel learningLevel2 = pair.f38013b;
                    Context context19 = view5.getContext();
                    C5207g.m11110e(context19, "holder.itemView.context");
                    String str10 = String.format("%s - %s", Arrays.copyOf(new Object[]{C4924a.m10435N(learningLevel, context18), C4924a.m10435N(learningLevel2, context19)}, 2));
                    C5207g.m11110e(str10, "format(format, *args)");
                    textView10.setText(str10);
                    ((LinearLayout) c8253a4.f44572d).setOnClickListener(new ViewOnClickListenerC7718c(12, collectionsAdapter));
                    return;
                }
                if (abstractC3740b instanceof AbstractC3740b.n) {
                    AbstractC3739a abstractC3739aM4528p8 = collectionsAdapter.m4528p(i10);
                    C5207g.m11109d(abstractC3739aM4528p8, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Search");
                    AbstractC3739a.l lVar2 = (AbstractC3739a.l) abstractC3739aM4528p8;
                    AbstractC3740b.n nVar = (AbstractC3740b.n) abstractC3740b;
                    nVar.m9927s(lVar2.f24504b);
                    boolean z17 = lVar2.f24503a;
                    C8330n2 c8330n2 = nVar.f24518u;
                    if (z17) {
                        ((TextInputEditText) c8330n2.f45086b).requestFocus();
                    }
                    ((TextInputEditText) c8330n2.f45086b).setOnEditorActionListener(new C3812f(collectionsAdapter));
                    return;
                }
                boolean z18 = abstractC3740b instanceof AbstractC3740b.j;
                InnerListLayout innerListLayout = collectionsAdapter.f24477e;
                if (z18) {
                    int i24 = C3743e.f24529a[innerListLayout.ordinal()];
                    C8348q3 c8348q3 = ((AbstractC3740b.j) abstractC3740b).f24515u;
                    if (i24 == 2) {
                        LinearLayout linearLayout = c8348q3.f45177c;
                        C5207g.m11110e(linearLayout, "viewContent");
                        C4924a.m10445X(linearLayout, -1);
                        LinearLayout linearLayout2 = c8348q3.f45177c;
                        C5207g.m11110e(linearLayout2, "viewContent");
                        C4924a.m10444W(linearLayout2, -2);
                        return;
                    }
                    if (i24 != 3) {
                        return;
                    }
                    LinearLayout linearLayout3 = c8348q3.f45177c;
                    C5207g.m11110e(linearLayout3, "viewContent");
                    C4924a.m10445X(linearLayout3, -1);
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) c8348q3.f45179e;
                    C5207g.m11110e(shimmerFrameLayout, "tvTitle");
                    List<Integer> list17 = C6716m.f37937a;
                    C4924a.m10445X(shimmerFrameLayout, (int) C6716m.m13316a(80));
                    ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) c8348q3.f45178d;
                    C5207g.m11110e(shimmerFrameLayout2, "tvCourseTitle");
                    C4924a.m10445X(shimmerFrameLayout2, (int) C6716m.m13316a(40));
                    MaterialCardView materialCardView = c8348q3.f45175a;
                    C5207g.m11110e(materialCardView, "cardView");
                    C4924a.m10444W(materialCardView, (int) C6716m.m13316a(86));
                    LinearLayout linearLayout4 = c8348q3.f45177c;
                    linearLayout4.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC10382j(linearLayout4, c8348q3));
                    return;
                }
                if (!(abstractC3740b instanceof AbstractC3740b.e)) {
                    if ((abstractC3740b instanceof AbstractC3740b.m) || (abstractC3740b instanceof AbstractC3740b.b)) {
                        return;
                    }
                    if (!(abstractC3740b instanceof AbstractC3740b.a)) {
                        boolean z19 = abstractC3740b instanceof AbstractC3740b.h;
                        return;
                    }
                    AbstractC3739a abstractC3739aM4528p9 = collectionsAdapter.m4528p(i10);
                    C5207g.m11109d(abstractC3739aM4528p9, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.CourseFilter");
                    AbstractC3739a.b bVar = (AbstractC3739a.b) abstractC3739aM4528p9;
                    List<Sort> listM12965a2 = C6335d.m12965a(SortType.Collection);
                    ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listM12965a2, 10));
                    Iterator<T> it2 = listM12965a2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(view5.getContext().getString(C4924a.m10465i0((Sort) it2.next())));
                    }
                    C8382x2 c8382x2 = ((AbstractC3740b.a) abstractC3740b).f24505u;
                    ((TextView) c8382x2.f45467e).setText(view5.getContext().getString(C4924a.m10465i0(bVar.f24484a)));
                    C0337q0 c0337q0 = new C0337q0(view5.getContext(), (TextView) c8382x2.f45467e);
                    ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(c0337q0.f1316a.mo235a(0, 0, 0, (String) it3.next()));
                    }
                    c0337q0.f1318c = new C7946b(abstractC3740b, 13, collectionsAdapter);
                    ((TextView) c8382x2.f45467e).setOnClickListener(new ViewOnClickListenerC3807a(0, c0337q0));
                    return;
                }
                int i25 = C3743e.f24529a[innerListLayout.ordinal()];
                C8313k3 c8313k3 = ((AbstractC3740b.e) abstractC3740b).f24511u;
                if (i25 == 2) {
                    FrameLayout frameLayout = c8313k3.f44963b;
                    C5207g.m11110e(frameLayout, "viewContent");
                    C4924a.m10445X(frameLayout, -1);
                    FrameLayout frameLayout2 = c8313k3.f44963b;
                    C5207g.m11110e(frameLayout2, "viewContent");
                    C4924a.m10444W(frameLayout2, -2);
                    return;
                }
                if (i25 != 3) {
                    return;
                }
                FrameLayout frameLayout3 = c8313k3.f44963b;
                C5207g.m11110e(frameLayout3, "viewContent");
                C4924a.m10445X(frameLayout3, -1);
                ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) c8313k3.f44968g;
                C5207g.m11110e(shimmerFrameLayout3, "tvTitle");
                List<Integer> list18 = C6716m.f37937a;
                C4924a.m10445X(shimmerFrameLayout3, (int) C6716m.m13316a(80));
                ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) c8313k3.f44967f;
                C5207g.m11110e(shimmerFrameLayout4, "tvLessons");
                C4924a.m10445X(shimmerFrameLayout4, (int) C6716m.m13316a(40));
                MaterialCardView materialCardView2 = (MaterialCardView) c8313k3.f44965d;
                C5207g.m11110e(materialCardView2, "mainCard");
                C4924a.m10444W(materialCardView2, (int) C6716m.m13316a(86));
                FrameLayout frameLayout4 = c8313k3.f44963b;
                frameLayout4.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC10383k(frameLayout4, c8313k3));
                MaterialCardView materialCardView3 = (MaterialCardView) c8313k3.f44966e;
                C5207g.m11110e(materialCardView3, "secondBackCard");
                C4924a.m10444W(materialCardView3, (int) C6716m.m13316a(84));
                MaterialCardView materialCardView4 = (MaterialCardView) c8313k3.f44964c;
                C5207g.m11110e(materialCardView4, "firstBackCard");
                C4924a.m10444W(materialCardView4, (int) C6716m.m13316a(82));
                return;
            }
            AbstractC3739a abstractC3739aM4528p10 = collectionsAdapter.m4528p(i10);
            C5207g.m11109d(abstractC3739aM4528p10, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Course");
            final AbstractC3739a.a aVar2 = (AbstractC3739a.a) abstractC3739aM4528p10;
            AbstractC3740b.g gVar = (AbstractC3740b.g) abstractC3740b;
            C6332a c6332a5 = aVar2.f24479a;
            C5207g.m11111f(c6332a5, "course");
            ImageSize imageSize3 = ImageSize.Medium;
            String str11 = c6332a5.f36602h;
            String str12 = c6332a5.f36581H;
            String strM10423B5 = C4924a.m10423B(str12, str11, imageSize3);
            C8295h3 c8295h3 = gVar.f24513u;
            if (str12 != null) {
                ((ImageView) c8295h3.f44861k).setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                ((ImageView) c8295h3.f44861k).setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            RelativeLayout relativeLayout6 = (RelativeLayout) c8295h3.f44863m;
            List<Integer> list19 = C6716m.f37937a;
            View view6 = gVar.f7054a;
            Context context20 = view6.getContext();
            C5207g.m11110e(context20, "itemView.context");
            relativeLayout6.setBackgroundColor(C6716m.m13333r(R.attr.loadingColor, context20));
            ComponentCallbacks2C2090l componentCallbacks2C2090lM6238e4 = ComponentCallbacks2C2080b.m6238e(view6.getContext());
            ImageView imageView8 = (ImageView) c8295h3.f44861k;
            componentCallbacks2C2090lM6238e4.getClass();
            componentCallbacks2C2090lM6238e4.m6256f(new ComponentCallbacks2C2090l.b(imageView8));
            ComponentCallbacks2C2080b.m6238e(view6.getContext()).m6254c().m6247G(strM10423B5).m6251z(new C3809c(strM10423B5, c8295h3)).m6245E(imageView8);
            ComponentCallbacks2C2090l componentCallbacks2C2090lM6238e5 = ComponentCallbacks2C2080b.m6238e(view6.getContext());
            ImageView imageView9 = (ImageView) c8295h3.f44862l;
            componentCallbacks2C2090lM6238e5.getClass();
            componentCallbacks2C2090lM6238e5.m6256f(new ComponentCallbacks2C2090l.b(imageView9));
            String str13 = c6332a5.f36582I;
            if (str13 != null) {
                C4924a.m10436O(imageView9, str13, 4.0f, null, 12);
                C4924a.m10457e0(imageView9);
            } else {
                C4924a.m10422A(imageView9);
            }
            c8295h3.f44852b.setText(c6332a5.f36599e);
            TextView textView11 = (TextView) c8295h3.f44855e;
            LibraryItemCounter libraryItemCounter6 = aVar2.f24480b;
            textView11.setText(String.valueOf(libraryItemCounter6 != null ? libraryItemCounter6.f22013j : 0));
            c8295h3.f44854d.setText(String.valueOf(libraryItemCounter6 != null ? libraryItemCounter6.f22015l : 0));
            Resources resources4 = view6.getContext().getResources();
            Integer numValueOf2 = c6332a5.f36590Q;
            if (libraryItemCounter6 != null) {
                iIntValue2 = libraryItemCounter6.f22012i;
            } else {
                iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
            }
            Object[] objArr6 = new Object[1];
            if (libraryItemCounter6 != null) {
                numValueOf2 = Integer.valueOf(libraryItemCounter6.f22012i);
            }
            objArr6[0] = numValueOf2;
            c8295h3.f44853c.setText(resources4.getQuantityString(R.plurals.lingq_lessons_count_Lessons, iIntValue2, objArr6));
            View view7 = c8295h3.f44859i;
            ((MaterialCardView) view7).setOnClickListener(new ViewOnClickListenerC10380h(abstractC3740b, collectionsAdapter, aVar2, 0));
            ((MaterialCardView) view7).setOnLongClickListener(new View.OnLongClickListener() { // from class: yi.i
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view8) {
                    CollectionsAdapter.AbstractC3740b abstractC3740b2 = abstractC3740b;
                    C5207g.m11111f(abstractC3740b2, "$holder");
                    CollectionsAdapter collectionsAdapter2 = collectionsAdapter;
                    C5207g.m11111f(collectionsAdapter2, "this$0");
                    CollectionsAdapter.AbstractC3739a.a aVar3 = aVar2;
                    C5207g.m11111f(aVar3, "$item");
                    int iM4241d = ((CollectionsAdapter.AbstractC3740b.g) abstractC3740b2).m4241d();
                    if (iM4241d == -1) {
                        return true;
                    }
                    CollectionsAdapter.AbstractC3739a abstractC3739aM4528p11 = collectionsAdapter2.m4528p(iM4241d);
                    C5207g.m11109d(abstractC3739aM4528p11, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Course");
                    CollectionsAdapter.AbstractC3739a.a aVar4 = (CollectionsAdapter.AbstractC3739a.a) abstractC3739aM4528p11;
                    C5207g.m11110e(view8, "it");
                    collectionsAdapter2.f24478f.mo9824x(view8, aVar4.f24479a, aVar4.f24480b, aVar3.f24483e);
                    return true;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0344 A[PHI: r3
      0x0344: PHI (r3v130 int) = (r3v129 int), (r3v141 int) binds: [B:118:0x02af, B:132:0x0303] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:211:0x04d4 A[PHI: r3
      0x04d4: PHI (r3v94 int) = (r3v93 int), (r3v95 int) binds: [B:195:0x046f, B:197:0x047c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:275:0x0664 A[PHI: r3
      0x0664: PHI (r3v60 int) = 
      (r3v59 int)
      (r3v61 int)
      (r3v62 int)
      (r3v63 int)
      (r3v64 int)
      (r3v65 int)
      (r3v66 int)
      (r3v67 int)
      (r3v68 int)
      (r3v69 int)
      (r3v70 int)
      (r3v71 int)
      (r3v72 int)
      (r3v74 int)
      (r3v75 int)
      (r3v76 int)
      (r3v77 int)
      (r3v78 int)
      (r3v79 int)
      (r3v84 int)
     binds: [B:218:0x0506, B:220:0x0513, B:222:0x0520, B:224:0x052d, B:226:0x053a, B:228:0x0547, B:230:0x0554, B:232:0x0561, B:234:0x056e, B:236:0x057b, B:238:0x0588, B:240:0x0593, B:242:0x05a0, B:246:0x05b5, B:248:0x05c2, B:250:0x05cd, B:252:0x05da, B:254:0x05e7, B:256:0x05f4, B:264:0x0623] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:324:0x07b9 A[PHI: r3
      0x07b9: PHI (r3v40 int) = (r3v39 int), (r3v41 int) binds: [B:315:0x077e, B:317:0x078b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x015a A[PHI: r3
      0x015a: PHI (r3v162 int) = (r3v147 int), (r3v166 int), (r3v168 int) binds: [B:25:0x00ae, B:33:0x00d9, B:37:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x015e A[PHI: r5
      0x015e: PHI (r5v16 int) = (r5v0 int), (r5v17 int), (r5v19 int), (r5v20 int) binds: [B:15:0x0075, B:17:0x0080, B:21:0x0097, B:23:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0162 A[PHI: r6
      0x0162: PHI (r6v12 int) = (r6v0 int), (r6v14 int) binds: [B:9:0x0056, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0240 A[PHI: r3
      0x0240: PHI (r3v148 int) = (r3v147 int), (r3v158 int) binds: [B:78:0x01d0, B:90:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        int iOrdinal = CollectionsListItemType.Lesson.ordinal();
        int i11 = R.id.tvPremium;
        int i12 = R.id.ivMenu;
        int i13 = R.id.ivDownload;
        int i14 = R.id.viewDownload;
        int i15 = R.id.tvAudio;
        InnerListLayout innerListLayout = this.f24477e;
        int i16 = R.id.tvWords;
        if (i10 == iOrdinal) {
            InnerListLayout innerListLayout2 = InnerListLayout.VerticalFullWidth;
            int i17 = R.id.tvLessonTitle;
            if (innerListLayout != innerListLayout2) {
                View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_lesson, recyclerView, false);
                MaterialCardView materialCardView = (MaterialCardView) C0062b.m298P0(viewM849h, R.id.cardView);
                if (materialCardView != null) {
                    ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.ivCourse);
                    if (imageView != null) {
                        ImageView imageView2 = (ImageView) C0062b.m298P0(viewM849h, R.id.ivLesson);
                        if (imageView2 != null) {
                            TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvAudio);
                            if (textView != null) {
                                TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tvCourseTitle);
                                if (textView2 != null) {
                                    TextView textView3 = (TextView) C0062b.m298P0(viewM849h, R.id.tvKnownWords);
                                    if (textView3 != null) {
                                        TextView textView4 = (TextView) C0062b.m298P0(viewM849h, R.id.tvLessonTitle);
                                        if (textView4 == null) {
                                            i15 = i17;
                                        } else {
                                            TextView textView5 = (TextView) C0062b.m298P0(viewM849h, R.id.tvLingqs);
                                            if (textView5 != null) {
                                                TextView textView6 = (TextView) C0062b.m298P0(viewM849h, R.id.tvWords);
                                                if (textView6 != null) {
                                                    RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(viewM849h, R.id.viewBg);
                                                    if (relativeLayout != null) {
                                                        i15 = R.id.viewKnownWords;
                                                        if (((MaterialButton) C0062b.m298P0(viewM849h, R.id.viewKnownWords)) != null) {
                                                            LinearLayout linearLayout = (LinearLayout) viewM849h;
                                                            if (((MaterialButton) C0062b.m298P0(viewM849h, R.id.viewLingqs)) != null) {
                                                                i17 = R.id.viewProgressLesson;
                                                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C0062b.m298P0(viewM849h, R.id.viewProgressLesson);
                                                                if (linearProgressIndicator == null) {
                                                                    i15 = i17;
                                                                } else {
                                                                    if (((MaterialButton) C0062b.m298P0(viewM849h, R.id.viewWords)) != null) {
                                                                        return new AbstractC3740b.l(new C8343p3(linearLayout, materialCardView, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, relativeLayout, linearProgressIndicator));
                                                                    }
                                                                    i15 = R.id.viewWords;
                                                                }
                                                            } else {
                                                                i15 = R.id.viewLingqs;
                                                            }
                                                        }
                                                    } else {
                                                        i15 = R.id.viewBg;
                                                    }
                                                } else {
                                                    i15 = R.id.tvWords;
                                                }
                                            } else {
                                                i15 = R.id.tvLingqs;
                                            }
                                        }
                                    } else {
                                        i15 = R.id.tvKnownWords;
                                    }
                                } else {
                                    i15 = R.id.tvCourseTitle;
                                }
                            }
                        } else {
                            i15 = R.id.ivLesson;
                        }
                    } else {
                        i15 = R.id.ivCourse;
                    }
                } else {
                    i15 = R.id.cardView;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i15)));
            }
            View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_item_overview_lesson, recyclerView, false);
            ImageView imageView3 = (ImageView) C0062b.m298P0(viewM849h2, R.id.ivAdded);
            if (imageView3 != null) {
                ImageView imageView4 = (ImageView) C0062b.m298P0(viewM849h2, R.id.ivDownload);
                if (imageView4 == null) {
                    i11 = i13;
                } else {
                    ImageView imageView5 = (ImageView) C0062b.m298P0(viewM849h2, R.id.ivLesson);
                    if (imageView5 != null) {
                        i13 = R.id.ivLike;
                        ImageView imageView6 = (ImageView) C0062b.m298P0(viewM849h2, R.id.ivLike);
                        if (imageView6 == null) {
                            i11 = i13;
                        } else if (((ImageView) C0062b.m298P0(viewM849h2, R.id.ivMenu)) != null) {
                            i12 = R.id.menuBarrier;
                            if (((Barrier) C0062b.m298P0(viewM849h2, R.id.menuBarrier)) == null) {
                                i11 = i12;
                            } else {
                                TextView textView7 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvAudio);
                                if (textView7 != null) {
                                    i12 = R.id.tvCourse;
                                    TextView textView8 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvCourse);
                                    if (textView8 != null) {
                                        i12 = R.id.tvImport;
                                        TextView textView9 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvImport);
                                        if (textView9 != null) {
                                            TextView textView10 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvLessonTitle);
                                            if (textView10 == null) {
                                                i11 = i17;
                                            } else {
                                                TextView textView11 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvLingqs);
                                                if (textView11 != null) {
                                                    TextView textView12 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvPremium);
                                                    if (textView12 != null) {
                                                        TextView textView13 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvWords);
                                                        if (textView13 != null) {
                                                            i17 = R.id.viewAdded;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) C0062b.m298P0(viewM849h2, R.id.viewAdded);
                                                            if (relativeLayout2 == null) {
                                                                i11 = i17;
                                                            } else {
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) C0062b.m298P0(viewM849h2, R.id.viewDownload);
                                                                if (relativeLayout3 != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewM849h2;
                                                                    i17 = R.id.viewLike;
                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) C0062b.m298P0(viewM849h2, R.id.viewLike);
                                                                    if (relativeLayout4 == null) {
                                                                        i11 = i17;
                                                                    } else if (((MaterialButton) C0062b.m298P0(viewM849h2, R.id.viewLingqs)) != null) {
                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) C0062b.m298P0(viewM849h2, R.id.viewMenu);
                                                                        if (relativeLayout5 != null) {
                                                                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(viewM849h2, R.id.viewProgress);
                                                                            if (circularProgressIndicator != null) {
                                                                                LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) C0062b.m298P0(viewM849h2, R.id.viewProgressLesson);
                                                                                if (linearProgressIndicator2 == null) {
                                                                                    i11 = R.id.viewProgressLesson;
                                                                                } else {
                                                                                    if (((MaterialButton) C0062b.m298P0(viewM849h2, R.id.viewWords)) != null) {
                                                                                        return new AbstractC3740b.k(new C8368u3(constraintLayout, imageView3, imageView4, imageView5, imageView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, relativeLayout2, relativeLayout3, constraintLayout, relativeLayout4, relativeLayout5, circularProgressIndicator, linearProgressIndicator2));
                                                                                    }
                                                                                    i11 = R.id.viewWords;
                                                                                }
                                                                            } else {
                                                                                i11 = R.id.viewProgress;
                                                                            }
                                                                        } else {
                                                                            i11 = R.id.viewMenu;
                                                                        }
                                                                    } else {
                                                                        i11 = R.id.viewLingqs;
                                                                    }
                                                                } else {
                                                                    i11 = R.id.viewDownload;
                                                                }
                                                            }
                                                        } else {
                                                            i11 = R.id.tvWords;
                                                        }
                                                    }
                                                } else {
                                                    i11 = R.id.tvLingqs;
                                                }
                                            }
                                        } else {
                                            i11 = i12;
                                        }
                                    } else {
                                        i11 = i12;
                                    }
                                } else {
                                    i11 = R.id.tvAudio;
                                }
                            }
                        } else {
                            i11 = i12;
                        }
                    } else {
                        i11 = R.id.ivLesson;
                    }
                }
            } else {
                i11 = R.id.ivAdded;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(i11)));
        }
        int iOrdinal2 = CollectionsListItemType.Course.ordinal();
        int i18 = R.id.secondBackCard;
        int i19 = R.id.tvLessons;
        if (i10 == iOrdinal2) {
            if (innerListLayout == InnerListLayout.VerticalFullWidth) {
                View viewM849h3 = C0204c.m849h(recyclerView, R.layout.list_item_overview_course, recyclerView, false);
                ImageView imageView7 = (ImageView) C0062b.m298P0(viewM849h3, R.id.ivCourse);
                if (imageView7 != null) {
                    ImageView imageView8 = (ImageView) C0062b.m298P0(viewM849h3, R.id.ivDownload);
                    if (imageView8 == null) {
                        i12 = R.id.ivDownload;
                    } else if (((ImageView) C0062b.m298P0(viewM849h3, R.id.ivMenu)) != null) {
                        int i20 = R.id.tvCourseLessons;
                        TextView textView14 = (TextView) C0062b.m298P0(viewM849h3, R.id.tvCourseLessons);
                        if (textView14 == null) {
                            i12 = i20;
                        } else {
                            TextView textView15 = (TextView) C0062b.m298P0(viewM849h3, R.id.tvCourseTitle);
                            if (textView15 != null) {
                                TextView textView16 = (TextView) C0062b.m298P0(viewM849h3, R.id.tvKnownWords);
                                if (textView16 != null) {
                                    TextView textView17 = (TextView) C0062b.m298P0(viewM849h3, R.id.tvLingqs);
                                    if (textView17 != null) {
                                        TextView textView18 = (TextView) C0062b.m298P0(viewM849h3, R.id.tvWords);
                                        if (textView18 != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewM849h3;
                                            RelativeLayout relativeLayout6 = (RelativeLayout) C0062b.m298P0(viewM849h3, R.id.viewDownload);
                                            if (relativeLayout6 == null) {
                                                i12 = R.id.viewDownload;
                                            } else if (((MaterialButton) C0062b.m298P0(viewM849h3, R.id.viewLingqs)) != null) {
                                                i20 = R.id.viewMenu;
                                                RelativeLayout relativeLayout7 = (RelativeLayout) C0062b.m298P0(viewM849h3, R.id.viewMenu);
                                                if (relativeLayout7 != null) {
                                                    CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) C0062b.m298P0(viewM849h3, R.id.viewProgress);
                                                    if (circularProgressIndicator2 == null) {
                                                        i12 = R.id.viewProgress;
                                                    } else {
                                                        if (((MaterialButton) C0062b.m298P0(viewM849h3, R.id.viewWords)) != null) {
                                                            return new AbstractC3740b.f(new C8363t3(constraintLayout2, imageView7, imageView8, textView14, textView15, textView16, textView17, textView18, constraintLayout2, relativeLayout6, relativeLayout7, circularProgressIndicator2));
                                                        }
                                                        i12 = R.id.viewWords;
                                                    }
                                                } else {
                                                    i12 = i20;
                                                }
                                            } else {
                                                i12 = R.id.viewLingqs;
                                            }
                                        } else {
                                            i12 = R.id.tvWords;
                                        }
                                    } else {
                                        i12 = R.id.tvLingqs;
                                    }
                                } else {
                                    i12 = R.id.tvKnownWords;
                                }
                            } else {
                                i12 = R.id.tvCourseTitle;
                            }
                        }
                    }
                } else {
                    i12 = R.id.ivCourse;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h3.getResources().getResourceName(i12)));
            }
            View viewM849h4 = C0204c.m849h(recyclerView, R.layout.list_item_course, recyclerView, false);
            MaterialCardView materialCardView2 = (MaterialCardView) C0062b.m298P0(viewM849h4, R.id.firstBackCard);
            if (materialCardView2 != null) {
                ImageView imageView9 = (ImageView) C0062b.m298P0(viewM849h4, R.id.ivCourse);
                if (imageView9 != null) {
                    int i21 = R.id.ivCourseF;
                    ImageView imageView10 = (ImageView) C0062b.m298P0(viewM849h4, R.id.ivCourseF);
                    if (imageView10 == null) {
                        i16 = i21;
                    } else {
                        MaterialCardView materialCardView3 = (MaterialCardView) C0062b.m298P0(viewM849h4, R.id.mainCard);
                        if (materialCardView3 != null) {
                            MaterialCardView materialCardView4 = (MaterialCardView) C0062b.m298P0(viewM849h4, R.id.secondBackCard);
                            if (materialCardView4 != null) {
                                TextView textView19 = (TextView) C0062b.m298P0(viewM849h4, R.id.tvCourseTitle);
                                if (textView19 != null) {
                                    TextView textView20 = (TextView) C0062b.m298P0(viewM849h4, R.id.tvLessons);
                                    if (textView20 != null) {
                                        TextView textView21 = (TextView) C0062b.m298P0(viewM849h4, R.id.tvLingqs);
                                        if (textView21 != null) {
                                            TextView textView22 = (TextView) C0062b.m298P0(viewM849h4, R.id.tvWords);
                                            if (textView22 != null) {
                                                RelativeLayout relativeLayout8 = (RelativeLayout) C0062b.m298P0(viewM849h4, R.id.viewBg);
                                                if (relativeLayout8 != null) {
                                                    FrameLayout frameLayout = (FrameLayout) viewM849h4;
                                                    i21 = R.id.viewLingqs;
                                                    MaterialButton materialButton = (MaterialButton) C0062b.m298P0(viewM849h4, R.id.viewLingqs);
                                                    if (materialButton != null) {
                                                        i21 = R.id.viewWords;
                                                        MaterialButton materialButton2 = (MaterialButton) C0062b.m298P0(viewM849h4, R.id.viewWords);
                                                        if (materialButton2 != null) {
                                                            return new AbstractC3740b.g(new C8295h3(frameLayout, materialCardView2, imageView9, imageView10, materialCardView3, materialCardView4, textView19, textView20, textView21, textView22, relativeLayout8, frameLayout, materialButton, materialButton2));
                                                        }
                                                    }
                                                    i16 = i21;
                                                } else {
                                                    i16 = R.id.viewBg;
                                                }
                                            }
                                        } else {
                                            i16 = R.id.tvLingqs;
                                        }
                                    } else {
                                        i16 = R.id.tvLessons;
                                    }
                                } else {
                                    i16 = R.id.tvCourseTitle;
                                }
                            } else {
                                i16 = R.id.secondBackCard;
                            }
                        } else {
                            i16 = R.id.mainCard;
                        }
                    }
                } else {
                    i16 = R.id.ivCourse;
                }
            } else {
                i16 = R.id.firstBackCard;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h4.getResources().getResourceName(i16)));
        }
        if (i10 == CollectionsListItemType.Search.ordinal()) {
            return new AbstractC3740b.n(C8330n2.m16406a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
        }
        if (i10 == CollectionsListItemType.CourseHeader.ordinal()) {
            View viewM849h5 = C0204c.m849h(recyclerView, R.layout.list_header_course, recyclerView, false);
            MaterialCardView materialCardView5 = (MaterialCardView) C0062b.m298P0(viewM849h5, R.id.cardView);
            if (materialCardView5 != null) {
                int i22 = R.id.ivCourse;
                ImageView imageView11 = (ImageView) C0062b.m298P0(viewM849h5, R.id.ivCourse);
                if (imageView11 != null) {
                    i22 = R.id.tvAudio;
                    TextView textView23 = (TextView) C0062b.m298P0(viewM849h5, R.id.tvAudio);
                    if (textView23 != null) {
                        TextView textView24 = (TextView) C0062b.m298P0(viewM849h5, R.id.tvCourseTitle);
                        if (textView24 != null) {
                            TextView textView25 = (TextView) C0062b.m298P0(viewM849h5, R.id.tvLessons);
                            if (textView25 != null) {
                                i19 = R.id.tvLevel;
                                TextView textView26 = (TextView) C0062b.m298P0(viewM849h5, R.id.tvLevel);
                                if (textView26 != null) {
                                    i19 = R.id.tvLikes;
                                    TextView textView27 = (TextView) C0062b.m298P0(viewM849h5, R.id.tvLikes);
                                    if (textView27 != null) {
                                        RelativeLayout relativeLayout9 = (RelativeLayout) C0062b.m298P0(viewM849h5, R.id.viewBg);
                                        if (relativeLayout9 != null) {
                                            return new AbstractC3740b.c(new C8377w2((LinearLayout) viewM849h5, materialCardView5, imageView11, textView23, textView24, textView25, textView26, textView27, relativeLayout9));
                                        }
                                        i19 = R.id.viewBg;
                                    }
                                }
                            }
                        } else {
                            i19 = R.id.tvCourseTitle;
                        }
                    } else {
                        i19 = i22;
                    }
                } else {
                    i19 = i22;
                }
            } else {
                i19 = R.id.cardView;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h5.getResources().getResourceName(i19)));
        }
        if (i10 != CollectionsListItemType.CourseInfo.ordinal()) {
            if (i10 == CollectionsListItemType.HeaderSelectable.ordinal()) {
                View viewM849h6 = C0204c.m849h(recyclerView, R.layout.list_item_library_header_selectable_list, recyclerView, false);
                if (viewM849h6 == null) {
                    throw new NullPointerException("rootView");
                }
                RecyclerView recyclerView2 = (RecyclerView) viewM849h6;
                return new AbstractC3740b.o(new C8330n2(recyclerView2, recyclerView2), this.f24478f);
            }
            int iOrdinal3 = CollectionsListItemType.Filter.ordinal();
            int i23 = R.id.tv_sort_by;
            if (i10 == iOrdinal3) {
                View viewM849h7 = C0204c.m849h(recyclerView, R.layout.list_header_home_search_filter, recyclerView, false);
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) C0062b.m298P0(viewM849h7, R.id.spinner_content);
                if (appCompatSpinner != null) {
                    TextView textView28 = (TextView) C0062b.m298P0(viewM849h7, R.id.tv_sort_by);
                    if (textView28 != null) {
                        i23 = R.id.view_select_collection_type;
                        LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewM849h7, R.id.view_select_collection_type);
                        if (linearLayout2 != null) {
                            i23 = R.id.view_sort_by;
                            LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewM849h7, R.id.view_sort_by);
                            if (linearLayout3 != null) {
                                return new AbstractC3740b.i(new C8253a3((LinearLayout) viewM849h7, appCompatSpinner, textView28, linearLayout2, linearLayout3));
                            }
                        }
                    }
                } else {
                    i23 = R.id.spinner_content;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h7.getResources().getResourceName(i23)));
            }
            if (i10 == CollectionsListItemType.CourseFilter.ordinal()) {
                View viewM849h8 = C0204c.m849h(recyclerView, R.layout.list_header_course_search_filter, recyclerView, false);
                TextView textView29 = (TextView) C0062b.m298P0(viewM849h8, R.id.tv_sort_by);
                if (textView29 != null) {
                    i23 = R.id.tv_spinner;
                    TextView textView30 = (TextView) C0062b.m298P0(viewM849h8, R.id.tv_spinner);
                    if (textView30 != null) {
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewM849h8;
                        return new AbstractC3740b.a(new C8382x2(constraintLayout3, textView29, textView30, constraintLayout3));
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h8.getResources().getResourceName(i23)));
            }
            int iOrdinal4 = CollectionsListItemType.LessonLoading.ordinal();
            int i24 = R.id.tvTitle;
            if (i10 == iOrdinal4) {
                if (innerListLayout == InnerListLayout.VerticalFullWidth) {
                    return new AbstractC3740b.m(C8324m2.m16403c(LayoutInflater.from(recyclerView.getContext()), recyclerView));
                }
                View viewM849h9 = C0204c.m849h(recyclerView, R.layout.list_item_lesson_loading, recyclerView, false);
                int i25 = R.id.cardView;
                MaterialCardView materialCardView6 = (MaterialCardView) C0062b.m298P0(viewM849h9, R.id.cardView);
                if (materialCardView6 != null) {
                    i25 = R.id.tvCourseTitle;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C0062b.m298P0(viewM849h9, R.id.tvCourseTitle);
                    if (shimmerFrameLayout != null) {
                        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C0062b.m298P0(viewM849h9, R.id.tvTitle);
                        if (shimmerFrameLayout2 != null) {
                            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) C0062b.m298P0(viewM849h9, R.id.viewBg);
                            if (shimmerFrameLayout3 != null) {
                                LinearLayout linearLayout4 = (LinearLayout) viewM849h9;
                                return new AbstractC3740b.j(new C8348q3(linearLayout4, materialCardView6, shimmerFrameLayout, shimmerFrameLayout2, shimmerFrameLayout3, linearLayout4));
                            }
                            i24 = R.id.viewBg;
                        }
                    } else {
                        i24 = i25;
                    }
                } else {
                    i24 = i25;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h9.getResources().getResourceName(i24)));
            }
            if (i10 != CollectionsListItemType.CourseLoading.ordinal()) {
                if (i10 != CollectionsListItemType.CourseHeaderLoading.ordinal()) {
                    if (i10 == CollectionsListItemType.Empty.ordinal()) {
                        return new AbstractC3740b.h(C8259b3.m16399c(LayoutInflater.from(recyclerView.getContext()), recyclerView));
                    }
                    throw new IllegalStateException();
                }
                View viewM849h10 = C0204c.m849h(recyclerView, R.layout.list_item_course_header_loading, recyclerView, false);
                if (viewM849h10 != null) {
                    return new AbstractC3740b.b(new C8301i3((LinearLayout) viewM849h10));
                }
                throw new NullPointerException("rootView");
            }
            if (innerListLayout == InnerListLayout.VerticalFullWidth) {
                return new AbstractC3740b.m(C8324m2.m16403c(LayoutInflater.from(recyclerView.getContext()), recyclerView));
            }
            View viewM849h11 = C0204c.m849h(recyclerView, R.layout.list_item_course_loading, recyclerView, false);
            MaterialCardView materialCardView7 = (MaterialCardView) C0062b.m298P0(viewM849h11, R.id.firstBackCard);
            if (materialCardView7 != null) {
                MaterialCardView materialCardView8 = (MaterialCardView) C0062b.m298P0(viewM849h11, R.id.mainCard);
                if (materialCardView8 != null) {
                    MaterialCardView materialCardView9 = (MaterialCardView) C0062b.m298P0(viewM849h11, R.id.secondBackCard);
                    if (materialCardView9 != null) {
                        ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) C0062b.m298P0(viewM849h11, R.id.tvLessons);
                        if (shimmerFrameLayout4 != null) {
                            ShimmerFrameLayout shimmerFrameLayout5 = (ShimmerFrameLayout) C0062b.m298P0(viewM849h11, R.id.tvTitle);
                            if (shimmerFrameLayout5 != null) {
                                i18 = R.id.viewBg;
                                ShimmerFrameLayout shimmerFrameLayout6 = (ShimmerFrameLayout) C0062b.m298P0(viewM849h11, R.id.viewBg);
                                if (shimmerFrameLayout6 != null) {
                                    FrameLayout frameLayout2 = (FrameLayout) viewM849h11;
                                    return new AbstractC3740b.e(new C8313k3(frameLayout2, materialCardView7, materialCardView8, materialCardView9, shimmerFrameLayout4, shimmerFrameLayout5, shimmerFrameLayout6, frameLayout2, 0));
                                }
                            } else {
                                i18 = R.id.tvTitle;
                            }
                        } else {
                            i18 = R.id.tvLessons;
                        }
                    }
                } else {
                    i18 = R.id.mainCard;
                }
            } else {
                i18 = R.id.firstBackCard;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h11.getResources().getResourceName(i18)));
        }
        View viewM849h12 = C0204c.m849h(recyclerView, R.layout.list_item_course_info, recyclerView, false);
        int i26 = R.id.btnAddToContinueStudying;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(viewM849h12, R.id.btnAddToContinueStudying);
        if (imageButton != null) {
            i26 = R.id.btnCopy;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C0062b.m298P0(viewM849h12, R.id.btnCopy);
            if (appCompatImageView != null) {
                i26 = R.id.btnDownload;
                ImageButton imageButton2 = (ImageButton) C0062b.m298P0(viewM849h12, R.id.btnDownload);
                if (imageButton2 != null) {
                    i26 = R.id.btnLike;
                    ImageButton imageButton3 = (ImageButton) C0062b.m298P0(viewM849h12, R.id.btnLike);
                    if (imageButton3 != null) {
                        i26 = R.id.btnPurchaseCourse;
                        MaterialButton materialButton3 = (MaterialButton) C0062b.m298P0(viewM849h12, R.id.btnPurchaseCourse);
                        if (materialButton3 != null) {
                            i26 = R.id.btnShowAll;
                            TextView textView31 = (TextView) C0062b.m298P0(viewM849h12, R.id.btnShowAll);
                            if (textView31 != null) {
                                i26 = R.id.btnStartContinueCourse;
                                MaterialButton materialButton4 = (MaterialButton) C0062b.m298P0(viewM849h12, R.id.btnStartContinueCourse);
                                if (materialButton4 != null) {
                                    i26 = R.id.ivSharedBy;
                                    ImageView imageView12 = (ImageView) C0062b.m298P0(viewM849h12, R.id.ivSharedBy);
                                    if (imageView12 != null) {
                                        i26 = R.id.ivSharedByRole;
                                        ImageView imageView13 = (ImageView) C0062b.m298P0(viewM849h12, R.id.ivSharedByRole);
                                        if (imageView13 != null) {
                                            i26 = R.id.rvTags;
                                            RecyclerView recyclerView3 = (RecyclerView) C0062b.m298P0(viewM849h12, R.id.rvTags);
                                            if (recyclerView3 != null) {
                                                i26 = R.id.tvKnownWords;
                                                TextView textView32 = (TextView) C0062b.m298P0(viewM849h12, R.id.tvKnownWords);
                                                if (textView32 != null) {
                                                    i26 = R.id.tvKnownWordsTitle;
                                                    if (((TextView) C0062b.m298P0(viewM849h12, R.id.tvKnownWordsTitle)) != null) {
                                                        i26 = R.id.tvLessonDescription;
                                                        TextView textView33 = (TextView) C0062b.m298P0(viewM849h12, R.id.tvLessonDescription);
                                                        if (textView33 == null) {
                                                            i14 = i26;
                                                        } else {
                                                            TextView textView34 = (TextView) C0062b.m298P0(viewM849h12, R.id.tvLingqs);
                                                            if (textView34 != null) {
                                                                i26 = R.id.tvLingqsTitle;
                                                                if (((TextView) C0062b.m298P0(viewM849h12, R.id.tvLingqsTitle)) != null) {
                                                                    i26 = R.id.tvLink;
                                                                    TextView textView35 = (TextView) C0062b.m298P0(viewM849h12, R.id.tvLink);
                                                                    if (textView35 != null) {
                                                                        i26 = R.id.tvNewWords;
                                                                        if (((TextView) C0062b.m298P0(viewM849h12, R.id.tvNewWords)) != null) {
                                                                            i26 = R.id.tvPremium;
                                                                            TextView textView36 = (TextView) C0062b.m298P0(viewM849h12, R.id.tvPremium);
                                                                            if (textView36 != null) {
                                                                                i26 = R.id.tvSharedBy;
                                                                                TextView textView37 = (TextView) C0062b.m298P0(viewM849h12, R.id.tvSharedBy);
                                                                                if (textView37 != null) {
                                                                                    i26 = R.id.tvSharedByTitle;
                                                                                    TextView textView38 = (TextView) C0062b.m298P0(viewM849h12, R.id.tvSharedByTitle);
                                                                                    if (textView38 == null) {
                                                                                        i14 = i26;
                                                                                    } else {
                                                                                        TextView textView39 = (TextView) C0062b.m298P0(viewM849h12, R.id.tvWords);
                                                                                        if (textView39 != null) {
                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) viewM849h12;
                                                                                            if (((RelativeLayout) C0062b.m298P0(viewM849h12, R.id.viewDownload)) != null) {
                                                                                                i14 = R.id.viewLink;
                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) C0062b.m298P0(viewM849h12, R.id.viewLink);
                                                                                                if (constraintLayout5 != null) {
                                                                                                    i26 = R.id.viewProgress;
                                                                                                    CircularProgressIndicator circularProgressIndicator3 = (CircularProgressIndicator) C0062b.m298P0(viewM849h12, R.id.viewProgress);
                                                                                                    if (circularProgressIndicator3 != null) {
                                                                                                        i14 = R.id.viewProgressKnownWords;
                                                                                                        LinearProgressIndicator linearProgressIndicator3 = (LinearProgressIndicator) C0062b.m298P0(viewM849h12, R.id.viewProgressKnownWords);
                                                                                                        if (linearProgressIndicator3 != null) {
                                                                                                            i14 = R.id.viewProgressLingqs;
                                                                                                            LinearProgressIndicator linearProgressIndicator4 = (LinearProgressIndicator) C0062b.m298P0(viewM849h12, R.id.viewProgressLingqs);
                                                                                                            if (linearProgressIndicator4 != null) {
                                                                                                                i14 = R.id.viewProgressNewWords;
                                                                                                                LinearProgressIndicator linearProgressIndicator5 = (LinearProgressIndicator) C0062b.m298P0(viewM849h12, R.id.viewProgressNewWords);
                                                                                                                if (linearProgressIndicator5 != null) {
                                                                                                                    i14 = R.id.viewPurchaseProgress;
                                                                                                                    if (((CircularProgressIndicator) C0062b.m298P0(viewM849h12, R.id.viewPurchaseProgress)) != null) {
                                                                                                                        return new AbstractC3740b.d(new C8307j3(constraintLayout4, imageButton, appCompatImageView, imageButton2, imageButton3, materialButton3, textView31, materialButton4, imageView12, imageView13, recyclerView3, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, constraintLayout5, circularProgressIndicator3, linearProgressIndicator3, linearProgressIndicator4, linearProgressIndicator5));
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        i14 = i26;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i14 = R.id.tvWords;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i14 = i26;
                                                                                }
                                                                            } else {
                                                                                i14 = i26;
                                                                            }
                                                                        } else {
                                                                            i14 = i26;
                                                                        }
                                                                    } else {
                                                                        i14 = i26;
                                                                    }
                                                                } else {
                                                                    i14 = i26;
                                                                }
                                                            } else {
                                                                i14 = R.id.tvLingqs;
                                                            }
                                                        }
                                                    } else {
                                                        i14 = i26;
                                                    }
                                                } else {
                                                    i14 = i26;
                                                }
                                            } else {
                                                i14 = i26;
                                            }
                                        } else {
                                            i14 = i26;
                                        }
                                    } else {
                                        i14 = i26;
                                    }
                                } else {
                                    i14 = i26;
                                }
                            } else {
                                i14 = i26;
                            }
                        } else {
                            i14 = i26;
                        }
                    } else {
                        i14 = i26;
                    }
                } else {
                    i14 = i26;
                }
            } else {
                i14 = i26;
            }
        } else {
            i14 = i26;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h12.getResources().getResourceName(i14)));
    }
}
