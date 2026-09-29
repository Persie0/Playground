package tj;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2089k;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.bumptech.glide.ComponentCallbacks2C2090l;
import com.bumptech.glide.manager.C2158n;
import com.bumptech.glide.manager.InterfaceC2151g;
import com.lingq.shared.uimodel.LearningLevel;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0009a;
import p171i6.C6202g;
import p225kk.C6716m;
import p254m2.C7472a;
import p258m6.C7492l;
import p278nh.AbstractC7790q;
import p278nh.InterfaceC7774a;
import p326q.C8446b;
import p392t5.AbstractC9200f;
import va.ViewOnClickListenerC9693g;

/* JADX INFO: renamed from: tj.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9294d extends AbstractC7790q<a> {

    /* JADX INFO: renamed from: e */
    public InterfaceC7774a<a> f48010e;

    /* JADX INFO: renamed from: tj.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f48011a;

        /* JADX INFO: renamed from: b */
        public final String f48012b;

        public a(String str, String str2) {
            C5207g.m11111f(str, "code");
            this.f48011a = str;
            this.f48012b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C5207g.m11106a(this.f48011a, aVar.f48011a) && C5207g.m11106a(this.f48012b, aVar.f48012b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f48012b.hashCode() + (this.f48011a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LevelItem(code=");
            sb2.append(this.f48011a);
            sb2.append(", desc=");
            return C0009a.m23l(sb2, this.f48012b, ")");
        }
    }

    /* JADX INFO: renamed from: tj.d$b */
    public static final class b extends AbstractC7790q.a {

        /* JADX INFO: renamed from: u */
        public final ImageView f48013u;

        /* JADX INFO: renamed from: v */
        public final TextView f48014v;

        public b(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.iv_btn);
            C5207g.m11110e(viewFindViewById, "itemView.findViewById(R.id.iv_btn)");
            this.f48013u = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_btn);
            C5207g.m11110e(viewFindViewById2, "itemView.findViewById(R.id.tv_btn)");
            this.f48014v = (TextView) viewFindViewById2;
        }
    }

    public C9294d(Context context) {
        this.f42818d = new ArrayList<>();
        ArrayList<AbstractC7790q.b> arrayListM15496q = m15496q();
        String serverName = LearningLevel.Beginner1.getServerName();
        List<Integer> list = C6716m.f37937a;
        arrayListM15496q.add(new AbstractC7790q.b(0, new a(serverName, C6716m.m13319d(R.string.levels_beginner, context))));
        m15496q().add(new AbstractC7790q.b(0, new a(LearningLevel.Intermediate1.getServerName(), C6716m.m13319d(R.string.levels_intermediate, context))));
        m15496q().add(new AbstractC7790q.b(0, new a(LearningLevel.Advanced1.getServerName(), C6716m.m13319d(R.string.levels_advanced, context))));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return m15496q().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        ComponentCallbacks2C2090l componentCallbacks2C2090lM6375f;
        AbstractC7790q.a aVar = (AbstractC7790q.a) abstractC1109b0;
        b bVar = (b) aVar;
        Object obj = m15495p(i10).f42820b;
        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.ui.onboarding.adapters.ChooseLevelAdapter.LevelItem");
        a aVar2 = (a) obj;
        View view = bVar.f7054a;
        Context context = view.getContext();
        int identifier = view.getContext().getResources().getIdentifier("ic_onboarding_level_" + aVar2.f48011a, "drawable", view.getContext().getPackageName());
        Object obj2 = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(context, identifier);
        C2158n c2158nM6236b = ComponentCallbacks2C2080b.m6236b(view.getContext());
        c2158nM6236b.getClass();
        if (C7492l.m14887h()) {
            componentCallbacks2C2090lM6375f = c2158nM6236b.m6375f(view.getContext().getApplicationContext());
        } else {
            if (view.getContext() == null) {
                throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
            }
            Activity activityM6370a = C2158n.m6370a(view.getContext());
            if (activityM6370a == null) {
                componentCallbacks2C2090lM6375f = c2158nM6236b.m6375f(view.getContext().getApplicationContext());
            } else {
                boolean z10 = activityM6370a instanceof ActivityC0979t;
                InterfaceC2151g interfaceC2151g = c2158nM6236b.f10878h;
                if (z10) {
                    ActivityC0979t activityC0979t = (ActivityC0979t) activityM6370a;
                    C8446b<View, Fragment> c8446b = c2158nM6236b.f10876f;
                    c8446b.clear();
                    C2158n.m6372c(activityC0979t.m3805K().m3620H(), c8446b);
                    View viewFindViewById = activityC0979t.findViewById(android.R.id.content);
                    Fragment orDefault = null;
                    while (!view.equals(viewFindViewById) && (orDefault = c8446b.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    c8446b.clear();
                    if (orDefault == null) {
                        componentCallbacks2C2090lM6375f = c2158nM6236b.m6376g(activityC0979t);
                    } else {
                        if (orDefault.mo471m() == null) {
                            throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
                        }
                        if (C7492l.m14887h()) {
                            componentCallbacks2C2090lM6375f = c2158nM6236b.m6375f(orDefault.mo471m().getApplicationContext());
                        } else {
                            if (orDefault.m3582e() != null) {
                                orDefault.m3582e();
                                interfaceC2151g.mo6367o();
                            }
                            FragmentManager fragmentManagerM3594l = orDefault.m3594l();
                            Context contextMo471m = orDefault.mo471m();
                            componentCallbacks2C2090lM6375f = c2158nM6236b.f10879i.m6368a(contextMo471m, ComponentCallbacks2C2080b.m6235a(contextMo471m.getApplicationContext()), orDefault.f6112l0, fragmentManagerM3594l, orDefault.m3557B());
                        }
                    }
                } else {
                    C8446b<View, android.app.Fragment> c8446b2 = c2158nM6236b.f10877g;
                    c8446b2.clear();
                    C2158n.m6371b(activityM6370a.getFragmentManager(), c8446b2);
                    View viewFindViewById2 = activityM6370a.findViewById(android.R.id.content);
                    android.app.Fragment orDefault2 = null;
                    while (!view.equals(viewFindViewById2) && (orDefault2 = c8446b2.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    c8446b2.clear();
                    if (orDefault2 == null) {
                        componentCallbacks2C2090lM6375f = c2158nM6236b.m6374e(activityM6370a);
                    } else {
                        if (orDefault2.getActivity() == null) {
                            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
                        }
                        if (C7492l.m14887h()) {
                            componentCallbacks2C2090lM6375f = c2158nM6236b.m6375f(orDefault2.getActivity().getApplicationContext());
                        } else {
                            if (orDefault2.getActivity() != null) {
                                orDefault2.getActivity();
                                interfaceC2151g.mo6367o();
                            }
                            componentCallbacks2C2090lM6375f = c2158nM6236b.m6373d(orDefault2.getActivity(), orDefault2.getChildFragmentManager(), orDefault2, orDefault2.isVisible());
                        }
                    }
                }
            }
        }
        componentCallbacks2C2090lM6375f.getClass();
        new C2089k(componentCallbacks2C2090lM6375f.f10589a, componentCallbacks2C2090lM6375f, Drawable.class, componentCallbacks2C2090lM6375f.f10590b).m6247G(drawableM14849b).m6242A(new C6202g().m12718f(AbstractC9200f.f47748a)).m6245E(bVar.f48013u);
        bVar.f48014v.setText(aVar2.f48012b);
        aVar.f7054a.setOnClickListener(new ViewOnClickListenerC9693g(i10, 2, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.list_item_onboarding_level, (ViewGroup) recyclerView, false);
        C5207g.m11110e(viewInflate, "from(parent.context)\n   …ing_level, parent, false)");
        return new b(viewInflate);
    }
}
