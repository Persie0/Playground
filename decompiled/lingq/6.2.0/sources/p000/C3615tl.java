package p000;

import android.os.Bundle;
import androidx.compose.animation.core.AbstractC0063e;
import androidx.compose.animation.core.C0059a;
import androidx.compose.animation.core.C0061c;
import androidx.compose.foundation.gestures.C0106n;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.layout.C0345l;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.lingq.core.playlists.C1828d;
import com.lingq.core.playlists.C1833i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: tl */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3615tl implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f62462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f62463c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f62464d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f62465e;

    public /* synthetic */ C3615tl(ArrayList arrayList, Ref$IntRef ref$IntRef, List list, int i, ss4 ss4Var) {
        this.f62461a = 4;
        this.f62462b = arrayList;
        this.f62463c = ref$IntRef;
        this.f62464d = list;
        this.f62465e = ss4Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a2  */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object obj2;
        int i = 0;
        switch (this.f62461a) {
            case 0:
                C0059a c0059a = (C0059a) this.f62462b;
                C0817bn c0817bn = (C0817bn) this.f62463c;
                vi3 vi3Var = (vi3) this.f62464d;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f62465e;
                C3838zm c3838zm = (C3838zm) obj;
                AbstractC0063e.m762i(c3838zm, c0059a.f1540c);
                xc9 xc9Var = (xc9) c3838zm.f71729e;
                Object objM742a = C0059a.m742a(c0059a, xc9Var.getValue());
                if (!fa4.m11650l(objM742a, xc9Var.getValue())) {
                    ((xc9) c0059a.f1540c.f8704b).setValue(objM742a);
                    ((xc9) c0817bn.f8704b).setValue(objM742a);
                    if (vi3Var != null) {
                        vi3Var.invoke(c0059a);
                    }
                    c3838zm.m25698a();
                    ref$BooleanRef.f47713a = true;
                } else if (vi3Var != null) {
                    vi3Var.invoke(c0059a);
                }
                return xfa.f68157a;
            case 1:
                yw4 yw4Var = (yw4) this.f62462b;
                fw9 fw9Var = (fw9) this.f62463c;
                vv9 vv9Var = (vv9) this.f62464d;
                w04 w04Var = (w04) this.f62465e;
                if (yw4Var.m25361b()) {
                    bl2 bl2Var = yw4Var.f70572d;
                    sm1 sm1Var = yw4Var.f70590v;
                    sm1 sm1Var2 = yw4Var.f70591w;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    bb0 bb0Var = new bb0(17, sm1Var, bl2Var, ref$ObjectRef);
                    h97 h97Var = fw9Var.f39814a;
                    h97Var.mo1085g(vv9Var, w04Var, bb0Var, sm1Var2);
                    hw9 hw9Var = new hw9(fw9Var, h97Var);
                    fw9Var.f39815b.set(hw9Var);
                    ref$ObjectRef.f47718a = hw9Var;
                    yw4Var.f70573e = hw9Var;
                }
                return new xm1(0);
            case 2:
                wr3 wr3Var = (wr3) this.f62462b;
                String str = (String) this.f62463c;
                String str2 = (String) this.f62464d;
                Preferences.Key key = (Preferences.Key) this.f62465e;
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                if (((String) ad4.m277a(mutablePreferences, wr3.f67202d, "")).equals(str)) {
                    Preferences.Key keyM24134c = wr3Var.m24134c(mutablePreferences, str);
                    if (keyM24134c != null && !keyM24134c.getName().equals(str2)) {
                        synchronized (wr3Var) {
                            wr3Var.m24135d(mutablePreferences, str);
                            HashSet hashSet = new HashSet((Collection) ad4.m277a(mutablePreferences, key, new HashSet()));
                            hashSet.add(str);
                            mutablePreferences.set(key, hashSet);
                        }
                    }
                    return null;
                }
                Preferences.Key key2 = wr3.f67201c;
                long jLongValue = ((Long) ad4.m277a(mutablePreferences, key2, 0L)).longValue();
                if (jLongValue + 1 == 30) {
                    synchronized (wr3Var) {
                        try {
                            long jLongValue2 = ((Long) ad4.m277a(mutablePreferences, key2, 0L)).longValue();
                            String name = "";
                            Set hashSet2 = new HashSet();
                            String str3 = null;
                            for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    Set<String> set = (Set) entry.getValue();
                                    for (String str4 : set) {
                                        if (str3 == null || str3.compareTo(str4) > 0) {
                                            name = entry.getKey().getName();
                                            str3 = str4;
                                            hashSet2 = set;
                                        }
                                    }
                                }
                            }
                            obj2 = null;
                            HashSet hashSet3 = new HashSet(hashSet2);
                            hashSet3.remove(str3);
                            mutablePreferences.set(PreferencesKeys.stringSetKey(name), hashSet3);
                            jLongValue = jLongValue2 - 1;
                            mutablePreferences.set(wr3.f67201c, Long.valueOf(jLongValue));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) ad4.m277a(mutablePreferences, key, new HashSet()));
                hashSet4.add(str);
                mutablePreferences.set(key, hashSet4);
                mutablePreferences.set(wr3.f67201c, Long.valueOf(jLongValue + 1));
                mutablePreferences.set(wr3.f67202d, str);
                return obj2;
            case 3:
                t66 t66Var = (t66) this.f62462b;
                C0061c c0061c = (C0061c) this.f62463c;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.f62464d;
                un1 un1Var = (un1) this.f62465e;
                long jLongValue3 = ((Long) obj).longValue();
                dh9 dh9Var = (dh9) t66Var.getValue();
                long jLongValue4 = dh9Var != null ? ((Number) dh9Var.getValue()).longValue() : jLongValue3;
                long j = c0061c.f1552c;
                x66 x66Var = c0061c.f1550a;
                if (j == Long.MIN_VALUE || ref$FloatRef.f47715a != AbstractC0063e.m761h(un1Var.mo1309x())) {
                    c0061c.f1552c = jLongValue3;
                    Object[] objArr = x66Var.f67830a;
                    int i2 = x66Var.f67832c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((l44) objArr[i3]).f49020g = true;
                    }
                    ref$FloatRef.f47715a = AbstractC0063e.m761h(un1Var.mo1309x());
                }
                float f = ref$FloatRef.f47715a;
                if (f == 0.0f) {
                    Object[] objArr2 = x66Var.f67830a;
                    int i4 = x66Var.f67832c;
                    while (i < i4) {
                        l44 l44Var = (l44) objArr2[i];
                        ((xc9) l44Var.f49017d).setValue(l44Var.f49018e.f54792c);
                        l44Var.f49020g = true;
                        i++;
                    }
                } else {
                    long j2 = (long) ((jLongValue4 - c0061c.f1552c) / f);
                    Object[] objArr3 = x66Var.f67830a;
                    int i5 = x66Var.f67832c;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        l44 l44Var2 = (l44) objArr3[i6];
                        if (!l44Var2.f49019f) {
                            ((xc9) l44Var2.f49022i.f1551b).setValue(Boolean.FALSE);
                            if (l44Var2.f49020g) {
                                l44Var2.f49020g = false;
                                l44Var2.f49021h = j2;
                            }
                            long j3 = j2 - l44Var2.f49021h;
                            ((xc9) l44Var2.f49017d).setValue(l44Var2.f49018e.mo10821g(j3));
                            l44Var2.f49019f = l44Var2.f49018e.m21452f(j3);
                        }
                        if (!l44Var2.f49019f) {
                            z = false;
                        }
                    }
                    ((xc9) c0061c.f1553d).setValue(Boolean.valueOf(!z));
                }
                return xfa.f68157a;
            case 4:
                List list = (List) this.f62462b;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.f62463c;
                List list2 = (List) this.f62464d;
                ss4 ss4Var = (ss4) this.f62465e;
                ej7 ej7Var = (ej7) obj;
                pm9 pm9Var = ej7Var.f37345e;
                int iMo19397d = pm9Var != null ? pm9Var.mo19397d() : 0;
                int iMo19396c = 0;
                while (i < iMo19397d) {
                    Orientation orientation = ss4Var.f61350q;
                    Orientation orientation2 = Orientation.Vertical;
                    pm9 pm9Var2 = ej7Var.f37345e;
                    iMo19396c += (int) (orientation == orientation2 ? (pm9Var2 != null ? pm9Var2.mo19396c(i) : 0L) & 4294967295L : (pm9Var2 != null ? pm9Var2.mo19396c(i) : 0L) >> 32);
                    i++;
                }
                if (list != null) {
                    list.add(Integer.valueOf(iMo19396c));
                }
                if (ref$IntRef.f47716a != list2.size()) {
                    ref$IntRef.f47716a++;
                }
                return xfa.f68157a;
            case 5:
                lu4 lu4Var = (lu4) this.f62462b;
                lu4Var.f50141c = new C3552rx((xt4) this.f62463c, (C0345l) this.f62464d, (fj7) this.f62465e);
                return new C3525r7(lu4Var, 5);
            case 6:
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.f62462b;
                C0106n c0106n = (C0106n) this.f62463c;
                ho8 ho8Var = (ho8) this.f62464d;
                C3450p7 c3450p7 = (C3450p7) this.f62465e;
                C3838zm c3838zm2 = (C3838zm) obj;
                xfa xfaVar = xfa.f68157a;
                float fFloatValue = ((Number) ((xc9) c3838zm2.f71729e).getValue()).floatValue() - ref$FloatRef2.f47715a;
                if (do7.m10529e(fFloatValue)) {
                    if (((Boolean) c3450p7.invoke(Float.valueOf(ref$FloatRef2.f47715a))).booleanValue()) {
                        c3838zm2.m25698a();
                    }
                } else if (do7.m10529e(fFloatValue - c0106n.m897e(ho8Var, fFloatValue))) {
                    ref$FloatRef2.f47715a += fFloatValue;
                    if (((Boolean) c3450p7.invoke(Float.valueOf(ref$FloatRef2.f47715a))).booleanValue()) {
                        c3838zm2.m25698a();
                    }
                } else {
                    c3838zm2.m25698a();
                }
                return xfaVar;
            case 7:
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) this.f62465e;
                h86 h86Var = (h86) this.f62462b;
                r86 r86Var = (r86) this.f62463c;
                Bundle bundle = (Bundle) this.f62464d;
                y76 y76Var = (y76) obj;
                y76Var.getClass();
                ref$BooleanRef2.f47713a = true;
                h86Var.m13123a(r86Var, bundle, y76Var, EmptyList.f47638a);
                return xfa.f68157a;
            default:
                C1833i c1833i = (C1833i) this.f62462b;
                un1 un1Var2 = (un1) this.f62463c;
                C0269z c0269z = (C0269z) this.f62464d;
                uf7 uf7Var = (uf7) this.f62465e;
                String str5 = (String) obj;
                str5.getClass();
                c1833i.m8509V2(str5, new C1828d(un1Var2, c0269z, uf7Var));
                return xfa.f68157a;
        }
    }

    public /* synthetic */ C3615tl(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f62461a = i;
        this.f62462b = obj;
        this.f62463c = obj2;
        this.f62464d = obj3;
        this.f62465e = obj4;
    }

    public /* synthetic */ C3615tl(Ref$BooleanRef ref$BooleanRef, h86 h86Var, r86 r86Var, Bundle bundle) {
        this.f62461a = 7;
        this.f62465e = ref$BooleanRef;
        this.f62462b = h86Var;
        this.f62463c = r86Var;
        this.f62464d = bundle;
    }
}
