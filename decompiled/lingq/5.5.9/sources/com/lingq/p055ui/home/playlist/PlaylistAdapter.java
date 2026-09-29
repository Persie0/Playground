package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.support.v4.media.C0141b;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1146d;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import bj.ViewOnTouchListenerC1584g;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.lingq.shared.uimodel.CoursePlaylistSort;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ki.C6696b;
import ki.C6697c;
import ki.C6698d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C7076b;
import mo.C7661i;
import ni.C7793a;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import p254m2.C7472a;
import p274n8.ViewOnClickListenerC7718c;
import p278nh.InterfaceC7778e;
import p278nh.InterfaceC7781h;
import p329q2.C8488a;
import p512yi.ViewOnClickListenerC10369a;
import ph.C8362t2;
import ph.C8373v3;
import ph.C8378w3;
import ph.C8382x2;
import ph.C8383x3;
import si.ViewOnClickListenerC9028l;
import si.ViewOnClickListenerC9029m;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistAdapter extends AbstractC1170u<AbstractC3890c, AbstractC3888a> implements InterfaceC7778e {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7781h f25398e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3891d f25399f;

    /* JADX INFO: renamed from: g */
    public int f25400g;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13365d2 = {"Lcom/lingq/ui/home/playlist/PlaylistAdapter$PlaylistAdapterItemType;", "", "(Ljava/lang/String;I)V", "Content", "Actions", "PlaylistLoading", "Filter", "Empty", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum PlaylistAdapterItemType {
        Content,
        Actions,
        PlaylistLoading,
        Filter,
        Empty
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$a */
    public static abstract class AbstractC3888a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$a$a */
        public static final class a extends AbstractC3888a {

            /* JADX INFO: renamed from: u */
            public final C8378w3 f25401u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8378w3 c8378w3) {
                LinearLayout linearLayout = c8378w3.f45445a;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f25401u = c8378w3;
            }

            /* JADX INFO: renamed from: s */
            public final void m9974s(MaterialButton materialButton, boolean z10) {
                int iM13333r;
                C8378w3 c8378w3 = this.f25401u;
                if (z10) {
                    List<Integer> list = C6716m.f37937a;
                    Context context = c8378w3.f45445a.getContext();
                    C5207g.m11110e(context, "binding.root.context");
                    iM13333r = C6716m.m13333r(R.attr.backgroundCardSecondaryColor, context);
                } else {
                    List<Integer> list2 = C6716m.f37937a;
                    Context context2 = c8378w3.f45445a.getContext();
                    C5207g.m11110e(context2, "binding.root.context");
                    iM13333r = C6716m.m13333r(R.attr.backgroundCardColor, context2);
                }
                materialButton.setBackgroundColor(iM13333r);
            }

            /* JADX INFO: renamed from: t */
            public final void m9975t(MaterialButton materialButton, boolean z10) {
                ColorStateList colorStateListValueOf;
                C8378w3 c8378w3 = this.f25401u;
                if (z10) {
                    List<Integer> list = C6716m.f37937a;
                    Context context = c8378w3.f45445a.getContext();
                    C5207g.m11110e(context, "binding.root.context");
                    colorStateListValueOf = ColorStateList.valueOf(C6716m.m13333r(R.attr.secondaryTextColor, context));
                } else {
                    List<Integer> list2 = C6716m.f37937a;
                    Context context2 = c8378w3.f45445a.getContext();
                    C5207g.m11110e(context2, "binding.root.context");
                    colorStateListValueOf = ColorStateList.valueOf(C6716m.m13333r(R.attr.loadingColor, context2));
                }
                materialButton.setStrokeColor(colorStateListValueOf);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$a$b */
        public static final class b extends AbstractC3888a {

            /* JADX INFO: renamed from: u */
            public final C8373v3 f25402u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8373v3 c8373v3) {
                ConstraintLayout constraintLayout = c8373v3.f45409a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f25402u = c8373v3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$a$c */
        public static final class c extends AbstractC3888a {

            /* JADX INFO: renamed from: u */
            public final C8362t2 f25403u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8362t2 c8362t2) {
                LinearLayout linearLayoutM16412a = c8362t2.m16412a();
                C5207g.m11110e(linearLayoutM16412a, "binding.root");
                super(linearLayoutM16412a);
                this.f25403u = c8362t2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$a$d */
        public static final class d extends AbstractC3888a {

            /* JADX INFO: renamed from: u */
            public final C8383x3 f25404u;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8383x3 c8383x3) {
                LinearLayout linearLayout = (LinearLayout) c8383x3.f45468a;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f25404u = c8383x3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$a$e */
        public static final class e extends AbstractC3888a {
            /* JADX WARN: Illegal instructions before constructor call */
            public e(C8382x2 c8382x2) {
                LinearLayout linearLayout = (LinearLayout) c8382x2.f45465c;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
            }
        }

        public AbstractC3888a(ViewGroup viewGroup) {
            super(viewGroup);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$b */
    public static final class C3889b extends C1162m.e<AbstractC3890c> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC3890c abstractC3890c, AbstractC3890c abstractC3890c2) {
            AbstractC3890c abstractC3890c3 = abstractC3890c;
            AbstractC3890c abstractC3890c4 = abstractC3890c2;
            if ((abstractC3890c3 instanceof AbstractC3890c.a) && (abstractC3890c4 instanceof AbstractC3890c.a)) {
                return C5207g.m11106a(abstractC3890c3, abstractC3890c4);
            }
            if ((abstractC3890c3 instanceof AbstractC3890c.d) && (abstractC3890c4 instanceof AbstractC3890c.d)) {
                AbstractC3890c.d dVar = (AbstractC3890c.d) abstractC3890c3;
                AbstractC3890c.d dVar2 = (AbstractC3890c.d) abstractC3890c4;
                if (dVar.f25413a == dVar2.f25413a && dVar.f25414b == dVar2.f25414b) {
                    return true;
                }
            } else {
                if ((abstractC3890c3 instanceof AbstractC3890c.e) && (abstractC3890c4 instanceof AbstractC3890c.e)) {
                    return C5207g.m11106a(abstractC3890c3, abstractC3890c4);
                }
                if ((abstractC3890c3 instanceof AbstractC3890c.c) && (abstractC3890c4 instanceof AbstractC3890c.c)) {
                    return C5207g.m11106a(abstractC3890c3, abstractC3890c4);
                }
                if ((abstractC3890c3 instanceof AbstractC3890c.b) && (abstractC3890c4 instanceof AbstractC3890c.b)) {
                    return C5207g.m11106a(abstractC3890c3, abstractC3890c4);
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
        
            if ((r8 instanceof com.lingq.p055ui.home.playlist.PlaylistAdapter.AbstractC3890c.b) != false) goto L45;
         */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo481b(AbstractC3890c abstractC3890c, AbstractC3890c abstractC3890c2) {
            AbstractC3890c abstractC3890c3 = abstractC3890c;
            AbstractC3890c abstractC3890c4 = abstractC3890c2;
            if (!(abstractC3890c3 instanceof AbstractC3890c.a) || !(abstractC3890c4 instanceof AbstractC3890c.a)) {
                if (abstractC3890c3 instanceof AbstractC3890c.d) {
                    if (!(abstractC3890c4 instanceof AbstractC3890c.d)) {
                    }
                    return true;
                }
                if (abstractC3890c3 instanceof AbstractC3890c.e) {
                    if (abstractC3890c4 instanceof AbstractC3890c.e) {
                    }
                    return true;
                }
                if (abstractC3890c3 instanceof AbstractC3890c.c) {
                    if (!(abstractC3890c4 instanceof AbstractC3890c.c)) {
                    }
                    return true;
                }
                if (abstractC3890c3 instanceof AbstractC3890c.b) {
                }
                return false;
            }
            AbstractC3890c.a aVar = (AbstractC3890c.a) abstractC3890c3;
            Integer numValueOf = null;
            C6697c c6697c = aVar.f25405a;
            Integer numValueOf2 = c6697c != null ? Integer.valueOf(c6697c.f37856a) : null;
            AbstractC3890c.a aVar2 = (AbstractC3890c.a) abstractC3890c4;
            C6697c c6697c2 = aVar2.f25405a;
            if (C5207g.m11106a(numValueOf2, c6697c2 != null ? Integer.valueOf(c6697c2.f37856a) : null)) {
                C6696b c6696b = aVar.f25406b;
                Integer numValueOf3 = c6696b != null ? Integer.valueOf(c6696b.f37853a) : null;
                C6696b c6696b2 = aVar2.f25406b;
                if (c6696b2 != null) {
                    numValueOf = Integer.valueOf(c6696b2.f37853a);
                }
                if (C5207g.m11106a(numValueOf3, numValueOf)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$c */
    public static abstract class AbstractC3890c {

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$c$a */
        public static final class a extends AbstractC3890c {

            /* JADX INFO: renamed from: a */
            public final C6697c f25405a;

            /* JADX INFO: renamed from: b */
            public final C6696b f25406b;

            /* JADX INFO: renamed from: c */
            public final LibraryItemCounter f25407c;

            /* JADX INFO: renamed from: d */
            public final C6698d f25408d;

            /* JADX INFO: renamed from: e */
            public final boolean f25409e;

            /* JADX INFO: renamed from: f */
            public final Boolean f25410f;

            public a(C6697c c6697c, C6696b c6696b, LibraryItemCounter libraryItemCounter, C6698d c6698d, boolean z10, Boolean bool, int i10) {
                c6697c = (i10 & 1) != 0 ? null : c6697c;
                c6696b = (i10 & 2) != 0 ? null : c6696b;
                libraryItemCounter = (i10 & 4) != 0 ? null : libraryItemCounter;
                c6698d = (i10 & 8) != 0 ? null : c6698d;
                bool = (i10 & 32) != 0 ? null : bool;
                this.f25405a = c6697c;
                this.f25406b = c6696b;
                this.f25407c = libraryItemCounter;
                this.f25408d = c6698d;
                this.f25409e = z10;
                this.f25410f = bool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C5207g.m11106a(this.f25405a, aVar.f25405a) && C5207g.m11106a(this.f25406b, aVar.f25406b) && C5207g.m11106a(this.f25407c, aVar.f25407c) && C5207g.m11106a(this.f25408d, aVar.f25408d) && this.f25409e == aVar.f25409e && C5207g.m11106a(this.f25410f, aVar.f25410f);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v10, types: [int] */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v16 */
            public final int hashCode() {
                int iHashCode = 0;
                C6697c c6697c = this.f25405a;
                int iHashCode2 = (c6697c == null ? 0 : c6697c.hashCode()) * 31;
                C6696b c6696b = this.f25406b;
                int iHashCode3 = (iHashCode2 + (c6696b == null ? 0 : c6696b.hashCode())) * 31;
                LibraryItemCounter libraryItemCounter = this.f25407c;
                int iHashCode4 = (iHashCode3 + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31;
                C6698d c6698d = this.f25408d;
                int iHashCode5 = (iHashCode4 + (c6698d == null ? 0 : c6698d.hashCode())) * 31;
                boolean z10 = this.f25409e;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                int i10 = (iHashCode5 + r10) * 31;
                Boolean bool = this.f25410f;
                if (bool != null) {
                    iHashCode = bool.hashCode();
                }
                return i10 + iHashCode;
            }

            public final String toString() {
                return "Content(lesson=" + this.f25405a + ", course=" + this.f25406b + ", counter=" + this.f25407c + ", lessonDownload=" + this.f25408d + ", isEditing=" + this.f25409e + ", isSelected=" + this.f25410f + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$c$b */
        public static final class b extends AbstractC3890c {

            /* JADX INFO: renamed from: a */
            public static final b f25411a = new b();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$c$c */
        public static final class c extends AbstractC3890c {

            /* JADX INFO: renamed from: a */
            public final CoursePlaylistSort f25412a;

            public c(CoursePlaylistSort coursePlaylistSort) {
                C5207g.m11111f(coursePlaylistSort, "sort");
                this.f25412a = coursePlaylistSort;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && this.f25412a == ((c) obj).f25412a) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f25412a.hashCode();
            }

            public final String toString() {
                return "Filter(sort=" + this.f25412a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$c$d */
        public static final class d extends AbstractC3890c {

            /* JADX INFO: renamed from: a */
            public final boolean f25413a;

            /* JADX INFO: renamed from: b */
            public final boolean f25414b;

            public d(boolean z10, boolean z11) {
                this.f25413a = z10;
                this.f25414b = z11;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f25413a == dVar.f25413a && this.f25414b == dVar.f25414b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0 */
            /* JADX WARN: Type inference failed for: r0v1 */
            /* JADX WARN: Type inference failed for: r0v2, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v3, types: [int] */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r1v5 */
            public final int hashCode() {
                ?? r10 = 1;
                boolean z10 = this.f25413a;
                ?? r11 = z10;
                if (z10) {
                    r11 = 1;
                }
                int i10 = r11 * 31;
                boolean z11 = this.f25414b;
                if (!z11) {
                    r10 = z11;
                }
                return i10 + r10;
            }

            public final String toString() {
                return "PlayActions(isPlaying=" + this.f25413a + ", isShuffling=" + this.f25414b + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$c$e */
        public static final class e extends AbstractC3890c {

            /* JADX INFO: renamed from: a */
            public static final e f25415a = new e();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAdapter$d */
    public interface InterfaceC3891d {
        /* JADX INFO: renamed from: a */
        void mo9875a(int i10, int i11);

        /* JADX INFO: renamed from: b */
        void mo9876b(CoursePlaylistSort coursePlaylistSort);

        /* JADX INFO: renamed from: c */
        void mo9877c();

        /* JADX INFO: renamed from: d */
        void mo9878d(int i10);

        /* JADX INFO: renamed from: e */
        void mo9879e(View view, int i10);

        /* JADX INFO: renamed from: f */
        void mo9880f();

        /* JADX INFO: renamed from: g */
        void mo9881g(C6697c c6697c, boolean z10);

        /* JADX INFO: renamed from: h */
        void mo9882h();

        /* JADX INFO: renamed from: i */
        void mo9883i(View view, C6697c c6697c);
    }

    public PlaylistAdapter(InterfaceC7781h interfaceC7781h, InterfaceC3891d interfaceC3891d) {
        super(new C3889b());
        this.f25398e = interfaceC7781h;
        this.f25399f = interfaceC3891d;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    @Override // p278nh.InterfaceC7778e
    /* JADX INFO: renamed from: c */
    public final void mo9972c(int i10) {
        Integer numValueOf;
        int i11;
        Collection collection = this.f7471d.f7233f;
        C5207g.m11110e(collection, "currentList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj instanceof AbstractC3890c.a) {
                arrayList.add(obj);
            }
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            AbstractC3890c.a aVar = (AbstractC3890c.a) arrayList.get(i10);
            C6697c c6697c = aVar.f25405a;
            if (c6697c != null) {
                i11 = c6697c.f37856a;
            } else {
                C6696b c6696b = aVar.f25406b;
                if (c6696b != null) {
                    i11 = c6696b.f37853a;
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    numValueOf.intValue();
                    this.f25399f.mo9882h();
                }
            }
            numValueOf = Integer.valueOf(i11);
            if (numValueOf != null) {
                numValueOf.intValue();
                this.f25399f.mo9882h();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    @Override // p278nh.InterfaceC7778e
    /* JADX INFO: renamed from: d */
    public final boolean mo9973d(int i10, int i11) {
        Object next;
        boolean z10;
        boolean z11;
        boolean z12;
        if (i10 != -1 && i11 != -1) {
            C1146d<T> c1146d = this.f7471d;
            if (!(c1146d.f7233f.get(i11) instanceof AbstractC3890c.d) && !(c1146d.f7233f.get(i11) instanceof AbstractC3890c.d) && !(c1146d.f7233f.get(i11) instanceof AbstractC3890c.c)) {
                if (!(c1146d.f7233f.get(i11) instanceof AbstractC3890c.c)) {
                    ArrayList arrayList = new ArrayList();
                    Collection collection = c1146d.f7233f;
                    C5207g.m11110e(collection, "currentList");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = collection.iterator();
                    loop0: while (true) {
                        while (true) {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            Object next2 = it.next();
                            if (next2 instanceof AbstractC3890c.a) {
                                arrayList2.add(next2);
                            }
                        }
                    }
                    arrayList.addAll(arrayList2);
                    int iMo4226e = mo4226e() - arrayList.size();
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (next instanceof AbstractC3890c.a) {
                            AbstractC3890c.a aVar = (AbstractC3890c.a) next;
                            C6697c c6697c = aVar.f25405a;
                            if (c6697c != null) {
                                if (c6697c.f37856a == this.f25400g) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                C6696b c6696b = aVar.f25406b;
                                if (c6696b != null) {
                                    if (c6696b.f37853a == this.f25400g) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    z10 = false;
                                }
                            }
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } while (!z10);
                    if (next != null) {
                        if (i10 < mo4226e() && i11 < mo4226e()) {
                            if (i10 >= i11) {
                                int i12 = i11 + 1;
                                if (i12 <= i10) {
                                    int i13 = i10;
                                    while (true) {
                                        int i14 = i13 - iMo4226e;
                                        Collections.swap(arrayList, i14, i14 - 1);
                                        if (i13 == i12) {
                                            break;
                                        }
                                        i13--;
                                    }
                                }
                            } else {
                                for (int i15 = i10; i15 < i11; i15++) {
                                    int i16 = i15 - iMo4226e;
                                    Collections.swap(arrayList, i16, i16 + 1);
                                }
                            }
                            this.f25399f.mo9875a(i10 - iMo4226e, i11 - iMo4226e);
                        }
                        this.f7040a.m4260c(i10, i11);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC3890c abstractC3890cM4528p = m4528p(i10);
        if (abstractC3890cM4528p instanceof AbstractC3890c.a) {
            return PlaylistAdapterItemType.Content.ordinal();
        }
        if (abstractC3890cM4528p instanceof AbstractC3890c.d) {
            return PlaylistAdapterItemType.Actions.ordinal();
        }
        if (abstractC3890cM4528p instanceof AbstractC3890c.c) {
            return PlaylistAdapterItemType.Filter.ordinal();
        }
        if (C5207g.m11106a(abstractC3890cM4528p, AbstractC3890c.e.f25415a)) {
            return PlaylistAdapterItemType.PlaylistLoading.ordinal();
        }
        if (C5207g.m11106a(abstractC3890cM4528p, AbstractC3890c.b.f25411a)) {
            return PlaylistAdapterItemType.Empty.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        int i11;
        int iM13333r;
        ColorStateList colorStateListValueOf;
        PlaylistAdapter playlistAdapter;
        AbstractC3888a abstractC3888a;
        String str;
        View view;
        String str2;
        Number numberValueOf;
        String strM613i;
        int i12;
        Double d10;
        TextView textView;
        long j10;
        AbstractC3888a abstractC3888a2 = (AbstractC3888a) abstractC1109b0;
        boolean z10 = abstractC3888a2 instanceof AbstractC3888a.b;
        View view2 = abstractC3888a2.f7054a;
        if (!z10) {
            if (!(abstractC3888a2 instanceof AbstractC3888a.a)) {
                if (abstractC3888a2 instanceof AbstractC3888a.d) {
                    AbstractC3890c abstractC3890cM4528p = m4528p(i10);
                    C5207g.m11109d(abstractC3890cM4528p, "null cannot be cast to non-null type com.lingq.ui.home.playlist.PlaylistAdapter.PlaylistAdapterItem.Filter");
                    AbstractC3890c.c cVar = (AbstractC3890c.c) abstractC3890cM4528p;
                    CoursePlaylistSort[] coursePlaylistSortArrValues = CoursePlaylistSort.values();
                    ArrayList arrayList = new ArrayList(coursePlaylistSortArrValues.length);
                    for (CoursePlaylistSort coursePlaylistSort : coursePlaylistSortArrValues) {
                        arrayList.add(coursePlaylistSort.name());
                    }
                    ArrayAdapter arrayAdapter = new ArrayAdapter(view2.getContext(), R.layout.view_spinner_text, arrayList);
                    arrayAdapter.setDropDownViewResource(R.layout.view_spinner_dropdown_text);
                    C8383x3 c8383x3 = ((AbstractC3888a.d) abstractC3888a2).f25404u;
                    ((AppCompatSpinner) c8383x3.f45469b).setAdapter((SpinnerAdapter) arrayAdapter);
                    AppCompatSpinner appCompatSpinner = (AppCompatSpinner) c8383x3.f45469b;
                    C5207g.m11110e(appCompatSpinner, "holder.binding.spinnerContent");
                    C4924a.m10449a0(appCompatSpinner, cVar.f25412a.name());
                    appCompatSpinner.setOnItemSelectedListener(new C3961a(abstractC3888a2, arrayList, this));
                    return;
                }
                if ((abstractC3888a2 instanceof AbstractC3888a.e) || !(abstractC3888a2 instanceof AbstractC3888a.c)) {
                    return;
                }
                AbstractC3888a.c cVar2 = (AbstractC3888a.c) abstractC3888a2;
                C8362t2 c8362t2 = cVar2.f25403u;
                String strM15254T2 = C7661i.m15254T2(((TextView) c8362t2.f45286c).getText().toString(), "YYYYY", "...");
                int iM14285e3 = C7076b.m14285e3(strM15254T2, "XXXXX", 0, false, 6) == -1 ? C7076b.m14285e3(strM15254T2, "    ", 0, false, 6) : C7076b.m14285e3(strM15254T2, "XXXXX", 0, false, 6);
                SpannableString spannableString = new SpannableString(C7661i.m15254T2(strM15254T2, "XXXXX", "    "));
                View view3 = cVar2.f7054a;
                Context context = view3.getContext();
                Object obj = C7472a.f41322a;
                Drawable drawableM14849b = C7472a.c.m14849b(context, R.drawable.ic_playlist_icon);
                Drawable drawableMutate = drawableM14849b != null ? drawableM14849b.mutate() : null;
                if (drawableMutate != null) {
                    List<Integer> list = C6716m.f37937a;
                    Context context2 = view3.getContext();
                    C5207g.m11110e(context2, "itemView.context");
                    C8488a.b.m16569g(drawableMutate, C6716m.m13333r(R.attr.primaryTextColor, context2));
                    drawableMutate.setBounds(0, 0, 64, 64);
                    spannableString.setSpan(new ImageSpan(drawableMutate, 1), iM14285e3 + 1, iM14285e3 + 3, 17);
                    ((TextView) c8362t2.f45286c).setText(spannableString, TextView.BufferType.SPANNABLE);
                    return;
                }
                return;
            }
            AbstractC3890c abstractC3890cM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC3890cM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.playlist.PlaylistAdapter.PlaylistAdapterItem.PlayActions");
            AbstractC3890c.d dVar = (AbstractC3890c.d) abstractC3890cM4528p2;
            AbstractC3888a.a aVar = (AbstractC3888a.a) abstractC3888a2;
            C8378w3 c8378w3 = aVar.f25401u;
            MaterialButton materialButton = c8378w3.f45446b;
            boolean z11 = dVar.f25413a;
            materialButton.setIconResource(z11 ? R.drawable.ic_playlist_pause : R.drawable.ic_playlist_play);
            View view4 = aVar.f7054a;
            String string = z11 ? view4.getContext().getString(R.string.audio_pause) : view4.getContext().getString(R.string.audio_play);
            MaterialButton materialButton2 = c8378w3.f45446b;
            materialButton2.setText(string);
            LinearLayout linearLayout = c8378w3.f45445a;
            Context context3 = linearLayout.getContext();
            C5207g.m11110e(context3, "binding.root.context");
            if (C7793a.m15499c(context3)) {
                aVar.m9974s(materialButton2, z11);
                aVar.m9975t(materialButton2, z11);
            } else {
                if (z11) {
                    List<Integer> list2 = C6716m.f37937a;
                    Context context4 = linearLayout.getContext();
                    C5207g.m11110e(context4, "binding.root.context");
                    i11 = R.attr.primaryTextColor;
                    iM13333r = C6716m.m13333r(R.attr.primaryTextColor, context4);
                } else {
                    i11 = R.attr.primaryTextColor;
                    List<Integer> list3 = C6716m.f37937a;
                    Context context5 = linearLayout.getContext();
                    C5207g.m11110e(context5, "binding.root.context");
                    iM13333r = C6716m.m13333r(R.attr.primaryTextColor, context5);
                }
                materialButton2.setBackgroundColor(iM13333r);
                if (z11) {
                    List<Integer> list4 = C6716m.f37937a;
                    Context context6 = linearLayout.getContext();
                    C5207g.m11110e(context6, "binding.root.context");
                    colorStateListValueOf = ColorStateList.valueOf(C6716m.m13333r(i11, context6));
                } else {
                    List<Integer> list5 = C6716m.f37937a;
                    Context context7 = linearLayout.getContext();
                    C5207g.m11110e(context7, "binding.root.context");
                    colorStateListValueOf = ColorStateList.valueOf(C6716m.m13333r(i11, context7));
                }
                materialButton2.setStrokeColor(colorStateListValueOf);
            }
            MaterialButton materialButton3 = c8378w3.f45447c;
            C5207g.m11110e(materialButton3, "btnShuffle");
            boolean z12 = dVar.f25414b;
            aVar.m9975t(materialButton3, z12);
            aVar.m9974s(materialButton3, z12);
            materialButton2.setOnClickListener(new ViewOnClickListenerC2239y(18, this));
            materialButton3.setOnClickListener(new ViewOnClickListenerC7718c(17, this));
            return;
        }
        AbstractC3890c abstractC3890cM4528p3 = m4528p(i10);
        C5207g.m11109d(abstractC3890cM4528p3, "null cannot be cast to non-null type com.lingq.ui.home.playlist.PlaylistAdapter.PlaylistAdapterItem.Content");
        AbstractC3890c.a aVar2 = (AbstractC3890c.a) abstractC3890cM4528p3;
        String str3 = "tvLessonDuration";
        C6697c c6697c = aVar2.f25405a;
        boolean z13 = aVar2.f25409e;
        if (c6697c != null) {
            AbstractC3888a.b bVar = (AbstractC3888a.b) abstractC3888a2;
            boolean zM11106a = C5207g.m11106a(aVar2.f25410f, Boolean.TRUE);
            C8373v3 c8373v3 = bVar.f25402u;
            TextView textView2 = c8373v3.f45412d;
            C5207g.m11110e(textView2, "tvLessonDuration");
            C4924a.m10457e0(textView2);
            TextView textView3 = c8373v3.f45415g;
            C5207g.m11110e(textView3, "tvTimesPlayed");
            C4924a.m10457e0(textView3);
            TextView textView4 = c8373v3.f45414f;
            C5207g.m11110e(textView4, "tvPlayDownloadProgress");
            C4924a.m10457e0(textView4);
            ImageView imageView = c8373v3.f45410b;
            C5207g.m11110e(imageView, "ivDownload");
            C4924a.m10457e0(imageView);
            View view5 = bVar.f7054a;
            int i13 = c6697c.f37868m;
            if (i13 == 0) {
                Context context8 = view5.getContext();
                C5207g.m11110e(context8, "itemView.context");
                try {
                    str2 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                    try {
                        String str4 = new File(context8.getFilesDir().toString() + "/tracks/") + "/" + c6697c.f37856a + ".mp3";
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(str4);
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                        mediaMetadataRetriever.release();
                        j10 = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    str2 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                }
                numberValueOf = Long.valueOf(j10);
            } else {
                str2 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                numberValueOf = Integer.valueOf(i13 * 1000);
            }
            String str5 = c6697c.f37863h;
            TextView textView5 = c8373v3.f45413e;
            textView5.setText(str5);
            if (i13 > 0) {
                Locale locale = Locale.getDefault();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                strM613i = C0141b.m613i(new Object[]{Long.valueOf(timeUnit.toMinutes(numberValueOf.longValue())), Long.valueOf(timeUnit.toSeconds(numberValueOf.longValue()) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(numberValueOf.longValue())))}, 2, locale, "%02d:%02d min", "format(locale, format, *args)");
                i12 = 1;
            } else {
                Locale locale2 = Locale.getDefault();
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                strM613i = C0141b.m613i(new Object[]{Long.valueOf(timeUnit2.toMinutes(numberValueOf.longValue())), Long.valueOf(timeUnit2.toSeconds(numberValueOf.longValue()) - TimeUnit.MINUTES.toSeconds(timeUnit2.toMinutes(numberValueOf.longValue())))}, 2, locale2, "--:--", "format(locale, format, *args)");
                i12 = 1;
            }
            TextView textView6 = c8373v3.f45412d;
            textView6.setText(strM613i);
            Locale locale3 = Locale.getDefault();
            Object[] objArr = new Object[i12];
            LibraryItemCounter libraryItemCounter = aVar2.f25407c;
            objArr[0] = Double.valueOf(((libraryItemCounter == null || (d10 = libraryItemCounter.f22007d) == null) && (d10 = c6697c.f37866k) == null) ? 0.0d : d10.doubleValue());
            String str6 = String.format(locale3, "%.1fx", Arrays.copyOf(objArr, 1));
            C5207g.m11110e(str6, "format(locale, format, *args)");
            textView3.setText(str6);
            C4924a.m10457e0(textView3);
            C6698d c6698d = aVar2.f25408d;
            if (c6698d != null) {
                boolean z14 = c6698d.f37876b;
                int i14 = c6698d.f37877c;
                if (z14 && i14 == 100) {
                    C4924a.m10442U(imageView);
                    C4924a.m10422A(textView4);
                } else if (1 <= i14 && i14 < 100) {
                    String str7 = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
                    C5207g.m11110e(str7, "format(format, *args)");
                    textView4.setText(str7);
                    C4924a.m10457e0(textView4);
                    C4924a.m10442U(imageView);
                } else {
                    C4924a.m10457e0(imageView);
                    C4924a.m10422A(textView4);
                }
            } else {
                C4924a.m10457e0(imageView);
                textView4.setText("");
                C4924a.m10422A(textView4);
            }
            ImageView imageView2 = c8373v3.f45416h;
            if (z13) {
                C5207g.m11110e(imageView2, "viewHandle");
                C4924a.m10457e0(imageView2);
            } else {
                C5207g.m11110e(imageView2, "viewHandle");
                C4924a.m10442U(imageView2);
            }
            if (zM11106a) {
                List<Integer> list6 = C6716m.f37937a;
                Context context9 = view5.getContext();
                C5207g.m11110e(context9, "itemView.context");
                textView = textView5;
                textView.setTextColor(C6716m.m13333r(R.attr.greenTint, context9));
                Context context10 = view5.getContext();
                C5207g.m11110e(context10, "itemView.context");
                textView6.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context10));
            } else {
                textView = textView5;
                List<Integer> list7 = C6716m.f37937a;
                Context context11 = view5.getContext();
                C5207g.m11110e(context11, "itemView.context");
                textView.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context11));
                Context context12 = view5.getContext();
                C5207g.m11110e(context12, "itemView.context");
                textView6.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, context12));
            }
            if (c6697c.f37873r) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                str = str2;
                C5207g.m11109d(layoutParams, str);
                List<Integer> list8 = C6716m.f37937a;
                ((ConstraintLayout.C0759b) layoutParams).setMarginStart((int) C6716m.m13331p(8));
                ViewGroup.LayoutParams layoutParams2 = textView6.getLayoutParams();
                C5207g.m11109d(layoutParams2, str);
                ((ConstraintLayout.C0759b) layoutParams2).setMarginStart((int) C6716m.m13331p(8));
            } else {
                str = str2;
                ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                C5207g.m11109d(layoutParams3, str);
                List<Integer> list9 = C6716m.f37937a;
                ((ConstraintLayout.C0759b) layoutParams3).setMarginStart((int) C6716m.m13331p(0));
                ViewGroup.LayoutParams layoutParams4 = textView6.getLayoutParams();
                C5207g.m11109d(layoutParams4, str);
                ((ConstraintLayout.C0759b) layoutParams4).setMarginStart((int) C6716m.m13331p(0));
            }
            playlistAdapter = this;
            abstractC3888a = abstractC3888a2;
            view = view2;
            view.setOnClickListener(new ViewOnClickListenerC10369a(abstractC3888a, playlistAdapter, aVar2, 1));
            c8373v3.f45411c.setOnClickListener(new ViewOnClickListenerC6464i(playlistAdapter, 12, aVar2));
        } else {
            playlistAdapter = this;
            str3 = "tvLessonDuration";
            abstractC3888a = abstractC3888a2;
            str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
            view = view2;
        }
        C6696b c6696b = aVar2.f25406b;
        if (c6696b != null) {
            C8373v3 c8373v4 = ((AbstractC3888a.b) abstractC3888a).f25402u;
            TextView textView7 = c8373v4.f45412d;
            C5207g.m11110e(textView7, str3);
            C4924a.m10442U(textView7);
            TextView textView8 = c8373v4.f45415g;
            C5207g.m11110e(textView8, "tvTimesPlayed");
            C4924a.m10442U(textView8);
            TextView textView9 = c8373v4.f45414f;
            C5207g.m11110e(textView9, "tvPlayDownloadProgress");
            C4924a.m10422A(textView9);
            ImageView imageView3 = c8373v4.f45410b;
            C5207g.m11110e(imageView3, "ivDownload");
            C4924a.m10442U(imageView3);
            String str8 = c6696b.f37854b;
            TextView textView10 = c8373v4.f45413e;
            textView10.setText(str8);
            ImageView imageView4 = c8373v4.f45416h;
            if (z13) {
                C5207g.m11110e(imageView4, "viewHandle");
                C4924a.m10457e0(imageView4);
            } else {
                C5207g.m11110e(imageView4, "viewHandle");
                C4924a.m10442U(imageView4);
            }
            ViewGroup.LayoutParams layoutParams5 = textView10.getLayoutParams();
            C5207g.m11109d(layoutParams5, str);
            List<Integer> list10 = C6716m.f37937a;
            ((ConstraintLayout.C0759b) layoutParams5).setMarginStart((int) C6716m.m13331p(0));
            ViewGroup.LayoutParams layoutParams6 = c8373v4.f45412d.getLayoutParams();
            C5207g.m11109d(layoutParams6, str);
            ((ConstraintLayout.C0759b) layoutParams6).setMarginStart((int) C6716m.m13331p(0));
            view.setOnClickListener(new ViewOnClickListenerC9028l(abstractC3888a, playlistAdapter, aVar2, 3));
            c8373v4.f45411c.setOnClickListener(new ViewOnClickListenerC9029m(playlistAdapter, 7, aVar2));
        }
        if (z13) {
            ((AbstractC3888a.b) abstractC3888a).f25402u.f45416h.setOnTouchListener(new ViewOnTouchListenerC1584g(aVar2, playlistAdapter, abstractC3888a, 0));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        RecyclerView.AbstractC1109b0 cVar;
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == PlaylistAdapterItemType.Content.ordinal()) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_playlist, recyclerView, false);
            int i11 = R.id.actions;
            if (((LinearLayout) C0062b.m298P0(viewM849h, R.id.actions)) != null) {
                i11 = R.id.iv_download;
                ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.iv_download);
                if (imageView != null) {
                    i11 = R.id.iv_menu;
                    ImageView imageView2 = (ImageView) C0062b.m298P0(viewM849h, R.id.iv_menu);
                    if (imageView2 != null) {
                        i11 = R.id.tv_lesson_duration;
                        TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tv_lesson_duration);
                        if (textView != null) {
                            i11 = R.id.tv_lesson_title;
                            TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tv_lesson_title);
                            if (textView2 != null) {
                                i11 = R.id.tvPlayDownloadProgress;
                                TextView textView3 = (TextView) C0062b.m298P0(viewM849h, R.id.tvPlayDownloadProgress);
                                if (textView3 != null) {
                                    i11 = R.id.tv_times_played;
                                    TextView textView4 = (TextView) C0062b.m298P0(viewM849h, R.id.tv_times_played);
                                    if (textView4 != null) {
                                        i11 = R.id.view_handle;
                                        ImageView imageView3 = (ImageView) C0062b.m298P0(viewM849h, R.id.view_handle);
                                        if (imageView3 != null) {
                                            cVar = new AbstractC3888a.b(new C8373v3((ConstraintLayout) viewM849h, imageView, imageView2, textView, textView2, textView3, textView4, imageView3));
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
        if (i10 == PlaylistAdapterItemType.Actions.ordinal()) {
            View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_item_playlist_button_actions, recyclerView, false);
            LinearLayout linearLayout = (LinearLayout) viewM849h2;
            int i12 = R.id.btnPlay;
            MaterialButton materialButton = (MaterialButton) C0062b.m298P0(viewM849h2, R.id.btnPlay);
            if (materialButton != null) {
                i12 = R.id.btnShuffle;
                MaterialButton materialButton2 = (MaterialButton) C0062b.m298P0(viewM849h2, R.id.btnShuffle);
                if (materialButton2 != null) {
                    cVar = new AbstractC3888a.a(new C8378w3(linearLayout, materialButton, materialButton2, 0));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(i12)));
        }
        if (i10 == PlaylistAdapterItemType.PlaylistLoading.ordinal()) {
            View viewM849h3 = C0204c.m849h(recyclerView, R.layout.list_item_playlist_loading, recyclerView, false);
            int i13 = R.id.tvDuration;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C0062b.m298P0(viewM849h3, R.id.tvDuration);
            if (shimmerFrameLayout != null) {
                i13 = R.id.tvLessonTitle;
                ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C0062b.m298P0(viewM849h3, R.id.tvLessonTitle);
                if (shimmerFrameLayout2 != null) {
                    LinearLayout linearLayout2 = (LinearLayout) viewM849h3;
                    cVar = new AbstractC3888a.e(new C8382x2(linearLayout2, shimmerFrameLayout, shimmerFrameLayout2, linearLayout2, 4));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h3.getResources().getResourceName(i13)));
        }
        if (i10 == PlaylistAdapterItemType.Filter.ordinal()) {
            View viewM849h4 = C0204c.m849h(recyclerView, R.layout.list_item_playlist_filter, recyclerView, false);
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) C0062b.m298P0(viewM849h4, R.id.spinner_content);
            if (appCompatSpinner == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h4.getResources().getResourceName(R.id.spinner_content)));
            }
            cVar = new AbstractC3888a.d(new C8383x3((LinearLayout) viewM849h4, appCompatSpinner));
        } else {
            if (i10 != PlaylistAdapterItemType.Empty.ordinal()) {
                throw new IllegalStateException();
            }
            View viewM849h5 = C0204c.m849h(recyclerView, R.layout.list_item_playlist_empty, recyclerView, false);
            TextView textView5 = (TextView) C0062b.m298P0(viewM849h5, R.id.tv_no_tracks);
            if (textView5 == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h5.getResources().getResourceName(R.id.tv_no_tracks)));
            }
            LinearLayout linearLayout3 = (LinearLayout) viewM849h5;
            cVar = new AbstractC3888a.c(new C8362t2(linearLayout3, textView5, linearLayout3, 3));
        }
        return cVar;
    }
}
