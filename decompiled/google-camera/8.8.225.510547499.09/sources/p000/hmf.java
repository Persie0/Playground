package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hmf extends AbstractC0806ls {

    /* JADX INFO: renamed from: d */
    private final String[] f28307d;

    /* JADX INFO: renamed from: e */
    private final String[] f28308e;

    public hmf(Resources resources) {
        this.f28307d = resources.getStringArray(C0100R.array.storage_saver_settings_changed);
        this.f28308e = resources.getStringArray(C0100R.array.storage_saver_settings_changed_detail);
    }

    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: a */
    public final int mo1762a() {
        return this.f28307d.length;
    }

    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C0829mo mo1765d(ViewGroup viewGroup, int i) {
        return new hme(new TextView(viewGroup.getContext()));
    }

    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ void mo1766e(C0829mo c0829mo, int i) {
        hme hmeVar = (hme) c0829mo;
        Context context = hmeVar.f28306s.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f28307d[i], new TextAppearanceSpan(context, C0100R.style.ChangedSettingsText), 33);
        spannableStringBuilder.append('\n');
        spannableStringBuilder.append(this.f28308e[i], new TextAppearanceSpan(context, C0100R.style.ChangedSettingsDetailText), 33);
        hmeVar.f28306s.setText(spannableStringBuilder);
        hmeVar.f28306s.setContentDescription(String.valueOf(context.getString(C0100R.string.settings_changed_item_description, this.f28307d[i])).concat(String.valueOf(this.f28308e[i])));
    }
}
