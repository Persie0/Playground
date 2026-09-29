package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class qy5 implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: e */
    public static final HashMap f58386e = new HashMap();

    /* JADX INFO: renamed from: c */
    public final WeakReference f58389c;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f58387a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final Handler f58388b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f58390d = new AtomicBoolean(false);

    public qy5(Activity activity) {
        this.f58389c = new WeakReference(activity);
    }

    /* JADX INFO: Removed unreachable split cross block B:23:0x0033 */
    /* JADX INFO: renamed from: a */
    public final void m20197a(View view) {
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            mv5 mv5Var = new mv5(1, view, this);
            if (!set.contains(this)) {
                try {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        mv5Var.run();
                    } else {
                        this.f58388b.post(mv5Var);
                    }
                } catch (Throwable th) {
                    lp1.m16420a(this, th);
                }
            }
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m20198b(View view) {
        String str;
        String str2;
        boolean zM15427f;
        LinkedHashSet linkedHashSet = this.f58387a;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            String lowerCase = vk9.m23376L0(((EditText) view).getText().toString()).toString().toLowerCase();
            lowerCase.getClass();
            if (lowerCase.length() != 0 && !linkedHashSet.contains(lowerCase) && lowerCase.length() <= 100) {
                linkedHashSet.add(lowerCase);
                HashMap map = new HashMap();
                ArrayList arrayListM17152e = my5.m17152e(view);
                CopyOnWriteArraySet copyOnWriteArraySet = py5.f56994d;
                ArrayList arrayListM17151b = null;
                for (py5 py5Var : new HashSet(py5.m19568a())) {
                    String strM15428g = "r2".equals(py5Var.m19570c()) ? new Regex("[^\\d.]").m15428g(lowerCase, "") : lowerCase;
                    if (lp1.f49971a.contains(py5Var)) {
                        str = null;
                    } else {
                        try {
                            str = py5Var.f56996b;
                        } catch (Throwable th) {
                            lp1.m16420a(py5Var, th);
                            str = null;
                        }
                    }
                    if (str.length() > 0) {
                        if (lp1.f49971a.contains(py5Var)) {
                            str2 = null;
                            zM15427f = false;
                            if (!lp1.f49971a.contains(my5.class)) {
                                try {
                                    str2.getClass();
                                    zM15427f = new Regex(str2).m15427f(strM15428g);
                                } catch (Throwable th2) {
                                    lp1.m16420a(my5.class, th2);
                                }
                            }
                            if (!zM15427f) {
                            }
                        } else {
                            try {
                                str2 = py5Var.f56996b;
                            } catch (Throwable th3) {
                                lp1.m16420a(py5Var, th3);
                                str2 = null;
                            }
                            zM15427f = false;
                            if (!lp1.f49971a.contains(my5.class)) {
                                str2.getClass();
                                zM15427f = new Regex(str2).m15427f(strM15428g);
                            }
                            if (!zM15427f) {
                            }
                        }
                    }
                    if (my5.m17155i(arrayListM17152e, py5Var.m19569b())) {
                        wkd.m24039a(map, py5Var.m19570c(), strM15428g);
                    } else {
                        if (arrayListM17151b == null) {
                            arrayListM17151b = my5.m17151b(view);
                        }
                        if (my5.m17155i(arrayListM17151b, py5Var.m19569b())) {
                            wkd.m24039a(map, py5Var.m19570c(), strM15428g);
                        }
                    }
                }
                AbstractC3184kh.m15199F(map);
            }
        } catch (Throwable th4) {
            lp1.m16420a(this, th4);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        if (view != null) {
            try {
                m20197a(view);
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return;
            }
        }
        if (view2 != null) {
            m20197a(view2);
        }
    }
}
