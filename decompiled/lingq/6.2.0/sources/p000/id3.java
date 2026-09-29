package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class id3 extends uc1 {

    /* JADX INFO: renamed from: S */
    public boolean f43961S;

    /* JADX INFO: renamed from: T */
    public boolean f43962T;

    /* JADX INFO: renamed from: Q */
    public final m58 f43959Q = new m58(new hd3(this), 23);

    /* JADX INFO: renamed from: R */
    public final wb5 f43960R = new wb5(this, true);

    /* JADX INFO: renamed from: U */
    public boolean f43963U = true;

    public id3() {
        ((fs6) this.f63700d.f39591c).m12094I("android:support:lifecycle", new mc1(this, 2));
        this.f63706j.add(new gd3(this, 0));
        this.f63708l.add(new gd3(this, 1));
        m22669g(new nc1(this, 1));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m13791k(AbstractC0638f abstractC0638f, Lifecycle$State lifecycle$State) {
        boolean zM13791k = false;
        for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c : abstractC0638f.f5742c.m17706z()) {
            if (abstractComponentCallbacksC0635c != null) {
                hd3 hd3Var = abstractComponentCallbacksC0635c.f5675Q;
                if ((hd3Var == null ? null : hd3Var.f42213O) != null) {
                    zM13791k |= m13791k(abstractComponentCallbacksC0635c.m2106h(), lifecycle$State);
                }
                lg3 lg3Var = abstractComponentCallbacksC0635c.f5710n0;
                if (lg3Var != null) {
                    lg3Var.m16179b();
                    if (lg3Var.f49626e.f66586d.isAtLeast(Lifecycle$State.STARTED)) {
                        abstractComponentCallbacksC0635c.f5710n0.f49626e.m23835I(lifecycle$State);
                        zM13791k = true;
                    }
                }
                if (abstractComponentCallbacksC0635c.f5709m0.f66586d.isAtLeast(Lifecycle$State.STARTED)) {
                    abstractComponentCallbacksC0635c.f5709m0.m23835I(lifecycle$State);
                    zM13791k = true;
                }
            }
        }
        return zM13791k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture")) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f43961S);
        printWriter.print(" mResumed=");
        printWriter.print(this.f43962T);
        printWriter.print(" mStopped=");
        printWriter.print(this.f43963U);
        if (getApplication() != null) {
            cua cuaVarMo2116r = mo2116r();
            cuaVarMo2116r.getClass();
            or1 or1Var = or1.f54780b;
            or1Var.getClass();
            ny8 ny8Var = new ny8(cuaVarMo2116r, kh5.f47296d, or1Var);
            z21 z21VarM24933a = y38.m24933a(kh5.class);
            String strM25413b = z21VarM24933a.m25413b();
            if (strM25413b == null) {
                C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
                return;
            }
            pe9 pe9Var = ((kh5) ny8Var.m17675B(z21VarM24933a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM25413b))).f47297b;
            if (pe9Var.m19081e() > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                String strConcat = str3.concat("    ");
                for (int i = 0; i < pe9Var.m19081e(); i++) {
                    ih5 ih5Var = (ih5) pe9Var.m19082f(i);
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(pe9Var.m19079c(i));
                    printWriter.print(": ");
                    printWriter.println(ih5Var.toString());
                    ih5Var.m13912k(strConcat, printWriter);
                }
            }
        }
        ((hd3) this.f43959Q.f50618b).f42212N.m2187v(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: j */
    public final le3 m13792j() {
        return ((hd3) this.f43959Q.f50618b).f42212N;
    }

    @Override // p000.uc1, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f43959Q.m16646k();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p000.uc1, p000.tc1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f43960R.m23833G(Lifecycle$Event.ON_CREATE);
        le3 le3Var = ((hd3) this.f43959Q.f50618b).f42212N;
        le3Var.f5731I = false;
        le3Var.f5732J = false;
        le3Var.f5738P.f52641g = false;
        le3Var.m2186u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((hd3) this.f43959Q.f50618b).f42212N.f5745f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((hd3) this.f43959Q.f50618b).f42212N.m2175l();
        this.f43960R.m23833G(Lifecycle$Event.ON_DESTROY);
    }

    @Override // p000.uc1, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((hd3) this.f43959Q.f50618b).f42212N.m2171j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f43962T = false;
        ((hd3) this.f43959Q.f50618b).f42212N.m2186u(5);
        this.f43960R.m23833G(Lifecycle$Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f43960R.m23833G(Lifecycle$Event.ON_RESUME);
        le3 le3Var = ((hd3) this.f43959Q.f50618b).f42212N;
        le3Var.f5731I = false;
        le3Var.f5732J = false;
        le3Var.f5738P.f52641g = false;
        le3Var.m2186u(7);
    }

    @Override // p000.uc1, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f43959Q.m16646k();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        m58 m58Var = this.f43959Q;
        m58Var.m16646k();
        super.onResume();
        this.f43962T = true;
        ((hd3) m58Var.f50618b).f42212N.m2191z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        m58 m58Var = this.f43959Q;
        m58Var.m16646k();
        hd3 hd3Var = (hd3) m58Var.f50618b;
        super.onStart();
        this.f43963U = false;
        if (!this.f43961S) {
            this.f43961S = true;
            le3 le3Var = hd3Var.f42212N;
            le3Var.f5731I = false;
            le3Var.f5732J = false;
            le3Var.f5738P.f52641g = false;
            le3Var.m2186u(4);
        }
        hd3Var.f42212N.m2191z(true);
        this.f43960R.m23833G(Lifecycle$Event.ON_START);
        le3 le3Var2 = hd3Var.f42212N;
        le3Var2.f5731I = false;
        le3Var2.f5732J = false;
        le3Var2.f5738P.f52641g = false;
        le3Var2.m2186u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f43959Q.m16646k();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f43963U = true;
        while (m13791k(m13792j(), Lifecycle$State.CREATED)) {
        }
        le3 le3Var = ((hd3) this.f43959Q.f50618b).f42212N;
        le3Var.f5732J = true;
        le3Var.f5738P.f52641g = true;
        le3Var.m2186u(4);
        this.f43960R.m23833G(Lifecycle$Event.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((hd3) this.f43959Q.f50618b).f42212N.f5745f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }
}
