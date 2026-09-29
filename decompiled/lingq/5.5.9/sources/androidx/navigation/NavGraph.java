package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import mo.C7661i;
import p063d4.C5043a;
import p100em.InterfaceC5429a;
import p326q.C8453i;
import p326q.C8454j;
import p388t1.C9181g;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class NavGraph extends NavDestination implements Iterable<NavDestination>, InterfaceC5429a {

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ int f6842J = 0;

    /* JADX INFO: renamed from: H */
    public String f6843H;

    /* JADX INFO: renamed from: I */
    public String f6844I;

    /* JADX INFO: renamed from: k */
    public final C8453i<NavDestination> f6845k;

    /* JADX INFO: renamed from: l */
    public int f6846l;

    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static NavDestination m4026a(NavGraph navGraph) {
            C5207g.m11111f(navGraph, "<this>");
            Iterator it = SequencesKt__SequencesKt.m14252M2(navGraph.m4024t(navGraph.f6846l, true), new InterfaceC2052l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavGraph$Companion$findStartDestination$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final NavDestination mo528n(NavDestination navDestination) {
                    NavDestination navDestination2 = navDestination;
                    C5207g.m11111f(navDestination2, "it");
                    if (!(navDestination2 instanceof NavGraph)) {
                        return null;
                    }
                    NavGraph navGraph2 = (NavGraph) navDestination2;
                    return navGraph2.m4024t(navGraph2.f6846l, true);
                }
            }).iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return (NavDestination) next;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraph$a */
    public static final class C1080a implements Iterator<NavDestination>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public int f6848a = -1;

        /* JADX INFO: renamed from: b */
        public boolean f6849b;

        public C1080a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6848a + 1 < NavGraph.this.f6845k.m16537h();
        }

        @Override // java.util.Iterator
        public final NavDestination next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f6849b = true;
            C8453i<NavDestination> c8453i = NavGraph.this.f6845k;
            int i10 = this.f6848a + 1;
            this.f6848a = i10;
            NavDestination navDestinationM16538i = c8453i.m16538i(i10);
            C5207g.m11110e(navDestinationM16538i, "nodes.valueAt(++index)");
            return navDestinationM16538i;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f6849b) {
                throw new IllegalStateException("You must call next() before you can remove an element".toString());
            }
            C8453i<NavDestination> c8453i = NavGraph.this.f6845k;
            c8453i.m16538i(this.f6848a).f6828b = null;
            int i10 = this.f6848a;
            Object[] objArr = c8453i.f45623c;
            Object obj = objArr[i10];
            Object obj2 = C8453i.f45620e;
            if (obj != obj2) {
                objArr[i10] = obj2;
                c8453i.f45621a = true;
            }
            this.f6848a = i10 - 1;
            this.f6849b = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator<? extends NavGraph> navigator) {
        super(navigator);
        C5207g.m11111f(navigator, "navGraphNavigator");
        this.f6845k = new C8453i<>();
    }

    @Override // androidx.navigation.NavDestination
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof NavGraph)) {
            C8453i<NavDestination> c8453i = this.f6845k;
            List listM14267b3 = C7073a.m14267b3(SequencesKt__SequencesKt.m14248I2(C5206f.m11031y1(c8453i)));
            NavGraph navGraph = (NavGraph) obj;
            C8453i<NavDestination> c8453i2 = navGraph.f6845k;
            C8454j c8454jM11031y1 = C5206f.m11031y1(c8453i2);
            while (c8454jM11031y1.hasNext()) {
                ((ArrayList) listM14267b3).remove((NavDestination) c8454jM11031y1.next());
            }
            if (super.equals(obj) && c8453i.m16537h() == c8453i2.m16537h() && this.f6846l == navGraph.f6846l && ((ArrayList) listM14267b3).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.navigation.NavDestination
    public final int hashCode() {
        int iHashCode = this.f6846l;
        C8453i<NavDestination> c8453i = this.f6845k;
        int iM16537h = c8453i.m16537h();
        for (int i10 = 0; i10 < iM16537h; i10++) {
            if (c8453i.f45621a) {
                c8453i.m16534e();
            }
            iHashCode = (((iHashCode * 31) + c8453i.f45622b[i10]) * 31) + c8453i.m16538i(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return new C1080a();
    }

    @Override // androidx.navigation.NavDestination
    /* JADX INFO: renamed from: m */
    public final String mo4018m() {
        return this.f6834h != 0 ? super.mo4018m() : "the root navigation";
    }

    @Override // androidx.navigation.NavDestination
    /* JADX INFO: renamed from: o */
    public final NavDestination.C1079a mo4019o(C9181g c9181g) {
        NavDestination.C1079a c1079aMo4019o = super.mo4019o(c9181g);
        ArrayList arrayList = new ArrayList();
        C1080a c1080a = new C1080a();
        while (true) {
            while (c1080a.hasNext()) {
                NavDestination.C1079a c1079aMo4019o2 = ((NavDestination) c1080a.next()).mo4019o(c9181g);
                if (c1079aMo4019o2 != null) {
                    arrayList.add(c1079aMo4019o2);
                }
            }
            return (NavDestination.C1079a) C6752c.m13434b0(C6744b.m13378j0(new NavDestination.C1079a[]{c1079aMo4019o, (NavDestination.C1079a) C6752c.m13434b0(arrayList)}));
        }
    }

    @Override // androidx.navigation.NavDestination
    /* JADX INFO: renamed from: p */
    public final void mo3974p(Context context, AttributeSet attributeSet) {
        String strValueOf;
        C5207g.m11111f(context, "context");
        super.mo3974p(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C5043a.f32877d);
        C5207g.m11110e(typedArrayObtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        if (!(resourceId != this.f6834h)) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        if (this.f6844I != null) {
            this.f6846l = 0;
            this.f6844I = null;
        }
        this.f6846l = resourceId;
        this.f6843H = null;
        if (resourceId <= 16777215) {
            strValueOf = String.valueOf(resourceId);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(resourceId);
            }
            C5207g.m11110e(strValueOf, "try {\n                co….toString()\n            }");
        }
        this.f6843H = strValueOf;
        C9072e c9072e = C9072e.f47360a;
        typedArrayObtainAttributes.recycle();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final void m4023q(NavDestination navDestination) {
        C5207g.m11111f(navDestination, "node");
        int i10 = navDestination.f6834h;
        String str = navDestination.f6835i;
        boolean z10 = false;
        if (!((i10 == 0 && str == null) ? false : true)) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        String str2 = this.f6835i;
        if (str2 != null && !(!C5207g.m11106a(str, str2))) {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same route as graph " + this).toString());
        }
        if (!(i10 != this.f6834h)) {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same id as graph " + this).toString());
        }
        C8453i<NavDestination> c8453i = this.f6845k;
        NavDestination navDestination2 = (NavDestination) c8453i.m16535f(i10, null);
        if (navDestination2 == navDestination) {
            return;
        }
        if (navDestination.f6828b == null) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (navDestination2 != null) {
            navDestination2.f6828b = null;
        }
        navDestination.f6828b = this;
        c8453i.m16536g(navDestination.f6834h, navDestination);
    }

    /* JADX INFO: renamed from: t */
    public final NavDestination m4024t(int i10, boolean z10) {
        NavGraph navGraph;
        NavDestination navDestination = (NavDestination) this.f6845k.m16535f(i10, null);
        if (navDestination != null) {
            return navDestination;
        }
        if (!z10 || (navGraph = this.f6828b) == null) {
            return null;
        }
        return navGraph.m4024t(i10, true);
    }

    @Override // androidx.navigation.NavDestination
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        String str = this.f6844I;
        NavDestination navDestinationM4025u = !(str == null || C7661i.m15250P2(str)) ? m4025u(str, true) : null;
        if (navDestinationM4025u == null) {
            navDestinationM4025u = m4024t(this.f6846l, true);
        }
        sb2.append(" startDestination=");
        if (navDestinationM4025u == null) {
            String str2 = this.f6844I;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = this.f6843H;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f6846l));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(navDestinationM4025u.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "sb.toString()");
        return string;
    }

    /* JADX INFO: renamed from: u */
    public final NavDestination m4025u(String str, boolean z10) {
        NavGraph navGraph;
        C5207g.m11111f(str, "route");
        NavDestination navDestination = (NavDestination) this.f6845k.m16535f("android-app://androidx.navigation/".concat(str).hashCode(), null);
        if (navDestination != null) {
            return navDestination;
        }
        if (!z10 || (navGraph = this.f6828b) == null) {
            return null;
        }
        if (C7661i.m15250P2(str)) {
            return null;
        }
        return navGraph.m4025u(str, true);
    }
}
