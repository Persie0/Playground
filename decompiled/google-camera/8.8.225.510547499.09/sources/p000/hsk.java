package p000;

import android.content.Context;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hsk {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f29410a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f29411b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f29412c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f29413d = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e */
    public final dox f29414e;

    /* JADX INFO: renamed from: f */
    public final mrm f29415f;

    /* JADX INFO: renamed from: g */
    public final cdu f29416g;

    /* JADX INFO: renamed from: h */
    private final ohb f29417h;

    /* JADX INFO: renamed from: i */
    private final idg f29418i;

    /* JADX INFO: renamed from: j */
    private final int f29419j;

    /* JADX INFO: renamed from: k */
    private final int f29420k;

    /* JADX INFO: renamed from: l */
    private final AmbientDelegate f29421l;

    public hsk(cdu cduVar, AmbientDelegate ambientDelegate, Context context, dox doxVar, ohb ohbVar, mrm mrmVar, jvd jvdVar, idg idgVar, byte[] bArr, byte[] bArr2) {
        this.f29416g = cduVar;
        this.f29421l = ambientDelegate;
        this.f29414e = doxVar;
        this.f29417h = ohbVar;
        this.f29415f = mrmVar;
        this.f29418i = idgVar;
        this.f29419j = context.getResources().getInteger(C0100R.integer.control_3a_visibility_timeout_ms);
        this.f29420k = context.getResources().getInteger(C0100R.integer.extend_3a_visibility_timeout_ms);
        ArrayList arrayListM16501I = mkv.m16501I(doxVar.mo6466b());
        if (mrmVar.mo16813g()) {
            arrayListM16501I.add(((isb) mrmVar.mo16809c()).mo11659a());
        }
        cduVar.m3529i().m13537d(jwr.m13631a(arrayListM16501I).mo3830a(new hmv(this, 13), jvdVar));
    }

    /* JADX INFO: renamed from: a */
    public final int m10696a() {
        return ((Boolean) ((jwf) ((dxh) this.f29417h.get()).mo4156n()).f34942d).booleanValue() ? this.f29419j + this.f29420k : this.f29419j;
    }

    /* JADX INFO: renamed from: b */
    public final void m10697b(boolean z) {
        if (this.f29415f.mo16813g()) {
            ((isb) this.f29415f.mo16809c()).mo11662d(z, false);
        }
        this.f29414e.mo6474j(z);
        m10698c();
    }

    /* JADX INFO: renamed from: c */
    public final void m10698c() {
        idg idgVar = this.f29418i;
        idgVar.f30435c.mo7485g(idgVar.f30440h);
    }

    /* JADX INFO: renamed from: d */
    public final void m10699d(boolean z) {
        if (this.f29415f.mo16813g()) {
            ((isb) this.f29415f.mo16809c()).mo11666h(z);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10700e() {
        if (this.f29415f.mo16813g()) {
            ((isb) this.f29415f.mo16809c()).mo11667i(false, false);
        }
        this.f29414e.mo6480p(false, false);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [dox, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dox, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    public final cdh m10701f() {
        boolean z;
        if (this.f29415f.mo16813g()) {
            isb isbVar = (isb) this.f29415f.mo16809c();
            z = !((Boolean) ((jwf) isbVar.mo11661c()).f34942d).booleanValue();
            isbVar.mo11667i(true, z);
            isbVar.mo11668j(m10696a());
        } else {
            z = true;
        }
        boolean z2 = !((Boolean) ((jwf) this.f29414e.mo6467c()).f34942d).booleanValue();
        AmbientDelegate ambientDelegate = this.f29421l;
        Object obj = ambientDelegate.f1685a;
        if (obj != null) {
            ((cdh) obj).close();
            ambientDelegate.f1685a = null;
        }
        boolean z3 = z2 & z;
        if (z3) {
            ambientDelegate.f1686b.mo6477m(false);
        }
        ambientDelegate.f1686b.mo6480p(true, z3);
        ambientDelegate.f1685a = ((cdi) ambientDelegate.f1687c).get();
        Object obj2 = ambientDelegate.f1685a;
        this.f29414e.mo6481q(m10696a());
        return (cdh) obj2;
    }
}
