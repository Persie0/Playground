package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import androidx.activity.result.C0204c;
import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import dm.C5213m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mo.C7661i;
import p040c4.AbstractC1692q;
import p040c4.C1679d;
import p040c4.C1683h;
import p040c4.C1690o;
import p040c4.C1694s;
import p063d4.C5043a;
import p249lo.InterfaceC7415h;
import p326q.C8453i;
import p326q.C8454j;
import p388t1.C9181g;
import sl.C9072e;
import tl.C9320h;
import tl.C9325m;
import tl.C9327o;

/* JADX INFO: loaded from: classes.dex */
public class NavDestination {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f6826j = 0;

    /* JADX INFO: renamed from: a */
    public final String f6827a;

    /* JADX INFO: renamed from: b */
    public NavGraph f6828b;

    /* JADX INFO: renamed from: c */
    public String f6829c;

    /* JADX INFO: renamed from: d */
    public CharSequence f6830d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f6831e;

    /* JADX INFO: renamed from: f */
    public final C8453i<C1679d> f6832f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f6833g;

    /* JADX INFO: renamed from: h */
    public int f6834h;

    /* JADX INFO: renamed from: i */
    public String f6835i;

    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static String m4020a(int i10, Context context) {
            String strValueOf;
            C5207g.m11111f(context, "context");
            if (i10 <= 16777215) {
                return String.valueOf(i10);
            }
            try {
                strValueOf = context.getResources().getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i10);
            }
            C5207g.m11110e(strValueOf, "try {\n                co….toString()\n            }");
            return strValueOf;
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC7415h m4021b(NavDestination navDestination) {
            C5207g.m11111f(navDestination, "<this>");
            return SequencesKt__SequencesKt.m14252M2(navDestination, new InterfaceC2052l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavDestination$Companion$hierarchy$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final NavDestination mo528n(NavDestination navDestination2) {
                    NavDestination navDestination3 = navDestination2;
                    C5207g.m11111f(navDestination3, "it");
                    return navDestination3.f6828b;
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavDestination$a */
    public static final class C1079a implements Comparable<C1079a> {

        /* JADX INFO: renamed from: a */
        public final NavDestination f6837a;

        /* JADX INFO: renamed from: b */
        public final Bundle f6838b;

        /* JADX INFO: renamed from: c */
        public final boolean f6839c;

        /* JADX INFO: renamed from: d */
        public final boolean f6840d;

        /* JADX INFO: renamed from: e */
        public final int f6841e;

        public C1079a(NavDestination navDestination, Bundle bundle, boolean z10, boolean z11, int i10) {
            C5207g.m11111f(navDestination, "destination");
            this.f6837a = navDestination;
            this.f6838b = bundle;
            this.f6839c = z10;
            this.f6840d = z11;
            this.f6841e = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(C1079a c1079a) {
            C5207g.m11111f(c1079a, "other");
            boolean z10 = c1079a.f6839c;
            boolean z11 = this.f6839c;
            if (z11 && !z10) {
                return 1;
            }
            if (!z11 && z10) {
                return -1;
            }
            Bundle bundle = c1079a.f6838b;
            Bundle bundle2 = this.f6838b;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size();
                C5207g.m11108c(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z12 = c1079a.f6840d;
            boolean z13 = this.f6840d;
            if (z13 && !z12) {
                return 1;
            }
            if (z13 || !z12) {
                return this.f6841e - c1079a.f6841e;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(C1694s.a.m5426a(navigator.getClass()));
        C5207g.m11111f(navigator, "navigator");
        LinkedHashMap linkedHashMap = C1694s.f9459b;
    }

    public NavDestination(String str) {
        this.f6827a = str;
        this.f6831e = new ArrayList();
        this.f6832f = new C8453i<>();
        this.f6833g = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m4013a(NavDeepLink navDeepLink) {
        Map<String, C1683h> mapM4017l = m4017l();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, C1683h>> it = mapM4017l.entrySet().iterator();
        loop0: while (true) {
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    break loop0;
                }
                Map.Entry<String, C1683h> next = it.next();
                C1683h value = next.getValue();
                if (value.f9408b || value.f9409c) {
                    z10 = false;
                }
                if (z10) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setKeySet.iterator();
        loop2: while (true) {
            while (true) {
                if (!it2.hasNext()) {
                    break loop2;
                }
                Object next2 = it2.next();
                String str = (String) next2;
                ArrayList arrayList2 = navDeepLink.f6813d;
                Collection collectionValues = navDeepLink.f6814e.values();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = collectionValues.iterator();
                while (it3.hasNext()) {
                    C9327o.m17684D(((NavDeepLink.C1078a) it3.next()).f6823b, arrayList3);
                }
                if (!C6752c.m13438f0(arrayList3, arrayList2).contains(str)) {
                    arrayList.add(next2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.f6831e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f6810a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (obj == null || !(obj instanceof NavDestination)) {
            return false;
        }
        ArrayList arrayList = this.f6831e;
        NavDestination navDestination = (NavDestination) obj;
        ArrayList arrayList2 = navDestination.f6831e;
        C5207g.m11111f(arrayList, "<this>");
        C5207g.m11111f(arrayList2, "other");
        Set setM13456x0 = C6752c.m13456x0(arrayList);
        setM13456x0.retainAll(arrayList2);
        boolean z16 = setM13456x0.size() == arrayList.size();
        C8453i<C1679d> c8453i = this.f6832f;
        int iM16537h = c8453i.m16537h();
        C8453i<C1679d> c8453i2 = navDestination.f6832f;
        if (iM16537h == c8453i2.m16537h()) {
            Iterator it = SequencesKt__SequencesKt.m14248I2(C5206f.m11031y1(c8453i)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = true;
                    break;
                }
                C1679d c1679d = (C1679d) it.next();
                if (c8453i2.f45621a) {
                    c8453i2.m16534e();
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= c8453i2.f45624d) {
                        i10 = -1;
                        break;
                    }
                    if (c8453i2.f45623c[i10] == c1679d) {
                        break;
                    }
                    i10++;
                }
                if (!(i10 >= 0)) {
                    z14 = false;
                    break;
                }
            }
            if (z14) {
                Iterator it2 = SequencesKt__SequencesKt.m14248I2(C5206f.m11031y1(c8453i2)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z15 = true;
                        break;
                    }
                    C1679d c1679d2 = (C1679d) it2.next();
                    if (c8453i.f45621a) {
                        c8453i.m16534e();
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 >= c8453i.f45624d) {
                            i11 = -1;
                            break;
                        }
                        if (c8453i.f45623c[i11] == c1679d2) {
                            break;
                        }
                        i11++;
                    }
                    if (!(i11 >= 0)) {
                        z15 = false;
                        break;
                    }
                }
                if (z15) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (m4017l().size() == navDestination.m4017l().size()) {
            Iterator<Object> it3 = C6752c.m13413G(m4017l().entrySet()).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z12 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it3.next();
                if (!(navDestination.m4017l().containsKey(entry.getKey()) && C5207g.m11106a(navDestination.m4017l().get(entry.getKey()), entry.getValue()))) {
                    z12 = false;
                    break;
                }
            }
            if (z12) {
                Iterator<Object> it4 = C6752c.m13413G(navDestination.m4017l().entrySet()).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z13 = true;
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    if (!(m4017l().containsKey(entry2.getKey()) && C5207g.m11106a(m4017l().get(entry2.getKey()), entry2.getValue()))) {
                        z13 = false;
                        break;
                    }
                }
                if (z13) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return this.f6834h == navDestination.f6834h && C5207g.m11106a(this.f6835i, navDestination.f6835i) && z16 && z10 && z11;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b8 A[LOOP:1: B:23:0x0070->B:36:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final Bundle m4014f(Bundle bundle) {
        boolean z10;
        LinkedHashMap linkedHashMap = this.f6833g;
        if (bundle == null) {
            if (linkedHashMap == null || linkedHashMap.isEmpty()) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C1683h c1683h = (C1683h) entry.getValue();
            c1683h.getClass();
            C5207g.m11111f(str, "name");
            if (c1683h.f9409c) {
                c1683h.f9407a.mo5422d(bundle2, str, c1683h.f9410d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C1683h c1683h2 = (C1683h) entry2.getValue();
                c1683h2.getClass();
                C5207g.m11111f(str2, "name");
                boolean z11 = c1683h2.f9408b;
                AbstractC1692q<Object> abstractC1692q = c1683h2.f9407a;
                if (z11 || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        abstractC1692q.mo5419a(bundle2, str2);
                        z10 = true;
                    } catch (ClassCastException unused) {
                        z10 = false;
                    }
                    if (z10) {
                        StringBuilder sbM854m = C0204c.m854m("Wrong argument type for '", str2, "' in argument bundle. ");
                        sbM854m.append(abstractC1692q.mo5420b());
                        sbM854m.append(" expected.");
                        throw new IllegalArgumentException(sbM854m.toString().toString());
                    }
                }
                z10 = false;
                if (z10) {
                    StringBuilder sbM854m2 = C0204c.m854m("Wrong argument type for '", str2, "' in argument bundle. ");
                    sbM854m2.append(abstractC1692q.mo5420b());
                    sbM854m2.append(" expected.");
                    throw new IllegalArgumentException(sbM854m2.toString().toString());
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX INFO: renamed from: g */
    public final int[] m4015g(NavDestination navDestination) {
        C9320h c9320h = new C9320h();
        NavDestination navDestination2 = this;
        while (true) {
            NavGraph navGraph = navDestination2.f6828b;
            if ((navDestination != null ? navDestination.f6828b : null) != null) {
                NavGraph navGraph2 = navDestination.f6828b;
                C5207g.m11108c(navGraph2);
                if (navGraph2.m4024t(navDestination2.f6834h, true) != navDestination2) {
                    if (navGraph != null || navGraph.f6846l != navDestination2.f6834h) {
                        c9320h.m17667q(navDestination2);
                    }
                    if (!C5207g.m11106a(navGraph, navDestination) || navGraph == null) {
                        break;
                    }
                    navDestination2 = navGraph;
                } else {
                    c9320h.m17667q(navDestination2);
                    break;
                }
            } else {
                if (navGraph != null) {
                    c9320h.m17667q(navDestination2);
                } else {
                    c9320h.m17667q(navDestination2);
                }
                if (!C5207g.m11106a(navGraph, navDestination)) {
                    break;
                }
                navDestination2 = navGraph;
            }
        }
        List listM13453u0 = C6752c.m13453u0(c9320h);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listM13453u0, 10));
        Iterator it = listM13453u0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it.next()).f6834h));
        }
        return C6752c.m13452t0(arrayList);
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i10 = this.f6834h * 31;
        String str = this.f6835i;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        for (NavDeepLink navDeepLink : this.f6831e) {
            int i11 = iHashCode * 31;
            String str2 = navDeepLink.f6810a;
            int iHashCode2 = (i11 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = navDeepLink.f6811b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = navDeepLink.f6812c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        C8454j c8454jM11031y1 = C5206f.m11031y1(this.f6832f);
        while (c8454jM11031y1.hasNext()) {
            C1679d c1679d = (C1679d) c8454jM11031y1.next();
            int i12 = ((iHashCode * 31) + c1679d.f9399a) * 31;
            C1690o c1690o = c1679d.f9400b;
            iHashCode = i12 + (c1690o != null ? c1690o.hashCode() : 0);
            Bundle bundle = c1679d.f9401c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i13 = iHashCode * 31;
                    Bundle bundle2 = c1679d.f9401c;
                    C5207g.m11108c(bundle2);
                    Object obj = bundle2.get(str5);
                    iHashCode = i13 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str6 : m4017l().keySet()) {
            int iM758d = C0166e.m758d(str6, iHashCode * 31, 31);
            C1683h c1683h = m4017l().get(str6);
            iHashCode = iM758d + (c1683h != null ? c1683h.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final C1679d m4016i(int i10) {
        C8453i<C1679d> c8453i = this.f6832f;
        C1679d c1679d = null;
        C1679d c1679d2 = c8453i.m16537h() == 0 ? null : (C1679d) c8453i.m16535f(i10, null);
        if (c1679d2 == null) {
            NavGraph navGraph = this.f6828b;
            if (navGraph != null) {
                return navGraph.m4016i(i10);
            }
        } else {
            c1679d = c1679d2;
        }
        return c1679d;
    }

    /* JADX INFO: renamed from: l */
    public final Map<String, C1683h> m4017l() {
        return C6753d.m13465R0(this.f6833g);
    }

    /* JADX INFO: renamed from: m */
    public String mo4018m() {
        String strValueOf = this.f6829c;
        if (strValueOf == null) {
            strValueOf = String.valueOf(this.f6834h);
        }
        return strValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0280  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:77:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public C1079a mo4019o(C9181g c9181g) {
        Bundle bundle;
        int i10;
        int i11;
        int i12;
        List listM13448p0;
        int i13;
        List listM13448p1;
        Matcher matcher;
        Bundle bundle2;
        C1683h value;
        boolean z10;
        Matcher matcher2;
        Uri uri;
        LinkedHashMap linkedHashMap;
        Iterator it;
        String strGroup;
        Matcher matcher3;
        Matcher matcher4;
        ArrayList<NavDeepLink> arrayList = this.f6831e;
        Bundle bundle3 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        C1079a c1079a = null;
        for (NavDeepLink navDeepLink : arrayList) {
            Uri uri2 = (Uri) c9181g.f47721b;
            if (uri2 != null) {
                Map<String, C1683h> mapM4017l = m4017l();
                navDeepLink.getClass();
                Pattern pattern = (Pattern) navDeepLink.f6816g.getValue();
                if (pattern != null) {
                    matcher4 = pattern.matcher(uri2.toString());
                } else {
                    matcher = bundle3;
                }
                if (matcher != 0 && matcher.matches()) {
                    bundle2 = new Bundle();
                    ArrayList arrayList2 = navDeepLink.f6813d;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        matcher = matcher4;
                        String str = (String) arrayList2.get(i14);
                        i14++;
                        String strDecode = Uri.decode(matcher.group(i14));
                        C1683h c1683h = mapM4017l.get(str);
                        try {
                            C5207g.m11110e(strDecode, "value");
                            NavDeepLink.m4011b(bundle2, str, strDecode, c1683h);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    matcher = matcher4;
                    if (navDeepLink.f6817h) {
                        LinkedHashMap linkedHashMap2 = navDeepLink.f6814e;
                        Iterator it2 = linkedHashMap2.keySet().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                String str2 = (String) it2.next();
                                NavDeepLink.C1078a c1078a = (NavDeepLink.C1078a) linkedHashMap2.get(str2);
                                String queryParameter = uri2.getQueryParameter(str2);
                                if (navDeepLink.f6818i) {
                                    String string = uri2.toString();
                                    C5207g.m11110e(string, "deepLink.toString()");
                                    String strM14303w3 = C7076b.m14303w3(string, '?');
                                    if (!C5207g.m11106a(strM14303w3, string)) {
                                        queryParameter = strM14303w3;
                                    }
                                }
                                if (queryParameter != null) {
                                    C5207g.m11108c(c1078a);
                                    matcher2 = Pattern.compile(c1078a.f6822a, 32).matcher(queryParameter);
                                    if (!matcher2.matches()) {
                                    }
                                } else {
                                    matcher2 = null;
                                }
                                Bundle bundle4 = new Bundle();
                                try {
                                    C5207g.m11108c(c1078a);
                                    ArrayList arrayList3 = c1078a.f6823b;
                                    int size2 = arrayList3.size();
                                    int i15 = 0;
                                    while (i15 < size2) {
                                        if (matcher2 != null) {
                                            strGroup = matcher2.group(i15 + 1);
                                            if (strGroup == null) {
                                                strGroup = "";
                                            }
                                        } else {
                                            strGroup = null;
                                        }
                                        uri = uri2;
                                        try {
                                            String str3 = (String) arrayList3.get(i15);
                                            linkedHashMap = linkedHashMap2;
                                            try {
                                                C1683h c1683h2 = mapM4017l.get(str3);
                                                if (strGroup != null) {
                                                    it = it2;
                                                    try {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        matcher3 = matcher2;
                                                        sb2.append('{');
                                                        sb2.append(str3);
                                                        sb2.append('}');
                                                        if (!C5207g.m11106a(strGroup, sb2.toString())) {
                                                            NavDeepLink.m4011b(bundle4, str3, strGroup, c1683h2);
                                                        }
                                                    } catch (IllegalArgumentException unused2) {
                                                    }
                                                } else {
                                                    it = it2;
                                                    matcher3 = matcher2;
                                                }
                                                i15++;
                                                it2 = it;
                                                uri2 = uri;
                                                linkedHashMap2 = linkedHashMap;
                                                matcher2 = matcher3;
                                            } catch (IllegalArgumentException unused3) {
                                                it = it2;
                                            }
                                        } catch (IllegalArgumentException unused4) {
                                            linkedHashMap = linkedHashMap2;
                                            it = it2;
                                            it2 = it;
                                            uri2 = uri;
                                            linkedHashMap2 = linkedHashMap;
                                        }
                                    }
                                    uri = uri2;
                                    linkedHashMap = linkedHashMap2;
                                    it = it2;
                                    bundle2.putAll(bundle4);
                                } catch (IllegalArgumentException unused5) {
                                    uri = uri2;
                                }
                                it2 = it;
                                uri2 = uri;
                                linkedHashMap2 = linkedHashMap;
                            } else {
                                for (Map.Entry<String, C1683h> entry : mapM4017l.entrySet()) {
                                    String key = entry.getKey();
                                    value = entry.getValue();
                                    if (value != null || value.f9408b || value.f9409c) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10 || bundle2.containsKey(key)) {
                                    }
                                }
                            }
                            bundle2 = null;
                            break;
                        }
                    }
                    while (r1.hasNext()) {
                        String key2 = entry.getKey();
                        value = entry.getValue();
                        if (value != null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                        }
                    }
                } else {
                    matcher = matcher4;
                    matcher = matcher4;
                    bundle2 = bundle3;
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str4 = (String) c9181g.f47722c;
            boolean z11 = str4 != null && C5207g.m11106a(str4, navDeepLink.f6811b);
            String str5 = (String) c9181g.f47723d;
            if (str5 != null) {
                navDeepLink.getClass();
                String str6 = navDeepLink.f6812c;
                if (str6 != null) {
                    Pattern pattern2 = (Pattern) navDeepLink.f6820k.getValue();
                    C5207g.m11108c(pattern2);
                    if (pattern2.matcher(str5).matches()) {
                        List listM14273d = new Regex("/").m14273d(str6);
                        if (listM14273d.isEmpty()) {
                            i12 = 1;
                            listM13448p0 = EmptyList.f38032a;
                            break;
                        }
                        ListIterator listIterator = listM14273d.listIterator(listM14273d.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i12 = 1;
                                listM13448p0 = EmptyList.f38032a;
                                break;
                            }
                            if (!(((String) listIterator.previous()).length() == 0)) {
                                i12 = 1;
                                listM13448p0 = C6752c.m13448p0(listM14273d, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        String str7 = (String) listM13448p0.get(0);
                        String str8 = (String) listM13448p0.get(i12);
                        List listM14273d2 = new Regex("/").m14273d(str5);
                        if (listM14273d2.isEmpty()) {
                            i13 = 1;
                            listM13448p1 = EmptyList.f38032a;
                            break;
                        }
                        ListIterator listIterator2 = listM14273d2.listIterator(listM14273d2.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                i13 = 1;
                                listM13448p1 = EmptyList.f38032a;
                                break;
                            }
                            if (!(((String) listIterator2.previous()).length() == 0)) {
                                i13 = 1;
                                listM13448p1 = C6752c.m13448p0(listM14273d2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                        String str9 = (String) listM13448p1.get(0);
                        String str10 = (String) listM13448p1.get(i13);
                        i11 = C5207g.m11106a(str7, str9) ? 2 : 0;
                        if (C5207g.m11106a(str8, str10)) {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                    }
                } else {
                    i11 = -1;
                }
                i10 = i11;
            } else {
                i10 = -1;
            }
            if (bundle != null || z11 || i10 > -1) {
                C1079a c1079a2 = new C1079a(this, bundle, navDeepLink.f6821l, z11, i10);
                if (c1079a == null || c1079a2.compareTo(c1079a) > 0) {
                    c1079a = c1079a2;
                }
            }
            bundle3 = null;
        }
        return c1079a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public void mo3974p(Context context, AttributeSet attributeSet) {
        Object next;
        String str;
        String str2;
        C5207g.m11111f(context, "context");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C5043a.f32878e);
        C5207g.m11110e(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = typedArrayObtainAttributes.getString(2);
        if (string == null) {
            this.f6834h = 0;
            this.f6829c = null;
        } else {
            if (!(!C7661i.m15250P2(string))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            this.f6834h = strConcat.hashCode();
            this.f6829c = null;
            m4013a(new NavDeepLink(strConcat, null, null));
        }
        ArrayList arrayList = this.f6831e;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                str = ((NavDeepLink) next).f6810a;
                str2 = this.f6835i;
            }
        } while (!C5207g.m11106a(str, str2 != null ? "android-app://androidx.navigation/".concat(str2) : ""));
        C5213m.m11196a(arrayList);
        arrayList.remove(next);
        this.f6835i = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.f6834h = resourceId;
            this.f6829c = null;
            this.f6829c = Companion.m4020a(resourceId, context);
        }
        this.f6830d = typedArrayObtainAttributes.getText(0);
        C9072e c9072e = C9072e.f47360a;
        typedArrayObtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f6829c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f6834h));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.f6835i;
        if (!(str2 == null || C7661i.m15250P2(str2))) {
            sb2.append(" route=");
            sb2.append(this.f6835i);
        }
        if (this.f6830d != null) {
            sb2.append(" label=");
            sb2.append(this.f6830d);
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "sb.toString()");
        return string;
    }
}
