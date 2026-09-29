package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p143h2.C5882e;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0756d {

    /* JADX INFO: renamed from: a */
    public final MotionLayout f5252a;

    /* JADX INFO: renamed from: c */
    public HashSet<View> f5254c;

    /* JADX INFO: renamed from: e */
    public ArrayList<C0755c.a> f5256e;

    /* JADX INFO: renamed from: b */
    public final ArrayList<C0755c> f5253b = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final String f5255d = "ViewTransitionController";

    /* JADX INFO: renamed from: f */
    public final ArrayList<C0755c.a> f5257f = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.d$a */
    public class a {
    }

    public C0756d(MotionLayout motionLayout) {
        this.f5252a = motionLayout;
    }

    /* JADX INFO: renamed from: a */
    public static void m2854a(C0755c c0755c, boolean z10) {
        C5882e sharedValues = ConstraintLayout.getSharedValues();
        int i10 = c0755c.f5238u;
        a aVar = new a();
        HashMap<Integer, HashSet<WeakReference<Object>>> map = sharedValues.f35192a;
        HashSet<WeakReference<Object>> hashSet = map.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
