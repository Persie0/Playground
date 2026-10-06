package p000;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hfw extends ResolveInfo {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hfx f27634a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f27635b;

    public hfw(hfx hfxVar, int i) {
        this.f27634a = hfxVar;
        this.f27635b = i;
    }

    @Override // android.content.pm.ResolveInfo
    public final Drawable loadIcon(PackageManager packageManager) {
        hfx hfxVar = this.f27634a;
        int i = this.f27635b;
        chr chrVar = chr.CAMERA_PREVIEW;
        switch (i - 1) {
            case 1:
                Drawable drawable = hfxVar.f27639b.getDrawable(C0100R.drawable.social_app_black_add_icon);
                drawable.getClass();
                return drawable;
            default:
                Drawable drawable2 = hfxVar.f27639b.getDrawable(C0100R.drawable.social_app_settings_icon);
                drawable2.getClass();
                return drawable2;
        }
    }

    @Override // android.content.pm.ResolveInfo
    public final CharSequence loadLabel(PackageManager packageManager) {
        return this.f27635b == 2 ? this.f27634a.f27639b.getString(C0100R.string.label_add_social_apps) : this.f27634a.f27639b.getString(C0100R.string.label_social_share_setting);
    }
}
