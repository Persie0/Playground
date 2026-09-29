package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.facebook.common.R$id;
import com.facebook.common.R$layout;
import com.facebook.login.C0935i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000.g70;
import p000.id3;
import p000.le3;
import p000.lp1;
import p000.oy2;
import p000.s76;
import p000.sy2;

/* JADX INFO: loaded from: classes.dex */
public class FacebookActivity extends id3 {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ int f11350W = 0;

    /* JADX INFO: renamed from: V */
    public AbstractComponentCallbacksC0635c f11351V;

    @Override // p000.id3, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            str.getClass();
            printWriter.getClass();
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    @Override // p000.uc1, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f11351V;
        if (abstractComponentCallbacksC0635c != null) {
            abstractComponentCallbacksC0635c.onConfigurationChanged(configuration);
        }
    }

    @Override // p000.id3, p000.uc1, p000.tc1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c;
        FacebookException facebookException;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!sy2.f61601q.get()) {
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            synchronized (sy2.class) {
                sy2.m21775j(applicationContext);
            }
        }
        setContentView(R$layout.com_facebook_activity_layout);
        if ("PassThrough".equals(intent.getAction())) {
            Intent intent2 = getIntent();
            intent2.getClass();
            Bundle bundleM21139i = s76.m21139i(intent2);
            if (lp1.f49971a.contains(s76.class) || bundleM21139i == null) {
                facebookException = null;
            } else {
                try {
                    String string = bundleM21139i.getString("error_type");
                    if (string == null) {
                        string = bundleM21139i.getString("com.facebook.platform.status.ERROR_TYPE");
                    }
                    String string2 = bundleM21139i.getString("error_description");
                    if (string2 == null) {
                        string2 = bundleM21139i.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                    }
                    facebookException = (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
                } catch (Throwable th) {
                    lp1.m16420a(s76.class, th);
                    facebookException = null;
                }
            }
            Intent intent3 = getIntent();
            intent3.getClass();
            setResult(0, s76.m21137e(intent3, null, facebookException));
            finish();
            return;
        }
        Intent intent4 = getIntent();
        le3 le3VarM13792j = m13792j();
        le3VarM13792j.getClass();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2137E = le3VarM13792j.m2137E("SingleFragment");
        if (abstractComponentCallbacksC0635cM2137E == null) {
            if ("FacebookDialogFragment".equals(intent4.getAction())) {
                abstractComponentCallbacksC0635c = abstractComponentCallbacksC0635cM2137E;
                oy2 oy2Var = new oy2();
                oy2Var.m2097Y();
                oy2Var.m3665k0(le3VarM13792j, "SingleFragment");
                abstractComponentCallbacksC0635c = oy2Var;
            } else {
                abstractComponentCallbacksC0635c = abstractComponentCallbacksC0635cM2137E;
                C0935i c0935i = new C0935i();
                c0935i.m2097Y();
                g70 g70Var = new g70(le3VarM13792j);
                g70Var.m12398h(R$id.com_facebook_fragment_container, c0935i, "SingleFragment", 1);
                g70Var.m12396f();
                abstractComponentCallbacksC0635c = c0935i;
            }
        }
        abstractComponentCallbacksC0635c = abstractComponentCallbacksC0635cM2137E;
        this.f11351V = abstractComponentCallbacksC0635c;
    }
}
