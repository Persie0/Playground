package com.lingq.p055ui.review;

import ae.C0062b;
import android.content.Context;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
import com.lingq.util.ViewsUtilsKt;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import li.C7374a;
import p003a2.C0009a;
import p096ei.C5408a;
import p225kk.C6716m;
import p278nh.InterfaceC7774a;
import ph.C8261c;
import ph.C8367u2;
import ph.C8388y3;
import si.ViewOnClickListenerC9028l;
import si.ViewOnClickListenerC9029m;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewSessionCompleteAdapter extends AbstractC1170u<AbstractC4530a, AbstractC4531b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<C7374a> f29519e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4533d f29520f;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/review/ReviewSessionCompleteAdapter$AdapterItemType;", "", "(Ljava/lang/String;I)V", "TermStudied", "Header", "Title", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum AdapterItemType {
        TermStudied,
        Header,
        Title
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteAdapter$a */
    public static abstract class AbstractC4530a {

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteAdapter$a$a */
        public static final class a extends AbstractC4530a {

            /* JADX INFO: renamed from: a */
            public final int f29521a;

            /* JADX INFO: renamed from: b */
            public final int f29522b;

            public a(int i10, int i11) {
                this.f29521a = i10;
                this.f29522b = i11;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f29521a == aVar.f29521a && this.f29522b == aVar.f29522b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f29522b) + (Integer.hashCode(this.f29521a) * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Header(result=");
                sb2.append(this.f29521a);
                sb2.append(", total=");
                return C0166e.m768o(sb2, this.f29522b, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteAdapter$a$b */
        public static final class b extends AbstractC4530a {

            /* JADX INFO: renamed from: a */
            public final C7374a f29523a;

            /* JADX INFO: renamed from: b */
            public final int f29524b;

            /* JADX INFO: renamed from: c */
            public final int f29525c;

            public b(C7374a c7374a, int i10, int i11) {
                this.f29523a = c7374a;
                this.f29524b = i10;
                this.f29525c = i11;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C5207g.m11106a(this.f29523a, bVar.f29523a) && this.f29524b == bVar.f29524b && this.f29525c == bVar.f29525c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f29525c) + C0009a.m16d(this.f29524b, this.f29523a.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("TermStudied(token=");
                sb2.append(this.f29523a);
                sb2.append(", resultCorrect=");
                sb2.append(this.f29524b);
                sb2.append(", resultIncorrect=");
                return C0166e.m768o(sb2, this.f29525c, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteAdapter$a$c */
        public static final class c extends AbstractC4530a {

            /* JADX INFO: renamed from: a */
            public final int f29526a = R.string.activities_terms_studied;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f29526a == ((c) obj).f29526a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f29526a);
            }

            public final String toString() {
                return C0166e.m768o(new StringBuilder("Title(title="), this.f29526a, ")");
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteAdapter$b */
    public static abstract class AbstractC4531b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteAdapter$b$a */
        public static final class a extends AbstractC4531b {

            /* JADX INFO: renamed from: u */
            public final C8388y3 f29527u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8388y3 c8388y3) {
                ConstraintLayout constraintLayout = c8388y3.f45481a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f29527u = c8388y3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteAdapter$b$b */
        public static final class b extends AbstractC4531b {

            /* JADX INFO: renamed from: u */
            public final C8261c f29528u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8261c c8261c) {
                MaterialCardView materialCardView = (MaterialCardView) c8261c.f44631c;
                C5207g.m11110e(materialCardView, "binding.root");
                super(materialCardView);
                this.f29528u = c8261c;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteAdapter$b$c */
        public static final class c extends AbstractC4531b {

            /* JADX INFO: renamed from: u */
            public final C8367u2 f29529u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8367u2 c8367u2) {
                TextView textView = c8367u2.f45315a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f29529u = c8367u2;
            }
        }

        public AbstractC4531b(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteAdapter$c */
    public static final class C4532c extends C1162m.e<AbstractC4530a> {
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (((com.lingq.p055ui.review.ReviewSessionCompleteAdapter.AbstractC4530a.c) r7).f29526a == ((com.lingq.p055ui.review.ReviewSessionCompleteAdapter.AbstractC4530a.c) r8).f29526a) goto L22;
         */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo480a(AbstractC4530a abstractC4530a, AbstractC4530a abstractC4530a2) {
            AbstractC4530a abstractC4530a3 = abstractC4530a;
            AbstractC4530a abstractC4530a4 = abstractC4530a2;
            if (abstractC4530a3 instanceof AbstractC4530a.a) {
                if (abstractC4530a4 instanceof AbstractC4530a.a) {
                    AbstractC4530a.a aVar = (AbstractC4530a.a) abstractC4530a3;
                    AbstractC4530a.a aVar2 = (AbstractC4530a.a) abstractC4530a4;
                    if (aVar.f29521a == aVar2.f29521a && aVar.f29522b == aVar2.f29522b) {
                        return true;
                    }
                }
                return false;
            }
            if (abstractC4530a3 instanceof AbstractC4530a.b) {
                if (abstractC4530a4 instanceof AbstractC4530a.b) {
                    return C5207g.m11106a(((AbstractC4530a.b) abstractC4530a3).f29523a, ((AbstractC4530a.b) abstractC4530a4).f29523a);
                }
            } else {
                if (!(abstractC4530a3 instanceof AbstractC4530a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (abstractC4530a4 instanceof AbstractC4530a.c) {
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(AbstractC4530a abstractC4530a, AbstractC4530a abstractC4530a2) {
            return abstractC4530a.getClass() == abstractC4530a2.getClass();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteAdapter$d */
    public interface InterfaceC4533d {
        /* JADX INFO: renamed from: a */
        void mo10242a(C7374a c7374a, int i10, Integer num, View view);
    }

    public ReviewSessionCompleteAdapter(InterfaceC7774a interfaceC7774a, ReviewSessionCompleteFragment$onViewCreated$adapter$2 reviewSessionCompleteFragment$onViewCreated$adapter$2) {
        super(new C4532c());
        this.f29519e = interfaceC7774a;
        this.f29520f = reviewSessionCompleteFragment$onViewCreated$adapter$2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC4530a abstractC4530aM4528p = m4528p(i10);
        if (abstractC4530aM4528p instanceof AbstractC4530a.b) {
            return AdapterItemType.TermStudied.ordinal();
        }
        if (abstractC4530aM4528p instanceof AbstractC4530a.a) {
            return AdapterItemType.Header.ordinal();
        }
        if (abstractC4530aM4528p instanceof AbstractC4530a.c) {
            return AdapterItemType.Title.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        AbstractC4531b abstractC4531b = (AbstractC4531b) abstractC1109b0;
        if (abstractC4531b instanceof AbstractC4531b.b) {
            AbstractC4530a abstractC4530aM4528p = m4528p(i10);
            C5207g.m11109d(abstractC4530aM4528p, "null cannot be cast to non-null type com.lingq.ui.review.ReviewSessionCompleteAdapter.AdapterItem.Header");
            AbstractC4530a.a aVar = (AbstractC4530a.a) abstractC4530aM4528p;
            C0009a.m32u(new Object[]{Integer.valueOf(aVar.f29521a), Integer.valueOf(aVar.f29522b)}, 2, Locale.getDefault(), "%d/%d", "format(locale, format, *args)", ((AbstractC4531b.b) abstractC4531b).f29528u.f44629a);
            return;
        }
        if (abstractC4531b instanceof AbstractC4531b.c) {
            AbstractC4530a abstractC4530aM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC4530aM4528p2, "null cannot be cast to non-null type com.lingq.ui.review.ReviewSessionCompleteAdapter.AdapterItem.Title");
            AbstractC4531b.c cVar = (AbstractC4531b.c) abstractC4531b;
            cVar.f29529u.f45316b.setText(cVar.f7054a.getContext().getString(((AbstractC4530a.c) abstractC4530aM4528p2).f29526a));
            return;
        }
        if (abstractC4531b instanceof AbstractC4531b.a) {
            AbstractC4530a abstractC4530aM4528p3 = m4528p(i10);
            C5207g.m11109d(abstractC4530aM4528p3, "null cannot be cast to non-null type com.lingq.ui.review.ReviewSessionCompleteAdapter.AdapterItem.TermStudied");
            AbstractC4530a.b bVar = (AbstractC4530a.b) abstractC4530aM4528p3;
            AbstractC4531b.a aVar2 = (AbstractC4531b.a) abstractC4531b;
            C7374a c7374a = bVar.f29523a;
            C5207g.m11111f(c7374a, "token");
            C8388y3 c8388y3 = aVar2.f29527u;
            c8388y3.f45487g.setText(c7374a.f41142a);
            TokenMeaning tokenMeaning = (TokenMeaning) C6752c.m13425S(c7374a.f41146e);
            c8388y3.f45485e.setText(tokenMeaning != null ? tokenMeaning.f22090c : null);
            int i11 = c7374a.f41150i;
            Integer num = c7374a.f41151j;
            int iM11568a = C5408a.m11568a(i11, num);
            int value = CardStatus.Ignored.getValue();
            TextView textView = c8388y3.f45486f;
            ImageButton imageButton = c8388y3.f45482b;
            View view = aVar2.f7054a;
            if (iM11568a == value || iM11568a == CardStatus.Known.getValue()) {
                C5207g.m11110e(textView, "tvStatus");
                C4924a.m10422A(textView);
                C5207g.m11110e(imageButton, "ibStatus");
                C4924a.m10457e0(imageButton);
                List<Integer> list = C6716m.f37937a;
                Context context = view.getContext();
                C5207g.m11110e(context, "itemView.context");
                C6716m.m13323h(context, iM11568a, imageButton);
                Context context2 = view.getContext();
                C5207g.m11110e(context2, "itemView.context");
                C4924a.m10455d0(imageButton, C6716m.m13333r(ViewsUtilsKt.m10416b(i11, num), context2));
                imageButton.setActivated(true);
            } else {
                C5207g.m11110e(textView, "tvStatus");
                C4924a.m10457e0(textView);
                C5207g.m11110e(imageButton, "ibStatus");
                C4924a.m10422A(imageButton);
                List<Integer> list2 = C6716m.f37937a;
                C6716m.m13324i(textView, iM11568a);
                Context context3 = view.getContext();
                C5207g.m11110e(context3, "itemView.context");
                C4924a.m10455d0(textView, C6716m.m13333r(ViewsUtilsKt.m10416b(i11, num), context3));
                textView.setActivated(true);
            }
            c8388y3.f45483c.setText(C0141b.m613i(new Object[]{Integer.valueOf(bVar.f29524b)}, 1, Locale.getDefault(), "%d", "format(locale, format, *args)"));
            c8388y3.f45484d.setText(C0141b.m613i(new Object[]{Integer.valueOf(bVar.f29525c)}, 1, Locale.getDefault(), "%d", "format(locale, format, *args)"));
            c8388y3.f45481a.setOnClickListener(new ViewOnClickListenerC9028l(abstractC4531b, this, bVar, 4));
            imageButton.setOnClickListener(new ViewOnClickListenerC9029m(abstractC4531b, 16, this));
            textView.setOnClickListener(new ViewOnClickListenerC9734i(abstractC4531b, 13, this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        RecyclerView.AbstractC1109b0 aVar;
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == AdapterItemType.Header.ordinal()) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_header_review_session, recyclerView, false);
            MaterialCardView materialCardView = (MaterialCardView) viewM849h;
            int i11 = R.id.tv_result;
            TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tv_result);
            if (textView != null) {
                i11 = R.id.tvTitle;
                TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tvTitle);
                if (textView2 != null) {
                    i11 = R.id.viewLesson;
                    LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewM849h, R.id.viewLesson);
                    if (linearLayout != null) {
                        aVar = new AbstractC4531b.b(new C8261c(materialCardView, materialCardView, textView, textView2, linearLayout));
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
        }
        if (i10 != AdapterItemType.Title.ordinal()) {
            if (i10 != AdapterItemType.TermStudied.ordinal()) {
                throw new IllegalStateException();
            }
            View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_item_review_term_studied, recyclerView, false);
            int i12 = R.id.ibStatus;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(viewM849h2, R.id.ibStatus);
            if (imageButton != null) {
                i12 = R.id.tvCorrect;
                TextView textView3 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvCorrect);
                if (textView3 != null) {
                    i12 = R.id.tvIncorrect;
                    TextView textView4 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvIncorrect);
                    if (textView4 != null) {
                        i12 = R.id.tvMeaning;
                        TextView textView5 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvMeaning);
                        if (textView5 != null) {
                            i12 = R.id.tvStatus;
                            TextView textView6 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvStatus);
                            if (textView6 != null) {
                                i12 = R.id.tvTerm;
                                TextView textView7 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvTerm);
                                if (textView7 != null) {
                                    aVar = new AbstractC4531b.a(new C8388y3((ConstraintLayout) viewM849h2, imageButton, textView3, textView4, textView5, textView6, textView7));
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(i12)));
        }
        View viewM849h3 = C0204c.m849h(recyclerView, R.layout.list_header_review_complete_title, recyclerView, false);
        if (viewM849h3 == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView8 = (TextView) viewM849h3;
        aVar = new AbstractC4531b.c(new C8367u2(textView8, textView8, 0));
        return aVar;
    }
}
