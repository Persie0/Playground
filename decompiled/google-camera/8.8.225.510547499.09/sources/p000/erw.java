package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class erw implements ciw {

    /* JADX INFO: renamed from: a */
    private final jvt f15268a;

    /* JADX INFO: renamed from: b */
    private final oju f15269b;

    /* JADX INFO: renamed from: c */
    private final oju f15270c;

    /* JADX INFO: renamed from: d */
    private final oju f15271d;

    /* JADX INFO: renamed from: e */
    private final oju f15272e;

    /* JADX INFO: renamed from: f */
    private final oju f15273f;

    /* JADX INFO: renamed from: g */
    private final oju f15274g;

    /* JADX INFO: renamed from: h */
    private final oju f15275h;

    /* JADX INFO: renamed from: i */
    private final Executor f15276i;

    /* JADX INFO: renamed from: j */
    private final AtomicBoolean f15277j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    private final kbz f15278k;

    /* JADX INFO: renamed from: l */
    private final kbo f15279l;

    /* JADX INFO: renamed from: m */
    private nps f15280m;

    /* JADX INFO: renamed from: n */
    private final khb f15281n;

    public erw(jvt jvtVar, oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, Executor executor, kbn kbnVar, khb khbVar, kbz kbzVar, byte[] bArr, byte[] bArr2) {
        this.f15268a = jvtVar;
        this.f15269b = ojuVar;
        this.f15270c = ojuVar2;
        this.f15271d = ojuVar3;
        this.f15273f = ojuVar5;
        this.f15272e = ojuVar4;
        this.f15274g = ojuVar6;
        this.f15275h = ojuVar7;
        this.f15276i = executor;
        this.f15281n = khbVar;
        this.f15278k = kbzVar;
        this.f15279l = kbnVar.mo6314a("ActivityStartup");
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() {
        if (this.f15277j.getAndSet(true)) {
            return this.f15280m;
        }
        this.f15278k.mo13961e("ActivityStartup");
        this.f15268a.m13586a();
        this.f15272e.get();
        civ civVarM3812a = civ.m3812a(this.f15276i);
        civVarM3812a.f5903d = this.f15281n;
        civVarM3812a.f5901b = this.f15278k;
        civVarM3812a.f5902c = this.f15279l;
        civVarM3812a.m3814c(this.f15269b, "ErrorHandlerStartup");
        civVarM3812a.m3814c(this.f15270c, "WaitForHalUpdate");
        civVarM3812a.m3814c(this.f15272e, EArqVBjecl.TjLo);
        civVarM3812a.m3814c(this.f15271d, "WaitForCameraDevices");
        civVarM3812a.m3814c(this.f15273f, "CameraPolicyChecker");
        civVarM3812a.m3814c(this.f15274g, "CriticalPath");
        civVarM3812a.m3815d(cwd.m5644z(this.f15275h), "ActivityBehaviors");
        this.f15280m = civVarM3812a.m3813b();
        this.f15278k.mo13962f();
        return this.f15280m;
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3539c() {
        return dez.m6039i(this);
    }
}
