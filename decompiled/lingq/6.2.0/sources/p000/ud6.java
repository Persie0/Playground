package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.AbstractC3192a;
import kotlin.Pair;
import kotlin.sequences.AbstractC3204c;

/* JADX INFO: loaded from: classes.dex */
public final class ud6 {

    /* JADX INFO: renamed from: a */
    public final Context f63759a;

    /* JADX INFO: renamed from: b */
    public final h86 f63760b;

    /* JADX INFO: renamed from: c */
    public final C3002fi f63761c;

    /* JADX INFO: renamed from: d */
    public final Activity f63762d;

    /* JADX INFO: renamed from: e */
    public boolean f63763e;

    /* JADX INFO: renamed from: f */
    public final w60 f63764f;

    /* JADX INFO: renamed from: g */
    public final boolean f63765g;

    /* JADX INFO: renamed from: h */
    public final cs4 f63766h;

    public ud6(Context context) {
        this.f63759a = context;
        short s = 0;
        this.f63760b = new h86(this, new c86(this, s));
        this.f63761c = new C3002fi(context, s);
        for (Object obj : AbstractC3204c.m15418n0(context, new tf4(20))) {
            if (((Context) obj) instanceof Activity) {
                this.f63762d = (Activity) obj;
                this.f63764f = new w60(this, 2);
                this.f63765g = true;
                lj6 lj6Var = this.f63760b.f41963r;
                lj6Var.m16258a(new tb6(lj6Var));
                this.f63760b.f41963r.m16258a(new C2954e7(this.f63759a));
                this.f63766h = AbstractC3192a.m15356a(new c86(this, 1));
            }
        }
        obj = null;
        this.f63762d = (Activity) obj;
        this.f63764f = new w60(this, 2);
        this.f63765g = true;
        lj6 lj6Var2 = this.f63760b.f41963r;
        lj6Var2.m16258a(new tb6(lj6Var2));
        this.f63760b.f41963r.m16258a(new C2954e7(this.f63759a));
        this.f63766h = AbstractC3192a.m15356a(new c86(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public final void m22684a(e86 e86Var) {
        h86 h86Var = this.f63760b;
        h86Var.getClass();
        h86Var.f41960o.add(e86Var);
        C0825bv c0825bv = h86Var.f41951f;
        if (c0825bv.isEmpty()) {
            return;
        }
        y76 y76Var = (y76) c0825bv.last();
        ud6 ud6Var = h86Var.f41946a;
        r86 r86Var = y76Var.f69409b;
        y76Var.f69415h.m170a();
        e86Var.mo10921a(ud6Var, r86Var);
    }

    /* JADX INFO: renamed from: b */
    public final int m22685b() {
        C0825bv c0825bv = this.f63760b.f41951f;
        int i = 0;
        if (c0825bv != null && c0825bv.isEmpty()) {
            return 0;
        }
        Iterator<E> it = c0825bv.iterator();
        while (it.hasNext()) {
            if (!(((y76) it.next()).f69409b instanceof u86) && (i = i + 1) < 0) {
                vz1.m23626d0();
                throw null;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22686c(Intent intent) {
        int[] intArray;
        String strM3931T;
        r86 r86VarM22538m;
        u86 u86Var;
        Bundle bundle;
        r86 r86VarM22538m2;
        u86 u86Var2;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                    intArray = null;
                }
            } else {
                intArray = null;
            }
            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
            Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
            if (bundle2 != null) {
                bundleM18160p.putAll(bundle2);
            }
            h86 h86Var = this.f63760b;
            if (intArray == null || intArray.length == 0) {
                u86 u86VarM13130i = h86Var.m13130i();
                q86 q86VarM22539n = u86VarM13130i.m22539n(new sq5(4, intent.getData(), intent.getType(), intent.getAction()), u86VarM13130i);
                if (q86VarM22539n != null) {
                    r86 r86Var = q86VarM22539n.f57380a;
                    int[] iArrM20440f = r86Var.m20440f(null);
                    Bundle bundleM20439d = r86Var.m20439d(q86VarM22539n.f57381b);
                    if (bundleM20439d != null) {
                        bundleM18160p.putAll(bundleM20439d);
                    }
                    intArray = iArrM20440f;
                    parcelableArrayList = null;
                }
            }
            if (intArray != null && intArray.length != 0) {
                h86Var.getClass();
                u86 u86Var3 = h86Var.f41948c;
                int length = intArray.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strM3931T = null;
                        break;
                    }
                    int i2 = intArray[i];
                    if (i == 0) {
                        u86 u86Var4 = h86Var.f41948c;
                        u86Var4.getClass();
                        r86VarM22538m2 = u86Var4.f58881b.f57368b == i2 ? h86Var.f41948c : null;
                    } else {
                        u86Var3.getClass();
                        r86VarM22538m2 = u86Var3.m22538m(i2);
                    }
                    if (r86VarM22538m2 == null) {
                        int i3 = r86.f58879f;
                        strM3931T = bna.m3931T(h86Var.f41946a.f63761c, i2);
                        break;
                    }
                    if (i != intArray.length - 1 && (r86VarM22538m2 instanceof u86)) {
                        while (true) {
                            u86Var2 = (u86) r86VarM22538m2;
                            u86Var2.getClass();
                            sg3 sg3Var = u86Var2.f63589g;
                            if (!(u86Var2.m22538m(sg3Var.f60816b) instanceof u86)) {
                                break;
                            }
                            r86VarM22538m2 = u86Var2.m22538m(sg3Var.f60816b);
                        }
                        u86Var3 = u86Var2;
                    }
                    i++;
                }
                if (strM3931T != null) {
                    nmb.m17499a("Could not find destination " + strM3931T + " in the navigation graph, ignoring the deep link from " + intent);
                    return false;
                }
                bundleM18160p.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                int length2 = intArray.length;
                Bundle[] bundleArr = new Bundle[length2];
                for (int i4 = 0; i4 < length2; i4++) {
                    Bundle bundleM18160p2 = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    bundleM18160p2.putAll(bundleM18160p);
                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i4)) != null) {
                        bundleM18160p2.putAll(bundle);
                    }
                    bundleArr[i4] = bundleM18160p2;
                }
                int flags = intent.getFlags();
                int i5 = 268435456 & flags;
                if (i5 == 0 || (flags & 32768) != 0) {
                    boolean z = i5 != 0;
                    C3002fi c3002fi = this.f63761c;
                    if (z) {
                        if (!h86Var.f41951f.isEmpty()) {
                            u86 u86Var5 = h86Var.f41948c;
                            u86Var5.getClass();
                            h86Var.m13134m(u86Var5.f58881b.f57368b, true, false);
                        }
                        int i6 = 0;
                        while (i6 < intArray.length) {
                            int i7 = intArray[i6];
                            int i8 = i6 + 1;
                            Bundle bundle3 = bundleArr[i6];
                            r86 r86VarM13125c = h86Var.m13125c(i7, null);
                            if (r86VarM13125c == null) {
                                int i9 = r86.f58879f;
                                v63.m23138p(AbstractC3393o1.m17742q("Deep Linking failed: destination ", bna.m3931T(c3002fi, i7), " cannot be found from the current destination "), h86Var.m13127f());
                                return false;
                            }
                            h86Var.m13132k(r86VarM13125c, bundle3, xqb.m24650a(new h85(16, r86VarM13125c, this)));
                            i6 = i8;
                        }
                        this.f63763e = true;
                    } else {
                        u86 u86Var6 = h86Var.f41948c;
                        int length3 = intArray.length;
                        for (int i10 = 0; i10 < length3; i10++) {
                            int i11 = intArray[i10];
                            Bundle bundle4 = bundleArr[i10];
                            if (i10 == 0) {
                                r86VarM22538m = h86Var.f41948c;
                            } else {
                                u86Var6.getClass();
                                r86VarM22538m = u86Var6.m22538m(i11);
                            }
                            if (r86VarM22538m == null) {
                                int i12 = r86.f58879f;
                                throw new IllegalStateException("Deep Linking failed: destination " + bna.m3931T(c3002fi, i11) + " cannot be found in graph " + u86Var6);
                            }
                            if (i10 == intArray.length - 1) {
                                u86 u86Var7 = h86Var.f41948c;
                                u86Var7.getClass();
                                h86Var.m13132k(r86VarM22538m, bundle4, new wd6(false, false, u86Var7.f58881b.f57368b, true, false, 0, 0, -1, -1));
                            } else if (r86VarM22538m instanceof u86) {
                                while (true) {
                                    u86Var = (u86) r86VarM22538m;
                                    u86Var.getClass();
                                    sg3 sg3Var2 = u86Var.f63589g;
                                    if (!(u86Var.m22538m(sg3Var2.f60816b) instanceof u86)) {
                                        break;
                                    }
                                    r86VarM22538m = u86Var.m22538m(sg3Var2.f60816b);
                                }
                                u86Var6 = u86Var;
                            }
                        }
                        this.f63763e = true;
                    }
                } else {
                    intent.addFlags(32768);
                    wf9 wf9VarM23894h = wf9.m23894h(this.f63759a);
                    wf9VarM23894h.m23895d(intent);
                    wf9VarM23894h.m23898i();
                    Activity activity = this.f63762d;
                    if (activity != null) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final void m22687d(int i, Bundle bundle, wd6 wd6Var) {
        int i2;
        Bundle bundleM18160p;
        r86 r86VarM13125c;
        C3002fi c3002fi;
        String strM3931T;
        boolean z;
        int i3;
        h86 h86Var = this.f63760b;
        r86 r86Var = h86Var.f41951f.isEmpty() ? h86Var.f41948c : ((y76) h86Var.f41951f.last()).f69409b;
        if (r86Var == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        u76 u76VarM20441g = r86Var.m20441g(i);
        if (u76VarM20441g != null) {
            if (wd6Var == null) {
                wd6Var = u76VarM20441g.f63518b;
            }
            i2 = u76VarM20441g.f63517a;
            Bundle bundle2 = u76VarM20441g.f63519c;
            if (bundle2 != null) {
                bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                bundleM18160p.putAll(bundle2);
            }
            if (bundle != null) {
                if (bundleM18160p == null) {
                    bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                }
                bundleM18160p.putAll(bundle);
            }
            if (i2 == 0 && wd6Var != null) {
                z = wd6Var.f66652d;
                i3 = wd6Var.f66651c;
                if (i3 != -1) {
                    if (i3 != -1) {
                        m22690g(i3, z);
                        return;
                    }
                    return;
                }
            }
            if (i2 != 0) {
                C3386nv.m17626m("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                return;
            }
            r86VarM13125c = h86Var.m13125c(i2, null);
            if (r86VarM13125c == null) {
                h86Var.m13132k(r86VarM13125c, bundleM18160p, wd6Var);
                return;
            }
            int i4 = r86.f58879f;
            c3002fi = this.f63761c;
            strM3931T = bna.m3931T(c3002fi, i2);
            if (u76VarM20441g == null) {
                uk9.m22776j("Navigation action/destination ", strM3931T, " cannot be found from the current destination ", r86Var);
            } else {
                v63.m23140r(AbstractC3393o1.m17742q("Navigation destination ", strM3931T, " referenced from action "), bna.m3931T(c3002fi, i), " cannot be found from the current destination ", r86Var);
            }
        }
        i2 = i;
        bundleM18160p = null;
        if (bundle != null) {
            if (bundleM18160p == null) {
                bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundleM18160p.putAll(bundle);
        }
        if (i2 == 0) {
            z = wd6Var.f66652d;
            i3 = wd6Var.f66651c;
            if (i3 != -1) {
                if (i3 != -1) {
                    m22690g(i3, z);
                    return;
                }
                return;
            }
        }
        if (i2 != 0) {
            C3386nv.m17626m("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            return;
        }
        r86VarM13125c = h86Var.m13125c(i2, null);
        if (r86VarM13125c == null) {
            h86Var.m13132k(r86VarM13125c, bundleM18160p, wd6Var);
            return;
        }
        int i5 = r86.f58879f;
        c3002fi = this.f63761c;
        strM3931T = bna.m3931T(c3002fi, i2);
        if (u76VarM20441g == null) {
            uk9.m22776j("Navigation action/destination ", strM3931T, " cannot be found from the current destination ", r86Var);
        } else {
            v63.m23140r(AbstractC3393o1.m17742q("Navigation destination ", strM3931T, " referenced from action "), bna.m3931T(c3002fi, i), " cannot be found from the current destination ", r86Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22688e(Uri uri) {
        uri.getClass();
        String str = null;
        sq5 sq5Var = new sq5(4, uri, str, str);
        h86 h86Var = this.f63760b;
        h86Var.getClass();
        ud6 ud6Var = h86Var.f41946a;
        if (h86Var.f41948c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + sq5Var + ". Navigation graph has not been set for NavController " + ud6Var + '.').toString());
        }
        u86 u86VarM13130i = h86Var.m13130i();
        q86 q86VarM22539n = u86VarM13130i.m22539n(sq5Var, u86VarM13130i);
        if (q86VarM22539n == null) {
            StringBuilder sb = new StringBuilder("Navigation destination that matches request ");
            sb.append(sq5Var);
            uk9.m22778m(sb, " cannot be found in the navigation graph ", h86Var.f41948c);
            return;
        }
        r86 r86Var = q86VarM22539n.f57380a;
        Bundle bundleM20439d = r86Var.m20439d(q86VarM22539n.f57381b);
        if (bundleM20439d == null) {
            bundleM20439d = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleM20439d.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        h86Var.m13132k(r86Var, bundleM20439d, null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m22689f() {
        Bundle bundleM20439d;
        Intent intent;
        if (m22685b() != 1) {
            return m22691h();
        }
        Activity activity = this.f63762d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        int i = 0;
        h86 h86Var = this.f63760b;
        if (intArray == null) {
            r86 r86VarM13127f = h86Var.m13127f();
            r86VarM13127f.getClass();
            int i2 = r86VarM13127f.f58881b.f57368b;
            for (u86 u86Var = r86VarM13127f.f58882c; u86Var != null; u86Var = u86Var.f58882c) {
                C3488q8 c3488q8 = u86Var.f58881b;
                if (u86Var.f63589g.f60816b != i2) {
                    Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        intent2.getClass();
                        bundleM18160p.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                        u86 u86VarM13130i = h86Var.m13130i();
                        Intent intent3 = activity.getIntent();
                        intent3.getClass();
                        q86 q86VarM22539n = u86VarM13130i.m22539n(new sq5(4, intent3.getData(), intent3.getType(), intent3.getAction()), u86VarM13130i);
                        if ((q86VarM22539n != null ? q86VarM22539n.f57381b : null) != null && (bundleM20439d = q86VarM22539n.f57380a.m20439d(q86VarM22539n.f57381b)) != null) {
                            bundleM18160p.putAll(bundleM20439d);
                        }
                    }
                    ca1 ca1Var = new ca1(this);
                    ca1.m4444n(ca1Var, c3488q8.f57368b);
                    ca1Var.m4455m(bundleM18160p);
                    ca1Var.m4451g().m23898i();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                i2 = c3488q8.f57368b;
            }
        } else if (this.f63763e) {
            activity.getClass();
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            extras2.getClass();
            int[] intArray2 = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            intArray2.getClass();
            ArrayList arrayList = new ArrayList(intArray2.length);
            for (int i3 : intArray2) {
                arrayList.add(Integer.valueOf(i3));
            }
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayList.size() >= 2) {
                int iIntValue = ((Number) u91.m22608Z0(arrayList)).intValue();
                if (parcelableArrayList != null) {
                }
                r86 r86VarM13121d = h86.m13121d(iIntValue, h86Var.m13128g(), null, false);
                if (r86VarM13121d instanceof u86) {
                    int i4 = u86.f63588h;
                    iIntValue = wfb.m23917l((u86) r86VarM13121d).f58881b.f57368b;
                }
                r86 r86VarM13127f2 = h86Var.m13127f();
                if (r86VarM13127f2 != null && iIntValue == r86VarM13127f2.f58881b.f57368b) {
                    ca1 ca1Var2 = new ca1(this);
                    Bundle bundleM18160p2 = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    bundleM18160p2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
                    Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle != null) {
                        bundleM18160p2.putAll(bundle);
                    }
                    ca1Var2.m4455m(bundleM18160p2);
                    for (Object obj : arrayList) {
                        int i5 = i + 1;
                        if (i < 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        ca1Var2.m4450f(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null);
                        i = i5;
                    }
                    ca1Var2.m4451g().m23898i();
                    activity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m22690g(int i, boolean z) {
        this.f63760b.m13133l(i, z);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m22691h() {
        h86 h86Var = this.f63760b;
        if (h86Var.f41951f.isEmpty()) {
            return false;
        }
        r86 r86VarM13127f = h86Var.m13127f();
        r86VarM13127f.getClass();
        return h86Var.m13133l(r86VarM13127f.f58881b.f57368b, true);
    }
}
