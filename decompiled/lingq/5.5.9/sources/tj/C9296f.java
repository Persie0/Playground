package tj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.google.android.material.card.MaterialCardView;
import com.lingq.shared.uimodel.FeedTopic;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import dm.C5213m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C6752c;
import p096ei.C5408a;
import p225kk.C6716m;
import p254m2.C7472a;
import p278nh.AbstractC7790q;
import p278nh.InterfaceC7774a;
import sj.C9050i;

/* JADX INFO: renamed from: tj.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C9296f extends AbstractC7790q<a> {

    /* JADX INFO: renamed from: e */
    public InterfaceC7774a<a> f48017e;

    /* JADX INFO: renamed from: f */
    public final Set<String> f48018f;

    /* JADX INFO: renamed from: tj.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f48019a;

        /* JADX INFO: renamed from: b */
        public final String f48020b;

        /* JADX INFO: renamed from: c */
        public boolean f48021c;

        public a(String str, String str2, boolean z10) {
            this.f48019a = str;
            this.f48020b = str2;
            this.f48021c = z10;
        }
    }

    /* JADX INFO: renamed from: tj.f$b */
    public static final class b extends AbstractC7790q.a {

        /* JADX INFO: renamed from: u */
        public final ImageView f48022u;

        /* JADX INFO: renamed from: v */
        public final TextView f48023v;

        /* JADX INFO: renamed from: w */
        public final MaterialCardView f48024w;

        public b(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.iv_btn);
            C5207g.m11110e(viewFindViewById, "itemView.findViewById(R.id.iv_btn)");
            this.f48022u = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_btn);
            C5207g.m11110e(viewFindViewById2, "itemView.findViewById(R.id.tv_btn)");
            this.f48023v = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.container);
            C5207g.m11110e(viewFindViewById3, "itemView.findViewById(R.id.container)");
            this.f48024w = (MaterialCardView) viewFindViewById3;
        }
    }

    public C9296f(Context context) {
        this.f48018f = new LinkedHashSet();
        this.f42818d = new ArrayList<>();
        this.f48018f = C9050i.f47334d;
        for (FeedTopic feedTopic : FeedTopic.values()) {
            m15496q().add(new AbstractC7790q.b(0, new a(C4924a.m10467j0(feedTopic, context), C5408a.m11574g(feedTopic), this.f48018f.contains(C5408a.m11574g(feedTopic)))));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return m15496q().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, final int i10) {
        int iM14851a;
        AbstractC7790q.a aVar = (AbstractC7790q.a) abstractC1109b0;
        b bVar = (b) aVar;
        Object obj = m15495p(i10).f42820b;
        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.ui.onboarding.adapters.ChooseTopicsAdapter.TopicItem");
        a aVar2 = (a) obj;
        boolean z10 = aVar2.f48021c;
        View view = bVar.f7054a;
        if (z10) {
            List<Integer> list = C6716m.f37937a;
            Context context = view.getContext();
            C5207g.m11110e(context, "itemView.context");
            iM14851a = C6716m.m13333r(R.attr.primaryTextColor, context);
        } else {
            Context context2 = view.getContext();
            Object obj2 = C7472a.f41322a;
            iM14851a = C7472a.d.m14851a(context2, android.R.color.transparent);
        }
        bVar.f48024w.setStrokeColor(iM14851a);
        try {
            int identifier = view.getContext().getResources().getIdentifier("ic_" + aVar2.f48020b, "drawable", view.getContext().getPackageName());
            ImageView imageView = bVar.f48022u;
            if (identifier != 0) {
                ComponentCallbacks2C2080b.m6238e(view.getContext()).m6258n(Integer.valueOf(identifier)).m12716c().m6245E(imageView);
            } else {
                ComponentCallbacks2C2080b.m6238e(view.getContext()).m6258n(Integer.valueOf(R.drawable.ic_none)).m12716c().m6245E(imageView);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        bVar.f48023v.setText(aVar2.f48019a);
        aVar.f7054a.setOnClickListener(new View.OnClickListener() { // from class: tj.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterfaceC7774a<C9296f.a> interfaceC7774a;
                C9296f c9296f = this.f48015a;
                C5207g.m11111f(c9296f, "this$0");
                int i11 = i10;
                C9296f.a aVar3 = (C9296f.a) c9296f.m15495p(i11).f42820b;
                String str = aVar3 != null ? aVar3.f48020b : null;
                Set<String> set = c9296f.f48018f;
                boolean zM13415I = C6752c.m13415I(set, str);
                RecyclerView.C1113f c1113f = c9296f.f7040a;
                if (zM13415I) {
                    if (aVar3 != null) {
                        aVar3.f48021c = false;
                    }
                    String str2 = aVar3 != null ? aVar3.f48020b : null;
                    C5213m.m11196a(set);
                    set.remove(str2);
                    c1113f.m4261d(i11, 1, null);
                } else {
                    if (aVar3 != null) {
                        aVar3.f48021c = true;
                    }
                    String str3 = aVar3 != null ? aVar3.f48020b : null;
                    C5207g.m11108c(str3);
                    set.add(str3);
                    c1113f.m4261d(i11, 1, null);
                }
                if (aVar3 != null && (interfaceC7774a = c9296f.f48017e) != null) {
                    interfaceC7774a.mo9795a(aVar3);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.list_item_onboarding_topic, (ViewGroup) recyclerView, false);
        C5207g.m11110e(viewInflate, "from(parent.context)\n   …ing_topic, parent, false)");
        return new b(viewInflate);
    }
}
