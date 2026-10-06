package com.google.android.apps.camera.p014ui.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.format.Formatter;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.camera.bottombar.C0100R;
import java.text.NumberFormat;
import p000.aor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MaterialStorageStatusPreference extends Preference {

    /* JADX INFO: renamed from: e */
    private static final Typeface f7148e = Typeface.create("sans-serif-medium", 0);

    /* JADX INFO: renamed from: a */
    public long f7149a;

    /* JADX INFO: renamed from: b */
    public long f7150b;

    /* JADX INFO: renamed from: c */
    public int f7151c;

    /* JADX INFO: renamed from: d */
    public int f7152d;

    /* JADX INFO: renamed from: f */
    private TextView f7153f;

    /* JADX INFO: renamed from: g */
    private TextView f7154g;

    /* JADX INFO: renamed from: h */
    private ProgressBar f7155h;

    public MaterialStorageStatusPreference(Context context) {
        super(context);
        this.f7149a = -1L;
        this.f7150b = -1L;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        this.f7153f = (TextView) aorVar.f41155a.findViewById(C0100R.id.storage_used);
        this.f7154g = (TextView) aorVar.f41155a.findViewById(C0100R.id.storage_remaining);
        this.f7155h = (ProgressBar) aorVar.f41155a.findViewById(C0100R.id.storage_progressbar);
        m4425k();
    }

    /* JADX INFO: renamed from: k */
    public final void m4425k() {
        ProgressBar progressBar;
        if (this.f7153f == null || this.f7154g == null || (progressBar = this.f7155h) == null) {
            return;
        }
        long j = this.f7150b;
        progressBar.setProgress(Math.round(100.0f - (j == 0 ? 0.0f : (this.f7149a * 100.0f) / j)));
        Resources resources = this.f1582j.getResources();
        this.f7153f.setText(resources.getString(C0100R.string.storage_remaining, Formatter.formatFileSize(this.f1582j, this.f7149a)));
        NumberFormat numberFormat = NumberFormat.getInstance();
        String str = numberFormat.format(this.f7151c);
        String str2 = numberFormat.format(this.f7152d);
        String string = resources.getString(C0100R.string.storage_estimate, resources.getQuantityString(C0100R.plurals.photos_remaining, this.f7151c, str), resources.getQuantityString(C0100R.plurals.videos_remaining, this.f7152d, str2));
        SpannableString spannableString = new SpannableString(string);
        int iIndexOf = string.indexOf(str);
        if (iIndexOf != -1) {
            spannableString.setSpan(new TypefaceSpan(f7148e), iIndexOf, str.length() + iIndexOf, 33);
        }
        int iLastIndexOf = string.lastIndexOf(str2);
        if (iLastIndexOf != -1) {
            spannableString.setSpan(new TypefaceSpan(f7148e), iLastIndexOf, str2.length() + iLastIndexOf, 33);
        }
        this.f7154g.setText(spannableString);
    }

    public MaterialStorageStatusPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7149a = -1L;
        this.f7150b = -1L;
    }

    public MaterialStorageStatusPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7149a = -1L;
        this.f7150b = -1L;
    }
}
