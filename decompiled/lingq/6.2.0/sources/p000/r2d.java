package p000;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.p002ui.contentcapture.ViewOnAttachStateChangeListenerC0291c;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.C0423c;
import com.google.common.base.AbstractC1081a;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r2d {
    /* JADX INFO: renamed from: a */
    public static void m20261a(ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        rv8 rv8Var;
        C0423c c0423c;
        C3024g3 c3024g3;
        vi3 vi3Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseM16204n = AbstractC3298lh.m16204n(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM16204n != null && (value = viewTranslationResponseM16204n.getValue("android:text")) != null && (text = value.getText()) != null && (rv8Var = (rv8) viewOnAttachStateChangeListenerC0291c.m1328g().m10152b((int) jKeyAt)) != null && (c0423c = rv8Var.f59881a) != null && (c3024g3 = (C3024g3) AbstractC0422b.m1838a(c0423c.f4974d, AbstractC0421a.f4956l)) != null && (vi3Var = (vi3) c3024g3.f40091b) != null) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20262b(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static d09 m20263c(Set set, li7 li7Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof d09)) {
                return new e09(set2, li7Var);
            }
            d09 d09Var = (d09) set2;
            return new e09((SortedSet) d09Var.f34810a, AbstractC1081a.m6265b(d09Var.f34811b, li7Var));
        }
        if (!(set instanceof d09)) {
            set.getClass();
            return new d09(set, li7Var);
        }
        d09 d09Var2 = (d09) set;
        return new d09(d09Var2.f34810a, AbstractC1081a.m6265b(d09Var2.f34811b, li7Var));
    }

    /* JADX INFO: renamed from: d */
    public static int m20264d(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static c09 m20265e(Set set, ImmutableSet immutableSet) {
        bna.m3979v(set, "set1");
        bna.m3979v(immutableSet, "set2");
        return new c09(set, immutableSet);
    }

    /* JADX INFO: renamed from: f */
    public static HashSet m20266f(int i) {
        int iCeil;
        if (i < 3) {
            AbstractC3489q9.m19779i(i, "expectedSize");
            iCeil = i + 1;
        } else {
            iCeil = i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    /* JADX INFO: renamed from: g */
    public static void m20267g(ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c, long[] jArr, Consumer consumer) {
        C0423c c0423c;
        for (long j : jArr) {
            rv8 rv8Var = (rv8) viewOnAttachStateChangeListenerC0291c.m1328g().m10152b((int) j);
            if (rv8Var != null && (c0423c = rv8Var.f59881a) != null) {
                AbstractC3298lh.m16207q();
                ViewTranslationRequest.Builder builderM16202l = AbstractC3298lh.m16202l(viewOnAttachStateChangeListenerC0291c.f3830a.getAutofillId(), c0423c.f4976f);
                List list = (List) AbstractC0422b.m1838a(c0423c.f4974d, AbstractC0424d.f4979C);
                if (list != null) {
                    builderM16202l.setValue("android:text", TranslationRequestValue.forText(new C3419on(hg5.m13229a(list, "\n", null, 62))));
                    consumer.accept(builderM16202l.build());
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m20268h(ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c, LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (fa4.m11650l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            m20261a(viewOnAttachStateChangeListenerC0291c, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC0291c.f3830a.post(new RunnableC0806bd(2, viewOnAttachStateChangeListenerC0291c, longSparseArray));
        }
    }
}
