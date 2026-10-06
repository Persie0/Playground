package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import java.util.Arrays;

/* JADX INFO: renamed from: xg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1118xg implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f48005a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int[] f48006b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f48007c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f48008d;

    public C1118xg() {
        int iM19571d = C1120xi.m19571d(10);
        this.f48006b = new int[iM19571d];
        this.f48007c = new Object[iM19571d];
    }

    /* JADX INFO: renamed from: a */
    public final int m19562a(int i) {
        if (this.f48005a) {
            C1119xh.m19567b(this);
        }
        return this.f48006b[i];
    }

    /* JADX INFO: renamed from: b */
    public final int m19563b() {
        if (this.f48005a) {
            C1119xh.m19567b(this);
        }
        return this.f48008d;
    }

    /* JADX INFO: renamed from: c */
    public final Object m19564c(int i) {
        if (this.f48005a) {
            C1119xh.m19567b(this);
        }
        return this.f48007c[i];
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        C1118xg c1118xg = (C1118xg) objClone;
        c1118xg.f48006b = (int[]) this.f48006b.clone();
        c1118xg.f48007c = (Object[]) this.f48007c.clone();
        return c1118xg;
    }

    /* JADX INFO: renamed from: d */
    public final void m19565d(int i, Object obj) {
        int iM19568a = C1120xi.m19568a(this.f48006b, this.f48008d, i);
        if (iM19568a >= 0) {
            this.f48007c[iM19568a] = obj;
            return;
        }
        int iM19568a2 = iM19568a ^ (-1);
        int i2 = this.f48008d;
        if (iM19568a2 < i2) {
            Object[] objArr = this.f48007c;
            if (objArr[iM19568a2] == C1119xh.f48009a) {
                this.f48006b[iM19568a2] = i;
                objArr[iM19568a2] = obj;
                return;
            }
        }
        if (this.f48005a && i2 >= this.f48006b.length) {
            C1119xh.m19567b(this);
            iM19568a2 = C1120xi.m19568a(this.f48006b, this.f48008d, i) ^ (-1);
        }
        int i3 = this.f48008d;
        int[] iArr = this.f48006b;
        if (i3 >= iArr.length) {
            int iM19571d = C1120xi.m19571d(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iM19571d);
            iArrCopyOf.getClass();
            this.f48006b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f48007c, iM19571d);
            objArrCopyOf.getClass();
            this.f48007c = objArrCopyOf;
        }
        int i4 = this.f48008d;
        if (i4 - iM19568a2 != 0) {
            int[] iArr2 = this.f48006b;
            int i5 = iM19568a2 + 1;
            omn.m18692af(iArr2, iArr2, i5, iM19568a2, i4);
            Object[] objArr2 = this.f48007c;
            omn.m18693ag(objArr2, objArr2, i5, iM19568a2, this.f48008d);
        }
        this.f48006b[iM19568a2] = i;
        this.f48007c[iM19568a2] = obj;
        this.f48008d++;
    }

    public final String toString() {
        if (m19563b() <= 0) {
            return TVkaNXnfP.pcOtx;
        }
        StringBuilder sb = new StringBuilder(this.f48008d * 28);
        sb.append('{');
        int i = this.f48008d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m19562a(i2));
            sb.append('=');
            Object objM19564c = m19564c(i2);
            if (objM19564c != this) {
                sb.append(objM19564c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
