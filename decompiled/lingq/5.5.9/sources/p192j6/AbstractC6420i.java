package p192j6;

import ae.C0062b;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p171i6.InterfaceC6199d;

/* JADX INFO: renamed from: j6.i */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC6420i<T extends View, Z> extends AbstractC6412a<Z> {

    /* JADX INFO: renamed from: a */
    public final T f36890a;

    /* JADX INFO: renamed from: b */
    public final a f36891b;

    /* JADX INFO: renamed from: j6.i$a */
    public static final class a {

        /* JADX INFO: renamed from: d */
        public static Integer f36892d;

        /* JADX INFO: renamed from: a */
        public final View f36893a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f36894b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public ViewTreeObserverOnPreDrawListenerC10641a f36895c;

        /* JADX INFO: renamed from: j6.i$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC10641a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            public final WeakReference<a> f36896a;

            public ViewTreeObserverOnPreDrawListenerC10641a(a aVar) {
                this.f36896a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f36896a.get();
                if (aVar != null) {
                    ArrayList arrayList = aVar.f36894b;
                    if (!arrayList.isEmpty()) {
                        int iM13042c = aVar.m13042c();
                        int iM13041b = aVar.m13041b();
                        boolean z10 = false;
                        if (iM13042c > 0 || iM13042c == Integer.MIN_VALUE) {
                            if (iM13041b > 0 || iM13041b == Integer.MIN_VALUE) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((InterfaceC6418g) it.next()).mo6388b(iM13042c, iM13041b);
                            }
                            ViewTreeObserver viewTreeObserver = aVar.f36893a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(aVar.f36895c);
                            }
                            aVar.f36895c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f36893a = view;
        }

        /* JADX INFO: renamed from: a */
        public final int m13040a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            View view = this.f36893a;
            if (view.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (f36892d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C0062b.m345f0(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f36892d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f36892d.intValue();
        }

        /* JADX INFO: renamed from: b */
        public final int m13041b() {
            View view = this.f36893a;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return m13040a(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        /* JADX INFO: renamed from: c */
        public final int m13042c() {
            View view = this.f36893a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return m13040a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public AbstractC6420i(T t10) {
        C0062b.m345f0(t10);
        this.f36890a = t10;
        this.f36891b = new a(t10);
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: g */
    public final void mo12735g(InterfaceC6199d interfaceC6199d) {
        this.f36890a.setTag(R.id.glide_custom_view_target_tag, interfaceC6199d);
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: i */
    public final void mo12736i(InterfaceC6418g interfaceC6418g) {
        this.f36891b.f36894b.remove(interfaceC6418g);
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: l */
    public void mo11551l(Drawable drawable) {
        a aVar = this.f36891b;
        ViewTreeObserver viewTreeObserver = aVar.f36893a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f36895c);
        }
        aVar.f36895c = null;
        aVar.f36894b.clear();
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: m */
    public final void mo12738m(InterfaceC6418g interfaceC6418g) {
        a aVar = this.f36891b;
        int iM13042c = aVar.m13042c();
        int iM13041b = aVar.m13041b();
        boolean z10 = false;
        if (iM13042c > 0 || iM13042c == Integer.MIN_VALUE) {
            if (iM13041b > 0 || iM13041b == Integer.MIN_VALUE) {
                z10 = true;
            }
        }
        if (z10) {
            interfaceC6418g.mo6388b(iM13042c, iM13041b);
            return;
        }
        ArrayList arrayList = aVar.f36894b;
        if (!arrayList.contains(interfaceC6418g)) {
            arrayList.add(interfaceC6418g);
        }
        if (aVar.f36895c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f36893a.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC10641a viewTreeObserverOnPreDrawListenerC10641a = new a.ViewTreeObserverOnPreDrawListenerC10641a(aVar);
            aVar.f36895c = viewTreeObserverOnPreDrawListenerC10641a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10641a);
        }
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: p */
    public final InterfaceC6199d mo12740p() {
        Object tag = this.f36890a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC6199d) {
            return (InterfaceC6199d) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final String toString() {
        return "Target for: " + this.f36890a;
    }
}
