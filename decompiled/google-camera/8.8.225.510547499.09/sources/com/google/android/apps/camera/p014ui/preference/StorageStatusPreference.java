package com.google.android.apps.camera.p014ui.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.preference.Preference;
import android.text.SpannableString;
import android.text.format.Formatter;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.text.NumberFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StorageStatusPreference extends Preference {

    /* JADX INFO: renamed from: e */
    private static final Typeface f7156e = Typeface.create("sans-serif-medium", 0);

    /* JADX INFO: renamed from: a */
    public long f7157a;

    /* JADX INFO: renamed from: b */
    public long f7158b;

    /* JADX INFO: renamed from: c */
    public int f7159c;

    /* JADX INFO: renamed from: d */
    public int f7160d;

    /* JADX INFO: renamed from: f */
    private TextView f7161f;

    /* JADX INFO: renamed from: g */
    private TextView f7162g;

    /* JADX INFO: renamed from: h */
    private ProgressBar f7163h;

    public StorageStatusPreference(Context context) {
        super(context);
        this.f7157a = -1L;
        this.f7158b = -1L;
    }

    /* JADX INFO: renamed from: a */
    public final void m4426a() {
        ProgressBar progressBar;
        if (this.f7161f == null || this.f7162g == null || (progressBar = this.f7163h) == null) {
            return;
        }
        long j = this.f7158b;
        progressBar.setProgress(Math.round(100.0f - (j == 0 ? 0.0f : (this.f7157a * 100.0f) / j)));
        Resources resources = getContext().getResources();
        this.f7161f.setText(resources.getString(C0100R.string.storage_remaining, Formatter.formatFileSize(getContext(), this.f7157a)));
        NumberFormat numberFormat = NumberFormat.getInstance();
        String str = numberFormat.format(this.f7159c);
        String str2 = numberFormat.format(this.f7160d);
        String string = resources.getString(C0100R.string.storage_estimate, resources.getQuantityString(C0100R.plurals.photos_remaining, this.f7159c, str), resources.getQuantityString(C0100R.plurals.videos_remaining, this.f7160d, str2));
        SpannableString spannableString = new SpannableString(string);
        int iIndexOf = string.indexOf(str);
        if (iIndexOf != -1) {
            spannableString.setSpan(new TypefaceSpan(f7156e), iIndexOf, str.length() + iIndexOf, 33);
        }
        int iLastIndexOf = string.lastIndexOf(str2);
        if (iLastIndexOf != -1) {
            spannableString.setSpan(new TypefaceSpan(f7156e), iLastIndexOf, str2.length() + iLastIndexOf, 33);
        }
        this.f7162g.setText(spannableString);
    }

    @Override // android.preference.Preference
    protected final void onBindView(View view) {
        super.onBindView(view);
        this.f7161f = (TextView) view.findViewById(C0100R.id.storage_used);
        this.f7162g = (TextView) view.findViewById(C0100R.id.storage_remaining);
        this.f7163h = (ProgressBar) view.findViewById(C0100R.id.storage_progressbar);
        m4426a();
    }

    public StorageStatusPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7157a = -1L;
        this.f7158b = -1L;
    }

    public StorageStatusPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7157a = -1L;
        this.f7158b = -1L;
    }
}
