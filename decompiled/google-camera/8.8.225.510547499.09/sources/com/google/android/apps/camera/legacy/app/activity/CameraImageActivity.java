package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import com.google.android.apps.camera.legacy.app.activity.main.CameraVoiceActivity;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import p000.C1058va;
import p000.cbw;
import p000.cda;
import p000.cdx;
import p000.cla;
import p000.clp;
import p000.cpn;
import p000.cqu;
import p000.cwd;
import p000.cwr;
import p000.dhv;
import p000.dja;
import p000.dqb;
import p000.dvb;
import p000.dvc;
import p000.dws;
import p000.ema;
import p000.eme;
import p000.emf;
import p000.emg;
import p000.emy;
import p000.emz;
import p000.eor;
import p000.ero;
import p000.erq;
import p000.err;
import p000.ert;
import p000.eru;
import p000.eso;
import p000.esz;
import p000.fcp;
import p000.fvg;
import p000.gcj;
import p000.gmq;
import p000.gpm;
import p000.gtd;
import p000.hai;
import p000.hbn;
import p000.hie;
import p000.hou;
import p000.hqv;
import p000.iad;
import p000.ido;
import p000.ikw;
import p000.jfs;
import p000.khy;
import p000.lku;
import p000.mrm;
import p000.msi;
import p000.ohh;
import p000.oju;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraImageActivity extends ero {

    /* JADX INFO: renamed from: t */
    private boolean f6766t = false;

    @Override // android.app.Activity
    public final boolean isVoiceInteractionRoot() {
        return super.isVoiceInteractionRoot() || this.f6766t;
    }

    @Override // p000.ero, p000.fbs, p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eso esoVarMo4194f = ((CameraApp) getApplicationContext()).mo4194f();
        C1058va c1058vaM7740o = m7740o();
        gtd gtdVarM7741p = m7741p();
        c1058vaM7740o.getClass();
        gtdVarM7741p.getClass();
        esz eszVar = ((esz) esoVarMo4194f).f16376a;
        dws dwsVarM6829c = dws.m6829c(gtdVarM7741p);
        ema emaVarM7510b = ema.m7510b(gtdVarM7741p);
        err errVarM7745b = err.m7745b(c1058vaM7740o);
        oju ojuVarM18486b = ohh.m18486b(cbw.m3413c(eszVar.f16678fk, ohh.m18486b(cbw.m3414d(ohh.m18486b(cdx.m3533a(eszVar.f16354E, eszVar.f17294u, errVarM7745b)), eszVar.f16355F))));
        ert ertVarM7748b = ert.m7748b(c1058vaM7740o);
        eru eruVarM7750b = eru.m7750b(c1058vaM7740o);
        hbn hbnVarM10090b = hbn.m10090b(eszVar.f16624ej, eszVar.f16353D);
        oju ojuVarM18486b2 = ohh.m18486b(gpm.m9609c(dwsVarM6829c, emaVarM7510b, eszVar.f16959l, ojuVarM18486b, eszVar.f16747h, eszVar.f16641f, ohh.m18486b(dqb.m6578e(ertVarM7748b, dwsVarM6829c, emaVarM7510b, ohh.m18486b(eor.m7603a(eruVarM7750b, dwsVarM6829c, hbnVarM10090b, eszVar.f16657fP, eszVar.f16658fQ, eszVar.f16659fR, eszVar.f16660fS, eszVar.f16661fT, eszVar.f16662fU, eszVar.f16641f, eszVar.f17277r, eszVar.f16959l, eszVar.f16800i)), ohh.m18486b(gmq.m9529d(emaVarM7510b, eszVar.f16679fl)), eszVar.f16353D))));
        fvg fvgVarM8825b = fvg.m8825b(eszVar.f16404ab);
        oju ojuVarM18486b3 = ohh.m18486b(hie.m10336d(emaVarM7510b, eruVarM7750b, eszVar.f16959l));
        oju ojuVarM18486b4 = ohh.m18486b(gcj.m9050b(errVarM7745b, fvgVarM8825b, eszVar.f16403aa, eszVar.f16404ab, ojuVarM18486b3, eszVar.f16361L));
        oju ojuVarM18486b5 = ohh.m18486b(hqv.m10643a(ojuVarM18486b3));
        oju ojuVarM18486b6 = ohh.m18486b(cbw.m3412b(emg.m7520b(gtdVarM7741p), eszVar.f16959l));
        oju ojuVarM18486b7 = ohh.m18486b(cda.m3481e(dwsVarM6829c, ojuVarM18486b6, emaVarM7510b, eszVar.f17277r, eszVar.f17118o, eszVar.f16414al));
        oju ojuVarM18486b8 = ohh.m18486b(cpn.m5249a(eszVar.f16959l, erq.m7743b(c1058vaM7740o), emaVarM7510b));
        oju ojuVarM18486b9 = ohh.m18486b(cda.m3482f(eszVar.f16959l, eszVar.f16677fj, ojuVarM18486b7, eszVar.f16414al, eszVar.f17118o, ojuVarM18486b8));
        oju ojuVarM18486b10 = ohh.m18486b(cqu.m5378a(ohh.m18486b(cda.m3480d(dwsVarM6829c, ojuVarM18486b6, emaVarM7510b, eszVar.f17277r, eszVar.f17118o, eszVar.f16414al)), eszVar.f16959l, eszVar.f16677fj, eszVar.f16414al, eszVar.f17277r, eszVar.f17118o, ojuVarM18486b8));
        eme emeVarM7516b = eme.m7516b(gtdVarM7741p);
        oju ojuVarM18486b11 = ohh.m18486b(cla.m3913b(emeVarM7516b));
        oju ojuVarM18486b12 = ohh.m18486b(dvc.m6764a(eszVar.f16424av, eszVar.f16959l, ojuVarM18486b9, ojuVarM18486b10, eszVar.f16677fj, eszVar.f16414al, eszVar.f16456ba, emeVarM7516b, eszVar.f16641f, eszVar.f16442bM, ojuVarM18486b11));
        emf emfVarM7518b = emf.m7518b(gtdVarM7741p);
        oju ojuVarM18486b13 = ohh.m18486b(hou.m10554a(ojuVarM18486b4, eszVar.f17293t, eszVar.f16424av, eszVar.f16492cJ, eszVar.f16353D, eszVar.f16642fA, errVarM7745b, eszVar.f16641f, ojuVarM18486b5, ohh.m18486b(clp.m3933e(emaVarM7510b, errVarM7745b, ojuVarM18486b12, eszVar.f16641f, eszVar.f16353D, ojuVarM18486b5, eszVar.f16442bM, ojuVarM18486b4, eszVar.f16404ab, emfVarM7518b)), emfVarM7518b));
        oju ojuVar = eszVar.f16353D;
        ido idoVarM11123a = ido.m11123a(emaVarM7510b, ertVarM7748b, eszVar.f16424av, ojuVarM18486b13, ojuVar, cwr.m5688a(ojuVar, eszVar.f16666fY, eszVar.f16641f), eszVar.f16650fI, hbnVarM10090b, ojuVarM18486b11);
        boolean zM7814B = eszVar.m7814B();
        boolean zM7831z = eszVar.m7831z();
        boolean zM7813A = eszVar.m7813A();
        iad iadVar = (iad) ojuVarM18486b2.get();
        jfs jfsVarM10644b = hqv.m10644b((dhv) eszVar.f16641f.get());
        Object obj = gtdVarM7741p.f26334a;
        fcp fcpVar = (fcp) eszVar.f17277r.get();
        cwd cwdVar = (cwd) eszVar.f16680fm.get();
        khy khyVar = (khy) eszVar.f16492cJ.get();
        hai haiVar = (hai) eszVar.f16353D.get();
        Activity activity = (Activity) obj;
        msi msiVarM15663q = lku.m15663q(new emy(zM7814B, zM7831z, zM7813A, jfsVarM10644b, activity, null, null, null));
        dja djaVarM6761a = dvb.m6761a();
        Intent intent = new Intent(getIntent());
        boolean z = false;
        if (djaVarM6761a.equals(dja.ENG) && intent.getBooleanExtra("gca_eng_fake_viroot", false)) {
            z = true;
        }
        this.f6766t = z;
        if (isVoiceInteractionRoot()) {
            intent.setClass(this, CameraVoiceActivity.class);
        } else {
            intent.setClass(this, CameraActivity.class);
        }
        intent.addFlags(268435456);
        getIntent().getAction();
        isVoiceInteractionRoot();
        mrm mrmVarM7538c = emz.m7538c(emz.m7537b(intent, activity, msiVarM15663q, khyVar), intent, iadVar, idoVarM11123a, jfsVarM10644b, activity, fcpVar, cwdVar, msiVarM15663q, haiVar, khyVar);
        emz.m7536a(intent, true ^ mrmVarM7538c.mo16813g(), activity, haiVar);
        activity.setIntent(intent);
        if (!mrmVarM7538c.mo16813g() || !emz.m7539d((ikw) mrmVarM7538c.mo16809c(), iadVar, idoVarM11123a, jfsVarM10644b, activity, fcpVar, cwdVar)) {
            activity.startActivity(intent);
        }
        finish();
    }
}
