package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import java.util.Locale;
import p000.iku;
import p000.ikw;
import p000.mre;
import p000.mrm;
import p000.mxk;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class CameraDeepLinkActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private static final nbh f6764a = nbh.m17259h("com/google/android/apps/camera/legacy/app/activity/CameraDeepLinkActivity");

    /* JADX INFO: renamed from: b */
    private boolean f6765b;

    /* JADX INFO: renamed from: a */
    private final void m4189a() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.GoogleCamera"));
        intent.setPackage("com.android.vending");
        startActivity(intent);
        this.f6765b = true;
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6765b = false;
        Intent intent = new Intent(this, (Class<?>) CameraActivity.class);
        intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
        intent.addFlags(268435456);
        Uri data = getIntent().getData();
        if (data == null) {
            ((nbe) ((nbe) f6764a.m17252c()).mo17276G((char) 1860)).mo17290o("Received intent to launch DeepLinkActivity with null intentUri");
            startActivity(intent);
            this.f6765b = true;
            return;
        }
        for (String str : data.getQueryParameterNames()) {
            if ("mode".equalsIgnoreCase(str)) {
                String queryParameter = data.getQueryParameter(str);
                queryParameter.getClass();
                mrm mrmVarM16820a = mre.m16820a(ikw.class, queryParameter.toUpperCase(Locale.ROOT));
                if (mrmVarM16820a.mo16813g()) {
                    ikw ikwVar = (ikw) mrmVarM16820a.mo16809c();
                    int i = iku.f31384a;
                    if (mxk.m17137I(ikw.PORTRAIT, ikw.PHOTO).contains(ikwVar)) {
                        if (!"android.media.action.STILL_IMAGE_CAMERA".equals(intent.getAction())) {
                            throw new UnsupportedOperationException("Unreachable: only still-image modes supported");
                        }
                        intent.putExtra("android.intent.extra.STILL_IMAGE_MODE", ((ikw) mrmVarM16820a.mo16809c()).toString());
                    }
                }
                ((nbe) ((nbe) f6764a.m17252c()).mo17276G((char) 1861)).mo17293r("Unsupported mode '%s', perhaps you need to upgrade", queryParameter);
                m4189a();
                return;
            }
            if ("timer".equalsIgnoreCase(str)) {
                String queryParameter2 = data.getQueryParameter(str);
                queryParameter2.getClass();
                intent.putExtra("android.intent.extra.TIMER_DURATION_SECONDS", Integer.parseInt(queryParameter2));
            } else if (!"use-front-camera".equalsIgnoreCase(str)) {
                ((nbe) ((nbe) f6764a.m17252c()).mo17276G(1859)).mo17301z("Unknown query parameter %s, with value %s", str, data.getQueryParameter(str));
                m4189a();
                return;
            } else {
                String queryParameter3 = data.getQueryParameter(str);
                queryParameter3.getClass();
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", Boolean.parseBoolean(queryParameter3));
            }
        }
        startActivity(intent);
        this.f6765b = true;
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (this.f6765b) {
            finish();
        }
    }
}
