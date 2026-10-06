package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cee implements ceb, fbp, faa, fbm, fab {

    /* JADX INFO: renamed from: a */
    public final Activity f5416a;

    /* JADX INFO: renamed from: b */
    public final cej f5417b;

    /* JADX INFO: renamed from: f */
    public nqf f5421f;

    /* JADX INFO: renamed from: h */
    public final bko f5423h;

    /* JADX INFO: renamed from: i */
    private final cec f5424i;

    /* JADX INFO: renamed from: j */
    private final jvd f5425j;

    /* JADX INFO: renamed from: k */
    private final Executor f5426k;

    /* JADX INFO: renamed from: l */
    private final boolean f5427l;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f5418c = new AtomicInteger();

    /* JADX INFO: renamed from: d */
    public final DialogInterface.OnClickListener f5419d = new cdo(this, 3);

    /* JADX INFO: renamed from: e */
    public final DialogInterface.OnClickListener f5420e = new cdo(this, 4);

    /* JADX INFO: renamed from: m */
    private boolean f5428m = false;

    /* JADX INFO: renamed from: g */
    public DialogInterfaceC0155eg f5422g = null;

    public cee(Activity activity, cej cejVar, fba fbaVar, cec cecVar, bko bkoVar, jvd jvdVar, Executor executor, boolean z, byte[] bArr, byte[] bArr2) {
        this.f5416a = activity;
        this.f5417b = cejVar;
        this.f5424i = cecVar;
        this.f5423h = bkoVar;
        this.f5425j = jvdVar;
        this.f5426k = executor;
        this.f5427l = z;
        fdh.m8265e(jvdVar, fbaVar, this);
    }

    /* JADX INFO: renamed from: i */
    private final void m3546i(int i, boolean z) {
        this.f5425j.execute(new eyo(this, i, z, 1));
    }

    /* JADX INFO: renamed from: j */
    private final boolean m3547j() {
        return this.f5427l || this.f5424i.m3545c();
    }

    @Override // p000.ceb
    /* JADX INFO: renamed from: a */
    public final nps mo3540a() {
        nqf nqfVar = this.f5421f;
        if (nqfVar == null) {
            this.f5421f = nqf.m17621g();
            if (this.f5424i.m3544b() && m3547j()) {
                this.f5421f.mo14894e(true);
            }
            if (!this.f5421f.isDone()) {
                m3549e();
            }
        } else {
            nqfVar.isDone();
        }
        return this.f5421f;
    }

    @Override // p000.ceb
    /* JADX INFO: renamed from: b */
    public final boolean mo3541b() {
        return this.f5428m;
    }

    @Override // p000.ceb
    /* JADX INFO: renamed from: c */
    public final boolean mo3542c() {
        return this.f5424i.m3545c();
    }

    /* JADX INFO: renamed from: d */
    public final void m3548d() {
        DialogInterfaceC0155eg dialogInterfaceC0155eg = this.f5422g;
        if (dialogInterfaceC0155eg == null || !dialogInterfaceC0155eg.isShowing()) {
            return;
        }
        this.f5422g.dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:8:0x003a  */
    /* JADX INFO: renamed from: e */
    public final void m3549e() {
        lku.m15613H(!jvd.m13540d());
        this.f5428m = false;
        m3548d();
        cec cecVar = this.f5424i;
        mws mwsVar = cecVar.f5414e;
        int i = ((mzr) mwsVar).f41859c;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) mwsVar.get(i2);
            if (cecVar.f5413d.containsKey(str)) {
                Boolean bool = (Boolean) cecVar.f5413d.get(str);
                bool.getClass();
                if (!bool.booleanValue()) {
                    cecVar.f5413d.put(str, Boolean.valueOf(cecVar.m3543a(str)));
                }
            } else {
                cecVar.f5413d.put(str, Boolean.valueOf(cecVar.m3543a(str)));
            }
        }
        if (this.f5424i.m3544b() && m3547j()) {
            this.f5421f.mo14894e(true);
            return;
        }
        this.f5428m = true;
        if (this.f5427l) {
            m3546i(C0100R.string.error_permissions_keyguard_updated, true);
            return;
        }
        if (this.f5418c.get() != 0) {
            this.f5418c.get();
            return;
        }
        this.f5418c.incrementAndGet();
        cec cecVar2 = this.f5424i;
        ArrayList arrayList = new ArrayList();
        mws mwsVar2 = cecVar2.f5414e;
        int i3 = ((mzr) mwsVar2).f41859c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) mwsVar2.get(i4);
            if (cecVar2.f5413d.containsKey(str2)) {
                Boolean bool2 = (Boolean) cecVar2.f5413d.get(str2);
                bool2.getClass();
                if (!bool2.booleanValue()) {
                    arrayList.add(str2);
                }
            } else {
                arrayList.add(str2);
            }
        }
        cecVar2.f5412c.m13541c(new bey(cecVar2, arrayList, 19));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    @Override // p000.faa
    /* JADX INFO: renamed from: f */
    public final void mo3550f(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (i != 151398431) {
            return;
        }
        this.f5418c.decrementAndGet();
        if (strArr.length == 0 || iArr.length == 0) {
            if (!jvd.m13540d()) {
                this.f5418c.get();
                return;
            } else {
                this.f5418c.get();
                this.f5426k.execute(new cei(this, 1));
                return;
            }
        }
        cec cecVar = this.f5424i;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (cecVar.f5413d.containsKey(strArr[i2])) {
                Boolean bool = (Boolean) cecVar.f5413d.get(strArr[i2]);
                bool.getClass();
                if (!bool.booleanValue()) {
                    Map map = cecVar.f5413d;
                    String str = strArr[i2];
                    if (iArr[i2] == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    map.put(str, Boolean.valueOf(z));
                }
            } else {
                Map map2 = cecVar.f5413d;
                String str2 = strArr[i2];
                if (iArr[i2] == 0) {
                    z = true;
                } else {
                    z = false;
                }
                map2.put(str2, Boolean.valueOf(z));
            }
        }
        if (!cecVar.m3545c()) {
            cecVar.f5411b.mo10033e(gzy.f27043b, false);
        }
        if (this.f5424i.m3544b()) {
            this.f5421f.mo14894e(true);
        } else {
            m3546i(C0100R.string.error_permissions_updated, false);
        }
    }

    @Override // p000.fab
    /* JADX INFO: renamed from: g */
    public final void mo3551g(Bundle bundle) {
        if (bundle.containsKey("PermissionsCheckerImpl.permissionsRequestCount")) {
            this.f5418c.addAndGet(bundle.getInt("PermissionsCheckerImpl.permissionsRequestCount"));
        }
    }

    @Override // p000.fbm
    /* JADX INFO: renamed from: h */
    public final void mo3552h(Bundle bundle) {
        bundle.putInt("PermissionsCheckerImpl.permissionsRequestCount", this.f5418c.get());
    }
}
