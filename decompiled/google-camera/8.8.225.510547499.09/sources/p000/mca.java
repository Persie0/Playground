package p000;

import android.app.Activity;
import android.content.Intent;
import androidx.wear.ambient.AmbientDelegate;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mca {

    /* JADX INFO: renamed from: a */
    public final Object f39913a;

    /* JADX INFO: renamed from: b */
    public final Object f39914b;

    /* JADX INFO: renamed from: c */
    public final Object f39915c;

    /* JADX INFO: renamed from: d */
    public final Object f39916d;

    /* JADX INFO: renamed from: e */
    public final Object f39917e;

    /* JADX INFO: renamed from: f */
    public final Object f39918f;

    /* JADX INFO: renamed from: g */
    public final Object f39919g;

    /* JADX INFO: renamed from: h */
    public final Object f39920h;

    /* JADX INFO: renamed from: i */
    public final Object f39921i;

    public mca() {
        this.f39921i = new ArrayList();
        this.f39915c = new ArrayList();
        this.f39913a = new ArrayList();
        this.f39917e = new ArrayList();
        this.f39920h = new ArrayList();
        this.f39916d = new ArrayList();
        this.f39918f = new ArrayList();
        this.f39914b = new ArrayList();
        this.f39919g = new ArrayList();
    }

    public mca(Activity activity, bko bkoVar, kms kmsVar, hbg hbgVar, hah hahVar, djm djmVar, jwn jwnVar, hbm hbmVar, dcj dcjVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f39913a = activity;
        this.f39920h = bkoVar;
        this.f39918f = kmsVar;
        this.f39917e = hbgVar;
        this.f39915c = hahVar;
        this.f39914b = djmVar;
        this.f39921i = jwnVar;
        this.f39919g = hbmVar;
        this.f39916d = dcjVar;
    }

    public mca(dxx dxxVar, List list, gtd gtdVar, dsx dsxVar, dhv dhvVar, Executor executor, flc flcVar, gti gtiVar, fzn fznVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f39918f = dxxVar;
        this.f39914b = list;
        this.f39915c = gtdVar;
        this.f39919g = dsxVar;
        this.f39920h = dhvVar;
        this.f39913a = executor;
        this.f39917e = flcVar;
        this.f39921i = gtiVar;
        this.f39916d = fznVar;
    }

    public mca(gax gaxVar, jwn jwnVar, jwn jwnVar2, jwn jwnVar3, jwn jwnVar4, jwn jwnVar5, nps npsVar, gcx gcxVar, jwn jwnVar6) {
        this.f39918f = gaxVar.mo9017a();
        this.f39921i = gaxVar.mo9018b();
        this.f39915c = jwnVar;
        this.f39920h = jwnVar3;
        this.f39917e = jwnVar2;
        this.f39916d = jwnVar4;
        new gmw(jwnVar5);
        this.f39914b = npsVar;
        this.f39919g = gcxVar;
        this.f39913a = jwnVar6;
    }

    public mca(kpx kpxVar, jvh jvhVar, kbo kboVar, kbz kbzVar, lbn lbnVar, lpe lpeVar, kpa kpaVar, kmd kmdVar, AmbientDelegate ambientDelegate, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f39921i = kpxVar;
        this.f39913a = jvhVar;
        this.f39914b = kbzVar;
        this.f39920h = kboVar;
        this.f39916d = lpeVar;
        this.f39918f = lbnVar;
        this.f39919g = kpaVar;
        this.f39915c = kmdVar;
        this.f39917e = ambientDelegate;
    }

    public mca(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        ojuVar.getClass();
        this.f39913a = ojuVar;
        ojuVar2.getClass();
        this.f39914b = ojuVar2;
        ojuVar3.getClass();
        this.f39915c = ojuVar3;
        ojuVar4.getClass();
        this.f39916d = ojuVar4;
        ojuVar5.getClass();
        this.f39917e = ojuVar5;
        ojuVar6.getClass();
        this.f39918f = ojuVar6;
        ojuVar7.getClass();
        this.f39919g = ojuVar7;
        ojuVar8.getClass();
        this.f39920h = ojuVar8;
        ojuVar9.getClass();
        this.f39921i = ojuVar9;
    }

    /* JADX INFO: renamed from: a */
    public final void m16303a() {
        Intent intent = new Intent();
        intent.setClassName(pIeXJQLZLfgIN.AHfdpYQZBMfvq, "com.google.vr.apps.ornament.app.MainActivity");
        m16304b(intent);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [dcj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r6v0, types: [hah, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m16304b(Intent intent) {
        intent.setFlags(65536);
        if (((Activity) this.f39913a).isVoiceInteractionRoot()) {
            intent.addFlags(268435456);
        }
        kmq kmqVarMo5895d = this.f39916d.mo5895d();
        kmq kmqVar = kmq.BACK;
        kmg kmgVarMo13858e = ((kms) this.f39918f).mo13858e(kmqVar);
        kmq kmqVar2 = kmq.f36557a;
        kmg kmgVarMo13858e2 = ((kms) this.f39918f).mo13858e(kmqVar2);
        Boolean boolValueOf = Boolean.valueOf(((Boolean) this.f39921i.mo3831be()).booleanValue());
        Boolean boolValueOf2 = Boolean.valueOf(((Boolean) this.f39915c.mo10031c(gzy.f27043b)).booleanValue());
        String strName = ((hbl) ((jxd) this.f39919g).mo3831be()).name();
        Boolean boolValueOf3 = Boolean.valueOf(kmqVarMo5895d.equals(kmq.f36557a));
        String string = ((hbg) this.f39917e).m10082a(kmgVarMo13858e2, kmqVar2).m13906c().toString();
        String string2 = ((djm) this.f39914b).m6237l(kmqVar2).m13661b().m13906c().toString();
        String string3 = ((hbg) this.f39917e).m10082a(kmgVarMo13858e, kmqVar).m13906c().toString();
        String string4 = ((djm) this.f39914b).m6237l(kmqVar).m13661b().m13906c().toString();
        intent.putExtra("settings_save_location", boolValueOf2);
        intent.putExtra("settings_camera_sounds", boolValueOf);
        intent.putExtra("settings_preferred_camera_type_is_front", boolValueOf3);
        if (strName != null) {
            intent.putExtra("settings_volume_key_action", strName);
        }
        if (string3 != null) {
            intent.putExtra("settings_back_camera_photo_resolution", string3);
        }
        if (string4 != null) {
            intent.putExtra("settings_back_camera_video_resolution", string4);
        }
        if (string != null) {
            intent.putExtra("settings_front_camera_photo_resolution", string);
        }
        if (string2 != null) {
            intent.putExtra("settings_front_camera_video_resolution", string2);
        }
        int i = oet.f45811a;
        ((bko) this.f39920h).m2612f(intent);
    }

    /* JADX INFO: renamed from: c */
    public final void m16305c() {
        Intent intent = new Intent();
        intent.setClassName("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.photobooth.activity.PhotoboothActivity");
        m16304b(intent);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: d */
    public final fgj m16306d(glk glkVar) {
        mrm mrmVar = (mrm) this.f39917e.get();
        mrmVar.getClass();
        ohb ohbVar = ((ohl) this.f39916d).get();
        ohbVar.getClass();
        ohb ohbVar2 = ((ohl) this.f39921i).get();
        ohbVar2.getClass();
        ohb ohbVar3 = ((ohl) this.f39914b).get();
        ohbVar3.getClass();
        ohb ohbVar4 = ((ohl) this.f39918f).get();
        ohbVar4.getClass();
        fvu fvuVarM8922a = ((fxj) this.f39920h).m8922a();
        inm inmVar = (inm) this.f39919g.get();
        inmVar.getClass();
        dhv dhvVar = (dhv) this.f39915c.get();
        dhvVar.getClass();
        jwn jwnVar = (jwn) this.f39913a.get();
        jwnVar.getClass();
        return new fgj(mrmVar, ohbVar, ohbVar2, ohbVar3, ohbVar4, fvuVarM8922a, inmVar, dhvVar, glkVar, jwnVar, null, null);
    }

    public mca(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, byte[] bArr, byte[] bArr2) {
        ojuVar.getClass();
        this.f39915c = ojuVar;
        ojuVar2.getClass();
        this.f39919g = ojuVar2;
        ojuVar3.getClass();
        this.f39914b = ojuVar3;
        ojuVar4.getClass();
        this.f39916d = ojuVar4;
        ojuVar5.getClass();
        this.f39917e = ojuVar5;
        ojuVar6.getClass();
        this.f39918f = ojuVar6;
        ojuVar7.getClass();
        this.f39920h = ojuVar7;
        ojuVar8.getClass();
        this.f39913a = ojuVar8;
        ojuVar9.getClass();
        this.f39921i = ojuVar9;
    }

    public mca(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, byte[] bArr) {
        ojuVar.getClass();
        this.f39917e = ojuVar;
        this.f39916d = ojuVar2;
        this.f39921i = ojuVar3;
        this.f39914b = ojuVar4;
        this.f39918f = ojuVar5;
        this.f39920h = ojuVar6;
        ojuVar7.getClass();
        this.f39919g = ojuVar7;
        ojuVar8.getClass();
        this.f39915c = ojuVar8;
        ojuVar9.getClass();
        this.f39913a = ojuVar9;
    }
}
