package p382s7;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import dm.C5207g;
import java.lang.ref.WeakReference;
import p394t7.C9218d;

/* JADX INFO: renamed from: s7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8972e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f47019a = 0;

    /* JADX INFO: renamed from: s7.e$a */
    public static final class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final EventBinding f47020a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<View> f47021b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<View> f47022c;

        /* JADX INFO: renamed from: d */
        public final View.OnTouchListener f47023d;

        /* JADX INFO: renamed from: e */
        public final boolean f47024e = true;

        public a(EventBinding eventBinding, View view, View view2) {
            this.f47020a = eventBinding;
            this.f47021b = new WeakReference<>(view2);
            this.f47022c = new WeakReference<>(view);
            this.f47023d = C9218d.m17570f(view2);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C5207g.m11111f(view, "view");
            C5207g.m11111f(motionEvent, "motionEvent");
            View view2 = this.f47022c.get();
            View view3 = this.f47021b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                C8968a c8968a = C8968a.f46984a;
                C8968a.m17196a(this.f47020a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f47023d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    static {
        new C8972e();
    }
}
