package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C1117xf;
import p000.RunnableC0852nk;
import p000.aar;
import p000.aog;
import p000.aoo;
import p000.aos;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: a */
    public final C1117xf f1599a;

    /* JADX INFO: renamed from: b */
    public final List f1600b;

    /* JADX INFO: renamed from: c */
    public boolean f1601c;

    /* JADX INFO: renamed from: d */
    public int f1602d;

    /* JADX INFO: renamed from: e */
    private final Handler f1603e;

    /* JADX INFO: renamed from: f */
    private int f1604f;

    /* JADX INFO: renamed from: g */
    private boolean f1605g;

    /* JADX INFO: renamed from: h */
    private final Runnable f1606h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: A */
    public final void mo1483A(Bundle bundle) {
        super.mo1483A(bundle);
        int iM1532k = m1532k();
        for (int i = 0; i < iM1532k; i++) {
            m1534o(i).mo1483A(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: B */
    public final void mo1484B(boolean z) {
        super.mo1484B(z);
        int iM1532k = m1532k();
        for (int i = 0; i < iM1532k; i++) {
            m1534o(i).m1512ac(z);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: D */
    public final void mo1486D() {
        super.m1491I();
        this.f1605g = true;
        int iM1532k = m1532k();
        for (int i = 0; i < iM1532k; i++) {
            m1534o(i).mo1486D();
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: F */
    public final void mo1488F() {
        super.m1504V();
        this.f1605g = false;
        int iM1532k = m1532k();
        for (int i = 0; i < iM1532k; i++) {
            m1534o(i).mo1488F();
        }
    }

    /* JADX INFO: renamed from: ag */
    public final void m1527ag() {
        synchronized (this) {
            List list = this.f1600b;
            for (int size = list.size() - 1; size >= 0; size--) {
                m1530aj((Preference) list.get(0));
            }
        }
        m1485C();
    }

    /* JADX INFO: renamed from: ah */
    public final void m1528ah(int i) {
        if (i != Integer.MAX_VALUE && !m1507Y()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.f1602d = i;
    }

    /* JADX INFO: renamed from: ai */
    public boolean mo1529ai() {
        return true;
    }

    /* JADX INFO: renamed from: aj */
    public final boolean m1530aj(Preference preference) {
        boolean zRemove;
        synchronized (this) {
            preference.m1504V();
            if (preference.f1562D == this) {
                preference.m1525y(null);
            }
            zRemove = this.f1600b.remove(preference);
            if (zRemove) {
                String str = preference.f1590r;
                if (str != null) {
                    this.f1599a.put(str, Long.valueOf(preference.mo1509aR()));
                    this.f1603e.removeCallbacks(this.f1606h);
                    this.f1603e.post(this.f1606h);
                }
                if (this.f1605g) {
                    preference.mo1488F();
                }
            }
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: ak */
    public final void m1531ak(Preference preference) {
        long jM1775a;
        if (this.f1600b.contains(preference)) {
            return;
        }
        if (preference.f1590r != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.f1562D;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            String str = preference.f1590r;
            if (preferenceGroup.m1533l(str) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.f1588p == Integer.MAX_VALUE) {
            if (this.f1601c) {
                int i = this.f1604f;
                this.f1604f = i + 1;
                preference.m1498P(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).f1601c = this.f1601c;
            }
        }
        int iBinarySearch = Collections.binarySearch(this.f1600b, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        preference.m1512ac(mo1475j());
        synchronized (this) {
            this.f1600b.add(iBinarySearch, preference);
        }
        aoo aooVar = this.f1583k;
        String str2 = preference.f1590r;
        if (str2 == null || !this.f1599a.containsKey(str2)) {
            jM1775a = aooVar.m1775a();
        } else {
            jM1775a = ((Long) this.f1599a.get(str2)).longValue();
            this.f1599a.remove(str2);
        }
        preference.f1584l = jM1775a;
        preference.f1585m = true;
        try {
            preference.m1487E(aooVar);
            preference.f1585m = false;
            preference.m1525y(this);
            if (this.f1605g) {
                preference.mo1486D();
            }
            m1485C();
        } catch (Throwable th) {
            preference.f1585m = false;
            throw th;
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: e */
    protected final Parcelable mo1470e() {
        return new aog(super.mo1470e(), this.f1602d);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: g */
    protected final void mo1472g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aog.class)) {
            super.mo1472g(parcelable);
            return;
        }
        aog aogVar = (aog) parcelable;
        this.f1602d = aogVar.f1887a;
        super.mo1472g(aogVar.getSuperState());
    }

    /* JADX INFO: renamed from: k */
    public final int m1532k() {
        return this.f1600b.size();
    }

    /* JADX INFO: renamed from: l */
    public final Preference m1533l(CharSequence charSequence) {
        Preference preferenceM1533l;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f1590r, charSequence)) {
            return this;
        }
        int iM1532k = m1532k();
        for (int i = 0; i < iM1532k; i++) {
            Preference preferenceM1534o = m1534o(i);
            if (TextUtils.equals(preferenceM1534o.f1590r, charSequence)) {
                return preferenceM1534o;
            }
            if ((preferenceM1534o instanceof PreferenceGroup) && (preferenceM1533l = ((PreferenceGroup) preferenceM1534o).m1533l(charSequence)) != null) {
                return preferenceM1533l;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final Preference m1534o(int i) {
        return (Preference) this.f1600b.get(i);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: z */
    public final void mo1526z(Bundle bundle) {
        super.mo1526z(bundle);
        int iM1532k = m1532k();
        for (int i = 0; i < iM1532k; i++) {
            m1534o(i).mo1526z(bundle);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        super(context, attributeSet, i, 0);
        this.f1599a = new C1117xf();
        this.f1603e = new Handler(Looper.getMainLooper());
        this.f1601c = true;
        this.f1604f = 0;
        this.f1605g = false;
        this.f1602d = Integer.MAX_VALUE;
        this.f1606h = new RunnableC0852nk(this, 17);
        this.f1600b = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1929i, i, 0);
        this.f1601c = aar.m45i(typedArrayObtainStyledAttributes, 2, 2, true);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            m1528ah(aar.m48l(typedArrayObtainStyledAttributes, 1, 1));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
