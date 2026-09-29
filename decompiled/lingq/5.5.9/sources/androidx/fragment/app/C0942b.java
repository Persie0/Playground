package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.linguist.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import p326q.AbstractC8451g;
import p326q.C8446b;
import p326q.C8452h;
import p389t2.C9185d;
import p471x2.C10029b0;
import p471x2.C10039g0;
import p471x2.C10049l0;
import p471x2.ViewTreeObserverOnPreDrawListenerC10066u;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0942b extends SpecialEffectsController {

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6258a;

        static {
            int[] iArr = new int[SpecialEffectsController.Operation.State.values().length];
            f6258a = iArr;
            try {
                iArr[SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6258a[SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6258a[SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6258a[SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$b */
    public static class b extends c {

        /* JADX INFO: renamed from: c */
        public final boolean f6259c;

        /* JADX INFO: renamed from: d */
        public boolean f6260d;

        /* JADX INFO: renamed from: e */
        public C0981u.a f6261e;

        public b(SpecialEffectsController.Operation operation, C9185d c9185d, boolean z10) {
            super(operation, c9185d);
            this.f6260d = false;
            this.f6259c = z10;
        }

        /* JADX WARN: Code duplicated, block: B:89:0x0119  */
        /* JADX WARN: Code duplicated, block: B:92:0x0121 A[Catch: RuntimeException -> 0x0129, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0129, blocks: (B:90:0x011a, B:92:0x0121), top: B:104:0x011a }] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public final C0981u.a m3720c(Context context) {
            int i10;
            Animator animatorLoadAnimator;
            int iM3814a;
            if (this.f6260d) {
                return this.f6261e;
            }
            SpecialEffectsController.Operation operation = this.f6262a;
            Fragment fragment = operation.f6237c;
            boolean z10 = false;
            boolean z11 = operation.f6235a == SpecialEffectsController.Operation.State.VISIBLE;
            Fragment.C0912c c0912c = fragment.f6100f0;
            int i11 = c0912c == null ? 0 : c0912c.f6130f;
            if (this.f6259c) {
                if (z11) {
                    i10 = c0912c == null ? 0 : c0912c.f6128d;
                } else if (c0912c != null) {
                    i10 = c0912c.f6129e;
                }
            } else if (z11) {
                if (c0912c != null) {
                    i10 = c0912c.f6126b;
                }
            } else if (c0912c != null) {
                i10 = c0912c.f6127c;
            }
            fragment.m3581d0(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.f6092b0;
            C0981u.a aVar = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.f6092b0.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.f6092b0;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                if (i10 == 0 && i11 != 0) {
                    if (i11 == 4097) {
                        iM3814a = z11 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    } else if (i11 == 8194) {
                        iM3814a = z11 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                    } else if (i11 == 8197) {
                        iM3814a = z11 ? C0981u.m3814a(android.R.attr.activityCloseEnterAnimation, context) : C0981u.m3814a(android.R.attr.activityCloseExitAnimation, context);
                    } else if (i11 == 4099) {
                        iM3814a = z11 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                    } else if (i11 != 4100) {
                        iM3814a = -1;
                    } else {
                        iM3814a = z11 ? C0981u.m3814a(android.R.attr.activityOpenEnterAnimation, context) : C0981u.m3814a(android.R.attr.activityOpenExitAnimation, context);
                    }
                    i10 = iM3814a;
                }
                if (i10 != 0) {
                    boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i10));
                    if (zEquals) {
                        try {
                            Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i10);
                            if (animationLoadAnimation != null) {
                                aVar = new C0981u.a(animationLoadAnimation);
                            } else {
                                z10 = true;
                                if (!z10) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
                                        if (animatorLoadAnimator != null) {
                                            aVar = new C0981u.a(animatorLoadAnimator);
                                        }
                                    } catch (RuntimeException e10) {
                                        if (zEquals) {
                                            throw e10;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i10);
                                        if (animationLoadAnimation2 != null) {
                                            aVar = new C0981u.a(animationLoadAnimation2);
                                        }
                                    }
                                }
                            }
                        } catch (Resources.NotFoundException e11) {
                            throw e11;
                        } catch (RuntimeException unused) {
                        }
                    } else if (!z10) {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
                        if (animatorLoadAnimator != null) {
                            aVar = new C0981u.a(animatorLoadAnimator);
                        }
                    }
                }
            }
            this.f6261e = aVar;
            this.f6260d = true;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final SpecialEffectsController.Operation f6262a;

        /* JADX INFO: renamed from: b */
        public final C9185d f6263b;

        public c(SpecialEffectsController.Operation operation, C9185d c9185d) {
            this.f6262a = operation;
            this.f6263b = c9185d;
        }

        /* JADX INFO: renamed from: a */
        public final void m3721a() {
            SpecialEffectsController.Operation operation = this.f6262a;
            HashSet<C9185d> hashSet = operation.f6239e;
            if (hashSet.remove(this.f6263b) && hashSet.isEmpty()) {
                operation.mo3691b();
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m3722b() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation operation = this.f6262a;
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(operation.f6237c.f6094c0);
            SpecialEffectsController.Operation.State state2 = operation.f6235a;
            if (stateFrom != state2 && (stateFrom == (state = SpecialEffectsController.Operation.State.VISIBLE) || state2 == state)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$d */
    public static class d extends c {

        /* JADX INFO: renamed from: c */
        public final Object f6264c;

        /* JADX INFO: renamed from: d */
        public final boolean f6265d;

        /* JADX INFO: renamed from: e */
        public final Object f6266e;

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        public d(SpecialEffectsController.Operation operation, C9185d c9185d, boolean z10, boolean z11) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            super(operation, c9185d);
            SpecialEffectsController.Operation.State state = operation.f6235a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            Object obj6 = null;
            Fragment fragment = operation.f6237c;
            if (state == state2) {
                if (z10) {
                    Fragment.C0912c c0912c = fragment.f6100f0;
                    if (c0912c != null) {
                        obj5 = c0912c.f6136l;
                        if (obj5 == Fragment.f6069u0) {
                            if (c0912c == null) {
                                obj5 = null;
                            } else {
                                obj4 = c0912c.f6135k;
                                obj5 = obj4;
                            }
                        }
                    } else {
                        obj5 = null;
                    }
                } else {
                    Fragment.C0912c c0912c2 = fragment.f6100f0;
                    if (c0912c2 == null) {
                        obj5 = null;
                    } else {
                        obj4 = c0912c2.f6133i;
                        obj5 = obj4;
                    }
                }
                this.f6264c = obj5;
                if (z10) {
                    Fragment.C0912c c0912c3 = fragment.f6100f0;
                } else {
                    Fragment.C0912c c0912c4 = fragment.f6100f0;
                }
                this.f6265d = true;
            } else {
                if (z10) {
                    Fragment.C0912c c0912c5 = fragment.f6100f0;
                    if (c0912c5 != null) {
                        obj2 = c0912c5.f6134j;
                        if (obj2 == Fragment.f6069u0) {
                            if (c0912c5 != null) {
                                obj = c0912c5.f6133i;
                                obj2 = obj;
                            }
                        }
                    }
                    obj2 = null;
                } else {
                    Fragment.C0912c c0912c6 = fragment.f6100f0;
                    if (c0912c6 == null) {
                        obj2 = null;
                    } else {
                        obj = c0912c6.f6135k;
                        obj2 = obj;
                    }
                }
                this.f6264c = obj2;
                this.f6265d = true;
            }
            if (!z11) {
                this.f6266e = null;
                return;
            }
            if (!z10) {
                fragment.getClass();
                this.f6266e = null;
                return;
            }
            Fragment.C0912c c0912c7 = fragment.f6100f0;
            if (c0912c7 != null && (obj3 = c0912c7.f6137m) != Fragment.f6069u0) {
                obj6 = obj3;
            }
            this.f6266e = obj6;
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC0977s0 m3723c(Object obj) {
            if (obj == null) {
                return null;
            }
            C0969o0 c0969o0 = C0965m0.f6370a;
            if (c0969o0 != null && (obj instanceof Transition)) {
                return c0969o0;
            }
            AbstractC0977s0 abstractC0977s0 = C0965m0.f6371b;
            if (abstractC0977s0 != null && abstractC0977s0.mo3783e(obj)) {
                return abstractC0977s0;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f6262a.f6237c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public C0942b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public static void m3717i(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (C10039g0.m18805b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                m3717i(childAt, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m3718j(C8446b c8446b, View view) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        String strM18717k = C10029b0.i.m18717k(view);
        if (strM18717k != null) {
            c8446b.put(strM18717k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    m3718j(c8446b, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static void m3719k(C8446b c8446b, Collection collection) {
        Iterator it = ((AbstractC8451g.b) c8446b.entrySet()).iterator();
        while (true) {
            while (true) {
                AbstractC8451g.d dVar = (AbstractC8451g.d) it;
                if (!dVar.hasNext()) {
                    return;
                }
                dVar.next();
                View view = (View) dVar.getValue();
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (!collection.contains(C10029b0.i.m18717k(view))) {
                    dVar.remove();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x04df  */
    /* JADX WARN: Code duplicated, block: B:172:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:174:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:177:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:178:0x0500  */
    /* JADX WARN: Code duplicated, block: B:201:0x0565 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:204:0x056b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0573  */
    /* JADX WARN: Code duplicated, block: B:208:0x057b  */
    /* JADX WARN: Code duplicated, block: B:209:0x0597  */
    /* JADX WARN: Code duplicated, block: B:211:0x059d  */
    /* JADX WARN: Code duplicated, block: B:246:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:259:0x0739  */
    /* JADX WARN: Code duplicated, block: B:263:0x0759  */
    /* JADX WARN: Code duplicated, block: B:264:0x075e  */
    /* JADX WARN: Code duplicated, block: B:267:0x0764  */
    /* JADX WARN: Code duplicated, block: B:270:0x078b  */
    /* JADX WARN: Code duplicated, block: B:275:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:279:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:284:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:288:0x081d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0824  */
    /* JADX WARN: Code duplicated, block: B:291:0x083e  */
    /* JADX WARN: Code duplicated, block: B:296:0x0868 A[LOOP:7: B:294:0x0862->B:296:0x0868, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:299:0x0883  */
    /* JADX WARN: Code duplicated, block: B:330:0x070f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x070b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0719 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0715 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0721 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0753 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x071d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0731 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x07e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x07c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x0809 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x07ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:208:0x057b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:259:0x0739, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:270:0x078b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:279:0x07d0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:284:0x07f1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:291:0x083e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:299:0x0883, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.SpecialEffectsController
    /* JADX INFO: renamed from: b */
    public final void mo3684b(ArrayList arrayList, boolean z10) {
        HashMap map;
        SpecialEffectsController.Operation operation;
        SpecialEffectsController.Operation operation2;
        SpecialEffectsController.Operation operation3;
        ArrayList arrayList2;
        boolean z11;
        SpecialEffectsController.Operation operation4;
        ArrayList arrayList3;
        SpecialEffectsController.Operation operation5;
        boolean z12;
        String str;
        Object obj;
        ArrayList arrayList4;
        View view;
        ArrayList arrayList5;
        AbstractC0977s0 abstractC0977s0;
        HashMap map2;
        View view2;
        Rect rect;
        ArrayList<String> arrayList6;
        ArrayList<String> arrayList7;
        ArrayList<String> arrayList8;
        ArrayList<String> arrayList9;
        int i10;
        boolean z13;
        View view3;
        boolean zContainsValue;
        Context context;
        ArrayList<b> arrayList10;
        boolean z14;
        SpecialEffectsController.Operation operation6;
        Fragment fragment;
        View view4;
        Animation animation;
        C0981u.a aVarM3720c;
        Animator animator;
        SpecialEffectsController.Operation operation7;
        Fragment fragment2;
        boolean z15;
        ArrayList arrayList11;
        Iterator it;
        String str2;
        ArrayList arrayList12;
        Iterator it2 = arrayList.iterator();
        SpecialEffectsController.Operation operation8 = null;
        SpecialEffectsController.Operation operation9 = null;
        while (it2.hasNext()) {
            SpecialEffectsController.Operation operation10 = (SpecialEffectsController.Operation) it2.next();
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(operation10.f6237c.f6094c0);
            int i11 = a.f6258a[operation10.f6235a.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                if (stateFrom == SpecialEffectsController.Operation.State.VISIBLE && operation8 == null) {
                    operation8 = operation10;
                }
            } else if (i11 == 4 && stateFrom != SpecialEffectsController.Operation.State.VISIBLE) {
                operation9 = operation10;
            }
        }
        String str3 = " to ";
        String str4 = "FragmentManager";
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Executing operations from " + operation8 + " to " + operation9);
        }
        ArrayList arrayList13 = new ArrayList();
        ArrayList<d> arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList(arrayList);
        Fragment fragment3 = ((SpecialEffectsController.Operation) arrayList.get(arrayList.size() - 1)).f6237c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Fragment.C0912c c0912c = ((SpecialEffectsController.Operation) it3.next()).f6237c.f6100f0;
            Fragment.C0912c c0912c2 = fragment3.f6100f0;
            c0912c.f6126b = c0912c2.f6126b;
            c0912c.f6127c = c0912c2.f6127c;
            c0912c.f6128d = c0912c2.f6128d;
            c0912c.f6129e = c0912c2.f6129e;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            SpecialEffectsController.Operation operation11 = (SpecialEffectsController.Operation) it4.next();
            C9185d c9185d = new C9185d();
            operation11.mo3693d();
            operation11.f6239e.add(c9185d);
            arrayList13.add(new b(operation11, c9185d, z10));
            C9185d c9185d2 = new C9185d();
            operation11.mo3693d();
            operation11.f6239e.add(c9185d2);
            arrayList14.add(new d(operation11, c9185d2, z10, !z10 ? operation11 != operation9 : operation11 != operation8));
            operation11.f6238d.add(new RunnableC0944c(this, arrayList15, operation11));
        }
        HashMap map3 = new HashMap();
        Iterator it5 = arrayList14.iterator();
        AbstractC0977s0 abstractC0977s1 = null;
        while (it5.hasNext()) {
            d dVar = (d) it5.next();
            if (dVar.m3722b()) {
                arrayList12 = arrayList13;
                it = it5;
                str2 = str3;
            } else {
                Object obj2 = dVar.f6264c;
                AbstractC0977s0 abstractC0977s0M3723c = dVar.m3723c(obj2);
                Object obj3 = dVar.f6266e;
                it = it5;
                AbstractC0977s0 abstractC0977s0M3723c2 = dVar.m3723c(obj3);
                str2 = str3;
                arrayList12 = arrayList13;
                SpecialEffectsController.Operation operation12 = dVar.f6262a;
                if (abstractC0977s0M3723c != null && abstractC0977s0M3723c2 != null && abstractC0977s0M3723c != abstractC0977s0M3723c2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + operation12.f6237c + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj3);
                }
                if (abstractC0977s0M3723c == null) {
                    abstractC0977s0M3723c = abstractC0977s0M3723c2;
                }
                if (abstractC0977s1 == null) {
                    abstractC0977s1 = abstractC0977s0M3723c;
                } else if (abstractC0977s0M3723c != null && abstractC0977s1 != abstractC0977s0M3723c) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + operation12.f6237c + " returned Transition " + obj2 + " which uses a different Transition  type than other Fragments.");
                }
            }
            it5 = it;
            str3 = str2;
            arrayList13 = arrayList12;
        }
        ArrayList<b> arrayList16 = arrayList13;
        String str5 = str3;
        ViewGroup viewGroup = this.f6230a;
        if (abstractC0977s1 == null) {
            for (d dVar2 : arrayList14) {
                map3.put(dVar2.f6262a, Boolean.FALSE);
                dVar2.m3721a();
            }
            map = map3;
            operation = operation8;
            operation2 = operation9;
        } else {
            View view5 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList17 = new ArrayList<>();
            ArrayList<View> arrayList18 = new ArrayList<>();
            C8446b c8446b = new C8446b();
            Iterator it6 = arrayList14.iterator();
            SpecialEffectsController.Operation operation13 = operation8;
            ArrayList arrayList19 = arrayList15;
            View view6 = null;
            boolean z16 = false;
            Object obj4 = null;
            SpecialEffectsController.Operation operation14 = operation9;
            while (it6.hasNext()) {
                Iterator it7 = it6;
                Object obj5 = ((d) it6.next()).f6266e;
                if (!(obj5 != null) || operation13 == null || operation14 == null) {
                    arrayList5 = arrayList14;
                    abstractC0977s0 = abstractC0977s1;
                    Rect rect3 = rect2;
                    map2 = map3;
                    view2 = view5;
                    rect = rect3;
                } else {
                    Object objMo3794r = abstractC0977s1.mo3794r(abstractC0977s1.mo3784f(obj5));
                    Fragment fragment4 = operation14.f6237c;
                    arrayList5 = arrayList14;
                    Fragment.C0912c c0912c3 = fragment4.f6100f0;
                    if (c0912c3 == null || (arrayList6 = c0912c3.f6131g) == null) {
                        arrayList6 = new ArrayList<>();
                    }
                    Fragment fragment5 = operation13.f6237c;
                    HashMap map4 = map3;
                    Fragment.C0912c c0912c4 = fragment5.f6100f0;
                    if (c0912c4 == null || (arrayList7 = c0912c4.f6131g) == null) {
                        arrayList7 = new ArrayList<>();
                    }
                    view2 = view5;
                    Fragment.C0912c c0912c5 = fragment5.f6100f0;
                    if (c0912c5 == null || (arrayList8 = c0912c5.f6132h) == null) {
                        arrayList8 = new ArrayList<>();
                    }
                    Rect rect4 = rect2;
                    AbstractC0977s0 abstractC0977s2 = abstractC0977s1;
                    int i12 = 0;
                    while (i12 < arrayList8.size()) {
                        int iIndexOf = arrayList6.indexOf(arrayList8.get(i12));
                        ArrayList<String> arrayList20 = arrayList8;
                        if (iIndexOf != -1) {
                            arrayList6.set(iIndexOf, arrayList7.get(i12));
                        }
                        i12++;
                        arrayList8 = arrayList20;
                    }
                    Fragment.C0912c c0912c6 = fragment4.f6100f0;
                    if (c0912c6 == null || (arrayList9 = c0912c6.f6132h) == null) {
                        arrayList9 = new ArrayList<>();
                    }
                    int i13 = 0;
                    for (int size = arrayList6.size(); i13 < size; size = size) {
                        c8446b.put(arrayList6.get(i13), arrayList9.get(i13));
                        i13++;
                    }
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator<String> it8 = arrayList9.iterator(); it8.hasNext(); it8 = it8) {
                            Log.v("FragmentManager", "Name: " + it8.next());
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator<String> it9 = arrayList6.iterator(); it9.hasNext(); it9 = it9) {
                            Log.v("FragmentManager", "Name: " + it9.next());
                        }
                    }
                    C8446b c8446b2 = new C8446b();
                    m3718j(c8446b2, fragment5.f6094c0);
                    AbstractC8451g.m16520k(arrayList6, c8446b2);
                    AbstractC8451g.m16520k(c8446b2.keySet(), c8446b);
                    C8446b c8446b3 = new C8446b();
                    m3718j(c8446b3, fragment4.f6094c0);
                    AbstractC8451g.m16520k(arrayList9, c8446b3);
                    AbstractC8451g.m16520k(c8446b.values(), c8446b3);
                    C0969o0 c0969o0 = C0965m0.f6370a;
                    for (int i14 = c8446b.f45619c - 1; i14 >= 0; i14--) {
                        if (!c8446b3.containsKey((String) c8446b.m16530m(i14))) {
                            c8446b.mo14869k(i14);
                        }
                    }
                    m3719k(c8446b2, c8446b.keySet());
                    m3719k(c8446b3, c8446b.values());
                    if (c8446b.isEmpty()) {
                        arrayList17.clear();
                        arrayList18.clear();
                        operation13 = operation8;
                        operation14 = operation9;
                        view2 = view2;
                        rect = rect4;
                        map2 = map4;
                        abstractC0977s0 = abstractC0977s2;
                        obj4 = null;
                    } else {
                        ViewTreeObserverOnPreDrawListenerC10066u.m18905a(viewGroup, new RunnableC0954h(operation9, operation8, z10, c8446b3));
                        arrayList17.addAll(c8446b2.values());
                        if (arrayList6.isEmpty()) {
                            abstractC0977s0 = abstractC0977s2;
                            i10 = 0;
                            z13 = false;
                        } else {
                            i10 = 0;
                            z13 = false;
                            View view7 = (View) c8446b2.getOrDefault(arrayList6.get(0), null);
                            abstractC0977s0 = abstractC0977s2;
                            abstractC0977s0.mo3789m(view7, objMo3794r);
                            view6 = view7;
                        }
                        arrayList18.addAll(c8446b3.values());
                        if (arrayList9.isEmpty() || (view3 = (View) c8446b3.getOrDefault(arrayList9.get(i10), z13)) == null) {
                            rect = rect4;
                        } else {
                            rect = rect4;
                            ViewTreeObserverOnPreDrawListenerC10066u.m18905a(viewGroup, new RunnableC0956i(abstractC0977s0, view3, rect));
                            z16 = true;
                        }
                        abstractC0977s0.mo3792p(objMo3794r, view2, arrayList17);
                        abstractC0977s0.mo3788l(objMo3794r, null, null, objMo3794r, arrayList18);
                        Boolean bool = Boolean.TRUE;
                        map2 = map4;
                        map2.put(operation8, bool);
                        map2.put(operation9, bool);
                        operation13 = operation8;
                        operation14 = operation9;
                        obj4 = objMo3794r;
                    }
                }
                abstractC0977s1 = abstractC0977s0;
                it6 = it7;
                arrayList14 = arrayList5;
                Rect rect5 = rect;
                view5 = view2;
                map3 = map2;
                rect2 = rect5;
            }
            ArrayList<d> arrayList21 = arrayList14;
            AbstractC0977s0 abstractC0977s3 = abstractC0977s1;
            Rect rect6 = rect2;
            map = map3;
            View view8 = view5;
            ArrayList arrayList22 = new ArrayList();
            Iterator it10 = arrayList21.iterator();
            operation = operation8;
            Object objMo3786j = null;
            Object objMo3786j2 = null;
            while (it10.hasNext()) {
                it10 = it10;
                d dVar3 = (d) it10.next();
                boolean zM3722b = dVar3.m3722b();
                c8446b = c8446b;
                SpecialEffectsController.Operation operation15 = dVar3.f6262a;
                if (zM3722b) {
                    map.put(operation15, Boolean.FALSE);
                    dVar3.m3721a();
                    str4 = str4;
                } else {
                    String str6 = str4;
                    Object objMo3784f = abstractC0977s3.mo3784f(dVar3.f6264c);
                    SpecialEffectsController.Operation operation16 = operation9;
                    Object obj6 = obj4;
                    boolean z17 = obj6 != null && (operation15 == operation13 || operation15 == operation14);
                    if (objMo3784f == null) {
                        if (!z17) {
                            map.put(operation15, Boolean.FALSE);
                            dVar3.m3721a();
                        }
                        operation13 = operation13;
                        view8 = view8;
                        obj = obj6;
                        view = view6;
                        arrayList4 = arrayList19;
                    } else {
                        obj = obj6;
                        ArrayList<View> arrayList23 = new ArrayList<>();
                        Object obj7 = objMo3786j2;
                        m3717i(operation15.f6237c.f6094c0, arrayList23);
                        if (z17) {
                            if (operation15 == operation13) {
                                arrayList23.removeAll(arrayList17);
                            } else {
                                arrayList23.removeAll(arrayList18);
                            }
                        }
                        if (arrayList23.isEmpty()) {
                            abstractC0977s3.mo3780a(view8, objMo3784f);
                        } else {
                            abstractC0977s3.mo3781b(objMo3784f, arrayList23);
                            abstractC0977s3.mo3788l(objMo3784f, objMo3784f, arrayList23, null, null);
                            if (operation15.f6235a == SpecialEffectsController.Operation.State.GONE) {
                                arrayList4 = arrayList19;
                                arrayList4.remove(operation15);
                                ArrayList<View> arrayList24 = new ArrayList<>(arrayList23);
                                Fragment fragment6 = operation15.f6237c;
                                arrayList24.remove(fragment6.f6094c0);
                                abstractC0977s3.mo3787k(objMo3784f, fragment6.f6094c0, arrayList24);
                                ViewTreeObserverOnPreDrawListenerC10066u.m18905a(viewGroup, new RunnableC0958j(arrayList23));
                            }
                            if (operation15.f6235a == SpecialEffectsController.Operation.State.VISIBLE) {
                                arrayList22.addAll(arrayList23);
                                if (z16) {
                                    abstractC0977s3.mo3790n(objMo3784f, rect6);
                                }
                                view = view6;
                            } else {
                                view = view6;
                                abstractC0977s3.mo3789m(view, objMo3784f);
                            }
                            map.put(operation15, Boolean.TRUE);
                            if (dVar3.f6265d) {
                                objMo3786j = abstractC0977s3.mo3786j(objMo3786j, objMo3784f);
                                objMo3786j2 = obj7;
                            } else {
                                objMo3786j2 = abstractC0977s3.mo3786j(obj7, objMo3784f);
                            }
                        }
                        arrayList4 = arrayList19;
                        if (operation15.f6235a == SpecialEffectsController.Operation.State.VISIBLE) {
                            arrayList22.addAll(arrayList23);
                            if (z16) {
                                abstractC0977s3.mo3790n(objMo3784f, rect6);
                            }
                            view = view6;
                        } else {
                            view = view6;
                            abstractC0977s3.mo3789m(view, objMo3784f);
                        }
                        map.put(operation15, Boolean.TRUE);
                        if (dVar3.f6265d) {
                            objMo3786j = abstractC0977s3.mo3786j(objMo3786j, objMo3784f);
                            objMo3786j2 = obj7;
                        } else {
                            objMo3786j2 = abstractC0977s3.mo3786j(obj7, objMo3784f);
                        }
                    }
                    view6 = view;
                    arrayList19 = arrayList4;
                    operation13 = operation13;
                    view8 = view8;
                    obj4 = obj;
                    str4 = str6;
                    operation9 = operation16;
                    operation14 = operation9;
                }
            }
            SpecialEffectsController.Operation operation17 = operation13;
            SpecialEffectsController.Operation operation18 = operation9;
            String str7 = str4;
            C8452h c8452h = c8446b;
            arrayList15 = arrayList19;
            Object obj8 = obj4;
            Object objMo3785i = abstractC0977s3.mo3785i(objMo3786j, objMo3786j2, obj8);
            if (objMo3785i != null) {
                SpecialEffectsController.Operation operation19 = operation17;
                for (d dVar4 : arrayList21) {
                    if (!dVar4.m3722b()) {
                        SpecialEffectsController.Operation operation20 = dVar4.f6262a;
                        if (obj8 != null) {
                            if (operation20 != operation19) {
                                operation5 = operation18;
                                if (operation20 == operation5) {
                                }
                                if (dVar4.f6264c == null || z12) {
                                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                                    if (C10029b0.g.m18699c(viewGroup)) {
                                        str = str7;
                                        Fragment fragment7 = operation20.f6237c;
                                        abstractC0977s3.mo3791o(objMo3785i, dVar4.f6263b, new RunnableC0960k(dVar4, operation20));
                                    } else {
                                        if (FragmentManager.m3608K(2)) {
                                            str = str7;
                                            Log.v(str, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation20);
                                        } else {
                                            str = str7;
                                        }
                                        dVar4.m3721a();
                                    }
                                } else {
                                    str = str7;
                                }
                                operation18 = operation5;
                                str7 = str;
                                operation19 = operation;
                            } else {
                                operation5 = operation18;
                            }
                            z12 = true;
                            if (dVar4.f6264c == null) {
                                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                                if (C10029b0.g.m18699c(viewGroup)) {
                                    if (FragmentManager.m3608K(2)) {
                                        str = str7;
                                        Log.v(str, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation20);
                                    } else {
                                        str = str7;
                                    }
                                    dVar4.m3721a();
                                } else {
                                    str = str7;
                                    Fragment fragment8 = operation20.f6237c;
                                    abstractC0977s3.mo3791o(objMo3785i, dVar4.f6263b, new RunnableC0960k(dVar4, operation20));
                                }
                            } else {
                                WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                                if (C10029b0.g.m18699c(viewGroup)) {
                                    if (FragmentManager.m3608K(2)) {
                                        str = str7;
                                        Log.v(str, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation20);
                                    } else {
                                        str = str7;
                                    }
                                    dVar4.m3721a();
                                } else {
                                    str = str7;
                                    Fragment fragment9 = operation20.f6237c;
                                    abstractC0977s3.mo3791o(objMo3785i, dVar4.f6263b, new RunnableC0960k(dVar4, operation20));
                                }
                            }
                            operation18 = operation5;
                            str7 = str;
                            operation19 = operation;
                        } else {
                            operation5 = operation18;
                        }
                        z12 = false;
                        if (dVar4.f6264c == null) {
                            WeakHashMap<View, C10049l0> weakHashMap4 = C10029b0.f50993a;
                            if (C10029b0.g.m18699c(viewGroup)) {
                                if (FragmentManager.m3608K(2)) {
                                    str = str7;
                                    Log.v(str, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation20);
                                } else {
                                    str = str7;
                                }
                                dVar4.m3721a();
                            } else {
                                str = str7;
                                Fragment fragment10 = operation20.f6237c;
                                abstractC0977s3.mo3791o(objMo3785i, dVar4.f6263b, new RunnableC0960k(dVar4, operation20));
                            }
                        } else {
                            WeakHashMap<View, C10049l0> weakHashMap5 = C10029b0.f50993a;
                            if (C10029b0.g.m18699c(viewGroup)) {
                                if (FragmentManager.m3608K(2)) {
                                    str = str7;
                                    Log.v(str, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation20);
                                } else {
                                    str = str7;
                                }
                                dVar4.m3721a();
                            } else {
                                str = str7;
                                Fragment fragment11 = operation20.f6237c;
                                abstractC0977s3.mo3791o(objMo3785i, dVar4.f6263b, new RunnableC0960k(dVar4, operation20));
                            }
                        }
                        operation18 = operation5;
                        str7 = str;
                        operation19 = operation;
                    }
                }
                str4 = str7;
                operation2 = operation18;
                WeakHashMap<View, C10049l0> weakHashMap6 = C10029b0.f50993a;
                if (C10029b0.g.m18699c(viewGroup)) {
                    C0965m0.m3778a(arrayList22, 4);
                    ArrayList arrayList25 = new ArrayList();
                    int size2 = arrayList18.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        View view9 = arrayList18.get(i15);
                        WeakHashMap<View, C10049l0> weakHashMap7 = C10029b0.f50993a;
                        arrayList25.add(C10029b0.i.m18717k(view9));
                        C10029b0.i.m18728v(view9, null);
                    }
                    if (FragmentManager.m3608K(2)) {
                        Log.v(str4, ">>>>> Beginning transition <<<<<");
                        Log.v(str4, ">>>>> SharedElementFirstOutViews <<<<<");
                        for (Iterator<View> it11 = arrayList17.iterator(); it11.hasNext(); it11 = it11) {
                            View next = it11.next();
                            Log.v(str4, "View: " + next + " Name: " + C10029b0.i.m18717k(next));
                        }
                        Log.v(str4, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator<View> it12 = arrayList18.iterator(); it12.hasNext(); it12 = it12) {
                            View next2 = it12.next();
                            Log.v(str4, "View: " + next2 + " Name: " + C10029b0.i.m18717k(next2));
                        }
                    }
                    abstractC0977s3.mo3782c(viewGroup, objMo3785i);
                    int size3 = arrayList18.size();
                    ArrayList arrayList26 = new ArrayList();
                    int i16 = 0;
                    while (i16 < size3) {
                        View view10 = arrayList17.get(i16);
                        WeakHashMap<View, C10049l0> weakHashMap8 = C10029b0.f50993a;
                        String strM18717k = C10029b0.i.m18717k(view10);
                        arrayList26.add(strM18717k);
                        if (strM18717k == null) {
                            operation4 = operation2;
                            arrayList3 = arrayList15;
                        } else {
                            operation4 = operation2;
                            C10029b0.i.m18728v(view10, null);
                            C8452h c8452h2 = c8452h;
                            String str8 = (String) c8452h2.getOrDefault(strM18717k, null);
                            c8452h = c8452h2;
                            int i17 = 0;
                            while (true) {
                                arrayList3 = arrayList15;
                                if (i17 >= size3) {
                                    break;
                                }
                                if (str8.equals(arrayList25.get(i17))) {
                                    C10029b0.i.m18728v(arrayList18.get(i17), strM18717k);
                                    break;
                                } else {
                                    i17++;
                                    arrayList15 = arrayList3;
                                }
                            }
                        }
                        i16++;
                        arrayList15 = arrayList3;
                        operation2 = operation4;
                    }
                    operation3 = operation2;
                    arrayList2 = arrayList15;
                    ViewTreeObserverOnPreDrawListenerC10066u.m18905a(viewGroup, new RunnableC0975r0(size3, arrayList18, arrayList25, arrayList17, arrayList26));
                    z11 = false;
                    C0965m0.m3778a(arrayList22, 0);
                    abstractC0977s3.mo3793q(obj8, arrayList17, arrayList18);
                }
                zContainsValue = map.containsValue(Boolean.TRUE);
                context = viewGroup.getContext();
                arrayList10 = new ArrayList();
                z14 = z11;
                for (b bVar : arrayList16) {
                    if (bVar.m3722b()) {
                        bVar.m3721a();
                    } else {
                        aVarM3720c = bVar.m3720c(context);
                        if (aVarM3720c == null) {
                            bVar.m3721a();
                        } else {
                            animator = aVarM3720c.f6418b;
                            if (animator == null) {
                                arrayList10.add(bVar);
                            } else {
                                operation7 = bVar.f6262a;
                                fragment2 = operation7.f6237c;
                                if (Boolean.TRUE.equals(map.get(operation7))) {
                                    if (FragmentManager.m3608K(2)) {
                                        Log.v(str4, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                                    }
                                    bVar.m3721a();
                                } else {
                                    if (operation7.f6235a == SpecialEffectsController.Operation.State.GONE) {
                                        z15 = true;
                                    } else {
                                        z15 = z11;
                                    }
                                    arrayList11 = arrayList2;
                                    if (z15) {
                                        arrayList11.remove(operation7);
                                    }
                                    View view11 = fragment2.f6094c0;
                                    viewGroup.startViewTransition(view11);
                                    animator.addListener(new C0946d(viewGroup, view11, z15, operation7, bVar));
                                    animator.setTarget(view11);
                                    animator.start();
                                    if (FragmentManager.m3608K(2)) {
                                        Log.v(str4, "Animator from operation " + operation7 + " has started.");
                                    }
                                    bVar.f6263b.m17520b(new C0948e(animator, operation7));
                                    arrayList2 = arrayList11;
                                    z14 = true;
                                }
                            }
                        }
                    }
                }
                ArrayList<SpecialEffectsController.Operation> arrayList27 = arrayList2;
                for (b bVar2 : arrayList10) {
                    operation6 = bVar2.f6262a;
                    fragment = operation6.f6237c;
                    if (zContainsValue) {
                        if (FragmentManager.m3608K(2)) {
                            Log.v(str4, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                        }
                        bVar2.m3721a();
                    } else if (z14) {
                        if (FragmentManager.m3608K(2)) {
                            Log.v(str4, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                        }
                        bVar2.m3721a();
                    } else {
                        view4 = fragment.f6094c0;
                        C0981u.a aVarM3720c2 = bVar2.m3720c(context);
                        aVarM3720c2.getClass();
                        animation = aVarM3720c2.f6417a;
                        animation.getClass();
                        if (operation6.f6235a != SpecialEffectsController.Operation.State.REMOVED) {
                            view4.startAnimation(animation);
                            bVar2.m3721a();
                        } else {
                            viewGroup.startViewTransition(view4);
                            C0981u.b bVar3 = new C0981u.b(animation, viewGroup, view4);
                            bVar3.setAnimationListener(new AnimationAnimationListenerC0950f(view4, viewGroup, bVar2, operation6));
                            view4.startAnimation(bVar3);
                            if (FragmentManager.m3608K(2)) {
                                Log.v(str4, "Animation from operation " + operation6 + " has started.");
                            }
                        }
                        bVar2.f6263b.m17520b(new C0952g(view4, viewGroup, bVar2, operation6));
                    }
                }
                for (SpecialEffectsController.Operation operation21 : arrayList27) {
                    operation21.f6235a.applyState(operation21.f6237c.f6094c0);
                }
                arrayList27.clear();
                if (FragmentManager.m3608K(2)) {
                    Log.v(str4, "Completed executing operations from " + operation + str5 + operation3);
                }
            }
            str4 = str7;
            operation2 = operation18;
        }
        operation3 = operation2;
        arrayList2 = arrayList15;
        z11 = false;
        zContainsValue = map.containsValue(Boolean.TRUE);
        context = viewGroup.getContext();
        arrayList10 = new ArrayList();
        z14 = z11;
        while (r5.hasNext()) {
            if (bVar.m3722b()) {
                bVar.m3721a();
            } else {
                aVarM3720c = bVar.m3720c(context);
                if (aVarM3720c == null) {
                    bVar.m3721a();
                } else {
                    animator = aVarM3720c.f6418b;
                    if (animator == null) {
                        arrayList10.add(bVar);
                    } else {
                        operation7 = bVar.f6262a;
                        fragment2 = operation7.f6237c;
                        if (Boolean.TRUE.equals(map.get(operation7))) {
                            if (FragmentManager.m3608K(2)) {
                                Log.v(str4, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                            }
                            bVar.m3721a();
                        } else {
                            if (operation7.f6235a == SpecialEffectsController.Operation.State.GONE) {
                                z15 = true;
                            } else {
                                z15 = z11;
                            }
                            arrayList11 = arrayList2;
                            if (z15) {
                                arrayList11.remove(operation7);
                            }
                            View view12 = fragment2.f6094c0;
                            viewGroup.startViewTransition(view12);
                            animator.addListener(new C0946d(viewGroup, view12, z15, operation7, bVar));
                            animator.setTarget(view12);
                            animator.start();
                            if (FragmentManager.m3608K(2)) {
                                Log.v(str4, "Animator from operation " + operation7 + " has started.");
                            }
                            bVar.f6263b.m17520b(new C0948e(animator, operation7));
                            arrayList2 = arrayList11;
                            z14 = true;
                        }
                    }
                }
            }
        }
        ArrayList<SpecialEffectsController.Operation> arrayList28 = arrayList2;
        while (r0.hasNext()) {
            operation6 = bVar2.f6262a;
            fragment = operation6.f6237c;
            if (zContainsValue) {
                if (FragmentManager.m3608K(2)) {
                    Log.v(str4, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                }
                bVar2.m3721a();
            } else if (z14) {
                if (FragmentManager.m3608K(2)) {
                    Log.v(str4, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                }
                bVar2.m3721a();
            } else {
                view4 = fragment.f6094c0;
                C0981u.a aVarM3720c3 = bVar2.m3720c(context);
                aVarM3720c3.getClass();
                animation = aVarM3720c3.f6417a;
                animation.getClass();
                if (operation6.f6235a != SpecialEffectsController.Operation.State.REMOVED) {
                    view4.startAnimation(animation);
                    bVar2.m3721a();
                } else {
                    viewGroup.startViewTransition(view4);
                    C0981u.b bVar4 = new C0981u.b(animation, viewGroup, view4);
                    bVar4.setAnimationListener(new AnimationAnimationListenerC0950f(view4, viewGroup, bVar2, operation6));
                    view4.startAnimation(bVar4);
                    if (FragmentManager.m3608K(2)) {
                        Log.v(str4, "Animation from operation " + operation6 + " has started.");
                    }
                }
                bVar2.f6263b.m17520b(new C0952g(view4, viewGroup, bVar2, operation6));
            }
        }
        while (r0.hasNext()) {
            operation21.f6235a.applyState(operation21.f6237c.f6094c0);
        }
        arrayList28.clear();
        if (FragmentManager.m3608K(2)) {
            Log.v(str4, "Completed executing operations from " + operation + str5 + operation3);
        }
    }
}
