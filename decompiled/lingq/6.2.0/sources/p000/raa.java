package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class raa extends daa {

    /* JADX INFO: renamed from: e0 */
    public ArrayList f58989e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f58990f0;

    /* JADX INFO: renamed from: g0 */
    public int f58991g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f58992h0;

    /* JADX INFO: renamed from: i0 */
    public int f58993i0;

    public raa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58989e0 = new ArrayList();
        this.f58990f0 = true;
        this.f58992h0 = false;
        this.f58993i0 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ywc.f70610h);
        m20498b0(nda.m17380d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: A */
    public final boolean mo10183A() {
        for (int i = 0; i < this.f58989e0.size(); i++) {
            if (((daa) this.f58989e0.get(i)).mo10183A()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: B */
    public final boolean mo3530B() {
        int size = this.f58989e0.size();
        for (int i = 0; i < size; i++) {
            if (!((daa) this.f58989e0.get(i)).mo3530B()) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: G */
    public final void mo10187G(View view) {
        super.mo10187G(view);
        int size = this.f58989e0.size();
        for (int i = 0; i < size; i++) {
            ((daa) this.f58989e0.get(i)).mo10187G(view);
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: H */
    public final void mo10188H() {
        this.f35326X = 0L;
        paa paaVar = new paa(this, 1);
        for (int i = 0; i < this.f58989e0.size(); i++) {
            daa daaVar = (daa) this.f58989e0.get(i);
            daaVar.m10202a(paaVar);
            daaVar.mo10188H();
            long j = daaVar.f35326X;
            boolean z = this.f58990f0;
            long j2 = this.f35326X;
            if (z) {
                this.f35326X = Math.max(j2, j);
            } else {
                daaVar.f35328Z = j2;
                this.f35326X = j2 + j;
            }
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: I */
    public final daa mo10189I(caa caaVar) {
        super.mo10189I(caaVar);
        return this;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: K */
    public final void mo10190K(View view) {
        for (int i = 0; i < this.f58989e0.size(); i++) {
            ((daa) this.f58989e0.get(i)).mo10190K(view);
        }
        this.f35334f.remove(view);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: L */
    public final void mo10191L(View view) {
        super.mo10191L(view);
        int size = this.f58989e0.size();
        for (int i = 0; i < size; i++) {
            ((daa) this.f58989e0.get(i)).mo10191L(view);
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: M */
    public final void mo10192M() {
        ArrayList arrayList;
        if (this.f58989e0.isEmpty()) {
            m10200U();
            m10213q();
            return;
        }
        qaa qaaVar = new qaa();
        qaaVar.f57505a = this;
        Iterator it = this.f58989e0.iterator();
        while (it.hasNext()) {
            ((daa) it.next()).m10202a(qaaVar);
        }
        this.f58991g0 = this.f58989e0.size();
        if (this.f58990f0) {
            Iterator it2 = this.f58989e0.iterator();
            while (it2.hasNext()) {
                ((daa) it2.next()).mo10192M();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.f58989e0.size();
            arrayList = this.f58989e0;
            int i2 = 0;
            if (i >= size) {
                break;
            }
            ((daa) arrayList.get(i - 1)).m10202a(new paa((daa) this.f58989e0.get(i), i2));
            i++;
        }
        daa daaVar = (daa) arrayList.get(0);
        if (daaVar != null) {
            daaVar.mo10192M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // p000.daa
    /* JADX INFO: renamed from: N */
    public final void mo10193N(long j, long j2) {
        long j3;
        long j4 = this.f35326X;
        long j5 = 0;
        if (this.f35311I != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.f35320R = false;
            m10186F(this, uk9.f64027b, z);
        }
        if (!this.f58990f0) {
            int size = 1;
            while (true) {
                int size2 = this.f58989e0.size();
                ArrayList arrayList = this.f58989e0;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (((daa) arrayList.get(size)).f35328Z > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.f58989e0.size()) {
                        daa daaVar = (daa) this.f58989e0.get(i);
                        long j6 = daaVar.f35328Z;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        daaVar.mo10193N(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    daa daaVar2 = (daa) this.f58989e0.get(i);
                    long j8 = daaVar2.f35328Z;
                    long j9 = j - j8;
                    daaVar2.mo10193N(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.f35311I != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.f35320R = true;
                }
                m10186F(this, uk9.f64028c, z);
            }
        }
        for (int i2 = 0; i2 < this.f58989e0.size(); i2++) {
            ((daa) this.f58989e0.get(i2)).mo10193N(j, j2);
        }
        j3 = j5;
        if (this.f35311I != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.f35320R = true;
            }
            m10186F(this, uk9.f64028c, z);
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: P */
    public final void mo10195P(j8d j8dVar) {
        this.f58993i0 |= 8;
        int size = this.f58989e0.size();
        for (int i = 0; i < size; i++) {
            ((daa) this.f58989e0.get(i)).mo10195P(j8dVar);
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: R */
    public final void mo10197R(k57 k57Var) {
        super.mo10197R(k57Var);
        this.f58993i0 |= 4;
        if (this.f58989e0 != null) {
            for (int i = 0; i < this.f58989e0.size(); i++) {
                ((daa) this.f58989e0.get(i)).mo10197R(k57Var);
            }
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: S */
    public final void mo10198S(qxc qxcVar) {
        this.f35324V = qxcVar;
        this.f58993i0 |= 2;
        int size = this.f58989e0.size();
        for (int i = 0; i < size; i++) {
            ((daa) this.f58989e0.get(i)).mo10198S(qxcVar);
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: T */
    public final void mo10199T(long j) {
        this.f35330b = j;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: V */
    public final String mo10201V(String str) {
        String strMo10201V = super.mo10201V(str);
        for (int i = 0; i < this.f58989e0.size(); i++) {
            StringBuilder sbM22999v = ux5.m22999v(strMo10201V, "\n");
            sbM22999v.append(((daa) this.f58989e0.get(i)).mo10201V(str.concat("  ")));
            strMo10201V = sbM22999v.toString();
        }
        return strMo10201V;
    }

    /* JADX INFO: renamed from: W */
    public final void m20494W(daa daaVar) {
        this.f58989e0.add(daaVar);
        daaVar.f35311I = this;
        long j = this.f35331c;
        if (j >= 0) {
            daaVar.mo10194O(j);
        }
        if ((this.f58993i0 & 1) != 0) {
            daaVar.mo10196Q(this.f35332d);
        }
        if ((this.f58993i0 & 2) != 0) {
            daaVar.mo10198S(this.f35324V);
        }
        if ((this.f58993i0 & 4) != 0) {
            daaVar.mo10197R(this.f35325W);
        }
        if ((this.f58993i0 & 8) != 0) {
            daaVar.mo10195P(null);
        }
    }

    /* JADX INFO: renamed from: X */
    public final daa m20495X(int i) {
        if (i < 0 || i >= this.f58989e0.size()) {
            return null;
        }
        return (daa) this.f58989e0.get(i);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void mo10194O(long j) {
        ArrayList arrayList;
        this.f35331c = j;
        if (j < 0 || (arrayList = this.f58989e0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((daa) this.f58989e0.get(i)).mo10194O(j);
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final void mo10196Q(TimeInterpolator timeInterpolator) {
        this.f58993i0 |= 1;
        ArrayList arrayList = this.f58989e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((daa) this.f58989e0.get(i)).mo10196Q(timeInterpolator);
            }
        }
        this.f35332d = timeInterpolator;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: b */
    public final void mo10203b(int i) {
        for (int i2 = 0; i2 < this.f58989e0.size(); i2++) {
            ((daa) this.f58989e0.get(i2)).mo10203b(i);
        }
        super.mo10203b(i);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m20498b0(int i) {
        if (i == 0) {
            this.f58990f0 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(ux5.m22988k(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f58990f0 = false;
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: c */
    public final void mo10204c(View view) {
        for (int i = 0; i < this.f58989e0.size(); i++) {
            ((daa) this.f58989e0.get(i)).mo10204c(view);
        }
        this.f35334f.add(view);
    }

    @Override // p000.daa
    public final void cancel() {
        super.cancel();
        int size = this.f58989e0.size();
        for (int i = 0; i < size; i++) {
            ((daa) this.f58989e0.get(i)).cancel();
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: d */
    public final void mo10205d(Class cls) {
        for (int i = 0; i < this.f58989e0.size(); i++) {
            ((daa) this.f58989e0.get(i)).mo10205d(cls);
        }
        super.mo10205d(cls);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: e */
    public final void mo10206e(String str) {
        for (int i = 0; i < this.f58989e0.size(); i++) {
            ((daa) this.f58989e0.get(i)).mo10206e(str);
        }
        super.mo10206e(str);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: g */
    public final void mo3042g(waa waaVar) {
        View view = waaVar.f66571b;
        if (m10185D(view)) {
            for (daa daaVar : this.f58989e0) {
                if (daaVar.m10185D(view)) {
                    daaVar.mo3042g(waaVar);
                    waaVar.f66572c.add(daaVar);
                }
            }
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: i */
    public final void mo10208i(waa waaVar) {
        super.mo10208i(waaVar);
        int size = this.f58989e0.size();
        for (int i = 0; i < size; i++) {
            ((daa) this.f58989e0.get(i)).mo10208i(waaVar);
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: j */
    public final void mo3043j(waa waaVar) {
        View view = waaVar.f66571b;
        if (m10185D(view)) {
            for (daa daaVar : this.f58989e0) {
                if (daaVar.m10185D(view)) {
                    daaVar.mo3043j(waaVar);
                    waaVar.f66572c.add(daaVar);
                }
            }
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: m */
    public final daa clone() {
        raa raaVar = (raa) super.clone();
        raaVar.f58989e0 = new ArrayList();
        int size = this.f58989e0.size();
        for (int i = 0; i < size; i++) {
            daa daaVarClone = ((daa) this.f58989e0.get(i)).clone();
            raaVar.f58989e0.add(daaVarClone);
            daaVarClone.f35311I = raaVar;
        }
        return raaVar;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: p */
    public final void mo10212p(ViewGroup viewGroup, ny8 ny8Var, ny8 ny8Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f35330b;
        int size = this.f58989e0.size();
        for (int i = 0; i < size; i++) {
            daa daaVar = (daa) this.f58989e0.get(i);
            if (j > 0 && (this.f58990f0 || i == 0)) {
                long j2 = daaVar.f35330b;
                if (j2 > 0) {
                    daaVar.mo10199T(j2 + j);
                } else {
                    daaVar.mo10199T(j);
                }
            }
            daaVar.mo10212p(viewGroup, ny8Var, ny8Var2, arrayList, arrayList2);
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: s */
    public final void mo10214s(int i) {
        for (int i2 = 0; i2 < this.f58989e0.size(); i2++) {
            ((daa) this.f58989e0.get(i2)).mo10214s(i);
        }
        super.mo10214s(i);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: t */
    public final void mo10215t(Class cls) {
        for (int i = 0; i < this.f58989e0.size(); i++) {
            ((daa) this.f58989e0.get(i)).mo10215t(cls);
        }
        super.mo10215t(cls);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: u */
    public final void mo10216u(String str) {
        for (int i = 0; i < this.f58989e0.size(); i++) {
            ((daa) this.f58989e0.get(i)).mo10216u(str);
        }
        super.mo10216u(str);
    }

    public raa() {
        this.f58989e0 = new ArrayList();
        this.f58990f0 = true;
        this.f58992h0 = false;
        this.f58993i0 = 0;
    }
}
