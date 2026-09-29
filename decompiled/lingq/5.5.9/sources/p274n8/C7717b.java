package p274n8;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import dm.C5207g;
import java.util.concurrent.locks.ReentrantLock;
import p000a.InterfaceC0000a;
import p000a.InterfaceC0001b;
import p266n.AbstractServiceConnectionC7668e;
import p266n.BinderC7665b;
import p266n.C7666c;
import p266n.C7669f;

/* JADX INFO: renamed from: n8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7717b extends AbstractServiceConnectionC7668e {

    /* JADX INFO: renamed from: b */
    public static C7666c f42248b;

    /* JADX INFO: renamed from: c */
    public static C7669f f42249c;

    /* JADX INFO: renamed from: d */
    public static final ReentrantLock f42250d = new ReentrantLock();

    /* JADX INFO: renamed from: n8.b$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m15308a(Uri uri) {
            m15309b();
            C7717b.f42250d.lock();
            C7669f c7669f = C7717b.f42249c;
            if (c7669f != null) {
                Bundle bundle = new Bundle();
                PendingIntent pendingIntent = (PendingIntent) c7669f.f42150e;
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                try {
                    ((InterfaceC0001b) c7669f.f42147b).mo3d0((InterfaceC0000a) c7669f.f42148c, uri, bundle);
                } catch (RemoteException unused) {
                }
            }
            C7717b.f42250d.unlock();
        }

        /* JADX INFO: renamed from: b */
        public static void m15309b() {
            C7666c c7666c;
            C7669f c7669f;
            C7717b.f42250d.lock();
            if (C7717b.f42249c == null && (c7666c = C7717b.f42248b) != null) {
                BinderC7665b binderC7665b = new BinderC7665b();
                InterfaceC0001b interfaceC0001b = c7666c.f42137a;
                try {
                    c7669f = !interfaceC0001b.mo1X(binderC7665b) ? null : new C7669f(interfaceC0001b, binderC7665b, c7666c.f42138b);
                } catch (RemoteException unused) {
                }
                C7717b.f42249c = c7669f;
            }
            C7717b.f42250d.unlock();
        }
    }

    @Override // p266n.AbstractServiceConnectionC7668e
    /* JADX INFO: renamed from: a */
    public final void mo15262a(ComponentName componentName, AbstractServiceConnectionC7668e.a aVar) {
        C5207g.m11111f(componentName, "name");
        try {
            aVar.f42137a.mo2Y0();
        } catch (RemoteException unused) {
        }
        f42248b = aVar;
        a.m15309b();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C5207g.m11111f(componentName, "componentName");
    }
}
