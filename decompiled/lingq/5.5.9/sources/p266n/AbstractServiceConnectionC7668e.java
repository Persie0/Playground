package p266n;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p000a.InterfaceC0001b;

/* JADX INFO: renamed from: n.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceConnectionC7668e implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public Context f42145a;

    /* JADX INFO: renamed from: n.e$a */
    public class a extends C7666c {
        public a(InterfaceC0001b interfaceC0001b, ComponentName componentName) {
            super(interfaceC0001b, componentName);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo15262a(ComponentName componentName, a aVar);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0001b c10579a;
        if (this.f42145a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i10 = InterfaceC0001b.a.f0a;
        if (iBinder == null) {
            c10579a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            c10579a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0001b)) ? new InterfaceC0001b.a.C10579a(iBinder) : (InterfaceC0001b) iInterfaceQueryLocalInterface;
        }
        mo15262a(componentName, new a(c10579a, componentName));
    }
}
