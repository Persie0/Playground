package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lug implements lty {
    @Override // p000.lty
    /* JADX INFO: renamed from: a */
    public final void mo15980a(lul lulVar, View view) {
        RecyclerView recyclerView;
        AbstractC0806ls abstractC0806ls;
        int iM1250b;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView2 = (RecyclerView) view;
            lulVar.m16008b("recyclerView_hasFixedSize", recyclerView2.f1130t);
            AbstractC0806ls abstractC0806ls2 = recyclerView2.f1123m;
            if (abstractC0806ls2 != null) {
                lulVar.m16010d("recyclerView_adapter_itemCount", abstractC0806ls2.mo1762a());
                lulVar.m16008b("recyclerView_adapter_hasStableIds", abstractC0806ls2.f39115b);
            }
            AbstractC0809lv abstractC0809lv = recyclerView2.f1068F;
            if (abstractC0809lv != null) {
                lulVar.m16008b("recyclerView_itemAnimator_isRunning", abstractC0809lv.mo11863h());
            }
            try {
                Field declaredField = RecyclerView.class.getDeclaredField("v");
                declaredField.setAccessible(true);
                lulVar.m16008b("recyclerView_mLayoutWasDefered", declaredField.getBoolean(view));
            } catch (ReflectiveOperationException e) {
            }
            try {
                Field declaredField2 = RecyclerView.class.getDeclaredField("af");
                declaredField2.setAccessible(true);
                lulVar.m16010d("recyclerView_mInterceptRequestLayoutDepth", declaredField2.getInt(view));
            } catch (ReflectiveOperationException e2) {
            }
            try {
                Field declaredField3 = RecyclerView.class.getDeclaredField("w");
                declaredField3.setAccessible(true);
                lulVar.m16008b("recyclerView_mLayoutSuppressed", declaredField3.getBoolean(view));
            } catch (ReflectiveOperationException e3) {
            }
        }
        if (view.getParent() instanceof RecyclerView) {
            C0829mo c0829moM1255g = ((RecyclerView) view.getParent()).m1255g(view);
            int i = -1;
            if (c0829moM1255g.f41172r != null && (recyclerView = c0829moM1255g.f41171q) != null && (abstractC0806ls = recyclerView.f1123m) != null && (iM1250b = recyclerView.m1250b(c0829moM1255g)) != -1 && c0829moM1255g.f41172r == abstractC0806ls) {
                i = iM1250b;
            }
            lulVar.m16010d("recyclerView_viewHolder_adapterPosition", i);
            lulVar.m16010d("recyclerView_viewHolder_layoutPosition", c0829moM1255g.m16675b());
            lulVar.m16007a("recyclerView_viewHolder_itemId", Long.toString(c0829moM1255g.f41159e));
            lulVar.m16008b("recyclerView_viewHolder_isRecyclable", c0829moM1255g.m16693t());
            lulVar.m16007a("recyclerView_viewHolder_viewType", (CharSequence) mrm.m16828h(lud.m15989a(view.getContext().getResources(), c0829moM1255g.f41160f)).mo16811e(Integer.toString(c0829moM1255g.f41160f)));
        }
    }
}
