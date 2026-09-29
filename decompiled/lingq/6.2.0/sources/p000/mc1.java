package p000;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.AbstractC0638f;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mc1 implements ul8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f51056b;

    public /* synthetic */ mc1(Object obj, int i) {
        this.f51055a = i;
        this.f51056b = obj;
    }

    @Override // p000.ul8
    /* JADX INFO: renamed from: a */
    public final Bundle mo4018a() {
        Bundle bundleM18160p;
        Pair[] pairArr;
        int i = this.f51055a;
        Object obj = this.f51056b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                sc1 sc1Var = ((uc1) obj).f63705i;
                sc1Var.getClass();
                LinkedHashMap linkedHashMap = sc1Var.f60658b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(sc1Var.f60660d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(sc1Var.f60663g));
                return bundle;
            case 1:
                Map mapMo10401d = ((jl8) obj).mo10401d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapMo10401d.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                id3 id3Var = (id3) obj;
                while (id3.m13791k(id3Var.m13792j(), Lifecycle$State.CREATED)) {
                }
                id3Var.f43960R.m23833G(Lifecycle$Event.ON_STOP);
                return new Bundle();
            case 3:
                return ((AbstractC0638f) obj).m2159c0();
            case 4:
                ud6 ud6Var = (ud6) obj;
                h86 h86Var = ud6Var.f63760b;
                LinkedHashMap linkedHashMap2 = h86Var.f41957l;
                C0825bv<y76> c0825bv = h86Var.f41951f;
                LinkedHashMap linkedHashMap3 = h86Var.f41956k;
                ArrayList arrayList = new ArrayList();
                Bundle bundleM18160p2 = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                for (Map.Entry entry2 : AbstractC3194a.m15371X(h86Var.f41963r.f49742a).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Bundle bundleMo15275h = ((kj6) entry2.getValue()).mo15275h();
                    if (bundleMo15275h != null) {
                        arrayList.add(str2);
                        str2.getClass();
                        bundleM18160p2.putBundle(str2, bundleMo15275h);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundleM18160p = null;
                } else {
                    bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    vz1.m23613T(bundleM18160p2, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundleM18160p.putBundle("android-support-nav:controller:navigatorState", bundleM18160p2);
                }
                if (!c0825bv.isEmpty()) {
                    if (bundleM18160p == null) {
                        bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (y76 y76Var : c0825bv) {
                        y76Var.getClass();
                        int i2 = y76Var.f69409b.f58881b.f57368b;
                        String str3 = y76Var.f69413f;
                        a86 a86Var = y76Var.f69415h;
                        Bundle bundleM170a = a86Var.m170a();
                        Bundle bundleM18160p3 = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        a86Var.f345h.m12092G(bundleM18160p3);
                        Bundle bundleM18160p4 = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        str3.getClass();
                        bundleM18160p4.putString("nav-entry-state:id", str3);
                        bundleM18160p4.putInt("nav-entry-state:destination-id", i2);
                        if (bundleM170a == null) {
                            bundleM170a = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        }
                        bundleM18160p4.putBundle("nav-entry-state:args", bundleM170a);
                        bundleM18160p4.putBundle("nav-entry-state:saved-state", bundleM18160p3);
                        arrayList2.add(bundleM18160p4);
                    }
                    bundleM18160p.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap3.isEmpty()) {
                    if (bundleM18160p == null) {
                        bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap3.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                        int iIntValue = ((Number) entry3.getKey()).intValue();
                        String str4 = (String) entry3.getValue();
                        int i4 = i3 + 1;
                        iArr[i3] = iIntValue;
                        if (str4 == null) {
                            str4 = "";
                        }
                        arrayList3.add(str4);
                        i3 = i4;
                    }
                    bundleM18160p.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    vz1.m23613T(bundleM18160p, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundleM18160p == null) {
                        bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        String str5 = (String) entry4.getKey();
                        C0825bv c0825bv2 = (C0825bv) entry4.getValue();
                        arrayList4.add(str5);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it = c0825bv2.iterator();
                        while (it.hasNext()) {
                            sg3 sg3Var = ((b86) it.next()).f8109a;
                            sg3Var.getClass();
                            Bundle bundleM18160p5 = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            String str6 = (String) sg3Var.f60817c;
                            str6.getClass();
                            bundleM18160p5.putString("nav-entry-state:id", str6);
                            bundleM18160p5.putInt("nav-entry-state:destination-id", sg3Var.f60816b);
                            Bundle bundleM18160p6 = (Bundle) sg3Var.f60818d;
                            if (bundleM18160p6 == null) {
                                bundleM18160p6 = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            }
                            bundleM18160p5.putBundle("nav-entry-state:args", bundleM18160p6);
                            Bundle bundle3 = (Bundle) sg3Var.f60819e;
                            bundle3.getClass();
                            bundleM18160p5.putBundle("nav-entry-state:saved-state", bundle3);
                            arrayList5.add(bundleM18160p5);
                        }
                        bundleM18160p.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str5, arrayList5);
                    }
                    vz1.m23613T(bundleM18160p, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (ud6Var.f63763e) {
                    if (bundleM18160p == null) {
                        bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    bundleM18160p.putBoolean("android-support-nav:controller:deepLinkHandled", ud6Var.f63763e);
                }
                if (bundleM18160p != null) {
                    return bundleM18160p;
                }
                Bundle bundle4 = Bundle.EMPTY;
                bundle4.getClass();
                return bundle4;
            case 5:
                int i5 = ((NavHostFragment) obj).f6542y0;
                if (i5 != 0) {
                    return omd.m18160p(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i5)));
                }
                Bundle bundle5 = Bundle.EMPTY;
                bundle5.getClass();
                return bundle5;
            default:
                w41 w41Var = (w41) obj;
                for (Map.Entry entry5 : AbstractC3194a.m15371X((LinkedHashMap) w41Var.f66368d).entrySet()) {
                    w41Var.m23713G(((C3244l) ((u66) entry5.getValue())).getValue(), (String) entry5.getKey());
                }
                for (Map.Entry entry6 : AbstractC3194a.m15371X((LinkedHashMap) w41Var.f66366b).entrySet()) {
                    w41Var.m23713G(((ul8) entry6.getValue()).mo4018a(), (String) entry6.getKey());
                }
                LinkedHashMap linkedHashMap4 = (LinkedHashMap) w41Var.f66365a;
                if (linkedHashMap4.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList6 = new ArrayList(linkedHashMap4.size());
                    for (Map.Entry entry7 : linkedHashMap4.entrySet()) {
                        arrayList6.add(new Pair((String) entry7.getKey(), entry7.getValue()));
                    }
                    pairArr = (Pair[]) arrayList6.toArray(new Pair[0]);
                }
                return omd.m18160p((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
