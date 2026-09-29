package androidx.navigation;

import android.support.v4.media.C0141b;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p040c4.C1690o;
import p040c4.C1694s;
import p385sf.C9000b;

/* JADX INFO: renamed from: androidx.navigation.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/navigation/a;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "navigation-common_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@Navigator.InterfaceC1082b("navigation")
public class C1083a extends Navigator<NavGraph> {

    /* JADX INFO: renamed from: c */
    public final C1694s f6859c;

    public C1083a(C1694s c1694s) {
        C5207g.m11111f(c1694s, "navigatorProvider");
        this.f6859c = c1694s;
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: a */
    public final NavDestination mo3971a() {
        return new NavGraph(this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: d */
    public final void mo4028d(List list, C1690o c1690o) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            NavGraph navGraph = (NavGraph) navBackStackEntry.f6731b;
            int i10 = navGraph.f6846l;
            String str = navGraph.f6844I;
            if (!((i10 == 0 && str == null) ? false : true)) {
                throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.mo4018m()).toString());
            }
            NavDestination navDestinationM4025u = str != null ? navGraph.m4025u(str, false) : navGraph.m4024t(i10, false);
            if (navDestinationM4025u == null) {
                if (navGraph.f6843H == null) {
                    String strValueOf = navGraph.f6844I;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(navGraph.f6846l);
                    }
                    navGraph.f6843H = strValueOf;
                }
                String str2 = navGraph.f6843H;
                C5207g.m11108c(str2);
                throw new IllegalArgumentException(C0141b.m611g("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            this.f6859c.mo5414b(navDestinationM4025u.f6827a).mo4028d(C9000b.m17251q(m4027b().mo4006a(navDestinationM4025u, navDestinationM4025u.m4014f(navBackStackEntry.f6732c))), c1690o);
        }
    }
}
