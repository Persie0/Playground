package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: bz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0080bz extends ActivityC0907pl implements aas {

    /* JADX INFO: renamed from: a */
    boolean f4792a;

    /* JADX INFO: renamed from: b */
    boolean f4793b;

    /* JADX INFO: renamed from: e */
    public final bkn f4796e = new bkn((C0086ce) new C0079by(this));

    /* JADX INFO: renamed from: d */
    final aks f4795d = new aks(this);

    /* JADX INFO: renamed from: c */
    boolean f4794c = true;

    public ActivityC0080bz() {
        int i = 1;
        getSavedStateRegistry().m1859b("android:support:lifecycle", new C0088cg(this, i));
        mo176d(new C0078bx(this, i));
        this.f47429j.add(new C0078bx(this, 0));
        m19317l(new C0156eh(this, i));
    }

    /* JADX INFO: renamed from: h */
    private static boolean m3205h(C0111cq c0111cq, akr akrVar) {
        boolean zM3205h = false;
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : c0111cq.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null) {
                if (componentCallbacksC0077bw.getHost() != null) {
                    zM3205h |= m3205h(componentCallbacksC0077bw.getChildFragmentManager(), akrVar);
                }
                C0128dg c0128dg = componentCallbacksC0077bw.f4595W;
                if (c0128dg != null && c0128dg.getLifecycle().f598a.m872a(akr.f595d)) {
                    componentCallbacksC0077bw.f4595W.f10831a.m882d(akrVar);
                    zM3205h = true;
                }
                if (componentCallbacksC0077bw.f4601ab.f598a.m872a(akr.f595d)) {
                    componentCallbacksC0077bw.f4601ab.m882d(akrVar);
                    zM3205h = true;
                }
            }
        }
        return zM3205h;
    }

    /* JADX INFO: renamed from: bA */
    public final C0111cq m3206bA() {
        return this.f4796e.m2602w();
    }

    /* JADX INFO: renamed from: bB */
    final View m3207bB(View view, String str, Context context, AttributeSet attributeSet) {
        return ((C0086ce) this.f4796e.f3651a).f5401e.f8783c.onCreateView(view, str, context, attributeSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length > 0) {
            byte b = 0;
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (!str2.equals("--translation")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 100470631:
                    if (!str2.equals("--dump-dumpable")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 472614934:
                    if (!str2.equals("--list-dumpables")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 1159329357:
                    if (!str2.equals("--contentcapture")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 1455016274:
                    if (!str2.equals("--autofill")) {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 3:
                case 4:
                    int i = adg.f162a;
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.print(strConcat);
        printWriter.print("mCreated=");
        printWriter.print(this.f4792a);
        printWriter.print(" mResumed=");
        printWriter.print(this.f4793b);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4794c);
        if (getApplication() != null) {
            amd.m936a(this).m939d(strConcat, printWriter);
        }
        this.f4796e.m2602w().m5295C(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: e */
    final void m3208e() {
        while (m3205h(m3206bA(), akr.CREATED)) {
        }
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f4796e.m2603x();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4795d.m880b(akq.ON_CREATE);
        ((C0086ce) this.f4796e.f3651a).f5401e.m5334p();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewM3207bB = m3207bB(view, str, context, attributeSet);
        return viewM3207bB == null ? super.onCreateView(view, str, context, attributeSet) : viewM3207bB;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ((C0086ce) this.f4796e.f3651a).f5401e.m5335q();
        this.f4795d.m880b(akq.ON_DESTROY);
    }

    @Override // p000.ActivityC0907pl, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0086ce) this.f4796e.f3651a).f5401e.m5307O(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f4793b = false;
        ((C0086ce) this.f4796e.f3651a).f5401e.m5341w();
        this.f4795d.m880b(akq.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f4795d.m880b(akq.ON_RESUME);
        ((C0086ce) this.f4796e.f3651a).f5401e.m5343y();
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f4796e.m2603x();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f4796e.m2603x();
        super.onResume();
        this.f4793b = true;
        this.f4796e.m2604y();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f4796e.m2603x();
        super.onStart();
        this.f4794c = false;
        if (!this.f4792a) {
            this.f4792a = true;
            ((C0086ce) this.f4796e.f3651a).f5401e.m5332n();
        }
        this.f4796e.m2604y();
        this.f4795d.m880b(akq.ON_START);
        ((C0086ce) this.f4796e.f3651a).f5401e.m5344z();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f4796e.m2603x();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f4794c = true;
        m3208e();
        ((C0086ce) this.f4796e.f3651a).f5401e.m5294B();
        this.f4795d.m880b(akq.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewM3207bB = m3207bB(null, str, context, attributeSet);
        return viewM3207bB == null ? super.onCreateView(str, context, attributeSet) : viewM3207bB;
    }
}
