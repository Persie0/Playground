package com.google.android.apps.camera.testing.prod;

import android.app.IntentService;
import android.content.Intent;
import p000.hob;
import p000.hod;
import p000.jib;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ScorePrintService extends IntentService {

    /* JADX INFO: renamed from: a */
    private static final nbh f6972a = nbh.m17259h("com/google/android/apps/camera/testing/prod/ScorePrintService");

    public ScorePrintService() {
        super("CAM_ScorePrintService");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, oju] */
    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((nbe) ((nbe) f6972a.m17252c()).mo17276G((char) 3775)).mo17290o("No intent is given.");
            return;
        }
        hod hodVar = (hod) ((hob) getApplication()).mo4195g(new jib()).f26335b.get();
        if (hodVar == null) {
            ((nbe) ((nbe) f6972a.m17252c()).mo17276G((char) 3774)).mo17290o("The service isn't enabled.");
        } else {
            hodVar.mo10530a(intent);
        }
    }
}
