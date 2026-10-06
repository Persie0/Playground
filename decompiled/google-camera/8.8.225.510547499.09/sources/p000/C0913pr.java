package p000;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: pr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0913pr {

    /* JADX INFO: renamed from: a */
    public final okt f47447a;

    /* JADX INFO: renamed from: b */
    public omx f47448b;

    /* JADX INFO: renamed from: c */
    private final Runnable f47449c;

    /* JADX INFO: renamed from: d */
    private OnBackInvokedCallback f47450d;

    /* JADX INFO: renamed from: e */
    private OnBackInvokedDispatcher f47451e;

    /* JADX INFO: renamed from: f */
    private boolean f47452f;

    public C0913pr() {
        this(null);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0903ph m19328a(AbstractC0909pn abstractC0909pn) {
        this.f47447a.add(abstractC0909pn);
        C0912pq c0912pq = new C0912pq(this, abstractC0909pn);
        abstractC0909pn.m19322b(c0912pq);
        m19331d();
        abstractC0909pn.f47441d = this.f47448b;
        return c0912pq;
    }

    /* JADX INFO: renamed from: b */
    public final void m19329b() {
        Object objPrevious;
        okt oktVar = this.f47447a;
        ListIterator<E> listIterator = oktVar.listIterator(oktVar.f46211a);
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC0909pn) objPrevious).f47439b);
        AbstractC0909pn abstractC0909pn = (AbstractC0909pn) objPrevious;
        if (abstractC0909pn != null) {
            abstractC0909pn.mo3794a();
            return;
        }
        Runnable runnable = this.f47449c;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19330c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        this.f47451e = onBackInvokedDispatcher;
        m19331d();
    }

    public C0913pr(Runnable runnable) {
        this.f47449c = runnable;
        this.f47447a = new okt();
        this.f47448b = new C0910po(this, 1);
        this.f47450d = C0911pp.f47444a.m19325a(new C0910po(this, 0));
    }

    /* JADX INFO: renamed from: d */
    public final void m19331d() {
        boolean z;
        okt oktVar = this.f47447a;
        if (!oktVar.isEmpty()) {
            Iterator<E> it = oktVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((AbstractC0909pn) it.next()).f47439b) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f47451e;
        OnBackInvokedCallback onBackInvokedCallback = this.f47450d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z) {
            if (this.f47452f) {
                return;
            }
            C0911pp.f47444a.m19326b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f47452f = true;
            return;
        }
        if (this.f47452f) {
            C0911pp.f47444a.m19327c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f47452f = false;
        }
    }
}
