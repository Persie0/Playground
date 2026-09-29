package p083e2;

import android.support.v4.media.session.C0166e;
import androidx.constraintlayout.core.C0726c;
import androidx.constraintlayout.core.widgets.C0736b;
import androidx.constraintlayout.core.widgets.C0738d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p003a2.C0009a;

/* JADX INFO: renamed from: e2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5362j {

    /* JADX INFO: renamed from: f */
    public static int f33684f;

    /* JADX INFO: renamed from: b */
    public final int f33686b;

    /* JADX INFO: renamed from: c */
    public int f33687c;

    /* JADX INFO: renamed from: a */
    public final ArrayList<ConstraintWidget> f33685a = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public ArrayList<a> f33688d = null;

    /* JADX INFO: renamed from: e */
    public int f33689e = -1;

    /* JADX INFO: renamed from: e2.j$a */
    public class a {
        public a(ConstraintWidget constraintWidget, C0726c c0726c) {
            new WeakReference(constraintWidget);
            ConstraintAnchor constraintAnchor = constraintWidget.f4846K;
            c0726c.getClass();
            C0726c.m2664n(constraintAnchor);
            C0726c.m2664n(constraintWidget.f4847L);
            C0726c.m2664n(constraintWidget.f4848M);
            C0726c.m2664n(constraintWidget.f4849N);
            C0726c.m2664n(constraintWidget.f4850O);
        }
    }

    public C5362j(int i10) {
        this.f33686b = -1;
        int i11 = f33684f;
        f33684f = i11 + 1;
        this.f33686b = i11;
        this.f33687c = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m11501a(ArrayList<C5362j> arrayList) {
        int size = this.f33685a.size();
        if (this.f33689e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                C5362j c5362j = arrayList.get(i10);
                if (this.f33689e == c5362j.f33686b) {
                    m11503c(this.f33687c, c5362j);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m11502b(C0726c c0726c, int i10) {
        int iM2664n;
        int iM2664n2;
        ArrayList<ConstraintWidget> arrayList = this.f33685a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0738d c0738d = (C0738d) arrayList.get(0).f4858W;
        c0726c.m2683t();
        c0738d.mo2721e(c0726c, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).mo2721e(c0726c, false);
        }
        if (i10 == 0 && c0738d.f4967F0 > 0) {
            C0736b.m2762a(c0738d, c0726c, arrayList, 0);
        }
        if (i10 == 1 && c0738d.f4968G0 > 0) {
            C0736b.m2762a(c0738d, c0726c, arrayList, 1);
        }
        try {
            c0726c.m2679p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f33688d = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f33688d.add(new a(arrayList.get(i12), c0726c));
        }
        if (i10 == 0) {
            iM2664n = C0726c.m2664n(c0738d.f4846K);
            iM2664n2 = C0726c.m2664n(c0738d.f4848M);
            c0726c.m2683t();
        } else {
            iM2664n = C0726c.m2664n(c0738d.f4847L);
            iM2664n2 = C0726c.m2664n(c0738d.f4849N);
            c0726c.m2683t();
        }
        return iM2664n2 - iM2664n;
    }

    /* JADX INFO: renamed from: c */
    public final void m11503c(int i10, C5362j c5362j) {
        Iterator<ConstraintWidget> it = this.f33685a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i11 = c5362j.f33686b;
            if (!zHasNext) {
                this.f33689e = i11;
                return;
            }
            ConstraintWidget next = it.next();
            ArrayList<ConstraintWidget> arrayList = c5362j.f33685a;
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
            if (i10 == 0) {
                next.f4903u0 = i11;
            } else {
                next.f4905v0 = i11;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f33687c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else {
            str = i10 == 2 ? "Both" : "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String strM768o = C0166e.m768o(sb2, this.f33686b, "] <");
        for (ConstraintWidget constraintWidget : this.f33685a) {
            StringBuilder sbM26o = C0009a.m26o(strM768o, " ");
            sbM26o.append(constraintWidget.f4885l0);
            strM768o = sbM26o.toString();
        }
        return C0166e.m765k(strM768o, " >");
    }
}
