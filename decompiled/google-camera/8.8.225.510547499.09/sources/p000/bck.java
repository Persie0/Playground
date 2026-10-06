package p000;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bck {

    /* JADX INFO: renamed from: a */
    public final Object f2948a;

    /* JADX INFO: renamed from: b */
    public final Object f2949b;

    public bck() {
        this.f2949b = new Object();
        this.f2948a = new LinkedHashMap();
    }

    public bck(amt amtVar, oyo oyoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f2948a = amtVar;
        this.f2949b = oyoVar;
        int i = amr.f724a;
        short[][] sArr = ana.f837a;
    }

    public bck(Animator animator) {
        this.f2949b = null;
        this.f2948a = animator;
    }

    public bck(Intent intent, ArrayList arrayList) {
        this.f2948a = intent;
        this.f2949b = arrayList;
    }

    public bck(Animation animation) {
        this.f2949b = animation;
        this.f2948a = null;
    }

    public bck(C0111cq c0111cq) {
        this.f2949b = new CopyOnWriteArrayList();
        this.f2948a = c0111cq;
    }

    public bck(Class cls, oni oniVar) {
        this.f2948a = cls;
        this.f2949b = oniVar;
    }

    public bck(ClassLoader classLoader, awc awcVar) {
        this.f2948a = classLoader;
        this.f2949b = awcVar;
    }

    public bck(byte[] bArr) {
    }

    /* JADX INFO: renamed from: G */
    private static final boolean m2194G(omx omxVar) {
        try {
            return ((Boolean) omxVar.mo2077a()).booleanValue();
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m2195f(Method method, Class cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m2196g(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m2197h(Method method, oov oovVar) {
        return m2195f(method, ((ony) oovVar).f46343d);
    }

    /* JADX INFO: renamed from: l */
    public static final int m2198l(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m2199n(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: renamed from: o */
    public static final KeyListener m2200o(KeyListener keyListener) {
        if (!m2199n(keyListener) || (keyListener instanceof ajd)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return !(keyListener instanceof NumberKeyListener) ? new ajd(keyListener) : keyListener;
    }

    /* JADX INFO: renamed from: A */
    public final void m2201A(ComponentCallbacksC0077bw componentCallbacksC0077bw, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2201A(componentCallbacksC0077bw, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m2202B(ComponentCallbacksC0077bw componentCallbacksC0077bw, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2202B(componentCallbacksC0077bw, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2203C(ComponentCallbacksC0077bw componentCallbacksC0077bw, View view, Bundle bundle, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2203C(componentCallbacksC0077bw, view, bundle, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m2204D(ComponentCallbacksC0077bw componentCallbacksC0077bw, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2204D(componentCallbacksC0077bw, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: E */
    public final bkn m2205E(bcj bcjVar) {
        bkn bknVar;
        synchronized (this.f2949b) {
            bknVar = (bkn) this.f2948a.remove(bcjVar);
        }
        return bknVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: F */
    public final bkn m2206F(bcj bcjVar) {
        bkn bknVar;
        synchronized (this.f2949b) {
            ?? r1 = this.f2948a;
            Object bknVar2 = r1.get(bcjVar);
            if (bknVar2 == null) {
                bknVar2 = new bkn(bcjVar);
                r1.put(bcjVar, bknVar2);
            }
            bknVar = (bkn) bknVar2;
        }
        return bknVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final List m2207a(String str) {
        List listM18673M;
        str.getClass();
        synchronized (this.f2949b) {
            ?? r1 = this.f2948a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : r1.entrySet()) {
                if (ooc.m18737c(((bcj) entry.getKey()).f2946a, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                this.f2948a.remove((bcj) it.next());
            }
            listM18673M = omn.m18673M(linkedHashMap.values());
        }
        return listM18673M;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final boolean m2208b(bcj bcjVar) {
        boolean zContainsKey;
        synchronized (this.f2949b) {
            zContainsKey = this.f2948a.containsKey(bcjVar);
        }
        return zContainsKey;
    }

    /* JADX INFO: renamed from: c */
    public final WindowLayoutComponent m2209c() {
        if (!m2194G(new C0910po(this, 11, null, null)) || !m2194G(new C0910po(this, 9, null, null)) || !m2194G(new C0910po(this, 10, null, null)) || !m2194G(new C0910po(this, 8, null, null))) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Class m2210d() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.f2948a).loadClass("androidx.window.extensions.WindowExtensions");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    /* JADX INFO: renamed from: e */
    public final Class m2211e() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.f2948a).loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m2212i(String str, long j, ols olsVar) throws Throwable {
        C0997su c0997su;
        if (olsVar instanceof C0997su) {
            c0997su = (C0997su) olsVar;
            int i = c0997su.f47609b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0997su.f47609b = i - Integer.MIN_VALUE;
            } else {
                c0997su = new C0997su(this, olsVar, null, null);
            }
        } else {
            c0997su = new C0997su(this, olsVar, null, null);
        }
        Object objM18753s = c0997su.f47608a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (c0997su.f47609b) {
            case 0:
                lkm.m15592s(objM18753s);
                C0998sv c0998sv = new C0998sv(this, str, null, null, null);
                c0997su.f47609b = 1;
                objM18753s = ooc.m18753s(j, c0998sv, c0997su);
                if (objM18753s == omaVar) {
                    return omaVar;
                }
                break;
            case 1:
                lkm.m15592s(objM18753s);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Boolean bool = (Boolean) objM18753s;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    /* JADX INFO: renamed from: j */
    public final void m2213j() {
        ((SparseIntArray) this.f2948a).clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m2214k() {
        ((SparseIntArray) this.f2949b).clear();
    }

    /* JADX INFO: renamed from: m */
    public final void m2215m(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2948a).getContext().obtainStyledAttributes(attributeSet, C0193fr.f23265i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ajg ajgVar = (ajg) ((bck) ((bkn) this.f2949b).f3651a).f2949b;
            if (ajgVar.f488a != z) {
                ajgVar.f488a = z;
                if (z) {
                    aix.m794a();
                    throw null;
                }
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public final InputConnection m2216p(InputConnection inputConnection) {
        Object obj = this.f2949b;
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof ajc ? inputConnection : new ajc((TextView) ((bck) ((bkn) obj).f3651a).f2948a, inputConnection);
    }

    /* JADX INFO: renamed from: q */
    public final void m2217q(ComponentCallbacksC0077bw componentCallbacksC0077bw, Bundle bundle, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2217q(componentCallbacksC0077bw, bundle, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2218r(ComponentCallbacksC0077bw componentCallbacksC0077bw, boolean z) {
        C0111cq c0111cq = (C0111cq) this.f2948a;
        Context context = c0111cq.f8789i.f5399c;
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = c0111cq.f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2218r(componentCallbacksC0077bw, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2219s(ComponentCallbacksC0077bw componentCallbacksC0077bw, Bundle bundle, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2219s(componentCallbacksC0077bw, bundle, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2220t(ComponentCallbacksC0077bw componentCallbacksC0077bw, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2220t(componentCallbacksC0077bw, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2221u(ComponentCallbacksC0077bw componentCallbacksC0077bw, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2221u(componentCallbacksC0077bw, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2222v(ComponentCallbacksC0077bw componentCallbacksC0077bw, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2222v(componentCallbacksC0077bw, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2223w(ComponentCallbacksC0077bw componentCallbacksC0077bw, boolean z) {
        C0111cq c0111cq = (C0111cq) this.f2948a;
        Context context = c0111cq.f8789i.f5399c;
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = c0111cq.f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2223w(componentCallbacksC0077bw, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2224x(ComponentCallbacksC0077bw componentCallbacksC0077bw, Bundle bundle, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2224x(componentCallbacksC0077bw, bundle, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2225y(ComponentCallbacksC0077bw componentCallbacksC0077bw, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2225y(componentCallbacksC0077bw, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2226z(ComponentCallbacksC0077bw componentCallbacksC0077bw, Bundle bundle, boolean z) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = ((C0111cq) this.f2948a).f8791k;
        if (componentCallbacksC0077bw2 != null) {
            componentCallbacksC0077bw2.getParentFragmentManager().f8802v.m2226z(componentCallbacksC0077bw, bundle, true);
        }
        for (npk npkVar : (CopyOnWriteArrayList) this.f2949b) {
            if (!z) {
                Object obj = npkVar.f44028b;
                throw null;
            }
            boolean z2 = npkVar.f44027a;
        }
    }

    public bck(EditText editText, byte[] bArr) {
        this.f2948a = editText;
        this.f2949b = new bkn(editText);
    }

    public bck(String str, String str2, byte[] bArr) {
        str2.getClass();
        this.f2949b = str;
        this.f2948a = str2;
    }

    public bck(String str, String str2) {
        str.getClass();
        this.f2948a = str;
        this.f2949b = str2;
    }

    public bck(char[] cArr) {
        this.f2949b = new SparseIntArray();
        this.f2948a = new SparseIntArray();
    }

    public bck(aks aksVar) {
        this.f2948a = aksVar;
        this.f2949b = new ArrayList();
    }

    public bck(oju ojuVar, drj drjVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ojuVar.getClass();
        drjVar.getClass();
        this.f2949b = ojuVar;
        this.f2948a = drjVar;
    }

    public bck(oju ojuVar, drj drjVar, byte[] bArr, byte[] bArr2) {
        ojuVar.getClass();
        drjVar.getClass();
        this.f2948a = ojuVar;
        this.f2949b = drjVar;
    }

    public bck(drj drjVar, C1097wm c1097wm, byte[] bArr, byte[] bArr2) {
        drjVar.getClass();
        this.f2949b = drjVar;
        this.f2948a = c1097wm;
    }

    public bck(EditText editText) {
        this((byte[]) null);
        this.f2948a = editText;
        ajg ajgVar = new ajg(editText);
        this.f2949b = ajgVar;
        editText.addTextChangedListener(ajgVar);
        editText.setEditableFactory(ajb.m801a());
    }
}
