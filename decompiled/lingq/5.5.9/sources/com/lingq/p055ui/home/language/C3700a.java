package com.lingq.p055ui.home.language;

import ae.C0062b;
import android.content.Context;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.commons.p053ui.AdapterItemType;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import p003a2.C0009a;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import p278nh.InterfaceC7774a;
import ph.C8253a3;
import ph.C8367u2;

/* JADX INFO: renamed from: com.lingq.ui.home.language.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3700a extends AbstractC1170u<a, b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<LanguageToLearn> f24213e;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.a$a */
    public static abstract class a {

        /* JADX INFO: renamed from: com.lingq.ui.home.language.a$a$a, reason: collision with other inner class name */
        public static final class C10621a extends a {

            /* JADX INFO: renamed from: a */
            public final LanguageToLearn f24214a;

            /* JADX INFO: renamed from: b */
            public final boolean f24215b;

            public C10621a(LanguageToLearn languageToLearn, boolean z10) {
                C5207g.m11111f(languageToLearn, "language");
                this.f24214a = languageToLearn;
                this.f24215b = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10621a)) {
                    return false;
                }
                C10621a c10621a = (C10621a) obj;
                if (C5207g.m11106a(this.f24214a, c10621a.f24214a) && this.f24215b == c10621a.f24215b) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3 */
            public final int hashCode() {
                int iHashCode = this.f24214a.hashCode() * 31;
                boolean z10 = this.f24215b;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return iHashCode + r10;
            }

            public final String toString() {
                return "Content(language=" + this.f24214a + ", shouldShowKnownWords=" + this.f24215b + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.language.a$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public final int f24216a;

            public b(int i10) {
                this.f24216a = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f24216a == ((b) obj).f24216a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f24216a);
            }

            public final String toString() {
                return C0166e.m768o(new StringBuilder("Header(header="), this.f24216a, ")");
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.language.a$b */
    public static abstract class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.language.a$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: u */
            public final C8253a3 f24217u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8253a3 c8253a3) {
                RelativeLayout relativeLayout = (RelativeLayout) c8253a3.f44570b;
                C5207g.m11110e(relativeLayout, "binding.root");
                super(relativeLayout);
                this.f24217u = c8253a3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.language.a$b$b, reason: collision with other inner class name */
        public static final class C10622b extends b {

            /* JADX INFO: renamed from: u */
            public final C8367u2 f24218u;

            /* JADX WARN: Illegal instructions before constructor call */
            public C10622b(C8367u2 c8367u2) {
                TextView textView = c8367u2.f45315a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f24218u = c8367u2;
            }
        }

        public b(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.language.a$c */
    public static final class c extends C1162m.e<a> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            if (aVar3 instanceof a.C10621a) {
                if (aVar4 instanceof a.C10621a) {
                    return C5207g.m11106a(((a.C10621a) aVar3).f24214a, ((a.C10621a) aVar4).f24214a);
                }
            } else {
                if (!(aVar3 instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if ((aVar4 instanceof a.b) && ((a.b) aVar3).f24216a == ((a.b) aVar4).f24216a) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(a aVar, a aVar2) {
            return C5207g.m11106a(aVar, aVar2);
        }
    }

    public C3700a(InterfaceC7774a<LanguageToLearn> interfaceC7774a) {
        super(new c());
        this.f24213e = interfaceC7774a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        a aVarM4528p = m4528p(i10);
        if (aVarM4528p instanceof a.C10621a) {
            return AdapterItemType.Content.ordinal();
        }
        if (aVarM4528p instanceof a.b) {
            return AdapterItemType.Header.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        b bVar = (b) abstractC1109b0;
        if (!(bVar instanceof b.a)) {
            if (bVar instanceof b.C10622b) {
                a aVarM4528p = m4528p(i10);
                C5207g.m11109d(aVarM4528p, "null cannot be cast to non-null type com.lingq.ui.home.language.LanguageSelectorAdapter.AdapterItem.Header");
                b.C10622b c10622b = (b.C10622b) bVar;
                c10622b.f24218u.f45316b.setText(c10622b.f7054a.getContext().getString(((a.b) aVarM4528p).f24216a));
            }
            return;
        }
        a aVarM4528p2 = m4528p(i10);
        C5207g.m11109d(aVarM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.language.LanguageSelectorAdapter.AdapterItem.Content");
        a.C10621a c10621a = (a.C10621a) aVarM4528p2;
        b.a aVar = (b.a) bVar;
        LanguageToLearn languageToLearn = c10621a.f24214a;
        C5207g.m11111f(languageToLearn, "language");
        List<Integer> list = C6716m.f37937a;
        C8253a3 c8253a3 = aVar.f24217u;
        ImageView imageView = (ImageView) c8253a3.f44571c;
        String str = languageToLearn.f21681a;
        C6716m.m13326k(imageView, str, 1.0f);
        TextView textView = (TextView) c8253a3.f44572d;
        Context context = aVar.f7054a.getContext();
        C5207g.m11110e(context, "itemView.context");
        textView.setText(C4924a.m10439R(context, str));
        boolean z10 = c10621a.f24215b;
        TextView textView2 = c8253a3.f44569a;
        if (z10) {
            C0009a.m32u(new Object[]{Integer.valueOf(languageToLearn.f21684d)}, 1, Locale.getDefault(), "(%d)", "format(locale, format, *args)", textView2);
        } else {
            textView2.setText("");
        }
        ((RelativeLayout) c8253a3.f44570b).setOnClickListener(new ViewOnClickListenerC6464i(bVar, 3, this));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        RecyclerView.AbstractC1109b0 c10622b;
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == AdapterItemType.Content.ordinal()) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_language, recyclerView, false);
            int i11 = R.id.iv_language;
            ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.iv_language);
            if (imageView != null) {
                i11 = R.id.tv_known_words;
                TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tv_known_words);
                if (textView != null) {
                    i11 = R.id.tv_language;
                    TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tv_language);
                    if (textView2 != null) {
                        i11 = R.id.viewFlag;
                        FrameLayout frameLayout = (FrameLayout) C0062b.m298P0(viewM849h, R.id.viewFlag);
                        if (frameLayout != null) {
                            c10622b = new b.a(new C8253a3((RelativeLayout) viewM849h, imageView, textView, textView2, frameLayout));
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
        }
        if (i10 != AdapterItemType.Header.ordinal()) {
            throw new IllegalStateException();
        }
        View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_header_language_selector, recyclerView, false);
        if (viewM849h2 == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView3 = (TextView) viewM849h2;
        c10622b = new b.C10622b(new C8367u2(textView3, textView3, 1));
        return c10622b;
    }
}
