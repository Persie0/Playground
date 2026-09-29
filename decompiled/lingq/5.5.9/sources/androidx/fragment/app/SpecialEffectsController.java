package androidx.fragment.app;

import android.support.v4.media.session.C0166e;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.linguist.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import p389t2.C9185d;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f6230a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<Operation> f6231b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<Operation> f6232c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public boolean f6233d = false;

    /* JADX INFO: renamed from: e */
    public boolean f6234e = false;

    public static class Operation {

        /* JADX INFO: renamed from: a */
        public State f6235a;

        /* JADX INFO: renamed from: b */
        public LifecycleImpact f6236b;

        /* JADX INFO: renamed from: c */
        public final Fragment f6237c;

        /* JADX INFO: renamed from: d */
        public final ArrayList f6238d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final HashSet<C9185d> f6239e = new HashSet<>();

        /* JADX INFO: renamed from: f */
        public boolean f6240f = false;

        /* JADX INFO: renamed from: g */
        public boolean f6241g = false;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            public static State from(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(C0166e.m761g("Unknown visibility ", i10));
            }

            public static State from(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            public void applyState(View view) {
                int i10 = C0938c.f6247a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m3608K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.m3608K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$Operation$a */
        public class C0935a implements C9185d.a {
            public C0935a() {
            }

            @Override // p389t2.C9185d.a
            /* JADX INFO: renamed from: a */
            public final void mo3694a() {
                Operation.this.m3690a();
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, C9185d c9185d) {
            this.f6235a = state;
            this.f6236b = lifecycleImpact;
            this.f6237c = fragment;
            c9185d.m17520b(new C0935a());
        }

        /* JADX INFO: renamed from: a */
        public final void m3690a() {
            if (this.f6240f) {
                return;
            }
            this.f6240f = true;
            HashSet<C9185d> hashSet = this.f6239e;
            if (hashSet.isEmpty()) {
                mo3691b();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((C9185d) it.next()).m17519a();
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo3691b() {
            if (this.f6241g) {
                return;
            }
            if (FragmentManager.m3608K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f6241g = true;
            Iterator it = this.f6238d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m3692c(State state, LifecycleImpact lifecycleImpact) {
            int i10 = C0938c.f6248b[lifecycleImpact.ordinal()];
            Fragment fragment = this.f6237c;
            if (i10 == 1) {
                if (this.f6235a == State.REMOVED) {
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f6236b + " to ADDING.");
                    }
                    this.f6235a = State.VISIBLE;
                    this.f6236b = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.m3608K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f6235a + " -> REMOVED. mLifecycleImpact  = " + this.f6236b + " to REMOVING.");
                }
                this.f6235a = State.REMOVED;
                this.f6236b = LifecycleImpact.REMOVING;
                return;
            }
            if (i10 == 3 && this.f6235a != State.REMOVED) {
                if (FragmentManager.m3608K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f6235a + " -> " + state + ". ");
                }
                this.f6235a = state;
            }
        }

        /* JADX INFO: renamed from: d */
        public void mo3693d() {
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f6235a + "} {mLifecycleImpact = " + this.f6236b + "} {mFragment = " + this.f6237c + "}";
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$a */
    public class RunnableC0936a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0939d f6243a;

        public RunnableC0936a(C0939d c0939d) {
            this.f6243a = c0939d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<Operation> arrayList = SpecialEffectsController.this.f6231b;
            C0939d c0939d = this.f6243a;
            if (arrayList.contains(c0939d)) {
                c0939d.f6235a.applyState(c0939d.f6237c.f6094c0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$b */
    public class RunnableC0937b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0939d f6245a;

        public RunnableC0937b(C0939d c0939d) {
            this.f6245a = c0939d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SpecialEffectsController specialEffectsController = SpecialEffectsController.this;
            ArrayList<Operation> arrayList = specialEffectsController.f6231b;
            C0939d c0939d = this.f6245a;
            arrayList.remove(c0939d);
            specialEffectsController.f6232c.remove(c0939d);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$c */
    public static /* synthetic */ class C0938c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6247a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f6248b;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            f6248b = iArr;
            try {
                iArr[Operation.LifecycleImpact.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6248b[Operation.LifecycleImpact.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6248b[Operation.LifecycleImpact.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Operation.State.values().length];
            f6247a = iArr2;
            try {
                iArr2[Operation.State.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6247a[Operation.State.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6247a[Operation.State.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6247a[Operation.State.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$d */
    public static class C0939d extends Operation {

        /* JADX INFO: renamed from: h */
        public final C0959j0 f6249h;

        public C0939d(Operation.State state, Operation.LifecycleImpact lifecycleImpact, C0959j0 c0959j0, C9185d c9185d) {
            super(state, lifecycleImpact, c0959j0.f6311c, c9185d);
            this.f6249h = c0959j0;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        /* JADX INFO: renamed from: b */
        public final void mo3691b() {
            super.mo3691b();
            this.f6249h.m3748k();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        /* JADX INFO: renamed from: d */
        public final void mo3693d() {
            Operation.LifecycleImpact lifecycleImpact = this.f6236b;
            Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.ADDING;
            C0959j0 c0959j0 = this.f6249h;
            if (lifecycleImpact != lifecycleImpact2) {
                if (lifecycleImpact == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragment = c0959j0.f6311c;
                    View viewM3580c0 = fragment.m3580c0();
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewM3580c0.findFocus() + " on view " + viewM3580c0 + " for Fragment " + fragment);
                    }
                    viewM3580c0.clearFocus();
                }
                return;
            }
            Fragment fragment2 = c0959j0.f6311c;
            View viewFindFocus = fragment2.f6094c0.findFocus();
            if (viewFindFocus != null) {
                fragment2.m3588h().f6139o = viewFindFocus;
                if (FragmentManager.m3608K(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
                }
            }
            View viewM3580c1 = this.f6237c.m3580c0();
            if (viewM3580c1.getParent() == null) {
                c0959j0.m3739b();
                viewM3580c1.setAlpha(0.0f);
            }
            if (viewM3580c1.getAlpha() == 0.0f && viewM3580c1.getVisibility() == 0) {
                viewM3580c1.setVisibility(4);
            }
            Fragment.C0912c c0912c = fragment2.f6100f0;
            viewM3580c1.setAlpha(c0912c == null ? 1.0f : c0912c.f6138n);
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.f6230a = viewGroup;
    }

    /* JADX INFO: renamed from: f */
    public static SpecialEffectsController m3682f(ViewGroup viewGroup, InterfaceC0984v0 interfaceC0984v0) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        ((FragmentManager.C0920e) interfaceC0984v0).getClass();
        C0942b c0942b = new C0942b(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0942b);
        return c0942b;
    }

    /* JADX INFO: renamed from: a */
    public final void m3683a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, C0959j0 c0959j0) {
        synchronized (this.f6231b) {
            C9185d c9185d = new C9185d();
            Operation operationM3686d = m3686d(c0959j0.f6311c);
            if (operationM3686d != null) {
                operationM3686d.m3692c(state, lifecycleImpact);
                return;
            }
            C0939d c0939d = new C0939d(state, lifecycleImpact, c0959j0, c9185d);
            this.f6231b.add(c0939d);
            c0939d.f6238d.add(new RunnableC0936a(c0939d));
            c0939d.f6238d.add(new RunnableC0937b(c0939d));
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo3684b(ArrayList arrayList, boolean z10);

    /* JADX INFO: renamed from: c */
    public final void m3685c() {
        if (this.f6234e) {
            return;
        }
        ViewGroup viewGroup = this.f6230a;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (!C10029b0.g.m18698b(viewGroup)) {
            m3687e();
            this.f6233d = false;
            return;
        }
        synchronized (this.f6231b) {
            if (!this.f6231b.isEmpty()) {
                ArrayList<Operation> arrayList = new ArrayList(this.f6232c);
                this.f6232c.clear();
                for (Operation operation : arrayList) {
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                    }
                    operation.m3690a();
                    if (!operation.f6241g) {
                        this.f6232c.add(operation);
                    }
                }
                m3689h();
                ArrayList arrayList2 = new ArrayList(this.f6231b);
                this.f6231b.clear();
                this.f6232c.addAll(arrayList2);
                if (FragmentManager.m3608K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).mo3693d();
                }
                mo3684b(arrayList2, this.f6233d);
                this.f6233d = false;
                if (FragmentManager.m3608K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Operation m3686d(Fragment fragment) {
        for (Operation operation : this.f6231b) {
            if (operation.f6237c.equals(fragment) && !operation.f6240f) {
                return operation;
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m3687e() {
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f6230a;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean zM18698b = C10029b0.g.m18698b(viewGroup);
        synchronized (this.f6231b) {
            m3689h();
            Iterator<Operation> it = this.f6231b.iterator();
            while (it.hasNext()) {
                it.next().mo3693d();
            }
            for (Operation operation : new ArrayList(this.f6232c)) {
                if (FragmentManager.m3608K(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zM18698b ? "" : "Container " + this.f6230a + " is not attached to window. ");
                    sb2.append("Cancelling running operation ");
                    sb2.append(operation);
                    Log.v("FragmentManager", sb2.toString());
                }
                operation.m3690a();
            }
            for (Operation operation2 : new ArrayList(this.f6231b)) {
                if (FragmentManager.m3608K(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    sb3.append(zM18698b ? "" : "Container " + this.f6230a + " is not attached to window. ");
                    sb3.append("Cancelling pending operation ");
                    sb3.append(operation2);
                    Log.v("FragmentManager", sb3.toString());
                }
                operation2.m3690a();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3688g() {
        synchronized (this.f6231b) {
            m3689h();
            this.f6234e = false;
            int size = this.f6231b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Operation operation = this.f6231b.get(size);
                Operation.State stateFrom = Operation.State.from(operation.f6237c.f6094c0);
                Operation.State state = operation.f6235a;
                Operation.State state2 = Operation.State.VISIBLE;
                if (state == state2 && stateFrom != state2) {
                    Fragment.C0912c c0912c = operation.f6237c.f6100f0;
                    this.f6234e = false;
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3689h() {
        while (true) {
            for (Operation operation : this.f6231b) {
                if (operation.f6236b == Operation.LifecycleImpact.ADDING) {
                    operation.m3692c(Operation.State.from(operation.f6237c.m3580c0().getVisibility()), Operation.LifecycleImpact.NONE);
                }
            }
            return;
        }
    }
}
