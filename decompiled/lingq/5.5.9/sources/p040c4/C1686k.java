package p040c4;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.C1083a;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraph.C1080a;
import androidx.navigation.Navigator;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.MainActivity;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import p232l2.C7245x;
import tl.C9320h;

/* JADX INFO: renamed from: c4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1686k {

    /* JADX INFO: renamed from: a */
    public final Context f9414a;

    /* JADX INFO: renamed from: b */
    public final Intent f9415b;

    /* JADX INFO: renamed from: c */
    public NavGraph f9416c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f9417d;

    /* JADX INFO: renamed from: e */
    public Bundle f9418e;

    /* JADX INFO: renamed from: c4.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f9419a;

        /* JADX INFO: renamed from: b */
        public final Bundle f9420b;

        public a(int i10, Bundle bundle) {
            this.f9419a = i10;
            this.f9420b = bundle;
        }
    }

    /* JADX INFO: renamed from: c4.k$b */
    public static final class b extends C1694s {

        /* JADX INFO: renamed from: c */
        public final a f9421c = new a();

        /* JADX INFO: renamed from: c4.k$b$a */
        @Metadata(m13364d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"c4/k$b$a", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigation-runtime_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        public static final class a extends Navigator<NavDestination> {
            @Override // androidx.navigation.Navigator
            /* JADX INFO: renamed from: a */
            public final NavDestination mo3971a() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            /* JADX INFO: renamed from: c */
            public final NavDestination mo3972c(NavDestination navDestination, Bundle bundle, C1690o c1690o, Navigator.InterfaceC1081a interfaceC1081a) {
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.Navigator
            /* JADX INFO: renamed from: j */
            public final boolean mo3973j() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        public b() {
            m5425a(new C1083a(this));
        }

        @Override // p040c4.C1694s
        /* JADX INFO: renamed from: b */
        public final <T extends Navigator<? extends NavDestination>> T mo5414b(String str) {
            C5207g.m11111f(str, "name");
            try {
                return (T) super.mo5414b(str);
            } catch (IllegalStateException unused) {
                return this.f9421c;
            }
        }
    }

    public C1686k(Context context) {
        Intent launchIntentForPackage;
        C5207g.m11111f(context, "context");
        this.f9414a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            launchIntentForPackage = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        launchIntentForPackage.addFlags(268468224);
        this.f9415b = launchIntentForPackage;
        this.f9417d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1686k(NavController navController) {
        this(navController.f6752a);
        C5207g.m11111f(navController, "navController");
        this.f9416c = navController.m3988i();
    }

    /* JADX INFO: renamed from: e */
    public static void m5407e(C1686k c1686k, int i10) {
        ArrayList arrayList = c1686k.f9417d;
        arrayList.clear();
        arrayList.add(new a(i10, null));
        if (c1686k.f9416c != null) {
            c1686k.m5413g();
        }
    }

    /* JADX INFO: renamed from: a */
    public final PendingIntent m5408a() {
        int iHashCode;
        Bundle bundle = this.f9418e;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            iHashCode = 0;
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        } else {
            iHashCode = 0;
        }
        for (a aVar : this.f9417d) {
            iHashCode = (iHashCode * 31) + aVar.f9419a;
            Bundle bundle2 = aVar.f9420b;
            if (bundle2 != null) {
                Iterator<String> it2 = bundle2.keySet().iterator();
                while (it2.hasNext()) {
                    Object obj2 = bundle2.get(it2.next());
                    iHashCode = (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
                }
            }
        }
        C7245x c7245xM5409b = m5409b();
        ArrayList<Intent> arrayList = c7245xM5409b.f40687a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        PendingIntent pendingIntentM14589a = C7245x.a.m14589a(c7245xM5409b.f40688b, iHashCode, intentArr, 201326592, null);
        C5207g.m11108c(pendingIntentM14589a);
        return pendingIntentM14589a;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: b */
    public final C7245x m5409b() {
        if (this.f9416c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
        ArrayList arrayList = this.f9417d;
        if (!(!arrayList.isEmpty())) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        NavDestination navDestination = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            int i10 = 0;
            Context context = this.f9414a;
            if (!zHasNext) {
                int[] iArrM13452t0 = C6752c.m13452t0(arrayList2);
                Intent intent = this.f9415b;
                intent.putExtra("android-support-nav:controller:deepLinkIds", iArrM13452t0);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                C7245x c7245x = new C7245x(context);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(c7245x.f40688b.getPackageManager());
                }
                if (component != null) {
                    c7245x.m14587a(component);
                }
                ArrayList<Intent> arrayList4 = c7245x.f40687a;
                arrayList4.add(intent2);
                int size = arrayList4.size();
                while (i10 < size) {
                    Intent intent3 = arrayList4.get(i10);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i10++;
                }
                return c7245x;
            }
            a aVar = (a) it.next();
            int i11 = aVar.f9419a;
            NavDestination navDestinationM5410c = m5410c(i11);
            if (navDestinationM5410c == null) {
                int i12 = NavDestination.f6826j;
                StringBuilder sbM854m = C0204c.m854m("Navigation destination ", NavDestination.Companion.m4020a(i11, context), " cannot be found in the navigation graph ");
                sbM854m.append(this.f9416c);
                throw new IllegalArgumentException(sbM854m.toString());
            }
            int[] iArrM4015g = navDestinationM5410c.m4015g(navDestination);
            int length = iArrM4015g.length;
            while (i10 < length) {
                arrayList2.add(Integer.valueOf(iArrM4015g[i10]));
                arrayList3.add(aVar.f9420b);
                i10++;
            }
            navDestination = navDestinationM5410c;
        }
    }

    /* JADX INFO: renamed from: c */
    public final NavDestination m5410c(int i10) {
        C9320h c9320h = new C9320h();
        NavGraph navGraph = this.f9416c;
        C5207g.m11108c(navGraph);
        c9320h.m17668t(navGraph);
        while (!c9320h.isEmpty()) {
            NavDestination navDestination = (NavDestination) c9320h.m17665U();
            if (navDestination.f6834h == i10) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                NavGraph.C1080a c1080a = ((NavGraph) navDestination).new C1080a();
                while (c1080a.hasNext()) {
                    c9320h.m17668t((NavDestination) c1080a.next());
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m5411d() {
        this.f9415b.setComponent(new ComponentName(this.f9414a, (Class<?>) MainActivity.class));
    }

    /* JADX INFO: renamed from: f */
    public final void m5412f() {
        this.f9416c = new C1689n(this.f9414a, new b()).m5417b(R.navigation.nav_graph_main);
        m5413g();
    }

    /* JADX INFO: renamed from: g */
    public final void m5413g() {
        Iterator it = this.f9417d.iterator();
        while (it.hasNext()) {
            int i10 = ((a) it.next()).f9419a;
            if (m5410c(i10) == null) {
                int i11 = NavDestination.f6826j;
                StringBuilder sbM854m = C0204c.m854m("Navigation destination ", NavDestination.Companion.m4020a(i10, this.f9414a), " cannot be found in the navigation graph ");
                sbM854m.append(this.f9416c);
                throw new IllegalArgumentException(sbM854m.toString());
            }
        }
    }
}
