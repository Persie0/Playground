package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;
import p278nh.InterfaceC7774a;
import ph.C8382x2;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4902a extends AbstractC1170u<a, c> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<UserDictionaryData> f31900e;

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final UserDictionaryData f31901a;

        /* JADX INFO: renamed from: b */
        public final boolean f31902b;

        public a(UserDictionaryData userDictionaryData, boolean z10) {
            C5207g.m11111f(userDictionaryData, "userDictionaryData");
            this.f31901a = userDictionaryData;
            this.f31902b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f31901a, aVar.f31901a) && this.f31902b == aVar.f31902b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public final int hashCode() {
            int iHashCode = this.f31901a.hashCode() * 31;
            boolean z10 = this.f31902b;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            return "AdapterItem(userDictionaryData=" + this.f31901a + ", showLocale=" + this.f31902b + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.a$b */
    public static final class b extends C1162m.e<a> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            return C5207g.m11106a(aVar3.f31901a.f21704b, aVar4.f31901a.f21704b) && aVar3.f31902b == aVar4.f31902b;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(a aVar, a aVar2) {
            return aVar.f31901a.f21703a == aVar2.f31901a.f21703a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.a$c */
    public static final class c extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8382x2 f31903u;

        public c(C8382x2 c8382x2) {
            super(c8382x2.m16418a());
            this.f31903u = c8382x2;
        }
    }

    public C4902a(InterfaceC7774a<UserDictionaryData> interfaceC7774a) {
        super(new b());
        this.f31900e = interfaceC7774a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        c cVar = (c) abstractC1109b0;
        a aVarM4528p = m4528p(i10);
        UserDictionaryData userDictionaryData = aVarM4528p.f31901a;
        C5207g.m11111f(userDictionaryData, "dictionary");
        C8382x2 c8382x2 = cVar.f31903u;
        ((TextView) c8382x2.f45464b).setText(userDictionaryData.m9702a());
        ImageView imageView = (ImageView) c8382x2.f45466d;
        imageView.setVisibility(aVarM4528p.f31902b ? 0 : 8);
        List<Integer> list = C6716m.f37937a;
        C6716m.m13326k(imageView, userDictionaryData.f21709g, 0.0f);
        cVar.f7054a.setOnClickListener(new ViewOnClickListenerC9734i(cVar, 20, this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_dictionary, recyclerView, false);
        int i11 = R.id.ivLocale;
        ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.ivLocale);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) viewM849h;
            TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvDictionary);
            if (textView != null) {
                return new c(new C8382x2(relativeLayout, imageView, relativeLayout, textView));
            }
            i11 = R.id.tvDictionary;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
    }
}
