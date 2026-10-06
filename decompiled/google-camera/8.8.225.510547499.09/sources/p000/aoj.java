package p000;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aoj extends AbstractC0806ls implements ans {

    /* JADX INFO: renamed from: d */
    public List f1893d;

    /* JADX INFO: renamed from: e */
    private final PreferenceGroup f1894e;

    /* JADX INFO: renamed from: f */
    private List f1895f;

    /* JADX INFO: renamed from: g */
    private final List f1896g;

    /* JADX INFO: renamed from: i */
    private final Runnable f1898i = new RunnableC0852nk(this, 18);

    /* JADX INFO: renamed from: h */
    private final Handler f1897h = new Handler(Looper.getMainLooper());

    public aoj(PreferenceGroup preferenceGroup) {
        this.f1894e = preferenceGroup;
        preferenceGroup.f1561C = this;
        this.f1895f = new ArrayList();
        this.f1893d = new ArrayList();
        this.f1896g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            m15925g(((PreferenceScreen) preferenceGroup).f1607e);
        } else {
            m15925g(true);
        }
        m1768k();
    }

    /* JADX INFO: renamed from: l */
    private final List m1759l(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iM1532k = preferenceGroup.m1532k();
        int i = 0;
        for (int i2 = 0; i2 < iM1532k; i2++) {
            Preference preferenceM1534o = preferenceGroup.m1534o(i2);
            if (preferenceM1534o.f1595w) {
                if (!m1761n(preferenceGroup) || i < preferenceGroup.f1602d) {
                    arrayList.add(preferenceM1534o);
                } else {
                    arrayList2.add(preferenceM1534o);
                }
                if (preferenceM1534o instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM1534o;
                    if (!preferenceGroup2.mo1529ai()) {
                        continue;
                    } else {
                        if (m1761n(preferenceGroup) && m1761n(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : m1759l(preferenceGroup2)) {
                            if (!m1761n(preferenceGroup) || i < preferenceGroup.f1602d) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (m1761n(preferenceGroup) && i > preferenceGroup.f1602d) {
            ank ankVar = new ank(preferenceGroup.f1582j, arrayList2, preferenceGroup.mo1509aR());
            ankVar.f1587o = new aoh(this, preferenceGroup);
            arrayList.add(ankVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    private final void m1760m(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f1600b);
        }
        int iM1532k = preferenceGroup.m1532k();
        for (int i = 0; i < iM1532k; i++) {
            Preference preferenceM1534o = preferenceGroup.m1534o(i);
            list.add(preferenceM1534o);
            aoi aoiVar = new aoi(preferenceM1534o);
            if (!this.f1896g.contains(aoiVar)) {
                this.f1896g.add(aoiVar);
            }
            if (preferenceM1534o instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM1534o;
                if (preferenceGroup2.mo1529ai()) {
                    m1760m(list, preferenceGroup2);
                }
            }
            preferenceM1534o.f1561C = this;
        }
    }

    /* JADX INFO: renamed from: n */
    private static final boolean m1761n(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f1602d != Integer.MAX_VALUE;
    }

    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: a */
    public final int mo1762a() {
        return this.f1893d.size();
    }

    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: b */
    public final int mo1763b(int i) {
        aoi aoiVar = new aoi(m1767j(i));
        int iIndexOf = this.f1896g.indexOf(aoiVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.f1896g.size();
        this.f1896g.add(aoiVar);
        return size;
    }

    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: c */
    public final long mo1764c(int i) {
        if (this.f39115b) {
            return m1767j(i).mo1509aR();
        }
        return -1L;
    }

    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C0829mo mo1765d(ViewGroup viewGroup, int i) {
        aoi aoiVar = (aoi) this.f1896g.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, aos.f1921a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C0194fs.m8752a(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(aoiVar.f1890a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            afb.m432m(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = aoiVar.f1891b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new aor(viewInflate);
    }

    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ void mo1766e(C0829mo c0829mo, int i) {
        aor aorVar = (aor) c0829mo;
        Preference preferenceM1767j = m1767j(i);
        Drawable background = aorVar.f41155a.getBackground();
        Drawable drawable = aorVar.f1916s;
        if (background != drawable) {
            afb.m432m(aorVar.f41155a, drawable);
        }
        TextView textView = (TextView) aorVar.m1781B(R.id.title);
        if (textView != null && aorVar.f1917t != null && !textView.getTextColors().equals(aorVar.f1917t)) {
            textView.setTextColor(aorVar.f1917t);
        }
        preferenceM1767j.mo1466a(aorVar);
    }

    @Override // p000.ans
    /* JADX INFO: renamed from: f */
    public final void mo1733f() {
        this.f1897h.removeCallbacks(this.f1898i);
        this.f1897h.post(this.f1898i);
    }

    /* JADX INFO: renamed from: j */
    public final Preference m1767j(int i) {
        if (i < 0 || i >= mo1762a()) {
            return null;
        }
        return (Preference) this.f1893d.get(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m1768k() {
        Iterator it = this.f1895f.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).f1561C = null;
        }
        ArrayList arrayList = new ArrayList(this.f1895f.size());
        this.f1895f = arrayList;
        m1760m(arrayList, this.f1894e);
        this.f1893d = m1759l(this.f1894e);
        aoo aooVar = this.f1894e.f1583k;
        this.f39114a.m15952a();
        for (Preference preference : this.f1895f) {
        }
    }
}
