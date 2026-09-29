package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0221c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewOnKeyListenerC0220b.d f674a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItem f675b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0224f f676c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewOnKeyListenerC0220b.c f677d;

    public RunnableC0221c(ViewOnKeyListenerC0220b.c cVar, ViewOnKeyListenerC0220b.d dVar, C0226h c0226h, C0224f c0224f) {
        this.f677d = cVar;
        this.f674a = dVar;
        this.f675b = c0226h;
        this.f676c = c0224f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC0220b.d dVar = this.f674a;
        if (dVar != null) {
            ViewOnKeyListenerC0220b.c cVar = this.f677d;
            ViewOnKeyListenerC0220b.this.f656V = true;
            dVar.f672b.m919c(false);
            ViewOnKeyListenerC0220b.this.f656V = false;
        }
        MenuItem menuItem = this.f675b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f676c.m933q(menuItem, null, 4);
        }
    }
}
