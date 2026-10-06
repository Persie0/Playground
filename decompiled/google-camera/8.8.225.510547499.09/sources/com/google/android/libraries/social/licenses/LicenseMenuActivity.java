package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.AbstractC0118cx;
import p000.ActivityC0157ei;
import p000.C0111cq;
import p000.lru;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LicenseMenuActivity extends ActivityC0157ei {
    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0100R.layout.libraries_social_licenses_license_menu_activity);
        if (m7342i() != null) {
            m7342i().mo6900g(true);
        }
        C0111cq c0111cqM3206bA = m3206bA();
        if (c0111cqM3206bA.m5324d(C0100R.id.license_menu_fragment_container) instanceof lru) {
            return;
        }
        lru lruVar = new lru();
        AbstractC0118cx abstractC0118cxM5327i = c0111cqM3206bA.m5327i();
        abstractC0118cxM5327i.m5697m(C0100R.id.license_menu_fragment_container, lruVar);
        abstractC0118cxM5327i.mo2015b();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
