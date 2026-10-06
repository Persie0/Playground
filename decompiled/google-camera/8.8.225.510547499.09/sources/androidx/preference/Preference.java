package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p000.AbstractC0806ls;
import p000.C0194fs;
import p000.ViewOnClickListenerC0250hu;
import p000.aar;
import p000.afb;
import p000.anr;
import p000.ans;
import p000.ant;
import p000.anu;
import p000.anv;
import p000.anw;
import p000.aoj;
import p000.aon;
import p000.aoo;
import p000.aor;
import p000.aos;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable {

    /* JADX INFO: renamed from: A */
    public int f1559A;

    /* JADX INFO: renamed from: B */
    public int f1560B;

    /* JADX INFO: renamed from: C */
    public ans f1561C;

    /* JADX INFO: renamed from: D */
    public PreferenceGroup f1562D;

    /* JADX INFO: renamed from: E */
    public anw f1563E;

    /* JADX INFO: renamed from: F */
    private boolean f1564F;

    /* JADX INFO: renamed from: G */
    private boolean f1565G;

    /* JADX INFO: renamed from: H */
    private boolean f1566H;

    /* JADX INFO: renamed from: I */
    private boolean f1567I;

    /* JADX INFO: renamed from: J */
    private boolean f1568J;

    /* JADX INFO: renamed from: K */
    private List f1569K;

    /* JADX INFO: renamed from: L */
    private boolean f1570L;

    /* JADX INFO: renamed from: M */
    private anv f1571M;

    /* JADX INFO: renamed from: N */
    private final View.OnClickListener f1572N;

    /* JADX INFO: renamed from: a */
    private CharSequence f1573a;

    /* JADX INFO: renamed from: b */
    private int f1574b;

    /* JADX INFO: renamed from: c */
    private Drawable f1575c;

    /* JADX INFO: renamed from: d */
    private Bundle f1576d;

    /* JADX INFO: renamed from: e */
    private boolean f1577e;

    /* JADX INFO: renamed from: f */
    private boolean f1578f;

    /* JADX INFO: renamed from: g */
    private boolean f1579g;

    /* JADX INFO: renamed from: h */
    private String f1580h;

    /* JADX INFO: renamed from: i */
    private boolean f1581i;

    /* JADX INFO: renamed from: j */
    public final Context f1582j;

    /* JADX INFO: renamed from: k */
    public aoo f1583k;

    /* JADX INFO: renamed from: l */
    public long f1584l;

    /* JADX INFO: renamed from: m */
    public boolean f1585m;

    /* JADX INFO: renamed from: n */
    public ant f1586n;

    /* JADX INFO: renamed from: o */
    public anu f1587o;

    /* JADX INFO: renamed from: p */
    public int f1588p;

    /* JADX INFO: renamed from: q */
    public CharSequence f1589q;

    /* JADX INFO: renamed from: r */
    public String f1590r;

    /* JADX INFO: renamed from: s */
    public Intent f1591s;

    /* JADX INFO: renamed from: t */
    public String f1592t;

    /* JADX INFO: renamed from: u */
    public boolean f1593u;

    /* JADX INFO: renamed from: v */
    public Object f1594v;

    /* JADX INFO: renamed from: w */
    public boolean f1595w;

    /* JADX INFO: renamed from: x */
    public boolean f1596x;

    /* JADX INFO: renamed from: y */
    public boolean f1597y;

    /* JADX INFO: renamed from: z */
    public boolean f1598z;

    public Preference(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private final void m1482k(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m1482k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void mo1483A(Bundle bundle) {
        if (m1507Y()) {
            this.f1570L = false;
            Parcelable parcelableMo1470e = mo1470e();
            if (!this.f1570L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableMo1470e != null) {
                bundle.putParcelable(this.f1590r, parcelableMo1470e);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo1484B(boolean z) {
        List list = this.f1569K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).m1511ab(z);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1485C() {
        ans ansVar = this.f1561C;
        if (ansVar != null) {
            ansVar.mo1733f();
        }
    }

    /* JADX INFO: renamed from: D */
    public void mo1486D() {
        m1491I();
    }

    /* JADX INFO: renamed from: E */
    public final void m1487E(aoo aooVar) {
        this.f1583k = aooVar;
        if (!this.f1585m) {
            this.f1584l = aooVar.m1775a();
        }
        if (m1510aa() && m1518r().contains(this.f1590r)) {
            mo1489G(true, null);
            return;
        }
        Object obj = this.f1594v;
        if (obj != null) {
            mo1489G(false, obj);
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo1488F() {
        m1504V();
    }

    @Deprecated
    /* JADX INFO: renamed from: G */
    protected void mo1489G(boolean z, Object obj) {
        mo1473h(obj);
    }

    /* JADX INFO: renamed from: H */
    public final void m1490H() {
        Intent intent;
        aon aonVar;
        if (mo1508Z() && this.f1578f) {
            mo1468c();
            anu anuVar = this.f1587o;
            if (anuVar == null || !anuVar.mo1735a()) {
                aoo aooVar = this.f1583k;
                if ((aooVar == null || (aonVar = aooVar.f1904c) == null || !aonVar.mo1754A(this)) && (intent = this.f1591s) != null) {
                    this.f1582j.startActivity(intent);
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1491I() {
        if (TextUtils.isEmpty(this.f1580h)) {
            return;
        }
        Preference preferenceM1522v = m1522v(this.f1580h);
        if (preferenceM1522v != null) {
            if (preferenceM1522v.f1569K == null) {
                preferenceM1522v.f1569K = new ArrayList();
            }
            preferenceM1522v.f1569K.add(this);
            m1511ab(preferenceM1522v.mo1475j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f1580h + "\" not found for preference \"" + this.f1590r + "\" (title: \"" + ((Object) this.f1589q) + "\"");
    }

    /* JADX INFO: renamed from: J */
    public final void m1492J(String str) {
        m1504V();
        this.f1580h = str;
        m1491I();
    }

    /* JADX INFO: renamed from: K */
    public final void m1493K(boolean z) {
        if (this.f1577e != z) {
            this.f1577e = z;
            mo1484B(mo1475j());
            mo1469d();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m1494L(int i) {
        m1495M(C0194fs.m8752a(this.f1582j, i));
        this.f1574b = i;
    }

    /* JADX INFO: renamed from: M */
    public final void m1495M(Drawable drawable) {
        if (this.f1575c != drawable) {
            this.f1575c = drawable;
            this.f1574b = 0;
            mo1469d();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m1496N(String str) {
        this.f1590r = str;
        if (!this.f1579g || m1507Y()) {
            return;
        }
        if (TextUtils.isEmpty(this.f1590r)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f1579g = true;
    }

    /* JADX INFO: renamed from: O */
    public void mo1497O(ant antVar) {
        this.f1586n = antVar;
    }

    /* JADX INFO: renamed from: P */
    public final void m1498P(int i) {
        if (i != this.f1588p) {
            this.f1588p = i;
            m1485C();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m1499Q(int i) {
        mo1479n(this.f1582j.getString(i));
    }

    /* JADX INFO: renamed from: R */
    public final void m1500R(anw anwVar) {
        this.f1563E = anwVar;
        mo1469d();
    }

    /* JADX INFO: renamed from: S */
    public final void m1501S(int i) {
        mo1502T(this.f1582j.getString(i));
    }

    /* JADX INFO: renamed from: T */
    public void mo1502T(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1589q)) {
            return;
        }
        this.f1589q = charSequence;
        mo1469d();
    }

    /* JADX INFO: renamed from: U */
    public final void m1503U(SharedPreferences.Editor editor) {
        if (this.f1583k.f1902a) {
            return;
        }
        editor.apply();
    }

    /* JADX INFO: renamed from: V */
    public final void m1504V() {
        Preference preferenceM1522v;
        List list;
        String str = this.f1580h;
        if (str == null || (preferenceM1522v = m1522v(str)) == null || (list = preferenceM1522v.f1569K) == null) {
            return;
        }
        list.remove(this);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m1505W(Object obj) {
        ant antVar = this.f1586n;
        return antVar == null || antVar.mo1734b(this, obj);
    }

    /* JADX INFO: renamed from: X */
    protected boolean mo1506X(boolean z) {
        return !m1510aa() ? z : this.f1583k.m1777d().getBoolean(this.f1590r, z);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m1507Y() {
        return !TextUtils.isEmpty(this.f1590r);
    }

    /* JADX INFO: renamed from: Z */
    public boolean mo1508Z() {
        return this.f1577e && this.f1581i && this.f1564F;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX INFO: renamed from: a */
    public void mo1466a(aor aorVar) {
        Integer numValueOf;
        Drawable drawable;
        View view = aorVar.f41155a;
        view.setOnClickListener(this.f1572N);
        view.setId(0);
        TextView textView = (TextView) aorVar.m1781B(R.id.summary);
        if (textView != null) {
            CharSequence charSequenceMo1478m = mo1478m();
            if (TextUtils.isEmpty(charSequenceMo1478m)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceMo1478m);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) aorVar.m1781B(R.id.title);
        if (textView2 != null) {
            CharSequence charSequence = this.f1589q;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f1567I) {
                    textView2.setSingleLine(this.f1596x);
                }
                if (!this.f1578f && mo1508Z() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) aorVar.m1781B(R.id.icon);
        if (imageView != null) {
            int i = this.f1574b;
            if (i != 0) {
                if (this.f1575c == null) {
                    this.f1575c = C0194fs.m8752a(this.f1582j, i);
                }
                drawable = this.f1575c;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            } else if (this.f1575c != null) {
                i = 0;
                if (this.f1575c == null) {
                    this.f1575c = C0194fs.m8752a(this.f1582j, i);
                }
                drawable = this.f1575c;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f1575c != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(true != this.f1597y ? 8 : 4);
            }
        }
        View viewM1781B = aorVar.m1781B(C0100R.id.icon_frame);
        if (viewM1781B == null) {
            viewM1781B = aorVar.m1781B(R.id.icon_frame);
        }
        if (viewM1781B != null) {
            if (this.f1575c != null) {
                viewM1781B.setVisibility(0);
            } else {
                viewM1781B.setVisibility(true == this.f1597y ? 4 : 8);
            }
        }
        if (this.f1568J) {
            m1482k(view, mo1508Z());
        } else {
            m1482k(view, true);
        }
        boolean z = this.f1578f;
        view.setFocusable(z);
        view.setClickable(z);
        aorVar.f1918u = this.f1565G;
        aorVar.f1919v = this.f1566H;
        boolean z2 = this.f1598z;
        if (z2 && this.f1571M == null) {
            this.f1571M = new anv(this);
        }
        view.setOnCreateContextMenuListener(z2 ? this.f1571M : null);
        view.setLongClickable(z2);
        if (!z2 || z) {
            return;
        }
        afb.m432m(view, null);
    }

    /* JADX INFO: renamed from: aR */
    public long mo1509aR() {
        return this.f1584l;
    }

    /* JADX INFO: renamed from: aa */
    protected final boolean m1510aa() {
        return this.f1583k != null && this.f1593u && m1507Y();
    }

    /* JADX INFO: renamed from: ab */
    public final void m1511ab(boolean z) {
        if (this.f1581i == z) {
            this.f1581i = !z;
            mo1484B(mo1475j());
            mo1469d();
        }
    }

    /* JADX INFO: renamed from: ac */
    public final void m1512ac(boolean z) {
        if (this.f1564F == z) {
            this.f1564F = !z;
            mo1484B(mo1475j());
            mo1469d();
        }
    }

    /* JADX INFO: renamed from: ad */
    protected final void m1513ad(String str) {
        if (m1510aa() && !TextUtils.equals(str, m1523w(null))) {
            SharedPreferences.Editor editorM1776b = this.f1583k.m1776b();
            editorM1776b.putString(this.f1590r, str);
            m1503U(editorM1776b);
        }
    }

    /* JADX INFO: renamed from: ae */
    public final void m1514ae() {
        this.f1593u = false;
    }

    /* JADX INFO: renamed from: af */
    public final void m1515af() {
        if (this.f1578f) {
            this.f1578f = false;
            mo1469d();
        }
    }

    /* JADX INFO: renamed from: c */
    protected void mo1468c() {
    }

    /* JADX INFO: renamed from: ce */
    public void mo1467ce(View view) {
        m1490H();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.f1588p;
        int i2 = preference.f1588p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f1589q;
        CharSequence charSequence2 = preference.f1589q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f1589q.toString());
    }

    /* JADX INFO: renamed from: d */
    protected void mo1469d() {
        int iIndexOf;
        Object obj = this.f1561C;
        if (obj == null || (iIndexOf = ((aoj) obj).f1893d.indexOf(this)) == -1) {
            return;
        }
        ((AbstractC0806ls) obj).f39114a.m15954c(iIndexOf, this);
    }

    /* JADX INFO: renamed from: e */
    protected Parcelable mo1470e() {
        this.f1570L = true;
        return anr.EMPTY_STATE;
    }

    /* JADX INFO: renamed from: f */
    protected Object mo1471f(TypedArray typedArray, int i) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    protected void mo1472g(Parcelable parcelable) {
        this.f1570L = true;
        if (parcelable != anr.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* JADX INFO: renamed from: h */
    protected void mo1473h(Object obj) {
    }

    /* JADX INFO: renamed from: j */
    public boolean mo1475j() {
        return !mo1508Z();
    }

    /* JADX INFO: renamed from: m */
    public CharSequence mo1478m() {
        anw anwVar = this.f1563E;
        return anwVar != null ? anwVar.mo1729a(this) : this.f1573a;
    }

    /* JADX INFO: renamed from: n */
    public void mo1479n(CharSequence charSequence) {
        if (this.f1563E != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f1573a, charSequence)) {
            return;
        }
        this.f1573a = charSequence;
        mo1469d();
    }

    /* JADX INFO: renamed from: p */
    protected final float m1516p(float f) {
        return !m1510aa() ? f : this.f1583k.m1777d().getFloat(this.f1590r, f);
    }

    /* JADX INFO: renamed from: q */
    protected final int m1517q(int i) {
        return !m1510aa() ? i : this.f1583k.m1777d().getInt(this.f1590r, i);
    }

    /* JADX INFO: renamed from: r */
    public final SharedPreferences m1518r() {
        aoo aooVar = this.f1583k;
        if (aooVar != null) {
            return aooVar.m1777d();
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final Drawable m1519s() {
        int i;
        if (this.f1575c == null && (i = this.f1574b) != 0) {
            this.f1575c = C0194fs.m8752a(this.f1582j, i);
        }
        return this.f1575c;
    }

    /* JADX INFO: renamed from: t */
    public final Bundle m1520t() {
        if (this.f1576d == null) {
            this.f1576d = new Bundle();
        }
        return this.f1576d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f1589q;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceMo1478m = mo1478m();
        if (!TextUtils.isEmpty(charSequenceMo1478m)) {
            sb.append(charSequenceMo1478m);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public ant mo1521u() {
        return this.f1586n;
    }

    /* JADX INFO: renamed from: v */
    protected final Preference m1522v(String str) {
        aoo aooVar = this.f1583k;
        if (aooVar == null) {
            return null;
        }
        return aooVar.m1778e(str);
    }

    /* JADX INFO: renamed from: w */
    protected final String m1523w(String str) {
        return !m1510aa() ? str : this.f1583k.m1777d().getString(this.f1590r, str);
    }

    /* JADX INFO: renamed from: x */
    public final Set m1524x(Set set) {
        return !m1510aa() ? set : this.f1583k.m1777d().getStringSet(this.f1590r, set);
    }

    /* JADX INFO: renamed from: y */
    final void m1525y(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.f1562D != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f1562D = preferenceGroup;
    }

    /* JADX INFO: renamed from: z */
    public void mo1526z(Bundle bundle) {
        Parcelable parcelable;
        if (!m1507Y() || (parcelable = bundle.getParcelable(this.f1590r)) == null) {
            return;
        }
        this.f1570L = false;
        mo1472g(parcelable);
        if (!this.f1570L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aar.m39c(context, C0100R.attr.preferenceStyle, R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1588p = Integer.MAX_VALUE;
        this.f1577e = true;
        this.f1578f = true;
        this.f1593u = true;
        this.f1581i = true;
        this.f1564F = true;
        this.f1595w = true;
        this.f1565G = true;
        this.f1566H = true;
        this.f1596x = true;
        this.f1568J = true;
        this.f1559A = C0100R.layout.preference;
        this.f1572N = new ViewOnClickListenerC0250hu(this, 3);
        this.f1582j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1927g, i, i2);
        this.f1574b = aar.m41e(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.f1590r = aar.m44h(typedArrayObtainStyledAttributes, 26, 6);
        this.f1589q = aar.m43g(typedArrayObtainStyledAttributes, 34, 4);
        this.f1573a = aar.m43g(typedArrayObtainStyledAttributes, 33, 7);
        this.f1588p = aar.m48l(typedArrayObtainStyledAttributes, 28, 8);
        this.f1592t = aar.m44h(typedArrayObtainStyledAttributes, 22, 13);
        this.f1559A = aar.m41e(typedArrayObtainStyledAttributes, 27, 3, C0100R.layout.preference);
        this.f1560B = aar.m41e(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.f1577e = aar.m45i(typedArrayObtainStyledAttributes, 21, 2, true);
        this.f1578f = aar.m45i(typedArrayObtainStyledAttributes, 30, 5, true);
        this.f1593u = aar.m45i(typedArrayObtainStyledAttributes, 29, 1, true);
        this.f1580h = aar.m44h(typedArrayObtainStyledAttributes, 19, 10);
        this.f1565G = aar.m45i(typedArrayObtainStyledAttributes, 16, 16, this.f1578f);
        this.f1566H = aar.m45i(typedArrayObtainStyledAttributes, 17, 17, this.f1578f);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f1594v = mo1471f(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f1594v = mo1471f(typedArrayObtainStyledAttributes, 11);
        }
        this.f1568J = aar.m45i(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f1567I = zHasValue;
        if (zHasValue) {
            this.f1596x = aar.m45i(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.f1597y = aar.m45i(typedArrayObtainStyledAttributes, 24, 15, false);
        this.f1595w = aar.m45i(typedArrayObtainStyledAttributes, 25, 25, true);
        this.f1598z = aar.m45i(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
