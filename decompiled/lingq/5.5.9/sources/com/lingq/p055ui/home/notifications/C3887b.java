package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.commons.p053ui.AdapterItemType;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import com.linguist.R;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p003a2.C0009a;
import p199jd.ViewOnClickListenerC6464i;
import p278nh.InterfaceC7774a;
import ph.C8259b3;
import ph.C8387y2;

/* JADX INFO: renamed from: com.lingq.ui.home.notifications.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3887b extends AbstractC1170u<a, b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<LanguageToLearn> f25392e;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.b$a */
    public static abstract class a {

        /* JADX INFO: renamed from: com.lingq.ui.home.notifications.b$a$a, reason: collision with other inner class name */
        public static final class C10625a extends a {

            /* JADX INFO: renamed from: a */
            public final LanguageToLearn f25393a;

            /* JADX INFO: renamed from: b */
            public final boolean f25394b = false;

            public C10625a(LanguageToLearn languageToLearn) {
                this.f25393a = languageToLearn;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10625a)) {
                    return false;
                }
                C10625a c10625a = (C10625a) obj;
                return C5207g.m11106a(this.f25393a, c10625a.f25393a) && this.f25394b == c10625a.f25394b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3 */
            public final int hashCode() {
                int iHashCode = this.f25393a.hashCode() * 31;
                boolean z10 = this.f25394b;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return iHashCode + r10;
            }

            public final String toString() {
                return "Content(language=" + this.f25393a + ", shouldShowKnownWords=" + this.f25394b + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.notifications.b$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public final String f25395a;

            public b(String str) {
                this.f25395a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C5207g.m11106a(this.f25395a, ((b) obj).f25395a);
            }

            public final int hashCode() {
                return this.f25395a.hashCode();
            }

            public final String toString() {
                return C0009a.m23l(new StringBuilder("Header(header="), this.f25395a, ")");
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.b$b */
    public static abstract class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.notifications.b$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: u */
            public final C8259b3 f25396u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8259b3 c8259b3) {
                RelativeLayout relativeLayoutM16400b = c8259b3.m16400b();
                C5207g.m11110e(relativeLayoutM16400b, "binding.root");
                super(relativeLayoutM16400b);
                this.f25396u = c8259b3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.notifications.b$b$b, reason: collision with other inner class name */
        public static final class C10626b extends b {

            /* JADX INFO: renamed from: u */
            public final C8387y2 f25397u;

            /* JADX WARN: Illegal instructions before constructor call */
            public C10626b(C8387y2 c8387y2) {
                LinearLayout linearLayout = (LinearLayout) c8387y2.f45479a;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f25397u = c8387y2;
            }
        }

        public b(ViewGroup viewGroup) {
            super(viewGroup);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.b$c */
    public static final class c extends C1162m.e<a> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            if (aVar3 instanceof a.C10625a) {
                if (aVar4 instanceof a.C10625a) {
                    return C5207g.m11106a(((a.C10625a) aVar3).f25393a, ((a.C10625a) aVar4).f25393a);
                }
            } else {
                if (!(aVar3 instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (aVar4 instanceof a.b) {
                    return C5207g.m11106a(((a.b) aVar3).f25395a, ((a.b) aVar4).f25395a);
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            if (aVar3 instanceof a.C10625a) {
                return aVar4 instanceof a.C10625a;
            }
            if (aVar3 instanceof a.b) {
                return aVar4 instanceof a.b;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C3887b(NotificationsSettingsFragment.C3872a c3872a) {
        super(new c());
        this.f25392e = c3872a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        a aVarM4528p = m4528p(i10);
        if (aVarM4528p instanceof a.C10625a) {
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
            if (bVar instanceof b.C10626b) {
                a aVarM4528p = m4528p(i10);
                C5207g.m11109d(aVarM4528p, "null cannot be cast to non-null type com.lingq.ui.home.notifications.NotificationsSettingsAdapter.AdapterItem.Header");
                String str = ((a.b) aVarM4528p).f25395a;
                C5207g.m11111f(str, "title");
                ((TextView) ((b.C10626b) bVar).f25397u.f45480b).setText(str);
                return;
            }
            return;
        }
        a aVarM4528p2 = m4528p(i10);
        C5207g.m11109d(aVarM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.notifications.NotificationsSettingsAdapter.AdapterItem.Content");
        a.C10625a c10625a = (a.C10625a) aVarM4528p2;
        LanguageToLearn languageToLearn = c10625a.f25393a;
        C5207g.m11111f(languageToLearn, "language");
        C8259b3 c8259b3 = ((b.a) bVar).f25396u;
        ((TextView) c8259b3.f44617b).setText(languageToLearn.f21683c);
        c8259b3.m16400b().setOnClickListener(new ViewOnClickListenerC6464i(this, 11, c10625a));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        RecyclerView.AbstractC1109b0 c10626b;
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == AdapterItemType.Content.ordinal()) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_notification_language, recyclerView, false);
            int i11 = R.id.ivCollapse;
            ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.ivCollapse);
            if (imageView != null) {
                i11 = R.id.tvLanguage;
                TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvLanguage);
                if (textView != null) {
                    c10626b = new b.a(new C8259b3(2, imageView, (RelativeLayout) viewM849h, textView));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
        }
        if (i10 != AdapterItemType.Header.ordinal()) {
            throw new IllegalStateException();
        }
        View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_header_generic_large_title, recyclerView, false);
        TextView textView2 = (TextView) C0062b.m298P0(viewM849h2, R.id.tv_title);
        if (textView2 == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(R.id.tv_title)));
        }
        c10626b = new b.C10626b(new C8387y2((LinearLayout) viewM849h2, textView2));
        return c10626b;
    }
}
