package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.C0949e0;
import androidx.fragment.app.Fragment;
import com.facebook.login.C2332c;
import com.linguist.R;
import dm.C5207g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import mo.C7661i;
import p067d8.C5068h;
import p067d8.C5079s;
import p067d8.C5086z;
import p173i8.C6205a;
import p238l8.InterfaceC7285a;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/t;", "<init>", "()V", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public class FacebookActivity extends ActivityC0979t {

    /* JADX INFO: renamed from: S */
    public Fragment f11432S;

    @Override // androidx.fragment.app.ActivityC0979t, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(str, "prefix");
            C5207g.m11111f(printWriter, "writer");
            int i10 = InterfaceC7285a.f40801a;
            if (C5207g.m11106a(null, Boolean.TRUE)) {
                return;
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C5207g.m11111f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f11432S;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.ActivityC0979t, androidx.activity.ComponentActivity, p232l2.ActivityC7230i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        Fragment fragment2;
        FacebookException facebookException;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C8004n.m15878h()) {
            C5086z.m10807F("com.facebook.FacebookActivity", "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            C5207g.m11110e(applicationContext, "applicationContext");
            synchronized (C8004n.class) {
                C8004n.m15881k(applicationContext);
            }
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (!C5207g.m11106a("PassThrough", intent.getAction())) {
            Intent intent2 = getIntent();
            C0949e0 c0949e0M3805K = m3805K();
            C5207g.m11110e(c0949e0M3805K, "supportFragmentManager");
            Fragment fragmentM3616D = c0949e0M3805K.m3616D("SingleFragment");
            if (fragmentM3616D == null) {
                if (C5207g.m11106a("FacebookDialogFragment", intent2.getAction())) {
                    fragment = fragmentM3616D;
                    C5068h c5068h = new C5068h();
                    c5068h.m3590i0();
                    c5068h.mo3772s0(c0949e0M3805K, "SingleFragment");
                    fragment2 = c5068h;
                } else {
                    fragment = fragmentM3616D;
                    C2332c c2332c = new C2332c();
                    c2332c.m3590i0();
                    C0940a c0940a = new C0940a(c0949e0M3805K);
                    c0940a.mo3695f(R.id.com_facebook_fragment_container, c2332c, "SingleFragment", 1);
                    c0940a.m3697i();
                    fragment2 = c2332c;
                }
                fragment = fragment2;
            }
            fragment = fragmentM3616D;
            this.f11432S = fragment;
            return;
        }
        Intent intent3 = getIntent();
        C5079s c5079s = C5079s.f32992a;
        C5207g.m11110e(intent3, "requestIntent");
        Bundle bundleM10786h = C5079s.m10786h(intent3);
        if (C6205a.m12742b(C5079s.class) || bundleM10786h == null) {
            facebookException = null;
        } else {
            try {
                String string = bundleM10786h.getString("error_type");
                if (string == null) {
                    string = bundleM10786h.getString("com.facebook.platform.status.ERROR_TYPE");
                }
                String string2 = bundleM10786h.getString("error_description");
                if (string2 == null) {
                    string2 = bundleM10786h.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                }
                facebookException = (string == null || !C7661i.m15249O2(string, "UserCanceled")) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
            } catch (Throwable th2) {
                C6205a.m12741a(C5079s.class, th2);
                facebookException = null;
            }
        }
        C5079s c5079s2 = C5079s.f32992a;
        Intent intent4 = getIntent();
        C5207g.m11110e(intent4, "intent");
        setResult(0, C5079s.m10785e(intent4, null, facebookException));
        finish();
    }
}
