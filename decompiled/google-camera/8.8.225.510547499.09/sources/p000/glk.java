package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glk {

    /* JADX INFO: renamed from: a */
    public final Object f25500a;

    /* JADX INFO: renamed from: b */
    public final Object f25501b;

    /* JADX INFO: renamed from: c */
    public final Object f25502c;

    /* JADX INFO: renamed from: d */
    public final Object f25503d;

    public glk(UriMatcher uriMatcher, dzd dzdVar, dzd dzdVar2, dzd dzdVar3) {
        this.f25502c = uriMatcher;
        this.f25501b = dzdVar;
        this.f25500a = dzdVar2;
        this.f25503d = dzdVar3;
    }

    public glk(bko bkoVar, fca fcaVar, Executor executor, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25501b = bkoVar;
        this.f25500a = fcaVar;
        this.f25502c = executor;
        this.f25503d = dhvVar;
    }

    public glk(FocusIndicatorRingView focusIndicatorRingView, dwl dwlVar, dwn dwnVar, FocusIndicatorAccessoryView focusIndicatorAccessoryView) {
        this.f25501b = focusIndicatorRingView;
        this.f25503d = dwlVar;
        this.f25500a = dwnVar;
        this.f25502c = focusIndicatorAccessoryView;
    }

    public glk(dhv dhvVar, Context context) {
        this.f25503d = context;
        String strMo6182j = dhvVar.mo6182j(dik.f11612j);
        strMo6182j.getClass();
        this.f25501b = strMo6182j;
        String strMo6182j2 = dhvVar.mo6182j(dik.f11613k);
        strMo6182j2.getClass();
        this.f25500a = strMo6182j2;
        String strMo6182j3 = dhvVar.mo6182j(dik.f11614l);
        strMo6182j3.getClass();
        this.f25502c = strMo6182j3;
    }

    public glk(fie fieVar, flc flcVar, jwn jwnVar, fvu fvuVar) {
        this.f25500a = fieVar;
        this.f25501b = flcVar;
        this.f25503d = jwnVar;
        this.f25502c = fvuVar;
    }

    public glk(fua fuaVar, gyh gyhVar, gav gavVar, gaw gawVar) {
        this.f25503d = fuaVar;
        this.f25502c = gyhVar;
        this.f25501b = gavVar;
        this.f25500a = gawVar;
    }

    public glk(fuc fucVar, flz flzVar, fvu fvuVar, jvd jvdVar) {
        this.f25501b = fucVar;
        this.f25500a = flzVar;
        this.f25502c = fvuVar;
        this.f25503d = jvdVar;
    }

    public glk(fve fveVar, ewe eweVar, kbz kbzVar, fmz fmzVar) {
        this.f25501b = fveVar;
        this.f25500a = eweVar;
        this.f25502c = kbzVar;
        this.f25503d = fmzVar;
    }

    public glk(hjk hjkVar, gtd gtdVar, glk glkVar, nps npsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25501b = hjkVar;
        this.f25503d = gtdVar;
        this.f25500a = glkVar;
        this.f25502c = npsVar;
    }

    public glk(kbn kbnVar, Set set, jvd jvdVar, dja djaVar) {
        this.f25501b = kbnVar.mo6314a(xPAWq.AoTewERdzGlN);
        this.f25502c = set;
        this.f25500a = jvdVar;
        this.f25503d = djaVar;
    }

    public glk(kfk kfkVar, kgg kggVar, kho khoVar, fzu fzuVar) {
        this.f25501b = kfkVar;
        this.f25500a = kggVar;
        this.f25502c = khoVar;
        this.f25503d = fzuVar;
    }

    public glk(kms kmsVar, Intent intent, dnn dnnVar, dhv dhvVar) {
        this.f25502c = kmsVar;
        this.f25500a = intent;
        this.f25503d = dnnVar;
        this.f25501b = dhvVar;
    }

    public glk(kms kmsVar, hbg hbgVar, ihv ihvVar, kbz kbzVar) {
        this.f25502c = kmsVar;
        this.f25500a = hbgVar;
        this.f25501b = ihvVar;
        this.f25503d = kbzVar;
    }

    public glk(oju ojuVar, oju ojuVar2, oju ojuVar3, ikw ikwVar) {
        this.f25501b = ojuVar;
        this.f25500a = ojuVar2;
        this.f25502c = ojuVar3;
        this.f25503d = ikwVar;
    }

    public glk(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f25500a = ojuVar;
        ojuVar2.getClass();
        this.f25501b = ojuVar2;
        ojuVar3.getClass();
        this.f25502c = ojuVar3;
        ojuVar4.getClass();
        this.f25503d = ojuVar4;
    }

    public glk(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, byte[] bArr) {
        ojuVar.getClass();
        this.f25500a = ojuVar;
        ojuVar2.getClass();
        this.f25502c = ojuVar2;
        ojuVar3.getClass();
        this.f25503d = ojuVar3;
        ojuVar4.getClass();
        this.f25501b = ojuVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [hjk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kme] */
    /* JADX WARN: Type inference failed for: r5v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m9424a(fvs fvsVar) {
        this.f25501b.run();
        Object obj = this.f25503d;
        glk glkVar = (glk) this.f25500a;
        kmg kmgVarM6439b = ((dnn) glkVar.f25503d).m6439b(glkVar.f25502c, glkVar.f25501b, cds.m3511j((Intent) glkVar.f25500a) ? kmq.f36557a : kmq.BACK);
        if (kmgVarM6439b == null) {
            kmgVarM6439b = ((kms) glkVar.f25502c).mo13855b();
            kmgVarM6439b.getClass();
        }
        fvsVar.m8837b(((gtd) obj).m9743h(kmgVarM6439b, fvsVar.f23686l), this.f25502c);
    }

    /* JADX INFO: renamed from: b */
    public final void m9425b(fmy fmyVar) {
        ((jvd) this.f25503d).execute(new ewo(this, fmyVar, 7, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
    }

    /* JADX INFO: renamed from: c */
    public final ValueAnimator.AnimatorUpdateListener m9426c() {
        return new afx(this, 7, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: d */
    public final ValueAnimator.AnimatorUpdateListener m9427d() {
        return new afx(this, 8, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public final ValueAnimator.AnimatorUpdateListener m9428e() {
        return new afx(this, 9, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: f */
    public final ValueAnimator.AnimatorUpdateListener m9429f() {
        return new afx(this, 10, null, null, null, null, null);
    }

    public glk(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, byte[] bArr, byte[] bArr2) {
        ojuVar.getClass();
        this.f25503d = ojuVar;
        ojuVar2.getClass();
        this.f25501b = ojuVar2;
        ojuVar3.getClass();
        this.f25500a = ojuVar3;
        ojuVar4.getClass();
        this.f25502c = ojuVar4;
    }
}
