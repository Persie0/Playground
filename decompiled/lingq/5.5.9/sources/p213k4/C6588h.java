package p213k4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.activity.RunnableC0191j;
import androidx.activity.RunnableC0193l;
import dm.C5207g;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p080e.RunnableC5286r;

/* JADX INFO: renamed from: k4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6588h {

    /* JADX INFO: renamed from: a */
    public final String f37451a;

    /* JADX INFO: renamed from: b */
    public final C6586f f37452b;

    /* JADX INFO: renamed from: c */
    public final Executor f37453c;

    /* JADX INFO: renamed from: d */
    public final Context f37454d;

    /* JADX INFO: renamed from: e */
    public int f37455e;

    /* JADX INFO: renamed from: f */
    public C6586f.c f37456f;

    /* JADX INFO: renamed from: g */
    public InterfaceC6585e f37457g;

    /* JADX INFO: renamed from: h */
    public final b f37458h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f37459i;

    /* JADX INFO: renamed from: j */
    public final c f37460j;

    /* JADX INFO: renamed from: k */
    public final RunnableC0191j f37461k;

    /* JADX INFO: renamed from: l */
    public final RunnableC0193l f37462l;

    /* JADX INFO: renamed from: k4.h$a */
    public static final class a extends C6586f.c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // p213k4.C6586f.c
        /* JADX INFO: renamed from: a */
        public final void mo4545a(Set<String> set) {
            C5207g.m11111f(set, "tables");
            C6588h c6588h = C6588h.this;
            if (c6588h.f37459i.get()) {
                return;
            }
            try {
                InterfaceC6585e interfaceC6585e = c6588h.f37457g;
                if (interfaceC6585e != null) {
                    int i10 = c6588h.f37455e;
                    Object[] array = set.toArray(new String[0]);
                    C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    interfaceC6585e.mo4546T0(i10, (String[]) array);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* JADX INFO: renamed from: k4.h$b */
    public static final class b extends InterfaceC6584d.a {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int f37464b = 0;

        public b() {
        }

        @Override // p213k4.InterfaceC6584d
        /* JADX INFO: renamed from: I */
        public final void mo13173I(String[] strArr) {
            C5207g.m11111f(strArr, "tables");
            C6588h c6588h = C6588h.this;
            c6588h.f37453c.execute(new RunnableC5286r(c6588h, 4, strArr));
        }
    }

    /* JADX INFO: renamed from: k4.h$c */
    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C5207g.m11111f(componentName, "name");
            C5207g.m11111f(iBinder, "service");
            int i10 = InterfaceC6585e.a.f37424a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            InterfaceC6585e c10646a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6585e)) ? new InterfaceC6585e.a.C10646a(iBinder) : (InterfaceC6585e) iInterfaceQueryLocalInterface;
            C6588h c6588h = C6588h.this;
            c6588h.f37457g = c10646a;
            c6588h.f37453c.execute(c6588h.f37461k);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C5207g.m11111f(componentName, "name");
            C6588h c6588h = C6588h.this;
            c6588h.f37453c.execute(c6588h.f37462l);
            c6588h.f37457g = null;
        }
    }

    public C6588h(Context context, String str, Intent intent, C6586f c6586f, Executor executor) {
        this.f37451a = str;
        this.f37452b = c6586f;
        this.f37453c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f37454d = applicationContext;
        this.f37458h = new b();
        this.f37459i = new AtomicBoolean(false);
        c cVar = new c();
        this.f37460j = cVar;
        this.f37461k = new RunnableC0191j(3, this);
        this.f37462l = new RunnableC0193l(5, this);
        Object[] array = c6586f.f37430d.keySet().toArray(new String[0]);
        C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f37456f = new a((String[]) array);
        applicationContext.bindService(intent, cVar, 1);
    }
}
