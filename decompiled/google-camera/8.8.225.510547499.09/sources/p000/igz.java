package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class igz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, igx {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f30895a;

    /* JADX INFO: renamed from: c */
    public final List f30897c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j */
    private final Handler f30904j = new Handler();

    /* JADX INFO: renamed from: g */
    public kba f30901g = gog.f25858k;

    /* JADX INFO: renamed from: h */
    public kba f30902h = gog.f25859l;

    /* JADX INFO: renamed from: i */
    private final AtomicInteger f30903i = new AtomicInteger(-1);

    /* JADX INFO: renamed from: e */
    public final Object f30899e = new Object();

    /* JADX INFO: renamed from: b */
    public final List f30896b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: d */
    public final List f30898d = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f */
    public boolean f30900f = false;

    public igz(View view) {
        this.f30895a = new AtomicReference(view);
    }

    @Override // p000.igx
    /* JADX INFO: renamed from: a */
    public final void mo11315a() {
        synchronized (this.f30899e) {
            View view = (View) this.f30895a.get();
            if (this.f30900f && view != null) {
                this.f30901g.close();
                this.f30902h.close();
                this.f30901g = gog.f25856i;
                this.f30902h = gog.f25857j;
                this.f30900f = false;
            }
        }
    }

    @Override // p000.igx
    /* JADX INFO: renamed from: b */
    public final boolean mo11316b() {
        View view = (View) this.f30895a.get();
        if (view == null) {
            return false;
        }
        return view.getParent().getChildVisibleRect(view, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()), new Point());
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        mo11315a();
        this.f30896b.clear();
        this.f30898d.clear();
        this.f30897c.clear();
        this.f30895a.set(null);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int andSet;
        View view = (View) this.f30895a.get();
        if (view == null) {
            return;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            if (!view.isShown()) {
                return;
            } else {
                visibility = 0;
            }
        }
        if (visibility == 4) {
            if (view.isShown()) {
                return;
            } else {
                visibility = 4;
            }
        }
        if ((visibility == 8 && view.isShown()) || (andSet = this.f30903i.getAndSet(visibility)) == visibility) {
            return;
        }
        if (visibility == 0) {
            Iterator it = this.f30896b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        } else if (andSet >= 0) {
            Iterator it2 = this.f30898d.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        if (((View) this.f30895a.get()) == null) {
            return;
        }
        if (!mo11316b()) {
            this.f30904j.removeCallbacksAndMessages(null);
            return;
        }
        this.f30904j.removeCallbacksAndMessages(null);
        Iterator it = this.f30897c.iterator();
        while (it.hasNext()) {
            this.f30904j.postDelayed((Runnable) it.next(), 500L);
        }
    }
}
