package p507yc;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p387t0.C9166r;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;

/* JADX INFO: renamed from: yc.n */
/* JADX INFO: loaded from: classes.dex */
public final class C10347n {

    /* JADX INFO: renamed from: yc.n$a */
    public class a implements InterfaceC10060r {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f52051a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c f52052b;

        public a(b bVar, c cVar) {
            this.f52051a = bVar;
            this.f52052b = cVar;
        }

        @Override // p471x2.InterfaceC10060r
        /* JADX INFO: renamed from: c */
        public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
            return this.f52051a.mo14692a(view, c10063s0, new c(this.f52052b));
        }
    }

    /* JADX INFO: renamed from: yc.n$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        C10063s0 mo14692a(View view, C10063s0 c10063s0, c cVar);
    }

    /* JADX INFO: renamed from: yc.n$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public int f52053a;

        /* JADX INFO: renamed from: b */
        public final int f52054b;

        /* JADX INFO: renamed from: c */
        public int f52055c;

        /* JADX INFO: renamed from: d */
        public int f52056d;

        public c(int i10, int i11, int i12, int i13) {
            this.f52053a = i10;
            this.f52054b = i11;
            this.f52055c = i12;
            this.f52056d = i13;
        }

        public c(c cVar) {
            this.f52053a = cVar.f52053a;
            this.f52054b = cVar.f52054b;
            this.f52055c = cVar.f52055c;
            this.f52056d = cVar.f52056d;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19361a(View view, b bVar) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, new a(bVar, new c(C10029b0.e.m18688f(view), view.getPaddingTop(), C10029b0.e.m18687e(view), view.getPaddingBottom())));
        if (C10029b0.g.m18698b(view)) {
            C10029b0.h.m18706c(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC10348o());
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m19362b(int i10, Context context) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: c */
    public static ViewGroup m19363c(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* JADX INFO: renamed from: d */
    public static C9166r m19364d(View view) {
        ViewGroup viewGroupM19363c = m19363c(view);
        if (viewGroupM19363c == null) {
            return null;
        }
        return new C9166r(viewGroupM19363c);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m19365e(View view) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        return C10029b0.e.m18686d(view) == 1;
    }

    /* JADX INFO: renamed from: f */
    public static PorterDuff.Mode m19366f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
