package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import p000.ActivityC0157ei;
import p000.RunnableC0904pi;
import p000.lqi;
import p000.lrr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class LicenseActivity extends ActivityC0157ei {
    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String strM15858c;
        super.onCreate(bundle);
        setContentView(C0100R.layout.libraries_social_licenses_license_activity);
        lrr lrrVar = (lrr) getIntent().getParcelableExtra("license");
        if (m7342i() != null) {
            m7342i().mo6902i(lrrVar.f39098a);
            m7342i().mo6911r();
            m7342i().mo6900g(true);
            m7342i().mo6913t();
        }
        TextView textView = (TextView) findViewById(C0100R.id.license_activity_textview);
        long j = lrrVar.f39099b;
        int i = lrrVar.f39100c;
        String str = lrrVar.f39101d;
        if (!str.isEmpty()) {
            try {
                String strM15857b = lqi.m15857b(new BufferedInputStream(new FileInputStream(str)), j, i);
                if (strM15857b != null && !strM15857b.isEmpty()) {
                    strM15858c = strM15857b;
                }
            } catch (FileNotFoundException e) {
            }
            throw new RuntimeException(String.valueOf(str).concat(" does not contain res/raw/third_party_licenses"));
        }
        strM15858c = lqi.m15858c(this, "third_party_licenses", j, i);
        if (strM15858c == null) {
            finish();
        } else {
            textView.setText(strM15858c);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(C0100R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new RunnableC0904pi(this, i, scrollView, 20));
        }
    }

    @Override // p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(C0100R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(C0100R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
