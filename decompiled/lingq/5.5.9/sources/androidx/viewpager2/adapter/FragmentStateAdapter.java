package androidx.viewpager2.adapter;

import ae.C0062b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.C0941a0;
import androidx.fragment.app.C0959j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1052r;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p326q.AbstractC8451g;
import p326q.C8448d;
import p326q.C8449e;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<C1222f> implements InterfaceC1223g {

    /* JADX INFO: renamed from: d */
    public final Lifecycle f7699d;

    /* JADX INFO: renamed from: e */
    public final FragmentManager f7700e;

    /* JADX INFO: renamed from: f */
    public final C8449e<Fragment> f7701f;

    /* JADX INFO: renamed from: g */
    public final C8449e<Fragment.SavedState> f7702g;

    /* JADX INFO: renamed from: h */
    public final C8449e<Integer> f7703h;

    /* JADX INFO: renamed from: i */
    public C1215c f7704i;

    /* JADX INFO: renamed from: j */
    public final C1214b f7705j;

    /* JADX INFO: renamed from: k */
    public boolean f7706k;

    /* JADX INFO: renamed from: l */
    public boolean f7707l;

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    public static abstract class AbstractC1213a extends RecyclerView.AbstractC1114g {
        public AbstractC1213a(int i10) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: a */
        public abstract void mo4265a();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: b */
        public final void mo4266b() {
            mo4265a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: c */
        public final void mo4267c(int i10, int i11, Object obj) {
            mo4265a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: d */
        public final void mo4268d(int i10, int i11) {
            mo4265a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: e */
        public final void mo4269e(int i10, int i11) {
            mo4265a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
        /* JADX INFO: renamed from: f */
        public final void mo4270f(int i10, int i11) {
            mo4265a();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    public static class C1214b {

        /* JADX INFO: renamed from: a */
        public final CopyOnWriteArrayList f7713a = new CopyOnWriteArrayList();

        /* JADX INFO: renamed from: b */
        public static void m4675b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractC1216d.b) it.next()).mo4679a();
            }
        }

        /* JADX INFO: renamed from: a */
        public final ArrayList m4676a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f7713a.iterator();
            while (it.hasNext()) {
                ((AbstractC1216d) it.next()).getClass();
                arrayList.add(AbstractC1216d.f7720a);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    public class C1215c {

        /* JADX INFO: renamed from: a */
        public C1220d f7714a;

        /* JADX INFO: renamed from: b */
        public C1221e f7715b;

        /* JADX INFO: renamed from: c */
        public InterfaceC1049o f7716c;

        /* JADX INFO: renamed from: d */
        public ViewPager2 f7717d;

        /* JADX INFO: renamed from: e */
        public long f7718e = -1;

        public C1215c() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static ViewPager2 m4677a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public final void m4678b(boolean z10) {
            int currentItem;
            C1214b c1214b;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (!fragmentStateAdapter.f7700e.m3624P() && this.f7717d.getScrollState() == 0) {
                C8449e<Fragment> c8449e = fragmentStateAdapter.f7701f;
                if (!(c8449e.m16514i() == 0)) {
                    if (fragmentStateAdapter.mo4226e() == 0 || (currentItem = this.f7717d.getCurrentItem()) >= fragmentStateAdapter.mo4226e()) {
                        return;
                    }
                    long j10 = currentItem;
                    if (j10 == this.f7718e && !z10) {
                        return;
                    }
                    Fragment fragment = null;
                    Fragment fragment2 = (Fragment) c8449e.m16510e(j10, null);
                    if (fragment2 != null) {
                        if (!fragment2.m3604y()) {
                            return;
                        }
                        this.f7718e = j10;
                        FragmentManager fragmentManager = fragmentStateAdapter.f7700e;
                        fragmentManager.getClass();
                        C0940a c0940a = new C0940a(fragmentManager);
                        ArrayList<List> arrayList = new ArrayList();
                        int i10 = 0;
                        while (true) {
                            int iM16514i = c8449e.m16514i();
                            c1214b = fragmentStateAdapter.f7705j;
                            if (i10 >= iM16514i) {
                                break;
                            }
                            long jM16511f = c8449e.m16511f(i10);
                            Fragment fragmentM16515j = c8449e.m16515j(i10);
                            if (fragmentM16515j.m3604y()) {
                                if (jM16511f != this.f7718e) {
                                    c0940a.m3701m(fragmentM16515j, Lifecycle.State.STARTED);
                                    arrayList.add(c1214b.m4676a());
                                } else {
                                    fragment = fragmentM16515j;
                                }
                                boolean z11 = jM16511f == this.f7718e;
                                if (fragmentM16515j.f6088Z != z11) {
                                    fragmentM16515j.f6088Z = z11;
                                }
                            }
                            i10++;
                        }
                        if (fragment != null) {
                            c0940a.m3701m(fragment, Lifecycle.State.RESUMED);
                            arrayList.add(c1214b.m4676a());
                        }
                        if (!c0940a.f6344a.isEmpty()) {
                            if (c0940a.f6350g) {
                                throw new IllegalStateException("This transaction is already being added to the back stack");
                            }
                            c0940a.f6351h = false;
                            c0940a.f6250q.m3668y(c0940a, false);
                            Collections.reverse(arrayList);
                            for (List list : arrayList) {
                                c1214b.getClass();
                                C1214b.m4675b(list);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    public static abstract class AbstractC1216d {

        /* JADX INFO: renamed from: a */
        public static final a f7720a = new a();

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d$a */
        public class a implements b {
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC1216d.b
            /* JADX INFO: renamed from: a */
            public final void mo4679a() {
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d$b */
        public interface b {
            /* JADX INFO: renamed from: a */
            void mo4679a();
        }
    }

    public FragmentStateAdapter(Fragment fragment) {
        FragmentManager fragmentManagerM3594l = fragment.m3594l();
        C1052r c1052r = fragment.f6112l0;
        this.f7701f = new C8449e<>();
        this.f7702g = new C8449e<>();
        this.f7703h = new C8449e<>();
        this.f7705j = new C1214b();
        this.f7706k = false;
        this.f7707l = false;
        this.f7700e = fragmentManagerM3594l;
        this.f7699d = c1052r;
        if (this.f7040a.m4258a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f7041b = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m4666p(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
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

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.viewpager2.adapter.InterfaceC1223g
    /* JADX INFO: renamed from: a */
    public final Bundle mo4667a() {
        C8449e<Fragment> c8449e = this.f7701f;
        int iM16514i = c8449e.m16514i();
        C8449e<Fragment.SavedState> c8449e2 = this.f7702g;
        Bundle bundle = new Bundle(c8449e2.m16514i() + iM16514i);
        for (int i10 = 0; i10 < c8449e.m16514i(); i10++) {
            long jM16511f = c8449e.m16511f(i10);
            Fragment fragment = (Fragment) c8449e.m16510e(jM16511f, null);
            if (fragment != null && fragment.m3604y()) {
                String strM763i = C0166e.m763i("f#", jM16511f);
                FragmentManager fragmentManager = this.f7700e;
                fragmentManager.getClass();
                if (fragment.f6077O != fragmentManager) {
                    fragmentManager.m3651i0(new IllegalStateException(C0166e.m764j("Fragment ", fragment, " is not currently in the FragmentManager")));
                    throw null;
                }
                bundle.putString(strM763i, fragment.f6099f);
            }
        }
        for (int i11 = 0; i11 < c8449e2.m16514i(); i11++) {
            long jM16511f2 = c8449e2.m16511f(i11);
            if (m4669q(jM16511f2)) {
                bundle.putParcelable(C0166e.m763i("s#", jM16511f2), (Parcelable) c8449e2.m16510e(jM16511f2, null));
            }
        }
        return bundle;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.viewpager2.adapter.InterfaceC1223g
    /* JADX INFO: renamed from: b */
    public final void mo4668b(Parcelable parcelable) {
        C8449e<Fragment.SavedState> c8449e = this.f7702g;
        if (c8449e.m16514i() == 0) {
            C8449e<Fragment> c8449e2 = this.f7701f;
            if (c8449e2.m16514i() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        c8449e2.m16512g(Long.parseLong(str.substring(2)), this.f7700e.m3617E(bundle, str));
                    } else {
                        if (!(str.startsWith("s#") && str.length() > 2)) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                        long j10 = Long.parseLong(str.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                        if (m4669q(j10)) {
                            c8449e.m16512g(j10, savedState);
                        }
                    }
                }
                if (c8449e2.m16514i() == 0) {
                    return;
                }
                this.f7707l = true;
                this.f7706k = true;
                m4671s();
                final Handler handler = new Handler(Looper.getMainLooper());
                final RunnableC1219c runnableC1219c = new RunnableC1219c(this);
                this.f7699d.mo3883a(new InterfaceC1049o() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                    @Override // androidx.view.InterfaceC1049o
                    /* JADX INFO: renamed from: e */
                    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            handler.removeCallbacks(runnableC1219c);
                            interfaceC1051q.mo786G().mo3885c(this);
                        }
                    }
                });
                handler.postDelayed(runnableC1219c, 10000L);
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f */
    public final long mo4227f(int i10) {
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h */
    public final void mo4229h(RecyclerView recyclerView) {
        if (!(this.f7704i == null)) {
            throw new IllegalArgumentException();
        }
        final C1215c c1215c = new C1215c();
        this.f7704i = c1215c;
        c1215c.f7717d = C1215c.m4677a(recyclerView);
        C1220d c1220d = new C1220d(c1215c);
        c1215c.f7714a = c1220d;
        c1215c.f7717d.f7742c.f7767a.add(c1220d);
        C1221e c1221e = new C1221e(c1215c);
        c1215c.f7715b = c1221e;
        m4234o(c1221e);
        InterfaceC1049o interfaceC1049o = new InterfaceC1049o() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                c1215c.m4678b(false);
            }
        };
        c1215c.f7716c = interfaceC1049o;
        this.f7699d.mo3883a(interfaceC1049o);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        Bundle bundle;
        C1222f c1222f = (C1222f) abstractC1109b0;
        long j10 = c1222f.f7058e;
        FrameLayout frameLayout = (FrameLayout) c1222f.f7054a;
        int id2 = frameLayout.getId();
        Long lM4672t = m4672t(id2);
        C8449e<Integer> c8449e = this.f7703h;
        if (lM4672t != null && lM4672t.longValue() != j10) {
            m4674v(lM4672t.longValue());
            c8449e.m16513h(lM4672t.longValue());
        }
        c8449e.m16512g(j10, Integer.valueOf(id2));
        long j11 = i10;
        C8449e<Fragment> c8449e2 = this.f7701f;
        if (c8449e2.f45589a) {
            c8449e2.m16509d();
        }
        if (!(C0062b.m324Y(c8449e2.f45590b, c8449e2.f45592d, j11) >= 0)) {
            Fragment fragmentMo4670r = mo4670r(i10);
            Bundle bundle2 = null;
            Fragment.SavedState savedState = (Fragment.SavedState) this.f7702g.m16510e(j11, null);
            if (fragmentMo4670r.f6077O != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if (savedState != null && (bundle = savedState.f6122a) != null) {
                bundle2 = bundle;
            }
            fragmentMo4670r.f6091b = bundle2;
            c8449e2.m16512g(j11, fragmentMo4670r);
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.g.m18698b(frameLayout)) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1217a(this, frameLayout, c1222f));
        }
        m4671s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        int i11 = C1222f.f7730u;
        FrameLayout frameLayout = new FrameLayout(recyclerView.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        frameLayout.setId(C10029b0.e.m18683a());
        frameLayout.setSaveEnabled(false);
        return new C1222f(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k */
    public final void mo4230k(RecyclerView recyclerView) {
        C1215c c1215c = this.f7704i;
        c1215c.getClass();
        ViewPager2 viewPager2M4677a = C1215c.m4677a(recyclerView);
        viewPager2M4677a.f7742c.f7767a.remove(c1215c.f7714a);
        C1221e c1221e = c1215c.f7715b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.f7040a.unregisterObserver(c1221e);
        fragmentStateAdapter.f7699d.mo3885c(c1215c.f7716c);
        c1215c.f7717d = null;
        this.f7704i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ boolean mo4231l(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m */
    public final void mo4232m(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        m4673u((C1222f) abstractC1109b0);
        m4671s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n */
    public final void mo4233n(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        Long lM4672t = m4672t(((FrameLayout) ((C1222f) abstractC1109b0).f7054a).getId());
        if (lM4672t != null) {
            m4674v(lM4672t.longValue());
            this.f7703h.m16513h(lM4672t.longValue());
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4669q(long j10) {
        return j10 >= 0 && j10 < ((long) mo4226e());
    }

    /* JADX INFO: renamed from: r */
    public abstract Fragment mo4670r(int i10);

    /* JADX INFO: renamed from: s */
    public final void m4671s() {
        C8449e<Fragment> c8449e;
        C8449e<Integer> c8449e2;
        Fragment fragment;
        View view;
        if (this.f7707l) {
            if (!this.f7700e.m3624P()) {
                C8448d c8448d = new C8448d();
                int i10 = 0;
                while (true) {
                    c8449e = this.f7701f;
                    int iM16514i = c8449e.m16514i();
                    c8449e2 = this.f7703h;
                    if (i10 >= iM16514i) {
                        break;
                    }
                    long jM16511f = c8449e.m16511f(i10);
                    if (!m4669q(jM16511f)) {
                        c8448d.add(Long.valueOf(jM16511f));
                        c8449e2.m16513h(jM16511f);
                    }
                    i10++;
                }
                if (!this.f7706k) {
                    this.f7707l = false;
                    for (int i11 = 0; i11 < c8449e.m16514i(); i11++) {
                        long jM16511f2 = c8449e.m16511f(i11);
                        if (c8449e2.f45589a) {
                            c8449e2.m16509d();
                        }
                        boolean z10 = true;
                        if (!(C0062b.m324Y(c8449e2.f45590b, c8449e2.f45592d, jM16511f2) >= 0) && ((fragment = (Fragment) c8449e.m16510e(jM16511f2, null)) == null || (view = fragment.f6094c0) == null || view.getParent() == null)) {
                            z10 = false;
                        }
                        if (!z10) {
                            c8448d.add(Long.valueOf(jM16511f2));
                        }
                    }
                }
                Iterator it = c8448d.iterator();
                while (true) {
                    AbstractC8451g.a aVar = (AbstractC8451g.a) it;
                    if (!aVar.hasNext()) {
                        break;
                    } else {
                        m4674v(((Long) aVar.next()).longValue());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final Long m4672t(int i10) {
        Long lValueOf = null;
        int i11 = 0;
        while (true) {
            C8449e<Integer> c8449e = this.f7703h;
            if (i11 >= c8449e.m16514i()) {
                return lValueOf;
            }
            if (c8449e.m16515j(i11).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(c8449e.m16511f(i11));
            }
            i11++;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: u */
    public final void m4673u(final C1222f c1222f) {
        Fragment fragment = (Fragment) this.f7701f.m16510e(c1222f.f7058e, null);
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) c1222f.f7054a;
        View view = fragment.f6094c0;
        if (!fragment.m3604y() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zM3604y = fragment.m3604y();
        FragmentManager fragmentManager = this.f7700e;
        if (zM3604y && view == null) {
            fragmentManager.f6170m.f6254a.add(new C0941a0.a(new C1218b(this, fragment, frameLayout)));
            return;
        }
        if (fragment.m3604y() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                m4666p(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.m3604y()) {
            m4666p(view, frameLayout);
            return;
        }
        if (fragmentManager.m3624P()) {
            if (fragmentManager.f6151H) {
                return;
            }
            this.f7699d.mo3883a(new InterfaceC1049o() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.view.InterfaceC1049o
                /* JADX INFO: renamed from: e */
                public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                    FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                    if (fragmentStateAdapter.f7700e.m3624P()) {
                        return;
                    }
                    interfaceC1051q.mo786G().mo3885c(this);
                    C1222f c1222f2 = c1222f;
                    FrameLayout frameLayout2 = (FrameLayout) c1222f2.f7054a;
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    if (C10029b0.g.m18698b(frameLayout2)) {
                        fragmentStateAdapter.m4673u(c1222f2);
                    }
                }
            });
            return;
        }
        fragmentManager.f6170m.f6254a.add(new C0941a0.a(new C1218b(this, fragment, frameLayout)));
        C1214b c1214b = this.f7705j;
        c1214b.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = c1214b.f7713a.iterator();
        while (it.hasNext()) {
            ((AbstractC1216d) it.next()).getClass();
            arrayList.add(AbstractC1216d.f7720a);
        }
        try {
            if (fragment.f6088Z) {
                fragment.f6088Z = false;
            }
            fragmentManager.getClass();
            C0940a c0940a = new C0940a(fragmentManager);
            c0940a.mo3695f(0, fragment, "f" + c1222f.f7058e, 1);
            c0940a.m3701m(fragment, Lifecycle.State.STARTED);
            if (c0940a.f6350g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0940a.f6351h = false;
            c0940a.f6250q.m3668y(c0940a, false);
            this.f7704i.m4678b(false);
            C1214b.m4675b(arrayList);
        } catch (Throwable th2) {
            C1214b.m4675b(arrayList);
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: v */
    public final void m4674v(long j10) {
        Bundle bundleM3752o;
        ViewParent parent;
        C8449e<Fragment> c8449e = this.f7701f;
        Fragment.SavedState savedState = null;
        Fragment fragment = (Fragment) c8449e.m16510e(j10, null);
        if (fragment == null) {
            return;
        }
        View view = fragment.f6094c0;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zM4669q = m4669q(j10);
        C8449e<Fragment.SavedState> c8449e2 = this.f7702g;
        if (!zM4669q) {
            c8449e2.m16513h(j10);
        }
        if (!fragment.m3604y()) {
            c8449e.m16513h(j10);
            return;
        }
        FragmentManager fragmentManager = this.f7700e;
        if (fragmentManager.m3624P()) {
            this.f7707l = true;
            return;
        }
        if (fragment.m3604y() && m4669q(j10)) {
            fragmentManager.getClass();
            C0959j0 c0959j0 = fragmentManager.f6160c.f6319b.get(fragment.f6099f);
            if (c0959j0 != null) {
                Fragment fragment2 = c0959j0.f6311c;
                if (fragment2.equals(fragment)) {
                    if (fragment2.f6089a > -1 && (bundleM3752o = c0959j0.m3752o()) != null) {
                        savedState = new Fragment.SavedState(bundleM3752o);
                    }
                    c8449e2.m16512g(j10, savedState);
                }
            }
            fragmentManager.m3651i0(new IllegalStateException(C0166e.m764j("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
        C1214b c1214b = this.f7705j;
        c1214b.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = c1214b.f7713a.iterator();
        while (it.hasNext()) {
            ((AbstractC1216d) it.next()).getClass();
            arrayList.add(AbstractC1216d.f7720a);
        }
        try {
            fragmentManager.getClass();
            C0940a c0940a = new C0940a(fragmentManager);
            c0940a.m3700l(fragment);
            if (c0940a.f6350g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0940a.f6351h = false;
            c0940a.f6250q.m3668y(c0940a, false);
            c8449e.m16513h(j10);
            C1214b.m4675b(arrayList);
        } catch (Throwable th2) {
            C1214b.m4675b(arrayList);
            throw th2;
        }
    }
}
