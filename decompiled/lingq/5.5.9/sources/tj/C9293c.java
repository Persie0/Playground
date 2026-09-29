package tj;

import android.content.Context;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import p096ei.C5408a;
import p245lj.ViewOnClickListenerC7382c;
import p278nh.AbstractC7790q;
import p278nh.InterfaceC7774a;

/* JADX INFO: renamed from: tj.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9293c extends AbstractC7790q<a> {

    /* JADX INFO: renamed from: e */
    public InterfaceC7774a<a> f48004e;

    /* JADX INFO: renamed from: tj.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f48005a;

        /* JADX INFO: renamed from: b */
        public final String f48006b;

        /* JADX INFO: renamed from: c */
        public final boolean f48007c;

        public a(String str, String str2) {
            C5207g.m11111f(str2, "language");
            this.f48005a = str;
            this.f48006b = str2;
            this.f48007c = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f48005a, aVar.f48005a) && C5207g.m11106a(this.f48006b, aVar.f48006b) && this.f48007c == aVar.f48007c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int iM758d = C0166e.m758d(this.f48006b, this.f48005a.hashCode() * 31, 31);
            boolean z10 = this.f48007c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iM758d + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LanguageItem(code=");
            sb2.append(this.f48005a);
            sb2.append(", language=");
            sb2.append(this.f48006b);
            sb2.append(", isBeta=");
            return C0166e.m769p(sb2, this.f48007c, ")");
        }
    }

    /* JADX INFO: renamed from: tj.c$b */
    public static final class b extends AbstractC7790q.a {
        public b(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: tj.c$c */
    public static final class c extends AbstractC7790q.a {

        /* JADX INFO: renamed from: u */
        public final ImageView f48008u;

        /* JADX INFO: renamed from: v */
        public final TextView f48009v;

        public c(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.iv_btn);
            C5207g.m11110e(viewFindViewById, "itemView.findViewById(R.id.iv_btn)");
            this.f48008u = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_btn);
            C5207g.m11110e(viewFindViewById2, "itemView.findViewById(R.id.tv_btn)");
            this.f48009v = (TextView) viewFindViewById2;
        }
    }

    public C9293c(Context context) {
        this.f42818d = new ArrayList<>();
        for (LanguageLearn languageLearn : LanguageLearn.values()) {
            m15496q().add(new AbstractC7790q.b(0, new a(C5408a.m11569b(languageLearn), C4924a.m10439R(context, C5408a.m11569b(languageLearn)))));
        }
        m15496q().add(new AbstractC7790q.b(1, context.getString(R.string.ui_more)));
        for (LanguageLearnBeta languageLearnBeta : LanguageLearnBeta.values()) {
            m15496q().add(new AbstractC7790q.b(0, new a(C5408a.m11570c(languageLearnBeta), C4924a.m10439R(context, C5408a.m11570c(languageLearnBeta)))));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return m15496q().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        AbstractC7790q.a aVar = (AbstractC7790q.a) abstractC1109b0;
        int i11 = aVar.f7059f;
        View view = aVar.f7054a;
        if (i11 != 0) {
            ((TextView) view.findViewById(R.id.tv_title)).setText((String) m15495p(i10).f42820b);
            view.findViewById(R.id.tv_title);
            return;
        }
        c cVar = (c) aVar;
        Object obj = m15495p(i10).f42820b;
        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.ui.onboarding.adapters.ChooseLanguageAdapter.LanguageItem");
        a aVar2 = (a) obj;
        String strM11570c = C5408a.m11570c(LanguageLearnBeta.ChineseTraditional);
        String str = aVar2.f48005a;
        if (C5207g.m11106a(str, strM11570c)) {
            str = "zh_t";
        }
        View view2 = cVar.f7054a;
        int identifier = view2.getContext().getResources().getIdentifier(C0204c.m852k("ic_flag_", str), "drawable", view2.getContext().getPackageName());
        ImageView imageView = cVar.f48008u;
        if (identifier != 0) {
            ComponentCallbacks2C2080b.m6238e(view2.getContext()).m6258n(Integer.valueOf(identifier)).m12716c().m6245E(imageView);
        } else {
            ComponentCallbacks2C2080b.m6238e(view2.getContext()).m6258n(Integer.valueOf(R.drawable.ic_none)).m12716c().m6245E(imageView);
        }
        cVar.f48009v.setText(aVar2.f48006b);
        view.setOnClickListener(new ViewOnClickListenerC7382c(i10, 1, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == 0) {
            View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.list_item_onboarding_language, (ViewGroup) recyclerView, false);
            C5207g.m11110e(viewInflate, "from(parent.context)\n   …_language, parent, false)");
            return new c(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.list_header_generic_title, (ViewGroup) recyclerView, false);
        C5207g.m11110e(viewInflate2, "from(parent.context)\n   …ric_title, parent, false)");
        return new b(viewInflate2);
    }
}
