package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.common.R$styleable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.sequences.AbstractC3204c;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public abstract class r86 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f58879f = 0;

    /* JADX INFO: renamed from: a */
    public final String f58880a;

    /* JADX INFO: renamed from: b */
    public final C3488q8 f58881b;

    /* JADX INFO: renamed from: c */
    public u86 f58882c;

    /* JADX INFO: renamed from: d */
    public CharSequence f58883d;

    /* JADX INFO: renamed from: e */
    public final pe9 f58884e;

    static {
        new LinkedHashMap();
    }

    public r86(kj6 kj6Var) {
        LinkedHashMap linkedHashMap = lj6.f49741b;
        this.f58880a = AbstractC3423or.m18283w(kj6Var.getClass());
        this.f58881b = new C3488q8(this);
        this.f58884e = new pe9(0);
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m20439d(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f58881b.f57372f;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            x76 x76Var = (x76) entry.getValue();
            x76Var.getClass();
            str.getClass();
            if (x76Var.f67890c && (obj = x76Var.f67891d) != null) {
                x76Var.f67888a.mo304e(bundleM18160p, str, obj);
            }
        }
        if (bundle != null) {
            bundleM18160p.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                x76 x76Var2 = (x76) entry2.getValue();
                x76Var2.getClass();
                de6 de6Var = x76Var2.f67888a;
                str2.getClass();
                if (x76Var2.f67889b || !bundleM18160p.containsKey(str2) || !te1.m22011y(str2, bundleM18160p)) {
                    try {
                        de6Var.mo301a(str2, bundleM18160p);
                    } catch (IllegalStateException unused) {
                    }
                }
                v63.m23139q(AbstractC3393o1.m17742q("Wrong argument type for '", str2, "' in argument savedState. "), de6Var.mo302b(), " expected.");
                return null;
            }
        }
        return bundleM18160p;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof r86)) {
                C3488q8 c3488q8 = this.f58881b;
                ArrayList arrayList = (ArrayList) c3488q8.f57370d;
                r86 r86Var = (r86) obj;
                pe9 pe9Var = r86Var.f58884e;
                C3488q8 c3488q9 = r86Var.f58881b;
                boolean zM11650l = fa4.m11650l(arrayList, (ArrayList) c3488q9.f57370d);
                pe9 pe9Var2 = this.f58884e;
                if (pe9Var2.m19081e() != pe9Var.m19081e()) {
                    z = false;
                    break;
                }
                Iterator it = ((aj1) AbstractC3204c.m15413i0(new qe9(pe9Var2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!fa4.m11650l(pe9Var2.m19078b(iIntValue), pe9Var.m19078b(iIntValue))) {
                        z = false;
                        break;
                    }
                }
                if (m20442h().size() != r86Var.m20442h().size()) {
                    z2 = false;
                    break;
                }
                Set setEntrySet = m20442h().entrySet();
                setEntrySet.getClass();
                Iterator it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!r86Var.m20442h().containsKey(entry.getKey()) || !fa4.m11650l(r86Var.m20442h().get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (c3488q8.f57368b != c3488q9.f57368b || !fa4.m11650l((String) c3488q8.f57373g, (String) c3488q9.f57373g) || !zM11650l || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX INFO: renamed from: f */
    public final int[] m20440f(r86 r86Var) {
        C0825bv c0825bv = new C0825bv();
        while (true) {
            C3488q8 c3488q8 = this.f58881b;
            u86 u86Var = this.f58882c;
            if ((r86Var != null ? r86Var.f58882c : null) != null) {
                u86 u86Var2 = r86Var.f58882c;
                u86Var2.getClass();
                if (u86Var2.m22538m(c3488q8.f57368b) != this) {
                    if (u86Var != null || u86Var.f63589g.f60816b != c3488q8.f57368b) {
                        c0825bv.addFirst(this);
                    }
                    if (!fa4.m11650l(u86Var, r86Var) || u86Var == null) {
                        break;
                    }
                    this = u86Var;
                } else {
                    c0825bv.addFirst(this);
                    break;
                }
            } else {
                if (u86Var != null) {
                    c0825bv.addFirst(this);
                } else {
                    c0825bv.addFirst(this);
                }
                if (!fa4.m11650l(u86Var, r86Var)) {
                    break;
                }
                this = u86Var;
            }
        }
        List listM22622n1 = u91.m22622n1(c0825bv);
        ArrayList arrayList = new ArrayList(v91.m23189q0(listM22622n1, 10));
        Iterator it = listM22622n1.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((r86) it.next()).f58881b.f57368b));
        }
        return u91.m22621m1(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final u76 m20441g(int i) {
        pe9 pe9Var = this.f58884e;
        u76 u76Var = pe9Var.m19081e() == 0 ? null : (u76) pe9Var.m19078b(i);
        if (u76Var != null) {
            return u76Var;
        }
        u86 u86Var = this.f58882c;
        if (u86Var != null) {
            return u86Var.m20441g(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Map m20442h() {
        return AbstractC3194a.m15371X((LinkedHashMap) this.f58881b.f57372f);
    }

    public int hashCode() {
        C3488q8 c3488q8 = this.f58881b;
        int i = c3488q8.f57368b * 31;
        String str = (String) c3488q8.f57373g;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (o86 o86Var : (ArrayList) c3488q8.f57370d) {
            int i2 = iHashCode * 31;
            String str2 = o86Var.f53985a;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = o86Var.f53986b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = o86Var.f53987c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        pe9 pe9Var = this.f58884e;
        pe9Var.getClass();
        int i3 = 0;
        while (true) {
            if (!(i3 < pe9Var.m19081e())) {
                break;
            }
            int i4 = i3 + 1;
            u76 u76Var = (u76) pe9Var.m19082f(i3);
            int i5 = ((iHashCode * 31) + u76Var.f63517a) * 31;
            wd6 wd6Var = u76Var.f63518b;
            iHashCode = i5 + (wd6Var != null ? wd6Var.hashCode() : 0);
            Bundle bundle = u76Var.f63519c;
            if (bundle != null) {
                iHashCode = bq1.m4052b0(bundle) + (iHashCode * 31);
            }
            i3 = i4;
        }
        for (String str5 : m20442h().keySet()) {
            int iM22980c = ux5.m22980c(iHashCode * 31, str5, 31);
            Object obj = m20442h().get(str5);
            iHashCode = iM22980c + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public String mo20443i() {
        C3488q8 c3488q8 = this.f58881b;
        String str = (String) c3488q8.f57371e;
        return str == null ? String.valueOf(c3488q8.f57368b) : str;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0248  */
    /* JADX WARN: Code duplicated, block: B:119:0x026a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX INFO: renamed from: j */
    public q86 mo20444j(sq5 sq5Var) {
        boolean zM15427f;
        Iterator it;
        boolean zM15427f2;
        cs4 cs4Var;
        Bundle bundle;
        int size;
        int iCompareTo;
        q86 q86Var;
        Regex regex;
        dr5 dr5VarM15426e;
        final Bundle bundleM18160p;
        dr5 dr5VarM15426e2;
        dr5 dr5VarM15426e3;
        ?? r9;
        String strDecode;
        C3488q8 c3488q8 = this.f58881b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c3488q8.f57372f;
        String str = (String) sq5Var.f61250d;
        String str2 = (String) sq5Var.f61248b;
        Uri uri = (Uri) sq5Var.f61249c;
        Bundle bundle2 = null;
        if (((ArrayList) c3488q8.f57370d).isEmpty()) {
            return null;
        }
        q86 q86Var2 = null;
        for (Iterator it2 = r5.iterator(); it2.hasNext(); it2 = it) {
            o86 o86Var = (o86) it2.next();
            o86Var.getClass();
            cs4 cs4Var2 = o86Var.f53999o;
            cs4 cs4Var3 = o86Var.f53990f;
            String str3 = o86Var.f53987c;
            String str4 = o86Var.f53986b;
            if (((Regex) cs4Var3.getValue()) == null) {
                zM15427f = true;
            } else if (uri == null) {
                zM15427f = false;
            } else {
                Regex regex2 = (Regex) cs4Var3.getValue();
                regex2.getClass();
                zM15427f = regex2.m15427f(uri.toString());
            }
            if (zM15427f) {
                if (str4 == null ? true : str2 == null ? false : str4.equals(str2)) {
                    if (str3 == null) {
                        zM15427f2 = true;
                    } else if (str == null) {
                        zM15427f2 = false;
                    } else {
                        Regex regex3 = (Regex) cs4Var2.getValue();
                        regex3.getClass();
                        zM15427f2 = regex3.m15427f(str);
                    }
                    if (zM15427f2) {
                        if (uri != null) {
                            uri.getClass();
                            linkedHashMap.getClass();
                            Regex regex4 = (Regex) o86Var.f53990f.getValue();
                            if (regex4 == null || (dr5VarM15426e2 = regex4.m15426e(uri.toString())) == null) {
                                it = it2;
                                cs4Var = cs4Var2;
                                bundleM18160p = bundle2;
                            } else {
                                bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                if (o86Var.m17849c(dr5VarM15426e2, bundleM18160p, linkedHashMap) && (!((Boolean) o86Var.f53991g.getValue()).booleanValue() || o86Var.m17850d(uri, bundleM18160p, linkedHashMap))) {
                                    String fragment = uri.getFragment();
                                    Regex regex5 = (Regex) o86Var.f53997m.getValue();
                                    if (regex5 == null || (dr5VarM15426e3 = regex5.m15426e(String.valueOf(fragment))) == null) {
                                        it = it2;
                                    } else {
                                        List list = (List) o86Var.f53995k.getValue();
                                        it = it2;
                                        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
                                        Iterator it3 = list.iterator();
                                        int i = 0;
                                        while (it3.hasNext()) {
                                            Object next = it3.next();
                                            Iterator it4 = it3;
                                            int i2 = i + 1;
                                            if (i < 0) {
                                                vz1.m23628e0();
                                                throw bundle2;
                                            }
                                            String str5 = (String) next;
                                            cs4Var = cs4Var2;
                                            uq5 uq5VarM9865f = dr5VarM15426e3.f36079c.m9865f(i2);
                                            if (uq5VarM9865f != null) {
                                                strDecode = Uri.decode(uq5VarM9865f.f64214a);
                                                strDecode.getClass();
                                            } else {
                                                r9 = bundle2;
                                            }
                                            if (r9 == 0) {
                                                r9 = strDecode;
                                                r9 = "";
                                            }
                                            r9 = strDecode;
                                            try {
                                                o86.m17846e(bundleM18160p, str5, r9, (x76) linkedHashMap.get(str5));
                                                arrayList.add(xfa.f68157a);
                                                cs4Var2 = cs4Var;
                                                it3 = it4;
                                                i = i2;
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }
                                    }
                                    cs4Var = cs4Var2;
                                    final int i3 = 0;
                                    if (!pk9.m19378s(linkedHashMap, new vi3() { // from class: l86
                                        @Override // p000.vi3
                                        public final Object invoke(Object obj) {
                                            boolean zContainsKey;
                                            int i4 = i3;
                                            Bundle bundle3 = bundleM18160p;
                                            String str6 = (String) obj;
                                            switch (i4) {
                                                case 0:
                                                    str6.getClass();
                                                    zContainsKey = bundle3.containsKey(str6);
                                                    break;
                                                default:
                                                    str6.getClass();
                                                    zContainsKey = bundle3.containsKey(str6);
                                                    break;
                                            }
                                            return Boolean.valueOf(!zContainsKey);
                                        }
                                    }).isEmpty()) {
                                    }
                                } else {
                                    it = it2;
                                    cs4Var = cs4Var2;
                                }
                                bundleM18160p = bundle2;
                            }
                            bundle = bundleM18160p;
                        } else {
                            it = it2;
                            cs4Var = cs4Var2;
                            bundle = bundle2;
                        }
                        String str6 = o86Var.f53985a;
                        if (uri == null || str6 == null) {
                            size = 0;
                        } else {
                            List<String> pathSegments = uri.getPathSegments();
                            Uri uri2 = Uri.parse(str6);
                            uri2.getClass();
                            List<String> list2 = pathSegments;
                            List<String> pathSegments2 = uri2.getPathSegments();
                            list2.getClass();
                            pathSegments2.getClass();
                            if (!(pathSegments2 instanceof Collection)) {
                                pathSegments2 = u91.m22622n1(pathSegments2);
                            }
                            List<String> list3 = pathSegments2;
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            for (Object obj : list2) {
                                if (list3.contains(obj)) {
                                    linkedHashSet.add(obj);
                                }
                            }
                            size = linkedHashSet.size();
                        }
                        boolean z = str2 != null && str2.equals(str4);
                        if (str == null || str3 == null) {
                            iCompareTo = -1;
                        } else {
                            Regex regex6 = (Regex) cs4Var.getValue();
                            regex6.getClass();
                            if (regex6.m15427f(str)) {
                                iCompareTo = new m86(str3).compareTo(new m86(str));
                            } else {
                                iCompareTo = -1;
                            }
                        }
                        if (bundle != null) {
                            q86Var = new q86((r86) c3488q8.f57369c, bundle, o86Var.f54000p, size, z, iCompareTo);
                            if (q86Var2 != null || q86Var.compareTo(q86Var2) > 0) {
                                q86Var2 = q86Var;
                            }
                        } else if (z || iCompareTo > -1) {
                            linkedHashMap.getClass();
                            final Bundle bundleM18160p2 = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            if (uri != null && (regex = (Regex) cs4Var3.getValue()) != null && (dr5VarM15426e = regex.m15426e(uri.toString())) != null) {
                                o86Var.m17849c(dr5VarM15426e, bundleM18160p2, linkedHashMap);
                                if (((Boolean) o86Var.f53991g.getValue()).booleanValue()) {
                                    o86Var.m17850d(uri, bundleM18160p2, linkedHashMap);
                                }
                            }
                            final int i4 = 1;
                            if (pk9.m19378s(linkedHashMap, new vi3() { // from class: l86
                                @Override // p000.vi3
                                public final Object invoke(Object obj2) {
                                    boolean zContainsKey;
                                    int i5 = i4;
                                    Bundle bundle3 = bundleM18160p2;
                                    String str7 = (String) obj2;
                                    switch (i5) {
                                        case 0:
                                            str7.getClass();
                                            zContainsKey = bundle3.containsKey(str7);
                                            break;
                                        default:
                                            str7.getClass();
                                            zContainsKey = bundle3.containsKey(str7);
                                            break;
                                    }
                                    return Boolean.valueOf(!zContainsKey);
                                }
                            }).isEmpty()) {
                                q86Var = new q86((r86) c3488q8.f57369c, bundle, o86Var.f54000p, size, z, iCompareTo);
                                if (q86Var2 != null) {
                                }
                                q86Var2 = q86Var;
                            }
                        }
                    } else {
                        it = it2;
                    }
                } else {
                    it = it2;
                }
            } else {
                it = it2;
            }
        }
        return q86Var2;
    }

    /* JADX INFO: renamed from: k */
    public void mo10135k(Context context, AttributeSet attributeSet) {
        String strValueOf;
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.Navigator);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(R$styleable.Navigator_route);
        C3488q8 c3488q8 = this.f58881b;
        if (string == null) {
            c3488q8.f57368b = 0;
            c3488q8.f57371e = null;
        } else {
            c3488q8.getClass();
            if (vk9.m23391n0(string)) {
                C3386nv.m17626m("Cannot have an empty route");
                return;
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            ArrayList arrayListM19378s = pk9.m19378s((LinkedHashMap) c3488q8.f57372f, new s86(new o86(strConcat, null, null), 1));
            if (!arrayListM19378s.isEmpty()) {
                v63.m23140r(AbstractC3393o1.m17742q("Cannot set route \"", string, "\" for destination "), (r86) c3488q8.f57369c, ". Following required arguments are missing: ", arrayListM19378s);
                return;
            } else {
                AbstractC3192a.m15356a(new C3757xf(strConcat, 23));
                c3488q8.f57368b = strConcat.hashCode();
                c3488q8.f57371e = null;
            }
        }
        c3488q8.f57373g = string;
        if (typedArrayObtainAttributes.hasValue(R$styleable.Navigator_android_id)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(R$styleable.Navigator_android_id, 0);
            c3488q8.f57368b = resourceId;
            c3488q8.f57371e = null;
            if (resourceId <= 16777215) {
                strValueOf = String.valueOf(resourceId);
            } else {
                try {
                    strValueOf = context.getResources().getResourceName(resourceId);
                    strValueOf.getClass();
                } catch (Resources.NotFoundException unused) {
                    strValueOf = String.valueOf(resourceId);
                }
            }
            c3488q8.f57371e = strValueOf;
        }
        this.f58883d = typedArrayObtainAttributes.getText(R$styleable.Navigator_android_label);
        typedArrayObtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        C3488q8 c3488q8 = this.f58881b;
        String str = (String) c3488q8.f57371e;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(c3488q8.f57368b));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = (String) c3488q8.f57373g;
        if (str2 != null && !vk9.m23391n0(str2)) {
            sb.append(" route=");
            sb.append((String) c3488q8.f57373g);
        }
        if (this.f58883d != null) {
            sb.append(" label=");
            sb.append(this.f58883d);
        }
        return sb.toString();
    }
}
