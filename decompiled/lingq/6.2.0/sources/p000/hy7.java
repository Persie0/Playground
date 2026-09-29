package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.C0639g;
import androidx.fragment.app.Fragment$SavedState;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.reader.old.ReaderPageFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hy7 extends p28 {

    /* JADX INFO: renamed from: d */
    public final AbstractC3572sf f43206d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0638f f43207e;

    /* JADX INFO: renamed from: f */
    public final tk5 f43208f;

    /* JADX INFO: renamed from: g */
    public final tk5 f43209g;

    /* JADX INFO: renamed from: h */
    public final tk5 f43210h;

    /* JADX INFO: renamed from: i */
    public rg1 f43211i;

    /* JADX INFO: renamed from: j */
    public final ck6 f43212j;

    /* JADX INFO: renamed from: k */
    public boolean f43213k;

    /* JADX INFO: renamed from: l */
    public boolean f43214l;

    /* JADX INFO: renamed from: m */
    public List f43215m;

    public hy7(ReaderFragment readerFragment) {
        AbstractC0638f abstractC0638fM2106h = readerFragment.m2106h();
        wb5 wb5Var = readerFragment.f5709m0;
        Object obj = null;
        this.f43208f = new tk5(obj);
        this.f43209g = new tk5(obj);
        this.f43210h = new tk5(obj);
        ck6 ck6Var = new ck6(14, false);
        ck6Var.f10194b = new CopyOnWriteArrayList();
        this.f43212j = ck6Var;
        this.f43213k = false;
        this.f43214l = false;
        this.f43207e = abstractC0638fM2106h;
        this.f43206d = wb5Var;
        if (this.f55486a.m19617a()) {
            C3386nv.m17633t("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.f55487b = true;
    }

    /* JADX INFO: renamed from: k */
    public static void m13580k(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            C3386nv.m17633t("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: a */
    public final int mo6133a() {
        return this.f43215m.size();
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: b */
    public final long mo6134b(int i) {
        return i;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: d */
    public final void mo13581d(RecyclerView recyclerView) {
        if (this.f43211i != null) {
            ij6.m13959q();
            return;
        }
        rg1 rg1Var = new rg1();
        rg1Var.f59233f = this;
        rg1Var.f59228a = -1L;
        this.f43211i = rg1Var;
        ViewPager2 viewPager2M20657a = rg1.m20657a(recyclerView);
        rg1Var.f59232e = viewPager2M20657a;
        hf1 hf1Var = new hf1(rg1Var, 1);
        rg1Var.f59229b = hf1Var;
        ((ArrayList) viewPager2M20657a.f7120c.f42294b).add(hf1Var);
        mf3 mf3Var = new mf3(rg1Var);
        rg1Var.f59230c = mf3Var;
        this.f55486a.registerObserver(mf3Var);
        nf3 nf3Var = new nf3(rg1Var);
        rg1Var.f59231d = nf3Var;
        this.f43206d.mo21323g(nf3Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.p28
    /* JADX INFO: renamed from: e */
    public final void mo6135e(o38 o38Var, int i) {
        Bundle bundle;
        kg3 kg3Var = (kg3) o38Var;
        long j = kg3Var.f53785e;
        FrameLayout frameLayout = (FrameLayout) kg3Var.f53781a;
        int id = frameLayout.getId();
        Long lM13588n = m13588n(id);
        tk5 tk5Var = this.f43210h;
        if (lM13588n != null && lM13588n.longValue() != j) {
            m13590p(lM13588n.longValue());
            tk5Var.m22181g(lM13588n.longValue());
        }
        tk5Var.m22180f(Integer.valueOf(id), j);
        long j2 = i;
        tk5 tk5Var2 = this.f43208f;
        if (tk5Var2.m22177c(j2) < 0) {
            vx7 vx7Var = ReaderPageFragment.Companion;
            c27 c27Var = (c27) this.f43215m.get(i);
            vx7Var.getClass();
            c27Var.getClass();
            Bundle bundle2 = new Bundle();
            ReaderPageFragment readerPageFragment = new ReaderPageFragment();
            bundle2.putInt("pagePosition", i);
            bundle2.putInt("lessonId", c27Var.f9359f);
            bundle2.putString("lessonTitle", c27Var.f9355b);
            bundle2.putString("collectionTitle", c27Var.f9356c);
            bundle2.putString("lessonImage", c27Var.f9357d);
            bundle2.putBoolean("isSentenceMode", c27Var.f9358e);
            readerPageFragment.m2095W(bundle2);
            Fragment$SavedState fragment$SavedState = (Fragment$SavedState) this.f43209g.m22176b(j2);
            if (readerPageFragment.f5674P != null) {
                C3386nv.m17633t("Fragment already added");
                return;
            }
            if (fragment$SavedState == null || (bundle = fragment$SavedState.f5624a) == null) {
                bundle = null;
            }
            readerPageFragment.f5687b = bundle;
            tk5Var2.m22180f(readerPageFragment, j2);
        }
        if (frameLayout.isAttachedToWindow()) {
            m13589o(kg3Var);
        }
        m13587m();
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: f */
    public final o38 mo6136f(ViewGroup viewGroup, int i) {
        int i2 = kg3.f47165u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new kg3(frameLayout);
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: g */
    public final void mo13582g(RecyclerView recyclerView) {
        rg1 rg1Var = this.f43211i;
        rg1Var.getClass();
        ViewPager2 viewPager2M20657a = rg1.m20657a(recyclerView);
        ((ArrayList) viewPager2M20657a.f7120c.f42294b).remove((hf1) rg1Var.f59229b);
        hy7 hy7Var = (hy7) rg1Var.f59233f;
        hy7Var.f55486a.unregisterObserver((mf3) rg1Var.f59230c);
        hy7Var.f43206d.mo21331x((nf3) rg1Var.f59231d);
        rg1Var.f59232e = null;
        this.f43211i = null;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ boolean mo13583h(o38 o38Var) {
        return true;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: i */
    public final void mo13584i(o38 o38Var) {
        m13589o((kg3) o38Var);
        m13587m();
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: j */
    public final void mo13585j(o38 o38Var) {
        Long lM13588n = m13588n(((FrameLayout) ((kg3) o38Var).f53781a).getId());
        if (lM13588n != null) {
            m13590p(lM13588n.longValue());
            this.f43210h.m22181g(lM13588n.longValue());
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m13586l(long j) {
        return j >= 0 && j < ((long) this.f43215m.size());
    }

    /* JADX INFO: renamed from: m */
    public final void m13587m() {
        tk5 tk5Var;
        tk5 tk5Var2;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c;
        View view;
        if (!this.f43214l || this.f43207e.m2144Q()) {
            return;
        }
        C3437ov c3437ov = new C3437ov(0);
        int i = 0;
        while (true) {
            tk5Var = this.f43208f;
            int iM22182h = tk5Var.m22182h();
            tk5Var2 = this.f43210h;
            if (i >= iM22182h) {
                break;
            }
            long jM22179e = tk5Var.m22179e(i);
            if (!m13586l(jM22179e)) {
                c3437ov.add(Long.valueOf(jM22179e));
                tk5Var2.m22181g(jM22179e);
            }
            i++;
        }
        if (!this.f43213k) {
            this.f43214l = false;
            for (int i2 = 0; i2 < tk5Var.m22182h(); i2++) {
                long jM22179e2 = tk5Var.m22179e(i2);
                if (tk5Var2.m22177c(jM22179e2) < 0 && ((abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) tk5Var.m22176b(jM22179e2)) == null || (view = abstractComponentCallbacksC0635c.f5692d0) == null || view.getParent() == null)) {
                    c3437ov.add(Long.valueOf(jM22179e2));
                }
            }
        }
        C3052gv c3052gv = new C3052gv(c3437ov);
        while (c3052gv.hasNext()) {
            m13590p(((Long) c3052gv.next()).longValue());
        }
    }

    /* JADX INFO: renamed from: n */
    public final Long m13588n(int i) {
        int i2 = 0;
        Long lValueOf = null;
        while (true) {
            tk5 tk5Var = this.f43210h;
            if (i2 >= tk5Var.m22182h()) {
                return lValueOf;
            }
            if (((Integer) tk5Var.m22183i(i2)).intValue() == i) {
                if (lValueOf != null) {
                    C3386nv.m17633t("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(tk5Var.m22179e(i2));
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m13589o(kg3 kg3Var) {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) this.f43208f.m22176b(kg3Var.f53785e);
        if (abstractComponentCallbacksC0635c == null) {
            C3386nv.m17633t("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) kg3Var.f53781a;
        View view = abstractComponentCallbacksC0635c.f5692d0;
        if (!abstractComponentCallbacksC0635c.m2115q() && view != null) {
            C3386nv.m17633t("Design assumption violated.");
            return;
        }
        boolean zM2115q = abstractComponentCallbacksC0635c.m2115q();
        AbstractC0638f abstractC0638f = this.f43207e;
        if (zM2115q && view == null) {
            abstractC0638f.m2152Y(new lf3(this, abstractComponentCallbacksC0635c, frameLayout), false);
            return;
        }
        if (abstractComponentCallbacksC0635c.m2115q() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                m13580k(view, frameLayout);
                return;
            }
            return;
        }
        if (abstractComponentCallbacksC0635c.m2115q()) {
            m13580k(view, frameLayout);
            return;
        }
        if (abstractC0638f.m2144Q()) {
            if (abstractC0638f.f5733K) {
                return;
            }
            this.f43206d.mo21323g(new kf3(this, kg3Var));
            return;
        }
        abstractC0638f.m2152Y(new lf3(this, abstractComponentCallbacksC0635c, frameLayout), false);
        ck6 ck6Var = this.f43212j;
        ck6Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) ck6Var.f10194b).iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        try {
            if (abstractComponentCallbacksC0635c.f5686a0) {
                abstractComponentCallbacksC0635c.f5686a0 = false;
            }
            g70 g70Var = new g70(abstractC0638f);
            g70Var.m12398h(0, abstractComponentCallbacksC0635c, "f" + kg3Var.f53785e, 1);
            g70Var.m12401k(abstractComponentCallbacksC0635c, Lifecycle$State.STARTED);
            if (g70Var.f40293g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            g70Var.f40294h = false;
            g70Var.f40304r.m2133A(g70Var, false);
            this.f43211i.m20658b(false);
            ck6.m4788l(arrayList);
        } catch (Throwable th) {
            ck6.m4788l(arrayList);
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m13590p(long j) {
        ViewParent parent;
        tk5 tk5Var = this.f43208f;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) tk5Var.m22176b(j);
        if (abstractComponentCallbacksC0635c == null) {
            return;
        }
        View view = abstractComponentCallbacksC0635c.f5692d0;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zM13586l = m13586l(j);
        tk5 tk5Var2 = this.f43209g;
        if (!zM13586l) {
            tk5Var2.m22181g(j);
        }
        if (!abstractComponentCallbacksC0635c.m2115q()) {
            tk5Var.m22181g(j);
            return;
        }
        AbstractC0638f abstractC0638f = this.f43207e;
        if (abstractC0638f.m2144Q()) {
            this.f43214l = true;
            return;
        }
        boolean zM2115q = abstractComponentCallbacksC0635c.m2115q();
        ck6 ck6Var = this.f43212j;
        if (zM2115q && m13586l(j)) {
            ck6Var.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) ck6Var.f10194b).iterator();
            if (it.hasNext()) {
                throw wq1.m24110f(it);
            }
            C0639g c0639g = (C0639g) ((HashMap) abstractC0638f.f5742c.f53415c).get(abstractComponentCallbacksC0635c.f5693e);
            if (c0639g != null) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = c0639g.f5768c;
                abstractComponentCallbacksC0635c2.getClass();
                if (abstractComponentCallbacksC0635c2 == abstractComponentCallbacksC0635c) {
                    Fragment$SavedState fragment$SavedState = abstractComponentCallbacksC0635c2.f5685a > -1 ? new Fragment$SavedState(c0639g.m2206o()) : null;
                    ck6.m4788l(arrayList);
                    tk5Var2.m22180f(fragment$SavedState, j);
                }
            }
            abstractC0638f.m2174k0(new IllegalStateException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " is not currently in the FragmentManager")));
            throw null;
        }
        ck6Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) ck6Var.f10194b).iterator();
        if (it2.hasNext()) {
            throw wq1.m24110f(it2);
        }
        try {
            g70 g70Var = new g70(abstractC0638f);
            g70Var.m12400j(abstractComponentCallbacksC0635c);
            if (g70Var.f40293g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            g70Var.f40294h = false;
            g70Var.f40304r.m2133A(g70Var, false);
            tk5Var.m22181g(j);
            ck6.m4788l(arrayList2);
        } catch (Throwable th) {
            ck6.m4788l(arrayList2);
            throw th;
        }
    }
}
