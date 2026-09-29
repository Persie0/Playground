package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.sequences.AbstractC3204c;

/* JADX INFO: loaded from: classes2.dex */
public final class ca1 implements ve9, wm9 {

    /* JADX INFO: renamed from: f */
    public static final ma3 f9780f = new ma3(8);

    /* JADX INFO: renamed from: a */
    public Object f9781a;

    /* JADX INFO: renamed from: b */
    public Object f9782b;

    /* JADX INFO: renamed from: c */
    public Object f9783c;

    /* JADX INFO: renamed from: d */
    public Object f9784d;

    /* JADX INFO: renamed from: e */
    public Object f9785e;

    public ca1(ud6 ud6Var) {
        Intent launchIntentForPackage;
        Context context = ud6Var.f63759a;
        this.f9781a = context;
        this.f9782b = new C3002fi(context, (short) 0);
        Activity activity = (Activity) AbstractC3204c.m15415k0(AbstractC3204c.m15420p0(AbstractC3204c.m15418n0(context, new lz5(9)), new lz5(10)));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f9784d = launchIntentForPackage;
        this.f9783c = new ArrayList();
        this.f9785e = ud6Var.f63760b.m13128g();
    }

    /* JADX INFO: renamed from: j */
    public static void m4442j(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m4443k(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* JADX INFO: renamed from: n */
    public static void m4444n(ca1 ca1Var, int i) {
        ArrayList arrayList = (ArrayList) ca1Var.f9783c;
        arrayList.clear();
        arrayList.add(new p86(i, null));
        if (((u86) ca1Var.f9785e) != null) {
            ca1Var.m4457p();
        }
    }

    @Override // p000.ve9
    /* JADX INFO: renamed from: a */
    public void mo4445a(xz7 xz7Var) {
        ((vi3) this.f9782b).invoke(new ua8(xz7Var));
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: b */
    public int mo4446b(long j) {
        long[] jArr = (long[]) this.f9782b;
        int iM22806a = uma.m22806a(jArr, j, false);
        if (iM22806a < jArr.length) {
            return iM22806a;
        }
        return -1;
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: c */
    public long mo4447c(int i) {
        return ((long[]) this.f9782b)[i];
    }

    @Override // p000.ve9
    /* JADX INFO: renamed from: d */
    public void mo4448d() {
        t66 t66Var = (t66) this.f9785e;
        Context context = (Context) this.f9781a;
        if (do7.m10532h(context, "android.permission.RECORD_AUDIO") == 0) {
            ((t66) this.f9784d).setValue(Boolean.TRUE);
            ((vi3) this.f9782b).invoke(ta8.f62055a);
            return;
        }
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (!((Boolean) t66Var.getValue()).booleanValue() || (activity != null && do7.m10517D(activity, "android.permission.RECORD_AUDIO"))) {
            t66Var.setValue(Boolean.TRUE);
            ((hp5) this.f9783c).mo276a("android.permission.RECORD_AUDIO");
        } else {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @Override // p000.ve9
    /* JADX INFO: renamed from: e */
    public void mo4449e() {
        ((vi3) this.f9782b).invoke(va8.f65144a);
    }

    /* JADX INFO: renamed from: f */
    public void m4450f(int i, Bundle bundle) {
        ((ArrayList) this.f9783c).add(new p86(i, bundle));
        if (((u86) this.f9785e) != null) {
            m4457p();
        }
    }

    /* JADX INFO: renamed from: g */
    public wf9 m4451g() {
        ArrayList arrayList = (ArrayList) this.f9783c;
        Intent intent = (Intent) this.f9784d;
        u86 u86Var = (u86) this.f9785e;
        if (u86Var == null) {
            C3386nv.m17633t("You must call setGraph() before constructing the deep link");
            return null;
        }
        if (arrayList.isEmpty()) {
            C3386nv.m17633t("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        r86 r86Var = null;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                intent.putExtra("android-support-nav:controller:deepLinkIds", u91.m22621m1(arrayList2));
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                wf9 wf9Var = new wf9((Context) this.f9781a);
                ArrayList arrayList4 = (ArrayList) wf9Var.f66762b;
                wf9Var.m23895d(new Intent(intent));
                int size = arrayList4.size();
                while (i < size) {
                    Intent intent2 = (Intent) arrayList4.get(i);
                    if (intent2 != null) {
                        intent2.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i++;
                }
                return wf9Var;
            }
            p86 p86Var = (p86) it.next();
            int i2 = p86Var.f55753a;
            Bundle bundle = p86Var.f55754b;
            r86 r86VarM4452h = m4452h(i2);
            if (r86VarM4452h == null) {
                int i3 = r86.f58879f;
                uk9.m22776j("Navigation destination ", bna.m3931T((C3002fi) this.f9782b, i2), " cannot be found in the navigation graph ", u86Var);
                return null;
            }
            int[] iArrM20440f = r86VarM4452h.m20440f(r86Var);
            int length = iArrM20440f.length;
            while (i < length) {
                arrayList2.add(Integer.valueOf(iArrM20440f[i]));
                arrayList3.add(bundle);
                i++;
            }
            r86Var = r86VarM4452h;
        }
    }

    /* JADX INFO: renamed from: h */
    public r86 m4452h(int i) {
        C0825bv c0825bv = new C0825bv();
        u86 u86Var = (u86) this.f9785e;
        u86Var.getClass();
        c0825bv.addLast(u86Var);
        while (!c0825bv.isEmpty()) {
            r86 r86Var = (r86) c0825bv.removeFirst();
            if (r86Var.f58881b.f57368b == i) {
                return r86Var;
            }
            if (r86Var instanceof u86) {
                Iterator it = ((u86) r86Var).iterator();
                while (true) {
                    xa6 xa6Var = (xa6) it;
                    if (xa6Var.hasNext()) {
                        c0825bv.addLast((r86) xa6Var.next());
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: i */
    public List mo4453i(long j) {
        oca ocaVar = (oca) this.f9781a;
        Map map = (Map) this.f9783c;
        HashMap map2 = (HashMap) this.f9784d;
        HashMap map3 = (HashMap) this.f9785e;
        ArrayList<Pair> arrayList = new ArrayList();
        ocaVar.m17919g(j, ocaVar.f54186h, arrayList);
        TreeMap treeMap = new TreeMap();
        ocaVar.m17921i(j, false, ocaVar.f54186h, treeMap);
        ocaVar.m17920h(j, map, map2, ocaVar.f54186h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                qca qcaVar = (qca) map2.get(pair.first);
                qcaVar.getClass();
                arrayList2.add(new cs1(null, null, null, bitmapDecodeByteArray, qcaVar.f57588c, 0, qcaVar.f57590e, qcaVar.f57587b, 0, Integer.MIN_VALUE, -3.4028235E38f, qcaVar.f57591f, qcaVar.f57592g, false, -16777216, qcaVar.f57595j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            qca qcaVar2 = (qca) map2.get(entry.getKey());
            qcaVar2.getClass();
            bs1 bs1Var = (bs1) entry.getValue();
            CharSequence charSequence = bs1Var.f8913a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ab2 ab2Var : (ab2[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ab2.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ab2Var), spannableStringBuilder.getSpanEnd(ab2Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = qcaVar2.f57588c;
            int i9 = qcaVar2.f57589d;
            bs1Var.f8917e = f;
            bs1Var.f8918f = i9;
            bs1Var.f8919g = qcaVar2.f57590e;
            bs1Var.f8920h = qcaVar2.f57587b;
            bs1Var.f8924l = qcaVar2.f57591f;
            float f2 = qcaVar2.f57594i;
            int i10 = qcaVar2.f57593h;
            bs1Var.f8923k = f2;
            bs1Var.f8922j = i10;
            bs1Var.f8928p = qcaVar2.f57595j;
            arrayList2.add(bs1Var.m4153a());
        }
        return arrayList2;
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: l */
    public int mo4454l() {
        return ((long[]) this.f9782b).length;
    }

    /* JADX INFO: renamed from: m */
    public void m4455m(Bundle bundle) {
        ((Intent) this.f9784d).putExtra("android-support-nav:controller:deepLinkExtras", bundle);
    }

    /* JADX INFO: renamed from: o */
    public boolean m4456o(float[] fArr) {
        b37[] b37VarArr = (b37[]) this.f9784d;
        if (b37VarArr != null && b37VarArr.length > 0) {
            for (b37 b37Var : b37VarArr) {
                b37Var.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m4457p() {
        Iterator it = ((ArrayList) this.f9783c).iterator();
        while (it.hasNext()) {
            int i = ((p86) it.next()).f55753a;
            if (m4452h(i) == null) {
                int i2 = r86.f58879f;
                C3386nv.m17630q(AbstractC3393o1.m17742q("Navigation destination ", bna.m3931T((C3002fi) this.f9782b, i), " cannot be found in the navigation graph "), (u86) this.f9785e);
                return;
            }
        }
    }

    public ca1(oca ocaVar, HashMap map, HashMap map2, HashMap map3) {
        this.f9781a = ocaVar;
        this.f9784d = map2;
        this.f9785e = map3;
        this.f9783c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        ocaVar.m17917d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f9782b = jArr;
    }

    public /* synthetic */ ca1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f9781a = obj;
        this.f9782b = obj2;
        this.f9783c = obj3;
        this.f9784d = obj4;
        this.f9785e = obj5;
    }
}
