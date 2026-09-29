package p138gk;

import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.commons.p053ui.AdapterItemType;
import com.lingq.p055ui.token.TokenFragment;
import com.linguist.R;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p067d8.ViewOnClickListenerC5062d0;
import p278nh.InterfaceC7774a;
import p408u6.ViewOnClickListenerC9466e;
import ph.C8367u2;
import ph.C8392z2;

/* JADX INFO: renamed from: gk.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C5817g extends AbstractC1170u<a, b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<String> f35116e;

    /* JADX INFO: renamed from: f */
    public final d f35117f;

    /* JADX INFO: renamed from: gk.g$a */
    public static abstract class a {

        /* JADX INFO: renamed from: gk.g$a$a, reason: collision with other inner class name */
        public static final class C10634a extends a {

            /* JADX INFO: renamed from: a */
            public final String f35118a;

            /* JADX INFO: renamed from: b */
            public final boolean f35119b;

            public C10634a(String str, boolean z10) {
                C5207g.m11111f(str, "tag");
                this.f35118a = str;
                this.f35119b = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10634a)) {
                    return false;
                }
                C10634a c10634a = (C10634a) obj;
                return C5207g.m11106a(this.f35118a, c10634a.f35118a) && this.f35119b == c10634a.f35119b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3 */
            public final int hashCode() {
                int iHashCode = this.f35118a.hashCode() * 31;
                boolean z10 = this.f35119b;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return iHashCode + r10;
            }

            public final String toString() {
                return "Content(tag=" + this.f35118a + ", isGrammarTag=" + this.f35119b + ")";
            }
        }

        /* JADX INFO: renamed from: gk.g$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public final int f35120a = R.string.lingq_tag_noun;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f35120a == ((b) obj).f35120a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f35120a);
            }

            public final String toString() {
                return C0166e.m768o(new StringBuilder("Header(header="), this.f35120a, ")");
            }
        }
    }

    /* JADX INFO: renamed from: gk.g$b */
    public static abstract class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: gk.g$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: u */
            public final C8367u2 f35121u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8367u2 c8367u2) {
                TextView textView = c8367u2.f45315a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f35121u = c8367u2;
            }
        }

        /* JADX INFO: renamed from: gk.g$b$b, reason: collision with other inner class name */
        public static final class C10635b extends b {

            /* JADX INFO: renamed from: u */
            public final C8392z2 f35122u;

            /* JADX WARN: Illegal instructions before constructor call */
            public C10635b(C8392z2 c8392z2) {
                TextView textView = c8392z2.f45505a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f35122u = c8392z2;
            }
        }

        public b(TextView textView) {
            super(textView);
        }
    }

    /* JADX INFO: renamed from: gk.g$c */
    public static final class c extends C1162m.e<a> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            if (!(aVar3 instanceof a.C10634a)) {
                if (!(aVar3 instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if ((aVar4 instanceof a.b) && ((a.b) aVar3).f35120a == ((a.b) aVar4).f35120a) {
                    return true;
                }
                return false;
            }
            if (aVar4 instanceof a.C10634a) {
                a.C10634a c10634a = (a.C10634a) aVar3;
                a.C10634a c10634a2 = (a.C10634a) aVar4;
                if (C5207g.m11106a(c10634a.f35118a, c10634a2.f35118a) && c10634a.f35119b == c10634a2.f35119b) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            if (aVar3 instanceof a.C10634a) {
                return aVar4 instanceof a.C10634a;
            }
            if (aVar3 instanceof a.b) {
                return aVar4 instanceof a.b;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: gk.g$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo10366a();
    }

    public C5817g(TokenFragment.C4797k c4797k, TokenFragment.C4798l c4798l) {
        super(new c());
        this.f35116e = c4797k;
        this.f35117f = c4798l;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        a aVarM4528p = m4528p(i10);
        if (aVarM4528p instanceof a.C10634a) {
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
        int i11 = 23;
        if (!(bVar instanceof b.a)) {
            if (bVar instanceof b.C10635b) {
                ((b.C10635b) bVar).f35122u.f45505a.setOnClickListener(new ViewOnClickListenerC5062d0(23, this));
            }
            return;
        }
        b.a aVar = (b.a) bVar;
        a aVarM4528p = m4528p(aVar.m4241d());
        C5207g.m11109d(aVarM4528p, "null cannot be cast to non-null type com.lingq.ui.token.adapters.TagsAdapter.AdapterItem.Content");
        a.C10634a c10634a = (a.C10634a) aVarM4528p;
        String str = c10634a.f35118a;
        C5207g.m11111f(str, "tag");
        C8367u2 c8367u2 = aVar.f35121u;
        c8367u2.f45316b.setText(str);
        boolean z10 = c10634a.f35119b;
        TextView textView = c8367u2.f45316b;
        if (z10) {
            textView.setBackgroundResource(R.drawable.dr_tag_filled_bg);
        } else {
            textView.setBackgroundResource(R.drawable.dr_tag_bg);
        }
        c8367u2.f45315a.setOnClickListener(new ViewOnClickListenerC9466e(bVar, i11, this));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        RecyclerView.AbstractC1109b0 c10635b;
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == AdapterItemType.Content.ordinal()) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_tag, recyclerView, false);
            if (viewM849h == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView = (TextView) viewM849h;
            c10635b = new b.a(new C8367u2(textView, textView, 5));
        } else {
            if (i10 != AdapterItemType.Header.ordinal()) {
                throw new IllegalStateException();
            }
            View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_item_tag_add, recyclerView, false);
            if (viewM849h2 == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView2 = (TextView) viewM849h2;
            c10635b = new b.C10635b(new C8392z2(textView2, textView2, 3));
        }
        return c10635b;
    }
}
