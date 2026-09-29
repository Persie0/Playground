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
import android.widget.ImageView;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p171i6.InterfaceC6199d;

/* JADX INFO: renamed from: j6.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6415d<T extends View, Z> implements InterfaceC6419h<Z> {

    /* JADX INFO: renamed from: a */
    public final a f36882a;

    /* JADX INFO: renamed from: b */
    public final T f36883b;

    /* JADX INFO: renamed from: j6.d$a */
    public static final class a {

        /* JADX INFO: renamed from: d */
        public static Integer f36884d;

        /* JADX INFO: renamed from: a */
        public final View f36885a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f36886b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public ViewTreeObserverOnPreDrawListenerC10640a f36887c;

        /* JADX INFO: renamed from: j6.d$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC10640a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            public final WeakReference<a> f36888a;

            public ViewTreeObserverOnPreDrawListenerC10640a(a aVar) {
                this.f36888a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f36888a.get();
                if (aVar != null) {
                    ArrayList arrayList = aVar.f36886b;
                    if (!arrayList.isEmpty()) {
                        int iM13039c = aVar.m13039c();
                        int iM13038b = aVar.m13038b();
                        boolean z10 = false;
                        if (iM13039c > 0 || iM13039c == Integer.MIN_VALUE) {
                            if (iM13038b > 0 || iM13038b == Integer.MIN_VALUE) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((InterfaceC6418g) it.next()).mo6388b(iM13039c, iM13038b);
                            }
                            ViewTreeObserver viewTreeObserver = aVar.f36885a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(aVar.f36887c);
                            }
                            aVar.f36887c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public a(ImageView imageView) {
            this.f36885a = imageView;
        }

        /* JADX INFO: renamed from: a */
        public final int m13037a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            View view = this.f36885a;
            if (view.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (f36884d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C0062b.m345f0(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f36884d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f36884d.intValue();
        }

        /* JADX INFO: renamed from: b */
        public final int m13038b() {
            View view = this.f36885a;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return m13037a(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        /* JADX INFO: renamed from: c */
        public final int m13039c() {
            View view = this.f36885a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return m13037a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public AbstractC6415d(ImageView imageView) {
        C0062b.m345f0(imageView);
        this.f36883b = imageView;
        this.f36882a = new a(imageView);
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: a */
    public final void mo6252a() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: b */
    public final void mo6253b() {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: g */
    public final void mo12735g(InterfaceC6199d interfaceC6199d) {
        this.f36883b.setTag(R.id.glide_custom_view_target_tag, interfaceC6199d);
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: h */
    public final void mo6257h() {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: i */
    public final void mo12736i(InterfaceC6418g interfaceC6418g) {
        this.f36882a.f36886b.remove(interfaceC6418g);
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: k */
    public final void mo12737k(Drawable drawable) {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: l */
    public final void mo11551l(Drawable drawable) {
        a aVar = this.f36882a;
        ViewTreeObserver viewTreeObserver = aVar.f36885a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f36887c);
        }
        aVar.f36887c = null;
        aVar.f36886b.clear();
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: m */
    public final void mo12738m(InterfaceC6418g interfaceC6418g) {
        a aVar = this.f36882a;
        int iM13039c = aVar.m13039c();
        int iM13038b = aVar.m13038b();
        boolean z10 = false;
        if (iM13039c > 0 || iM13039c == Integer.MIN_VALUE) {
            if (iM13038b > 0 || iM13038b == Integer.MIN_VALUE) {
                z10 = true;
            }
        }
        if (z10) {
            interfaceC6418g.mo6388b(iM13039c, iM13038b);
            return;
        }
        ArrayList arrayList = aVar.f36886b;
        if (!arrayList.contains(interfaceC6418g)) {
            arrayList.add(interfaceC6418g);
        }
        if (aVar.f36887c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f36885a.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC10640a viewTreeObserverOnPreDrawListenerC10640a = new a.ViewTreeObserverOnPreDrawListenerC10640a(aVar);
            aVar.f36887c = viewTreeObserverOnPreDrawListenerC10640a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10640a);
        }
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: p */
    public final InterfaceC6199d mo12740p() {
        Object tag = this.f36883b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC6199d) {
            return (InterfaceC6199d) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public final String toString() {
        return "Target for: " + this.f36883b;
    }
}
