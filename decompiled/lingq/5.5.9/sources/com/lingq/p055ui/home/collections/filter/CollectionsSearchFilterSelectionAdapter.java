package com.lingq.p055ui.home.collections.filter;

import ae.C0062b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0166e;
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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mo.C7661i;
import p199jd.ViewOnClickListenerC6464i;
import p254m2.C7472a;
import p278nh.C7785l;
import p278nh.C7786m;
import p408u6.ViewOnClickListenerC9466e;
import ph.C8259b3;
import ph.C8324m2;
import ph.C8331n3;
import ph.C8362t2;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionsSearchFilterSelectionAdapter extends AbstractC1170u<AbstractC3585b, AbstractC3584a> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC3586c f23481e;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionAdapter$CollectionsFilterItemType;", "", "(Ljava/lang/String;I)V", "Selection", "SharedByUser", "Search", "Empty", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum CollectionsFilterItemType {
        Selection,
        SharedByUser,
        Search,
        Empty
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$a */
    public static abstract class AbstractC3584a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$a$a */
        public static final class a extends AbstractC3584a {

            /* JADX INFO: renamed from: u */
            public final C8259b3 f23482u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8259b3 c8259b3) {
                LinearLayout linearLayout = (LinearLayout) c8259b3.f44618c;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f23482u = c8259b3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$a$b */
        public static final class b extends AbstractC3584a {

            /* JADX INFO: renamed from: u */
            public final C8362t2 f23483u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8362t2 c8362t2) {
                TextInputLayout textInputLayout = (TextInputLayout) c8362t2.f45285b;
                C5207g.m11110e(textInputLayout, "binding.root");
                super(textInputLayout);
                this.f23483u = c8362t2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$a$c */
        public static final class c extends AbstractC3584a {

            /* JADX INFO: renamed from: u */
            public final C8331n3 f23484u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8331n3 c8331n3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c8331n3.f45087a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f23484u = c8331n3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$a$d */
        public static final class d extends AbstractC3584a {

            /* JADX INFO: renamed from: u */
            public final C8324m2 f23485u;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8324m2 c8324m2) {
                ConstraintLayout constraintLayoutM16405b = c8324m2.m16405b();
                C5207g.m11110e(constraintLayoutM16405b, "binding.root");
                super(constraintLayoutM16405b);
                this.f23485u = c8324m2;
            }
        }

        public AbstractC3584a(ViewGroup viewGroup) {
            super(viewGroup);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$b */
    public static abstract class AbstractC3585b {

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$b$a */
        public static final class a extends AbstractC3585b {

            /* JADX INFO: renamed from: a */
            public final int f23486a = R.string.search_no_results;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f23486a == ((a) obj).f23486a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f23486a);
            }

            public final String toString() {
                return C0166e.m768o(new StringBuilder("Empty(value="), this.f23486a, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$b$b */
        public static final class b extends AbstractC3585b {

            /* JADX INFO: renamed from: a */
            public final int f23487a;

            public b(int i10) {
                this.f23487a = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f23487a == ((b) obj).f23487a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f23487a);
            }

            public final String toString() {
                return C0166e.m768o(new StringBuilder("Search(hint="), this.f23487a, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$b$c */
        public static final class c extends AbstractC3585b {

            /* JADX INFO: renamed from: a */
            public final C7785l f23488a;

            public c(C7785l c7785l) {
                this.f23488a = c7785l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C5207g.m11106a(this.f23488a, ((c) obj).f23488a);
            }

            public final int hashCode() {
                return this.f23488a.hashCode();
            }

            public final String toString() {
                return "Selection(selectionItem=" + this.f23488a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$b$d */
        public static final class d extends AbstractC3585b {

            /* JADX INFO: renamed from: a */
            public final C7786m f23489a;

            public d(C7786m c7786m) {
                this.f23489a = c7786m;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C5207g.m11106a(this.f23489a, ((d) obj).f23489a);
            }

            public final int hashCode() {
                return this.f23489a.hashCode();
            }

            public final String toString() {
                return "SharedByUser(selectionUser=" + this.f23489a + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$c */
    public interface InterfaceC3586c {
        /* JADX INFO: renamed from: a */
        void mo9850a(String str);

        /* JADX INFO: renamed from: b */
        void mo9851b(C7785l c7785l);

        /* JADX INFO: renamed from: c */
        void mo9852c(C7786m c7786m);
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter$d */
    public static final class C3587d extends C1162m.e<AbstractC3585b> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC3585b abstractC3585b, AbstractC3585b abstractC3585b2) {
            AbstractC3585b abstractC3585b3 = abstractC3585b;
            AbstractC3585b abstractC3585b4 = abstractC3585b2;
            if ((abstractC3585b3 instanceof AbstractC3585b.c) && (abstractC3585b4 instanceof AbstractC3585b.c)) {
                return C5207g.m11106a(((AbstractC3585b.c) abstractC3585b3).f23488a, ((AbstractC3585b.c) abstractC3585b4).f23488a);
            }
            if (!(abstractC3585b3 instanceof AbstractC3585b.b) || !(abstractC3585b4 instanceof AbstractC3585b.b)) {
                if ((abstractC3585b3 instanceof AbstractC3585b.a) && (abstractC3585b4 instanceof AbstractC3585b.a)) {
                    if (((AbstractC3585b.a) abstractC3585b3).f23486a == ((AbstractC3585b.a) abstractC3585b4).f23486a) {
                    }
                } else if ((abstractC3585b3 instanceof AbstractC3585b.d) && (abstractC3585b4 instanceof AbstractC3585b.d)) {
                    return C5207g.m11106a(abstractC3585b3, abstractC3585b4);
                }
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(AbstractC3585b abstractC3585b, AbstractC3585b abstractC3585b2) {
            AbstractC3585b abstractC3585b3 = abstractC3585b;
            AbstractC3585b abstractC3585b4 = abstractC3585b2;
            if ((abstractC3585b3 instanceof AbstractC3585b.c) && (abstractC3585b4 instanceof AbstractC3585b.c)) {
                return C5207g.m11106a(((AbstractC3585b.c) abstractC3585b3).f23488a.f42734a, ((AbstractC3585b.c) abstractC3585b4).f23488a.f42734a);
            }
            if ((abstractC3585b3 instanceof AbstractC3585b.d) && (abstractC3585b4 instanceof AbstractC3585b.d)) {
                return C5207g.m11106a(((AbstractC3585b.d) abstractC3585b3).f23489a.f42741d, ((AbstractC3585b.d) abstractC3585b4).f23489a.f42741d);
            }
            if ((!(abstractC3585b3 instanceof AbstractC3585b.b) || !(abstractC3585b4 instanceof AbstractC3585b.b)) && (!(abstractC3585b3 instanceof AbstractC3585b.a) || !(abstractC3585b4 instanceof AbstractC3585b.a) || ((AbstractC3585b.a) abstractC3585b3).f23486a != ((AbstractC3585b.a) abstractC3585b4).f23486a)) {
                return false;
            }
            return true;
        }
    }

    public CollectionsSearchFilterSelectionAdapter(CollectionsSearchFilterSelectionFragment.C3588a c3588a) {
        super(new C3587d());
        this.f23481e = c3588a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC3585b abstractC3585bM4528p = m4528p(i10);
        if (abstractC3585bM4528p instanceof AbstractC3585b.c) {
            return CollectionsFilterItemType.Selection.ordinal();
        }
        if (abstractC3585bM4528p instanceof AbstractC3585b.b) {
            return CollectionsFilterItemType.Search.ordinal();
        }
        if (abstractC3585bM4528p instanceof AbstractC3585b.a) {
            return CollectionsFilterItemType.Empty.ordinal();
        }
        if (abstractC3585bM4528p instanceof AbstractC3585b.d) {
            return CollectionsFilterItemType.SharedByUser.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        AbstractC3584a abstractC3584a = (AbstractC3584a) abstractC1109b0;
        int i11 = 1;
        int i12 = 0;
        if (abstractC3584a instanceof AbstractC3584a.c) {
            AbstractC3585b abstractC3585bM4528p = m4528p(i10);
            C5207g.m11109d(abstractC3585bM4528p, "null cannot be cast to non-null type com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter.CollectionsFilterAdapterItem.Selection");
            AbstractC3584a.c cVar = (AbstractC3584a.c) abstractC3584a;
            C7785l c7785l = ((AbstractC3585b.c) abstractC3585bM4528p).f23488a;
            C5207g.m11111f(c7785l, "selectionItem");
            C8331n3 c8331n3 = cVar.f23484u;
            ImageView imageView = (ImageView) c8331n3.f45089c;
            C5207g.m11110e(imageView, "isSelected");
            if (!Boolean.valueOf(c7785l.f42736c).booleanValue()) {
                i12 = 4;
            }
            imageView.setVisibility(i12);
            Integer num = c7785l.f42734a;
            View view = c8331n3.f45090d;
            if (num != null) {
                ((TextView) view).setText(cVar.f7054a.getContext().getString(num.intValue()));
            } else {
                ((TextView) view).setText(c7785l.f42735b);
            }
            ((ConstraintLayout) c8331n3.f45088b).setOnClickListener(new ViewOnClickListenerC6464i(this, i11, abstractC3584a));
            return;
        }
        if (abstractC3584a instanceof AbstractC3584a.b) {
            AbstractC3585b abstractC3585bM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC3585bM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter.CollectionsFilterAdapterItem.Search");
            AbstractC3584a.b bVar = (AbstractC3584a.b) abstractC3584a;
            C8362t2 c8362t2 = bVar.f23483u;
            ((TextInputLayout) c8362t2.f45286c).setHint(bVar.f7054a.getContext().getString(((AbstractC3585b.b) abstractC3585bM4528p2).f23487a));
            ((TextInputEditText) c8362t2.f45287d).setOnEditorActionListener(new C3626a(this));
            return;
        }
        if (abstractC3584a instanceof AbstractC3584a.a) {
            AbstractC3585b abstractC3585bM4528p3 = m4528p(i10);
            C5207g.m11109d(abstractC3585bM4528p3, "null cannot be cast to non-null type com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter.CollectionsFilterAdapterItem.Empty");
            AbstractC3584a.a aVar = (AbstractC3584a.a) abstractC3584a;
            ((TextView) aVar.f23482u.f44617b).setText(aVar.f7054a.getContext().getString(((AbstractC3585b.a) abstractC3585bM4528p3).f23486a));
            return;
        }
        if (abstractC3584a instanceof AbstractC3584a.d) {
            AbstractC3585b abstractC3585bM4528p4 = m4528p(i10);
            C5207g.m11109d(abstractC3585bM4528p4, "null cannot be cast to non-null type com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter.CollectionsFilterAdapterItem.SharedByUser");
            AbstractC3585b.d dVar = (AbstractC3585b.d) abstractC3585bM4528p4;
            AbstractC3584a.d dVar2 = (AbstractC3584a.d) abstractC3584a;
            C7786m c7786m = dVar.f23489a;
            C5207g.m11111f(c7786m, "selectionUser");
            C8324m2 c8324m2 = dVar2.f23485u;
            ImageView imageView2 = (ImageView) c8324m2.f45028b;
            C5207g.m11110e(imageView2, "isSelected");
            imageView2.setVisibility(Boolean.valueOf(c7786m.f42740c).booleanValue() ? 0 : 4);
            boolean zM15250P2 = C7661i.m15250P2(c7786m.f42741d);
            View view2 = dVar2.f7054a;
            View view3 = c8324m2.f45032f;
            View view4 = c8324m2.f45031e;
            if (zM15250P2) {
                ((TextView) view3).setText(view2.getContext().getString(R.string.search_all));
                ImageView imageView3 = (ImageView) view4;
                C5207g.m11110e(imageView3, "ivUser");
                C4924a.m10442U(imageView3);
            } else {
                ((TextView) view3).setText(c7786m.f42738a);
                ImageView imageView4 = (ImageView) view4;
                C5207g.m11110e(imageView4, "ivUser");
                C4924a.m10457e0(imageView4);
                Drawable drawableM14849b = null;
                C4924a.m10436O(imageView4, c7786m.f42739b, 0.0f, null, 14);
                View view5 = c8324m2.f45030d;
                String str = c7786m.f42742e;
                if (str != null) {
                    ImageView imageView5 = (ImageView) view5;
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1307827859) {
                        if (iHashCode != 94630981) {
                            if (iHashCode == 812757528 && str.equals("librarian")) {
                                Context context = view2.getContext();
                                Object obj = C7472a.f41322a;
                                drawableM14849b = C7472a.c.m14849b(context, R.drawable.ic_profile_librarian);
                            }
                        } else if (str.equals("chief")) {
                            Context context2 = view2.getContext();
                            Object obj2 = C7472a.f41322a;
                            drawableM14849b = C7472a.c.m14849b(context2, R.drawable.ic_profile_chief_librarian);
                        }
                    } else if (str.equals("editor")) {
                        Context context3 = view2.getContext();
                        Object obj3 = C7472a.f41322a;
                        drawableM14849b = C7472a.c.m14849b(context3, R.drawable.ic_profile_editor);
                    }
                    imageView5.setImageDrawable(drawableM14849b);
                } else {
                    ((ImageView) view5).setImageDrawable(null);
                }
            }
            c8324m2.m16405b().setOnClickListener(new ViewOnClickListenerC9466e(this, i11, dVar));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == CollectionsFilterItemType.Selection.ordinal()) {
            return new AbstractC3584a.c(C8331n3.m16408a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
        }
        if (i10 == CollectionsFilterItemType.Search.ordinal()) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_collections_filter_search, recyclerView, false);
            TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(viewM849h, R.id.et_search);
            if (textInputEditText == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(R.id.et_search)));
            }
            TextInputLayout textInputLayout = (TextInputLayout) viewM849h;
            return new AbstractC3584a.b(new C8362t2(textInputLayout, textInputEditText, textInputLayout));
        }
        if (i10 == CollectionsFilterItemType.Empty.ordinal()) {
            return new AbstractC3584a.a(C8259b3.m16399c(LayoutInflater.from(recyclerView.getContext()), recyclerView));
        }
        if (i10 != CollectionsFilterItemType.SharedByUser.ordinal()) {
            throw new IllegalStateException();
        }
        View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_collections_filter_user, recyclerView, false);
        int i11 = R.id.isSelected;
        ImageView imageView = (ImageView) C0062b.m298P0(viewM849h2, R.id.isSelected);
        if (imageView != null) {
            i11 = R.id.ivRole;
            ImageView imageView2 = (ImageView) C0062b.m298P0(viewM849h2, R.id.ivRole);
            if (imageView2 != null) {
                i11 = R.id.ivUser;
                ImageView imageView3 = (ImageView) C0062b.m298P0(viewM849h2, R.id.ivUser);
                if (imageView3 != null) {
                    i11 = R.id.tvName;
                    TextView textView = (TextView) C0062b.m298P0(viewM849h2, R.id.tvName);
                    if (textView != null) {
                        return new AbstractC3584a.d(new C8324m2((ConstraintLayout) viewM849h2, imageView, imageView2, imageView3, textView));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(i11)));
    }
}
